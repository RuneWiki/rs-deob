import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class728 extends class111 {

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field9874 = new VorbisInfo();

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field9870 = new VorbisComment();

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "Ljb;")
    public static class519 field9880 = new class519(71, 2);

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "D")
    private double field9884;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    private int field9876;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field9887;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "Llt;")
    private class702 field9877;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "Lwo;")
    private class774 field9883;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field9885;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field9882;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
    public static int[] field9872;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 3)
    public final void method646(OggPacket arg0, byte arg1) {
        ++field9881;
        if (super.field1531 < 3) {
            int var3 = this.field9874.headerIn(this.field9870, arg0);
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (~super.field1531 == -3) {
                if (this.field9874.channels > 2 || this.field9874.channels < 1) {
                    throw new RuntimeException(String.valueOf(this.field9874.channels));
                }
                this.field9885 = new DSPState(this.field9874);
                this.field9882 = new VorbisBlock(this.field9885);
                this.field9877 = new class702(this.field9874.rate, class624.field8419);
                this.field9883 = new class774(this.field9874.channels);
            }
        } else {
            if (this.field9882.synthesis(arg0) == 0) {
                this.field9885.blockIn(this.field9882);
            }
            float[][] var4 = this.field9885.pcmOut(this.field9874.channels);
            this.field9884 = this.field9885.granuleTime();
            if (this.field9884 == -1.0D) {
                this.field9884 = (double) ((float) this.field9876 / (float) this.field9874.rate);
            }
            this.field9885.read(var4[0].length);
            this.field9876 += var4[0].length;
            class784 var5 = this.field9883.method4251((byte) 100, var4[0].length, this.field9884);
            class714.method3954(var5.field10786, (byte) 103, var4);
            for (int var6 = 0; this.field9874.channels > var6; ++var6) {
                var5.field10786[var6] = this.field9877.method3827(0, var5.field10786[var6]);
            }
            this.field9883.method4259(false, var5);
        }
        if (arg1 != -23) {
            this.method646((OggPacket) null, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 65)
    public static void method4023(int arg0) {
        if (arg0 >= -63) {
            field9880 = null;
        }
        field9872 = null;
        field9880 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I", line = 80)
    public final int method4024(boolean arg0) {
        ++field9879;
        if (!arg0) {
            this.field9877 = null;
        }
        return this.field9883 == null ? 0 : this.field9883.method4257(-620657048);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z", line = 92)
    public static final boolean method4025(int arg0, int arg1, int arg2) {
        ++field9887;
        if (arg0 > -41) {
            field9872 = null;
        }
        return (262144 & arg2) != 0 | class73.method596(arg1, arg2, (byte) -2) || class84.method680(arg1, arg2, (byte) -106);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLofa;Lha;)V", line = 105)
    public static final void method4026(boolean arg0, class347 arg1, class66 arg2) {
        ++field9873;
        if (!arg0) {
            field9886 = 114;
        }
        boolean var3 = class16.field156.method2132(arg1.field5014, arg1.field5028, arg1.field5038 | -16777216, (byte) 104, arg2, arg1.field4956, arg1.field4893, arg1.field4938 ? class625.field8475.field10355 : null) == null;
        if (var3) {
            class605.field8198.method689(new class245(arg1.field4956, arg1.field5028, arg1.field4893, -16777216 | arg1.field5038, arg1.field5014, arg1.field4938), 121);
            class151.method1062((byte) -108, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 133)
    public class728(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)D", line = 146)
    public final double method4027(int arg0) {
        if (arg0 > -30) {
            this.field9877 = null;
        }
        ++field9871;
        double var2 = this.field9884;
        if (this.field9883 != null) {
            var2 = this.field9883.method4253((byte) 87);
            if (var2 < 0.0D) {
                var2 = this.field9884;
            }
        }
        return (double) (-(256.0F / (float) class624.field8419)) + var2;
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)Lwo;", line = 168)
    public final class774 method4028(int arg0) {
        if (arg0 > -53) {
            this.field9885 = null;
        }
        ++field9878;
        return this.field9883;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 184)
    public final void method643(int arg0) {
        if (this.field9882 != null) {
            this.field9882.method4074();
        }
        ++field9875;
        if (this.field9885 != null) {
            this.field9885.method4074();
        }
        this.field9870.method4074();
        this.field9874.method4074();
        if (arg0 == -1) {
            if (this.field9883 != null) {
                this.field9883.method4262(arg0 ^ 16711935);
            }
        }
    }
}
