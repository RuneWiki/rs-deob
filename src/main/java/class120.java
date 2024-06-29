import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class120 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lob;")
    public static class133 field1683 = null;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
    public static int[] field1688 = new int[2500];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lsa;")
    public class268 field1686;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
    public static final void method796(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1687++;
        if (arg3 >= arg4) {
            class154.method1028(-353, class216.field3264[arg1], arg2, arg4, arg3);
        } else {
            class154.method1028(-353, class216.field3264[arg1], arg2, arg3, arg4);
        }
        if (arg0 != 2500) {
            field1685 = 114;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lhc;BI)[Lge;")
    public static final class72[] method797(class235 arg0, byte arg1, int arg2) {
        if (arg1 != -9) {
            method797((class235) null, (byte) 39, -96);
        }
        field1689++;
        return class294.method1972(arg0, -22, arg2) ? class278.method1866((byte) 117) : null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method798(byte arg0) {
        if (arg0 != 103) {
            field1683 = null;
        }
        field1683 = null;
        field1688 = null;
    }
}
