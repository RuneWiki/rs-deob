import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class74 extends class170 {

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "Z")
    private boolean field1356 = true;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "Z")
    private boolean field1357 = true;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "[I")
    public static int[] field1354 = new int[32];

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "Lqk;")
    public static class207 field1364 = class24.method212(255, "l");

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!pg", name = "mb", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "Luh;")
    public static class100 field1361;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "[I")
    public static int[] field1363;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field1359;
        if (arg0 != -30) {
            method536((class229) null, false, (Object) null);
        }
        int[] var3 = super.field3001.method1538(85, arg1);
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, !this.field1356 ? arg1 : -arg1 + class233.field4294, 93);
            if (this.field1357) {
                for (int var5 = 0; ~var5 > ~class88.field1595; ++var5) {
                    var3[var5] = var4[class94.field1684 - var5];
                }
            } else {
                class274.method1861(var4, 0, var3, 0, class88.field1595);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class276.field4842 = class197.field3463 * arg0 / arg3;
        class39.field786 = class70.field1253 * arg2 / arg4;
        class62.field1137 = -1;
        if (arg1 < 60) {
            method540(80, (class229) null);
        }
        class48.field950 = -1;
        class288.method1965(1);
        ++field1362;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field2998 = arg0.method1045((byte) -17) == 1;
                }
            } else {
                this.field1356 = arg0.method1045((byte) 87) == 1;
            }
        } else {
            this.field1357 = arg0.method1045((byte) -86) == 1;
        }
        ++field1358;
        if (arg1 != 5877) {
            field1361 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZIIII)V")
    public static final void method533(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1355;
        ++class89.field1609;
        class153.method1103(true);
        if (!arg1) {
            client.method1111((byte) -126, true);
            class200.method1394(true, (byte) 120);
            client.method1111((byte) -126, false);
        }
        class200.method1394(false, (byte) 88);
        if (!arg1) {
            class151.method1092((byte) -123);
        }
        class161.method1172(77);
        if (~class132.field2290 == -2) {
            int var6 = class266.field4711 + class20.field328 & 2047;
            int var7 = class25.field533;
            if (class143.field2477 / 256 > var7) {
                var7 = class143.field2477 / 256;
            }
            if (class174.field3126[4] && ~(class48.field949[4] + 128) < ~var7) {
                var7 = class48.field949[4] + 128;
            }
            class140.method970(class4.field66, class22.method139(class202.field3565.field5104, class202.field3565.field5072, 23979, class93.field1645) - 50, arg3, class260.field4636, var6, var7, var7 * 3 + 600, arg5 ^ 31799);
        }
        int var8 = class209.field3702;
        int var9 = class228.field4186;
        int var10 = class111.field1939;
        int var11 = class196.field3443;
        if (arg5 != 1) {
            method538(-71, 108, -75, -20, -32, 84, -124, false, -81, -35, -27, 21);
        }
        int var12 = class101.field1819;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class174.field3126[var13]) {
                int var19 = (int) ((double) (class56.field1051[var13] * 2 + 1) * Math.random() - (double) class56.field1051[var13] + Math.sin((double) class247.field4481[var13] / 100.0D * (double) class279.field4895[var13]) * (double) class48.field949[var13]);
                if (var13 == 4) {
                    class228.field4186 += var19;
                    if (class228.field4186 < 128) {
                        class228.field4186 = 128;
                    }
                    if (~class228.field4186 < -384) {
                        class228.field4186 = 383;
                    }
                }
                if (~var13 == -2) {
                    class196.field3443 += var19;
                }
                if (var13 == 2) {
                    class111.field1939 += var19;
                }
                if (var13 == 0) {
                    class209.field3702 += var19;
                }
                if (var13 == 3) {
                    class101.field1819 = 2047 & class101.field1819 + var19;
                }
            }
        }
        class157.method1146(arg5 + -121);
        class23.method164(arg0, arg4, arg0 - -arg2, arg4 - -arg3);
        class257.method1794();
        if (!class256.field4588 && class16.field261 >= arg0 && class16.field261 < arg0 + arg2 && ~arg4 >= ~class21.field346 && class21.field346 < arg3 + arg4) {
            class275.field4828 = true;
            class204.field3581 = 0;
            int var14 = class212.field3772;
            int var15 = class259.field4613;
            class73.field1338 = (var15 - var14) * (-arg0 + class16.field261) / arg2 + var14;
            int var16 = class225.field4100;
            int var17 = class277.field4872;
            class283.field4976 = (var17 - var16) * (-arg4 + class21.field346) / arg3 + var16;
        } else {
            class204.field3581 = 0;
            class275.field4828 = false;
        }
        class21.method129((byte) 8);
        byte var18 = ~class176.method1261((byte) 86) == -3 ? (byte) class89.field1609 : 1;
        class23.method167(arg0, arg4, arg2, arg3, 0);
        class88.method644(class209.field3702, class196.field3443, class111.field1939, class228.field4186, class101.field1819, class16.field256, class232.field4245, class19.field320, class207.field3687, class121.field2097, class20.field327, class93.field1645 + 1, var18, class202.field3565.field5104 >> 7, class202.field3565.field5072 >> 7);
        class21.method129((byte) 8);
        class90.method649();
        class123.method866(256, arg0, arg2, 256, arg4, arg5 ^ 11, arg3);
        class246.method1733(arg4, arg2, arg0, arg3, 256, 54, 256);
        ((class45) class257.field4602).method349((byte) -92, class20.field325);
        class136.method947(arg2, arg4, arg0, arg3, (byte) 9);
        class228.field4186 = var9;
        class209.field3702 = var8;
        class111.field1939 = var10;
        class196.field3443 = var11;
        class101.field1819 = var12;
        if (class1.field10 && ~class101.field1822.method1025(-12354) == -1) {
            class1.field10 = false;
        }
        if (class1.field10) {
            class23.method167(arg0, arg4, arg2, arg3, 0);
            class284.method1926(class285.field4999, (byte) 101, false);
        }
        if (!arg1 && !class1.field10 && !class256.field4588 && ~arg0 >= ~class16.field261 && ~(arg0 + arg2) < ~class16.field261 && ~class21.field346 <= ~arg4 && arg3 + arg4 > class21.field346) {
            class204.method1410(arg4, (byte) 54, class21.field346, arg0, class16.field261, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)I")
    public static final int method534(int arg0, byte arg1) {
        if (arg1 != -80) {
            field1361 = null;
        }
        ++field1365;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    public static void method535(byte arg0) {
        field1364 = null;
        field1363 = null;
        if (arg0 >= -101) {
            method534(-71, (byte) -109);
        }
        field1361 = null;
        field1354 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwc;ZLjava/lang/Object;)V")
    public static final void method536(class229 arg0, boolean arg1, Object arg2) {
        ++field1368;
        if (arg0.field4210 != null) {
            if (!arg1) {
                method533(-62, true, -109, 106, -75, -62);
            }
            for (int var3 = 0; ~var3 > -51 && arg0.field4210.peekEvent() != null; ++var3) {
                class153.method1098((byte) 76, 1L);
            }
            if (arg2 != null) {
                arg0.field4210.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)Lo;")
    public static final class246 method537(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        return var3 != null && var3.field3152 != null ? var3.field3152 : null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public static final boolean method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg2 != -8673) {
            method532(-112, -124, 60, -3, -41);
        }
        ++field1360;
        if (class202.field3565.method83(true) == 2) {
            return class151.method1096(arg1, arg4, arg0, arg5, arg9, arg6, arg10, arg8, arg3, arg11, arg7, 31585);
        } else {
            return ~class202.field3565.method83(true) < -3 ? class55.method417(arg10, arg4, arg1, arg9, class202.field3565.method83(true), arg7, arg8, arg6, arg3, arg0, arg5, arg11, arg2 + 19669977) : class214.method1523(arg6, arg7, arg8, arg4, arg9, arg5, (byte) 125, arg3, arg0, arg1, arg10, arg11);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1370;
            int[][] var3 = super.field3002.method427(arg0, 239);
            if (super.field3002.field1077) {
                int[][] var4 = this.method1223(0, 86, !this.field1356 ? arg0 : class233.field4294 - arg0);
                int[] var5 = var4[2];
                int[] var6 = var3[0];
                int[] var7 = var4[1];
                int[] var8 = var3[1];
                int[] var9 = var4[0];
                int[] var10 = var3[2];
                if (this.field1357) {
                    for (int var11 = 0; ~var11 > ~class88.field1595; ++var11) {
                        var6[var11] = var9[class94.field1684 - var11];
                        var8[var11] = var7[-var11 + class94.field1684];
                        var10[var11] = var5[-var11 + class94.field1684];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class88.field1595; ++var12) {
                        var6[var12] = var9[var12];
                        var8[var12] = var7[var12];
                        var10[var12] = var5[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILqk;Lqk;ILqk;I)V")
    public static final void method539(int arg0, class207 arg1, class207 arg2, int arg3, class207 arg4, int arg5) {
        for (int var6 = 99; ~var6 < -1; --var6) {
            class150.field2639[var6] = class150.field2639[var6 + -1];
            class275.field4833[var6] = class275.field4833[var6 + -1];
            class25.field530[var6] = class25.field530[var6 - 1];
            class30.field613[var6] = class30.field613[var6 + -1];
            class81.field1475[var6] = class81.field1475[var6 + -1];
        }
        class150.field2639[0] = arg3;
        int var7 = -11 % ((33 - arg0) / 45);
        class275.field4833[0] = arg2;
        class89.field1604 = class193.field3395;
        class81.field1475[0] = arg5;
        ++class78.field1418;
        ++field1369;
        class25.field530[0] = arg1;
        class30.field613[0] = arg4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILwc;)V")
    public static final void method540(int arg0, class229 arg1) {
        class116.field2013 = 3;
        class104 var2 = null;
        ++field1367;
        class125.method882(105, true);
        class230.field4214 = true;
        class123.field2125 = 255;
        client.field2694 = true;
        class256.field4585 = true;
        class287.field5125 = true;
        class247.field4476 = true;
        class85.field1545 = true;
        class10.field139 = true;
        class167.field2927 = 127;
        class40.field806 = 0;
        class190.field3348 = true;
        class13.field196 = 0;
        class32.field653 = 127;
        int var3 = 95 % ((-32 - arg0) / 37);
        class65.field1182 = 0;
        class120.field2087 = true;
        class261.field4655 = true;
        class231.field4238 = 2;
        class278.field4884 = true;
        class47.field938 = 0;
        if (class170.field3023 < 96) {
            class64.method463(0);
        } else {
            class64.method463(2);
        }
        class231.field4235 = 0;
        class62.field1127 = true;
        class173.field3094 = 0;
        class235.field4342 = false;
        class156.field2743 = 0;
        class135.field2336 = false;
        class214.field3808 = false;
        try {
            class96 var4 = arg1.method1633("runescape", (byte) -117);
            while (~var4.field1696 == -1) {
                class153.method1098((byte) 76, 1L);
            }
            if (~var4.field1696 == -2) {
                int var5 = 0;
                var2 = (class104) var4.field1699;
                byte[] var6 = new byte[(int) var2.method752((byte) 107)];
                while (var6.length > var5) {
                    int var7 = var2.method750(var6.length + -var5, (byte) 36, var5, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class196.method1362((byte) 60, new class149(var6));
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method751((byte) 36);
            }
        } catch (Exception var8) {
        }
    }
}
