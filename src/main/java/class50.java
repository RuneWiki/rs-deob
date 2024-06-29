import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class50 {

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lr;")
    public static class66 field887 = class93.method641(43, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lr;")
    public static class66 field888 = class93.method641(43, "not yet implemented");

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field896 = 0;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lr;")
    public static class66 field891 = class93.method641(43, ":");

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Lsg;")
    public static class247 field894;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[S")
    public static short[] field886;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method349(int arg0) {
        field894 = null;
        if (arg0 != -28590) {
            method349(111);
        }
        field887 = null;
        field888 = null;
        field886 = null;
        field891 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field890++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg3 - arg6;
        int var13 = arg1 * arg1;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = arg3 << 1;
        int var18 = var12 * var12;
        int var19 = var15 << 1;
        int var20 = var13 << 1;
        int var21 = var18 << 1;
        int var22 = var12 << 1;
        if (arg7 != -1832820639) {
            field888 = null;
        }
        int var23 = var14 - ((var17 - 1) * var20);
        int var24 = (1 - var17) * var13 + var16;
        int var25 = (1 - var22) * var15 + var21;
        int var26 = var14 << 2;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var18 - ((var22 - 1) * var19);
        int var30 = var18 << 2;
        int var31 = var16 * 3;
        int var32 = (var17 - 3) * var20;
        int var33 = var21 * 3;
        int var34 = (var22 - 3) * var19;
        int var35 = var30;
        int var36 = var26;
        int var37 = (arg3 - 1) * var27;
        if (arg2 >= class241.field4186 && class222.field3788 >= arg2) {
            int[] var38 = class15.field183[arg2];
            int var39 = class54.method368(arg5 - arg1, class215.field3706, (byte) 114, class165.field2972);
            int var40 = class54.method368(arg5 + arg1, class215.field3706, (byte) 114, class165.field2972);
            int var41 = class54.method368(arg5 - var11, class215.field3706, (byte) 114, class165.field2972);
            int var42 = class54.method368(arg5 + var11, class215.field3706, (byte) 114, class165.field2972);
            class194.method1266(var39, (byte) -17, arg4, var38, var41);
            class194.method1266(var41, (byte) -17, arg0, var38, var42);
            class194.method1266(var42, (byte) -17, arg4, var38, var40);
        }
        int var43 = (var12 - 1) * var28;
        while (var9 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var8++;
                    var24 += var31;
                    var23 += var36;
                    var31 += var26;
                    var36 += var26;
                }
            }
            boolean var44 = var9 <= var12;
            var9--;
            int var45 = arg2 + var9;
            if (var23 < 0) {
                var24 += var31;
                var23 += var36;
                var36 += var26;
                var31 += var26;
                var8++;
            }
            var23 += -var32;
            var24 += -var37;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var29 += var35;
                        var35 += var30;
                        var10++;
                        var25 += var33;
                        var33 += var30;
                    }
                }
                if (var29 < 0) {
                    var10++;
                    var29 += var35;
                    var25 += var33;
                    var33 += var30;
                    var35 += var30;
                }
                var29 += -var34;
                var34 -= var28;
                var25 += -var43;
                var43 -= var28;
            }
            int var46 = arg2 - var9;
            var32 -= var27;
            if (var45 >= class241.field4186 && var46 <= class222.field3788) {
                int var47 = class54.method368(arg5 + var8, class215.field3706, (byte) 114, class165.field2972);
                int var48 = class54.method368(arg5 - var8, class215.field3706, (byte) 114, class165.field2972);
                if (var44) {
                    int var49 = class54.method368(arg5 + var10, class215.field3706, (byte) 114, class165.field2972);
                    int var50 = class54.method368(arg5 - var10, class215.field3706, (byte) 114, class165.field2972);
                    if (var46 >= class241.field4186) {
                        int[] var51 = class15.field183[var46];
                        class194.method1266(var48, (byte) -17, arg4, var51, var50);
                        class194.method1266(var50, (byte) -17, arg0, var51, var49);
                        class194.method1266(var49, (byte) -17, arg4, var51, var47);
                    }
                    if (class222.field3788 >= var45) {
                        int[] var52 = class15.field183[var45];
                        class194.method1266(var48, (byte) -17, arg4, var52, var50);
                        class194.method1266(var50, (byte) -17, arg0, var52, var49);
                        class194.method1266(var49, (byte) -17, arg4, var52, var47);
                    }
                } else {
                    if (var46 >= class241.field4186) {
                        class194.method1266(var48, (byte) -17, arg4, class15.field183[var46], var47);
                    }
                    if (var45 <= class222.field3788) {
                        class194.method1266(var48, (byte) -17, arg4, class15.field183[var45], var47);
                    }
                }
            }
            var37 -= var27;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field892++;
        if (arg0 >= -77) {
            return;
        }
        for (int var5 = 0; var5 < class87.field1701; var5++) {
            if (arg3 < class246.field4293[var5] + class157.field2827[var5] && class246.field4293[var5] < (arg3 + arg1) && (class45.field831[var5] + class181.field3167[var5]) > arg4 && arg2 + arg4 > class181.field3167[var5]) {
                class142.field2607[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public abstract void method80(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V")
    public abstract void method75(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZII)V")
    public abstract void method79(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(III)V")
    public class50(int arg0, int arg1, int arg2) {
        this.field895 = arg2;
        this.field893 = arg1;
        this.field889 = arg0;
    }
}
