import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class333 extends class179 {

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Lbb;")
    public static class270 field4544 = new class270();

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field4548 = 2;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "[Lc;")
    public static class436[] field4546;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static final void method2134(int arg0) {
        field4547++;
        int var1 = -10 % ((arg0 + 68) / 57);
        for (int var2 = 0; var2 < class222.field2770.length; var2++) {
            for (int var3 = 0; var3 < class222.field2770[0].length; var3++) {
                for (int var4 = 0; var4 < class222.field2770[0][0].length; var4++) {
                    class222.field2770[var2][var3][var4] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Laq;III)V")
    public static final void method2135(class453 arg0, int arg1, int arg2, int arg3) {
        field4545++;
        class202.field2382 = arg0;
        if (arg1 != 2) {
            field4549 = -92;
        }
        class264.field3406 = arg2;
        class141.field1660 = arg3;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    public static void method2136(int arg0) {
        field4544 = null;
        if (arg0 != 0) {
            method2137(62, -116, -35, -30, -39, -103, 75);
        }
        field4546 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -75 / ((arg5 - 59) / 55);
        class161.field1879 = arg2;
        class450.field6287 = arg4;
        class431.field5882 = arg6;
        class27.field308 = arg3;
        class119.field1373 = arg0;
        class449.field6273 = arg1;
        field4543++;
    }
}
