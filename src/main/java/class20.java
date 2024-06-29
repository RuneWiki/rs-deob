import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class20 {

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private int field267 = 0;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    private int field264 = -1;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lam;")
    private class277 field266 = new class277();

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
    public boolean field278 = false;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[Lug;")
    private class243[] field258;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "[[[I")
    private int[][][] field268;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[[B")
    public static byte[][] field276 = new byte[50][];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lum;")
    public static class222 field263;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public static int[] field262;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[Ljf;")
    public static class86[] field261;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[II)V", line = 5)
    public static final void method135(int[][] arg0, int arg1) {
        if (arg1 != 1) {
            method139((byte) 14);
        }
        class73.field1117 = arg0;
        field269++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I", line = 17)
    public final int[][] method136(int arg0, int arg1) {
        if (arg0 != 0) {
            return (int[][]) ((int[][]) null);
        }
        field259++;
        if (this.field275 == this.field265) {
            this.field278 = this.field258[arg1] == null;
            this.field258[arg1] = class265.field4530;
            return this.field268[arg1];
        } else if (this.field275 == 1) {
            this.field278 = this.field264 != arg1;
            this.field264 = arg1;
            return this.field268[0];
        } else {
            class243 var3 = this.field258[arg1];
            if (var3 == null) {
                this.field278 = true;
                if (this.field275 <= this.field267) {
                    class243 var4 = (class243) this.field266.method1931((byte) -73);
                    var3 = new class243(arg1, var4.field4225);
                    this.field258[var4.field4222] = null;
                    var4.method961((byte) 104);
                } else {
                    var3 = new class243(arg1, this.field267);
                    this.field267++;
                }
                this.field258[arg1] = var3;
            } else {
                this.field278 = false;
            }
            this.field266.method1933(9988, var3);
            return this.field268[var3.field4225];
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 93)
    public static final void method137(int arg0) {
        field272++;
        if (arg0 != 4096) {
            method141((byte) -1, (class222) null);
        }
        if (class51.field826 != null && class138.field2368 != null) {
            return;
        }
        class138.field2368 = new int[256];
        class51.field826 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class51.field826[var1] = (int) (Math.sin(var2) * 4096.0D);
            class138.field2368[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V", line = 136)
    public static final void method138(int arg0, byte arg1) {
        if (arg1 < -62) {
            class91.field1635.method2177(arg0, -127);
            field271++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 148)
    public static void method139(byte arg0) {
        field262 = null;
        if (arg0 > 75) {
            field263 = null;
            field261 = null;
            field276 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 165)
    public final void method140(int arg0) {
        for (int var2 = 0; var2 < this.field275; var2++) {
            this.field268[var2][0] = null;
            this.field268[var2][1] = null;
            this.field268[var2][2] = null;
            this.field268[var2] = (int[][]) null;
        }
        this.field268 = (int[][][]) null;
        this.field258 = null;
        int var3 = -88 % ((-arg0 - 53) / 59);
        this.field266.method1938(71);
        field277++;
        this.field266 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V", line = 251)
    public class20(int arg0, int arg1, int arg2) {
        this.field275 = arg0;
        this.field265 = arg1;
        this.field258 = new class243[this.field265];
        this.field268 = new int[this.field275][3][arg2];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLum;)V", line = 206)
    public static final void method141(byte arg0, class222 arg1) {
        class105.field1859 = arg1;
        field274++;
        int var2 = 126 % ((-arg0 - 87) / 35);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)[[[I", line = 228)
    public final int[][][] method142(byte arg0) {
        field273++;
        if (this.field275 != this.field265) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -50 / ((29 - arg0) / 52);
        for (int var3 = 0; var3 < this.field275; var3++) {
            this.field258[var3] = class265.field4530;
        }
        return this.field268;
    }
}
