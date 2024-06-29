import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field414;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "J")
    private long field415;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljava/io/File;")
    private File field412;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
    private long field413;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)I")
    public final int method148(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 > -64) {
            return -9;
        }
        int var5 = this.field414.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field415 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method149(int arg0) {
        if (arg0 != -1) {
            this.method149(72);
        }
        return this.field412;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
    public final void method150(int arg0, long arg1) throws IOException {
        this.field414.seek(arg1);
        this.field415 = arg1;
        if (arg0 != 11506) {
            this.field412 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public final void method151(int arg0) throws IOException {
        this.field414.close();
        if (arg0 != -9962) {
            this.field414 = null;
        }
        this.field414 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class20(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field414 = new RandomAccessFile(arg0, arg1);
        this.field415 = 0L;
        this.field412 = arg0;
        this.field413 = arg2;
        int var5 = this.field414.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field414.seek(0L);
            this.field414.write(var5);
        }
        this.field414.seek(0L);
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field414 != null) {
            System.out.println("Warning! fileondisk " + this.field412 + " not closed correctly using close(). Auto-closing instead. ");
            this.method151(-9962);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)J")
    public final long method152(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field413 = 70L;
        }
        return this.field414.length();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII[B)V")
    public final void method153(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field415 > this.field413) {
            this.field414.seek(this.field413 + 1L);
            this.field414.write(1);
            throw new EOFException();
        } else {
            this.field414.write(arg3, arg2, arg1);
            if (arg0) {
                this.field415 += arg1;
            }
        }
    }
}
