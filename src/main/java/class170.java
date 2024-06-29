import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class class170 extends class627 {

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field2235;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "Lfq;")
    public static class141 field2237 = new class141(10, 2, 2, 0);

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "Lmq;")
    public static class78 field2242 = new class78(113, 7);

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field2242 = null;
        if (arg0 == 9316) {
            field2237 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIZIIIII)V")
    public static final void method1062(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg3) {
            method1065(112, 67, -38, 60, 22, -58, 95, 111, (byte) -53, -94, null, null);
        }
        field2238++;
        class470.field6755[class522.field7389++] = new class600(arg0, arg7, arg1, arg8, arg8, arg1, arg5, arg6, arg6, arg5, arg4, arg4, arg2, arg2);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method1063(int arg0, OggPacket arg1) {
        field2241++;
        this.method931(-96, arg1);
        if (arg0 == 31067) {
            this.field2240++;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
    public abstract void method926(boolean arg0);

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public abstract void method931(int arg0, OggPacket arg1);

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZLjava/lang/String;I)V")
    public static final void method1064(int arg0, boolean arg1, String arg2, int arg3) {
        class516.method2959(12288);
        field2236++;
        class262.method1583((byte) 122);
        class120.method792(arg0 - 17736);
        class525.method3012(arg3, arg2, arg1, 18097);
        class184.method1175(16);
        class613.method3357(class458.field6407, (byte) 47);
        class202.method1257((byte) -97, class458.field6407);
        class216.method1310(class458.field6407, arg0 + 11, class645.field8897);
        class154.method959(arg0 - 112);
        class734.method4106(arg0 ^ 0xFFFFFFF9, class328.field4189);
        if (arg0 != -11) {
            method1065(28, -46, -20, 38, 3, 10, -74, -127, (byte) 41, 44, null, null);
        }
        class728.method4033(arg0 - 92);
        class681.method3687((byte) 64);
        if (class668.field9150 == 3) {
            class614.method3369(4, (byte) -125);
        } else if (class668.field9150 == 7) {
            class614.method3369(8, (byte) -88);
        } else if (class668.field9150 == 10) {
            class614.method3369(11, (byte) -78);
        } else if (class668.field9150 == 1 || class668.field9150 == 2) {
            class706.method3910(79);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIIBILkfa;Lgq;)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, class407 arg10, class761 arg11) {
        class38.field563 = null;
        class531.field7481 = arg2;
        class586.field8189 = arg0;
        class646.field8904 = arg6;
        if (arg8 < 6) {
            method1062(99, 1, 59, true, 60, -15, -84, -18, 2);
        }
        class666.field9114 = arg1;
        field2239++;
        class415.field5907 = arg11;
        class242.field3115 = arg3;
        class8.field89 = arg9;
        class127.field1542 = arg4;
        class205.field2610 = arg10;
        class518.field7288 = null;
        class121.field1459 = arg5;
        class315.field4050 = arg7;
        class744.field10389 = null;
        class584.method3257(86);
        class217.field2736 = true;
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class170(OggStreamState arg0) {
        this.field2235 = arg0;
    }
}
