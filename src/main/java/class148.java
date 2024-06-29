import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class148 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2151 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method897(int arg0) {
        field2152++;
        if (class8.method41((byte) -124) != 2) {
            return;
        }
        int var1 = class246.field3674 % 104;
        byte var2 = (byte) (class246.field3674 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class272.field4093[var3][var1][var16] = var2;
            }
        }
        if (class99.field1557 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class97.field1531[var4] = -1000000;
            class237.field3581[var4] = 1000000;
            class180.field2735[var4] = 0;
            class77.field1238[var4] = 1000000;
            class220.field3310[var4] = 0;
        }
        if (class253.field3837 != arg0) {
            int var15 = class183.method1139(class99.field1557, class47.field763, class128.field1922, (byte) 117);
            if ((var15 - class213.field3184) >= 800 || (class221.field3333[class99.field1557][class128.field1922 >> 7][class47.field763 >> 7] & 0x4) == 0) {
                return;
            }
            class81.method533(1, false, class33.field487, -2873, class128.field1922 >> 7, class47.field763 >> 7);
            return;
        }
        if ((class221.field3333[class99.field1557][class165.field2537.field2251 >> 7][class165.field2537.field2234 >> 7] & 0x4) != 0) {
            class81.method533(0, false, class33.field487, -2873, class165.field2537.field2251 >> 7, class165.field2537.field2234 >> 7);
        }
        if (class259.field3949 >= 310) {
            return;
        }
        int var5 = class128.field1922 >> 7;
        int var6 = class47.field763 >> 7;
        int var7 = class165.field2537.field2251 >> 7;
        int var8 = class165.field2537.field2234 >> 7;
        int var9;
        if (var7 > var5) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -104 && var9 < 104 && var10 > -104 && var10 < 104) {
            if (var10 < var9) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class221.field3333[class99.field1557][var5][var6] & 0x4) != 0) {
                        class81.method533(1, false, class33.field487, -2873, var5, var6);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var6 < var8) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class221.field3333[class99.field1557][var5][var6] & 0x4) != 0) {
                            class81.method533(1, false, class33.field487, -2873, var5, var6);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class221.field3333[class99.field1557][var5][var6] & 0x4) != 0) {
                    class81.method533(1, false, class33.field487, -2873, var5, var6);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class221.field3333[class99.field1557][var5][var6] & 0x4) != 0) {
                        class81.method533(1, false, class33.field487, -2873, var5, var6);
                        return;
                    }
                }
            }
            return;
        }
        class275.method1822("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class81.field1303 + "," + class147.field2141, (byte) -121, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V")
    public static final void method898(boolean arg0, int arg1) {
        field2154++;
        byte var2 = 4;
        byte[][] var3 = class160.field2471;
        if (arg1 != 65536) {
            return;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class48.field767[var5] >> 8;
            int var14 = class48.field767[var5] & 0xFF;
            int var15 = var13 * 64 - class81.field1303;
            int var16 = var14 * 64 - class147.field2141;
            if (var12 != null) {
                class39.method231(false);
                var11 = class53.method358(class81.field1303, var16, arg0, class147.field2141, (byte) 53, var12, var15, class202.field3052);
            }
            if (!arg0 && class132.field1940 / 8 == var13 && (class177.field2721 / 8) == var14) {
                if (var11 == null) {
                    class276.field4156 = -1;
                } else {
                    class276.field4156 = var11[0];
                    class89.field1401 = var11[1];
                    class127.field1912 = var11[4];
                    class1.field8 = var11[3];
                    class195.field2968 = var11[2];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class48.field767[var6] >> 8) * 64 - class81.field1303;
            int var8 = (class48.field767[var6] & 0xFF) * 64 - class147.field2141;
            byte[] var9 = var3[var6];
            if (var9 == null && class177.field2721 < 800) {
                class39.method231(false);
                for (int var10 = 0; var10 < var2; var10++) {
                    class177.method1104(var8, 64, 64, var7, var10, 3548);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method899(int arg0) {
        if (arg0 != 1040803975) {
            method902(0, -57);
        }
        field2151 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lpf;Lpf;I)V")
    public static final void method900(class294 arg0, class294 arg1, int arg2) {
        if (arg2 != -635875257) {
            field2150 = -4;
        }
        field2148++;
        class186.field2825 = arg0;
        class115.field1757 = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public static final void method901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2153++;
        if (arg1 != 11681) {
            field2151 = null;
        }
        class64.method429(class23.field284[arg4], arg0 - arg3, (byte) 116, arg2, arg0 + arg3);
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class23.field284[arg4 + var6];
                var7 -= var6 << 1;
                int var10 = arg0 + var5;
                int[] var11 = class23.field284[arg4 - var6];
                int var12 = arg0 - var5;
                class64.method429(var9, var12, (byte) 89, arg2, var10);
                class64.method429(var11, var12, (byte) 114, arg2, var10);
            }
            int var13 = arg0 + var6;
            int[] var14 = class23.field284[arg4 + var5];
            int var15 = arg0 - var6;
            int[] var16 = class23.field284[arg4 - var5];
            class64.method429(var14, var15, (byte) 117, arg2, var13);
            class64.method429(var16, var15, (byte) 118, arg2, var13);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method902(int arg0, int arg1) {
        field2155++;
        class253.field3850.method1780(arg0, true);
        class235.field3546.method1780(arg0, true);
        if (arg1 != 800) {
            method897(-88);
        }
        class50.field792.method1780(arg0, true);
        class62.field980.method1780(arg0, true);
    }
}
