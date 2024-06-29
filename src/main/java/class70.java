import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class70 extends class27 {

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
    private int[] field1286 = new int[3];

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    private int field1290 = 3216;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    private int field1288 = 3216;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    private int field1292 = 4096;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Lkb;")
    private static class93 field1293 = class76.method390("Examine", 0);

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lkb;")
    private static class93 field1294 = class76.method390("Login server offline)3", 0);

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "Lkb;")
    public static class93 field1303 = field1294;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Lkb;")
    public static class93 field1298 = field1293;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "[Lob;")
    public static class129[] field1291;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "[[[B")
    public static byte[][][] field1287;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIILdg;II)V")
    public static final void method368(boolean arg0, int arg1, int arg2, class37 arg3, int arg4, int arg5) {
        ++field1306;
        if (class101.field1863 < 50) {
            if (arg3.field630 != null && ~arg3.field630.length < ~arg2) {
                int var6 = arg3.field630[arg2];
                if (var6 != 0) {
                    int var7 = 15 & var6;
                    int var8 = var6 >> 4 & 7;
                    int var9 = var6 >> 8;
                    if (~var7 == -1) {
                        if (arg0) {
                            class13.method73(var8, 1, 0, var9);
                        }
                    } else if (~class167.field3334 != -1) {
                        int var10 = (arg4 + -64) / 128;
                        class140.field2720[class101.field1863] = var9;
                        class59.field947[class101.field1863] = var8;
                        class103.field1890[class101.field1863] = 0;
                        int var11 = (arg5 + -64) / 128;
                        class166.field3318[class101.field1863] = null;
                        if (arg1 != 32333) {
                            field1294 = null;
                        }
                        class73.field1330[class101.field1863] = (var11 << 8) + (var10 << 16) + var7;
                        ++class101.field1863;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIZ)V")
    public static final void method369(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field1304;
            if (class112.field2085 == 0 || class112.field2085 == 3) {
                if (class144.field2798 == 1) {
                    int var3 = class88.field1592 - arg0 + -25;
                    int var4 = -arg1 + class57.field928 + -5;
                    if (var3 >= 0 && ~var4 <= -1 && var3 < 146 && var4 < 151) {
                        int var5 = class93.field1707 + class30.field510 & 2047;
                        var3 -= 73;
                        var4 -= 75;
                        int var6 = class150.field2896[var5];
                        int var7 = (class193.field3749 + 256) * var6 >> 8;
                        int var8 = class150.field2888[var5];
                        int var9 = (class193.field3749 + 256) * var8 >> 8;
                        int var10 = var4 * var7 - -(var3 * var9) >> 11;
                        int var11 = class106.field1940.field2032 + var10 >> 7;
                        int var12 = var4 * var9 + -(var3 * var7) >> 11;
                        int var13 = -var12 + class106.field1940.field2045 >> 7;
                        boolean var14 = class6.method36(0, true, class106.field1940.field2038[0], 0, (byte) -2, 1, class106.field1940.field2064[0], var13, 0, 0, 0, var11);
                        if (var14) {
                            class151.field2908.method1069(var3, (byte) -26);
                            class151.field2908.method1069(var4, (byte) -26);
                            class151.field2908.method1061(class30.field510, 12184);
                            class151.field2908.method1069(57, (byte) -26);
                            class151.field2908.method1069(class93.field1707, (byte) -26);
                            class151.field2908.method1069(class193.field3749, (byte) -26);
                            class151.field2908.method1069(89, (byte) -26);
                            class151.field2908.method1061(class106.field1940.field2032, 12184);
                            class151.field2908.method1061(class106.field1940.field2045, 12184);
                            class151.field2908.method1069(class207.field4038, (byte) -26);
                            class151.field2908.method1069(63, (byte) -26);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method370(int arg0) {
        if (arg0 == 1) {
            field1294 = null;
            field1293 = null;
            field1291 = null;
            field1303 = null;
            field1287 = null;
            field1298 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            field1298 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field1290 = arg2.method1071(28101);
                }
            } else {
                this.field1288 = arg2.method1071(28101);
            }
        } else {
            this.field1292 = arg2.method1071(28101);
        }
        ++field1301;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field1295;
        if (arg0 <= 77) {
            this.field1290 = 47;
        }
        this.method373(111);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class70() {
        super(1, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V")
    public static final void method371(byte arg0, int arg1) {
        ++field1296;
        if (~arg1 == 0 && !class171.field3393) {
            class4.method22(true);
        } else if (arg1 != -1 && (class191.field3735 != arg1 || !class85.method431(arg0 ^ -38)) && ~class79.field1408 != -1 && !class171.field3393) {
            class101.method562(arg1, 1, false, class63.field1000, 2, class79.field1408, 0);
        }
        class191.field3735 = arg1;
        if (arg0 != -38) {
            field1298 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IBI)I")
    public static final int method372(int arg0, byte arg1, int arg2) {
        class36 var3 = (class36) client.field496.method616((long) arg0, -1);
        ++field1305;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            if (arg1 >= -31) {
                method372(88, (byte) -10, 84);
            }
            int var4 = 0;
            for (int var5 = 0; ~var5 > ~var3.field594.length; ++var5) {
                if (var3.field595[var5] == arg2) {
                    var4 += var3.field594[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1300;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 121, arg0 + -1 & class190.field3715);
            int[] var5 = this.method145(0, (byte) 124, arg0);
            int[] var6 = this.method145(0, (byte) 125, class190.field3715 & arg0 + 1);
            for (int var7 = 0; ~var7 > ~class159.field3209; ++var7) {
                int var8 = (var5[var7 + 1 & class78.field1402] + -var5[class78.field1402 & var7 + -1]) * this.field1292;
                int var9 = (var6[var7] + -var4[var7]) * this.field1292;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var12 + var13 + 4096) / 4096)) * 4096.0D);
                int var15;
                int var16;
                int var17;
                if (var14 != 0) {
                    var15 = var8 / var14;
                    var16 = 16777216 / var14;
                    var17 = var9 / var14;
                } else {
                    var17 = 0;
                    var16 = 0;
                    var15 = 0;
                }
                int var18 = this.field1286[2] * var16 >> 12;
                int var19 = this.field1286[0] * var15 >> 12;
                int var20 = this.field1286[1] * var17 >> 12;
                var3[var7] = var19 + var20 - -var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    private final void method373(int arg0) {
        ++field1302;
        double var2 = Math.cos((double) (this.field1290 / 4096));
        this.field1286[0] = (int) (var2 * Math.sin((double) (this.field1288 / 4096)) * 4096.0D);
        if (arg0 < 83) {
            field1299 = 101;
        }
        this.field1286[1] = (int) (var2 * Math.cos((double) (this.field1288 / 4096)) * 4096.0D);
        this.field1286[2] = (int) (Math.sin((double) (this.field1290 / 4096)) * 4096.0D);
        int var4 = this.field1286[1] * this.field1286[1] >> 12;
        int var5 = this.field1286[2] * this.field1286[2] >> 12;
        int var6 = this.field1286[0] * this.field1286[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field1286[2] = (this.field1286[2] << 12) / var7;
            this.field1286[0] = (this.field1286[0] << 12) / var7;
            this.field1286[1] = (this.field1286[1] << 12) / var7;
        }
    }
}
