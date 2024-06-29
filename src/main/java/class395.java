import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class395 {

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "Z")
    public boolean field5218 = true;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
    public static int[] field5215 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lcea;")
    public static class180 field5213 = new class180("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Lrg;")
    public static class548 field5222 = new class548(8, -1);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "J")
    public static long field5223 = 0L;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "C")
    private char field5220;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "Ljava/lang/String;")
    public String field5217;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5209++;
        class639.method3664(arg4, 128);
        int var7 = 0;
        int var8 = arg4 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -90 % ((-arg3 - 45) / 61);
        int var10 = arg4;
        int var11 = -arg4;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        if (arg0 >= class563.field8282 && class271.field3513 >= arg0) {
            int[] var16 = class328.field4287[arg0];
            int var17 = class536.method3056(class592.field8588, 118, arg6 - arg4, class470.field6589);
            int var18 = class536.method3056(class592.field8588, 126, arg4 + arg6, class470.field6589);
            int var19 = class536.method3056(class592.field8588, 117, arg6 - var8, class470.field6589);
            int var20 = class536.method3056(class592.field8588, 120, arg6 + var8, class470.field6589);
            class62.method363(var19, -128, arg1, var16, var17);
            class62.method363(var20, -127, arg5, var16, var19);
            class62.method363(var18, -128, arg1, var16, var20);
        }
        while (var10 > var7) {
            var14 += 2;
            var15 += 2;
            var11 += var14;
            var13 += var15;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                class466.field6526[var12] = var7;
                var13 -= var12 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var10--;
                var11 -= var10 << 1;
                int var21 = arg0 - var10;
                int var22 = arg0 + var10;
                if (class563.field8282 <= var22 && var21 <= class271.field3513) {
                    if (var8 <= var10) {
                        int var23 = class536.method3056(class592.field8588, 116, arg6 + var7, class470.field6589);
                        int var24 = class536.method3056(class592.field8588, 122, arg6 - var7, class470.field6589);
                        if (var22 <= class271.field3513) {
                            class62.method363(var23, -128, arg1, class328.field4287[var22], var24);
                        }
                        if (var21 >= class563.field8282) {
                            class62.method363(var23, -128, arg1, class328.field4287[var21], var24);
                        }
                    } else {
                        int var25 = class466.field6526[var10];
                        int var26 = class536.method3056(class592.field8588, 122, arg6 + var7, class470.field6589);
                        int var27 = class536.method3056(class592.field8588, 116, arg6 - var7, class470.field6589);
                        int var28 = class536.method3056(class592.field8588, 127, arg6 + var25, class470.field6589);
                        int var29 = class536.method3056(class592.field8588, 120, arg6 - var25, class470.field6589);
                        if (var22 <= class271.field3513) {
                            int[] var30 = class328.field4287[var22];
                            class62.method363(var29, -128, arg1, var30, var27);
                            class62.method363(var28, -128, arg5, var30, var29);
                            class62.method363(var26, -128, arg1, var30, var28);
                        }
                        if (class563.field8282 <= var21) {
                            int[] var31 = class328.field4287[var21];
                            class62.method363(var29, -128, arg1, var31, var27);
                            class62.method363(var28, -128, arg5, var31, var29);
                            class62.method363(var26, -127, arg1, var31, var28);
                        }
                    }
                }
            }
            int var32 = arg0 - var7;
            int var33 = arg0 + var7;
            if (var33 >= class563.field8282 && var32 <= class271.field3513) {
                int var34 = arg6 + var10;
                int var35 = arg6 - var10;
                if (class470.field6589 <= var34 && var35 <= class592.field8588) {
                    int var36 = class536.method3056(class592.field8588, 125, var34, class470.field6589);
                    int var37 = class536.method3056(class592.field8588, 123, var35, class470.field6589);
                    if (var8 <= var7) {
                        if (class271.field3513 >= var33) {
                            class62.method363(var36, -127, arg1, class328.field4287[var33], var37);
                        }
                        if (var32 >= class563.field8282) {
                            class62.method363(var36, -128, arg1, class328.field4287[var32], var37);
                        }
                    } else {
                        int var38 = var12 >= var7 ? var12 : class466.field6526[var7];
                        int var39 = class536.method3056(class592.field8588, 126, arg6 + var38, class470.field6589);
                        int var40 = class536.method3056(class592.field8588, 114, arg6 - var38, class470.field6589);
                        if (class271.field3513 >= var33) {
                            int[] var41 = class328.field4287[var33];
                            class62.method363(var40, -127, arg1, var41, var37);
                            class62.method363(var39, -127, arg5, var41, var40);
                            class62.method363(var36, -127, arg1, var41, var39);
                        }
                        if (class563.field8282 <= var32) {
                            int[] var42 = class328.field4287[var32];
                            class62.method363(var40, -128, arg1, var42, var37);
                            class62.method363(var39, -127, arg5, var42, var40);
                            class62.method363(var36, -127, arg1, var42, var39);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z", line = 200)
    public final boolean method2273(byte arg0) {
        if (arg0 != 43) {
            field5223 = -33L;
        }
        field5212++;
        return this.field5220 == 's';
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIIIII)V", line = 211)
    public static final void method2274(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5219++;
        int var6 = class536.method3056(class271.field3513, 114, arg4, class563.field8282);
        int var7 = class536.method3056(class271.field3513, 123, arg3, class563.field8282);
        int var8 = -113 % ((arg0 + 61) / 60);
        int var9 = class536.method3056(class592.field8588, 126, arg1, class470.field6589);
        int var10 = class536.method3056(class592.field8588, 117, arg2, class470.field6589);
        for (int var11 = var6; var11 <= var7; var11++) {
            class62.method363(var10, -127, arg5, class328.field4287[var11], var9);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ldn;IIIZII)V", line = 237)
    public static final void method2275(class438 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class503.field6979 = arg1;
        class121.field1518 = arg4;
        class578.field8436 = 1;
        field5214++;
        class175.field2117 = arg6;
        class527.field7382 = arg0;
        if (arg3 > -37) {
            method2274((byte) -116, 32, 17, 7, 95, -89);
        }
        class79.field923 = arg5;
        class442.field6104 = class390.field5159.method1534(64) / arg2;
        if (class442.field6104 < 1) {
            class442.field6104 = 1;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILos;)V", line = 262)
    public final void method2276(int arg0, class374 arg1) {
        field5216++;
        while (true) {
            int var3 = arg1.method2129(arg0 - 17378);
            if (var3 == 0) {
                if (arg0 == 17279) {
                    return;
                } else {
                    field5221 = -47;
                    return;
                }
            }
            this.method2277(115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILos;I)V", line = 283)
    private final void method2277(int arg0, class374 arg1, int arg2) {
        field5210++;
        if (arg2 == 1) {
            this.field5220 = class67.method376((byte) -117, arg1.method2124(-124));
        } else if (arg2 == 2) {
            this.field5211 = arg1.method2123(false);
        } else if (arg2 == 4) {
            this.field5218 = false;
        } else if (arg2 == 5) {
            this.field5217 = arg1.method2133(false);
        }
        if (arg0 != 115) {
            this.method2273((byte) -52);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 314)
    public static void method2278(byte arg0) {
        field5222 = null;
        field5215 = null;
        if (arg0 < 30) {
            method2278((byte) 66);
        }
        field5213 = null;
    }
}
