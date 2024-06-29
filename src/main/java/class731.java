import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class731 extends class728 {

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field10117 = new VorbisInfo();

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field10115 = new VorbisComment();

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "D")
    private double field10125;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
    public static int field10120;

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!waa", name = "y", descriptor = "I")
    private int field10122;

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "I")
    public static int field10124;

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!waa", name = "G", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
    public static int field10130;

    @OriginalMember(owner = "client!waa", name = "I", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!waa", name = "F", descriptor = "Lb;")
    private class352 field10128;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "Lhn;")
    private class751 field10123;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field10126;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field10118;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)Lb;", line = 3)
    public final class352 method4087(boolean arg0) {
        if (!arg0) {
            method4089(-61);
        }
        ++field10121;
        return this.field10128;
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(B)I", line = 17)
    public final int method4088(byte arg0) {
        ++field10131;
        if (arg0 >= -101) {
            return 88;
        } else {
            return this.field10128 == null ? 0 : this.field10128.method2236(true);
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V", line = 32)
    public static final void method4089(int arg0) {
        int var1 = -58 % ((-27 - arg0) / 42);
        class780.method4289(98);
        ++field10116;
        class265.method1722(16033);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 44)
    public static final String method4090(int arg0, String arg1) {
        ++field10129;
        if (arg0 != -5633) {
            return null;
        } else if (!class621.field8734.startsWith("win")) {
            if (class621.field8734.startsWith("linux")) {
                return "lib" + arg1 + ".so";
            } else {
                return class621.field8734.startsWith("mac") ? "lib" + arg1 + ".dylib" : null;
            }
        } else {
            return arg1 + ".dll";
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 68)
    public final void method1417(OggPacket arg0, int arg1) {
        ++field10130;
        int var3 = 112 / ((arg1 - 34) / 54);
        if (~super.field10052 > -4) {
            int var7 = this.field10117.headerIn(this.field10115, arg0);
            if (var7 < 0) {
                throw new IllegalStateException(String.valueOf(var7));
            } else if (~super.field10052 == -3) {
                if (this.field10117.channels <= 2 && this.field10117.channels >= 1) {
                    this.field10126 = new DSPState(this.field10117);
                    this.field10118 = new VorbisBlock(this.field10126);
                    this.field10123 = new class751(this.field10117.rate, class114.field1746);
                    this.field10128 = new class352(this.field10117.channels);
                } else {
                    throw new RuntimeException(String.valueOf(this.field10117.channels));
                }
            }
        } else {
            if (~this.field10118.synthesis(arg0) == -1) {
                this.field10126.blockIn(this.field10118);
            }
            float[][] var4 = this.field10126.pcmOut(this.field10117.channels);
            this.field10125 = this.field10126.granuleTime();
            if (this.field10125 == -1.0D) {
                this.field10125 = (double) ((float) this.field10122 / (float) this.field10117.rate);
            }
            this.field10126.read(var4[0].length);
            this.field10122 += var4[0].length;
            class155 var5 = this.field10128.method2229(var4[0].length, -14805, this.field10125);
            class659.method3762(var5.field2194, var4, true);
            for (int var6 = 0; ~this.field10117.channels < ~var6; ++var6) {
                var5.field2194[var6] = this.field10123.method4179(var5.field2194[var6], -89);
            }
            this.field10128.method2225(var5, 108);
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 133)
    public class731(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 142)
    public static final void method4091(int arg0, boolean arg1, String arg2) {
        if (arg0 >= -51) {
            method4090(4, (String) null);
        }
        class744.method4147(-1, arg2, arg1, -1, -31280);
        ++field10119;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)D", line = 161)
    public final double method4092(int arg0) {
        ++field10127;
        double var2 = this.field10125;
        if (this.field10128 != null) {
            var2 = this.field10128.method2230(true);
            if (var2 < 0.0D) {
                var2 = this.field10125;
            }
        }
        if (arg0 != 0) {
            this.method4087(true);
        }
        return var2 - (double) (256.0F / (float) class114.field1746);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 184)
    public final void method1416(int arg0) {
        if (this.field10118 != null) {
            this.field10118.method4129();
        }
        ++field10124;
        if (this.field10126 != null) {
            this.field10126.method4129();
        }
        this.field10115.method4129();
        this.field10117.method4129();
        if (arg0 != -12054) {
            this.field10115 = null;
        }
        if (this.field10128 != null) {
            this.field10128.method2234(true);
        }
    }
}
