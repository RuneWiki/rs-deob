import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class754 extends class541 {

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field10510 = new VorbisInfo();

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field10515 = new VorbisComment();

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field10509 = 0;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "D")
    private double field10522;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    private int field10514;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field10518;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "Lpp;")
    private class396 field10529;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "Lgo;")
    private class629 field10519;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field10512;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field10511;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method58(byte arg0, OggPacket arg1) {
        if (arg0 != 61) {
            method4188(87, 106, (class461) null);
        }
        ++field10513;
        if (super.field7488 < 3) {
            int var3 = this.field10510.headerIn(this.field10515, arg1);
            if (~var3 > -1) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (super.field7488 == 2) {
                if (~this.field10510.channels >= -3 && this.field10510.channels >= 1) {
                    this.field10512 = new DSPState(this.field10510);
                    this.field10511 = new VorbisBlock(this.field10512);
                    this.field10529 = new class396(this.field10510.rate, class541.field7490);
                    this.field10519 = new class629(this.field10510.channels);
                    return;
                }
                throw new RuntimeException(String.valueOf(this.field10510.channels));
            }
        } else {
            if (~this.field10511.synthesis(arg1) == -1) {
                this.field10512.blockIn(this.field10511);
            }
            float[][] var4 = this.field10512.pcmOut(this.field10510.channels);
            this.field10522 = this.field10512.granuleTime();
            if (this.field10522 == -1.0D) {
                this.field10522 = (double) ((float) this.field10514 / (float) this.field10510.rate);
            }
            this.field10512.read(var4[0].length);
            this.field10514 += var4[0].length;
            class562 var5 = this.field10519.method3528(var4[0].length, this.field10522, 1871634688);
            class18.method126(var4, var5.field7913, (byte) -128);
            for (int var6 = 0; ~this.field10510.channels < ~var6; ++var6) {
                var5.field7913[var6] = this.field10529.method2229(true, var5.field7913[var6]);
            }
            this.field10519.method3534(var5, 124);
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class754(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Lgo;")
    public final class629 method4187(int arg0) {
        if (arg0 != 3) {
            field10528 = 57;
        }
        ++field10520;
        return this.field10519;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        if (this.field10511 != null) {
            this.field10511.method4007();
        }
        ++field10518;
        if (this.field10512 != null) {
            this.field10512.method4007();
        }
        if (arg0) {
            this.method4189(false);
        }
        this.field10515.method4007();
        this.field10510.method4007();
        if (this.field10519 != null) {
            this.field10519.method3535(true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILsl;)V")
    public static final void method4188(int arg0, int arg1, class461 arg2) {
        if (class605.field8418 != null) {
            try {
                class605.field8418.method4163(0L, 0);
                class605.field8418.method4161(arg1, arg2.field6180, 22609, 24);
            } catch (Exception var3) {
            }
        }
        ++field10527;
        if (arg0 != 24) {
            method4190(81, -49, 39);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)I")
    public final int method4189(boolean arg0) {
        ++field10516;
        if (arg0) {
            this.field10515 = null;
        }
        return this.field10519 != null ? this.field10519.method3525((byte) -128) : 0;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)Z")
    public static final boolean method4190(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field10509 = 98;
        }
        ++field10525;
        return class22.method141(arg2, arg1, (byte) -28) | (262144 & arg2) != 0 || class164.method1143(arg2, arg0 + -1, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILnd;)V")
    public static final void method4191(int arg0, class547 arg1) {
        if (arg0 != 2) {
            field10509 = -106;
        }
        class282.field3548 = arg1;
        ++field10524;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)D")
    public final double method4192(int arg0) {
        ++field10521;
        double var2 = this.field10522;
        if (arg0 != 0) {
            this.field10510 = null;
        }
        if (this.field10519 != null) {
            var2 = this.field10519.method3527(0);
            if (var2 < 0.0D) {
                var2 = this.field10522;
            }
        }
        return var2 - (double) (256.0F / (float) class541.field7490);
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)I")
    public static final int method4193(boolean arg0) {
        ++field10523;
        if (class14.field276) {
            return 6;
        } else if (class438.field5836 == null) {
            return 0;
        } else {
            int var1 = class438.field5836.field3478;
            if (class567.method3258(var1, false)) {
                return 1;
            } else if (class36.method228(var1, 610)) {
                return 2;
            } else {
                if (!arg0) {
                    field10509 = 26;
                }
                if (class473.method2693(-51, var1)) {
                    return 3;
                } else {
                    return class491.method2902(var1, 39) ? 4 : 5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public static final void method4194(int arg0) {
        ++field10517;
        class126.field1799.method1399(true);
        class230.field3028 = null;
        class514.field7217 = arg0;
        client.field3977 = null;
    }
}
