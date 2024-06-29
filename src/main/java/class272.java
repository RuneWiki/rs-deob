import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class272 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public int field4158 = 5;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public int field4166 = -1;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Z")
    public boolean field4176 = false;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public boolean field4170 = false;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public int field4177 = 2;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public int field4175 = -1;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Z")
    public boolean field4169 = false;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field4179 = 99;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field4180 = -1;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field4174 = -1;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Z")
    public boolean field4189 = false;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public int field4188 = -1;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field4183 = 127;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4167 = 3;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Llm;")
    public static class210 field4161;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public int[] field4160;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
    private int[] field4165;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "[I")
    public int[] field4184;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[Z")
    public boolean[] field4163;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "[[I")
    public int[][] field4182;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILnj;I)Lnj;", line = 4)
    public final class100 method1915(int arg0, int arg1, int arg2, int arg3, class100 arg4, int arg5) {
        field4185++;
        if (arg3 != 2) {
            this.method1915(-111, 21, 112, -110, (class100) null, -102);
        }
        int var7 = this.field4184[arg5];
        int var8 = this.field4160[arg5];
        class134 var9 = class149.method1076(var8 >> 16, 1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method524(true, true, true);
        }
        int var11 = arg2 & 0x3;
        class134 var12 = null;
        if ((this.field4170 || class145.field2191) && arg0 != -1 && arg0 < this.field4160.length) {
            int var13 = this.field4160[arg0];
            var12 = class149.method1076(var13 >> 16, 1);
            arg0 = var13 & 0xFFFF;
        }
        class100 var14;
        if (var12 == null) {
            var14 = arg4.method524(!var9.method984(var10, (byte) 113), !var9.method985(var10, arg3 ^ 0x0), !this.field4169);
        } else {
            var14 = arg4.method524(!var9.method984(var10, (byte) 126) & !var12.method984(arg0, (byte) 114), !var9.method985(var10, 2) & !var12.method985(arg0, 2), !this.field4169);
        }
        if (class117.field1817 && this.field4169) {
            if (var11 == 1) {
                ((class83) var14).method571();
            } else if (var11 == 2) {
                ((class83) var14).method553();
            } else if (var11 == 3) {
                ((class83) var14).method552();
            }
        } else if (var11 == 1) {
            var14.method504();
        } else if (var11 == 2) {
            var14.method516();
        } else if (var11 == 3) {
            var14.method496();
        }
        var14.method704(var9, var10, var12, arg0, arg1 - 1, var7, this.field4169);
        if (class117.field1817 && this.field4169) {
            if (var11 == 1) {
                ((class83) var14).method552();
            } else if (var11 == 2) {
                ((class83) var14).method553();
            } else if (var11 == 3) {
                ((class83) var14).method571();
            }
        } else if (var11 == 1) {
            var14.method496();
        } else if (var11 == 2) {
            var14.method516();
        } else if (var11 == 3) {
            var14.method504();
        }
        return var14;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIIBIIIIIII)Z", line = 101)
    public static final boolean method1916(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4164++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class146.field2209[var12][var13] = 0;
                class145.field2201[var12][var13] = 99999999;
            }
        }
        class146.field2209[arg3][arg1] = 99;
        class145.field2201[arg3][arg1] = 0;
        int var14 = arg1;
        byte var15 = 0;
        class97.field1462[var15] = arg3;
        int var16 = 0;
        int var32 = var15 + 1;
        class93.field1399[var15] = arg1;
        int[][] var17 = class325.field4896[class180.field2697].field2857;
        boolean var18 = false;
        int var19 = arg3;
        while (var32 != var16) {
            var19 = class97.field1462[var16];
            var14 = class93.field1399[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg6 == var19 && arg10 == var14) {
                var18 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class325.field4896[class180.field2697].method1316(var14, arg10, var19, arg8 - 1, arg6, arg2, 1, 45)) {
                    var18 = true;
                    break;
                }
                if (arg8 < 10 && class325.field4896[class180.field2697].method1312(1, arg8 - 1, arg2, -23731, arg10, arg6, var19, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg7 != 0 && class325.field4896[class180.field2697].method1300(arg11, arg6, arg7, var19, arg10, 1, arg9, (byte) 75, var14)) {
                var18 = true;
                break;
            }
            int var20 = class145.field2201[var19][var14] + 1;
            if (var19 > 0 && class146.field2209[var19 - 1][var14] == 0 && (var17[var19 - 1][var14] & 0x12C0108) == 0) {
                class97.field1462[var32] = var19 - 1;
                class93.field1399[var32] = var14;
                class146.field2209[var19 - 1][var14] = 2;
                class145.field2201[var19 - 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var19 < 103 && class146.field2209[var19 + 1][var14] == 0 && (var17[var19 + 1][var14] & 0x12C0180) == 0) {
                class97.field1462[var32] = var19 + 1;
                class93.field1399[var32] = var14;
                class146.field2209[var19 + 1][var14] = 8;
                class145.field2201[var19 + 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class146.field2209[var19][var14 - 1] == 0 && (var17[var19][var14 - 1] & 0x12C0102) == 0) {
                class97.field1462[var32] = var19;
                class93.field1399[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class146.field2209[var19][var14 - 1] = 1;
                class145.field2201[var19][var14 - 1] = var20;
            }
            if (var14 < 103 && class146.field2209[var19][var14 + 1] == 0 && (var17[var19][var14 + 1] & 0x12C0120) == 0) {
                class97.field1462[var32] = var19;
                class93.field1399[var32] = var14 + 1;
                class146.field2209[var19][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var19][var14 + 1] = var20;
            }
            if (var19 > 0 && var14 > 0 && class146.field2209[var19 - 1][var14 - 1] == 0 && (var17[var19 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var19 - 1][var14] & 0x12C0108) == 0 && (var17[var19][var14 - 1] & 0x12C0102) == 0) {
                class97.field1462[var32] = var19 - 1;
                class93.field1399[var32] = var14 - 1;
                class146.field2209[var19 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var19 - 1][var14 - 1] = var20;
            }
            if (var19 < 103 && var14 > 0 && class146.field2209[var19 + 1][var14 - 1] == 0 && (var17[var19 + 1][var14 - 1] & 0x12C0183) == 0 && (var17[var19 + 1][var14] & 0x12C0180) == 0 && (var17[var19][var14 - 1] & 0x12C0102) == 0) {
                class97.field1462[var32] = var19 + 1;
                class93.field1399[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class146.field2209[var19 + 1][var14 - 1] = 9;
                class145.field2201[var19 + 1][var14 - 1] = var20;
            }
            if (var19 > 0 && var14 < 103 && class146.field2209[var19 - 1][var14 + 1] == 0 && (var17[var19 - 1][var14 + 1] & 0x12C0138) == 0 && (var17[var19 - 1][var14] & 0x12C0108) == 0 && (var17[var19][var14 + 1] & 0x12C0120) == 0) {
                class97.field1462[var32] = var19 - 1;
                class93.field1399[var32] = var14 + 1;
                class146.field2209[var19 - 1][var14 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var19 - 1][var14 + 1] = var20;
            }
            if (var19 < 103 && var14 < 103 && class146.field2209[var19 + 1][var14 + 1] == 0 && (var17[var19 + 1][var14 + 1] & 0x12C01E0) == 0 && (var17[var19 + 1][var14] & 0x12C0180) == 0 && (var17[var19][var14 + 1] & 0x12C0120) == 0) {
                class97.field1462[var32] = var19 + 1;
                class93.field1399[var32] = var14 + 1;
                class146.field2209[var19 + 1][var14 + 1] = 12;
                class145.field2201[var19 + 1][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class20.field237 = 0;
        if (!var18) {
            if (!arg0) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg6 - var23; var24 <= (arg6 + var23); var24++) {
                for (int var25 = arg10 - var23; var25 <= (arg10 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class145.field2201[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (arg11 + arg6 - 1 < var24) {
                            var26 = var24 + 1 - arg6 - arg11;
                        }
                        int var27 = 0;
                        if (var25 < arg10) {
                            var27 = arg10 - var25;
                        } else if (var25 > (arg7 + arg10 - 1)) {
                            var27 = var25 + 1 - arg7 - arg10;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class145.field2201[var24][var25]) {
                            var22 = class145.field2201[var24][var25];
                            var19 = var24;
                            var21 = var28;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg3 == var19 && arg1 == var14) {
                return false;
            }
            class20.field237 = 1;
        }
        byte var29 = 0;
        class97.field1462[var29] = var19;
        int var33 = var29 + 1;
        class93.field1399[var29] = var14;
        if (arg4 < 6) {
            method1919(false);
        }
        int var30;
        int var31 = var30 = class146.field2209[var19][var14];
        while (arg3 != var19 || arg1 != var14) {
            if (var30 != var31) {
                class97.field1462[var33] = var19;
                var30 = var31;
                class93.field1399[var33++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var19++;
            } else if ((var31 & 0x8) != 0) {
                var19--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class146.field2209[var19][var14];
        }
        if (var33 > 0) {
            class311.method2152(var33, (byte) 51, arg5);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V", line = 397)
    public static final void method1917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4187++;
        if (arg5 <= class166.field2494 && class185.field2769 <= arg2) {
            boolean var6;
            if (class157.field2357 > arg0) {
                arg0 = class157.field2357;
                var6 = false;
            } else if (arg0 <= class184.field2761) {
                var6 = true;
            } else {
                arg0 = class184.field2761;
                var6 = false;
            }
            boolean var7;
            if (arg1 < class157.field2357) {
                var7 = false;
                arg1 = class157.field2357;
            } else if (class184.field2761 >= arg1) {
                var7 = true;
            } else {
                arg1 = class184.field2761;
                var7 = false;
            }
            if (class185.field2769 <= arg5) {
                class315.method2160(class40.field488[arg5++], arg3, arg1, arg0, 7);
            } else {
                arg5 = class185.field2769;
            }
            if (arg2 <= class166.field2494) {
                class315.method2160(class40.field488[arg2--], arg3, arg1, arg0, 7);
            } else {
                arg2 = class166.field2494;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg2; var8++) {
                    int[] var9 = class40.field488[var8];
                    var9[arg0] = var9[arg1] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg5; var10 <= arg2; var10++) {
                    class40.field488[var10][arg0] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg5; var11 <= arg2; var11++) {
                    class40.field488[var11][arg1] = arg3;
                }
            }
        }
        int var12 = 123 % ((2 - arg4) / 35);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BILnj;II)Lnj;", line = 501)
    public final class100 method1918(byte arg0, int arg1, class100 arg2, int arg3, int arg4) {
        field4171++;
        int var6 = this.field4184[arg3];
        int var7 = this.field4160[arg3];
        class134 var8 = class149.method1076(var7 >> 16, 1);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method491(true, true, true);
        }
        class134 var10 = null;
        class134 var11 = null;
        if ((this.field4170 || class145.field2191) && arg4 != -1 && arg4 < this.field4160.length) {
            int var12 = this.field4160[arg4];
            var10 = class149.method1076(var12 >> 16, 1);
            arg4 = var12 & 0xFFFF;
        }
        class134 var13 = null;
        int var14 = -46 / ((arg0 + 50) / 51);
        int var15 = 0;
        int var16 = 0;
        if (this.field4165 != null) {
            if (this.field4165.length > arg3) {
                var16 = this.field4165[arg3];
                if (var16 != 65535) {
                    var13 = class149.method1076(var16 >> 16, 1);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field4170 || class145.field2191) && arg4 != -1 && this.field4165.length > arg4) {
                var15 = this.field4165[arg4];
                if (var15 != 65535) {
                    var11 = class149.method1076(var15 >> 16, 1);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var17 = !var8.method984(var9, (byte) 121);
        boolean var18 = !var8.method985(var9, 2);
        if (var13 != null) {
            var17 &= !var13.method984(var16, (byte) -32);
            var18 &= !var13.method985(var16, 2);
        }
        if (var10 != null) {
            var17 &= !var10.method984(arg4, (byte) 127);
            var18 &= !var10.method985(arg4, 2);
        }
        if (var11 != null) {
            var17 &= !var11.method984(var15, (byte) 107);
            var18 &= !var11.method985(var15, 2);
        }
        class100 var19 = arg2.method491(var17, var18, !this.field4169);
        var19.method704(var8, var9, var10, arg4, arg1 - 1, var6, this.field4169);
        if (var13 != null) {
            var19.method704(var13, var16, var11, var15, arg1 - 1, var6, this.field4169);
        }
        return var19;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)[Lbk;", line = 606)
    public static final class157[] method1919(boolean arg0) {
        field4162++;
        class157[] var1 = new class157[class96.field1444];
        for (int var2 = 0; var2 < class96.field1444; var2++) {
            if (class117.field1817) {
                var1[var2] = new class324(class12.field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], class205.field3083[var2], class66.field865);
            } else {
                var1[var2] = new class59(class12.field136, class132.field2034, class203.field3039[var2], class184.field2754[var2], class203.field3051[var2], class160.field2403[var2], class205.field3083[var2], class66.field865);
            }
        }
        if (arg0) {
            class10.method49((byte) 113);
            return var1;
        } else {
            return (class157[]) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIILnj;)Lnj;", line = 633)
    public final class100 method1920(int arg0, int arg1, int arg2, int arg3, int arg4, class100 arg5) {
        field4168++;
        int var7 = this.field4184[arg2];
        if (arg0 != -4) {
            this.field4169 = true;
        }
        int var8 = this.field4160[arg2];
        class134 var9 = class149.method1076(var8 >> 16, 1);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method491(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class134 var12 = null;
        if ((this.field4170 || class145.field2191) && arg3 != -1 && arg3 < this.field4160.length) {
            int var13 = this.field4160[arg3];
            var12 = class149.method1076(var13 >> 16, 1);
            arg3 = var13 & 0xFFFF;
        }
        class100 var14;
        if (var12 == null) {
            var14 = arg5.method491(!var9.method984(var10, (byte) -22), !var9.method985(var10, 2), !this.field4169);
        } else {
            var14 = arg5.method491(!var9.method984(var10, (byte) 116) & !var12.method984(arg3, (byte) -57), !var9.method985(var10, arg0 ^ 0xFFFFFFFE) & !var12.method985(arg3, arg0 + 6), !this.field4169);
        }
        if (this.field4169 && class117.field1817) {
            if (var11 == 1) {
                ((class83) var14).method571();
            } else if (var11 == 2) {
                ((class83) var14).method553();
            } else if (var11 == 3) {
                ((class83) var14).method552();
            }
        } else if (var11 == 1) {
            var14.method504();
        } else if (var11 == 2) {
            var14.method516();
        } else if (var11 == 3) {
            var14.method496();
        }
        var14.method704(var9, var10, var12, arg3, arg4 - 1, var7, this.field4169);
        if (this.field4169 && class117.field1817) {
            if (var11 == 1) {
                ((class83) var14).method552();
            } else if (var11 == 2) {
                ((class83) var14).method553();
            } else if (var11 == 3) {
                ((class83) var14).method571();
            }
        } else if (var11 == 1) {
            var14.method496();
        } else if (var11 == 2) {
            var14.method516();
        } else if (var11 == 3) {
            var14.method504();
        }
        return var14;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZLre;)V", line = 731)
    private final void method1921(int arg0, boolean arg1, class263 arg2) {
        field4181++;
        if (arg0 == 1) {
            int var4 = arg2.method1830((byte) -77);
            this.field4184 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4184[var5] = arg2.method1830((byte) -77);
            }
            this.field4160 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4160[var6] = arg2.method1830((byte) -77);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4160[var7] = (arg2.method1830((byte) -77) << 16) + this.field4160[var7];
            }
        } else if (arg0 == 2) {
            this.field4166 = arg2.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field4163 = new boolean[256];
            int var8 = arg2.method1787(arg1);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4163[arg2.method1787(false)] = true;
            }
        } else if (arg0 == 4) {
            this.field4189 = true;
        } else if (arg0 == 5) {
            this.field4158 = arg2.method1787(arg1);
        } else if (arg0 == 6) {
            this.field4180 = arg2.method1830((byte) -77);
        } else if (arg0 == 7) {
            this.field4174 = arg2.method1830((byte) -77);
        } else if (arg0 == 8) {
            this.field4179 = arg2.method1787(false);
        } else if (arg0 == 9) {
            this.field4188 = arg2.method1787(false);
        } else if (arg0 == 10) {
            this.field4175 = arg2.method1787(false);
        } else if (arg0 == 11) {
            this.field4177 = arg2.method1787(arg1);
        } else if (arg0 == 12) {
            int var10 = arg2.method1787(false);
            this.field4165 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field4165[var11] = arg2.method1830((byte) -77);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field4165[var12] += arg2.method1830((byte) -77) << 16;
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method1830((byte) -77);
            this.field4182 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method1787(false);
                if (var15 > 0) {
                    this.field4182[var14] = new int[var15];
                    this.field4182[var14][0] = arg2.method1824(false);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field4182[var14][var16] = arg2.method1830((byte) -77);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4169 = true;
        } else if (arg0 == 15) {
            this.field4170 = true;
        } else if (arg0 == 16) {
            this.field4176 = true;
        }
        if (arg1) {
            this.field4188 = -79;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lre;Z)V", line = 890)
    public final void method1922(class263 arg0, boolean arg1) {
        field4173++;
        while (true) {
            int var3 = arg0.method1787(false);
            if (var3 == 0) {
                if (!arg1) {
                    this.method1922((class263) null, false);
                }
                return;
            }
            this.method1921(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILnj;II)Lnj;", line = 932)
    public final class100 method1923(int arg0, int arg1, class100 arg2, int arg3, int arg4) {
        field4186++;
        int var6 = this.field4184[arg4];
        int var7 = this.field4160[arg4];
        if (arg3 != -3) {
            method1924(95);
        }
        class134 var8 = class149.method1076(var7 >> 16, 1);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method510(true, true, true);
        }
        class134 var10 = null;
        if ((this.field4170 || class145.field2191) && arg1 != -1 && this.field4160.length > arg1) {
            int var11 = this.field4160[arg1];
            var10 = class149.method1076(var11 >> 16, 1);
            arg1 = var11 & 0xFFFF;
        }
        class100 var12;
        if (var10 == null) {
            var12 = arg2.method510(!var8.method984(var9, (byte) 124), !var8.method985(var9, 2), !this.field4169);
        } else {
            var12 = arg2.method510(!var8.method984(var9, (byte) 127) & !var10.method984(arg1, (byte) -13), !var8.method985(var9, 2) & !var10.method985(arg1, 2), !this.field4169);
        }
        var12.method704(var8, var9, var10, arg1, arg0 - 1, var6, this.field4169);
        return var12;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 977)
    public static final void method1924(int arg0) {
        int var1 = class271.field4155 >> 7;
        if (class234.field3525 < 128) {
            class234.field3525 = 128;
        }
        field4178++;
        if (class234.field3525 > 383) {
            class234.field3525 = 383;
        }
        class284.field4297 &= 0x7FF;
        int var2 = class160.field2402 >> 7;
        int var3 = class74.method473(class160.field2402, class271.field4155, 64, class180.field2697);
        int var4 = 0;
        if (arg0 > ~var1 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class180.field2697;
                    if (var7 < 3 && (class179.field2645[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class187.field2783[var7][var5][var6] & 0xFF) * 8 - (class294.field4502[var7][var5][var6] - var3);
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class226.field3445) {
            class226.field3445 += (var9 - class226.field3445) / 24;
        } else if (class226.field3445 > var9) {
            class226.field3445 += (var9 - class226.field3445) / 80;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 1052)
    public final void method1925(int arg0) {
        if (this.field4188 == -1) {
            if (this.field4163 == null) {
                this.field4188 = 0;
            } else {
                this.field4188 = 2;
            }
        }
        if (this.field4175 == -1) {
            if (this.field4163 == null) {
                this.field4175 = 0;
            } else {
                this.field4175 = 2;
            }
        }
        if (arg0 != -31799) {
            this.field4175 = -2;
        }
        field4159++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 1092)
    public static void method1926(byte arg0) {
        int var1 = -58 % ((-arg0 - 63) / 33);
        field4161 = null;
    }
}
