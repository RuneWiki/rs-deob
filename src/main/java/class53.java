import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
    public static boolean field1394 = false;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "La;")
    private static class1 field1397 = class113.method934(-11538, "World");

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "La;")
    private static class1 field1399 = class113.method934(-11538, "skill)2");

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "La;")
    public static class1 field1396 = class113.method934(-11538, "@whi@");

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "La;")
    public static class1 field1407 = class113.method934(-11538, "gelb:");

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "La;")
    public static class1 field1395 = field1399;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "La;")
    public static class1 field1406 = class113.method934(-11538, "Untersuchen");

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "La;")
    public static class1 field1409 = class113.method934(-11538, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "La;")
    public static class1 field1410 = field1397;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "La;")
    public static class1 field1405 = class113.method934(-11538, "Weiter");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lbd;")
    public static class11 field1408;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field1400;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 46)
    public static final Class method533(byte arg0, String arg1) throws ClassNotFoundException {
        field1402++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0 != 91) {
                method534(-66);
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 123)
    public static void method534(int arg0) {
        field1407 = null;
        field1406 = null;
        field1405 = null;
        field1400 = null;
        field1410 = null;
        field1397 = null;
        field1396 = null;
        field1409 = null;
        field1408 = null;
        field1395 = null;
        field1399 = null;
        if (arg0 != 0) {
            method534(15);
        }
    }
}
