import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class274 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4597;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Ljava/io/File;")
    private File field4598;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "J")
    private long field4596;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "J")
    private long field4599;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BII)V", line = 4)
    public final void method1840(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -8165) {
            this.field4596 = -53L;
        }
        if (((long) arg3 + this.field4599) <= this.field4596) {
            this.field4597.write(arg1, arg0, arg3);
            this.field4599 += (long) arg3;
        } else {
            this.field4597.seek(this.field4596 + 1L);
            this.field4597.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)J", line = 23)
    public final long method1841(boolean arg0) throws IOException {
        if (!arg0) {
            this.method1842((byte) 37);
        }
        return this.field4597.length();
    }

    @OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        if (this.field4597 != null) {
            System.out.println("Warning! fileondisk " + this.field4598 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1843(-123);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Ljava/io/File;", line = 48)
    public final File method1842(byte arg0) {
        int var2 = -108 / ((63 - arg0) / 42);
        return this.field4598;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 57)
    public final void method1843(int arg0) throws IOException {
        if (arg0 > -104) {
            this.field4598 = (File) null;
        }
        if (this.field4597 != null) {
            this.field4597.close();
            this.field4597 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZI[B)I", line = 76)
    public final int method1844(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field4597.read(arg3, arg0, arg2);
        if (arg1) {
            if (var5 > 0) {
                this.field4599 += (long) var5;
            }
            return var5;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)V", line = 90)
    public final void method1845(long arg0, int arg1) throws IOException {
        this.field4597.seek(arg0);
        if (arg1 != 1529) {
            this.field4596 = -118L;
        }
        this.field4599 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class274(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field4597 = new RandomAccessFile(arg0, arg1);
        this.field4598 = arg0;
        this.field4596 = arg2;
        this.field4599 = 0L;
        int var5 = this.field4597.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4597.seek(0L);
            this.field4597.write(var5);
        }
        this.field4597.seek(0L);
    }
}
