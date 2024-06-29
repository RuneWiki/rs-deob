import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class188 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lrw;")
    public static class703 field2710 = new class703(1, 2);

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lgi;")
    public static class630 field2712 = new class630();

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lln;")
    public static class344 field2708;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2714;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[[[I")
    public static int[][][] field2713;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lgfa;B)V")
    public static final void method1268(class697 arg0, byte arg1) {
        field2709++;
        if (class153.field2210 == null) {
            return;
        }
        class614 var2 = null;
        if (arg0.field9872 == 0) {
            var2 = (class614) class149.method1061(arg0.field9859, arg0.field9870, arg0.field9874);
        }
        if (arg0.field9872 == 1) {
            var2 = (class614) class98.method797(arg0.field9859, arg0.field9870, arg0.field9874);
        }
        if (arg0.field9872 == 2) {
            var2 = (class614) class349.method2155(arg0.field9859, arg0.field9870, arg0.field9874, field2714 == null ? (field2714 = method1270("rda")) : field2714);
        }
        if (arg0.field9872 == 3) {
            var2 = (class614) class124.method946(arg0.field9859, arg0.field9870, arg0.field9874);
        }
        if (arg1 != 27) {
            method1269((byte) -62);
        }
        if (var2 == null) {
            arg0.field9866 = -1;
            arg0.field9857 = 0;
            arg0.field9860 = 0;
        } else {
            arg0.field9866 = var2.method1179(true);
            arg0.field9860 = var2.method1186(arg1 - 9987);
            arg0.field9857 = var2.method1175(24563);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1269(byte arg0) {
        int var1 = -50 / ((-arg0 - 14) / 63);
        field2712 = null;
        field2708 = null;
        field2710 = null;
        field2713 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1270(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
