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

@OriginalClass("client!pp")
public class class410 extends class238 {

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field5776 = new SetupInfo();

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field5769 = new TheoraInfo();

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field5779 = new TheoraComment();

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "Lpd;")
    public static class267 field5778 = new class267();

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "D")
    private double field5786;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    private int field5770;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    private int field5783;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!pp", name = "S", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!pp", name = "T", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!pp", name = "V", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!pp", name = "W", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "J")
    private long field5768;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "Lqda;")
    private class112 field5777;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field5775;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field5767;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field5788;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "Z")
    private boolean field5780;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "Z")
    private boolean field5787;

    @OriginalMember(owner = "client!pp", name = "U", descriptor = "Z")
    private boolean field5793;

    @OriginalMember(owner = "client!pp", name = "X", descriptor = "Z")
    private boolean field5796;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "[I")
    public static int[] field5785;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 6)
    public final void method10(int arg0) {
        field5792++;
        if (this.field5767 != null) {
            this.field5767.method4144();
        }
        if (this.field5775 != null) {
            this.field5775.method4144();
            this.field5775 = null;
        }
        if (this.field5788 != null) {
            this.field5788.method4144();
            this.field5788 = null;
        }
        this.field5769.method4144();
        if (arg0 != 12056) {
            this.field5787 = false;
        }
        this.field5779.method4144();
        this.field5776.method4144();
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z", line = 40)
    public final boolean method2462(int arg0) {
        field5774++;
        if (arg0 != -1) {
            field5795 = 80;
        }
        return this.field5780;
    }

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)V", line = 58)
    public static void method2463(int arg0) {
        field5785 = null;
        if (arg0 >= 3) {
            field5778 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "(I)D", line = 71)
    public final double method2464(int arg0) {
        field5773++;
        return arg0 == -1 ? this.field5786 : 0.5083066261884157D;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZI)V", line = 88)
    public static final void method2465(byte arg0, boolean arg1, int arg2) {
        field5782++;
        class685 var3 = class26.method198(arg1, (byte) -19, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field9723.length; var4++) {
            var3.field9723[var4] = -1;
            var3.field9721[var4] = 0;
        }
        if (arg0 != 32) {
            method2463(-106);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 114)
    public final void method2(int arg0, OggPacket arg1) {
        field5772++;
        if (this.field5780) {
            this.field5768 = class109.method731(arg0 + 91);
            int var4 = this.field5775.decodePacketIn(arg1, this.field5788);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field5775.granuleFrame(this.field5788);
            this.field5786 = this.field5775.granuleTime(this.field5788);
            if (this.field5793) {
                boolean var5 = arg1.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field5793 = false;
            }
            if (!this.field5787 || arg1.isKeyFrame() == 1) {
                if (this.field5775.decodeFrame(this.field5767) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field5796 = true;
            }
        } else {
            int var3 = this.field5776.decodeHeader(this.field5769, this.field5779, arg1);
            if (var3 == 0) {
                this.field5780 = true;
                if (this.field5769.frameWidth > 2048 || this.field5769.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field5775 = new DecoderContext(this.field5769, this.field5776);
                this.field5788 = new GranulePos();
                this.field5767 = new Frame(this.field5769.frameWidth, this.field5769.frameHeight);
                this.field5770 = this.field5775.getMaxPostProcessingLevel();
                this.method2466(this.field5783, (byte) -107);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        if (arg0 != 0) {
            field5795 = -108;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V", line = 191)
    private final void method2466(int arg0, byte arg1) {
        this.field5783 = arg0;
        field5790++;
        if (arg1 != -107) {
            this.field5779 = null;
        }
        if (!this.field5780) {
            return;
        }
        if (this.field5770 < this.field5783) {
            this.field5783 = this.field5770;
        }
        if (this.field5783 < 0) {
            this.field5783 = 0;
        }
        this.field5775.setPostProcessingLevel(this.field5783);
    }

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "(I)F", line = 218)
    public final float method2467(int arg0) {
        field5781++;
        if (this.field5780 && !this.field5769.method4145()) {
            if (arg0 != 0) {
                this.method2466(-95, (byte) 71);
            }
            return (float) this.field5769.fpsNumerator / (float) this.field5769.fpsDenominator;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lha;Z)Lqda;", line = 233)
    public final class112 method2468(class66 arg0, boolean arg1) {
        field5791++;
        if (this.field5767 == null) {
            return null;
        } else if (this.field5796 || this.field5777 == null) {
            this.field5777 = arg0.method481(this.field5767.pixels, 0, this.field5767.field10346, this.field5767.field10346, this.field5767.field10345, false);
            this.field5796 = false;
            if (!arg1) {
                method2465((byte) 76, true, -66);
            }
            return this.field5777;
        } else {
            return this.field5777;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 257)
    public class410(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I", line = 271)
    public static final int method2469(int arg0, int arg1) {
        field5789++;
        if (arg0 != 1024) {
            method2463(-32);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "(I)J", line = 282)
    public final long method2470(int arg0) {
        field5784++;
        if (arg0 != 1024) {
            field5794 = 94;
        }
        return this.field5768;
    }
}
