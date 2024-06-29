import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field514 = 1;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Loa;")
    public static class99 field515 = class221.method1463(2844, " )4 ");

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Z")
    public static boolean field529 = false;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Loa;")
    public static class99 field511 = class221.method1463(2844, ")4p=");

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[[I")
    public static int[][] field531 = new int[104][104];

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Ltf;")
    public static class107 field532 = null;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Loa;")
    public static class99 field522 = class221.method1463(2844, "Abandonner");

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "J")
    private long field516;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "J")
    private long field519;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Z")
    public boolean field520;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[I")
    private int[] field526;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
    private int[] field536;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public final void method235(int arg0, int arg1, int arg2) {
        field517++;
        this.field536[arg2] = arg1;
        this.method246((byte) -70);
        if (arg0 != 938739256) {
            method248(116);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V")
    public final void method236(byte arg0, boolean arg1) {
        this.field520 = arg1;
        int var3 = -22 / ((6 - arg0) / 53);
        this.method246((byte) -70);
        field525++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Loa;")
    public static final class99 method237(int arg0, int arg1) {
        field527++;
        class99 var2 = new class99();
        var2.field1697 = new byte[arg0];
        var2.field1682 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class94.field1585[arg0][var8][var14] == -class112.field2022) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class189.field3337[arg0][arg1][arg3] + arg5;
            if (!class181.method1208(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class181.method1208(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class181.method1208(var9, var11, var13)) {
                return false;
            } else if (class181.method1208(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class187.method1281(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class181.method1208(var6 + 1, class189.field3337[arg0][arg1][arg3] + arg5, var7 + 1) && class181.method1208(var6 + 128 - 1, class189.field3337[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class181.method1208(var6 + 128 - 1, class189.field3337[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class181.method1208(var6 + 1, class189.field3337[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjb;IZILjb;)Lcl;")
    public final class195 method239(int arg0, class270 arg1, int arg2, boolean arg3, int arg4, class270 arg5) {
        if (arg0 <= 44) {
            return null;
        }
        field535++;
        if (this.field523 != -1) {
            return class50.method348(this.field523, -30026).method1665(arg5, arg1, arg4, arg2, (byte) 118);
        }
        int[] var7 = this.field526;
        long var8 = this.field516;
        if (arg1 != null && (arg1.field4756 >= 0 || arg1.field4745 >= 0)) {
            var7 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var7[var10] = this.field526[var10];
            }
            if (arg1.field4756 >= 0) {
                if (arg1.field4756 == 65535) {
                    var8 ^= 0xFFFFFFFF00000000L;
                    var7[5] = 0;
                } else {
                    var7[5] = class179.method1194(1073741824, arg1.field4756);
                    var8 ^= (long) var7[5] << 32;
                }
            }
            if (arg1.field4745 >= 0) {
                if (arg1.field4745 == 65535) {
                    var8 ^= 0xFFFFFFFFL;
                    var7[3] = 0;
                } else {
                    var7[3] = class179.method1194(arg1.field4745, 1073741824);
                    var8 ^= (long) var7[3];
                }
            }
        }
        class195 var11 = (class195) class249.field4294.method1811(var8, -118);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var31 = var7[var13];
                if ((var31 & 0x40000000) == 0) {
                    if ((var31 & Integer.MIN_VALUE) != 0 && !class193.method1303(var31 & 0x3FFFFFFF, 3).method1680(2048)) {
                        var12 = true;
                    }
                } else if (!class222.method1468(1, var31 & 0x3FFFFFFF).method1124(42, this.field520)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field519 != -1L) {
                    var11 = (class195) class249.field4294.method1811(this.field519, -93);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class285[] var14 = new class285[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var28 = var7[var16];
                    if ((var28 & 0x40000000) != 0) {
                        class285 var30 = class222.method1468(1, var28 & 0x3FFFFFFF).method1119(0, this.field520);
                        if (var30 != null) {
                            var14[var15++] = var30;
                        }
                    } else if ((var28 & Integer.MIN_VALUE) != 0) {
                        class285 var29 = class193.method1303(var28 & 0x3FFFFFFF, 3).method1681((byte) 93);
                        if (var29 != null) {
                            var14[var15++] = var29;
                        }
                    }
                }
                int var17 = var7[0];
                if ((var17 & 0x40000000) != 0) {
                    class166 var18 = class222.method1468(1, var17 & 0x3FFFFFFF);
                    if (var18.field2946 != null) {
                        for (int var19 = 0; var19 < var18.field2946.length; var19++) {
                            if (var18.field2946[var19] != null && var14[var19 + 1] != null) {
                                int var20 = var18.field2946[var19][2];
                                int var21 = var18.field2946[var19][0];
                                int var22 = var18.field2946[var19][3];
                                int var23 = var18.field2946[var19][1];
                                int var24 = var18.field2946[var19][4];
                                int var25 = var18.field2946[var19][5];
                                var14[var19 + 1].method1869(var21, var23, var20);
                                var14[var19 + 1].method1864(var22, var24, var25);
                            }
                        }
                    }
                }
                class285 var26 = new class285(var14, var15);
                for (int var27 = 0; var27 < 5; var27++) {
                    if (this.field536[var27] < class226.field3918[var27].length) {
                        var26.method1870(class211.field3657[var27], class226.field3918[var27][this.field536[var27]]);
                    }
                    if (this.field536[var27] < class133.field2333[var27].length) {
                        var26.method1870(class13.field117[var27], class133.field2333[var27][this.field536[var27]]);
                    }
                }
                var11 = var26.method1884(64, 850, -30, -50, -30);
                if (arg3) {
                    class249.field4294.method1817(var8, 16, var11);
                    this.field519 = var8;
                }
            }
        }
        if (arg1 == null && arg5 == null) {
            return var11;
        }
        class195 var32;
        if (arg1 != null && arg5 != null) {
            var32 = arg1.method1789(-10976, arg5, arg2, arg4, var11);
        } else if (arg1 == null) {
            var32 = arg5.method1780(arg2, var11, true);
        } else {
            var32 = arg1.method1780(arg4, var11, true);
        }
        return var32;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
    public final int method240(byte arg0) {
        int var2 = 87 / ((arg0 - 30) / 34);
        field521++;
        return this.field523 == -1 ? (this.field526[11] << 5) + (this.field536[4] << 20) + (this.field526[8] << 10) + (this.field536[0] << 25) + (this.field526[0] << 15) + this.field526[1] : class50.method348(this.field523, -30026).field4485 + 305419896;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljb;IIBI)Lcl;")
    public final class195 method241(class270 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field518++;
        if (arg3 < 76) {
            field532 = null;
        }
        long var6 = (long) arg4 | (long) (arg2 << 16) | (long) arg4 << 32;
        class195 var8 = (class195) class247.field4250.method1811(var6, -62);
        if (var8 == null) {
            class285[] var9 = new class285[2];
            int var10 = 0;
            if (!class193.method1303(arg4, 3).method1675((byte) 123) || !class193.method1303(arg2, 3).method1675((byte) 85)) {
                return null;
            }
            class285 var11 = class193.method1303(arg4, 3).method1686(0);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class285 var12 = class193.method1303(arg2, 3).method1686(0);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class285 var13 = new class285(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class226.field3918[var14].length > this.field536[var14]) {
                    var13.method1870(class211.field3657[var14], class226.field3918[var14][this.field536[var14]]);
                }
                if (this.field536[var14] < class133.field2333[var14].length) {
                    var13.method1870(class13.field117[var14], class133.field2333[var14][this.field536[var14]]);
                }
            }
            var8 = var13.method1884(64, 768, -50, -10, -50);
            class247.field4250.method1817(var6, 16, var8);
        }
        if (arg0 != null) {
            var8 = arg0.method1790(var8, 43, arg1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZBI[I[I)V")
    public final void method242(boolean arg0, byte arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class202.field3519; var7++) {
                    class259 var8 = class193.method1303(var7, 3);
                    if (var8 != null && !var8.field4522 && var8.field4519 == var6 + (arg0 ? 7 : 0)) {
                        arg3[class237.field4109[var6]] = class179.method1194(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field526 = arg3;
        this.field536 = arg4;
        this.field520 = arg0;
        field534++;
        if (arg1 != 60) {
            field528 = 0;
        }
        this.field523 = arg2;
        this.method246((byte) -70);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static final void method243(int arg0) {
        field530++;
        class194.field3405.method1812(arg0 ^ 0xFFFFFFE0);
        class202.field3516.method1812(-89);
        if (arg0 != 104) {
            field515 = null;
        }
        class120.field2118.method1812(-121);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)V")
    public final void method244(int arg0, byte arg1, int arg2) {
        int var4 = class237.field4109[arg2];
        field533++;
        if (this.field526[var4] == 0 || class193.method1303(arg0, 3) == null) {
            return;
        }
        if (arg1 < 65) {
            this.field520 = false;
        }
        this.field526[var4] = class179.method1194(Integer.MIN_VALUE, arg0);
        this.method246((byte) -70);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)Lgl;")
    public static final class212 method245(int arg0, int arg1) {
        class212 var2 = (class212) class228.field3936.method512((byte) 57, (long) arg0);
        field512++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 67) {
            method243(-45);
        }
        byte[] var3 = class99.field1663.method1242(arg0, 11, 6801);
        class212 var4 = new class212();
        if (var3 != null) {
            var4.method1419(new class261(var3), (byte) 64);
        }
        class228.field3936.method511(118, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    private final void method246(byte arg0) {
        field524++;
        long var2 = this.field516;
        this.field516 = -1L;
        long[] var4 = class242.field4188;
        if (arg0 != -70) {
            field515 = null;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field516 = this.field516 >>> 8 ^ var4[(int) ((this.field516 ^ (long) (this.field526[var5] >> 24)) & 0xFFL)];
            this.field516 = var4[(int) (((long) (this.field526[var5] >> 16) ^ this.field516) & 0xFFL)] ^ this.field516 >>> 8;
            this.field516 = var4[(int) ((this.field516 ^ (long) (this.field526[var5] >> 8)) & 0xFFL)] ^ this.field516 >>> 8;
            this.field516 = var4[(int) ((this.field516 ^ (long) this.field526[var5]) & 0xFFL)] ^ this.field516 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field516 = this.field516 >>> 8 ^ var4[(int) ((this.field516 ^ (long) this.field536[var6]) & 0xFFL)];
        }
        this.field516 = this.field516 >>> 8 ^ var4[(int) (((long) (this.field520 ? 1 : 0) ^ this.field516) & 0xFFL)];
        if (var2 != 0L && this.field516 != var2) {
            class249.field4294.method1810(-117, var2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjb;)Lcl;")
    public final class195 method247(int arg0, int arg1, class270 arg2) {
        field513++;
        if (this.field523 != -1) {
            return class50.method348(this.field523, -30026).method1659(arg1, arg2, 64);
        } else if (arg0 >= -121) {
            return null;
        } else {
            class195 var4 = (class195) class247.field4250.method1811(this.field516, -117);
            if (var4 == null) {
                boolean var5 = false;
                for (int var6 = 0; var6 < 12; var6++) {
                    int var15 = this.field526[var6];
                    if ((var15 & 0x40000000) == 0) {
                        if ((var15 & Integer.MIN_VALUE) != 0 && !class193.method1303(var15 & 0x3FFFFFFF, 3).method1675((byte) 87)) {
                            var5 = true;
                        }
                    } else if (!class222.method1468(1, var15 & 0x3FFFFFFF).method1130((byte) -93, this.field520)) {
                        var5 = true;
                    }
                }
                if (var5) {
                    return null;
                }
                class285[] var7 = new class285[12];
                int var8 = 0;
                for (int var9 = 0; var9 < 12; var9++) {
                    int var12 = this.field526[var9];
                    if ((var12 & 0x40000000) != 0) {
                        class285 var13 = class222.method1468(1, var12 & 0x3FFFFFFF).method1122(this.field520, (byte) 102);
                        if (var13 != null) {
                            var7[var8++] = var13;
                        }
                    } else if ((Integer.MIN_VALUE & var12) != 0) {
                        class285 var14 = class193.method1303(var12 & 0x3FFFFFFF, 3).method1686(0);
                        if (var14 != null) {
                            var7[var8++] = var14;
                        }
                    }
                }
                class285 var10 = new class285(var7, var8);
                for (int var11 = 0; var11 < 5; var11++) {
                    if (this.field536[var11] < class226.field3918[var11].length) {
                        var10.method1870(class211.field3657[var11], class226.field3918[var11][this.field536[var11]]);
                    }
                    if (class133.field2333[var11].length > this.field536[var11]) {
                        var10.method1870(class13.field117[var11], class133.field2333[var11][this.field536[var11]]);
                    }
                }
                var4 = var10.method1884(64, 768, -50, -10, -50);
                class247.field4250.method1817(this.field516, 16, var4);
            }
            if (arg2 != null) {
                var4 = arg2.method1790(var4, -105, arg1);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method248(int arg0) {
        field532 = null;
        if (arg0 != 0) {
            field511 = null;
        }
        field522 = null;
        field515 = null;
        field511 = null;
        field531 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)I")
    public static int method249(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
