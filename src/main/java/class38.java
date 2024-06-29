import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 {

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field719;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "J")
    private long field721;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "Ljava/io/File;")
    private File field712;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "J")
    private long field717;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field713 = -1;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(JI)V", line = 5)
    public final void method438(long arg0, int arg1) throws IOException {
        field718++;
        this.field719.seek(arg0);
        int var4 = 31 / ((arg1 - 4) / 61);
        this.field717 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "()V", line = 19)
    public static final void method439() {
        for (int var0 = 0; var0 < class300.field4041; var0++) {
            class43 var1 = class172.field2097[var0];
            class702.method3937(var1, true);
            class172.field2097[var0] = null;
        }
        class300.field4041 = 0;
    }

    @OriginalMember(owner = "client!vba", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        field714++;
        if (this.field719 != null) {
            System.out.println("Warning! fileondisk " + this.field712 + " not closed correctly using close(). Auto-closing instead. ");
            this.method442((byte) -72);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III[B)I", line = 51)
    public final int method440(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 > -11) {
            this.method444(80);
        }
        field716++;
        int var5 = this.field719.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field717 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I[BII)V", line = 69)
    public final void method441(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field711++;
        if (((long) arg2 + this.field717) > this.field721) {
            this.field719.seek(this.field721);
            this.field719.write(1);
            throw new EOFException();
        }
        this.field719.write(arg1, arg0, arg2);
        this.field717 += arg2;
        if (arg3 != 3763) {
            this.field717 = -77L;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 93)
    public final void method442(byte arg0) throws IOException {
        field715++;
        if (this.field719 != null) {
            this.field719.close();
            this.field719 = null;
        }
        if (arg0 != -72) {
            this.method444(-45);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 112)
    public class38(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field719 = new RandomAccessFile(arg0, arg1);
        this.field721 = arg2;
        this.field712 = arg0;
        this.field717 = 0L;
        int var5 = this.field719.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field719.seek(0L);
            this.field719.write(var5);
        }
        this.field719.seek(0L);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I", line = 144)
    public static final int method443(int arg0) {
        field720++;
        return arg0 == 8749 ? class273.method1639(false, 14012) : 23;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Ljava/io/File;", line = 155)
    public final File method444(int arg0) {
        int var2 = -54 / ((arg0 + 32) / 45);
        field710++;
        return this.field712;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)J", line = 166)
    public final long method445(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field719 = null;
        }
        field722++;
        return this.field719.length();
    }
}
