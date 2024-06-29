import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class170 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3054;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Ljava/io/File;")
    private File field3053;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "J")
    private long field3055;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "J")
    private long field3056;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BIB)V")
    public final void method1077(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if ((long) arg0 + this.field3056 > this.field3055) {
            this.field3054.seek(this.field3055 + 1L);
            this.field3054.write(1);
            throw new EOFException();
        } else {
            this.field3054.write(arg1, arg2, arg0);
            if (arg3 < -56) {
                this.field3056 += arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[B)I")
    public final int method1078(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != 22705) {
            this.method1080(false);
        }
        int var5 = this.field3054.read(arg3, arg1, arg0);
        if (var5 > 0) {
            this.field3056 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method1079(byte arg0) throws IOException {
        if (this.field3054 != null) {
            this.field3054.close();
            this.field3054 = null;
        }
        if (arg0 != -54) {
            this.method1080(true);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1080(boolean arg0) {
        if (!arg0) {
            this.field3053 = null;
        }
        return this.field3053;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI)V")
    public final void method1081(long arg0, int arg1) throws IOException {
        if (arg1 < 71) {
            this.field3053 = null;
        }
        this.field3054.seek(arg0);
        this.field3056 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3054 != null) {
            System.out.println("Warning! fileondisk " + this.field3053 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1079((byte) -54);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)J")
    public final long method1082(int arg0) throws IOException {
        int var2 = 75 % ((arg0 + 44) / 63);
        return this.field3054.length();
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class170(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3054 = new RandomAccessFile(arg0, arg1);
        this.field3053 = arg0;
        this.field3055 = arg2;
        this.field3056 = 0L;
        int var5 = this.field3054.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3054.seek(0L);
            this.field3054.write(var5);
        }
        this.field3054.seek(0L);
    }
}
