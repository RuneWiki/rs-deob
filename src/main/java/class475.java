import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class475 {

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public int field6636;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Z")
    public boolean field6640;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Z")
    public boolean field6635;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "[S")
    public short[] field6641;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public int field6644;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    private int field6639;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "Lwo;")
    public static class690 field6650 = new class690(49, -1);

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
    public static int[] field6652 = new int[6];

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "Lgv;")
    public static class72 field6651 = new class72();

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6653 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Ljk;")
    public static class585 field6654 = new class585(58, 6);

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "[I")
    public static int[] field6656 = new int[14];

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "Lwaa;")
    public static class652 field6655 = new class652(64);

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "F")
    public static float field6657;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    private int field6642;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    private int field6643;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    private int field6646;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    private int field6648;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Lul;")
    public class530 field6647;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILr;III)V", line = 4)
    private final void method2788(int arg0, int arg1, int arg2, class165 arg3, int arg4, int arg5, int arg6) {
        field6638++;
        if (arg0 == 6) {
            this.field6647 = arg3.method243(arg2, arg5, arg1, arg4, arg6, 1.0F);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 27)
    public static void method2789(boolean arg0) {
        field6654 = null;
        if (arg0) {
            field6657 = -1.4841274F;
        }
        field6653 = null;
        field6650 = null;
        field6655 = null;
        field6656 = null;
        field6651 = null;
        field6652 = null;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)V", line = 44)
    private final void method2790(boolean arg0) {
        field6637++;
        if (arg0) {
            return;
        }
        int var2 = this.field6644;
        if (var2 == 2) {
            this.field6642 = 1;
            this.field6646 = 0;
            this.field6643 = 2048;
            this.field6648 = 2048;
        } else if (var2 == 3) {
            this.field6642 = 1;
            this.field6646 = 0;
            this.field6648 = 2048;
            this.field6643 = 4096;
        } else if (var2 == 4) {
            this.field6648 = 2048;
            this.field6642 = 4;
            this.field6643 = 2048;
            this.field6646 = 0;
        } else if (var2 == 5) {
            this.field6642 = 4;
            this.field6646 = 0;
            this.field6648 = 2048;
            this.field6643 = 8192;
        } else if (var2 == 12) {
            this.field6648 = 2048;
            this.field6646 = 0;
            this.field6643 = 2048;
            this.field6642 = 2;
        } else if (var2 == 13) {
            this.field6648 = 2048;
            this.field6646 = 0;
            this.field6642 = 2;
            this.field6643 = 8192;
        } else if (var2 == 10) {
            this.field6643 = 2048;
            this.field6646 = 1536;
            this.field6648 = 512;
            this.field6642 = 3;
        } else if (var2 == 11) {
            this.field6643 = 4096;
            this.field6648 = 512;
            this.field6646 = 1536;
            this.field6642 = 3;
        } else if (var2 == 6) {
            this.field6648 = 768;
            this.field6642 = 3;
            this.field6646 = 1280;
            this.field6643 = 2048;
        } else if (var2 == 7) {
            this.field6642 = 3;
            this.field6643 = 4096;
            this.field6648 = 768;
            this.field6646 = 1280;
        } else if (var2 == 8) {
            this.field6642 = 3;
            this.field6646 = 1024;
            this.field6648 = 1024;
            this.field6643 = 2048;
        } else if (var2 == 9) {
            this.field6646 = 1024;
            this.field6643 = 4096;
            this.field6642 = 3;
            this.field6648 = 1024;
        } else if (var2 == 14) {
            this.field6646 = 1280;
            this.field6642 = 1;
            this.field6643 = 2048;
            this.field6648 = 768;
        } else if (var2 == 15) {
            this.field6646 = 1536;
            this.field6642 = 1;
            this.field6643 = 4096;
            this.field6648 = 512;
        } else if (var2 == 16) {
            this.field6643 = 8192;
            this.field6646 = 1792;
            this.field6642 = 1;
            this.field6648 = 256;
        } else {
            this.field6642 = 0;
            this.field6643 = 2048;
            this.field6648 = 2048;
            this.field6646 = 0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BIZ)V", line = 244)
    public final void method2791(byte arg0, int arg1, boolean arg2) {
        field6649++;
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field6643 * arg1 / 50 + this.field6639 & 0x7FF;
            int var6 = this.field6642;
            if (var6 == 1) {
                var4 = (class395.field5579[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class127.field1614[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        if (arg0 < 91) {
            this.field6639 = -68;
        }
        this.field6647.method1158((byte) 127, (float) (this.field6646 + (this.field6648 * var4 >> 11)) / 2048.0F);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V", line = 323)
    protected class475() {
        if (class127.field1614 == null) {
            class594.method3442(false);
        }
        this.method2790(false);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIII)V", line = 339)
    public final void method2792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6642 = arg1;
        field6645++;
        if (arg4 != 12560) {
            method2789(false);
        }
        this.field6648 = arg3;
        this.field6646 = arg0;
        this.field6643 = arg2;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lr;Lun;I)V", line = 352)
    public class475(class165 arg0, class389 arg1, int arg2) {
        if (class127.field1614 == null) {
            class594.method3442(false);
        }
        this.field6636 = arg1.method2229(255);
        this.field6640 = (this.field6636 & 0x8) != 0;
        this.field6635 = (this.field6636 & 0x10) != 0;
        this.field6636 &= 0x7;
        int var4 = arg1.method2260(-72) << arg2;
        int var5 = arg1.method2260(-111) << arg2;
        int var6 = arg1.method2260(-98) << arg2;
        int var7 = arg1.method2229(255);
        int var8 = var7 * 2 + 1;
        this.field6641 = new short[var8];
        for (int var9 = 0; var9 < this.field6641.length; var9++) {
            short var13 = (short) arg1.method2260(-59);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field6641[var9] = (short) class242.method1474(var14 << 8, var15);
        }
        int var10 = (var7 << class295.field3981) + class480.field6727;
        int var11 = class285.field3868 == null ? class119.field1524[class642.method3653((byte) 3, arg1.method2260(-79)) & 0xFFFF] : class285.field3868[arg1.method2260(-94)];
        int var12 = arg1.method2229(255);
        this.field6644 = var12 & 0x1F;
        this.field6639 = (var12 & 0xE0) << 3;
        if (this.field6644 != 31) {
            this.method2790(false);
        }
        this.method2788(6, var5, var4, arg0, var10, var6, var11);
    }
}
