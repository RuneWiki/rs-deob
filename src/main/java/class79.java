import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class79 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    public static int[] field1470 = new int[2];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lke;")
    public static class256 field1471 = class316.method2202("::noclip", 27626);

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lke;")
    private static class256 field1478 = class316.method2202("You can(Wt add yourself to your own ignore list)3", 27626);

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lke;")
    public static class256 field1481 = class316.method2202("Lade Konfiguration )2 ", 27626);

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lke;")
    private static class256 field1482 = class316.method2202("Members object", 27626);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lke;")
    public static class256 field1476 = field1478;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lke;")
    public static class256 field1480 = field1482;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lng;")
    public static class138 field1479;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[[B")
    public static byte[][] field1475;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 9)
    public static void method591(int arg0) {
        field1470 = null;
        if (arg0 != 2) {
            return;
        }
        field1478 = null;
        field1480 = null;
        field1475 = (byte[][]) null;
        field1471 = null;
        field1482 = null;
        field1479 = null;
        field1481 = null;
        field1476 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BZ)[B", line = 35)
    public static final byte[] method593(byte[] arg0, boolean arg1) {
        field1472++;
        if (!arg1) {
            method595(-25);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class299.method2092(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Lti;", line = 52)
    public static final class182 method595(int arg0) {
        field1474++;
        if (class288.field4988.length > class303.field5242) {
            return class288.field4988[class303.field5242++];
        } else {
            if (arg0 != 0) {
                method591(73);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method592(byte arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Luh;")
    public abstract class65 method594(byte arg0);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(BI)V")
    public abstract void method596(byte arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)I")
    public abstract int method597(int arg0, byte arg1);
}
