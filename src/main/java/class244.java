import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class244 {

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lvg;")
    private class22 field4002 = new class22();

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    private int field4009;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lsb;")
    private class110 field3998;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4006 = "Drop";

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4012 = "green:";

    @OriginalMember(owner = "client!te", name = "c", descriptor = "B")
    public static byte field3999;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method1692(byte arg0) {
        field4006 = null;
        if (arg0 != -117) {
            field4006 = null;
        }
        field4012 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1693(long arg0, int arg1) {
        if (arg1 < 78) {
            this.method1702(102, 62L);
        }
        field4013++;
        class152 var4 = (class152) this.field3998.method708(arg0, 125);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method898((byte) 86);
        if (var5 == null) {
            var4.method1673(14510);
            var4.method480(99);
            this.field4008++;
            return null;
        }
        if (var4.method899((byte) -125)) {
            class145 var6 = new class145(var5);
            this.field3998.method707(var4.field3923, var6, (byte) 120);
            this.field4002.method125(var6, -1);
            var6.field1087 = 0L;
            var4.method1673(14510);
            var4.method480(65);
        } else {
            this.field4002.method125(var4, -1);
            var4.field1087 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZJLjava/lang/Object;)V")
    public final void method1694(boolean arg0, long arg1, Object arg2) {
        if (!arg0) {
            method1697(56, 15, false, (class144[]) null, -49, -121, -121, -106, (byte[]) null, -52, 100);
        }
        this.method1702(7, arg1);
        if (this.field4008 == 0) {
            class152 var5 = (class152) this.field4002.method126((byte) 101);
            var5.method1673(14510);
            var5.method480(43);
        } else {
            this.field4008--;
        }
        class145 var6 = new class145(arg2);
        field4017++;
        this.field3998.method707(arg1, var6, (byte) 120);
        this.field4002.method125(var6, -1);
        var6.field1087 = 0L;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public final void method1695(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field4001++;
        if (class288.field4596 == null) {
            return;
        }
        for (class152 var3 = (class152) this.field4002.method124(0); var3 != null; var3 = (class152) this.field4002.method122(88)) {
            if (var3.method899((byte) -128)) {
                if (var3.method898((byte) 70) == null) {
                    var3.method1673(arg1 + 14510);
                    var3.method480(122);
                    this.field4008++;
                }
            } else if ((++var3.field1087) > ((long) arg0)) {
                class152 var4 = class288.field4596.method181(var3, -115);
                this.field3998.method707(var3.field3923, var4, (byte) 120);
                class61.method355(19379, var4, var3);
                var3.method1673(14510);
                var3.method480(arg1 + 75);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method1696(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4004++;
        if (arg5 > -101) {
            return;
        }
        if (arg0 == 3) {
            method1696(class67.field855, true, -1, -1, arg4, -107, true);
            return;
        }
        Container var7;
        if (class46.field586 != null) {
            var7 = class46.field586;
        } else if (class41.field517 == null) {
            var7 = class194.field3107.field609;
        } else {
            var7 = class41.field517;
        }
        class137.field2161 = var7.getSize().width;
        class83.field1033 = var7.getSize().height;
        if (class41.field517 == var7) {
            Insets var8 = class41.field517.getInsets();
            class137.field2161 -= var8.left + var8.right;
            class83.field1033 -= var8.top + var8.bottom;
        }
        if (arg0 >= 2) {
            class228.field3647 = 0;
            class283.field4517 = class137.field2161;
            class292.field4640 = class83.field1033;
            class181.field2887 = 0;
        } else {
            class292.field4640 = 503;
            class283.field4517 = 765;
            class181.field2887 = (class137.field2161 - 765) / 2;
            class228.field3647 = 0;
        }
        if (arg6) {
            class285.method1910(class221.field3551, (byte) -101);
            class24.method137(class221.field3551, (byte) 29);
            if (class234.field3875 != null) {
                class234.field3875.method146(class221.field3551, 0);
            }
            class222.field3583.method1893((byte) 39);
            class67.method386(true, class221.field3551);
            class136.method922(false, class221.field3551);
            if (class234.field3875 != null) {
                class234.field3875.method144(class221.field3551, (byte) -22);
            }
        } else {
            class221.field3551.setSize(class283.field4517, class292.field4640);
            if (class41.field517 == var7) {
                Insets var9 = class41.field517.getInsets();
                class221.field3551.setLocation(var9.left + class181.field2887, var9.top - -class228.field3647);
            } else {
                class221.field3551.setLocation(class181.field2887, class228.field3647);
            }
        }
        if (arg0 > 0) {
            method1696(0, true, -1, -1, arg4, -121, true);
            return;
        }
        class54.field687 = !class226.method1599((byte) 108);
        if (class164.field2602 != -1) {
            class138.method961(-62, true);
        }
        if (class28.field400 != null && (class250.field4085 == 30 || class250.field4085 == 25)) {
            class66.method380(26365);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class21.field279[var10] = true;
        }
        class203.field3206 = true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZ[Loj;IIII[BII)[I")
    public static final int[] method1697(int arg0, int arg1, boolean arg2, class144[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field3997++;
        int var11 = (arg5 & 0x7) * arg9;
        byte var12;
        if (arg2) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        int var13 = (arg7 & 0x7) * 8;
        if (!arg2) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class161.method1120(var14 & 0x7, arg1, var15 & 0x7, 7) + arg0;
                    int var17 = class287.method1933(var15 & 0x7, var14 & 0x7, arg9 + 45, arg1) + arg10;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg3[arg6].field2272[var16][var17] = class173.method1186(arg3[arg6].field2272[var16][var17], -2097153);
                    }
                }
            }
        }
        class96 var18 = new class96(arg8);
        int var19 = arg5 & 0x1FFFFFF8 << 3;
        int var20 = arg7 & 0x1FFFFFF8 << 3;
        for (int var21 = 0; var21 < var12; var21++) {
            for (int var42 = 0; var42 < 64; var42++) {
                for (int var43 = 0; var43 < 64; var43++) {
                    if (arg4 != var21 || var42 < var11 || var42 > var11 + 8 || var43 < var13 || var43 > (var13 + 8)) {
                        class192.method1329(-1, 0, 0, 0, 0, arg2, -1, false, false, var18);
                    } else if (var11 + 8 == var42 || (var13 + 8) == var43) {
                        int var50;
                        int var51;
                        if (arg1 == 0) {
                            var51 = var43 + arg10 - var13;
                            var50 = arg0 + var42 - var11;
                        } else if (arg1 == 1) {
                            var50 = var43 + arg0 - var13;
                            var51 = var11 + arg10 + 8 - var42;
                        } else if (arg1 == 2) {
                            var51 = var13 + arg10 + 8 - var43;
                            var50 = arg0 + (var11 - var42) + 8;
                        } else {
                            var50 = -var43 - (-var13 - arg0 - 8);
                            var51 = arg10 + var42 - var11;
                        }
                        class192.method1329(var51, var19 + var42, 0, var20 + var43, arg6, arg2, var50, true, false, var18);
                    } else {
                        int var44 = class161.method1120(var42 & 0x7, arg1, var43 & 0x7, arg9 ^ 0xF) + arg0;
                        int var45 = arg10 + class287.method1933(var43 & 0x7, var42 & 0x7, -107, arg1);
                        class192.method1329(var45, var19 + var42, arg1, var20 + var43, arg6, arg2, var44, false, false, var18);
                        if (var42 == 63 || var43 == 63) {
                            int var46 = var43 == 63 ? 64 : var43;
                            int var47 = var42 == 63 ? 64 : var42;
                            int var48;
                            int var49;
                            if (arg1 == 0) {
                                var48 = arg10 + var46 - var13;
                                var49 = arg0 + var47 - var11;
                            } else if (arg1 == 1) {
                                var48 = arg10 - var47 - (-var11 - 8);
                                var49 = arg0 - (var13 - var46);
                            } else if (arg1 == 2) {
                                var48 = arg10 + 8 - (-var13 + var46);
                                var49 = arg0 + var11 + 8 - var47;
                            } else {
                                var49 = var13 + arg0 + 8 - var46;
                                var48 = var47 + arg10 - var11;
                            }
                            if (var49 >= 0 && var49 < 104 && var48 >= 0 && var48 < 104) {
                                class17.field209[var21][var49][var48] = class17.field209[var21][var44][var45];
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = false;
        boolean var23 = false;
        while (var18.field1228 < var18.field1218.length) {
            int var24 = var18.method584(arg9 ^ 0xF7);
            if (var24 == 128) {
                var22 = true;
                class180.field2867[0] = var18.method549(255);
                class180.field2867[1] = var18.method564(-114);
                class180.field2867[2] = var18.method564(-117);
                class180.field2867[3] = var18.method564(-86);
                class180.field2867[4] = var18.method549(255);
            } else {
                if (var24 != 129) {
                    var18.field1228--;
                    break;
                }
                for (int var29 = 0; var29 < 4; var29++) {
                    byte var30 = var18.method587(107);
                    if (var30 == 0) {
                        if (arg4 >= var29) {
                            int var38 = arg0 + 7;
                            if (var38 < 0) {
                                var38 = 0;
                            } else if (var38 >= 104) {
                                var38 = 104;
                            }
                            int var39 = arg10;
                            if (arg10 < 0) {
                                var39 = 0;
                            } else if (arg10 >= 104) {
                                var39 = 104;
                            }
                            int var40 = arg0;
                            if (arg0 < 0) {
                                var40 = 0;
                            } else if (arg0 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg10 + 7;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 >= 104) {
                                var41 = 104;
                            }
                            while (var38 > var40) {
                                while (var39 < var41) {
                                    class204.field3214[arg6][var40][var39] = 0;
                                    var39++;
                                }
                                var40++;
                            }
                        }
                    } else if (var30 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var18.method587(126);
                                if (var29 <= arg4) {
                                    for (int var34 = var31; var34 < var31 + 4; var34++) {
                                        for (int var35 = var32; var35 < var32 + 4; var35++) {
                                            if (var34 >= var11 && var11 + 8 > var34 && var35 >= var13 && var13 < (var13 + 8)) {
                                                int var36 = class161.method1120(var34 & 0x7, arg1, var35 & 0x7, 7) + arg0;
                                                int var37 = arg10 + class287.method1933(var35 & 0x7, var34 & 0x7, -109, arg1);
                                                if (var36 >= 0 && var36 < 104 && var37 >= 0 && var37 < 104) {
                                                    class204.field3214[arg6][var36][var37] = var33;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!var23) {
            int var25 = arg10 + 7;
            int var26 = arg0 + 7;
            for (int var27 = arg0; var27 < var26; var27++) {
                for (int var28 = arg10; var28 < var25; var28++) {
                    class204.field3214[arg6][var27][var28] = 0;
                }
            }
        }
        if (var22) {
            return class180.field2867;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I")
    public final int method1698(int arg0) {
        int var2 = arg0;
        field4016++;
        for (class152 var3 = (class152) this.field4002.method124(0); var3 != null; var3 = (class152) this.field4002.method122(arg0 + 23)) {
            if (!var3.method899((byte) 1)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public final void method1699(int arg0) {
        this.field4002.method121((byte) -128);
        this.field3998.method711(true);
        field4014++;
        if (arg0 != 0) {
            field3999 = -122;
        }
        this.field4008 = this.field4009;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I)V")
    public class244(int arg0) {
        this.field4008 = arg0;
        this.field4009 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3998 = new class110(var2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[Lwb;)V")
    public static final void method1700(int arg0, int arg1, class123[] arg2) {
        if (arg0 <= 5) {
            field3999 = 83;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class123 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1778 == 0) {
                    if (var4.field1748 != null) {
                        method1700(43, arg1, var4.field1748);
                    }
                    class86 var5 = (class86) class92.field1139.method708((long) var4.field1844, 127);
                    if (var5 != null) {
                        class185.method1294(-79, arg1, var5.field1064);
                    }
                }
                if (arg1 == 0 && var4.field1864 != null) {
                    class156 var6 = new class156();
                    var6.field2516 = var4;
                    var6.field2512 = var4.field1864;
                    class296.method1985(var6, 200000);
                }
                if (arg1 == 1 && var4.field1890 != null) {
                    if (var4.field1829 >= 0) {
                        class123 var7 = class61.method358(var4.field1844, -127);
                        if (var7 == null || var7.field1748 == null || var4.field1829 >= var7.field1748.length || var7.field1748[var4.field1829] != var4) {
                            continue;
                        }
                    }
                    class156 var8 = new class156();
                    var8.field2516 = var4;
                    var8.field2512 = var4.field1890;
                    class296.method1985(var8, 200000);
                }
            }
        }
        field4010++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public final void method1701(byte arg0) {
        field4007++;
        class152 var2 = (class152) this.field4002.method124(0);
        if (arg0 <= 37) {
            field3999 = -61;
        }
        while (var2 != null) {
            if (var2.method899((byte) -127)) {
                var2.method1673(14510);
                var2.method480(59);
                this.field4008++;
            }
            var2 = (class152) this.field4002.method122(44);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)V")
    public final void method1702(int arg0, long arg1) {
        class152 var4 = (class152) this.field3998.method708(arg1, -26);
        if (arg0 != 7) {
            return;
        }
        field4003++;
        if (var4 != null) {
            var4.method1673(arg0 ^ 0x38A9);
            var4.method480(arg0 + 59);
            this.field4008++;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1703(char arg0, boolean arg1) {
        field4000++;
        if (arg1) {
            field4006 = null;
        }
        return arg0 >= '0' && arg0 <= '9';
    }
}
