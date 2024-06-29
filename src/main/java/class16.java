import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field252;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/io/File;")
    private File field255;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
    private long field253;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "J")
    private long field254;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BII)V")
    public final void method95(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field253 < (long) arg3 + this.field254) {
            this.field252.seek(this.field253 + 1L);
            this.field252.write(1);
            throw new EOFException();
        }
        if (arg0 != -1) {
            this.method97(103);
        }
        this.field252.write(arg1, arg2, arg3);
        this.field254 += arg3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public final void method96(byte arg0) throws IOException {
        if (this.field252 != null) {
            this.field252.close();
            this.field252 = null;
        }
        if (arg0 != 21) {
            this.method97(103);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method97(int arg0) {
        if (arg0 != -1) {
            this.field252 = null;
        }
        return this.field255;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(JI)V")
    public final void method98(long arg0, int arg1) throws IOException {
        if (arg1 == -15705) {
            this.field252.seek(arg0);
            this.field254 = arg0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)J")
    public final long method99(int arg0) throws IOException {
        return arg0 == 29823 ? this.field252.length() : -8L;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[B)I")
    public final int method100(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field252.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field254 += var5;
        }
        return arg0 > -25 ? -59 : var5;
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field252 != null) {
            System.out.println("Warning! fileondisk " + this.field255 + " not closed correctly using close(). Auto-closing instead. ");
            this.method96((byte) 21);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class16(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field252 = new RandomAccessFile(arg0, arg1);
        this.field255 = arg0;
        this.field253 = arg2;
        this.field254 = 0L;
        int var5 = this.field252.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field252.seek(0L);
            this.field252.write(var5);
        }
        this.field252.seek(0L);
    }
}
