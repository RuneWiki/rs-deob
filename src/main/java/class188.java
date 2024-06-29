import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class188 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
    public static int[] field2613 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Z")
    public static boolean field2614 = false;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2608 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lng;")
    public static class190 field2607 = new class190(5);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
    public static boolean field2609;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljk;IIIII)V")
    public static final void method1232(class378 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5386 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field5391[var6] != null) {
                arg0.field5386++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field5386; var7++) {
            int var8 = class36.field551[arg1][arg2][arg3];
            while (var8 != 0) {
                class347 var12 = class84.field1302[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field5391[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class36.field551[arg1][arg4][arg5];
            while (var9 != 0) {
                class347 var11 = class84.field1302[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field5391[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field5386 - 1; var10++) {
                arg0.field5391[var10] = arg0.field5391[var10 + 1];
            }
            arg0.field5386--;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
    public static final String method1233(int arg0, boolean arg1, long arg2, int arg3, int arg4) {
        field2610++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 != -11142) {
            method1232((class378) null, -89, 90, 105, -101, -62);
        }
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (48 - (((int) arg2 * 10) - var11)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1234(int arg0, byte arg1) {
        field2612++;
        String var2 = Integer.toString(arg0);
        if (arg1 >= -91) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class282.field3868 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class403.field5870 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2613 = null;
        field2607 = null;
        if (arg0 != 64) {
            field2611 = 19;
        }
        field2608 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public static final void method1236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field2615++;
        class368 var7 = new class368();
        var7.field5156 = class35.field541 + arg3;
        var7.field5160 = arg6;
        var7.field5154 = arg4;
        var7.field5159 = arg5;
        var7.field5155 = arg0;
        var7.field5162 = arg2;
        if (arg1 == 64) {
            class76.field1178.method2310(var7, -12918);
        }
    }
}
