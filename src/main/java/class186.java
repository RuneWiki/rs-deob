import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class186 {

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "[F")
    public float[] field2928 = new float[4];

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Z")
    public boolean field2911 = false;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "Z")
    public boolean field2931;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Z")
    public boolean field2918;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field2913;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "[S")
    public short[] field2915;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Ll;")
    public static class66 field2905 = new class66(64);

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2930 = " is already on your ignore list.";

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "F")
    public float field2916;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "F")
    public float field2923;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Lqa;")
    public class336 field2925;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[S")
    public static short[] field2910;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 6)
    private final void method1429(int arg0) {
        field2904++;
        int var2 = (this.field2914 << 7) + 64;
        this.field2923 = 1.0F / (float) (var2 * var2);
        if (arg0 != 29138) {
            method1435((byte) -61, '9');
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 30)
    private final void method1430(int arg0) {
        int var2 = 6 / ((-arg0 - 15) / 54);
        int var3 = this.field2921;
        if (var3 == 2) {
            this.field2912 = 2048;
            this.field2917 = 0;
            this.field2933 = 1;
            this.field2920 = 2048;
        } else if (var3 == 3) {
            this.field2933 = 1;
            this.field2912 = 2048;
            this.field2920 = 4096;
            this.field2917 = 0;
        } else if (var3 == 4) {
            this.field2920 = 2048;
            this.field2912 = 2048;
            this.field2917 = 0;
            this.field2933 = 4;
        } else if (var3 == 5) {
            this.field2917 = 0;
            this.field2920 = 8192;
            this.field2912 = 2048;
            this.field2933 = 4;
        } else if (var3 == 12) {
            this.field2917 = 0;
            this.field2920 = 2048;
            this.field2933 = 2;
            this.field2912 = 2048;
        } else if (var3 == 13) {
            this.field2917 = 0;
            this.field2933 = 2;
            this.field2920 = 8192;
            this.field2912 = 2048;
        } else if (var3 == 10) {
            this.field2920 = 2048;
            this.field2933 = 3;
            this.field2912 = 512;
            this.field2917 = 1536;
        } else if (var3 == 11) {
            this.field2912 = 512;
            this.field2933 = 3;
            this.field2917 = 1536;
            this.field2920 = 4096;
        } else if (var3 == 6) {
            this.field2933 = 3;
            this.field2912 = 768;
            this.field2917 = 1280;
            this.field2920 = 2048;
        } else if (var3 == 7) {
            this.field2917 = 1280;
            this.field2933 = 3;
            this.field2920 = 4096;
            this.field2912 = 768;
        } else if (var3 == 8) {
            this.field2917 = 1024;
            this.field2933 = 3;
            this.field2920 = 2048;
            this.field2912 = 1024;
        } else if (var3 == 9) {
            this.field2912 = 1024;
            this.field2920 = 4096;
            this.field2933 = 3;
            this.field2917 = 1024;
        } else if (var3 == 14) {
            this.field2912 = 768;
            this.field2917 = 1280;
            this.field2920 = 2048;
            this.field2933 = 1;
        } else if (var3 == 15) {
            this.field2917 = 1536;
            this.field2933 = 1;
            this.field2920 = 4096;
            this.field2912 = 512;
        } else if (var3 == 16) {
            this.field2917 = 1792;
            this.field2912 = 256;
            this.field2933 = 1;
            this.field2920 = 8192;
        } else {
            this.field2920 = 2048;
            this.field2933 = 0;
            this.field2917 = 0;
            this.field2912 = 2048;
        }
        field2907++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 233)
    public static void method1431(byte arg0) {
        field2930 = null;
        field2910 = null;
        field2905 = null;
        int var1 = -1 / ((-arg0 - 69) / 56);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V", line = 246)
    public final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2906++;
        this.field2920 = arg1;
        this.field2912 = arg0;
        this.field2933 = arg4;
        int var6 = -36 % ((arg3 - 26) / 62);
        this.field2917 = arg2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZ)V", line = 276)
    public final void method1433(int arg0, int arg1, boolean arg2) {
        field2908++;
        int var4 = 31 / ((arg0 + 47) / 62);
        int var5 = this.field2920 * arg1 / 50 + this.field2927 & 0x7FF;
        int var6 = this.field2933;
        int var7;
        if (var6 == 1) {
            var7 = (class107.field1604[var5] >> 6) + 1024;
        } else if (var6 == 3) {
            var7 = class173.field2749[var5] >> 1;
        } else if (var6 == 4) {
            var7 = var5 >> 10 << 11;
        } else if (var6 == 2) {
            var7 = var5;
        } else if (var6 == 5) {
            var7 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
        } else {
            var7 = 2048;
        }
        if (arg2) {
            var7 = 2048;
        }
        this.field2916 = (float) ((this.field2912 * var7 >> 11) + this.field2917) / 2048.0F;
        float var8 = this.field2916 / 255.0F;
        this.field2928[2] = (float) class301.method2169(255, this.field2919) * var8;
        this.field2928[0] = var8 * (float) class301.method2169(this.field2919 >> 16, 255);
        this.field2928[1] = var8 * (float) class301.method2169(255, this.field2919 >> 8);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIIIIIII)V", line = 355)
    public static final void method1434(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2926++;
        if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
            class59.field925 = -1;
            class18.field292 = -1;
            return;
        }
        if (arg0) {
            field2930 = (String) null;
        }
        int var9 = class193.method1469(arg2, arg1, (byte) -47, class119.field1826) - arg7;
        int var10 = arg2 - class10.field143;
        int var11 = var9 - class64.field975;
        int var12 = arg1 - class151.field2465;
        int var13 = class107.field1604[class191.field3005];
        int var14 = class107.field1605[class191.field3005];
        int var15 = class107.field1604[class15.field248];
        int var16 = class107.field1605[class15.field248];
        int var17 = var10 * var15 + var12 * var16 >> 16;
        int var18 = var10 * var16 - (var12 * var15) >> 16;
        int var20 = var11 * var14 - (var13 * var18) >> 16;
        int var21 = arg3 + var17;
        int var22 = var11 * var13 + var14 * var18 >> 16;
        if (var22 < 50) {
            class18.field292 = -1;
            class59.field925 = -1;
        } else if (class240.field3737) {
            int var24 = arg6 * 512 >> 8;
            int var25 = arg8 * 512 >> 8;
            class59.field925 = var20 * var25 / var22 + arg5;
            class18.field292 = var21 * var24 / var22 + arg4;
        } else {
            class59.field925 = (var20 << 9) / var22 + arg5;
            class18.field292 = (var21 << 9) / var22 + arg4;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 447)
    protected class186() {
        if (class173.field2749 == null) {
            class263.method1938(-129);
        }
        this.method1430(-100);
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lug;)V", line = 458)
    public class186(class25 arg0) {
        if (class173.field2749 == null) {
            class263.method1938(-129);
        }
        this.field2922 = arg0.method281(44);
        this.field2931 = (this.field2922 & 0x10) != 0;
        this.field2918 = (this.field2922 & 0x8) != 0;
        this.field2922 &= 0x7;
        this.field2909 = arg0.method314((byte) 104);
        this.field2924 = arg0.method314((byte) 121);
        this.field2913 = arg0.method314((byte) 32);
        this.field2914 = arg0.method281(-125);
        this.method1429(29138);
        this.field2915 = new short[this.field2914 * 2 + 1];
        for (int var2 = 0; var2 < this.field2915.length; var2++) {
            this.field2915[var2] = (short) arg0.method314((byte) 77);
        }
        this.field2919 = class107.field1603[arg0.method314((byte) 74)];
        int var3 = arg0.method281(109);
        this.field2927 = var3 & 0xE0 << 3;
        this.field2921 = var3 & 0x1F;
        if (this.field2921 != 31) {
            this.method1430(-121);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BC)Z", line = 424)
    public static final boolean method1435(byte arg0, char arg1) {
        field2929++;
        if (arg0 != 3) {
            field2932 = 23;
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
