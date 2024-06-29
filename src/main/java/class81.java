import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class81 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
    private int[] field1251;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lhl;")
    public static class139 field1261 = new class139(64);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lpk;")
    public static class237 field1266;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lji;")
    public static class256 field1262;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1255++;
        int var9 = arg1 - arg7;
        int var10 = arg2 - arg5;
        int var11 = (arg8 - arg6 << 16) / var9;
        int var12 = (arg3 - arg0 << 16) / var10;
        class240.method1644(var12, arg1, -7076, arg4, 0, arg6, arg0, var11, arg5, arg2, arg7);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public static final int method630(int arg0, int arg1) {
        field1254++;
        double var2 = (double) ((arg0 & 0xFF2D) >> 8) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & 0xFFF7FB) >> 16) / 256.0D;
        double var8 = var6;
        double var10 = var6;
        double var12 = 0.0D;
        if (var6 < var2) {
            var10 = var2;
        }
        if (var2 < var6) {
            var8 = var2;
        }
        if (var10 < var4) {
            var10 = var4;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var14 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8);
            } else if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 4.0D;
            }
        }
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        if (arg1 != -495735545) {
            field1265 = 86;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var21 > 243) {
            var18 >>= 0x4;
        } else if (var21 > 217) {
            var18 >>= 0x3;
        } else if (var21 > 192) {
            var18 >>= 0x2;
        } else if (var21 > 179) {
            var18 >>= 0x1;
        }
        int var22 = (int) (var19 * 256.0D);
        return (var22 >> 2 << 10) + (var18 >> 5 << 7) + (var21 >> 1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
    public final int method631(int arg0, byte arg1) {
        if (arg1 != -50) {
            return -78;
        }
        field1257++;
        int var3 = (this.field1251.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field1251[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1251[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([I)V")
    public class81(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1251 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1251[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1251[var5 - (-var5 - 1)] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1251[var5 + var5] = arg0[var4];
            this.field1251[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static final void method632(boolean arg0) {
        class76.method605((byte) -77, class249.field3862);
        field1264++;
        int var1 = (class90.field1377 >> 10) + (class90.field1367 >> 3);
        int var2 = (class209.field3127 >> 10) + (class188.field2774 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class259.field3974 = new byte[var6][];
        class283.field4334 = new int[var6];
        class32.field581 = new int[var6][4];
        class165.field2429 = new byte[var6][];
        class51.field841 = new int[var6];
        class220.field3417 = new int[var6];
        class168.field2480 = new byte[var6][];
        class18.field323 = new int[var6];
        class59.field976 = new int[var6];
        class244.field3786 = new int[var6];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class18.field323[var7] = var11;
                class51.field841[var7] = class210.field3143.method1621("m" + var8 + "_" + var10, 1);
                class283.field4334[var7] = class210.field3143.method1621("l" + var8 + "_" + var10, 1);
                class220.field3417[var7] = class210.field3143.method1621("n" + var8 + "_" + var10, 1);
                class59.field976[var7] = class210.field3143.method1621("um" + var8 + "_" + var10, 1);
                class244.field3786[var7] = class210.field3143.method1621("ul" + var8 + "_" + var10, 1);
                if (class220.field3417[var7] == -1) {
                    class51.field841[var7] = -1;
                    class283.field4334[var7] = -1;
                    class59.field976[var7] = -1;
                    class244.field3786[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class220.field3417.length; var9++) {
            class220.field3417[var9] = -1;
            class51.field841[var9] = -1;
            class283.field4334[var9] = -1;
            class59.field976[var9] = -1;
            class244.field3786[var9] = -1;
        }
        class12.method87(arg0, 789221, var3, var2, var5, false, var1, var4);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method633(int arg0) {
        field1258++;
        if (class188.method1238(-8073) != 2) {
            return;
        }
        byte var1 = (byte) (class113.field1723 - 4 & 0xFF);
        int var2 = class113.field1723 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class50.field813[var3][var2][var17] = var1;
            }
        }
        if (class260.field3986 == 3) {
            return;
        }
        int var4 = 100 % ((-arg0 - 21) / 53);
        for (int var5 = 0; var5 < 2; var5++) {
            class195.field2954[var5] = -1000000;
            class86.field1312[var5] = 1000000;
            class62.field1034[var5] = 0;
            class221.field3443[var5] = 1000000;
            class3.field48[var5] = 0;
        }
        if (class133.field1954 != 1) {
            int var16 = class268.method1810(class260.field3986, class90.field1377, (byte) 118, class209.field3127);
            if (var16 - class157.field2292 >= 800 || (class247.field3844[class260.field3986][class90.field1377 >> 7][class209.field3127 >> 7] & 0x4) == 0) {
                return;
            }
            class66.method529(class209.field3127 >> 7, false, class90.field1377 >> 7, class3.field40, 1, false);
            return;
        }
        if ((class247.field3844[class260.field3986][class185.field2687.field425 >> 7][class185.field2687.field455 >> 7] & 0x4) != 0) {
            class66.method529(class185.field2687.field455 >> 7, false, class185.field2687.field425 >> 7, class3.field40, 0, false);
        }
        if (class254.field3919 >= 310) {
            return;
        }
        int var6 = class209.field3127 >> 7;
        int var7 = class90.field1377 >> 7;
        int var8 = class185.field2687.field425 >> 7;
        int var9;
        if (var8 > var7) {
            var9 = var8 - var7;
        } else {
            var9 = var7 - var8;
        }
        int var10 = class185.field2687.field455 >> 7;
        int var11;
        if (var10 <= var6) {
            var11 = var6 - var10;
        } else {
            var11 = var10 - var6;
        }
        if ((var9 != 0 || var11 != 0) && var9 > -104 && var9 < 104 && var11 > -104 && var11 < 104) {
            if (var11 >= var9) {
                int var12 = var9 * 65536 / var11;
                int var13 = 32768;
                while (var6 != var10) {
                    if (var6 < var10) {
                        var6++;
                    } else if (var10 < var6) {
                        var6--;
                    }
                    if ((class247.field3844[class260.field3986][var7][var6] & 0x4) != 0) {
                        class66.method529(var6, false, var7, class3.field40, 1, false);
                        return;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        if (var8 > var7) {
                            var7++;
                        } else if (var7 > var8) {
                            var7--;
                        }
                        var13 -= 65536;
                        if ((class247.field3844[class260.field3986][var7][var6] & 0x4) != 0) {
                            class66.method529(var6, false, var7, class3.field40, 1, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var7 != var8) {
                if (var7 < var8) {
                    var7++;
                } else if (var8 < var7) {
                    var7--;
                }
                if ((class247.field3844[class260.field3986][var7][var6] & 0x4) != 0) {
                    class66.method529(var6, false, var7, class3.field40, 1, false);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var6 < var10) {
                        var6++;
                    } else if (var10 < var6) {
                        var6--;
                    }
                    var15 -= 65536;
                    if ((class247.field3844[class260.field3986][var7][var6] & 0x4) != 0) {
                        class66.method529(var6, false, var7, class3.field40, 1, false);
                        return;
                    }
                }
            }
            return;
        }
        class121.method860((byte) 83, "RC: " + var7 + "," + var6 + " " + var8 + "," + var10 + " " + class90.field1367 + "," + class188.field2774, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BII)I")
    public static final int method634(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        field1263++;
        int var5 = 49 % ((arg3 + 45) / 40);
        for (int var6 = arg0; var6 < arg2; var6++) {
            var4 = var4 >>> 8 ^ class293.field4448[(var4 ^ arg1[var6]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)I")
    public static final int method635(boolean arg0, int arg1) {
        field1256++;
        if (!arg0) {
            method638(39);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final void method636(int arg0) {
        field1259++;
        class218.method1467(false, arg0 - 1000049);
        if (arg0 != 1000000) {
            field1262 = null;
        }
        System.gc();
        class88.method668(true, 25);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
    public static final void method637(int arg0, int arg1) {
        field1260++;
        if (arg1 >= -7) {
            method637(-20, -33);
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class195.method1314((byte) 87);
        } else if (arg0 == 2) {
            class30.method208(-11186);
        } else if (arg0 == 3) {
            class284.method1889(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static void method638(int arg0) {
        field1261 = null;
        field1262 = null;
        field1266 = null;
        if (arg0 != 0) {
            field1266 = null;
        }
    }
}
