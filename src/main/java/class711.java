import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class711 extends class219 {

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field9984 = new VorbisInfo();

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field9985 = new VorbisComment();

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "D")
    private double field9979;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    private int field9972;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9975;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lwp;")
    private class193 field9973;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Lkb;")
    private class720 field9976;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field9977;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field9983;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 3)
    public final void method987(int arg0) {
        if (this.field9983 != null) {
            this.field9983.method4164();
        }
        ++field9987;
        if (arg0 == 0) {
            if (this.field9977 != null) {
                this.field9977.method4164();
            }
            this.field9985.method4164();
            this.field9984.method4164();
            if (this.field9976 != null) {
                this.field9976.method4079(arg0 + -128);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 33)
    public class711(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLjava/lang/String;II)V", line = 42)
    public static final void method4027(boolean arg0, String arg1, int arg2, int arg3) {
        class322.method1920(-121);
        ++field9975;
        if (~arg2 == -1) {
            class363.field4526 = class151.method1082(class323.field4014, 0, false, class118.field1503.field10648.method2427(0) * 2, class519.field7331, class109.field1370);
            if (arg1 != null) {
                class363.field4526.method13(0);
                class307 var4 = class158.method1111(class643.field8772, 0, class625.field8577, true);
                class67 var5 = class363.field4526.method579(var4, class600.method3418(class208.field2470, class643.field8772, 0), true);
                class419.method2502(-16315);
                class671.method3764(-102, arg1, var4, class363.field4526, true, var5);
            }
        } else {
            class66 var6 = null;
            if (arg1 != null) {
                var6 = class151.method1082(class323.field4014, 0, false, 0, class519.field7331, class109.field1370);
                var6.method13(0);
                class307 var7 = class158.method1111(class643.field8772, 0, class625.field8577, true);
                class67 var8 = var6.method579(var7, class600.method3418(class208.field2470, class643.field8772, 0), true);
                class419.method2502(arg3 ^ -16315);
                class671.method3764(arg3 + -52, arg1, var7, var6, true, var8);
            }
            boolean var24 = false;
            label216: {
                try {
                    var24 = true;
                    class363.field4526 = class151.method1082(class323.field4014, arg2, false, 2 * class118.field1503.field10648.method2427(arg3), class519.field7331, class109.field1370);
                    if (arg1 != null) {
                        var6.method13(0);
                        class307 var9 = class158.method1111(class643.field8772, 0, class625.field8577, true);
                        class67 var10 = var6.method579(var9, class600.method3418(class208.field2470, class643.field8772, 0), true);
                        class419.method2502(-16315);
                        class671.method3764(-60, arg1, var9, var6, true, var10);
                    }
                    if (class363.field4526.method599()) {
                        boolean var11 = true;
                        try {
                            var11 = class174.field2151.field1067 > 256;
                        } catch (Throwable var28) {
                        }
                        class435 var12;
                        if (var11) {
                            var12 = class363.field4526.method585(146800640);
                        } else {
                            var12 = class363.field4526.method585(104857600);
                        }
                        class363.field4526.method581(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label216;
                } catch (Throwable var29) {
                    int var13 = class118.field1503.field10665.method1903(0);
                    if (var13 == 2) {
                        class301.field3603 = true;
                    }
                    class118.field1503.method4295(class118.field1503.field10665, 0, false);
                    method4027(arg0, arg1, var13, 0);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method559((byte) 1);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method559((byte) 1);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method559((byte) 1);
                } catch (Throwable var27) {
                }
            }
        }
        class118.field1503.field10665.method1907(-89, !arg0);
        class118.field1503.method4295(class118.field1503.field10665, arg2, false);
        class372.method2177((byte) -55);
        class363.field4526.method615(10000);
        class363.field4526.method571(32);
        class93.field1234 = class363.field4526.method614();
        class203.field2438 = class363.field4526.method614();
        class587.method3368((byte) -125);
        class363.field4526.method586(~class118.field1503.field10645.method1130(arg3) == -2);
        if (class363.field4526.method603()) {
            class580.method3342((byte) 93, ~class118.field1503.field10667.method408(0) == -2);
        }
        class631.method3565(4, class363.field4526, class107.field1350 >> 3, class596.field8090 >> 3);
        class185.method1233(arg3 + -24497);
        class319.field3945 = false;
        class723.field10141 = true;
        class174.field2115 = null;
        class438.method2584(13827);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)D", line = 163)
    public final double method4028(byte arg0) {
        ++field9981;
        double var2 = this.field9979;
        if (arg0 > -5) {
            field9978 = -70;
        }
        if (this.field9976 != null) {
            var2 = this.field9976.method4078(126);
            if (var2 < 0.0D) {
                var2 = this.field9979;
            }
        }
        return (double) (-(256.0F / (float) class478.field6632)) + var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLqh;)I", line = 191)
    public static final int method4029(byte arg0, class75 arg1) {
        ++field9974;
        String var2 = class209.method1320(arg1, -101);
        int[] var3 = null;
        if (!class174.method1177(20, arg1.field1029)) {
            if (~arg1.field1032 != 0) {
                var3 = class121.field1555.method2882(arg1.field1032, -22087).field4245;
            } else if (!class247.method1488((byte) 72, arg1.field1029)) {
                if (class501.method2975(arg1.field1029, (byte) 109)) {
                    Object var4 = null;
                    class174 var5;
                    if (~arg1.field1029 != -1012) {
                        var5 = class379.field4811.method4192(27324, (int) (2147483647L & arg1.field1027 >>> 32));
                    } else {
                        var5 = class379.field4811.method4192(27324, (int) arg1.field1027);
                    }
                    if (var5.field2157 != null) {
                        var5 = var5.method1178(false, class2.field30);
                    }
                    if (var5 != null) {
                        var3 = var5.field2142;
                    }
                }
            } else {
                class273 var6 = (class273) class30.field444.method2121(87, (long) ((int) arg1.field1027));
                if (var6 != null) {
                    class388 var7 = var6.field3210;
                    class479 var8 = var7.field5003;
                    if (var8.field6636 != null) {
                        var8 = var8.method2843(class2.field30, 228);
                    }
                    if (var8 != null) {
                        var3 = var8.field6677;
                    }
                }
            }
        } else {
            var3 = class121.field1555.method2882((int) arg1.field1027, -22087).field4245;
        }
        if (var3 != null) {
            var2 = var2 + class686.method3839(0, var3);
        }
        int var9 = class332.field4108.method1817(false, var2, class256.field3026);
        int var10 = 63 / ((-9 - arg0) / 59);
        if (arg1.field1033) {
            var9 += class433.field5716.method1640() - -4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)I", line = 265)
    public final int method4030(byte arg0) {
        if (arg0 != 41) {
            return -108;
        } else {
            ++field9986;
            return this.field9976 != null ? this.field9976.method4071(-121) : 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLar;)Lhba;", line = 278)
    public static final class10 method4031(byte arg0, class712 arg1) {
        if (arg0 != 21) {
            method4029((byte) -50, (class75) null);
        }
        ++field9970;
        class10 var2;
        if (class446.field6010 != null) {
            var2 = class446.field6010;
            class446.field6010 = class446.field6010.field186;
            var2.field186 = null;
            --class46.field613;
        } else {
            var2 = new class10();
        }
        var2.field187 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 301)
    public final void method986(int arg0, OggPacket arg1) {
        ++field9980;
        if (arg0 != -1) {
            this.method4028((byte) 91);
        }
        if (super.field2569 < 3) {
            int var3 = this.field9984.headerIn(this.field9985, arg1);
            if (~var3 > -1) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            if (~super.field2569 == -3) {
                if (this.field9984.channels <= 2 && this.field9984.channels >= 1) {
                    this.field9977 = new DSPState(this.field9984);
                    this.field9983 = new VorbisBlock(this.field9977);
                    this.field9973 = new class193(this.field9984.rate, class478.field6632);
                    this.field9976 = new class720(this.field9984.channels);
                    return;
                }
                throw new RuntimeException(String.valueOf(this.field9984.channels));
            }
        } else {
            if (this.field9983.synthesis(arg1) == 0) {
                this.field9977.blockIn(this.field9983);
            }
            float[][] var4 = this.field9977.pcmOut(this.field9984.channels);
            this.field9979 = this.field9977.granuleTime();
            if (this.field9979 == -1.0D) {
                this.field9979 = (double) ((float) this.field9972 / (float) this.field9984.rate);
            }
            this.field9977.read(var4[0].length);
            this.field9972 += var4[0].length;
            class329 var5 = this.field9976.method4077(var4[0].length, this.field9979, (byte) -110);
            class503.method3021(var4, var5.field4064, arg0 ^ -16384);
            for (int var6 = 0; ~var6 > ~this.field9984.channels; ++var6) {
                var5.field4064[var6] = this.field9973.method1262(var5.field4064[var6], (byte) -41);
            }
            this.field9976.method4073(var5, false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)Lkb;", line = 366)
    public final class720 method4032(byte arg0) {
        if (arg0 > -9) {
            method4031((byte) 2, (class712) null);
        }
        ++field9969;
        return this.field9976;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Les;I)Lns;", line = 379)
    public static final class424 method4033(class403 arg0, int arg1) {
        int var2 = 15 % ((79 - arg1) / 43);
        ++field9982;
        class332 var3 = class33.method308(20118, arg0);
        int var4 = arg0.method2387(false);
        return new class424(var3.field4104, var3.field4105, var3.field4107, var3.field4109, var3.field4106, var4);
    }
}
