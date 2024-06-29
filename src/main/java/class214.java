import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class214 extends class125 {

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Loa;")
    public static class99 field3712 = class221.method1463(2844, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Z")
    public static boolean field3717 = false;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field3721 = 0;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "Loa;")
    public static class99 field3724 = class221.method1463(2844, ":allyreq:");

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Loa;")
    public static class99 field3725 = class221.method1463(2844, "cookiehost");

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Loa;")
    public static class99 field3726 = class221.method1463(2844, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Ltf;")
    public static class107 field3722 = null;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "[[B")
    public static byte[][] field3718;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    public static final void method1434(int arg0, int arg1, int arg2) {
        class65 var3 = class152.method1010(arg0, 7, (byte) -37);
        field3723++;
        var3.method433(32);
        var3.field1094 = arg2;
        int var4 = 19 / ((10 - arg1) / 33);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method1435(int arg0) {
        if (arg0 != -22565) {
            method1438((byte) 43);
        }
        field3716++;
        class38.field657.method1812(-108);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
    public static final int method1436(int arg0) {
        field3720++;
        if ((double) class121.field2131 == 3.0D) {
            return 37;
        }
        if (arg0 != -23605) {
            field3721 = 100;
        }
        if ((double) class121.field2131 == 4.0D) {
            return 50;
        } else if ((double) class121.field2131 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
    public static final boolean method1437(int arg0, int arg1) {
        class144 var2 = class254.method1647(arg0, (byte) -56);
        field3715++;
        if (var2 == null) {
            return false;
        } else if (class87.field1494 == 1 || class87.field1494 == 2 || class161.field2856 == 2) {
            byte[] var3 = var2.field2541.method703((byte) 125);
            class196.field3420 = new String(var3, 0, var3.length);
            class33.field585 = var2.field2531;
            if (class161.field2856 != 0) {
                class28.field528 = class33.field585 + 50000;
                class165.field2898 = class33.field585 + 40000;
                class7.field63 = class165.field2898;
            }
            return true;
        } else if (arg1 == 50) {
            class99 var4 = class143.field2529;
            if (class161.field2856 != 0) {
                var4 = class198.method1332(arg1 + 23, new class99[] { class7.field41, class198.method1333(-126, var2.field2531 + 7000) });
            }
            class99 var5 = class143.field2529;
            if (class281.field4928 != null) {
                var5 = class198.method1332(102, new class99[] { class28.field511, class281.field4928 });
            }
            class99 var6 = class198.method1332(112, new class99[] { class273.field4834, var2.field2541, var4, class249.field4290, class198.method1333(-119, class184.field3271), class183.field3257, class198.method1333(-84, class64.field1083), var5, class17.field179, class37.field650 ? class265.field4685 : class65.field1090, class156.field2796, class137.field2412 ? class265.field4685 : class65.field1090, class19.field209, class123.field2161 ? class265.field4685 : class65.field1090 });
            try {
                class175.field3082.getAppletContext().showDocument(var6.method661((byte) -80), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
    public static void method1438(byte arg0) {
        if (arg0 <= 28) {
            field3712 = null;
        }
        field3725 = null;
        field3718 = null;
        field3722 = null;
        field3712 = null;
        field3724 = null;
        field3726 = null;
    }
}
