import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class327 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4814;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Ljava/io/File;")
    private File field4820;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "J")
    private long field4826;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "J")
    private long field4825;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lmq;")
    public static class592 field4819 = new class592();

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "[[[B")
    public static byte[][][] field4817;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[BI)V")
    public final void method2108(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4821++;
        if ((long) arg3 + this.field4826 > this.field4825) {
            this.field4814.seek(this.field4825);
            this.field4814.write(1);
            throw new EOFException();
        }
        if (arg1 <= 73) {
            this.field4814 = null;
        }
        this.field4814.write(arg2, arg0, arg3);
        this.field4826 += arg3;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBI[B)I")
    public final int method2109(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 92) {
            field4817 = null;
        }
        field4822++;
        int var5 = this.field4814.read(arg3, arg2, arg0);
        if (var5 > 0) {
            this.field4826 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4814 != null) {
            System.out.println("Warning! fileondisk " + this.field4820 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2110((byte) 52);
        }
        field4824++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public final void method2110(byte arg0) throws IOException {
        if (this.field4814 != null) {
            this.field4814.close();
            this.field4814 = null;
        }
        if (arg0 == 52) {
            field4816++;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IJ)V")
    public final void method2111(int arg0, long arg1) throws IOException {
        this.field4814.seek(arg1);
        if (arg0 != 1) {
            this.method2112((byte) -104);
        }
        field4823++;
        this.field4826 = arg1;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method2112(byte arg0) {
        field4827++;
        return arg0 == 91 ? this.field4820 : null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)J")
    public final long method2113(int arg0) throws IOException {
        if (arg0 == -1) {
            field4818++;
            return this.field4814.length();
        } else {
            return 59L;
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public static final void method2114(int arg0) {
        int var1 = -87 % ((arg0 + 42) / 42);
        class374.field5649 = new class625[50];
        class115.field1790 = 0;
        field4815++;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
    public static void method2115(int arg0) {
        field4817 = null;
        field4819 = null;
        if (arg0 != 0) {
            field4819 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class327(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field4814 = new RandomAccessFile(arg0, arg1);
        this.field4820 = arg0;
        this.field4826 = 0L;
        this.field4825 = arg2;
        int var5 = this.field4814.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4814.seek(0L);
            this.field4814.write(var5);
        }
        this.field4814.seek(0L);
    }
}
