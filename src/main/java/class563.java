import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class563 extends class170 {

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field7881 = new SetupInfo();

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field7879 = new TheoraInfo();

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field7888 = new TheoraComment();

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Z")
    public static boolean field7885 = false;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Lsga;")
    public static class583 field7875 = new class583(64);

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field7893 = -1;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "D")
    private double field7871;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    private int field7877;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    private int field7887;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "J")
    private long field7870;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lac;")
    private class712 field7883;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field7891;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field7866;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field7889;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Z")
    private boolean field7867;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Z")
    private boolean field7868;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "Z")
    private boolean field7878;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Z")
    private boolean field7882;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lha;B)Lac;")
    public final class712 method3174(class454 arg0, byte arg1) {
        field7873++;
        if (this.field7866 == null) {
            return null;
        }
        if (arg1 > -79) {
            method3181(-90);
        }
        if (this.field7868 || this.field7883 == null) {
            this.field7883 = arg0.method75(this.field7866.pixels, 0, this.field7866.field1718, this.field7866.field1718, this.field7866.field1719, false);
            this.field7868 = false;
            return this.field7883;
        } else {
            return this.field7883;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    private final void method3175(int arg0, int arg1) {
        field7880++;
        this.field7877 = arg0;
        if (arg1 != 0) {
            this.field7881 = null;
        }
        if (!this.field7882) {
            return;
        }
        if (this.field7877 > this.field7887) {
            this.field7877 = this.field7887;
        }
        if (this.field7877 < 0) {
            this.field7877 = 0;
        }
        this.field7891.setPostProcessingLevel(this.field7877);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)F")
    public final float method3176(int arg0) {
        field7884++;
        if (this.field7882 && !this.field7879.method891()) {
            int var2 = -64 / ((arg0 + 72) / 45);
            return (float) this.field7879.fpsNumerator / (float) this.field7879.fpsDenominator;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILtn;)V")
    public static final void method3177(int arg0, class179 arg1) {
        field7869++;
        byte[] var2 = new byte[24];
        if (class444.field6234 != null) {
            try {
                class444.field6234.method2833(0L, (byte) 117);
                class444.field6234.method2834(var2, arg0 - 24876);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1123(24, (byte) 49, 0, var2);
        if (arg0 != 24880) {
            field7875 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z")
    public final boolean method3178(int arg0) {
        if (arg0 > -64) {
            method3181(-118);
        }
        field7890++;
        return this.field7882;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)J")
    public final long method3179(int arg0) {
        if (arg0 != -1) {
            this.method3176(-117);
        }
        field7892++;
        return this.field7870;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIZI)I")
    public static final int method3180(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field7872++;
        class464 var5 = class175.method1082(arg3, arg2, (byte) 20);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg0 != 10699) {
            method3177(-14, null);
        }
        for (int var7 = 0; var7 < var5.field6715.length; var7++) {
            if (var5.field6715[var7] >= 0 && var5.field6715[var7] < class190.field2488.field10026) {
                class167 var8 = class190.field2488.method3944(arg0 ^ 0x28CB, var5.field6715[var7]);
                int var9 = var8.method1048(false, arg4, class188.field2466.method3449(2529, arg4).field720);
                if (arg1) {
                    var6 += var5.field6712[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class563(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
    public static void method3181(int arg0) {
        field7875 = null;
        if (arg0 != -11987) {
            field7885 = true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)D")
    public final double method3182(int arg0) {
        field7876++;
        return arg0 <= 95 ? 2.6488495145771407D : this.field7871;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method931(int arg0, OggPacket arg1) {
        field7874++;
        if (arg0 >= -87) {
            return;
        }
        if (!this.field7882) {
            int var5 = this.field7881.decodeHeader(this.field7879, this.field7888, arg1);
            if (var5 == 0) {
                this.field7882 = true;
                if (this.field7879.frameWidth > 2048 || this.field7879.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field7891 = new DecoderContext(this.field7879, this.field7881);
                this.field7889 = new GranulePos();
                this.field7866 = new Frame(this.field7879.frameWidth, this.field7879.frameHeight);
                this.field7887 = this.field7891.getMaxPostProcessingLevel();
                this.method3175(this.field7877, 0);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            return;
        }
        this.field7870 = class97.method654((byte) 78);
        int var3 = this.field7891.decodePacketIn(arg1, this.field7889);
        if (var3 < 0) {
            throw new IllegalStateException(String.valueOf(var3));
        }
        this.field7891.granuleFrame(this.field7889);
        this.field7871 = this.field7891.granuleTime(this.field7889);
        if (this.field7867) {
            boolean var4 = arg1.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field7867 = false;
        }
        if (!this.field7878 || arg1.isKeyFrame() == 1) {
            if (this.field7891.decodeFrame(this.field7866) != 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field7868 = true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        if (this.field7866 != null) {
            this.field7866.method892();
        }
        field7886++;
        if (this.field7891 != null) {
            this.field7891.method892();
            this.field7891 = null;
        }
        if (!arg0) {
            method3181(37);
        }
        if (this.field7889 != null) {
            this.field7889.method892();
            this.field7889 = null;
        }
        this.field7879.method892();
        this.field7888.method892();
        this.field7881.method892();
    }
}
