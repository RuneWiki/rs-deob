import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class93 {

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1055 = new String[] { method797(method796("\f \u0007X1B")), method797(method796("\f \u0007X2B")) };

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "Lwia;")
    public static class790 field1053 = new class790(32, 3);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V", line = 12)
    public static final void method794(int arg0) {
        try {
            field1054++;
            if (class427.field6286 != -1 && class634.field9239 != -1) {
                int var1 = ((class647.field9372 - class204.field3166) * class493.field7070 >> 16) + class204.field3166;
                class493.field7070 += var1;
                if (class493.field7070 >= 65535) {
                    if (class306.field4790) {
                        class176.field2457 = false;
                    } else {
                        class176.field2457 = true;
                    }
                    class493.field7070 = 65535;
                    class306.field4790 = true;
                } else {
                    class176.field2457 = false;
                    class306.field4790 = false;
                }
                float var2 = (float) class493.field7070 / 65535.0F;
                float[] var3 = new float[3];
                int var4 = class486.field7010 * 2;
                for (int var5 = 0; var5 < 3; var5++) {
                    int var6 = class275.field4155[class427.field6286][var4][var5] * 3;
                    int var7 = class275.field4155[class427.field6286][var4 + 1][var5] * 3;
                    int var8 = (class275.field4155[class427.field6286][var4 + 2][var5] + class275.field4155[class427.field6286][var4 - -2][var5] - class275.field4155[class427.field6286][var4 + 3][var5]) * 3;
                    int var9 = class275.field4155[class427.field6286][var4][var5];
                    int var10 = var7 - var6;
                    int var11 = var8 + var6 - (var7 * 2);
                    int var12 = class275.field4155[class427.field6286][var4 + 2][var5] + var7 - var9 - var8;
                    var3[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
                }
                class271.field4116 = (int) var3[0] - (class494.field7101 * 512);
                class144.field1749 = (int) var3[1] * -1;
                class683.field9899 = (int) var3[2] - (class281.field4219 * 512);
                float[] var13 = new float[3];
                int var14 = -90 / ((arg0 + 9) / 55);
                int var15 = class318.field5032 * 2;
                for (int var16 = 0; var16 < 3; var16++) {
                    int var17 = class275.field4155[class634.field9239][var15][var16] * 3;
                    int var18 = class275.field4155[class634.field9239][var15 + 1][var16] * 3;
                    int var19 = (class275.field4155[class634.field9239][var15 + 2][var16] + class275.field4155[class634.field9239][var15 + 2][var16] - class275.field4155[class634.field9239][var15 + 3][var16]) * 3;
                    int var20 = class275.field4155[class634.field9239][var15][var16];
                    int var21 = var18 - var17;
                    int var22 = var19 + var17 - (var18 * 2);
                    int var23 = class275.field4155[class634.field9239][var15 + 2][var16] + var18 - var19 - var20;
                    var13[var16] = (((float) var23 * var2 + (float) var22) * var2 + (float) var21) * var2 + (float) var20;
                }
                float var24 = var13[0] - var3[0];
                float var25 = (var13[1] - var3[1]) * -1.0F;
                float var26 = var13[2] - var3[2];
                double var27 = Math.sqrt((double) (var24 * var24 + var26 * var26));
                class320.field5061 = (int) (Math.atan2((double) var25, var27) * 2607.5945876176133D) & 0x3FFF;
                field1052 = (int) (-Math.atan2((double) var24, (double) var26) * 2607.5945876176133D) & 0x3FFF;
                class684.field9916 = ((class275.field4155[class427.field6286][var4 + 2][3] - class275.field4155[class427.field6286][var4][3]) * class493.field7070 >> 16) + class275.field4155[class427.field6286][var4][3];
            }
        } catch (RuntimeException var30) {
            throw class759.method5498(var30, field1055[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V", line = 114)
    public static void method795(byte arg0) {
        try {
            if (arg0 == -91) {
                field1053 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1055[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method796(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method797(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
