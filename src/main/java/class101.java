import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class101 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lp;")
    public static class280 field1642 = class18.method140((byte) -128, "leuchten1:");

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lsb;")
    public static class221 field1644 = new class221(50);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lua;")
    public static class113 field1646;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lbc;")
    public static class174 field1648;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ltg;")
    public static class180 field1641;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lp;")
    public static class280 field1643;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Ltd;")
    public static class72 field1651;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[Lua;")
    public static class113[] field1640;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[Z")
    public static boolean[] field1647;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method715(byte arg0) {
        field1640 = null;
        if (arg0 != 39) {
            field1651 = null;
        }
        field1646 = null;
        field1647 = null;
        field1642 = null;
        field1648 = null;
        field1641 = null;
        field1651 = null;
        field1643 = null;
        field1644 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILtg;I)[Lti;")
    public static final class5[] method716(int arg0, class180 arg1, int arg2) {
        field1649++;
        if (class122.method857(arg1, arg2, arg0 - 5957)) {
            if (arg0 != -13521) {
                method716(55, (class180) null, 125);
            }
            return class93.method660(arg0 ^ 0x34AF);
        } else {
            return null;
        }
    }
}
