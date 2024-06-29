import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class268 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ldg;")
    public static class317 field4804 = new class317();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[Lkl;")
    public static class130[] field4807 = new class130[4];

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4808 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Ldg;")
    public static class317 field4806 = new class317();

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[I")
    public static int[] field4811 = new int[32];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZBLjava/lang/Object;)[B", line = 39)
    public static final byte[] method1911(boolean arg0, byte arg1, Object arg2) {
        field4805++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 <= 24) {
            field4808 = 123;
        }
        if ((arg2 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg2);
            return arg0 ? class153.method1210(var4, (byte) 117) : var4;
        } else if (arg2 instanceof class324) {
            class324 var3 = (class324) arg2;
            return var3.method1202(-97);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 98)
    public static void method1912(int arg0) {
        field4811 = null;
        if (arg0 != 26276) {
            method1911(false, (byte) -27, (Object) null);
        }
        field4804 = null;
        field4806 = null;
        field4807 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 118)
    public class268() {
        new class159();
    }
}
