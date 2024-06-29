import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class126 {

    @OriginalMember(owner = "client!db", name = "t", descriptor = "D")
    public static double field1895 = -1.0D;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lma;")
    public static class5 field1893 = class12.method119("hint_headicons", (byte) 114);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "J")
    private long field1877;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "J")
    private long field1887;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
    public boolean field1891;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[I")
    private int[] field1892;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    private int[] field1894;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBLu;I)Lkl;", line = 11)
    public final class34 method833(int arg0, int arg1, byte arg2, class33 arg3, int arg4) {
        field1884++;
        if (arg2 != 41) {
            field1888 = 122;
        }
        long var6 = (long) arg0 | (long) arg0 << 32 | (long) (arg4 << 16);
        class34 var8 = (class34) class24.field412.method521(var6, (byte) 80);
        if (var8 == null) {
            class183[] var9 = new class183[2];
            int var10 = 0;
            if (!class161.method1064(arg0, 66).method805(0) || !class161.method1064(arg4, -90).method805(0)) {
                return null;
            }
            class183 var11 = class161.method1064(arg0, 107).method806(0);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class183 var12 = class161.method1064(arg4, -90).method806(0);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class183 var13 = new class183(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1892[var14] < class260.field4435[var14].length) {
                    var13.method1203(class261.field4461[var14], class260.field4435[var14][this.field1892[var14]]);
                }
                if (class270.field4633[var14].length > this.field1892[var14]) {
                    var13.method1203(class12.field239[var14], class270.field4633[var14][this.field1892[var14]]);
                }
            }
            var8 = var13.method1198(64, 768, -50, -10, -50);
            class24.field412.method519((byte) -95, var8, var6);
        }
        if (arg3 != null) {
            var8 = arg3.method227(var8, (byte) 97, arg1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([IZI[II)V", line = 77)
    public final void method834(int[] arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class170.field2622; var7++) {
                    class122 var8 = class161.method1064(var7, -91);
                    if (var8 != null && !var8.field1858 && var8.field1840 == ((arg1 ? 7 : 0) + var6)) {
                        arg0[class207.field3289[var6]] = class264.method1820(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field1891 = arg1;
        this.field1892 = arg3;
        this.field1883 = arg2;
        this.field1894 = arg0;
        field1890++;
        this.method844(-4045);
        int var9 = -32 / ((-arg4 - 45) / 40);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 123)
    public static final void method835(int arg0) {
        field1882++;
        for (int var1 = 0; var1 < class287.field4838; var1++) {
            int var2 = class156.field2320[var1];
            class177 var3 = class119.field1804[var2];
            int var4 = class200.field3184.method1509(true);
            if ((var4 & 0x1) != 0) {
                int var5 = class200.field3184.method1528(-85);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class200.field3184.method1547((byte) -84);
                class206.method1360(var5, arg0 ^ 0x58A, var6, var3);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field2699.method1949(true)) {
                    class138.method897((byte) 44, var3);
                }
                var3.field2699 = class186.method1230(29, class200.field3184.method1498((byte) -27));
                var3.field210 = var3.field2699.field4856;
                var3.field230 = var3.field2699.field4875;
                var3.field206 = var3.field2699.field4857;
                var3.field233 = var3.field2699.field4902;
                var3.field229 = var3.field2699.field4888;
                var3.field201 = var3.field2699.field4853;
                var3.field226 = var3.field2699.field4905;
                var3.field202 = var3.field2699.field4903;
                var3.field218 = var3.field2699.field4852;
                if (var3.field2699.method1949(true)) {
                    class230.method1642(var3.field186[0], var3, class276.field4701, (class91) null, arg0 + 1419, 0, var3.field175[0], (class185) null);
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field204 = class200.field3184.method1501((byte) -56);
                var3.field193 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class200.field3184.method1547((byte) -126);
                int var8 = class200.field3184.method1499(false);
                var3.method126((byte) 19, var8, var7, class50.field784);
                var3.field212 = class50.field784 + 300;
                var3.field177 = class200.field3184.method1547((byte) 96);
            }
            if ((var4 & 0x20) != 0) {
                var3.field223 = class200.field3184.method1527(true);
                if (var3.field223 == 65535) {
                    var3.field223 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field235 = class200.field3184.method1527(true);
                var3.field207 = class200.field3184.method1524((byte) 87);
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class200.field3184.method1499(false);
                int var10 = class200.field3184.method1547((byte) 122);
                var3.method126((byte) 105, var10, var9, class50.field784);
            }
            if ((var4 & 0x80) != 0) {
                var3.field222 = class200.field3184.method1528(-99);
                int var11 = class200.field3184.method1503((byte) -118);
                if (var3.field222 == 65535) {
                    var3.field222 = -1;
                }
                var3.field213 = var11 >> 16;
                var3.field195 = 0;
                var3.field199 = (var11 & 0xFFFF) + class50.field784;
                var3.field236 = 0;
                if (class50.field784 < var3.field199) {
                    var3.field236 = -1;
                }
                if (var3.field222 != -1 && class50.field784 == var3.field199) {
                    int var12 = class57.method430(var3.field222, 22867872).field753;
                    if (var12 != -1) {
                        class33 var13 = class171.method1136(var12, -6722);
                        if (var13 != null && var13.field529 != null) {
                            class272.method1859(var3.field178, var3.field211, 64, 0, var13, false);
                        }
                    }
                }
            }
        }
        if (arg0 != -1419) {
            method847(true, -33, -89, (byte) 3, (class50[]) null, -20, 23, 9, (byte[]) null, -100, 1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V", line = 270)
    public final void method836(int arg0, int arg1, int arg2) {
        field1896++;
        int var4 = class207.field3289[arg1];
        if (this.field1894[var4] != 0 && class161.method1064(arg2, -96) != null) {
            this.field1894[var4] = class264.method1820(arg0, arg2);
            this.method844(-4045);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 287)
    public static final void method837(int arg0, int arg1) {
        class209.field3312.method517(false, arg0);
        field1881++;
        int var2 = -13 / ((arg1 + 34) / 54);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I", line = 297)
    public final int method838(int arg0) {
        field1878++;
        int var2 = 12 % ((arg0 + 12) / 61);
        return this.field1883 == -1 ? (this.field1894[11] << 5) + this.field1894[1] + (this.field1894[8] << 10) + (this.field1894[0] << 15) + ((this.field1892[0] << 25) - -(this.field1892[4] << 20)) : class186.method1230(29, this.field1883).field4887 + 305419896;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIZI)V", line = 319)
    public static final void method839(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1879++;
        if (arg4) {
            return;
        }
        if (arg1 == arg5) {
            class217.method1467(arg2, (byte) -103, arg0, arg3, arg5);
        } else if (arg2 - arg5 >= class57.field899 && arg2 + arg5 <= class301.field5073 && (arg0 - arg1) >= class294.field4956 && arg0 + arg1 <= class101.field1505) {
            class92.method604(arg0, arg3, arg2, arg5, 221786337, arg1);
        } else {
            class156.method1004(-928251167, arg0, arg5, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V", line = 344)
    public final void method840(int arg0, boolean arg1) {
        this.field1891 = arg1;
        this.method844(arg0 - 4052);
        field1897++;
        if (arg0 != 7) {
            this.field1894 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V", line = 356)
    public static final void method841(int arg0, byte arg1) {
        field1889++;
        class18.field309.method517(false, arg0);
        class59.field926.method517(false, arg0);
        int var2 = -112 % ((arg1 - 73) / 41);
        class37.field584.method517(false, arg0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lu;ZI)Lkl;", line = 371)
    public final class34 method842(class33 arg0, boolean arg1, int arg2) {
        field1876++;
        if (this.field1883 != -1) {
            return class186.method1230(29, this.field1883).method1941(arg0, !arg1, arg2);
        }
        class34 var4 = (class34) class24.field412.method521(this.field1887, (byte) 80);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field1894[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class161.method1064(var7 & 0x3FFFFFFF, -117).method805(0)) {
                        var5 = true;
                    }
                } else if (!class235.method1664(92, var7 & 0x3FFFFFFF).method1288(this.field1891, -1)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class183[] var8 = new class183[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field1894[var10];
                if ((var11 & 0x40000000) != 0) {
                    class183 var12 = class235.method1664(110, var11 & 0x3FFFFFFF).method1284(this.field1891, 19107);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class183 var13 = class161.method1064(var11 & 0x3FFFFFFF, 5).method806(0);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class183 var14 = new class183(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class260.field4435[var15].length > this.field1892[var15]) {
                    var14.method1203(class261.field4461[var15], class260.field4435[var15][this.field1892[var15]]);
                }
                if (this.field1892[var15] < class270.field4633[var15].length) {
                    var14.method1203(class12.field239[var15], class270.field4633[var15][this.field1892[var15]]);
                }
            }
            var4 = var14.method1198(64, 768, -50, -10, -50);
            class24.field412.method519((byte) -95, var4, this.field1887);
        }
        if (!arg1) {
            this.method838(-10);
        }
        if (arg0 != null) {
            var4 = arg0.method227(var4, (byte) 94, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V", line = 488)
    public final void method843(int arg0, int arg1, int arg2) {
        field1880++;
        if (arg0 < -115) {
            this.field1892[arg2] = arg1;
            this.method844(-4045);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 504)
    private final void method844(int arg0) {
        long var2 = this.field1887;
        field1886++;
        this.field1887 = -1L;
        long[] var4 = class250.field4131;
        if (arg0 != -4045) {
            method839(-25, 37, 6, 20, true, -118);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1887 = this.field1887 >>> 8 ^ var4[(int) (((long) (this.field1894[var5] >> 24) ^ this.field1887) & 0xFFL)];
            this.field1887 = var4[(int) (((long) (this.field1894[var5] >> 16) ^ this.field1887) & 0xFFL)] ^ this.field1887 >>> 8;
            this.field1887 = var4[(int) ((this.field1887 ^ (long) (this.field1894[var5] >> 8)) & 0xFFL)] ^ this.field1887 >>> 8;
            this.field1887 = var4[(int) (((long) this.field1894[var5] ^ this.field1887) & 0xFFL)] ^ this.field1887 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1887 = var4[(int) (((long) this.field1892[var6] ^ this.field1887) & 0xFFL)] ^ this.field1887 >>> 8;
        }
        this.field1887 = this.field1887 >>> 8 ^ var4[(int) ((this.field1887 ^ (long) (this.field1891 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field1887 != var2) {
            class101.field1515.method520(32, var2);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILu;Lu;II)Lkl;", line = 546)
    public final class34 method845(int arg0, class33 arg1, class33 arg2, int arg3, int arg4) {
        field1898++;
        if (this.field1883 != arg0) {
            return class186.method1230(29, this.field1883).method1946(arg2, arg4, arg3, arg1, (byte) 3);
        }
        long var6 = this.field1887;
        int[] var8 = this.field1894;
        if (arg2 != null && (arg2.field501 >= 0 || arg2.field523 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1894[var9];
            }
            if (arg2.field501 >= 0) {
                if (arg2.field501 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class264.method1820(1073741824, arg2.field501);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg2.field523 >= 0) {
                if (arg2.field523 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class264.method1820(arg2.field523, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class34 var10 = (class34) class101.field1515.method521(var6, (byte) 80);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class161.method1064(var13 & 0x3FFFFFFF, arg0 ^ 0x5E).method804(0)) {
                        var11 = true;
                    }
                } else if (!class235.method1664(arg0 + 98, var13 & 0x3FFFFFFF).method1292((byte) -43, this.field1891)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1877 != -1L) {
                    var10 = (class34) class101.field1515.method521(this.field1877, (byte) 80);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class183[] var14 = new class183[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class183 var18 = class235.method1664(122, var17 & 0x3FFFFFFF).method1295(122, this.field1891);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    } else if ((Integer.MIN_VALUE & var17) != 0) {
                        class183 var19 = class161.method1064(var17 & 0x3FFFFFFF, 23).method811(13016);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class196 var21 = class235.method1664(97, var20 & 0x3FFFFFFF);
                    if (var21.field3097 != null) {
                        for (int var22 = 0; var22 < var21.field3097.length; var22++) {
                            if (var21.field3097[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field3097[var22][0];
                                int var24 = var21.field3097[var22][1];
                                int var25 = var21.field3097[var22][2];
                                int var26 = var21.field3097[var22][3];
                                int var27 = var21.field3097[var22][4];
                                int var28 = var21.field3097[var22][5];
                                var14[var22 + 1].method1190(var23, var24, var25);
                                var14[var22 + 1].method1205(var26, var27, var28);
                            }
                        }
                    }
                }
                class183 var29 = new class183(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field1892[var30] < class260.field4435[var30].length) {
                        var29.method1203(class261.field4461[var30], class260.field4435[var30][this.field1892[var30]]);
                    }
                    if (this.field1892[var30] < class270.field4633[var30].length) {
                        var29.method1203(class12.field239[var30], class270.field4633[var30][this.field1892[var30]]);
                    }
                }
                var10 = var29.method1198(64, 850, -30, -50, -30);
                ((class160) var10).method1040(false, false, true, true, false, false, true);
                class101.field1515.method519((byte) -95, var10, var6);
                this.field1877 = var6;
            }
        }
        if (arg2 == null && arg1 == null) {
            return var10;
        }
        class34 var31;
        if (arg2 != null && arg1 != null) {
            var31 = arg2.method219(arg4, (byte) 58, var10, arg1, arg3);
        } else if (arg2 == null) {
            var31 = arg1.method226(var10, true, arg4);
        } else {
            var31 = arg2.method226(var10, true, arg3);
        }
        return var31;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 771)
    public static void method846(boolean arg0) {
        if (!arg0) {
            field1893 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIB[Lmc;III[BII)V", line = 781)
    public static final void method847(boolean arg0, int arg1, int arg2, byte arg3, class50[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field1885++;
        if (!arg0) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg10 + var11 > 0 && arg10 + var11 < 103 && (arg9 + var12) > 0 && (arg9 + var12) < 103) {
                        arg4[arg2].field793[arg10 + var11][arg9 + var12] = class204.method1354(arg4[arg2].field793[arg10 + var11][arg9 + var12], -16777217);
                    }
                }
            }
        }
        class221 var13 = new class221(arg8);
        byte var14;
        if (arg0) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg1 == var15 && var16 >= arg7 && (arg7 + 8) > var16 && arg6 <= var17 && var17 < arg6 + 8) {
                        class204.method1353(0, arg9 + class267.method1839(var17 & 0x7, var16 & 0x7, arg5, 15834), 0, arg0, arg10 + class150.method947(var17 & 0x7, arg5, var16 & 0x7, (byte) 124), var13, arg5, true, arg2);
                    } else {
                        class204.method1353(0, -1, 0, arg0, -1, var13, 0, true, 0);
                    }
                }
            }
        }
        if (arg3 != 101 || arg0) {
            return;
        }
        class135 var18 = null;
        while (true) {
            while (var13.field3610 < var13.field3617.length) {
                int var19 = var13.method1509(true);
                if (var19 == 0) {
                    var18 = new class135(var13);
                } else if (var19 == 1) {
                    int var20 = var13.method1509(true);
                    if (var20 > 0) {
                        for (int var21 = 0; var21 < var20; var21++) {
                            class239 var22 = new class239(var13);
                            int var23 = var22.field3944 >> 7;
                            int var24 = var22.field3958 >> 7;
                            if (var22.field3961 == arg1 && arg7 <= var23 && (arg7 + 8) > var23 && arg6 <= var24 && (arg6 + 8) > var24) {
                                int var25 = (arg10 << 7) + class172.method1139(var22.field3958 & 0x3FF, var22.field3944 & 0x3FF, -10130, arg5);
                                int var26 = (arg9 << 7) + class24.method187(var22.field3958 & 0x3FF, var22.field3944 & 0x3FF, arg3 - 32597, arg5);
                                var22.field3958 = var26;
                                var22.field3944 = var25;
                                int var27 = var22.field3944 >> 7;
                                int var28 = var22.field3958 >> 7;
                                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                                    var22.field3966 = class208.field3304[var22.field3961][var27][var28] - var22.field3966;
                                    class53.method408(var22);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var18 == null) {
                var18 = new class135();
            }
            class204.field3262[arg10 >> 3][arg9 >> 3] = var18;
            break;
        }
    }
}
