import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class class410 {

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6546 = new String[] { method3294(method3293("`}\u0002N~#")), method3294(method3293("el\u000f\f")), method3294(method3293("p7MNG")), method3294(method3293("`}\u0002N\u007f#")), method3294(method3293("`}\u0002Ny#")), method3294(method3293("`}\u0002N|#")) };

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "F")
    public static float field6543;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZB)Z", line = 7)
    public static final boolean method3288(boolean arg0, byte arg1) {
        try {
            field6541++;
            if (arg1 > -5) {
                field6543 = -0.59779644F;
            }
            boolean var2 = class662.field9437.method167();
            if (var2 == arg0) {
                return true;
            }
            if (!arg0) {
                class662.field9437.method215();
            } else if (!class662.field9437.method263()) {
                arg0 = false;
            }
            if (arg0 == var2) {
                return false;
            } else {
                class623.field8996.method3244(22733, class623.field8996.field6351, arg0 ? 1 : 0);
                class574.method4222((byte) -119);
                return true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6546[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)Lhu;", line = 43)
    public static final class139 method3289(int arg0) {
        try {
            class302.field4871 = 0;
            if (arg0 != 1) {
                field6543 = 0.2571823F;
            }
            field6542++;
            return class634.method4600((byte) 115);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6546[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 60)
    public static final void method3291(int arg0) {
        try {
            field6545++;
            if (class492.field7416 != null) {
                class355.field5711 = new class676();
                class355.field5711.method4923(class492.field7416.field9611, (byte) 103, class662.field9438, class492.field7416.field9615.method5154(class795.field11624, (byte) 65), class492.field7416);
                if (arg0 != 0) {
                    field6543 = -0.098748125F;
                }
                class789.field11526 = new Thread(class355.field5711, "");
                class789.field11526.start();
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6546[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([BB)Z", line = 77)
    public static final boolean method3292(byte[] arg0, byte arg1) {
        try {
            field6544++;
            class176 var2 = new class176(arg0);
            int var3 = var2.method1645((byte) -92);
            if (var3 != 2) {
                return false;
            }
            boolean var4 = var2.method1645((byte) -85) == 1;
            if (var4) {
                class304.method2612(var2, (byte) -74);
            }
            if (arg1 <= 120) {
                return true;
            } else {
                class487.method3699(93, var2);
                return true;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6546[3] + (arg0 == null ? field6546[1] : field6546[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(FFIIII[FFIFI)V")
    public abstract void method3290(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, int arg10);

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3293(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3294(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
