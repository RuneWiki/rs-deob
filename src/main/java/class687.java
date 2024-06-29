import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class687 extends class181 {

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field9667 = new SetupInfo();

    @OriginalMember(owner = "client!dv", name = "S", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field9672 = new TheoraInfo();

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field9650 = new TheoraComment();

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "Lmga;")
    public static class739 field9660 = new class739(23, -1);

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "D")
    private double field9668;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    private int field9648;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "I")
    private int field9653;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!dv", name = "P", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!dv", name = "R", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "J")
    private long field9659;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "Lvr;")
    private class147 field9665;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field9651;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field9656;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field9663;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "Z")
    private boolean field9652;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "Z")
    private boolean field9657;

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "Z")
    private boolean field9658;

    @OriginalMember(owner = "client!dv", name = "Q", descriptor = "Z")
    private boolean field9670;

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "[Lvr;")
    public static class147[] field9655;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)F")
    public final float method3812(byte arg0) {
        field9671++;
        if (this.field9670 && !this.field9672.method4109()) {
            return arg0 == -24 ? (float) this.field9672.fpsNumerator / (float) this.field9672.fpsDenominator : -1.1678427F;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)D")
    public final double method3813(int arg0) {
        field9666++;
        if (arg0 != -1) {
            this.field9650 = null;
        }
        return this.field9668;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)V")
    private final void method3814(boolean arg0, int arg1) {
        if (arg0) {
            this.field9652 = false;
        }
        this.field9648 = arg1;
        field9654++;
        if (!this.field9670) {
            return;
        }
        if (this.field9648 > this.field9653) {
            this.field9648 = this.field9653;
        }
        if (this.field9648 < 0) {
            this.field9648 = 0;
        }
        this.field9651.setPostProcessingLevel(this.field9648);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(Z)Z")
    public final boolean method3815(boolean arg0) {
        if (arg0) {
            this.field9670 = false;
        }
        field9662++;
        return this.field9670;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class687(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method387(OggPacket arg0, byte arg1) {
        field9669++;
        if (arg1 != -13) {
            this.method3817(false);
        }
        if (!this.field9670) {
            int var3 = this.field9667.decodeHeader(this.field9672, this.field9650, arg0);
            if (var3 == 0) {
                this.field9670 = true;
                if (this.field9672.frameWidth <= 2048 && this.field9672.frameHeight <= 1024) {
                    this.field9651 = new DecoderContext(this.field9672, this.field9667);
                    this.field9663 = new GranulePos();
                    this.field9656 = new Frame(this.field9672.frameWidth, this.field9672.frameHeight);
                    this.field9653 = this.field9651.getMaxPostProcessingLevel();
                    this.method3814(false, this.field9648);
                    return;
                }
                throw new IllegalStateException();
            }
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            return;
        }
        this.field9659 = class302.method1910(arg1 + 13);
        int var4 = this.field9651.decodePacketIn(arg0, this.field9663);
        if (var4 < 0) {
            throw new IllegalStateException(String.valueOf(var4));
        }
        this.field9651.granuleFrame(this.field9663);
        this.field9668 = this.field9651.granuleTime(this.field9663);
        if (this.field9657) {
            boolean var5 = arg0.isKeyFrame() == 1;
            if (!var5) {
                return;
            }
            this.field9657 = false;
        }
        if (!this.field9658 || arg0.isKeyFrame() == 1) {
            if (this.field9651.decodeFrame(this.field9656) != 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field9652 = true;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILha;)Lvr;")
    public final class147 method3816(int arg0, class65 arg1) {
        field9664++;
        int var3 = 24 % ((-arg0 - 10) / 63);
        if (this.field9656 == null) {
            return null;
        } else if (this.field9652 || this.field9665 == null) {
            this.field9665 = arg1.method544(this.field9656.pixels, 0, this.field9656.field10245, this.field9656.field10245, this.field9656.field10246, false);
            this.field9652 = false;
            return this.field9665;
        } else {
            return this.field9665;
        }
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(Z)J")
    public final long method3817(boolean arg0) {
        if (arg0) {
            return -31L;
        } else {
            field9649++;
            return this.field9659;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (this.field9656 != null) {
            this.field9656.method4110();
        }
        field9661++;
        if (this.field9651 != null) {
            this.field9651.method4110();
            this.field9651 = null;
        }
        if (this.field9663 != null) {
            this.field9663.method4110();
            this.field9663 = null;
        }
        if (arg0 != -30243) {
            this.method3812((byte) 100);
        }
        this.field9672.method4110();
        this.field9650.method4110();
        this.field9667.method4110();
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)V")
    public static void method3818(int arg0) {
        field9655 = null;
        field9660 = null;
        if (arg0 != 23) {
            field9660 = null;
        }
    }
}
