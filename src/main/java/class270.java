import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class270 {

    @OriginalMember(owner = "client!re", name = "w", descriptor = "[F")
    public float[] field4022 = new float[4];

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Z")
    public boolean field4029 = false;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
    public boolean field4001;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Z")
    public boolean field4024;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public int field4026;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[S")
    public short[] field4017;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    private int field4023;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field4028 = 0;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "[I")
    public static int[] field4027 = new int[2048];

    @OriginalMember(owner = "client!re", name = "n", descriptor = "F")
    public float field4013;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "F")
    public float field4021;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    private int field4005;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lwf;")
    public class233 field4006;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V", line = 10)
    public final void method1856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4018 = arg3;
        field4004++;
        this.field4014 = arg4;
        this.field4012 = arg2;
        this.field4005 = arg1;
        if (arg0 != -1870576501) {
            method1857((byte) 5);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 30)
    public static final void method1857(byte arg0) {
        if (class171.field2336 != null) {
            class207 var1 = class171.field2336;
            synchronized (class171.field2336) {
                class171.field2336 = null;
            }
        }
        field4002++;
        if (arg0 != -30) {
            field4027 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V", line = 60)
    public final void method1858(int arg0, boolean arg1, int arg2) {
        field4007++;
        int var4 = this.field4005 * arg0 / 50 + this.field4023 & 0x7FF;
        int var5 = this.field4012;
        int var6;
        if (var5 == 1) {
            var6 = (class184.field2538[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class92.field1280[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        if (arg2 != -21587) {
            this.method1863(-13);
        }
        this.field4013 = (float) ((this.field4018 * var6 >> 11) + this.field4014) / 2048.0F;
        float var7 = this.field4013 / 255.0F;
        this.field4022[0] = var7 * (float) (class47.method303(this.field4016, 16746615) >> 16);
        this.field4022[2] = (float) class47.method303(this.field4016, 255) * var7;
        this.field4022[1] = var7 * (float) (class47.method303(65451, this.field4016) >> 8);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 142)
    public static void method1859(int arg0) {
        field4027 = null;
        if (arg0 != -24828) {
            field4009 = -114;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lkm;III)[Ltj;", line = 154)
    public static final class258[] method1860(class133 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 11107) {
            field4028 = -81;
        }
        field4003++;
        return class129.method931(arg2, arg1, arg0, (byte) 90) ? class131.method937((byte) -112) : null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lin;III)V", line = 170)
    public static final void method1861(class344 arg0, int arg1, int arg2, int arg3) {
        field4015++;
        if (class204.field2938 < 2 && class1.field15 == 0 && !class124.field1676 || arg1 != 18020) {
            return;
        }
        String var4 = class160.method1153(0);
        if (arg0 == null) {
            int var5 = class204.field2946.method1915(var4, arg2 + 4, arg3 - -15, 16777215, 0, class153.field2125, class266.field3884);
            class253.method1728(class204.field2946.method1904(var4) + var5, 15, (byte) -59, arg3, arg2 + 4);
            return;
        }
        class277 var6 = arg0.method2372(class141.field1935, -18);
        if (var6 == null) {
            var6 = class204.field2946;
        }
        var6.method1916(var4, arg2, arg3, arg0.field5334, arg0.field5293, arg0.field5281, arg0.field5277, arg0.field5212, arg0.field5178, class153.field2125, class266.field3884, class19.field250);
        class253.method1728(class19.field250[2], class19.field250[3], (byte) -90, class19.field250[1], class19.field250[0]);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 205)
    private final void method1862(int arg0) {
        field4020++;
        int var2 = (this.field4026 << 7) + 64;
        this.field4021 = 1.0F / (float) (var2 * var2);
        if (arg0 != 7) {
            this.method1858(-59, false, 59);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 224)
    private final void method1863(int arg0) {
        int var2 = 91 % ((arg0 + 76) / 39);
        int var3 = this.field4019;
        if (var3 == 2) {
            this.field4012 = 1;
            this.field4018 = 2048;
            this.field4005 = 2048;
            this.field4014 = 0;
        } else if (var3 == 3) {
            this.field4005 = 4096;
            this.field4018 = 2048;
            this.field4012 = 1;
            this.field4014 = 0;
        } else if (var3 == 4) {
            this.field4014 = 0;
            this.field4012 = 4;
            this.field4005 = 2048;
            this.field4018 = 2048;
        } else if (var3 == 5) {
            this.field4012 = 4;
            this.field4014 = 0;
            this.field4018 = 2048;
            this.field4005 = 8192;
        } else if (var3 == 12) {
            this.field4005 = 2048;
            this.field4012 = 2;
            this.field4018 = 2048;
            this.field4014 = 0;
        } else if (var3 == 13) {
            this.field4012 = 2;
            this.field4005 = 8192;
            this.field4014 = 0;
            this.field4018 = 2048;
        } else if (var3 == 10) {
            this.field4005 = 2048;
            this.field4012 = 3;
            this.field4014 = 1536;
            this.field4018 = 512;
        } else if (var3 == 11) {
            this.field4018 = 512;
            this.field4005 = 4096;
            this.field4014 = 1536;
            this.field4012 = 3;
        } else if (var3 == 6) {
            this.field4014 = 1280;
            this.field4005 = 2048;
            this.field4018 = 768;
            this.field4012 = 3;
        } else if (var3 == 7) {
            this.field4005 = 4096;
            this.field4018 = 768;
            this.field4012 = 3;
            this.field4014 = 1280;
        } else if (var3 == 8) {
            this.field4018 = 1024;
            this.field4014 = 1024;
            this.field4012 = 3;
            this.field4005 = 2048;
        } else if (var3 == 9) {
            this.field4018 = 1024;
            this.field4012 = 3;
            this.field4005 = 4096;
            this.field4014 = 1024;
        } else if (var3 == 14) {
            this.field4012 = 1;
            this.field4005 = 2048;
            this.field4018 = 768;
            this.field4014 = 1280;
        } else if (var3 == 15) {
            this.field4018 = 512;
            this.field4014 = 1536;
            this.field4005 = 4096;
            this.field4012 = 1;
        } else if (var3 == 16) {
            this.field4018 = 256;
            this.field4005 = 8192;
            this.field4014 = 1792;
            this.field4012 = 1;
        } else {
            this.field4012 = 0;
            this.field4014 = 0;
            this.field4005 = 2048;
            this.field4018 = 2048;
        }
        field4011++;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 432)
    protected class270() {
        if (class92.field1280 == null) {
            class48.method304(true);
        }
        this.method1863(-33);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lcg;)V", line = 442)
    public class270(class316 arg0) {
        if (class92.field1280 == null) {
            class48.method304(true);
        }
        this.field4010 = arg0.method2219(16448);
        this.field4001 = (this.field4010 & 0x8) != 0;
        this.field4024 = (this.field4010 & 0x10) != 0;
        this.field4010 &= 0x7;
        this.field4025 = arg0.method2220((byte) 45);
        this.field4008 = arg0.method2220((byte) 117);
        this.field4000 = arg0.method2220((byte) 111);
        this.field4026 = arg0.method2219(16448);
        this.method1862(7);
        this.field4017 = new short[this.field4026 * 2 + 1];
        for (int var2 = 0; var2 < this.field4017.length; var2++) {
            this.field4017[var2] = (short) arg0.method2220((byte) 123);
        }
        this.field4016 = class184.field2527[arg0.method2220((byte) 50)];
        int var3 = arg0.method2219(16448);
        this.field4023 = var3 & 0xE0 << 3;
        this.field4019 = var3 & 0x1F;
        if (this.field4019 != 31) {
            this.method1863(65);
        }
    }
}
