import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class485 {

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Z")
    public static volatile boolean field6770 = false;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Lvt;")
    public static class344 field6769 = new class344("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 200 para usuários não pagantes, e 200 para membros.");

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Led;")
    public static class115 field6774 = new class115();

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lim;")
    public static class353 field6775 = new class353(14, 28);

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static final void method2738(int arg0) {
        field6773++;
        class552.field7724.method3097((byte) -19);
        if (arg0 != 14) {
            field6775 = null;
        }
        class39.field585.method901((byte) 94);
        class10.field104.method2707((byte) 32);
        class626.field9084.method1089(arg0 + 16);
        class579.field8053.method3624(true);
        class98.field1307.method3392(36);
        class609.field8754.method539(arg0 + 24);
        class410.field5636.method349(0);
        class643.field9328.method1289(3);
        class642.field9326.method3405(false);
        class217.field2772.method1472(arg0 + 18);
        class376.field5232.method2481(arg0 + 16529);
        class494.field6893.method1545(true);
        class33.field508.method543(true);
        class132.field1621.method146((byte) 61);
        class1.field5.method1475((byte) -53);
        class369.field5136.method1066((byte) -52);
        class192.field2492.method1323(38);
        class104.field1365.method645((byte) 86);
        class452.field6400.method687((byte) -52);
        class455.method2636(1);
        class371.method2267((byte) 72);
        class564.method3166((byte) 126);
        if (class628.field9174 != class602.field8701) {
            for (int var1 = 0; var1 < class184.field2354.length; var1++) {
                class184.field2354[var1] = null;
            }
            class620.field8930 = 0;
        }
        class425.method2495(arg0 - 14);
        class496.method2786(24489);
        class173.method1063(false);
        class577.method3245((byte) -55);
        class30.method178((byte) -6);
        class218.field2799.method315(1);
        class301.field3918.method978();
        class356.field4983.method2996((byte) -128);
        class121.method661(6625);
        class293.field3813.method2062(-118);
        class260.field3215.method2062(-122);
        class544.field7588.method2062(arg0 ^ 0xFFFFFF8E);
        class135.field1650.method2062(-126);
        class35.field547.method2062(arg0 - 142);
        class277.field3612.method2062(-123);
        class251.field3143.method2062(-117);
        class245.field3104.method2062(-119);
        class24.field433.method2062(-121);
        class426.field5766.method2062(arg0 - 142);
        class34.field517.method2062(-128);
        class130.field1602.method2062(-126);
        class29.field466.method2062(arg0 ^ 0xFFFFFF8E);
        class532.field7434.method2062(-117);
        class592.field8546.method2062(-117);
        class546.field7612.method2062(arg0 ^ 0xFFFFFF89);
        class193.field2508.method2062(-124);
        class136.field1666.method2062(-126);
        class239.field3056.method2062(-128);
        class98.field1317.method2062(-128);
        class558.field7809.method2062(-123);
        class431.field5876.method2062(-124);
        class20.field294.method2062(-118);
        class154.field2007.method2062(-117);
        class540.field7558.method2062(-122);
        class480.field6727.method2062(-123);
        class107.field1383.method2062(arg0 ^ 0xFFFFFF8F);
        class580.field8084.method2062(-117);
        class468.field6640.method2062(arg0 - 140);
        class558.field7807.method2062(-117);
        class628.field9176.method2062(-122);
        class615.field8870.method2062(-121);
        class624.field9027.method315(1);
        class600.field8677.method315(1);
        class26.field449.method315(1);
        class616.field8878.method315(1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V")
    public static final void method2739(String arg0, File arg1, int arg2) {
        if (arg2 > 39) {
            field6771++;
            class496.field6915.put(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
    public static void method2740(int arg0) {
        field6769 = null;
        field6775 = null;
        field6774 = null;
        if (arg0 != 0) {
            method2740(-63);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)V")
    public static final void method2741(int arg0, int arg1, int arg2) {
        field6772++;
        class632 var3 = class641.method3699(arg0 ^ 0xFFFFFF82, 7, arg1);
        if (arg0 != 14) {
            method2741(82, 61, 73);
        }
        var3.method3656(arg0 - 14);
        var3.field9198 = arg2;
    }
}
