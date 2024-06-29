import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class51 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "J")
    private long field635;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "J")
    private long field637;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/io/File;")
    private File field638;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field636;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[BI)I")
    public final int method491(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field636.read(arg2, arg0, arg3);
        if (arg1 > ~var5) {
            this.field637 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)J")
    public final long method492(byte arg0) throws IOException {
        if (arg0 != -35) {
            this.method493(10);
        }
        return this.field636.length();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method493(int arg0) {
        int var2 = 105 % ((arg0 - 14) / 42);
        return this.field638;
    }

    @OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field636 != null) {
            System.out.println("Warning! fileondisk " + this.field638 + " not closed correctly using close(). Auto-closing instead. ");
            this.method496(-32307);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II[BI)V")
    public final void method494(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field635 < ((long) arg0 + this.field637)) {
            this.field636.seek(this.field635);
            this.field636.write(1);
            throw new EOFException();
        }
        this.field636.write(arg2, arg3, arg0);
        this.field637 += arg0;
        if (arg1 >= -125) {
            this.method493(34);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IJ)V")
    public final void method495(int arg0, long arg1) throws IOException {
        if (arg0 != 0) {
            this.field635 = 54L;
        }
        this.field636.seek(arg1);
        this.field637 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public final void method496(int arg0) throws IOException {
        if (arg0 == -32307 && this.field636 != null) {
            this.field636.close();
            this.field636 = null;
        }
    }
}
