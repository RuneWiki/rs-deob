import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class252 {

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Z")
    public static boolean field3939 = false;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lnh;")
    public static class305 field3940;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[[B")
    public static byte[][] field3945;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Llh;III)V")
    public static final void method1634(class58 arg0, int arg1, int arg2, int arg3) {
        class116.field1675.method365((byte) -43);
        field3935++;
        if (class38.field582) {
            return;
        }
        if (arg1 != 1) {
            method1645(-64, -40, -95, 12, 88, -22, 86);
        }
        for (class238 var4 = (class238) arg0.method369((byte) -86); var4 != null; var4 = (class238) arg0.method362(false)) {
            class149 var5 = class121.method784(-74, var4.field3688);
            if (class218.method1427(-1, var5)) {
                class153.method960((byte) 103, var5, arg3, arg2, var4);
                if (var4.field3684) {
                    class235.method1545(arg1 ^ 0xFFFFCD2D, var5, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnh;Z)V")
    public static final void method1635(class305 arg0, boolean arg1) {
        field3930++;
        if (arg1) {
            field3940 = null;
        }
        class15.field283 = arg0;
        class232.field3623 = class15.field283.method2067(16, (byte) 51);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
    public final boolean method1636(byte arg0) {
        field3947++;
        if (arg0 < 61) {
            this.field3941 = -6;
        }
        return (this.field3941 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    public final boolean method1637(int arg0) {
        field3936++;
        int var2 = 32 / ((25 - arg0) / 49);
        return (this.field3941 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method1638(int arg0) {
        field3942++;
        class20.field327.method948((byte) 58);
        if (arg0 != -28129) {
            method1634((class58) null, 126, 60, -49);
        }
        class70.field1020.method948((byte) 58);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    public static final void method1639(boolean arg0, int arg1) {
        field3937++;
        byte var2 = 4;
        byte[][] var3 = class110.field1583;
        if (arg1 != -2872) {
            return;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class8.method45(4087);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class45.field665[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x335273D) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFD) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class213.field3218.length; var13++) {
                                if (class213.field3218[var13] == var12 && var3[var13] != null) {
                                    class231.method1519(var8, class156.field2153, arg0, (var11 & 0x7) * 8, var9, 7, var5 * 8, var4, var6 * 8, (var10 & 0x7) * 8, var3[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method1640(int arg0) {
        if (arg0 == 0) {
            field3940 = null;
            field3945 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)Z")
    public final boolean method1641(int arg0) {
        field3933++;
        if (arg0 > -25) {
            method1638(-39);
        }
        return (this.field3941 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public static final void method1642(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class150.field2077; var3++) {
            for (int var4 = 0; var4 < class207.field3086; var4++) {
                for (int var5 = 0; var5 < class265.field4271; var5++) {
                    class91 var6 = class246.field3856[var3][var4][var5];
                    if (var6 != null) {
                        class180 var7 = var6.field1334;
                        if (var7 != null && var7.field2735.method1013()) {
                            class63.method391(var7.field2735, var3, var4, var5, 1, 1);
                            if (var7.field2729 != null && var7.field2729.method1013()) {
                                class63.method391(var7.field2729, var3, var4, var5, 1, 1);
                                var7.field2735.method1029(var7.field2729, 0, 0, 0, false);
                                var7.field2729 = var7.field2729.method1019(arg0, arg1, arg2);
                            }
                            var7.field2735 = var7.field2735.method1019(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1343; var8++) {
                            class160 var10 = var6.field1339[var8];
                            if (var10 != null && var10.field2230.method1013()) {
                                class63.method391(var10.field2230, var3, var4, var5, var10.field2224 + 1 - var10.field2234, var10.field2228 - var10.field2229 + 1);
                                var10.field2230 = var10.field2230.method1019(arg0, arg1, arg2);
                            }
                        }
                        class308 var9 = var6.field1323;
                        if (var9 != null && var9.field4953.method1013()) {
                            class128.method818(var9.field4953, var3, var4, var5);
                            var9.field4953 = var9.field4953.method1019(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)Z")
    public final boolean method1643(int arg0) {
        field3934++;
        if (arg0 == 0) {
            return (this.field3941 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIZII)I")
    public static final int method1644(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg5;
            arg5 = var7;
        }
        field3938++;
        int var8 = arg6 & 0x3;
        if (!arg4) {
            return 78;
        } else if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 - arg1 - (arg0 + -1);
        } else {
            return 7 + 1 - arg3 - arg5;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3943++;
        int var7 = -33 / ((arg0 - 48) / 38);
        int var8 = arg1 - arg4;
        int var9 = arg3 + arg4;
        int var10 = arg4 + arg6;
        int var11 = arg2 - arg4;
        for (int var12 = arg3; var12 < var9; var12++) {
            class129.method822(class247.field3876[var12], arg6, -2426, arg5, arg2);
        }
        for (int var13 = arg1; var13 > var8; var13--) {
            class129.method822(class247.field3876[var13], arg6, -2426, arg5, arg2);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class247.field3876[var14];
            class129.method822(var15, arg6, -2426, arg5, var10);
            class129.method822(var15, var11, -2426, arg5, arg2);
        }
    }
}
