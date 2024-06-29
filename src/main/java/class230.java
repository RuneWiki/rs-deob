import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class230 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4130;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "J")
    private long field4129;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "J")
    private long field4132;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Ljava/io/File;")
    private File field4131;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BIII)I")
    public final int method1598(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != 1) {
            this.field4132 = 29L;
        }
        int var5 = this.field4130.read(arg0, arg2, arg3);
        if (var5 > 0) {
            this.field4132 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JB)V")
    public final void method1599(long arg0, byte arg1) throws IOException {
        int var4 = 95 % ((86 - arg1) / 37);
        this.field4130.seek(arg0);
        this.field4132 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BII)V")
    public final void method1600(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (((long) arg0 + this.field4132) > this.field4129) {
            this.field4130.seek(this.field4129 + 1L);
            this.field4130.write(1);
            throw new EOFException();
        }
        this.field4130.write(arg1, arg3, arg0);
        if (arg2 <= 49) {
            this.field4130 = null;
        }
        this.field4132 += (long) arg0;
    }

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4130 != null) {
            System.out.println("Warning! fileondisk " + this.field4131 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1603(0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method1601(int arg0) {
        int var2 = -106 % ((arg0 + 77) / 32);
        return this.field4131;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)J")
    public final long method1602(int arg0) throws IOException {
        if (arg0 < 74) {
            this.method1601(-58);
        }
        return this.field4130.length();
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public final void method1603(int arg0) throws IOException {
        if (this.field4130 != null) {
            this.field4130.close();
            this.field4130 = null;
        }
        if (arg0 != 0) {
            this.method1601(-71);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class230(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field4130 = new RandomAccessFile(arg0, arg1);
        this.field4129 = arg2;
        this.field4132 = 0L;
        this.field4131 = arg0;
        int var5 = this.field4130.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4130.seek(0L);
            this.field4130.write(var5);
        }
        this.field4130.seek(0L);
    }
}
