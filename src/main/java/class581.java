import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class581 extends class182 {

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public int field8368;

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8376 = new String[] { method4269(method4268("Z\r3;\u0016^\u0013i9W")), method4269(method4268("Z\r3DW")), method4269(method4268("Z\r3FW")), method4269(method4268("Z\r3EW")), method4269(method4268("^\u000fqk")), method4269(method4268("KT3)\u0002")) };

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field8367 = -1;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "Lhl;")
    public static class556 field8372 = new class556(63, -1);

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "Lvn;")
    public static class330 field8373 = new class330(26, 7);

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "Lv;")
    public static class606 field8374 = new class606(64);

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "Lqn;")
    public static class68 field8375;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILgda;I)Lkm;")
    public static final class373 method4265(int arg0, class58 arg1, int arg2) {
        try {
            field8371++;
            byte[] var3 = arg1.method587(arg0, true);
            if (var3 == null) {
                return null;
            } else {
                if (arg2 > -87) {
                    method4266(17, -2, 2, 121, -128, 90);
                }
                return new class373(var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8376[3] + arg0 + ',' + (arg1 == null ? field8376[4] : field8376[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIII)V")
    public static final void method4266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            class133.field1899 = arg5;
            class75.field1095 = arg3;
            field8370++;
            class445.field6925 = arg2;
            class307.field4978 = arg4;
            class740.field10885 = arg0;
            int var6 = 121 % ((arg1 - 7) / 49);
            if (class740.field10885 >= 100) {
                int var7 = class133.field1899 * 512 + 256;
                int var8 = class307.field4978 * 512 + 256;
                int var9 = class207.method1873(var7, -10, class673.field9554, var8) - class75.field1095;
                int var10 = var7 - class791.field11550;
                int var11 = var9 - class396.field6285;
                int var12 = var8 - class133.field1896;
                int var13 = (int) Math.sqrt((double) (var10 * var10 + (var12 * var12)));
                class134.field1902 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
                class728.field10661 = (int) (-2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 0x3FFF;
                class554.field8109 = 0;
                if (class134.field1902 < 1024) {
                    class134.field1902 = 1024;
                }
                if (class134.field1902 > 3072) {
                    class134.field1902 = 3072;
                }
            }
            class210.field3323 = -1;
            class344.field5593 = -1;
            class401.field6334 = 2;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field8376[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static void method4267(int arg0) {
        try {
            field8374 = null;
            field8373 = null;
            if (arg0 != 10288) {
                field8373 = null;
            }
            field8375 = null;
            field8372 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8376[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(I)V")
    public class581(int arg0) {
        try {
            this.field8368 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8376[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4268(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4269(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
