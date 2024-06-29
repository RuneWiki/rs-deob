import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class81 extends class111 {

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field1114 = new SetupInfo();

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field1111 = new TheoraInfo();

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field1127 = new TheoraComment();

    @OriginalMember(owner = "client!u", name = "F", descriptor = "Z")
    public static boolean field1116 = false;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Ljava/util/Random;")
    public static Random field1115 = new Random();

    @OriginalMember(owner = "client!u", name = "r", descriptor = "D")
    private double field1103;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "J")
    private long field1113;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lhh;")
    private class140 field1104;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field1118;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field1106;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field1117;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
    private boolean field1102;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Z")
    private boolean field1109;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Z")
    private boolean field1119;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Z")
    private boolean field1125;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)D")
    public final double method641(boolean arg0) {
        if (!arg0) {
            this.field1114 = null;
        }
        field1120++;
        return this.field1103;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)J")
    public final long method642(int arg0) {
        field1130++;
        return arg0 == -1 ? this.field1113 : 102L;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public final void method643(int arg0) {
        if (arg0 != -1) {
            field1115 = null;
        }
        if (this.field1106 != null) {
            this.field1106.method4074();
        }
        field1123++;
        if (this.field1118 != null) {
            this.field1118.method4074();
            this.field1118 = null;
        }
        if (this.field1117 != null) {
            this.field1117.method4074();
            this.field1117 = null;
        }
        this.field1111.method4074();
        this.field1127.method4074();
        this.field1114.method4074();
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class81(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)Z")
    public final boolean method644(int arg0) {
        field1112++;
        return arg0 <= 95 ? true : this.field1102;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)F")
    public final float method645(byte arg0) {
        field1122++;
        int var2 = 91 % ((arg0 + 10) / 53);
        return this.field1102 && !this.field1111.method4073() ? (float) this.field1111.fpsNumerator / (float) this.field1111.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method646(OggPacket arg0, byte arg1) {
        field1107++;
        if (this.field1102) {
            this.field1113 = class401.method2440(false);
            int var3 = this.field1118.decodePacketIn(arg0, this.field1117);
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field1118.granuleFrame(this.field1117);
            this.field1103 = this.field1118.granuleTime(this.field1117);
            if (this.field1119) {
                boolean var4 = arg0.isKeyFrame() == 1;
                if (!var4) {
                    return;
                }
                this.field1119 = false;
            }
            if (!this.field1109 || arg0.isKeyFrame() == 1) {
                if (this.field1118.decodeFrame(this.field1106) != 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                this.field1125 = true;
            }
        } else {
            int var5 = this.field1114.decodeHeader(this.field1111, this.field1127, arg0);
            if (var5 == 0) {
                this.field1102 = true;
                if (this.field1111.frameWidth > 2048 || this.field1111.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field1118 = new DecoderContext(this.field1111, this.field1114);
                this.field1117 = new GranulePos();
                this.field1106 = new Frame(this.field1111.frameWidth, this.field1111.frameHeight);
                this.field1121 = this.field1118.getMaxPostProcessingLevel();
                this.method651(this.field1128, (byte) -91);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
        }
        if (arg1 != -23) {
            this.method645((byte) -100);
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)Z")
    public static final boolean method647(int arg0) {
        field1108++;
        if (arg0 != -3610) {
            field1115 = null;
        }
        return class289.field4115 == 0 ? class311.field4406.method418(-2580) : true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILha;)Lhh;")
    public final class140 method648(int arg0, class66 arg1) {
        field1124++;
        if (this.field1106 == null) {
            return null;
        } else if (this.field1125 || this.field1104 == null) {
            if (arg0 != 1) {
                this.field1113 = 113L;
            }
            this.field1104 = arg1.method462(this.field1106.pixels, 0, this.field1106.field10029, this.field1106.field10029, this.field1106.field10030, false);
            this.field1125 = false;
            return this.field1104;
        } else {
            return this.field1104;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method649(byte arg0) {
        if (arg0 == -89) {
            field1115 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
    public static final int method650(byte arg0, int arg1) {
        field1105++;
        double var2 = (double) ((arg1 & 0xFF7143) >> 16) / 256.0D;
        int var4 = -20 / ((24 - arg0) / 49);
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var2;
        if (var5 < var2) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var2;
        if (var2 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var2 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var2) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var2 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return ((var21 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
    private final void method651(int arg0, byte arg1) {
        this.field1128 = arg0;
        if (arg1 >= -77) {
            this.method651(-74, (byte) 36);
        }
        field1110++;
        if (!this.field1102) {
            return;
        }
        if (this.field1128 > this.field1121) {
            this.field1128 = this.field1121;
        }
        if (this.field1128 < 0) {
            this.field1128 = 0;
        }
        this.field1118.setPostProcessingLevel(this.field1128);
    }
}
