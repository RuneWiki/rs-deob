import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class616 extends class334 {

    @OriginalMember(owner = "client!hja", name = "M", descriptor = "I")
    private int field8740 = 1;

    @OriginalMember(owner = "client!hja", name = "E", descriptor = "I")
    private int field8733 = 0;

    @OriginalMember(owner = "client!hja", name = "N", descriptor = "I")
    private int field8741 = 0;

    @OriginalMember(owner = "client!hja", name = "L", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8739 = new BigInteger("c4e8e4a9aa32287496b19c94e6b63f3640a45c59a9a15b0ab82d073ac04732c4060889627974b9828a597fd844480ffb8335512f10411be71c505b31963e155984d9554a6e93a56b1a94086466f0069724e987cd8984a6cba9dab6806da005461c69e45ec50c9041ef074d2ebb4004a88e52d57a96a164f08283445b77b31f4247b49b257ab84cb010efe9a9c5c1260df98105d493184f912e22f4a01fdba22fddeb1398c225204fd2412888af23597e9b6298c5ec48fb59c190628af706836fe7363d7e014574926a6a77db7ea8f2fa62c320f7e1e672ffd6798e579866ea69b27fcecbf8cd06ce868396d70086605b10a5c80a74b816c7ffe3a5691dcac64a79e6859956080837be487430e84f01879f74609c3caa0a26d92ef47695b46a893b08ba2a74e8db148cb4b7d3ff341973106634865ba299eaf1e4a85bc865e7810da5c80f67be006d3899ecb9c29c1025f8d326276b178ce5ada293536e77092dd5fcd319702f461de6d67a3432683f67dec6665e3e02a0521fb823820ff5fb4710c4c71e837f173e7fd568849516e4c12eb1fb2f86bfbbd2dd65745ff177cd1d75beb4cf4a9eea6eb4c85fba9a8a80b20a396ed10617b4d16518ac412fc5b3eff2307d0d7f1cdc2ce52a08f36bb8a1a2a717b045b2a8e79d36765780a0e4656d1852047e70c7d1db692f56649b001e0516fb8c49f5c200f238ab995a66880b99", 16);

    @OriginalMember(owner = "client!hja", name = "O", descriptor = "[C")
    public static char[] field8742 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!hja", name = "F", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!hja", name = "G", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!hja", name = "H", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!hja", name = "I", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!hja", name = "J", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!hja", name = "P", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(Lgh;Lea;IILsea;BII)V")
    public static final void method3542(class506 arg0, class21 arg1, int arg2, int arg3, class416 arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 127) {
            field8743 = 50;
        }
        ++field8734;
        class421 var8 = new class421();
        var8.field5861 = arg6;
        var8.field5855 = arg7 << 9;
        var8.field5849 = arg3 << 9;
        if (arg4 == null) {
            if (arg0 != null) {
                var8.field5846 = arg0;
                class179 var11 = arg0.field6964;
                if (var11.field2683 != null) {
                    var8.field5841 = true;
                    var11 = var11.method1304(class578.field8328, arg5 + -26044);
                }
                if (var11 != null) {
                    var8.field5845 = var11.field2737 + arg7 << 9;
                    var8.field5848 = var11.field2737 + arg3 << 9;
                    var8.field5862 = class396.method2358(true, arg0);
                    var8.field5856 = var11.field2698 << 9;
                    var8.field5833 = var11.field2743;
                    var8.field5836 = var11.field2674;
                    var8.field5864 = var11.field2712 << 9;
                    var8.field5853 = var11.field2672;
                    var8.field5843 = var11.field2748;
                }
                class254.field3641.method3728((byte) 100, var8);
            } else if (arg1 != null) {
                var8.field5858 = arg1;
                var8.field5845 = arg7 + arg1.method209(true) << 9;
                var8.field5848 = arg1.method209(true) + arg3 << 9;
                var8.field5862 = class679.method3817(arg1, 0);
                var8.field5856 = 0;
                var8.field5853 = arg1.field220;
                var8.field5864 = arg1.field233 << 9;
                var8.field5843 = 256;
                var8.field5833 = arg1.field245;
                var8.field5836 = 256;
                class221.field3243.method4252(false, var8, (long) arg1.field4051);
            }
        } else {
            var8.field5857 = arg4;
            int var9 = arg4.field5776;
            int var10 = arg4.field5734;
            if (arg2 == 1 || ~arg2 == -4) {
                var10 = arg4.field5776;
                var9 = arg4.field5734;
            }
            var8.field5853 = arg4.field5766;
            var8.field5845 = arg7 + var9 << 9;
            var8.field5833 = arg4.field5780;
            var8.field5837 = arg4.field5722;
            var8.field5856 = arg4.field5750 << 9;
            var8.field5864 = arg4.field5788 << 9;
            var8.field5836 = arg4.field5786;
            var8.field5843 = arg4.field5694;
            var8.field5848 = arg3 + var10 << 9;
            var8.field5862 = arg4.field5710;
            var8.field5851 = arg4.field5706;
            var8.field5840 = arg4.field5691;
            var8.field5834 = arg4.field5700;
            if (arg4.field5736 != null) {
                var8.field5841 = true;
                var8.method2485(-110);
            }
            if (var8.field5837 != null) {
                var8.field5860 = var8.field5851 - -((int) ((double) (-var8.field5851 + var8.field5840) * Math.random()));
            }
            class628.field8911.method3728((byte) 114, var8);
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(JB)V")
    public static final void method3543(long arg0, byte arg1) {
        ++field8736;
        int var3 = class374.field5256;
        if (~class335.field4760 != ~var3) {
            int var4 = -class335.field4760 + var3;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (~var4 < -1) {
                if (~var5 == -1) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (~var5 != -1) {
                if (var4 > var5) {
                    var5 = var4;
                }
            } else {
                var5 = -1;
            }
            class335.field4760 += var5;
        }
        int var6 = 105 / ((93 - arg1) / 32);
        int var7 = class45.field598;
        class208.field3031 += (float) arg0 * class322.field4582 / 40.0F * 8.0F;
        class98.field1423 += (float) arg0 * class133.field2232 / 40.0F * 8.0F;
        if (class478.field6577 != var7) {
            int var8 = -class478.field6577 + var7;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (~var8 >= -1) {
                if (~var9 == -1) {
                    var9 = -1;
                } else if (~var8 < ~var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (~var8 > ~var9) {
                var9 = var8;
            }
            class478.field6577 += var9;
        }
        class494.method2894(-4);
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field8735;
        if (arg1 != -22563988) {
            field8739 = null;
        }
        int[] var3 = super.field4743.method1027((byte) -100, arg0);
        if (super.field4743.field1993) {
            int var4 = class527.field7361[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class439.field6099; ++var6) {
                int var7 = class295.field4296[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field8741 == -1) {
                    var9 = (-var4 + var7) * this.field8740;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field8740 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field8733 != -1) {
                    if (~this.field8733 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class254.field3643[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "()V")
    public class616() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "(B)V")
    public static void method3544(byte arg0) {
        field8739 = null;
        if (arg0 >= -103) {
            method3542((class506) null, (class21) null, -71, -1, (class416) null, (byte) -105, -105, -76);
        }
        field8742 = null;
    }

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        if (arg0 <= -27) {
            ++field8738;
            class177.method1292(0);
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            method3544((byte) -33);
        }
        ++field8737;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field8740 = arg2.method2557(14929);
                }
            } else {
                this.field8733 = arg2.method2557(14929);
            }
        } else {
            this.field8741 = arg2.method2557(14929);
        }
    }
}
