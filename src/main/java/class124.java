import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class124 implements class73 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[I")
    public static int[] field1745 = new int[100];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1750 = "glow1:";

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lve;")
    public static class109 field1746 = new class109(0, 0);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[[I")
    public static int[][] field1752 = new int[5][5000];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    public static int[] field1751;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[[[B")
    public static byte[][][] field1753;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method794(byte arg0) {
        field1745 = null;
        if (arg0 < 75) {
            method797(31, 14, -82, -56, -20, 20, -44);
        }
        field1746 = null;
        field1752 = null;
        field1750 = null;
        field1751 = null;
        field1753 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public final String method479(int[] arg0, int arg1, int arg2, long arg3) {
        field1748++;
        if (arg2 == 0) {
            class36 var6 = class148.method927(arg0[0], true);
            return var6.method246((int) arg3, false);
        } else if (~arg2 == arg1 || arg2 == 10) {
            class10 var7 = class281.method1822((byte) -97, (int) arg3);
            return var7.field147;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class148.method927(arg0[0], true).method246((int) arg3, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static final void method795(byte arg0) {
        field1747++;
        class103.field1475.method948((byte) 58);
        class105.field1509.method948((byte) 58);
        if (arg0 != 111) {
            field1746 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Lni;")
    public static final class308 method796(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        return var3 == null || var3.field1323 == null ? null : var3.field1323;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class288.method1926(arg3, 4096);
        field1749++;
        int var7 = 0;
        int var8 = arg3;
        int var9 = arg3 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        if (arg0 != -26982) {
            field1751 = null;
        }
        int var10 = -arg3;
        int var11 = -var9;
        int var12 = var9;
        int var13 = -1;
        if (arg6 >= class271.field4322 && arg6 <= class311.field5001) {
            int[] var14 = class247.field3876[arg6];
            int var15 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 - arg3);
            int var16 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 + arg3);
            int var17 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 - var9);
            int var18 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 + var9);
            class129.method822(var14, var15, -2426, arg5, var17);
            class129.method822(var14, var17, -2426, arg4, var18);
            class129.method822(var14, var18, arg0 ^ 0x601C, arg5, var16);
        }
        int var19 = -1;
        while (var7 < var8) {
            var19 += 2;
            var10 += var19;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class14.field226[var12] = var7;
                var11 -= var12 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg6 + var8;
                int var21 = arg6 - var8;
                if (class271.field4322 <= var20 && var21 <= class311.field5001) {
                    if (var9 > var8) {
                        int var22 = class14.field226[var8];
                        int var23 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 + var7);
                        int var24 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 - var7);
                        int var25 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 + var22);
                        int var26 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 - var22);
                        if (var20 <= class311.field5001) {
                            int[] var27 = class247.field3876[var20];
                            class129.method822(var27, var24, -2426, arg5, var26);
                            class129.method822(var27, var26, -2426, arg4, var25);
                            class129.method822(var27, var25, -2426, arg5, var23);
                        }
                        if (class271.field4322 <= var21) {
                            int[] var28 = class247.field3876[var21];
                            class129.method822(var28, var24, -2426, arg5, var26);
                            class129.method822(var28, var26, -2426, arg4, var25);
                            class129.method822(var28, var25, -2426, arg5, var23);
                        }
                    } else {
                        int var29 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 + var7);
                        int var30 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 - var7);
                        if (var20 <= class311.field5001) {
                            class129.method822(class247.field3876[var20], var30, -2426, arg5, var29);
                        }
                        if (var21 >= class271.field4322) {
                            class129.method822(class247.field3876[var21], var30, arg0 ^ 0x601C, arg5, var29);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (var32 >= class271.field4322 && var31 <= class311.field5001) {
                int var33 = arg1 + var8;
                int var34 = arg1 - var8;
                if (var33 >= class261.field4204 && class18.field310 >= var34) {
                    int var35 = class179.method1146(class261.field4204, class18.field310, (byte) 31, var33);
                    int var36 = class179.method1146(class261.field4204, class18.field310, (byte) 31, var34);
                    if (var9 <= var7) {
                        if (class311.field5001 >= var32) {
                            class129.method822(class247.field3876[var32], var36, -2426, arg5, var35);
                        }
                        if (class271.field4322 <= var31) {
                            class129.method822(class247.field3876[var31], var36, -2426, arg5, var35);
                        }
                    } else {
                        int var37 = var7 <= var12 ? var12 : class14.field226[var7];
                        int var38 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 + var37);
                        int var39 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1 - var37);
                        if (class311.field5001 >= var32) {
                            int[] var40 = class247.field3876[var32];
                            class129.method822(var40, var36, -2426, arg5, var39);
                            class129.method822(var40, var39, -2426, arg4, var38);
                            class129.method822(var40, var38, -2426, arg5, var35);
                        }
                        if (class271.field4322 <= var31) {
                            int[] var41 = class247.field3876[var31];
                            class129.method822(var41, var36, -2426, arg5, var39);
                            class129.method822(var41, var39, -2426, arg4, var38);
                            class129.method822(var41, var38, arg0 ^ 0x601C, arg5, var35);
                        }
                    }
                }
            }
        }
    }
}
