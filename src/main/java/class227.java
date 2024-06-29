import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class227 {

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lwm;")
    private static class152 field3690 = class157.method1048("Select", 105);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lwm;")
    public static class152 field3682 = field3690;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lwm;")
    private static class152 field3681 = class157.method1048("Unable to find ", 109);

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "Lwm;")
    public static class152 field3703 = class157.method1048("_labels", 124);

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[I")
    public static int[] field3695 = new int[100];

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lwm;")
    public static class152 field3680 = field3681;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lne;")
    public static class235 field3678 = new class235(64);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    private int field3689;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "J")
    private long field3687;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "J")
    private long field3692;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lah;")
    public static class205 field3697;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Z")
    public boolean field3679;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "[I")
    private int[] field3699;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "[I")
    private int[] field3706;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[[I")
    private int[][] field3686;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[[[I")
    public static int[][][] field3700;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZ)V", line = 5)
    public final void method1554(int arg0, int arg1, boolean arg2) {
        field3702++;
        int var4 = class193.field3055[arg1];
        if (this.field3699[var4] == 0 || class283.method1920(arg0, (byte) -7) == null) {
            return;
        }
        if (arg2) {
            method1566(-20, -53);
        }
        this.field3699[var4] = class72.method493(arg0, Integer.MIN_VALUE);
        this.method1556((byte) 97);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[IZ[II)V", line = 27)
    public final void method1555(int arg0, int arg1, int[] arg2, boolean arg3, int[] arg4, int arg5) {
        if (this.field3689 != arg1) {
            this.field3686 = (int[][]) null;
            this.field3689 = arg1;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class142.field2191; var8++) {
                    class313 var9 = class283.method1920(var8, (byte) -7);
                    if (var9 != null && !var9.field5426 && (arg3 ? class281.field4798[var7] : class325.field5668[var7]) == var9.field5433) {
                        arg4[class193.field3055[var7]] = class72.method493(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        field3684++;
        this.field3706 = arg2;
        this.field3699 = arg4;
        this.field3688 = arg5;
        this.field3679 = arg3;
        this.method1556((byte) 97);
        if (arg0 > -123) {
            method1566(-33, -27);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 86)
    private final void method1556(byte arg0) {
        field3694++;
        long var2 = this.field3687;
        long[] var4 = class206.field3371;
        this.field3687 = -1L;
        this.field3687 = this.field3687 >>> 8 ^ var4[(int) (((long) (this.field3689 >> 8) ^ this.field3687) & 0xFFL)];
        this.field3687 = var4[(int) (((long) this.field3689 ^ this.field3687) & 0xFFL)] ^ this.field3687 >>> 8;
        int var5 = 0;
        int var6 = -71 / ((50 - arg0) / 46);
        while (var5 < 12) {
            this.field3687 = var4[(int) ((this.field3687 ^ (long) (this.field3699[var5] >> 24)) & 0xFFL)] ^ this.field3687 >>> 8;
            this.field3687 = var4[(int) (((long) (this.field3699[var5] >> 16) ^ this.field3687) & 0xFFL)] ^ this.field3687 >>> 8;
            this.field3687 = this.field3687 >>> 8 ^ var4[(int) (((long) (this.field3699[var5] >> 8) ^ this.field3687) & 0xFFL)];
            this.field3687 = var4[(int) ((this.field3687 ^ (long) this.field3699[var5]) & 0xFFL)] ^ this.field3687 >>> 8;
            var5++;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3687 = var4[(int) (((long) this.field3706[var7] ^ this.field3687) & 0xFFL)] ^ this.field3687 >>> 8;
        }
        this.field3687 = this.field3687 >>> 8 ^ var4[(int) (((long) (this.field3679 ? 1 : 0) ^ this.field3687) & 0xFFL)];
        if (var2 != 0L && this.field3687 != var2) {
            class241.field3947.method1610(105, var2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)Z", line = 136)
    public static final boolean method1557(int arg0, int arg1, int arg2, int arg3) {
        if (!class224.method1544(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class65.field984[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class27.field460) {
                    if (!class150.method943(var4, var6, var5)) {
                        return false;
                    }
                    if (!class150.method943(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class150.method943(var4, var7, var5)) {
                        return false;
                    }
                    if (!class150.method943(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class150.method943(var4, var8, var5)) {
                    return false;
                }
                if (!class150.method943(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class239.field3916) {
                    if (!class150.method943(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class150.method943(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class150.method943(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class150.method943(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class150.method943(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class150.method943(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class27.field460) {
                    if (!class150.method943(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class150.method943(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class150.method943(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class150.method943(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class150.method943(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class150.method943(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class239.field3916) {
                    if (!class150.method943(var4, var6, var5)) {
                        return false;
                    }
                    if (!class150.method943(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class150.method943(var4, var7, var5)) {
                        return false;
                    }
                    if (!class150.method943(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class150.method943(var4, var8, var5)) {
                    return false;
                }
                if (!class150.method943(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class150.method943(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class150.method943(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class150.method943(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class150.method943(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class150.method943(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 322)
    public static void method1558(byte arg0) {
        field3678 = null;
        field3700 = (int[][][]) null;
        field3695 = null;
        field3682 = null;
        field3703 = null;
        field3697 = null;
        field3681 = null;
        field3680 = null;
        if (arg0 != 57) {
            method1558((byte) -51);
        }
        field3690 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIILuj;II)Lw;", line = 344)
    public final class271 method1559(int arg0, int arg1, int arg2, int arg3, int arg4, class141 arg5, int arg6, int arg7) {
        if (arg0 != 3) {
            method1565(true, -32, -106);
        }
        long var9 = (long) (arg7 << 16) | (long) arg3 << 32 | (long) arg6;
        field3708++;
        class271 var11 = (class271) class228.field3733.method1620(true, var9);
        if (var11 == null) {
            int var12 = 0;
            class220[] var13 = new class220[3];
            if (!class283.method1920(arg6, (byte) -7).method2183((byte) -73) || !class283.method1920(arg7, (byte) -7).method2183((byte) 81) || !class283.method1920(arg3, (byte) -7).method2183((byte) -48)) {
                return null;
            }
            class220 var14 = class283.method1920(arg6, (byte) -7).method2191((byte) -127);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class220 var15 = class283.method1920(arg7, (byte) -7).method2191((byte) -93);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class220 var16 = class283.method1920(arg3, (byte) -7).method2191((byte) -124);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class220 var17 = new class220(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class104.field1493[var18].length > this.field3706[var18]) {
                    var17.method1511(class72.field1044[var18], class104.field1493[var18][this.field3706[var18]]);
                }
                if (class92.field1312[var18].length > this.field3706[var18]) {
                    var17.method1511(class247.field4138[var18], class92.field1312[var18][this.field3706[var18]]);
                }
            }
            var11 = var17.method1521(64, 768, -50, -10, -50);
            class228.field3733.method1614(var11, var9, (byte) 78);
        }
        if (arg5 != null) {
            var11 = arg5.method892(arg4, arg2, arg1, var11, 105);
        }
        return var11;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)I", line = 414)
    public static final int method1560(boolean arg0, int arg1) {
        if (arg0) {
            method1566(2, 59);
        }
        field3696++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(JI)V", line = 430)
    public static final void method1561(long arg0, int arg1) {
        field3693++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        if (arg1 != 1073741823) {
            method1558((byte) -82);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILuj;III)Lw;", line = 448)
    public final class271 method1562(int arg0, class141 arg1, int arg2, int arg3, int arg4) {
        field3710++;
        if (this.field3688 != -1) {
            return class98.method659(255, this.field3688).method1653(arg2, arg0, arg1, arg3, (byte) -54);
        } else if (arg4 >= -81) {
            return (class271) null;
        } else {
            class271 var6 = (class271) class228.field3733.method1620(true, this.field3687);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var9 = this.field3699[var8];
                    if ((var9 & 0x40000000) == 0) {
                        if ((var9 & Integer.MIN_VALUE) != 0 && !class283.method1920(var9 & 0x3FFFFFFF, (byte) -7).method2183((byte) 77)) {
                            var7 = true;
                        }
                    } else if (!class189.method1253((byte) 62, var9 & 0x3FFFFFFF).method2165(this.field3679, 0)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                int var10 = 0;
                class220[] var11 = new class220[12];
                for (int var12 = 0; var12 < 12; var12++) {
                    int var13 = this.field3699[var12];
                    if ((var13 & 0x40000000) != 0) {
                        class220 var14 = class189.method1253((byte) 99, var13 & 0x3FFFFFFF).method2175(118, this.field3679);
                        if (var14 != null) {
                            var11[var10++] = var14;
                        }
                    } else if ((Integer.MIN_VALUE & var13) != 0) {
                        class220 var15 = class283.method1920(var13 & 0x3FFFFFFF, (byte) -7).method2191((byte) 74);
                        if (var15 != null) {
                            var11[var10++] = var15;
                        }
                    }
                }
                class220 var16 = new class220(var11, var10);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field3706[var17] < class104.field1493[var17].length) {
                        var16.method1511(class72.field1044[var17], class104.field1493[var17][this.field3706[var17]]);
                    }
                    if (class92.field1312[var17].length > this.field3706[var17]) {
                        var16.method1511(class247.field4138[var17], class92.field1312[var17][this.field3706[var17]]);
                    }
                }
                var6 = var16.method1521(64, 768, -50, -10, -50);
                class228.field3733.method1614(var6, this.field3687, (byte) 78);
            }
            if (arg1 != null) {
                var6 = arg1.method892(arg0, arg2, arg3, var6, 113);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I", line = 565)
    public final int method1563(int arg0) {
        field3707++;
        if (arg0 != 4) {
            this.field3679 = true;
        }
        return this.field3688 == -1 ? (this.field3699[8] << 10) + (this.field3706[4] << 20) + (this.field3706[0] << 25) + (this.field3699[0] << 15) + (this.field3699[11] << 5) + this.field3699[1] : class98.method659(255, this.field3688).field3988 + 305419896;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V", line = 584)
    public final void method1564(int arg0, boolean arg1) {
        this.field3679 = arg1;
        this.method1556((byte) -85);
        if (arg0 >= 34) {
            field3685++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)V", line = 604)
    public static final void method1565(boolean arg0, int arg1, int arg2) {
        class245.field4102.method1065(134, 126);
        class167.field2620++;
        class245.field4102.method2018(arg2, 128);
        class245.field4102.method2019((byte) -71, arg1);
        field3701++;
        if (!arg0) {
            field3680 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I", line = 621)
    public static final int method1566(int arg0, int arg1) {
        if (arg1 != 127) {
            method1558((byte) -125);
        }
        field3698++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)V", line = 645)
    public final void method1567(int arg0, int arg1, byte arg2) {
        this.field3706[arg0] = arg1;
        field3704++;
        this.method1556((byte) 106);
        if (arg2 > -124) {
            this.method1563(-101);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILuj;ILuj;[Lsb;ZZII)Lw;", line = 672)
    public final class271 method1568(int arg0, int arg1, int arg2, class141 arg3, int arg4, class141 arg5, class111[] arg6, boolean arg7, boolean arg8, int arg9, int arg10) {
        field3691++;
        if (this.field3688 != -1) {
            return class98.method659(255, this.field3688).method1651(arg6, arg9, arg1, arg4, arg5, -30, arg2, arg10, arg0, arg3);
        }
        long var12 = this.field3687;
        int[] var14 = this.field3699;
        if (arg3 != null && (arg3.field2174 >= 0 || arg3.field2170 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3699[var15];
            }
            if (arg3.field2174 >= 0) {
                if (arg3.field2174 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class72.method493(arg3.field2174, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field2170 >= 0) {
                if (arg3.field2170 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class72.method493(1073741824, arg3.field2170);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class271 var16 = (class271) class241.field3947.method1620(!arg8, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class283.method1920(var19 & 0x3FFFFFFF, (byte) -7).method2189(128)) {
                        var17 = true;
                    }
                } else if (!class189.method1253((byte) 52, var19 & 0x3FFFFFFF).method2164(106, this.field3679)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3692 != -1L) {
                    var16 = (class271) class241.field3947.method1620(true, this.field3692);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class220[] var20 = new class220[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class220 var24 = class189.method1253((byte) 36, var22 & 0x3FFFFFFF).method2170(this.field3679, -23637);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class220 var23 = class283.method1920(var22 & 0x3FFFFFFF, (byte) -7).method2192((byte) 126);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class251 var25 = null;
                if (this.field3689 != -1) {
                    var25 = class210.method1414(this.field3689, (byte) -124);
                }
                if (var25 != null && var25.field4284 != null) {
                    for (int var26 = 0; var26 < var25.field4284.length; var26++) {
                        if (var25.field4284[var26] != null && var20[var26] != null) {
                            int var27 = var25.field4284[var26][0];
                            int var28 = var25.field4284[var26][1];
                            int var29 = var25.field4284[var26][3];
                            int var30 = var25.field4284[var26][2];
                            int var31 = var25.field4284[var26][4];
                            int var32 = var25.field4284[var26][5];
                            if (this.field3686 == null) {
                                this.field3686 = new int[var25.field4284.length][];
                            }
                            if (this.field3686[var26] == null) {
                                int[] var33 = this.field3686[var26] = new int[15];
                                if (var29 == 0 && var31 == 0 && var32 == 0) {
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[14] = -var30;
                                    var33[12] = -var27;
                                    var33[13] = -var28;
                                } else {
                                    int var34 = class181.field2886[var29] >> 1;
                                    int var35 = class181.field2884[var29] >> 1;
                                    int var36 = class181.field2886[var31] >> 1;
                                    int var37 = class181.field2884[var31] >> 1;
                                    int var38 = class181.field2884[var32] >> 1;
                                    int var39 = var35 * var38 + 16384 >> 15;
                                    int var40 = class181.field2886[var32] >> 1;
                                    var33[8] = var34 * var36 + 16384 >> 15;
                                    var33[5] = -var35;
                                    var33[4] = var34 * var40 + 16384 >> 15;
                                    int var41 = var35 * var40 + 16384 >> 15;
                                    var33[3] = var34 * var38 + 16384 >> 15;
                                    var33[0] = var36 * var40 + (var37 * var39) + 16384 >> 15;
                                    var33[6] = -var37 * var40 + var36 * var39 + 16384 >> 15;
                                    var33[2] = var34 * var37 + 16384 >> 15;
                                    var33[1] = -var38 * var36 + (var37 * var41) + 16384 >> 15;
                                    var33[14] = var33[5] * -var28 + (var33[2] * -var27 + (var33[8] * -var30)) + 16384 >> 15;
                                    var33[7] = -var37 * -var38 + var36 * var41 + 16384 >> 15;
                                    var33[12] = var33[3] * -var28 + var33[6] * -var30 + var33[0] * -var27 + 16384 >> 15;
                                    var33[13] = var33[1] * -var27 + (var33[4] * -var28) - (-(var33[7] * -var30) + -16384) >> 15;
                                }
                                var33[9] = var27;
                                var33[10] = var28;
                                var33[11] = var30;
                            }
                            if (var29 != 0 || var31 != 0 || var32 != 0) {
                                var20[var26].method1507(var29, var31, var32);
                            }
                            if (var27 != 0 || var28 != 0 || var30 != 0) {
                                var20[var26].method1504(var27, var28, var30);
                            }
                        }
                    }
                }
                class220 var42 = new class220(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class104.field1493[var43].length > this.field3706[var43]) {
                        var42.method1511(class72.field1044[var43], class104.field1493[var43][this.field3706[var43]]);
                    }
                    if (class92.field1312[var43].length > this.field3706[var43]) {
                        var42.method1511(class247.field4138[var43], class92.field1312[var43][this.field3706[var43]]);
                    }
                }
                var16 = var42.method1521(64, 850, -30, -50, -30);
                if (class217.field3516) {
                    ((class319) var16).method2232(false, false, true, true, false, false, true);
                }
                if (arg7) {
                    class241.field3947.method1614(var16, var12, (byte) 78);
                    this.field3692 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = arg8;
        boolean var46 = false;
        int var47 = arg6 == null ? 0 : arg6.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg6[var49] != null) {
                class141 var50 = class133.method851(arg6[var49].field1562, 108);
                if (var50.field2177 != null) {
                    class20.field272[var49] = var50;
                    var46 = true;
                    int var51 = arg6[var49].field1569;
                    int var52 = arg6[var49].field1565;
                    int var53 = var50.field2177[var52];
                    class125.field1758[var49] = class137.method867(var53 >>> 16, (byte) 113);
                    int var54 = var53 & 0xFFFF;
                    class251.field4285[var49] = var54;
                    if (class125.field1758[var49] != null) {
                        var48 |= class125.field1758[var49].method614(var54, 0);
                        var44 |= class125.field1758[var49].method616(var54, 243);
                        var45 |= var50.field2153;
                    }
                    if ((var50.field2161 || class58.field890) && var51 != -1 && var51 < var50.field2177.length) {
                        class146.field2247[var49] = var50.field2150[var52];
                        class4.field66[var49] = arg6[var49].field1564;
                        int var55 = var50.field2177[var51];
                        class124.field1744[var49] = class137.method867(var55 >>> 16, (byte) 40);
                        int var56 = var55 & 0xFFFF;
                        class146.field2243[var49] = var56;
                        if (class124.field1744[var49] != null) {
                            var48 |= class124.field1744[var49].method614(var56, 0);
                            var44 |= class124.field1744[var49].method616(var56, 243);
                        }
                    } else {
                        class146.field2247[var49] = 0;
                        class4.field66[var49] = 0;
                        class124.field1744[var49] = null;
                        class146.field2243[var49] = -1;
                    }
                }
            }
        }
        if (!var46 && arg3 == null && arg5 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        int var59 = 0;
        class93 var60 = null;
        class93 var61 = null;
        if (arg3 != null) {
            int var62 = arg3.field2177[arg2];
            int var63 = var62 >>> 16;
            var60 = class137.method867(var63, (byte) 51);
            var58 = var62 & 0xFFFF;
            if (var60 != null) {
                var48 |= var60.method614(var58, 0);
                var44 |= var60.method616(var58, 243);
                var45 |= arg3.field2153;
            }
            if ((arg3.field2161 || class58.field890) && arg1 != -1 && arg1 < arg3.field2177.length) {
                var59 = arg3.field2150[arg2];
                int var64 = arg3.field2177[arg1];
                int var65 = var64 >>> 16;
                var57 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class137.method867(var57 >>> 16, (byte) 39);
                }
                if (var61 != null) {
                    var48 |= var61.method614(var57, 0);
                    var44 |= var61.method616(var57, 243);
                }
            }
        }
        int var66 = -1;
        class93 var67 = null;
        int var68 = -1;
        int var69 = 0;
        class93 var70 = null;
        if (arg5 != null) {
            int var71 = arg5.field2177[arg4];
            int var72 = var71 >>> 16;
            var67 = class137.method867(var72, (byte) 49);
            var66 = var71 & 0xFFFF;
            if (var67 != null) {
                var48 |= var67.method614(var66, 0);
                var44 |= var67.method616(var66, 243);
                var45 |= arg5.field2153;
            }
            if ((arg5.field2161 || class58.field890) && arg0 != -1 && arg0 < arg5.field2177.length) {
                int var73 = arg5.field2177[arg0];
                int var74 = var73 >>> 16;
                var68 = var73 & 0xFFFF;
                var69 = arg5.field2150[arg4];
                if (var72 == var74) {
                    var70 = var67;
                } else {
                    var70 = class137.method867(var68 >>> 16, (byte) 80);
                }
                if (var70 != null) {
                    var48 |= var70.method614(var68, 0);
                    var44 |= var70.method616(var68, 243);
                }
            }
        }
        class271 var75 = var16.method142(!var44, !var48, !var45);
        int var76 = 0;
        int var77 = 1;
        while (var47 > var76) {
            if (class125.field1758[var76] != null) {
                var75.method1860(class125.field1758[var76], class251.field4285[var76], class124.field1744[var76], class146.field2243[var76], class4.field66[var76] - 1, class146.field2247[var76], var77, class20.field272[var76].field2153, this.field3686[var76]);
            }
            var77 <<= 0x1;
            var76++;
        }
        if (var60 != null && var67 != null) {
            var75.method1861(var60, var58, var61, var57, arg10 - 1, var59, var67, var66, var70, var68, arg9 - 1, var69, arg3.field2143, arg3.field2153 | arg5.field2153);
        } else if (var60 != null) {
            var75.method1863(var60, var58, var61, var57, arg10 - 1, var59, arg3.field2153);
        } else if (var67 != null) {
            var75.method1863(var67, var66, var70, var68, arg9 - 1, var69, arg5.field2153);
        }
        for (int var78 = 0; var78 < var47; var78++) {
            class125.field1758[var78] = null;
            class124.field1744[var78] = null;
            class20.field272[var78] = null;
        }
        return var75;
    }
}
