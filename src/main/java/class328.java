import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class328 extends class132 {

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public int field4399 = 0;

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "[I")
    public static int[] field4394 = new int[3];

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "I")
    public static int field4398 = 0;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "F")
    public static float field4397;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLdaa;)V")
    public final void method2021(byte arg0, class11 arg1) {
        if (arg0 != -69) {
            return;
        }
        field4393++;
        while (true) {
            int var3 = arg1.method110((byte) 65);
            if (var3 == 0) {
                return;
            }
            this.method2022(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ldaa;ZI)V")
    private final void method2022(class11 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4398 = -121;
        }
        field4395++;
        if (arg2 == 2) {
            this.field4399 = arg0.method93((byte) 93);
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public static void method2023(int arg0) {
        if (arg0 == 0) {
            field4394 = null;
        }
    }
}
