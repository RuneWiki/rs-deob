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

@OriginalClass("client!fda")
public class class319 extends class147 {

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field4518 = new SetupInfo();

    @OriginalMember(owner = "client!fda", name = "K", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field4536 = new TheoraInfo();

    @OriginalMember(owner = "client!fda", name = "P", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field4541 = new TheoraComment();

    @OriginalMember(owner = "client!fda", name = "Q", descriptor = "Ljg;")
    public static class338 field4542 = new class338();

    @OriginalMember(owner = "client!fda", name = "R", descriptor = "Lqaa;")
    public static class27 field4543 = new class27(10, -1);

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "D")
    private double field4516;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!fda", name = "t", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!fda", name = "v", descriptor = "I")
    private int field4521;

    @OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!fda", name = "B", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!fda", name = "C", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!fda", name = "D", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!fda", name = "E", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!fda", name = "F", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!fda", name = "J", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!fda", name = "M", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!fda", name = "N", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!fda", name = "O", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!fda", name = "L", descriptor = "J")
    private long field4537;

    @OriginalMember(owner = "client!fda", name = "A", descriptor = "Lkr;")
    private class743 field4526;

    @OriginalMember(owner = "client!fda", name = "G", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field4532;

    @OriginalMember(owner = "client!fda", name = "w", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field4522;

    @OriginalMember(owner = "client!fda", name = "u", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field4520;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "Z")
    private boolean field4515;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "Z")
    private boolean field4517;

    @OriginalMember(owner = "client!fda", name = "H", descriptor = "Z")
    private boolean field4533;

    @OriginalMember(owner = "client!fda", name = "I", descriptor = "Z")
    private boolean field4534;

    @OriginalMember(owner = "client!fda", name = "y", descriptor = "[[Lgs;")
    public static class43[][] field4524;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BII)I")
    public static final int method2048(byte arg0, int arg1, int arg2) {
        field4539++;
        int var3 = class417.method2548(arg2 - 1, arg0 ^ 0x5C, arg1 - 1) - (-class417.method2548(arg2 - 1, 123, arg1 + 1) - (class417.method2548(arg2 + 1, 117, arg1 - 1) + class417.method2548(arg2 + 1, 124, arg1 + 1)));
        if (arg0 == 37) {
            int var4 = class417.method2548(arg2, 127, arg1 - 1) - (-class417.method2548(arg2, 118, arg1 + 1) - class417.method2548(arg2 - 1, 126, arg1)) + class417.method2548(arg2 + 1, 126, arg1);
            int var5 = class417.method2548(arg2, 124, arg1);
            return var5 / 4 + (var3 / 16 + (var4 / 8));
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)F")
    public final float method2049(boolean arg0) {
        field4523++;
        if (!arg0) {
            this.method2057(false);
        }
        return this.field4534 && !this.field4536.method3969() ? (float) this.field4536.fpsNumerator / (float) this.field4536.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
    public static final void method2050(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field4542 = null;
        }
        field4535++;
        class284.method1856(class401.field5610, (byte) 119, arg1, class363.field5105, class206.field2956);
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V")
    public static final void method2051(int arg0) {
        if (arg0 != 837) {
            return;
        }
        field4519++;
        class497.method2990(124, false);
        if (class1.field14 >= 0 && class1.field14 != 0) {
            class54.method490((byte) 123, false, class1.field14);
            class1.field14 = -1;
        }
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)D")
    public final double method2052(int arg0) {
        field4528++;
        return arg0 == -1 ? this.field4516 : -0.12721405750383324D;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method2053(byte arg0) {
        if (arg0 == 26) {
            field4543 = null;
            field4542 = null;
            field4524 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        field4525++;
        if (this.field4522 != null) {
            this.field4522.method3970();
        }
        if (this.field4532 != null) {
            this.field4532.method3970();
            this.field4532 = null;
        }
        if (this.field4520 != null) {
            this.field4520.method3970();
            this.field4520 = null;
        }
        this.field4536.method3970();
        this.field4541.method3970();
        this.field4518.method3970();
        if (arg0 != 0) {
            method2053((byte) 17);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ltq;ILtq;)V")
    public static final void method2054(class626 arg0, int arg1, class626 arg2) {
        if (arg0.field8989 != null) {
            arg0.method3617(1);
        }
        field4531++;
        arg0.field8990 = arg2;
        arg0.field8989 = arg2.field8989;
        arg0.field8989.field8990 = arg0;
        arg0.field8990.field8989 = arg0;
        if (arg1 <= 26) {
            field4543 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "(I)Z")
    public final boolean method2055(int arg0) {
        field4540++;
        return arg0 < 22 ? true : this.field4534;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILha;)Lkr;")
    public final class743 method2056(int arg0, class58 arg1) {
        if (arg0 != 1) {
            method2053((byte) -118);
        }
        field4530++;
        if (this.field4522 == null) {
            return null;
        } else if (this.field4515 || this.field4526 == null) {
            this.field4526 = arg1.method620(this.field4522.pixels, 0, this.field4522.field9931, this.field4522.field9931, this.field4522.field9932, false);
            this.field4515 = false;
            return this.field4526;
        } else {
            return this.field4526;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public final void method9(boolean arg0, OggPacket arg1) {
        field4538++;
        if (arg0) {
            return;
        }
        if (!this.field4534) {
            int var5 = this.field4518.decodeHeader(this.field4536, this.field4541, arg1);
            if (var5 == 0) {
                this.field4534 = true;
                if (this.field4536.frameWidth > 2048 || this.field4536.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field4532 = new DecoderContext(this.field4536, this.field4518);
                this.field4520 = new GranulePos();
                this.field4522 = new Frame(this.field4536.frameWidth, this.field4536.frameHeight);
                this.field4521 = this.field4532.getMaxPostProcessingLevel();
                this.method2058(-2980, this.field4527);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            return;
        }
        this.field4537 = class742.method4128(1);
        int var3 = this.field4532.decodePacketIn(arg1, this.field4520);
        if (var3 < 0) {
            throw new IllegalStateException(String.valueOf(var3));
        }
        this.field4532.granuleFrame(this.field4520);
        this.field4516 = this.field4532.granuleTime(this.field4520);
        if (this.field4533) {
            boolean var4 = arg1.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field4533 = false;
        }
        if (!this.field4517 || arg1.isKeyFrame() == 1) {
            if (this.field4532.decodeFrame(this.field4522) != 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field4515 = true;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(Z)J")
    public final long method2057(boolean arg0) {
        field4529++;
        if (!arg0) {
            field4543 = null;
        }
        return this.field4537;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class319(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)V")
    private final void method2058(int arg0, int arg1) {
        if (arg0 != -2980) {
            return;
        }
        this.field4527 = arg1;
        field4514++;
        if (!this.field4534) {
            return;
        }
        if (this.field4521 < this.field4527) {
            this.field4527 = this.field4521;
        }
        if (this.field4527 < 0) {
            this.field4527 = 0;
        }
        this.field4532.setPostProcessingLevel(this.field4527);
    }
}
