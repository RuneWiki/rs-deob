import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class352 extends class370 {

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field4955 = new VorbisInfo();

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field4937 = new VorbisComment();

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field4941 = -1;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lhda;")
    public static class752 field4947 = new class752(108, 6);

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
    public static int[] field4953 = new int[3];

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "D")
    private double field4948;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "F")
    public static float field4952;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Ltf;")
    private class298 field4943;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Lwu;")
    public static class376 field4951;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Luw;")
    private class421 field4939;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field4946;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field4950;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Z", line = 5)
    public static final boolean method2105(int arg0, int arg1, byte arg2) {
        if (arg2 < 75) {
            return true;
        } else {
            ++field4949;
            return ~(arg1 & 384) != -1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)D", line = 17)
    public final double method2106(int arg0) {
        ++field4942;
        if (arg0 != 3) {
            this.method2108((byte) 14);
        }
        double var2 = this.field4948;
        if (this.field4939 != null) {
            var2 = this.field4939.method2439(false);
            if (var2 < 0.0D) {
                var2 = this.field4948;
            }
        }
        return var2 - (double) (256.0F / (float) class405.field5646);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILee;)Lab;", line = 40)
    public static final class670 method2107(int arg0, class677 arg1) {
        ++field4954;
        return arg0 > -118 ? null : new class670(arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3833(255), arg1.method3833(255), arg1.method3821((byte) -114));
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 53)
    public final void method1225(OggPacket arg0, boolean arg1) {
        ++field4940;
        if (~super.field5162 > -4) {
            int var3 = this.field4955.headerIn(this.field4937, arg0);
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (~super.field5162 == -3) {
                if (~this.field4955.channels < -3 || this.field4955.channels < 1) {
                    throw new RuntimeException(String.valueOf(this.field4955.channels));
                }
                this.field4946 = new DSPState(this.field4955);
                this.field4950 = new VorbisBlock(this.field4946);
                this.field4943 = new class298(this.field4955.rate, class405.field5646);
                this.field4939 = new class421(this.field4955.channels);
            }
        } else {
            if (this.field4950.synthesis(arg0) == 0) {
                this.field4946.blockIn(this.field4950);
            }
            float[][] var4 = this.field4946.pcmOut(this.field4955.channels);
            this.field4948 = this.field4946.granuleTime();
            if (this.field4948 == -1.0D) {
                this.field4948 = (double) ((float) this.field4945 / (float) this.field4955.rate);
            }
            this.field4946.read(var4[0].length);
            this.field4945 += var4[0].length;
            class596 var5 = this.field4939.method2445(var4[0].length, this.field4948, (byte) 113);
            class265.method1602((byte) -110, var4, var5.field7754);
            for (int var6 = 0; var6 < this.field4955.channels; ++var6) {
                var5.field7754[var6] = this.field4943.method1833(var5.field7754[var6], -109);
            }
            this.field4939.method2444((byte) 90, var5);
        }
        if (arg1) {
            this.method2109((byte) -33);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)I", line = 118)
    public final int method2108(byte arg0) {
        ++field4938;
        int var2 = -72 / ((-35 - arg0) / 50);
        return this.field4939 == null ? 0 : this.field4939.method2437(-101);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 135)
    public final void method1226(byte arg0) {
        ++field4944;
        if (this.field4950 != null) {
            this.field4950.method4006();
        }
        if (this.field4946 != null) {
            this.field4946.method4006();
        }
        this.field4937.method4006();
        this.field4955.method4006();
        if (arg0 >= -81) {
            this.field4937 = null;
        }
        if (this.field4939 != null) {
            this.field4939.method2446((byte) 120);
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Luw;", line = 158)
    public final class421 method2109(byte arg0) {
        if (arg0 != 81) {
            method2110(-36);
        }
        ++field4936;
        return this.field4939;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 173)
    public static void method2110(int arg0) {
        field4951 = null;
        field4953 = null;
        field4947 = null;
        if (arg0 != -26000) {
            field4953 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 187)
    public class352(OggStreamState arg0) {
        super(arg0);
    }
}
