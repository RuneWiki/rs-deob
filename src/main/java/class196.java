import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class196 {

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[F")
    public float[] field3346 = new float[4];

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
    public boolean field3340;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
    public boolean field3332;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[S")
    public short[] field3345;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lbd;")
    public static class162 field3353 = class17.method142(0, "<img=1>");

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "F")
    public float field3343;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "F")
    public float field3347;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    private int field3329;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lr;")
    public class130 field3350;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lic;")
    public static class20 field3330;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 50)
    private final void method1469(byte arg0) {
        int var2 = this.field3344;
        if (var2 == 2) {
            this.field3329 = 1;
            this.field3333 = 0;
            this.field3342 = 2048;
            this.field3328 = 2048;
        } else if (var2 == 3) {
            this.field3329 = 1;
            this.field3328 = 4096;
            this.field3342 = 2048;
            this.field3333 = 0;
        } else if (var2 == 4) {
            this.field3329 = 4;
            this.field3342 = 2048;
            this.field3328 = 2048;
            this.field3333 = 0;
        } else if (var2 == 5) {
            this.field3329 = 4;
            this.field3342 = 2048;
            this.field3328 = 8192;
            this.field3333 = 0;
        } else if (var2 == 12) {
            this.field3333 = 0;
            this.field3342 = 2048;
            this.field3329 = 2;
            this.field3328 = 2048;
        } else if (var2 == 13) {
            this.field3329 = 2;
            this.field3342 = 2048;
            this.field3333 = 0;
            this.field3328 = 8192;
        } else if (var2 == 10) {
            this.field3329 = 3;
            this.field3328 = 2048;
            this.field3333 = 1536;
            this.field3342 = 512;
        } else if (var2 == 11) {
            this.field3342 = 512;
            this.field3329 = 3;
            this.field3333 = 1536;
            this.field3328 = 4096;
        } else if (var2 == 6) {
            this.field3342 = 768;
            this.field3329 = 3;
            this.field3333 = 1280;
            this.field3328 = 2048;
        } else if (var2 == 7) {
            this.field3342 = 768;
            this.field3329 = 3;
            this.field3328 = 4096;
            this.field3333 = 1280;
        } else if (var2 == 8) {
            this.field3342 = 1024;
            this.field3328 = 2048;
            this.field3333 = 1024;
            this.field3329 = 3;
        } else if (var2 == 9) {
            this.field3328 = 4096;
            this.field3342 = 1024;
            this.field3329 = 3;
            this.field3333 = 1024;
        } else if (var2 == 14) {
            this.field3328 = 2048;
            this.field3342 = 768;
            this.field3329 = 1;
            this.field3333 = 1280;
        } else if (var2 == 15) {
            this.field3333 = 1536;
            this.field3328 = 4096;
            this.field3342 = 512;
            this.field3329 = 1;
        } else if (var2 == 16) {
            this.field3329 = 1;
            this.field3333 = 1792;
            this.field3328 = 8192;
            this.field3342 = 256;
        } else {
            this.field3328 = 2048;
            this.field3333 = 0;
            this.field3329 = 0;
            this.field3342 = 2048;
        }
        if (arg0 != -126) {
            this.method1471(true, -122, (byte) 118);
        }
        field3331++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 217)
    private final void method1470(byte arg0) {
        if (arg0 != 98) {
            this.method1471(false, 31, (byte) -20);
        }
        int var2 = (this.field3349 << 7) + 64;
        this.field3347 = 1.0F / (float) (var2 * var2);
        field3339++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIB)V", line = 240)
    public final void method1471(boolean arg0, int arg1, byte arg2) {
        field3338++;
        int var4 = this.field3328 * arg1 / 50 + this.field3351 & 0x7FF;
        int var5 = this.field3329;
        int var6;
        if (var5 == 1) {
            var6 = (class312.field5262[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class258.field4289[var4] >> 1;
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
        this.field3343 = (float) (this.field3333 + (this.field3342 * var6 >> 11)) / 2048.0F;
        float var7 = this.field3343 / 255.0F;
        this.field3346[0] = var7 * (float) (class92.method695(16734218, this.field3336) >> 16);
        this.field3346[2] = var7 * (float) class92.method695(this.field3336, 255);
        int var8 = -120 % ((67 - arg2) / 55);
        this.field3346[1] = (float) (class92.method695(this.field3336, 65531) >> 8) * var7;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 347)
    protected class196() {
        if (class258.field4289 == null) {
            class304.method2071(54);
        }
        this.method1469((byte) -126);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lb;)V", line = 358)
    public class196(class94 arg0) {
        if (class258.field4289 == null) {
            class304.method2071(42);
        }
        this.field3337 = arg0.method756(915905888);
        this.field3340 = (this.field3337 & 0x10) != 0;
        this.field3332 = (this.field3337 & 0x8) != 0;
        this.field3337 &= 0x7;
        this.field3334 = arg0.method761((byte) 108);
        this.field3335 = arg0.method761((byte) 108);
        this.field3352 = arg0.method761((byte) 108);
        this.field3349 = arg0.method756(915905888);
        this.method1470((byte) 98);
        this.field3345 = new short[this.field3349 * 2 + 1];
        for (int var2 = 0; var2 < this.field3345.length; var2++) {
            this.field3345[var2] = (short) arg0.method761((byte) 108);
        }
        this.field3336 = class312.field5264[arg0.method761((byte) 108)];
        int var3 = arg0.method756(915905888);
        this.field3351 = (var3 & 0xE0) << 3;
        this.field3344 = var3 & 0x1F;
        this.method1469((byte) -126);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 338)
    public static void method1472(int arg0) {
        if (arg0 != 28244) {
            method1472(125);
        }
        field3353 = null;
        field3330 = null;
    }
}
