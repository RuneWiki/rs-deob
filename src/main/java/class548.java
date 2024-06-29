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

@OriginalClass("client!ea")
public class class548 extends class518 {

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field7832 = new SetupInfo();

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field7823 = new TheoraInfo();

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field7825 = new TheoraComment();

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field7826 = 0;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "D")
    private double field7839;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    private int field7836;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    private int field7841;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "J")
    private long field7833;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lpga;")
    private class536 field7840;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field7824;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field7819;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field7828;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
    private boolean field7818;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "Z")
    private boolean field7834;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Z")
    private boolean field7844;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Z")
    private boolean field7845;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)F")
    public final float method3200(int arg0) {
        field7831++;
        if (arg0 < 53) {
            this.field7839 = 1.5298528129486377D;
        }
        return this.field7845 && !this.field7823.method4067() ? (float) this.field7823.fpsNumerator / (float) this.field7823.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)J")
    public final long method3201(int arg0) {
        field7835++;
        if (arg0 != -2369) {
            this.field7836 = -113;
        }
        return this.field7833;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    private final void method3202(int arg0, int arg1) {
        if (arg0 >= -63) {
            this.method3209((byte) 0);
        }
        field7827++;
        this.field7836 = arg1;
        if (!this.field7845) {
            return;
        }
        if (this.field7836 > this.field7841) {
            this.field7836 = this.field7841;
        }
        if (this.field7836 < 0) {
            this.field7836 = 0;
        }
        this.field7824.setPostProcessingLevel(this.field7836);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1164(OggPacket arg0, int arg1) {
        field7829++;
        if (this.field7845) {
            this.field7833 = class524.method3075(18);
            int var4 = this.field7824.decodePacketIn(arg0, this.field7828);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field7824.granuleFrame(this.field7828);
            this.field7839 = this.field7824.granuleTime(this.field7828);
            if (this.field7844) {
                boolean var5 = arg0.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field7844 = false;
            }
            if (!this.field7834 || arg0.isKeyFrame() == 1) {
                if (this.field7824.decodeFrame(this.field7819) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field7818 = true;
            }
        } else {
            int var3 = this.field7832.decodeHeader(this.field7823, this.field7825, arg0);
            if (var3 == 0) {
                this.field7845 = true;
                if (this.field7823.frameWidth > 2048 || this.field7823.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field7824 = new DecoderContext(this.field7823, this.field7832);
                this.field7828 = new GranulePos();
                this.field7819 = new Frame(this.field7823.frameWidth, this.field7823.frameHeight);
                this.field7841 = this.field7824.getMaxPostProcessingLevel();
                this.method3202(-118, this.field7836);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        if (arg1 != 0) {
            this.method3200(65);
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z")
    public static final boolean method3203(int arg0) {
        field7817++;
        if (arg0 != 0) {
            method3205(74, 100, 70, 35, 64, 17, -92, -1, -24);
        }
        return class152.field2350 != 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)I")
    public static final int method3204(int arg0, int arg1, byte arg2) {
        field7838++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg2 > -3) {
                method3206(-3, null);
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7842++;
        if (arg8 >= 1 && arg2 >= 1 && arg8 <= (class194.field2946 - 2) && arg2 <= class255.field3656 - 2) {
            int var9 = arg0;
            if (arg0 < 3 && class286.method1827(arg8, arg2, (byte) 109)) {
                var9 = arg0 + 1;
            }
            if (class63.field916.field10204.method368(17503) == 0 && !class46.method350(class700.field9654, 25380, arg2, var9, arg8)) {
                return;
            }
            if (class80.field1136 == null) {
                return;
            }
            class671.field9358.method1525(class326.field4655[arg0], 1, arg4, arg2, arg8, class736.field10316, arg0);
            if (arg7 >= 0) {
                int var10 = class63.field916.field10193.method2446(17503);
                class63.field916.method4111(123, 1, class63.field916.field10193);
                class671.field9358.method1534(var9, arg6, (byte) -124, arg0, arg8, arg7, arg3, arg1, class736.field10316, arg2, class326.field4655[arg0]);
                class63.field916.method4111(94, var10, class63.field916.field10193);
            }
        }
        if (arg5 != 16329) {
            field7822 = -95;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILns;)V")
    public static final void method3206(int arg0, class405 arg1) {
        field7830++;
        boolean var2 = false;
        if (class357.field5189 == arg1.field6100 || arg1.field6094 == -1 || arg1.field6056 != 0) {
            var2 = true;
        } else {
            class288 var3 = class742.field10404.method2663(0, arg1.field6094);
            if (var3.field4109 || (arg1.field6038 + 1) > var3.field4087[arg1.field6040]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field6100 - arg1.field6052;
            int var5 = class357.field5189 - arg1.field6052;
            int var6 = arg1.field6093 * 512 + arg1.method2579(false) * 256;
            int var7 = arg1.field6113 * 512 + (arg1.method2579(false) * 256);
            int var8 = arg1.field6086 * 512 + (arg1.method2579(false) * 256);
            int var9 = arg1.field6023 * 512 + (arg1.method2579(false) * 256);
            arg1.field8428 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field8423 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field6132 = 0;
        if (arg1.field6068 == 0) {
            arg1.method2585(false, 8192, (byte) 17);
        }
        if (arg1.field6068 == 1) {
            arg1.method2585(false, 12288, (byte) 17);
        }
        if (arg1.field6068 == 2) {
            arg1.method2585(false, 0, (byte) 17);
        }
        if (arg1.field6068 == 3) {
            arg1.method2585(false, 4096, (byte) 17);
        }
        if (arg0 != 28005) {
            field7821 = 9;
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)D")
    public final double method3207(int arg0) {
        int var2 = -115 % ((89 - arg0) / 33);
        field7837++;
        return this.field7839;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class548(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLha;)Lpga;")
    public final class536 method3208(byte arg0, class60 arg1) {
        field7846++;
        if (this.field7819 == null) {
            return null;
        } else if (this.field7818 || this.field7840 == null) {
            this.field7840 = arg1.method429(this.field7819.pixels, 0, this.field7819.field10069, this.field7819.field10069, this.field7819.field10070, false);
            this.field7818 = false;
            if (arg0 < 122) {
                this.field7833 = -35L;
            }
            return this.field7840;
        } else {
            return this.field7840;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Z")
    public final boolean method3209(byte arg0) {
        field7820++;
        if (arg0 != -11) {
            this.method3207(9);
        }
        return this.field7845;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method1165(int arg0) {
        if (this.field7819 != null) {
            this.field7819.method4068();
        }
        field7843++;
        if (this.field7824 != null) {
            this.field7824.method4068();
            this.field7824 = null;
        }
        if (this.field7828 != null) {
            this.field7828.method4068();
            this.field7828 = null;
        }
        this.field7823.method4068();
        this.field7825.method4068();
        int var2 = 9 / ((63 - arg0) / 49);
        this.field7832.method4068();
    }
}
