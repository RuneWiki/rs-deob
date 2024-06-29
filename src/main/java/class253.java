import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class253 {

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
    public boolean field3737 = false;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[F")
    public float[] field3730 = new float[4];

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Z")
    public boolean field3724;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Z")
    public boolean field3744;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public int field3747;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "[S")
    public short[] field3732;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "[I")
    public static int[] field3739 = new int[14];

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3729 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "F")
    public float field3721;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "F")
    public float field3733;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    private int field3741;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    private int field3742;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    private int field3748;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lig;")
    public class189 field3717;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Z")
    public static boolean field3719;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "[[[B")
    public static byte[][][] field3745;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 7)
    private final void method1749(int arg0) {
        field3716++;
        if (arg0 >= -54) {
            field3745 = (byte[][][]) ((byte[][][]) null);
        }
        int var2 = (this.field3746 << 7) + 64;
        this.field3721 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZ)V", line = 19)
    public final void method1750(int arg0, int arg1, boolean arg2) {
        field3718++;
        int var4 = this.field3742 * arg1 / 50 + this.field3738 & 0x7FF;
        int var5 = this.field3748;
        int var6;
        if (var5 == 1) {
            var6 = (class40.field612[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class333.field5186[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2) {
            var6 = 2048;
        }
        if (arg0 != 194) {
            this.method1749(113);
        }
        this.field3733 = (float) ((this.field3741 * var6 >> 11) + this.field3740) / 2048.0F;
        float var7 = this.field3733 / 255.0F;
        this.field3730[0] = var7 * (float) (class164.method1234(16761898, this.field3728) >> 16);
        this.field3730[2] = (float) class164.method1234(255, this.field3728) * var7;
        this.field3730[1] = (float) (class164.method1234(65375, this.field3728) >> 8) * var7;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 103)
    public static void method1751(byte arg0) {
        if (arg0 > -91) {
            method1751((byte) -100);
        }
        field3739 = null;
        field3745 = (byte[][][]) null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILag;Lag;)V", line = 122)
    public static final void method1752(int arg0, class123 arg1, class123 arg2) {
        if (arg1.field2001 != null) {
            arg1.method981(arg0 - 126);
        }
        arg1.field2001 = arg2;
        arg1.field2000 = arg2.field2000;
        if (arg0 != 11) {
            field3719 = true;
        }
        arg1.field2001.field2000 = arg1;
        field3722++;
        arg1.field2000.field2001 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 141)
    private final void method1753(boolean arg0) {
        field3743++;
        if (!arg0) {
            this.field3741 = 53;
        }
        int var2 = this.field3731;
        if (var2 == 2) {
            this.field3740 = 0;
            this.field3748 = 1;
            this.field3741 = 2048;
            this.field3742 = 2048;
        } else if (var2 == 3) {
            this.field3741 = 2048;
            this.field3748 = 1;
            this.field3742 = 4096;
            this.field3740 = 0;
        } else if (var2 == 4) {
            this.field3740 = 0;
            this.field3741 = 2048;
            this.field3742 = 2048;
            this.field3748 = 4;
        } else if (var2 == 5) {
            this.field3748 = 4;
            this.field3740 = 0;
            this.field3741 = 2048;
            this.field3742 = 8192;
        } else if (var2 == 12) {
            this.field3748 = 2;
            this.field3740 = 0;
            this.field3741 = 2048;
            this.field3742 = 2048;
        } else if (var2 == 13) {
            this.field3748 = 2;
            this.field3741 = 2048;
            this.field3742 = 8192;
            this.field3740 = 0;
        } else if (var2 == 10) {
            this.field3740 = 1536;
            this.field3741 = 512;
            this.field3748 = 3;
            this.field3742 = 2048;
        } else if (var2 == 11) {
            this.field3742 = 4096;
            this.field3748 = 3;
            this.field3740 = 1536;
            this.field3741 = 512;
        } else if (var2 == 6) {
            this.field3742 = 2048;
            this.field3748 = 3;
            this.field3740 = 1280;
            this.field3741 = 768;
        } else if (var2 == 7) {
            this.field3748 = 3;
            this.field3741 = 768;
            this.field3742 = 4096;
            this.field3740 = 1280;
        } else if (var2 == 8) {
            this.field3740 = 1024;
            this.field3748 = 3;
            this.field3741 = 1024;
            this.field3742 = 2048;
        } else if (var2 == 9) {
            this.field3741 = 1024;
            this.field3742 = 4096;
            this.field3740 = 1024;
            this.field3748 = 3;
        } else if (var2 == 14) {
            this.field3742 = 2048;
            this.field3741 = 768;
            this.field3748 = 1;
            this.field3740 = 1280;
        } else if (var2 == 15) {
            this.field3748 = 1;
            this.field3742 = 4096;
            this.field3740 = 1536;
            this.field3741 = 512;
        } else if (var2 == 16) {
            this.field3740 = 1792;
            this.field3741 = 256;
            this.field3748 = 1;
            this.field3742 = 8192;
        } else {
            this.field3742 = 2048;
            this.field3740 = 0;
            this.field3748 = 0;
            this.field3741 = 2048;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIII)V", line = 345)
    public static final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class333.field5188 = arg2;
        class104.field1719 = arg1;
        if (arg0 != -25667) {
            field3729 = (String) null;
        }
        class180.field2862 = arg4;
        field3734++;
        class310.field4897 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIII)V", line = 359)
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3727++;
        int var6 = class10.method151(class333.field5188, arg2, 113, class104.field1719);
        int var7 = class10.method151(class333.field5188, arg0, 108, class104.field1719);
        if (arg3 != -27617) {
            field3745 = (byte[][][]) ((byte[][][]) null);
        }
        int var8 = class10.method151(class180.field2862, arg5, 118, class310.field4897);
        int var9 = class10.method151(class180.field2862, arg1, 123, class310.field4897);
        for (int var10 = var6; var10 <= var7; var10++) {
            class323.method2273(var8, arg4, class221.field3443[var10], var9, arg3 ^ 0xFFFF946A);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 443)
    protected class253() {
        if (class333.field5186 == null) {
            class24.method226(6);
        }
        this.method1753(true);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Laj;)V", line = 453)
    public class253(class1 arg0) {
        if (class333.field5186 == null) {
            class24.method226(6);
        }
        this.field3736 = arg0.method15((byte) 77);
        this.field3724 = (this.field3736 & 0x10) != 0;
        this.field3744 = (this.field3736 & 0x8) != 0;
        this.field3736 &= 0x7;
        this.field3725 = arg0.method56(19612);
        this.field3747 = arg0.method56(19612);
        this.field3723 = arg0.method56(19612);
        this.field3746 = arg0.method15((byte) 82);
        this.method1749(-69);
        this.field3732 = new short[this.field3746 * 2 + 1];
        for (int var2 = 0; var2 < this.field3732.length; var2++) {
            this.field3732[var2] = (short) arg0.method56(19612);
        }
        this.field3728 = class40.field606[arg0.method56(19612)];
        int var3 = arg0.method15((byte) -115);
        this.field3731 = var3 & 0x1F;
        this.field3738 = (var3 & 0xE0) << 3;
        if (this.field3731 != 31) {
            this.method1753(true);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIII)V", line = 393)
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 54) {
            return;
        }
        field3735++;
        if (class104.field1719 <= arg3 && arg3 <= class333.field5188) {
            int var5 = class10.method151(class180.field2862, arg4, 114, class310.field4897);
            int var6 = class10.method151(class180.field2862, arg2, 127, class310.field4897);
            class111.method868(arg3, var5, var6, 520, arg0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBII)V", line = 424)
    public final void method1757(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field3742 = arg3;
        this.field3740 = arg4;
        this.field3748 = arg1;
        this.field3741 = arg0;
        if (arg2 == 46) {
            field3720++;
        }
    }
}
