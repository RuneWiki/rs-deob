import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class129 extends class59 {

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    private int field2520 = 1;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    private int field2519 = 0;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    private int field2531 = 0;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field2527 = 0;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lsd;")
    public static class166 field2528 = class135.method935("mapdots", 0);

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "Lqc;")
    public static class147 field2532 = new class147();

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "Lsd;")
    public static class166 field2534 = class135.method935(")3", 0);

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "Lsd;")
    public static class166 field2535 = class135.method935("swe", 0);

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "[Lqh;")
    public static class152[] field2536 = new class152[50];

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "Lsd;")
    public static class166 field2537 = class135.method935("Verbinde mit Server)3)3)3", 0);

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "Lcb;")
    public static class22 field2529;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method911(int arg0) {
        field2534 = null;
        field2529 = null;
        field2528 = null;
        field2536 = null;
        field2535 = null;
        field2532 = null;
        if (arg0 > -72) {
            field2529 = null;
        }
        field2537 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -128);
        ++field2522;
        if (arg1 >= -124) {
            method913(39, -3, -84, 20, (byte) 90, -49, 57);
        }
        if (super.field1219.field1816) {
            int var4 = class136.field2657[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class98.field1879; ++var6) {
                int var7 = class187.field3569[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field2519 == 0) {
                    var9 = (-var4 + var7) * this.field2520;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) (var10 / 4096)));
                    var9 = (int) ((double) (this.field2520 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field2531 != 0) {
                    if (this.field2531 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class63.field1316[(4088 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIB)I")
    public static final int method912(int arg0, int arg1, int arg2, byte arg3) {
        ++field2523;
        int var4 = arg1 & 3;
        if (~var4 == -1) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (~var4 == -3) {
            return -arg0 + 7;
        } else {
            return arg3 >= -84 ? -98 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        class92.method718(true);
        if (arg0 != 23459) {
            field2534 = null;
        }
        ++field2530;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field2520 = arg0.method400(255);
                }
            } else {
                this.field2531 = arg0.method400(255);
            }
        } else {
            this.field2519 = arg0.method400(255);
        }
        if (arg1 < 18) {
            field2528 = null;
        }
        ++field2525;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIBII)V")
    public static final void method913(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field2526;
        int var7 = 0;
        int var8 = 2047 & -arg6 + 2048;
        if (arg4 <= 52) {
            method912(-32, -91, -114, (byte) 22);
        }
        int var9 = 0;
        int var10 = arg3;
        if (~var8 != -1) {
            int var11 = class40.field717[var8];
            int var12 = class40.field719[var8];
            int var13 = var9 * var12 - arg3 * var11 >> 16;
            var10 = var9 * var11 + arg3 * var12 >> 16;
            var9 = var13;
        }
        int var14 = 2047 & -arg1 + 2048;
        if (~var14 != -1) {
            int var15 = class40.field717[var14];
            int var16 = class40.field719[var14];
            int var17 = var7 * var16 + var10 * var15 >> 16;
            var10 = var10 * var16 + -(var7 * var15) >> 16;
            var7 = var17;
        }
        class38.field690 = -var7 + arg2;
        class22.field385 = -var10 + arg5;
        class159.field3046 = arg1;
        class61.field1242 = arg0 - var9;
        class143.field2786 = arg6;
    }
}
