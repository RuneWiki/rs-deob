import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class204 {

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
    public boolean field3063 = false;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[F")
    public float[] field3057 = new float[4];

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Z")
    public boolean field3055;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Z")
    public boolean field3066;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[S")
    public short[] field3075;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3076 = "yellow:";

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "F")
    public float field3072;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "F")
    public float field3073;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    private int field3065;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lmh;")
    public class72 field3058;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1443(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 != 1536) {
            return false;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class85 var3 = class201.method1431(-109, arg1);
        field3062++;
        return var3.method614(arg2, -1);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 61)
    private final void method1444(int arg0) {
        int var2 = this.field3060;
        if (var2 == 2) {
            this.field3077 = 1;
            this.field3059 = 0;
            this.field3065 = 2048;
            this.field3050 = 2048;
        } else if (var2 == 3) {
            this.field3065 = 2048;
            this.field3050 = 4096;
            this.field3077 = 1;
            this.field3059 = 0;
        } else if (var2 == 4) {
            this.field3059 = 0;
            this.field3077 = 4;
            this.field3065 = 2048;
            this.field3050 = 2048;
        } else if (var2 == 5) {
            this.field3059 = 0;
            this.field3050 = 8192;
            this.field3077 = 4;
            this.field3065 = 2048;
        } else if (var2 == 12) {
            this.field3050 = 2048;
            this.field3059 = 0;
            this.field3065 = 2048;
            this.field3077 = 2;
        } else if (var2 == 13) {
            this.field3077 = 2;
            this.field3059 = 0;
            this.field3065 = 2048;
            this.field3050 = 8192;
        } else if (var2 == 10) {
            this.field3059 = 1536;
            this.field3065 = 512;
            this.field3077 = 3;
            this.field3050 = 2048;
        } else if (var2 == 11) {
            this.field3077 = 3;
            this.field3050 = 4096;
            this.field3065 = 512;
            this.field3059 = 1536;
        } else if (var2 == 6) {
            this.field3065 = 768;
            this.field3050 = 2048;
            this.field3077 = 3;
            this.field3059 = 1280;
        } else if (var2 == 7) {
            this.field3077 = 3;
            this.field3050 = 4096;
            this.field3059 = 1280;
            this.field3065 = 768;
        } else if (var2 == 8) {
            this.field3065 = 1024;
            this.field3059 = 1024;
            this.field3050 = 2048;
            this.field3077 = 3;
        } else if (var2 == 9) {
            this.field3059 = 1024;
            this.field3077 = 3;
            this.field3065 = 1024;
            this.field3050 = 4096;
        } else if (var2 == 14) {
            this.field3050 = 2048;
            this.field3059 = 1280;
            this.field3077 = 1;
            this.field3065 = 768;
        } else if (var2 == 15) {
            this.field3050 = 4096;
            this.field3077 = 1;
            this.field3059 = 1536;
            this.field3065 = 512;
        } else if (var2 == 16) {
            this.field3065 = 256;
            this.field3050 = 8192;
            this.field3077 = 1;
            this.field3059 = 1792;
        } else {
            this.field3050 = 2048;
            this.field3077 = 0;
            this.field3065 = 2048;
            this.field3059 = 0;
        }
        if (arg0 == 4096) {
            field3053++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z[I)[I", line = 231)
    public static final int[] method1445(boolean arg0, int[] arg1) {
        if (!arg0) {
            method1447((byte) -18);
        }
        field3056++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class343.method2378(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 256)
    private final void method1446(int arg0) {
        int var2 = (this.field3068 << 7) + 64;
        this.field3072 = 1.0F / (float) (var2 * var2);
        field3054++;
        if (arg0 != 21702) {
            method1447((byte) -70);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 415)
    protected class204() {
        if (class98.field1559 == null) {
            class276.method1892((byte) 93);
        }
        this.method1444(4096);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lkh;)V", line = 426)
    public class204(class166 arg0) {
        if (class98.field1559 == null) {
            class276.method1892((byte) 85);
        }
        this.field3078 = arg0.method1178(0);
        this.field3055 = (this.field3078 & 0x8) != 0;
        this.field3066 = (this.field3078 & 0x10) != 0;
        this.field3078 &= 0x7;
        this.field3061 = arg0.method1151(-90);
        this.field3070 = arg0.method1151(-48);
        this.field3051 = arg0.method1151(-79);
        this.field3068 = arg0.method1178(0);
        this.method1446(21702);
        this.field3075 = new short[this.field3068 * 2 + 1];
        for (int var2 = 0; var2 < this.field3075.length; var2++) {
            this.field3075[var2] = (short) arg0.method1151(-71);
        }
        this.field3067 = class15.field215[arg0.method1151(-97)];
        int var3 = arg0.method1178(0);
        this.field3064 = var3 & 0xE0 << 3;
        this.field3060 = var3 & 0x1F;
        if (this.field3060 != 31) {
            this.method1444(4096);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 282)
    public static final void method1447(byte arg0) {
        class276.field4260.method2176((byte) -84);
        if (arg0 < 92) {
            field3071 = 72;
        }
        field3069++;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 295)
    public static void method1448(int arg0) {
        if (arg0 != 255) {
            field3076 = (String) null;
        }
        field3076 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZB)V", line = 309)
    public final void method1449(int arg0, boolean arg1, byte arg2) {
        field3074++;
        int var4 = this.field3050 * arg0 / 50 + this.field3064 & 0x7FF;
        int var5 = this.field3077;
        int var6;
        if (var5 == 1) {
            var6 = (class15.field204[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class98.field1559[var4] >> 1;
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
        this.field3073 = (float) (this.field3059 + (this.field3065 * var6 >> 11)) / 2048.0F;
        if (arg2 != 44) {
            this.field3065 = 35;
        }
        float var7 = this.field3073 / 255.0F;
        this.field3057[1] = var7 * (float) class270.method1860(255, this.field3067 >> 8);
        this.field3057[2] = (float) class270.method1860(255, this.field3067) * var7;
        this.field3057[0] = (float) class270.method1860(255, this.field3067 >> 16) * var7;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIBI)V", line = 395)
    public final void method1450(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3052++;
        this.field3050 = arg4;
        this.field3065 = arg0;
        if (arg3 >= -59) {
            this.field3065 = -82;
        }
        this.field3059 = arg1;
        this.field3077 = arg2;
    }
}
