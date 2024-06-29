import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class191 extends class115 {

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Z")
    public boolean field3235 = false;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Lcd;")
    private class149 field3232;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "Z")
    private boolean field3247;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "Z")
    private boolean field3241;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Ljd;")
    public static class85 field3239 = new class85();

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Lub;")
    public static class227 field3243 = class257.method1749("showVideoAd", 17263);

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lub;")
    private static class227 field3250 = class257.method1749("purple:", 17263);

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "Lub;")
    public static class227 field3245 = class257.method1749("Zugewiesener Speicher)3", 17263);

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Lub;")
    public static class227 field3242 = field3250;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "Lub;")
    public static class227 field3246 = field3250;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "Lub;")
    private static class227 field3248 = class257.method1749("Location", 17263);

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "[I")
    public static int[] field3249 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[I")
    public static int[] field3251 = new int[1000];

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "Lub;")
    public static class227 field3253 = field3248;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "Lub;")
    public static class227 field3254 = class257.method1749(" <col=ffff00>", 17263);

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "F")
    private float field3244;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "[I")
    private int[] field3230;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static final void method1210(int arg0) {
        class109.field2047 = arg0;
        for (int var1 = 0; var1 < class15.field285; var1++) {
            for (int var2 = 0; var2 < class112.field2075; var2++) {
                if (class261.field4539[arg0][var1][var2] == null) {
                    class261.field4539[arg0][var1][var2] = new class108(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLn;Lwj;I)[I")
    public final int[] method1211(boolean arg0, class138 arg1, class233 arg2, int arg3) {
        field3236++;
        if (arg3 != 128) {
            field3242 = null;
        }
        if (this.field3232.method947(arg2, arg1, (byte) -48)) {
            int var5 = arg0 ? 64 : 128;
            return this.field3232.method948(this.field3241, 1.0D, var5, 0, arg2, arg1, var5, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3234++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V")
    public final void method1212(boolean arg0, int arg1) {
        field3252++;
        if (this.field3230 == null) {
            return;
        }
        if (this.field3240 != 0 || this.field3238 != 0) {
            if (class232.field4046 == null || class232.field4046.length < this.field3230.length) {
                class232.field4046 = new int[this.field3230.length];
            }
            int var3 = this.field3230.length;
            int var4 = this.field3230.length == 4096 ? 64 : 128;
            int var5 = this.field3238 * arg1;
            int var6 = var3 - 1;
            int var7 = this.field3240 * arg1 * var4;
            int var8 = var4 - 1;
            for (int var9 = 0; var9 < var3; var9 += var4) {
                int var11 = var6 & var9 + var7;
                for (int var12 = 0; var12 < var4; var12++) {
                    int var13 = var9 + var12;
                    int var14 = (var5 + var12 & var8) + var11;
                    class232.field4046[var13] = this.field3230[var14];
                }
            }
            int[] var10 = this.field3230;
            this.field3230 = class232.field4046;
            class232.field4046 = var10;
        }
        if (arg0) {
            this.method1214(99, (class233) null, (class138) null);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
    public static void method1213(byte arg0) {
        field3253 = null;
        field3245 = null;
        field3254 = null;
        if (arg0 != -69) {
            method1215(-36, 38, 41);
        }
        field3250 = null;
        field3249 = null;
        field3242 = null;
        field3239 = null;
        field3243 = null;
        field3246 = null;
        field3251 = null;
        field3248 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILwj;Ln;)Z")
    public final boolean method1214(int arg0, class233 arg1, class138 arg2) {
        field3237++;
        if (arg0 != 64) {
            method1215(-91, -50, -104);
        }
        return this.field3232.method947(arg1, arg2, (byte) -48);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public static final void method1215(int arg0, int arg1, int arg2) {
        field3233++;
        class152 var3 = class175.method1119(128, arg0);
        int var4 = var3.field2647;
        if (arg1 > -56) {
            return;
        }
        int var5 = var3.field2640;
        int var6 = var3.field2642;
        int var7 = class200.field3425[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class7.method31(var4, true, ~var8 & class10.field189[var4] | arg2 << var5 & var8);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ln;Lwj;IFZ)[I")
    public final int[] method1216(class138 arg0, class233 arg1, int arg2, float arg3, boolean arg4) {
        field3228++;
        if (arg2 < 92) {
            this.method1214(5, (class233) null, (class138) null);
        }
        if (this.field3230 == null || this.field3244 != arg3) {
            if (!this.field3232.method947(arg1, arg0, (byte) -48)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field3230 = this.field3232.method948(this.field3241, (double) arg3, var6, 0, arg1, arg0, var6, true);
            this.field3244 = arg3;
            if (this.field3247) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field3230[var12];
                        var7[var34] += class76.method446(var35 >> 16, 255);
                        var9[var34] += class76.method446(var35 >> 8, 255);
                        var8[var34] += class76.method446(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var21 += var9[var25];
                        var22 += var8[var25];
                        var23 += var7[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var21 / 9;
                        int var32 = var23 / 9;
                        var25--;
                        var24--;
                        int var33 = var22 / 9;
                        var19--;
                        var10[var19] = class246.method1640(class246.method1640(var32 << 16, var31 << 8), var33);
                        var22 += var8[var25] - var8[var24];
                        var21 += var9[var25] - var9[var24];
                        var23 += var7[var25] - var7[var24];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field3230[var12];
                        var13--;
                        int var30 = this.field3230[var13];
                        var7[var28] += (class76.method446(16738328, var29) >> 16) - class76.method446(255, var30 >> 16);
                        var9[var28] += -(class76.method446(var30, 65363) >> 8) + (class76.method446(65374, var29) >> 8);
                        var8[var28] += -class76.method446(var30, 255) + class76.method446(255, var29);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3230 = var10;
            }
        }
        return this.field3230;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ln;Ln;B)V")
    public static final void method1217(class138 arg0, class138 arg1, byte arg2) {
        field3229++;
        class197.field3385 = arg0;
        class10.field175 = arg1;
        if (arg2 != 29) {
            method1217((class138) null, (class138) null, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lnj;)V")
    public class191(class226 arg0) {
        this.field3232 = new class149(arg0);
        this.field3247 = arg0.method1471(255) == 1;
        this.field3241 = arg0.method1471(255) == 1;
        arg0.method1471(255);
        arg0.method1471(255);
        int var2 = arg0.method1471(255) & 0x3;
        this.field3238 = arg0.method1428(false);
        this.field3240 = arg0.method1428(false);
        arg0.method1471(255);
        arg0.method1471(255);
    }
}
