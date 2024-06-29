import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class483 extends class329 {

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field6673 = new VorbisInfo();

    @OriginalMember(owner = "client!di", name = "I", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field6685 = new VorbisComment();

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Lqk;")
    public static class1 field6682 = new class1(6, 2);

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field6687 = 0;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "Lv;")
    public static class165 field6689 = new class165();

    @OriginalMember(owner = "client!di", name = "N", descriptor = "Ljn;")
    public static class134 field6690 = new class134(101, -2);

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "[[I")
    public static int[][] field6692 = new int[6][];

    @OriginalMember(owner = "client!di", name = "P", descriptor = "Lqha;")
    public static class396 field6691 = new class396("RC", 1);

    @OriginalMember(owner = "client!di", name = "D", descriptor = "D")
    private double field6680;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    private int field6679;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Les;")
    private class271 field6684;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "Lfc;")
    private class641 field6688;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field6683;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field6672;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
    public final int method2868(int arg0) {
        ++field6678;
        if (arg0 != 1) {
            this.field6688 = null;
        }
        return this.field6684 == null ? 0 : this.field6684.method1769(0);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Les;")
    public final class271 method2869(int arg0) {
        if (arg0 != -7532) {
            return null;
        } else {
            ++field6677;
            return this.field6684;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class483(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method337(OggPacket arg0, int arg1) {
        ++field6686;
        int var3 = 53 % ((arg1 - 71) / 44);
        if (~super.field4616 > -4) {
            int var4 = this.field6673.headerIn(this.field6685, arg0);
            if (~var4 > -1) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            if (super.field4616 == 2) {
                if (~this.field6673.channels >= -3 && this.field6673.channels >= 1) {
                    this.field6683 = new DSPState(this.field6673);
                    this.field6672 = new VorbisBlock(this.field6683);
                    this.field6688 = new class641(this.field6673.rate, class223.field3174);
                    this.field6684 = new class271(this.field6673.channels);
                    return;
                }
                throw new RuntimeException(String.valueOf(this.field6673.channels));
            }
        } else {
            if (this.field6672.synthesis(arg0) == 0) {
                this.field6683.blockIn(this.field6672);
            }
            float[][] var5 = this.field6683.pcmOut(this.field6673.channels);
            this.field6680 = this.field6683.granuleTime();
            if (this.field6680 == -1.0D) {
                this.field6680 = (double) ((float) this.field6679 / (float) this.field6673.rate);
            }
            this.field6683.read(var5[0].length);
            this.field6679 += var5[0].length;
            class593 var6 = this.field6684.method1765(this.field6680, var5[0].length, true);
            class709.method3993((byte) -124, var5, var6.field8349);
            for (int var7 = 0; ~var7 > ~this.field6673.channels; ++var7) {
                var6.field8349[var7] = this.field6688.method3687(14, var6.field8349[var7]);
            }
            this.field6684.method1766(var6, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)D")
    public final double method2870(int arg0) {
        if (arg0 != 0) {
            this.method2870(-41);
        }
        ++field6674;
        double var2 = this.field6680;
        if (this.field6684 != null) {
            var2 = this.field6684.method1760(0);
            if (var2 < 0.0D) {
                var2 = this.field6680;
            }
        }
        return var2 - (double) (256.0F / (float) class223.field3174);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lgga;I)Lht;")
    public static final class126 method2871(class511 arg0, int arg1) {
        ++field6675;
        class406 var2 = class41.method324(false, arg0);
        int var3 = arg0.method3002(-1);
        int var4 = arg0.method3002(arg1 + -29333);
        int var5 = arg0.method3002(arg1 ^ -29333);
        int var6 = arg0.method3002(-1);
        int var7 = arg0.method3002(-1);
        int var8 = arg0.method3002(-1);
        if (arg1 != 29332) {
            field6689 = null;
        }
        return new class126(var2.field5719, var2.field5716, var2.field5717, var2.field5715, var2.field5723, var2.field5722, var2.field5724, var2.field5721, var2.field5720, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public final void method342(boolean arg0) {
        if (this.field6672 != null) {
            this.field6672.method994();
        }
        ++field6676;
        if (arg0) {
            field6691 = null;
        }
        if (this.field6683 != null) {
            this.field6683.method994();
        }
        this.field6685.method994();
        this.field6673.method994();
        if (this.field6684 != null) {
            this.field6684.method1764((byte) 49);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Llaa;I)I")
    public static final int method2872(class498 arg0, int arg1) {
        if (arg1 != 0) {
            method2871((class511) null, 56);
        }
        ++field6681;
        String var2 = class631.method3622(arg0, arg1 ^ -3104);
        return class705.field9812.method1956(class492.field6782, var2, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method2873(byte arg0) {
        field6682 = null;
        field6691 = null;
        field6689 = null;
        if (arg0 > 14) {
            field6692 = null;
            field6690 = null;
        }
    }
}
