import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class239 {

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[F")
    public float[] field3949 = new float[4];

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Z")
    public boolean field3954;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Z")
    public boolean field3964;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[S")
    public short[] field3952;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    private int field3941;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field3967 = 1;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lel;")
    public static class218 field3953 = new class218();

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "[I")
    public static int[] field3972 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Lma;")
    private static class5 field3969 = class12.method119("Free world", (byte) 99);

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Lma;")
    public static class5 field3975 = field3969;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "Lrc;")
    public static class210 field3971 = new class210(5000);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "F")
    public float field3948;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "F")
    public float field3963;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    private int field3959;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Ldm;")
    public class22 field3957;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Ljf;")
    public static class82 field3973;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method1686(int arg0, int arg1, byte arg2) {
        field3947++;
        class130 var3 = class188.method1237(122, arg1);
        int var4 = var3.field1949;
        int var5 = var3.field1945;
        int var6 = var3.field1946;
        int var7 = class231.field3837[var5 - var6];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        if (arg2 < -125) {
            class301.method2046(arg0 << var6 & var8 | class114.field1702[var4] & ~var8, 128, var4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)Z", line = 32)
    public static final boolean method1687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 69)
    private final void method1688(boolean arg0) {
        int var2 = (this.field3946 << 7) + 64;
        this.field3963 = 1.0F / (float) (var2 * var2);
        field3945++;
        if (!arg0) {
            method1692(-97);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)I", line = 85)
    public static final int method1689(int arg0, byte arg1, int arg2) {
        field3960++;
        class255 var3 = (class255) class300.field5062.method1372(false, (long) arg2);
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 != -89) {
                field3975 = (class5) null;
            }
            return arg0 >= 0 && arg0 < var3.field4355.length ? var3.field4355[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[II)V", line = 111)
    public static final void method1690(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field3968++;
        arg0--;
        int var11 = arg2 - 1;
        int var5 = var11 - 7;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg3[var6] = arg4;
            int var7 = var6 + 1;
            arg3[var7] = arg4;
            int var8 = var7 + 1;
            arg3[var8] = arg4;
            int var9 = var8 + 1;
            arg3[var9] = arg4;
            int var10 = var9 + 1;
            arg3[var10] = arg4;
            int var12 = var10 + 1;
            arg3[var12] = arg4;
            int var13 = var12 + 1;
            arg3[var13] = arg4;
            arg0 = var13 + 1;
            arg3[arg0] = arg4;
        }
        while (var11 > arg0) {
            arg0++;
            arg3[arg0] = arg4;
        }
        if (arg1 != 23267) {
            field3973 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)Z", line = 147)
    public static final boolean method1691(boolean arg0) {
        field3942++;
        if (arg0) {
            method1686(59, 90, (byte) 94);
        }
        class194 var1 = class61.field954;
        synchronized (class61.field954) {
            if (client.field1760 == class155.field2304) {
                return false;
            } else {
                class289.field4914 = class106.field1576[client.field1760];
                class186.field2931 = class48.field741[client.field1760];
                client.field1760 = client.field1760 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 167)
    public static void method1692(int arg0) {
        field3973 = null;
        if (arg0 != 3) {
            field3976 = 48;
        }
        field3975 = null;
        field3953 = null;
        field3972 = null;
        field3971 = null;
        field3969 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 188)
    private final void method1693(int arg0) {
        field3974++;
        if (arg0 != 4) {
            field3969 = (class5) null;
        }
        int var2 = this.field3941;
        if (var2 == 2) {
            this.field3959 = 2048;
            this.field3951 = 2048;
            this.field3950 = 1;
            this.field3962 = 0;
        } else if (var2 == 3) {
            this.field3962 = 0;
            this.field3959 = 4096;
            this.field3951 = 2048;
            this.field3950 = 1;
        } else if (var2 == 4) {
            this.field3950 = 4;
            this.field3951 = 2048;
            this.field3962 = 0;
            this.field3959 = 2048;
        } else if (var2 == 5) {
            this.field3950 = 4;
            this.field3962 = 0;
            this.field3951 = 2048;
            this.field3959 = 8192;
        } else if (var2 == 12) {
            this.field3950 = 2;
            this.field3962 = 0;
            this.field3959 = 2048;
            this.field3951 = 2048;
        } else if (var2 == 13) {
            this.field3962 = 0;
            this.field3951 = 2048;
            this.field3950 = 2;
            this.field3959 = 8192;
        } else if (var2 == 10) {
            this.field3950 = 3;
            this.field3951 = 512;
            this.field3959 = 2048;
            this.field3962 = 1536;
        } else if (var2 == 11) {
            this.field3951 = 512;
            this.field3950 = 3;
            this.field3962 = 1536;
            this.field3959 = 4096;
        } else if (var2 == 6) {
            this.field3962 = 1280;
            this.field3951 = 768;
            this.field3959 = 2048;
            this.field3950 = 3;
        } else if (var2 == 7) {
            this.field3959 = 4096;
            this.field3951 = 768;
            this.field3962 = 1280;
            this.field3950 = 3;
        } else if (var2 == 8) {
            this.field3962 = 1024;
            this.field3951 = 1024;
            this.field3959 = 2048;
            this.field3950 = 3;
        } else if (var2 == 9) {
            this.field3962 = 1024;
            this.field3951 = 1024;
            this.field3950 = 3;
            this.field3959 = 4096;
        } else if (var2 == 14) {
            this.field3959 = 2048;
            this.field3962 = 1280;
            this.field3950 = 1;
            this.field3951 = 768;
        } else if (var2 == 15) {
            this.field3959 = 4096;
            this.field3950 = 1;
            this.field3962 = 1536;
            this.field3951 = 512;
        } else if (var2 == 16) {
            this.field3951 = 256;
            this.field3962 = 1792;
            this.field3950 = 1;
            this.field3959 = 8192;
        } else {
            this.field3959 = 2048;
            this.field3950 = 0;
            this.field3951 = 2048;
            this.field3962 = 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZB)V", line = 387)
    public final void method1694(int arg0, boolean arg1, byte arg2) {
        field3955++;
        if (arg2 < 82) {
            return;
        }
        int var4 = this.field3956 + (this.field3959 * arg0 / 50) & 0x7FF;
        int var5 = this.field3950;
        int var6;
        if (var5 == 1) {
            var6 = (class229.field3805[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class11.field170[var4] >> 1;
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
        this.field3948 = (float) ((this.field3951 * var6 >> 11) + this.field3962) / 2048.0F;
        float var7 = this.field3948 / 255.0F;
        this.field3949[0] = var7 * (float) class204.method1354(this.field3965 >> 16, 255);
        this.field3949[1] = (float) class204.method1354(this.field3965 >> 8, 255) * var7;
        this.field3949[2] = (float) class204.method1354(this.field3965, 255) * var7;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 489)
    protected class239() {
        if (class11.field170 == null) {
            class297.method2008((byte) -96);
        }
        this.method1693(4);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lii;)V", line = 500)
    public class239(class221 arg0) {
        if (class11.field170 == null) {
            class297.method2008((byte) -96);
        }
        this.field3961 = arg0.method1509(true);
        this.field3954 = (this.field3961 & 0x10) != 0;
        this.field3964 = (this.field3961 & 0x8) != 0;
        this.field3961 &= 0x7;
        this.field3944 = arg0.method1524((byte) 55);
        this.field3958 = arg0.method1524((byte) 93);
        this.field3966 = arg0.method1524((byte) 119);
        this.field3946 = arg0.method1509(true);
        this.method1688(true);
        this.field3952 = new short[this.field3946 * 2 + 1];
        for (int var2 = 0; var2 < this.field3952.length; var2++) {
            this.field3952[var2] = (short) arg0.method1524((byte) 91);
        }
        this.field3965 = class229.field3791[arg0.method1524((byte) 126)];
        int var3 = arg0.method1509(true);
        this.field3956 = (var3 & 0xE0) << 3;
        this.field3941 = var3 & 0x1F;
        this.method1693(4);
    }
}
