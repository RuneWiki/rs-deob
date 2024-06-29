import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class291 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4941;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljava/io/File;")
    private File field4940;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "J")
    private long field4942;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "J")
    private long field4939;

    @OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field4941 != null) {
            System.out.println("Warning! fileondisk " + this.field4940 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1966(1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII[B)I", line = 17)
    public final int method1962(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 >= -51) {
            this.field4939 = 92L;
        }
        int var5 = this.field4941.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field4939 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI)V", line = 33)
    public final void method1963(long arg0, int arg1) throws IOException {
        this.field4941.seek(arg0);
        this.field4939 = arg0;
        if (arg1 != 1) {
            this.field4941 = (RandomAccessFile) null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Ljava/io/File;", line = 45)
    public final File method1964(int arg0) {
        if (arg0 != 0) {
            this.method1964(-23);
        }
        return this.field4940;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[B)V", line = 55)
    public final void method1965(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field4942 < (long) arg2 + this.field4939) {
            this.field4941.seek(this.field4942 + 1L);
            this.field4941.write(1);
            throw new EOFException();
        }
        this.field4941.write(arg3, arg1, arg2);
        if (arg0 != -1) {
            this.method1964(18);
        }
        this.field4939 += (long) arg2;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 74)
    public final void method1966(int arg0) throws IOException {
        if (arg0 == 1 && this.field4941 != null) {
            this.field4941.close();
            this.field4941 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)J", line = 93)
    public final long method1967(int arg0) throws IOException {
        int var2 = -94 / ((arg0 - 2) / 63);
        return this.field4941.length();
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 99)
    public class291(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field4941 = new RandomAccessFile(arg0, arg1);
        this.field4940 = arg0;
        this.field4942 = arg2;
        this.field4939 = 0L;
        int var5 = this.field4941.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4941.seek(0L);
            this.field4941.write(var5);
        }
        this.field4941.seek(0L);
    }
}
