import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    public boolean field452 = false;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field448 = -1;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public int field466 = -1;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field460 = 99;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "Z")
    public boolean field468 = false;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public int field462 = 5;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Z")
    public boolean field459 = false;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field465 = -1;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Z")
    public boolean field454 = false;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field461 = 2;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field463 = -1;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public int field475 = -1;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Z")
    public static boolean field458 = false;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "Lln;")
    public class344 field472;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[I")
    public int[] field450;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[I")
    public int[] field456;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[I")
    private int[] field457;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "[Z")
    public boolean[] field455;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "[[I")
    public int[][] field471;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIILda;B)Lda;", line = 5)
    public final class55 method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class55 arg6, byte arg7) {
        field451++;
        int var9 = this.field450[arg2];
        int var10 = this.field456[arg2];
        if (arg0 != 0) {
            return null;
        }
        class98 var11 = this.field472.method2135(-104, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method532(arg7, arg1, true);
        }
        class98 var13 = null;
        if ((this.field452 || class498.field7060) && arg5 != -1 && this.field456.length > arg5) {
            int var14 = this.field456[arg5];
            var13 = this.field472.method2135(-127, var14 >> 16);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field468) {
            arg1 |= 0x200;
        }
        if (var11.method800(25595, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method798(var12, (byte) 3)) {
            arg1 |= 0x100;
        }
        if (var11.method805(true, var12)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method800(25595, arg5)) {
                arg1 |= 0x80;
            }
            if (var13.method798(arg5, (byte) 3)) {
                arg1 |= 0x100;
            }
            if (var13.method805(true, arg5)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class55 var16 = arg6.method532(arg7, var15, true);
        var16.method595(arg3 - 1, var9, var13, -106, arg4, this.field468, var12, arg5, var11);
        return var16;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z", line = 80)
    public static final boolean method343(int arg0, int arg1, int arg2) {
        field464++;
        if ((class334.method2106(98, arg0, arg1) | (arg1 & 0x10000) != 0) || class612.method3418((byte) -127, arg1, arg0)) {
            return true;
        } else {
            if (arg2 < 10) {
                field458 = true;
            }
            return (arg0 & 0x37) == 0 && class352.method2161(arg1, true, arg0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIII)I", line = 121)
    public final int method344(boolean arg0, int arg1, int arg2, int arg3) {
        field449++;
        int var5 = 0;
        if (arg2 >= -15) {
            return 74;
        }
        int var6 = 0;
        int var7 = this.field456[arg3];
        class98 var8 = null;
        class98 var9 = this.field472.method2135(-117, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field452 || class498.field7060) && arg1 != -1 && this.field456.length > arg1) {
            int var11 = this.field456[arg1];
            var8 = this.field472.method2135(-100, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field468) {
            var5 |= 0x200;
        }
        if (var9.method800(25595, var10)) {
            var5 |= 0x80;
        }
        if (var9.method798(var10, (byte) 3)) {
            var5 |= 0x100;
        }
        if (var9.method805(true, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method800(25595, var6)) {
                var5 |= 0x80;
            }
            if (var8.method798(var6, (byte) 3)) {
                var5 |= 0x100;
            }
            if (var8.method805(true, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field457 != null && arg0) {
            if (arg3 < this.field457.length) {
                int var12 = this.field457[arg3];
                if (var12 != 65535) {
                    class98 var13 = this.field472.method2135(-45, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method800(25595, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method798(var14, (byte) 3)) {
                            var5 |= 0x100;
                        }
                        if (var13.method805(true, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field452 || class498.field7060) && arg1 != -1 && arg1 < this.field457.length) {
                int var15 = this.field457[arg1];
                if (var15 != 65535) {
                    class98 var16 = this.field472.method2135(-56, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method800(25595, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method798(var17, (byte) 3)) {
                            var5 |= 0x100;
                        }
                        if (var16.method805(true, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z", line = 244)
    public static final boolean method345(int arg0, int arg1, byte arg2) {
        field453++;
        if (arg2 == -21) {
            return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILmo;)V", line = 258)
    private final void method346(int arg0, int arg1, class695 arg2) {
        if (arg0 != 4355) {
            method345(91, 53, (byte) 78);
        }
        field473++;
        if (arg1 == 1) {
            int var4 = arg2.method3847((byte) 118);
            this.field450 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field450[var5] = arg2.method3847((byte) 118);
            }
            this.field456 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field456[var6] = arg2.method3847((byte) 118);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field456[var7] = (arg2.method3847((byte) 118) << 16) + this.field456[var7];
            }
        } else if (arg1 == 2) {
            this.field466 = arg2.method3847((byte) 118);
        } else if (arg1 == 3) {
            this.field455 = new boolean[256];
            int var8 = arg2.method3826(false);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field455[arg2.method3826(false)] = true;
            }
        } else if (arg1 == 5) {
            this.field462 = arg2.method3826(false);
        } else if (arg1 == 6) {
            this.field463 = arg2.method3847((byte) 118);
        } else if (arg1 == 7) {
            this.field475 = arg2.method3847((byte) 118);
        } else if (arg1 == 8) {
            this.field460 = arg2.method3826(false);
        } else if (arg1 == 9) {
            this.field465 = arg2.method3826(false);
        } else if (arg1 == 10) {
            this.field448 = arg2.method3826(false);
        } else if (arg1 == 11) {
            this.field461 = arg2.method3826(false);
        } else if (arg1 == 12) {
            int var10 = arg2.method3826(false);
            this.field457 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field457[var11] = arg2.method3847((byte) 118);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field457[var12] = (arg2.method3847((byte) 118) << 16) + this.field457[var12];
            }
        } else if (arg1 == 13) {
            int var13 = arg2.method3847((byte) 118);
            this.field471 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method3826(false);
                if (var15 > 0) {
                    this.field471[var14] = new int[var15];
                    this.field471[var14][0] = arg2.method3873(255);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field471[var14][var16] = arg2.method3847((byte) 118);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field468 = true;
        } else if (arg1 == 15) {
            this.field452 = true;
        } else if (arg1 == 16) {
            this.field459 = true;
        } else if (arg1 == 18) {
            this.field454 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILda;IIZ)Lda;", line = 416)
    public final class55 method347(int arg0, int arg1, class55 arg2, int arg3, int arg4, boolean arg5) {
        field474++;
        int var7 = this.field450[arg4];
        int var8 = this.field456[arg4];
        class98 var9 = this.field472.method2135(-75, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method532((byte) 1, arg3, true);
        }
        class98 var11 = null;
        if ((this.field452 || class498.field7060) && arg1 != -1 && arg1 < this.field456.length) {
            int var12 = this.field456[arg1];
            var11 = this.field472.method2135(-104, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class98 var13 = null;
        class98 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field457 != null) {
            if (this.field457.length > arg4) {
                var15 = this.field457[arg4];
                if (var15 != 65535) {
                    var13 = this.field472.method2135(-106, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field452 || class498.field7060) && arg1 != -1 && arg1 < this.field457.length) {
                var16 = this.field457[arg1];
                if (var16 != 65535) {
                    var14 = this.field472.method2135(-63, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field468) {
            arg3 |= 0x200;
        }
        if (var9.method800(25595, var10)) {
            arg3 |= 0x80;
        }
        if (var9.method798(var10, (byte) 3)) {
            arg3 |= 0x100;
        }
        if (var9.method805(arg5, var10)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method800(25595, var15)) {
                arg3 |= 0x80;
            }
            if (var13.method798(var15, (byte) 3)) {
                arg3 |= 0x100;
            }
            if (var13.method805(true, var15)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method800(25595, arg1)) {
                arg3 |= 0x80;
            }
            if (var11.method798(arg1, (byte) 3)) {
                arg3 |= 0x100;
            }
            if (var11.method805(true, arg1)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method800(25595, var16)) {
                arg3 |= 0x80;
            }
            if (var14.method798(var16, (byte) 3)) {
                arg3 |= 0x100;
            }
            if (var14.method805(true, var16)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        class55 var18 = arg2.method532((byte) 1, var17, true);
        var18.method595(arg0 - 1, var7, var11, -98, 0, this.field468, var10, arg1, var9);
        if (var13 != null) {
            var18.method595(arg0 - 1, var7, var14, -114, 0, this.field468, var15, var16, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILmo;)V", line = 546)
    public final void method348(int arg0, class695 arg1) {
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                field476++;
                if (arg0 != 0) {
                    this.field463 = 44;
                    return;
                }
                return;
            }
            this.method346(4355, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(ILmo;)Lhc;", line = 575)
    public static final class125 method349(int arg0, class695 arg1) {
        field467++;
        class64 var2 = class493.method2861(false, arg1);
        if (arg0 <= 114) {
            field458 = true;
        }
        int var3 = arg1.method3814(false);
        return new class125(var2.field485, var2.field479, var2.field489, var2.field481, var2.field487, var2.field480, var2.field482, var2.field484, var2.field477, var2.field1205, var2.field1203, var2.field1211, var2.field1202, var2.field1215, var2.field1212, var3);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 595)
    public final void method350(boolean arg0) {
        field469++;
        if (this.field465 == -1) {
            if (this.field455 == null) {
                this.field465 = 0;
            } else {
                this.field465 = 2;
            }
        }
        if (this.field448 == -1) {
            if (this.field455 == null) {
                this.field448 = 0;
            } else {
                this.field448 = 2;
            }
        }
        if (!arg0) {
            method343(89, -107, 101);
        }
    }
}
