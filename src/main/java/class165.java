import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class165 {

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lta;")
    private class254 field2917 = new class254();

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lj;")
    public static class165 field2914 = new class165();

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lta;")
    private class254 field2918;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
    public final int method1188(int arg0) {
        field2904++;
        class254 var2 = this.field2917.field4604;
        int var3 = 0;
        while (this.field2917 != var2) {
            var2 = var2.field4604;
            var3++;
        }
        if (arg0 >= -56) {
            method1193(93, 2, (class93) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)V")
    public static final void method1189(byte arg0, int arg1, int arg2) {
        if (class195.field3552 != 0 && arg2 != -1) {
            class15.method69(false, 0, class232.field4144, arg2, class195.field3552, -933796316);
            class254.field4599 = true;
        }
        field2912++;
        if (arg0 >= -71) {
            method1197(-15, -56, -124);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILta;)V")
    public final void method1190(int arg0, class254 arg1) {
        field2913++;
        if (arg1.field4595 != null) {
            arg1.method1728(28169);
        }
        arg1.field4595 = this.field2917.field4595;
        arg1.field4604 = this.field2917;
        arg1.field4595.field4604 = arg1;
        arg1.field4604.field4595 = arg1;
        if (arg0 != 64) {
            field2919 = 79;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public final void method1191(int arg0) {
        while (true) {
            class254 var2 = this.field2917.field4604;
            if (this.field2917 == var2) {
                if (arg0 != -27254) {
                    method1199(118, -73, 86);
                }
                this.field2918 = null;
                field2906++;
                return;
            }
            var2.method1728(28169);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILee;)V")
    public static final void method1192(int arg0, class280 arg1) {
        field2911++;
        int var2 = class39.field602 >> 2 << 10;
        int var3 = class69.field1256 >> 1;
        byte[][] var4 = new byte[class148.field2599][class183.field3373];
        while (arg1.field5027 < arg1.field5011.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method1907(16832) == 1) {
                var34 = arg1.method1907(16832);
                var35 = arg1.method1907(16832);
                var33 = true;
            }
            int var36 = arg1.method1907(16832);
            int var37 = arg1.method1907(16832);
            int var38 = class76.field1404 - (var37 * 64 - (class183.field3373 - 1));
            int var39 = var36 * 64 - class251.field4518;
            if (var39 >= 0 && var38 - 63 >= 0 && (var39 + 63) < class148.field2599 && var38 < class183.field3373) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= var34 * 8 && var40 < var34 * 8 + 8 && var35 * 8 <= var42 && var42 < var35 * 8 + 8) {
                            var41[var38 - var42] = arg1.method1925(true);
                        }
                    }
                }
            } else if (var33) {
                arg1.field5027 += 64;
            } else {
                arg1.field5027 += 4096;
            }
        }
        int var5 = class148.field2599;
        int var6 = class183.field3373;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class136 var29 = class223.method1545(var28 - 1, 1);
                        var8[var13] += var29.field2387;
                        var7[var13] += var29.field2380;
                        var9[var13] += var29.field2383;
                        var10[var13] += var29.field2389;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class136 var32 = class223.method1545(var31 - 1, arg0 + 1);
                        var8[var13] -= var32.field2387;
                        var7[var13] -= var32.field2380;
                        var9[var13] -= var32.field2383;
                        var10[var13] -= var32.field2389;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class180.field3174[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var19 += var11[var21];
                        var17 += var10[var21];
                        var16 += var7[var21];
                        var15 += var8[var21];
                        var18 += var9[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var16 -= var7[var22];
                        var18 -= var9[var22];
                        var15 -= var8[var22];
                        var17 -= var10[var22];
                        var19 -= var11[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class170.method1226(var16 / var19, var18 / var19, 25347, var15 * 256 / var17);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + ((var2 + var24 & 0xFC00) + var25);
                            var23[(class58.method333(var20, 63) << 6) + class58.method333(63, var12)] = class179.field3159[class32.method188(var26, 12345678, 96)];
                        } else if (var23 != null) {
                            var23[class58.method333(var12, 63) + (class58.method333(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            method1199(-101, -91, -116);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILcf;)V")
    public static final void method1193(int arg0, int arg1, class93 arg2) {
        if (arg1 <= 39) {
            return;
        }
        field2915++;
        class93 var3 = arg2.method676((byte) -117).method687(-96);
        boolean var4 = false;
        for (int var5 = 0; var5 < class252.field4543; var5++) {
            class237 var6 = class224.field4031[class234.field4166[var5]];
            if (var6 != null && var6.field4247 != null && var6.field4247.method649(var3, -4446)) {
                class171.method1228(2, false, 106, 0, 1, var6.field3820[0], class166.field2927.field3805[0], 1, 0, 0, class166.field2927.field3820[0], var6.field3805[0]);
                if (arg0 == 1) {
                    class285.field5105.method1568(188, (byte) 99);
                    class285.field5105.method1908(-120, class234.field4166[var5]);
                    class218.field3968++;
                } else if (arg0 == 4) {
                    class285.field5105.method1568(190, (byte) 117);
                    class285.field5105.method1908(-81, class234.field4166[var5]);
                    class56.field937++;
                } else if (arg0 == 5) {
                    class285.field5105.method1568(249, (byte) 52);
                    class285.field5105.method1904(class234.field4166[var5], true);
                    class218.field3973++;
                } else if (arg0 == 6) {
                    class285.field5105.method1568(123, (byte) 100);
                    class285.field5105.method1904(class234.field4166[var5], true);
                    class74.field1369++;
                } else if (arg0 == 7) {
                    class285.field5105.method1568(220, (byte) 91);
                    class285.field5105.method1927(-1356247032, class234.field4166[var5]);
                    class108.field1850++;
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class263.method1764(0, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { class68.field1236, var3 }));
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static final void method1194(int arg0) {
        field2916++;
        class112.field1904 = new class160();
        if (arg0 != 0) {
            method1193(93, -101, (class93) null);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Lta;")
    public final class254 method1195(byte arg0) {
        field2905++;
        class254 var2 = this.field2917.field4604;
        if (this.field2917 == var2) {
            return null;
        } else {
            var2.method1728(28169);
            return arg0 == 69 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Lta;")
    public final class254 method1196(int arg0) {
        class254 var2 = this.field2917.field4604;
        if (arg0 != 2) {
            method1201(99, 105, (byte) 14, 0, -77);
        }
        field2907++;
        if (this.field2917 == var2) {
            this.field2918 = null;
            return null;
        } else {
            this.field2918 = var2.field4604;
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
    public static final int method1197(int arg0, int arg1, int arg2) {
        field2909++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var5 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var5;
        }
        int var4 = 76 % ((arg0 + 52) / 63);
        return arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static void method1198(boolean arg0) {
        field2914 = null;
        if (!arg0) {
            field2920 = 117;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
    public static final void method1199(int arg0, int arg1, int arg2) {
        if (arg0 != 63) {
            return;
        }
        class208.field3731++;
        class285.field5105.method1568(134, (byte) 49);
        class285.field5105.method1927(-1356247032, arg1);
        field2908++;
        class285.field5105.method1903(true, arg2);
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)Lta;")
    public final class254 method1200(int arg0) {
        class254 var2 = this.field2918;
        field2903++;
        if (this.field2917 == var2) {
            this.field2918 = null;
            return null;
        } else {
            this.field2918 = var2.field4604;
            return arg0 == 9844 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBII)V")
    public static final void method1201(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = 106 % ((arg2 + 46) / 56);
        while (var5 < class161.field2845) {
            if ((class25.field311[var5] + class170.field2985[var5]) > arg4 && class170.field2985[var5] < arg4 + arg3 && arg0 < (class40.field616[var5] + class110.field1877[var5]) && class40.field616[var5] < arg0 + arg1) {
                class252.field4541[var5] = true;
            }
            var5++;
        }
        field2910++;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class165() {
        this.field2917.field4604 = this.field2917;
        this.field2917.field4595 = this.field2917;
    }
}
