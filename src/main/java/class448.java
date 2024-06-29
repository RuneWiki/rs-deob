import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class448 {

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5649;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "J")
    private long field5644;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "J")
    private long field5635;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Ljava/io/File;")
    private File field5647;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Ldr;")
    public static class675 field5645 = new class675(64, 17);

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
    public static int[] field5646 = new int[4];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field5648 = -2;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)V")
    public final void method2445(int arg0, long arg1) throws IOException {
        if (arg0 != 1) {
            this.field5635 = 63L;
        }
        this.field5649.seek(arg1);
        field5640++;
        this.field5644 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z")
    public static final boolean method2446(int arg0, int arg1, int arg2) {
        field5636++;
        if (arg2 < 23) {
            field5648 = 53;
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)J")
    public final long method2447(int arg0) throws IOException {
        if (arg0 != 1) {
            this.field5649 = null;
        }
        field5641++;
        return this.field5649.length();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI[BI)I")
    public final int method2448(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5634++;
        int var5 = this.field5649.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field5644 += var5;
        }
        return arg0 == 122 ? var5 : 59;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BIBI)V")
    public final void method2449(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field5637++;
        if (arg2 <= 16) {
            return;
        }
        if (this.field5635 < (long) arg1 + this.field5644) {
            this.field5649.seek(this.field5635);
            this.field5649.write(1);
            throw new EOFException();
        } else {
            this.field5649.write(arg0, arg3, arg1);
            this.field5644 += arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5639++;
        if (this.field5649 != null) {
            System.out.println("Warning! fileondisk " + this.field5647 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2451(true);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method2450(int arg0) {
        field5645 = null;
        field5646 = null;
        if (arg0 != -1) {
            method2453(30, 35, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method2451(boolean arg0) throws IOException {
        if (this.field5649 != null) {
            this.field5649.close();
            this.field5649 = null;
        }
        field5642++;
        if (!arg0) {
            method2446(123, 11, -48);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method2452(int arg0) {
        field5643++;
        if (arg0 != 17) {
            method2446(-37, -111, 14);
        }
        return this.field5647;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class448(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field5649 = new RandomAccessFile(arg0, arg1);
        this.field5644 = 0L;
        this.field5635 = arg2;
        this.field5647 = arg0;
        int var5 = this.field5649.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5649.seek(0L);
            this.field5649.write(var5);
        }
        this.field5649.seek(0L);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)B")
    public static final byte method2453(int arg0, int arg1, byte arg2) {
        int var3 = 11 / ((-arg2 - 72) / 37);
        field5638++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
