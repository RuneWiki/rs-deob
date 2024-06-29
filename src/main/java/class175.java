import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class175 extends class448 {

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field3004 = new VorbisInfo();

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field3012 = new VorbisComment();

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "D")
    private double field3007;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lsfa;")
    private class122 field3010;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lgaa;")
    private class68 field3005;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field3008;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field3002;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)D")
    public final double method1374(int arg0) {
        if (arg0 != 1) {
            return 1.1790153783792217D;
        } else {
            ++field3003;
            double var2 = this.field3007;
            if (this.field3010 != null) {
                var2 = this.field3010.method958(arg0 + 74);
                if (var2 < 0.0D) {
                    var2 = this.field3007;
                }
            }
            return (double) (-(256.0F / (float) class608.field8585)) + var2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method1132(OggPacket arg0, byte arg1) {
        ++field3009;
        if (arg1 != -5) {
            this.field3005 = null;
        }
        if (super.field6534 < 3) {
            int var6 = this.field3004.headerIn(this.field3012, arg0);
            if (~var6 > -1) {
                throw new IllegalStateException(String.valueOf(var6));
            } else if (super.field6534 == 2) {
                if (~this.field3004.channels >= -3 && this.field3004.channels >= 1) {
                    this.field3008 = new DSPState(this.field3004);
                    this.field3002 = new VorbisBlock(this.field3008);
                    this.field3005 = new class68(this.field3004.rate, class608.field8585);
                    this.field3010 = new class122(this.field3004.channels);
                } else {
                    throw new RuntimeException(String.valueOf(this.field3004.channels));
                }
            }
        } else {
            if (this.field3002.synthesis(arg0) == 0) {
                this.field3008.blockIn(this.field3002);
            }
            float[][] var3 = this.field3008.pcmOut(this.field3004.channels);
            this.field3007 = this.field3008.granuleTime();
            if (this.field3007 == -1.0D) {
                this.field3007 = (double) ((float) this.field3013 / (float) this.field3004.rate);
            }
            this.field3008.read(var3[0].length);
            this.field3013 += var3[0].length;
            class699 var4 = this.field3010.method957(-12492, var3[0].length, this.field3007);
            class298.method1918(var3, var4.field9886, (byte) -78);
            for (int var5 = 0; ~var5 > ~this.field3004.channels; ++var5) {
                var4.field9886[var5] = this.field3005.method651(true, var4.field9886[var5]);
            }
            this.field3010.method959(0, var4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class175(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
    public static final void method1375(boolean arg0) {
        ++field3001;
        class263.field4079 = -1;
        if (arg0) {
            method1375(false);
        }
        class325.field4806 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)I")
    public final int method1376(boolean arg0) {
        ++field3011;
        if (!arg0) {
            return 109;
        } else {
            return this.field3010 == null ? 0 : this.field3010.method960(0);
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lsfa;")
    public final class122 method1377(int arg0) {
        ++field3006;
        int var2 = -41 / ((-56 - arg0) / 49);
        return this.field3010;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1134(int arg0) {
        if (this.field3002 != null) {
            this.field3002.method725();
        }
        if (arg0 >= -18) {
            this.field3008 = null;
        }
        ++field3000;
        if (this.field3008 != null) {
            this.field3008.method725();
        }
        this.field3012.method725();
        this.field3004.method725();
        if (this.field3010 != null) {
            this.field3010.method962(false);
        }
    }
}
