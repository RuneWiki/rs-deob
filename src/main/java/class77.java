import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class77 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static volatile int field1683 = -1;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lb;")
    public static class48 field1681 = new class48();

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lsg;")
    public static class30 field1686 = class167.method1221((byte) 33, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "S")
    public static short field1688 = 1;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lmc;")
    public static class151 field1689;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        if (arg0 >= -100) {
            method685((class151) null, (class151) null, (byte) -112);
        }
        field1686 = null;
        field1689 = null;
        field1681 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lmc;Lmc;B)V")
    public static final void method685(class151 arg0, class151 arg1, byte arg2) {
        class21.field390 = arg0;
        field1682++;
        int var3 = -14 % ((2 - arg2) / 51);
        class150.field2856 = arg1;
        class251.field4442 = class150.field2856.method1124(3, 124);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
    public static final int method686(int arg0, int arg1) {
        if (arg0 == -4) {
            field1684++;
            return arg1 & 0x3FF;
        } else {
            return -81;
        }
    }
}
