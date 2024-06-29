import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class297 {

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[F")
    public float[] field4806 = new float[4];

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Z")
    public boolean field4809;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Z")
    public boolean field4818;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "[S")
    public short[] field4811;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    private int field4807;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lok;")
    private static class41 field4790 = class137.method956("flash3:", 45);

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lok;")
    public static class41 field4802 = field4790;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "Lok;")
    public static class41 field4814 = field4790;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lok;")
    public static class41 field4812 = class137.method956(" loggt sich ein)3", 45);

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Lok;")
    public static class41 field4817 = class137.method956(":allyreq:", 45);

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "F")
    public float field4794;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "F")
    public float field4800;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lf;")
    public class243 field4801;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZII)V", line = 5)
    public final void method2045(boolean arg0, int arg1, int arg2) {
        field4791++;
        int var4 = arg2 & this.field4807 + (this.field4804 * arg1 / 50);
        int var5 = this.field4792;
        int var6;
        if (var5 == 1) {
            var6 = (class31.field450[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class236.field3787[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field4794 = (float) ((this.field4796 * var6 >> 11) + this.field4793) / 2048.0F;
        float var7 = this.field4794 / 255.0F;
        this.field4806[0] = (float) (class217.method1563(this.field4810, 16722592) >> 16) * var7;
        this.field4806[2] = (float) class217.method1563(this.field4810, 255) * var7;
        this.field4806[1] = (float) class217.method1563(255, this.field4810 >> 8) * var7;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILth;Lth;IIJ)V", line = 82)
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, class126 arg4, class126 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class241 var10 = new class241();
        var10.field3856 = arg8;
        var10.field3851 = arg1 * 128 + 64;
        var10.field3847 = arg2 * 128 + 64;
        var10.field3859 = arg3;
        var10.field3864 = arg4;
        var10.field3854 = arg5;
        var10.field3855 = arg6;
        var10.field3860 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class205.field3312[var11][arg1][arg2] == null) {
                class205.field3312[var11][arg1][arg2] = new class308(var11, arg1, arg2);
            }
        }
        class205.field3312[arg0][arg1][arg2].field5210 = var10;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 110)
    private final void method2047(byte arg0) {
        if (arg0 > -39) {
            this.method2045(false, -21, 27);
        }
        int var2 = this.field4798;
        if (var2 == 2) {
            this.field4796 = 2048;
            this.field4804 = 2048;
            this.field4793 = 0;
            this.field4792 = 1;
        } else if (var2 == 3) {
            this.field4792 = 1;
            this.field4796 = 2048;
            this.field4804 = 4096;
            this.field4793 = 0;
        } else if (var2 == 4) {
            this.field4793 = 0;
            this.field4804 = 2048;
            this.field4796 = 2048;
            this.field4792 = 4;
        } else if (var2 == 5) {
            this.field4792 = 4;
            this.field4804 = 8192;
            this.field4793 = 0;
            this.field4796 = 2048;
        } else if (var2 == 12) {
            this.field4796 = 2048;
            this.field4804 = 2048;
            this.field4792 = 2;
            this.field4793 = 0;
        } else if (var2 == 13) {
            this.field4804 = 8192;
            this.field4796 = 2048;
            this.field4793 = 0;
            this.field4792 = 2;
        } else if (var2 == 10) {
            this.field4796 = 512;
            this.field4792 = 3;
            this.field4793 = 1536;
            this.field4804 = 2048;
        } else if (var2 == 11) {
            this.field4796 = 512;
            this.field4804 = 4096;
            this.field4793 = 1536;
            this.field4792 = 3;
        } else if (var2 == 6) {
            this.field4793 = 1280;
            this.field4796 = 768;
            this.field4804 = 2048;
            this.field4792 = 3;
        } else if (var2 == 7) {
            this.field4804 = 4096;
            this.field4792 = 3;
            this.field4793 = 1280;
            this.field4796 = 768;
        } else if (var2 == 8) {
            this.field4804 = 2048;
            this.field4792 = 3;
            this.field4793 = 1024;
            this.field4796 = 1024;
        } else if (var2 == 9) {
            this.field4796 = 1024;
            this.field4792 = 3;
            this.field4804 = 4096;
            this.field4793 = 1024;
        } else if (var2 == 14) {
            this.field4796 = 768;
            this.field4793 = 1280;
            this.field4804 = 2048;
            this.field4792 = 1;
        } else if (var2 == 15) {
            this.field4804 = 4096;
            this.field4792 = 1;
            this.field4793 = 1536;
            this.field4796 = 512;
        } else if (var2 == 16) {
            this.field4793 = 1792;
            this.field4804 = 8192;
            this.field4796 = 256;
            this.field4792 = 1;
        } else {
            this.field4793 = 0;
            this.field4796 = 2048;
            this.field4792 = 0;
            this.field4804 = 2048;
        }
        field4799++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 318)
    public static void method2048(int arg0) {
        field4790 = null;
        if (arg0 < -43) {
            field4802 = null;
            field4814 = null;
            field4812 = null;
            field4817 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BII)I", line = 345)
    public static final int method2049(byte[] arg0, int arg1, int arg2) {
        field4805++;
        if (arg2 != 0) {
            method2048(-69);
        }
        return class304.method2094(0, arg1, 112, arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 358)
    public static final void method2050(int arg0, int arg1, int arg2) {
        if (arg2 == 2012) {
            field4815++;
            class46 var3 = class195.method1396(13, arg0, false);
            var3.method337(0);
            var3.field721 = arg1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 413)
    protected class297() {
        if (class236.field3787 == null) {
            class5.method13(49);
        }
        this.method2047((byte) -105);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Llb;)V", line = 423)
    public class297(class112 arg0) {
        if (class236.field3787 == null) {
            class5.method13(55);
        }
        this.field4813 = arg0.method792(2);
        this.field4809 = (this.field4813 & 0x8) != 0;
        this.field4818 = (this.field4813 & 0x10) != 0;
        this.field4813 &= 0x7;
        this.field4803 = arg0.method759((byte) -59);
        this.field4808 = arg0.method759((byte) -70);
        this.field4795 = arg0.method759((byte) -47);
        this.field4816 = arg0.method792(2);
        this.method2051(768);
        this.field4811 = new short[this.field4816 * 2 + 1];
        for (int var2 = 0; var2 < this.field4811.length; var2++) {
            this.field4811[var2] = (short) arg0.method759((byte) -107);
        }
        this.field4810 = class31.field447[arg0.method759((byte) -117)];
        int var3 = arg0.method792(2);
        this.field4798 = var3 & 0x1F;
        this.field4807 = var3 & 0xE0 << 3;
        this.method2047((byte) -99);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 393)
    private final void method2051(int arg0) {
        int var2 = (this.field4816 << 7) + 64;
        if (arg0 != 768) {
            this.method2051(-33);
        }
        field4819++;
        this.field4800 = 1.0F / (float) (var2 * var2);
    }
}
