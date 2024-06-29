import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class116 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "J")
    private long field1916;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "J")
    private long field1918;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "Ljava/io/File;")
    private File field1915;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1917;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)J")
    public final long method817(int arg0) throws IOException {
        if (arg0 != -2826) {
            this.method820(67);
        }
        return this.field1917.length();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB[BI)V")
    public final void method818(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 >= -107) {
            this.method820(-115);
        }
        if ((long) arg0 + this.field1916 > this.field1918) {
            this.field1917.seek(this.field1918);
            this.field1917.write(1);
            throw new EOFException();
        } else {
            this.field1917.write(arg2, arg3, arg0);
            this.field1916 += arg0;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([BIII)I")
    public final int method819(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = 12 % ((arg1 - 45) / 43);
        int var6 = this.field1917.read(arg0, arg3, arg2);
        if (var6 > 0) {
            this.field1916 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1917 != null) {
            System.out.println("Warning! fileondisk " + this.field1915 + " not closed correctly using close(). Auto-closing instead. ");
            this.method821(17981);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method820(int arg0) {
        if (arg0 != -1) {
            this.method820(32);
        }
        return this.field1915;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
    public final void method821(int arg0) throws IOException {
        if (this.field1917 != null) {
            this.field1917.close();
            this.field1917 = null;
        }
        if (arg0 != 17981) {
            this.method820(2);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(JI)V")
    public final void method822(long arg0, int arg1) throws IOException {
        if (arg1 != -27095) {
            this.method820(-123);
        }
        this.field1917.seek(arg0);
        this.field1916 = arg0;
    }
}
