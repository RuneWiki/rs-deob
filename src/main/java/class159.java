import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class159 extends class518 {

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field2531 = new VorbisInfo();

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field2533 = new VorbisComment();

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "D")
    private double field2535;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "Lhm;")
    private class221 field2545;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "Llk;")
    private class589 field2540;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field2537;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field2539;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1164(OggPacket arg0, int arg1) {
        ++field2543;
        if (~super.field7394 > -4) {
            int var3 = this.field2531.headerIn(this.field2533, arg0);
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (super.field7394 == 2) {
                if (~this.field2531.channels < -3 || ~this.field2531.channels > -2) {
                    throw new RuntimeException(String.valueOf(this.field2531.channels));
                }
                this.field2537 = new DSPState(this.field2531);
                this.field2539 = new VorbisBlock(this.field2537);
                this.field2540 = new class589(this.field2531.rate, client.field4279);
                this.field2545 = new class221(this.field2531.channels);
            }
        } else {
            if (~this.field2539.synthesis(arg0) == -1) {
                this.field2537.blockIn(this.field2539);
            }
            float[][] var4 = this.field2537.pcmOut(this.field2531.channels);
            this.field2535 = this.field2537.granuleTime();
            if (this.field2535 == -1.0D) {
                this.field2535 = (double) ((float) this.field2538 / (float) this.field2531.rate);
            }
            this.field2537.read(var4[0].length);
            this.field2538 += var4[0].length;
            class425 var5 = this.field2545.method1493(false, this.field2535, var4[0].length);
            class510.method3027(var5.field6307, 0, var4);
            for (int var6 = 0; ~var6 > ~this.field2531.channels; ++var6) {
                var5.field6307[var6] = this.field2540.method3404((byte) -127, var5.field6307[var6]);
            }
            this.field2545.method1490(var5, arg1 ^ -107);
        }
        if (arg1 != 0) {
            this.method1166(true);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class159(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method1165(int arg0) {
        ++field2541;
        if (this.field2539 != null) {
            this.field2539.method4068();
        }
        int var2 = 95 / ((63 - arg0) / 49);
        if (this.field2537 != null) {
            this.field2537.method4068();
        }
        this.field2533.method4068();
        this.field2531.method4068();
        if (this.field2545 != null) {
            this.field2545.method1494(118);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)I")
    public final int method1166(boolean arg0) {
        if (!arg0) {
            this.method1169((byte) -125);
        }
        ++field2536;
        return this.field2545 == null ? 0 : this.field2545.method1495((byte) -18);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)D")
    public final double method1167(byte arg0) {
        if (arg0 >= -76) {
            this.field2545 = null;
        }
        ++field2532;
        double var2 = this.field2535;
        if (this.field2545 != null) {
            var2 = this.field2545.method1480(-1);
            if (var2 < 0.0D) {
                var2 = this.field2535;
            }
        }
        return (double) (-(256.0F / (float) client.field4279)) + var2;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILvd;I)Ljj;")
    public static final class120 method1168(int arg0, int arg1, class39 arg2, int arg3) {
        ++field2544;
        class645 var4 = new class645(arg2.method211(true, arg1, arg0));
        class120 var5 = new class120(arg0, var4.method3752(-2), var4.method3752(-2), var4.method3720(-19541), var4.method3720(-19541), var4.method3745(-6314) == 1, var4.method3745(-6314), var4.method3745(-6314));
        int var6 = var4.method3745(-6314);
        if (arg3 >= -5) {
            method1170(114, 33, 26, -71);
        }
        for (int var7 = 0; var6 > var7; ++var7) {
            var5.field1653.method1203(new class693(var4.method3745(-6314), var4.method3712((byte) -107), var4.method3712((byte) 126), var4.method3712((byte) -126), var4.method3712((byte) 123), var4.method3712((byte) -114), var4.method3712((byte) -3), var4.method3712((byte) 112), var4.method3712((byte) -123)), (byte) -124);
        }
        var5.method869(117);
        return var5;
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(B)Lhm;")
    public final class221 method1169(byte arg0) {
        if (arg0 != -79) {
            this.method1164((OggPacket) null, 68);
        }
        ++field2534;
        return this.field2545;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)I")
    public static final int method1170(int arg0, int arg1, int arg2, int arg3) {
        ++field2542;
        if (arg3 != 1) {
            return -66;
        } else if (arg0 == arg2) {
            return arg2;
        } else {
            int var4 = -arg1 + 128;
            int var5 = (127 & arg2) * var4 - -((127 & arg0) * arg1) >> 7;
            int var6 = (896 & arg0) * arg1 + (896 & arg2) * var4 >> 7;
            int var7 = (64512 & arg2) * var4 - -((arg0 & 64512) * arg1) >> 7;
            return 896 & var6 | 64512 & var7 | 127 & var5;
        }
    }
}
