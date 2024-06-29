import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class131 extends class172 {

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "Z")
    public boolean field2228 = true;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field2212 = 0;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2214 = 2;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "[I")
    private static int[] field2229 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "Ljava/lang/String;")
    public static String field2234 = "Loading textures - ";

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lth;")
    public static class57 field2224;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "[I")
    private int[] field2207;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "[I")
    public int[] field2213;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field2218;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "[[I")
    private int[][] field2206;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method1001(boolean arg0) {
        class39.field574.method2326(-4);
        field2209++;
        if (arg0) {
            field2229 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)I", line = 16)
    public final int method1002(int arg0) {
        if (arg0 >= -92) {
            this.field2228 = true;
        }
        field2226++;
        return this.field2207 == null ? 0 : this.field2207.length;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([IBLqm;)V", line = 34)
    public final void method1003(int[] arg0, byte arg1, class227 arg2) {
        field2222++;
        if (this.field2207 == null) {
            return;
        }
        int var4 = 79 % ((arg1 - 72) / 32);
        for (int var5 = 0; var5 < this.field2207.length && arg0.length > var5; var5++) {
            int var6 = class133.field2240[this.method1011(false, var5)];
            if (var6 > 0) {
                arg2.method1745((long) arg0[var5], (byte) -76, var6);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V", line = 60)
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2211++;
        if (arg1 < 56) {
            field2212 = 127;
        }
        if (class273.field4522 < arg3 || class296.field4758 > arg0) {
            return;
        }
        boolean var6;
        if (arg5 < class74.field1269) {
            var6 = false;
            arg5 = class74.field1269;
        } else if (class355.field5640 >= arg5) {
            var6 = true;
        } else {
            arg5 = class355.field5640;
            var6 = false;
        }
        boolean var7;
        if (class74.field1269 > arg2) {
            var7 = false;
            arg2 = class74.field1269;
        } else if (arg2 <= class355.field5640) {
            var7 = true;
        } else {
            arg2 = class355.field5640;
            var7 = false;
        }
        if (class296.field4758 <= arg3) {
            class161.method1253(arg2, class353.field5599[arg3++], -1, arg4, arg5);
        } else {
            arg3 = class296.field4758;
        }
        if (class273.field4522 < arg0) {
            arg0 = class273.field4522;
        } else {
            class161.method1253(arg2, class353.field5599[arg0--], -1, arg4, arg5);
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg0; var8++) {
                int[] var9 = class353.field5599[var8];
                var9[arg5] = var9[arg2] = arg4;
            }
        } else if (var6) {
            for (int var11 = arg3; var11 <= arg0; var11++) {
                class353.field5599[var11][arg5] = arg4;
            }
        } else if (var7) {
            for (int var10 = arg3; var10 <= arg0; var10++) {
                class353.field5599[var10][arg2] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lth;B)V", line = 170)
    public static final void method1005(class57 arg0, byte arg1) {
        class220.field3501 = arg0;
        if (arg1 <= -79) {
            field2233++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 182)
    public static final void method1006(byte arg0) {
        class205.method1568(class81.field1392, (byte) 119);
        class327.field5204++;
        field2216++;
        if (class309.field4921 && class352.field5587) {
            int var1 = 37 / ((arg0 - 45) / 46);
            int var2 = class333.field5275;
            int var3 = var2 - class205.field3239;
            int var4 = class77.field1343;
            if (class77.field1344 > var3) {
                var3 = class77.field1344;
            }
            int var5 = var4 - class252.field4268;
            if (class295.field4750 > var5) {
                var5 = class295.field4750;
            }
            if ((class81.field1392.field4157 + var5) > (class295.field4750 + class176.field2828.field4157)) {
                var5 = class176.field2828.field4157 + class295.field4750 - class81.field1392.field4157;
            }
            int var6 = class81.field1392.field4183;
            if ((class81.field1392.field4081 + var3) > (class77.field1344 + class176.field2828.field4081)) {
                var3 = class77.field1344 + class176.field2828.field4081 - class81.field1392.field4081;
            }
            int var7 = var3 - class279.field4595;
            int var8 = var5 - class20.field228;
            int var9 = class176.field2828.field4225 + var3 - class77.field1344;
            if (class81.field1392.field4149 < class327.field5204 && (var7 > var6 || -var6 > var7 || var8 > var6 || var8 < -var6)) {
                class86.field1460 = true;
            }
            int var10 = class176.field2828.field4120 + var5 - class295.field4750;
            if (class81.field1392.field4143 != null && class86.field1460) {
                class40 var11 = new class40();
                var11.field585 = var10;
                var11.field588 = var9;
                var11.field593 = class81.field1392;
                var11.field581 = class81.field1392.field4143;
                class29.method183((byte) 125, var11);
            }
            if (class198.field3157 == 0) {
                if (class86.field1460) {
                    if (class81.field1392.field4146 != null) {
                        class40 var12 = new class40();
                        var12.field585 = var10;
                        var12.field589 = class162.field2575;
                        var12.field588 = var9;
                        var12.field581 = class81.field1392.field4146;
                        var12.field593 = class81.field1392;
                        class29.method183((byte) 122, var12);
                    }
                    if (class162.field2575 != null && client.method344(class81.field1392) != null) {
                        class36.field520.method2228(44, 16547);
                        class36.field520.method1729(class162.field2575.field4229, 206);
                        class286.field4664++;
                        class36.field520.method1741(class81.field1392.field4167, 872537352);
                        class36.field520.method1731(-95, class81.field1392.field4229);
                        class36.field520.method1771(126, class162.field2575.field4167);
                    }
                } else if ((class86.field1458 == 1 || class164.method1276(-16563, class104.field1683 - 1)) && class104.field1683 > 2) {
                    class102.method791(-8118);
                } else if (class104.field1683 > 0) {
                    class78.method646((byte) -80);
                }
                class81.field1392 = null;
            }
        } else if (class327.field5204 > 1) {
            class81.field1392 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)I", line = 309)
    public final int method1007(int arg0, int arg1, int arg2) {
        field2217++;
        if (this.field2207 == null || arg0 < 0 || arg0 > this.field2207.length) {
            return -1;
        } else {
            if (arg1 != 0) {
                method1010(14, (class121) null, 125, -45, 77);
            }
            return this.field2206[arg0] == null || arg2 < 0 || arg2 > this.field2206[arg0].length ? -1 : this.field2206[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIIIII)V", line = 330)
    public static final void method1008(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2235++;
        class273[] var7 = class74.field1261;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class273 var9 = var7[var8];
            if (var9 != null && var9.field4529 == 2) {
                class182.method1429(arg1, arg5, (byte) 64, var9.field4521 * 2, (var9.field4534 - class93.field1562 << 7) + var9.field4536, arg2 >> 1, arg6 >> 1, (var9.field4532 - class275.field4546 << 7) + var9.field4535);
                if (class210.field3308 > -1 && class332.field5261 % 20 < 10) {
                    class32.field458[var9.field4531].method89(arg4 + class210.field3308 - 12, class247.field4047 + arg3 - 28);
                }
            }
        }
        if (arg0 < 78) {
            field2214 = 92;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V", line = 364)
    public static void method1009(byte arg0) {
        field2229 = null;
        if (arg0 <= 6) {
            field2227 = 124;
        }
        field2234 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILrb;III)V", line = 379)
    public static final void method1010(int arg0, class121 arg1, int arg2, int arg3, int arg4) {
        field2231++;
        if (class104.field1683 >= 400) {
            return;
        }
        if (arg1.field2066 != null) {
            arg1 = arg1.method958((byte) -115);
        }
        int var5 = 72 % ((arg2 + 19) / 54);
        if (arg1 == null || !arg1.field2036) {
            return;
        }
        String var6 = arg1.field2070;
        if (arg1.field2046 != 0) {
            String var7 = field2212 == 1 ? class245.field4029 : class79.field1368;
            var6 = var6 + class204.method1563(class6.field55.field4330, arg1.field2046, (byte) 101) + " (" + var7 + arg1.field2046 + ")";
        }
        if (class16.field186 == 1) {
            class285.field4646++;
            class55.method434(arg3, class129.field2193, false, (long) arg0, class233.field3881 + " -> <col=ffff00>" + var6, arg4, class117.field1953, (short) 29);
        } else if (class227.field3789) {
            class350 var15 = class245.field4015 == -1 ? null : class113.method861((byte) 115, class245.field4015);
            if ((class6.field48 & 0x2) != 0 && (var15 == null || arg1.method962(-26346, class245.field4015, var15.field5554) != var15.field5554)) {
                field2221++;
                class55.method434(arg3, class104.field1690, false, (long) arg0, class178.field2851 + " -> <col=ffff00>" + var6, arg4, class324.field5160, (short) 18);
            }
        } else {
            String[] var8 = arg1.field2023;
            if (class348.field5530) {
                var8 = class356.method2515(1, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (field2212 != 0 || !var8[var9].equalsIgnoreCase(class172.field2747))) {
                        class133.field2241++;
                        int var10 = -1;
                        byte var11 = 0;
                        if (var9 == 0) {
                            var11 = 7;
                        }
                        if (var9 == 1) {
                            var11 = 2;
                        }
                        if (var9 == 2) {
                            var11 = 32;
                        }
                        if (var9 == 3) {
                            var11 = 40;
                        }
                        if (var9 == 4) {
                            var11 = 28;
                        }
                        if (arg1.field2034 == var9) {
                            var10 = arg1.field2056;
                        }
                        if (arg1.field2039 == var9) {
                            var10 = arg1.field2076;
                        }
                        class55.method434(arg3, var10, false, (long) arg0, "<col=ffff00>" + var6, arg4, var8[var9], var11);
                    }
                }
            }
            class213.field3392++;
            if (field2212 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class172.field2747)) {
                        short var13 = 0;
                        if (class6.field55.field4330 < arg1.field2046) {
                            var13 = 2000;
                        }
                        class56.field932++;
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 7;
                        }
                        if (var12 == 1) {
                            var14 = 2;
                        }
                        if (var12 == 2) {
                            var14 = 32;
                        }
                        if (var12 == 3) {
                            var14 = 40;
                        }
                        if (var12 == 4) {
                            var14 = 28;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class55.method434(arg3, arg1.field2089, false, (long) arg0, "<col=ffff00>" + var6, arg4, var8[var12], var14);
                    }
                }
            }
            class55.method434(arg3, class121.field2082, false, (long) arg0, "<col=ffff00>" + var6, arg4, class327.field5198, (short) 1008);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)I", line = 540)
    public final int method1011(boolean arg0, int arg1) {
        field2215++;
        if (this.field2207 == null || arg1 < 0 || this.field2207.length < arg1) {
            return -1;
        } else if (arg0) {
            return 23;
        } else {
            return this.field2207[arg1];
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lqm;B)Ljava/lang/String;", line = 557)
    public final String method1012(class227 arg0, byte arg1) {
        if (arg1 != -46) {
            return (String) null;
        }
        field2210++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2207 != null) {
            for (int var4 = 0; var4 < this.field2207.length; var4++) {
                var3.append(this.field2218[var4]);
                var3.append(class74.method622(-2049, arg0.method1743((byte) 77, field2229[this.field2207[var4]]), this.field2206[var4], this.field2207[var4]));
            }
        }
        var3.append(this.field2218[this.field2218.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lqm;I)V", line = 589)
    public final void method1013(class227 arg0, int arg1) {
        field2232++;
        while (true) {
            int var3 = arg0.method1720((byte) -9);
            if (var3 == 0) {
                int var4 = -17 % ((88 - arg1) / 38);
                return;
            }
            this.method1016(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 613)
    public final void method1014(int arg0) {
        if (arg0 != 32768) {
            return;
        }
        field2223++;
        if (this.field2213 != null) {
            for (int var2 = 0; var2 < this.field2213.length; var2++) {
                this.field2213[var2] = class75.method624(this.field2213[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)Ljava/lang/String;", line = 638)
    public final String method1015(byte arg0) {
        if (arg0 != 86) {
            return (String) null;
        }
        field2220++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2218 == null) {
            return "";
        }
        var2.append(this.field2218[0]);
        for (int var3 = 1; var3 < this.field2218.length; var3++) {
            var2.append("...");
            var2.append(this.field2218[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLqm;I)V", line = 671)
    private final void method1016(boolean arg0, class227 arg1, int arg2) {
        field2230++;
        if (arg2 == 1) {
            this.field2218 = class293.method2114(-55, arg1.method1758((byte) 119), '<');
        } else if (arg2 == 2) {
            int var8 = arg1.method1720((byte) -32);
            this.field2213 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2213[var9] = arg1.method1765(true);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1720((byte) -30);
            this.field2206 = new int[var4][];
            this.field2207 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1765(true);
                this.field2207[var5] = var6;
                this.field2206[var5] = new int[class1.field5[var6]];
                for (int var7 = 0; var7 < class1.field5[var6]; var7++) {
                    this.field2206[var5][var7] = arg1.method1765(true);
                }
            }
        } else if (arg2 == 4) {
            this.field2228 = false;
        }
        if (arg0) {
            method1008((byte) 25, -119, 93, 53, 18, -75, -16);
        }
    }
}
