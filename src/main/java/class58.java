import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class58 extends class369 {

    @OriginalMember(owner = "client!or", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field818 = new String[] { method618(method617("Sp)p")), method618(method617("RwkVw")), method618(method617("F+k2\"")), method618(method617("RwkPw")), method618(method617("RwkWw")) };

    @OriginalMember(owner = "client!or", name = "k", descriptor = "Lci;")
    public static class49 field817 = class597.method4406(55);

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
    public static void method614(byte arg0) {
        try {
            if (arg0 != -16) {
                method615(null, 95, null, null, null, null);
            }
            field817 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field818[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lwm;ILlga;Llga;Lng;Llga;)Z")
    public static final boolean method615(class440 arg0, int arg1, class47 arg2, class47 arg3, class429 arg4, class47 arg5) {
        try {
            class604.field8671 = new int[16];
            class177.field2315 = arg0;
            field815++;
            class74.field1065 = arg5;
            class786.field11354 = arg4;
            class285.field4006 = arg3;
            class521.field7602 = arg2;
            for (int var6 = arg1; var6 < 16; var6++) {
                class604.field8671[var6] = 255;
            }
            return true;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field818[1] + (arg0 == null ? field818[0] : field818[2]) + ',' + arg1 + ',' + (arg2 == null ? field818[0] : field818[2]) + ',' + (arg3 == null ? field818[0] : field818[2]) + ',' + (arg4 == null ? field818[0] : field818[2]) + ',' + (arg5 == null ? field818[0] : field818[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([FBI)[F")
    public static final float[] method616(float[] arg0, byte arg1, int arg2) {
        try {
            if (arg1 < 83) {
                return null;
            } else {
                field816++;
                float[] var3 = new float[arg2];
                class569.method4244(arg0, 0, var3, 0, arg2);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field818[3] + (arg0 == null ? field818[0] : field818[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)Lgfa;")
    public abstract class112 method491(byte arg0);

    @OriginalMember(owner = "client!or", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method617(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!or", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method618(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
