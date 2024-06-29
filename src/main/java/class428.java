import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class428 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field6507 = 99;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field6511 = -1;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field6510 = -1;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public int field6528 = -1;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Z")
    public boolean field6526 = false;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public int field6527 = 5;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field6518 = -1;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public int field6513 = 2;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Z")
    public boolean field6531 = false;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Z")
    public boolean field6530 = false;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Z")
    public boolean field6536 = false;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field6516 = -1;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field6525 = 1401;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public int field6529;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Ljb;")
    public class458 field6519;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[I")
    public int[] field6508;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[I")
    private int[] field6509;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
    public int[] field6515;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[I")
    public int[] field6521;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "[I")
    public int[] field6524;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[I")
    public int[] field6532;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "[Z")
    public boolean[] field6535;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[[I")
    public int[][] field6517;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[[[B")
    public static byte[][][] field6538;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZIII)V")
    public static final void method2707(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6514++;
        if (class107.method1016(arg2, (byte) 118)) {
            class611.method3560(arg0, arg3, arg4, arg1, false, class564.field8105[arg2]);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILie;)V")
    private final void method2708(int arg0, int arg1, class6 arg2) {
        if (arg0 == 1) {
            int var16 = arg2.method67(12021);
            this.field6532 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field6532[var17] = arg2.method67(12021);
            }
            this.field6521 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field6521[var18] = arg2.method67(12021);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field6521[var19] = (arg2.method67(12021) << 16) + this.field6521[var19];
            }
        } else if (arg0 == 2) {
            this.field6510 = arg2.method67(12021);
        } else if (arg0 == 3) {
            this.field6535 = new boolean[256];
            int var4 = arg2.method70(-9059);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6535[arg2.method70(class357.method2397(arg1, -8803))] = true;
            }
        } else if (arg0 == 5) {
            this.field6527 = arg2.method70(-9059);
        } else if (arg0 == 6) {
            this.field6518 = arg2.method67(12021);
        } else if (arg0 == 7) {
            this.field6516 = arg2.method67(12021);
        } else if (arg0 == 8) {
            this.field6507 = arg2.method70(-9059);
        } else if (arg0 == 9) {
            this.field6511 = arg2.method70(-9059);
        } else if (arg0 == 10) {
            this.field6528 = arg2.method70(-9059);
        } else if (arg0 == 11) {
            this.field6513 = arg2.method70(-9059);
        } else if (arg0 == 12) {
            int var13 = arg2.method70(-9059);
            this.field6509 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6509[var14] = arg2.method67(12021);
            }
            for (int var15 = 0; var15 < var13; var15++) {
                this.field6509[var15] = (arg2.method67(12021) << 16) + this.field6509[var15];
            }
        } else if (arg0 == 13) {
            int var6 = arg2.method67(12021);
            this.field6517 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method70(arg1 ^ 0xFFFFDD9D);
                if (var8 > 0) {
                    this.field6517[var7] = new int[var8];
                    this.field6517[var7][0] = arg2.method86(-88);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field6517[var7][var9] = arg2.method67(12021);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field6530 = true;
        } else if (arg0 == 15) {
            this.field6531 = true;
        } else if (arg0 == 16) {
            this.field6536 = true;
        } else if (arg0 == 18) {
            this.field6526 = true;
        } else if (arg0 == 19) {
            if (this.field6524 == null) {
                this.field6524 = new int[this.field6517.length];
                for (int var12 = 0; var12 < this.field6517.length; var12++) {
                    this.field6524[var12] = 255;
                }
            }
            this.field6524[arg2.method70(-9059)] = arg2.method70(-9059);
        } else if (arg0 == 20) {
            if (this.field6515 == null || this.field6508 == null) {
                this.field6515 = new int[this.field6517.length];
                this.field6508 = new int[this.field6517.length];
                for (int var10 = 0; var10 < this.field6517.length; var10++) {
                    this.field6515[var10] = 256;
                    this.field6508[var10] = 256;
                }
            }
            int var11 = arg2.method70(-9059);
            this.field6515[var11] = arg2.method67(12021);
            this.field6508[var11] = arg2.method67(arg1 + 11765);
        }
        if (arg1 == 256) {
            field6534++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILda;III)Lda;")
    public final class55 method2709(byte arg0, int arg1, class55 arg2, int arg3, int arg4, int arg5) {
        field6522++;
        int var7 = this.field6532[arg1];
        int var8 = -15 % ((arg0 + 52) / 52);
        int var9 = this.field6521[arg1];
        class675 var10 = this.field6519.method2870(var9 >> 16, 28133);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg2.method609((byte) 1, arg5, true);
        }
        class675 var12 = null;
        if ((this.field6531 || class436.field6656) && arg3 != -1 && arg3 < this.field6521.length) {
            int var13 = this.field6521[arg3];
            var12 = this.field6519.method2870(var13 >> 16, 28133);
            arg3 = var13 & 0xFFFF;
        }
        class675 var14 = null;
        class675 var15 = null;
        int var16 = 0;
        int var17 = 0;
        if (this.field6509 != null) {
            if (this.field6509.length > arg1) {
                var16 = this.field6509[arg1];
                if (var16 != 65535) {
                    var14 = this.field6519.method2870(var16 >> 16, 28133);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field6531 || class436.field6656) && arg3 != -1 && arg3 < this.field6509.length) {
                var17 = this.field6509[arg3];
                if (var17 != 65535) {
                    var15 = this.field6519.method2870(var17 >> 16, 28133);
                    var17 &= 0xFFFF;
                }
            }
        }
        if (this.field6530) {
            arg5 |= 0x200;
        }
        if (var10.method3865((byte) 59, var11)) {
            arg5 |= 0x80;
        }
        if (var10.method3863(var11, (byte) 59)) {
            arg5 |= 0x100;
        }
        if (var10.method3861(-3425, var11)) {
            arg5 |= 0x400;
        }
        if (var14 != null) {
            if (var14.method3865((byte) 59, var16)) {
                arg5 |= 0x80;
            }
            if (var14.method3863(var16, (byte) -82)) {
                arg5 |= 0x100;
            }
            if (var14.method3861(-3425, var16)) {
                arg5 |= 0x400;
            }
        }
        if (var12 != null) {
            if (var12.method3865((byte) 59, arg3)) {
                arg5 |= 0x80;
            }
            if (var12.method3863(arg3, (byte) -86)) {
                arg5 |= 0x100;
            }
            if (var12.method3861(-3425, arg3)) {
                arg5 |= 0x400;
            }
        }
        if (var15 != null) {
            if (var15.method3865((byte) 59, var17)) {
                arg5 |= 0x80;
            }
            if (var15.method3863(var17, (byte) -103)) {
                arg5 |= 0x100;
            }
            if (var15.method3861(-3425, var17)) {
                arg5 |= 0x400;
            }
        }
        int var18 = arg5 | 0x20;
        class55 var19 = arg2.method609((byte) 1, var18, true);
        var19.method635(this.field6530, arg3, (byte) -108, var12, var7, var11, arg4 - 1, 0, var10);
        if (var14 != null) {
            var19.method635(this.field6530, var17, (byte) -116, var15, var7, var16, arg4 - 1, 0, var14);
        }
        return var19;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZIILda;BI)Lda;")
    public final class55 method2710(int arg0, int arg1, boolean arg2, int arg3, int arg4, class55 arg5, byte arg6, int arg7) {
        field6537++;
        int var9 = this.field6532[arg3];
        int var10 = this.field6521[arg3];
        class675 var11 = this.field6519.method2870(var10 >> 16, 28133);
        int var12 = var10 & 0xFFFF;
        if (arg2) {
            this.method2710(51, 91, true, 54, 94, null, (byte) -104, -6);
        }
        if (var11 == null) {
            return arg5.method609(arg6, arg7, true);
        }
        class675 var13 = null;
        if ((this.field6531 || class436.field6656) && arg1 != -1 && this.field6521.length > arg1) {
            int var14 = this.field6521[arg1];
            var13 = this.field6519.method2870(var14 >> 16, 28133);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field6530) {
            arg7 |= 0x200;
        }
        if (var11.method3865((byte) 59, var12)) {
            arg7 |= 0x80;
        }
        if (var11.method3863(var12, (byte) -101)) {
            arg7 |= 0x100;
        }
        if (var11.method3861(-3425, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3865((byte) 59, arg1)) {
                arg7 |= 0x80;
            }
            if (var13.method3863(arg1, (byte) 104)) {
                arg7 |= 0x100;
            }
            if (var13.method3861(-3425, arg1)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class55 var16 = arg5.method609(arg6, var15, true);
        var16.method635(this.field6530, arg1, (byte) -126, var13, var9, var12, arg0 - 1, arg4, var11);
        return var16;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
    public static final void method2711(int arg0, byte arg1) {
        class16.field266 = new int[arg0];
        field6520++;
        if (arg1 != 67) {
            method2707(82, true, -4, 41, -104);
        }
        class645.field9067 = new int[arg0];
        class680.field9541 = new int[arg0];
        class232.field3692 = new int[arg0];
        class257.field4077 = new int[arg0];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIZI)I")
    public final int method2712(byte arg0, int arg1, boolean arg2, int arg3) {
        field6506++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6521[arg3];
        class675 var8 = null;
        class675 var9 = this.field6519.method2870(var7 >> 16, 28133);
        if (arg0 <= 3) {
            method2716(-55, 72, null);
        }
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6531 || class436.field6656) && arg1 != -1 && this.field6521.length > arg1) {
            int var11 = this.field6521[arg1];
            var8 = this.field6519.method2870(var11 >> 16, 28133);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6530) {
            var5 |= 0x200;
        }
        if (var9.method3865((byte) 59, var10)) {
            var5 |= 0x80;
        }
        if (var9.method3863(var10, (byte) -101)) {
            var5 |= 0x100;
        }
        if (var9.method3861(-3425, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3865((byte) 59, var6)) {
                var5 |= 0x80;
            }
            if (var8.method3863(var6, (byte) 58)) {
                var5 |= 0x100;
            }
            if (var8.method3861(-3425, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field6509 != null && arg2) {
            if (this.field6509.length > arg3) {
                int var12 = this.field6509[arg3];
                if (var12 != 65535) {
                    class675 var13 = this.field6519.method2870(var12 >> 16, 28133);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3865((byte) 59, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3863(var14, (byte) 104)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3861(-3425, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6531 || class436.field6656) && arg1 != -1 && this.field6509.length > arg1) {
                int var15 = this.field6509[arg1];
                if (var15 != 65535) {
                    class675 var16 = this.field6519.method2870(var15 >> 16, 28133);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3865((byte) 59, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3863(var17, (byte) -89)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3861(-3425, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILie;)V")
    public final void method2713(int arg0, class6 arg1) {
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field6519 = null;
                }
                field6523++;
                return;
            }
            this.method2708(var3, 256, arg1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method2714(int arg0) {
        if (~this.field6528 == arg0) {
            if (this.field6535 == null) {
                this.field6528 = 0;
            } else {
                this.field6528 = 2;
            }
        }
        field6533++;
        if (this.field6511 != -1) {
            return;
        }
        if (this.field6535 == null) {
            this.field6511 = 0;
        } else {
            this.field6511 = 2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2715(byte arg0) {
        if (arg0 < 115) {
            method2711(115, (byte) -66);
        }
        field6538 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method2716(int arg0, int arg1, String arg2) {
        field6505++;
        return arg1 == 512 ? class213.method1606(122, true, arg0, arg2) : 62;
    }
}
