import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class321 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    private int field4156 = -1;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    private int field4163 = 0;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lmfa;")
    private class562 field4158 = new class562();

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Z")
    public boolean field4172 = false;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    private int field4167;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[Lcl;")
    private class242[] field4161;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[[I")
    private int[][] field4171;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[[Z")
    public static boolean[][] field4164;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)[[I", line = 6)
    public final int[][] method1806(boolean arg0) {
        field4160++;
        if (!arg0) {
            this.method1806(true);
        }
        if (this.field4167 != this.field4162) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4167; var2++) {
            this.field4161[var2] = class569.field8067;
        }
        return this.field4171;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1807(int arg0) {
        field4166++;
        for (int var1 = 0; var1 < 5; var1++) {
            class347.field4528[var1] = false;
        }
        class424.field5643 = -1;
        class19.field167 = 0;
        class386.field5161 = class469.field6549;
        class689.field9735 = -1;
        class221.field2787 = class150.field1707;
        class350.field4583 = class345.field4493;
        class467.field6470 = class654.field9344;
        class232.field2954 = class587.field8342;
        class5.field41 = 5;
        class214.field2600 = arg0;
        class186.field2268 = class662.field9411;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 58)
    public static void method1808(int arg0) {
        if (arg0 != 31327) {
            field4164 = null;
        }
        field4164 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 71)
    public static final void method1809(String arg0, int arg1, byte arg2, String arg3, String arg4, int arg5, String arg6) {
        class412.method2231(arg1, arg3, arg0, arg6, -1, null, arg4, -20468, arg5);
        field4159++;
        if (arg2 < 89) {
            field4164 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Loa;I)V", line = 82)
    public static final void method1810(class635 arg0, int arg1) {
        field4168++;
        int var2 = client.field3414;
        int var3 = class553.field7888;
        int var4 = class350.field4586;
        int var5 = class70.field749;
        int var6 = -10660793;
        arg0.method3552(var5, var4, arg1 + 7, var6, var3, var2);
        arg0.method3552(16, var4 - 2, 7, -16777216, var3 + 1, var2 + 1);
        arg0.method3556(var3 + 18, (byte) 100, -16777216, var4 - 2, var2 + 1, var5 - 19);
        class211.field2561.method1124(0, class221.field2743.method1296(class226.field2899, (byte) 56), var6, -1, var2 + 3, var3 + 14);
        int var7 = class407.field5419.method162(-26561);
        int var8 = class407.field5419.method161(31285);
        int var9 = arg1;
        for (class208 var10 = (class208) class530.field7597.method3174((byte) 49); var10 != null; var10 = (class208) class530.field7597.method3168(false)) {
            int var11 = (class145.field1625 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var11 - 13 < var8 && (var11 + 3) > var8 && var10.field2526) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class455.method2586(var10.field2527, (byte) 110)) {
                var13 = class472.field6588.method1903((int) var10.field2524, (byte) 43).field7702;
            } else if (var10.field2534 != -1) {
                var13 = class472.field6588.method1903(var10.field2534, (byte) -119).field7702;
            } else if (class662.method3721((byte) -73, var10.field2527)) {
                class443 var14 = (class443) class392.field5223.method3234((byte) -55, (long) ((int) var10.field2524));
                if (var14 != null) {
                    class625 var15 = var14.field6107;
                    class23 var16 = var15.field8855;
                    if (var16.field229 != null) {
                        var16 = var16.method108(0, class491.field7127);
                    }
                    if (var16 != null) {
                        var13 = var16.field215;
                    }
                }
            } else if (class429.method2304(15311, var10.field2527)) {
                Object var17 = null;
                class335 var18;
                if (var10.field2527 == 1009) {
                    var18 = class195.field2339.method3729((int) var10.field2524, (byte) 109);
                } else {
                    var18 = class195.field2339.method3729((int) (var10.field2524 >>> 32 & 0x7FFFFFFFL), (byte) 109);
                }
                if (var18.field4342 != null) {
                    var18 = var18.method1889(1, class491.field7127);
                }
                if (var18 != null) {
                    var13 = var18.field4375;
                }
            }
            String var19 = class5.method24(var10, (byte) -109);
            if (var13 != null) {
                var19 = var19 + class392.method2140(var13, -80);
            }
            class211.field2561.method1135(class595.field8449, var12, var2 + 3, 0, var19, class85.field906, arg1 ^ 0xFFFFB8F2, var11);
            if (var10.field2535) {
                class217.field2619.method2612(class612.field8650.method3622(62, var19) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class110.method690(class70.field749, class553.field7888, class350.field4586, client.field3414, 0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I", line = 189)
    public final int[] method1811(int arg0, int arg1) {
        field4170++;
        if (arg1 <= 4) {
            this.method1814((byte) -83);
        }
        if (this.field4167 == this.field4162) {
            this.field4172 = this.field4161[arg0] == null;
            this.field4161[arg0] = class569.field8067;
            return this.field4171[arg0];
        } else if (this.field4167 == 1) {
            this.field4172 = this.field4156 != arg0;
            this.field4156 = arg0;
            return this.field4171[0];
        } else {
            class242 var3 = this.field4161[arg0];
            if (var3 == null) {
                this.field4172 = true;
                if (this.field4167 > this.field4163) {
                    var3 = new class242(arg0, this.field4163);
                    this.field4163++;
                } else {
                    class242 var4 = (class242) this.field4158.method3175((byte) 110);
                    var3 = new class242(arg0, var4.field3145);
                    this.field4161[var4.field3147] = null;
                    var4.method1519((byte) 121);
                }
                this.field4161[arg0] = var3;
            } else {
                this.field4172 = false;
            }
            this.field4158.method3169(-128, var3);
            return this.field4171[var3.field3145];
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)Z", line = 257)
    public static final boolean method1812(int arg0) throws IOException {
        field4169++;
        if (class170.field2043 == null) {
            return false;
        }
        if (class416.field5523 == null) {
            if (class260.field3303) {
                if (!class170.field2043.method1644(1, 12)) {
                    return false;
                }
                class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
                class260.field3303 = false;
                class389.field5198++;
                class112.field1306 = 0;
            }
            class680.field9630.field6215 = 0;
            if (class680.field9630.method3461(105)) {
                if (!class170.field2043.method1644(1, arg0 ^ 0x4469)) {
                    return false;
                }
                class170.field2043.method1640(class680.field9630.field6209, 1, 1, 12);
                class389.field5198++;
                class112.field1306 = 0;
            }
            class260.field3303 = true;
            class407[] var1 = class589.method3311(22227);
            int var2 = class680.field9630.method3460(-48);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class680.field9630.field6215);
            }
            class416.field5523 = var1[var2];
            class478.field7009 = class416.field5523.field5420;
        }
        if (class478.field7009 == -1) {
            if (!class170.field2043.method1644(1, 12)) {
                return false;
            }
            class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
            class112.field1306 = 0;
            class478.field7009 = class680.field9630.field6209[0] & 0xFF;
            class389.field5198++;
        }
        if (class478.field7009 == -2) {
            if (!class170.field2043.method1644(2, 12)) {
                return false;
            }
            class170.field2043.method1640(class680.field9630.field6209, 0, 2, 12);
            class680.field9630.field6215 = 0;
            class478.field7009 = class680.field9630.method2574(arg0 ^ 0x973042CD);
            class112.field1306 = 0;
            class389.field5198 += 2;
        }
        if (class478.field7009 > 0) {
            if (!class170.field2043.method1644(class478.field7009, 12)) {
                return false;
            }
            class680.field9630.field6215 = 0;
            class170.field2043.method1640(class680.field9630.field6209, 0, class478.field7009, 12);
            class389.field5198 += class478.field7009;
            class112.field1306 = 0;
        }
        class273.field3455 = class419.field5570;
        class419.field5570 = class145.field1631;
        class145.field1631 = class416.field5523;
        if (class416.field5523 == class345.field4509) {
            int var3 = class680.field9630.method2575((byte) -48);
            int var4 = class680.field9630.method2532(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class680.field9630.method2575((byte) -48);
            int var6 = class680.field9630.method2574(-1758460248);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class680.field9630.method2542((byte) -68);
            if (class261.method1484(94, var7)) {
                for (int var8 = var6; var8 <= var4; var8++) {
                    long var9 = ((long) var5 << 32) + (long) var8;
                    class264 var11 = (class264) class464.field6451.method3234((byte) -49, var9);
                    class264 var12;
                    if (var11 != null) {
                        var12 = new class264(var3, var11.field3336);
                        var11.method1519((byte) 121);
                    } else if (var8 == -1) {
                        var12 = new class264(var3, class505.method2903(var5, 65535).field5084.field3336);
                    } else {
                        var12 = new class264(var3, -1);
                    }
                    class464.field6451.method3235(var9, arg0 ^ 0xFFFFBB9A, var12);
                }
            }
            class416.field5523 = null;
            return true;
        } else if (class416.field5523 == class384.field5138) {
            class411.method2227((byte) -59);
            class416.field5523 = null;
            return true;
        } else if (class416.field5523 == class214.field2583) {
            boolean var13 = class680.field9630.method2541(42) == 1;
            String var14 = class680.field9630.method2516(123);
            String var15 = var14;
            if (var13) {
                var15 = class680.field9630.method2516(126);
            }
            int var16 = class680.field9630.method2541(62);
            boolean var17 = false;
            if (var16 <= 1) {
                if (!(!class89.field946 || class539.field7752) || class198.field2403) {
                    var17 = true;
                } else if (var16 <= 1 && class396.method2159(true, var15)) {
                    var17 = true;
                }
            }
            if (!var17 && class328.field4264 == 0) {
                String var18 = class470.method2663(true, class460.method2623(class680.field9630, (byte) -125));
                if (var16 == 2) {
                    class412.method2231(24, "<img=1>" + var15, "<img=1>" + var14, var18, -1, null, var14, -20468, 0);
                } else if (var16 == 1) {
                    class412.method2231(24, "<img=0>" + var15, "<img=0>" + var14, var18, -1, null, var14, -20468, 0);
                } else {
                    class412.method2231(24, var15, var14, var18, -1, null, var14, -20468, 0);
                }
            }
            class416.field5523 = null;
            return true;
        } else if (class463.field6443 == class416.field5523) {
            class583.method3279(false, -1);
            class416.field5523 = null;
            return true;
        } else if (class568.field8048 == class416.field5523) {
            int var19 = class680.field9630.method2541(121);
            int var20 = class680.field9630.method2541(124);
            if (var19 == 255) {
                var20 = -1;
                var19 = -1;
            }
            class529.method3023(var20, var19, false);
            class416.field5523 = null;
            return true;
        } else {
            if (arg0 != 17509) {
                field4164 = null;
            }
            if (class581.field8254 == class416.field5523) {
                class397.field5314 = class581.method3268(class680.field9630.method2541(110), (byte) 121);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class274.field3471) {
                class663.method3725(class526.field7523, (byte) 126);
                class416.field5523 = null;
                return true;
            } else if (class678.field9610 == class416.field5523) {
                class663.method3725(class357.field4678, (byte) 114);
                class416.field5523 = null;
                return true;
            } else if (class582.field8266 == class416.field5523) {
                class416.field5523 = null;
                class491.field7115 = 1;
                class491.field7117 = class204.field2494;
                return true;
            } else if (class416.field5523 == class164.field1959) {
                int var21 = class680.field9630.method2574(-1758460248);
                String var22 = class680.field9630.method2516(90);
                Object[] var23 = new Object[var22.length() + 1];
                for (int var24 = var22.length() - 1; var24 >= 0; var24--) {
                    if (var22.charAt(var24) == 's') {
                        var23[var24 + 1] = class680.field9630.method2516(68);
                    } else {
                        var23[var24 + 1] = Integer.valueOf(class680.field9630.method2575((byte) -48));
                    }
                }
                var23[0] = Integer.valueOf(class680.field9630.method2575((byte) -48));
                if (class261.method1484(103, var21)) {
                    class676 var25 = new class676();
                    var25.field9580 = var23;
                    class364.method1998(var25);
                }
                class416.field5523 = null;
                return true;
            } else if (class667.field9524 == class416.field5523) {
                class663.method3725(class24.field295, (byte) 124);
                class416.field5523 = null;
                return true;
            } else if (class622.field8826 == class416.field5523) {
                class184.method1069(false, false);
                class416.field5523 = null;
                return false;
            } else if (class595.field8452 == class416.field5523) {
                boolean var26 = class680.field9630.method2541(arg0 - 17429) == 1;
                byte[] var27 = new byte[class478.field7009 - 1];
                class680.field9630.method2552(0, arg0 - 17505, class478.field7009 - 1, var27);
                class295.method1677(var26, (byte) 126, var27);
                class416.field5523 = null;
                return true;
            } else if (class65.field688 == class416.field5523) {
                int var28 = class680.field9630.method2560(arg0 ^ 0xFFFFBB9A);
                int var29 = class680.field9630.method2542((byte) 72);
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = class680.field9630.method2532(false);
                int var31 = class680.field9630.method2558((byte) -105);
                int var32 = class680.field9630.method2558((byte) -48);
                if (var32 == 65535) {
                    var32 = -1;
                }
                if (class261.method1484(102, var30)) {
                    for (int var33 = var29; var33 <= var32; var33++) {
                        long var34 = ((long) var28 << 32) + (long) var33;
                        class264 var36 = (class264) class464.field6451.method3234((byte) -48, var34);
                        class264 var37;
                        if (var36 != null) {
                            var37 = new class264(var36.field3339, var31);
                            var36.method1519((byte) 121);
                        } else if (var33 == -1) {
                            var37 = new class264(class505.method2903(var28, arg0 ^ 0xBB9A).field5084.field3339, var31);
                        } else {
                            var37 = new class264(0, var31);
                        }
                        class464.field6451.method3235(var34, -1, var37);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class269.field3392) {
                int var38 = class680.field9630.method2558((byte) -94);
                int var39 = class680.field9630.method2532(false);
                if (var39 == 65535) {
                    var39 = -1;
                }
                int var40 = class680.field9630.method2560(-1);
                if (class261.method1484(arg0 ^ 0x4415, var38)) {
                    class685.method3814(false, 2, -1, var39, var40);
                }
                class416.field5523 = null;
                return true;
            } else if (class581.field8257 == class416.field5523) {
                int var41 = class680.field9630.method2542((byte) 92);
                if (var41 == 65535) {
                    var41 = -1;
                }
                int var42 = class680.field9630.method2560(-1);
                int var43 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(arg0 - 17409, var43)) {
                    class685.method3814(false, 1, -1, var41, var42);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class230.field2933) {
                int var44 = class680.field9630.method2560(-1);
                int var45 = class680.field9630.method2542((byte) 78);
                class491.field7127.method1382(var44, var45, -123);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class260.field3314) {
                class663.method3725(class306.field3996, (byte) 116);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class256.field3278) {
                int var46 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(82, var46)) {
                    class438.method2419(-47);
                }
                class416.field5523 = null;
                return true;
            } else if (class501.field7216 == class416.field5523) {
                int var47 = class680.field9630.method2558((byte) -67);
                int var48 = class680.field9630.method2533(262144);
                class491.field7127.method1379(21017, var48, var47);
                class416.field5523 = null;
                return true;
            } else if (class682.field9678 == class416.field5523) {
                String var49 = class680.field9630.method2516(arg0 ^ 0x442E);
                int var50 = class680.field9630.method2532(false);
                int var51 = class680.field9630.method2558((byte) -112);
                if (class261.method1484(arg0 - 17420, var51)) {
                    class373.method2046((byte) -87, var50, var49);
                }
                class416.field5523 = null;
                return true;
            } else if (class464.field6454 == class416.field5523) {
                int var52 = class680.field9630.method2574(-1758460248);
                class455 var53;
                if (class90.field1038 == var52) {
                    var53 = class377.field4914;
                } else {
                    var53 = class362.field4726[var52];
                }
                if (var53 == null) {
                    class416.field5523 = null;
                    return true;
                }
                int var54 = class680.field9630.method2574(-1758460248);
                int var55 = class680.field9630.method2541(120);
                boolean var56 = (var54 & 0x8000) != 0;
                if (var53.field6324 != null && var53.field6309 != null) {
                    boolean var57 = false;
                    if (var55 <= 1) {
                        if (!var56 && (class89.field946 && !class539.field7752 || class198.field2403)) {
                            var57 = true;
                        } else if (class396.method2159(true, var53.field6324)) {
                            var57 = true;
                        }
                    }
                    if (!var57 && class328.field4264 == 0) {
                        int var58 = -1;
                        String var60;
                        if (var56) {
                            var54 &= 0x7FFF;
                            class665 var59 = class550.method3106(class680.field9630, 0);
                            var58 = var59.field9456;
                            var60 = var59.field9455.method2789(class680.field9630, 110);
                        } else {
                            var60 = class470.method2663(true, class460.method2623(class680.field9630, (byte) -125));
                        }
                        var53.field3757 = var60.trim();
                        var53.field3824 = var54 >> 8;
                        var53.field3816 = 150;
                        var53.field3755 = var54 & 0xFF;
                        int var61;
                        if (var55 == 1 || var55 == 2) {
                            var61 = var56 ? 17 : 1;
                        } else {
                            var61 = var56 ? 17 : 2;
                        }
                        if (var55 == 2) {
                            class412.method2231(var61, "<img=1>" + var53.method2585((byte) -80, false), "<img=1>" + var53.method2582(true, 0), var60, var58, null, var53.field6341, -20468, 0);
                        } else if (var55 == 1) {
                            class412.method2231(var61, "<img=0>" + var53.method2585((byte) -80, false), "<img=0>" + var53.method2582(true, 0), var60, var58, null, var53.field6341, arg0 - 37977, 0);
                        } else {
                            class412.method2231(var61, var53.method2585((byte) -46, false), var53.method2582(true, 0), var60, var58, null, var53.field6341, -20468, 0);
                        }
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class526.field7521 == class416.field5523) {
                class491.field7127.method1380(false);
                class488.field7077 += 32;
                class416.field5523 = null;
                return true;
            } else if (class633.field8970 == class416.field5523) {
                class596.field8455 = class680.field9630.method2563(-2263);
                class643.field9101 = class680.field9630.method2539(arg0 - 17616) << 3;
                class381.field4948 = class680.field9630.method2547(true) << 3;
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class352.field4613) {
                class663.method3725(class428.field5680, (byte) 121);
                class416.field5523 = null;
                return true;
            } else if (class679.field9615 == class416.field5523) {
                int var62 = class680.field9630.method2574(arg0 - 1758477757);
                if (class261.method1484(81, var62)) {
                    method1807(0);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class145.field1632) {
                class663.method3725(class68.field733, (byte) 101);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class381.field4941) {
                int var63 = class680.field9630.method2532(false);
                int var64 = class680.field9630.method2558((byte) -31);
                int var65 = class680.field9630.method2541(36);
                if (class261.method1484(111, var64)) {
                    if (var65 == 2) {
                        class417.method2254(false);
                    }
                    class397.field5320 = var63;
                    class201.method1223(var63, 62);
                    class433.method2313(-81, false);
                    class364.method2003(class397.field5320);
                    for (int var66 = 0; var66 < 100; var66++) {
                        class406.field5409[var66] = true;
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class671.field9537 == class416.field5523) {
                int var67 = class680.field9630.method2542((byte) -75);
                if (var67 == 65535) {
                    var67 = -1;
                }
                int var68 = class680.field9630.method2529(97);
                int var69 = var68 >> 2;
                int var70 = var68 & 0x3;
                int var71 = class393.field5238[var69];
                int var72 = class680.field9630.method2544((byte) 125);
                int var73 = (var72 & 0x3DF8CA88) >> 28;
                int var74 = var72 >> 14 & 0x3FFF;
                int var75 = var74 - class682.field9685;
                int var76 = var72 & 0x3FFF;
                int var77 = var76 - class146.field1642;
                class452.method2534(var77, 114, var70, var73, var71, var75, var67, var69);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class179.field2216) {
                int var78 = class680.field9630.method2574(arg0 ^ 0x973042CD);
                int var79 = class680.field9630.method2541(arg0 - 17418);
                boolean var80 = (var79 & 0x1) == 1;
                while (class680.field9630.field6215 < class478.field7009) {
                    int var81 = class680.field9630.method2548(-29696);
                    int var82 = class680.field9630.method2574(-1758460248);
                    int var83 = 0;
                    if (var82 != 0) {
                        var83 = class680.field9630.method2541(105);
                        if (var83 == 255) {
                            var83 = class680.field9630.method2575((byte) -48);
                        }
                    }
                    class404.method2199(var82 - 1, false, var81, var83, var78, var80);
                }
                class655.field9354[class203.method1246(31, class221.field2783++)] = var78;
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class244.field3162) {
                class583.method3279(true, -1);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class259.field3299) {
                int var84 = class680.field9630.method2529(107);
                int var85 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(arg0 - 17410, var85)) {
                    class653.field9329 = var84;
                }
                class416.field5523 = null;
                return true;
            } else if (class80.field842 == class416.field5523) {
                int var86 = class680.field9630.method2558((byte) -115);
                String var87 = class680.field9630.method2516(81);
                int var88 = class680.field9630.method2532(false);
                if (class261.method1484(126, var88)) {
                    class373.method2046((byte) -19, var86, var87);
                }
                class416.field5523 = null;
                return true;
            } else if (class561.field7968 == class416.field5523) {
                int var89 = class680.field9630.method2574(-1758460248);
                if (var89 == 65535) {
                    var89 = -1;
                }
                int var90 = class680.field9630.method2541(55);
                int var91 = class680.field9630.method2574(arg0 - 1758477757);
                int var92 = class680.field9630.method2541(119);
                class58.method392(var90, var91, var92, false, var89, 0);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class385.field5146) {
                int var93 = class680.field9630.method2574(arg0 ^ 0x973042CD);
                if (var93 == 65535) {
                    var93 = -1;
                }
                int var94 = class680.field9630.method2541(66);
                int var95 = class680.field9630.method2574(-1758460248);
                int var96 = class680.field9630.method2541(108);
                class373.method2047(var94, var93, (byte) -12, var96, var95);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class104.field1133) {
                class596.field8455 = class680.field9630.method2563(-2263);
                class381.field4948 = class680.field9630.method2539(arg0 ^ 0xFFFFBBD4) << 3;
                class643.field9101 = class680.field9630.method2547(true) << 3;
                while (class680.field9630.field6215 < class478.field7009) {
                    class547 var97 = class635.method3557(-9002)[class680.field9630.method2541(101)];
                    class663.method3725(var97, (byte) 109);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class252.field3232) {
                int var98 = class680.field9630.method2541(115);
                boolean var99 = (var98 & 0x1) == 1;
                String var100 = class680.field9630.method2516(69);
                String var101 = class680.field9630.method2516(77);
                if (var101.equals("")) {
                    var101 = var100;
                }
                String var102 = class680.field9630.method2516(108);
                String var103 = class680.field9630.method2516(110);
                if (var103.equals("")) {
                    var103 = var102;
                }
                if (var99) {
                    for (int var104 = 0; var104 < class601.field8535; var104++) {
                        if (class13.field113[var104].equals(var103)) {
                            class278.field3521[var104] = var100;
                            class13.field113[var104] = var101;
                            class305.field3983[var104] = var102;
                            class30.field354[var104] = var103;
                            break;
                        }
                    }
                } else {
                    class278.field3521[class601.field8535] = var100;
                    class13.field113[class601.field8535] = var101;
                    class305.field3983[class601.field8535] = var102;
                    class30.field354[class601.field8535] = var103;
                    class54.field558[class601.field8535] = class203.method1246(2, var98) == 2;
                    class601.field8535++;
                }
                class416.field5523 = null;
                class491.field7117 = class204.field2494;
                return true;
            } else if (class449.field6189 == class416.field5523) {
                int var105 = class680.field9630.method2574(arg0 ^ 0x973042CD);
                int var106 = class680.field9630.method2558((byte) -88);
                int var107 = class680.field9630.method2563(-2263);
                int var108 = class680.field9630.method2542((byte) -70);
                int var109 = class680.field9630.method2533(262144);
                boolean var110 = (var107 & 0x80) != 0;
                if ((var109 >> 30) != 0) {
                    int var111 = (var109 & 0x3AB97BF2) >> 28;
                    int var112 = ((var109 & 0xFFFF71E) >> 14) - class682.field9685;
                    int var113 = (var109 & 0x3FFF) - class146.field1642;
                    if (var112 >= 0 && var113 >= 0 && class399.field5338 > var112 && class349.field4567 > var113) {
                        int var114 = var112 * 512 + 256;
                        int var115 = var113 * 512 + 256;
                        int var116 = var111;
                        if (var111 < 3 && class166.method996(var112, 30405, var113)) {
                            var116 = var111 + 1;
                        }
                        class132 var117 = new class132(var106, 0, class469.field6549, var111, var116, var114, class363.method1995(var111, var115, -1327568407, var114) - var105, var115, var112, var112, var113, var113, var107 & 0x7);
                        class369.field4792.method3164(new class319(var117), arg0 ^ 0x4565);
                    }
                } else if ((var109 >> 29) != 0) {
                    int var133 = var109 & 0xFFFF;
                    class443 var134 = (class443) class392.field5223.method3234((byte) -68, (long) var133);
                    if (var134 != null) {
                        class625 var135 = var134.field6107;
                        if (var106 == 65535) {
                            var106 = -1;
                        }
                        boolean var136 = true;
                        int var137 = var110 ? var135.field3785 : var135.field3774;
                        if (var106 != -1 && var137 != -1) {
                            if (var106 == var137) {
                                class135 var138 = class203.field2487.method2045((byte) -122, var106);
                                if (var138.field1520 && var138.field1516 != -1) {
                                    class576 var139 = class618.field8696.method124(24006, var138.field1516);
                                    int var140 = var139.field8217;
                                    if (var140 == 0 || var140 == 2) {
                                        var136 = false;
                                    } else if (var140 == 1) {
                                        var136 = true;
                                    }
                                }
                            } else {
                                class135 var141 = class203.field2487.method2045((byte) 27, var106);
                                class135 var142 = class203.field2487.method2045((byte) -128, var137);
                                if (var141.field1516 != -1 && var142.field1516 != -1) {
                                    class576 var143 = class618.field8696.method124(24006, var141.field1516);
                                    class576 var144 = class618.field8696.method124(24006, var142.field1516);
                                    if (var144.field8222 > var143.field8222) {
                                        var136 = false;
                                    }
                                }
                            }
                        }
                        if (var136) {
                            if (var110) {
                                var135.field3821 = 1;
                                var135.field3798 = var105;
                                var135.field3805 = var107 & 0x7;
                                var135.field3743 = 0;
                                var135.field3785 = var106;
                                var135.field3823 = 0;
                                var135.field3775 = class469.field6549 + var108;
                                if (class469.field6549 < var135.field3775) {
                                    var135.field3743 = -1;
                                }
                                if (var135.field3785 != -1 && class469.field6549 == var135.field3775) {
                                    int var145 = class203.field2487.method2045((byte) 15, var135.field3785).field1516;
                                    if (var145 != -1) {
                                        class576 var146 = class618.field8696.method124(24006, var145);
                                        if (var146 != null && var146.field8216 != null) {
                                            class259.method1473(var135.field4641, (byte) 1, var146, var135.field4647, var135.field4638, 0, false);
                                        }
                                    }
                                }
                            } else {
                                var135.field3813 = 0;
                                var135.field3801 = class469.field6549 + var108;
                                var135.field3793 = 1;
                                var135.field3828 = var107 & 0x7;
                                var135.field3774 = var106;
                                var135.field3804 = 0;
                                var135.field3814 = var105;
                                if (var135.field3801 > class469.field6549) {
                                    var135.field3813 = -1;
                                }
                                if (var135.field3774 != -1 && class469.field6549 == var135.field3801) {
                                    int var147 = class203.field2487.method2045((byte) 56, var135.field3774).field1516;
                                    if (var147 != -1) {
                                        class576 var148 = class618.field8696.method124(arg0 + 6497, var147);
                                        if (var148 != null && var148.field8216 != null) {
                                            class259.method1473(var135.field4641, (byte) 1, var148, var135.field4647, var135.field4638, 0, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ((var109 >> 28) != 0) {
                    int var118 = var109 & 0xFFFF;
                    class455 var119;
                    if (class90.field1038 == var118) {
                        var119 = class377.field4914;
                    } else {
                        var119 = class362.field4726[var118];
                    }
                    if (var119 != null) {
                        if (var106 == 65535) {
                            var106 = -1;
                        }
                        boolean var120 = true;
                        int var121 = var110 ? var119.field3785 : var119.field3774;
                        if (var106 != -1 && var121 != -1) {
                            if (var106 == var121) {
                                class135 var126 = class203.field2487.method2045((byte) -44, var106);
                                if (var126.field1520 && var126.field1516 != -1) {
                                    class576 var127 = class618.field8696.method124(24006, var126.field1516);
                                    int var128 = var127.field8217;
                                    if (var128 == 0 || var128 == 2) {
                                        var120 = false;
                                    } else if (var128 == 1) {
                                        var120 = true;
                                    }
                                }
                            } else {
                                class135 var122 = class203.field2487.method2045((byte) -125, var106);
                                class135 var123 = class203.field2487.method2045((byte) 74, var121);
                                if (var122.field1516 != -1 && var123.field1516 != -1) {
                                    class576 var124 = class618.field8696.method124(24006, var122.field1516);
                                    class576 var125 = class618.field8696.method124(arg0 ^ 0x19A3, var123.field1516);
                                    if (var124.field8222 < var125.field8222) {
                                        var120 = false;
                                    }
                                }
                            }
                        }
                        if (var120) {
                            if (var110) {
                                var119.field3798 = var105;
                                var119.field3805 = var107 & 0x7;
                                var119.field3743 = 0;
                                var119.field3775 = class469.field6549 + var108;
                                var119.field3785 = var106;
                                var119.field3821 = 1;
                                var119.field3823 = 0;
                                if (var119.field3785 == 65535) {
                                    var119.field3785 = -1;
                                }
                                if (class469.field6549 < var119.field3775) {
                                    var119.field3743 = -1;
                                }
                                if (var119.field3785 != -1 && class469.field6549 == var119.field3775) {
                                    int var131 = class203.field2487.method2045((byte) -15, var119.field3785).field1516;
                                    if (var131 != -1) {
                                        class576 var132 = class618.field8696.method124(24006, var131);
                                        if (var132 != null && var132.field8216 != null) {
                                            class259.method1473(var119.field4641, (byte) 1, var132, var119.field4647, var119.field4638, 0, class377.field4914 == var119);
                                        }
                                    }
                                }
                            } else {
                                var119.field3813 = 0;
                                var119.field3801 = class469.field6549 + var108;
                                var119.field3804 = 0;
                                var119.field3814 = var105;
                                var119.field3774 = var106;
                                var119.field3793 = 1;
                                var119.field3828 = var107 & 0x7;
                                if (var119.field3774 == 65535) {
                                    var119.field3774 = -1;
                                }
                                if (var119.field3801 > class469.field6549) {
                                    var119.field3813 = -1;
                                }
                                if (var119.field3774 != -1 && class469.field6549 == var119.field3801) {
                                    int var129 = class203.field2487.method2045((byte) 101, var119.field3774).field1516;
                                    if (var129 != -1) {
                                        class576 var130 = class618.field8696.method124(24006, var129);
                                        if (var130 != null && var130.field8216 != null) {
                                            class259.method1473(var119.field4641, (byte) 1, var130, var119.field4647, var119.field4638, 0, class377.field4914 == var119);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class676.field9581 == class416.field5523) {
                class663.method3725(class403.field5365, (byte) 108);
                class416.field5523 = null;
                return true;
            } else if (class692.field9749 == class416.field5523) {
                if (class521.method2973(arg0 - 17502, class351.field4601)) {
                    class588.field8361 = (int) ((float) class680.field9630.method2574(-1758460248) * 2.5F);
                } else {
                    class588.field8361 = class680.field9630.method2574(arg0 - 1758477757) * 30;
                }
                class369.field4790 = class204.field2494;
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class278.field3518) {
                int var149 = class680.field9630.method2558((byte) -104);
                int var150 = class680.field9630.method2574(-1758460248);
                int var151 = class680.field9630.method2575((byte) -48);
                int var152 = class680.field9630.method2574(-1758460248);
                int var153 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(123, var152)) {
                    class685.method3814(false, 7, var153, var150 << 16 | var149, var151);
                }
                class416.field5523 = null;
                return true;
            } else if (class474.field6909 == class416.field5523) {
                for (int var154 = 0; var154 < class362.field4726.length; var154++) {
                    if (class362.field4726[var154] != null) {
                        class362.field4726[var154].field3778 = -1;
                    }
                }
                for (int var155 = 0; var155 < class208.field2528; var155++) {
                    class609.field8605[var155].field6107.field3778 = -1;
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class347.field4518) {
                class375.field4874 = class204.field2494;
                if (class478.field7009 == 0) {
                    class651.field9313 = null;
                    class37.field414 = null;
                    class416.field5523 = null;
                    class387.field5170 = null;
                    class525.field7506 = 0;
                    return true;
                }
                class651.field9313 = class680.field9630.method2516(68);
                boolean var156 = class680.field9630.method2541(arg0 - 17394) == 1;
                if (var156) {
                    class680.field9630.method2516(113);
                }
                long var157 = class680.field9630.method2510((byte) 38);
                class387.field5170 = class9.method53(arg0 ^ 0xCC61, var157);
                class164.field1969 = class680.field9630.method2547(true);
                int var159 = class680.field9630.method2541(45);
                if (var159 == 255) {
                    class416.field5523 = null;
                    return true;
                }
                class525.field7506 = var159;
                class538[] var160 = new class538[100];
                for (int var161 = 0; var161 < class525.field7506; var161++) {
                    var160[var161] = new class538();
                    var160[var161].field7749 = class680.field9630.method2516(68);
                    boolean var167 = class680.field9630.method2541(106) == 1;
                    if (var167) {
                        var160[var161].field7750 = class680.field9630.method2516(117);
                    } else {
                        var160[var161].field7750 = var160[var161].field7749;
                    }
                    var160[var161].field7747 = class487.method2819(2, var160[var161].field7750);
                    var160[var161].field7746 = class680.field9630.method2574(-1758460248);
                    var160[var161].field7748 = class680.field9630.method2547(true);
                    var160[var161].field7743 = class680.field9630.method2516(120);
                    if (var160[var161].field7750.equals(class377.field4914.field6324)) {
                        class470.field6564 = var160[var161].field7748;
                    }
                }
                boolean var162 = false;
                int var163 = class525.field7506;
                while (var163 > 0) {
                    var163--;
                    boolean var164 = true;
                    for (int var165 = 0; var165 < var163; var165++) {
                        if (var160[var165].field7747.compareTo(var160[var165 + 1].field7747) > 0) {
                            class538 var166 = var160[var165];
                            var160[var165] = var160[var165 + 1];
                            var164 = false;
                            var160[var165 + 1] = var166;
                        }
                    }
                    if (var164) {
                        break;
                    }
                }
                class37.field414 = var160;
                class416.field5523 = null;
                return true;
            } else if (class549.field7838 == class416.field5523) {
                class184.method1069(false, class662.field9407);
                class416.field5523 = null;
                return false;
            } else if (class583.field8297 == class416.field5523) {
                int var168 = class680.field9630.method2542((byte) 102);
                int var169 = class680.field9630.method2553(arg0 - 209443293);
                boolean var170 = (var169 & 0x1) == 1;
                class624.method3493(2, var168, var170);
                class655.field9354[class203.method1246(31, class221.field2783++)] = var168;
                class416.field5523 = null;
                return true;
            } else if (class65.field690 == class416.field5523) {
                class41.field433 = class680.field9630.method2528((byte) -115);
                class89.field946 = class680.field9630.method2541(arg0 - 17399) == 1;
                class416.field5523 = null;
                return true;
            } else if (class503.field7237 == class416.field5523) {
                String var171 = class680.field9630.method2516(98);
                int var172 = class680.field9630.method2574(arg0 ^ 0x973042CD);
                String var173 = class58.field599.method1516(0, var172).method2789(class680.field9630, 119);
                class412.method2231(19, var171, var171, var173, var172, null, var171, -20468, 0);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class213.field2568) {
                int var174 = class680.field9630.method2574(-1758460248);
                int var175 = class680.field9630.method2541(arg0 ^ 0x4430);
                int var176 = class680.field9630.method2541(42);
                int var177 = class680.field9630.method2574(-1758460248) << 2;
                int var178 = class680.field9630.method2541(41);
                int var179 = class680.field9630.method2541(arg0 - 17458);
                if (class261.method1484(92, var174)) {
                    class177.method1038(var179, var176, var177, var178, -114, var175);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class266.field3356) {
                int var180 = class680.field9630.method2574(-1758460248);
                int var181 = class680.field9630.method2541(arg0 ^ 0x4444);
                int var182 = class680.field9630.method2541(106);
                int var183 = class680.field9630.method2541(51);
                int var184 = class680.field9630.method2541(106);
                int var185 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(81, var180)) {
                    class347.field4528[var181] = true;
                    class145.field1626[var181] = var182;
                    class306.field3999[var181] = var183;
                    class445.field6124[var181] = var184;
                    class381.field4953[var181] = var185;
                }
                class416.field5523 = null;
                return true;
            } else if (class438.field6097 == class416.field5523) {
                int var186 = class680.field9630.method2541(116);
                int var187 = class680.field9630.method2544((byte) 89);
                int var188 = class680.field9630.method2532(false);
                if (class261.method1484(arg0 - 17401, var188)) {
                    class17.method69((byte) -73, var187, var186);
                }
                class416.field5523 = null;
                return true;
            } else if (class692.field9751 == class416.field5523) {
                int var189 = class680.field9630.method2541(44);
                int var190 = var189 >> 5;
                int var191 = var189 & 0x1F;
                if (var191 == 0) {
                    class81.field863[var190] = null;
                    class416.field5523 = null;
                    return true;
                }
                class492 var192 = new class492();
                var192.field7141 = var191;
                var192.field7135 = class680.field9630.method2541(109);
                if (var192.field7135 >= 0 && var192.field7135 < class2.field20.length) {
                    if (var192.field7141 == 1 || var192.field7141 == 10) {
                        var192.field7134 = class680.field9630.method2574(-1758460248);
                        class680.field9630.field6215 += 6;
                    } else if (var192.field7141 >= 2 && var192.field7141 <= 6) {
                        if (var192.field7141 == 2) {
                            var192.field7144 = 256;
                            var192.field7139 = 256;
                        }
                        if (var192.field7141 == 3) {
                            var192.field7139 = 0;
                            var192.field7144 = 256;
                        }
                        if (var192.field7141 == 4) {
                            var192.field7139 = 512;
                            var192.field7144 = 256;
                        }
                        if (var192.field7141 == 5) {
                            var192.field7139 = 256;
                            var192.field7144 = 0;
                        }
                        if (var192.field7141 == 6) {
                            var192.field7139 = 256;
                            var192.field7144 = 512;
                        }
                        var192.field7141 = 2;
                        var192.field7138 = class680.field9630.method2541(arg0 ^ 0x444E);
                        var192.field7139 += class680.field9630.method2574(-1758460248) - class682.field9685 << 9;
                        var192.field7144 += class680.field9630.method2574(-1758460248) - class146.field1642 << 9;
                        var192.field7140 = class680.field9630.method2541(118) << 2;
                        var192.field7137 = class680.field9630.method2574(arg0 - 1758477757);
                    }
                    var192.field7143 = class680.field9630.method2574(-1758460248);
                    if (var192.field7143 == 65535) {
                        var192.field7143 = -1;
                    }
                    class81.field863[var190] = var192;
                }
                class416.field5523 = null;
                return true;
            } else if (class461.field6403 == class416.field5523) {
                class416.field5526 = class680.field9630.method2541(64);
                class369.field4790 = class204.field2494;
                class416.field5523 = null;
                return true;
            } else if (class647.field9150 == class416.field5523) {
                int var193 = class680.field9630.method2532(false);
                int var194 = class680.field9630.method2558((byte) -51);
                byte var195 = class680.field9630.method2555((byte) -26);
                if (class261.method1484(127, var194)) {
                    class232.method1350(var193, -97, var195);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class348.field4542) {
                String var196 = class680.field9630.method2516(95);
                boolean var197 = class680.field9630.method2541(arg0 - 17460) == 1;
                String var198;
                if (var197) {
                    var198 = class680.field9630.method2516(88);
                } else {
                    var198 = var196;
                }
                int var199 = class680.field9630.method2574(arg0 - 1758477757);
                byte var200 = class680.field9630.method2547(true);
                boolean var201 = false;
                if (var200 == -128) {
                    var201 = true;
                }
                if (var201) {
                    if (class525.field7506 == 0) {
                        class416.field5523 = null;
                        return true;
                    }
                    boolean var202 = false;
                    int var203;
                    for (var203 = 0; class525.field7506 > var203 && (!class37.field414[var203].field7750.equals(var198) || class37.field414[var203].field7746 != var199); var203++) {
                    }
                    if (var203 < class525.field7506) {
                        while ((class525.field7506 - 1) > var203) {
                            class37.field414[var203] = class37.field414[var203 + 1];
                            var203++;
                        }
                        class525.field7506--;
                        class37.field414[class525.field7506] = null;
                    }
                } else {
                    String var204 = class680.field9630.method2516(66);
                    class538 var205 = new class538();
                    var205.field7750 = var198;
                    var205.field7749 = var196;
                    var205.field7747 = class487.method2819(2, var205.field7750);
                    var205.field7743 = var204;
                    var205.field7748 = var200;
                    var205.field7746 = var199;
                    int var206;
                    for (var206 = class525.field7506 - 1; var206 >= 0; var206--) {
                        int var207 = class37.field414[var206].field7747.compareTo(var205.field7747);
                        if (var207 == 0) {
                            class37.field414[var206].field7746 = var199;
                            class37.field414[var206].field7748 = var200;
                            class37.field414[var206].field7743 = var204;
                            if (var198.equals(class377.field4914.field6324)) {
                                class470.field6564 = var200;
                            }
                            class375.field4874 = class204.field2494;
                            class416.field5523 = null;
                            return true;
                        }
                        if (var207 < 0) {
                            break;
                        }
                    }
                    if (class525.field7506 >= class37.field414.length) {
                        class416.field5523 = null;
                        return true;
                    }
                    for (int var208 = class525.field7506 - 1; var208 > var206; var208--) {
                        class37.field414[var208 + 1] = class37.field414[var208];
                    }
                    if (class525.field7506 == 0) {
                        class37.field414 = new class538[100];
                    }
                    class37.field414[var206 + 1] = var205;
                    class525.field7506++;
                    if (var198.equals(class377.field4914.field6324)) {
                        class470.field6564 = var200;
                    }
                }
                class416.field5523 = null;
                class375.field4874 = class204.field2494;
                return true;
            } else if (class416.field5523 == class372.field4830) {
                while (class680.field9630.field6215 < class478.field7009) {
                    boolean var219 = class680.field9630.method2541(45) == 1;
                    String var220 = class680.field9630.method2516(125);
                    String var221 = class680.field9630.method2516(91);
                    int var222 = class680.field9630.method2574(-1758460248);
                    int var223 = class680.field9630.method2541(127);
                    String var224 = "";
                    boolean var225 = false;
                    if (var222 > 0) {
                        var224 = class680.field9630.method2516(110);
                        var225 = class680.field9630.method2541(arg0 - 17410) == 1;
                    }
                    for (int var226 = 0; var226 < class210.field2549; var226++) {
                        if (var219) {
                            if (var221.equals(class314.field4077[var226])) {
                                class314.field4077[var226] = var220;
                                var220 = null;
                                class485.field7061[var226] = var221;
                                break;
                            }
                        } else if (var220.equals(class314.field4077[var226])) {
                            if (class270.field3396[var226] != var222) {
                                boolean var227 = true;
                                for (class399 var228 = (class399) class127.field1450.method93((byte) 58); var228 != null; var228 = (class399) class127.field1450.method92(0)) {
                                    if (var228.field5330.equals(var220)) {
                                        if (var222 != 0 && var228.field5331 == 0) {
                                            var227 = false;
                                            var228.method1374((byte) -63);
                                        } else if (var222 == 0 && var228.field5331 != 0) {
                                            var227 = false;
                                            var228.method1374((byte) -115);
                                        }
                                    }
                                }
                                if (var227) {
                                    class127.field1450.method87(arg0 - 17397, new class399(var220, var222));
                                }
                                class270.field3396[var226] = var222;
                            }
                            class485.field7061[var226] = var221;
                            class118.field1353[var226] = var224;
                            class417.field5534[var226] = var223;
                            class520.field7452[var226] = var225;
                            var220 = null;
                            break;
                        }
                    }
                    if (var220 != null && class210.field2549 < 200) {
                        class314.field4077[class210.field2549] = var220;
                        class485.field7061[class210.field2549] = var221;
                        class270.field3396[class210.field2549] = var222;
                        class118.field1353[class210.field2549] = var224;
                        class417.field5534[class210.field2549] = var223;
                        class520.field7452[class210.field2549] = var225;
                        class210.field2549++;
                    }
                }
                class491.field7115 = 2;
                class491.field7117 = class204.field2494;
                boolean var209 = false;
                int var210 = class210.field2549;
                while (var210 > 0) {
                    boolean var211 = true;
                    var210--;
                    for (int var212 = 0; var212 < var210; var212++) {
                        if (class270.field3396[var212] != class277.field3494.field3986 && class270.field3396[var212 + 1] == class277.field3494.field3986 || class270.field3396[var212] == 0 && class270.field3396[var212 + 1] != 0) {
                            int var213 = class270.field3396[var212];
                            class270.field3396[var212] = class270.field3396[var212 + 1];
                            class270.field3396[var212 + 1] = var213;
                            String var214 = class118.field1353[var212];
                            class118.field1353[var212] = class118.field1353[var212 + 1];
                            class118.field1353[var212 + 1] = var214;
                            String var215 = class314.field4077[var212];
                            class314.field4077[var212] = class314.field4077[var212 + 1];
                            class314.field4077[var212 + 1] = var215;
                            String var216 = class485.field7061[var212];
                            class485.field7061[var212] = class485.field7061[var212 + 1];
                            class485.field7061[var212 + 1] = var216;
                            int var217 = class417.field5534[var212];
                            class417.field5534[var212] = class417.field5534[var212 + 1];
                            class417.field5534[var212 + 1] = var217;
                            boolean var218 = class520.field7452[var212];
                            class520.field7452[var212] = class520.field7452[var212 + 1];
                            class520.field7452[var212 + 1] = var218;
                            var211 = false;
                        }
                    }
                    if (var211) {
                        break;
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class292.field3815) {
                class381.method2085((byte) -90);
                class416.field5523 = null;
                return false;
            } else if (class416.field5523 == class170.field2040) {
                int var229 = class680.field9630.method2544((byte) 95);
                int var230 = class680.field9630.method2574(-1758460248);
                int var231 = class680.field9630.method2532(false);
                int var232 = class680.field9630.method2529(arg0 - 17391);
                if (class261.method1484(arg0 ^ 0x4401, var231)) {
                    class454 var233 = (class454) class234.field2982.method3234((byte) -86, (long) var229);
                    if (var233 != null) {
                        class39.method204(var233.field6291 != var230, arg0 ^ 0xFFFFCBE4, false, var233);
                    }
                    class122.method716(-35, var232, false, var230, var229);
                }
                class416.field5523 = null;
                return true;
            } else if (class645.field9141 == class416.field5523) {
                int var234 = class680.field9630.method2560(-1);
                int var235 = class680.field9630.method2532(false);
                int var236 = class680.field9630.method2542((byte) -83);
                if (class261.method1484(arg0 - 17387, var236)) {
                    class330.method1860(14, var234, var235);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class11.field110) {
                class347.method1926(true, class680.field9630.method2516(105));
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class112.field1303) {
                boolean var237 = class680.field9630.method2541(arg0 - 17472) == 1;
                String var238 = class680.field9630.method2516(arg0 ^ 0x443D);
                String var239 = var238;
                if (var237) {
                    var239 = class680.field9630.method2516(94);
                }
                long var240 = class680.field9630.method2510((byte) 38);
                long var242 = (long) class680.field9630.method2574(-1758460248);
                long var244 = (long) class680.field9630.method2524(3);
                int var246 = class680.field9630.method2541(61);
                long var247 = (var242 << 32) + var244;
                boolean var249 = false;
                int var250 = 0;
                while (true) {
                    if (var250 >= 100) {
                        if (var246 <= 1) {
                            if (!(!class89.field946 || class539.field7752) || class198.field2403) {
                                var249 = true;
                            } else if (class396.method2159(true, var239)) {
                                var249 = true;
                            }
                        }
                        break;
                    }
                    if (class229.field2913[var250] == var247) {
                        var249 = true;
                        break;
                    }
                    var250++;
                }
                if (!var249 && class328.field4264 == 0) {
                    class229.field2913[class545.field7802] = var247;
                    class545.field7802 = (class545.field7802 + 1) % 100;
                    String var251 = class470.method2663(true, class460.method2623(class680.field9630, (byte) -125));
                    if (var246 == 2 || var246 == 3) {
                        class412.method2231(9, "<img=1>" + var239, "<img=1>" + var238, var251, -1, class133.method746(var240, (byte) 18), var238, arg0 ^ 0xFFFFF469, 0);
                    } else if (var246 == 1) {
                        class412.method2231(9, "<img=0>" + var239, "<img=0>" + var238, var251, -1, class133.method746(var240, (byte) 18), var238, arg0 ^ 0xFFFFF469, 0);
                    } else {
                        class412.method2231(9, var239, var238, var251, -1, class133.method746(var240, (byte) 18), var238, -20468, 0);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class673.field9563 == class416.field5523) {
                int var252 = class680.field9630.method2533(262144);
                int var253 = class680.field9630.method2542((byte) -78);
                int var254 = class680.field9630.method2558((byte) -115);
                if (var254 == 65535) {
                    var254 = -1;
                }
                if (class261.method1484(arg0 ^ 0x4408, var253)) {
                    class634.method3544(var252, 0, var254);
                }
                class416.field5523 = null;
                return true;
            } else if (class623.field8831 == class416.field5523) {
                int var255 = class680.field9630.method2533(262144);
                int var256 = class680.field9630.method2515(arg0 - 17396);
                int var257 = class680.field9630.method2532(false);
                if (class261.method1484(96, var257)) {
                    class539.method3069(var256, false, var255);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class284.field3599) {
                boolean var258 = class680.field9630.method2541(arg0 - 17388) == 1;
                String var259 = class680.field9630.method2516(arg0 - 17382);
                String var260 = var259;
                if (var258) {
                    var260 = class680.field9630.method2516(112);
                }
                long var261 = (long) class680.field9630.method2574(-1758460248);
                long var263 = (long) class680.field9630.method2524(3);
                int var265 = class680.field9630.method2541(127);
                long var266 = (var261 << 32) + var263;
                boolean var268 = false;
                int var269 = 0;
                while (true) {
                    if (var269 >= 100) {
                        if (var265 <= 1) {
                            if (!(!class89.field946 || class539.field7752) || class198.field2403) {
                                var268 = true;
                            } else if (class396.method2159(true, var260)) {
                                var268 = true;
                            }
                        }
                        break;
                    }
                    if (class229.field2913[var269] == var266) {
                        var268 = true;
                        break;
                    }
                    var269++;
                }
                if (!var268 && class328.field4264 == 0) {
                    class229.field2913[class545.field7802] = var266;
                    class545.field7802 = (class545.field7802 + 1) % 100;
                    String var270 = class470.method2663(true, class460.method2623(class680.field9630, (byte) -125));
                    if (var265 == 2) {
                        class412.method2231(7, "<img=1>" + var260, "<img=1>" + var259, var270, -1, null, var259, -20468, 0);
                    } else if (var265 == 1) {
                        class412.method2231(7, "<img=0>" + var260, "<img=0>" + var259, var270, -1, null, var259, -20468, 0);
                    } else {
                        class412.method2231(3, var260, var259, var270, -1, null, var259, -20468, 0);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class677.field9593 == class416.field5523) {
                if (class397.field5320 != -1) {
                    class62.method422((byte) -120, class397.field5320, 0);
                }
                class416.field5523 = null;
                return true;
            } else if (class625.field8868 == class416.field5523) {
                int var271 = class680.field9630.method2558((byte) -34);
                int var272 = class680.field9630.method2558((byte) -37);
                int var273 = class680.field9630.method2558((byte) -83);
                if (class261.method1484(95, var272)) {
                    class585.method3290(var273, -4097, 0, var271);
                }
                class416.field5523 = null;
                return true;
            } else if (class515.field7366 == class416.field5523) {
                int var274 = class680.field9630.method2558((byte) -73);
                if (var274 == 65535) {
                    var274 = -1;
                }
                int var275 = class680.field9630.method2541(119);
                int var276 = class680.field9630.method2529(106);
                class572.method3231(var276, (byte) 30, var275, var274);
                class416.field5523 = null;
                return true;
            } else if (class447.field6138 == class416.field5523) {
                int var277 = class680.field9630.method2563(-2263);
                int var278 = class680.field9630.method2532(false);
                if (var278 == 65535) {
                    var278 = -1;
                }
                int var279 = class680.field9630.method2543(3);
                class136.method762(var278, 0, var277, var279);
                class416.field5523 = null;
                return true;
            } else if (class552.field7869 == class416.field5523) {
                class580.field8248 = class478.field7009 <= 2 ? class221.field2745.method1296(class226.field2899, (byte) -107) : class680.field9630.method2516(89);
                class552.field7867 = class478.field7009 > 0 ? class680.field9630.method2574(-1758460248) : -1;
                if (class552.field7867 == 65535) {
                    class552.field7867 = -1;
                }
                class416.field5523 = null;
                return true;
            } else if (class516.field7388 == class416.field5523) {
                int var280 = class680.field9630.method2574(-1758460248);
                byte var281 = class680.field9630.method2547(true);
                class491.field7127.method1379(arg0 + 3508, var281, var280);
                class416.field5523 = null;
                return true;
            } else if (class526.field7519 == class416.field5523) {
                class663.method3725(class284.field3603, (byte) 119);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class250.field3226) {
                int var282 = class680.field9630.method2574(arg0 - 1758477757);
                int var283 = class680.field9630.method2533(262144);
                if (class261.method1484(arg0 ^ 0x4403, var282)) {
                    class685.method3814(false, 5, 0, class90.field1038, var283);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class18.field157) {
                int var284 = class680.field9630.method2575((byte) -48);
                int var285 = class680.field9630.method2542((byte) 100);
                int var286 = class680.field9630.method2574(-1758460248);
                int var287 = class680.field9630.method2544((byte) 79);
                if (class261.method1484(99, var286)) {
                    class685.method3814(false, 5, var287, var285, var284);
                }
                class416.field5523 = null;
                return true;
            } else if (class482.field7054 == class416.field5523) {
                class550.field7847 = class680.field9630.method2541(51);
                class416.field5523 = null;
                return true;
            } else if (class484.field7056 == class416.field5523) {
                int var288 = class680.field9630.method2574(-1758460248);
                int var289 = class680.field9630.method2575((byte) -48);
                if (class261.method1484(90, var288)) {
                    class454 var290 = (class454) class234.field2982.method3234((byte) -74, (long) var289);
                    if (var290 != null) {
                        class39.method204(true, -28799, false, var290);
                    }
                    if (class418.field5557 != null) {
                        class567.method3207((byte) -69, class418.field5557);
                        class418.field5557 = null;
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class443.field6111 == class416.field5523) {
                int var291 = class680.field9630.method2548(-29696);
                int var292 = class680.field9630.method2575((byte) -48);
                int var293 = class680.field9630.method2541(72);
                String var294 = "";
                String var295 = var294;
                if ((var293 & 0x1) != 0) {
                    var294 = class680.field9630.method2516(110);
                    if ((var293 & 0x2) == 0) {
                        var295 = var294;
                    } else {
                        var295 = class680.field9630.method2516(107);
                    }
                }
                String var296 = class680.field9630.method2516(arg0 - 17432);
                if (var291 == 99) {
                    class446.method2473(var296, (byte) 124);
                } else if (var295.equals("") || !class396.method2159(true, var295)) {
                    method1809(var294, var291, (byte) 124, var295, var294, var292, var296);
                } else {
                    class416.field5523 = null;
                    return true;
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class108.field1257) {
                int var297 = class680.field9630.method2532(false);
                int var298 = class680.field9630.method2533(arg0 + 244635);
                int var299 = class680.field9630.method2558((byte) -86);
                int var300 = class680.field9630.method2542((byte) -92);
                if (class261.method1484(arg0 ^ 0x4407, var300)) {
                    class70.method461(var298, arg0 - 17634, (var297 << 16) + var299);
                }
                class416.field5523 = null;
                return true;
            } else if (class677.field9591 == class416.field5523) {
                class663.method3725(class551.field7860, (byte) 102);
                class416.field5523 = null;
                return true;
            } else if (class59.field611 == class416.field5523) {
                int var301 = class680.field9630.method2544((byte) 105);
                int var302 = class680.field9630.method2532(false);
                int var303 = class680.field9630.method2532(false);
                if (class261.method1484(105, var302)) {
                    class90.method572(var303, -64, var301);
                }
                class416.field5523 = null;
                return true;
            } else if (class583.field8289 == class416.field5523) {
                class278.method1587(class680.field9630, -2, class623.field8837, class478.field7009);
                class416.field5523 = null;
                return true;
            } else if (class622.field8827 == class416.field5523) {
                int var304 = class680.field9630.method2574(-1758460248);
                if (var304 == 65535) {
                    var304 = -1;
                }
                int var305 = class680.field9630.method2541(88);
                int var306 = class680.field9630.method2574(-1758460248);
                int var307 = class680.field9630.method2541(75);
                class58.method392(var305, var306, var307, true, var304, 0);
                class416.field5523 = null;
                return true;
            } else if (class471.field6579 == class416.field5523) {
                int var308 = class680.field9630.method2574(-1758460248);
                int var309 = class680.field9630.method2541(116);
                boolean var310 = (var309 & 0x1) == 1;
                class451.method2506(var310, (byte) -89, var308);
                int var311 = class680.field9630.method2574(arg0 ^ 0x973042CD);
                for (int var312 = 0; var312 < var311; var312++) {
                    int var313 = class680.field9630.method2529(107);
                    if (var313 == 255) {
                        var313 = class680.field9630.method2560(arg0 ^ 0xFFFFBB9A);
                    }
                    int var314 = class680.field9630.method2574(-1758460248);
                    class404.method2199(var314 - 1, false, var312, var313, var308, var310);
                }
                class655.field9354[class203.method1246(class221.field2783++, 31)] = var308;
                class416.field5523 = null;
                return true;
            } else if (class634.field8976 == class416.field5523) {
                boolean var315 = class680.field9630.method2541(arg0 - 17457) == 1;
                String var316 = class680.field9630.method2516(64);
                String var317 = var316;
                if (var315) {
                    var317 = class680.field9630.method2516(arg0 ^ 0x442C);
                }
                long var318 = (long) class680.field9630.method2574(-1758460248);
                long var320 = (long) class680.field9630.method2524(arg0 - 17506);
                int var322 = class680.field9630.method2541(117);
                int var323 = class680.field9630.method2574(-1758460248);
                long var324 = (var318 << 32) + var320;
                boolean var326 = false;
                int var327 = 0;
                while (true) {
                    if (var327 >= 100) {
                        if (var322 <= 1 && class396.method2159(true, var317)) {
                            var326 = true;
                        }
                        break;
                    }
                    if (class229.field2913[var327] == var324) {
                        var326 = true;
                        break;
                    }
                    var327++;
                }
                if (!var326 && class328.field4264 == 0) {
                    class229.field2913[class545.field7802] = var324;
                    class545.field7802 = (class545.field7802 + 1) % 100;
                    String var328 = class58.field599.method1516(0, var323).method2789(class680.field9630, 117);
                    if (var322 == 2) {
                        class412.method2231(18, "<img=1>" + var317, "<img=1>" + var316, var328, var323, null, var316, -20468, 0);
                    } else if (var322 == 1) {
                        class412.method2231(18, "<img=0>" + var317, "<img=0>" + var316, var328, var323, null, var316, -20468, 0);
                    } else {
                        class412.method2231(18, var317, var316, var328, var323, null, var316, -20468, 0);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class513.field7341 == class416.field5523) {
                class663.method3725(class617.field8682, (byte) 115);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class249.field3195) {
                int var329 = class680.field9630.method2542((byte) 57);
                int var330 = class680.field9630.method2515(106);
                int var331 = class680.field9630.method2515(125);
                int var332 = class680.field9630.method2560(-1);
                if (class261.method1484(120, var329)) {
                    class398.method2183(var330, -28751, var332, var331);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class266.field3349) {
                class382.field4969 = class680.field9630.method2549((byte) 32);
                class416.field5523 = null;
                class369.field4790 = class204.field2494;
                return true;
            } else if (class416.field5523 == class157.field1765) {
                class643.field9101 = class680.field9630.method2547(true) << 3;
                class596.field8455 = class680.field9630.method2529(arg0 - 17398);
                class381.field4948 = class680.field9630.method2555((byte) -26) << 3;
                for (class43 var333 = (class43) class152.field1725.method3232(-1); var333 != null; var333 = (class43) class152.field1725.method3236(arg0 - 45155)) {
                    int var335 = (int) (var333.field3405 >> 28 & 0x3L);
                    int var336 = (int) (var333.field3405 & 0x3FFFL);
                    int var337 = var336 - class682.field9685;
                    int var338 = (int) (var333.field3405 >> 14 & 0x3FFFL);
                    int var339 = var338 - class146.field1642;
                    if (class596.field8455 == var335 && var337 >= class643.field9101 && class643.field9101 + 8 > var337 && class381.field4948 <= var339 && var339 < (class381.field4948 + 8)) {
                        var333.method1519((byte) 121);
                        if (var337 >= 0 && var339 >= 0 && var337 < class399.field5338 && class349.field4567 > var339) {
                            class268.method1513(var337, class596.field8455, (byte) -65, var339);
                        }
                    }
                }
                for (class595 var334 = (class595) class454.field6292.method3174((byte) 49); var334 != null; var334 = (class595) class454.field6292.method3168(false)) {
                    if (var334.field8445 >= class643.field9101 && var334.field8445 < (class643.field9101 + 8) && var334.field8448 >= class381.field4948 && var334.field8448 < class381.field4948 + 8 && class596.field8455 == var334.field8443) {
                        var334.field8439 = 0;
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class146.field1640) {
                int var340 = class680.field9630.method2575((byte) -48);
                int var341 = class680.field9630.method2532(false);
                int var342 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(114, var341)) {
                    class499.method2871((byte) -111, var342, var340);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class206.field2510) {
                if (class680.field9649 != null) {
                    class472.method2676(class601.field8530.field2869, -1, 0, false, -1);
                }
                byte[] var343 = new byte[class478.field7009];
                class680.field9630.method3458(var343, class478.field7009, (byte) -10, 0);
                String var344 = class37.method200(class478.field7009, 0, 0, var343);
                class566.method3202(class623.field8837, true, 48, var344, class150.field1711 == 1);
                class416.field5523 = null;
                return true;
            } else if (class454.field6298 == class416.field5523) {
                boolean var345 = class680.field9630.method2541(36) == 1;
                String var346 = class680.field9630.method2516(83);
                String var347 = var346;
                if (var345) {
                    var347 = class680.field9630.method2516(100);
                }
                int var348 = class680.field9630.method2541(101);
                int var349 = class680.field9630.method2574(-1758460248);
                boolean var350 = false;
                if (var348 <= 1 && class396.method2159(true, var347)) {
                    var350 = true;
                }
                if (!var350 && class328.field4264 == 0) {
                    String var351 = class58.field599.method1516(0, var349).method2789(class680.field9630, 115);
                    if (var348 == 2) {
                        class412.method2231(25, "<img=1>" + var347, "<img=1>" + var346, var351, var349, null, var346, -20468, 0);
                    } else if (var348 == 1) {
                        class412.method2231(25, "<img=0>" + var347, "<img=0>" + var346, var351, var349, null, var346, -20468, 0);
                    } else {
                        class412.method2231(25, var347, var346, var351, var349, null, var346, -20468, 0);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class396.field5273) {
                int var352 = class680.field9630.method2553(-209425784);
                int var353 = class680.field9630.method2553(-209425784);
                int var354 = class680.field9630.method2533(262144);
                class238.field3006[var353] = var354;
                class80.field851[var353] = var352;
                class370.field4801[var353] = 1;
                int var355 = class126.field1425[var353] - 1;
                for (int var356 = 0; var356 < var355; var356++) {
                    if (class163.field1939[var356] <= var354) {
                        class370.field4801[var353] = var356 + 2;
                    }
                }
                class200.field2448[class203.method1246(31, class135.field1540++)] = var353;
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class194.field2333) {
                class663.method3725(class454.field6295, (byte) 102);
                class416.field5523 = null;
                return true;
            } else if (class52.field546 == class416.field5523) {
                class663.method3725(class250.field3229, (byte) 102);
                class416.field5523 = null;
                return true;
            } else if (class606.field8565 == class416.field5523) {
                class663.method3725(class176.field2099, (byte) 124);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class393.field5236) {
                int var357 = class680.field9630.method2542((byte) -109);
                int var358 = class680.field9630.method2560(-1);
                if (class261.method1484(arg0 - 17414, var357)) {
                    class685.method3814(false, 3, -1, -1, var358);
                }
                class416.field5523 = null;
                return true;
            } else if (class541.field7765 == class416.field5523) {
                class663.method3725(class610.field8623, (byte) 108);
                class416.field5523 = null;
                return true;
            } else if (class450.field6200 == class416.field5523) {
                class408.field5436 = class680.field9630.method2541(123);
                class521.field7469 = class680.field9630.method2553(-209425784);
                class416.field5523 = null;
                return true;
            } else if (class629.field8927 == class416.field5523) {
                class436.method2410(true);
                class416.field5523 = null;
                return false;
            } else if (class84.field889 == class416.field5523) {
                int var359 = class680.field9630.method2542((byte) 108);
                int var360 = class680.field9630.method2575((byte) -48);
                int var361 = class680.field9630.method2575((byte) -48);
                if (class261.method1484(arg0 ^ 0x4405, var359)) {
                    class454 var362 = (class454) class234.field2982.method3234((byte) -87, (long) var360);
                    class454 var363 = (class454) class234.field2982.method3234((byte) -52, (long) var361);
                    if (var363 != null) {
                        class39.method204(var362 == null || var362.field6291 != var363.field6291, -28799, false, var363);
                    }
                    if (var362 != null) {
                        var362.method1519((byte) 121);
                        class234.field2982.method3235((long) var361, -1, var362);
                    }
                    class382 var364 = class505.method2903(var360, 65535);
                    if (var364 != null) {
                        class567.method3207((byte) -69, var364);
                    }
                    class382 var365 = class505.method2903(var361, arg0 ^ 0xBB9A);
                    if (var365 != null) {
                        class567.method3207((byte) -69, var365);
                        class57.method387(arg0 ^ 0x442C, var365, true);
                    }
                    if (class397.field5320 != -1) {
                        class62.method422((byte) -125, class397.field5320, 1);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class352.field4619) {
                int var366 = class680.field9630.method2541(arg0 - 17398);
                int var367 = class680.field9630.method2574(-1758460248);
                if (var367 == 65535) {
                    var367 = -1;
                }
                int var368 = class680.field9630.method2563(-2263);
                String var369 = class680.field9630.method2516(arg0 - 17432);
                if (var366 >= 1 && var366 <= 8) {
                    if (var369.equalsIgnoreCase("null")) {
                        var369 = null;
                    }
                    class535.field7650[var366 - 1] = var369;
                    class181.field2220[var366 - 1] = var367;
                    class359.field4708[var366 - 1] = var368 == 0;
                }
                class416.field5523 = null;
                return true;
            } else if (class445.field6117 == class416.field5523) {
                class663.method3725(class664.field9438, (byte) 113);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class206.field2504) {
                int var370 = class680.field9630.method2574(arg0 - 1758477757);
                String var371 = class680.field9630.method2516(70);
                int var372 = class680.field9630.method2575((byte) -48);
                if (class261.method1484(87, var370)) {
                    class243.method1414(var372, var371, false);
                }
                class416.field5523 = null;
                return true;
            } else if (class489.field7098 == class416.field5523) {
                int var373 = class680.field9630.method2575((byte) -48);
                class468.field6483 = class623.field8837.method3146(arg0 - 17589, var373);
                class416.field5523 = null;
                return true;
            } else if (class87.field924 == class416.field5523) {
                class416.field5523 = null;
                return false;
            } else if (class461.field6406 == class416.field5523) {
                class663.method3725(class248.field3193, (byte) 106);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class146.field1637) {
                boolean var374 = class680.field9630.method2541(72) == 1;
                String var375 = class680.field9630.method2516(93);
                String var376 = var375;
                if (var374) {
                    var376 = class680.field9630.method2516(109);
                }
                long var377 = class680.field9630.method2510((byte) 38);
                long var379 = (long) class680.field9630.method2574(arg0 - 1758477757);
                long var381 = (long) class680.field9630.method2524(arg0 ^ 0x4466);
                int var383 = class680.field9630.method2541(100);
                int var384 = class680.field9630.method2574(-1758460248);
                long var385 = (var379 << 32) + var381;
                boolean var387 = false;
                int var388 = 0;
                while (true) {
                    if (var388 >= 100) {
                        if (var383 <= 1 && class396.method2159(true, var376)) {
                            var387 = true;
                        }
                        break;
                    }
                    if (class229.field2913[var388] == var385) {
                        var387 = true;
                        break;
                    }
                    var388++;
                }
                if (!var387 && class328.field4264 == 0) {
                    class229.field2913[class545.field7802] = var385;
                    class545.field7802 = (class545.field7802 + 1) % 100;
                    String var389 = class58.field599.method1516(0, var384).method2789(class680.field9630, 127);
                    if (var383 == 2) {
                        class412.method2231(20, "<img=1>" + var376, "<img=1>" + var375, var389, var384, class133.method746(var377, (byte) 18), var375, -20468, 0);
                    } else if (var383 == 1) {
                        class412.method2231(20, "<img=0>" + var376, "<img=0>" + var375, var389, var384, class133.method746(var377, (byte) 18), var375, -20468, 0);
                    } else {
                        class412.method2231(20, var376, var375, var389, var384, class133.method746(var377, (byte) 18), var375, -20468, 0);
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class261.field3318) {
                class601.field8535 = class680.field9630.method2541(54);
                for (int var390 = 0; var390 < class601.field8535; var390++) {
                    class278.field3521[var390] = class680.field9630.method2516(104);
                    class13.field113[var390] = class680.field9630.method2516(arg0 - 17425);
                    if (class13.field113[var390].equals("")) {
                        class13.field113[var390] = class278.field3521[var390];
                    }
                    class305.field3983[var390] = class680.field9630.method2516(84);
                    class30.field354[var390] = class680.field9630.method2516(76);
                    if (class30.field354[var390].equals("")) {
                        class30.field354[var390] = class305.field3983[var390];
                    }
                    class54.field558[var390] = false;
                }
                class491.field7117 = class204.field2494;
                class416.field5523 = null;
                return true;
            } else if (class46.field506 == class416.field5523) {
                class196.method1137((byte) 101, class478.field7009, class680.field9630);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class353.field4633) {
                int var391 = class680.field9630.method2541(arg0 - 17447);
                int var392 = class680.field9630.method2542((byte) -95);
                class491.field7127.method1382(var391, var392, -127);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class185.field2251) {
                class680.field9630.field6215 += 28;
                if (class680.field9630.method2527((byte) -108)) {
                    class348.method1932(class680.field9630.field6215 - 28, (byte) 60, class680.field9630);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class18.field164) {
                int var393 = class680.field9630.method2574(-1758460248);
                int var394 = class680.field9630.method2575((byte) -48);
                int var395 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(101, var395)) {
                    class232.method1350(var393, -115, var394);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class269.field3393) {
                int var396 = class680.field9630.method2574(-1758460248);
                int var397 = class680.field9630.method2574(-1758460248);
                int var398 = class680.field9630.method2574(-1758460248);
                int var399 = class680.field9630.method2574(-1758460248);
                if (class261.method1484(126, var396) && class271.field3434[var397] != null) {
                    for (int var400 = var398; var400 < var399; var400++) {
                        int var401 = class680.field9630.method2524(3);
                        if (class271.field3434[var397].length > var400 && class271.field3434[var397][var400] != null) {
                            class271.field3434[var397][var400].field5071 = var401;
                        }
                    }
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class193.field2320) {
                int var402 = class680.field9630.method2541(95);
                if (class680.field9630.method2541(arg0 - 17449) == 0) {
                    class358.field4693[var402] = new class157();
                } else {
                    class680.field9630.field6215--;
                    class358.field4693[var402] = new class157(class680.field9630);
                }
                class416.field5523 = null;
                class689.field9731 = class204.field2494;
                return true;
            } else if (class416.field5523 == class104.field1131) {
                String var403 = class680.field9630.method2516(arg0 - 17397);
                String var404 = class470.method2663(true, class460.method2623(class680.field9630, (byte) -125));
                method1809(var403, 6, (byte) 91, var403, var403, 0, var404);
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class386.field5162) {
                int var405 = class680.field9630.method2558((byte) -110);
                int var406 = class680.field9630.method2533(arg0 + 244635);
                int var407 = class680.field9630.method2532(false);
                if (var407 == 65535) {
                    var407 = -1;
                }
                int var408 = class680.field9630.method2560(arg0 ^ 0xFFFFBB9A);
                if (class261.method1484(116, var405)) {
                    class45.method221(var407, var408, var406, arg0 ^ 0x446C);
                    class537 var409 = class472.field6588.method1903(var407, (byte) 76);
                    class230.method1339(var409.field7722, (byte) -113, var409.field7728, var408, var409.field7717);
                    class288.method1630(var409.field7691, var409.field7714, 10, var408, var409.field7700);
                }
                class416.field5523 = null;
                return true;
            } else if (class523.field7498 == class416.field5523) {
                int var410 = class680.field9630.method2574(arg0 ^ 0x973042CD);
                int var411 = class680.field9630.method2541(48);
                int var412 = class680.field9630.method2541(arg0 - 17444);
                int var413 = class680.field9630.method2574(arg0 ^ 0x973042CD) << 2;
                int var414 = class680.field9630.method2541(arg0 - 17473);
                int var415 = class680.field9630.method2541(51);
                if (class261.method1484(arg0 ^ 0x4410, var410)) {
                    class377.method2072(var412, var414, var411, arg0 - 21098, var415, var413, true);
                }
                class416.field5523 = null;
                return true;
            } else if (class516.field7378 == class416.field5523) {
                int var416 = class680.field9630.method2544((byte) 105);
                int var417 = class680.field9630.method2558((byte) -122);
                int var418 = class680.field9630.method2574(-1758460248);
                int var419 = class680.field9630.method2532(false);
                int var420 = class680.field9630.method2558((byte) -98);
                if (class261.method1484(arg0 ^ 0x441A, var419)) {
                    class230.method1339(var420, (byte) -113, var418, var416, var417);
                }
                class416.field5523 = null;
                return true;
            } else if (class416.field5523 == class183.field2234) {
                int var421 = class680.field9630.method2532(false);
                int var422 = class680.field9630.method2558((byte) -126);
                int var423 = class680.field9630.method2563(-2263);
                class443 var424 = (class443) class392.field5223.method3234((byte) -61, (long) var422);
                if (var424 != null) {
                    class278.method1588(var424.field6107, (byte) 123, var423, var421);
                }
                class416.field5523 = null;
                return true;
            } else {
                class150.method824(15, null, "T1 - " + (class416.field5523 == null ? -1 : class416.field5523.method2213(63)) + "," + (class419.field5570 == null ? -1 : class419.field5570.method2213(95)) + "," + (class273.field3455 == null ? -1 : class273.field3455.method2213(112)) + " - " + class478.field7009);
                class184.method1069(false, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 3536)
    public static final void method1813(int arg0) {
        field4165++;
        class647 var1 = null;
        try {
            var1 = class556.method3141(true, "2");
            class452 var2 = new class452(class137.field1559 * 6 + 3);
            var2.method2525(1, -81849);
            var2.method2537(arg0 + 17331, class137.field1559);
            if (arg0 != 913) {
                method1813(23);
            }
            for (int var3 = 0; var3 < class585.field8313.length; var3++) {
                if (class462.field6424[var3]) {
                    var2.method2537(arg0 ^ 0x44D5, var3);
                    var2.method2554(class585.field8313[var3], 255);
                }
            }
            var1.method3635(var2.field6215, 1, var2.field6209, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3633(0);
            }
        } catch (Exception var4) {
        }
        class214.field2603 = class641.method3604(false);
        class135.field1526 = false;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(III)V", line = 3625)
    public class321(int arg0, int arg1, int arg2) {
        this.field4162 = arg1;
        this.field4167 = arg0;
        this.field4161 = new class242[this.field4162];
        this.field4171 = new int[this.field4167][arg2];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 3596)
    public final void method1814(byte arg0) {
        field4157++;
        for (int var2 = 0; var2 < this.field4167; var2++) {
            this.field4171[var2] = null;
        }
        this.field4161 = null;
        this.field4171 = null;
        this.field4158.method3170((byte) 108);
        if (arg0 != 37) {
            method1808(28);
        }
        this.field4158 = null;
    }
}
