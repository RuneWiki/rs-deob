import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class28 extends class434 {

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field271 = new VorbisInfo();

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field274 = new VorbisComment();

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Lhr;")
    public static class57 field260 = new class57(6, 1);

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "D")
    private double field264;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "Lpm;")
    private class236 field273;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Let;")
    private class415 field269;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field272;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field268;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I")
    public final int method137(byte arg0) {
        if (arg0 <= 42) {
            return -43;
        } else {
            ++field259;
            return this.field273 != null ? this.field273.method1645((byte) 49) : 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (this.field268 != null) {
            this.field268.method675();
        }
        ++field267;
        if (this.field272 != null) {
            this.field272.method675();
        }
        if (arg0 != 0) {
            this.method140((byte) 16);
        }
        this.field274.method675();
        this.field271.method675();
        if (this.field273 != null) {
            this.field273.method1647(true);
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)D")
    public final double method139(int arg0) {
        ++field270;
        if (arg0 <= 13) {
            return 2.3284823025212407D;
        } else {
            double var2 = this.field264;
            if (this.field273 != null) {
                var2 = this.field273.method1651((byte) -89);
                if (var2 < 0.0D) {
                    var2 = this.field264;
                }
            }
            return (double) (-(256.0F / (float) class132.field1821)) + var2;
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)Lpm;")
    public final class236 method140(byte arg0) {
        ++field263;
        if (arg0 <= 89) {
            this.method143((OggPacket) null, true);
        }
        return this.field273;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class28(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;III)Lha;")
    public static final class543 method141(Canvas arg0, class267 arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -38) {
            method141((Canvas) null, (class267) null, 39, 34, 37);
        }
        ++field261;
        return new class203(arg0, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V")
    public static void method142(int arg0) {
        field260 = null;
        if (arg0 < 56) {
            method142(76);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method143(OggPacket arg0, boolean arg1) {
        ++field262;
        if (arg1) {
            if (~super.field6217 > -4) {
                int var3 = this.field271.headerIn(this.field274, arg0);
                if (var3 < 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                if (~super.field6217 == -3) {
                    if (~this.field271.channels >= -3 && ~this.field271.channels <= -2) {
                        this.field272 = new DSPState(this.field271);
                        this.field268 = new VorbisBlock(this.field272);
                        this.field269 = new class415(this.field271.rate, class132.field1821);
                        this.field273 = new class236(this.field271.channels);
                        return;
                    }
                    throw new RuntimeException(String.valueOf(this.field271.channels));
                }
            } else {
                if (~this.field268.synthesis(arg0) == -1) {
                    this.field272.blockIn(this.field268);
                }
                float[][] var4 = this.field272.pcmOut(this.field271.channels);
                this.field264 = this.field272.granuleTime();
                if (this.field264 == -1.0D) {
                    this.field264 = (double) ((float) this.field266 / (float) this.field271.rate);
                }
                this.field272.read(var4[0].length);
                this.field266 += var4[0].length;
                class519 var5 = this.field273.method1643((byte) -78, this.field264, var4[0].length);
                class425.method2645(var5.field7478, (byte) -87, var4);
                for (int var6 = 0; this.field271.channels > var6; ++var6) {
                    var5.field7478[var6] = this.field269.method2506(30130, var5.field7478[var6]);
                }
                this.field273.method1644(var5, 22917);
            }
        }
    }
}
