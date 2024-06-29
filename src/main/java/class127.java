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

@OriginalClass("client!uc")
public class class127 extends class619 {

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field1769 = new SetupInfo();

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field1750 = new TheoraInfo();

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field1755 = new TheoraComment();

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "Lst;")
    public static class335 field1765 = new class335(41, 4);

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "D")
    private double field1764;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "J")
    private long field1770;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lfd;")
    private class298 field1756;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field1751;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field1767;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field1771;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
    private boolean field1749;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Z")
    private boolean field1759;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Z")
    private boolean field1761;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Z")
    private boolean field1763;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method796(byte arg0) {
        field1757++;
        return arg0 == 28 ? this.field1761 : true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILha;)Lfd;", line = 17)
    public final class298 method797(int arg0, class548 arg1) {
        field1773++;
        if (this.field1767 == null) {
            return null;
        } else if (!this.field1749 && this.field1756 != null) {
            return this.field1756;
        } else if (arg0 == -19381) {
            this.field1756 = arg1.method1549(this.field1767.pixels, 0, this.field1767.field1219, this.field1767.field1219, this.field1767.field1218, false);
            this.field1749 = false;
            return this.field1756;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 41)
    public class127(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)F", line = 51)
    public final float method798(int arg0) {
        if (arg0 < 4) {
            this.method800(123);
        }
        field1768++;
        return this.field1761 && !this.field1750.method601() ? (float) this.field1750.fpsNumerator / (float) this.field1750.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 71)
    public final void method799(OggPacket arg0, int arg1) {
        field1754++;
        if (arg1 != 16) {
            this.method801((byte) 1);
        }
        if (!this.field1761) {
            int var3 = this.field1769.decodeHeader(this.field1750, this.field1755, arg0);
            if (var3 == 0) {
                this.field1761 = true;
                if (this.field1750.frameWidth <= 2048 && this.field1750.frameHeight <= 1024) {
                    this.field1751 = new DecoderContext(this.field1750, this.field1769);
                    this.field1771 = new GranulePos();
                    this.field1767 = new Frame(this.field1750.frameWidth, this.field1750.frameHeight);
                    this.field1774 = this.field1751.getMaxPostProcessingLevel();
                    this.method805(-125, this.field1766);
                    return;
                }
                throw new IllegalStateException();
            }
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            return;
        }
        this.field1770 = class97.method664((byte) -50);
        int var4 = this.field1751.decodePacketIn(arg0, this.field1771);
        if (var4 < 0) {
            throw new IllegalStateException(String.valueOf(var4));
        }
        this.field1751.granuleFrame(this.field1771);
        this.field1764 = this.field1751.granuleTime(this.field1771);
        if (this.field1763) {
            boolean var5 = arg0.isKeyFrame() == 1;
            if (!var5) {
                return;
            }
            this.field1763 = false;
        }
        if (!this.field1759 || arg0.isKeyFrame() == 1) {
            if (this.field1751.decodeFrame(this.field1767) != 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field1749 = true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)J", line = 145)
    public final long method800(int arg0) {
        if (arg0 != 0) {
            this.method800(-49);
        }
        field1772++;
        return this.field1770;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)D", line = 159)
    public final double method801(byte arg0) {
        field1753++;
        return arg0 == -82 ? this.field1764 : -0.9730244621839018D;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V", line = 170)
    public static void method802(byte arg0) {
        int var1 = 107 / ((arg0 - 5) / 38);
        field1765 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Z", line = 184)
    public static final boolean method803(int arg0, byte arg1) {
        field1760++;
        if (arg1 <= 74) {
            field1765 = null;
        }
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 202)
    public final void method804(byte arg0) {
        if (this.field1767 != null) {
            this.field1767.method602();
        }
        field1758++;
        if (arg0 <= 81) {
            return;
        }
        if (this.field1751 != null) {
            this.field1751.method602();
            this.field1751 = null;
        }
        if (this.field1771 != null) {
            this.field1771.method602();
            this.field1771 = null;
        }
        this.field1750.method602();
        this.field1755.method602();
        this.field1769.method602();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V", line = 238)
    private final void method805(int arg0, int arg1) {
        field1762++;
        if (arg0 > -118) {
            return;
        }
        this.field1766 = arg1;
        if (!this.field1761) {
            return;
        }
        if (this.field1774 < this.field1766) {
            this.field1766 = this.field1774;
        }
        if (this.field1766 < 0) {
            this.field1766 = 0;
        }
        this.field1751.setPostProcessingLevel(this.field1766);
    }
}
