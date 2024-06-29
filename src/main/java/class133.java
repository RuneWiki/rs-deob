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

@OriginalClass("client!fv")
public class class133 extends class219 {

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field1659 = new SetupInfo();

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field1648 = new TheoraInfo();

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field1658 = new TheoraComment();

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "[C")
    public static char[] field1655 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
    public static int field1674 = 0;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "D")
    private double field1661;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "J")
    private long field1671;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "Ltf;")
    private class312 field1650;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field1664;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field1667;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field1662;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Z")
    private boolean field1654;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "Z")
    private boolean field1657;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "Z")
    private boolean field1669;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "Z")
    private boolean field1672;

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 4)
    public class133(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method984(int arg0) {
        field1668++;
        return arg0 == 0 ? this.field1657 : false;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V", line = 26)
    private final void method985(int arg0, int arg1) {
        if (arg0 != 56) {
            method988((byte) -109);
        }
        this.field1649 = arg1;
        field1666++;
        if (!this.field1657) {
            return;
        }
        if (this.field1649 > this.field1673) {
            this.field1649 = this.field1673;
        }
        if (this.field1649 < 0) {
            this.field1649 = 0;
        }
        this.field1664.setPostProcessingLevel(this.field1649);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 51)
    public final void method986(int arg0, OggPacket arg1) {
        if (arg0 != -1) {
            this.field1648 = null;
        }
        field1651++;
        if (!this.field1657) {
            int var3 = this.field1659.decodeHeader(this.field1648, this.field1658, arg1);
            if (var3 == 0) {
                this.field1657 = true;
                if (this.field1648.frameWidth <= 2048 && this.field1648.frameHeight <= 1024) {
                    this.field1664 = new DecoderContext(this.field1648, this.field1659);
                    this.field1662 = new GranulePos();
                    this.field1667 = new Frame(this.field1648.frameWidth, this.field1648.frameHeight);
                    this.field1673 = this.field1664.getMaxPostProcessingLevel();
                    this.method985(56, this.field1649);
                    return;
                }
                throw new IllegalStateException();
            }
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            return;
        }
        this.field1671 = class349.method2069(true);
        int var4 = this.field1664.decodePacketIn(arg1, this.field1662);
        if (var4 < 0) {
            throw new IllegalStateException(String.valueOf(var4));
        }
        this.field1664.granuleFrame(this.field1662);
        this.field1661 = this.field1664.granuleTime(this.field1662);
        if (this.field1669) {
            boolean var5 = arg1.isKeyFrame() == 1;
            if (!var5) {
                return;
            }
            this.field1669 = false;
        }
        if (!this.field1654 || arg1.isKeyFrame() == 1) {
            if (this.field1664.decodeFrame(this.field1667) != 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field1672 = true;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 126)
    public final void method987(int arg0) {
        if (this.field1667 != null) {
            this.field1667.method4164();
        }
        field1663++;
        if (this.field1664 != null) {
            this.field1664.method4164();
            this.field1664 = null;
        }
        if (this.field1662 != null) {
            this.field1662.method4164();
            this.field1662 = null;
        }
        this.field1648.method4164();
        this.field1658.method4164();
        this.field1659.method4164();
        if (arg0 != 0) {
            this.field1650 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V", line = 160)
    public static void method988(byte arg0) {
        if (arg0 >= 65) {
            field1655 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BJ)I", line = 174)
    public static final int method989(byte arg0, long arg1) {
        if (arg0 <= 77) {
            method988((byte) 120);
        }
        field1656++;
        return (int) (arg1 / 86400000L) - 11745;
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)F", line = 189)
    public final float method990(int arg0) {
        field1660++;
        if (this.field1657 && !this.field1648.method4165()) {
            int var2 = 71 % ((arg0 + 82) / 34);
            return (float) this.field1648.fpsNumerator / (float) this.field1648.fpsDenominator;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V", line = 209)
    public static final void method991(int arg0) {
        class459.method2778(-1, 255, 0);
        if (arg0 <= 71) {
            method991(-69);
        }
        field1670++;
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)D", line = 222)
    public final double method992(int arg0) {
        field1652++;
        if (arg0 != 29033) {
            this.field1667 = null;
        }
        return this.field1661;
    }

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)J", line = 241)
    public final long method993(int arg0) {
        field1653++;
        return arg0 == 100 ? this.field1671 : 91L;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lha;B)Ltf;", line = 257)
    public final class312 method994(class66 arg0, byte arg1) {
        field1665++;
        if (this.field1667 == null) {
            return null;
        } else if (this.field1672 || this.field1650 == null) {
            this.field1650 = arg0.method652(this.field1667.pixels, 0, this.field1667.field10321, this.field1667.field10321, this.field1667.field10320, false);
            int var3 = 119 / ((-arg1 - 3) / 46);
            this.field1672 = false;
            return this.field1650;
        } else {
            return this.field1650;
        }
    }
}
