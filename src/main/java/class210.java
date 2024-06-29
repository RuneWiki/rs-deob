import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class210 {

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Z")
    public boolean field3322 = false;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public int field3316 = -1;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public int field3313 = 99;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
    public boolean field3320 = false;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field3328 = -1;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "Z")
    public boolean field3312 = false;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field3336 = -1;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field3338 = 2;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public int field3333 = 5;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public int field3315 = -1;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public boolean field3341 = false;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public int field3343 = -1;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field3344 = new String[] { method1906(method1905("{c\u001a\\u")), method1906(method1905("{c\u001a^u")), method1906(method1905("{c\u001aPu")), method1906(method1905("{c\u001a]u")), method1906(method1905("zsXu")), method1906(method1905("o(\u001a7 ")), method1906(method1905("{c\u001aXu")), method1906(method1905("{c\u001aQu")), method1906(method1905("{c\u001a_u")), method1906(method1905("{c\u001a[u")), method1906(method1905("{c\u001aZu")) };

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[B")
    public static byte[] field3329 = null;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Laia;")
    public class238 field3342;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[I")
    public int[] field3318;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "[I")
    public int[] field3319;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "[I")
    private int[] field3325;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    public int[] field3327;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    public int[] field3332;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[I")
    public int[] field3334;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "[Z")
    public boolean[] field3330;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "[[I")
    public int[][] field3326;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method1896(int arg0) {
        try {
            if (arg0 != 128) {
                method1903(-24, 55, -93);
            }
            if (this.field3315 == -1) {
                if (this.field3330 == null) {
                    this.field3315 = 0;
                } else {
                    this.field3315 = 2;
                }
            }
            if (this.field3328 == -1) {
                if (this.field3330 == null) {
                    this.field3328 = 0;
                } else {
                    this.field3328 = 2;
                }
            }
            field3339++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3344[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lka;BIIIBII)Lka;")
    public final class499 method1897(class499 arg0, byte arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        try {
            field3340++;
            int var9 = this.field3334[arg4];
            int var17 = this.field3327[arg4];
            class356 var10 = this.field3342.method2052(58, var17 >> 16);
            int var18 = var17 & 0xFFFF;
            if (var10 == null) {
                return arg0.method394(arg5, arg3, true);
            }
            class356 var11 = null;
            if ((this.field3312 || class321.field5219) && arg2 != -1 && this.field3327.length > arg2) {
                int var16 = this.field3327[arg2];
                var11 = this.field3342.method2052(74, var16 >> 16);
                arg2 = var16 & 0xFFFF;
            }
            if (this.field3320) {
                arg3 |= 0x200;
            }
            if (var10.method2947(var18, -1)) {
                arg3 |= 0x80;
            }
            if (var10.method2954(var18, -19459)) {
                arg3 |= 0x100;
            }
            if (var10.method2951(var18, (byte) 93)) {
                arg3 |= 0x400;
            }
            if (var11 != null) {
                if (var11.method2947(arg2, -1)) {
                    arg3 |= 0x80;
                }
                if (var11.method2954(arg2, -19459)) {
                    arg3 |= 0x100;
                }
                if (var11.method2951(arg2, (byte) 93)) {
                    arg3 |= 0x400;
                }
            }
            int var12 = -18 / ((-arg1 - 62) / 59);
            arg3 |= 0x20;
            class499 var13 = arg0.method394(arg5, arg3, true);
            var13.method3767(var11, var9, var10, this.field3320, true, var18, arg6, arg7 - 1, arg2);
            return var13;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field3344[3] + (arg0 == null ? field3344[4] : field3344[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BILwq;)V")
    private final void method1898(byte arg0, int arg1, class176 arg2) {
        try {
            if (arg1 == 1) {
                int var16 = arg2.method1687((byte) -112);
                this.field3334 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field3334[var17] = arg2.method1687((byte) -121);
                }
                this.field3327 = new int[var16];
                for (int var18 = 0; var18 < var16; var18++) {
                    this.field3327[var18] = arg2.method1687((byte) -60);
                }
                for (int var19 = 0; var19 < var16; var19++) {
                    this.field3327[var19] = (arg2.method1687((byte) -50) << 16) + this.field3327[var19];
                }
            } else if (arg1 == 2) {
                this.field3343 = arg2.method1687((byte) -89);
            } else if (arg1 == 3) {
                this.field3330 = new boolean[256];
                int var14 = arg2.method1645((byte) -121);
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field3330[arg2.method1645((byte) -93)] = true;
                }
            } else if (arg1 == 5) {
                this.field3333 = arg2.method1645((byte) -119);
            } else if (arg1 == 6) {
                this.field3316 = arg2.method1687((byte) -48);
            } else if (arg1 == 7) {
                this.field3336 = arg2.method1687((byte) -105);
            } else if (arg1 == 8) {
                this.field3313 = arg2.method1645((byte) -99);
            } else if (arg1 == 9) {
                this.field3328 = arg2.method1645((byte) -120);
            } else if (arg1 == 10) {
                this.field3315 = arg2.method1645((byte) -114);
            } else if (arg1 == 11) {
                this.field3338 = arg2.method1645((byte) -72);
            } else if (arg1 == 12) {
                int var11 = arg2.method1645((byte) -92);
                this.field3325 = new int[var11];
                for (int var12 = 0; var12 < var11; var12++) {
                    this.field3325[var12] = arg2.method1687((byte) -42);
                }
                for (int var13 = 0; var13 < var11; var13++) {
                    this.field3325[var13] = (arg2.method1687((byte) -99) << 16) + this.field3325[var13];
                }
            } else if (arg1 == 13) {
                int var7 = arg2.method1687((byte) -127);
                this.field3326 = new int[var7][];
                for (int var8 = 0; var8 < var7; var8++) {
                    int var9 = arg2.method1645((byte) -74);
                    if (var9 > 0) {
                        this.field3326[var8] = new int[var9];
                        this.field3326[var8][0] = arg2.method1685(false);
                        for (int var10 = 1; var10 < var9; var10++) {
                            this.field3326[var8][var10] = arg2.method1687((byte) -54);
                        }
                    }
                }
            } else if (arg1 == 14) {
                this.field3320 = true;
            } else if (arg1 == 15) {
                this.field3312 = true;
            } else if (arg1 == 16) {
                this.field3341 = true;
            } else if (arg1 == 18) {
                this.field3322 = true;
            } else if (arg1 == 19) {
                if (this.field3318 == null) {
                    this.field3318 = new int[this.field3326.length];
                    for (int var6 = 0; var6 < this.field3326.length; var6++) {
                        this.field3318[var6] = 255;
                    }
                }
                this.field3318[arg2.method1645((byte) -95)] = arg2.method1645((byte) -83);
            } else if (arg1 == 20) {
                if (this.field3332 == null || this.field3319 == null) {
                    this.field3332 = new int[this.field3326.length];
                    this.field3319 = new int[this.field3326.length];
                    for (int var4 = 0; var4 < this.field3326.length; var4++) {
                        this.field3332[var4] = 256;
                        this.field3319[var4] = 256;
                    }
                }
                int var5 = arg2.method1645((byte) -81);
                this.field3332[var5] = arg2.method1687((byte) -72);
                this.field3319[var5] = arg2.method1687((byte) -43);
            }
            field3311++;
            if (arg0 != 22) {
                method1900(true, (byte) 70);
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field3344[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3344[4] : field3344[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lwq;B)V")
    public final void method1899(class176 arg0, byte arg1) {
        try {
            if (arg1 <= 65) {
                this.field3322 = false;
            }
            field3337++;
            while (true) {
                int var3 = arg0.method1645((byte) -98);
                if (var3 == 0) {
                    return;
                }
                this.method1898((byte) 22, var3, arg0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3344[9] + (arg0 == null ? field3344[4] : field3344[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZB)V")
    public static final void method1900(boolean arg0, byte arg1) {
        try {
            field3331++;
            int var2 = 53 % ((-arg1 - 47) / 54);
            class15.method107(class333.field5444, (byte) -78, class317.field5175, class64.field881, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3344[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILka;IIB)Lka;")
    public final class499 method1901(int arg0, int arg1, class499 arg2, int arg3, int arg4, byte arg5) {
        try {
            field3317++;
            int var7 = this.field3334[arg1];
            int var8 = this.field3327[arg1];
            class356 var9 = this.field3342.method2052(78, var8 >> 16);
            int var10 = var8 & 0xFFFF;
            if (var9 == null) {
                return arg2.method394((byte) 1, arg4, true);
            }
            class356 var11 = null;
            if ((this.field3312 || class321.field5219) && arg0 != -1 && arg0 < this.field3327.length) {
                int var19 = this.field3327[arg0];
                var11 = this.field3342.method2052(97, var19 >> 16);
                arg0 = var19 & 0xFFFF;
            }
            if (arg5 >= -20) {
                this.field3333 = -58;
            }
            class356 var12 = null;
            class356 var13 = null;
            int var14 = 0;
            int var15 = 0;
            if (this.field3325 != null) {
                if (arg1 < this.field3325.length) {
                    var14 = this.field3325[arg1];
                    if (var14 != 65535) {
                        var12 = this.field3342.method2052(27, var14 >> 16);
                        var14 &= 0xFFFF;
                    }
                }
                if ((this.field3312 || class321.field5219) && arg0 != -1 && this.field3325.length > arg0) {
                    var15 = this.field3325[arg0];
                    if (var15 != 65535) {
                        var13 = this.field3342.method2052(48, var15 >> 16);
                        var15 &= 0xFFFF;
                    }
                }
            }
            if (this.field3320) {
                arg4 |= 0x200;
            }
            if (var9.method2947(var10, -1)) {
                arg4 |= 0x80;
            }
            if (var9.method2954(var10, -19459)) {
                arg4 |= 0x100;
            }
            if (var9.method2951(var10, (byte) 93)) {
                arg4 |= 0x400;
            }
            if (var12 != null) {
                if (var12.method2947(var14, -1)) {
                    arg4 |= 0x80;
                }
                if (var12.method2954(var14, -19459)) {
                    arg4 |= 0x100;
                }
                if (var12.method2951(var14, (byte) 93)) {
                    arg4 |= 0x400;
                }
            }
            if (var11 != null) {
                if (var11.method2947(arg0, -1)) {
                    arg4 |= 0x80;
                }
                if (var11.method2954(arg0, -19459)) {
                    arg4 |= 0x100;
                }
                if (var11.method2951(arg0, (byte) 93)) {
                    arg4 |= 0x400;
                }
            }
            if (var13 != null) {
                if (var13.method2947(var15, -1)) {
                    arg4 |= 0x80;
                }
                if (var13.method2954(var15, -19459)) {
                    arg4 |= 0x100;
                }
                if (var13.method2951(var15, (byte) 93)) {
                    arg4 |= 0x400;
                }
            }
            arg4 |= 0x20;
            class499 var16 = arg2.method394((byte) 1, arg4, true);
            var16.method3767(var11, var7, var9, this.field3320, true, var10, 0, arg3 - 1, arg0);
            if (var12 != null) {
                var16.method3767(var13, var7, var12, this.field3320, true, var14, 0, arg3 - 1, var15);
            }
            return var16;
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field3344[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3344[4] : field3344[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZII)I")
    public final int method1902(byte arg0, boolean arg1, int arg2, int arg3) {
        try {
            if (arg0 <= 84) {
                this.field3325 = null;
            }
            field3324++;
            int var5 = 0;
            int var6 = 0;
            int var7 = this.field3327[arg3];
            class356 var8 = null;
            class356 var9 = this.field3342.method2052(53, var7 >> 16);
            int var10 = var7 & 0xFFFF;
            if (var9 == null) {
                return var5;
            }
            if ((this.field3312 || class321.field5219) && arg2 != -1 && this.field3327.length > arg2) {
                int var11 = this.field3327[arg2];
                var8 = this.field3342.method2052(104, var11 >> 16);
                var6 = var11 & 0xFFFF;
            }
            if (this.field3320) {
                var5 |= 0x200;
            }
            if (var9.method2947(var10, -1)) {
                var5 |= 0x80;
            }
            if (var9.method2954(var10, -19459)) {
                var5 |= 0x100;
            }
            if (var9.method2951(var10, (byte) 93)) {
                var5 |= 0x400;
            }
            if (var8 != null) {
                if (var8.method2947(var6, -1)) {
                    var5 |= 0x80;
                }
                if (var8.method2954(var6, -19459)) {
                    var5 |= 0x100;
                }
                if (var8.method2951(var6, (byte) 93)) {
                    var5 |= 0x400;
                }
            }
            if (this.field3325 != null && arg1) {
                if (arg3 < this.field3325.length) {
                    int var12 = this.field3325[arg3];
                    if (var12 != 65535) {
                        class356 var13 = this.field3342.method2052(90, var12 >> 16);
                        int var14 = var12 & 0xFFFF;
                        if (var13 != null) {
                            if (var13.method2947(var14, -1)) {
                                var5 |= 0x80;
                            }
                            if (var13.method2954(var14, -19459)) {
                                var5 |= 0x100;
                            }
                            if (var13.method2951(var14, (byte) 93)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
                if ((this.field3312 || class321.field5219) && arg2 != -1 && this.field3325.length > arg2) {
                    int var15 = this.field3325[arg2];
                    if (var15 != 65535) {
                        class356 var16 = this.field3342.method2052(92, var15 >> 16);
                        int var17 = var15 & 0xFFFF;
                        if (var16 != null) {
                            if (var16.method2947(var17, -1)) {
                                var5 |= 0x80;
                            }
                            if (var16.method2954(var17, -19459)) {
                                var5 |= 0x100;
                            }
                            if (var16.method2951(var17, (byte) 93)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
            }
            return var5 | 0x20;
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field3344[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
    public static final int method1903(int arg0, int arg1, int arg2) {
        try {
            if (arg2 > -41) {
                return -56;
            }
            field3335++;
            byte var3;
            if (arg0 > 20000) {
                class502.method3785(14);
                var3 = 4;
            } else if (arg0 > 10000) {
                class190.method1764(-2137);
                var3 = 3;
            } else if (arg0 <= 5000) {
                var3 = 1;
                class360.method2979(true, -52);
            } else {
                var3 = 2;
                class752.method5459((byte) -92);
            }
            if (class623.field8996.field6379.method4132(true) != arg1) {
                class623.field8996.method3244(22733, class623.field8996.field6378, arg1);
                class679.method4942(false, (byte) -125, arg1);
            }
            class574.method4222((byte) -94);
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3344[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1904(int arg0) {
        try {
            if (arg0 != 18253) {
                method1903(-90, -55, -37);
            }
            field3329 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3344[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1905(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1906(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
