import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class449 {

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "Z")
    public boolean field6508 = false;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public int field6504 = 5;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public int field6511 = -1;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public int field6505 = 99;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public int field6513 = -1;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public int field6512 = -1;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Z")
    public boolean field6499 = false;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public int field6501 = -1;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public int field6507 = -1;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Z")
    public boolean field6495 = false;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public int field6516 = 2;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "Z")
    public boolean field6520 = false;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "[I")
    public int[] field6506;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "[I")
    private int[] field6510;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "[I")
    public int[] field6521;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "[Z")
    public boolean[] field6498;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "[[I")
    public int[][] field6514;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public final void method2801(boolean arg0) {
        field6497++;
        if (this.field6513 == -1) {
            if (this.field6498 == null) {
                this.field6513 = 0;
            } else {
                this.field6513 = 2;
            }
        }
        if (arg0) {
            method2807((byte) -98);
        }
        if (this.field6511 != -1) {
            return;
        }
        if (this.field6498 == null) {
            this.field6511 = 0;
        } else {
            this.field6511 = 2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Leb;II)V")
    private final void method2802(class371 arg0, int arg1, int arg2) {
        field6519++;
        if (arg1 != 0) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg0.method2403((byte) 58);
            this.field6506 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6506[var5] = arg0.method2403((byte) 102);
            }
            this.field6521 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field6521[var6] = arg0.method2403((byte) 127);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field6521[var7] = (arg0.method2403((byte) 96) << 16) + this.field6521[var7];
            }
        } else if (arg2 == 2) {
            this.field6501 = arg0.method2403((byte) 49);
        } else if (arg2 == 3) {
            this.field6498 = new boolean[256];
            int var15 = arg0.method2429(0);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field6498[arg0.method2429(class28.method220(arg1, 0))] = true;
            }
        } else if (arg2 == 4) {
            this.field6499 = true;
        } else if (arg2 == 5) {
            this.field6504 = arg0.method2429(arg1);
        } else if (arg2 == 6) {
            this.field6512 = arg0.method2403((byte) 61);
        } else if (arg2 == 7) {
            this.field6507 = arg0.method2403((byte) 52);
        } else if (arg2 == 8) {
            this.field6505 = arg0.method2429(0);
        } else if (arg2 == 9) {
            this.field6511 = arg0.method2429(0);
        } else if (arg2 == 10) {
            this.field6513 = arg0.method2429(0);
        } else if (arg2 == 11) {
            this.field6516 = arg0.method2429(0);
        } else if (arg2 == 12) {
            int var12 = arg0.method2429(0);
            this.field6510 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field6510[var13] = arg0.method2403((byte) 87);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field6510[var14] += arg0.method2403((byte) 91) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method2403((byte) 95);
            this.field6514 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method2429(0);
                if (var10 > 0) {
                    this.field6514[var9] = new int[var10];
                    this.field6514[var9][0] = arg0.method2425(88);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field6514[var9][var11] = arg0.method2403((byte) 124);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field6495 = true;
        } else if (arg2 == 15) {
            this.field6520 = true;
        } else if (arg2 == 16) {
            this.field6508 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLeb;)V")
    public final void method2803(byte arg0, class371 arg1) {
        field6500++;
        int var3 = 21 / ((-arg0 - 53) / 32);
        while (true) {
            int var4 = arg1.method2429(0);
            if (var4 == 0) {
                return;
            }
            this.method2802(arg1, 0, var4);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BIIIILhc;II)Lhc;")
    public final class75 method2804(byte arg0, int arg1, int arg2, int arg3, int arg4, class75 arg5, int arg6, int arg7) {
        field6518++;
        int var9 = this.field6506[arg6];
        int var10 = this.field6521[arg6];
        class387 var11 = class326.method2051(121, var10 >> 16);
        if (arg1 != 512) {
            this.method2802((class371) null, 67, 78);
        }
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method529((byte) 1, arg4, true);
        }
        class387 var13 = null;
        if ((this.field6520 || class169.field2408) && arg7 != -1 && arg7 < this.field6521.length) {
            int var14 = this.field6521[arg7];
            var13 = class326.method2051(112, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field6495) {
            arg4 |= 0x200;
        }
        if (var11.method2527(false, var12)) {
            arg4 |= 0x80;
        }
        if (var11.method2533(var12, arg1 ^ 0x2FF)) {
            arg4 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2527(false, arg7)) {
                arg4 |= 0x80;
            }
            if (var13.method2533(arg7, 255)) {
                arg4 |= 0x100;
            }
        }
        int var15 = arg4 | 0x20;
        class75 var16 = arg5.method529(arg0, var15, true);
        var16.method517(arg7, var12, var9, this.field6495, var11, arg3, arg2 - 1, var13, (byte) -125);
        return var16;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBZI)I")
    public final int method2805(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 != 16) {
            return 96;
        }
        field6517++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6521[arg3];
        class387 var8 = null;
        class387 var9 = class326.method2051(arg1 + 99, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6520 || class169.field2408) && arg0 != -1 && this.field6521.length > arg0) {
            int var11 = this.field6521[arg0];
            var8 = class326.method2051(arg1 ^ 0x6D, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6495) {
            var5 |= 0x200;
        }
        if (var9.method2527(false, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2533(var10, 255)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method2527(false, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2533(var6, 255)) {
                var5 |= 0x100;
            }
        }
        if (this.field6510 != null && arg2) {
            if (arg3 < this.field6510.length) {
                int var12 = this.field6510[arg3];
                if (var12 != 65535) {
                    class387 var13 = class326.method2051(113, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2527(false, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2533(var14, 255)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field6520 || class169.field2408) && arg0 != -1 && arg0 < this.field6510.length) {
                int var15 = this.field6510[arg0];
                if (var15 != 65535) {
                    class387 var16 = class326.method2051(77, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2527(false, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2533(var17, 255)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lhc;IIIBI)Lhc;")
    public final class75 method2806(class75 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6502++;
        int var7 = this.field6506[arg5];
        int var8 = this.field6521[arg5];
        class387 var9 = class326.method2051(111, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method529((byte) 1, arg1, true);
        }
        class387 var11 = null;
        if ((this.field6520 || class169.field2408) && arg2 != -1 && arg2 < this.field6521.length) {
            int var12 = this.field6521[arg2];
            var11 = class326.method2051(89, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        if (arg4 != 108) {
            this.method2802((class371) null, -38, -43);
        }
        class387 var13 = null;
        class387 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6510 != null) {
            if (this.field6510.length > arg5) {
                var15 = this.field6510[arg5];
                if (var15 != 65535) {
                    var13 = class326.method2051(127, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6520 || class169.field2408) && arg2 != -1 && arg2 < this.field6510.length) {
                var16 = this.field6510[arg2];
                if (var16 != 65535) {
                    var14 = class326.method2051(106, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6495) {
            arg1 |= 0x200;
        }
        if (var9.method2527(false, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method2533(var10, 255)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2527(false, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method2533(var15, 255)) {
                arg1 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method2527(false, arg2)) {
                arg1 |= 0x80;
            }
            if (var11.method2533(arg2, 255)) {
                arg1 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method2527(false, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method2533(var16, 255)) {
                arg1 |= 0x100;
            }
        }
        int var17 = arg1 | 0x20;
        class75 var18 = arg0.method529((byte) 1, var17, true);
        var18.method517(arg2, var10, var7, this.field6495, var9, 0, arg3 - 1, var11, (byte) 110);
        if (var13 != null) {
            var18.method517(var16, var15, var7, this.field6495, var13, 0, arg3 - 1, var14, (byte) 127);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Lwd;")
    public static final class149 method2807(byte arg0) {
        if (arg0 != 110) {
            return null;
        }
        field6515++;
        try {
            return (class149) Class.forName("qb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
