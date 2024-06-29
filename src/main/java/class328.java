import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class328 extends class550 {

    @OriginalMember(owner = "client!du", name = "g", descriptor = "Lpr;")
    public static class415 field4813 = new class415(0);

    @OriginalMember(owner = "client!du", name = "i", descriptor = "Lqfa;")
    public static class85 field4815 = new class85(75, 2);

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Z")
    public static boolean field4816 = false;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Z")
    public static boolean field4817 = false;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)V")
    public static final void method2108(int arg0, byte arg1) {
        if (arg1 != 15) {
            field4816 = true;
        }
        field4811++;
        class19 var2 = class373.method2355(arg1 + 97, arg0, 8);
        var2.method438(arg1 ^ 0x329);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method2109(int arg0) {
        field4813 = null;
        field4815 = null;
        if (arg0 != 19973) {
            field4817 = false;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII)V")
    public static final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= class704.field9911 && arg0 <= class379.field5612) {
            int var5 = class107.method968(client.field4115, 122, class309.field4556, arg2);
            int var6 = class107.method968(client.field4115, 112, class309.field4556, arg4);
            class236.method1577(var5, arg1, var6, -16157, arg0);
        }
        if (arg3 == -1) {
            field4812++;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4814++;
        int var8 = arg7;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg0 - arg2;
        int var12 = arg4 - arg2;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class309.field4556 <= arg6 && arg6 <= client.field4115) {
            int[] var39 = class582.field8429[arg6];
            int var40 = class107.method968(class379.field5612, 117, class704.field9911, arg5 - arg0);
            int var41 = class107.method968(class379.field5612, 115, class704.field9911, arg0 + arg5);
            int var42 = class107.method968(class379.field5612, 121, class704.field9911, arg5 - var11);
            int var43 = class107.method968(class379.field5612, arg7 + 114, class704.field9911, arg5 + var11);
            class705.method3938(var42, arg3, 30336, var40, var39);
            class705.method3938(var43, arg1, 30336, var42, var39);
            class705.method3938(var41, arg3, 30336, var43, var39);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class309.field4556 <= var46 && var45 <= client.field4115) {
                int var47 = class107.method968(class379.field5612, 127, class704.field9911, arg5 + var8);
                int var48 = class107.method968(class379.field5612, 107, class704.field9911, arg5 - var8);
                if (var44) {
                    int var49 = class107.method968(class379.field5612, 116, class704.field9911, arg5 + var10);
                    int var50 = class107.method968(class379.field5612, 126, class704.field9911, arg5 - var10);
                    if (var45 >= class309.field4556) {
                        int[] var51 = class582.field8429[var45];
                        class705.method3938(var50, arg3, 30336, var48, var51);
                        class705.method3938(var49, arg1, 30336, var50, var51);
                        class705.method3938(var47, arg3, 30336, var49, var51);
                    }
                    if (client.field4115 >= var46) {
                        int[] var52 = class582.field8429[var46];
                        class705.method3938(var50, arg3, 30336, var48, var52);
                        class705.method3938(var49, arg1, 30336, var50, var52);
                        class705.method3938(var47, arg3, 30336, var49, var52);
                    }
                } else {
                    if (var45 >= class309.field4556) {
                        class705.method3938(var47, arg3, arg7 ^ 0x7680, var48, class582.field8429[var45]);
                    }
                    if (client.field4115 >= var46) {
                        class705.method3938(var47, arg3, 30336, var48, class582.field8429[var46]);
                    }
                }
            }
        }
    }
}
