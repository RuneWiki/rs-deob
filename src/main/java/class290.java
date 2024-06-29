import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class290 extends class243 {

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "B")
    public byte field4727;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "Z")
    public boolean field4725;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public int field4716;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "B")
    public byte field4720;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "S")
    public short field4722;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "S")
    public short field4718;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "S")
    public short field4717;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "S")
    public short field4713;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4719 = 1;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Z")
    public static boolean field4724 = false;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field4715;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)I")
    public abstract int method325(int arg0);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4723++;
        class472.method2792(arg0, false);
        int var7 = 0;
        int var8 = arg0 - arg1;
        if (var8 < arg3) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class29.field460 <= arg5 && class472.field6996 >= arg5) {
            int[] var15 = class209.field3294[arg5];
            int var16 = class52.method367(arg4 - arg0, class235.field4076, (byte) -55, class182.field2877);
            int var17 = class52.method367(arg0 + arg4, class235.field4076, (byte) 127, class182.field2877);
            int var18 = class52.method367(arg4 - var8, class235.field4076, (byte) -60, class182.field2877);
            int var19 = class52.method367(arg4 + var8, class235.field4076, (byte) -59, class182.field2877);
            class357.method2291(var16, arg2, var15, var18, -1);
            class357.method2291(var18, arg6, var15, var19, arg3 - 1);
            class357.method2291(var19, arg2, var15, var17, -1);
        }
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class289.field4712[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (class29.field460 <= var21 && var20 <= class472.field6996) {
                    if (var9 >= var8) {
                        int var22 = class52.method367(arg4 + var7, class235.field4076, (byte) 116, class182.field2877);
                        int var23 = class52.method367(arg4 - var7, class235.field4076, (byte) -84, class182.field2877);
                        if (class472.field6996 >= var21) {
                            class357.method2291(var23, arg2, class209.field3294[var21], var22, -1);
                        }
                        if (var20 >= class29.field460) {
                            class357.method2291(var23, arg2, class209.field3294[var20], var22, arg3 - 1);
                        }
                    } else {
                        int var24 = class289.field4712[var9];
                        int var25 = class52.method367(arg4 + var7, class235.field4076, (byte) -84, class182.field2877);
                        int var26 = class52.method367(arg4 - var7, class235.field4076, (byte) 108, class182.field2877);
                        int var27 = class52.method367(arg4 + var24, class235.field4076, (byte) -117, class182.field2877);
                        int var28 = class52.method367(arg4 - var24, class235.field4076, (byte) 104, class182.field2877);
                        if (class472.field6996 >= var21) {
                            int[] var29 = class209.field3294[var21];
                            class357.method2291(var26, arg2, var29, var28, -1);
                            class357.method2291(var28, arg6, var29, var27, -1);
                            class357.method2291(var27, arg2, var29, var25, -1);
                        }
                        if (class29.field460 <= var20) {
                            int[] var30 = class209.field3294[var20];
                            class357.method2291(var26, arg2, var30, var28, -1);
                            class357.method2291(var28, arg6, var30, var27, -1);
                            class357.method2291(var27, arg2, var30, var25, arg3 - 1);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class29.field460 && var31 <= class472.field6996) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (class182.field2877 <= var33 && class235.field4076 >= var34) {
                    int var35 = class52.method367(var33, class235.field4076, (byte) -34, class182.field2877);
                    int var36 = class52.method367(var34, class235.field4076, (byte) 125, class182.field2877);
                    if (var7 < var8) {
                        int var37 = var7 > var11 ? class289.field4712[var7] : var11;
                        int var38 = class52.method367(arg4 + var37, class235.field4076, (byte) 116, class182.field2877);
                        int var39 = class52.method367(arg4 - var37, class235.field4076, (byte) -123, class182.field2877);
                        if (class472.field6996 >= var32) {
                            int[] var40 = class209.field3294[var32];
                            class357.method2291(var36, arg2, var40, var39, ~arg3);
                            class357.method2291(var39, arg6, var40, var38, -1);
                            class357.method2291(var38, arg2, var40, var35, -1);
                        }
                        if (var31 >= class29.field460) {
                            int[] var41 = class209.field3294[var31];
                            class357.method2291(var36, arg2, var41, var39, -1);
                            class357.method2291(var39, arg6, var41, var38, ~arg3);
                            class357.method2291(var38, arg2, var41, var35, arg3 - 1);
                        }
                    } else {
                        if (class472.field6996 >= var32) {
                            class357.method2291(var36, arg2, class209.field3294[var32], var35, -1);
                        }
                        if (class29.field460 <= var31) {
                            class357.method2291(var36, arg2, class209.field3294[var31], var35, -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public void method317(byte arg0) {
        field4721++;
        int var2 = 38 / ((arg0 + 57) / 54);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4727 = arg9;
        this.field4725 = arg8;
        this.field4716 = arg1;
        this.field4720 = (byte) arg0;
        this.field4722 = (short) arg5;
        this.field4718 = (short) arg4;
        this.field4714 = arg3;
        this.field4728 = arg2;
        this.field4717 = (short) arg6;
        this.field4713 = (short) arg7;
    }
}
