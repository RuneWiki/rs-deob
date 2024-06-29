import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class125 extends class137 {

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field2139 = new VorbisInfo();

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field2145 = new VorbisComment();

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "Lin;")
    public static class380 field2143 = new class380(75, 2);

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[I")
    public static int[] field2148 = new int[2048];

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field2147 = 0;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "D")
    private double field2134;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Lou;")
    private class292 field2142;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Lfr;")
    private class330 field2135;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field2133;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field2136;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I", line = 4)
    public final int method1079(boolean arg0) {
        if (!arg0) {
            method1081(111, 124, -117);
        }
        ++field2144;
        return this.field2135 == null ? 0 : this.field2135.method2011((byte) -82);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 15)
    public final void method1080(OggPacket arg0, int arg1) {
        ++field2146;
        if (~super.field2273 <= -4) {
            if (this.field2136.synthesis(arg0) == 0) {
                this.field2133.blockIn(this.field2136);
            }
            float[][] var3 = this.field2133.pcmOut(this.field2139.channels);
            this.field2134 = this.field2133.granuleTime();
            if (this.field2134 == -1.0D) {
                this.field2134 = (double) ((float) this.field2138 / (float) this.field2139.rate);
            }
            this.field2133.read(var3[0].length);
            this.field2138 += var3[0].length;
            class231 var4 = this.field2135.method2016(this.field2134, var3[0].length, 1784986752);
            class594.method3472(-112, var4.field3378, var3);
            for (int var5 = 0; ~var5 > ~this.field2139.channels; ++var5) {
                var4.field3378[var5] = this.field2142.method1852(-42, var4.field3378[var5]);
            }
            this.field2135.method2017(var4, (byte) 68);
        } else {
            int var6 = this.field2139.headerIn(this.field2145, arg0);
            if (~var6 > -1) {
                throw new IllegalStateException(String.valueOf(var6));
            }
            if (~super.field2273 == -3) {
                if (this.field2139.channels > 2 || this.field2139.channels < 1) {
                    throw new RuntimeException(String.valueOf(this.field2139.channels));
                }
                this.field2133 = new DSPState(this.field2139);
                this.field2136 = new VorbisBlock(this.field2133);
                this.field2142 = new class292(this.field2139.rate, class702.field9843);
                this.field2135 = new class330(this.field2139.channels);
            }
        }
        int var7 = 47 / ((arg1 - -48) / 43);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)I", line = 80)
    public static final int method1081(int arg0, int arg1, int arg2) {
        ++field2137;
        int var3 = arg2;
        while (arg0 > 0) {
            var3 = var3 << 1 | 1 & arg1;
            arg1 >>>= 1;
            --arg0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)D", line = 99)
    public final double method1082(int arg0) {
        if (arg0 != 0) {
            this.method1080((OggPacket) null, 21);
        }
        ++field2141;
        double var2 = this.field2134;
        if (this.field2135 != null) {
            var2 = this.field2135.method2013(-99);
            if (var2 < 0.0D) {
                var2 = this.field2134;
            }
        }
        return (double) (-(256.0F / (float) class702.field9843)) + var2;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 129)
    public class125(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V", line = 140)
    public static void method1083(int arg0) {
        field2143 = null;
        field2148 = null;
        if (arg0 <= 58) {
            field2143 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Lfr;", line = 160)
    public final class330 method1084(byte arg0) {
        int var2 = -66 / ((-55 - arg0) / 62);
        ++field2140;
        return this.field2135;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 172)
    public final void method1085(int arg0) {
        if (this.field2136 != null) {
            this.field2136.method1199();
        }
        ++field2149;
        if (this.field2133 != null) {
            this.field2133.method1199();
        }
        this.field2145.method1199();
        this.field2139.method1199();
        if (this.field2135 != null) {
            this.field2135.method2012(108);
        }
        if (arg0 != 0) {
            this.field2139 = null;
        }
    }
}
