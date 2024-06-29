import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class415 extends class270 {

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "Z")
    public volatile boolean field6303 = true;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Z")
    public static boolean field6300 = false;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "Lvv;")
    public static class313 field6305 = new class313(82, -2);

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
    public boolean field6302;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Z")
    public boolean field6304;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "[I")
    public static int[] field6306;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIBIIIII)V", line = 3)
    public static final void method2561(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6301++;
        if (arg2 == arg5 && arg0 == arg7 && arg6 == arg9 && arg1 == arg3) {
            class227.method1581(arg5, arg1, true, arg9, arg8, arg0);
        } else {
            int var10 = arg5;
            int var11 = arg0;
            int var12 = arg5 * 3;
            int var13 = arg0 * 3;
            int var14 = arg2 * 3;
            int var15 = arg7 * 3;
            int var16 = arg6 * 3;
            int var17 = arg3 * 3;
            int var18 = arg9 + var14 - var16 - arg5;
            int var19 = arg1 - arg0 - (-var15 + var17);
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = arg5 + (var28 + var32 + var30 >> 12);
                int var35 = (var29 + var31 + var33 >> 12) + arg0;
                class227.method1581(var10, var35, true, var34, arg8, var11);
                var11 = var35;
                var10 = var34;
            }
        }
        int var25 = 120 / ((arg4 + 72) / 52);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZII)V", line = 83)
    public static final void method2562(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6299++;
        class266 var5 = class308.method1961(arg2, arg3, 4);
        var5.method1781((byte) 95);
        var5.field4457 = arg1;
        var5.field4454 = arg4;
        var5.field4453 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 112)
    public static void method2563(byte arg0) {
        field6305 = null;
        if (arg0 >= 74) {
            field6306 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)[B")
    public abstract byte[] method88(byte arg0);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
    public abstract int method90(int arg0);
}
