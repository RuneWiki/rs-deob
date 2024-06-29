import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class281 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field3581 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3580 = new String[100];

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lkg;")
    public static class179 field3583 = new class179(48, 8);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLfh;)V", line = 7)
    private final void method1665(int arg0, byte arg1, class463 arg2) {
        if (arg1 == -34) {
            field3578++;
            if (arg0 == 5) {
                this.field3581 = arg2.method2758((byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLqn;)V", line = 25)
    public static final void method1666(boolean arg0, class47 arg1) {
        field3577++;
        class261.field3307 = arg1;
        if (!arg0) {
            method1667(14);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 39)
    public static void method1667(int arg0) {
        field3583 = null;
        field3580 = null;
        if (arg0 != 27558) {
            method1666(true, null);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILfh;)V", line = 50)
    public final void method1668(int arg0, class463 arg1) {
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field3582++;
                if (arg0 != 700) {
                    method1667(72);
                    return;
                }
                return;
            }
            this.method1665(var3, (byte) -34, arg1);
        }
    }
}
