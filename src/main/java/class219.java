import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class219 extends class170 {

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    private int field3855 = -1;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "Lmh;")
    public static class128 field3851 = class22.method156(123, "gr-Un:");

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "[Lqf;")
    public static class140[] field3862 = new class140[0];

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "[I")
    private int[] field3860;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "[[I")
    public static int[][] field3850;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 25)
    public static void method1512(int arg0) {
        if (arg0 < -57) {
            field3851 = null;
            field3862 = null;
            field3850 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V", line = 47)
    public static final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3853++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class7.method59(class43.field875, arg0 + arg2, class193.field3335, 0);
        int var10 = class7.method59(class43.field875, arg0 - arg2, class193.field3335, arg4);
        class314.method2138(var9, true, arg3, field3850[arg1], var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (class70.field1315 <= var12 && class181.field3173 >= var11) {
                    int var13 = class7.method59(class43.field875, arg0 + var5, class193.field3335, 0);
                    int var14 = class7.method59(class43.field875, arg0 - var5, class193.field3335, 0);
                    if (class181.field3173 >= var12) {
                        class314.method2138(var13, true, arg3, field3850[var12], var14);
                    }
                    if (var11 >= class70.field1315) {
                        class314.method2138(var13, true, arg3, field3850[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class70.field1315 <= var16 && var15 <= class181.field3173) {
                int var17 = class7.method59(class43.field875, arg0 + var6, class193.field3335, 0);
                int var18 = class7.method59(class43.field875, arg0 - var6, class193.field3335, 0);
                if (var16 <= class181.field3173) {
                    class314.method2138(var17, true, arg3, field3850[var16], var18);
                }
                if (class70.field1315 <= var15) {
                    class314.method2138(var17, true, arg3, field3850[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I", line = 117)
    public final int method1140(byte arg0) {
        field3856++;
        return arg0 == -32 ? this.field3855 : 89;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 310)
    public class219() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIIII)V", line = 135)
    public static final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= arg1) {
            class314.method2138(arg1, true, arg3, field3850[arg2], arg4);
        } else {
            class314.method2138(arg4, true, arg3, field3850[arg2], arg1);
        }
        if (arg0 != -1898732287) {
            method1514(65, 34, -66, 94, -60);
        }
        field3849++;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)Z", line = 162)
    private final boolean method1515(boolean arg0) {
        field3857++;
        if (!arg0) {
            this.method1140((byte) 121);
        }
        if (this.field3860 != null) {
            return true;
        } else if (this.field3855 < 0) {
            return false;
        } else {
            int var2 = class185.field3225;
            int var3 = class12.field390;
            int var4 = class309.field5248.method98(0, this.field3855) ? 64 : 128;
            this.field3860 = class309.field5248.method106(this.field3855, 3578);
            this.field3858 = var4;
            this.field3861 = var4;
            class158.method1044(var2, (byte) 121, var3);
            return this.field3860 != null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILjm;Ljm;IIIIJ)V", line = 191)
    public static final void method1516(int arg0, int arg1, int arg2, int arg3, class226 arg4, class226 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class161 var12 = new class161();
        var12.field2762 = arg10;
        var12.field2749 = arg1 * 128 + 64;
        var12.field2741 = arg2 * 128 + 64;
        var12.field2763 = arg3;
        var12.field2761 = arg4;
        var12.field2764 = arg5;
        var12.field2755 = arg6;
        var12.field2744 = arg7;
        var12.field2746 = arg8;
        var12.field2758 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class182.field3184[var13][arg1][arg2] == null) {
                class182.field3184[var13][arg1][arg2] = new class150(var13, arg1, arg2);
            }
        }
        class182.field3184[arg0][arg1][arg2].field2565 = var12;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Lre;", line = 220)
    public static final class266 method1517(int arg0, int arg1) {
        field3869++;
        class266 var2 = (class266) class205.field3611.method1443((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class311.field5266.method2155(0, arg0, (byte) 70);
        if (var3 == null) {
            return null;
        }
        class266 var4 = new class266();
        class194 var5 = new class194(var3);
        var5.field3380 = var5.field3417.length - 2;
        int var6 = var5.method1308(arg1 - 63);
        int var7 = var5.field3417.length - var6 - 12 - 2;
        var5.field3380 = var7;
        int var8 = var5.method1350(false);
        var4.field4619 = var5.method1308(-128);
        var4.field4614 = var5.method1308(-69);
        var4.field4604 = var5.method1308(-92);
        var4.field4622 = var5.method1308(-81);
        int var9 = var5.method1325(7627);
        if (var9 > 0) {
            var4.field4620 = new class120[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1308(arg1 ^ 0xFFFFFFE1);
                class120 var12 = new class120(class58.method383((byte) -89, var11));
                var4.field4620[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1350(false);
                    int var14 = var5.method1350(false);
                    var12.method730(new class155(var14), (long) var13, (byte) -36);
                }
            }
        }
        var5.field3380 = 0;
        var4.field4615 = var5.method1334((byte) 124);
        if (arg1 != 8) {
            method1516(110, 19, 22, -35, (class226) null, (class226) null, -67, -115, -78, -3, -94L);
        }
        var4.field4610 = new int[var8];
        var4.field4608 = new class128[var8];
        var4.field4618 = new int[var8];
        int var15 = 0;
        while (var7 > var5.field3380) {
            int var16 = var5.method1308(-60);
            if (var16 == 3) {
                var4.field4608[var15] = var5.method1319(1);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4610[var15] = var5.method1325(arg1 + 7619);
            } else {
                var4.field4610[var15] = var5.method1350(false);
            }
            var4.field4618[var15++] = var16;
        }
        class205.field3611.method1442(arg1 - 9, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[[I", line = 314)
    public final int[][] method62(int arg0, int arg1) {
        field3866++;
        int var3 = 29 % ((-arg1 - 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883 && this.method1515(true)) {
            int var5 = (class12.field390 == this.field3858 ? arg0 : this.field3858 * arg0 / class12.field390) * this.field3861;
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (class185.field3225 == this.field3861) {
                for (int var9 = 0; var9 < class185.field3225; var9++) {
                    int var10 = this.field3860[var5++];
                    var8[var9] = class238.method1622(var10 << 4, 4080);
                    var7[var9] = class238.method1622(4080, var10 >> 4);
                    var6[var9] = class238.method1622(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class185.field3225; var11++) {
                    int var12 = this.field3861 * var11 / class185.field3225;
                    int var13 = this.field3860[var5 + var12];
                    var8[var11] = class238.method1622(var13, 255) << 4;
                    var7[var11] = class238.method1622(var13 >> 4, 4080);
                    var6[var11] = class238.method1622(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBII[BIZ[Lid;I)V", line = 387)
    public static final void method1518(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8, class249[] arg9, int arg10) {
        class194 var11 = new class194(arg6);
        field3868++;
        int var12 = -1;
        if (arg3 != -83) {
            field3851 = (class128) null;
        }
        while (true) {
            int var13 = var11.method1341(7420);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1345((byte) 72);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = var14 & 0x3F;
                int var18 = var11.method1325(arg3 + 7710);
                int var19 = var18 & 0x3;
                int var20 = (var14 & 0xFD2) >> 6;
                int var21 = var18 >> 2;
                if (arg1 == var16 && arg0 <= var20 && var20 < arg0 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                    class38 var22 = class239.method1629((byte) -111, var12);
                    int var23 = arg4 + class220.method1525(var20 & 0x7, var22.field758, arg2, var22.field778, false, var17 & 0x7, var19);
                    int var24 = arg10 + class88.method552(true, var22.field758, arg2, var22.field778, var20 & 0x7, var19, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class249 var25 = null;
                        if (!arg8) {
                            int var26 = arg5;
                            if ((class301.field5117[1][var23][var24] & 0x2) == 2) {
                                var26 = arg5 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class43.method296(var24, var19 + arg2 & 0x3, (byte) -81, arg8, arg5, var21, var23, arg5, !arg8, var25, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILbg;B)V", line = 469)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field3859++;
        if (arg0 == 0) {
            this.field3855 = arg1.method1308(-18);
        }
        if (arg2 != 13) {
            method1512(76);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 483)
    public final void method417(byte arg0) {
        super.method417(arg0);
        field3854++;
        this.field3860 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lmh;IZI)Lmh;", line = 493)
    public static final class128 method1519(class128[] arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 0;
        field3865++;
        if (!arg2) {
            field3862 = (class140[]) null;
        }
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class52.field1022;
            }
            var4 += arg0[arg1 + var5].field2181;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class128 var9 = arg0[arg1 + var8];
            class224.method1546(var9.field2224, 0, var6, var7, var9.field2181);
            var7 += var9.field2181;
        }
        class128 var10 = new class128();
        var10.field2224 = var6;
        var10.field2181 = var4;
        return var10;
    }
}
