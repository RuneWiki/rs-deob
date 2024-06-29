import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class129 extends class172 {

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "Z")
    public boolean field2282 = false;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Ljd;")
    private class87 field2271;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "Z")
    private boolean field2283;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
    private boolean field2275;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    private int field2286;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "Lid;")
    public static class149 field2278 = class60.method382("Konfig geladen)3", (byte) 16);

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    public static int field2285 = -1;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "Lvj;")
    public static class115 field2273 = new class115(64);

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "Lid;")
    private static class149 field2288 = class60.method382("Opened title screen", (byte) 94);

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "Lid;")
    public static class149 field2290 = field2288;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "Z")
    public static boolean field2292 = false;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "F")
    private float field2280;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "[I")
    private int[] field2281;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lal;BLpc;)Z")
    public final boolean method898(class230 arg0, byte arg1, class21 arg2) {
        field2289++;
        if (arg1 >= -34) {
            this.method902(true, 97);
        }
        return this.field2271.method644(arg2, (byte) 115, arg0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public static final boolean method899(int arg0, int arg1) {
        int var2 = 96 % ((arg0 - 37) / 53);
        field2274++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static void method900(int arg0) {
        field2273 = null;
        field2290 = null;
        field2288 = null;
        field2278 = null;
        if (arg0 != -22760) {
            field2290 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lei;ILei;)V")
    public static final void method901(class172 arg0, int arg1, class172 arg2) {
        if (arg1 != 1) {
            field2291 = 37;
        }
        field2279++;
        if (arg2.field3178 != null) {
            arg2.method1230(24120);
        }
        arg2.field3178 = arg0;
        arg2.field3172 = arg0.field3172;
        arg2.field3178.field3172 = arg2;
        arg2.field3172.field3178 = arg2;
    }

    @OriginalMember(owner = "client!qi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2270++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
    public final void method902(boolean arg0, int arg1) {
        field2276++;
        if (!arg0 || this.field2281 == null || this.field2277 == 0 && this.field2286 == 0) {
            return;
        }
        if (class128.field2250 == null || class128.field2250.length < this.field2281.length) {
            class128.field2250 = new int[this.field2281.length];
        }
        int var3 = this.field2281.length == 4096 ? 64 : 128;
        int var4 = this.field2281.length;
        int var5 = var3 - 1;
        int var6 = this.field2286 * arg1;
        int var7 = this.field2277 * arg1 * var3;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var7 + var9 & var8;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = var11 + (var5 & var6 + var12);
                class128.field2250[var13] = this.field2281[var14];
            }
        }
        int[] var10 = this.field2281;
        this.field2281 = class128.field2250;
        class128.field2250 = var10;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
    public static final void method903(byte arg0) {
        field2269++;
        int var1 = -38 / ((52 - arg0) / 56);
        class148.field2666.method1291(0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZBLpc;Lal;)[I")
    public final int[] method904(boolean arg0, byte arg1, class21 arg2, class230 arg3) {
        field2284++;
        if (!this.field2271.method644(arg2, (byte) 115, arg3)) {
            return null;
        }
        if (arg1 < 27) {
            this.field2277 = -42;
        }
        int var5 = arg0 ? 64 : 128;
        return this.field2271.method649(arg2, arg3, 71, this.field2275, var5, false, 1.0D, var5);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lal;Lpc;IFZ)[I")
    public final int[] method905(class230 arg0, class21 arg1, int arg2, float arg3, boolean arg4) {
        field2272++;
        if (this.field2281 == null || this.field2280 != arg3) {
            if (!this.field2271.method644(arg1, (byte) 115, arg0)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field2281 = this.field2271.method649(arg1, arg0, arg2 ^ 0xFFFF87E5, this.field2275, var6, true, (double) arg3, var6);
            this.field2280 = arg3;
            if (this.field2283) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field2281[var12];
                        var7[var34] += class136.method953(var35, 16751932) >> 16;
                        var8[var34] += class136.method953(var35, 65307) >> 8;
                        var9[var34] += class136.method953(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var25 += var7[var21];
                        var24 += var9[var21];
                        var23 += var8[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var23 / 9;
                        int var32 = var24 / 9;
                        int var33 = var25 / 9;
                        var19--;
                        var10[var19] = class40.method238(class40.method238(var31 << 8, var33 << 16), var32);
                        var22--;
                        var21--;
                        var25 += var7[var21] - var7[var22];
                        var24 += var9[var21] - var9[var22];
                        var23 += var8[var21] - var8[var22];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var22 == 0) {
                            var22 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field2281[var13];
                        var12--;
                        int var30 = this.field2281[var12];
                        var7[var28] += -(class136.method953(16739253, var29) >> 16) + class136.method953(255, var30 >> 16);
                        var8[var28] += class136.method953(var30 >> 8, 255) - class136.method953(255, var29 >> 8);
                        var9[var28] += -class136.method953(255, var29) + class136.method953(var30, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field2281 = var10;
            }
        }
        return arg2 == -30813 ? this.field2281 : null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lgd;)V")
    public class129(class74 arg0) {
        this.field2271 = new class87(arg0);
        this.field2283 = arg0.method489((byte) -22) == 1;
        this.field2275 = arg0.method489((byte) -125) == 1;
        arg0.method489((byte) -55);
        arg0.method489((byte) 95);
        int var2 = arg0.method489((byte) -40) & 0x3;
        this.field2286 = arg0.method514((byte) 1);
        this.field2277 = arg0.method514((byte) 1);
        arg0.method489((byte) 93);
        arg0.method489((byte) 79);
    }
}
