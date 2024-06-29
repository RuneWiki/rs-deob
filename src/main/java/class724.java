import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class724 extends class185 {

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    private int field9945;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
    private int field9947;

    @OriginalMember(owner = "client!jha", name = "q", descriptor = "I")
    private int field9952;

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    private int field9949;

    @OriginalMember(owner = "client!jha", name = "s", descriptor = "I")
    private int field9954;

    @OriginalMember(owner = "client!jha", name = "v", descriptor = "Lhk;")
    private class111 field9957;

    @OriginalMember(owner = "client!jha", name = "t", descriptor = "I")
    private int field9955;

    @OriginalMember(owner = "client!jha", name = "r", descriptor = "I")
    public static int field9953 = 0;

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "Lam;")
    public static class660 field9951 = new class660();

    @OriginalMember(owner = "client!jha", name = "w", descriptor = "I")
    public static int field9958 = 0;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "Lbja;")
    private class34 field9950;

    @OriginalMember(owner = "client!jha", name = "y", descriptor = "Lpo;")
    public static class585 field9960;

    @OriginalMember(owner = "client!jha", name = "u", descriptor = "Lgj;")
    public static class662 field9956;

    @OriginalMember(owner = "client!jha", name = "A", descriptor = "Z")
    public static boolean field9962;

    @OriginalMember(owner = "client!jha", name = "x", descriptor = "[Lnf;")
    public static class604[] field9959;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)Lbja;")
    public final class34 method1378(byte arg0) {
        field9948++;
        int var2 = 67 / ((arg0 + 54) / 61);
        if (this.field9950 == null) {
            class714.field9832[2] = this.field9954;
            class162 var3 = this.field9957.field970;
            class714.field9832[4] = this.field9945;
            class714.field9832[1] = this.field9949;
            class714.field9832[0] = this.field9955;
            class714.field9832[3] = this.field9952;
            class714.field9832[5] = this.field9947;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1274(class714.field9832[var6], 21532)) {
                    return null;
                }
                class311 var8 = var3.method1270(class714.field9832[var6], true);
                int var9 = var8.field4248 ? 64 : 128;
                if (var8.field4238 > 0) {
                    var4 = true;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class513.field7010[var7] = var3.method1269(1.0F, var5, false, class714.field9832[var7], var5, true);
            }
            this.field9950 = new class34(this.field9957, 6407, var5, var4, class513.field7010);
        }
        return this.field9950;
    }

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "(I)V")
    public static void method4018(int arg0) {
        field9960 = null;
        field9956 = null;
        field9951 = null;
        if (arg0 != 2) {
            method4019(false, null);
        }
        field9959 = null;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZLtaa;)V")
    public static final void method4019(boolean arg0, class431 arg1) {
        field9961++;
        class223.field3254 = arg1;
        if (!arg0) {
            field9953 = 114;
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4020(int arg0, String arg1) {
        field9946++;
        if (!class675.field9384 || (class448.field6148 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class696.field9624;
        int[] var4 = class417.field5700;
        if (arg0 <= 45) {
            field9958 = 111;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class771 var6 = class527.field7150[var4[var5]];
            if (var6.field10641 != null && var6.field10641.equalsIgnoreCase(arg1) && (class235.field3379 == var6 && (class448.field6148 & 0x10) != 0 || var6 != null && (class448.field6148 & 0x8) != 0)) {
                class194.field2954++;
                class537 var7 = class476.method2729(class487.field6573, (byte) -46, class551.field7498);
                var7.field7295.method781(17, var4[var5]);
                var7.field7295.method791(-550441944, class657.field9100);
                var7.field7295.method790(class783.field10758, 65280);
                var7.field7295.method780(0, true);
                var7.field7295.method792((byte) -61, class342.field4609);
                class173.method1314(false, var7);
                class297.method1910(0, var6.method2342((byte) -47), true, var6.field5304[0], var6.method2342((byte) 108), var6.field5308[0], -2, 0, 121);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class629.method3535(class641.field8839.method3566((byte) -98, class464.field6309) + arg1, 4, -2309);
        }
        if (class675.field9384) {
            class200.method1443(false);
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lhk;IIIIII)V")
    public class724(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9945 = arg5;
        this.field9947 = arg6;
        this.field9952 = arg4;
        this.field9949 = arg2;
        this.field9954 = arg3;
        this.field9957 = arg0;
        this.field9955 = arg1;
    }
}
