import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class38 {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "J")
    public long field597 = 0L;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field593 = 1;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lli;")
    private static class185 field590 = class245.method1649("wave2:", -12);

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field607 = -1;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lli;")
    public static class185 field605 = field590;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Lli;")
    public static class185 field608 = class245.method1649("titlebg", 127);

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lli;")
    public static class185 field606 = field590;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lgf;")
    public static class7 field589 = new class7(5);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lbb;")
    public class75 field594;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lbb;")
    public class75 field595;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
    public static int[] field598;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "[[[B")
    public static byte[][][] field611;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lhi;IIIZI)V")
    public static final void method241(class250 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class248.field4400 = arg5;
        class23.field381 = arg1;
        class241.field4303 = arg0;
        class32.field527 = 1;
        int var6 = 91 % ((-arg2 - 39) / 40);
        class248.field4408 = arg3;
        class133.field2381 = arg4;
        field604++;
        class78.field1360 = 10000;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method242(int arg0) {
        field598 = null;
        field589 = null;
        field590 = null;
        field608 = null;
        field606 = null;
        field611 = null;
        field605 = null;
        if (arg0 != 1) {
            field598 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljd;I)Lwa;")
    public static final class66 method243(class118 arg0, int arg1) {
        if (arg1 != 1) {
            method241((class250) null, 66, -17, 74, true, -84);
        }
        field599++;
        return new class66(arg0.method876(65280), arg0.method876(65280), arg0.method876(65280), arg0.method876(65280), arg0.method873((byte) -111), arg0.method867(false));
    }
}
