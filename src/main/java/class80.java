import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class80 extends class163 {

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Lke;")
    public static class256 field1483 = class316.method2202("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", 27626);

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Lvm;")
    public static class297 field1487 = new class297(5);

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field1491 = 500;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Lke;")
    public static class256 field1489 = class316.method2202("name_icons", 27626);

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "Lke;")
    public static class256 field1493 = class316.method2202("<br>", 27626);

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Lng;")
    public static class138 field1488;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Lqi;")
    public static class242 field1490;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "[[[S")
    public static short[][][] field1492;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lu;ILu;)V", line = 14)
    public static final void method598(class34 arg0, int arg1, class34 arg2) {
        if (arg1 <= 26) {
            return;
        }
        field1495++;
        if (arg2.field543 != null) {
            arg2.method235(-70);
        }
        arg2.field543 = arg0;
        arg2.field529 = arg0.field529;
        arg2.field543.field529 = arg2;
        arg2.field529.field543 = arg2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I", line = 40)
    public static final int method599(int arg0, int arg1) {
        if (arg1 != 255) {
            field1488 = (class138) null;
        }
        field1486++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 66)
    public static void method600(int arg0) {
        if (arg0 != 255) {
            field1491 = -59;
        }
        field1487 = null;
        field1492 = (short[][][]) null;
        field1493 = null;
        field1489 = null;
        field1490 = null;
        field1483 = null;
        field1488 = null;
    }
}
