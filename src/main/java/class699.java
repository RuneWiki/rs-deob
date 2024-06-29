import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class699 {

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public int field9723 = 0;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lbu;")
    public static class21 field9724 = new class21(87, 10);

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "[F")
    public static float[] field9727 = new float[2];

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "Loo;")
    public static class652 field9728 = new class652(4);

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lso;B)Ljava/lang/String;")
    public static final String method3933(class494 arg0, byte arg1) {
        if (arg1 < 30) {
            field9727 = null;
        }
        field9725++;
        return class437.method2612(24289, 32767, arg0);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
    public static void method3934(int arg0) {
        if (arg0 <= 93) {
            method3934(-111);
        }
        field9724 = null;
        field9728 = null;
        field9727 = null;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLso;)V")
    public final void method3935(byte arg0, class494 arg1) {
        while (true) {
            int var3 = arg1.method2964((byte) 111);
            if (var3 == 0) {
                if (arg0 <= 53) {
                    field9727 = null;
                }
                field9722++;
                return;
            }
            this.method3936(var3, 2, arg1);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IILso;)V")
    private final void method3936(int arg0, int arg1, class494 arg2) {
        field9726++;
        if (arg0 == 5) {
            this.field9723 = arg2.method2998(true);
        }
        if (arg1 != 2) {
            field9728 = null;
        }
    }
}
