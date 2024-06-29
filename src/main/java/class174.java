import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class174 extends class107 {

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    private int field2908 = 585;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2914 = "flash3:";

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Lad;")
    public static class275 field2911 = new class275(64);

    @OriginalMember(owner = "client!j", name = "O", descriptor = "[I")
    public static int[] field2915 = new int[3];

    @OriginalMember(owner = "client!j", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2916 = "Close";

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Loa;")
    public static class105 field2905;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public static final void method1236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2909;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        if (arg3 > -5) {
            field2911 = null;
        }
        int var9 = var8 << 1;
        int var10 = arg4 * arg4;
        int var11 = var10 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 + var11;
        int var14 = var8 << 2;
        int var15 = var10 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = ((arg4 << 1) + -3) * var9;
        int var18 = (var6 + 1) * var15;
        if (arg2 >= class52.field766 && ~class191.field3112 <= ~arg2) {
            int var19 = class268.method1789(class148.field2371, -117, arg0 + arg5, class34.field561);
            int var20 = class268.method1789(class148.field2371, 126, -arg5 + arg0, class34.field561);
            class309.method2096(arg1, var19, (byte) -117, class232.field3629[arg2], var20);
        }
        int var21 = (arg4 + -1) * var14;
        int var22 = var10 - (var12 - 1) * var9;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var22 += var18;
                    ++var6;
                    var18 += var15;
                    var13 += var16;
                    var16 += var15;
                }
            }
            --var7;
            if (var22 < 0) {
                var22 += var18;
                var13 += var16;
                var16 += var15;
                ++var6;
                var18 += var15;
            }
            int var23 = arg2 - -var7;
            var13 += -var21;
            var21 -= var14;
            var22 += -var17;
            var17 -= var14;
            int var24 = arg2 - var7;
            if (~class52.field766 >= ~var23 && class191.field3112 >= var24) {
                int var25 = class268.method1789(class148.field2371, -88, arg0 + var6, class34.field561);
                int var26 = class268.method1789(class148.field2371, -121, -var6 + arg0, class34.field561);
                if (~var24 <= ~class52.field766) {
                    class309.method2096(arg1, var25, (byte) -117, class232.field3629[var24], var26);
                }
                if (var23 <= class191.field3112) {
                    class309.method2096(arg1, var25, (byte) -117, class232.field3629[var23], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field2907;
        int var3 = 69 % ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(117, arg1);
        if (super.field1661.field2115) {
            int var5 = class259.field4254[arg1];
            for (int var6 = 0; ~class24.field443 < ~var6; ++var6) {
                int var7 = class221.field3486[var6];
                if (~this.field2908 > ~var7 && var7 < -this.field2908 + 4096 && -this.field2908 + 2048 < var5 && this.field2908 + 2048 > var5) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field2908 + 2048);
                    var4[var6] = 4096 - var11;
                } else if (~var7 < ~(-this.field2908 + 2048) && ~var7 > ~(this.field2908 + 2048)) {
                    int var12 = var5 - 2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field2908;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field2908 + 2048);
                } else if (var5 >= this.field2908 && -this.field2908 + 4096 >= var5) {
                    if (this.field2908 <= var7 && ~(-this.field2908 + 4096) <= ~var7) {
                        var4[var6] = 0;
                    } else {
                        int var16 = 2048 - var5;
                        int var17 = ~var16 <= -1 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field2908 + 2048);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = var20 < 0 ? -var20 : var20;
                    int var22 = var21 - this.field2908;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (2048 - this.field2908);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field2913;
        if (arg2 != 28) {
            method1237(9);
        }
        if (arg0 == 0) {
            this.field2908 = arg1.method1837(252);
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public static void method1237(int arg0) {
        field2916 = null;
        field2915 = null;
        field2911 = null;
        field2905 = null;
        field2914 = null;
        if (arg0 < 26) {
            method1236(-105, 109, -71, -52, -110, -11);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class174() {
        super(0, true);
    }
}
