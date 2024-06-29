import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class205 implements class217 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Liea;")
    public class130 field2603;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Lpl;")
    private class612 field2611;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Lpl;")
    public class612 field2604;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field2605 = 1337;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "Lbaa;")
    public static class593 field2610 = new class593(11, 0, 1, 2);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "J")
    private long field2609;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Lla;")
    private class413 field2607;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
    public static int[] field2613;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "[[S")
    public static short[][] field2615;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 5)
    public static final void method1236(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class451.field5788[var1] = false;
        }
        field2601++;
        class269.field3403 = class20.field292;
        class510.field6934 = 0;
        class196.field2471 = -1;
        class306.field3890 = -1;
        class697.field9866 = -1;
        class460.field5849 = class276.field3464;
        class481.field6400 = class693.field9826;
        class395.field4985 = class571.field7982;
        class389.field4906 = 0;
        class137.field1775 = class215.field2673;
        class296.field3661 = arg0;
        class627.field8741 = class133.field1735;
        class465.field5928 = -1;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V", line = 33)
    public static void method1237(int arg0) {
        if (arg0 != 100) {
            field2613 = null;
        }
        field2613 = null;
        field2610 = null;
        field2615 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z", line = 47)
    public boolean method392(byte arg0) {
        field2616++;
        if (arg0 != 82) {
            this.method395(true, 46);
        }
        boolean var2 = true;
        if (!this.field2604.method3368(1912, this.field2603.field1614)) {
            var2 = false;
        }
        if (!this.field2611.method3368(1912, this.field2603.field1614)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "([[II)V", line = 69)
    public static final void method1238(int[][] arg0, int arg1) {
        if (arg1 != 100) {
            field2605 = -10;
        }
        field2606++;
        class550.field7650 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 83)
    public void method394(int arg0) {
        if (arg0 <= -41) {
            field2602++;
            class595 var2 = class280.method1588(this.field2611, this.field2603.field1614, (byte) 32);
            this.field2607 = class32.field452.method989(var2, class661.method3716(this.field2604, this.field2603.field1614), true);
        }
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V", line = 105)
    public static final void method1241(int arg0) {
        if (class267.field3384 == null || class100.field1358 == null) {
            class267.field3384 = new int[256];
            class100.field1358 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class267.field3384[var1] = (int) (Math.sin(var2) * 4096.0D);
                class100.field1358[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2612++;
        if (arg0 != 0) {
            field2613 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V", line = 141)
    public final void method395(boolean arg0, int arg1) {
        field2608++;
        int var3 = this.field2603.field1625.method2206(class593.field8327, this.field2603.field1621, arg1 - 6619) + this.field2603.field1623;
        int var4 = this.field2603.field1622.method195(class316.field4060, this.field2603.field1617, -122) + this.field2603.field1616;
        this.method1239(116, var3, arg0, var4);
        if (arg1 != 6621) {
            field2615 = null;
        }
        this.method1240(2, var4, arg0, var3);
        String var5 = class407.field5098.method674((byte) 86);
        if (class571.method3150(arg1 - 6518) - this.field2609 > 10000L) {
            var5 = var5 + " (" + class407.field5098.method673((byte) 127).method1226((byte) -109) + ")";
        }
        this.field2607.method2199(this.field2603.field1618, -142, this.field2603.field1621 / 2 + var3, -1, this.field2603.field1617 / 2 + this.field2603.field1619 + var4 - -4, var5);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I", line = 166)
    public final int method1242(byte arg0) {
        field2600++;
        if (arg0 != -8) {
            this.method395(false, -49);
        }
        int var2 = class407.field5098.method676((byte) -29);
        int var3 = var2 * 100;
        if (this.field2614 == var2 && var2 != 0) {
            int var4 = class407.field5098.method675(-23213);
            if (var2 < var4) {
                long var5 = this.field2609 - class407.field5098.method670((byte) -25);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class571.method3150(arg0 + 111) - this.field2609) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field2614 = var2;
            this.field2609 = class571.method3150(100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lpl;Lpl;Liea;)V", line = 215)
    public class205(class612 arg0, class612 arg1, class130 arg2) {
        this.field2603 = arg2;
        this.field2611 = arg1;
        this.field2604 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZI)V")
    public abstract void method1239(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIZI)V")
    public abstract void method1240(int arg0, int arg1, boolean arg2, int arg3);
}
