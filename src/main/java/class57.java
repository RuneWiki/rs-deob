import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class57 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field900 = -1;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lma;")
    public static class5 field903 = class12.method119(")3runescape)3com)4l=", (byte) 108);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[I")
    public static int[] field904;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 20)
    public static void method429(boolean arg0) {
        field903 = null;
        if (arg0) {
            field904 = (int[]) null;
        }
        field904 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lhh;", line = 56)
    public static final class48 method430(int arg0, int arg1) {
        class48 var2 = (class48) class99.field1478.method521((long) arg0, (byte) 80);
        field897++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field2093.method1342(arg1 ^ 0xFEA31015, class133.method865(55, arg0), class223.method1574(-97, arg0));
        class48 var4 = new class48();
        var4.field740 = arg0;
        if (arg1 != 22867872) {
            return (class48) null;
        }
        if (var3 != null) {
            var4.method357(73, new class221(var3));
        }
        class99.field1478.method519((byte) -95, var4, (long) arg0);
        return var4;
    }
}
