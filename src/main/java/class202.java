import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class202 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3418;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Ljava/io/File;")
    private File field3420;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "J")
    private long field3417;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "J")
    private long field3419;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JB)V", line = 6)
    public final void method1413(long arg0, byte arg1) throws IOException {
        this.field3418.seek(arg0);
        this.field3417 = arg0;
        if (arg1 > -110) {
            this.field3417 = -128L;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 19)
    public final void method1414(int arg0) throws IOException {
        if (this.field3418 != null) {
            this.field3418.close();
            this.field3418 = null;
        }
        if (arg0 != 0) {
            this.method1415(25);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Ljava/io/File;", line = 34)
    public final File method1415(int arg0) {
        return arg0 == 32310 ? this.field3420 : (File) null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)J", line = 44)
    public final long method1416(byte arg0) throws IOException {
        return arg0 == 25 ? this.field3418.length() : -42L;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BII)V", line = 56)
    public final void method1417(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field3417 <= this.field3419) {
            this.field3418.write(arg1, arg2, arg3);
            if (arg0 == 1) {
                this.field3417 += (long) arg3;
            }
        } else {
            this.field3418.seek(this.field3419 + 1L);
            this.field3418.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "finalize", descriptor = "()V", line = 75)
    protected final void finalize() throws Throwable {
        if (this.field3418 != null) {
            System.out.println("Warning! fileondisk " + this.field3420 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1414(0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 86)
    public class202(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3418 = new RandomAccessFile(arg0, arg1);
        this.field3420 = arg0;
        this.field3417 = 0L;
        this.field3419 = arg2;
        int var5 = this.field3418.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3418.seek(0L);
            this.field3418.write(var5);
        }
        this.field3418.seek(0L);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB[B)I", line = 119)
    public final int method1418(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 >= -40) {
            this.field3420 = (File) null;
        }
        int var5 = this.field3418.read(arg3, arg0, arg1);
        if (var5 > 0) {
            this.field3417 += (long) var5;
        }
        return var5;
    }
}
