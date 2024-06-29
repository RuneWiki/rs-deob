import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class134 {

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "Lsw;")
    private class641 field1642 = new class641(256);

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "Ln;")
    private class17 field1646;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "Lbda;")
    private class428 field1647;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)Leea;")
    public final class112 method749(byte arg0, int arg1) {
        field1645++;
        if (arg0 != 46) {
            this.method749((byte) -60, 76);
        }
        Object var3 = this.field1642.method3682(arg0 - 46, (long) arg1);
        if (var3 != null) {
            return (class112) var3;
        } else if (this.field1646.method118(arg1, (byte) 95)) {
            class217 var4 = this.field1646.method119(-117, arg1);
            int var5 = var4.field2642 ? 64 : this.field1647.field5772;
            class112 var7;
            if (var4.field2655 && this.field1647.method1143()) {
                float[] var6 = this.field1646.method117(var5, var5, 0.7F, 16173, false, arg1);
                var7 = this.field1647.method2454(1, class10.field80, var4.field2654 != 0, var6, var5, var5);
            } else {
                int[] var8 = var4.field2640 ? this.field1646.method116(0.7F, -115, var5, false, var5, arg1) : this.field1646.method120(var5, true, 0.7F, arg1, var5, arg0 ^ 0x46);
                var7 = this.field1647.method2430(arg0 - 173, var8, var5, var5, var4.field2654 != 0);
            }
            var7.method647(var4.field2659, var4.field2653, (byte) 53);
            this.field1642.method3684(var7, 0, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
    public final void method750(boolean arg0) {
        field1640++;
        if (!arg0) {
            this.method750(false);
        }
        this.field1642.method3687(1402);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZZ)V")
    public static final void method751(boolean arg0, boolean arg1) {
        field1644++;
        if (arg0) {
            if (class599.field8668 != -1) {
                class547.method3211(-1, class599.field8668);
            }
            for (class565 var2 = (class565) class309.field3937.method2638(false); var2 != null; var2 = (class565) class309.field3937.method2641(12089)) {
                if (!var2.method3189(-9613)) {
                    var2 = (class565) class309.field3937.method2638(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class615.method3541(var2, (byte) -60, false, true);
            }
            class599.field8668 = -1;
            class309.field3937 = new class451(8);
            class441.method2584(-9);
            class599.field8668 = class314.field4002;
            class194.method1059(false, true);
            class562.method3279((byte) -114);
            class630.method3607(class599.field8668);
        }
        class216.field2637 = false;
        class571.field8376 = "";
        class249.field3184 = "";
        class598.method3457(-24232);
        class71.field684 = -1;
        class205.method1097((byte) -86, class529.field7434);
        class103.field1265 = new class545();
        if (!arg1) {
            return;
        }
        class103.field1265.field6483[0] = class106.field1289 / 2;
        class103.field1265.field8652 = class422.field5452 * 128 / 2;
        class103.field1265.field8661 = class106.field1289 * 128 / 2;
        class103.field1265.field6491[0] = class422.field5452 / 2;
        class39.field303 = 0;
        class286.field3729 = 0;
        if (class617.field8931 == 2) {
            class286.field3729 = class42.field335 << 7;
            class39.field303 = class641.field9238 << 7;
        } else {
            class84.method497((byte) -123);
        }
        class316.method1751(127);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ldn;IZ)Ltc;")
    public static final class294 method752(class438 arg0, int arg1, boolean arg2) {
        field1643++;
        if (arg2) {
            byte[] var3 = arg0.method2560(arg1, -6914);
            return var3 == null ? null : new class294(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public final void method753(int arg0) {
        int var2 = -125 % ((arg0 - 21) / 47);
        this.field1642.method3686((byte) 53, 5);
        field1641++;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lbda;Ln;)V")
    public class134(class428 arg0, class17 arg1) {
        this.field1646 = arg1;
        this.field1647 = arg0;
    }
}
