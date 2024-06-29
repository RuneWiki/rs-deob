import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class418 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lkn;")
    public static class442 field5937 = new class442("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Laq;")
    public static class90 field5938;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[Lij;")
    public static class242[] field5939;

    static {
        new class442("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5938 = new class90();
        field5940 = 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lkh;", line = 3)
    public static final class11 method2622(int arg0) {
        field5934++;
        class11 var1 = new class11(38);
        var1.method173(15, 255);
        var1.method173(class361.field5000, 255);
        var1.method173(class288.field4044 ? 1 : 0, 255);
        var1.method173(class61.field845 ? 1 : 0, 255);
        var1.method173(class154.field2169 ? 1 : 0, 255);
        var1.method173(class414.field5867 ? 1 : 0, 255);
        var1.method173(0, 255);
        var1.method173(class70.field1032 ? 1 : 0, 255);
        var1.method173(class64.field886 ? 1 : 0, 255);
        var1.method173(class106.field1472 ? 1 : 0, 255);
        var1.method173(class327.field4508, 255);
        var1.method173(class312.field4271 ? 1 : 0, 255);
        var1.method173(class171.field2346 ? 1 : 0, 255);
        var1.method173(class54.field755 ? 1 : 0, 255);
        var1.method173(class205.field2824, 255);
        var1.method173(class133.field1904 ? 1 : 0, 255);
        var1.method173(class371.field5212, 255);
        var1.method173(class52.field731, 255);
        var1.method173(class345.field4692, 255);
        var1.method191(class53.field741, -101);
        var1.method191(class306.field4224, -116);
        var1.method173(class39.method365((byte) 124), 255);
        var1.method155(15489, class405.field5762);
        var1.method173(class284.field4010, 255);
        var1.method173(class392.field5610 ? 1 : 0, 255);
        int var2 = -4 % ((arg0 - 39) / 32);
        var1.method173(class133.field1916 ? 1 : 0, 255);
        var1.method173(class42.field614, 255);
        var1.method173(class288.field4049 ? 1 : 0, 255);
        var1.method173(class214.field2988 ? 1 : 0, 255);
        var1.method173(class237.field3369, 255);
        var1.method173(class175.field2397 ? 1 : 0, 255);
        var1.method173(class251.field3544, 255);
        var1.method173(class411.field5840, 255);
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V", line = 50)
    public static final void method2623(int arg0, int arg1) {
        field5935++;
        class131 var2 = class304.field4200;
        synchronized (class304.field4200) {
            if (arg0 != 0) {
                method2625(-64);
            }
            class304.field4200.method905((byte) 34);
            class304.field4200 = new class131(arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 66)
    public static final void method2624(int arg0) {
        field5933++;
        if (!class327.field4511) {
            return;
        }
        class453 var1 = class143.method983(-1, class231.field3339, class178.field2451);
        int var2 = -15 / ((-arg0 - 50) / 61);
        if (var1 != null && var1.field6339 != null) {
            class7 var3 = new class7();
            var3.field95 = var1;
            var3.field97 = var1.field6339;
            class177.method1168(var3);
        }
        class327.field4511 = false;
        class325.field4444 = -1;
        class267.field3695 = -1;
        if (var1 != null) {
            class404.method2531(26878, var1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 106)
    public static void method2625(int arg0) {
        field5937 = null;
        field5938 = null;
        field5939 = null;
        if (arg0 > -116) {
            method2623(65, -127);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)V", line = 121)
    public static final void method2626(int arg0, String arg1) {
        field5932++;
        if (class399.field5695 == null) {
            class124.method847(120);
        }
        if (arg0 != 5998) {
            method2623(49, 76);
        }
        String[] var2 = class46.method408((byte) 68, '\n', arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class357.field4897; var4 > 0; var4--) {
                class399.field5695[var4] = class399.field5695[var4 - 1];
            }
            class399.field5695[0] = var2[var3];
            if (class357.field4897 < (class399.field5695.length - 1)) {
                if (class131.field1863 > 0) {
                    class131.field1863++;
                }
                class357.field4897++;
            }
        }
    }
}
