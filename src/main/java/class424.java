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

@OriginalClass("client!br")
public class class424 extends class719 {

    @OriginalMember(owner = "client!br", name = "A", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field5871 = new SetupInfo();

    @OriginalMember(owner = "client!br", name = "N", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field5884 = new TheoraInfo();

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field5887 = new TheoraComment();

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field5865 = 0;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "I")
    public static int field5880 = 0;

    @OriginalMember(owner = "client!br", name = "K", descriptor = "D")
    private double field5881;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    private int field5875;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "I")
    private int field5876;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!br", name = "R", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!br", name = "S", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "J")
    private long field5870;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "Lcw;")
    private class21 field5883;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field5872;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field5867;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field5877;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Z")
    private boolean field5862;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "Z")
    private boolean field5868;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "Z")
    private boolean field5873;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "Z")
    private boolean field5879;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2582(int arg0, int arg1, int arg2) {
        field5861++;
        return arg2 == 0 ? class471.method2804(arg0, (byte) -97, arg1) & class190.method1262((byte) -23, arg1, arg0) : true;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)J", line = 22)
    public final long method2583(byte arg0) {
        if (arg0 > -116) {
            field5865 = 36;
        }
        field5864++;
        return this.field5870;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z", line = 41)
    public final boolean method2584(int arg0) {
        if (arg0 != 0) {
            method2582(-61, -69, -6);
        }
        field5874++;
        return this.field5873;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)V", line = 53)
    public static final void method2585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class41.field581 = arg3;
        class364.field4670 = arg4;
        field5885++;
        if (arg0 != 0) {
            field5865 = -96;
        }
        class190.field2761 = arg1;
        class671.field9434 = arg2;
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)D", line = 68)
    public final double method2586(int arg0) {
        if (arg0 != 0) {
            this.method2587(null, -100);
        }
        field5882++;
        return this.field5881;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lha;I)Lcw;", line = 79)
    public final class21 method2587(class545 arg0, int arg1) {
        field5866++;
        if (this.field5867 == null) {
            return null;
        } else if (this.field5868 || this.field5883 == null) {
            if (arg1 <= 88) {
                this.method2590(-96, -88);
            }
            this.field5883 = arg0.method2070(this.field5867.pixels, 0, this.field5867.field1182, this.field5867.field1182, this.field5867.field1181, false);
            this.field5868 = false;
            return this.field5883;
        } else {
            return this.field5883;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([Ljava/lang/String;Z[S)V", line = 101)
    public static final void method2588(String[] arg0, boolean arg1, short[] arg2) {
        class36.method251(arg0, 0, arg2, arg0.length - 1, -12862);
        if (arg1) {
            field5865 = 45;
        }
        field5869++;
    }

    @OriginalMember(owner = "client!br", name = "g", descriptor = "(I)F", line = 114)
    public final float method2589(int arg0) {
        int var2 = -102 / ((arg0 + 27) / 35);
        field5863++;
        return this.field5873 && !this.field5884.method520() ? (float) this.field5884.fpsNumerator / (float) this.field5884.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 135)
    public final void method938(OggPacket arg0, byte arg1) {
        field5878++;
        if (arg1 != -63) {
            this.field5873 = true;
        }
        if (!this.field5873) {
            int var3 = this.field5871.decodeHeader(this.field5884, this.field5887, arg0);
            if (var3 == 0) {
                this.field5873 = true;
                if (this.field5884.frameWidth <= 2048 && this.field5884.frameHeight <= 1024) {
                    this.field5872 = new DecoderContext(this.field5884, this.field5871);
                    this.field5877 = new GranulePos();
                    this.field5867 = new Frame(this.field5884.frameWidth, this.field5884.frameHeight);
                    this.field5876 = this.field5872.getMaxPostProcessingLevel();
                    this.method2590(arg1 - 63, this.field5875);
                    return;
                }
                throw new IllegalStateException();
            }
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            return;
        }
        this.field5870 = class224.method1457((byte) -62);
        int var4 = this.field5872.decodePacketIn(arg0, this.field5877);
        if (var4 < 0) {
            throw new IllegalStateException(String.valueOf(var4));
        }
        this.field5872.granuleFrame(this.field5877);
        this.field5881 = this.field5872.granuleTime(this.field5877);
        if (this.field5862) {
            boolean var5 = arg0.isKeyFrame() == 1;
            if (!var5) {
                return;
            }
            this.field5862 = false;
        }
        if (!this.field5879 || arg0.isKeyFrame() == 1) {
            if (this.field5872.decodeFrame(this.field5867) != 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field5868 = true;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 217)
    public final void method940(int arg0) {
        if (this.field5867 != null) {
            this.field5867.method519();
        }
        field5886++;
        if (this.field5872 != null) {
            this.field5872.method519();
            this.field5872 = null;
        }
        if (this.field5877 != null) {
            this.field5877.method519();
            this.field5877 = null;
        }
        if (arg0 > 32) {
            this.field5884.method519();
            this.field5887.method519();
            this.field5871.method519();
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V", line = 251)
    private final void method2590(int arg0, int arg1) {
        this.field5875 = arg1;
        if (arg0 > -124) {
            this.method2583((byte) -43);
        }
        field5888++;
        if (!this.field5873) {
            return;
        }
        if (this.field5876 < this.field5875) {
            this.field5875 = this.field5876;
        }
        if (this.field5875 < 0) {
            this.field5875 = 0;
        }
        this.field5872.setPostProcessingLevel(this.field5875);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 278)
    public class424(OggStreamState arg0) {
        super(arg0);
    }
}
