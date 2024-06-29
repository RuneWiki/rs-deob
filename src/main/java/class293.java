import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class293 extends class340 {

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field3930 = new SetupInfo();

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field3908 = new TheoraInfo();

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field3921 = new TheoraComment();

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "[I")
    public static int[] field3917 = new int[128];

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lef;")
    public static class488 field3928;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "D")
    private double field3911;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    private int field3926;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    private int field3931;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "J")
    private long field3920;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Lufa;")
    private class680 field3915;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field3924;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field3904;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field3916;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Z")
    private boolean field3905;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
    private boolean field3907;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Z")
    private boolean field3913;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Z")
    private boolean field3929;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "[Lph;")
    public static class643[] field3923;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    private final void method1744(int arg0, int arg1) {
        this.field3931 = arg0;
        int var3 = -57 / ((-arg1 - 11) / 48);
        field3914++;
        if (!this.field3929) {
            return;
        }
        if (this.field3926 < this.field3931) {
            this.field3931 = this.field3926;
        }
        if (this.field3931 < 0) {
            this.field3931 = 0;
        }
        this.field3924.setPostProcessingLevel(this.field3931);
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)F")
    public final float method1745(int arg0) {
        if (arg0 == -1) {
            field3918++;
            return this.field3929 && !this.field3908.method3997() ? (float) this.field3908.fpsNumerator / (float) this.field3908.fpsDenominator : 0.0F;
        } else {
            return -0.24629752F;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1746(byte arg0) {
        field3923 = null;
        field3917 = null;
        if (arg0 <= 74) {
            field3928 = null;
        }
        field3928 = null;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z")
    public final boolean method1747(int arg0) {
        if (arg0 != 1024) {
            this.method1749(true);
        }
        field3927++;
        return this.field3929;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method1724(OggPacket arg0, boolean arg1) {
        field3919++;
        if (this.field3929) {
            this.field3920 = class538.method2963(-47);
            int var4 = this.field3924.decodePacketIn(arg0, this.field3916);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field3924.granuleFrame(this.field3916);
            this.field3911 = this.field3924.granuleTime(this.field3916);
            if (this.field3913) {
                boolean var5 = arg0.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field3913 = false;
            }
            if (!this.field3907 || arg0.isKeyFrame() == 1) {
                if (this.field3924.decodeFrame(this.field3904) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field3905 = true;
            }
        } else {
            int var3 = this.field3930.decodeHeader(this.field3908, this.field3921, arg0);
            if (var3 == 0) {
                this.field3929 = true;
                if (this.field3908.frameWidth > 2048 || this.field3908.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field3924 = new DecoderContext(this.field3908, this.field3930);
                this.field3916 = new GranulePos();
                this.field3904 = new Frame(this.field3908.frameWidth, this.field3908.frameHeight);
                this.field3926 = this.field3924.getMaxPostProcessingLevel();
                this.method1744(this.field3931, -98);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        if (arg1) {
            field3925 = -89;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class293(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BC)Z")
    public static final boolean method1748(byte arg0, char arg1) {
        field3912++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class175.method1001(arg1, 115)) {
            return true;
        } else {
            char[] var2 = class61.field674;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class24.field184;
            int var5 = 0;
            if (arg0 != 105) {
                method1746((byte) 7);
            }
            while (var5 < var4.length) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
                var5++;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)J")
    public final long method1749(boolean arg0) {
        if (arg0) {
            return -59L;
        } else {
            field3909++;
            return this.field3920;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public final void method1723(int arg0) {
        field3922++;
        if (this.field3904 != null) {
            this.field3904.method3996();
        }
        if (this.field3924 != null) {
            this.field3924.method3996();
            this.field3924 = null;
        }
        if (this.field3916 != null) {
            this.field3916.method3996();
            this.field3916 = null;
        }
        this.field3908.method3996();
        this.field3921.method3996();
        if (arg0 != -1128) {
            this.field3921 = null;
        }
        this.field3930.method3996();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lha;I)Lufa;")
    public final class680 method1750(class60 arg0, int arg1) {
        field3906++;
        if (this.field3904 == null) {
            return null;
        } else if (!this.field3905 && this.field3915 != null) {
            return this.field3915;
        } else if (arg1 == 11242) {
            this.field3915 = arg0.method379(this.field3904.pixels, 0, this.field3904.field9960, this.field3904.field9960, this.field3904.field9961, false);
            this.field3905 = false;
            return this.field3915;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)D")
    public final double method1751(int arg0) {
        if (arg0 != 0) {
            this.method1749(false);
        }
        field3910++;
        return this.field3911;
    }

    static {
        for (int var0 = 0; var0 < field3917.length; var0++) {
            field3917[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field3917[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field3917[var2] = var2 - 71;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field3917[var3] = var3 + 52 - 48;
        }
        field3917[45] = field3917[47] = 63;
        field3917[42] = field3917[43] = 62;
        field3928 = new class488();
    }
}
