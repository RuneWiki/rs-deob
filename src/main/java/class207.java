import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class207 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Z")
    public static boolean field3185 = false;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    public static int[] field3187 = new int[25];

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field3206 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lub;")
    public static class92 field3193;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lub;")
    public static class92 field3207;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1448(byte arg0) {
        int var1 = -30 % ((58 - arg0) / 49);
        field3193 = null;
        field3207 = null;
        field3187 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lha;I)Lgl;")
    public static final class223 method1449(class31 arg0, int arg1) {
        field3205++;
        if (arg1 != 32224) {
            method1449((class31) null, 44);
        }
        arg0.method265(-101);
        int var2 = arg0.method265(-110);
        class223 var3 = class295.method1964(var2, (byte) 102);
        var3.field3576 = arg0.method265(-128);
        int var4 = arg0.method265(-101);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method265(-119);
            var3.method37(arg0, var6, (byte) 102);
        }
        var3.method43(500);
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIZIIIZ)V")
    public static final void method1450(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field3189++;
        if (!arg0 && class303.field4870 == arg2 && class279.field4424 == arg5 && class230.field3649 == arg1 || class110.method819(!arg7)) {
            return;
        }
        class230.field3649 = arg1;
        class279.field4424 = arg5;
        class303.field4870 = arg2;
        if (class110.method819(!arg7)) {
            class230.field3649 = 0;
        }
        if (arg3) {
            class248.method1679(28, 2);
        } else {
            class248.method1679(25, 2);
        }
        class56.method469((byte) -52, arg7, class166.field2515);
        int var8 = class138.field2072;
        class138.field2072 = (arg2 - 6) * 8;
        int var9 = class159.field2379;
        class159.field2379 = (arg5 - 6) * 8;
        class109.field1684 = class98.method763(false, class303.field4870 * 8, class279.field4424 * 8);
        class145.field2147 = null;
        int var10 = class138.field2072 - var8;
        int var11 = class159.field2379 - var9;
        int var12 = class138.field2072;
        int var13 = class159.field2379;
        if (arg3) {
            class117.field1782 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class161 var33 = class116.field1781[var17];
                if (var33 != null) {
                    var33.field4709 -= var11 * 128;
                    var33.field4725 -= var10 * 128;
                    if (var33.field4725 >= 0 && var33.field4725 <= 13184 && var33.field4709 >= 0 && var33.field4709 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field4749[var34] -= var10;
                            var33.field4673[var34] -= var11;
                        }
                        class255.field4084[class117.field1782++] = var17;
                    } else {
                        class116.field1781[var17].method1164(-11497, (class95) null);
                        class116.field1781[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class161 var15 = class116.field1781[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4749[var16] -= var10;
                        var15.field4673[var16] -= var11;
                    }
                    var15.field4709 -= var11 * 128;
                    var15.field4725 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class136 var31 = class233.field3682[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field4749[var32] -= var10;
                    var31.field4673[var32] -= var11;
                }
                var31.field4725 -= var10 * 128;
                var31.field4709 -= var11 * 128;
            }
        }
        byte var19 = 104;
        class130.field1941 = arg1;
        byte var20 = 1;
        byte var21 = 0;
        if (var10 < 0) {
            var20 = -1;
            var21 = 103;
            var19 = -1;
        }
        class263.field4168.method1014(arg6, (byte) 86, false, arg4);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        if (var11 < 0) {
            var24 = -1;
            var23 = -1;
            var22 = 103;
        }
        for (int var25 = var21; var25 != var19; var25 += var20) {
            for (int var27 = var22; var27 != var23; var27 += var24) {
                int var28 = var25 + var10;
                int var29 = var27 + var11;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class110.field1695[var30][var25][var27] = class110.field1695[var30][var28][var29];
                    } else {
                        class110.field1695[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class221 var26 = (class221) class262.field4152.method6(-120); var26 != null; var26 = (class221) class262.field4152.method11((byte) 36)) {
            var26.field3372 -= var11;
            var26.field3376 -= var10;
            if (var26.field3376 < 0 || var26.field3372 < 0 || var26.field3376 >= 104 || var26.field3372 >= 104) {
                var26.method995((byte) 110);
            }
        }
        class274.field4367 = 0;
        if (arg3) {
            class79.field1204 -= var10;
            class286.field4495 -= var10;
            class226.field3616 -= var10 * 128;
            class15.field181 -= var11;
            class293.field4550 -= var11;
            class118.field1787 -= var11 * 128;
        } else {
            class175.field2704 = 1;
        }
        if (class305.field4895 != 0) {
            class305.field4895 -= var10;
            class296.field4669 -= var11;
        }
        class195.field3057 = -1;
        class241.field3841.method9(121);
        class22.field350.method9(119);
        class249.method1693();
    }
}
