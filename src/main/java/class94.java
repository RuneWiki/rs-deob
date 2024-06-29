import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class class94 extends class383 {

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "S")
    public short field969;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "S")
    public short field973;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Lht;")
    public static class607 field965 = new class607("", 13);

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "J")
    public static long field962;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(B)V")
    public static final void method478(byte arg0) {
        for (int var1 = 0; ~class645.field9107 < ~var1; ++var1) {
            int var2 = class8.field90[var1];
            class600 var3 = ((class214) class274.field3433.method3669((long) var2, -1)).field2601;
            int var4 = class626.field8849.method620((byte) -127);
            if (~(var4 & 32) != -1) {
                var4 += class626.field8849.method620((byte) -126) << 8;
            }
            if ((4 & var4) != 0) {
                int var5 = class626.field8849.method662(true);
                int var6 = class626.field8849.method649(255);
                var3.method3742(var5, arg0 ^ -19305, class678.field9539, var6);
                var3.field9471 = class678.field9539 + 300;
                var3.field9426 = class626.field8849.method620((byte) 31);
            }
            if ((1024 & var4) != 0) {
                var3.field9459 = class626.field8849.method618(82);
                var3.field9414 = class626.field8849.method632(true);
                var3.field9480 = class626.field8849.method618(arg0 + 77);
                var3.field9491 = class626.field8849.method618(80);
                var3.field9479 = class626.field8849.method643((byte) -77) - -class678.field9539;
                var3.field9506 = class626.field8849.method619((byte) -38) - -class678.field9539;
                var3.field9500 = class626.field8849.method649(255);
                var3.field9459 += var3.field9517[0];
                var3.field9518 = 1;
                var3.field9414 += var3.field9513[0];
                var3.field9491 += var3.field9513[0];
                var3.field9480 += var3.field9517[0];
                var3.field9516 = 0;
            }
            if (~(8 & var4) != -1) {
                int[] var7 = new int[4];
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    var7[var8] = class626.field8849.method643((byte) -77);
                    if (~var7[var8] == -65536) {
                        var7[var8] = -1;
                    }
                }
                int var9 = class626.field8849.method649(arg0 ^ 251);
                class386.method2207(-3, var3, var7, var9);
            }
            if (~(8192 & var4) != -1) {
                int var10 = class626.field8849.method650((byte) -77);
                var3.field9419 = class626.field8849.method651((byte) -107);
                var3.field9430 = class626.field8849.method630(30426);
                var3.field9433 = var10 & 32767;
                var3.field9472 = ~(var10 & 32768) != -1;
                var3.field9493 = var3.field9433 + var3.field9419 + class678.field9539;
            }
            if ((var4 & 512) != 0) {
                int var11 = class626.field8849.method650((byte) -101);
                int var12 = class626.field8849.method673((byte) 125);
                if (~var11 == -65536) {
                    var11 = -1;
                }
                int var13 = class626.field8849.method651((byte) -124);
                var3.method3735(var12, arg0 ^ -128, var13, var11, true);
            }
            if ((var4 & 16) != 0) {
                if (var3.field8461.method1255((byte) 36)) {
                    class578.method3268(arg0 + -4, var3);
                }
                var3.method3368((byte) -110, class369.field5055.method342(arg0 ^ -14186, class626.field8849.method619((byte) -42)));
                var3.method3736(var3.field8461.field2524, arg0 ^ 4);
                var3.field9469 = var3.field8461.field2502 << 3;
                if (var3.field8461.method1255((byte) 111)) {
                    class394.method2232(var3, (class638) null, 0, var3.field9517[0], var3.field5166, 1480634889, (class236) null, var3.field9513[0]);
                }
            }
            if (~(var4 & 2) != -1) {
                var3.field9448 = class626.field8849.method650((byte) -64);
                if (var3.field9448 == 65535) {
                    var3.field9448 = -1;
                }
            }
            if ((64 & var4) != 0) {
                int var14 = class626.field8849.method643((byte) -77);
                int var15 = class626.field8849.method673((byte) 124);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var16 = class626.field8849.method649(arg0 + 251);
                var3.method3735(var15, -125, var16, var14, false);
            }
            if ((4096 & var4) != 0) {
                int var17 = class626.field8849.method630(30426);
                int[] var18 = new int[var17];
                int[] var19 = new int[var17];
                int[] var20 = new int[var17];
                for (int var21 = 0; ~var21 > ~var17; ++var21) {
                    int var22 = class626.field8849.method650((byte) -117);
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    var18[var21] = var22;
                    var19[var21] = class626.field8849.method649(255);
                    var20[var21] = class626.field8849.method623(class2.method13(arg0, 46));
                }
                class428.method2473(var3, var18, arg0 + -4, var20, var19);
            }
            if (~(var4 & 1) != -1) {
                var3.field8443 = class626.field8849.method623(arg0 + -108);
                var3.field8460 = class626.field8849.method643((byte) -77);
            }
            if (~(256 & var4) != -1) {
                var3.field9485 = class626.field8849.method618(arg0 + 109);
                var3.field9464 = class626.field8849.method632(true);
                var3.field9507 = class626.field8849.method632(true);
                var3.field9458 = (byte) class626.field8849.method630(arg0 ^ 30430);
                var3.field9460 = class678.field9539 - -class626.field8849.method643((byte) -77);
                var3.field9486 = class678.field9539 - -class626.field8849.method650((byte) -85);
            }
            if (~(2048 & var4) != -1) {
                int var23 = class626.field8849.method662(true);
                int var24 = class626.field8849.method620((byte) 47);
                var3.method3742(var23, -19309, class678.field9539, var24);
            }
            if ((128 & var4) != 0) {
                var3.field9454 = class626.field8849.method626(91);
                var3.field9461 = 100;
            }
        }
        if (arg0 == 4) {
            ++field966;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[Leq;)I")
    public final int method479(int arg0, class670[] arg1) {
        if (arg0 != -26355) {
            this.field969 = -118;
        }
        ++field968;
        return this.method2199(super.field5179 >> class559.field7984, super.field5176 >> class559.field7984, arg1, -40);
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(B)V")
    public static void method480(byte arg0) {
        if (arg0 != -15) {
            field962 = -128L;
        }
        field965 = null;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)Z")
    public final boolean method481(int arg0) {
        if (arg0 != 0) {
            method482(true, (byte) 66, (class464) null, (String) null, true);
        }
        ++field970;
        return class475.field6837[(super.field5179 >> class559.field7984) - (class309.field3830 - class460.field6544)][(super.field5176 >> class559.field7984) + -class379.field5139 + class460.field6544];
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z")
    public final boolean method183(byte arg0) {
        ++field972;
        int var2 = -87 / ((arg0 - 12) / 62);
        return false;
    }

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 < 20) {
            this.method483((byte) 26);
        }
        ++field963;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIILrb;Lr;Z)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (arg2 != 2) {
            this.field969 = -66;
        }
        ++field967;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZBLpi;Ljava/lang/String;Z)V")
    public static final void method482(boolean arg0, byte arg1, class464 arg2, String arg3, boolean arg4) {
        ++field961;
        if (arg1 > -18) {
            field965 = null;
        }
        if (!arg0) {
            class634.method3566(arg2, 3, 0, arg3);
        } else {
            if (class464.field6624.startsWith("win") && arg2.field6614) {
                String var5 = null;
                if (class591.field8347 != null) {
                    var5 = class591.field8347.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class88 var6 = class634.method3566(arg2, 0, 0, arg3);
                    class272.field3387 = var6;
                    class44.field428 = arg3;
                    class597.field8398 = arg2;
                    return;
                }
            }
            if (class464.field6624.startsWith("mac")) {
                String var7 = null;
                if (class591.field8347 != null) {
                    var7 = class591.field8347.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg4) {
                    class634.method3566(arg2, 1, 0, arg3);
                    return;
                }
            }
            class634.method3566(arg2, 2, 0, arg3);
        }
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)Z")
    public final boolean method483(byte arg0) {
        ++field964;
        if (arg0 < 101) {
            field965 = null;
        }
        return class504.method2895(super.field5179 >> class559.field7984, 12532, super.field5169, super.field5176 >> class559.field7984, this.method179(3370));
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIII)V")
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field5176 = arg2;
        super.field5179 = arg0;
        super.field5178 = arg1;
        this.field969 = (short) arg5;
        this.field973 = (short) arg6;
        super.field5169 = (byte) arg4;
        super.field5166 = (byte) arg3;
    }
}
