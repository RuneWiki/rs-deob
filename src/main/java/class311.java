import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class311 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lah;")
    public class405 field4394 = null;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[Lrba;")
    public class456[] field4395 = null;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[Lrba;")
    public class456[] field4391 = null;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lah;")
    public class405 field4397 = null;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lah;")
    public class405 field4396 = null;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Z")
    public boolean field4393;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lmw;")
    public static class517 field4398 = new class517(55, 2);

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
    public static boolean field4402 = false;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[F")
    public static float[] field4399 = new float[16384];

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[F")
    public static float[] field4400 = new float[16384];

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "[F")
    public static float[] field4405;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ltga;")
    public static class64 field4406;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4400[var2] = (float) Math.sin((double) var2 * var0);
            field4399[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4403 = 0;
        field4405 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };
        field4404 = class436.method2617(1600, 4);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Llf;)V", line = 29)
    public class311(class250 arg0) {
        this.field4393 = arg0.field3586;
        class340.method2165(false, arg0);
        if (this.field4393) {
            byte[] var6 = class585.method3295(class197.field2553, 1, false);
            this.field4397 = new class405(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class585.method3295(class16.field170, 1, false);
            this.field4394 = new class405(arg0, 6410, 128, 128, 16, var7, 6410);
            class131 var8 = arg0.field3516;
            if (var8.method927(-122)) {
                byte[] var9 = class585.method3295(class684.field9135, 1, false);
                this.field4396 = new class405(arg0, 6408, 128, 128, 16);
                class405 var10 = new class405(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method929(2.0F, 1, this.field4396, var10)) {
                    this.field4396.method1343(0);
                } else {
                    this.field4396.method1341(true);
                    this.field4396 = null;
                }
                var10.method1341(true);
            }
        } else {
            this.field4391 = new class456[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class102.method787(32768, var2 * 128 * 128 * 2, class197.field2553, (byte) 119);
                this.field4391[var2] = new class456(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field4395 = new class456[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class102.method787(32768, var3 * 128 * 2 * 128, class16.field170, (byte) 117);
                this.field4395[var3] = new class456(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 94)
    public static void method2001(int arg0) {
        if (arg0 != 2) {
            method2001(-106);
        }
        field4406 = null;
        field4400 = null;
        field4405 = null;
        field4398 = null;
        field4399 = null;
    }
}
