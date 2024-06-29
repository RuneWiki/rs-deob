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

@OriginalClass("client!k")
public class class43 extends class329 {

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field443 = new SetupInfo();

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field433 = new TheoraInfo();

    @OriginalMember(owner = "client!k", name = "L", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field449 = new TheoraComment();

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
    public static int[] field441 = new int[256];

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "[I")
    public static int[] field461 = new int[32];

    @OriginalMember(owner = "client!k", name = "H", descriptor = "D")
    private double field445;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "J")
    private long field447;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Lho;")
    private class318 field462;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Lpn;")
    public static class327 field448;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field457;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field436;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field434;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Ljava/awt/Frame;")
    public static java.awt.Frame field453;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Z")
    private boolean field435;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Z")
    private boolean field439;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Z")
    private boolean field444;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Z")
    private boolean field458;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V", line = 9)
    private final void method335(int arg0, int arg1) {
        this.field455 = arg1;
        if (arg0 != 0) {
            this.field443 = null;
        }
        field438++;
        if (!this.field435) {
            return;
        }
        if (this.field446 < this.field455) {
            this.field455 = this.field446;
        }
        if (this.field455 < 0) {
            this.field455 = 0;
        }
        this.field457.setPostProcessingLevel(this.field455);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILsha;)V", line = 35)
    public static final void method336(int arg0, class115 arg1) {
        field442++;
        if (arg0 != -1) {
            field452 = -47;
        }
        if (class665.field9355 == arg1.field1541) {
            class363.field5240[arg1.field1452] = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 52)
    public final void method337(OggPacket arg0, int arg1) {
        int var3 = -107 % ((71 - arg1) / 44);
        field451++;
        if (!this.field435) {
            int var6 = this.field443.decodeHeader(this.field433, this.field449, arg0);
            if (var6 == 0) {
                this.field435 = true;
                if (this.field433.frameWidth > 2048 || this.field433.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field457 = new DecoderContext(this.field433, this.field443);
                this.field434 = new GranulePos();
                this.field436 = new Frame(this.field433.frameWidth, this.field433.frameHeight);
                this.field446 = this.field457.getMaxPostProcessingLevel();
                this.method335(0, this.field455);
            } else if (var6 < 0) {
                throw new IllegalStateException(String.valueOf(var6));
            }
            return;
        }
        this.field447 = class683.method3903((byte) 4);
        int var4 = this.field457.decodePacketIn(arg0, this.field434);
        if (var4 < 0) {
            throw new IllegalStateException(String.valueOf(var4));
        }
        this.field457.granuleFrame(this.field434);
        this.field445 = this.field457.granuleTime(this.field434);
        if (this.field458) {
            boolean var5 = arg0.isKeyFrame() == 1;
            if (!var5) {
                return;
            }
            this.field458 = false;
        }
        if (!this.field439 || arg0.isKeyFrame() == 1) {
            if (this.field457.decodeFrame(this.field436) != 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field444 = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 124)
    public class43(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)F", line = 137)
    public final float method338(byte arg0) {
        field450++;
        if (arg0 < 103) {
            this.method342(false);
        }
        return this.field435 && !this.field433.method993() ? (float) this.field433.fpsNumerator / (float) this.field433.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lha;I)Lho;", line = 158)
    public final class318 method339(class473 arg0, int arg1) {
        field440++;
        if (arg1 >= -69) {
            this.method338((byte) 99);
        }
        if (this.field436 == null) {
            return null;
        } else if (this.field444 || this.field462 == null) {
            this.field462 = arg0.method182(this.field436.pixels, 0, this.field436.field1978, this.field436.field1978, this.field436.field1977, false);
            this.field444 = false;
            return this.field462;
        } else {
            return this.field462;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Z", line = 186)
    public final boolean method340(boolean arg0) {
        if (!arg0) {
            this.method335(65, 30);
        }
        field459++;
        return this.field435;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)D", line = 197)
    public final double method341(byte arg0) {
        int var2 = 120 % ((arg0 + 52) / 35);
        field463++;
        return this.field445;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V", line = 207)
    public final void method342(boolean arg0) {
        if (this.field436 != null) {
            this.field436.method994();
        }
        if (arg0) {
            return;
        }
        field456++;
        if (this.field457 != null) {
            this.field457.method994();
            this.field457 = null;
        }
        if (this.field434 != null) {
            this.field434.method994();
            this.field434 = null;
        }
        this.field433.method994();
        this.field449.method994();
        this.field443.method994();
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)J", line = 239)
    public final long method343(int arg0) {
        if (arg0 != -29610) {
            this.method343(105);
        }
        field454++;
        return this.field447;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([I[Ljava/lang/String;B)V", line = 250)
    public static final void method344(int[] arg0, String[] arg1, byte arg2) {
        if (arg2 <= 25) {
            method345(-107, -28, -83);
        }
        field460++;
        class482.method2861(arg1, arg1.length - 1, 1, arg0, 0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z", line = 264)
    public static final boolean method345(int arg0, int arg1, int arg2) {
        if (arg2 != 1024) {
            field452 = -120;
        }
        field437++;
        return (class372.method2312(arg1, arg0, 33) | class346.method2189(0, arg1, arg0) | class330.method2078(-94, arg1, arg0)) & class458.method2756((byte) 53, arg1, arg0);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V", line = 278)
    public static void method346(byte arg0) {
        field448 = null;
        field461 = null;
        int var1 = 49 / ((30 - arg0) / 55);
        field441 = null;
        field453 = null;
    }
}
