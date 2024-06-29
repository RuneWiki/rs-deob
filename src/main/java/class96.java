import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class96 extends class50 {

    @OriginalMember(owner = "client!od", name = "yb", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "Lrd;")
    private static class114 field2199 = class84.method656("Loading game screen )2 ", (byte) 117);

    @OriginalMember(owner = "client!od", name = "Ab", descriptor = "Z")
    public static boolean field2208 = false;

    @OriginalMember(owner = "client!od", name = "Bb", descriptor = "Z")
    public static boolean field2209 = false;

    @OriginalMember(owner = "client!od", name = "Db", descriptor = "Lrd;")
    public static class114 field2211 = field2199;

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!od", name = "ub", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!od", name = "vb", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!od", name = "wb", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!od", name = "xb", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!od", name = "zb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!od", name = "Cb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!od", name = "Eb", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!od", name = "Fb", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!od", name = "Gb", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "Ljd;")
    public static class66 field2200;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILpb;I)Lgb;")
    public static final class45 method731(int arg0, int arg1, class100 arg2, int arg3) {
        field2212++;
        if (arg0 != -104) {
            method736(-30, -93, -6, 52, -52, 82, 76, -21);
        }
        return class122.method955(arg1, (byte) -122, arg3, arg2) ? class16.method122(-22) : null;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public static final void method732(int arg0) {
        field2203++;
        try {
            if (arg0 <= 13) {
                field2208 = true;
            }
            Graphics var1 = class114.field2678.getGraphics();
            class118.field2773.method526(0, 550, 4, var1);
        } catch (Exception var2) {
            class114.field2678.repaint();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILkb;)V")
    public static final void method733(int arg0, class70 arg1) {
        if (arg0 == 1) {
            field2210++;
            class12.field281 = arg1;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(Z)V")
    public static void method734(boolean arg0) {
        field2211 = null;
        field2200 = null;
        field2199 = null;
        if (!arg0) {
            field2200 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public static final void method735(byte arg0) {
        field2201++;
        if (!class125.field2975) {
            return;
        }
        class90 var1 = class92.method719((byte) -61, class137.field3305, class77.field1758);
        if (var1 != null && var1.field2093 != null) {
            class80.method636(var1.field2093, 0, 0, 0, 37, null, var1);
        }
        if (arg0 != -124) {
            field2199 = null;
        }
        class125.field2975 = false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2202++;
        if (arg6 != 0) {
            method731(-96, -31, null, -90);
        }
        if (arg2 < 1 || arg7 < 1 || arg2 > 102 || arg7 > 102) {
            return;
        }
        if (class64.field1370 && class20.field346 != arg5) {
            return;
        }
        boolean var8 = true;
        int var9 = 0;
        boolean var10 = false;
        boolean var11 = false;
        if (arg0 == 0) {
            var9 = class101.field2325.method1034(arg5, arg2, arg7);
        }
        if (arg0 == 1) {
            var9 = class101.field2325.method1001(arg5, arg2, arg7);
        }
        if (arg0 == 2) {
            var9 = class101.field2325.method1028(arg5, arg2, arg7);
        }
        if (arg0 == 3) {
            var9 = class101.field2325.method1035(arg5, arg2, arg7);
        }
        if (var9 != 0) {
            int var12 = var9 >> 14 & 0x7FFF;
            int var13 = class101.field2325.method1009(arg5, arg2, arg7, var9);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg0 == 0) {
                class101.field2325.method1007(arg5, arg2, arg7);
                class12 var16 = class130.method1048(-105, var12);
                if (var16.field214) {
                    class90.field2132[arg5].method676(var15, var14, var16.field252, (byte) 111, arg7, arg2);
                }
            }
            if (arg0 == 1) {
                class101.field2325.method1024(arg5, arg2, arg7);
            }
            if (arg0 == 2) {
                class101.field2325.method1005(arg5, arg2, arg7);
                class12 var17 = class130.method1048(arg6 ^ 0xFFFFFF94, var12);
                if (var17.field277 + arg2 > 103 || var17.field277 + arg7 > 103 || arg2 + var17.field261 > 103 || arg7 + var17.field261 > 103) {
                    return;
                }
                if (var17.field214) {
                    class90.field2132[arg5].method672(var17.field261, 0, var17.field252, var15, arg7, var17.field277, arg2);
                }
            }
            if (arg0 == 3) {
                class101.field2325.method1018(arg5, arg2, arg7);
                class12 var18 = class130.method1048(-114, var12);
                if (var18.field214 && var18.field244 == 1) {
                    class90.field2132[arg5].method681(-4877, arg2, arg7);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg5;
        if (arg5 < 3 && (class22.field430[1][arg2][arg7] & 0x2) == 2) {
            var19 = arg5 + 1;
        }
        class141.method1131(arg7, class90.field2132[arg5], arg1, arg4, arg3, arg2, arg5, -57, var19, class101.field2325);
        return;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)Lue;")
    public final class133 method67(byte arg0) {
        if (arg0 > -9) {
            field2211 = null;
        }
        field2204++;
        return class128.method988(this.field2205, false).method375(this.field2214, -93);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public static int method737(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
