import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class151 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "F")
    public float field2302 = 0.25F;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "F")
    public float field2304 = 1.0F;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "F")
    public float field2314 = 1.0F;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "F")
    public float field2311;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "F")
    public float field2313;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "F")
    public float field2310;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lmd;")
    public class379 field2305;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[S")
    public static short[] field2309 = new short[256];

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[I")
    public static int[] field2316 = new int[5];

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Z")
    public static boolean field2320 = false;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lao;")
    public static class188 field2308 = new class188(0, 5);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public static final void method1092(int arg0, int arg1) {
        field2317++;
        class480.field7037 = -1;
        class251.field3626 = null;
        class459.field6777 = 0;
        class494.field7205 = false;
        class264.field3815 = arg0;
        class156.field2378 = -1;
        if (arg1 != 1221) {
            method1094(106);
        }
        class43.field655 = 1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1093(int arg0, byte arg1, int arg2) {
        int var3 = -34 / ((4 - arg1) / 54);
        field2318++;
        if ((class145.method1041(arg2, (byte) 108, arg0) | (arg0 & 0x10000) != 0) || class503.method2993(arg2, arg0, (byte) -9)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class108.method805(arg0, -117, arg2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1094(int arg0) {
        if (arg0 >= -127) {
            method1094(-122);
        }
        field2308 = null;
        field2309 = null;
        field2316 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILti;)V")
    public final void method1095(int arg0, class303 arg1) {
        this.field2314 = (float) (arg1.method1918((byte) -103) * 8) / 255.0F;
        field2303++;
        this.field2302 = (float) (arg1.method1918((byte) 120) * arg0) / 255.0F;
        this.field2304 = (float) (arg1.method1918((byte) 121) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILui;)Z")
    public final boolean method1096(int arg0, class151 arg1) {
        if (arg0 <= 0) {
            this.method1095(81, null);
        }
        field2306++;
        return this.field2307 == arg1.field2307 && this.field2310 == arg1.field2310 && this.field2311 == arg1.field2311 && this.field2313 == arg1.field2313 && this.field2302 == arg1.field2302 && this.field2314 == arg1.field2314 && this.field2304 == arg1.field2304 && this.field2321 == arg1.field2321 && this.field2301 == arg1.field2301 && this.field2305 == arg1.field2305;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class151() {
        this.field2312 = -60;
        this.field2321 = class478.field7017;
        this.field2307 = class104.field1649;
        this.field2311 = 0.69921875F;
        this.field2313 = 1.2F;
        this.field2315 = -50;
        this.field2310 = 1.1523438F;
        this.field2319 = -50;
        this.field2305 = class389.field5757;
        this.field2301 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lti;)V")
    public class151(class303 arg0) {
        int var2 = arg0.method1918((byte) -124);
        if (class397.field5830.method59((byte) 114, class399.field5865) && class14.field242.method488() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2307 = class104.field1649;
            } else {
                this.field2307 = arg0.method1870(-1945262512);
            }
            if ((var2 & 0x2) == 0) {
                this.field2310 = 1.1523438F;
            } else {
                this.field2310 = (float) arg0.method1868(0) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2311 = 0.69921875F;
            } else {
                this.field2311 = (float) arg0.method1868(0) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2313 = 1.2F;
            } else {
                this.field2313 = (float) arg0.method1868(0) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1870(-1945262512);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1868(0);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1868(0);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1868(0);
            }
            this.field2311 = 0.69921875F;
            this.field2307 = class104.field1649;
            this.field2313 = 1.2F;
            this.field2310 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2315 = -50;
            this.field2319 = -50;
            this.field2312 = -60;
        } else {
            this.field2315 = arg0.method1901(127);
            this.field2312 = arg0.method1901(118);
            this.field2319 = arg0.method1901(126);
        }
        if ((var2 & 0x20) == 0) {
            this.field2321 = class478.field7017;
        } else {
            this.field2321 = arg0.method1870(-1945262512);
        }
        if ((var2 & 0x40) == 0) {
            this.field2301 = 0;
        } else {
            this.field2301 = arg0.method1868(0);
        }
        if ((var2 & 0x80) == 0) {
            this.field2305 = class389.field5757;
        } else {
            int var3 = arg0.method1868(0);
            int var4 = arg0.method1868(0);
            int var5 = arg0.method1868(0);
            int var6 = arg0.method1868(0);
            int var7 = arg0.method1868(0);
            int var8 = arg0.method1868(0);
            this.field2305 = class494.method2945(var3, var5, var6, var7, var8, var4, 89);
        }
    }
}
