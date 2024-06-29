import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class141 extends class310 {

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field2309 = 0;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "Z")
    public static boolean field2313 = false;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I", line = 10)
    public static int method1087(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)V", line = 25)
    public static final void method1088(int arg0, boolean arg1, int arg2) {
        field2310++;
        if (arg1) {
            class321 var3 = class46.method370(13, (byte) -106, arg2);
            var3.method2265(false);
            var3.field5112 = arg0;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 37)
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(III)I", line = 44)
    private final int method1089(int arg0, int arg1, int arg2) {
        if (arg2 == -2761) {
            field2314++;
            int var4 = arg1 * 57 + arg0;
            int var5 = var4 << 1 ^ var4;
            return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I", line = 62)
    public final int[] method77(int arg0, int arg1) {
        field2311++;
        if (arg1 != -13093) {
            return (int[]) null;
        }
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int var4 = class230.field3818[arg0];
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                var3[var5] = this.method1089(class293.field4737[var5], var4, -2761) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V", line = 95)
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class161.method1253(arg3 + arg5, class353.field5599[arg1], -1, arg2, arg3 - arg5);
        field2312++;
        int var6 = 0;
        int var7 = arg5 * arg5;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        int var10 = var7 << 1;
        int var11 = arg0;
        int var12 = arg0 << 1;
        int var13 = 38 % ((67 - arg4) / 59);
        int var14 = var7 << 2;
        int var15 = (1 - var12) * var7 + var9;
        int var16 = var8 << 2;
        int var17 = (var6 + 1) * var16;
        int var18 = (arg0 - 1) * var14;
        int var19 = ((arg0 << 1) - 3) * var10;
        int var20 = var8 - ((var12 - 1) * var10);
        int var21 = ((var6 << 1) + 3) * var9;
        while (var11 > 0) {
            var11--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var21;
                    var6++;
                    var21 += var16;
                    var20 += var17;
                    var17 += var16;
                }
            }
            if (var20 < 0) {
                var20 += var17;
                var6++;
                var15 += var21;
                var17 += var16;
                var21 += var16;
            }
            int var22 = arg1 - var11;
            var20 += -var19;
            int var23 = arg3 + var6;
            int var24 = arg1 + var11;
            var15 += -var18;
            var19 -= var14;
            int var25 = arg3 - var6;
            class161.method1253(var23, class353.field5599[var22], -1, arg2, var25);
            class161.method1253(var23, class353.field5599[var24], -1, arg2, var25);
            var18 -= var14;
        }
    }
}
