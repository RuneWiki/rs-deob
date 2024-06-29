import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class143 extends class288 {

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    private int field2313 = 3072;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    private int field2320 = 2048;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    private int field2322 = 1024;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "S")
    public static short field2310 = 1;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field2317 = -2;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field4612 = ~arg0.method1779(arg1 ^ 69) == -2;
                }
            } else {
                this.field2313 = arg0.method1777(arg1 + -42);
            }
        } else {
            this.field2322 = arg0.method1777(arg1 + -84);
        }
        ++field2314;
        if (arg1 != -19) {
            method973((class103) null, 109, -73);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method967(int arg0, String arg1) {
        ++field2318;
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        int var5 = 52 / ((-29 - arg0) / 46);
        for (int var6 = 0; ~var6 > ~var2; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var3 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var3 == 2 || Character.isUpperCase(var7)) {
                var7 = class41.method318(var7, 0);
            }
            if (!Character.isLetter(var7)) {
                if (~var7 != -47 && var7 != '?' && ~var7 != -34) {
                    if (Character.isSpaceChar(var7)) {
                        if (~var3 != -3) {
                            var3 = 1;
                        }
                    } else {
                        var3 = 1;
                    }
                } else {
                    var3 = 2;
                }
            } else {
                var3 = 0;
            }
            var4[var6] = var7;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public static final void method968(int arg0) {
        ++field2325;
        if (~class113.field1944 != 0) {
            class138.method955((byte) -127, class113.field1944);
        }
        for (int var1 = 0; ~var1 > ~class154.field2482; ++var1) {
            if (class272.field4396[var1]) {
                class217.field3482[var1] = true;
            }
            class203.field3265[var1] = class272.field4396[var1];
            class272.field4396[var1] = false;
        }
        if (arg0 != -9594) {
            field2317 = 3;
        }
        class207.field3338 = -1;
        class25.field306 = -1;
        field2317 = class9.field141;
        class230.field3654 = null;
        if (~class113.field1944 != 0) {
            class154.field2482 = 0;
            class217.method1441(19160);
        }
        class63.method493();
        class221.field3524 = 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method969(String[] arg0, byte arg1) {
        ++field2316;
        if (arg1 != 85) {
            method971((byte) 4);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            method971((byte) -72);
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -125, 0, arg1);
            for (int var5 = 0; var5 < class186.field2986; ++var5) {
                var3[var5] = (var4[var5] * this.field2320 >> 12) + this.field2322;
            }
        }
        ++field2321;
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static final void method970(byte arg0) {
        if (arg0 > -92) {
            method971((byte) -8);
        }
        class76.field1039.method1834(0);
        class125.field2100.method1834(0);
        ++field2323;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
    public static final void method971(byte arg0) {
        class172 var1 = class9.field128;
        synchronized (class9.field128) {
            ++class6.field78;
            class205.field3293 = class30.field361;
            class109.field1893 = class42.field499;
            class250.field4000 = class7.field108;
            class58.field815 = class185.field2964;
            int var2 = 49 / ((-66 - arg0) / 58);
            class266.field4319 = class206.field3300;
            class232.field3696 = class243.field3897;
            class271.field4378 = class78.field1075;
            class185.field2964 = 0;
        }
        ++field2319;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (arg0 != 1) {
            method970((byte) -1);
        }
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, arg1, (byte) 108);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class186.field2986; ++var11) {
                var8[var11] = (var5[var11] * this.field2320 >> 12) + this.field2322;
                var9[var11] = (var6[var11] * this.field2320 >> 12) + this.field2322;
                var10[var11] = (var7[var11] * this.field2320 >> 12) + this.field2322;
            }
        }
        ++field2324;
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lhi;B)V")
    public static final void method972(class264 arg0, byte arg1) {
        while (arg0.field4195 < arg0.field4198.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (~arg0.method1779(-106) == -2) {
                var2 = true;
                var3 = arg0.method1779(-63);
                var4 = arg0.method1779(-114);
            }
            int var5 = arg0.method1779(-123);
            int var6 = arg0.method1779(-124);
            int var7 = var5 * 64 - class129.field2149;
            int var8 = -(var6 * 64) + class73.field1002 + class225.field3569 + -1;
            if (var7 >= 0 && ~(var8 + -63) <= -1 && var7 + 63 < class183.field2927 && ~var8 > ~class225.field3569) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; ++var11) {
                    for (int var12 = 0; var12 < 64; ++var12) {
                        if (!var2 || ~var11 <= ~(var3 * 8) && ~var11 > ~(var3 * 8 + 8) && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                            byte var13 = arg0.method1767(16711680);
                            if (var13 != 0) {
                                if (class19.field219[var9][var10] == null) {
                                    class19.field219[var9][var10] = new byte[4096];
                                }
                                class19.field219[var9][var10][(-var12 + 63 << 6) - -var11] = var13;
                                byte var14 = arg0.method1767(16711680);
                                if (class259.field4128[var9][var10] == null) {
                                    class259.field4128[var9][var10] = new byte[4096];
                                }
                                class259.field4128[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; (var2 ? 64 : 4096) > var15; ++var15) {
                    byte var16 = arg0.method1767(16711680);
                    if (~var16 != -1) {
                        ++arg0.field4195;
                    }
                }
            }
        }
        ++field2311;
        if (arg1 != -63) {
            method968(20);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Leb;II)I")
    public static final int method973(class103 arg0, int arg1, int arg2) {
        ++field2315;
        if (arg1 != -1) {
            method968(-51);
        }
        if (!client.method1511(arg0).method198(arg2, 0) && arg0.field1570 == null) {
            return -1;
        } else {
            return arg0.field1546 != null && ~arg2 > ~arg0.field1546.length ? arg0.field1546[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        ++field2312;
        this.field2320 = this.field2313 - this.field2322;
        if (arg0 != -125) {
            method973((class103) null, -25, 40);
        }
    }
}
