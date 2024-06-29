import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class34 {

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lhj;")
    public static class569 field855 = new class569();

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "D")
    public static double field856;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "Lin;")
    public static class91 field857;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 4)
    public static void method440(int arg0) {
        if (arg0 != 255) {
            method440(-18);
        }
        field855 = null;
        field857 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBII)I", line = 22)
    public static final int method441(int arg0, byte arg1, int arg2, int arg3) {
        field854++;
        int var4 = 88 % (-arg1 / 55);
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return ((arg3 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)Z", line = 49)
    public static final boolean method442(int arg0) {
        if (arg0 != 314376967) {
            method441(-22, (byte) -36, 19, 113);
        }
        field858++;
        if (class591.field8067) {
            try {
                if ((Boolean) class43.method542((byte) 125, class675.field9193, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
