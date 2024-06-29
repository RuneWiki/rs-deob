import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class122 extends class12 {

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field1271 = new VorbisInfo();

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field1281 = new VorbisComment();

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field1266 = -2;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "D")
    private double field1280;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Lhe;")
    private class370 field1283;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lgfa;")
    private class748 field1273;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field1277;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field1269;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)I")
    public final int method781(int arg0) {
        ++field1274;
        if (arg0 != -5313) {
            method782(-24);
        }
        return this.field1283 == null ? 0 : this.field1283.method2158(arg0 + 5312);
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)[Lso;")
    public static final class468[] method782(int arg0) {
        ++field1272;
        if (arg0 != 0) {
            field1278 = -128;
        }
        return new class468[] { class457.field6547, class743.field10377, class486.field6970, class339.field4365, class602.field8569, class685.field9682, class592.field8343, class38.field430, class92.field948, class237.field2824, class3.field26, class28.field308, class11.field84, class496.field7010 };
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILig;Ljava/lang/String;)I")
    public static final int method783(int arg0, class244 arg1, String arg2) {
        ++field1284;
        int var3 = arg1.field2903;
        byte[] var4 = class526.method3082((byte) -102, arg2);
        arg1.method1436(arg0, var4.length);
        arg1.field2903 += class293.field3609.method2819(-33, arg1.field2912, var4, arg1.field2903, 0, var4.length);
        return -var3 + arg1.field2903;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class122(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)D")
    public final double method784(byte arg0) {
        ++field1275;
        double var2 = this.field1280;
        if (this.field1283 != null) {
            var2 = this.field1283.method2150(false);
            if (var2 < 0.0D) {
                var2 = this.field1280;
            }
        }
        if (arg0 != 49) {
            this.field1279 = -33;
        }
        return var2 - (double) (256.0F / (float) class277.field3387);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)Lhe;")
    public final class370 method785(byte arg0) {
        if (arg0 != -86) {
            return null;
        } else {
            ++field1268;
            return this.field1283;
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (this.field1269 != null) {
            this.field1269.method3981();
        }
        ++field1265;
        if (this.field1277 != null) {
            this.field1277.method3981();
        }
        this.field1281.method3981();
        if (arg0 == 3376) {
            this.field1271.method3981();
            if (this.field1283 != null) {
                this.field1283.method2151(122);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static final void method786(boolean arg0) {
        if (!arg0) {
            class181.field2142.method3549(0);
            ++field1270;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method55(OggPacket arg0, int arg1) {
        ++field1282;
        if (super.field95 >= 3) {
            if (this.field1269.synthesis(arg0) == 0) {
                this.field1277.blockIn(this.field1269);
            }
            float[][] var3 = this.field1277.pcmOut(this.field1271.channels);
            this.field1280 = this.field1277.granuleTime();
            if (this.field1280 == -1.0D) {
                this.field1280 = (double) ((float) this.field1279 / (float) this.field1271.rate);
            }
            this.field1277.read(var3[0].length);
            this.field1279 += var3[0].length;
            class264 var4 = this.field1283.method2159(var3[0].length, (byte) 93, this.field1280);
            class12.method52(var3, var4.field3286, -24930);
            for (int var5 = 0; ~var5 > ~this.field1271.channels; ++var5) {
                var4.field3286[var5] = this.field1273.method4157(var4.field3286[var5], 14);
            }
            this.field1283.method2157((byte) -127, var4);
        } else {
            int var6 = this.field1271.headerIn(this.field1281, arg0);
            if (var6 < 0) {
                throw new IllegalStateException(String.valueOf(var6));
            }
            if (super.field95 == 2) {
                if (this.field1271.channels > 2 || this.field1271.channels < 1) {
                    throw new RuntimeException(String.valueOf(this.field1271.channels));
                }
                this.field1277 = new DSPState(this.field1271);
                this.field1269 = new VorbisBlock(this.field1277);
                this.field1273 = new class748(this.field1271.rate, class277.field3387);
                this.field1283 = new class370(this.field1271.channels);
            }
        }
        int var7 = -87 / ((arg1 - 25) / 46);
    }
}
