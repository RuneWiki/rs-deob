import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class56 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "J")
    private long field897;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
    private long field899;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/io/File;")
    private File field900;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field898;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)J", line = 3)
    public final long method522(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method524((byte) 49);
        }
        return this.field898.length();
    }

    @OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        if (this.field898 != null) {
            System.out.println("Warning! fileondisk " + this.field900 + " not closed correctly using close(). Auto-closing instead. ");
            this.method526(-19635);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BIBI)I", line = 32)
    public final int method523(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field898.read(arg0, arg3, arg1);
        if (var5 > 0) {
            this.field897 += (long) var5;
        }
        int var6 = -26 / ((arg2 + 15) / 39);
        return var5;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Ljava/io/File;", line = 47)
    public final File method524(byte arg0) {
        if (arg0 <= 80) {
            this.method524((byte) -13);
        }
        return this.field900;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(JI)V", line = 57)
    public final void method525(long arg0, int arg1) throws IOException {
        int var4 = -19 / ((61 - arg1) / 38);
        this.field898.seek(arg0);
        this.field897 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 67)
    public final void method526(int arg0) throws IOException {
        if (this.field898 != null) {
            this.field898.close();
            this.field898 = null;
        }
        if (arg0 != -19635) {
            this.method524((byte) 96);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BBII)V", line = 83)
    public final void method527(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 >= -43) {
            return;
        }
        if (this.field899 < ((long) arg3 + this.field897)) {
            this.field898.seek(this.field899);
            this.field898.write(1);
            throw new EOFException();
        } else {
            this.field898.write(arg0, arg2, arg3);
            this.field897 += (long) arg3;
        }
    }
}
