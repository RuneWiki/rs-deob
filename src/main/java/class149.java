import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class149 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field2373 = 1;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lug;")
    public static class392 field2372 = new class392();

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[I")
    public static int[] field2375 = new int[50];

    @OriginalMember(owner = "client!em", name = "g", descriptor = "C")
    public char field2376;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "[Loc;")
    public static class135[] field2374;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        if (arg0 < -74) {
            field2374 = null;
            field2372 = null;
            field2375 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public static final void method1144(int arg0) {
        field2370++;
        if (class349.field5212 > 0) {
            class217.method1446(false);
            return;
        }
        class367.field5545 = class116.field1927;
        class116.field1927 = null;
        class244.method1590(40, (byte) 79);
        if (arg0 != 2) {
            method1144(116);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILcu;)V")
    private final void method1145(int arg0, int arg1, class145 arg2) {
        if (arg0 == arg1) {
            this.field2376 = class305.method1999(arg2.method1093(15), (byte) 26);
        } else if (arg1 == 2) {
            this.field2373 = 0;
        }
        field2377++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLcu;)V")
    public final void method1146(byte arg0, class145 arg1) {
        if (arg0 != 57) {
            return;
        }
        while (true) {
            int var3 = arg1.method1063((byte) -38);
            if (var3 == 0) {
                field2371++;
                return;
            }
            this.method1145(1, var3, arg1);
        }
    }
}
