import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1822;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "J")
    private long field1823;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/io/File;")
    private File field1821;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "J")
    private long field1824;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method620(int arg0) {
        if (arg0 >= -86) {
            this.method620(-47);
        }
        return this.field1821;
    }

    @OriginalMember(owner = "client!lb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1822 != null) {
            System.out.println("Warning! fileondisk " + this.field1821 + " not closed correctly using close(). Auto-closing instead. ");
            this.method625(0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BJ)V")
    public final void method621(byte arg0, long arg1) throws IOException {
        this.field1822.seek(arg1);
        this.field1823 = arg1;
        int var4 = 61 % ((60 - arg0) / 63);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BII)I")
    public final int method622(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -19789) {
            return -9;
        }
        int var5 = this.field1822.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field1823 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)J")
    public final long method623(int arg0) throws IOException {
        if (arg0 <= 79) {
            this.method620(-105);
        }
        return this.field1822.length();
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class78(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1822 = new RandomAccessFile(arg0, arg1);
        this.field1823 = 0L;
        this.field1821 = arg0;
        this.field1824 = arg2;
        int var5 = this.field1822.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1822.seek(0L);
            this.field1822.write(var5);
        }
        this.field1822.seek(0L);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIII)V")
    public final void method624(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if ((long) arg3 + this.field1823 > this.field1824) {
            this.field1822.seek(this.field1824 + 1L);
            this.field1822.write(1);
            throw new EOFException();
        } else {
            this.field1822.write(arg0, arg2, arg3);
            this.field1823 += arg3;
            int var5 = -80 / ((arg1 + 47) / 60);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public final void method625(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method620(-57);
        }
        if (this.field1822 != null) {
            this.field1822.close();
            this.field1822 = null;
        }
    }
}
