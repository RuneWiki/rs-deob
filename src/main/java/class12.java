import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lhe;")
    public static class54 field325 = class6.method58("Der Anmelde)2Server ist offline)3", false);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    public static int[] field327 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lhe;")
    private static class54 field332 = class6.method58("This world is full)3", false);

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lhe;")
    private static class54 field331 = class6.method58("Loading )2 please wait)3", false);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lhe;")
    public static class54 field329 = class6.method58("::noclip", false);

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lhe;")
    public static class54 field341 = field332;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lhe;")
    public static class54 field338 = class6.method58("(Y<)4col>", false);

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lhe;")
    public static class54 field334 = field331;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lef;")
    public static class35 field340;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lia;")
    public static class57 field328;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field336;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
    public static final boolean method90(int arg0, int arg1) {
        field330++;
        int var2 = -109 / ((arg1 - 63) / 49);
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILfb;)V")
    public static final void method91(int arg0, class38 arg1) {
        if (class4.field138 == arg1.field985 || arg1.field981 == -1 || arg1.field926 != 0 || arg1.field937 + 1 > class135.method1010(arg1.field981, (byte) -115).field3247[arg1.field943]) {
            int var2 = class4.field138 - arg1.field928;
            int var3 = arg1.field985 - arg1.field928;
            int var4 = arg1.field948 * 64 + arg1.field944 * 128;
            int var5 = arg1.field983 * 128 + arg1.field948 * 64;
            int var6 = arg1.field982 * 128 + arg1.field948 * 64;
            int var7 = arg1.field948 * 64 + arg1.field936 * 128;
            arg1.field974 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field971 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        field326++;
        if (arg1.field949 == 0) {
            arg1.field921 = 1024;
        }
        if (arg1.field949 == 1) {
            arg1.field921 = 1536;
        }
        if (arg1.field949 == arg0) {
            arg1.field921 = 0;
        }
        arg1.field970 = 0;
        if (arg1.field949 == 3) {
            arg1.field921 = 512;
        }
        arg1.field923 = arg1.field921;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method92(boolean arg0) {
        short var1 = 256;
        field342++;
        if (class82.field2014 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class82.field2014 > 768) {
                    class143.field3279[var2] = class93.method747(class130.field2948[var2], 1024 - class82.field2014, 1427931656, class155.field3506[var2]);
                } else if (class82.field2014 <= 256) {
                    class143.field3279[var2] = class93.method747(class155.field3506[var2], 256 - class82.field2014, 1427931656, class130.field2948[var2]);
                } else {
                    class143.field3279[var2] = class155.field3506[var2];
                }
            }
        } else if (class89.field2198 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class143.field3279[var3] = class130.field2948[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class89.field2198 > 768) {
                    class143.field3279[var4] = class93.method747(class130.field2948[var4], 1024 - class89.field2198, 1427931656, class2.field31[var4]);
                } else if (class89.field2198 <= 256) {
                    class143.field3279[var4] = class93.method747(class2.field31[var4], 256 - class89.field2198, 1427931656, class130.field2948[var4]);
                } else {
                    class143.field3279[var4] = class2.field31[var4];
                }
            }
        }
        int var5 = 0;
        class90.method714(0, 9, 128, var1 + 7);
        class133.field3015.method856(0, 0);
        class90.method721();
        int var6 = 6885;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class6.field187[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class149.field3370[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var24 = 256 - var23;
                    int var26 = class143.field3279[var23];
                    int var27 = class124.field2852.field705[var6];
                    class124.field2852.field705[var6++] = class118.method887(-16711936, class118.method887(16711935, var27) * var24 + var23 * class118.method887(16711935, var26)) + class118.method887(16711680, class118.method887(var26, 65280) * var23 + class118.method887(var27, 65280) * var24) >> 8;
                }
            }
            var6 += var21 + 637;
        }
        int var8 = 7546;
        int var9 = 0;
        class90.method714(637, 9, 765, var1 + 7);
        class66.field1600.method856(382, 0);
        class90.method721();
        if (arg0) {
            field328 = null;
        }
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class6.field187[var10] / var1;
            int var12 = 103 - var11;
            int var13 = var8 + var11;
            for (int var14 = 0; var14 < var12; var14++) {
                int var15 = class149.field3370[var9++];
                if (var15 == 0) {
                    var13++;
                } else {
                    int var17 = class124.field2852.field705[var13];
                    int var18 = 256 - var15;
                    int var19 = class143.field3279[var15];
                    class124.field2852.field705[var13++] = class118.method887(-16711936, var18 * class118.method887(16711935, var17) + class118.method887(var19, 16711935) * var15) + class118.method887(class118.method887(65280, var17) * var18 + class118.method887(65280, var19) * var15, 16711680) >> 8;
                }
            }
            var9 += 128 - var12;
            var8 = var13 + 765 - var11 - var12;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
    public static void method93(boolean arg0) {
        field334 = null;
        field332 = null;
        field341 = null;
        field338 = null;
        field329 = null;
        if (arg0) {
            return;
        }
        field336 = null;
        field331 = null;
        field340 = null;
        field328 = null;
        field325 = null;
        field327 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class12() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lbd;)V")
    public class12(class12 arg0) {
        this.field343 = arg0.field343;
        this.field335 = arg0.field335;
        this.field337 = arg0.field337;
        this.field333 = arg0.field333;
    }
}
