import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class208 extends class77 {

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public int field3887 = -1;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Z")
    private boolean field3885 = false;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field3884 = -1;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public int field3897 = -1;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public int field3895 = 5;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public int field3901 = -1;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public int field3896 = 99;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public int field3905 = -1;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public int field3906 = 2;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "Z")
    public boolean field3908 = false;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "Ldc;")
    public static class37 field3899 = class185.method1233((byte) 86, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Ldc;")
    public static class37 field3890 = class185.method1233((byte) 86, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "[I")
    public int[] field3881;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
    public int[] field3882;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "[I")
    public int[] field3883;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "[I")
    private int[] field3888;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "[I")
    private int[] field3907;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(La;IZ)La;")
    public final class1 method1375(class1 arg0, int arg1, boolean arg2) {
        field3894++;
        int var4 = this.field3881[arg1];
        class167 var5 = class137.method957(var4 >> 16, (byte) -39);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method6(true, true);
        }
        class1 var7 = arg0.method6(!var5.method1123(var6, 1), !this.field3885);
        if (arg2) {
            var7.method22(var5, var6, this.field3885);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)Lji;")
    public static final class106 method1376(int arg0) {
        field3893++;
        int var1 = class238.field4336[0] * class174.field3308[0];
        byte[] var2 = class217.field4040[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class5.field42[class58.method449(var2[var4], 255)];
        }
        class182 var5 = new class182(class67.field1207, class160.field3030, class166.field3162[arg0], class7.field77[0], class174.field3308[0], class238.field4336[0], var3);
        class97.method644(true);
        return var5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ldc;B)V")
    public static final void method1377(class37 arg0, byte arg1) {
        try {
            class104.field1796.getAppletContext().showDocument(arg0.method344(class104.field1796.getCodeBase(), -70), "_blank");
        } catch (Exception var3) {
        }
        int var2 = 69 % ((arg1 - 65) / 61);
        field3900++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLa;)La;")
    public final class1 method1378(int arg0, byte arg1, class1 arg2) {
        field3903++;
        int var4 = this.field3881[arg0];
        if (arg1 != -12) {
            this.method1380((byte) 0, null);
        }
        class167 var5 = class137.method957(var4 >> 16, (byte) -114);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method16(true, true);
        } else {
            class1 var7 = arg2.method16(!var5.method1123(var6, 1), !this.field3885);
            var7.method22(var5, var6, this.field3885);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public final void method1379(byte arg0) {
        if (arg0 <= 13) {
            this.field3885 = true;
        }
        if (this.field3897 == -1) {
            if (this.field3907 == null) {
                this.field3897 = 0;
            } else {
                this.field3897 = 2;
            }
        }
        field3880++;
        if (this.field3905 != -1) {
            return;
        }
        if (this.field3907 == null) {
            this.field3905 = 0;
        } else {
            this.field3905 = 2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLce;)V")
    public final void method1380(byte arg0, class28 arg1) {
        if (arg0 >= -41) {
            this.field3882 = null;
        }
        field3886++;
        while (true) {
            int var3 = arg1.method215(-1797813752);
            if (var3 == 0) {
                return;
            }
            this.method1386((byte) 11, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
    public static final void method1381(int arg0, byte arg1) {
        int var2 = -15 % ((-arg1 - 41) / 54);
        class182 var3;
        if (class118.field2115 == null) {
            var3 = new class182(512, 512);
        } else {
            var3 = (class182) class118.field2115;
        }
        field3889++;
        int[] var4 = var3.field3375;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; var6++) {
            var4[var6] = 1;
        }
        for (int var7 = 1; var7 < 103; var7++) {
            int var23 = (52736 - var7 * 512) * 4 + 24628;
            for (int var24 = 1; var24 < 103; var24++) {
                if ((class193.field3602[arg0][var24][var7] & 0x18) == 0) {
                    class7.method47(var4, var23, 512, arg0, var24, var7);
                }
                if (arg0 < 3 && (class193.field3602[arg0 + 1][var24][var7] & 0x8) != 0) {
                    class7.method47(var4, var23, 512, arg0 + 1, var24, var7);
                }
                var23 += 4;
            }
        }
        var3.method1222();
        int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var10 = 1; var10 < 103; var10++) {
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class193.field3602[arg0][var22][var10] & 0x18) == 0) {
                    class181.method1203(var22, var9, var8, var10, arg0, 3);
                }
                if (arg0 < 3 && (class193.field3602[arg0 + 1][var22][var10] & 0x8) != 0) {
                    class181.method1203(var22, var9, var8, var10, arg0 + 1, 3);
                }
            }
        }
        class233.field4256 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = class244.method1592(class125.field2246, var11, var12);
                if (var13 != 0L) {
                    class30 var15 = class73.method519(Integer.MAX_VALUE & (int) (var13 >>> 32), -21035);
                    int var16 = var15.field559;
                    if (var16 >= 0) {
                        int var17 = var12;
                        int var18 = var11;
                        if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                            int[][] var19 = class11.field143[class125.field2246].field3080;
                            for (int var20 = 0; var20 < 10; var20++) {
                                int var21 = (int) (Math.random() * 4.0D);
                                if (var21 == 0 && var18 > 0 && var11 - 3 < var18 && (var19[var18 - 1][var17] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var21 == 1 && var18 < 103 && var11 + 3 > var18 && (var19[var18 + 1][var17] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var21 == 2 && var17 > 0 && var12 - 3 < var17 && (var19[var18][var17 - 1] & 0x12C0102) == 0) {
                                    var17--;
                                }
                                if (var21 == 3 && var17 < 103 && var12 + 3 > var17 && (var19[var18][var17 + 1] & 0x12C0120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        class92.field1581[class233.field4256] = var15.field599;
                        class235.field4274[class233.field4256] = var18;
                        class153.field2896[class233.field4256] = var17;
                        class233.field4256++;
                    }
                }
            }
        }
        class118.field2115 = var3;
        class224.field4151.method1169((byte) -67);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(La;IB)La;")
    public final class1 method1382(class1 arg0, int arg1, byte arg2) {
        if (arg2 != 99) {
            this.method1385(null, 81, null, -3, -104);
        }
        int var4 = this.field3881[arg1];
        field3891++;
        class167 var5 = class137.method957(var4 >> 16, (byte) -34);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method16(true, true);
        }
        int var7 = 0;
        class167 var8 = null;
        if (this.field3888 != null && arg1 < this.field3888.length) {
            int var9 = this.field3888[arg1];
            var8 = class137.method957(var9 >> 16, (byte) -96);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class1 var11 = arg0.method16(!var5.method1123(var6, 1), !this.field3885);
            var11.method22(var5, var6, this.field3885);
            return var11;
        } else {
            class1 var10 = arg0.method16(!var5.method1123(var6, 1) & !var8.method1123(var7, 1), !this.field3885);
            var10.method22(var5, var6, this.field3885);
            var10.method22(var8, var7, this.field3885);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBLa;)La;")
    public final class1 method1383(int arg0, int arg1, byte arg2, class1 arg3) {
        field3904++;
        int var5 = this.field3881[arg1];
        if (arg2 != -15) {
            return null;
        }
        class167 var6 = class137.method957(var5 >> 16, (byte) -77);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method16(true, true);
        }
        class1 var8 = arg3.method16(!var6.method1123(var7, 1), !this.field3885);
        int var9 = arg0 & 0x3;
        if (var9 == 1) {
            var8.method8();
        } else if (var9 == 2) {
            var8.method7();
        } else if (var9 == 3) {
            var8.method10();
        }
        var8.method22(var6, var7, this.field3885);
        if (var9 == 1) {
            var8.method10();
        } else if (var9 == 2) {
            var8.method7();
        } else if (var9 == 3) {
            var8.method8();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    public static void method1384(int arg0) {
        if (arg0 != -20670) {
            method1381(20, (byte) -71);
        }
        field3899 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lta;ILa;II)La;")
    public final class1 method1385(class208 arg0, int arg1, class1 arg2, int arg3, int arg4) {
        int var6 = this.field3881[arg4];
        field3892++;
        class167 var7 = class137.method957(var6 >> 16, (byte) -63);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method1378(arg1, (byte) -12, arg2);
        }
        int var9 = arg0.field3881[arg1];
        class167 var10 = class137.method957(var9 >> 16, (byte) -128);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class1 var12 = arg2.method16(!var7.method1123(var8, 1), !this.field3885);
            var12.method22(var7, var8, this.field3885);
            return var12;
        } else {
            class1 var13 = arg2.method16(!var7.method1123(var8, 1) & !var10.method1123(var11, 1), !arg0.field3885 & !this.field3885);
            var13.method3(var7, var8, var10, var11, this.field3907, arg0.field3885 | this.field3885);
            int var14 = 45 % ((-arg3 - 35) / 46);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BILce;)V")
    private final void method1386(byte arg0, int arg1, class28 arg2) {
        if (arg0 != 11) {
            return;
        }
        field3902++;
        if (arg1 == 1) {
            int var11 = arg2.method230((byte) -109);
            this.field3882 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3882[var12] = arg2.method230((byte) -112);
            }
            this.field3881 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field3881[var13] = arg2.method230((byte) -121);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field3881[var14] = (arg2.method230((byte) -111) << 16) + this.field3881[var14];
            }
        } else if (arg1 == 2) {
            this.field3901 = arg2.method230((byte) -118);
        } else if (arg1 == 3) {
            int var4 = arg2.method215(-1797813752);
            this.field3907 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3907[var5] = arg2.method215(class237.method1535(arg0, -1797813757));
            }
            this.field3907[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field3908 = true;
        } else if (arg1 == 5) {
            this.field3895 = arg2.method215(arg0 - 1797813763);
        } else if (arg1 == 6) {
            this.field3884 = arg2.method230((byte) -119);
        } else if (arg1 == 7) {
            this.field3887 = arg2.method230((byte) -119);
        } else if (arg1 == 8) {
            this.field3896 = arg2.method215(-1797813752);
        } else if (arg1 == 9) {
            this.field3905 = arg2.method215(arg0 ^ 0x94D78A03);
        } else if (arg1 == 10) {
            this.field3897 = arg2.method215(arg0 ^ 0x94D78A03);
        } else if (arg1 == 11) {
            this.field3906 = arg2.method215(-1797813752);
        } else if (arg1 == 12) {
            int var8 = arg2.method215(-1797813752);
            this.field3888 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3888[var9] = arg2.method230((byte) -127);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3888[var10] += arg2.method230((byte) -106) << 16;
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method215(-1797813752);
            this.field3883 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3883[var7] = arg2.method225(54);
            }
            return;
        } else if (arg1 == 14) {
            this.field3885 = true;
            return;
        }
    }
}
