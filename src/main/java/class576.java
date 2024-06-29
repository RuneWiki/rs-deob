import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class576 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Z")
    public boolean field8213 = false;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field8209 = -1;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field8210 = 99;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public int field8223 = -1;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
    public boolean field8219 = false;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public int field8226 = 0;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "Z")
    public boolean field8230 = false;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field8227 = -1;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Z")
    public boolean field8218 = false;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public int field8225 = -1;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public int field8222 = 5;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field8217 = 2;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public int field8232 = -1;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[Z")
    public static boolean[] field8221 = new boolean[100];

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field8237 = 0;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public int field8229;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "Lir;")
    public class25 field8236;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[I")
    public int[] field8208;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
    public int[] field8216;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[I")
    private int[] field8220;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "[Z")
    public boolean[] field8228;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "[[I")
    public int[][] field8231;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILba;II)Lba;", line = 3)
    public final class350 method3254(int arg0, int arg1, int arg2, class350 arg3, int arg4, int arg5) {
        field8215++;
        int var7 = this.field8208[arg2];
        if (arg0 != 11) {
            field8221 = null;
        }
        int var8 = this.field8216[arg2];
        class2 var9 = this.field8236.method131(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method602((byte) 1, arg4, true);
        }
        class2 var11 = null;
        if ((this.field8218 || class504.field7259) && arg1 != -1 && this.field8216.length > arg1) {
            int var12 = this.field8216[arg1];
            var11 = this.field8236.method131(var12 >> 16, true);
            arg1 = var12 & 0xFFFF;
        }
        class2 var13 = null;
        class2 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field8220 != null) {
            if (arg2 < this.field8220.length) {
                var15 = this.field8220[arg2];
                if (var15 != 65535) {
                    var13 = this.field8236.method131(var15 >> 16, true);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field8218 || class504.field7259) && arg1 != -1 && arg1 < this.field8220.length) {
                var16 = this.field8220[arg1];
                if (var16 != 65535) {
                    var14 = this.field8236.method131(var16 >> 16, true);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field8230) {
            arg4 |= 0x200;
        }
        if (var9.method8(-88, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method11(var10, (byte) 30)) {
            arg4 |= 0x100;
        }
        if (var9.method7(14569, var10)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method8(-10, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method11(var15, (byte) 22)) {
                arg4 |= 0x100;
            }
            if (var13.method7(14569, var15)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method8(-19, arg1)) {
                arg4 |= 0x80;
            }
            if (var11.method11(arg1, (byte) 107)) {
                arg4 |= 0x100;
            }
            if (var11.method7(14569, arg1)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method8(arg0 ^ 0xFFFFFFFE, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method11(var16, (byte) 52)) {
                arg4 |= 0x100;
            }
            if (var14.method7(14569, var16)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class350 var18 = arg3.method602((byte) 1, var17, true);
        var18.method1938(var9, var11, this.field8230, var7, arg5 - 1, arg1, var10, 0, (byte) 5);
        if (var13 != null) {
            var18.method1938(var13, var14, this.field8230, var7, arg5 - 1, var16, var15, 0, (byte) 5);
        }
        return var18;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZI)I", line = 148)
    public final int method3255(int arg0, int arg1, boolean arg2, int arg3) {
        field8233++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field8216[arg0];
        class2 var8 = null;
        class2 var9 = this.field8236.method131(var7 >> 16, true);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field8218 || class504.field7259) && arg3 != -1 && arg3 < this.field8216.length) {
            int var11 = this.field8216[arg3];
            var8 = this.field8236.method131(var11 >> 16, true);
            var6 = var11 & 0xFFFF;
        }
        if (this.field8230) {
            var5 |= 0x200;
        }
        if (var9.method8(-99, var10)) {
            var5 |= 0x80;
        }
        if (var9.method11(var10, (byte) 110)) {
            var5 |= 0x100;
        }
        if (var9.method7(arg1 + 5263, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method8(arg1 ^ 0xFFFFDBE9, var6)) {
                var5 |= 0x80;
            }
            if (var8.method11(var6, (byte) 51)) {
                var5 |= 0x100;
            }
            if (var8.method7(14569, var6)) {
                var5 |= 0x400;
            }
        }
        if (arg1 != 9306) {
            return 71;
        }
        if (this.field8220 != null && arg2) {
            if (arg0 < this.field8220.length) {
                int var12 = this.field8220[arg0];
                if (var12 != 65535) {
                    class2 var13 = this.field8236.method131(var12 >> 16, true);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method8(-128, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method11(var14, (byte) 46)) {
                            var5 |= 0x100;
                        }
                        if (var13.method7(arg1 + 5263, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field8218 || class504.field7259) && arg3 != -1 && arg3 < this.field8220.length) {
                int var15 = this.field8220[arg3];
                if (var15 != 65535) {
                    class2 var16 = this.field8236.method131(var15 >> 16, true);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method8(-68, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method11(var17, (byte) 96)) {
                            var5 |= 0x100;
                        }
                        if (var16.method7(14569, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V", line = 275)
    public static final void method3256(int arg0, byte arg1) {
        if (arg1 > -82) {
            method3256(-39, (byte) 106);
        }
        field8211++;
        class530 var2 = class242.method1402(-125, 12, arg0);
        var2.method3027((byte) -70);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 296)
    public static void method3257(int arg0) {
        if (arg0 != 348370448) {
            field8237 = 118;
        }
        field8221 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLba;IIIIII)Lba;", line = 308)
    public final class350 method3258(byte arg0, class350 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8212++;
        int var9 = this.field8208[arg7];
        int var10 = this.field8216[arg7];
        class2 var11 = this.field8236.method131(var10 >> 16, true);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method602(arg0, arg4, true);
        }
        class2 var13 = null;
        if ((this.field8218 || class504.field7259) && arg6 != -1 && arg6 < this.field8216.length) {
            int var14 = this.field8216[arg6];
            var13 = this.field8236.method131(var14 >> 16, true);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field8230) {
            arg4 |= 0x200;
        }
        if (var11.method8(-125, var12)) {
            arg4 |= 0x80;
        }
        if (var11.method11(var12, (byte) 52)) {
            arg4 |= 0x100;
        }
        if (var11.method7(arg5 ^ 0x38C9, var12)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method8(-49, arg6)) {
                arg4 |= 0x80;
            }
            if (var13.method11(arg6, (byte) 91)) {
                arg4 |= 0x100;
            }
            if (var13.method7(14569, arg6)) {
                arg4 |= 0x400;
            }
        }
        int var15 = arg4 | arg5;
        class350 var16 = arg1.method602(arg0, var15, true);
        var16.method1938(var11, var13, this.field8230, var9, arg3 - 1, arg6, var12, arg2, (byte) 5);
        return var16;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 414)
    public final void method3259(boolean arg0) {
        if (!arg0) {
            this.field8227 = 113;
        }
        field8224++;
        if (this.field8232 == -1) {
            if (this.field8228 == null) {
                this.field8232 = 0;
            } else {
                this.field8232 = 2;
            }
        }
        if (this.field8223 != -1) {
            return;
        }
        if (this.field8228 == null) {
            this.field8223 = 0;
        } else {
            this.field8223 = 2;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILiaa;)V", line = 447)
    private final void method3260(int arg0, int arg1, class452 arg2) {
        if (arg0 != 0) {
            return;
        }
        field8214++;
        if (arg1 == 1) {
            int var13 = arg2.method2574(arg0 ^ 0x973006A8);
            this.field8208 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field8208[var14] = arg2.method2574(-1758460248);
            }
            this.field8216 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field8216[var15] = arg2.method2574(arg0 - 1758460248);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field8216[var16] = (arg2.method2574(-1758460248) << 16) + this.field8216[var16];
            }
        } else if (arg1 == 2) {
            this.field8227 = arg2.method2574(-1758460248);
        } else if (arg1 == 3) {
            this.field8228 = new boolean[256];
            int var4 = arg2.method2541(arg0 + 103);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8228[arg2.method2541(48)] = true;
            }
        } else if (arg1 == 5) {
            this.field8222 = arg2.method2541(35);
        } else if (arg1 == 6) {
            this.field8225 = arg2.method2574(-1758460248);
        } else if (arg1 == 7) {
            this.field8209 = arg2.method2574(-1758460248);
        } else if (arg1 == 8) {
            this.field8210 = arg2.method2541(70);
        } else if (arg1 == 9) {
            this.field8232 = arg2.method2541(34);
        } else if (arg1 == 10) {
            this.field8223 = arg2.method2541(101);
        } else if (arg1 == 11) {
            this.field8217 = arg2.method2541(75);
        } else if (arg1 == 12) {
            int var10 = arg2.method2541(arg0 + 32);
            this.field8220 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field8220[var11] = arg2.method2574(-1758460248);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field8220[var12] = (arg2.method2574(-1758460248) << 16) + this.field8220[var12];
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method2574(-1758460248);
            this.field8231 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method2541(117);
                if (var8 > 0) {
                    this.field8231[var7] = new int[var8];
                    this.field8231[var7][0] = arg2.method2524(3);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field8231[var7][var9] = arg2.method2574(arg0 - 1758460248);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field8230 = true;
        } else if (arg1 == 15) {
            this.field8218 = true;
        } else if (arg1 == 16) {
            this.field8219 = true;
        } else if (arg1 == 17) {
            this.field8226 = arg2.method2541(42);
        } else if (arg1 == 18) {
            this.field8213 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILiaa;)V", line = 614)
    public final void method3261(int arg0, class452 arg1) {
        while (true) {
            int var3 = arg1.method2541(43);
            if (var3 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field8234++;
                return;
            }
            this.method3260(~arg0, var3, arg1);
        }
    }
}
