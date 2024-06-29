import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class541 extends class168 {

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field7489;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "[Lii;")
    public static class556[] field7494;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method3102(int arg0) {
        field7492++;
        class33.field547 = 0;
        class755.field10539 = -1;
        class366.field4727 = -1;
        if (arg0 > -7) {
            method3103(112);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method3103(int arg0) {
        if (arg0 != -6199) {
            field7494 = null;
        }
        field7494 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class541(OggStreamState arg0) {
        this.field7489 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public abstract void method62(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILvl;)V")
    public static final void method3104(int arg0, int arg1, class13 arg2) {
        if (arg2.field165 != null) {
            int var3 = arg2.field165[arg1 + 1];
            if (arg2.field153 != var3) {
                arg2.field266 = arg2.field263;
                arg2.field153 = var3;
                arg2.field198 = 0;
                arg2.field202 = 0;
                arg2.field243 = 1;
                arg2.field172 = 0;
                if (arg2.field153 != -1) {
                    class758.method4218(arg2.field198, arg2, 0, class66.field941.method1299((byte) -125, arg2.field153));
                }
            }
        }
        int var4 = -15 % ((-arg0 - 51) / 37);
        field7493++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method3105(int arg0, OggPacket arg1) {
        field7491++;
        this.method58((byte) 61, arg1);
        if (arg0 != -1) {
            method3102(30);
        }
        this.field7488++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public abstract void method58(byte arg0, OggPacket arg1);
}
