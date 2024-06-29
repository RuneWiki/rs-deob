import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field865;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/io/File;")
    private File field866;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
    private long field864;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
    private long field867;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method306(int arg0) throws IOException {
        if (arg0 >= -16) {
            this.field865 = null;
        }
        this.field865.close();
        this.field865 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[BI)I")
    public final int method307(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field865.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field864 += var5;
        }
        int var6 = -128 / ((-arg1 - 32) / 61);
        return var5;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method308(byte arg0) {
        int var2 = -95 / ((78 - arg0) / 45);
        return this.field866;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)J")
    public final long method309(byte arg0) throws IOException {
        if (arg0 != 122) {
            this.field867 = -82L;
        }
        return this.field865.length();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JB)V")
    public final void method310(long arg0, byte arg1) throws IOException {
        this.field865.seek(arg0);
        this.field864 = arg0;
        if (arg1 != 8) {
            this.field866 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III[B)V")
    public final void method311(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field864 > this.field867) {
            this.field865.seek(this.field867 + 1L);
            this.field865.write(1);
            throw new EOFException();
        }
        if (arg2 != 1) {
            this.field867 = 17L;
        }
        this.field865.write(arg3, arg1, arg0);
        this.field864 += arg0;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class34(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field865 = new RandomAccessFile(arg0, arg1);
        this.field866 = arg0;
        this.field864 = 0L;
        this.field867 = arg2;
        int var5 = this.field865.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field865.seek(0L);
            this.field865.write(var5);
        }
        this.field865.seek(0L);
    }

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field865 != null) {
            System.out.println("Warning! fileondisk " + this.field866 + " not closed correctly using close(). Auto-closing instead. ");
            this.method306(-51);
        }
    }
}
