import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class215 {

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
    public boolean field3352 = false;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "[F")
    public float[] field3380 = new float[4];

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
    public boolean field3346;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
    public boolean field3372;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "[S")
    public short[] field3366;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lna;")
    public static class26 field3356 = class69.method505("clignotant3:", (byte) -119);

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lna;")
    public static class26 field3360 = class69.method505("Chargement de la liste des serveurs", (byte) -127);

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lna;")
    public static class26 field3357 = class69.method505("blaugr-Un:", (byte) -120);

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lna;")
    private static class26 field3351 = class69.method505("Unable to find ", (byte) -127);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Lna;")
    public static class26 field3347 = field3351;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "F")
    public float field3368;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
    public float field3371;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    private int field3349;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    private int field3361;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    private int field3370;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Lfj;")
    public class238 field3373;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V", line = 14)
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 25 % ((25 - arg4) / 52);
        field3367++;
        if ((arg1 - arg0) >= class225.field3572 && class27.field454 >= arg0 + arg1 && arg3 - arg0 >= class80.field1259 && class117.field1840 >= arg0 + arg3) {
            class284.method2006(arg1, (byte) 118, arg0, arg2, arg3);
        } else {
            class302.method2128(arg2, arg3, arg0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 457)
    protected class215() {
        if (class245.field4017 == null) {
            class7.method46((byte) -90);
        }
        this.method1441(3);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lwa;)V", line = 467)
    public class215(class82 arg0) {
        if (class245.field4017 == null) {
            class7.method46((byte) -94);
        }
        this.field3363 = arg0.method642((byte) -99);
        this.field3346 = (this.field3363 & 0x10) != 0;
        this.field3372 = (this.field3363 & 0x8) != 0;
        this.field3363 &= 0x7;
        this.field3362 = arg0.method576(1);
        this.field3369 = arg0.method576(1);
        this.field3354 = arg0.method576(1);
        this.field3355 = arg0.method642((byte) -78);
        this.method1438(66);
        this.field3366 = new short[this.field3355 * 2 + 1];
        for (int var2 = 0; var2 < this.field3366.length; var2++) {
            this.field3366[var2] = (short) arg0.method576(1);
        }
        this.field3374 = class200.field3098[arg0.method576(1)];
        int var3 = arg0.method642((byte) -95);
        this.field3376 = var3 & 0xE0 << 3;
        this.field3365 = var3 & 0x1F;
        if (this.field3365 != 31) {
            this.method1441(3);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 41)
    public static void method1436(byte arg0) {
        field3351 = null;
        field3360 = null;
        field3356 = null;
        field3347 = null;
        if (arg0 == -2) {
            field3357 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIIII)V", line = 74)
    public final void method1437(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3350 = arg1;
        this.field3361 = arg3;
        field3364++;
        this.field3349 = arg4;
        int var6 = -4 % ((arg0 - 7) / 62);
        this.field3370 = arg2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 87)
    private final void method1438(int arg0) {
        field3358++;
        int var2 = (this.field3355 << 7) + 64;
        this.field3371 = 1.0F / (float) (var2 * var2);
        int var3 = 9 % ((9 - arg0) / 57);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lqf;", line = 122)
    public static final class148 method1439(int arg0) {
        field3375++;
        byte[] var1 = class205.field3203[0];
        int var2 = class98.field1596[0] * class141.field2149[0];
        int[] var3 = new int[var2];
        if (arg0 < 70) {
            method1439(67);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class190.field2975[class4.method23(var1[var4], 255)];
        }
        class148 var5;
        if (class255.field4184) {
            var5 = new class130(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], var3);
        } else {
            var5 = new class256(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], var3);
        }
        class160.method1088((byte) 111);
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V", line = 158)
    public final void method1440(boolean arg0, int arg1, int arg2) {
        if (arg2 != -3696) {
            method1435(-127, -32, -68, -32, (byte) -77);
        }
        field3353++;
        int var4 = this.field3370 * arg1 / 50 + this.field3376 & 0x7FF;
        int var5 = this.field3350;
        int var6;
        if (var5 == 1) {
            var6 = (class200.field3104[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class245.field4017[var4] >> 1;
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
        this.field3368 = (float) ((this.field3361 * var6 >> 11) + this.field3349) / 2048.0F;
        float var7 = this.field3368 / 255.0F;
        this.field3380[0] = (float) (class4.method23(this.field3374, 16771365) >> 16) * var7;
        this.field3380[2] = var7 * (float) class4.method23(255, this.field3374);
        this.field3380[1] = (float) (class4.method23(this.field3374, 65511) >> 8) * var7;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 278)
    private final void method1441(int arg0) {
        int var2 = this.field3365;
        if (var2 == 2) {
            this.field3361 = 2048;
            this.field3349 = 0;
            this.field3350 = 1;
            this.field3370 = 2048;
        } else if (var2 == 3) {
            this.field3349 = 0;
            this.field3370 = 4096;
            this.field3350 = 1;
            this.field3361 = 2048;
        } else if (var2 == 4) {
            this.field3349 = 0;
            this.field3361 = 2048;
            this.field3350 = 4;
            this.field3370 = 2048;
        } else if (var2 == 5) {
            this.field3350 = 4;
            this.field3361 = 2048;
            this.field3370 = 8192;
            this.field3349 = 0;
        } else if (var2 == 12) {
            this.field3361 = 2048;
            this.field3350 = 2;
            this.field3370 = 2048;
            this.field3349 = 0;
        } else if (var2 == 13) {
            this.field3370 = 8192;
            this.field3361 = 2048;
            this.field3350 = 2;
            this.field3349 = 0;
        } else if (var2 == 10) {
            this.field3361 = 512;
            this.field3350 = 3;
            this.field3349 = 1536;
            this.field3370 = 2048;
        } else if (var2 == 11) {
            this.field3350 = 3;
            this.field3370 = 4096;
            this.field3361 = 512;
            this.field3349 = 1536;
        } else if (var2 == 6) {
            this.field3361 = 768;
            this.field3349 = 1280;
            this.field3350 = 3;
            this.field3370 = 2048;
        } else if (var2 == 7) {
            this.field3361 = 768;
            this.field3349 = 1280;
            this.field3370 = 4096;
            this.field3350 = 3;
        } else if (var2 == 8) {
            this.field3370 = 2048;
            this.field3350 = 3;
            this.field3361 = 1024;
            this.field3349 = 1024;
        } else if (var2 == 9) {
            this.field3370 = 4096;
            this.field3349 = 1024;
            this.field3361 = 1024;
            this.field3350 = 3;
        } else if (var2 == 14) {
            this.field3370 = 2048;
            this.field3349 = 1280;
            this.field3350 = 1;
            this.field3361 = 768;
        } else if (var2 == 15) {
            this.field3361 = 512;
            this.field3370 = 4096;
            this.field3349 = 1536;
            this.field3350 = 1;
        } else if (var2 == 16) {
            this.field3370 = 8192;
            this.field3349 = 1792;
            this.field3350 = 1;
            this.field3361 = 256;
        } else {
            this.field3370 = 2048;
            this.field3349 = 0;
            this.field3361 = 2048;
            this.field3350 = 0;
        }
        field3377++;
        if (arg0 != 3) {
            this.field3376 = -84;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjl;)V", line = 442)
    public static final void method1442(int arg0, class263 arg1) {
        field3359++;
        if (arg0 != 1073376993) {
            field3356 = (class26) null;
        }
        class217.method1454((byte) -93, 200000, arg1);
    }
}
