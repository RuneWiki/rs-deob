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

@OriginalClass("client!ff")
public class class9 extends class541 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field105 = new SetupInfo();

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field124 = new TheoraInfo();

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field127 = new TheoraComment();

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Lkg;")
    public static class275 field122 = new class275(89, 6);

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Ljava/lang/Object;")
    public static volatile Object field128 = null;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "D")
    private double field115;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "J")
    private long field114;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Liea;")
    private class481 field120;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field121;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field110;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field113;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Z")
    private boolean field111;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Z")
    private boolean field112;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
    private boolean field123;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Z")
    private boolean field125;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[S")
    public static short[] field129;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)F")
    public final float method55(int arg0) {
        field106++;
        if (this.field123 && !this.field124.method4008()) {
            return arg0 == 26399 ? (float) this.field124.fpsNumerator / (float) this.field124.fpsDenominator : -1.9460704F;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)J")
    public final long method56(int arg0) {
        field119++;
        return arg0 == 1 ? this.field114 : 36L;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILha;)Liea;")
    public final class481 method57(int arg0, class60 arg1) {
        if (arg0 != 3751) {
            this.method62(false);
        }
        field109++;
        if (this.field110 == null) {
            return null;
        } else if (this.field125 || this.field120 == null) {
            this.field120 = arg1.method535(this.field110.pixels, 0, this.field110.field9973, this.field110.field9973, this.field110.field9972, false);
            this.field125 = false;
            return this.field120;
        } else {
            return this.field120;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method58(byte arg0, OggPacket arg1) {
        field117++;
        if (this.field123) {
            this.field114 = class446.method2525(500);
            int var4 = this.field121.decodePacketIn(arg1, this.field113);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field121.granuleFrame(this.field113);
            this.field115 = this.field121.granuleTime(this.field113);
            if (this.field112) {
                boolean var5 = arg1.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field112 = false;
            }
            if (!this.field111 || arg1.isKeyFrame() == 1) {
                if (this.field121.decodeFrame(this.field110) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field125 = true;
            }
        } else {
            int var3 = this.field105.decodeHeader(this.field124, this.field127, arg1);
            if (var3 == 0) {
                this.field123 = true;
                if (this.field124.frameWidth > 2048 || this.field124.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field121 = new DecoderContext(this.field124, this.field105);
                this.field113 = new GranulePos();
                this.field110 = new Frame(this.field124.frameWidth, this.field124.frameHeight);
                this.field118 = this.field121.getMaxPostProcessingLevel();
                this.method61((byte) 71, this.field107);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        if (arg0 != 61) {
            this.method57(48, null);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z")
    public final boolean method59(byte arg0) {
        field108++;
        return arg0 >= -33 ? true : this.field123;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class9(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)D")
    public final double method60(int arg0) {
        if (arg0 == -1025) {
            field126++;
            return this.field115;
        } else {
            return -0.4278388597498525D;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
    private final void method61(byte arg0, int arg1) {
        field104++;
        this.field107 = arg1;
        if (arg0 <= 15 || !this.field123) {
            return;
        }
        if (this.field107 > this.field118) {
            this.field107 = this.field118;
        }
        if (this.field107 < 0) {
            this.field107 = 0;
        }
        this.field121.setPostProcessingLevel(this.field107);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        if (this.field110 != null) {
            this.field110.method4007();
        }
        field116++;
        if (arg0) {
            method63((byte) 113);
        }
        if (this.field121 != null) {
            this.field121.method4007();
            this.field121 = null;
        }
        if (this.field113 != null) {
            this.field113.method4007();
            this.field113 = null;
        }
        this.field124.method4007();
        this.field127.method4007();
        this.field105.method4007();
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static void method63(byte arg0) {
        field122 = null;
        field128 = null;
        if (arg0 > 88) {
            field129 = null;
        }
    }
}
