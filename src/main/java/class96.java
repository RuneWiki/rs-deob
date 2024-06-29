import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class96 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[I")
    public static int[] field1872 = new int[100];

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1873 = 500;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Led;")
    public static class43 field1875 = class191.method1219("<col=00ff80>", false);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
    public static int[] field1874 = new int[25];

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Led;")
    public static class43 field1877 = class191.method1219("welle2:", false);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1876 = -1;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lf;")
    public static class48 field1869;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Ldb;")
    public static final class32 method607(byte arg0, int arg1) {
        if (arg0 != -23) {
            field1871 = -123;
        }
        field1870++;
        class32 var2 = (class32) class55.field1102.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1552.method367(14, arg1, (byte) -34);
        class32 var4 = new class32();
        if (var3 != null) {
            var4.method182(new class89(var3), -5870);
        }
        class55.field1102.method1107((long) arg1, var4, -119);
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I")
    public abstract int method50(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public abstract void method51(int arg0);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static void method608(int arg0) {
        if (arg0 != 25) {
            method607((byte) -111, -22);
        }
        field1875 = null;
        field1877 = null;
        field1869 = null;
        field1874 = null;
        field1872 = null;
    }
}
