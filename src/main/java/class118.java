import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class118 {

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[F")
    public float[] field2075 = new float[4];

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
    public boolean field2071 = false;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Z")
    public boolean field2087;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Z")
    public boolean field2068;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "[S")
    public short[] field2094;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    private int field2081;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lke;")
    private static class256 field2074 = class316.method2202("slide:", 27626);

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Lke;")
    public static class256 field2078 = field2074;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lke;")
    public static class256 field2084 = field2074;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field2086 = -2;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field2101 = -1;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "F")
    public float field2072;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "F")
    public float field2080;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lng;")
    public static class138 field2076;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Lba;")
    public class158 field2098;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[Lrd;")
    public static class135[] field2097;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "[Lel;")
    public static class232[] field2077;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[[[I")
    public static int[][][] field2090;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 11)
    public static final void method803(byte arg0) {
        if (arg0 > -76) {
            return;
        }
        field2088++;
        if (class104.field1856 != null && class321.field5494 != null) {
            return;
        }
        class104.field1856 = new int[256];
        class321.field5494 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class104.field1856[var1] = (int) (Math.sin(var2) * 4096.0D);
            class321.field5494[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 48)
    public static void method804(int arg0) {
        field2074 = null;
        if (arg0 <= 20) {
            field2077 = (class232[]) null;
        }
        field2090 = (int[][][]) null;
        field2077 = null;
        field2097 = null;
        field2076 = null;
        field2084 = null;
        field2078 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZI)V", line = 73)
    public final void method805(boolean arg0, boolean arg1, int arg2) {
        field2100++;
        int var4 = this.field2083 * arg2 / 50 + this.field2095 & 0x7FF;
        if (!arg1) {
            this.field2089 = -65;
        }
        int var5 = this.field2069;
        int var6;
        if (var5 == 1) {
            var6 = (class136.field2366[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class302.field5201[var4] >> 1;
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
        this.field2072 = (float) ((this.field2089 * var6 >> 11) + this.field2093) / 2048.0F;
        float var7 = this.field2072 / 255.0F;
        this.field2075[1] = var7 * (float) (class150.method1123(65491, this.field2091) >> 8);
        this.field2075[0] = (float) (class150.method1123(16747126, this.field2091) >> 16) * var7;
        this.field2075[2] = (float) class150.method1123(255, this.field2091) * var7;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 189)
    private final void method806(byte arg0) {
        int var2 = this.field2081;
        if (var2 == 2) {
            this.field2093 = 0;
            this.field2089 = 2048;
            this.field2069 = 1;
            this.field2083 = 2048;
        } else if (var2 == 3) {
            this.field2093 = 0;
            this.field2089 = 2048;
            this.field2083 = 4096;
            this.field2069 = 1;
        } else if (var2 == 4) {
            this.field2093 = 0;
            this.field2083 = 2048;
            this.field2089 = 2048;
            this.field2069 = 4;
        } else if (var2 == 5) {
            this.field2093 = 0;
            this.field2083 = 8192;
            this.field2069 = 4;
            this.field2089 = 2048;
        } else if (var2 == 12) {
            this.field2069 = 2;
            this.field2093 = 0;
            this.field2089 = 2048;
            this.field2083 = 2048;
        } else if (var2 == 13) {
            this.field2093 = 0;
            this.field2089 = 2048;
            this.field2083 = 8192;
            this.field2069 = 2;
        } else if (var2 == 10) {
            this.field2069 = 3;
            this.field2093 = 1536;
            this.field2083 = 2048;
            this.field2089 = 512;
        } else if (var2 == 11) {
            this.field2093 = 1536;
            this.field2083 = 4096;
            this.field2089 = 512;
            this.field2069 = 3;
        } else if (var2 == 6) {
            this.field2083 = 2048;
            this.field2089 = 768;
            this.field2069 = 3;
            this.field2093 = 1280;
        } else if (var2 == 7) {
            this.field2093 = 1280;
            this.field2089 = 768;
            this.field2083 = 4096;
            this.field2069 = 3;
        } else if (var2 == 8) {
            this.field2089 = 1024;
            this.field2083 = 2048;
            this.field2069 = 3;
            this.field2093 = 1024;
        } else if (var2 == 9) {
            this.field2069 = 3;
            this.field2089 = 1024;
            this.field2093 = 1024;
            this.field2083 = 4096;
        } else if (var2 == 14) {
            this.field2093 = 1280;
            this.field2069 = 1;
            this.field2089 = 768;
            this.field2083 = 2048;
        } else if (var2 == 15) {
            this.field2069 = 1;
            this.field2083 = 4096;
            this.field2089 = 512;
            this.field2093 = 1536;
        } else if (var2 == 16) {
            this.field2093 = 1792;
            this.field2083 = 8192;
            this.field2069 = 1;
            this.field2089 = 256;
        } else {
            this.field2083 = 2048;
            this.field2093 = 0;
            this.field2069 = 0;
            this.field2089 = 2048;
        }
        if (arg0 > -96) {
            this.method805(false, true, -31);
        }
        field2070++;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 354)
    private final void method807(int arg0) {
        field2085++;
        int var2 = (this.field2082 << 7) + 64;
        this.field2080 = 1.0F / (float) (var2 * var2);
        if (arg0 >= -126) {
            method803((byte) 33);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 401)
    protected class118() {
        if (class302.field5201 == null) {
            class313.method2169(-64);
        }
        this.method806((byte) -107);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lra;)V", line = 425)
    public class118(class41 arg0) {
        if (class302.field5201 == null) {
            class313.method2169(-64);
        }
        this.field2099 = arg0.method357(false);
        this.field2087 = (this.field2099 & 0x8) != 0;
        this.field2068 = (this.field2099 & 0x10) != 0;
        this.field2099 &= 0x7;
        this.field2096 = arg0.method346(-16);
        this.field2092 = arg0.method346(-16);
        this.field2079 = arg0.method346(-16);
        this.field2082 = arg0.method357(false);
        this.method807(-127);
        this.field2094 = new short[this.field2082 * 2 + 1];
        for (int var2 = 0; var2 < this.field2094.length; var2++) {
            this.field2094[var2] = (short) arg0.method346(-16);
        }
        this.field2091 = class136.field2370[arg0.method346(-16)];
        int var3 = arg0.method357(false);
        this.field2081 = var3 & 0x1F;
        this.field2095 = var3 & 0xE0 << 3;
        this.method806((byte) -101);
    }
}
