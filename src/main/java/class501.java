import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class501 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lla;")
    public static class319 field7392 = new class319(111, 1);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field7395 = 1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lla;")
    public static class319 field7394 = null;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lof;")
    public static class446 field7396 = new class446(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field7398 = -1;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Ltr;")
    public static class195 field7397;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 3)
    public static void method3004(int arg0) {
        field7392 = null;
        field7394 = null;
        field7396 = null;
        if (arg0 != 0) {
            method3005(null, null, null, false);
        }
        field7397 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lmk;Lqa;Lfb;Z)V", line = 27)
    public static final void method3005(class38 arg0, class165 arg1, class484 arg2, boolean arg3) {
        field7393++;
        class341 var4 = arg0.method324(-28866, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method296();
        if (var5 < var4.method305()) {
            var5 = var4.method305();
        }
        byte var6 = 10;
        int var7 = arg2.field7133;
        int var8 = arg2.field7126;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field550 != null) {
            var9 = class55.field768.method565(null, class306.field4445, arg0.field550, null, (byte) 119);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class306.field4445[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class429.field6539.method721(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class429.field6539.method719() * var9 + class429.field6539.method718() / 2;
        }
        int var15 = var5 / 2 + arg2.field7133;
        int var16 = arg2.field7126;
        if (class12.field239 + var5 > var7) {
            var7 = class12.field239;
            var15 = var10 / 2 + var5 / 2 + var6 + class12.field239 + 5;
        } else if (class12.field242 - var5 < var7) {
            var7 = class12.field242 - var5;
            var15 = class12.field242 - (var5 / 2) - var6 - var10 / 2 - 5;
        }
        if (var8 < class12.field227 + var5) {
            var16 = var5 / 2 + var6 + class12.field227;
            var8 = class12.field227;
        } else if (class12.field229 - var5 < var8) {
            var8 = class12.field229 - var5;
            var16 = class12.field229 - var5 / 2 - var6 - var11;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field7133), (double) (var8 - arg2.field7126)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2204((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        if (arg3) {
            field7394 = null;
        }
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field550 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var20 = var10 + var18 + 10;
            var21 = var9 * class429.field6539.method719() + var16 + 3;
            if (arg0.field533 != 0) {
                arg1.method1117(var21 - var16, var16, arg0.field533, var18, var20 - var18, (byte) 73);
            }
            if (arg0.field544 != 0) {
                arg1.method1128(var18, var21 - var16, arg0.field544, -4, var20 - var18, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class306.field4445[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class429.field6539.method722(arg1, var23, var15, var16, arg0.field552, true);
                var16 += class429.field6539.method719();
            }
        }
        if (arg0.field536 == -1 && arg0.field550 == null) {
            return;
        }
        class408 var24 = new class408(arg2);
        int var25 = var5 >> 1;
        var24.field6200 = var20;
        var24.field6192 = var8 - var25;
        var24.field6197 = var21;
        var24.field6196 = var19;
        var24.field6189 = var8 + var25;
        var24.field6190 = var7 - var25;
        var24.field6195 = var18;
        var24.field6191 = var7 + var25;
        class372.field5663.method453((byte) 124, var24);
    }
}
