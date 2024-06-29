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

@OriginalClass("client!uea")
public class class315 extends class12 {

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field3936 = new SetupInfo();

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field3938 = new TheoraInfo();

    @OriginalMember(owner = "client!uea", name = "J", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field3940 = new TheoraComment();

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "Ldh;")
    public static class320 field3932 = new class320(111, -1);

    @OriginalMember(owner = "client!uea", name = "Y", descriptor = "I")
    public static int field3954 = -1;

    @OriginalMember(owner = "client!uea", name = "E", descriptor = "D")
    private double field3935;

    @OriginalMember(owner = "client!uea", name = "y", descriptor = "I")
    private int field3929;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!uea", name = "G", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!uea", name = "M", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!uea", name = "N", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!uea", name = "O", descriptor = "I")
    private int field3945;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!uea", name = "T", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!uea", name = "U", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!uea", name = "W", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!uea", name = "Z", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!uea", name = "x", descriptor = "J")
    private long field3928;

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "Lhu;")
    private class131 field3927;

    @OriginalMember(owner = "client!uea", name = "V", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field3951;

    @OriginalMember(owner = "client!uea", name = "A", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field3931;

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field3946;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "Z")
    private boolean field3926;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "Z")
    private boolean field3933;

    @OriginalMember(owner = "client!uea", name = "K", descriptor = "Z")
    private boolean field3941;

    @OriginalMember(owner = "client!uea", name = "X", descriptor = "Z")
    private boolean field3953;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "(I)V", line = 8)
    public final void method56(int arg0) {
        field3950++;
        if (this.field3931 != null) {
            this.field3931.method3981();
        }
        if (arg0 != 3376) {
            this.field3926 = true;
        }
        if (this.field3951 != null) {
            this.field3951.method3981();
            this.field3951 = null;
        }
        if (this.field3946 != null) {
            this.field3946.method3981();
            this.field3946 = null;
        }
        this.field3938.method3981();
        this.field3940.method3981();
        this.field3936.method3981();
    }

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "(I)J", line = 42)
    public final long method1871(int arg0) {
        if (arg0 > -18) {
            this.method1874(45);
        }
        field3939++;
        return this.field3928;
    }

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "(I)Z", line = 53)
    public final boolean method1872(int arg0) {
        if (arg0 != 321947886) {
            this.field3941 = true;
        }
        field3952++;
        return this.field3926;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILha;)Lhu;", line = 70)
    public final class131 method1873(int arg0, class58 arg1) {
        field3937++;
        if (this.field3931 == null) {
            return null;
        } else if (this.field3953 || this.field3927 == null) {
            this.field3927 = arg1.method324(this.field3931.pixels, arg0, this.field3931.field10024, this.field3931.field10024, this.field3931.field10025, false);
            this.field3953 = false;
            return this.field3927;
        } else {
            return this.field3927;
        }
    }

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "(I)F", line = 89)
    public final float method1874(int arg0) {
        if (arg0 != -30011) {
            method1879(null, -96);
        }
        field3949++;
        return this.field3926 && !this.field3938.method3982() ? (float) this.field3938.fpsNumerator / (float) this.field3938.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)Z", line = 104)
    public static final boolean method1875(int arg0, int arg1, int arg2) {
        field3930++;
        if (arg2 != -13230) {
            field3954 = 38;
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIILha;I)V", line = 115)
    public static final void method1876(int arg0, int arg1, int arg2, int arg3, class58 arg4, int arg5) {
        field3942++;
        if (arg0 < 110) {
            field3932 = null;
        }
        arg4.method432(arg5, arg3, arg1 + arg5, arg2 + arg3);
        arg4.method410(-16777216, arg5, arg2, -91, arg3, arg1);
        if (class284.field3471 < 100) {
            return;
        }
        float var6 = (float) class656.field9372 / (float) class656.field9373;
        int var7 = arg1;
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg1 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg1 - var7) / 2 + arg5;
        int var10 = (arg2 - var8) / 2 + arg3;
        if (class173.field2041 == null || class173.field2041.method503() != arg1 || class173.field2041.method509() != arg2) {
            class656.method3729(class656.field9386, class656.field9374 + class656.field9372, class656.field9386 + class656.field9373, class656.field9374, var9, var10, var9 + var7, var10 - -var8);
            class656.method3735(arg4);
            class173.field2041 = arg4.method396(var9, var10, var7, var8, false);
        }
        class173.field2041.method824(var9, var10);
        int var11 = class588.field8300 * var7 / class656.field9373;
        int var12 = class706.field9956 * var8 / class656.field9372;
        int var13 = class186.field2214 * var7 / class656.field9373 + var9;
        int var14 = var8 + var10 - (class701.field9890 * var8 / class656.field9372) - var12;
        int var15 = -1996554240;
        if (class99.field1034 == class15.field130) {
            var15 = -1996488705;
        }
        arg4.method370(var13, var14, var11, var12, var15, 1);
        arg4.method399(var13, var14, var11, var12, var15, 0);
        if (class303.field3790 <= 0) {
            return;
        }
        int var16;
        if (class233.field2750 <= 50) {
            var16 = class233.field2750 * 5;
        } else {
            var16 = 500 - class233.field2750 * 5;
        }
        for (class191 var17 = (class191) class656.field9361.method1719(65280); var17 != null; var17 = (class191) class656.field9361.method1723(-20665)) {
            class228 var18 = class656.field9360.method2054(36, var17.field2252);
            if (class633.method3633(0, var18)) {
                if (class22.field197 == var17.field2252) {
                    int var19 = var17.field2251 * var7 / class656.field9373 + var9;
                    int var20 = var10 + ((class656.field9372 - var17.field2256) * var8 / class656.field9372);
                    arg4.method410(var16 << 24 | 0xFFFF00, var19 - 2, 4, 73, var20 - 2, 4);
                } else if (class699.field9857 != -1 && class699.field9857 == var18.field2640) {
                    int var21 = var17.field2251 * var7 / class656.field9373 + var9;
                    int var22 = (class656.field9372 - var17.field2256) * var8 / class656.field9372 + var10;
                    arg4.method410(var16 << 24 | 0xFFFF00, var21 - 2, 4, -58, var22 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "(I)D", line = 217)
    public final double method1877(int arg0) {
        field3934++;
        return arg0 > -63 ? -1.9662831943601635D : this.field3935;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 232)
    public static void method1878(byte arg0) {
        int var1 = -76 / ((arg0 - 19) / 45);
        field3932 = null;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 245)
    public final void method55(OggPacket arg0, int arg1) {
        field3944++;
        int var3 = -33 % ((arg1 - 25) / 46);
        if (!this.field3926) {
            int var4 = this.field3936.decodeHeader(this.field3938, this.field3940, arg0);
            if (var4 == 0) {
                this.field3926 = true;
                if (this.field3938.frameWidth > 2048 || this.field3938.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field3951 = new DecoderContext(this.field3938, this.field3936);
                this.field3946 = new GranulePos();
                this.field3931 = new Frame(this.field3938.frameWidth, this.field3938.frameHeight);
                this.field3945 = this.field3951.getMaxPostProcessingLevel();
                this.method1881(-3486, this.field3929);
            } else if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            return;
        }
        this.field3928 = class652.method3700(-1);
        int var5 = this.field3951.decodePacketIn(arg0, this.field3946);
        if (var5 < 0) {
            throw new IllegalStateException(String.valueOf(var5));
        }
        this.field3951.granuleFrame(this.field3946);
        this.field3935 = this.field3951.granuleTime(this.field3946);
        if (this.field3933) {
            boolean var6 = arg0.isKeyFrame() == 1;
            if (!var6) {
                return;
            }
            this.field3933 = false;
        }
        if (!this.field3941 || arg0.isKeyFrame() == 1) {
            if (this.field3951.decodeFrame(this.field3931) != 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            this.field3953 = true;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lbg;I)V", line = 321)
    public static final void method1879(class463 arg0, int arg1) {
        class293.field3609 = arg0;
        if (arg1 != 1705) {
            field3932 = null;
        }
        field3948++;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILaa;JLtp;IIIB)V", line = 332)
    public static final void method1880(int arg0, int arg1, class485 arg2, long arg3, class532 arg4, int arg5, int arg6, int arg7, byte arg8) {
        field3947++;
        if (arg8 < 3) {
            return;
        }
        int var10 = arg5 * arg5 + arg7 * arg7;
        if (arg3 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg4.field7658 / 2, arg4.field7573 / 2);
        if (var11 * var11 >= var10) {
            class13.method58(arg7, arg4, arg6, false, arg1, arg5, arg2, class207.field2436[arg0]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class496.field7014 == 4) {
            var12 = (int) class227.field2590 & 0x3FFF;
        } else {
            var12 = (int) class227.field2590 + class34.field367 & 0x3FFF;
        }
        int var13 = class260.field3230[var12];
        int var14 = class260.field3229[var12];
        if (class496.field7014 != 4) {
            var13 = var13 * 256 / (class730.field10216 + 256);
            var14 = var14 * 256 / (class730.field10216 + 256);
        }
        int var15 = arg5 * var13 + arg7 * var14 >> 14;
        int var16 = arg5 * var14 - (arg7 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class511.field7292[arg0].method821((float) arg4.field7658 / 2.0F + (float) arg1 + (float) var19, (float) arg4.field7573 / 2.0F + (float) arg6 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)V", line = 385)
    private final void method1881(int arg0, int arg1) {
        this.field3929 = arg1;
        if (arg0 != -3486) {
            this.method1874(98);
        }
        field3943++;
        if (!this.field3926) {
            return;
        }
        if (this.field3929 > this.field3945) {
            this.field3929 = this.field3945;
        }
        if (this.field3929 < 0) {
            this.field3929 = 0;
        }
        this.field3951.setPostProcessingLevel(this.field3929);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 413)
    public class315(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "(I)Lgp;", line = 424)
    public static final class47 method1882(int arg0) {
        field3955++;
        if (arg0 <= 86) {
            field3954 = -117;
        }
        class47 var1 = (class47) class348.field4496.method2067(22462);
        if (var1 != null) {
            var1.method864(12983);
            var1.method3562((byte) -66);
            return var1;
        }
        class47 var2;
        do {
            var2 = (class47) class655.field9350.method2067(22462);
            if (var2 == null) {
                return null;
            }
            if (var2.method277((byte) 12) > class652.method3700(-1)) {
                return null;
            }
            var2.method864(12983);
            var2.method3562((byte) -81);
        } while ((Long.MIN_VALUE & var2.field8919) == 0L);
        return var2;
    }
}
