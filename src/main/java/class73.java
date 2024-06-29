import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class73 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public int field799 = -1;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field797 = -1;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
    public boolean field803 = false;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field802 = 5;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field805 = -1;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public int field818 = 2;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public int field809 = -1;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public boolean field804 = false;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Z")
    public boolean field801 = false;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Z")
    public boolean field819 = false;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public int field823 = 99;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public int field825 = -1;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lpd;")
    public class645 field795;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Z")
    public static boolean field814;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[I")
    private int[] field794;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
    public int[] field806;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
    public int[] field815;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "[I")
    public int[] field816;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "[I")
    public int[] field817;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "[I")
    public int[] field822;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[Z")
    public boolean[] field807;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "[[I")
    public int[][] field820;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBIIILka;II)Lka;", line = 6)
    public final class231 method540(int arg0, byte arg1, int arg2, int arg3, int arg4, class231 arg5, int arg6, int arg7) {
        field800++;
        if (arg4 != 6372) {
            this.field797 = -92;
        }
        int var9 = this.field817[arg2];
        int var10 = this.field816[arg2];
        class146 var11 = this.field795.method3694(var10 >> 16, 3702);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method1584(arg1, arg6, true);
        }
        class146 var13 = null;
        if ((this.field804 || class738.field10171) && arg3 != -1 && this.field816.length > arg3) {
            int var14 = this.field816[arg3];
            var13 = this.field795.method3694(var14 >> 16, 3702);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field819) {
            arg6 |= 0x200;
        }
        if (var11.method971(var12, 0)) {
            arg6 |= 0x80;
        }
        if (var11.method974(15333, var12)) {
            arg6 |= 0x100;
        }
        if (var11.method972(var12, 0)) {
            arg6 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method971(arg3, arg4 - 6372)) {
                arg6 |= 0x80;
            }
            if (var13.method974(15333, arg3)) {
                arg6 |= 0x100;
            }
            if (var13.method972(arg3, arg4 - 6372)) {
                arg6 |= 0x400;
            }
        }
        int var15 = arg6 | 0x20;
        class231 var16 = arg5.method1584(arg1, var15, true);
        var16.method1538(arg0, var12, var9, arg3, -123, var11, arg7 - 1, var13, this.field819);
        return var16;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZIB)I", line = 77)
    public final int method541(int arg0, boolean arg1, int arg2, byte arg3) {
        field811++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field816[arg2];
        if (arg3 > -40) {
            this.method542(9, 22, 88, -81, null, -56);
        }
        class146 var8 = null;
        class146 var9 = this.field795.method3694(var7 >> 16, 3702);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field804 || class738.field10171) && arg0 != -1 && arg0 < this.field816.length) {
            int var11 = this.field816[arg0];
            var8 = this.field795.method3694(var11 >> 16, 3702);
            var6 = var11 & 0xFFFF;
        }
        if (this.field819) {
            var5 |= 0x200;
        }
        if (var9.method971(var10, 0)) {
            var5 |= 0x80;
        }
        if (var9.method974(15333, var10)) {
            var5 |= 0x100;
        }
        if (var9.method972(var10, 0)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method971(var6, 0)) {
                var5 |= 0x80;
            }
            if (var8.method974(15333, var6)) {
                var5 |= 0x100;
            }
            if (var8.method972(var6, 0)) {
                var5 |= 0x400;
            }
        }
        if (this.field794 != null && arg1) {
            if (arg2 < this.field794.length) {
                int var12 = this.field794[arg2];
                if (var12 != 65535) {
                    class146 var13 = this.field795.method3694(var12 >> 16, 3702);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method971(var14, 0)) {
                            var5 |= 0x80;
                        }
                        if (var13.method974(15333, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method972(var14, 0)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field804 || class738.field10171) && arg0 != -1 && this.field794.length > arg0) {
                int var15 = this.field794[arg0];
                if (var15 != 65535) {
                    class146 var16 = this.field795.method3694(var15 >> 16, 3702);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method971(var17, 0)) {
                            var5 |= 0x80;
                        }
                        if (var16.method974(15333, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method972(var17, 0)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILka;I)Lka;", line = 209)
    public final class231 method542(int arg0, int arg1, int arg2, int arg3, class231 arg4, int arg5) {
        field812++;
        int var7 = this.field817[arg2];
        int var8 = this.field816[arg2];
        class146 var9 = this.field795.method3694(var8 >> 16, 3702);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method1584((byte) 1, arg3, true);
        }
        class146 var11 = null;
        if ((this.field804 || class738.field10171) && arg0 != -1 && this.field816.length > arg0) {
            int var12 = this.field816[arg0];
            var11 = this.field795.method3694(var12 >> 16, 3702);
            arg0 = var12 & 0xFFFF;
        }
        class146 var13 = null;
        class146 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field794 != null) {
            if (arg2 < this.field794.length) {
                var15 = this.field794[arg2];
                if (var15 != 65535) {
                    var13 = this.field795.method3694(var15 >> 16, 3702);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field804 || class738.field10171) && arg0 != -1 && arg0 < this.field794.length) {
                var16 = this.field794[arg0];
                if (var16 != 65535) {
                    var14 = this.field795.method3694(var16 >> 16, 3702);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field819) {
            arg3 |= 0x200;
        }
        if (var9.method971(var10, 0)) {
            arg3 |= 0x80;
        }
        if (var9.method974(15333, var10)) {
            arg3 |= 0x100;
        }
        if (var9.method972(var10, 0)) {
            arg3 |= 0x400;
        }
        int var17 = -63 % ((arg5 - 72) / 39);
        if (var13 != null) {
            if (var13.method971(var15, 0)) {
                arg3 |= 0x80;
            }
            if (var13.method974(15333, var15)) {
                arg3 |= 0x100;
            }
            if (var13.method972(var15, 0)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method971(arg0, 0)) {
                arg3 |= 0x80;
            }
            if (var11.method974(15333, arg0)) {
                arg3 |= 0x100;
            }
            if (var11.method972(arg0, 0)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method971(var16, 0)) {
                arg3 |= 0x80;
            }
            if (var14.method974(15333, var16)) {
                arg3 |= 0x100;
            }
            if (var14.method972(var16, 0)) {
                arg3 |= 0x400;
            }
        }
        int var18 = arg3 | 0x20;
        class231 var19 = arg4.method1584((byte) 1, var18, true);
        var19.method1538(0, var10, var7, arg0, -106, var9, arg1 - 1, var11, this.field819);
        if (var13 != null) {
            var19.method1538(0, var15, var7, var16, -124, var13, arg1 - 1, var14, this.field819);
        }
        return var19;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILgga;I)V", line = 350)
    private final void method543(int arg0, class511 arg1, int arg2) {
        if (arg2 == 1) {
            int var16 = arg1.method3002(-1);
            this.field817 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field817[var17] = arg1.method3002(-1);
            }
            this.field816 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field816[var18] = arg1.method3002(-1);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field816[var19] = (arg1.method3002(arg0 + 14) << 16) + this.field816[var19];
            }
        } else if (arg2 == 2) {
            this.field805 = arg1.method3002(-1);
        } else if (arg2 == 3) {
            this.field807 = new boolean[256];
            int var14 = arg1.method3013(arg0 ^ 0xFFFFFFD7);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field807[arg1.method3013(class475.method2835(arg0, 115))] = true;
            }
        } else if (arg2 == 5) {
            this.field802 = arg1.method3013(arg0 ^ 0x77);
        } else if (arg2 == 6) {
            this.field797 = arg1.method3002(-1);
        } else if (arg2 == 7) {
            this.field799 = arg1.method3002(-1);
        } else if (arg2 == 8) {
            this.field823 = arg1.method3013(97);
        } else if (arg2 == 9) {
            this.field809 = arg1.method3013(-112);
        } else if (arg2 == 10) {
            this.field825 = arg1.method3013(48);
        } else if (arg2 == 11) {
            this.field818 = arg1.method3013(-4);
        } else if (arg2 == 12) {
            int var11 = arg1.method3013(-96);
            this.field794 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field794[var12] = arg1.method3002(arg0 + 14);
            }
            for (int var13 = 0; var13 < var11; var13++) {
                this.field794[var13] = (arg1.method3002(-1) << 16) + this.field794[var13];
            }
        } else if (arg2 == 13) {
            int var4 = arg1.method3002(-1);
            this.field820 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method3013(arg0 + 105);
                if (var6 > 0) {
                    this.field820[var5] = new int[var6];
                    this.field820[var5][0] = arg1.method2983(true);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field820[var5][var7] = arg1.method3002(arg0 + 14);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field819 = true;
        } else if (arg2 == 15) {
            this.field804 = true;
        } else if (arg2 == 16) {
            this.field801 = true;
        } else if (arg2 == 18) {
            this.field803 = true;
        } else if (arg2 == 19) {
            if (this.field822 == null) {
                this.field822 = new int[this.field820.length];
                for (int var8 = 0; var8 < this.field820.length; var8++) {
                    this.field822[var8] = 255;
                }
            }
            this.field822[arg1.method3013(-118)] = arg1.method3013(-113);
        } else if (arg2 == 20) {
            if (this.field815 == null || this.field806 == null) {
                this.field815 = new int[this.field820.length];
                this.field806 = new int[this.field820.length];
                for (int var9 = 0; var9 < this.field820.length; var9++) {
                    this.field815[var9] = 256;
                    this.field806[var9] = 256;
                }
            }
            int var10 = arg1.method3013(arg0 ^ 0x61);
            this.field815[var10] = arg1.method3002(-1);
            this.field806[var10] = arg1.method3002(-1);
        }
        if (arg0 == -15) {
            field813++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lgga;B)V", line = 555)
    public final void method544(class511 arg0, byte arg1) {
        field808++;
        while (true) {
            int var3 = arg0.method3013(8);
            if (var3 == 0) {
                if (arg1 == 26) {
                    return;
                } else {
                    this.field823 = 13;
                    return;
                }
            }
            this.method543(arg1 - 41, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 593)
    public final void method545(int arg0) {
        if (this.field809 == -1) {
            if (this.field807 == null) {
                this.field809 = 0;
            } else {
                this.field809 = 2;
            }
        }
        if (arg0 <= 81) {
            method546((byte) 21);
        }
        if (this.field825 == -1) {
            if (this.field807 == null) {
                this.field825 = 0;
            } else {
                this.field825 = 2;
            }
        }
        field796++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 633)
    public static final void method546(byte arg0) {
        field798++;
        if (class688.field9602.field8532.method4280((byte) -98) != 2 || arg0 >= -87) {
            return;
        }
        byte var1 = (byte) (class137.field1758 - 4 & 0xFF);
        int var2 = class137.field1758 % class741.field10208;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class525.field7224; var18++) {
                class244.field3608[var3][var2][var18] = var1;
            }
        }
        if (class435.field6040 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class213.field2953[var4] = -1000000;
            class33.field319[var4] = 1000000;
            class473.field6554[var4] = 0;
            class631.field8828[var4] = 1000000;
            class679.field9491[var4] = 0;
        }
        int var5 = class724.field10031.field3470;
        int var6 = class724.field10031.field3460;
        if (class695.field9691 != 1 && class5.field30 == -1) {
            int var7 = class373.method2316(class497.field6818, class435.field6040, class412.field5779, -100);
            if ((var7 - class479.field6645) < 3200 && (class533.field7338[class435.field6040][class497.field6818 >> 9][class412.field5779 >> 9] & 0x4) != 0) {
                class4.method10(class59.field688, 5439488, 1, class412.field5779 >> 9, class497.field6818 >> 9, false);
                return;
            }
            return;
        }
        if (class695.field9691 != 1) {
            var6 = class362.field5225;
            var5 = class5.field30;
        }
        if ((class533.field7338[class435.field6040][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class4.method10(class59.field688, 5439488, 0, var6 >> 9, var5 >> 9, false);
        }
        if (class472.field6537 >= 2560) {
            return;
        }
        int var8 = class497.field6818 >> 9;
        int var9 = class412.field5779 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var9 < var11) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || -class741.field10208 >= var12 || class741.field10208 <= var12 || -class525.field7224 >= var13 || class525.field7224 <= var13) {
            class502.method2937(null, (byte) 46, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class444.field6151 + "," + class236.field3535);
            return;
        }
        if (var13 < var12) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class533.field7338[class435.field6040][var8][var9] & 0x4) != 0) {
                    class4.method10(class59.field688, 5439488, 1, var9, var8, false);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    var15 -= 65536;
                    if ((class533.field7338[class435.field6040][var8][var9] & 0x4) != 0) {
                        class4.method10(class59.field688, 5439488, 1, var9, var8, false);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var11 > var9) {
                var9++;
            } else if (var11 < var9) {
                var9--;
            }
            if ((class533.field7338[class435.field6040][var8][var9] & 0x4) != 0) {
                class4.method10(class59.field688, 5439488, 1, var9, var8, false);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class533.field7338[class435.field6040][var8][var9] & 0x4) != 0) {
                    class4.method10(class59.field688, 5439488, 1, var9, var8, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I", line = 838)
    public static final int method547(int arg0, int arg1, int arg2) {
        field821++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 > -95) {
                field814 = false;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V", line = 878)
    public static final void method548(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field810++;
        class17 var5 = class245.method1634(1, (long) arg2, 4);
        int var6 = 100 % ((arg1 + 64) / 49);
        var5.method66((byte) -102);
        var5.field104 = arg3;
        var5.field107 = arg0;
        var5.field105 = arg4;
    }
}
