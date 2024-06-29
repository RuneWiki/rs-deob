import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class81 extends class35 {

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Ljava/lang/String;")
    public String field1141;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[S")
    public static short[] field1135 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Lo;")
    public static class332 field1136 = new class332("M", "M", "M", "M");

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Lgf;")
    public static class370 field1143 = new class370(8);

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Lws;")
    public static class408 field1144;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "[I")
    public static int[] field1139;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "[I")
    public static int[] field1140;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[Ldp;")
    public static class319[] field1137;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 8)
    public static final void method667(byte arg0) {
        class378.method2320(class464.field6543, (byte) 119);
        class287.field4381++;
        field1134++;
        class230.field3390.method2619((byte) 80, class419.method2487((byte) -125));
        class230.field3390.method2592(class342.field5115, (byte) -126);
        if (arg0 < -80) {
            class230.field3390.method2592(class233.field3411, (byte) -128);
            class230.field3390.method2619((byte) 88, class337.field5038.field3930);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 25)
    public static void method668(byte arg0) {
        field1136 = null;
        field1137 = null;
        field1135 = null;
        field1139 = null;
        field1144 = null;
        field1140 = null;
        field1143 = null;
        if (arg0 < 33) {
            field1136 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII)V", line = 51)
    public static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1133++;
        class418.field6009 = arg2;
        class309.field4650 = arg3;
        class305.field4550 = arg0;
        class82.field1148 = arg6;
        class142.field2026 = arg1;
        if (arg5 < -105) {
            class454.field6459 = arg4;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)I", line = 68)
    public static final int method670(int arg0) {
        field1142++;
        return arg0 == -1 ? 6 : 33;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 82)
    public class81() {
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 85)
    public class81(String arg0) {
        this.field1141 = arg0;
    }
}
