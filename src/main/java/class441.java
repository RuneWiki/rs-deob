import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class441 {

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6715;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "Ljava/io/File;")
    private File field6720;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "J")
    private long field6713;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "J")
    private long field6718;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Z")
    public static boolean field6716 = false;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[I")
    public static int[] field6714 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "J")
    public static long field6726;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([BIII)V", line = 3)
    public final void method2783(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6712++;
        if (arg3 < 103) {
            return;
        }
        if ((long) arg2 + this.field6713 > this.field6718) {
            this.field6715.seek(this.field6718);
            this.field6715.write(1);
            throw new EOFException();
        } else {
            this.field6715.write(arg0, arg1, arg2);
            this.field6713 += arg2;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 22)
    public static void method2784(int arg0) {
        field6714 = null;
        if (arg0 >= -67) {
            field6714 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V", line = 35)
    public final void method2785(int arg0) throws IOException {
        field6719++;
        if (arg0 != -1856) {
            method2786(42, 14);
        }
        if (this.field6715 != null) {
            this.field6715.close();
            this.field6715 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I", line = 54)
    public static final int method2786(int arg0, int arg1) {
        return class530.field7728 == null ? 0 : class530.field7728[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qq", name = "finalize", descriptor = "()V", line = 61)
    protected final void finalize() throws Throwable {
        if (this.field6715 != null) {
            System.out.println("Warning! fileondisk " + this.field6720 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2785(-1856);
        }
        field6724++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)Ljava/io/File;", line = 77)
    public final File method2787(byte arg0) {
        if (arg0 >= -84) {
            field6714 = null;
        }
        field6717++;
        return this.field6720;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(JI)V", line = 95)
    public final void method2788(long arg0, int arg1) throws IOException {
        field6722++;
        this.field6715.seek(arg0);
        this.field6713 = arg0;
        if (arg1 != 32087) {
            method2784(91);
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)J", line = 107)
    public final long method2789(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field6713 = -96L;
        }
        field6723++;
        return this.field6715.length();
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 117)
    public class441(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field6715 = new RandomAccessFile(arg0, arg1);
        this.field6720 = arg0;
        this.field6713 = 0L;
        this.field6718 = arg2;
        int var5 = this.field6715.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6715.seek(0L);
            this.field6715.write(var5);
        }
        this.field6715.seek(0L);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[B)I", line = 149)
    public final int method2790(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6725++;
        int var5 = this.field6715.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field6713 += var5;
        }
        return arg1 == -1 ? var5 : 107;
    }
}
