import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class86 extends class152 {

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    private int field1475 = 0;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "Z")
    private boolean field1490 = true;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    private int field1505 = -1;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    private int field1509 = -32768;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    private int field1506 = 0;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "Z")
    private boolean field1503 = false;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    private int field1498 = -1;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    private int field1502 = 0;

    @OriginalMember(owner = "client!go", name = "cb", descriptor = "Z")
    private boolean field1518 = false;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "Lka;")
    private class211 field1512 = null;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "Lmi;")
    private class300 field1486;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "I")
    public static int field1494 = -1;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "[Z")
    public static boolean[] field1485 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "Len;")
    public static class49 field1501 = new class49();

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!go", name = "V", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!go", name = "X", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!go", name = "Y", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!go", name = "ab", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!go", name = "db", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "Lgl;")
    private class214 field1481;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V", line = 7)
    private final void method652(int arg0, int arg1) {
        field1499++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class238 var5 = class1.method7(this.field1510, arg0 - 19918);
            class238 var6 = var5;
            if (var5.field3937 != null) {
                var5 = var5.method1651(-114);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3927 != null) {
                if (this.field1486 != null && var5.method1659(this.field1486.field4860, true)) {
                    return;
                }
                var3 = var5.method1653(true);
                if (this.field1498 != var5.field3896) {
                    var4 = var5.field3942;
                }
            } else if (var5.field3904 == -1) {
                if (var6 != null && var6.field3927 != null) {
                    if (this.field1486 != null && var6.method1659(this.field1486.field4860, true)) {
                        return;
                    }
                    var3 = var6.method1653(true);
                    if (this.field1498 != var6.field3896) {
                        var4 = var6.field3942;
                    }
                } else if (var6 != null && var6.field3904 != -1 && this.field1498 != var6.field3896) {
                    var3 = var6.field3904;
                    var4 = var6.field3942;
                }
            } else if (this.field1498 != var5.field3896) {
                var4 = var5.field3942;
                var3 = var5.field3904;
            }
        }
        if (arg0 != 19943) {
            this.field1481 = (class214) null;
        }
        if (var3 == -1) {
            this.field1486 = null;
            return;
        }
        if (this.field1486 == null || this.field1486.field4860 != var3) {
            this.field1486 = class258.method1807(var3, 70);
        } else if (this.field1486.field4872 == 0) {
            return;
        }
        if (var4) {
            this.field1515 = (int) (Math.random() * (double) this.field1486.field4885.length);
            this.field1500 = (int) (Math.random() * (double) this.field1486.field4877[this.field1515]) + 1;
        } else {
            this.field1515 = 0;
            this.field1500 = 1;
        }
        this.field1487 = this.field1515 + 1;
        if (this.field1487 < 0 || this.field1486.field4885.length <= this.field1487) {
            this.field1487 = -1;
        }
        this.field1495 = class267.field4371 - this.field1500;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIZLml;)V", line = 1268)
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class152 arg8) {
        this.field1483 = arg2;
        this.field1479 = arg1;
        this.field1507 = arg3;
        this.field1480 = arg5;
        this.field1510 = arg0;
        this.field1517 = arg4;
        if (arg8 != null) {
            this.field1518 = true;
            if ((arg8 instanceof class86)) {
                class86 var11 = (class86) arg8;
                if (class241.field4016) {
                    var11.method661(true);
                }
                this.field1487 = var11.field1487;
                this.field1515 = var11.field1515;
                this.field1495 = var11.field1495;
                this.field1486 = var11.field1486;
                this.field1500 = var11.field1500;
            } else if (class241.field4016) {
                class238 var10 = class1.method7(this.field1510, 25);
                if (var10.field3937 != null) {
                    var10 = var10.method1651(89);
                }
                if (var10 != null) {
                    method660(var10, this.field1507, this.field1480, 0, -8594, this.field1517, 0, this.field1483, this.field1479);
                }
            }
        }
        if (this.field1518) {
            this.method652(19943, arg6);
        }
        if (class241.field4016 && arg8 != null) {
            this.method664(true, 126);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)V", line = 127)
    public static final void method653(int arg0, int arg1, int arg2, int arg3) {
        field1493++;
        String var4 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class108.method805(var4, 0);
        if (arg1 != 3) {
            method659(true, (char) 65478, -107);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Lml;", line = 140)
    public final class152 method654(byte arg0) {
        field1513++;
        return arg0 == -51 ? this.method664(false, 98) : (class152) null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIII)V", line = 156)
    public static final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1516++;
        if (arg5 != 4357) {
            method663(40);
        }
        if (arg1 == arg4) {
            class156.method1104(arg4, (byte) 43, arg2, arg3, arg0);
        } else if ((arg3 - arg4) >= class190.field3224 && class289.field4704 >= (arg3 + arg4) && (arg0 - arg1) >= class87.field1520 && class177.field2930 >= arg0 + arg1) {
            class191.method1323(arg4, arg0, 0, arg1, arg2, arg3);
        } else {
            class356.method2524(arg0, -25564, arg4, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 181)
    public static final int method656(String arg0, byte arg1) {
        if (arg1 > -29) {
            field1494 = 104;
        }
        field1489++;
        return class58.method484(true, (byte) -81, arg0, 10);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lva;IIIIIIZ)V", line = 194)
    public static final void method657(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2759.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2759[var9] - class1.field3;
            int var11 = arg0.field2764[var9] - class267.field4370;
            int var12 = arg0.field2776[var9] - class105.field1915;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2768 != null) {
                class165.field2763[var9] = var13;
                class165.field2762[var9] = var16;
                class165.field2766[var9] = var17;
            }
            class165.field2772[var9] = (var13 << 9) / var17 + class305.field4964;
            class165.field2770[var9] = (var16 << 9) / var17 + class305.field4963;
        }
        class305.field4958 = 0;
        int var19 = arg0.field2767.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2767[var20];
            int var22 = arg0.field2777[var20];
            int var23 = arg0.field2775[var20];
            int var24 = class165.field2772[var21];
            int var25 = class165.field2772[var22];
            int var26 = class165.field2772[var23];
            int var27 = class165.field2770[var21];
            int var28 = class165.field2770[var22];
            int var29 = class165.field2770[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class31.field712 && class335.method2361(class305.field4964 + class205.field3413, class305.field4963 + class274.field4472, var27, var28, var29, var24, var25, var26)) {
                    class7.field241 = arg5;
                    class267.field4364 = arg6;
                }
                if (!class241.field4016 && !arg7) {
                    class305.field4967 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class305.field4962 || var25 > class305.field4962 || var26 > class305.field4962) {
                        class305.field4967 = true;
                    }
                    if (arg0.field2768 == null || arg0.field2768[var20] == -1) {
                        if (arg0.field2774[var20] != 12345678) {
                            class305.method2224(var27, var28, var29, var24, var25, var26, arg0.field2774[var20], arg0.field2757[var20], arg0.field2761[var20]);
                        }
                    } else if (!class358.field5697) {
                        int var30 = class305.field4968.method85(arg0.field2768[var20], (byte) -82);
                        class305.method2224(var27, var28, var29, var24, var25, var26, class257.method1798(var30, arg0.field2774[var20]), class257.method1798(var30, arg0.field2757[var20]), class257.method1798(var30, arg0.field2761[var20]));
                    } else if (arg0.field2758) {
                        class305.method2231(var27, var28, var29, var24, var25, var26, arg0.field2774[var20], arg0.field2757[var20], arg0.field2761[var20], class165.field2763[0], class165.field2763[1], class165.field2763[3], class165.field2762[0], class165.field2762[1], class165.field2762[3], class165.field2766[0], class165.field2766[1], class165.field2766[3], arg0.field2768[var20]);
                    } else {
                        class305.method2231(var27, var28, var29, var24, var25, var26, arg0.field2774[var20], arg0.field2757[var20], arg0.field2761[var20], class165.field2763[var21], class165.field2763[var22], class165.field2763[var23], class165.field2762[var21], class165.field2762[var22], class165.field2762[var23], class165.field2766[var21], class165.field2766[var22], class165.field2766[var23], arg0.field2768[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILml;)V", line = 307)
    private final void method658(int arg0, class152 arg1) {
        if (class241.field4016) {
            class294 var3 = (class294) arg1;
            if ((this.field1481 == null || this.field1481.field3531) && (var3.field4780 != null || var3.field4772 != null)) {
                class238 var4 = class1.method7(this.field1510, 25);
                if (var4.field3937 != null) {
                    var4 = var4.method1651(56);
                }
                if (var4 != null) {
                    this.field1481 = new class214(class267.field4371, var4.field3935, var4.field3890);
                }
            }
            if (this.field1481 != null) {
                this.field1481.method1491(var3.field4780, var3.field4772, false, var3.field4753, var3.field4759, var3.field4762);
            }
        } else {
            class95 var5 = (class95) arg1;
            if ((this.field1481 == null || this.field1481.field3531) && (var5.field1681 != null || var5.field1667 != null)) {
                class238 var6 = class1.method7(this.field1510, 25);
                if (var6.field3937 != null) {
                    var6 = var6.method1651(40);
                }
                if (var6 != null) {
                    this.field1481 = new class214(class267.field4371, var6.field3935, var6.field3890);
                }
            }
            if (this.field1481 != null) {
                this.field1481.method1491(var5.field1681, var5.field1667, false, var5.field1698, var5.field1677, var5.field1688);
            }
        }
        field1477++;
        if (arg0 != 16) {
            this.method662(86, 112, -67);
        }
        this.field1503 = true;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()I", line = 364)
    public final int method340() {
        field1491++;
        return this.field1509;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZCI)C", line = 372)
    public static final char method659(boolean arg0, char arg1, int arg2) {
        field1514++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (!arg0) {
            field1485 = (boolean[]) null;
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 470)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        class152 var13 = this.method654((byte) -51);
        field1482++;
        if (var13 != null) {
            this.method658(16, var13);
            var13.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1481);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lqn;IIIIIIII)V", line = 489)
    public static final void method660(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg7 & 0x3;
        field1511++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg0.field3935;
            var10 = arg0.field3890;
        } else {
            var10 = arg0.field3935;
            var11 = arg0.field3890;
        }
        int var12;
        int var13;
        if ((arg5 + var10) <= 104) {
            var12 = arg5 + (var10 >> 1);
            var13 = (var10 + 1 >> 1) + arg5;
        } else {
            var13 = arg5 + 1;
            var12 = arg5;
        }
        int var14;
        int var15;
        if ((arg2 + var11) <= 104) {
            var14 = (var11 + 1 >> 1) + arg2;
            var15 = (var11 >> 1) + arg2;
        } else {
            var15 = arg2;
            var14 = arg2 + 1;
        }
        int var16 = (arg5 << 7) + (var10 << 6);
        int[][] var17 = class144.field2427[arg1];
        int var18 = (arg2 << 7) + (var11 << 6);
        int var19 = var17[var12][var15] + var17[var13][var15] + var17[var12][var14] + var17[var13][var14] >> 2;
        int var20 = 0;
        if (arg1 != 0) {
            int[][] var21 = class144.field2427[0];
            var20 = var19 - (var21[var12][var14] + var21[var13][var15] + var21[var12][var15] + var21[var13][var14] >> 2);
        }
        if (arg4 != -8594) {
            method656((String) null, (byte) -17);
        }
        int[][] var22 = (int[][]) null;
        if (arg1 < 3) {
            var22 = class144.field2427[arg1 + 1];
        }
        class223 var23 = arg0.method1661(var18, arg7, var19, var16, -67, false, (class211) null, arg8, var22, true, var17);
        class221.method1543(var23.field3689, var16 - arg3, var20, var18 - arg6);
    }

    @OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V", line = 566)
    protected final void finalize() {
        if (this.field1481 != null) {
            this.field1481.method1486();
        }
        field1488++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 577)
    public final void method661(boolean arg0) {
        field1478++;
        if (this.field1512 != null) {
            class221.method1543(this.field1512, this.field1502, this.field1506, this.field1475);
            this.field1512 = null;
        }
        if (!arg0) {
            this.method661(true);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V", line = 597)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1492++;
        class152 var6 = null;
        if (class241.field4016) {
            var6 = this.method664(true, 113);
        } else {
            this.method662(arg3, arg4, 0);
        }
        if (!this.field1503) {
            if (var6 == null) {
                var6 = this.method654((byte) -51);
            }
            if (var6 == null) {
                return;
            }
            this.method658(16, var6);
        }
        if (this.field1481 != null) {
            this.field1481.method1483(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(III)V", line = 640)
    private final void method662(int arg0, int arg1, int arg2) {
        field1484++;
        if (arg2 != 0) {
            return;
        }
        label92: while (true) {
            if (this.field1486 == null) {
                if (this.field1518) {
                    return;
                }
                this.method652(arg2 + 19943, -1);
                if (this.field1486 == null) {
                    return;
                }
            }
            int var4 = class267.field4371 - this.field1495;
            if (var4 > 100 && this.field1486.field4871 > 0) {
                int var5 = this.field1486.field4885.length - this.field1486.field4871;
                while (this.field1515 < var5 && var4 > this.field1486.field4877[this.field1515]) {
                    var4 -= this.field1486.field4877[this.field1515];
                    this.field1515++;
                }
                if (var5 <= this.field1515) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1486.field4885.length; var7++) {
                        var6 += this.field1486.field4877[var7];
                    }
                    var4 %= var6;
                }
                this.field1487 = this.field1515 + 1;
                if (this.field1486.field4885.length <= this.field1487) {
                    this.field1487 -= this.field1486.field4871;
                    if (this.field1487 < 0 || this.field1487 >= this.field1486.field4885.length) {
                        this.field1487 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1486.field4877[this.field1515] >= var4) {
                            this.field1495 = class267.field4371 - var4;
                            this.field1500 = var4;
                            return;
                        }
                        class347.method2479(false, (byte) -127, this.field1486, this.field1515, arg0, arg1);
                        var4 -= this.field1486.field4877[this.field1515];
                        this.field1515++;
                        if (this.field1486.field4885.length <= this.field1515) {
                            this.field1515 -= this.field1486.field4871;
                            if (this.field1515 < 0 || this.field1486.field4885.length <= this.field1515) {
                                this.field1486 = null;
                                continue label92;
                            }
                        }
                        this.field1487 = this.field1515 + 1;
                    } while (this.field1486.field4885.length > this.field1487);
                    this.field1487 -= this.field1486.field4871;
                } while (this.field1487 >= 0 && this.field1487 < this.field1486.field4885.length);
                this.field1487 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 739)
    public static void method663(int arg0) {
        if (arg0 != -4) {
            field1501 = (class49) null;
        }
        field1485 = null;
        field1501 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lml;", line = 767)
    private final class152 method664(boolean arg0, int arg1) {
        field1519++;
        if (arg1 < 97) {
            this.field1498 = -41;
        }
        boolean var3 = class144.field2427 != class123.field2166;
        class238 var4 = class1.method7(this.field1510, 25);
        if (var4.field3937 != null) {
            var4 = var4.method1651(53);
        }
        if (var4 == null) {
            if (class241.field4016 && !var3) {
                this.method661(true);
            }
            this.field1505 = this.field1515;
            this.field1498 = -1;
            return null;
        }
        if (!this.field1518 && this.field1498 != var4.field3896) {
            this.method652(19943, -1);
        }
        int var5 = this.field1483 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3935;
            var7 = var4.field3890;
        } else {
            var6 = var4.field3890;
            var7 = var4.field3935;
        }
        int var8 = this.field1517 + (var7 >> 1);
        int var9 = this.field1517 + (var7 + 1 >> 1);
        int var10 = (var6 >> 1) + this.field1480;
        int var11 = (var6 + 1 >> 1) + this.field1480;
        this.method662(var8 * 128, var10 * 128, 0);
        boolean var12 = !var3 && var4.field3956 && (this.field1498 != var4.field3896 || (this.field1515 != this.field1505 || this.field1486 != null && (this.field1486.field4863 || class139.field2362) && this.field1515 != this.field1487) && class111.field2032 >= 2);
        if (arg0 && !var12) {
            this.field1498 = var4.field3896;
            this.field1505 = this.field1515;
            return null;
        }
        int[][] var13 = class144.field2427[this.field1507];
        int var14 = var13[var8][var10] + var13[var9][var10] + var13[var8][var11] + var13[var9][var11] >> 2;
        int var15 = (this.field1480 << 7) + (var6 << 6);
        int var16 = (this.field1517 << 7) + (var7 << 6);
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class123.field2166[0];
        } else if (this.field1507 < 3) {
            var17 = class144.field2427[this.field1507 + 1];
        }
        if (class241.field4016 && var12) {
            class221.method1543(this.field1512, this.field1502, this.field1506, this.field1475);
        }
        boolean var18 = this.field1512 == null;
        class223 var19;
        if (this.field1486 == null) {
            var19 = var4.method1661(var15, this.field1483, var14, var16, -67, false, var18 ? class235.field3853 : this.field1512, this.field1479, var17, var12, var13);
        } else {
            var19 = var4.method1655(var14, this.field1515, this.field1479, this.field1486, this.field1487, var18 ? class235.field3853 : this.field1512, var13, 99, var12, this.field1483, var17, var16, this.field1500, var15);
        }
        if (var19 == null) {
            this.field1498 = var4.field3896;
            this.field1505 = this.field1515;
            return null;
        }
        if (class241.field4016 && var12) {
            if (var18) {
                class235.field3853 = var19.field3689;
            }
            int var20 = 0;
            if (this.field1507 != 0) {
                int[][] var21 = class144.field2427[0];
                var20 = var14 - (var21[var8][var10] + var21[var9][var10] + var21[var8][var11] + var21[var9][var11] >> 2);
            }
            class211 var22 = var19.field3689;
            if (this.field1490 && class221.method1535(var22, var16, var20, var15)) {
                this.field1490 = false;
            }
            if (!this.field1490) {
                class221.method1550(var22, var16, var20, var15);
                this.field1475 = var15;
                this.field1506 = var20;
                this.field1502 = var16;
                if (var18) {
                    class235.field3853 = null;
                }
                this.field1512 = var22;
            }
        }
        this.field1505 = this.field1515;
        this.field1498 = var4.field3896;
        return var19.field3681;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILg;)V", line = 941)
    public static final void method665(int arg0, int arg1, int arg2, class181 arg3) {
        field1476++;
        if (arg3.field3101 == 1) {
            class355.field5667++;
            class358.method2530("", 0L, arg3.field3103, (short) 40, false, arg3.field2998, 0, -1);
        }
        if (arg3.field3101 == 2 && !class52.field1046) {
            String var4 = class71.method542(arg3, 1);
            if (var4 != null) {
                class300.field4884++;
                class358.method2530("<col=00ff00>" + arg3.field3005, 0L, arg3.field3103, (short) 20, false, var4, -1, -1);
            }
        }
        if (arg3.field3101 == 3) {
            class192.field3257++;
            class358.method2530("", 0L, arg3.field3103, (short) 7, false, class137.field2336, 0, -1);
        }
        if (arg3.field3101 == 4) {
            class358.method2530("", 0L, arg3.field3103, (short) 33, false, arg3.field2998, 0, -1);
            class96.field1748++;
        }
        if (arg3.field3101 == 5) {
            class190.field3219++;
            class358.method2530("", 0L, arg3.field3103, (short) 19, false, arg3.field2998, 0, -1);
        }
        if (arg0 != -1) {
            return;
        }
        if (arg3.field3101 == 6 && class140.field2371 == null) {
            class358.method2530("", 0L, arg3.field3103, (short) 12, false, arg3.field2998, -1, -1);
            class308.field5020++;
        }
        if (arg3.field3098 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field3057; var6++) {
                for (int var7 = 0; var7 < arg3.field2981; var7++) {
                    int var8 = (arg3.field3034 + 32) * var6;
                    int var9 = (arg3.field3007 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg3.field3141[var5];
                        var9 += arg3.field3078[var5];
                    }
                    if (arg1 >= var9 && var8 <= arg2 && (var9 + 32) > arg1 && (var8 + 32) > arg2) {
                        class285.field4660 = var5;
                        class275.field4488 = arg3;
                        if (arg3.field2983[var5] > 0) {
                            class340 var10 = client.method1990(arg3);
                            class11 var11 = class296.method2124(~arg0, arg3.field2983[var5] - 1);
                            if (class222.field3674 == 1 && var10.method2405(9179409)) {
                                if (class15.field452 != arg3.field3103 || class303.field4936 != var5) {
                                    class13.field393++;
                                    class358.method2530(class147.field2511 + " -> <col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, (short) 13, false, class363.field5744, var5, -1);
                                }
                            } else if (class52.field1046 && var10.method2405(9179409)) {
                                class321 var12 = class143.field2415 == -1 ? null : class346.method2467(class143.field2415, 11);
                                if ((class332.field5295 & 0x10) != 0 && (var12 == null || var11.method114(-129, class143.field2415, var12.field5223) != var12.field5223)) {
                                    class39.field861++;
                                    class358.method2530(class10.field287 + " -> <col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, (short) 22, false, class112.field2047, var5, class13.field397);
                                }
                            } else {
                                class255.field4180++;
                                String[] var13 = var11.field340;
                                if (class178.field2940) {
                                    var13 = class195.method1345(0, var13);
                                }
                                if (var10.method2405(9179409)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 8;
                                            } else {
                                                var15 = 49;
                                            }
                                            class134.field2304++;
                                            class358.method2530("<col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, var15, false, var13[var14], var5, -1);
                                        }
                                    }
                                }
                                if (var10.method2402((byte) -110)) {
                                    class301.field4896++;
                                    class358.method2530("<col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, (short) 44, false, class363.field5744, var5, class284.field4642);
                                }
                                if (var10.method2405(9179409) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class25.field654++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 48;
                                            }
                                            if (var16 == 1) {
                                                var17 = 9;
                                            }
                                            if (var16 == 2) {
                                                var17 = 60;
                                            }
                                            class358.method2530("<col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, var17, false, var13[var16], var5, -1);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field3086;
                                if (class178.field2940) {
                                    var18 = class195.method1345(0, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 23;
                                            }
                                            class143.field2404++;
                                            if (var19 == 1) {
                                                var20 = 26;
                                            }
                                            if (var19 == 2) {
                                                var20 = 51;
                                            }
                                            if (var19 == 3) {
                                                var20 = 29;
                                            }
                                            if (var19 == 4) {
                                                var20 = 58;
                                            }
                                            class358.method2530("<col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, var20, false, var18[var19], var5, -1);
                                        }
                                    }
                                }
                                class358.method2530("<col=ff9040>" + var11.field318, (long) var11.field354, arg3.field3103, (short) 1001, false, class21.field547, var5, class153.field2624);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field3058) {
            return;
        }
        if (!class52.field1046) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class135.method950(arg3, -90, var21);
                if (var22 != null) {
                    class229.field3754++;
                    class358.method2530(arg3.field3119, (long) (var21 + 1), arg3.field3103, (short) 1011, false, var22, arg3.field3023, class97.method738(var21, arg0 + 14002, arg3));
                }
            }
            String var23 = class71.method542(arg3, 1);
            if (var23 != null) {
                class300.field4884++;
                class358.method2530(arg3.field3119, 0L, arg3.field3103, (short) 20, false, var23, arg3.field3023, -1);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class135.method950(arg3, -113, var24);
                if (var25 != null) {
                    class358.method2530(arg3.field3119, (long) (var24 + 1), arg3.field3103, (short) 41, false, var25, arg3.field3023, class97.method738(var24, 14001, arg3));
                    class229.field3754++;
                }
            }
            if (client.method1990(arg3).method2395(-44)) {
                if (arg3.field3120 == null) {
                    class358.method2530("", 0L, arg3.field3103, (short) 12, false, class173.field2875, arg3.field3023, -1);
                } else {
                    class358.method2530("", 0L, arg3.field3103, (short) 12, false, arg3.field3120, arg3.field3023, -1);
                }
                class308.field5020++;
            }
        } else if (client.method1990(arg3).method2396(110) && (class332.field5295 & 0x20) != 0) {
            class358.method2530(class10.field287 + " -> " + arg3.field3119, 0L, arg3.field3103, (short) 11, false, class112.field2047, arg3.field3023, class13.field397);
            class127.field2220++;
        }
    }
}
