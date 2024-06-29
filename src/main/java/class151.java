import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class151 extends class196 {

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Z")
    public boolean field2902 = false;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Lsf;")
    private class169 field2889;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Z")
    public boolean field2891;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Z")
    public boolean field2896;

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    private int field2893;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Lai;")
    private static class10 field2882 = class44.method278("Please try using a different world)3", -114);

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "Lai;")
    public static class10 field2884 = field2882;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Lai;")
    public static class10 field2890 = class44.method278("title_mute", 124);

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field2895 = -1;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lai;")
    public static class10 field2888 = class44.method278(" x ", 95);

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lai;")
    public static class10 field2892 = field2882;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Lai;")
    public static class10 field2900 = field2882;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Lai;")
    public static class10 field2881 = class44.method278("Null", -72);

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lai;")
    public static class10 field2883 = field2882;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lai;")
    public static class10 field2909 = field2882;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Lai;")
    private static class10 field2885 = class44.method278("Please check your message)2centre for details)3", -123);

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Lai;")
    public static class10 field2905 = field2882;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "Lai;")
    public static class10 field2887 = field2885;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lai;")
    private static class10 field2915 = class44.method278("Your account has been disabled)3", -127);

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lai;")
    public static class10 field2898 = field2915;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "F")
    private float field2886;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lmb;")
    public static class111 field2912;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
    private int[] field2911;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lda;IBLc;)[I")
    public final int[] method1027(class31 arg0, int arg1, byte arg2, class21 arg3) {
        field2916++;
        if (arg2 >= -55) {
            return null;
        } else if (this.field2889.method1122(arg3, true, arg0)) {
            int var5 = arg1 < this.field2914 ? arg1 : this.field2914;
            return this.field2889.method1120(var5, arg0, var5, false, 0, 1.0D, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2904++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lda;Lc;Z)Z")
    public final boolean method1028(class31 arg0, class21 arg1, boolean arg2) {
        if (!arg2) {
            this.field2897 = -86;
        }
        field2913++;
        return this.field2889.method1122(arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
    public final void method1029(boolean arg0, int arg1) {
        field2899++;
        if (this.field2911 == null) {
            return;
        }
        if (arg0) {
            method1033((byte) 71);
        }
        if (this.field2893 != 0) {
            if (class147.field2816 == null || class147.field2816.length < this.field2911.length) {
                class147.field2816 = new int[this.field2911.length];
            }
            short var3;
            if (this.field2911.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field2911.length;
            int var5 = this.field2897 * var3 * arg1;
            int var6 = var4 - 1;
            if (this.field2893 == 2) {
                var5 = -var5;
            }
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var7 + var5 & var6;
                class147.field2816[var7] = this.field2911[var9];
            }
            int[] var8 = this.field2911;
            this.field2911 = class147.field2816;
            class147.field2816 = var8;
        }
        if (this.field2907 == 0) {
            return;
        }
        if (class147.field2816 == null || this.field2911.length > class147.field2816.length) {
            class147.field2816 = new int[this.field2911.length];
        }
        int var10 = this.field2911.length;
        short var11;
        if (this.field2911.length == 4096) {
            var11 = 64;
        } else {
            var11 = 128;
        }
        int var12 = this.field2897 * arg1;
        int var13 = var11 - 1;
        if (this.field2907 == 1) {
            var12 = -var12;
        }
        for (int var14 = 0; var14 < var10; var14 += var11) {
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = var14 + var16;
                int var18 = (var13 & var12 + var16) + var14;
                class147.field2816[var17] = this.field2911[var18];
            }
        }
        int[] var15 = this.field2911;
        this.field2911 = class147.field2816;
        class147.field2816 = var15;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(FZLc;ILda;)[I")
    public final int[] method1030(float arg0, boolean arg1, class21 arg2, int arg3, class31 arg4) {
        if (arg1) {
            this.field2907 = 54;
        }
        field2910++;
        if (this.field2911 == null || this.field2886 != arg0) {
            if (!this.field2889.method1122(arg2, !arg1, arg4)) {
                return null;
            }
            int var6 = arg3 >= this.field2914 ? this.field2914 : arg3;
            this.field2911 = this.field2889.method1120(var6, arg4, var6, true, 0, (double) arg0, arg2);
            this.field2886 = arg0;
        }
        return this.field2911;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
    public static void method1031(boolean arg0) {
        field2909 = null;
        field2883 = null;
        field2915 = null;
        field2898 = null;
        field2905 = null;
        field2881 = null;
        field2884 = null;
        if (!arg0) {
            field2887 = null;
        }
        field2912 = null;
        field2885 = null;
        field2892 = null;
        field2882 = null;
        field2890 = null;
        field2887 = null;
        field2900 = null;
        field2888 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lai;Lai;BLai;)V")
    public static final void method1032(class10 arg0, class10 arg1, byte arg2, class10 arg3) {
        int var4 = 71 / ((arg2 + 50) / 34);
        field2894++;
        class10.field152 = arg1;
        class10.field129 = arg0;
        class10.field170 = arg3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)Z")
    public static final boolean method1033(byte arg0) {
        field2908++;
        class27 var1 = class98.field1819;
        synchronized (class98.field1819) {
            if (class75.field1295 == class153.field2954) {
                return false;
            }
            class4.field47 = class93.field1685[class153.field2954];
            if (arg0 == 75) {
                class83.field1442 = class118.field2274[class153.field2954];
                class153.field2954 = class153.field2954 + 1 & 0x7F;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lme;)V")
    public class151(class114 arg0) {
        this.field2889 = new class169(arg0);
        int var2 = arg0.method767(true);
        this.field2891 = (var2 & 0x1) != 0;
        this.field2896 = (var2 & 0x2) != 0;
        this.field2914 = arg0.method767(true);
        this.field2906 = arg0.method762((byte) 81);
        this.field2901 = arg0.method767(true);
        if (this.field2901 == 255) {
            this.field2901 = 256;
        }
        int var3 = arg0.method767(true);
        int var4 = arg0.method767(true);
        this.field2893 = var4 >> 6 & 0x3;
        this.field2897 = (var4 & 0x3F) - 6;
        this.field2907 = var3 >> 6 & 0x3;
        arg0.method767(true);
        arg0.method767(true);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class151() {
        this.field2889 = new class169();
        this.field2914 = 1;
        this.field2891 = true;
    }
}
