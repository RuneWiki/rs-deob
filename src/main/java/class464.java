import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class464 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lad;")
    public static class426 field6513 = new class426(2, 2);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field6515 = 0;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "F")
    public static float field6514;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method2735(boolean arg0) {
        if (!arg0) {
            field6513 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method2736(int arg0) {
        class238.field3459++;
        if (arg0 != 0) {
            method2735(true);
        }
        field6512++;
        class564 var1 = class227.method1594(class301.field4195, class72.field1320, arg0 ^ 0xFFFFFFAC);
        var1.field7778.method1485((byte) 107, class106.field1870);
        class167.method1260(118, var1);
    }
}
