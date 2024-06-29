import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class357 extends class189 {

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field5083 = 0;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Ltia;")
    public static class266 field5086 = new class266();

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field5088 = new String[100];

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public int field5075;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public int field5081;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "Ljb;")
    public class493 field5074;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Ljb;")
    public class493 field5082;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Ljava/lang/String;")
    public String field5080;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Z")
    public boolean field5087;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field5076;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lpea;Lgda;B)Lhha;")
    public static final class519 method2293(class724 arg0, class53 arg1, byte arg2) {
        field5078++;
        class519 var3 = class184.method1163(false);
        var3.field7381 = arg1;
        var3.field7382 = arg1.field608;
        int var4 = -80 / ((13 - arg2) / 34);
        if (var3.field7382 == -1) {
            var3.field7384 = new class682(260);
        } else if (var3.field7382 == -2) {
            var3.field7384 = new class682(10000);
        } else if (var3.field7382 <= 18) {
            var3.field7384 = new class682(20);
        } else if (var3.field7382 <= 98) {
            var3.field7384 = new class682(100);
        } else {
            var3.field7384 = new class682(260);
        }
        var3.field7384.method3826(arg0, 12693);
        var3.field7384.method3824(-16073, var3.field7381.method329(-20537));
        var3.field7379 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lee;II)V")
    public static final void method2294(class675 arg0, int arg1, int arg2) {
        if (class209.field2757 != null) {
            try {
                class209.field2757.method2581(0L, true);
                class209.field2757.method2578(24, (byte) 72, arg0.field9154, arg2);
            } catch (Exception var3) {
            }
        }
        field5079++;
        if (arg1 != 0) {
            method2296(false);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lafa;ILha;Lek;)V")
    public static final void method2295(class344 arg0, int arg1, class58 arg2, class507 arg3) {
        field5077++;
        class88 var4 = arg0.method2229(arg2, 131072);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method657();
        if (var4.method663() > var5) {
            var5 = var4.method663();
        }
        if (arg1 != 0) {
            method2295(null, -75, null, null);
        }
        byte var6 = 10;
        int var7 = arg3.field7258;
        int var8 = arg3.field7260;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field4847 != null) {
            var9 = class219.field2859.method993(arg0.field4847, class227.field3058, null, 60, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class227.field3058[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class134.field1955.method628(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class134.field1955.method627() * var9 + class134.field1955.method626() / 2;
        }
        int var15 = var5 / 2 + arg3.field7258;
        int var16 = arg3.field7260;
        if (class678.field9306 + var5 > var7) {
            var15 = var10 / 2 + (var5 / 2 + class678.field9306 + var6 + 5);
            var7 = class678.field9306;
        } else if (var7 > class678.field9298 - var5) {
            var7 = class678.field9298 - var5;
            var15 = class678.field9298 + (-(var10 / 2) - 5) - var6 - var5 / 2;
        }
        if (var8 < (class678.field9289 + var5)) {
            var8 = class678.field9289;
            var16 = var5 / 2 + class678.field9289 + var6;
        } else if (var8 > class678.field9301 - var5) {
            var8 = class678.field9301 - var5;
            var16 = class678.field9301 - (var5 / 2) - (var6 + var11);
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg3.field7258), (double) (var8 - arg3.field7260)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method664((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field4847 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = class134.field1955.method627() * var9 + (var16 + 3);
            var20 = var10 + var18 + 10;
            if (arg0.field4829 != 0) {
                arg2.method417(arg0.field4829, var18, var16, (byte) 72, var21 - var16, -var18 + var20);
            }
            if (arg0.field4824 != 0) {
                arg2.method393(var16, arg0.field4824, var21 - var16, var20 - var18, 120, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class227.field3058[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class134.field1955.method630(arg2, var23, var15, var16, arg0.field4846, true);
                var16 += class134.field1955.method627();
            }
        }
        if (arg0.field4803 == -1 && arg0.field4847 == null) {
            return;
        }
        class547 var24 = new class547(arg3);
        int var25 = var5 >> 1;
        var24.field7636 = var20;
        var24.field7633 = var8 - var25;
        var24.field7630 = var7 + var25;
        var24.field7631 = var19;
        var24.field7632 = var8 + var25;
        var24.field7634 = var18;
        var24.field7629 = var21;
        var24.field7635 = var7 - var25;
        class724.field10104.method2770((byte) -13, var24);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    public static void method2296(boolean arg0) {
        field5086 = null;
        field5088 = null;
        if (arg0) {
            method2294(null, 87, -122);
        }
    }
}
