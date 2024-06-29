import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 extends class228 {

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    private int field1475 = 4096;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "Loa;")
    public static class99 field1469 = class221.method1463(2844, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "Loa;")
    private static class99 field1476 = class221.method1463(2844, "Please remove ");

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Loa;")
    public static class99 field1470 = field1476;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "Loa;")
    public static class99 field1473 = field1476;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Z")
    public static boolean field1468;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "[I")
    public static int[] field1478;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(B)V")
    public static void method582(byte arg0) {
        field1469 = null;
        if (arg0 != 47) {
            method582((byte) -112);
        }
        field1478 = null;
        field1470 = null;
        field1476 = null;
        field1473 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        class110.method761((byte) -119, arg5);
        ++field1474;
        int var8 = -arg3 + arg5;
        if (var8 < arg6) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int[] var14 = class124.field2177[arg2];
        int var15 = -var8 + arg1;
        int var16 = arg1 + var8;
        class175.method1174(var14, arg0, -7, -arg5 + arg1, var15);
        class175.method1174(var14, arg4, -7, var15, var16);
        class175.method1174(var14, arg0, arg6 + -7, var16, arg1 + arg5);
        int var17 = -1;
        while (~var7 > ~var9) {
            var13 += 2;
            var17 += 2;
            var12 += var17;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class75.field1318[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                if (~var8 < ~var9) {
                    int[] var18 = class124.field2177[-var9 + arg2];
                    int[] var19 = class124.field2177[arg2 + var9];
                    int var20 = class75.field1318[var9];
                    int var21 = arg1 + var7;
                    int var22 = arg1 + var20;
                    int var23 = arg1 - var20;
                    int var24 = arg1 - var7;
                    class175.method1174(var19, arg0, -7, var24, var23);
                    class175.method1174(var19, arg4, -7, var23, var22);
                    class175.method1174(var19, arg0, -7, var22, var21);
                    class175.method1174(var18, arg0, arg6 ^ -7, var24, var23);
                    class175.method1174(var18, arg4, -7, var23, var22);
                    class175.method1174(var18, arg0, -7, var22, var21);
                } else {
                    int[] var25 = class124.field2177[-var9 + arg2];
                    int[] var26 = class124.field2177[arg2 - -var9];
                    int var27 = arg1 + var7;
                    int var28 = -var7 + arg1;
                    class175.method1174(var26, arg0, -7, var28, var27);
                    class175.method1174(var25, arg0, arg6 ^ -7, var28, var27);
                }
            }
            int[] var29 = class124.field2177[arg2 + var7];
            int[] var30 = class124.field2177[-var7 + arg2];
            int var31 = arg1 + var9;
            int var32 = -var9 + arg1;
            if (var7 < var8) {
                int var33 = ~var7 < ~var11 ? class75.field1318[var7] : var11;
                int var34 = arg1 - -var33;
                int var35 = -var33 + arg1;
                class175.method1174(var29, arg0, -7, var32, var35);
                class175.method1174(var29, arg4, -7, var35, var34);
                class175.method1174(var29, arg0, -7, var34, var31);
                class175.method1174(var30, arg0, -7, var32, var35);
                class175.method1174(var30, arg4, -7, var35, var34);
                class175.method1174(var30, arg0, arg6 ^ -7, var34, var31);
            } else {
                class175.method1174(var29, arg0, -7, var32, var31);
                class175.method1174(var30, arg0, -7, var32, var31);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field1477;
        if (arg1 != -3) {
            this.method106(-23, 83);
        }
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0 + -1 & class250.field4309, 0, (byte) 124);
            int[] var5 = this.method1500(arg0, 0, (byte) 125);
            int[] var6 = this.method1500(class250.field4309 & arg0 - -1, 0, (byte) 115);
            for (int var7 = 0; ~class234.field4046 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1475;
                int var9 = (var5[class190.field3345 & var7 - -1] - var5[class190.field3345 & var7 - 1]) * this.field1475;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            method583(-69, 121, -106, 34, -48, 5, -58);
        }
        ++field1471;
        if (arg0 == 0) {
            this.field1475 = arg1.method1740((byte) 87);
        }
    }
}
