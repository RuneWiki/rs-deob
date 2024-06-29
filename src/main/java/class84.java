import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class84 implements class403 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "Lfn;")
    public static class52 field1262 = new class52(61, 5);

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    public static int[] field1266 = new int[2048];

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field1265 = -1;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "[[I")
    public static int[][] field1267 = new int[128][128];

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1264;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class299.field4121 <= (arg3 - arg2) && class248.field3487 >= arg3 + arg2 && arg4 - arg2 >= class53.field874 && (arg2 + arg4) <= class8.field174) {
            class438.method2546(arg1, arg5 - 5261, arg0, arg4, arg6, arg3, arg2);
        } else {
            class81.method556(arg0, arg5 + 24327, arg4, arg6, arg2, arg3, arg1);
        }
        if (arg5 == 5384) {
            field1258++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 28)
    public static final void method580(byte arg0) {
        if (class356.field4959 < 1024.0F) {
            class356.field4959 = 1024.0F;
        }
        field1260++;
        if (class356.field4959 > 3072.0F) {
            class356.field4959 = 3072.0F;
        }
        while (class418.field5750 >= 16384.0F) {
            class418.field5750 -= 16384.0F;
        }
        while (class418.field5750 < 0.0F) {
            class418.field5750 += 16384.0F;
        }
        int var1 = class146.field2068 >> 7;
        int var2 = class222.field3133 >> 7;
        int var3 = class418.method2441(class222.field3133, class76.field1161, class146.field2068, -16778);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class76.field1161;
                    if (var7 < 3 && class473.method2774(false, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class154.field2208.field336 != null && class154.field2208.field336[var7] != null) {
                        var8 = (class154.field2208.field336[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class317.field4306[var7].method710(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (arg0 != 123) {
            method580((byte) 99);
        }
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class272.field3752 < var10) {
            class272.field3752 += (var10 - class272.field3752) / 24;
        } else if (class272.field3752 > var10) {
            class272.field3752 += (var10 - class272.field3752) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!lm", name = "toString", descriptor = "()Ljava/lang/String;", line = 113)
    public final String toString() {
        field1259++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 121)
    public class84(String arg0, int arg1) {
        this.field1255 = arg1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IC)C", line = 131)
    public static final char method581(int arg0, char arg1) {
        if (arg0 != 111) {
            method583(-66);
        }
        field1256++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 525)
    public static void method582(byte arg0) {
        field1266 = null;
        int var1 = 60 / ((arg0 + 8) / 53);
        field1262 = null;
        field1267 = null;
        field1264 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Lcp;", line = 551)
    public static final class421 method583(int arg0) {
        if (arg0 != 1536) {
            return null;
        }
        field1257++;
        try {
            return (class421) Class.forName("hp").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
