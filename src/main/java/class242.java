import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class242 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "[I")
    public int[] field3130 = new int[100];

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public int[] field3136 = new int[3];

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[Lku;")
    public class256[] field3137 = new class256[8];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[Lvn;")
    public class205[] field3135 = new class205[100];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Z")
    public static boolean field3131 = false;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Llg;")
    public static class286 field3132;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field3138;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public static final void method1475(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        if (var3 != null && var3.field7131 != null) {
            var3.field7131 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1476(int arg0, String arg1) {
        System.out.println("Error: " + class324.method1897("%0a", (byte) -119, "\n", arg1));
        field3139++;
        if (arg0 < 87) {
            method1478(-43, null, 127);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1477(int arg0) {
        if (arg0 == -11786) {
            field3132 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BI)I")
    public static final int method1478(int arg0, byte[] arg1, int arg2) {
        field3133++;
        return arg0 == 3 ? class228.method1388(0, (byte) -122, arg1, arg2) : -36;
    }
}
