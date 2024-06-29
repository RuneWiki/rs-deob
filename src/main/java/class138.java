import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class138 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "J")
    private long field2114;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "J")
    private long field2116;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ljava/io/File;")
    private File field2115;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2117;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB[BI)I", line = 6)
    public final int method871(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = -122 / ((arg1 + 48) / 63);
        int var6 = this.field2117.read(arg2, arg3, arg0);
        if (var6 > 0) {
            this.field2116 += (long) var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BII)V", line = 18)
    public final void method872(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field2114 < (long) arg2 + this.field2116) {
            this.field2117.seek(this.field2114 + 1L);
            this.field2117.write(1);
            throw new EOFException();
        } else if (arg0 == 1) {
            this.field2117.write(arg1, arg3, arg2);
            this.field2116 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JI)V", line = 37)
    public final void method873(long arg0, int arg1) throws IOException {
        this.field2117.seek(arg0);
        if (arg1 < 60) {
            this.method875(-35);
        }
        this.field2116 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 48)
    public final void method874(int arg0) throws IOException {
        if (arg0 >= -113) {
            this.field2116 = -74L;
        }
        if (this.field2117 != null) {
            this.field2117.close();
            this.field2117 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)Ljava/io/File;", line = 63)
    public final File method875(int arg0) {
        return arg0 < 109 ? (File) null : this.field2115;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)J", line = 73)
    public final long method876(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method875(-42);
        }
        return this.field2117.length();
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 88)
    protected final void finalize() throws Throwable {
        if (this.field2117 != null) {
            System.out.println("Warning! fileondisk " + this.field2115 + " not closed correctly using close(). Auto-closing instead. ");
            this.method874(-118);
        }
    }
}
