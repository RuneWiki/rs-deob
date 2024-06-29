import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class521 extends class770 implements class466 {

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "Z")
    private boolean field7183 = false;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lwm;")
    public class443 field7170;

    @OriginalMember(owner = "client!jc", name = "nb", descriptor = "Z")
    private boolean field7187;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "Ldaa;")
    public static class453 field7169 = new class453();

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "Lada;")
    public static class267 field7185 = new class267();

    @OriginalMember(owner = "client!jc", name = "rb", descriptor = "[[Z")
    public static boolean[][] field7191 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!jc", name = "sb", descriptor = "Lqha;")
    public static class396 field7192 = new class396("WIP", 2);

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!jc", name = "ob", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!jc", name = "pb", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!jc", name = "qb", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "Ltja;")
    private class491 field7182;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILaka;)V", line = 3)
    public final void method3108(int arg0, class413 arg1) {
        if (arg0 != 262144) {
            this.method89(-70);
        }
        this.field7170.method2654(arg1, 24841);
        ++field7181;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method80(int arg0) {
        ++field7177;
        if (arg0 <= 63) {
            field7192 = null;
        }
        return this.field7183;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)I", line = 27)
    public final int method78(byte arg0) {
        if (arg0 >= -31) {
            return -87;
        } else {
            ++field7167;
            return this.field7170.method2664((byte) 100);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I", line = 40)
    public final int method756(byte arg0) {
        int var2 = -70 / ((arg0 - 48) / 51);
        ++field7190;
        return this.field7170.field6126;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILha;)V", line = 50)
    public static final void method3109(int arg0, class473 arg1) {
        ++field7176;
        int var2 = 0;
        int var3 = 0;
        if (class55.field651) {
            var2 = class236.method1611(-5110);
            var3 = class339.method2149((byte) 70);
        }
        arg1.method225(var2, var3, class742.field10226 - -var2, var3 + 350);
        arg1.method233(var2, var3, class742.field10226, 350, class605.field8487 << 24 | 3351159, 1);
        class338.method2144((byte) -34, class742.field10226 + var2, var3, var3 + 350, var2);
        int var4 = 350 / class43.field452;
        if (~class371.field5343 < -1) {
            int var5 = -class43.field452 + 342;
            int var6 = var4 * var5 / (var4 + -1 - -class371.field5343);
            int var7 = 4;
            if (class371.field5343 > 1) {
                var7 += (var5 - var6) * (-class534.field7390 + class371.field5343 + -1) / (class371.field5343 + -1);
            }
            arg1.method233(var2 - -class742.field10226 - 16, var3 + var7, 12, var6, class605.field8487 << 24 | 3351159, 2);
            for (int var8 = class534.field7390; ~(class534.field7390 + var4) < ~var8 && ~class371.field5343 < ~var8; ++var8) {
                String[] var9 = class24.method105(class74.field826[var8], 19478, '\b');
                int var10 = (class742.field10226 + -16 - 8) / var9.length;
                for (int var11 = 0; ~var11 > ~var9.length; ++var11) {
                    int var12 = var10 * var11 + 8;
                    arg1.method225(var2 - -var12, var3, var10 + var12 + var2 + -8, var3 + 350);
                    class559.field7865.method2653(-class625.field8757 + var3 + 350 + -class582.field8243.field4355 + -((-class534.field7390 + var8) * class43.field452) - 2, 118, -1, -16777216, var2 - -var12, class232.method1592(var9[var11], (byte) -78));
                }
            }
        }
        class78.field878.method2636(var3 - -330, -1, "Build: 646", var2 - 25 + class742.field10226, 0, -16777216);
        arg1.method225(var2, var3, class742.field10226 + var2, var3 + 350);
        if (arg0 <= 37) {
            field7192 = null;
        }
        arg1.method2816(class742.field10226, (byte) -83, var2, var3 - class625.field8757 + 350, -1);
        class386.field5515.method2653(var3 - -349 + -class705.field9812.field4355, 116, -1, -16777216, var2 + 10, "--> " + class232.method1592(class108.field1279, (byte) -78));
        if (class536.field7412) {
            int var13 = -1;
            if (class533.field7336 % 30 > 15) {
                var13 = 16777215;
            }
            arg1.method2811(var2 - -10 - -class705.field9812.method1953("--> " + class232.method1592(class108.field1279, (byte) -78).substring(0, class74.field829), (byte) 37), -class705.field9812.field4355 + var3 + 350 - 11, (byte) 127, 12, var13);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I", line = 131)
    public final int method762(boolean arg0) {
        ++field7189;
        if (!arg0) {
            this.field7187 = true;
        }
        return this.field7170.field6119;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lha;I)V", line = 142)
    public final void method757(class473 arg0, int arg1) {
        ++field7184;
        int var3 = 85 / ((arg1 - 13) / 37);
        this.field7170.method2657((byte) 91, arg0);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z", line = 153)
    public final boolean method755(byte arg0) {
        if (arg0 != -111) {
            return false;
        } else {
            ++field7174;
            return this.field7170.method2663(10505);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lha;Z)V", line = 167)
    public final void method763(class473 arg0, boolean arg1) {
        if (!arg1) {
            this.field7170.method2658(10, arg0);
            ++field7166;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 179)
    public final void method754(boolean arg0) {
        if (arg0) {
            field7169 = null;
        }
        ++field7186;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lha;Lro;IIIIIZIIIII)V", line = 194)
    public class521(class473 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field7170 = new class443(arg0, arg1, arg10, arg11, super.field3467, arg3, this, arg7, arg12);
        this.field7187 = ~arg1.field4137 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Lha;I)Ltja;", line = 204)
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            this.method77(-56);
        }
        ++field7173;
        return this.field7182;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILha;)Lrk;", line = 216)
    public final class289 method74(int arg0, class473 arg1) {
        if (arg0 <= 75) {
            this.method77(27);
        }
        ++field7180;
        class231 var3 = this.field7170.method2660((byte) -88, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class12 var4 = arg1.method153();
            var4.method50(super.field10593 + super.field3470, super.field3464, super.field10592 + super.field3460);
            class289 var5 = class122.method863(1, (byte) 108, this.field7187);
            int var6 = super.field3470 >> 9;
            int var7 = super.field3460 >> 9;
            this.field7170.method2667(var7, var6, 1, var6, true, var7, arg1, var3, var4);
            if (!class529.field7284) {
                var3.method1586(var4, var5.field4255[0], 0);
            } else {
                var3.method1580(var4, var5.field4255[0], class775.field10662, 0);
            }
            if (this.field7170.field6127 != null) {
                class714 var8 = this.field7170.field6127.method2402();
                if (!class529.field7284) {
                    arg1.method253(var8);
                } else {
                    arg1.method134(var8, class775.field10662);
                }
            }
            this.field7183 = var3.method1575() || this.field7170.field6127 != null;
            if (this.field7182 == null) {
                this.field7182 = class486.method2885(super.field3470, super.field3464, var3, super.field3460, 29289);
            } else {
                class33.method276(super.field3470, this.field7182, false, super.field3460, var3, super.field3464);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lha;I)V", line = 270)
    public final void method76(class473 arg0, int arg1) {
        int var3 = 21 % ((arg1 - -30) / 42);
        ++field7171;
        class231 var4 = this.field7170.method2660((byte) -88, false, arg0, 262144, true);
        if (var4 != null) {
            int var5 = super.field3470 >> 9;
            int var6 = super.field3460 >> 9;
            class12 var7 = arg0.method153();
            var7.method50(super.field3470, super.field3464, super.field3460);
            this.field7170.method2667(var6, var5, 1, var5, false, var6, arg0, var4, var7);
        }
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)V", line = 293)
    public static final void method3110(byte arg0) {
        ++field7168;
        class39 var1 = class129.field1672;
        synchronized (class129.field1672) {
            class129.field1672.method314(-2);
            if (arg0 != 105) {
                field7169 = null;
            }
        }
        class39 var2 = class356.field5132;
        synchronized (class356.field5132) {
            class356.field5132.method314(-2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z", line = 310)
    public static final boolean method3111(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method3112(75);
        }
        ++field7175;
        return class372.method2312(arg2, arg1, 33) | (arg2 & 458752) != 0 || class43.method345(arg1, arg2, 1024);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I", line = 321)
    public final int method760(int arg0) {
        if (arg0 != -27640) {
            this.field7182 = null;
        }
        ++field7172;
        return this.field7170.field6111;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILha;II)Z", line = 333)
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        if (arg2 != -31634) {
            field7185 = null;
        }
        ++field7188;
        class231 var5 = this.field7170.method2660((byte) -88, false, arg1, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class12 var6 = arg1.method153();
            var6.method50(super.field10593 + super.field3470, super.field3464, super.field10592 + super.field3460);
            return !class529.field7284 ? var5.method1578(arg0, arg3, var6, false, 0) : var5.method1570(arg0, arg3, var6, false, 0, class775.field10662);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z", line = 355)
    public final boolean method77(int arg0) {
        ++field7179;
        if (arg0 != 25833) {
            this.method760(45);
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)V", line = 373)
    public static void method3112(int arg0) {
        field7192 = null;
        field7185 = null;
        field7169 = null;
        if (arg0 == -658) {
            field7191 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I", line = 386)
    public final int method89(int arg0) {
        int var2 = -14 / ((arg0 - 69) / 48);
        ++field7178;
        return this.field7170.method2661(-16897);
    }
}
