import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 extends class34 {

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "[J")
    private long[] field328 = new long[10];

    @OriginalMember(owner = "mapview!n", name = "s", descriptor = "I")
    private int field335 = 256;

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "I")
    private int field332 = 1;

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "I")
    private int field327 = 0;

    @OriginalMember(owner = "mapview!n", name = "r", descriptor = "J")
    private long field334 = class39.method250((byte) -121);

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "I")
    public static volatile int field324 = 0;

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "[[B")
    public static byte[][] field329 = new byte[250][];

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Lu;")
    public static class38 field323 = class9.method45(-41, "Legende");

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "I")
    public static int field331 = -1;

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Lra;")
    public static class34 field325;

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "[I")
    public static int[] field326;

    @OriginalMember(owner = "mapview!n", name = "q", descriptor = "[I")
    public static int[] field333;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IB)I", line = 16)
    public static final int method146(int arg0, byte arg1) {
        if (arg1 < 17) {
            field324 = -76;
        }
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 30)
    public static void method147(int arg0) {
        field333 = null;
        field326 = null;
        field325 = null;
        field329 = null;
        field323 = null;
        if (arg0 != 0) {
            field329 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIB)I", line = 59)
    public final int method148(int arg0, int arg1, byte arg2) {
        int var4 = this.field332;
        this.field332 = 1;
        if (arg2 <= 118) {
            return -37;
        }
        int var5 = this.field335;
        this.field335 = 300;
        this.field334 = class39.method250((byte) -121);
        if (this.field328[this.field330] == 0L) {
            this.field332 = var4;
            this.field335 = var5;
        } else if (this.field328[this.field330] < this.field334) {
            this.field335 = (int) ((long) (arg0 * 2560) / (this.field334 - this.field328[this.field330]));
        }
        if (this.field335 < 25) {
            this.field335 = 25;
        }
        if (this.field335 > 256) {
            this.field335 = 256;
            this.field332 = (int) ((long) arg0 - (this.field334 - this.field328[this.field330]) / 10L);
        }
        if (this.field332 > arg0) {
            this.field332 = arg0;
        }
        this.field328[this.field330] = this.field334;
        this.field330 = (this.field330 + 1) % 10;
        if (this.field332 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field328[var6] != 0L) {
                    this.field328[var6] += this.field332;
                }
            }
        }
        int var7 = 0;
        if (this.field332 < arg1) {
            this.field332 = arg1;
        }
        class34.method197(21282, (long) this.field332);
        while (this.field327 < 256) {
            this.field327 += this.field335;
            var7++;
        }
        this.field327 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "()V", line = 161)
    public class26() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field328[var1] = this.field334;
        }
    }
}
