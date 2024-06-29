import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class181 {

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2621;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Ljava/io/File;")
    private File field2625;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "J")
    private long field2619;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "J")
    private long field2620;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2618 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lsea;")
    public static class648 field2622;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "[Lf;")
    public static class702[] field2624;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BII)V")
    public final void method1242(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = 41 / ((-arg0 - 38) / 56);
        field2617++;
        if (this.field2619 < (long) arg2 + this.field2620) {
            this.field2621.seek(this.field2619);
            this.field2621.write(1);
            throw new EOFException();
        } else {
            this.field2621.write(arg1, arg3, arg2);
            this.field2620 += arg2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        field2624 = null;
        if (arg0 > 6) {
            field2618 = null;
            field2622 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)J")
    public final long method1244(int arg0) throws IOException {
        field2613++;
        return arg0 == 0 ? this.field2621.length() : -23L;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I[BII)I")
    public final int method1245(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2626++;
        int var5 = this.field2621.read(arg1, arg3, arg2);
        if (arg0 < 2) {
            return 10;
        } else {
            if (var5 > 0) {
                this.field2620 += var5;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLsea;)I")
    public static final int method1246(byte arg0, class648 arg1) {
        field2616++;
        int var2 = 0;
        if (arg1.method3623(-113, class575.field8140)) {
            var2++;
        }
        if (arg0 >= -90) {
            field2622 = null;
        }
        if (arg1.method3623(-110, class450.field6180)) {
            var2++;
        }
        if (arg1.method3623(-78, class338.field4530)) {
            var2++;
        }
        if (arg1.method3623(-116, class611.field8478)) {
            var2++;
        }
        if (arg1.method3623(-96, class476.field6551)) {
            var2++;
        }
        if (arg1.method3623(-78, class619.field8611)) {
            var2++;
        }
        if (arg1.method3623(-121, class65.field857)) {
            var2++;
        }
        if (arg1.method3623(-92, class576.field8143)) {
            var2++;
        }
        if (arg1.method3623(-76, class171.field2471)) {
            var2++;
        }
        if (arg1.method3623(-76, class158.field2307)) {
            var2++;
        }
        if (arg1.method3623(-120, class409.field5808)) {
            var2++;
        }
        if (arg1.method3623(-76, class68.field924)) {
            var2++;
        }
        if (arg1.method3623(-102, class62.field702)) {
            var2++;
        }
        if (arg1.method3623(-105, class71.field951)) {
            var2++;
        }
        if (arg1.method3623(-89, class234.field3243)) {
            var2++;
        }
        if (arg1.method3623(-90, class623.field8649)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BJ)V")
    public final void method1247(byte arg0, long arg1) throws IOException {
        int var4 = -120 / ((arg0 - 21) / 46);
        field2615++;
        this.field2621.seek(arg1);
        this.field2620 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public final void method1248(int arg0) throws IOException {
        field2623++;
        if (arg0 != 0) {
            method1246((byte) 125, null);
        }
        if (this.field2621 != null) {
            this.field2621.close();
            this.field2621 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2612++;
        if (this.field2621 != null) {
            System.out.println("Warning! fileondisk " + this.field2625 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1248(0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class181(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field2621 = new RandomAccessFile(arg0, arg1);
        this.field2625 = arg0;
        this.field2619 = arg2;
        this.field2620 = 0L;
        int var5 = this.field2621.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2621.seek(0L);
            this.field2621.write(var5);
        }
        this.field2621.seek(0L);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method1249(int arg0) {
        if (arg0 != -6111) {
            field2624 = null;
        }
        field2614++;
        return this.field2625;
    }
}
