import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class103 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "J")
    private long field1978;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "J")
    private long field1979;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Ljava/io/File;")
    private File field1980;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1981;

    @OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1981 != null) {
            System.out.println("Warning! fileondisk " + this.field1980 + " not closed correctly using close(). Auto-closing instead. ");
            this.method740(1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method737(int arg0) {
        return arg0 == 0 ? this.field1980 : null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)J")
    public final long method738(int arg0) throws IOException {
        if (arg0 != -4551) {
            this.method737(20);
        }
        return this.field1981.length();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIII)V")
    public final void method739(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != 1) {
            this.field1978 = 65L;
        }
        if ((long) arg2 + this.field1979 > this.field1978) {
            this.field1981.seek(this.field1978 + 1L);
            this.field1981.write(1);
            throw new EOFException();
        } else {
            this.field1981.write(arg0, arg3, arg2);
            this.field1979 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final void method740(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method737(36);
        }
        if (this.field1981 != null) {
            this.field1981.close();
            this.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BJ)V")
    public final void method741(byte arg0, long arg1) throws IOException {
        if (arg0 <= -114) {
            this.field1981.seek(arg1);
            this.field1979 = arg1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[B)I")
    public final int method742(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field1981.read(arg3, arg0, arg2);
        if (arg1 != 0) {
            this.field1979 = -17L;
        }
        if (var5 > 0) {
            this.field1979 += (long) var5;
        }
        return var5;
    }
}
