import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class99 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
    private long field1744;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "J")
    private long field1745;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/io/File;")
    private File field1742;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1743;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final void method656(boolean arg0) throws IOException {
        if (this.field1743 != null) {
            this.field1743.close();
            this.field1743 = null;
        }
        if (arg0) {
            this.method661((byte) 44);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
    public final long method657(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method661((byte) 84);
        }
        return this.field1743.length();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI[BI)V")
    public final void method658(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != -76) {
            return;
        }
        if (((long) arg3 + this.field1744) > this.field1745) {
            this.field1743.seek(this.field1745 + 1L);
            this.field1743.write(1);
            throw new EOFException();
        } else {
            this.field1743.write(arg2, arg1, arg3);
            this.field1744 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JB)V")
    public final void method659(long arg0, byte arg1) throws IOException {
        this.field1743.seek(arg0);
        this.field1744 = arg0;
        if (arg1 != -107) {
            this.field1744 = -100L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII[B)I")
    public final int method660(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (!arg0) {
            this.method661((byte) 71);
        }
        int var5 = this.field1743.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field1744 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1743 != null) {
            System.out.println("Warning! fileondisk " + this.field1742 + " not closed correctly using close(). Auto-closing instead. ");
            this.method656(false);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method661(byte arg0) {
        if (arg0 > -30) {
            this.field1745 = 98L;
        }
        return this.field1742;
    }
}
