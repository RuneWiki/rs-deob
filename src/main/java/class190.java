import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class190 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field3213 = -1;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Luh;")
    public static class198 field3214 = new class198();

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "[I")
    public static int[] field3227 = new int[2];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method1205(byte arg0) {
        if (arg0 >= -67) {
            method1205((byte) -27);
        }
        field3214 = null;
        field3227 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lth;I)V")
    public static final void method1206(class239 arg0, int arg1) {
        field3222++;
        class137 var2 = null;
        try {
            class74 var3 = arg0.method1598((byte) 102, "runescape");
            while (var3.field1302 == 0) {
                class171.method1088(arg1 ^ 0x2EE92B50, 1L);
            }
            if (var3.field1302 == 1) {
                var2 = (class137) var3.field1299;
                class226 var4 = class101.method618((byte) 126);
                var2.method855(var4.field3879, var4.field3901, 0, arg1 ^ 0xD116D4DB);
            }
            if (arg1 != 787032834) {
                method1207((byte[]) null, (byte) 84);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method856((byte) -113);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([BB)V")
    public static final void method1207(byte[] arg0, byte arg1) {
        if (arg1 > -101) {
            return;
        }
        int var2 = class3.field38 >> 2 << 10;
        int var3 = class104.field1813 >> 1;
        field3218++;
        byte[][] var4 = new byte[class249.field4322][class45.field753];
        int var5 = 0;
        while (true) {
            while (arg0.length > var5) {
                int var34 = (arg0[var5++] & 0xFF) * 64 - class86.field1492;
                int var35 = (arg0[var5++] & 0xFF) * 64 - class257.field4499;
                if (var34 > 0 && var35 > 0 && (var34 + 64) < class249.field4322 && (var35 + 64) < class45.field753) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var4[var34 + var36];
                        int var38 = class45.field753 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg0[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class249.field4322;
            int var7 = class45.field753;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var28 < var6) {
                        int var29 = var4[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class187 var30 = class231.method1560(var29 - 1, 45);
                            var9[var14] += var30.field3186;
                            var8[var14] += var30.field3185;
                            var10[var14] += var30.field3183;
                            var12[var14] += var30.field3192;
                            var10002 = var11[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var4[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class187 var33 = class231.method1560(var32 - 1, 45);
                            var9[var14] -= var33.field3186;
                            var8[var14] -= var33.field3185;
                            var10[var14] -= var33.field3183;
                            var12[var14] -= var33.field3192;
                            var10002 = var11[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class75.field1306[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        if (var7 > var22) {
                            var19 += var11[var22];
                            var16 += var8[var22];
                            var18 += var10[var22];
                            var17 += var9[var22];
                            var20 += var12[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var17 -= var9[var23];
                            var19 -= var11[var23];
                            var20 -= var12[var23];
                            var18 -= var10[var23];
                            var16 -= var8[var23];
                        }
                        if (var21 >= 0 && var19 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var20 == 0 ? 0 : class46.method257(var17 * 256 / var20, (byte) 11, var16 / var19, var18 / var19);
                            if (var4[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class75.field1306[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var3;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class76.method446(var13, 63) + class76.method446(var21 << 6, 4032)] = class62.field1135[class125.method775((byte) -93, 96, var27)];
                            } else if (var15[var24] != null) {
                                var15[var24][class76.method446(4032, var21 << 6) + class76.method446(63, var13)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lta;BI)Lub;")
    public static final class227 method1208(class105 arg0, byte arg1, int arg2) {
        field3217++;
        if (!class200.method1288(client.method494(arg0), 1, arg2) && arg0.field1832 == null) {
            return null;
        }
        if (arg1 != -127) {
            field3224 = 92;
        }
        if (arg0.field1903 == null || arg0.field1903.length <= arg2 || arg0.field1903[arg2] == null || arg0.field1903[arg2].method1519(-19150).method1521((byte) 62) == 0) {
            return class50.field882 ? class76.method445((byte) 79, new class227[] { class125.field2239, class204.method1303(arg2, 1) }) : null;
        } else {
            return arg0.field1903[arg2];
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method1209(byte arg0) {
        field3215++;
        if (class212.field3588 != null || class10.field194 != null) {
            return;
        }
        int var1 = class50.field885;
        if (class81.field1409) {
            if (var1 != 1) {
                int var2 = client.field1451;
                int var3 = class100.field1752;
                if (var3 < class69.field1219 - 10 || var3 > class69.field1219 + class186.field3165 + 10 || (class96.field1667 - 10) > var2 || class96.field1667 - (-class25.field415 - 10) < var2) {
                    class81.field1409 = false;
                    class103.method630((byte) 120, class96.field1667, class25.field415, class186.field3165, class69.field1219);
                }
            }
            if (var1 == 1) {
                int var4 = class186.field3165;
                int var5 = class69.field1219;
                int var6 = class81.field1403;
                int var7 = -1;
                int var8 = class232.field4043;
                int var9 = class96.field1667;
                for (int var10 = 0; var10 < class94.field1631; var10++) {
                    int var11 = var9 + ((class94.field1631 - (var10 + 1)) * 15) + 31;
                    if (var5 < var8 && var8 < (var4 + var5) && (var11 - 13) < var6 && var6 < var11 + 3) {
                        var7 = var10;
                    }
                }
                if (var7 != -1) {
                    class80.method468(var7, (byte) 119);
                }
                class81.field1409 = false;
                class103.method630((byte) 120, class96.field1667, class25.field415, class186.field3165, class69.field1219);
            }
        } else {
            if (var1 == 1 && class94.field1631 > 0) {
                short var12 = class19.field327[class94.field1631 - 1];
                if (var12 == 5 || var12 == 32 || var12 == 47 || var12 == 50 || var12 == 41 || var12 == 8 || var12 == 51 || var12 == 20 || var12 == 21 || var12 == 37 || var12 == 3 || var12 == 1003) {
                    int var13 = class210.field3562[class94.field1631 - 1];
                    int var14 = class236.field4099[class94.field1631 - 1];
                    class105 var15 = class27.method137(var14, -954490064);
                    if (class254.method1733((byte) 92, client.method494(var15)) || class33.method176(client.method494(var15), -109)) {
                        class28.field453 = 0;
                        class167.field2788 = false;
                        if (class212.field3588 != null) {
                            class198.method1268(127, class212.field3588);
                        }
                        class212.field3588 = class27.method137(var14, -954490064);
                        class87.field1515 = var13;
                        class119.field2174 = class81.field1403;
                        class95.field1641 = class232.field4043;
                        class198.method1268(104, class212.field3588);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class241.field4191 == 1 && class94.field1631 > 2 || class186.method1187(class94.field1631 - 1, 27651))) {
                var1 = 2;
            }
            if (var1 == 1 && class94.field1631 > 0) {
                class80.method468(class94.field1631 - 1, (byte) 119);
            }
            if (var1 == 2 && class94.field1631 > 0) {
                class105.method650(-6416);
            }
        }
        if (arg0 != -125) {
            field3227 = null;
        }
    }
}
