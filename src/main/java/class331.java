import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class331 extends class390 {

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Lal;")
    public static class53 field4483 = new class53(0, 0);

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lqj;")
    public static class296 field4488;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Ljj;")
    public class61 field4484;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient;")
    public static client field4489;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Ljd;", line = 23)
    public static final class125 method2060(byte arg0) {
        field4492++;
        return arg0 == -59 ? class42.field618 : null;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 34)
    public static void method2061(int arg0) {
        field4488 = null;
        if (arg0 > -101) {
            method2060((byte) -61);
        }
        field4483 = null;
        field4489 = null;
    }
}
