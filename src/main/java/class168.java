import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class168 extends class719 {

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field2301 = new VorbisInfo();

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field2296 = new VorbisComment();

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "[Luea;")
    public static class243[] field2295 = new class243[75];

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "D")
    private double field2291;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "Lvp;")
    private class560 field2297;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "Lmd;")
    private class624 field2290;

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field2299;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field2292;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I", line = 5)
    public final int method1061(int arg0) {
        int var2 = 73 / ((-7 - arg0) / 41);
        ++field2298;
        return this.field2297 != null ? this.field2297.method3350((byte) -105) : 0;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 17)
    public class168(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)D", line = 26)
    public final double method1062(int arg0) {
        ++field2294;
        double var2 = this.field2291;
        if (arg0 != 0) {
            this.field2288 = -128;
        }
        if (this.field2297 != null) {
            var2 = this.field2297.method3355(29733);
            if (var2 < 0.0D) {
                var2 = this.field2291;
            }
        }
        return var2 - (double) (256.0F / (float) class757.field10509);
    }

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)V", line = 47)
    public static void method1063(int arg0) {
        field2295 = null;
        if (arg0 != 0) {
            field2295 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)Lvp;", line = 57)
    public final class560 method1064(byte arg0) {
        ++field2300;
        return arg0 != -41 ? null : this.field2297;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 68)
    public final void method938(OggPacket arg0, byte arg1) {
        if (arg1 != -63) {
            this.field2299 = null;
        }
        ++field2293;
        if (super.field10155 < 3) {
            int var6 = this.field2301.headerIn(this.field2296, arg0);
            if (~var6 > -1) {
                throw new IllegalStateException(String.valueOf(var6));
            } else if (super.field10155 == 2) {
                if (~this.field2301.channels >= -3 && this.field2301.channels >= 1) {
                    this.field2299 = new DSPState(this.field2301);
                    this.field2292 = new VorbisBlock(this.field2299);
                    this.field2290 = new class624(this.field2301.rate, class757.field10509);
                    this.field2297 = new class560(this.field2301.channels);
                } else {
                    throw new RuntimeException(String.valueOf(this.field2301.channels));
                }
            }
        } else {
            if (this.field2292.synthesis(arg0) == 0) {
                this.field2299.blockIn(this.field2292);
            }
            float[][] var3 = this.field2299.pcmOut(this.field2301.channels);
            this.field2291 = this.field2299.granuleTime();
            if (this.field2291 == -1.0D) {
                this.field2291 = (double) ((float) this.field2288 / (float) this.field2301.rate);
            }
            this.field2299.read(var3[0].length);
            this.field2288 += var3[0].length;
            class16 var4 = this.field2297.method3351(this.field2291, var3[0].length, -661362368);
            class700.method3951(var4.field208, (byte) -105, var3);
            for (int var5 = 0; ~this.field2301.channels < ~var5; ++var5) {
                var4.field208[var5] = this.field2290.method3650(-106, var4.field208[var5]);
            }
            this.field2297.method3356(var4, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 138)
    public final void method940(int arg0) {
        ++field2289;
        if (this.field2292 != null) {
            this.field2292.method519();
        }
        if (this.field2299 != null) {
            this.field2299.method519();
        }
        if (arg0 >= 32) {
            this.field2296.method519();
            this.field2301.method519();
            if (this.field2297 != null) {
                this.field2297.method3357((byte) -54);
            }
        }
    }
}
