import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class145 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field2597 = 0;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    private int field2614 = -1;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lpk;")
    private class98 field2595 = new class98();

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Z")
    public boolean field2616 = false;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    private int field2603;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[[[I")
    private int[][][] field2592;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[Lcb;")
    private class231[] field2612;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Leb;")
    public static class230 field2596 = class68.method589(0, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Leb;")
    private static class230 field2610 = class68.method589(0, "");

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Leb;")
    public static class230 field2598 = field2610;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Leb;")
    public static class230 field2606 = class68.method589(0, "(Y");

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Leb;")
    public static class230 field2613 = class68.method589(0, ")2");

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[J")
    public static long[] field2599 = new long[500];

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[J")
    public static long[] field2607 = new long[100];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lug;")
    public static class193 field2605;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lkk;")
    public static class223 field2594;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public static int[] field2601;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILfk;)V")
    public static final void method1102(int arg0, class14 arg1) {
        field2591++;
        if (class53.field922 != null) {
            try {
                class53.field922.method69(0L, -1);
                class53.field922.method75(24, 25733, arg1.field269, arg1.field318);
            } catch (Exception var2) {
            }
        }
        if (arg0 != 0) {
            field2598 = null;
        }
        arg1.field318 += 24;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1103(int arg0) {
        field2609++;
        if (this.field2603 != this.field2602) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field2603; var2++) {
            this.field2612[var2] = class232.field4031;
        }
        return this.field2592;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lka;B)Z")
    public static final boolean method1104(class245 arg0, byte arg1) {
        field2608++;
        if (arg0.field4352 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 123) {
            method1105(5, 82, -115, -84, -78, 31, true, 61);
        }
        while (var2 < arg0.field4352.length) {
            int var3 = class123.method958(arg0, var2, arg1 - 55);
            int var4 = arg0.field4359[var2];
            if (arg0.field4352[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field4352[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field4352[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2600++;
        if (!arg6) {
            field2607 = null;
        }
        if (class78.field1404 <= arg7 && class42.field769 >= arg3 && arg1 >= class15.field345 && class259.field4587 >= arg4) {
            class262.method1823(arg7, arg3, arg2, arg6, arg5, arg4, arg1, arg0);
        } else {
            class184.method1320(arg4, arg0, arg2, arg5, arg3, arg7, arg1, -11);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
    public final int[][] method1106(int arg0, int arg1) {
        field2604++;
        if (arg1 != -7034) {
            return null;
        } else if (this.field2603 == this.field2602) {
            this.field2616 = this.field2612[arg0] == null;
            this.field2612[arg0] = class232.field4031;
            return this.field2592[arg0];
        } else if (this.field2603 == 1) {
            this.field2616 = this.field2614 != arg0;
            this.field2614 = arg0;
            return this.field2592[0];
        } else {
            class231 var3 = this.field2612[arg0];
            if (var3 == null) {
                this.field2616 = true;
                if (this.field2603 > this.field2597) {
                    var3 = new class231(arg0, this.field2597);
                    this.field2597++;
                } else {
                    class231 var4 = (class231) this.field2595.method832(false);
                    var3 = new class231(arg0, var4.field4015);
                    this.field2612[var4.field4022] = null;
                    var4.method518(121);
                }
                this.field2612[arg0] = var3;
            } else {
                this.field2616 = false;
            }
            this.field2595.method833(-1, var3);
            return this.field2592[var3.field4015];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2593++;
        class163.method1223(arg1, 69);
        int var7 = arg1 - arg5;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = arg1;
        int var10 = -arg1;
        if (arg4) {
            method1107(48, -115, 51, -89, false, -86, 8);
        }
        int var11 = var7;
        int var12 = -var7;
        if (class15.field345 <= arg3 && arg3 <= class259.field4587) {
            int[] var13 = class66.field1254[arg3];
            int var14 = class106.method882(class78.field1404, 1, class42.field769, arg6 - arg1);
            int var15 = class106.method882(class78.field1404, 1, class42.field769, arg1 + arg6);
            int var16 = class106.method882(class78.field1404, 1, class42.field769, arg6 - var7);
            int var17 = class106.method882(class78.field1404, 1, class42.field769, arg6 + var7);
            class182.method1311(arg2, var16, !arg4, var13, var14);
            class182.method1311(arg0, var17, !arg4, var13, var16);
            class182.method1311(arg2, var15, true, var13, var17);
        }
        int var18 = -1;
        int var19 = -1;
        while (var9 > var8) {
            var18 += 2;
            var12 += var18;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class36.field677[var11] = var8;
                var12 -= var11 << 1;
            }
            var19 += 2;
            var8++;
            var10 += var19;
            if (var10 >= 0) {
                var9--;
                int var20 = arg3 + var9;
                var10 -= var9 << 1;
                int var21 = arg3 - var9;
                if (var20 >= class15.field345 && var21 <= class259.field4587) {
                    if (var7 <= var9) {
                        int var22 = class106.method882(class78.field1404, 1, class42.field769, arg6 + var8);
                        int var23 = class106.method882(class78.field1404, 1, class42.field769, arg6 - var8);
                        if (class259.field4587 >= var20) {
                            class182.method1311(arg2, var22, true, class66.field1254[var20], var23);
                        }
                        if (var21 >= class15.field345) {
                            class182.method1311(arg2, var22, true, class66.field1254[var21], var23);
                        }
                    } else {
                        int var24 = class36.field677[var9];
                        int var25 = class106.method882(class78.field1404, 1, class42.field769, arg6 + var8);
                        int var26 = class106.method882(class78.field1404, 1, class42.field769, arg6 - var8);
                        int var27 = class106.method882(class78.field1404, 1, class42.field769, arg6 + var24);
                        int var28 = class106.method882(class78.field1404, 1, class42.field769, arg6 - var24);
                        if (var20 <= class259.field4587) {
                            int[] var29 = class66.field1254[var20];
                            class182.method1311(arg2, var28, true, var29, var26);
                            class182.method1311(arg0, var27, true, var29, var28);
                            class182.method1311(arg2, var25, true, var29, var27);
                        }
                        if (var21 >= class15.field345) {
                            int[] var30 = class66.field1254[var21];
                            class182.method1311(arg2, var28, true, var30, var26);
                            class182.method1311(arg0, var27, true, var30, var28);
                            class182.method1311(arg2, var25, true, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg3 + var8;
            int var32 = arg3 - var8;
            if (class15.field345 <= var31 && var32 <= class259.field4587) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class78.field1404 && class42.field769 >= var34) {
                    int var35 = class106.method882(class78.field1404, 1, class42.field769, var33);
                    int var36 = class106.method882(class78.field1404, 1, class42.field769, var34);
                    if (var8 >= var7) {
                        if (var31 <= class259.field4587) {
                            class182.method1311(arg2, var35, true, class66.field1254[var31], var36);
                        }
                        if (class15.field345 <= var32) {
                            class182.method1311(arg2, var35, true, class66.field1254[var32], var36);
                        }
                    } else {
                        int var37 = var8 <= var11 ? var11 : class36.field677[var8];
                        int var38 = class106.method882(class78.field1404, 1, class42.field769, arg6 + var37);
                        int var39 = class106.method882(class78.field1404, 1, class42.field769, arg6 - var37);
                        if (class259.field4587 >= var31) {
                            int[] var40 = class66.field1254[var31];
                            class182.method1311(arg2, var39, true, var40, var36);
                            class182.method1311(arg0, var38, true, var40, var39);
                            class182.method1311(arg2, var35, true, var40, var38);
                        }
                        if (class15.field345 <= var32) {
                            int[] var41 = class66.field1254[var32];
                            class182.method1311(arg2, var39, true, var41, var36);
                            class182.method1311(arg0, var38, true, var41, var39);
                            class182.method1311(arg2, var35, true, var41, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILhj;Lhj;IIIIJ)V")
    public static final void method1108(int arg0, int arg1, int arg2, int arg3, class70 arg4, class70 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class265 var12 = new class265();
        var12.field4720 = arg10;
        var12.field4704 = arg1 * 128 + 64;
        var12.field4714 = arg2 * 128 + 64;
        var12.field4703 = arg3;
        var12.field4718 = arg4;
        var12.field4719 = arg5;
        var12.field4716 = arg6;
        var12.field4715 = arg7;
        var12.field4710 = arg8;
        var12.field4707 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class53.field916[var13][arg1][arg2] == null) {
                class53.field916[var13][arg1][arg2] = new class233(var13, arg1, arg2);
            }
        }
        class53.field916[arg0][arg1][arg2].field4065 = var12;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method1109(byte arg0) {
        field2598 = null;
        field2599 = null;
        if (arg0 != -6) {
            return;
        }
        field2613 = null;
        field2605 = null;
        field2610 = null;
        field2596 = null;
        field2601 = null;
        field2606 = null;
        field2594 = null;
        field2607 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public final void method1110(byte arg0) {
        for (int var2 = 0; var2 < this.field2603; var2++) {
            this.field2592[var2][0] = null;
            this.field2592[var2][1] = null;
            this.field2592[var2][2] = null;
            this.field2592[var2] = null;
        }
        this.field2612 = null;
        field2615++;
        if (arg0 > -80) {
            this.method1110((byte) -13);
        }
        this.field2592 = null;
        this.field2595.method837(-26215);
        this.field2595 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V")
    public class145(int arg0, int arg1, int arg2) {
        this.field2602 = arg1;
        this.field2603 = arg0;
        this.field2592 = new int[this.field2603][3][arg2];
        this.field2612 = new class231[this.field2602];
    }
}
