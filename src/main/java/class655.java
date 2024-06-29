import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class655 extends class362 {

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public volatile int field8993 = -1;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Ljava/lang/String;")
    public volatile String field8994;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[I")
    public static int[] field8996 = new int[32];

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[S")
    public static short[] field8995 = new short[256];

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lkn;")
    public static class737 field8997 = new class737(1, 4);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Ldfa;")
    public static class167 field8991;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method3699(byte arg0) {
        field8996 = null;
        field8991 = null;
        field8997 = null;
        field8995 = null;
        if (arg0 != -35) {
            method3700((byte) -26, -20);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V")
    public static final void method3700(byte arg0, int arg1) {
        field8992++;
        class594 var2 = class692.method3869(arg1, (byte) 105, 7);
        if (arg0 < 42) {
            method3700((byte) 62, -64);
        }
        var2.method3383(-16058);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class655(String arg0) {
        this.field8994 = arg0;
    }
}
