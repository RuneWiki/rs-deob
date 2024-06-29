import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class235 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lli;")
    private static class185 field4214 = class245.method1649("Walk here", 123);

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lcg;")
    public static class34 field4217 = null;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4218 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lli;")
    public static class185 field4212 = field4214;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lfl;")
    public static class191 field4213 = new class191();

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lli;")
    public static class185 field4219 = class245.method1649("::serverjs5drop", -49);

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lli;")
    public static class185 field4221 = class245.method1649("mem=", -6);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[[[B")
    public static byte[][][] field4216;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public abstract void method154(byte arg0);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
    public abstract int method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BJ)Lli;")
    public static final class185 method1600(byte arg0, long arg1) {
        field4211++;
        return arg0 <= 60 ? null : class187.method1352(84, arg1, 10, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1601(int arg0) {
        field4213 = null;
        field4219 = null;
        field4221 = null;
        if (arg0 != 11115) {
            field4221 = null;
        }
        field4214 = null;
        field4216 = null;
        field4217 = null;
        field4212 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static final void method1602(int arg0) {
        class185.field3408.method86(0);
        if (arg0 != 65408) {
            method1602(120);
        }
        field4215++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
    public static final int method1603(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
