import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class169 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
    private int[] field3251;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[I")
    private int[] field3265;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lpf;")
    private class142 field3254;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lpf;")
    private class142 field3253;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[Lpf;")
    private class142[] field3256;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[Lbf;")
    public static class17[] field3252 = new class17[1000];

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lai;")
    private static class10 field3260 = class44.method278(" has logged in)3", 120);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lai;")
    public static class10 field3266 = field3260;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lai;")
    public static class10 field3259 = class44.method278("<img=1>", -47);

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "[I")
    public static int[] field3267 = new int[50];

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Ldd;")
    public static class34 field3258 = new class34(20);

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field3270 = 0;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Lai;")
    private static class10 field3272 = class44.method278("This world is full)3", -109);

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lai;")
    public static class10 field3273 = field3272;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Lmb;")
    public static class111 field3271;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lta;")
    public static class173 field3269;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lwa;")
    public static class200 field3255;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILda;IZIDLc;)[I")
    public final int[] method1120(int arg0, class31 arg1, int arg2, boolean arg3, int arg4, double arg5, class21 arg6) {
        class2.field17 = arg1;
        field3263++;
        int[] var9 = new int[arg0 * arg2];
        class56.field986 = arg6;
        class89.method545(arg0, arg2, -1);
        for (int var10 = 0; var10 < this.field3256.length; var10++) {
            this.field3256[var10].method960(arg0, true, arg2);
        }
        byte var11;
        int var12;
        int var13;
        if (arg3) {
            var11 = -1;
            var13 = arg2 - 1;
            var12 = -1;
        } else {
            var11 = 1;
            var12 = arg2;
            var13 = 0;
        }
        int var14 = 0;
        for (int var15 = arg4; var15 < arg0; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3254.field2684) {
                int[] var21 = this.field3254.method6(false, var15);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field3254.method86(var15, false);
                var18 = var17[1];
                var19 = var17[0];
                var20 = var17[2];
            }
            for (int var22 = var13; var22 != var12; var22 += var11) {
                double var23 = Math.pow((double) var19[var22] / 4096.0D, arg5);
                int var25 = (int) (var23 * 256.0D);
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                double var26 = Math.pow((double) var18[var22] / 4096.0D, arg5);
                double var28 = Math.pow((double) var20[var22] / 4096.0D, arg5);
                int var30 = (int) (var26 * 256.0D);
                if (var30 > 255) {
                    var30 = 255;
                }
                if (var30 < 0) {
                    var30 = 0;
                }
                int var31 = (int) (var28 * 256.0D);
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                var9[var14++] = (var25 << 16) + var31 + (var30 << 8);
            }
        }
        for (int var16 = 0; var16 < this.field3256.length; var16++) {
            this.field3256[var16].method965(-104);
        }
        return var9;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field3260 = null;
        field3269 = null;
        if (arg0 < 82) {
            field3273 = null;
        }
        field3259 = null;
        field3273 = null;
        field3267 = null;
        field3252 = null;
        field3272 = null;
        field3266 = null;
        field3271 = null;
        field3258 = null;
        field3255 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lc;ZLda;)Z")
    public final boolean method1122(class21 arg0, boolean arg1, class31 arg2) {
        field3268++;
        for (int var4 = 0; var4 < this.field3251.length; var4++) {
            if (!arg0.method138(this.field3251[var4], -493)) {
                return false;
            }
        }
        int var5 = 0;
        if (!arg1) {
            return true;
        }
        while (var5 < this.field3265.length) {
            if (!arg2.method207(this.field3265[var5], -16262)) {
                return false;
            }
            var5++;
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBILc;)Z")
    public static final boolean method1123(int arg0, byte arg1, int arg2, class21 arg3) {
        byte[] var4 = arg3.method159((byte) 96, arg2, arg0);
        field3261++;
        if (var4 == null) {
            return false;
        }
        if (arg1 <= 88) {
            method1121(80);
        }
        class44.method275(-124, var4);
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class169() {
        this.field3251 = new int[0];
        this.field3265 = new int[0];
        this.field3254 = new class44();
        this.field3253 = new class44();
        this.field3256 = new class142[] { this.field3254, this.field3253 };
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lme;)V")
    public class169(class114 arg0) {
        int var2 = arg0.method767(true);
        class32 var3 = new class32(64);
        int[][] var4 = new int[var2][];
        class32 var5 = new class32(64);
        class32 var6 = new class32(64);
        this.field3256 = new class142[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class142 var21 = class152.method1035((byte) 103, arg0);
            int var22 = var21.method966((byte) 114);
            int var23 = var21.method217(-127);
            if (var22 >= 0 && var22 >= 0 && var5.method213(-78, (long) var22) == null) {
                var5.method214(new class29(var22), (byte) 126, (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var6.method213(124, (long) var23) == null) {
                var6.method214(new class29(var23), (byte) 126, (long) var23);
            }
            int var26 = var21.field2678.length;
            var4[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var4[var7][var27] = arg0.method767(true);
            }
            var3.method214(var21, (byte) 102, (long) var21.field2670);
            this.field3256[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class142 var17 = this.field3256[var8];
            int var18 = var17.field2678.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class142 var20 = (class142) var3.method213(-83, (long) var4[var8][var19]);
                var17.field2678[var19] = var20;
            }
            var4[var8] = null;
        }
        Object var9 = null;
        this.field3254 = (class142) var3.method213(-121, (long) arg0.method767(true));
        this.field3253 = (class142) var3.method213(126, (long) arg0.method767(true));
        this.field3251 = new int[var5.method216((byte) 127)];
        this.field3265 = new int[var6.method216((byte) 121)];
        Object var10 = null;
        class119[] var11 = new class119[var5.method216((byte) 122)];
        class119[] var12 = new class119[var6.method216((byte) 127)];
        var5.method209(14349, var11);
        var6.method209(14349, var12);
        Object var13 = null;
        Object var14 = null;
        for (int var15 = 0; var15 < var11.length; var15++) {
            this.field3251[var15] = ((class29) var11[var15]).field430;
        }
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field3265[var16] = ((class29) var12[var16]).field430;
        }
    }
}
