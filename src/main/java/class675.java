import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class675 extends class256 {

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "S")
    public short field9361;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "S")
    public short field9360;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "S")
    public short field9367;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "S")
    public short field9354;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Z")
    public boolean field9365;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "B")
    public byte field9368;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field9366;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field9369;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)I")
    public static final int method3758(byte arg0, int arg1, int arg2) {
        ++field9357;
        if (arg1 != 1 && ~arg1 != -4) {
            if (arg0 != 112) {
                field9363 = 59;
            }
            return class497.field6697[3 & arg2];
        } else {
            return class66.field827[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Z")
    public final boolean method1558(int arg0) {
        ++field9364;
        int var2 = this.field9367;
        if (arg0 > -100) {
            field9363 = -16;
        }
        while (~var2 >= ~this.field9361) {
            for (int var3 = this.field9354; this.field9360 >= var3; ++var3) {
                int var4 = var2 - (class458.field6258 - class183.field2779);
                if (var4 >= 0 && class672.field9269.length > var4) {
                    int var5 = -class610.field8134 + var3 - -class183.field2779;
                    if (~var5 <= -1 && var5 < class672.field9269.length && class672.field9269[var4][var5]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)Lmfa;")
    public static final class616 method3759(int arg0) {
        ++field9362;
        return arg0 != 1 ? null : class98.method729(-108, 1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
    public static final int method3760(int arg0, int arg1, int arg2) {
        ++field9356;
        int var3 = 0;
        if (arg2 <= 75) {
            field9363 = 100;
        }
        while (~arg1 < -1) {
            var3 = arg0 & 1 | var3 << 1;
            --arg1;
            arg0 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([Ltn;B)I")
    public final int method1557(class87[] arg0, byte arg1) {
        ++field9358;
        int var3 = 0;
        if (arg1 != -58) {
            return -53;
        } else {
            label118: for (int var4 = this.field9367; this.field9361 >= var4; ++var4) {
                label116: for (int var5 = this.field9354; this.field9360 >= var5; ++var5) {
                    long var6 = class458.field6263[super.field3508][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label111: while (true) {
                            if (~var8 < -49L) {
                                continue label116;
                            }
                            int var10 = (int) (var6 >>> (int) var8 & 65535L);
                            if (var10 <= 0) {
                                continue label116;
                            }
                            class690 var11 = class573.field7526[var10 + -1];
                            for (int var12 = 0; var3 > var12; ++var12) {
                                if (arg0[var12] == var11.field9602) {
                                    var8 += 16L;
                                    continue label111;
                                }
                            }
                            arg0[var3++] = var11.field9602;
                            if (var3 == 4) {
                                break label118;
                            }
                            var8 += 16L;
                        }
                    }
                }
            }
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg0[var13] = null;
            }
            if (~this.field9368 != -1) {
                int var14 = -class458.field6258 + this.field9367;
                int var15 = -class610.field8134 + this.field9354;
                short var16;
                int var17;
                int var18;
                short var19;
                if (~this.field9368 != -2) {
                    if (var15 <= -var14) {
                        var16 = this.field9354;
                        var17 = this.field9367 + 1;
                        var18 = this.field9354 - -1;
                        var19 = this.field9367;
                    } else {
                        var16 = this.field9354;
                        var17 = this.field9367 + -1;
                        var19 = this.field9367;
                        var18 = this.field9354 + -1;
                    }
                } else if (var15 > var14) {
                    var18 = this.field9354 + -1;
                    var19 = this.field9367;
                    var16 = this.field9354;
                    var17 = this.field9367 - -1;
                } else {
                    var18 = this.field9354 + 1;
                    var19 = this.field9367;
                    var16 = this.field9354;
                    var17 = this.field9367 + -1;
                }
                label82: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                    long var21 = class458.field6263[super.field3508][var19][var18];
                    while (var21 != 0L) {
                        class690 var27 = class573.field7526[(int) ((65535L & var21) + -1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var27.field9602) {
                            continue label82;
                        }
                    }
                    long var23 = class458.field6263[super.field3508][var17][var16];
                    while (var23 != 0L) {
                        class690 var26 = class573.field7526[(int) ((65535L & var23) + -1L)];
                        var23 >>>= 16;
                        if (arg0[var20] == var26.field9602) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                        arg0[var25] = arg0[var25 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(B)V")
    public void method794(byte arg0) {
        if (arg0 >= -125) {
            this.method1558(-62);
        }
        ++field9366;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lqha;")
    public static final class104 method3761(Component arg0, boolean arg1, byte arg2) {
        ++field9359;
        if (arg2 != 122) {
            field9363 = 67;
        }
        try {
            Constructor var3 = Class.forName("aga").getDeclaredConstructor(field9369 != null ? field9369 : (field9369 = method3763("java.awt.Component")), Boolean.TYPE);
            return (class104) var3.newInstance(arg0, new Boolean(arg1));
        } catch (Throwable var4) {
            return new class189(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3762(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9353;
        if (class435.method2502(arg1, (byte) -22)) {
            class209.method1394(-1, class747.field10393[arg1], arg4, arg2, (byte) 90, arg3);
            if (arg0 != 32280) {
                method3762(-85, -105, 60, -60, true);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lha;B)Z")
    public final boolean method1560(class59 arg0, byte arg1) {
        ++field9355;
        return arg1 != 35 ? false : class538.method2983((byte) 91, this.field9367, super.field3515, this.field9361, this.method808((byte) -87, arg0), this.field9360, this.field9354);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field9361 = (short) arg6;
        super.field3515 = (byte) arg1;
        super.field3508 = (byte) arg0;
        this.field9360 = (short) arg8;
        super.field3502 = arg4;
        this.field9367 = (short) arg5;
        this.field9354 = (short) arg7;
        this.field9365 = arg9;
        super.field3510 = arg3;
        super.field3505 = arg2;
        this.field9368 = arg10;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3763(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
