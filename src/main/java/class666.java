import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class666 extends class749 implements class9 {

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    private int field9339;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Z")
    public static boolean field9337 = false;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lqaa;")
    public static class27 field9341 = new class27(15, -1);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)I")
    public final int method51(int arg0) {
        if (arg0 != -29868) {
            this.field9339 = -94;
        }
        ++field9340;
        return this.field9339;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Loea;I[BIZ)V")
    public class666(class594 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9339 = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
    public final void method3076(byte arg0) {
        int var2 = -95 % ((-71 - arg0) / 52);
        ++field9334;
        super.field10467.method3423(this, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)J")
    public final long method52(byte arg0) {
        if (arg0 <= 120) {
            return 4L;
        } else {
            ++field9343;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[B)V")
    public final void method53(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method4168(arg3, arg0, -24038);
        if (arg1 == -6562) {
            ++field9336;
            this.field9339 = arg2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method3739(int arg0) {
        int var1 = -50 / ((43 - arg0) / 35);
        field9341 = null;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static final void method3740(int arg0) {
        class530.method3122(true);
        ++field9335;
        class153.method1174(2, 22050, (byte) -116, class471.field6781.field6718.method710(27669) == 1);
        if (arg0 != 23709) {
            field9338 = 66;
        }
        class443.field6166 = class127.method989(22050, class341.field4796, class567.field8085, 0, 5);
        class219.method1518(true, 0, class184.method1315((byte) 10, (class250) null));
        class338.field4769 = class127.method989(2048, class341.field4796, class567.field8085, 1, arg0 + -23704);
        class338.field4769.method375(false, class484.field6848);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I")
    public final int method50(boolean arg0) {
        ++field9342;
        return arg0 ? 26 : super.field10464;
    }
}
