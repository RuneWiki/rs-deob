import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class47 extends class154 {

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field765 = "cyan:";

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "Z")
    public static boolean field774 = false;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "Lgd;")
    public static class170 field767 = new class170(512);

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field777 = new String[1000];

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "Lhf;")
    public class314 field771;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "[B")
    public byte[] field769;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)[B", line = 4)
    public final byte[] method410(boolean arg0) {
        if (arg0) {
            return (byte[]) null;
        }
        field775++;
        if (this.field2317) {
            throw new RuntimeException();
        }
        return this.field769;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)I", line = 26)
    public static final int method411(int arg0, int arg1) {
        field770++;
        int var2 = -19 % ((arg1 - 26) / 45);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIB)V", line = 48)
    public static final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field766++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg0 - arg3;
        int var11 = arg5 * arg5;
        int var12 = arg0 * arg0;
        int var13 = var10 * var10;
        int var14 = arg5 - arg3;
        int var15 = var12 << 1;
        int var16 = var11 << 1;
        int var17 = 0;
        int var18 = var13 << 1;
        int var19 = var14 * var14;
        int var20 = var19 << 1;
        int var21 = arg0 << 1;
        int var22 = var10 << 1;
        int var23 = (1 - var21) * var11 + var15;
        int var24 = var12 - (var21 - 1) * var16;
        int var25 = (1 - var22) * var19 + var18;
        int var26 = var13 - ((var22 - 1) * var20);
        if (arg7 >= -61) {
            return;
        }
        int var27 = var11 << 2;
        int var28 = var13 << 2;
        int var29 = var12 << 2;
        int var30 = var19 << 2;
        int var31 = var15 * 3;
        int var32 = (var22 - 3) * var20;
        int var33 = (var21 - 3) * var16;
        int var34 = var29;
        int var35 = var18 * 3;
        int var36 = var28;
        int var37 = (arg0 - 1) * var27;
        int var38 = (var10 - 1) * var30;
        int[] var39 = class34.field525[arg6];
        class272.method1876(var39, arg1 - var14, -arg5 + arg1, arg2, (byte) -46);
        class272.method1876(var39, arg1 + var14, -var14 + arg1, arg4, (byte) -49);
        class272.method1876(var39, arg1 + arg5, arg1 + var14, arg2, (byte) -107);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var34;
                    var34 += var29;
                    var8++;
                    var23 += var31;
                    var31 += var29;
                }
            }
            if (var24 < 0) {
                var24 += var34;
                var8++;
                var34 += var29;
                var23 += var31;
                var31 += var29;
            }
            var24 += -var33;
            boolean var40 = var9 <= var10;
            var33 -= var27;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var35;
                        var17++;
                        var35 += var28;
                        var26 += var36;
                        var36 += var28;
                    }
                }
                if (var26 < 0) {
                    var25 += var35;
                    var35 += var28;
                    var26 += var36;
                    var36 += var28;
                    var17++;
                }
                var25 += -var38;
                var26 += -var32;
                var32 -= var30;
                var38 -= var30;
            }
            var9--;
            int var41 = arg6 + var9;
            int var42 = arg6 - var9;
            int var43 = arg1 - var8;
            int var44 = arg1 + var8;
            if (var40) {
                int var45 = arg1 + var17;
                int var46 = arg1 - var17;
                class272.method1876(class34.field525[var42], var46, var43, arg2, (byte) -102);
                class272.method1876(class34.field525[var42], var45, var46, arg4, (byte) -73);
                class272.method1876(class34.field525[var42], var44, var45, arg2, (byte) -57);
                class272.method1876(class34.field525[var41], var46, var43, arg2, (byte) -102);
                class272.method1876(class34.field525[var41], var45, var46, arg4, (byte) -111);
                class272.method1876(class34.field525[var41], var44, var45, arg2, (byte) -78);
            } else {
                class272.method1876(class34.field525[var42], var44, var43, arg2, (byte) -80);
                class272.method1876(class34.field525[var41], var44, var43, arg2, (byte) -15);
            }
            var23 += -var37;
            var37 -= var27;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V", line = 225)
    public static void method413(byte arg0) {
        field765 = null;
        field767 = null;
        field777 = null;
        if (arg0 != -51) {
            method412(50, -121, -48, 80, -90, 125, 122, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)I", line = 237)
    public final int method414(int arg0) {
        field768++;
        if (arg0 == 7434) {
            return this.field2317 ? 0 : 100;
        } else {
            return -73;
        }
    }
}
