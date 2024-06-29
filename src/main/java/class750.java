import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class750 extends class619 {

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field10315 = new VorbisInfo();

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field10319 = new VorbisComment();

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "Lkr;")
    public static class602 field10310 = new class602(72, 0);

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
    public static int field10314 = 0;

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "D")
    private double field10324;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
    private int field10312;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "Lfea;")
    private class463 field10308;

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "Lln;")
    private class476 field10320;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field10322;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field10317;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)I", line = 3)
    public final int method4164(byte arg0) {
        if (arg0 >= -80) {
            this.method804((byte) -91);
        }
        ++field10311;
        return this.field10308 == null ? 0 : this.field10308.method2842((byte) 61);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)D", line = 17)
    public final double method4165(int arg0) {
        ++field10313;
        double var2 = this.field10324;
        if (this.field10308 != null) {
            var2 = this.field10308.method2833(false);
            if (var2 < 0.0D) {
                var2 = this.field10324;
            }
        }
        return arg0 != 0 ? -0.10232909864209967D : (double) (-(256.0F / (float) class718.field9998)) + var2;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V", line = 42)
    public static void method4166(int arg0) {
        field10310 = null;
        if (arg0 != 0) {
            field10323 = 61;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 63)
    public final void method799(OggPacket arg0, int arg1) {
        ++field10318;
        if (super.field8306 >= 3) {
            if (~this.field10317.synthesis(arg0) == -1) {
                this.field10322.blockIn(this.field10317);
            }
            float[][] var3 = this.field10322.pcmOut(this.field10315.channels);
            this.field10324 = this.field10322.granuleTime();
            if (this.field10324 == -1.0D) {
                this.field10324 = (double) ((float) this.field10312 / (float) this.field10315.rate);
            }
            this.field10322.read(var3[0].length);
            this.field10312 += var3[0].length;
            class506 var4 = this.field10308.method2834(var3[0].length, this.field10324, (byte) 64);
            class54.method402(var4.field7036, false, var3);
            for (int var5 = 0; this.field10315.channels > var5; ++var5) {
                var4.field7036[var5] = this.field10320.method2898((byte) 111, var4.field7036[var5]);
            }
            this.field10308.method2840(var4, (byte) 81);
        } else {
            int var6 = this.field10315.headerIn(this.field10319, arg0);
            if (var6 < 0) {
                throw new IllegalStateException(String.valueOf(var6));
            }
            if (super.field8306 == 2) {
                if (this.field10315.channels > 2 || ~this.field10315.channels > -2) {
                    throw new RuntimeException(String.valueOf(this.field10315.channels));
                }
                this.field10322 = new DSPState(this.field10315);
                this.field10317 = new VorbisBlock(this.field10322);
                this.field10320 = new class476(this.field10315.rate, class718.field9998);
                this.field10308 = new class463(this.field10315.channels);
            }
        }
        if (arg1 != 16) {
            this.method4164((byte) -104);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 133)
    public final void method804(byte arg0) {
        if (this.field10317 != null) {
            this.field10317.method602();
        }
        ++field10321;
        if (this.field10322 != null) {
            this.field10322.method602();
        }
        this.field10319.method602();
        this.field10315.method602();
        if (arg0 <= 81) {
            this.method799((OggPacket) null, -119);
        }
        if (this.field10308 != null) {
            this.field10308.method2835((byte) 106);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)I", line = 156)
    public static final int method4167(int arg0, int arg1, int arg2) {
        ++field10309;
        int var3 = arg1;
        while (arg0 > 0) {
            var3 = arg2 & 1 | var3 << 1;
            --arg0;
            arg2 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(B)Lfea;", line = 176)
    public final class463 method4168(byte arg0) {
        ++field10316;
        int var2 = 90 % ((arg0 - -65) / 47);
        return this.field10308;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 187)
    public class750(OggStreamState arg0) {
        super(arg0);
    }
}
