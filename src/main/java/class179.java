import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class179 extends class370 {

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field2710 = new SetupInfo();

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field2699 = new TheoraInfo();

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field2703 = new TheoraComment();

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Lkaa;")
    public static class47 field2695 = new class47(67, 8);

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2712 = new Rectangle[100];

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "D")
    private double field2696;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "J")
    private long field2716;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lhu;")
    private class133 field2693;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field2691;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field2698;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field2697;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Z")
    private boolean field2690;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
    private boolean field2692;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "Z")
    private boolean field2701;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Z")
    private boolean field2715;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lwu;Lwu;[IB)V")
    public static final void method1236(class376 arg0, class376 arg1, int[] arg2, byte arg3) {
        class629.field8381 = arg0;
        if (arg3 != -109) {
            field2712 = null;
        }
        class517.field6905 = arg1;
        field2700++;
        if (arg2 != null) {
            class595.field7748 = arg2;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)F")
    public final float method1237(byte arg0) {
        field2706++;
        if (this.field2692 && !this.field2699.method4005()) {
            if (arg0 != -19) {
                this.method1238((byte) -121);
            }
            return (float) this.field2699.fpsNumerator / (float) this.field2699.fpsDenominator;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)D")
    public final double method1238(byte arg0) {
        field2705++;
        return arg0 == -121 ? this.field2696 : -0.3000760850863135D;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field2695 = null;
        if (arg0 > -34) {
            field2695 = null;
        }
        field2712 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class179(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IC)Z")
    public static final boolean method1240(int arg0, char arg1) {
        if (arg0 == -23324) {
            field2694++;
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    private final void method1241(int arg0, int arg1) {
        field2713++;
        if (arg0 != -1) {
            this.method1226((byte) -127);
        }
        this.field2707 = arg1;
        if (!this.field2692) {
            return;
        }
        if (this.field2709 < this.field2707) {
            this.field2707 = this.field2709;
        }
        if (this.field2707 < 0) {
            this.field2707 = 0;
        }
        this.field2691.setPostProcessingLevel(this.field2707);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lha;B)Lhu;")
    public final class133 method1242(class59 arg0, byte arg1) {
        field2689++;
        if (this.field2698 == null) {
            return null;
        } else if (this.field2701 || this.field2693 == null) {
            this.field2693 = arg0.method495(this.field2698.pixels, 0, this.field2698.field9862, this.field2698.field9862, this.field2698.field9863, false);
            this.field2701 = false;
            if (arg1 <= 93) {
                this.field2715 = true;
            }
            return this.field2693;
        } else {
            return this.field2693;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public final void method1226(byte arg0) {
        field2708++;
        if (this.field2698 != null) {
            this.field2698.method4006();
        }
        if (arg0 >= -81) {
            this.method1237((byte) 119);
        }
        if (this.field2691 != null) {
            this.field2691.method4006();
            this.field2691 = null;
        }
        if (this.field2697 != null) {
            this.field2697.method4006();
            this.field2697 = null;
        }
        this.field2699.method4006();
        this.field2703.method4006();
        this.field2710.method4006();
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Z")
    public final boolean method1243(byte arg0) {
        field2714++;
        if (arg0 >= -37) {
            this.field2697 = null;
        }
        return this.field2692;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)J")
    public final long method1244(int arg0) {
        if (arg0 != 0) {
            this.field2692 = false;
        }
        field2711++;
        return this.field2716;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method1225(OggPacket arg0, boolean arg1) {
        field2704++;
        if (arg1) {
            return;
        }
        if (!this.field2692) {
            int var5 = this.field2710.decodeHeader(this.field2699, this.field2703, arg0);
            if (var5 == 0) {
                this.field2692 = true;
                if (this.field2699.frameWidth > 2048 || this.field2699.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field2691 = new DecoderContext(this.field2699, this.field2710);
                this.field2697 = new GranulePos();
                this.field2698 = new Frame(this.field2699.frameWidth, this.field2699.frameHeight);
                this.field2709 = this.field2691.getMaxPostProcessingLevel();
                this.method1241(-1, this.field2707);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            return;
        }
        this.field2716 = class375.method2193(116);
        int var3 = this.field2691.decodePacketIn(arg0, this.field2697);
        if (var3 < 0) {
            throw new IllegalStateException(String.valueOf(var3));
        }
        this.field2691.granuleFrame(this.field2697);
        this.field2696 = this.field2691.granuleTime(this.field2697);
        if (this.field2715) {
            boolean var4 = arg0.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field2715 = false;
        }
        if (!this.field2690 || arg0.isKeyFrame() == 1) {
            if (this.field2691.decodeFrame(this.field2698) != 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field2701 = true;
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2712[var0] = new Rectangle();
        }
    }
}
