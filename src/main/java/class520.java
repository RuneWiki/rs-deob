import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class520 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lwj;")
    public static class270 field7703;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field7707;

    static {
        new class466("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7703 = new class270(48, -2);
        field7705 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method3102(int arg0, long arg1) {
        if (class89.field1305 != null) {
            if (class491.field7168 == 1 || class491.field7168 == 5) {
                class263.method1577(0, arg1);
            } else if (class491.field7168 == 4) {
                class218.method1352(-12630, arg1);
            }
        }
        field7704++;
        class509.method3049(-127, (long) class441.field6516, class269.field3721);
        if (class188.field2723 != -1) {
            class441.method2622(class188.field2723, -201);
        }
        for (int var3 = 0; var3 < class9.field146; var3++) {
            if (class463.field6801[var3]) {
                class165.field2477[var3] = true;
            }
            class25.field330[var3] = class463.field6801[var3];
            class463.field6801[var3] = false;
        }
        class264.field3653 = class441.field6516;
        if (class269.field3721.method308()) {
            class401.field5885 = true;
        }
        if (class188.field2723 != -1) {
            class9.field146 = 0;
            class186.method1174((byte) -125);
        }
        class269.field3721.method260();
        class64.method556(arg0 ^ 0xE4D24FA8, class269.field3721);
        int var4 = class134.method914((byte) 62);
        if (var4 == -1) {
            var4 = class226.field3209;
        }
        if (var4 == -1) {
            var4 = class297.field4078;
        }
        class66.method567(arg0 + 62, var4);
        class38.method318(class316.field4324.field1735, -58, class193.field2758, class316.field4324.field1738, class316.field4324.field1732);
        class193.field2758 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 66)
    public static void method3103(byte arg0) {
        if (arg0 != 63) {
            field7706 = 42;
        }
        field7703 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 82)
    public static final void method3104(byte arg0) {
        field7707++;
        class97 var1 = class348.method2064(0, 15, -35);
        var1.method710(-9237);
        if (arg0 > -68) {
            field7703 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 102)
    public static final void method3105(int arg0, int arg1) {
        field7702++;
        if (arg0 != -21708) {
            method3105(-24, -112);
        }
        class97 var2 = class348.method2064(arg1, 3, arg0 + 21582);
        var2.method710(-9237);
    }
}
