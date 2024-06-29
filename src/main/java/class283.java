import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class283 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field3970 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    public static int[] field3972 = new int[2500];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1810(int arg0) {
        if (arg0 <= 42) {
            field3972 = null;
        }
        field3972 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILbk;B)V")
    private final void method1811(int arg0, class211 arg1, byte arg2) {
        if (arg2 < 74) {
            field3972 = null;
        }
        field3971++;
        if (arg0 == 5) {
            this.field3970 = arg1.method1355(32136);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lre;I)V")
    public static final void method1812(class358 arg0, int arg1) {
        field3974++;
        for (class81 var2 = (class81) class182.field2495.method1124(-1); var2 != null; var2 = (class81) class182.field2495.method1119(false)) {
            if (var2.field914 == arg0) {
                if (var2.field909 != null) {
                    class135.field1884.method2807(var2.field909);
                    var2.field909 = null;
                }
                var2.method2290((byte) 98);
                return;
            }
        }
        if (arg1 != 5) {
            field3972 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLbk;)V")
    public final void method1813(byte arg0, class211 arg1) {
        field3973++;
        while (true) {
            int var3 = arg1.method1342((byte) -128);
            if (var3 == 0) {
                if (arg0 == -3) {
                    return;
                } else {
                    this.method1813((byte) 103, (class211) null);
                    return;
                }
            }
            this.method1811(var3, arg1, (byte) 116);
        }
    }
}
