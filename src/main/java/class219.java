import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class219 extends class379 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field2572;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Lft;")
    public static class4 field2571 = new class4();

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Z")
    public static boolean field2574 = false;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[BIIIII)Z")
    public static final boolean method1356(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2570++;
        int var7 = arg4 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        if (arg2 != 0) {
            method1356(-33, null, -106, -105, -39, -29, -30);
        }
        int var9 = -((arg0 + arg6 - 1) / arg0);
        int var10 = -((arg4 + arg0 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg5] == 0) {
                    return true;
                }
                arg5 += arg0;
            }
            int var13 = arg5 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public abstract void method987(int arg0);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method1357(byte arg0, OggPacket arg1) {
        this.method986(-1, arg1);
        field2573++;
        int var3 = -25 % ((3 - arg0) / 62);
        this.field2569++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        field2571 = null;
        if (arg0 != 52) {
            method1358((byte) -71);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public abstract void method986(int arg0, OggPacket arg1);

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class219(OggStreamState arg0) {
        this.field2572 = arg0;
    }
}
