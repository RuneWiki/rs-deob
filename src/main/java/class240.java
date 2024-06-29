import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class240 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[S")
    public static short[] field4317 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lmb;")
    public static class132 field4319 = class166.method1092(")4slr2)3ws?order=LPWM", 119);

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    public static int[] field4320 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field4318 = -1;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1535(int arg0) {
        field4320 = null;
        field4317 = null;
        if (arg0 == 5726) {
            field4319 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method1536(byte arg0) {
        if (arg0 != 124) {
            method1536((byte) 41);
        }
        field4316++;
        class154.field2800.method778((byte) 105);
    }
}
