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

@OriginalClass("client!qa")
public class class747 extends class137 {

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field10377 = new SetupInfo();

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field10374 = new TheoraInfo();

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field10379 = new TheoraComment();

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "D")
    private double field10392;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "F")
    public static float field10386;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    private int field10382;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    private int field10394;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "J")
    private long field10381;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "Lhia;")
    public static class49 field10396;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lmq;")
    private class85 field10373;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field10385;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field10393;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field10395;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Z")
    private boolean field10372;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
    private boolean field10380;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Z")
    private boolean field10384;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Z")
    private boolean field10388;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method4114(int arg0) {
        if (arg0 == -6991) {
            field10387++;
            return this.field10388;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 15)
    public final void method1085(int arg0) {
        if (this.field10393 != null) {
            this.field10393.method1199();
        }
        field10375++;
        if (arg0 != 0) {
            this.method4114(116);
        }
        if (this.field10385 != null) {
            this.field10385.method1199();
            this.field10385 = null;
        }
        if (this.field10395 != null) {
            this.field10395.method1199();
            this.field10395 = null;
        }
        this.field10374.method1199();
        this.field10379.method1199();
        this.field10377.method1199();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V", line = 53)
    public static final void method4115(int arg0, int arg1, int arg2) {
        field10391++;
        if (class390.field5440 == null || arg2 != -5321) {
            return;
        }
        int var3 = class448.field6176;
        int var4 = class600.field8557;
        class587.method3445(arg0, arg1, 8468);
        if (class388.field5420 == 0) {
            class29.field313 = null;
            class29.field313 = class390.field5440.method53(class390.field5440.method76(class81.field1198, class278.field4016), class390.field5440.method88(class81.field1198, class278.field4016));
        } else if (class388.field5420 == 1 && (class728.field10154 == null || class448.field6176 != var3 || class600.field8557 != var4)) {
            class728.field10154 = new class730[class600.field8557 * class448.field6176];
            for (int var5 = 0; var5 < class728.field10154.length; var5++) {
                class728.field10154[var5] = class390.field5440.method53(class390.field5440.method76(class657.field9274, class36.field432), class390.field5440.method88(class657.field9274, class36.field432));
            }
            class7.field98 = 1;
            class770.field10633 = new int[class600.field8557 * class448.field6176];
        }
        class87.field1297 = true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILha;)Lmq;", line = 101)
    public final class85 method4116(int arg0, class475 arg1) {
        field10383++;
        if (this.field10393 == null) {
            return null;
        } else if (this.field10384 || this.field10373 == null) {
            this.field10373 = arg1.method460(this.field10393.pixels, 0, this.field10393.field2437, this.field10393.field2437, this.field10393.field2436, false);
            this.field10384 = false;
            if (arg0 != -9613) {
                this.method4116(8, null);
            }
            return this.field10373;
        } else {
            return this.field10373;
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)D", line = 126)
    public final double method4117(int arg0) {
        if (arg0 == 0) {
            field10390++;
            return this.field10392;
        } else {
            return 0.4360572951948082D;
        }
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)J", line = 139)
    public final long method4118(int arg0) {
        if (arg0 == 0) {
            field10397++;
            return this.field10381;
        } else {
            return -74L;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 154)
    public final void method1080(OggPacket arg0, int arg1) {
        field10376++;
        if (this.field10388) {
            this.field10381 = class337.method2062(false);
            int var4 = this.field10385.decodePacketIn(arg0, this.field10395);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field10385.granuleFrame(this.field10395);
            this.field10392 = this.field10385.granuleTime(this.field10395);
            if (this.field10380) {
                boolean var5 = arg0.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field10380 = false;
            }
            if (!this.field10372 || arg0.isKeyFrame() == 1) {
                if (this.field10385.decodeFrame(this.field10393) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field10384 = true;
            }
        } else {
            int var3 = this.field10377.decodeHeader(this.field10374, this.field10379, arg0);
            if (var3 == 0) {
                this.field10388 = true;
                if (this.field10374.frameWidth > 2048 || this.field10374.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field10385 = new DecoderContext(this.field10374, this.field10377);
                this.field10395 = new GranulePos();
                this.field10393 = new Frame(this.field10374.frameWidth, this.field10374.frameHeight);
                this.field10382 = this.field10385.getMaxPostProcessingLevel();
                this.method4121(this.field10394, (byte) -124);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        int var6 = 95 % ((-arg1 - 48) / 43);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 229)
    public class747(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)F", line = 239)
    public final float method4119(byte arg0) {
        if (arg0 > -42) {
            this.field10393 = null;
        }
        field10378++;
        return this.field10388 && !this.field10374.method1200() ? (float) this.field10374.fpsNumerator / (float) this.field10374.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V", line = 256)
    public static void method4120(int arg0) {
        field10396 = null;
        if (arg0 != 0) {
            field10396 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)V", line = 268)
    private final void method4121(int arg0, byte arg1) {
        this.field10394 = arg0;
        if (arg1 > -89) {
            this.method4119((byte) -94);
        }
        field10389++;
        if (!this.field10388) {
            return;
        }
        if (this.field10394 > this.field10382) {
            this.field10394 = this.field10382;
        }
        if (this.field10394 < 0) {
            this.field10394 = 0;
        }
        this.field10385.setPostProcessingLevel(this.field10394);
    }
}
