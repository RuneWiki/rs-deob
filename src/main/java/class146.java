import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3357;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Ljava/io/File;")
    private File field3355;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "J")
    private long field3356;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "J")
    private long field3354;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public final void method1126(byte arg0) throws IOException {
        if (arg0 <= -106 && this.field3357 != null) {
            this.field3357.close();
            this.field3357 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BZII)V")
    public final void method1127(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        if (this.field3356 < (long) arg2 + this.field3354) {
            this.field3357.seek(this.field3356 + 1L);
            this.field3357.write(1);
            throw new EOFException();
        } else {
            this.field3357.write(arg0, arg3, arg2);
            if (arg1) {
                this.field3354 += arg2;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)J")
    public final long method1128(int arg0) throws IOException {
        return arg0 == 1 ? this.field3357.length() : -20L;
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3357 != null) {
            System.out.println("Warning! fileondisk " + this.field3355 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1126((byte) -115);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII[B)I")
    public final int method1129(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field3357.read(arg3, arg2, arg1);
        if (arg0 <= 24) {
            this.field3357 = null;
        }
        if (var5 > 0) {
            this.field3354 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JB)V")
    public final void method1130(long arg0, byte arg1) throws IOException {
        this.field3357.seek(arg0);
        int var4 = 37 / ((-arg1 - 15) / 36);
        this.field3354 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class146(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field3357 = new RandomAccessFile(arg0, arg1);
        this.field3355 = arg0;
        this.field3356 = arg2;
        this.field3354 = 0L;
        int var5 = this.field3357.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3357.seek(0L);
            this.field3357.write(var5);
        }
        this.field3357.seek(0L);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1131(int arg0) {
        if (arg0 != 0) {
            this.method1131(-80);
        }
        return this.field3355;
    }
}
