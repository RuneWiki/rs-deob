import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class195 {

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[F")
    public float[] field3254 = new float[4];

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Z")
    public boolean field3259;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Z")
    public boolean field3241;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[S")
    public short[] field3258;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lvm;")
    public static class202 field3251 = new class202(5);

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lph;")
    public static class229 field3267 = class266.method1858("event_opbase", 0);

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[[I")
    public static int[][] field3269 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Lph;")
    public static class229 field3272 = class266.method1858(" autres options", 0);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "F")
    public float field3245;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "F")
    public float field3257;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "F")
    public static float field3268;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field3242;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lgh;")
    public class35 field3255;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Lsi;")
    public static class66 field3270;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lsi;")
    public static class66 field3271;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 6)
    private final void method1376(byte arg0) {
        field3249++;
        int var2 = (this.field3264 << 7) + 64;
        this.field3245 = 1.0F / (float) (var2 * var2);
        if (arg0 <= 8) {
            method1381((byte) 107);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 37)
    public static void method1377(int arg0) {
        field3271 = null;
        if (arg0 > -73) {
            field3269 = (int[][]) ((int[][]) null);
        }
        field3270 = null;
        field3269 = (int[][]) null;
        field3267 = null;
        field3251 = null;
        field3272 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 53)
    private final void method1378(int arg0) {
        if (arg0 != 12) {
            field3252 = 105;
        }
        int var2 = this.field3240;
        if (var2 == 2) {
            this.field3250 = 2048;
            this.field3242 = 2048;
            this.field3260 = 1;
            this.field3248 = 0;
        } else if (var2 == 3) {
            this.field3248 = 0;
            this.field3242 = 4096;
            this.field3250 = 2048;
            this.field3260 = 1;
        } else if (var2 == 4) {
            this.field3248 = 0;
            this.field3242 = 2048;
            this.field3260 = 4;
            this.field3250 = 2048;
        } else if (var2 == 5) {
            this.field3260 = 4;
            this.field3248 = 0;
            this.field3250 = 2048;
            this.field3242 = 8192;
        } else if (var2 == 12) {
            this.field3260 = 2;
            this.field3250 = 2048;
            this.field3248 = 0;
            this.field3242 = 2048;
        } else if (var2 == 13) {
            this.field3248 = 0;
            this.field3250 = 2048;
            this.field3260 = 2;
            this.field3242 = 8192;
        } else if (var2 == 10) {
            this.field3250 = 512;
            this.field3248 = 1536;
            this.field3260 = 3;
            this.field3242 = 2048;
        } else if (var2 == 11) {
            this.field3250 = 512;
            this.field3242 = 4096;
            this.field3248 = 1536;
            this.field3260 = 3;
        } else if (var2 == 6) {
            this.field3260 = 3;
            this.field3242 = 2048;
            this.field3248 = 1280;
            this.field3250 = 768;
        } else if (var2 == 7) {
            this.field3242 = 4096;
            this.field3260 = 3;
            this.field3248 = 1280;
            this.field3250 = 768;
        } else if (var2 == 8) {
            this.field3250 = 1024;
            this.field3248 = 1024;
            this.field3242 = 2048;
            this.field3260 = 3;
        } else if (var2 == 9) {
            this.field3242 = 4096;
            this.field3260 = 3;
            this.field3248 = 1024;
            this.field3250 = 1024;
        } else if (var2 == 14) {
            this.field3248 = 1280;
            this.field3260 = 1;
            this.field3250 = 768;
            this.field3242 = 2048;
        } else if (var2 == 15) {
            this.field3248 = 1536;
            this.field3260 = 1;
            this.field3250 = 512;
            this.field3242 = 4096;
        } else if (var2 == 16) {
            this.field3260 = 1;
            this.field3242 = 8192;
            this.field3248 = 1792;
            this.field3250 = 256;
        } else {
            this.field3250 = 2048;
            this.field3248 = 0;
            this.field3260 = 0;
            this.field3242 = 2048;
        }
        field3256++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lsi;Z)V", line = 256)
    public static final void method1379(class66 arg0, boolean arg1) {
        if (arg1) {
            field3266++;
            class225.field3704 = arg0.method498(class233.field3848, -1);
            class156.field2527 = arg0.method498(class1.field11, -1);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)V", line = 269)
    public final void method1380(boolean arg0, int arg1, int arg2) {
        field3247++;
        int var4 = this.field3242 * arg2 / 50 + this.field3253 & 0x7FF;
        int var5 = this.field3260;
        int var6;
        if (var5 == 1) {
            var6 = (class310.field5199[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class58.field816[var4] >> 1;
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
        this.field3257 = (float) ((this.field3250 * var6 >> 11) + this.field3248) / 2048.0F;
        float var7 = this.field3257 / 255.0F;
        this.field3254[0] = (float) (class243.method1696(16760812, this.field3246) >> 16) * var7;
        this.field3254[2] = (float) class243.method1696(255, this.field3246) * var7;
        if (arg1 >= -3) {
            method1379((class66) null, false);
        }
        this.field3254[1] = var7 * (float) class243.method1696(255, this.field3246 >> 8);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Lph;", line = 347)
    public static final class229 method1381(byte arg0) {
        field3243++;
        class229 var1 = class260.field4342;
        if (class112.field1900 != 0) {
            var1 = class202.field3341;
        }
        class229 var2 = class134.field2172;
        if (arg0 < 55) {
            method1377(38);
        }
        if (class232.field3830 != null) {
            var2 = class248.method1746(8528, new class229[] { class329.field5616, class232.field3830 });
        }
        return class248.method1746(8528, new class229[] { class293.field4791, var1, class170.field2798, class50.method354(0, class276.field4599), class190.field3088, class50.method354(0, class48.field709), var2, class187.field3038 });
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 379)
    protected class195() {
        if (class58.field816 == null) {
            class196.method1382(-10052);
        }
        this.method1378(12);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lhb;)V", line = 398)
    public class195(class164 arg0) {
        if (class58.field816 == null) {
            class196.method1382(-10052);
        }
        this.field3262 = arg0.method1178(8);
        this.field3259 = (this.field3262 & 0x8) != 0;
        this.field3241 = (this.field3262 & 0x10) != 0;
        this.field3262 &= 0x7;
        this.field3244 = arg0.method1161(true);
        this.field3263 = arg0.method1161(true);
        this.field3261 = arg0.method1161(true);
        this.field3264 = arg0.method1178(8);
        this.method1376((byte) 110);
        this.field3258 = new short[this.field3264 * 2 + 1];
        for (int var2 = 0; var2 < this.field3258.length; var2++) {
            this.field3258[var2] = (short) arg0.method1161(true);
        }
        this.field3246 = class310.field5203[arg0.method1161(true)];
        int var3 = arg0.method1178(8);
        this.field3253 = (var3 & 0xE0) << 3;
        this.field3240 = var3 & 0x1F;
        this.method1378(12);
    }
}
