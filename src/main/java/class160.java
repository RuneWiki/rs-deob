import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class160 extends class142 {

    @OriginalMember(owner = "client!ej", name = "ob", descriptor = "Ljf;")
    private static class229 field2711 = class212.method1457((byte) 117, "Loaded textures");

    @OriginalMember(owner = "client!ej", name = "vb", descriptor = "Ljf;")
    public static class229 field2718 = field2711;

    @OriginalMember(owner = "client!ej", name = "qb", descriptor = "I")
    public static int field2713 = 0;

    @OriginalMember(owner = "client!ej", name = "tb", descriptor = "F")
    public static float field2716;

    @OriginalMember(owner = "client!ej", name = "mb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ej", name = "rb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ej", name = "sb", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ej", name = "wb", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ej", name = "nb", descriptor = "Lek;")
    public static class185 field2710;

    @OriginalMember(owner = "client!ej", name = "xb", descriptor = "Lea;")
    public static class205 field2720;

    @OriginalMember(owner = "client!ej", name = "ub", descriptor = "[I")
    public static int[] field2717;

    @OriginalMember(owner = "client!ej", name = "pb", descriptor = "[[Z")
    public static boolean[][] field2712;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V", line = 14)
    public static final void method1077(int arg0) {
        field2709++;
        if (class244.field4353 != null) {
            class244.field4353.method388(-4213);
        }
        if (class180.field3124 != null) {
            class180.field3124.method388(-4213);
        }
        class223.method1534(2, 22050, (byte) 94, class15.field218);
        class244.field4353 = class258.method1838(class299.field5100, 22050, 0, class215.field3689, -1929);
        class244.field4353.method392(class146.field2545, 0);
        class180.field3124 = class258.method1838(class299.field5100, 2048, 1, class215.field3689, -1929);
        class180.field3124.method392(class104.field1816, 0);
        if (arg0 < 11) {
            method1079((class185) null, (class185) null, -70);
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)V", line = 49)
    public static void method1078(byte arg0) {
        field2718 = null;
        field2711 = null;
        field2720 = null;
        field2717 = null;
        field2712 = (boolean[][]) null;
        int var1 = 38 / ((23 - arg0) / 39);
        field2710 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lek;Lek;I)V", line = 63)
    public static final void method1079(class185 arg0, class185 arg1, int arg2) {
        if (arg2 != -1) {
            method1080((byte) 26, (class112) null);
        }
        field2714++;
        class34.field650 = arg0;
        class242.field4272 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[[I", line = 81)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = -12 / ((18 - arg0) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689 && this.method990(0)) {
            int[] var5 = var4[0];
            int var6 = arg1 % this.field2463 * this.field2463;
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            for (int var9 = 0; var9 < class22.field393; var9++) {
                int var10 = this.field2474[var9 % this.field2469 + var6];
                var7[var9] = class305.method2086(var10 << 4, 4080);
                var8[var9] = class305.method2086(4080, var10 >> 4);
                var5[var9] = class305.method2086(4080, var10 >> 12);
            }
        }
        field2719++;
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLpk;)V", line = 144)
    public static final void method1080(byte arg0, class112 arg1) {
        field2715++;
        arg1.field2034 = false;
        if (arg1.field2025 != -1) {
            class194 var2 = class280.method1965(arg1.field2025, 26);
            if (var2 == null || var2.field3366 == null) {
                arg1.field2025 = -1;
            } else {
                arg1.field2010++;
                if (var2.field3366.length > arg1.field1971 && arg1.field2010 > var2.field3384[arg1.field1971]) {
                    arg1.field2010 = 1;
                    arg1.field1971++;
                    class305.method2083(var2, arg1.field2028, class301.field5124 == arg1, arg1.field1983, arg1.field1971, -64);
                }
                if (var2.field3366.length <= arg1.field1971) {
                    arg1.field1971 = 0;
                    arg1.field2010 = 0;
                    class305.method2083(var2, arg1.field2028, class301.field5124 == arg1, arg1.field1983, arg1.field1971, -64);
                }
            }
        }
        if (arg1.field1999 != -1 && arg1.field2012 <= class199.field3475) {
            int var3 = class66.method492(8, arg1.field1999).field3829;
            if (var3 == -1) {
                arg1.field1999 = -1;
            } else {
                class194 var4 = class280.method1965(var3, 13);
                if (var4 == null || var4.field3366 == null) {
                    arg1.field1999 = -1;
                } else {
                    if (arg1.field1968 < 0) {
                        arg1.field1968 = 0;
                        class305.method2083(var4, arg1.field2028, class301.field5124 == arg1, arg1.field1983, 0, -64);
                    }
                    arg1.field2014++;
                    if (var4.field3366.length > arg1.field1968 && var4.field3384[arg1.field1968] < arg1.field2014) {
                        arg1.field2014 = 1;
                        arg1.field1968++;
                        class305.method2083(var4, arg1.field2028, class301.field5124 == arg1, arg1.field1983, arg1.field1968, -64);
                    }
                    if (arg1.field1968 >= var4.field3366.length) {
                        arg1.field1999 = -1;
                    }
                }
            }
        }
        if (arg1.field2000 != -1 && arg1.field2016 <= 1) {
            class194 var5 = class280.method1965(arg1.field2000, -109);
            if (var5.field3359 == 1 && arg1.field1985 > 0 && class199.field3475 >= arg1.field1998 && arg1.field1982 < class199.field3475) {
                arg1.field2016 = 1;
                return;
            }
        }
        if (arg1.field2000 != -1 && arg1.field2016 == 0) {
            class194 var6 = class280.method1965(arg1.field2000, -63);
            if (var6 == null || var6.field3366 == null) {
                arg1.field2000 = -1;
            } else {
                arg1.field2033++;
                if (var6.field3366.length > arg1.field1990 && var6.field3384[arg1.field1990] < arg1.field2033) {
                    arg1.field1990++;
                    arg1.field2033 = 1;
                    class305.method2083(var6, arg1.field2028, class301.field5124 == arg1, arg1.field1983, arg1.field1990, -64);
                }
                if (var6.field3366.length <= arg1.field1990) {
                    arg1.field1993++;
                    arg1.field1990 -= var6.field3378;
                    if (arg1.field1993 >= var6.field3364) {
                        arg1.field2000 = -1;
                    } else if (arg1.field1990 >= 0 && arg1.field1990 < var6.field3366.length) {
                        class305.method2083(var6, arg1.field2028, class301.field5124 == arg1, arg1.field1983, arg1.field1990, -64);
                    } else {
                        arg1.field2000 = -1;
                    }
                }
                arg1.field2034 = var6.field3382;
            }
        }
        if (arg0 <= 4) {
            method1077(14);
        }
        if (arg1.field2016 > 0) {
            arg1.field2016--;
        }
    }
}
