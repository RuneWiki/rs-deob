import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class262 extends class206 {

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field3774 = new VorbisInfo();

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field3778 = new VorbisComment();

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "D")
    private double field3769;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    private int field3780;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "Lbia;")
    private class498 field3773;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "Ltv;")
    private class560 field3783;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field3772;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field3784;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V", line = 10)
    public static final void method1713(int arg0) {
        class557.field7812.method2755(249682952, 1, class557.field7812.field6543);
        ++field3775;
        class557.field7812.method2755(249682952, 1, class557.field7812.field6532);
        class557.field7812.method2755(arg0 ^ 249682953, 2, class557.field7812.field6507);
        class557.field7812.method2755(arg0 ^ 249682953, 2, class557.field7812.field6509);
        class557.field7812.method2755(249682952, arg0, class557.field7812.field6528);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6546);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6511);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6512);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6525);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6522);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6542);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6548);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6520);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6557);
        class557.field7812.method2755(arg0 + 249682951, 0, class557.field7812.field6537);
        class557.field7812.method2755(arg0 + 249682951, 0, class557.field7812.field6553);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6516);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6514);
        class557.field7812.method2755(249682952, 0, class557.field7812.field6524);
        class203.method1234(-107);
        class557.field7812.method2755(249682952, 1, class557.field7812.field6552);
        class557.field7812.method2755(249682952, 3, class557.field7812.field6508);
        class43.method289((byte) -120);
        class661.method3626(16711680);
        class64.field792 = true;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V", line = 44)
    public final void method584(int arg0) {
        if (this.field3784 != null) {
            this.field3784.method4009();
        }
        ++field3776;
        if (this.field3772 != null) {
            this.field3772.method4009();
        }
        this.field3778.method4009();
        if (arg0 > -8) {
            this.field3773 = null;
        }
        this.field3774.method4009();
        if (this.field3783 != null) {
            this.field3783.method3231(true);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 67)
    public final void method579(int arg0, OggPacket arg1) {
        ++field3777;
        if (super.field2715 >= 3) {
            if (~this.field3784.synthesis(arg1) == -1) {
                this.field3772.blockIn(this.field3784);
            }
            float[][] var3 = this.field3772.pcmOut(this.field3774.channels);
            this.field3769 = this.field3772.granuleTime();
            if (this.field3769 == -1.0D) {
                this.field3769 = (double) ((float) this.field3780 / (float) this.field3774.rate);
            }
            this.field3772.read(var3[0].length);
            this.field3780 += var3[0].length;
            class713 var4 = this.field3783.method3228(var3[0].length, (byte) 26, this.field3769);
            class523.method3062(var3, 0, var4.field9912);
            for (int var5 = 0; ~this.field3774.channels < ~var5; ++var5) {
                var4.field9912[var5] = this.field3773.method2969(-1554766238, var4.field9912[var5]);
            }
            this.field3783.method3223(-101, var4);
        } else {
            int var6 = this.field3774.headerIn(this.field3778, arg1);
            if (var6 < 0) {
                throw new IllegalStateException(String.valueOf(var6));
            }
            if (super.field2715 == 2) {
                if (this.field3774.channels > 2 || this.field3774.channels < 1) {
                    throw new RuntimeException(String.valueOf(this.field3774.channels));
                }
                this.field3772 = new DSPState(this.field3774);
                this.field3784 = new VorbisBlock(this.field3772);
                this.field3773 = new class498(this.field3774.rate, class68.field831);
                this.field3783 = new class560(this.field3774.channels);
            }
        }
        if (arg0 != -19767) {
            this.field3769 = 0.22709322488438116D;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "([BZ)[B", line = 137)
    public static final byte[] method1714(byte[] arg0, boolean arg1) {
        if (!arg1) {
            method1713(-15);
        }
        ++field3771;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class255.method1690(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 154)
    public class262(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)I", line = 163)
    public final int method1715(int arg0) {
        ++field3782;
        int var2 = 2 / ((arg0 - -46) / 32);
        return this.field3783 != null ? this.field3783.method3225((byte) 98) : 0;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(Z)D", line = 173)
    public final double method1716(boolean arg0) {
        ++field3781;
        double var2 = this.field3769;
        if (this.field3783 != null) {
            var2 = this.field3783.method3224(0);
            if (var2 < 0.0D) {
                var2 = this.field3769;
            }
        }
        if (arg0) {
            this.field3784 = null;
        }
        return var2 - (double) (256.0F / (float) class68.field831);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZ)V", line = 195)
    public static final void method1717(int arg0, boolean arg1) {
        ++field3770;
        if (class404.field5716 != arg0) {
            class336.field4683 = class700.field9768 = class462.field6500[arg0];
            class147.method1018(-121);
            class745.field10350 = new int[4][class336.field4683 >> 3][class700.field9768 >> 3];
            class115.field1388 = new int[class336.field4683][class700.field9768];
            class662.field9064 = new int[class336.field4683][class700.field9768];
            if (!arg1) {
                for (int var2 = 0; var2 < 4; ++var2) {
                    class147.field2114[var2] = class412.method2535(class336.field4683, class700.field9768, (byte) 68);
                }
                class741.field10305 = new byte[4][class336.field4683][class700.field9768];
                class297.method1924(-5967, class336.field4683, 4, class700.field9768);
                class243.method1553(class700.field9768 >> 3, -91, class268.field3831, class336.field4683 >> 3);
                class404.field5716 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)Ltv;", line = 224)
    public final class560 method1718(byte arg0) {
        if (arg0 != 87) {
            return null;
        } else {
            ++field3779;
            return this.field3783;
        }
    }
}
