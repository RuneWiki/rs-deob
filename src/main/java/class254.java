import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class254 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lum;")
    public static class83 field4106;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[I")
    public static int[] field4107;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 3)
    public static void method1798(int arg0) {
        field4106 = null;
        if (arg0 == 14663) {
            field4107 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 19)
    public static final void method1799(byte arg0) {
        class351.method2252();
        field4105++;
        if (arg0 >= -2) {
            method1798(-123);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class463.field6857[var1].method2568((byte) -123);
        }
        class236.method1604(-20769);
        class64.method433(-104);
        System.gc();
    }
}
