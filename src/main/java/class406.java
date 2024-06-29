import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class406 {

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "B")
    public byte field6275;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field6269;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    private int field6273;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Lqaa;")
    public static class26 field6268 = new class26();

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public int field6255;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public int field6256;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field6257;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public int field6258;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field6265;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public int field6270;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Lti;")
    public class406 field6267;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Lti;")
    public final class406 method2601(int arg0, int arg1, int arg2, int arg3) {
        field6266++;
        if (arg2 != 458752) {
            this.field6264 = -66;
        }
        return new class406(this.field6273, arg3, arg0, arg1, this.field6275);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIILr;)V")
    public static final void method2602(int arg0, int arg1, int arg2, class167 arg3) {
        class529.field7721 = arg3;
        int var4 = 118 / ((39 - arg2) / 53);
        class224.field3610 = new class491[arg1][arg0];
        field6262++;
        if (class647.field9080 != null) {
            class476.field7059 = class247.method1764(class647.field9080[5], class647.field9080[0], 124, class647.field9080[3], class647.field9080[1], class647.field9080[2], class647.field9080[4]);
        }
        class576.field8216 = new class491();
        class685.method3895(0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method2603(int arg0) {
        field6268 = null;
        if (arg0 != 0) {
            field6268 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lwg;")
    public final class391 method2604(byte arg0) {
        if (arg0 <= 62) {
            this.field6257 = 57;
        }
        field6263++;
        return class251.method1787((byte) -23, this.field6273);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2605(int arg0, int arg1, boolean arg2) {
        field6271++;
        if (arg2) {
            field6259 = 7;
        }
        return (arg1 & 0x70000) != 0 | class159.method1307(arg0, 29840, arg1) || class247.method1758(arg1, -118, arg0);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIB)V")
    public class406(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6275 = arg4;
        this.field6264 = arg1;
        this.field6269 = arg2;
        this.field6273 = arg0;
        this.field6260 = arg3;
    }
}
