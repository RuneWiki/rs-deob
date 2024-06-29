import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 {

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lmh;")
    public static class128 field123 = class22.method156(126, ")4p=");

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lmh;")
    public static class128 field121 = class22.method156(123, "Konfig geladen)3");

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lmh;")
    public static class128 field118 = class22.method156(127, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lmh;")
    public static class128 field132 = class22.method156(124, "Lade)3)3)3");

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[Lmh;")
    public static class128[] field114 = new class128[200];

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Ldh;")
    public static class159 field117 = new class159();

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "Lmh;")
    public static class128 field137 = class22.method156(122, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "J")
    private long field111;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "J")
    private long field115;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Z")
    public boolean field119;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
    private int[] field112;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 10)
    public static void method30(boolean arg0) {
        field137 = null;
        field118 = null;
        field123 = null;
        field114 = null;
        if (!arg0) {
            field121 = null;
            field117 = null;
            field132 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Laj;II)Lja;", line = 27)
    public final class60 method31(class1 arg0, int arg1, int arg2) {
        field133++;
        if (this.field124 != -1) {
            return class203.method1411(false, this.field124).method1431(arg2, arg0, -80);
        }
        class60 var4 = (class60) class99.field1713.method1836(this.field111, 0);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field112[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class118.method711(var7 & 0x3FFFFFFF, 2).method957(126)) {
                        var5 = true;
                    }
                } else if (!class180.method1226(false, var7 & 0x3FFFFFFF).method1390(-105, this.field119)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class168[] var8 = new class168[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field112[var10];
                if ((var11 & 0x40000000) != 0) {
                    class168 var12 = class180.method1226(false, var11 & 0x3FFFFFFF).method1391((byte) 123, this.field119);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class168 var13 = class118.method711(var11 & 0x3FFFFFFF, 2).method965(0);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class168 var14 = new class168(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class151.field2603[var15].length > this.field125[var15]) {
                    var14.method1107(class279.field4822[var15], class151.field2603[var15][this.field125[var15]]);
                }
                if (this.field125[var15] < class183.field3207[var15].length) {
                    var14.method1107(class254.field4383[var15], class183.field3207[var15][this.field125[var15]]);
                }
            }
            var4 = var14.method1105(64, 768, -50, -10, -50);
            class99.field1713.method1835((byte) -81, this.field111, var4);
        }
        int var16 = 69 / ((61 - arg1) / 36);
        if (arg0 != null) {
            var4 = arg0.method3((byte) 117, var4, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILaj;)Lja;", line = 142)
    public final class60 method32(int arg0, int arg1, int arg2, int arg3, class1 arg4) {
        field113++;
        if (arg3 >= -20) {
            this.field125 = (int[]) null;
        }
        long var6 = (long) (arg1 << 16) | (long) arg2 << 32 | (long) arg2;
        class60 var8 = (class60) class99.field1713.method1836(var6, 0);
        if (var8 == null) {
            class168[] var9 = new class168[2];
            int var10 = 0;
            if (!class118.method711(arg2, 2).method957(55) || !class118.method711(arg1, 2).method957(-92)) {
                return null;
            }
            class168 var11 = class118.method711(arg2, 2).method965(0);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class168 var12 = class118.method711(arg1, 2).method965(0);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class168 var13 = new class168(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class151.field2603[var14].length > this.field125[var14]) {
                    var13.method1107(class279.field4822[var14], class151.field2603[var14][this.field125[var14]]);
                }
                if (this.field125[var14] < class183.field3207[var14].length) {
                    var13.method1107(class254.field4383[var14], class183.field3207[var14][this.field125[var14]]);
                }
            }
            var8 = var13.method1105(64, 768, -50, -10, -50);
            class99.field1713.method1835((byte) -81, var6, var8);
        }
        if (arg4 != null) {
            var8 = arg4.method3((byte) 120, var8, arg0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)I", line = 218)
    public final int method33(byte arg0) {
        if (arg0 >= -118) {
            this.method40(10);
        }
        field129++;
        return this.field124 == -1 ? (this.field112[8] << 10) + this.field112[1] + (this.field112[11] << 5) + (this.field125[0] << 25) + (this.field125[4] << 20) + (this.field112[0] << 15) : 305419896 - -class203.method1411(false, this.field124).field3679;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIB)V", line = 235)
    public final void method34(int arg0, int arg1, byte arg2) {
        field120++;
        if (arg2 != 19) {
            return;
        }
        int var4 = class262.field4537[arg0];
        if (this.field112[var4] != 0 && class118.method711(arg1, 2) != null) {
            this.field112[var4] = class279.method1951(arg1, Integer.MIN_VALUE);
            this.method40(-9033);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBI)V", line = 254)
    public final void method35(int arg0, byte arg1, int arg2) {
        field122++;
        if (arg1 != 52) {
            this.method35(14, (byte) -111, 110);
        }
        this.field125[arg0] = arg2;
        this.method40(arg1 - 9085);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)V", line = 266)
    public final void method36(boolean arg0, int arg1) {
        field134++;
        this.field119 = arg0;
        this.method40(-9033);
        if (arg1 != 12) {
            field130 = -1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 302)
    public static final void method37(boolean arg0) {
        field127++;
        if (!arg0) {
            return;
        }
        class54.field1051.method567(8);
        int var1 = class54.field1051.method564((byte) -115, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class54.field1051.method564((byte) -102, 2);
        if (var2 == 0) {
            class158.field2715[class314.field5335++] = 2047;
        } else if (var2 == 1) {
            int var10 = class54.field1051.method564((byte) -120, 3);
            class163.field2796.method121(false, var10, true);
            int var11 = class54.field1051.method564((byte) -98, 1);
            if (var11 == 1) {
                class158.field2715[class314.field5335++] = 2047;
            }
        } else if (var2 == 2) {
            int var7 = class54.field1051.method564((byte) -99, 3);
            class163.field2796.method121(true, var7, arg0);
            int var8 = class54.field1051.method564((byte) -105, 3);
            class163.field2796.method121(true, var8, true);
            int var9 = class54.field1051.method564((byte) -113, 1);
            if (var9 == 1) {
                class158.field2715[class314.field5335++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class54.field1051.method564((byte) -90, 1);
            int var4 = class54.field1051.method564((byte) -116, 7);
            int var5 = class54.field1051.method564((byte) -122, 7);
            int var6 = class54.field1051.method564((byte) -122, 1);
            if (var6 == 1) {
                class158.field2715[class314.field5335++] = 2047;
            }
            class133.field2315 = class54.field1051.method564((byte) -126, 2);
            class163.field2796.method750(var5, var3 == 1, -65536, var4);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILaj;IILaj;)Lja;", line = 388)
    public final class60 method38(int arg0, class1 arg1, int arg2, int arg3, class1 arg4) {
        if (arg3 > -22) {
            field137 = (class128) null;
        }
        field128++;
        if (this.field124 != -1) {
            return class203.method1411(false, this.field124).method1426(arg1, arg2, (byte) -127, arg0, arg4);
        }
        int[] var6 = this.field112;
        long var7 = this.field111;
        if (arg1 != null && (arg1.field14 >= 0 || arg1.field17 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field112[var9];
            }
            if (arg1.field14 >= 0) {
                if (arg1.field14 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class279.method1951(1073741824, arg1.field14);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg1.field17 >= 0) {
                if (arg1.field17 == 65535) {
                    var6[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var6[3] = class279.method1951(1073741824, arg1.field17);
                    var7 ^= (long) var6[3];
                }
            }
        }
        class60 var10 = (class60) class37.field748.method1836(var7, 0);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var6[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class118.method711(var13 & 0x3FFFFFFF, 2).method963((byte) -128)) {
                        var11 = true;
                    }
                } else if (!class180.method1226(false, var13 & 0x3FFFFFFF).method1395((byte) -121, this.field119)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field115 != -1L) {
                    var10 = (class60) class37.field748.method1836(this.field115, 0);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class168[] var14 = new class168[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var6[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class168 var18 = class180.method1226(false, var17 & 0x3FFFFFFF).method1386(this.field119, -81);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    } else if ((Integer.MIN_VALUE & var17) != 0) {
                        class168 var19 = class118.method711(var17 & 0x3FFFFFFF, 2).method966(0);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                }
                int var20 = var6[0];
                if ((var20 & 0x40000000) != 0) {
                    class200 var21 = class180.method1226(false, var20 & 0x3FFFFFFF);
                    if (var21.field3509 != null) {
                        for (int var22 = 0; var22 < var21.field3509.length; var22++) {
                            if (var21.field3509[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field3509[var22][1];
                                int var24 = var21.field3509[var22][4];
                                int var25 = var21.field3509[var22][2];
                                int var26 = var21.field3509[var22][0];
                                int var27 = var21.field3509[var22][5];
                                int var28 = var21.field3509[var22][3];
                                var14[var22 + 1].method1122(var26, var23, var25);
                                var14[var22 + 1].method1128(var28, var24, var27);
                            }
                        }
                    }
                }
                class168 var29 = new class168(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (class151.field2603[var30].length > this.field125[var30]) {
                        var29.method1107(class279.field4822[var30], class151.field2603[var30][this.field125[var30]]);
                    }
                    if (this.field125[var30] < class183.field3207[var30].length) {
                        var29.method1107(class254.field4383[var30], class183.field3207[var30][this.field125[var30]]);
                    }
                }
                var10 = var29.method1105(64, 850, -30, -50, -30);
                if (class247.field4247) {
                    ((class126) var10).method796(false, false, true, true, false, false, true);
                }
                class37.field748.method1835((byte) -81, var7, var10);
                this.field115 = var7;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class60 var31;
        if (arg1 != null && arg4 != null) {
            var31 = arg1.method8(arg0, arg2, true, var10, arg4);
        } else if (arg1 == null) {
            var31 = arg4.method9(var10, 112, arg2);
        } else {
            var31 = arg1.method9(var10, 124, arg0);
        }
        return var31;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([III[IZ)V", line = 620)
    public final void method39(int[] arg0, int arg1, int arg2, int[] arg3, boolean arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class314.field5305; var7++) {
                    class144 var8 = class118.method711(var7, 2);
                    if (var8 != null && !var8.field2473 && (arg4 ? 7 : 0) + var6 == var8.field2457) {
                        arg3[class262.field4537[var6]] = class279.method1951(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field124 = arg1;
        this.field112 = arg3;
        if (arg2 == 26943) {
            this.field125 = arg0;
            this.field119 = arg4;
            this.method40(-9033);
            field131++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 668)
    private final void method40(int arg0) {
        field135++;
        long var2 = this.field111;
        this.field111 = -1L;
        long[] var4 = class26.field583;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field111 = this.field111 >>> 8 ^ var4[(int) ((this.field111 ^ (long) (this.field112[var5] >> 24)) & 0xFFL)];
            this.field111 = this.field111 >>> 8 ^ var4[(int) (((long) (this.field112[var5] >> 16) ^ this.field111) & 0xFFL)];
            this.field111 = var4[(int) (((long) (this.field112[var5] >> 8) ^ this.field111) & 0xFFL)] ^ this.field111 >>> 8;
            this.field111 = var4[(int) ((this.field111 ^ (long) this.field112[var5]) & 0xFFL)] ^ this.field111 >>> 8;
        }
        if (arg0 != -9033) {
            return;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field111 = this.field111 >>> 8 ^ var4[(int) ((this.field111 ^ (long) this.field125[var6]) & 0xFFL)];
        }
        this.field111 = this.field111 >>> 8 ^ var4[(int) (((long) (this.field119 ? 1 : 0) ^ this.field111) & 0xFFL)];
        if (var2 != 0L && this.field111 != var2) {
            class37.field748.method1831(1, var2);
        }
    }
}
