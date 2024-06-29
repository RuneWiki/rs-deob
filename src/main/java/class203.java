import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class203 extends class413 {

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2910 = null;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2914 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Liq;")
    public static class362 field2921 = new class362("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "[I")
    public static int[] field2923 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field2922 = 0;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "Lsk;")
    public static class371 field2926 = new class371();

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "Lka;")
    public static class276 field2927;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "Ltq;")
    public static class376 field2919;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Ltq;")
    public static class376 field2924;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Ljava/lang/String;")
    public String field2918;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field2925;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 3)
    public static void method1346(int arg0) {
        field2923 = null;
        field2910 = null;
        field2925 = null;
        field2919 = null;
        if (arg0 != 0) {
            field2923 = null;
        }
        field2924 = null;
        field2914 = null;
        field2926 = null;
        field2921 = null;
        field2927 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lae;I)V", line = 23)
    public static final void method1347(class134 arg0, int arg1) {
        int var2 = 113 / ((arg1 + 28) / 50);
        field2913++;
        if (class35.field405 != class129.field1570 && class250.field3570 != null && class399.method2541(true, arg0, class129.field1570)) {
            class35.field405 = class129.field1570;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLqr;)V", line = 55)
    public static final void method1348(byte arg0, class40 arg1) {
        field2911++;
        if (class208.field2958 >= 400) {
            return;
        }
        if (arg0 > -35) {
            field2923 = null;
        }
        if (class384.field5422 == arg1) {
            return;
        }
        String var8;
        if (arg1.field482 == 0) {
            boolean var2 = true;
            if (class384.field5422.field484 != -1 && arg1.field484 != -1) {
                int var3 = class384.field5422.field465 > arg1.field465 ? class384.field5422.field465 : arg1.field465;
                int var4 = arg1.field484 > class384.field5422.field484 ? class384.field5422.field484 : arg1.field484;
                int var5 = var3 * 10 / 100 + var4 + 5;
                int var6 = class384.field5422.field465 - arg1.field465;
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (var5 < var6) {
                    var2 = false;
                }
            }
            String var7 = class384.field5425 == 1 ? class202.field2890.method2331(25, class271.field3836) : class105.field1262.method2331(25, class271.field3836);
            if (arg1.field478 > arg1.field465) {
                var8 = arg1.method243(-13458, true) + (var2 ? class452.method2798(class384.field5422.field465, arg1.field465, 59) : "<col=ffffff>") + " (" + var7 + arg1.field465 + "+" + (arg1.field478 - arg1.field465) + ")";
            } else {
                var8 = arg1.method243(-13458, true) + (var2 ? class452.method2798(class384.field5422.field465, arg1.field465, 69) : "<col=ffffff>") + " (" + var7 + arg1.field465 + ")";
            }
        } else {
            var8 = arg1.method243(-13458, true) + " (" + class113.field1387.method2331(25, class271.field3836) + arg1.field482 + ")";
        }
        if (!class279.field3951) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class46.field548[var9] != null) {
                    short var10 = 0;
                    if (class384.field5425 == 0 && class46.field548[var9].equalsIgnoreCase(class144.field1769.method2331(25, class271.field3836))) {
                        if (arg1.field465 > class384.field5422.field465) {
                            var10 = 2000;
                        }
                        if (class384.field5422.field458 != 0 && arg1.field458 != 0) {
                            if (class384.field5422.field458 == arg1.field458) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class341.field4823[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class296.field4126[var9] + var10);
                    int var12 = class222.field3122[var9] == -1 ? class403.field5780 : class222.field3122[var9];
                    class87.field984++;
                    class421.method2660(0, "<col=ffffff>" + var8, var12, class46.field548[var9], (long) arg1.field5620, 0, var11, (byte) 90);
                }
            }
        } else if ((class347.field4901 & 0x8) != 0) {
            class421.method2660(0, class253.field3613 + " -> <col=ffffff>" + var8, class22.field279, class154.field1907, (long) arg1.field5620, 0, 44, (byte) 30);
            class191.field2750++;
        }
        for (class302 var13 = (class302) class393.field5547.method506((byte) -128); var13 != null; var13 = (class302) class393.field5547.method514(true)) {
            if (var13.field4247 == 21) {
                var13.field4248 = "<col=ffffff>" + var8;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILae;)V", line = 181)
    public static final void method1349(int arg0, class134 arg1) {
        field2909++;
        if (arg0 != 8180) {
            field2922 = 82;
        }
        if (class148.field1805.method515((byte) 96) == 0) {
            return;
        }
        if (class26.field329 == 0 || class26.field329 == 2) {
            for (class418 var4 = (class418) class148.field1805.method506((byte) -128); var4 != null; var4 = (class418) class148.field1805.method514(true)) {
                class422.method2662(arg1, false, var4.field5972, false, -18368, class263.field3750, var4.field5971 ? class384.field5422.field453 : null, var4.field5973, var4.field5979, var4.field5982, arg1, var4.field5983);
                var4.method2594((byte) -22);
            }
            class406.method2593(false);
            return;
        }
        if (class162.field2210 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class162.field2210 = class134.method825(37, class1.field6, class14.field185, 0, var2, 0);
            class138.field1714 = class162.field2210.method613(class365.method2335(class401.field5742, class335.field4752, 0, 0), class375.method2401(class298.field4178, class401.field5742, 0), true);
        }
        for (class418 var3 = (class418) class148.field1805.method506((byte) -128); var3 != null; var3 = (class418) class148.field1805.method514(true)) {
            class422.method2662(class162.field2210, false, var3.field5972, false, -18368, class138.field1714, var3.field5971 ? class384.field5422.field453 : null, var3.field5973, var3.field5979, var3.field5982, arg1, var3.field5983);
            var3.method2594((byte) -22);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 233)
    public static final void method1350(boolean arg0) {
        if (arg0) {
            class250.field3570 = class370.field5218;
            class161.field2122 = class399.field5693;
        } else {
            class250.field3570 = class276.field3922;
            class161.field2122 = class98.field1191;
        }
        class167.field2334 = class250.field3570.length;
    }
}
