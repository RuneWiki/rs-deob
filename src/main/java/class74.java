import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lo;")
    public static class84 field1550 = class15.method124(" x", 255);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1548 = 1;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    public static int[] field1547 = new int[200];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1546 = 3;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lmc;")
    public static class75 field1551 = new class75();

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lwc;")
    public static class127 field1552 = new class127(5000);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lo;")
    public static class84 field1554 = class15.method124(" more options", 255);

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lf;", line = 65)
    public static final class31 method554(int arg0, int arg1) {
        field1549++;
        class31 var2 = (class31) class64.field1363.method737((long) arg0, (byte) -89);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class86.field1953.method909((byte) -125, arg0, 12);
        class31 var4 = new class31();
        if (arg1 != 4867) {
            return null;
        }
        if (var3 != null) {
            var4.method277(-1, new class27(var3));
        }
        var4.method276(false);
        class64.field1363.method744(-125, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 118)
    public static void method555(byte arg0) {
        field1551 = null;
        field1547 = null;
        field1552 = null;
        int var1 = 6 % ((arg0 - 68) / 55);
        field1550 = null;
        field1554 = null;
    }
}
