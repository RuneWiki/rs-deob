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

@OriginalClass("client!bd")
public class class68 extends class238 {

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field1003 = new SetupInfo();

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field994 = new TheoraInfo();

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field1015 = new TheoraComment();

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "D")
    private double field1006;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "F")
    public static float field997;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "J")
    private long field1016;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Lnf;")
    private class604 field1017;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field1004;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field998;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field1010;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Z")
    private boolean field1001;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
    private boolean field1002;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "Z")
    private boolean field1014;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Z")
    private boolean field993;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)F")
    public final float method614(byte arg0) {
        if (arg0 >= -67) {
            this.field1016 = 33L;
        }
        field1011++;
        return this.field1014 && !this.field994.method4125() ? (float) this.field994.fpsNumerator / (float) this.field994.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)J")
    public final long method615(int arg0) {
        int var2 = -121 % ((arg0 - 44) / 50);
        field996++;
        return this.field1016;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lha;I)Lnf;")
    public final class604 method616(class66 arg0, int arg1) {
        field1000++;
        if (this.field998 == null) {
            return null;
        } else if (this.field1001 || this.field1017 == null) {
            if (arg1 < 28) {
                this.method620(-18);
            }
            this.field1017 = arg0.method587(this.field998.pixels, 0, this.field998.field10261, this.field998.field10261, this.field998.field10262, false);
            this.field1001 = false;
            return this.field1017;
        } else {
            return this.field1017;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    private final void method617(int arg0, int arg1) {
        if (arg0 >= -59) {
            this.field1004 = null;
        }
        field1005++;
        this.field999 = arg1;
        if (!this.field1014) {
            return;
        }
        if (this.field999 > this.field1012) {
            this.field999 = this.field1012;
        }
        if (this.field999 < 0) {
            this.field999 = 0;
        }
        this.field1004.setPostProcessingLevel(this.field999);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method618(byte arg0, OggPacket arg1) {
        field995++;
        if (this.field1014) {
            this.field1016 = class197.method1423(1);
            int var4 = this.field1004.decodePacketIn(arg1, this.field1010);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field1004.granuleFrame(this.field1010);
            this.field1006 = this.field1004.granuleTime(this.field1010);
            if (this.field1002) {
                boolean var5 = arg1.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field1002 = false;
            }
            if (!this.field993 || arg1.isKeyFrame() == 1) {
                if (this.field1004.decodeFrame(this.field998) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field1001 = true;
            }
        } else {
            int var3 = this.field1003.decodeHeader(this.field994, this.field1015, arg1);
            if (var3 == 0) {
                this.field1014 = true;
                if (this.field994.frameWidth > 2048 || this.field994.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field1004 = new DecoderContext(this.field994, this.field1003);
                this.field1010 = new GranulePos();
                this.field998 = new Frame(this.field994.frameWidth, this.field994.frameHeight);
                this.field1012 = this.field1004.getMaxPostProcessingLevel();
                this.method617(-115, this.field999);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        if (arg0 <= 27) {
            this.method619(-121);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z")
    public final boolean method619(int arg0) {
        if (arg0 != -1) {
            method621((byte) -41, 117, -4, 37, -2, -18, -52, 47, 80);
        }
        field1009++;
        return this.field1014;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class68(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)D")
    public final double method620(int arg0) {
        if (arg0 != -14632) {
            this.method622(74);
        }
        field1013++;
        return this.field1006;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method621(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 107 / ((arg0 + 15) / 42);
        class549.method3084(arg2, arg1, arg5, arg3, -106, arg4, 0, arg8, arg6, arg7);
        field1018++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public final void method622(int arg0) {
        if (arg0 != 23586) {
            return;
        }
        if (this.field998 != null) {
            this.field998.method4124();
        }
        field1007++;
        if (this.field1004 != null) {
            this.field1004.method4124();
            this.field1004 = null;
        }
        if (this.field1010 != null) {
            this.field1010.method4124();
            this.field1010 = null;
        }
        this.field994.method4124();
        this.field1015.method4124();
        this.field1003.method4124();
    }
}
