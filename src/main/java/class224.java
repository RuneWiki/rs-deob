import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class224 {

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
    public boolean field3292 = false;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public int field3301 = 2;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public int field3303 = 0;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public int field3290 = -1;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
    public int field3304 = -1;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public int field3299 = -1;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public int field3306 = 99;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "Z")
    public boolean field3309 = false;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public int field3293 = -1;

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "Z")
    public boolean field3311 = false;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    public int field3308 = 5;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public int field3294 = -1;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "[C")
    private static char[] field3315;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "S")
    public static short field3317;

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "Lqu;")
    public static class364 field3316;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!aba", name = "x", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lkca;")
    public class601 field3298;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "[I")
    public int[] field3296;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "[I")
    public int[] field3307;

    @OriginalMember(owner = "client!aba", name = "y", descriptor = "[I")
    private int[] field3314;

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "[S")
    public static short[] field3318;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "[Z")
    public boolean[] field3297;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "[[I")
    public int[][] field3305;

    static {
        new class487("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field3315 = new char[64];
        for (int var0 = 0; var0 < 26; var0++) {
            field3315[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3315[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3315[var2] = (char) (var2 + 48 - 52);
        }
        field3315[62] = '+';
        field3315[63] = '/';
        field3317 = 205;
        field3316 = new class364(61, 3);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILps;I)V", line = 6)
    private final void method1469(int arg0, class428 arg1, int arg2) {
        field3302++;
        if (arg2 == 1) {
            int var4 = arg1.method2620(97);
            this.field3307 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3307[var5] = arg1.method2620(78);
            }
            this.field3296 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3296[var6] = arg1.method2620(77);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3296[var7] = (arg1.method2620(32) << 16) + this.field3296[var7];
            }
        } else if (arg2 == 2) {
            this.field3290 = arg1.method2620(74);
        } else if (arg2 == 3) {
            this.field3297 = new boolean[256];
            int var8 = arg1.method2561((byte) -86);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3297[arg1.method2561((byte) -90)] = true;
            }
        } else if (arg2 == 5) {
            this.field3308 = arg1.method2561((byte) -36);
        } else if (arg2 == 6) {
            this.field3293 = arg1.method2620(28);
        } else if (arg2 == 7) {
            this.field3294 = arg1.method2620(45);
        } else if (arg2 == 8) {
            this.field3306 = arg1.method2561((byte) 118);
        } else if (arg2 == 9) {
            this.field3299 = arg1.method2561((byte) -106);
        } else if (arg2 == 10) {
            this.field3304 = arg1.method2561((byte) -104);
        } else if (arg2 == 11) {
            this.field3301 = arg1.method2561((byte) -50);
        } else if (arg2 == 12) {
            int var14 = arg1.method2561((byte) -59);
            this.field3314 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3314[var15] = arg1.method2620(30);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field3314[var16] += arg1.method2620(127) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method2620(50);
            this.field3305 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method2561((byte) -59);
                if (var12 > 0) {
                    this.field3305[var11] = new int[var12];
                    this.field3305[var11][0] = arg1.method2601(87);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field3305[var11][var13] = arg1.method2620(86);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3311 = true;
        } else if (arg2 == 15) {
            this.field3309 = true;
        } else if (arg2 == 16) {
            this.field3292 = true;
        } else if (arg2 == 17) {
            this.field3303 = arg1.method2561((byte) -109);
        }
        int var17 = -41 % ((arg0 - 66) / 46);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BILr;IBIII)Lr;", line = 174)
    public final class520 method1470(byte arg0, int arg1, class520 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3300++;
        int var9 = this.field3307[arg7];
        int var10 = this.field3296[arg7];
        class433 var11 = this.field3298.method3500(var10 >> 16, -95);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method369(arg4, arg3, true);
        }
        class433 var13 = null;
        if ((this.field3309 || class516.field7637) && arg5 != -1 && this.field3296.length > arg5) {
            int var14 = this.field3296[arg5];
            var13 = this.field3298.method3500(var14 >> 16, -89);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field3311) {
            arg3 |= 0x200;
        }
        if (var11.method2646(true, var12)) {
            arg3 |= 0x80;
        }
        if (var11.method2644((byte) 126, var12)) {
            arg3 |= 0x100;
        }
        if (arg0 > -32) {
            return null;
        }
        if (var11.method2643(var12, -239)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2646(true, arg5)) {
                arg3 |= 0x80;
            }
            if (var13.method2644((byte) 125, arg5)) {
                arg3 |= 0x100;
            }
            if (var13.method2643(arg5, -239)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | 0x20;
        class520 var16 = arg2.method369(arg4, var15, true);
        var16.method3084(var11, 107, this.field3311, var12, arg6, var13, var9, arg1 - 1, arg5);
        return var16;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIILr;Z)Lr;", line = 237)
    public final class520 method1471(int arg0, int arg1, int arg2, int arg3, class520 arg4, boolean arg5) {
        field3291++;
        int var7 = this.field3307[arg3];
        int var8 = this.field3296[arg3];
        class433 var9 = this.field3298.method3500(var8 >> 16, -91);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method369((byte) 1, arg0, true);
        }
        class433 var11 = null;
        if ((this.field3309 || class516.field7637) && arg1 != -1 && this.field3296.length > arg1) {
            int var12 = this.field3296[arg1];
            var11 = this.field3298.method3500(var12 >> 16, -81);
            arg1 = var12 & 0xFFFF;
        }
        class433 var13 = null;
        class433 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3314 != null) {
            if (this.field3314.length > arg3) {
                var15 = this.field3314[arg3];
                if (var15 != 65535) {
                    var13 = this.field3298.method3500(var15 >> 16, -121);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3309 || class516.field7637) && arg1 != -1 && arg1 < this.field3314.length) {
                var16 = this.field3314[arg1];
                if (var16 != 65535) {
                    var14 = this.field3298.method3500(var16 >> 16, -120);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3311) {
            arg0 |= 0x200;
        }
        if (var9.method2646(arg5, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method2644((byte) 3, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method2643(var10, -239)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2646(true, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method2644((byte) -126, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method2643(var15, -239)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2646(true, arg1)) {
                arg0 |= 0x80;
            }
            if (var11.method2644((byte) 126, arg1)) {
                arg0 |= 0x100;
            }
            if (var11.method2643(arg1, -239)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2646(true, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method2644((byte) 127, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method2643(var16, -239)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class520 var18 = arg4.method369((byte) 1, var17, true);
        var18.method3084(var9, -114, this.field3311, var10, 0, var11, var7, arg2 - 1, arg1);
        if (var13 != null) {
            var18.method3084(var13, 117, this.field3311, var15, 0, var14, var7, arg2 - 1, var16);
        }
        return var18;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 364)
    public final void method1472(int arg0) {
        if (this.field3299 == -1) {
            if (this.field3297 == null) {
                this.field3299 = 0;
            } else {
                this.field3299 = 2;
            }
        }
        field3295++;
        if (this.field3304 != arg0) {
            return;
        }
        if (this.field3297 == null) {
            this.field3304 = 0;
        } else {
            this.field3304 = 2;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V", line = 412)
    public static void method1473(int arg0) {
        field3316 = null;
        field3315 = null;
        int var1 = -43 / ((arg0 + 40) / 56);
        field3318 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLps;)V", line = 439)
    public final void method1474(byte arg0, class428 arg1) {
        if (arg0 != -68) {
            field3315 = null;
        }
        while (true) {
            int var3 = arg1.method2561((byte) -78);
            if (var3 == 0) {
                field3310++;
                return;
            }
            this.method1469(arg0 + 183, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BZII)I", line = 460)
    public final int method1475(byte arg0, boolean arg1, int arg2, int arg3) {
        field3313++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3296[arg2];
        class433 var8 = null;
        class433 var9 = this.field3298.method3500(var7 >> 16, -82);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3309 || class516.field7637) && arg3 != -1 && arg3 < this.field3296.length) {
            int var11 = this.field3296[arg3];
            var8 = this.field3298.method3500(var11 >> 16, -121);
            var6 = var11 & 0xFFFF;
        }
        if (this.field3311) {
            var5 |= 0x200;
        }
        if (var9.method2646(true, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2644((byte) 127, var10)) {
            var5 |= 0x100;
        }
        if (var9.method2643(var10, -239)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2646(true, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2644((byte) 127, var6)) {
                var5 |= 0x100;
            }
            if (var8.method2643(var6, -239)) {
                var5 |= 0x400;
            }
        }
        int var12 = 28 % ((-arg0 - 35) / 50);
        if (this.field3314 != null && arg1) {
            if (this.field3314.length > arg2) {
                int var13 = this.field3314[arg2];
                if (var13 != 65535) {
                    class433 var14 = this.field3298.method3500(var13 >> 16, -74);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method2646(true, var15)) {
                            var5 |= 0x80;
                        }
                        if (var14.method2644((byte) 126, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method2643(var15, -239)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3309 || class516.field7637) && arg3 != -1 && arg3 < this.field3314.length) {
                int var16 = this.field3314[arg3];
                if (var16 != 65535) {
                    class433 var17 = this.field3298.method3500(var16 >> 16, -95);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method2646(true, var18)) {
                            var5 |= 0x80;
                        }
                        if (var17.method2644((byte) 125, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method2643(var18, -239)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
