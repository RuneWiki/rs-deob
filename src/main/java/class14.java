import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class14 extends class68 {

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[Lti;")
    public static class183[] field192 = new class183[50];

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lce;")
    public static class126 field191 = class206.method1445(-7923, "::fpsoff");

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Lce;")
    public static class126 field194 = class206.method1445(-7923, "<col=ffb000>");

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lfg;")
    public static class48 field190 = new class48(16);

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "[I")
    public static int[] field195 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[I")
    public static int[] field198 = new int[100];

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 25)
    public static void method80(int arg0) {
        field195 = null;
        if (arg0 <= 55) {
            return;
        }
        field191 = null;
        field198 = null;
        field194 = null;
        field192 = null;
        field190 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V", line = 39)
    public class14(int arg0, int arg1) {
        this.field186 = arg0;
        this.field188 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBIIIII)V", line = 50)
    public static final void method81(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class274.field4614 = 0;
        for (int var7 = -1; var7 < class30.field425 + class239.field4036; var7++) {
            class138 var8;
            if (var7 == -1) {
                var8 = class286.field4744;
            } else if (var7 >= class239.field4036) {
                var8 = class199.field3391[class279.field4639[var7 - class239.field4036]];
            } else {
                var8 = class85.field1352[class166.field2958[var7]];
            }
            if (var8 != null && var8.method626(arg1 - 9)) {
                if (var8 instanceof class89) {
                    class304 var9 = ((class89) var8).field1389;
                    if (var9.field5059 != null) {
                        var9 = var9.method2038((byte) 103);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class239.field4036 <= var7) {
                    class304 var15 = ((class89) var8).field1389;
                    if (var15.field5059 != null) {
                        var15 = var15.method2038((byte) 97);
                    }
                    if (var15.field5058 >= 0 && var15.field5058 < client.field2075.length) {
                        int var16;
                        if (var15.field5081 == -1) {
                            var16 = var8.method1012(13061) + 15;
                        } else {
                            var16 = var15.field5081 + 15;
                        }
                        class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var16, var8, arg3);
                        if (class313.field5365 > -1) {
                            client.field2075[var15.field5058].method1333(class313.field5365 + arg5 - 12, arg0 - -class15.field215 + -30);
                        }
                    }
                    class190[] var17 = class100.field1623;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class190 var19 = var17[var18];
                        if (var19 != null && var19.field3268 == 1 && class279.field4639[var7 - class239.field4036] == var19.field3257 && class249.field4174 % 20 < 10) {
                            int var20;
                            if (var15.field5081 == -1) {
                                var20 = var8.method1012(arg1 + 12958) + 15;
                            } else {
                                var20 = var15.field5081 + 15;
                            }
                            class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var20, var8, arg3);
                            if (class313.field5365 > -1) {
                                class315.field5406[var19.field3263].method1333(arg5 - (12 - class313.field5365), class15.field215 + arg0 + -28);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class301 var11 = (class301) var8;
                    if (var11.field4981 != -1 || var11.field5001 != -1) {
                        class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var8.method1012(arg1 + 12958) + 15, var8, arg3);
                        if (class313.field5365 > -1) {
                            if (var11.field4981 != -1) {
                                class57.field884[var11.field4981].method1333(arg5 + class313.field5365 - 12, class15.field215 - var10 + arg0);
                                var10 += 25;
                            }
                            if (var11.field5001 != -1) {
                                client.field2075[var11.field5001].method1333(class313.field5365 + arg5 - 12, -var10 + class15.field215 + arg0);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class190[] var13 = class100.field1623;
                        while (var13.length > var12) {
                            class190 var14 = var13[var12];
                            if (var14 != null && var14.field3268 == 10 && class166.field2958[var7] == var14.field3257) {
                                class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var8.method1012(13061) + 15, var8, arg3);
                                if (class313.field5365 > -1) {
                                    class315.field5406[var14.field3263].method1333(class313.field5365 + arg5 - 12, arg0 - var10 + class15.field215);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field2446 != null && (var7 >= class239.field4036 || class241.field4084 == 0 || class241.field4084 == 3 || class241.field4084 == 1 && class9.method51(-25847, ((class301) var8).field5019))) {
                    class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var8.method1012(arg1 + 12958), var8, arg3);
                    if (class313.field5365 > -1 && class274.field4614 < class78.field1277) {
                        class78.field1286[class274.field4614] = class200.field3414.method2154(var8.field2446) / 2;
                        class78.field1281[class274.field4614] = class200.field3414.field5291;
                        class78.field1284[class274.field4614] = class313.field5365;
                        class78.field1280[class274.field4614] = class15.field215;
                        class78.field1285[class274.field4614] = var8.field2481;
                        class78.field1282[class274.field4614] = var8.field2491;
                        class78.field1278[class274.field4614] = var8.field2456;
                        class78.field1283[class274.field4614] = var8.field2446;
                        class274.field4614++;
                    }
                }
                if (class249.field4174 < var8.field2510) {
                    class273 var21 = class182.field3173[0];
                    class273 var22 = class182.field3173[1];
                    int var23;
                    if ((var8 instanceof class89)) {
                        class89 var24 = (class89) var8;
                        class273[] var25 = (class273[]) ((class273[]) class29.field401.method1173(-19839, (long) var24.field1389.field5114));
                        if (var25 == null) {
                            var25 = class98.method666(class127.field2170, true, 0, var24.field1389.field5114);
                            if (var25 != null) {
                                class29.field401.method1179(var25, (long) var24.field1389.field5114, (byte) -72);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        class304 var26 = var24.field1389;
                        if (var26.field5081 == -1) {
                            var23 = var8.method1012(13061);
                        } else {
                            var23 = var26.field5081;
                        }
                    } else {
                        var23 = var8.method1012(13061);
                    }
                    class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var23 + var21.field4601 + 10, var8, arg3);
                    if (class313.field5365 > -1) {
                        int var27 = class313.field5365 + arg5 - (var21.field4595 >> 1);
                        int var28 = class15.field215 + arg0 - 3;
                        var21.method1333(var27, var28);
                        int var29 = var21.field4601;
                        int var30 = var8.field2454 * var21.field4595 / 255;
                        if (class56.field846) {
                            class101.method692(var27, var28, var27 + var30, var28 - -var29);
                        } else {
                            class276.method1854(var27, var28, var27 + var30, var28 + var29);
                        }
                        var22.method1333(var27, var28);
                        if (class56.field846) {
                            class101.method687(arg5, arg0, arg5 + arg6, arg0 + arg2);
                        } else {
                            class276.method1862(arg5, arg0, arg5 + arg6, arg0 + arg2);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field2504[var31] > class249.field4174) {
                        int var34;
                        if (var8 instanceof class89) {
                            class89 var32 = (class89) var8;
                            class304 var33 = var32.field1389;
                            if (var33.field5081 == -1) {
                                var34 = var8.method1012(13061) / 2;
                            } else {
                                var34 = var33.field5081 / 2;
                            }
                        } else {
                            var34 = var8.method1012(13061) / 2;
                        }
                        class318.method2213(arg2 >> 1, (byte) 93, arg6 >> 1, arg4, var34, var8, arg3);
                        if (class313.field5365 > -1) {
                            if (var31 == 1) {
                                class15.field215 -= 20;
                            }
                            if (var31 == 2) {
                                class313.field5365 -= 15;
                                class15.field215 -= 10;
                            }
                            if (var31 == 3) {
                                class313.field5365 += 15;
                                class15.field215 -= 10;
                            }
                            class107.field1694[var8.field2463[var31]].method1333(class313.field5365 + arg5 - 12, class15.field215 + -12 + arg0);
                            class118.field1987.method2144(class195.method1386((byte) 20, var8.field2478[var31]), arg5 - (1 - class313.field5365), class15.field215 + arg0 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field185++;
        for (int var35 = 0; var35 < class274.field4614; var35++) {
            int var36 = class78.field1284[var35];
            int var37 = class78.field1280[var35];
            int var38 = class78.field1281[var35];
            int var39 = class78.field1286[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > class78.field1280[var41] + -class78.field1281[var41] && var37 - var38 < class78.field1280[var41] - -2 && (class78.field1286[var41] + class78.field1284[var41]) > (var36 - var39) && var36 + var39 > class78.field1284[var41] + -class78.field1286[var41] && var37 > class78.field1280[var41] - class78.field1281[var41]) {
                        var37 = class78.field1280[var41] - class78.field1281[var41];
                        var40 = true;
                    }
                }
            }
            class313.field5365 = class78.field1284[var35];
            class15.field215 = class78.field1280[var35] = var37;
            class126 var42 = class78.field1283[var35];
            if (class244.field4141 == 0) {
                int var43 = 16776960;
                if (class78.field1285[var35] < 6) {
                    var43 = class318.field5448[class78.field1285[var35]];
                }
                if (class78.field1285[var35] == 6) {
                    var43 = class167.field2970 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class78.field1285[var35] == 7) {
                    var43 = class167.field2970 % 20 >= 10 ? 65535 : 255;
                }
                if (class78.field1285[var35] == 8) {
                    var43 = class167.field2970 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class78.field1285[var35] == 9) {
                    int var44 = 150 - class78.field1278[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 + 16384000 - var44 * 327680;
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class78.field1285[var35] == 10) {
                    int var45 = 150 - class78.field1278[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 + 16384000 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = 500 - (var45 * 5 - var45 * 327680) - 32767745;
                    }
                }
                if (class78.field1285[var35] == 11) {
                    int var46 = 150 - class78.field1278[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 + 65280 - 16384250;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class78.field1282[var35] == 0) {
                    class200.field3414.method2144(var42, class313.field5365 + arg5, class15.field215 + arg0, var43, 0);
                }
                if (class78.field1282[var35] == 1) {
                    class200.field3414.method2141(var42, class313.field5365 + arg5, class15.field215 + arg0, var43, 0, class167.field2970);
                }
                if (class78.field1282[var35] == 2) {
                    class200.field3414.method2156(var42, class313.field5365 + arg5, arg0 - -class15.field215, var43, 0, class167.field2970);
                }
                if (class78.field1282[var35] == 3) {
                    class200.field3414.method2151(var42, class313.field5365 + arg5, class15.field215 + arg0, var43, 0, class167.field2970, 150 - class78.field1278[var35]);
                }
                if (class78.field1282[var35] == 4) {
                    int var47 = (150 - class78.field1278[var35]) * (class200.field3414.method2154(var42) + 100) / 150;
                    if (class56.field846) {
                        class101.method692(class313.field5365 + arg5 - 50, arg0, class313.field5365 + arg5 + 50, arg0 + arg2);
                    } else {
                        class276.method1854(arg5 + class313.field5365 - 50, arg0, class313.field5365 + arg5 + 50, arg0 + arg2);
                    }
                    class200.field3414.method2135(var42, arg5 + class313.field5365 + 50 - var47, arg0 - -class15.field215, var43, 0);
                    if (class56.field846) {
                        class101.method687(arg5, arg0, arg5 + arg6, arg0 + arg2);
                    } else {
                        class276.method1862(arg5, arg0, arg5 + arg6, arg0 - -arg2);
                    }
                }
                if (class78.field1282[var35] == 5) {
                    int var48 = 150 - class78.field1278[var35];
                    if (class56.field846) {
                        class101.method692(arg5, arg0 + class15.field215 - class200.field3414.field5291 - 1, arg5 + arg6, arg0 + class15.field215 + 5);
                    } else {
                        class276.method1854(arg5, arg0 + class15.field215 - class200.field3414.field5291 - 1, arg5 + arg6, class15.field215 + arg0 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class200.field3414.method2144(var42, arg5 + class313.field5365, class15.field215 + arg0 - -var49, var43, 0);
                    if (class56.field846) {
                        class101.method687(arg5, arg0, arg5 + arg6, arg0 + arg2);
                    } else {
                        class276.method1862(arg5, arg0, arg5 + arg6, arg0 + arg2);
                    }
                }
            } else {
                class200.field3414.method2144(var42, class313.field5365 + arg5, class15.field215 + arg0, 16776960, 0);
            }
        }
        if (arg1 != 103) {
            field190 = (class48) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 537)
    public static final void method82(int arg0) {
        field193++;
        int var1 = class134.field2292;
        int var2 = class70.field1154;
        int var3 = class9.field117 - (class7.field87 + var1);
        if (arg0 != 500) {
            return;
        }
        int var4 = class22.field307 - class1.field6 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class45.field693 != null) {
                var5 = class45.field693;
            } else if (class253.field4250 == null) {
                var5 = class161.field2907.field2705;
            } else {
                var5 = class253.field4250;
            }
            int var6 = 0;
            int var7 = 0;
            if (class253.field4250 == var5) {
                Insets var8 = class253.field4250.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class22.field307);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class9.field117, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class9.field117 - var3, var7, var3, class22.field307);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class22.field307 - var4, class9.field117, var4);
            }
        } catch (Exception var11) {
        }
    }
}
