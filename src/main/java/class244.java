import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class244 {

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[F")
    public float[] field3836 = new float[4];

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Z")
    public boolean field3830 = false;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
    public boolean field3820;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Z")
    public boolean field3817;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[S")
    public short[] field3837;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[I")
    public static int[] field3829 = new int[3];

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lqj;")
    public static class280 field3822 = new class280(64);

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3843 = null;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "F")
    public float field3834;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "F")
    public float field3842;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    private int field3840;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Lvd;")
    public static class153 field3845;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lcj;")
    public class350 field3821;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 4)
    private final void method1724(byte arg0) {
        field3838++;
        if (arg0 > -96) {
            return;
        }
        int var2 = this.field3827;
        if (var2 == 2) {
            this.field3819 = 2048;
            this.field3840 = 1;
            this.field3833 = 2048;
            this.field3825 = 0;
        } else if (var2 == 3) {
            this.field3840 = 1;
            this.field3825 = 0;
            this.field3819 = 2048;
            this.field3833 = 4096;
        } else if (var2 == 4) {
            this.field3833 = 2048;
            this.field3840 = 4;
            this.field3825 = 0;
            this.field3819 = 2048;
        } else if (var2 == 5) {
            this.field3819 = 2048;
            this.field3833 = 8192;
            this.field3840 = 4;
            this.field3825 = 0;
        } else if (var2 == 12) {
            this.field3840 = 2;
            this.field3819 = 2048;
            this.field3825 = 0;
            this.field3833 = 2048;
        } else if (var2 == 13) {
            this.field3819 = 2048;
            this.field3833 = 8192;
            this.field3825 = 0;
            this.field3840 = 2;
        } else if (var2 == 10) {
            this.field3819 = 512;
            this.field3825 = 1536;
            this.field3833 = 2048;
            this.field3840 = 3;
        } else if (var2 == 11) {
            this.field3833 = 4096;
            this.field3825 = 1536;
            this.field3840 = 3;
            this.field3819 = 512;
        } else if (var2 == 6) {
            this.field3819 = 768;
            this.field3833 = 2048;
            this.field3840 = 3;
            this.field3825 = 1280;
        } else if (var2 == 7) {
            this.field3825 = 1280;
            this.field3819 = 768;
            this.field3833 = 4096;
            this.field3840 = 3;
        } else if (var2 == 8) {
            this.field3833 = 2048;
            this.field3819 = 1024;
            this.field3840 = 3;
            this.field3825 = 1024;
        } else if (var2 == 9) {
            this.field3825 = 1024;
            this.field3840 = 3;
            this.field3833 = 4096;
            this.field3819 = 1024;
        } else if (var2 == 14) {
            this.field3825 = 1280;
            this.field3840 = 1;
            this.field3833 = 2048;
            this.field3819 = 768;
        } else if (var2 == 15) {
            this.field3819 = 512;
            this.field3825 = 1536;
            this.field3833 = 4096;
            this.field3840 = 1;
        } else if (var2 == 16) {
            this.field3819 = 256;
            this.field3840 = 1;
            this.field3825 = 1792;
            this.field3833 = 8192;
        } else {
            this.field3840 = 0;
            this.field3819 = 2048;
            this.field3833 = 2048;
            this.field3825 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 201)
    private final void method1725(int arg0) {
        field3832++;
        int var2 = (this.field3835 << 7) + 64;
        int var3 = 79 % ((arg0 + 20) / 41);
        this.field3834 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 217)
    public static void method1726(byte arg0) {
        field3822 = null;
        if (arg0 != -60) {
            method1730(-11, 114);
        }
        field3843 = null;
        field3829 = null;
        field3845 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lbk;", line = 237)
    public static final class72 method1727(int arg0, int arg1) {
        class72 var2 = (class72) class291.field4582.method380(0, (long) arg1);
        field3816++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class345.field5473.method100(16, arg1, (byte) -107);
        class72 var4 = new class72();
        if (var3 != null) {
            var4.method450((byte) 91, new class143(var3));
        }
        class291.field4582.method377((long) arg1, var4, arg0 + 20257);
        if (arg0 != -20258) {
            method1727(24, -72);
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZB)V", line = 262)
    public final void method1728(int arg0, boolean arg1, byte arg2) {
        field3826++;
        int var4 = this.field3833 * arg0 / 50 + this.field3828 & 0x7FF;
        int var5 = this.field3840;
        int var6;
        if (var5 == 1) {
            var6 = (class104.field1426[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class119.field1664[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        if (arg2 <= 72) {
            return;
        }
        this.field3842 = (float) ((this.field3819 * var6 >> 11) + this.field3825) / 2048.0F;
        float var7 = this.field3842 / 255.0F;
        this.field3836[0] = (float) class261.method1840(this.field3818 >> 16, 255) * var7;
        this.field3836[1] = var7 * (float) class261.method1840(255, this.field3818 >> 8);
        this.field3836[2] = var7 * (float) class261.method1840(255, this.field3818);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBI)V", line = 351)
    public final void method1729(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field3833 = arg4;
        if (arg3 < 9) {
            this.field3834 = -1.1421169F;
        }
        field3824++;
        this.field3840 = arg1;
        this.field3819 = arg2;
        this.field3825 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 400)
    protected class244() {
        if (class119.field1664 == null) {
            class189.method1296(2047);
        }
        this.method1724((byte) -103);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Llf;)V", line = 411)
    public class244(class143 arg0) {
        if (class119.field1664 == null) {
            class189.method1296(2047);
        }
        this.field3831 = arg0.method1043(true);
        this.field3820 = (this.field3831 & 0x8) != 0;
        this.field3817 = (this.field3831 & 0x10) != 0;
        this.field3831 &= 0x7;
        this.field3839 = arg0.method1051(1);
        this.field3841 = arg0.method1051(1);
        this.field3823 = arg0.method1051(1);
        this.field3835 = arg0.method1043(true);
        this.method1725(-81);
        this.field3837 = new short[this.field3835 * 2 + 1];
        for (int var2 = 0; var2 < this.field3837.length; var2++) {
            this.field3837[var2] = (short) arg0.method1051(1);
        }
        this.field3818 = class104.field1440[arg0.method1051(1)];
        int var3 = arg0.method1043(true);
        this.field3828 = (var3 & 0xE0) << 3;
        this.field3827 = var3 & 0x1F;
        if (this.field3827 != 31) {
            this.method1724((byte) -118);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 374)
    public static final int method1730(int arg0, int arg1) {
        field3846++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 != 255) {
            field3822 = (class280) null;
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
