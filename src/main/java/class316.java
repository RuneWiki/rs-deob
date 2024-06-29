import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class316 extends class266 {

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4695 = " more options";

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "Lth;")
    public static class57 field4694 = new class57(5);

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public int field4686;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "Lqf;")
    public static class359 field4697;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Lph;")
    public static class361 field4687;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "Ljava/lang/String;")
    public String field4690;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "Ljava/lang/String;")
    public String field4696;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 8)
    public static final int method2202(String arg0, byte arg1) {
        field4692++;
        for (int var2 = 0; var2 < class296.field4446.length; var2++) {
            if (class296.field4446[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1 >= -116) {
            return 122;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)Lrl;", line = 30)
    public final class324 method2203(int arg0) {
        if (arg0 != -1) {
            this.field4686 = -38;
        }
        field4688++;
        return class354.field5437[this.field4064];
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V", line = 42)
    public static final void method2204(int arg0, byte arg1) {
        class206 var2 = (class206) class135.field1968.method1405((long) arg0, false);
        if (arg1 != -40) {
            field4697 = (class359) null;
        }
        field4689++;
        if (var2 != null) {
            var2.method876(8);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V", line = 61)
    public static void method2205(byte arg0) {
        field4694 = null;
        if (arg0 == -94) {
            field4687 = null;
            field4697 = null;
            field4695 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V", line = 75)
    public static final void method2206(int arg0, int arg1) {
        class308.field4604[1] = (float) class287.method2076(255, arg1 >> 8) / 255.0F;
        class308.field4604[arg0] = (float) (class287.method2076(16750895, arg1) >> 16) / 255.0F;
        class308.field4604[2] = (float) class287.method2076(arg1, 255) / 255.0F;
        class225.method1647(30750, 3);
        field4691++;
        class225.method1647(arg0 + 30750, 4);
    }
}
