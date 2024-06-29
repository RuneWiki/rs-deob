import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class55 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "J")
    private long field557;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
    private long field559;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/io/File;")
    private File field558;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field560;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II[BI)V")
    public final void method282(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field559 < ((long) arg1 + this.field557)) {
            this.field560.seek(this.field559);
            this.field560.write(1);
            throw new EOFException();
        } else {
            this.field560.write(arg2, arg0, arg1);
            int var5 = 98 / ((arg3 - 27) / 42);
            this.field557 += (long) arg1;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)J")
    public final long method283(int arg0) throws IOException {
        return arg0 == -1 ? this.field560.length() : -33L;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BIIB)I")
    public final int method284(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        int var5 = 92 % ((arg3 - 32) / 37);
        int var6 = this.field560.read(arg0, arg1, arg2);
        if (var6 > 0) {
            this.field557 += (long) var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public final void method285(int arg0) throws IOException {
        if (arg0 == 0 && this.field560 != null) {
            this.field560.close();
            this.field560 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(JB)V")
    public final void method286(long arg0, byte arg1) throws IOException {
        this.field560.seek(arg0);
        if (arg1 <= 42) {
            this.field558 = null;
        }
        this.field557 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method287(int arg0) {
        if (arg0 != 0) {
            this.field557 = 31L;
        }
        return this.field558;
    }

    @OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field560 != null) {
            System.out.println("Warning! fileondisk " + this.field558 + " not closed correctly using close(). Auto-closing instead. ");
            this.method285(0);
        }
    }
}
