import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class351 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Loda;")
    public static class119 field4888;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lr;")
    public class184 field4889;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Lka;")
    public class472 field4890;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Lmf;")
    public static final class420 method2196(boolean arg0) {
        if (!arg0) {
            method2200(-106, -36);
        }
        field4893++;
        return class33.field843 < class690.field9322.length ? class690.field9322[class33.field843++] : null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method2197(byte arg0) {
        field4888 = null;
        if (arg0 != 72) {
            method2199(39, null, null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILin;)V")
    public static final void method2198(int arg0, class91 arg1) {
        if (arg0 != 30284) {
            method2196(true);
        }
        field4887++;
        class78.field1402 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILat;Lat;)V")
    public static final void method2199(int arg0, class378 arg1, class378 arg2) {
        field4891++;
        class697.field9414++;
        class564 var3 = class227.method1594(class280.field3933, class72.field1320, -104);
        var3.field7778.method1539((byte) 112, arg1.field5506);
        var3.field7778.method1501(arg2.field5380, (byte) 3);
        var3.field7778.method1484(arg2.field5506, (byte) 44);
        var3.field7778.method1485((byte) 107, arg2.field5488);
        var3.field7778.method1497(4325, arg1.field5380);
        var3.field7778.method1497(4325, arg1.field5488);
        if (arg0 > -50) {
            field4888 = null;
        }
        class167.method1260(-100, var3);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method2200(int arg0, int arg1) {
        if (arg1 != -30742) {
            field4888 = null;
        }
        field4892++;
        class344.field4819.method987(2, arg0);
    }
}
