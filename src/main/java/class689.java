import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class689 extends class734 {

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field9313 = new VorbisInfo();

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field9309 = new VorbisComment();

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "D")
    private double field9312;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    private int field9308;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "Lwea;")
    public static class158 field9299;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "Liha;")
    private class30 field9302;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Lpe;")
    private class609 field9301;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field9300;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field9307;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "[[B")
    public static byte[][] field9303;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILka;III)Lhw;", line = 3)
    public static final class132 method3846(int arg0, class472 arg1, int arg2, int arg3, int arg4) {
        ++field9298;
        if (arg4 != 2) {
            field9303 = null;
        }
        return arg1 == null ? null : new class132(arg0, arg3, arg2, arg1.method505(), arg1.method509(), arg1.method532(), arg1.method486(), arg1.method493(), arg1.method506(), arg1.method512());
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 21)
    public class689(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 31)
    public static void method3847(byte arg0) {
        field9299 = null;
        field9303 = null;
        if (arg0 > -114) {
            method3847((byte) -12);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)I", line = 49)
    public final int method3848(int arg0) {
        if (arg0 != -11020) {
            this.field9309 = null;
        }
        ++field9296;
        return this.field9302 != null ? this.field9302.method407(arg0 + 10949) : 0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILcea;)Lhc;", line = 60)
    public static final class142 method3849(int arg0, class215 arg1) {
        ++field9305;
        if (arg0 != 2) {
            method3851((String) null, -114, 15);
        }
        return new class142(arg1.method1520(13638), arg1.method1520(arg0 + 13636), arg1.method1520(13638), arg1.method1520(arg0 ^ 13636), arg1.method1520(13638), arg1.method1520(arg0 + 13636), arg1.method1520(13638), arg1.method1520(13638), arg1.method1499(-1), arg1.method1535(255));
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)Liha;", line = 75)
    public final class30 method3850(int arg0) {
        if (arg0 > -6) {
            return null;
        } else {
            ++field9304;
            return this.field9302;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 88)
    public static final boolean method3851(String arg0, int arg1, int arg2) {
        ++field9311;
        if (field9299.field2525) {
            class678.field9207 = new class670();
            class678.field9207.field9140 = arg1;
            class678.field9207.field9144 = arg0;
            if (class740.field9967 != class436.field6234) {
                class678.field9207.field9135 = 50000 - -class678.field9207.field9140;
                class678.field9207.field9145 = 40000 - -class678.field9207.field9140;
            }
            if (arg1 < class690.field9322.length && class690.field9322[arg1] != null) {
                class296.field4156 = class690.field9322[arg1].field2402;
            }
            return true;
        } else {
            String var3 = "";
            if (class740.field9967 != class436.field6234) {
                var3 = ":" + (arg1 + 7000);
            }
            String var4 = "";
            if (class640.field8796 != null) {
                var4 = "/p=" + class640.field8796;
            }
            String var5 = "http://" + arg0 + var3 + "/l=" + class607.field8336 + "/a=" + class601.field8259 + var4 + "/j" + (!class591.field8067 ? "0" : "1") + ",o" + (class206.field2960 ? "1" : "0") + ",a2";
            try {
                class334.field4684.getAppletContext().showDocument(new URL(var5), "_self");
                if (arg2 >= -17) {
                    field9299 = null;
                }
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(B)D", line = 134)
    public final double method3852(byte arg0) {
        ++field9306;
        double var2 = this.field9312;
        if (arg0 != 123) {
            return 0.20418061173976032D;
        } else {
            if (this.field9302 != null) {
                var2 = this.field9302.method415(arg0 ^ -21914);
                if (var2 < 0.0D) {
                    var2 = this.field9312;
                }
            }
            return (double) (-(256.0F / (float) class103.field1834)) + var2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 163)
    public final void method689(byte arg0) {
        if (this.field9307 != null) {
            this.field9307.method3950();
        }
        ++field9310;
        if (this.field9300 != null) {
            this.field9300.method3950();
        }
        this.field9309.method3950();
        if (arg0 != 13) {
            method3846(-99, (class472) null, -83, -13, 63);
        }
        this.field9313.method3950();
        if (this.field9302 != null) {
            this.field9302.method414(-1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 187)
    public final void method695(byte arg0, OggPacket arg1) {
        ++field9297;
        if (~super.field9905 > -4) {
            int var3 = this.field9313.headerIn(this.field9309, arg1);
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (super.field9905 == 2) {
                if (this.field9313.channels > 2 || ~this.field9313.channels > -2) {
                    throw new RuntimeException(String.valueOf(this.field9313.channels));
                }
                this.field9300 = new DSPState(this.field9313);
                this.field9307 = new VorbisBlock(this.field9300);
                this.field9301 = new class609(this.field9313.rate, class103.field1834);
                this.field9302 = new class30(this.field9313.channels);
            }
        } else {
            if (this.field9307.synthesis(arg1) == 0) {
                this.field9300.blockIn(this.field9307);
            }
            float[][] var4 = this.field9300.pcmOut(this.field9313.channels);
            this.field9312 = this.field9300.granuleTime();
            if (this.field9312 == -1.0D) {
                this.field9312 = (double) ((float) this.field9308 / (float) this.field9313.rate);
            }
            this.field9300.read(var4[0].length);
            this.field9308 += var4[0].length;
            class500 var5 = this.field9302.method416(var4[0].length, this.field9312, 1401320384);
            class185.method1349(16383, var5.field6987, var4);
            for (int var6 = 0; var6 < this.field9313.channels; ++var6) {
                var5.field6987[var6] = this.field9301.method3460(-56, var5.field6987[var6]);
            }
            this.field9302.method413(var5, 30700);
        }
        if (arg0 > -91) {
            this.method689((byte) -106);
        }
    }
}
