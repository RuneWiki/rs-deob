import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class186 extends class147 {

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "Z")
    public boolean field3281 = false;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "Lbb;")
    private class256 field3273;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "Z")
    private boolean field3260;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "Z")
    private boolean field3279;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    private int field3275;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    private int field3261;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Lqj;")
    public static class196 field3259 = class80.method502("slr2)3ws?order=LPWM", -48);

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Lqj;")
    public static class196 field3267 = class80.method502("lila:", -48);

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
    public static int field3276 = -1;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "F")
    private float field3264;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "J")
    public static long field3278;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "Lnb;")
    public static class95 field3271;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "[I")
    private int[] field3277;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "[[[Lid;")
    public static class61[][][] field3270;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLjava/awt/Component;I)Lge;")
    public static final class144 method1215(int arg0, byte arg1, Component arg2, int arg3) {
        field3266++;
        try {
            if (arg1 == -17) {
                Class var4 = Class.forName("le");
                class144 var5 = (class144) var4.getDeclaredConstructor().newInstance();
                var5.method208(arg3, arg0, arg2, arg1 ^ 0xFFFFFFE7);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class40 var6 = new class40();
            var6.method208(arg3, arg0, arg2, arg1 ^ 0xFFFFFFE7);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(FLbk;Lkc;IZ)[I")
    public final int[] method1216(float arg0, class136 arg1, class222 arg2, int arg3, boolean arg4) {
        field3268++;
        if (this.field3277 == null || this.field3264 != arg0) {
            if (!this.field3273.method1719(arg1, arg2, (byte) -65)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field3277 = this.field3273.method1720(var6, arg2, var6, this.field3279, true, arg1, (double) arg0, true);
            this.field3264 = arg0;
            if (this.field3260) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field3277[var13];
                        var7[var34] += class65.method409(var35 >> 16, 255);
                        var8[var34] += class65.method409(var35 >> 8, 255);
                        var10[var34] += class65.method409(var35, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    for (int var25 = 2; var25 >= 0; var25--) {
                        var21--;
                        var22 += var8[var21];
                        var23 += var10[var21];
                        var24 += var7[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    int var26 = 1;
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        var21--;
                        int var32 = var23 / 9;
                        var26--;
                        int var33 = var24 / 9;
                        var19--;
                        var9[var19] = class1.method6(class1.method6(var31 << 8, var33 << 16), var32);
                        var23 += var10[var21] - var10[var26];
                        var24 += var7[var21] - var7[var26];
                        var22 += var8[var21] - var8[var26];
                        if (var26 == 0) {
                            var26 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field3277[var13];
                        var14--;
                        int var30 = this.field3277[var14];
                        var7[var28] += -class65.method409(var30 >> 16, 255) + (class65.method409(var29, 16713098) >> 16);
                        var8[var28] += -class65.method409(var30 >> 8, 255) + class65.method409(255, var29 >> 8);
                        var10[var28] += -class65.method409(255, var30) + class65.method409(var29, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3277 = var9;
            }
        }
        return arg3 == -32039 ? this.field3277 : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)I")
    public static final int method1217(int arg0, int arg1, int arg2, int arg3) {
        field3269++;
        if (arg3 != 18291) {
            field3270 = null;
        }
        if (arg0 > arg2) {
            return arg0;
        } else if (arg1 < arg2) {
            return arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)V")
    public final void method1218(int arg0, int arg1) {
        if (arg1 != 128) {
            field3271 = null;
        }
        field3263++;
        if (this.field3277 == null || this.field3261 == 0 && this.field3275 == 0) {
            return;
        }
        if (class29.field364 == null || this.field3277.length > class29.field364.length) {
            class29.field364 = new int[this.field3277.length];
        }
        int var3 = this.field3277.length == 4096 ? 64 : 128;
        int var4 = this.field3277.length;
        int var5 = this.field3275 * arg0;
        int var6 = arg0 * var3 * this.field3261;
        int var7 = var3 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var9 + var6 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 + var12 & var7) + var11;
                class29.field364[var13] = this.field3277[var14];
            }
        }
        int[] var10 = this.field3277;
        this.field3277 = class29.field364;
        class29.field364 = var10;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLkc;ILbk;)[I")
    public final int[] method1219(boolean arg0, class222 arg1, int arg2, class136 arg3) {
        if (arg2 != -20672) {
            field3259 = null;
        }
        field3272++;
        if (this.field3273.method1719(arg3, arg1, (byte) -65)) {
            int var5 = arg0 ? 64 : 128;
            return this.field3273.method1720(var5, arg1, var5, this.field3279, false, arg3, 1.0D, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method1220(boolean arg0) {
        field3265++;
        if (class194.field3408 != null) {
            class194.field3408.method481(true);
            class194.field3408 = null;
        }
        class197.field3500 = class168.field2844.method1397(class56.field698, (byte) -40, class6.field47);
        if (arg0) {
            method1222(68);
        }
        class168.field2805 = 1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILkc;Lbk;)Z")
    public final boolean method1221(int arg0, class222 arg1, class136 arg2) {
        field3262++;
        if (arg0 != -2905) {
            field3276 = 56;
        }
        return this.field3273.method1719(arg2, arg1, (byte) -65);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    public static void method1222(int arg0) {
        field3271 = null;
        if (arg0 != 11309) {
            method1217(75, 13, 116, -50);
        }
        field3259 = null;
        field3267 = null;
        field3270 = null;
    }

    @OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3274++;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lp;)V")
    public class186(class56 arg0) {
        this.field3273 = new class256(arg0);
        this.field3260 = arg0.method367(1) == 1;
        this.field3279 = arg0.method367(1) == 1;
        arg0.method367(1);
        arg0.method367(1);
        int var2 = arg0.method367(1) & 0x3;
        this.field3275 = arg0.method350(16);
        this.field3261 = arg0.method350(16);
        arg0.method367(1);
        arg0.method367(1);
    }
}
