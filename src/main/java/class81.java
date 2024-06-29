import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class81 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Lwe;")
    public static class371 field1364;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Lpu;")
    public static class522 field1362;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Lpu;")
    public static class522 field1363;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public static void method734(byte arg0) {
        int var1 = -44 / ((arg0 + 69) / 43);
        field1364 = null;
        field1362 = null;
        field1363 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)V")
    public static final void method735(int arg0, int arg1, int arg2) {
        if (arg2 < 58) {
            field1363 = null;
        }
        field1361++;
        class191 var3 = class6.method38(12, -112, arg1);
        var3.method1285((byte) -1);
        var3.field2754 = arg0;
    }
}
