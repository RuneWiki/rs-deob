import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class437 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6476 = new Rectangle[100];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lmia;")
    public static class63 field6478 = new class63(44, 4);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field6480 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILha;Ltl;Lfo;)V")
    public static final void method2702(int arg0, class60 arg1, class622 arg2, class519 arg3) {
        field6475++;
        class536 var4 = arg3.method3063(arg1, (byte) -100);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1517();
        if (arg0 != 7511) {
            method2702(17, null, null, null);
        }
        if (var5 < var4.method1510()) {
            var5 = var4.method1510();
        }
        byte var6 = 10;
        int var7 = arg2.field8730;
        int var8 = arg2.field8728;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field7424 != null) {
            var9 = class232.field3385.method584(class252.field3635, null, arg3.field7424, (byte) 102, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class252.field3635[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class381.field5751.method2877(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class381.field5751.method2878() * var9 + (class381.field5751.method2879() / 2);
        }
        int var15 = var5 / 2 + arg2.field8730;
        int var16 = arg2.field8728;
        if (class84.field1199 + var5 > var7) {
            var7 = class84.field1199;
            var15 = var10 / 2 + var6 + var5 / 2 + class84.field1199 + 5;
        } else if (class84.field1189 - var5 < var7) {
            var15 = class84.field1189 - (var5 / 2) - (var10 / 2) - var6 - 5;
            var7 = class84.field1189 - var5;
        }
        if (var8 < class84.field1195 + var5) {
            var8 = class84.field1195;
            var16 = var5 / 2 + class84.field1195 + var6;
        } else if (class84.field1191 - var5 < var8) {
            var16 = class84.field1191 - (var5 / 2) - var11 - var6;
            var8 = class84.field1191 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field8730), (double) (var8 - arg2.field8728)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method3147((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field7424 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var10 + var18 + 10;
            var21 = var9 * class381.field5751.method2878() + var16 + 3;
            if (arg3.field7410 != 0) {
                arg1.method482(var18, arg3.field7410, var20 - var18, 1, var16, var21 - var16);
            }
            if (arg3.field7406 != 0) {
                arg1.method481(arg3.field7406, arg0 - 7618, var18, var16, var20 - var18, -var16 + var21);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class252.field3635[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class381.field5751.method2874(arg1, var23, var15, var16, arg3.field7428, true);
                var16 += class381.field5751.method2878();
            }
        }
        if (arg3.field7439 == -1 && arg3.field7424 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class299 var25 = new class299(arg2);
        var25.field4234 = var8 + var24;
        var25.field4238 = var7 + var24;
        var25.field4236 = var19;
        var25.field4247 = var20;
        var25.field4242 = var21;
        var25.field4248 = var18;
        var25.field4246 = var7 - var24;
        var25.field4235 = var8 - var24;
        class603.field8529.method1203(var25, (byte) -120);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method2703(byte arg0) {
        if (arg0 >= 62) {
            field6478 = null;
            field6476 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2704(String arg0, boolean arg1) {
        field6479++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class712.method4064(-13, arg0);
        if (!arg1 || var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class690.field9544; var3++) {
            String var4 = class133.field1790[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class712.method4064(-13, var4);
            if (var5 != null && var5.equals(var2)) {
                class690.field9544--;
                for (int var6 = var3; var6 < class690.field9544; var6++) {
                    class133.field1790[var6] = class133.field1790[var6 + 1];
                    class71.field1003[var6] = class71.field1003[var6 + 1];
                    class686.field9486[var6] = class686.field9486[var6 + 1];
                    class12.field172[var6] = class12.field172[var6 + 1];
                    class693.field9576[var6] = class693.field9576[var6 + 1];
                    class581.field8258[var6] = class581.field8258[var6 + 1];
                }
                class385.field5812++;
                class211.field3149 = class589.field8351;
                class468 var7 = class93.method734(class29.field284, class189.field2862, 8174);
                var7.field6839.method3730(113, class574.method3322(arg0, 16383));
                var7.field6839.method3692(127, arg0);
                class120.method872((byte) 69, var7);
                return;
            }
        }
    }
}
