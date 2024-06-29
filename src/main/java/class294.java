import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class294 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Liq;")
    public static class362 field4102 = new class362(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
    public static int[] field4104 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1940(byte arg0) {
        int var1 = 83 / ((-arg0 - 2) / 37);
        field4101++;
        class300.field4197.method1618(0);
        class444.field6373.method1618(0);
        class435.field6251.method1618(0);
        class86.field974.method1618(0);
        class87.field985.method1618(0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I", line = 23)
    public static final int method1941(int arg0) {
        field4098++;
        if (arg0 > -25) {
            method1941(-13);
        }
        return 15;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 36)
    public static void method1942(int arg0) {
        field4104 = null;
        field4102 = null;
        if (arg0 != 19725) {
            method1941(-45);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lli;Lnd;ILae;)V", line = 48)
    public static final void method1943(class246 arg0, class324 arg1, int arg2, class134 arg3) {
        field4103++;
        class381 var4 = arg0.method1678(arg3, -13197);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method765();
        if (var5 < var4.method759()) {
            var5 = var4.method759();
        }
        byte var6 = 10;
        int var7 = arg1.field4611;
        int var8 = arg1.field4616;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field3500 != null) {
            var9 = class152.field1879.method2262(arg0.field3500, (int[]) null, (class381[]) null, class249.field3556, -21293);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class249.field3556[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class279.field3952.method351(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class279.field3952.method352() + (class279.field3952.method354() / 2);
        }
        int var15 = arg1.field4611 + (var5 / 2);
        if ((class308.field4358 + var5) > var7) {
            var15 = var10 / 2 + var5 / 2 + class308.field4358 + var6 + 5;
            var7 = class308.field4358;
        } else if (class308.field4374 - var5 < var7) {
            var15 = class308.field4374 - (var10 / 2) - var6 - (var5 / 2) - 5;
            var7 = class308.field4374 - var5;
        }
        int var16 = arg1.field4616;
        if ((class308.field4375 + var5) > var8) {
            var16 = var5 / 2 + (class308.field4375 + var6);
            var8 = class308.field4375;
        } else if (class308.field4373 - var5 < var8) {
            var8 = class308.field4373 - var5;
            var16 = class308.field4373 - var11 - (var5 / 2 - -var6);
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg1.field4611), (double) (var8 - arg1.field4616)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2448((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        if (arg2 != 1) {
            field4099 = 20;
        }
        int var20 = -2;
        int var21 = -2;
        if (arg0.field3500 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var18 + var10 + 10;
            var21 = var9 * class279.field3952.method352() + var16 + 3;
            if (arg0.field3499 != 0) {
                arg3.method827(var16, var18, var21 - var16, arg2 + -88, var20 - var18, arg0.field3499);
            }
            if (arg0.field3487 != 0) {
                arg3.method830(arg0.field3487, 1, var21 - var16, -var18 + var20, var16, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class249.field3556[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class279.field3952.method350(arg3, var23, var15, var16, arg0.field3513, true);
                var16 += class279.field3952.method352();
            }
        }
        if (arg0.field3490 == -1 && arg0.field3500 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class377 var25 = new class377(arg1);
        var25.field5311 = var8 + var24;
        var25.field5312 = var8 - var24;
        var25.field5313 = var19;
        var25.field5317 = var20;
        var25.field5310 = var7 - var24;
        var25.field5321 = var7 + var24;
        var25.field5322 = var21;
        var25.field5314 = var18;
        class174.field2393.method509((byte) 125, var25);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 198)
    public static final void method1944(boolean arg0) {
        field4100++;
        class443.field6343 = -1;
        if (arg0) {
            class39.field447 = 0;
            class33.field386 = -1;
        }
    }
}
