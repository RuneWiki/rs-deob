import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class671 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field9641 = 512;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    private int field9643 = 0;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "Z")
    public boolean field9646 = true;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Z")
    public boolean field9652 = true;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field9647 = -1;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[S")
    private static short[] field9642 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "[S")
    private static short[] field9651 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "[S")
    private static short[] field9654 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[Lar;")
    public static class633[] field9657 = new class633[1024];

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[[S")
    public static short[][] field9644 = new short[][] { field9651, field9642, field9654 };

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public int field9648;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public int field9650;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public int field9653;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lkga;[IBI[II)Lpg;", line = 5)
    public static final class681 method3821(class506 arg0, int[] arg1, byte arg2, int arg3, int[] arg4, int arg5) {
        field9655++;
        byte[] var6 = new byte[arg3 * arg5];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg5 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg2 != 40) {
            field9642 = null;
        }
        return new class681(arg0, arg5, arg3, var6);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V", line = 43)
    private final void method3822(int arg0, int arg1) {
        field9656++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF95) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        int var11 = -92 / ((-arg1 - 50) / 63);
        if (var9 > var7) {
            var9 = var7;
        }
        double var12 = var3;
        if (var3 < var5) {
            var12 = var5;
        }
        if (var7 > var12) {
            var12 = var7;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var9 + var12) / 2.0D;
        if (var9 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var9) / (var9 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var9) / (2.0D - var12 - var9);
            }
            if (var3 == var12) {
                var14 = (var5 - var7) / (var12 - var9);
            } else if (var5 == var12) {
                var14 = (var7 - var3) / (var12 - var9) + 2.0D;
            } else if (var7 == var12) {
                var14 = (var3 - var5) / (var12 - var9) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field9648 = (int) (var18 * 256.0D);
        this.field9650 = (int) (var16 * 256.0D);
        if (this.field9650 < 0) {
            this.field9650 = 0;
        } else if (this.field9650 > 255) {
            this.field9650 = 255;
        }
        if (this.field9648 < 0) {
            this.field9648 = 0;
        } else if (this.field9648 > 255) {
            this.field9648 = 255;
        }
        if (var18 > 0.5D) {
            this.field9653 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field9653 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field9653 < 1) {
            this.field9653 = 1;
        }
        this.field9645 = (int) ((double) this.field9653 * var20);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 132)
    public static void method3823(byte arg0) {
        field9642 = null;
        if (arg0 == -66) {
            field9654 = null;
            field9657 = null;
            field9651 = null;
            field9644 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLun;)V", line = 150)
    public final void method3824(byte arg0, class389 arg1) {
        while (true) {
            int var3 = arg1.method2229(arg0 ^ 0xFFFFFF46);
            if (var3 == 0) {
                if (arg0 != -71) {
                    this.field9647 = -114;
                }
                field9658++;
                return;
            }
            this.method3825(2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILun;I)V", line = 183)
    private final void method3825(int arg0, class389 arg1, int arg2) {
        if (arg0 != 2) {
            return;
        }
        field9649++;
        if (arg2 == 1) {
            this.field9643 = arg1.method2258(-3);
            this.method3822(this.field9643, 126);
        } else if (arg2 == 2) {
            this.field9647 = arg1.method2260(-94);
            if (this.field9647 == 65535) {
                this.field9647 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field9641 = arg1.method2260(-39) << 2;
        } else if (arg2 == 4) {
            this.field9652 = false;
            return;
        } else if (arg2 == 5) {
            this.field9646 = false;
            return;
        }
    }
}
