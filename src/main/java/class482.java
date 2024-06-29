import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class482 extends class340 {

    @OriginalMember(owner = "client!cga", name = "L", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field6665 = new VorbisInfo();

    @OriginalMember(owner = "client!cga", name = "K", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field6664 = new VorbisComment();

    @OriginalMember(owner = "client!cga", name = "y", descriptor = "[I")
    public static int[] field6653 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!cga", name = "x", descriptor = "Z")
    public static boolean field6652 = false;

    @OriginalMember(owner = "client!cga", name = "B", descriptor = "D")
    private double field6656;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "I")
    private int field6663;

    @OriginalMember(owner = "client!cga", name = "C", descriptor = "Ltg;")
    private class233 field6657;

    @OriginalMember(owner = "client!cga", name = "G", descriptor = "Lwb;")
    private class333 field6661;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "Lwba;")
    public static class50 field6654;

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field6660;

    @OriginalMember(owner = "client!cga", name = "A", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field6655;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Lwb;", line = 5)
    public final class333 method2707(byte arg0) {
        ++field6659;
        return arg0 <= 70 ? null : this.field6661;
    }

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)D", line = 20)
    public final double method2708(int arg0) {
        ++field6648;
        if (arg0 != 0) {
            this.method2711((byte) 79);
        }
        double var2 = this.field6656;
        if (this.field6661 != null) {
            var2 = this.field6661.method1977(false);
            if (var2 < 0.0D) {
                var2 = this.field6656;
            }
        }
        return (double) (-(256.0F / (float) class478.field6609)) + var2;
    }

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "(I)V", line = 44)
    public final void method1723(int arg0) {
        if (this.field6655 != null) {
            this.field6655.method3996();
        }
        ++field6662;
        if (arg0 != -1128) {
            this.method2708(114);
        }
        if (this.field6660 != null) {
            this.field6660.method3996();
        }
        this.field6664.method3996();
        this.field6665.method3996();
        if (this.field6661 != null) {
            this.field6661.method1973(arg0 ^ -1128);
        }
    }

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V", line = 68)
    public static final void method2709(int arg0) {
        ++field6658;
        if (class727.field10142 == null) {
            class727.field10142 = class386.method2260(-127);
            class704.field9876 = class727.field10142[0];
            class606.field8428 = class538.method2963(arg0 + 16751);
        }
        if (class633.field8786 == null) {
            class736.method4124(arg0 + 16798);
        }
        class386 var1 = class704.field9876;
        if (arg0 == -16798) {
            int var2 = class252.method1500(125);
            if (class704.field9876 == var1) {
                class49.field501 = class704.field9876.field5430.method4201(class723.field10095, (byte) 25);
                if (class704.field9876.field5420) {
                    class399.field5658 = (-class704.field9876.field5419 + class704.field9876.field5426) * var2 / 100 + class704.field9876.field5419;
                }
                if (class704.field9876.field5422) {
                    class49.field501 = class49.field501 + class399.field5658 + "%";
                }
            } else if (class704.field9876 == class386.field5450) {
                class633.field8786 = null;
                class237.method1429(3, false);
            } else {
                class49.field501 = var1.field5423.method4201(class723.field10095, (byte) 25);
                class399.field5658 = var1.field5426;
                if (class704.field9876.field5422) {
                    class49.field501 = class49.field501 + var1.field5426 + "%";
                }
                if (class704.field9876.field5420 || var1.field5420) {
                    class606.field8428 = class538.method2963(-47);
                }
            }
            if (class633.field8786 != null) {
                class633.field8786.method1165(class606.field8428, (byte) -119, class399.field5658, class704.field9876, class49.field501);
                if (class546.field7709 != null) {
                    for (int var3 = class282.field3740 + 1; ~class546.field7709.length < ~var3; ++var3) {
                        if (~class546.field7709[var3].method1052(arg0 + 16004) <= -101 && var3 + -1 == class282.field3740 && ~class713.field9949 <= -2 && class633.field8786.method1160((byte) 124)) {
                            try {
                                class546.field7709[var3].method1053(-31295);
                            } catch (Exception var4) {
                                class546.field7709 = null;
                                return;
                            }
                            class633.field8786.method1163((byte) -74, class546.field7709[var3]);
                            ++class282.field3740;
                            if (~class282.field3740 <= ~(class546.field7709.length + -1) && ~class546.field7709.length < -2) {
                                class282.field3740 = class165.field2069.method3301(1) ? 0 : -1;
                            }
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "(I)V", line = 174)
    public static void method2710(int arg0) {
        if (arg0 == -3) {
            field6653 = null;
            field6654 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(B)I", line = 186)
    public final int method2711(byte arg0) {
        if (arg0 > -14) {
            return -48;
        } else {
            ++field6651;
            return this.field6661 == null ? 0 : this.field6661.method1983(true);
        }
    }

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)V", line = 202)
    public static final void method2712(int arg0) {
        int var1 = -14 % ((-20 - arg0) / 38);
        if (class633.field8786 != null) {
            class633.field8786.method1167(false);
        }
        ++field6649;
        if (class430.field6043 != null) {
            while (true) {
                try {
                    class430.field6043.join();
                    return;
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 227)
    public class482(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 236)
    public final void method1724(OggPacket arg0, boolean arg1) {
        if (!arg1) {
            ++field6650;
            if (~super.field4578 > -4) {
                int var6 = this.field6665.headerIn(this.field6664, arg0);
                if (~var6 > -1) {
                    throw new IllegalStateException(String.valueOf(var6));
                } else if (~super.field4578 == -3) {
                    if (~this.field6665.channels >= -3 && this.field6665.channels >= 1) {
                        this.field6660 = new DSPState(this.field6665);
                        this.field6655 = new VorbisBlock(this.field6660);
                        this.field6657 = new class233(this.field6665.rate, class478.field6609);
                        this.field6661 = new class333(this.field6665.channels);
                    } else {
                        throw new RuntimeException(String.valueOf(this.field6665.channels));
                    }
                }
            } else {
                if (~this.field6655.synthesis(arg0) == -1) {
                    this.field6660.blockIn(this.field6655);
                }
                float[][] var3 = this.field6660.pcmOut(this.field6665.channels);
                this.field6656 = this.field6660.granuleTime();
                if (this.field6656 == -1.0D) {
                    this.field6656 = (double) ((float) this.field6663 / (float) this.field6665.rate);
                }
                this.field6660.read(var3[0].length);
                this.field6663 += var3[0].length;
                class401 var4 = this.field6661.method1981(this.field6656, var3[0].length, -99);
                class213.method1185(var3, (byte) -78, var4.field5670);
                for (int var5 = 0; var5 < this.field6665.channels; ++var5) {
                    var4.field5670[var5] = this.field6657.method1391(6, var4.field5670[var5]);
                }
                this.field6661.method1975((byte) 111, var4);
            }
        }
    }
}
