import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class70 extends class206 {

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field860 = new SetupInfo();

    @OriginalMember(owner = "client!pv", name = "K", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field880 = new TheoraInfo();

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field873 = new TheoraComment();

    @OriginalMember(owner = "client!pv", name = "S", descriptor = "I")
    public static int field888 = 0;

    @OriginalMember(owner = "client!pv", name = "J", descriptor = "D")
    private double field879;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!pv", name = "I", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!pv", name = "L", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!pv", name = "P", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!pv", name = "Q", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!pv", name = "R", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!pv", name = "T", descriptor = "J")
    private long field889;

    @OriginalMember(owner = "client!pv", name = "U", descriptor = "Lpk;")
    public static class195 field890;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "Loia;")
    private class88 field864;

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field870;

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field871;

    @OriginalMember(owner = "client!pv", name = "H", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field877;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "Z")
    private boolean field866;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "Z")
    private boolean field872;

    @OriginalMember(owner = "client!pv", name = "G", descriptor = "Z")
    public static boolean field876;

    @OriginalMember(owner = "client!pv", name = "M", descriptor = "Z")
    private boolean field882;

    @OriginalMember(owner = "client!pv", name = "N", descriptor = "Z")
    private boolean field883;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 3)
    public static final int method573(String arg0, int arg1) {
        if (arg1 < 84) {
            method574(true);
        }
        field887++;
        if (!class506.field7250.field4385) {
            return -1;
        } else if (class197.field2615.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class5.method25(4096, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class699.field9760 + var2;
            if (!class552.field7763.method2094(26, var3, "")) {
                return -1;
            } else if (class552.field7763.method2091(var3, -2)) {
                byte[] var4 = class552.field7763.method2102(var3, "", 0);
                Object var5 = null;
                File var6;
                try {
                    var6 = class685.method3835(var2, -1);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class116.method808(var6, 26308);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class506.field7250.method2050(0, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class96.method708(var6, arg0, (byte) -77);
                return 100;
            } else {
                return class552.field7763.method2078(var3, (byte) 103);
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V", line = 100)
    public static final void method574(boolean arg0) {
        class455.method2707((byte) -101);
        field859++;
        if (!arg0) {
            field888 = 73;
        }
        class589.field8295 = false;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(III)Z", line = 112)
    public static final boolean method575(int arg0, int arg1, int arg2) {
        if (arg0 > -49) {
            return true;
        } else {
            field875++;
            return class634.method3527(9, arg2, arg1) || class129.method862(4285, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)Z", line = 125)
    public static final boolean method576(int arg0) {
        field881++;
        if (class469.field6659 == 0) {
            return arg0 == -21552 ? class165.field2262.method1374((byte) 114) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 140)
    public class70(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V", line = 152)
    public static void method577(int arg0) {
        if (arg0 != -1) {
            field876 = false;
        }
        field890 = null;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)F", line = 162)
    public final float method578(byte arg0) {
        field867++;
        if (this.field866 && !this.field880.method4008()) {
            return arg0 == -43 ? (float) this.field880.fpsNumerator / (float) this.field880.fpsDenominator : 0.9404063F;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 177)
    public final void method579(int arg0, OggPacket arg1) {
        field885++;
        if (arg0 != -19767) {
            return;
        }
        if (!this.field866) {
            int var5 = this.field860.decodeHeader(this.field880, this.field873, arg1);
            if (var5 == 0) {
                this.field866 = true;
                if (this.field880.frameWidth > 2048 || this.field880.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field870 = new DecoderContext(this.field880, this.field860);
                this.field877 = new GranulePos();
                this.field871 = new Frame(this.field880.frameWidth, this.field880.frameHeight);
                this.field886 = this.field870.getMaxPostProcessingLevel();
                this.method586(this.field869, -1);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            return;
        }
        this.field889 = class479.method2864((byte) -126);
        int var3 = this.field870.decodePacketIn(arg1, this.field877);
        if (var3 < 0) {
            throw new IllegalStateException(String.valueOf(var3));
        }
        this.field870.granuleFrame(this.field877);
        this.field879 = this.field870.granuleTime(this.field877);
        if (this.field882) {
            boolean var4 = arg1.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field882 = false;
        }
        if (!this.field872 || arg1.isKeyFrame() == 1) {
            if (this.field870.decodeFrame(this.field871) != 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field883 = true;
        }
    }

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)Z", line = 254)
    public final boolean method580(int arg0) {
        field863++;
        if (arg0 != -1) {
            this.field870 = null;
        }
        return this.field866;
    }

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "(I)J", line = 272)
    public final long method581(int arg0) {
        field868++;
        if (arg0 != 0) {
            method573(null, 50);
        }
        return this.field889;
    }

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "(I)V", line = 288)
    public static final void method582(int arg0) {
        class505.method2993();
        field884++;
        for (int var1 = 0; var1 < 4; var1++) {
            class147.field2114[var1].method1871((byte) 127);
        }
        class636.method3534(16598);
        class184.method1167((byte) -73);
        class682.method3818(-5685);
        System.gc();
        if (arg0 != -1) {
            field888 = -47;
        }
        class268.field3831.method440();
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILha;)Loia;", line = 315)
    public final class88 method583(int arg0, class58 arg1) {
        field878++;
        if (this.field871 == null) {
            return null;
        }
        if (arg0 != -1) {
            this.field860 = null;
        }
        if (this.field883 || this.field864 == null) {
            this.field864 = arg1.method421(this.field871.pixels, 0, this.field871.field9907, this.field871.field9907, this.field871.field9908, false);
            this.field883 = false;
            return this.field864;
        } else {
            return this.field864;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V", line = 336)
    public final void method584(int arg0) {
        field865++;
        if (arg0 > -8) {
            return;
        }
        if (this.field871 != null) {
            this.field871.method4009();
        }
        if (this.field870 != null) {
            this.field870.method4009();
            this.field870 = null;
        }
        if (this.field877 != null) {
            this.field877.method4009();
            this.field877 = null;
        }
        this.field880.method4009();
        this.field873.method4009();
        this.field860.method4009();
    }

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "(I)D", line = 368)
    public final double method585(int arg0) {
        field874++;
        if (arg0 != 2048) {
            field890 = null;
        }
        return this.field879;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V", line = 386)
    private final void method586(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field861++;
        this.field869 = arg0;
        if (!this.field866) {
            return;
        }
        if (this.field869 > this.field886) {
            this.field869 = this.field886;
        }
        if (this.field869 < 0) {
            this.field869 = 0;
        }
        this.field870.setPostProcessingLevel(this.field869);
    }

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "(I)[Lqfa;", line = 410)
    public static final class98[] method587(int arg0) {
        if (arg0 != -4638) {
            field890 = null;
        }
        field862++;
        return new class98[] { class318.field4411, class432.field6174, class356.field5070, class508.field7266, class642.field8811, class554.field7785, class612.field8583, class590.field8308, class497.field7142, class523.field7406, class428.field6112, class202.field2645, class240.field3197, class273.field3896, class140.field2021, class576.field8142, class43.field530, class422.field5961, class268.field3818, class387.field5479, class406.field5755, class611.field8581, class589.field8301, class398.field5614, class60.field741, class133.field1950, class422.field5954, class418.field5907, class138.field2003, class662.field9063, class547.field7628, class9.field131, class355.field5062, class3.field29, class225.field3035, class687.field9386, class118.field1426, class67.field823, class25.field346, class296.field4164, class165.field2264, class355.field5064, class341.field4739, class269.field3834, class661.field9044, class94.field1098, class453.field6399, class36.field449, class639.field8777, class235.field3167, class612.field8587, class252.field3691, class140.field2024, class158.field2194, class589.field8302, class392.field5538, class364.field5160, class34.field441, class335.field4671, class642.field8799, class704.field9800, class4.field38, class573.field8109, class493.field7090, class135.field1960, class498.field7148, class565.field8028, class530.field7468, class67.field812, class125.field1514, class21.field318, class84.field1044, class633.field8737, class147.field2111, class191.field2549, class481.field6804, class64.field783, class654.field8986, class336.field4676, class5.field46, class422.field5959, class175.field2357, class660.field9034, class238.field3185, class333.field4661, class439.field6252, class577.field8155, class355.field5061, class714.field9929, class89.field1074, class625.field8689, class376.field5284, class138.field2000, class654.field8969, class85.field1051, class657.field9012, class341.field4735, class493.field7106, class176.field2373, class322.field4452, class6.field59, class507.field7259, class560.field7871, class287.field4065, class43.field523, class597.field8401, class277.field3921, class209.field2742, class719.field9986, class333.field4658, class401.field5674, class600.field8417, class226.field3044, class394.field5579, class162.field2212, class703.field9784, class459.field6470, class476.field6763, class527.field7432, class44.field534, class542.field7573 };
    }
}
