import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class314 {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[F")
    public float[] field4989 = new float[4];

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Z")
    public boolean field5015 = false;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public int field5007;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Z")
    public boolean field4995;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "Z")
    public boolean field5001;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "[S")
    public short[] field4992;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public int field4997;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
    public static boolean field4991 = false;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field4996 = -1;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lci;")
    public static class327 field4984 = new class327();

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field5014 = 0;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "F")
    public float field5004;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "F")
    public float field5005;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    private int field5006;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lwb;")
    public class266 field4990;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "Lth;")
    public static class57 field5013;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "[Lam;")
    public static class152[] field5000;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([IIII[J)V", line = 14)
    public static final void method2219(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg1 < arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (arg4[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method2219(arg0, arg1, var6 - 1, 124, arg4);
            method2219(arg0, var6 + 1, arg2, 124, arg4);
        }
        if (arg3 <= 120) {
            method2222(-41);
        }
        field5012++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lec;Lec;B)V", line = 68)
    public static final void method2220(class45 arg0, class45 arg1, byte arg2) {
        field5003++;
        if (arg1.field699 != null) {
            arg1.method330(15);
        }
        arg1.field699 = arg0.field699;
        arg1.field708 = arg0;
        int var3 = -123 / ((-arg2 - 41) / 33);
        arg1.field699.field708 = arg1;
        arg1.field708.field699 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 120)
    private final void method2221(int arg0) {
        int var2 = this.field4987;
        if (var2 == 2) {
            this.field4994 = 2048;
            this.field5009 = 0;
            this.field5011 = 2048;
            this.field5006 = 1;
        } else if (var2 == 3) {
            this.field5006 = 1;
            this.field4994 = 4096;
            this.field5011 = 2048;
            this.field5009 = 0;
        } else if (var2 == 4) {
            this.field5006 = 4;
            this.field5011 = 2048;
            this.field5009 = 0;
            this.field4994 = 2048;
        } else if (var2 == 5) {
            this.field5006 = 4;
            this.field5011 = 2048;
            this.field4994 = 8192;
            this.field5009 = 0;
        } else if (var2 == 12) {
            this.field5009 = 0;
            this.field5006 = 2;
            this.field5011 = 2048;
            this.field4994 = 2048;
        } else if (var2 == 13) {
            this.field5011 = 2048;
            this.field5006 = 2;
            this.field4994 = 8192;
            this.field5009 = 0;
        } else if (var2 == 10) {
            this.field5011 = 512;
            this.field5006 = 3;
            this.field4994 = 2048;
            this.field5009 = 1536;
        } else if (var2 == 11) {
            this.field5011 = 512;
            this.field5006 = 3;
            this.field5009 = 1536;
            this.field4994 = 4096;
        } else if (var2 == 6) {
            this.field5011 = 768;
            this.field5006 = 3;
            this.field4994 = 2048;
            this.field5009 = 1280;
        } else if (var2 == 7) {
            this.field5009 = 1280;
            this.field4994 = 4096;
            this.field5011 = 768;
            this.field5006 = 3;
        } else if (var2 == 8) {
            this.field5011 = 1024;
            this.field5009 = 1024;
            this.field4994 = 2048;
            this.field5006 = 3;
        } else if (var2 == 9) {
            this.field4994 = 4096;
            this.field5011 = 1024;
            this.field5006 = 3;
            this.field5009 = 1024;
        } else if (var2 == 14) {
            this.field5009 = 1280;
            this.field5011 = 768;
            this.field4994 = 2048;
            this.field5006 = 1;
        } else if (var2 == 15) {
            this.field5011 = 512;
            this.field4994 = 4096;
            this.field5006 = 1;
            this.field5009 = 1536;
        } else if (var2 == 16) {
            this.field4994 = 8192;
            this.field5011 = 256;
            this.field5006 = 1;
            this.field5009 = 1792;
        } else {
            this.field5009 = 0;
            this.field5006 = 0;
            this.field4994 = 2048;
            this.field5011 = 2048;
        }
        field4982++;
        if (arg0 != -25634) {
            this.field5006 = -65;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 281)
    public static void method2222(int arg0) {
        field5013 = null;
        field5000 = null;
        if (arg0 != 2048) {
            field5014 = 49;
        }
        field4984 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)V", line = 293)
    public final void method2223(int arg0, boolean arg1, int arg2) {
        field4983++;
        if (arg0 != -2042198101) {
            method2220((class45) null, (class45) null, (byte) 6);
        }
        int var4 = this.field4988 + (this.field4994 * arg2 / 50) & 0x7FF;
        int var5 = this.field5006;
        int var6;
        if (var5 == 1) {
            var6 = (class153.field2438[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class90.field1517[var4] >> 1;
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
        this.field5005 = (float) ((this.field5011 * var6 >> 11) + this.field5009) / 2048.0F;
        float var7 = this.field5005 / 255.0F;
        this.field4989[1] = var7 * (float) class343.method2418(255, this.field4997 >> 8);
        this.field4989[2] = (float) class343.method2418(this.field4997, 255) * var7;
        this.field4989[0] = (float) class343.method2418(255, this.field4997 >> 16) * var7;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 377)
    public static final void method2224(byte arg0) {
        field4985++;
        class338.field5387 = 0;
        if (arg0 > -109) {
            method2222(39);
        }
        class335.field5305 = 0;
        class101.field1658 = -1;
        class277.field4565 = 0;
        class241.field3988 = 0;
        class326.field5182 = false;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V", line = 404)
    public final void method2225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4994 = arg2;
        if (arg4 < 116) {
            this.field4995 = false;
        }
        this.field5006 = arg0;
        this.field5009 = arg3;
        field4986++;
        this.field5011 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 460)
    protected class314() {
        if (class90.field1517 == null) {
            class210.method1589(16744831);
        }
        this.method2221(-25634);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lqm;)V", line = 471)
    public class314(class227 arg0) {
        if (class90.field1517 == null) {
            class210.method1589(16744831);
        }
        this.field5007 = arg0.method1720((byte) -109);
        this.field4995 = (this.field5007 & 0x8) != 0;
        this.field5001 = (this.field5007 & 0x10) != 0;
        this.field5007 &= 0x7;
        this.field5008 = arg0.method1765(true);
        this.field4999 = arg0.method1765(true);
        this.field5002 = arg0.method1765(true);
        this.field4993 = arg0.method1720((byte) -115);
        this.method2226(-1788034393);
        this.field4992 = new short[this.field4993 * 2 + 1];
        for (int var2 = 0; var2 < this.field4992.length; var2++) {
            this.field4992[var2] = (short) arg0.method1765(true);
        }
        this.field4997 = class153.field2444[arg0.method1765(true)];
        int var3 = arg0.method1720((byte) -88);
        this.field4988 = (var3 & 0xE0) << 3;
        this.field4987 = var3 & 0x1F;
        if (this.field4987 != 31) {
            this.method2221(-25634);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V", line = 440)
    private final void method2226(int arg0) {
        if (arg0 != -1788034393) {
            this.field5007 = 44;
        }
        field4998++;
        int var2 = (this.field4993 << 7) + 64;
        this.field5004 = 1.0F / (float) (var2 * var2);
    }
}
