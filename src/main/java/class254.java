import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class254 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4358;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "J")
    private long field4357;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "J")
    private long field4360;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Ljava/io/File;")
    private File field4359;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[BII)V")
    public final void method1655(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 1) {
            return;
        }
        if (this.field4360 < ((long) arg0 + this.field4357)) {
            this.field4358.seek(this.field4360 + 1L);
            this.field4358.write(1);
            throw new EOFException();
        } else {
            this.field4358.write(arg1, arg3, arg0);
            this.field4357 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[B)I")
    public final int method1656(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field4358.read(arg3, arg0, arg1);
        if (~var5 < arg2) {
            this.field4357 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4358 != null) {
            System.out.println("Warning! fileondisk " + this.field4359 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1658(13198);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)J")
    public final long method1657(byte arg0) throws IOException {
        if (arg0 < 3) {
            this.field4358 = null;
        }
        return this.field4358.length();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final void method1658(int arg0) throws IOException {
        if (this.field4358 != null) {
            this.field4358.close();
            this.field4358 = null;
        }
        if (arg0 != 13198) {
            this.field4359 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1659(int arg0) {
        if (arg0 != 0) {
            this.field4360 = -81L;
        }
        return this.field4359;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(JI)V")
    public final void method1660(long arg0, int arg1) throws IOException {
        this.field4358.seek(arg0);
        this.field4357 = arg0;
        if (arg1 > -77) {
            this.field4359 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class254(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field4358 = new RandomAccessFile(arg0, arg1);
        this.field4357 = 0L;
        this.field4360 = arg2;
        this.field4359 = arg0;
        int var5 = this.field4358.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4358.seek(0L);
            this.field4358.write(var5);
        }
        this.field4358.seek(0L);
    }
}
