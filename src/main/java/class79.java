import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class79 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Z")
    public boolean field1064 = false;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[F")
    public float[] field1073 = new float[4];

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "Z")
    public boolean field1086;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
    public boolean field1057;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[S")
    public short[] field1077;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lrm;")
    public static class184 field1075 = new class184(64);

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lrm;")
    public static class184 field1078 = new class184(50);

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lkb;")
    public static class315 field1082 = new class315();

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "[I")
    public static int[] field1084 = new int[25];

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "F")
    public float field1063;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "F")
    public float field1076;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lrb;")
    public class155 field1069;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Luj;")
    public static class169 field1085;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V", line = 6)
    public final void method583(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1055 = arg3;
        this.field1065 = arg0;
        field1079++;
        if (arg1 == 4096) {
            this.field1080 = arg2;
            this.field1058 = arg4;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lvl;B)V", line = 20)
    public static final void method584(class6 arg0, byte arg1) {
        field1067++;
        int var2 = arg0.method52(-32768);
        class145.field2291 = new class68[var2];
        if (arg1 < 115) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class145.field2291[var3] = new class68();
            class145.field2291[var3].field956 = arg0.method52(-32768);
            class145.field2291[var3].field957 = arg0.method33((byte) -88);
        }
        class136.field2065 = arg0.method52(-32768);
        class96.field1267 = arg0.method52(-32768);
        class42.field575 = arg0.method52(-32768);
        class142.field2251 = new class187[class96.field1267 + 1 - class136.field2065];
        for (int var4 = 0; var4 < class42.field575; var4++) {
            int var5 = arg0.method52(-32768);
            class187 var6 = class142.field2251[var5] = new class187();
            var6.field1209 = arg0.method58(-288140008);
            var6.field1210 = arg0.method73((byte) 19);
            var6.field3009 = class136.field2065 + var5;
            var6.field3012 = arg0.method33((byte) -101);
            var6.field3014 = arg0.method33((byte) -85);
        }
        class244.field3812 = arg0.method73((byte) 19);
        class123.field1766 = true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V", line = 73)
    public final void method585(boolean arg0, int arg1, int arg2) {
        field1070++;
        int var4 = this.field1065 * arg2 / 50 + this.field1081 & 0x7FF;
        int var5 = this.field1080;
        int var6;
        if (var5 == 1) {
            var6 = (class31.field467[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class30.field447[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field1076 = (float) ((this.field1055 * var6 >> 11) + this.field1058) / 2048.0F;
        float var7 = this.field1076 / 255.0F;
        this.field1073[1] = var7 * (float) class333.method2319(this.field1062 >> 8, 255);
        if (arg1 == 19851) {
            this.field1073[2] = (float) class333.method2319(this.field1062, 255) * var7;
            this.field1073[0] = (float) class333.method2319(255, this.field1062 >> 16) * var7;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 159)
    private final void method586(byte arg0) {
        field1074++;
        int var2 = (this.field1056 << 7) + 64;
        if (arg0 > -28) {
            this.method583(-35, -47, -16, 112, 40);
        }
        this.field1063 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 176)
    public static void method587(int arg0) {
        field1084 = null;
        field1078 = null;
        field1085 = null;
        field1075 = null;
        field1082 = null;
        if (arg0 != -9997) {
            field1083 = 113;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 193)
    public static final void method588(byte arg0) {
        if (arg0 <= -115) {
            class171.field2811.method1355(false);
            field1059++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 208)
    private final void method589(int arg0) {
        field1066++;
        if (arg0 != 2048) {
            this.field1064 = false;
        }
        int var2 = this.field1071;
        if (var2 == 2) {
            this.field1065 = 2048;
            this.field1055 = 2048;
            this.field1058 = 0;
            this.field1080 = 1;
        } else if (var2 == 3) {
            this.field1080 = 1;
            this.field1055 = 2048;
            this.field1065 = 4096;
            this.field1058 = 0;
        } else if (var2 == 4) {
            this.field1055 = 2048;
            this.field1058 = 0;
            this.field1080 = 4;
            this.field1065 = 2048;
        } else if (var2 == 5) {
            this.field1055 = 2048;
            this.field1065 = 8192;
            this.field1058 = 0;
            this.field1080 = 4;
        } else if (var2 == 12) {
            this.field1080 = 2;
            this.field1055 = 2048;
            this.field1065 = 2048;
            this.field1058 = 0;
        } else if (var2 == 13) {
            this.field1055 = 2048;
            this.field1065 = 8192;
            this.field1080 = 2;
            this.field1058 = 0;
        } else if (var2 == 10) {
            this.field1065 = 2048;
            this.field1055 = 512;
            this.field1080 = 3;
            this.field1058 = 1536;
        } else if (var2 == 11) {
            this.field1080 = 3;
            this.field1058 = 1536;
            this.field1055 = 512;
            this.field1065 = 4096;
        } else if (var2 == 6) {
            this.field1055 = 768;
            this.field1080 = 3;
            this.field1058 = 1280;
            this.field1065 = 2048;
        } else if (var2 == 7) {
            this.field1065 = 4096;
            this.field1055 = 768;
            this.field1058 = 1280;
            this.field1080 = 3;
        } else if (var2 == 8) {
            this.field1055 = 1024;
            this.field1065 = 2048;
            this.field1058 = 1024;
            this.field1080 = 3;
        } else if (var2 == 9) {
            this.field1058 = 1024;
            this.field1065 = 4096;
            this.field1055 = 1024;
            this.field1080 = 3;
        } else if (var2 == 14) {
            this.field1065 = 2048;
            this.field1058 = 1280;
            this.field1055 = 768;
            this.field1080 = 1;
        } else if (var2 == 15) {
            this.field1065 = 4096;
            this.field1055 = 512;
            this.field1080 = 1;
            this.field1058 = 1536;
        } else if (var2 == 16) {
            this.field1058 = 1792;
            this.field1065 = 8192;
            this.field1055 = 256;
            this.field1080 = 1;
        } else {
            this.field1080 = 0;
            this.field1065 = 2048;
            this.field1058 = 0;
            this.field1055 = 2048;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 436)
    protected class79() {
        if (class30.field447 == null) {
            class297.method2069((byte) 112);
        }
        this.method589(2048);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lvl;)V", line = 446)
    public class79(class6 arg0) {
        if (class30.field447 == null) {
            class297.method2069((byte) -75);
        }
        this.field1061 = arg0.method58(-288140008);
        this.field1086 = (this.field1061 & 0x8) != 0;
        this.field1057 = (this.field1061 & 0x10) != 0;
        this.field1061 &= 0x7;
        this.field1068 = arg0.method39((byte) 75);
        this.field1072 = arg0.method39((byte) 113);
        this.field1060 = arg0.method39((byte) 119);
        this.field1056 = arg0.method58(-288140008);
        this.method586((byte) -39);
        this.field1077 = new short[this.field1056 * 2 + 1];
        for (int var2 = 0; var2 < this.field1077.length; var2++) {
            this.field1077[var2] = (short) arg0.method39((byte) 35);
        }
        this.field1062 = class31.field461[arg0.method39((byte) 104)];
        int var3 = arg0.method58(-288140008);
        this.field1081 = var3 & 0xE0 << 3;
        this.field1071 = var3 & 0x1F;
        if (this.field1071 != 31) {
            this.method589(2048);
        }
    }
}
