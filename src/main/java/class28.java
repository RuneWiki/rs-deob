import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cg")
public class class28 extends class147 {

    @OriginalMember(owner = "cg", name = "G", descriptor = "Z")
    public boolean field603 = true;

    @OriginalMember(owner = "cg", name = "K", descriptor = "I")
    public int field607 = -1;

    @OriginalMember(owner = "cg", name = "M", descriptor = "I")
    public int field609 = 0;

    @OriginalMember(owner = "cg", name = "N", descriptor = "I")
    public int field610 = -1;

    @OriginalMember(owner = "cg", name = "O", descriptor = "Llf;")
    public static class109 field611 = class35.method275("(U1", 2);

    @OriginalMember(owner = "cg", name = "S", descriptor = "Llf;")
    public static class109 field615 = class35.method275("(U(Y", 2);

    @OriginalMember(owner = "cg", name = "L", descriptor = "Lrc;")
    public static class160 field608 = new class160(128);

    @OriginalMember(owner = "cg", name = "T", descriptor = "[I")
    public static int[] field616 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "cg", name = "H", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "cg", name = "I", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "cg", name = "J", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "cg", name = "P", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "cg", name = "Q", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "cg", name = "R", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "cg", name = "b", descriptor = "(I)V")
    public static void method227(int arg0) {
        field611 = null;
        field616 = null;
        field615 = null;
        field608 = null;
        if (arg0 > -5) {
            method229(-65, -92);
        }
    }

    @OriginalMember(owner = "cg", name = "a", descriptor = "(II)I")
    private final int method228(int arg0, int arg1) {
        field606++;
        if (arg1 != 21856) {
            method229(-38, -69);
        }
        if (arg0 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = var3;
        if (var7 < var9) {
            var9 = var7;
        }
        if (var5 > var3) {
            var13 = var5;
        }
        if (var13 < var7) {
            var13 = var7;
        }
        double var15 = (var9 + var13) / 2.0D;
        double var17 = 0.0D;
        if (var9 != var13) {
            if (var3 == var13) {
                var11 = (var5 - var7) / (-var9 + var13);
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var13 - var9) / (var9 + var13);
            }
            if (var15 >= 0.5D) {
                var17 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        double var19 = var11 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        int var23 = (int) (var17 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var22 > 243) {
            var23 >>= 0x4;
        } else if (var22 > 217) {
            var23 >>= 0x3;
        } else if (var22 > 192) {
            var23 >>= 0x2;
        } else if (var22 > 179) {
            var23 >>= 0x1;
        }
        return (var22 >> 1) + ((var21 >> 2 << 10) + (var23 >> 5 << 7));
    }

    @OriginalMember(owner = "cg", name = "b", descriptor = "(II)Z")
    public static final boolean method229(int arg0, int arg1) {
        field605++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class31.field726[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 != -1159860534) {
            field611 = null;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "cg", name = "a", descriptor = "(III)I")
    public static final int method230(int arg0, int arg1, int arg2) {
        field604++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (arg0 != 1023) {
            method230(-42, 100, -92);
        }
        return class103.field2031 != null && class103.field2031.field1381 == var3 ? class150.field2895.field1773 * 99 / (class150.field2895.field1808.length - class103.field2031.field3394) + 1 : 0;
    }

    @OriginalMember(owner = "cg", name = "a", descriptor = "(IILja;I)V")
    private final void method231(int arg0, int arg1, class86 arg2, int arg3) {
        if (arg3 != -30573) {
            method229(40, -91);
        }
        field612++;
        if (arg0 == 1) {
            this.field609 = this.method228(arg2.method578((byte) 59), 21856);
        } else if (arg0 == 2) {
            this.field610 = arg2.method598((byte) 77);
        } else if (arg0 == 3) {
            this.field610 = arg2.method569(true);
            if (this.field610 == 65535) {
                this.field610 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field603 = false;
            return;
        } else if (arg0 == 7) {
            this.field607 = this.method228(arg2.method578((byte) 59), arg3 + 52429);
            return;
        } else if (arg0 == 8 || arg0 != 9) {
            return;
        } else {
            arg2.method569(true);
            return;
        }
    }

    @OriginalMember(owner = "cg", name = "a", descriptor = "(BILja;)V")
    public final void method232(byte arg0, int arg1, class86 arg2) {
        field613++;
        if (arg0 <= 106) {
            return;
        }
        while (true) {
            int var4 = arg2.method598((byte) 80);
            if (var4 == 0) {
                return;
            }
            this.method231(var4, arg1, arg2, -30573);
        }
    }
}
