import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class41 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "J")
    private long field585;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "J")
    private long field588;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/io/File;")
    private File field587;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field586;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)J", line = 4)
    public final long method297(int arg0) throws IOException {
        if (arg0 != 9243) {
            this.method300(90);
        }
        return this.field586.length();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III[B)I", line = 18)
    public final int method298(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -21722) {
            this.field585 = 49L;
        }
        int var5 = this.field586.read(arg3, arg1, arg2);
        if (var5 > 0) {
            this.field585 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[BI)V", line = 32)
    public final void method299(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field588 < ((long) arg3 + this.field585)) {
            this.field586.seek(this.field588);
            this.field586.write(1);
            throw new EOFException();
        }
        if (arg1 != -22486) {
            this.field587 = (File) null;
        }
        this.field586.write(arg2, arg0, arg3);
        this.field585 += (long) arg3;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Ljava/io/File;", line = 51)
    public final File method300(int arg0) {
        return arg0 <= 26 ? (File) null : this.field587;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(JB)V", line = 61)
    public final void method301(long arg0, byte arg1) throws IOException {
        if (arg1 < -79) {
            this.field586.seek(arg0);
            this.field585 = arg0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 73)
    public final void method302(byte arg0) throws IOException {
        int var2 = -18 % ((46 - arg0) / 36);
        if (this.field586 != null) {
            this.field586.close();
            this.field586 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V", line = 88)
    protected final void finalize() throws Throwable {
        if (this.field586 != null) {
            System.out.println("Warning! fileondisk " + this.field587 + " not closed correctly using close(). Auto-closing instead. ");
            this.method302((byte) 97);
        }
    }
}
