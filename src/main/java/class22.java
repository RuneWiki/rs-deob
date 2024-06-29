import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class22 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[[I")
    public int[][] field266;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field249 = new String[500];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lth;")
    public static class57 field251;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIIIIIZ)V", line = 5)
    public final void method129(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field244++;
        int var8 = arg5 - this.field252;
        int var9 = arg3 - this.field268;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method133(123, var9, 128, var8);
                this.method133(122, var9, 8, var8 - 1);
            }
            if (arg2 == 1) {
                this.method133(arg1 + 122, var9, 2, var8);
                this.method133(114, var9 + 1, 32, var8);
            }
            if (arg2 == 2) {
                this.method133(arg1 + 117, var9, 8, var8);
                this.method133(123, var9, 128, var8 + 1);
            }
            if (arg2 == 3) {
                this.method133(arg1 + 115, var9, 32, var8);
                this.method133(115, var9 - 1, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method133(116, var9, 1, var8);
                this.method133(121, var9 + 1, 16, var8 - 1);
            }
            if (arg2 == 1) {
                this.method133(124, var9, 4, var8);
                this.method133(113, var9 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method133(arg1 + 117, var9, 16, var8);
                this.method133(118, var9 - 1, 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method133(118, var9, 64, var8);
                this.method133(arg1 + 124, var9 + -1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method133(127, var9, 130, var8);
                this.method133(116, var9, 8, var8 - 1);
                this.method133(arg1 ^ 0x7F, var9 + 1, 32, var8);
            }
            if (arg2 == 1) {
                this.method133(115, var9, 10, var8);
                this.method133(arg1 + 112, var9 + 1, 32, var8);
                this.method133(127, var9, 128, var8 + 1);
            }
            if (arg2 == 2) {
                this.method133(arg1 ^ 0x7E, var9, 40, var8);
                this.method133(125, var9, 128, var8 + 1);
                this.method133(120, var9 - 1, 2, var8);
            }
            if (arg2 == 3) {
                this.method133(125, var9, 160, var8);
                this.method133(118, var9 - 1, 2, var8);
                this.method133(113, var9, 8, var8 - 1);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    this.method133(arg1 ^ 0x72, var9, 65536, var8);
                    this.method133(127, var9, 4096, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method133(120, var9, 1024, var8);
                    this.method133(124, var9 + 1, 16384, var8);
                }
                if (arg2 == 2) {
                    this.method133(124, var9, 4096, var8);
                    this.method133(arg1 + 120, var9, 65536, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method133(arg1 + 120, var9, 16384, var8);
                    this.method133(115, var9 - 1, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg2 == 0) {
                    this.method133(127, var9, 512, var8);
                    this.method133(126, var9 + 1, 8192, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method133(118, var9, 2048, var8);
                    this.method133(116, var9 + 1, 32768, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method133(122, var9, 8192, var8);
                    this.method133(125, var9 - 1, 512, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method133(123, var9, 32768, var8);
                    this.method133(114, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    this.method133(117, var9, 66560, var8);
                    this.method133(arg1 ^ 0x78, var9, 4096, var8 - 1);
                    this.method133(124, var9 + 1, 16384, var8);
                }
                if (arg2 == 1) {
                    this.method133(127, var9, 5120, var8);
                    this.method133(124, var9 + 1, 16384, var8);
                    this.method133(120, var9, 65536, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method133(119, var9, 20480, var8);
                    this.method133(arg1 + 126, var9, 65536, var8 + 1);
                    this.method133(113, var9 - 1, 1024, var8);
                }
                if (arg2 == 3) {
                    this.method133(arg1 ^ 0x78, var9, 81920, var8);
                    this.method133(arg1 + 120, var9 + -1, 1024, var8);
                    this.method133(114, var9, 4096, var8 - 1);
                }
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    this.method133(120, var9, 536870912, var8);
                    this.method133(arg1 + 125, var9, 33554432, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method133(125, var9, 8388608, var8);
                    this.method133(arg1 ^ 0x70, var9 + 1, 134217728, var8);
                }
                if (arg2 == 2) {
                    this.method133(120, var9, 33554432, var8);
                    this.method133(116, var9, 536870912, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method133(123, var9, 134217728, var8);
                    this.method133(arg1 ^ 0x76, var9 - 1, 8388608, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg2 == 0) {
                    this.method133(arg1 + 123, var9, 4194304, var8);
                    this.method133(116, var9 + 1, 67108864, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method133(127, var9, 16777216, var8);
                    this.method133(124, var9 + 1, 268435456, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method133(121, var9, 67108864, var8);
                    this.method133(124, var9 - 1, 4194304, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method133(122, var9, 268435456, var8);
                    this.method133(arg1 + 112, var9 + -1, 16777216, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    this.method133(arg1 ^ 0x7D, var9, 545259520, var8);
                    this.method133(125, var9, 33554432, var8 - 1);
                    this.method133(119, var9 + 1, 134217728, var8);
                }
                if (arg2 == 1) {
                    this.method133(119, var9, 41943040, var8);
                    this.method133(116, var9 + 1, 134217728, var8);
                    this.method133(123, var9, 536870912, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method133(arg1 + 116, var9, 167772160, var8);
                    this.method133(122, var9, 536870912, var8 + 1);
                    this.method133(126, var9 - 1, 8388608, var8);
                }
                if (arg2 == 3) {
                    this.method133(119, var9, 671088640, var8);
                    this.method133(127, var9 - 1, 8388608, var8);
                    this.method133(116, var9, 33554432, var8 - 1);
                }
            }
        }
        if (arg1 != 1) {
            method138((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBII)V", line = 322)
    public static final void method130(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 0;
        field246++;
        int var6 = -18 % ((arg2 - 28) / 52);
        int var7 = arg0;
        class161.method1253(arg0 + arg4, class353.field5599[arg1], -1, arg3, arg4 - arg0);
        int var8 = -1;
        int var9 = -arg0;
        while (var5 < var7) {
            var8 += 2;
            var5++;
            var9 += var8;
            if (var9 >= 0) {
                int var10 = arg4 - var5;
                var7--;
                int[] var11 = class353.field5599[arg1 + var7];
                var9 -= var7 << 1;
                int[] var12 = class353.field5599[arg1 - var7];
                int var13 = arg4 + var5;
                class161.method1253(var13, var11, -1, arg3, var10);
                class161.method1253(var13, var12, -1, arg3, var10);
            }
            int var14 = arg4 + var7;
            int[] var15 = class353.field5599[arg1 + var5];
            int var16 = arg4 - var7;
            int[] var17 = class353.field5599[arg1 - var5];
            class161.method1253(var14, var15, -1, arg3, var16);
            class161.method1253(var14, var17, -1, arg3, var16);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([II)[I", line = 372)
    public static final int[] method131(int[] arg0, int arg1) {
        field264++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 7042) {
            method143(-27, 123);
        }
        int[] var2 = new int[arg0.length];
        class242.method1842(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V", line = 390)
    public final void method132(int arg0, int arg1, int arg2) {
        field263++;
        int var4 = arg1 - this.field268;
        int var5 = arg0 - this.field252;
        if (arg2 != 2883848) {
            this.field252 = -27;
        }
        this.field266[var5][var4] = class75.method624(this.field266[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V", line = 405)
    private final void method133(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 112) {
            this.field252 = -117;
        }
        field261++;
        this.field266[arg3][arg1] = class75.method624(this.field266[arg3][arg1], arg2);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V", line = 418)
    public final void method134(int arg0, int arg1, int arg2) {
        int var4 = 118 % ((-arg2 - 7) / 51);
        field258++;
        int var5 = arg0 - this.field268;
        int var6 = arg1 - this.field252;
        this.field266[var6][var5] = class75.method624(this.field266[var6][var5], 2097152);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZIIIIZ)V", line = 432)
    public final void method135(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field268;
        field254++;
        int var9 = 256;
        int var10 = arg2 - this.field252;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        if (arg5 != 18377) {
            return;
        }
        for (int var11 = var10; var11 < (arg3 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field248) {
                for (int var12 = var8; var12 < arg4 + var8; var12++) {
                    if (var12 >= 0 && this.field250 > var12) {
                        this.method133(arg5 - 18262, var12, var9, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZIIIIII)V", line = 483)
    public final void method136(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field253++;
        int var9 = arg7 - this.field252;
        int var10 = arg5 - this.field268;
        int var11 = 256;
        if (arg1) {
            var11 |= 0x20000;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg3;
            arg3 = arg4;
            arg4 = var12;
        }
        if (arg0) {
            var11 |= 0x40000000;
        }
        int var13 = var9;
        if (arg2 != -23999) {
            this.field266 = (int[][]) ((int[][]) null);
        }
        while (var13 < arg3 + var9) {
            if (var13 >= 0 && this.field248 > var13) {
                for (int var14 = var10; var14 < (arg4 + var10); var14++) {
                    if (var14 >= 0 && this.field250 > var14) {
                        this.method147(var14, -26375, var11, var13);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 545)
    public final void method137(int arg0) {
        if (arg0 != 1) {
            this.field268 = 16;
        }
        for (int var2 = 0; var2 < this.field248; var2++) {
            for (int var3 = 0; var3 < this.field250; var3++) {
                if (var2 == 0 || var3 == 0 || this.field248 - 5 <= var2 || this.field250 - 5 <= var3) {
                    this.field266[var2][var3] = 16777215;
                } else {
                    this.field266[var2][var3] = 2097152;
                }
            }
        }
        field267++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lab;", line = 579)
    public static final class293 method138(Throwable arg0, String arg1) {
        field245++;
        class293 var2;
        if ((arg0 instanceof class293)) {
            var2 = (class293) arg0;
            var2.field4734 = var2.field4734 + ' ' + arg1;
        } else {
            var2 = new class293(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIBII)Z", line = 601)
    public final boolean method139(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field255++;
        if (arg3 == arg4 && arg0 == arg1) {
            return true;
        }
        int var6 = arg0 - this.field268;
        int var7 = arg3 - this.field252;
        if (var7 < 0 || this.field248 <= var7 || var6 < 0 || this.field250 <= var6) {
            return false;
        }
        int var8 = arg1 - this.field268;
        int var9 = arg4 - this.field252;
        if (var9 < 0 || this.field248 <= var9 || var8 < 0 || var8 >= this.field250) {
            return false;
        }
        if (arg2 != -97) {
            this.method135(97, true, 0, 115, 27, -94, false);
        }
        int var10;
        if (var7 > var9) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11;
        if (var6 <= var8) {
            var11 = var8 - var6;
        } else {
            var11 = var6 - var8;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var8) {
                if (var6 > var8) {
                    if ((this.field266[var9][var8] & 0x2C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field266[var9][var8] & 0x2C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 > var9) {
                        if ((this.field266[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field266[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field266[var9][var8] & 0x2C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field266[var9][var8] & 0x2C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var6) {
                        if ((this.field266[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field266[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field266[var7][var6] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BZIIIIZ)V", line = 754)
    public final void method140(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field256++;
        int var8 = arg5 - this.field252;
        int var9 = arg2 - this.field268;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method147(var9, -26375, 128, var8);
                this.method147(var9, -26375, 8, var8 - 1);
            }
            if (arg4 == 1) {
                this.method147(var9, -26375, 2, var8);
                this.method147(var9 + 1, -26375, 32, var8);
            }
            if (arg4 == 2) {
                this.method147(var9, -26375, 8, var8);
                this.method147(var9, -26375, 128, var8 + 1);
            }
            if (arg4 == 3) {
                this.method147(var9, -26375, 32, var8);
                this.method147(var9 - 1, -26375, 2, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method147(var9, -26375, 1, var8);
                this.method147(var9 + 1, -26375, 16, var8 - 1);
            }
            if (arg4 == 1) {
                this.method147(var9, -26375, 4, var8);
                this.method147(var9 + 1, -26375, 64, var8 + 1);
            }
            if (arg4 == 2) {
                this.method147(var9, -26375, 16, var8);
                this.method147(var9 - 1, -26375, 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method147(var9, -26375, 64, var8);
                this.method147(var9 - 1, -26375, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method147(var9, -26375, 130, var8);
                this.method147(var9, -26375, 8, var8 - 1);
                this.method147(var9 + 1, -26375, 32, var8);
            }
            if (arg4 == 1) {
                this.method147(var9, -26375, 10, var8);
                this.method147(var9 + 1, -26375, 32, var8);
                this.method147(var9, -26375, 128, var8 + 1);
            }
            if (arg4 == 2) {
                this.method147(var9, -26375, 40, var8);
                this.method147(var9, -26375, 128, var8 + 1);
                this.method147(var9 - 1, -26375, 2, var8);
            }
            if (arg4 == 3) {
                this.method147(var9, -26375, 160, var8);
                this.method147(var9 - 1, -26375, 2, var8);
                this.method147(var9, -26375, 8, var8 - 1);
            }
        }
        if (arg1) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    this.method147(var9, -26375, 65536, var8);
                    this.method147(var9, -26375, 4096, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method147(var9, -26375, 1024, var8);
                    this.method147(var9 + 1, -26375, 16384, var8);
                }
                if (arg4 == 2) {
                    this.method147(var9, -26375, 4096, var8);
                    this.method147(var9, -26375, 65536, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method147(var9, -26375, 16384, var8);
                    this.method147(var9 - 1, -26375, 1024, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg4 == 0) {
                    this.method147(var9, -26375, 512, var8);
                    this.method147(var9 + 1, -26375, 8192, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method147(var9, -26375, 2048, var8);
                    this.method147(var9 + 1, -26375, 32768, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method147(var9, -26375, 8192, var8);
                    this.method147(var9 - 1, -26375, 512, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method147(var9, -26375, 32768, var8);
                    this.method147(var9 - 1, -26375, 2048, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    this.method147(var9, -26375, 66560, var8);
                    this.method147(var9, -26375, 4096, var8 - 1);
                    this.method147(var9 + 1, -26375, 16384, var8);
                }
                if (arg4 == 1) {
                    this.method147(var9, -26375, 5120, var8);
                    this.method147(var9 + 1, -26375, 16384, var8);
                    this.method147(var9, -26375, 65536, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method147(var9, -26375, 20480, var8);
                    this.method147(var9, -26375, 65536, var8 + 1);
                    this.method147(var9 - 1, -26375, 1024, var8);
                }
                if (arg4 == 3) {
                    this.method147(var9, -26375, 81920, var8);
                    this.method147(var9 - 1, -26375, 1024, var8);
                    this.method147(var9, -26375, 4096, var8 - 1);
                }
            }
        }
        int var10 = 69 / ((arg0 + 35) / 33);
        if (!arg6) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method147(var9, -26375, 536870912, var8);
                this.method147(var9, -26375, 33554432, var8 - 1);
            }
            if (arg4 == 1) {
                this.method147(var9, -26375, 8388608, var8);
                this.method147(var9 + 1, -26375, 134217728, var8);
            }
            if (arg4 == 2) {
                this.method147(var9, -26375, 33554432, var8);
                this.method147(var9, -26375, 536870912, var8 + 1);
            }
            if (arg4 == 3) {
                this.method147(var9, -26375, 134217728, var8);
                this.method147(var9 - 1, -26375, 8388608, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method147(var9, -26375, 4194304, var8);
                this.method147(var9 + 1, -26375, 67108864, var8 - 1);
            }
            if (arg4 == 1) {
                this.method147(var9, -26375, 16777216, var8);
                this.method147(var9 + 1, -26375, 268435456, var8 + 1);
            }
            if (arg4 == 2) {
                this.method147(var9, -26375, 67108864, var8);
                this.method147(var9 - 1, -26375, 4194304, var8 + 1);
            }
            if (arg4 == 3) {
                this.method147(var9, -26375, 268435456, var8);
                this.method147(var9 - 1, -26375, 16777216, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method147(var9, -26375, 545259520, var8);
            this.method147(var9, -26375, 33554432, var8 - 1);
            this.method147(var9 + 1, -26375, 134217728, var8);
        }
        if (arg4 == 1) {
            this.method147(var9, -26375, 41943040, var8);
            this.method147(var9 + 1, -26375, 134217728, var8);
            this.method147(var9, -26375, 536870912, var8 + 1);
        }
        if (arg4 == 2) {
            this.method147(var9, -26375, 167772160, var8);
            this.method147(var9, -26375, 536870912, var8 + 1);
            this.method147(var9 - 1, -26375, 8388608, var8);
        }
        if (arg4 == 3) {
            this.method147(var9, -26375, 671088640, var8);
            this.method147(var9 - 1, -26375, 8388608, var8);
            this.method147(var9, -26375, 33554432, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1063)
    private final boolean method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -1) {
            this.method147(-77, 102, -53, 115);
        }
        field265++;
        int var11 = arg2 + arg8;
        int var12 = arg3 + arg6;
        int var13 = arg4 + arg7;
        int var14 = arg1 + arg9;
        if (arg2 == var14 && (arg0 & 0x2) == 0) {
            int var15 = arg3 > arg4 ? arg3 : arg4;
            int var16 = var13 > var12 ? var12 : var13;
            while (var16 > var15) {
                if ((this.field266[var14 - this.field252 - 1][var15 - this.field268] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg0 & 0x8) == 0) {
            int var17 = arg3 <= arg4 ? arg4 : arg3;
            int var18 = var13 <= var12 ? var13 : var12;
            while (var17 < var18) {
                if ((this.field266[arg1 - this.field252][var17 - this.field268] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var13 && (arg0 & 0x1) == 0) {
            int var19 = arg2 > arg1 ? arg2 : arg1;
            int var20 = var14 <= var11 ? var14 : var11;
            while (var19 < var20) {
                if ((this.field266[var19 - this.field252][var13 - this.field268 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg0 & 0x4) == 0) {
            int var21 = var11 < var14 ? var11 : var14;
            for (int var22 = arg1 >= arg2 ? arg1 : arg2; var22 < var21; var22++) {
                if ((this.field266[var22 - this.field252][arg4 - this.field268] & 0x20) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)V", line = 1161)
    public final void method142(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field268;
        if (arg1 == 23407) {
            int var5 = arg0 - this.field252;
            this.field266[var5][var4] = class343.method2418(this.field266[var5][var4], -262145);
            field247++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 1176)
    public static final void method143(int arg0, int arg1) {
        field262++;
        if (class259.field4362 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class259.field4362 == 0) {
            class23.method150(arg0 ^ 0xFFFFFFE1);
        }
        if (arg1 == 40) {
            class27.method173((byte) -37);
        }
        if (arg1 != 40 && class353.field5609 != null) {
            class353.field5609.method916((byte) 70);
            class353.field5609 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class27.field323 = 1;
            class149.field2382 = 0;
            class204.field3227 = 1;
            class255.field4301 = 0;
            class27.field327 = 0;
            class179.method1406(16, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class133.method1022((byte) -48);
        }
        if (arg1 == 5) {
            class201.method1547(arg0 ^ 0xFFFFFFE1, class76.field1305);
        } else {
            class109.method835(-100);
        }
        boolean var3 = class259.field4362 == 5 || class259.field4362 == 10 || class259.field4362 == 28;
        if (var2 != var3) {
            if (var2) {
                class196.field3132 = class326.field5187;
                if (class235.field3899 == 0) {
                    class161.method1254(true, 2);
                } else {
                    class342.method2414(class326.field5187, 255, 2, arg0 + 28, false, class355.field5641, 0);
                }
                class241.field3991.method56(false, (byte) -85);
            } else {
                class161.method1254(true, 2);
                class241.field3991.method56(true, (byte) -85);
            }
        }
        if (class42.field607 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class42.method297();
        }
        class259.field4362 = arg1;
        if (arg0 != -29) {
            field251 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)Z", line = 1257)
    public final boolean method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 32213) {
            this.field248 = -74;
        }
        field260++;
        if (arg6 <= 1) {
            int var10 = arg1 + arg5 - 1;
            int var11 = arg0 + arg4 - 1;
            if (arg2 >= arg1 && var10 >= arg2 && arg4 <= arg8 && arg8 <= var11) {
                return true;
            } else if ((arg1 - 1) == arg2 && arg4 <= arg8 && arg8 <= var11 && (this.field266[arg2 - this.field252][arg8 - this.field268] & 0x8) == 0 && (arg7 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg2 && arg8 >= arg4 && arg8 <= var11 && (this.field266[arg2 - this.field252][arg8 - this.field268] & 0x80) == 0 && (arg7 & 0x2) == 0) {
                return true;
            } else if (arg4 - 1 == arg8 && arg1 <= arg2 && arg2 <= var10 && (this.field266[arg2 - this.field252][arg8 - this.field268] & 0x2) == 0 && (arg7 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg8 && arg2 >= arg1 && var10 >= arg2 && (this.field266[arg2 - this.field252][arg8 - this.field268] & 0x20) == 0 && (arg7 & 0x1) == 0;
            }
        } else if (class304.method2173(arg4, arg2, arg0, arg8, arg1, arg6, arg6, arg5, -13)) {
            return true;
        } else {
            return this.method141(arg7, arg1, arg2, arg8, arg4, -1, arg6, arg0, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)Z", line = 1298)
    public final boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field259++;
        if (arg7 == 1) {
            if (arg0 == arg3 && arg1 == arg5) {
                return true;
            }
        } else if (arg0 >= arg3 && arg0 <= arg7 + arg3 - 1 && arg1 >= arg1 && arg1 + arg7 - 1 >= arg1) {
            return true;
        }
        int var9 = arg0 - this.field252;
        if (arg4 != 0) {
            field251 = (class57) null;
        }
        int var10 = arg5 - this.field268;
        int var11 = arg3 - this.field252;
        int var12 = arg1 - this.field268;
        if (arg7 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field266[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field266[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field266[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field266[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field266[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field266[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field266[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field266[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field266[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field266[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field266[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field266[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg7 - 1;
            int var14 = arg7 + var10 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var9 + 1) == var11 && var10 <= var12 && var14 >= var12 && (this.field266[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 - arg7 == var10 && (this.field266[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - arg7 == var11 && var10 <= var12 && var12 <= var14 && (this.field266[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg7) == var10 && (this.field266[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - arg7) == var11 && var12 >= var10 && var12 <= var14 && (this.field266[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 + 1 == var10 && (this.field266[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field266[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field266[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10 && (this.field266[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var13 && (var12 - arg7) == var10 && (this.field266[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg7 == var11 && var12 >= var10 && var14 >= var12 && (this.field266[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12 && (this.field266[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIB)Z", line = 1487)
    public final boolean method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 <= 55) {
            return true;
        }
        field257++;
        if (arg2 == 1) {
            if (arg3 == arg6 && arg0 == arg5) {
                return true;
            }
        } else if (arg6 <= arg3 && arg3 <= arg2 + arg6 - 1 && arg0 >= arg0 && (arg0 + arg2 - 1) >= arg0) {
            return true;
        }
        int var9 = arg6 - this.field252;
        int var10 = arg5 - this.field268;
        int var11 = arg0 - this.field268;
        int var12 = arg3 - this.field252;
        if (arg2 == 1) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field266[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field266[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field266[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field266[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field266[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field266[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field266[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field266[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field266[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field266[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field266[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field266[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field266[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg2);
            int var14 = arg2 + var10 - 1;
            if (arg1 == 0) {
                if (arg4 == 0) {
                    if ((var12 - arg2) == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10 && (this.field266[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 - arg2) == var10 && (this.field266[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - arg2) == var9 && var11 >= var10 && var11 <= var14 && (this.field266[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field266[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field266[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg2 == var10 && (this.field266[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 <= var12 && var13 >= var12 && var11 - arg2 == var10) {
                        return true;
                    }
                    if (var12 - arg2 == var9 && var11 >= var10 && var14 >= var11 && (this.field266[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field266[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    if ((var12 - arg2) == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field266[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg2 == var10 && (this.field266[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg2) == var9 && var11 >= var10 && var14 >= var11 && (this.field266[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg2) == var10 && (this.field266[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg2 == var9 && var10 <= var11 && var14 >= var11 && (this.field266[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var11 + 1 == var10 && (this.field266[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var11 - arg2 == var10) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 - arg2) == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field266[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field266[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 - arg2) == var10) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var12 >= var9 && var13 >= var12 && var11 + 1 == var10 && (this.field266[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var9 && var12 <= var13 && (var11 - arg2) == var10 && (this.field266[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg2 == var9 && var11 >= var10 && var11 <= var14 && (this.field266[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field266[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V", line = 1870)
    private final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.field266[arg3][arg0] = class343.method2418(this.field266[arg3][arg0], ~arg2);
        if (arg1 != -26375) {
            method131((int[]) null, -111);
        }
        field270++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 1885)
    public static void method148(int arg0) {
        field251 = null;
        field249 = null;
        if (arg0 != -1) {
            method138((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V", line = 1895)
    public class22(int arg0, int arg1) {
        this.field248 = arg0;
        this.field252 = 0;
        this.field250 = arg1;
        this.field268 = 0;
        this.field266 = new int[this.field248][this.field250];
        this.method137(1);
    }
}
