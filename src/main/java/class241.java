import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class241 {

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "Z")
    public boolean field2993;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Z")
    public boolean field2979;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "[S")
    public short[] field2987;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Lsb;")
    public static class305 field2988 = new class305(41, -1);

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "[I")
    public static int[] field2992 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "[I")
    public static int[] field2996 = new int[4096];

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    private int field2982;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    private int field2984;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
    private int field2997;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Leq;")
    public class670 field2980;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "Ltf;")
    public static class701 field2985;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public static void method1432(byte arg0) {
        field2988 = null;
        field2985 = null;
        if (arg0 >= -112) {
            field2988 = null;
        }
        field2992 = null;
        field2996 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
    private final void method1433(boolean arg0) {
        int var2 = this.field2994;
        if (var2 == 2) {
            this.field2982 = 2048;
            this.field2984 = 2048;
            this.field2997 = 1;
            this.field2991 = 0;
        } else if (var2 == 3) {
            this.field2984 = 2048;
            this.field2997 = 1;
            this.field2991 = 0;
            this.field2982 = 4096;
        } else if (var2 == 4) {
            this.field2997 = 4;
            this.field2991 = 0;
            this.field2982 = 2048;
            this.field2984 = 2048;
        } else if (var2 == 5) {
            this.field2997 = 4;
            this.field2982 = 8192;
            this.field2984 = 2048;
            this.field2991 = 0;
        } else if (var2 == 12) {
            this.field2991 = 0;
            this.field2997 = 2;
            this.field2982 = 2048;
            this.field2984 = 2048;
        } else if (var2 == 13) {
            this.field2991 = 0;
            this.field2984 = 2048;
            this.field2997 = 2;
            this.field2982 = 8192;
        } else if (var2 == 10) {
            this.field2997 = 3;
            this.field2982 = 2048;
            this.field2984 = 512;
            this.field2991 = 1536;
        } else if (var2 == 11) {
            this.field2991 = 1536;
            this.field2997 = 3;
            this.field2982 = 4096;
            this.field2984 = 512;
        } else if (var2 == 6) {
            this.field2991 = 1280;
            this.field2997 = 3;
            this.field2984 = 768;
            this.field2982 = 2048;
        } else if (var2 == 7) {
            this.field2984 = 768;
            this.field2991 = 1280;
            this.field2982 = 4096;
            this.field2997 = 3;
        } else if (var2 == 8) {
            this.field2984 = 1024;
            this.field2997 = 3;
            this.field2982 = 2048;
            this.field2991 = 1024;
        } else if (var2 == 9) {
            this.field2991 = 1024;
            this.field2982 = 4096;
            this.field2984 = 1024;
            this.field2997 = 3;
        } else if (var2 == 14) {
            this.field2997 = 1;
            this.field2984 = 768;
            this.field2982 = 2048;
            this.field2991 = 1280;
        } else if (var2 == 15) {
            this.field2991 = 1536;
            this.field2982 = 4096;
            this.field2984 = 512;
            this.field2997 = 1;
        } else if (var2 == 16) {
            this.field2997 = 1;
            this.field2991 = 1792;
            this.field2984 = 256;
            this.field2982 = 8192;
        } else {
            this.field2991 = 0;
            this.field2982 = 2048;
            this.field2997 = 0;
            this.field2984 = 2048;
        }
        field2989++;
        if (!arg0) {
            field2988 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZZI)V")
    public final void method1434(boolean arg0, boolean arg1, int arg2) {
        field2995++;
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field2982 * arg2 / 50 + this.field2986 & 0x7FF;
            int var5 = this.field2997;
            if (var5 == 1) {
                var6 = (class435.field6134[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class551.field7881[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field2980.method258((float) ((this.field2984 * var6 >> 11) + this.field2991) / 2048.0F, -3989);
        if (arg1) {
            this.field2986 = 24;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIII)V")
    public final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2991 = arg0;
        this.field2997 = arg2;
        this.field2982 = arg4;
        this.field2984 = arg3;
        if (arg1 >= -88) {
            this.field2997 = -126;
        }
        field2981++;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BIIIIILr;)V")
    private final void method1436(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class564 arg6) {
        field2990++;
        this.field2980 = arg6.method1010(arg4, arg3, arg2, arg1, arg5, 1.0F);
        if (arg0 > -37) {
            field2985 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
    protected class241() {
        if (class551.field7881 == null) {
            class168.method917(-114);
        }
        this.method1433(true);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lr;Lnp;I)V")
    public class241(class564 arg0, class115 arg1, int arg2) {
        if (class551.field7881 == null) {
            class168.method917(-66);
        }
        this.field2983 = arg1.method620((byte) -126);
        this.field2993 = (this.field2983 & 0x10) != 0;
        this.field2979 = (this.field2983 & 0x8) != 0;
        this.field2983 &= 0x7;
        int var4 = arg1.method643((byte) -77) << arg2;
        int var5 = arg1.method643((byte) -77) << arg2;
        int var6 = arg1.method643((byte) -77) << arg2;
        int var7 = arg1.method620((byte) -127);
        int var8 = var7 * 2 + 1;
        this.field2987 = new short[var8];
        for (int var9 = 0; var9 < this.field2987.length; var9++) {
            short var13 = (short) arg1.method643((byte) -77);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field2987[var9] = (short) class422.method2436(var14 << 8, var15);
        }
        int var10 = (var7 << class559.field7984) + class291.field3640;
        int var11 = class194.field2239 == null ? class655.field9213[class316.method1815(arg1.method643((byte) -77), -22553) & 0xFFFF] : class194.field2239[arg1.method643((byte) -77)];
        int var12 = arg1.method620((byte) 42);
        this.field2994 = var12 & 0x1F;
        this.field2986 = (var12 & 0xE0) << 3;
        if (this.field2994 != 31) {
            this.method1433(true);
        }
        this.method1436((byte) -73, var10, var5, var6, var4, var11, arg0);
    }
}
