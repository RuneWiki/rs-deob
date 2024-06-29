import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class15 implements class81 {

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lwu;")
    public static class376 field211;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "[Lkf;")
    public static class256[] field214;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method111(int arg0, String arg1) {
        if (arg0 == 2) {
            field210++;
            return arg1.length() + 2;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lmha;")
    public final class419 method112(byte arg0) {
        field212++;
        return arg0 == 62 ? class546.field7216 : null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static void method113(boolean arg0) {
        if (!arg0) {
            method113(false);
        }
        field211 = null;
        field214 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
    public class15(int arg0) {
        this.field213 = arg0;
    }
}
