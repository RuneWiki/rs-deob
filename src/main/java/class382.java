import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class382 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Ltm;")
    public static class112 field5415 = new class112("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field5420 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field5419;

    static {
        new class112("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;", line = 5)
    public static final String[] method2288(byte arg0, String[] arg1) {
        field5418++;
        String[] var2 = new String[5];
        if (arg0 != -110) {
            field5420 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 30)
    public static void method2289(int arg0) {
        field5420 = null;
        field5415 = null;
        if (arg0 != 1) {
            field5420 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILkm;)V", line = 41)
    public static final void method2290(int arg0, class487 arg1) {
        field5416++;
        int var2 = class393.field5531;
        int var3 = class214.field3036;
        int var4 = class23.field405;
        if (arg0 != 22754) {
            method2291(79, 88, -116);
        }
        int var5 = class183.field2661;
        int var6 = -10660793;
        arg1.method2860(var5, var4, var2, var6, var3, 1);
        arg1.method2860(16, var4 - 2, var2 + 1, -16777216, var3 + 1, 1);
        arg1.method2866(var4 - 2, true, var5 - 19, var3 - -18, -16777216, var2 + 1);
        class211.field2981.method2835(var3 + 14, class180.field2614.method695(-116, class487.field6867), var6, -1, (byte) 116, var2 + 3);
        int var7 = class56.field902.method1301(13820);
        int var8 = class56.field902.method1305(arg0 ^ 0x581D);
        int var9 = 0;
        for (class106 var10 = (class106) class250.field3514.method1544(-108); var10 != null; var10 = (class106) class250.field3514.method1546((byte) -42)) {
            int var11 = (class161.field2310 - (var9 + 1)) * 16 + (var3 + 31);
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var11 - 13 < var8 && var8 < var11 + 3 && var10.field1528) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class290.method1786((byte) 125, var10.field1517)) {
                var13 = class58.field918.method344((int) var10.field1515, 31757).field2409;
            } else if (var10.field1524 != -1) {
                var13 = class58.field918.method344(var10.field1524, 31757).field2409;
            } else if (class43.method355(5, var10.field1517)) {
                class196 var16 = class256.field3581[(int) var10.field1515];
                if (var16 != null) {
                    class127 var17 = var16.field2789;
                    if (var17.field1780 != null) {
                        var17 = var17.method767(class320.field4376, (byte) 45);
                    }
                    if (var17 != null) {
                        var13 = var17.field1802;
                    }
                }
            } else if (class103.method649(var10.field1517, (byte) -126)) {
                Object var14 = null;
                class475 var15;
                if (var10.field1517 == 1007) {
                    var15 = class304.field4160.method2075((int) var10.field1515, false);
                } else {
                    var15 = class304.field4160.method2075((int) (var10.field1515 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var15.field6690 != null) {
                    var15 = var15.method2797(class320.field4376, -126);
                }
                if (var15 != null) {
                    var13 = var15.field6676;
                }
            }
            String var18 = class239.method1500(90, var10);
            if (var13 != null) {
                var18 = var18 + class318.method1922(0, var13);
            }
            class211.field2981.method2851(class294.field4065, var18, var2 + 3, var12, -3732, 0, class167.field2458, var11);
            var9++;
            if (var10.field1518) {
                class490.field6912.method2301(class328.field4531.method522(11, var18) + var2 + 5, var11 + -12);
            }
        }
        class128.method780(class23.field405, class393.field5531, class214.field3036, class183.field2661, (byte) 103);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 150)
    public static final void method2291(int arg0, int arg1, int arg2) {
        int var3 = 108 % ((-arg1 - 79) / 42);
        field5417++;
        if (class399.field5585 != arg2) {
            class436.field5989 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class436.field5989[var4] = (var4 << 12) / arg2;
            }
            class467.field6551 = arg2 - 1;
            class399.field5585 = arg2;
            class471.field6584 = arg2 * 32;
        }
        if (class490.field6924 == arg0) {
            return;
        }
        if (class399.field5585 == arg0) {
            class56.field909 = class436.field5989;
        } else {
            class56.field909 = new int[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                class56.field909[var5] = (var5 << 12) / arg0;
            }
        }
        class490.field6924 = arg0;
        class183.field2659 = arg0 - 1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 196)
    public static int method2292(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
