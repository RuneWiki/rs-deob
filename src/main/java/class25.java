import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class25 {

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public int field257 = -1;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public int field250 = 2;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public int field263 = -1;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "Z")
    public boolean field259 = false;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
    public int field261 = -1;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public int field262 = 99;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public int field270 = -1;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    public int field272 = 5;

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public int field265 = -1;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "Z")
    public boolean field273 = false;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Z")
    public boolean field251 = false;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "Z")
    public boolean field271 = false;

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "[I")
    public static int[] field268 = new int[1];

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Lne;")
    public class317 field254;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "[I")
    private int[] field252;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "[I")
    public int[] field253;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "[I")
    public int[] field255;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "[I")
    public int[] field256;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "[I")
    public int[] field264;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "[I")
    public int[] field274;

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "[Z")
    public boolean[] field267;

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "[[I")
    public int[][] field266;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lig;I)V", line = 3)
    public final void method121(class244 arg0, int arg1) {
        if (arg1 != -1) {
            this.field270 = -101;
        }
        while (true) {
            int var3 = arg0.method1423(-37);
            if (var3 == 0) {
                field258++;
                return;
            }
            this.method126(arg0, var3, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V", line = 28)
    public static void method122(byte arg0) {
        field268 = null;
        if (arg0 <= 78) {
            field268 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BIBIILka;II)Lka;", line = 38)
    public final class470 method123(byte arg0, int arg1, byte arg2, int arg3, int arg4, class470 arg5, int arg6, int arg7) {
        field269++;
        int var9 = this.field253[arg7];
        int var10 = this.field256[arg7];
        class66 var11 = this.field254.method1903((byte) 108, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method237(arg2, arg3, true);
        }
        class66 var13 = null;
        if ((this.field251 || class16.field153) && arg6 != -1 && this.field256.length > arg6) {
            int var14 = this.field256[arg6];
            var13 = this.field254.method1903((byte) -57, var14 >> 16);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field259) {
            arg3 |= 0x200;
        }
        if (var11.method494(0, var12)) {
            arg3 |= 0x80;
        }
        if (var11.method492(var12, false)) {
            arg3 |= 0x100;
        }
        if (var11.method489(var12, 1)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method494(0, arg6)) {
                arg3 |= 0x80;
            }
            if (var13.method492(arg6, false)) {
                arg3 |= 0x100;
            }
            if (var13.method489(arg6, 1)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | 0x20;
        class470 var16 = arg5.method237(arg2, var15, true);
        if (arg0 != 74) {
            this.field261 = 40;
        }
        var16.method2838(this.field259, arg6, var12, var13, var9, var11, -3369, arg1 - 1, arg4);
        return var16;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 108)
    public final void method124(int arg0) {
        field260++;
        if (this.field261 == -1) {
            if (this.field267 == null) {
                this.field261 = 0;
            } else {
                this.field261 = 2;
            }
        }
        if (this.field270 == -1) {
            if (this.field267 == null) {
                this.field270 = 0;
            } else {
                this.field270 = 2;
            }
        }
        if (arg0 <= 67) {
            this.field263 = -96;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIII)I", line = 151)
    public final int method125(boolean arg0, int arg1, int arg2, int arg3) {
        field247++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field256[arg1];
        class66 var8 = null;
        class66 var9 = this.field254.method1903((byte) 117, var7 >> 16);
        int var10 = var7 & arg2;
        if (var9 == null) {
            return var5;
        }
        if ((this.field251 || class16.field153) && arg3 != -1 && this.field256.length > arg3) {
            int var11 = this.field256[arg3];
            var8 = this.field254.method1903((byte) 47, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field259) {
            var5 |= 0x200;
        }
        if (var9.method494(0, var10)) {
            var5 |= 0x80;
        }
        if (var9.method492(var10, false)) {
            var5 |= 0x100;
        }
        if (var9.method489(var10, arg2 ^ 0xFFFE)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method494(0, var6)) {
                var5 |= 0x80;
            }
            if (var8.method492(var6, false)) {
                var5 |= 0x100;
            }
            if (var8.method489(var6, arg2 - 65534)) {
                var5 |= 0x400;
            }
        }
        if (this.field252 != null && arg0) {
            if (this.field252.length > arg1) {
                int var12 = this.field252[arg1];
                if (var12 != 65535) {
                    class66 var13 = this.field254.method1903((byte) 46, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method494(arg2 ^ 0xFFFF, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method492(var14, false)) {
                            var5 |= 0x100;
                        }
                        if (var13.method489(var14, arg2 - 65534)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field251 || class16.field153) && arg3 != -1 && this.field252.length > arg3) {
                int var15 = this.field252[arg3];
                if (var15 != 65535) {
                    class66 var16 = this.field254.method1903((byte) -99, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method494(0, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method492(var17, false)) {
                            var5 |= 0x100;
                        }
                        if (var16.method489(var17, 1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lig;IB)V", line = 279)
    private final void method126(class244 arg0, int arg1, byte arg2) {
        if (arg2 < 13) {
            this.field257 = 70;
        }
        if (arg1 == 1) {
            int var4 = arg0.method1476(-113);
            this.field253 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field253[var5] = arg0.method1476(-69);
            }
            this.field256 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field256[var6] = arg0.method1476(-128);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field256[var7] += arg0.method1476(76) << 16;
            }
        } else if (arg1 == 2) {
            this.field263 = arg0.method1476(82);
        } else if (arg1 == 3) {
            this.field267 = new boolean[256];
            int var8 = arg0.method1423(-94);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field267[arg0.method1423(-97)] = true;
            }
        } else if (arg1 == 5) {
            this.field272 = arg0.method1423(-95);
        } else if (arg1 == 6) {
            this.field257 = arg0.method1476(28);
        } else if (arg1 == 7) {
            this.field265 = arg0.method1476(-110);
        } else if (arg1 == 8) {
            this.field262 = arg0.method1423(-71);
        } else if (arg1 == 9) {
            this.field270 = arg0.method1423(-59);
        } else if (arg1 == 10) {
            this.field261 = arg0.method1423(-9);
        } else if (arg1 == 11) {
            this.field250 = arg0.method1423(-14);
        } else if (arg1 == 12) {
            int var17 = arg0.method1423(-38);
            this.field252 = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                this.field252[var18] = arg0.method1476(-122);
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field252[var19] += arg0.method1476(38) << 16;
            }
        } else if (arg1 == 13) {
            int var13 = arg0.method1476(57);
            this.field266 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg0.method1423(-28);
                if (var15 > 0) {
                    this.field266[var14] = new int[var15];
                    this.field266[var14][0] = arg0.method1458((byte) -115);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field266[var14][var16] = arg0.method1476(33);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field259 = true;
        } else if (arg1 == 15) {
            this.field251 = true;
        } else if (arg1 == 16) {
            this.field273 = true;
        } else if (arg1 == 18) {
            this.field271 = true;
        } else if (arg1 == 19) {
            if (this.field274 == null) {
                this.field274 = new int[this.field266.length];
                for (int var12 = 0; var12 < this.field266.length; var12++) {
                    this.field274[var12] = 255;
                }
            }
            this.field274[arg0.method1423(-37)] = arg0.method1423(-25);
        } else if (arg1 == 20) {
            if (this.field264 == null || this.field255 == null) {
                this.field264 = new int[this.field266.length];
                this.field255 = new int[this.field266.length];
                for (int var10 = 0; var10 < this.field266.length; var10++) {
                    this.field264[var10] = 256;
                    this.field255[var10] = 256;
                }
            }
            int var11 = arg0.method1423(-49);
            this.field264[var11] = arg0.method1476(98);
            this.field255[var11] = arg0.method1476(-101);
        }
        field249++;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILka;ZII)Lka;", line = 498)
    public final class470 method127(int arg0, int arg1, class470 arg2, boolean arg3, int arg4, int arg5) {
        field246++;
        int var7 = this.field253[arg4];
        int var8 = this.field256[arg4];
        class66 var9 = this.field254.method1903((byte) -69, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method237((byte) 1, arg5, true);
        }
        class66 var11 = null;
        if ((this.field251 || class16.field153) && arg1 != -1 && arg1 < this.field256.length) {
            int var12 = this.field256[arg1];
            var11 = this.field254.method1903((byte) -65, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class66 var13 = null;
        class66 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field252 != null) {
            if (arg4 < this.field252.length) {
                var15 = this.field252[arg4];
                if (var15 != 65535) {
                    var13 = this.field254.method1903((byte) -122, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field251 || class16.field153) && arg1 != -1 && this.field252.length > arg1) {
                var16 = this.field252[arg1];
                if (var16 != 65535) {
                    var14 = this.field254.method1903((byte) 59, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field259) {
            arg5 |= 0x200;
        }
        if (var9.method494(0, var10)) {
            arg5 |= 0x80;
        }
        if (var9.method492(var10, arg3)) {
            arg5 |= 0x100;
        }
        if (var9.method489(var10, 1)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method494(0, var15)) {
                arg5 |= 0x80;
            }
            if (var13.method492(var15, arg3)) {
                arg5 |= 0x100;
            }
            if (var13.method489(var15, 1)) {
                arg5 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method494(0, arg1)) {
                arg5 |= 0x80;
            }
            if (var11.method492(arg1, arg3)) {
                arg5 |= 0x100;
            }
            if (var11.method489(arg1, 1)) {
                arg5 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method494(0, var16)) {
                arg5 |= 0x80;
            }
            if (var14.method492(var16, false)) {
                arg5 |= 0x100;
            }
            if (var14.method489(var16, 1)) {
                arg5 |= 0x400;
            }
        }
        int var17 = arg5 | 0x20;
        class470 var18 = arg2.method237((byte) 1, var17, true);
        var18.method2838(this.field259, arg1, var10, var11, var7, var9, -3369, arg0 - 1, 0);
        if (var13 != null) {
            var18.method2838(this.field259, var16, var15, var14, var7, var13, -3369, arg0 - 1, 0);
        }
        return var18;
    }
}
