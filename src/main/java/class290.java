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

@OriginalClass("client!rga")
public class class290 extends class448 {

    @OriginalMember(owner = "client!rga", name = "O", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field4468 = new SetupInfo();

    @OriginalMember(owner = "client!rga", name = "K", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field4464 = new TheoraInfo();

    @OriginalMember(owner = "client!rga", name = "y", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field4453 = new TheoraComment();

    @OriginalMember(owner = "client!rga", name = "A", descriptor = "Lnf;")
    public static class19 field4455 = new class19();

    @OriginalMember(owner = "client!rga", name = "Q", descriptor = "[S")
    private static short[] field4470 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!rga", name = "U", descriptor = "[S")
    private static short[] field4474 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rga", name = "T", descriptor = "[S")
    private static short[] field4473 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rga", name = "P", descriptor = "[[S")
    public static short[][] field4469 = new short[][] { field4470, field4474, field4473 };

    @OriginalMember(owner = "client!rga", name = "I", descriptor = "D")
    private double field4462;

    @OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!rga", name = "E", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!rga", name = "F", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!rga", name = "H", descriptor = "I")
    private int field4461;

    @OriginalMember(owner = "client!rga", name = "J", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!rga", name = "M", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!rga", name = "N", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!rga", name = "S", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!rga", name = "W", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!rga", name = "C", descriptor = "J")
    private long field4457;

    @OriginalMember(owner = "client!rga", name = "R", descriptor = "Lcd;")
    public static class22 field4471;

    @OriginalMember(owner = "client!rga", name = "L", descriptor = "Lit;")
    private class34 field4465;

    @OriginalMember(owner = "client!rga", name = "X", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field4477;

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field4451;

    @OriginalMember(owner = "client!rga", name = "B", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field4456;

    @OriginalMember(owner = "client!rga", name = "t", descriptor = "Z")
    private boolean field4448;

    @OriginalMember(owner = "client!rga", name = "x", descriptor = "Z")
    private boolean field4452;

    @OriginalMember(owner = "client!rga", name = "V", descriptor = "Z")
    private boolean field4475;

    @OriginalMember(owner = "client!rga", name = "Y", descriptor = "Z")
    private boolean field4478;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)V", line = 5)
    private final void method1887(int arg0, byte arg1) {
        field4466++;
        this.field4461 = arg0;
        if (this.field4478) {
            if (this.field4461 > this.field4476) {
                this.field4461 = this.field4476;
            }
            if (this.field4461 < 0) {
                this.field4461 = 0;
            }
            this.field4477.setPostProcessingLevel(this.field4461);
        }
        if (arg1 != -29) {
            this.field4448 = true;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILha;)Lit;", line = 27)
    public final class34 method1888(int arg0, class544 arg1) {
        field4459++;
        if (this.field4451 == null) {
            return null;
        } else if (this.field4475 || this.field4465 == null) {
            this.field4465 = arg1.method231(this.field4451.pixels, 0, this.field4451.field1176, this.field4451.field1176, this.field4451.field1177, false);
            if (arg0 <= 48) {
                return null;
            } else {
                this.field4475 = false;
                return this.field4465;
            }
        } else {
            return this.field4465;
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)J", line = 46)
    public final long method1889(int arg0) {
        if (arg0 < 109) {
            field4473 = null;
        }
        field4454++;
        return this.field4457;
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)Z", line = 57)
    public final boolean method1890(int arg0) {
        field4467++;
        int var2 = 59 % ((62 - arg0) / 52);
        return this.field4478;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)F", line = 67)
    public final float method1891(byte arg0) {
        if (arg0 != 89) {
            method1895((byte) 17, null);
        }
        field4460++;
        return this.field4478 && !this.field4464.method726() ? (float) this.field4464.fpsNumerator / (float) this.field4464.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "(I)D", line = 84)
    public final double method1892(int arg0) {
        if (arg0 == 0) {
            field4463++;
            return this.field4462;
        } else {
            return 0.9347310943358327D;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 98)
    public final void method1132(OggPacket arg0, byte arg1) {
        field4449++;
        if (arg1 != -5) {
            return;
        }
        if (!this.field4478) {
            int var5 = this.field4468.decodeHeader(this.field4464, this.field4453, arg0);
            if (var5 == 0) {
                this.field4478 = true;
                if (this.field4464.frameWidth > 2048 || this.field4464.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field4477 = new DecoderContext(this.field4464, this.field4468);
                this.field4456 = new GranulePos();
                this.field4451 = new Frame(this.field4464.frameWidth, this.field4464.frameHeight);
                this.field4476 = this.field4477.getMaxPostProcessingLevel();
                this.method1887(this.field4461, (byte) -29);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            return;
        }
        this.field4457 = class18.method109(-11121);
        int var3 = this.field4477.decodePacketIn(arg0, this.field4456);
        if (var3 < 0) {
            throw new IllegalStateException(String.valueOf(var3));
        }
        this.field4477.granuleFrame(this.field4456);
        this.field4462 = this.field4477.granuleTime(this.field4456);
        if (this.field4448) {
            boolean var4 = arg0.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field4448 = false;
        }
        if (!this.field4452 || arg0.isKeyFrame() == 1) {
            if (this.field4477.decodeFrame(this.field4451) != 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field4475 = true;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(ZIZII)V", line = 179)
    public static final void method1893(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (class654.field9289.field5415.method2004(3) == 0) {
            class520.method3097(false, 16);
        } else {
            class741.field10389 = class654.field9289.field5415.method2004(3);
            class526.method3125(1221653740, 0, true);
        }
        field4458++;
        class23.field221 = arg0;
        class213.field3527 = arg1;
        class120.field1834 = arg3;
        if (!arg2) {
            field4473 = null;
        }
        class729.method4032(arg4);
    }

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "(I)V", line = 214)
    public static void method1894(int arg0) {
        field4471 = null;
        field4470 = null;
        field4474 = null;
        if (arg0 != 2426) {
            method1895((byte) 4, null);
        }
        field4455 = null;
        field4469 = null;
        field4473 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B[B)[B", line = 229)
    public static final byte[] method1895(byte arg0, byte[] arg1) {
        field4450++;
        if (arg0 != -120) {
            method1894(72);
        }
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class571.method3313(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 256)
    public final void method1134(int arg0) {
        field4472++;
        if (this.field4451 != null) {
            this.field4451.method725();
        }
        if (this.field4477 != null) {
            this.field4477.method725();
            this.field4477 = null;
        }
        if (this.field4456 != null) {
            this.field4456.method725();
            this.field4456 = null;
        }
        this.field4464.method725();
        if (arg0 >= -18) {
            this.field4456 = null;
        }
        this.field4453.method725();
        this.field4468.method725();
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 290)
    public class290(OggStreamState arg0) {
        super(arg0);
    }
}
