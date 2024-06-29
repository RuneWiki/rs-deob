import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class759 extends class238 {

    @OriginalMember(owner = "client!sha", name = "q", descriptor = "Lfja;")
    public static class783 field10454 = new class783(35, -2);

    @OriginalMember(owner = "client!sha", name = "t", descriptor = "[F")
    public static float[] field10457 = new float[4];

    @OriginalMember(owner = "client!sha", name = "u", descriptor = "[I")
    public static int[] field10458 = new int[200];

    @OriginalMember(owner = "client!sha", name = "v", descriptor = "D")
    public static double field10459;

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!sha", name = "p", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!sha", name = "r", descriptor = "I")
    public static int field10455;

    @OriginalMember(owner = "client!sha", name = "s", descriptor = "[Lnf;")
    public static class604[] field10456;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
    public final void method622(int arg0) {
        field10455++;
        if (arg0 != 23586) {
            this.method618((byte) -54, null);
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class759(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIIIIII)I")
    public static final int method4199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -8987) {
            return -36;
        }
        int var7 = arg3 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg5;
            arg5 = var8;
        }
        field10453++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg4;
        } else {
            return 1 + 7 - arg5 - arg1;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method618(byte arg0, OggPacket arg1) {
        if (arg0 < 27) {
            field10459 = -0.21093870229332898D;
        }
        field10452++;
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)V")
    public static void method4200(byte arg0) {
        field10457 = null;
        field10454 = null;
        if (arg0 != 94) {
            method4200((byte) 74);
        }
        field10458 = null;
        field10456 = null;
    }
}
