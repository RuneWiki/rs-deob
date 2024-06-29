import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class138 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lhi;")
    public static class192 field2174 = new class192(0, 0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lak;")
    public static class172 field2179;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", line = 10)
    public static final void method1021(String arg0, String arg1, String arg2, int arg3, int arg4) {
        int var5 = 22 % ((arg4 + 34) / 39);
        field2173++;
        class236.method1710(arg2, arg3, arg1, arg0, -13, -1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIB)V", line = 23)
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2175++;
        class111 var5 = (class111) class76.field1064.method451((long) arg2, (byte) 100);
        if (var5 == null) {
            var5 = new class111();
            class76.field1064.method461(-12, (long) arg2, var5);
        }
        if (arg1 >= var5.field1644.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1644.length; var8++) {
                var6[var8] = var5.field1644[var8];
                var7[var8] = var5.field1643[var8];
            }
            for (int var9 = var5.field1644.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1644 = var6;
            var5.field1643 = var7;
        }
        if (arg4 < 28) {
            field2179 = (class172) null;
        }
        var5.field1644[arg1] = arg3;
        var5.field1643[arg1] = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII)I", line = 73)
    public static final int method1023(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 72 % ((39 - arg2) / 60);
        field2176++;
        int var5 = arg1 & 0x3;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return arg3;
        } else if (var5 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ICI)C", line = 97)
    public static final char method1024(int arg0, char arg1, int arg2) {
        field2172++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        }
        if (arg2 != -506) {
            method1021((String) null, (String) null, (String) null, -47, -106);
        }
        if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 183)
    public static final void method1025(int arg0, boolean arg1, String arg2) {
        field2171++;
        byte var3 = 4;
        int var4 = class296.field4688.method1807(arg2, 250);
        int var5 = var3 + 6;
        int var6 = class296.field4688.method1790(arg2, 250) * 13;
        int var7 = var3 + 6;
        if (class232.field3690) {
            class75.method505(var5 - var3, var7 - var3, var3 + var3 + var4, var3 + var6 + var3, 0);
            class75.method507(var5 - var3, var7 - var3, var3 + var4 + var3, var3 - -var3 + var6, 16777215);
        } else {
            class59.method382(var5 - var3, -var3 + var7, var3 + var3 + var4, var3 + var6 + var3, 0);
            class59.method390(var5 - var3, -var3 + var7, var4 + var3 + var3, var3 + var6 - -var3, 16777215);
        }
        class296.field4688.method1802(arg2, var5, var7, var4, var6, 16777215, -1, 1, 1, 0);
        class93.method620(true, var3 + var4 + var3, -var3 + var5, var3 + var3 + var6, -var3 + var7);
        if (!arg1) {
            class234.method1693(var5, var6, var7, var4, (byte) 4);
        } else if (class232.field3690) {
            class232.method1675();
        } else {
            try {
                Graphics var8 = class94.field1290.getGraphics();
                class8.field120.method557(0, 0, var8, arg0 - 53874);
            } catch (Exception var10) {
                class94.field1290.repaint();
            }
        }
        if (arg0 != 26835) {
            method1026(-26);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 236)
    public static void method1026(int arg0) {
        field2174 = null;
        field2179 = null;
        if (arg0 != -5086) {
            field2177 = 62;
        }
    }
}
