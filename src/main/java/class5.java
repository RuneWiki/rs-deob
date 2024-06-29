import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class5 {

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field69;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "Ljava/io/File;")
    private File field61;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "J")
    private long field64;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "J")
    private long field59;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field58 = -1;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)J")
    public final long method36(boolean arg0) throws IOException {
        field68++;
        if (arg0) {
            this.field64 = 102L;
        }
        return this.field69.length();
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) throws IOException {
        if (this.field69 != null) {
            this.field69.close();
            this.field69 = null;
        }
        field71++;
        if (arg0 != -1) {
            method43((byte) -70);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III[B)V")
    public final void method38(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field62++;
        if (this.field64 < (long) arg1 + this.field59) {
            this.field69.seek(this.field64);
            this.field69.write(1);
            throw new EOFException();
        }
        this.field69.write(arg3, arg2, arg1);
        this.field59 += arg1;
        if (arg0 < 23) {
            method43((byte) 33);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(JB)V")
    public final void method39(long arg0, byte arg1) throws IOException {
        field66++;
        this.field69.seek(arg0);
        this.field59 = arg0;
        if (arg1 != 15) {
            method42(28, -115, 53);
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method40(int arg0) {
        field60++;
        int var2 = -87 / ((arg0 - 18) / 43);
        return this.field61;
    }

    @OriginalMember(owner = "client!mca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field69 != null) {
            System.out.println("Warning! fileondisk " + this.field61 + " not closed correctly using close(). Auto-closing instead. ");
            this.method37(-1);
        }
        field67++;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "([BIII)I")
    public final int method41(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field65++;
        if (arg3 != 31558) {
            return 63;
        }
        int var5 = this.field69.read(arg0, arg1, arg2);
        if (var5 > 0) {
            this.field59 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)Z")
    public static final boolean method42(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field58 = 109;
        }
        field70++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class5(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field69 = new RandomAccessFile(arg0, arg1);
        this.field61 = arg0;
        this.field64 = arg2;
        this.field59 = 0L;
        int var5 = this.field69.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field69.seek(0L);
            this.field69.write(var5);
        }
        this.field69.seek(0L);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)[Lko;")
    public static final class259[] method43(byte arg0) {
        if (arg0 < 20) {
            return null;
        } else {
            field63++;
            return new class259[] { class381.field5159, class314.field3907, class223.field2771 };
        }
    }
}
