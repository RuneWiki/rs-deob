import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public abstract class class328 extends class61 {

    @OriginalMember(owner = "client!qja", name = "H", descriptor = "S")
    public short field4055;

    @OriginalMember(owner = "client!qja", name = "I", descriptor = "I")
    public static int field4056 = -1;

    @OriginalMember(owner = "client!qja", name = "G", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!qja", name = "J", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!qja", name = "K", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!qja", name = "L", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!qja", name = "M", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!qja", name = "N", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!qja", name = "O", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Llc;ILjava/awt/Frame;)V")
    public static final void method1947(class675 arg0, int arg1, Frame arg2) {
        ++field4061;
        while (true) {
            class561 var3 = arg0.method3796(arg2, -112);
            while (var3.field7769 == 0) {
                class594.method3405(10L, 16711680);
            }
            if (var3.field7769 == 1) {
                int var4 = 33 % ((7 - arg1) / 54);
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class594.method3405(100L, 16711680);
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(BILjava/awt/Canvas;Ld;Lbt;)Lha;")
    public static final class66 method1948(byte arg0, int arg1, Canvas arg2, class162 arg3, class48 arg4) {
        ++field4054;
        if (!class154.method1097((byte) 85)) {
            throw new RuntimeException("");
        } else {
            if (arg0 > -115) {
                field4056 = 40;
            }
            if (!class37.method326((byte) 127, "jaggl")) {
                throw new RuntimeException("");
            } else {
                OpenGL var5 = new OpenGL();
                long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg1);
                if (~var6 == -1L) {
                    throw new RuntimeException("");
                } else {
                    class439 var8 = new class439(var5, arg2, var6, arg3, arg4, arg1);
                    var8.method2717((byte) -124);
                    return var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qja", name = "g", descriptor = "(I)Z")
    public final boolean method529(int arg0) {
        ++field4058;
        if (arg0 != -31509) {
            field4056 = -28;
        }
        return class308.field3820[(super.field823 >> class714.field10017) + class573.field7852 + -class463.field6493][(super.field813 >> class714.field10017) + -class619.field8331 + class573.field7852];
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method523(class66 arg0, byte arg1) {
        int var3 = -124 % ((arg1 - 18) / 55);
        ++field4062;
        return class216.method1347(super.field811, 93, super.field813 >> class714.field10017, super.field823 >> class714.field10017);
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILha;ILkq;I)V")
    public static final void method1949(int arg0, class66 arg1, int arg2, class620 arg3, int arg4) {
        ++field4060;
        class513 var5 = arg3.method3531((byte) 38, arg1);
        if (var5 != null) {
            arg1.method556(arg4, arg2, arg3.field8506 + arg4, arg2 - -arg3.field8416);
            if (arg0 >= -122) {
                field4056 = 25;
            }
            if (class13.field218 != 2 && class13.field218 != 5 && class629.field8599 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (class7.field100 != 4) {
                    var6 = class300.field3596.field823;
                    var7 = (int) (-class47.field626) - -class579.field7884 & 16383;
                    var8 = class300.field3596.field813;
                    var9 = 4096 - class251.field2948 * 16;
                } else {
                    var9 = 4096;
                    var6 = class467.field6528;
                    var8 = class93.field1229;
                    var7 = 16383 & (int) (-class47.field626);
                }
                int var10 = -(class596.field8090 * 2) - -208 + var6 / 128 + 48;
                int var11 = class107.field1350 * 4 + -((class107.field1350 + -104) * 2) + -(var8 / 128) + 48;
                class629.field8599.method1842((float) arg3.field8506 / 2.0F + (float) arg4, (float) arg3.field8416 / 2.0F + (float) arg2, (float) var10, (float) var11, var9, var7 << 2, var5, arg4, arg2);
                for (class365 var12 = (class365) class274.field3216.method2725(37); var12 != null; var12 = (class365) class274.field3216.method2726(-117)) {
                    int var58 = var12.field4537;
                    int var59 = (class418.field5453.field1828[var58] >> 14 & 16383) + -class632.field8626;
                    int var60 = (16383 & class418.field5453.field1828[var58]) - class620.field8435;
                    int var61 = var59 * 4 + -(var6 / 128) + 2;
                    int var62 = var60 * 4 + -(var8 / 128) - -2;
                    class223.method1372(var62, arg3, arg4, arg2, var5, false, arg1, class418.field5453.field1830[var58], var61);
                }
                for (int var13 = 0; ~var13 > ~class551.field7657; ++var13) {
                    int var55 = class547.field7640[var13] * 4 + 2 - var6 / 128;
                    int var56 = class558.field7752[var13] * 4 - (var8 / 128 + -2);
                    class174 var57 = class379.field4811.method4192(27324, class36.field543[var13]);
                    if (var57.field2157 != null) {
                        var57 = var57.method1178(false, class2.field30);
                        if (var57 == null || ~var57.field2118 == 0) {
                            continue;
                        }
                    }
                    class223.method1372(var56, arg3, arg4, arg2, var5, false, arg1, var57.field2118, var55);
                }
                for (class667 var14 = (class667) class673.field9230.method2119(-45); var14 != null; var14 = (class667) class673.field9230.method2111((byte) 10)) {
                    int var50 = (int) (var14.field4809 >> 28 & 3L);
                    if (class384.field4910 == var50) {
                        int var51 = (int) (16383L & var14.field4809) - class632.field8626;
                        int var52 = -class620.field8435 + (int) (16383L & var14.field4809 >> 14);
                        int var53 = var51 * 4 - var6 / 128 + 2;
                        int var54 = var52 * 4 + -(var8 / 128) + 2;
                        class455.method2758(var54, class251.field2949[0], var53, var5, (byte) -6, arg2, arg4, arg3);
                    }
                }
                for (int var15 = 0; class3.field42 > var15; ++var15) {
                    class273 var45 = (class273) class30.field444.method2121(53, (long) class2.field29[var15]);
                    if (var45 != null) {
                        class388 var46 = var45.field3210;
                        if (var46.method2269((byte) -117) && class300.field3596.field808 == var46.field808) {
                            class479 var47 = var46.field5003;
                            if (var47 != null && var47.field6636 != null) {
                                var47 = var47.method2843(class2.field30, 228);
                            }
                            if (var47 != null && var47.field6669 && var47.field6700) {
                                int var48 = var46.field823 / 128 + -(var6 / 128);
                                int var49 = var46.field813 / 128 + -(var8 / 128);
                                if (~var47.field6633 != 0) {
                                    class223.method1372(var49, arg3, arg4, arg2, var5, false, arg1, var47.field6633, var48);
                                } else {
                                    class455.method2758(var49, class251.field2949[1], var48, var5, (byte) -6, arg2, arg4, arg3);
                                }
                            }
                        }
                    }
                }
                int var16 = class235.field2787;
                int[] var17 = class75.field1040;
                for (int var18 = 0; ~var18 > ~var16; ++var18) {
                    class521 var37 = class61.field825[var17[var18]];
                    if (var37 != null && var37.method3119((byte) -105) && !var37.field7366 && class300.field3596 != var37 && ~class300.field3596.field808 == ~var37.field808) {
                        int var38 = var37.field823 / 128 + -(var6 / 128);
                        int var39 = var37.field813 / 128 + -(var8 / 128);
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class651.field8992; ++var41) {
                            if (var37.field7399.equals(class375.field4702[var41]) && class340.field4225[var41] != 0) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class454.field6396 > var43; ++var43) {
                            if (var37.field7399.equals(class77.field1049[var43].field9056)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (class300.field3596.field7393 != 0 && var37.field7393 != 0 && class300.field3596.field7393 == var37.field7393) {
                            var44 = true;
                        }
                        if (var37.field7356) {
                            class455.method2758(var39, class251.field2949[6], var38, var5, (byte) -6, arg2, arg4, arg3);
                        } else if (!var44) {
                            if (!var37.field7353) {
                                if (!var40) {
                                    if (var42) {
                                        class455.method2758(var39, class251.field2949[5], var38, var5, (byte) -6, arg2, arg4, arg3);
                                    } else {
                                        class455.method2758(var39, class251.field2949[2], var38, var5, (byte) -6, arg2, arg4, arg3);
                                    }
                                } else {
                                    class455.method2758(var39, class251.field2949[3], var38, var5, (byte) -6, arg2, arg4, arg3);
                                }
                            } else {
                                class455.method2758(var39, class251.field2949[7], var38, var5, (byte) -6, arg2, arg4, arg3);
                            }
                        } else {
                            class455.method2758(var39, class251.field2949[4], var38, var5, (byte) -6, arg2, arg4, arg3);
                        }
                    }
                }
                class615[] var19 = class56.field756;
                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                    class615 var23 = var19[var20];
                    if (var23 != null && ~var23.field8259 != -1 && ~(class228.field2707 % 20) > -11) {
                        if (~var23.field8259 == -2) {
                            class273 var24 = (class273) class30.field444.method2121(74, (long) var23.field8258);
                            if (var24 != null) {
                                class388 var25 = var24.field3210;
                                int var26 = var25.field823 / 128 + -(var6 / 128);
                                int var27 = var25.field813 / 128 + -(var8 / 128);
                                class622.method3542(var5, arg2, var27, arg4, -93, 360000L, arg3, var26, var23.field8264);
                            }
                        }
                        if (~var23.field8259 == -3) {
                            int var28 = var23.field8261 / 128 - var6 / 128;
                            int var29 = var23.field8268 / 128 + -(var8 / 128);
                            long var30 = (long) (var23.field8267 << 7);
                            long var32 = var30 * var30;
                            class622.method3542(var5, arg2, var29, arg4, -125, var32, arg3, var28, var23.field8264);
                        }
                        if (~var23.field8259 == -11 && ~var23.field8258 <= -1 && class61.field825.length > var23.field8258) {
                            class521 var34 = class61.field825[var23.field8258];
                            if (var34 != null) {
                                int var35 = var34.field823 / 128 - var6 / 128;
                                int var36 = var34.field813 / 128 + -(var8 / 128);
                                class622.method3542(var5, arg2, var36, arg4, -113, 360000L, arg3, var35, var23.field8264);
                            }
                        }
                    }
                }
                if (~class7.field100 != -5) {
                    if (~class754.field10460 != -1) {
                        int var21 = -(var6 / 128) + 2 + (class754.field10460 * 4 - (2 + -(class300.field3596.method1665(1720746760) * 2)));
                        int var22 = class687.field9376 * 4 - (var8 / 128 + -2 + 2 + -(2 * class300.field3596.method1665(1720746760)));
                        class455.method2758(var22, class318.field3916[!class327.field4052 ? 0 : 1], var21, var5, (byte) -6, arg2, arg4, arg3);
                    }
                    if (!class300.field3596.field7366) {
                        arg1.method600(arg3.field8506 / 2 + arg4 + -1, arg2 + -1 - -(arg3.field8416 / 2), 785580130, -1, 3, 3);
                        return;
                    }
                }
            } else {
                arg1.method617(-16777216, var5, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(B[Lkp;)I")
    public final int method528(byte arg0, class515[] arg1) {
        if (arg0 != -48) {
            this.method523((class66) null, (byte) -59);
        }
        ++field4057;
        return this.method525(super.field813 >> class714.field10017, super.field823 >> class714.field10017, (byte) -123, arg1);
    }

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(IIIIII)V")
    public class328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field813 = arg2;
        super.field823 = arg0;
        super.field809 = arg1;
        super.field811 = (byte) arg4;
        super.field808 = (byte) arg3;
        this.field4055 = (short) arg5;
    }

    @OriginalMember(owner = "client!qja", name = "e", descriptor = "(B)Z")
    public static final boolean method1950(byte arg0) {
        ++field4059;
        if (arg0 <= 116) {
            return false;
        } else {
            class244 var1 = (class244) class130.field1611.method2725(37);
            if (var1 == null) {
                return false;
            } else {
                for (int var2 = 0; var1.field2880 > var2; ++var2) {
                    if (var1.field2875[var2] != null && var1.field2875[var2].field7769 == 0) {
                        return false;
                    }
                    if (var1.field2884[var2] != null && ~var1.field2884[var2].field7769 == -1) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
