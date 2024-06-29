import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class238 extends class108 implements class534 {

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Z")
    private boolean field3590;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Z")
    private boolean field3591;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "B")
    private byte field3582;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Z")
    private boolean field3570;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "B")
    private byte field3567;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "S")
    private short field3579;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "Z")
    private boolean field3580;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "Lia;")
    private class424 field3595;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "Lka;")
    private class336 field3576;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "[I")
    public static int[] field3575 = new int[1];

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Lqv;")
    public static class316 field3588 = new class316(96, 1);

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field3597 = 0;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field3598 = 1;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "[I")
    public static int[] field3596 = new int[1];

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field3599 = -1;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Lge;")
    public static class511 field3594 = new class511(64);

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Lem;")
    private class154 field3593;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V", line = 4)
    public static void method1574(byte arg0) {
        if (arg0 < 95) {
            field3596 = null;
        }
        field3594 = null;
        field3575 = null;
        field3588 = null;
        field3596 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 17)
    public final void method548(int arg0) {
        if (this.field3576 != null) {
            this.field3576.method1162();
        }
        ++field3572;
        int var2 = 30 % ((-37 - arg0) / 34);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)I", line = 30)
    public final int method561(byte arg0) {
        if (arg0 != -85) {
            return 40;
        } else {
            ++field3571;
            return 65535 & this.field3579;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I", line = 41)
    public final int method560(int arg0) {
        ++field3565;
        if (arg0 != -29863) {
            field3600 = 123;
        }
        return this.field3567;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILqa;I)Lka;", line = 56)
    private final class336 method1575(int arg0, class167 arg1, int arg2) {
        ++field3569;
        if (arg0 != 0) {
            this.field3570 = false;
        }
        if (this.field3576 != null && arg1.method252(this.field3576.method1166(), arg2) == 0) {
            return this.field3576;
        } else {
            class335 var4 = this.method1576(arg1, false, arg2, (byte) 58);
            return var4 != null ? var4.field4960 : null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqa;ZIB)Lso;", line = 80)
    private final class335 method1576(class167 arg0, boolean arg1, int arg2, byte arg3) {
        int var5 = -71 / ((-38 - arg3) / 54);
        ++field3578;
        class261 var6 = class277.field4139.method569((byte) 86, this.field3579 & 65535);
        class24 var7;
        class24 var8;
        if (this.field3570) {
            var7 = class393.field5594[0];
            var8 = class477.field6942[this.field3582];
        } else {
            if (this.field3582 >= 3) {
                var7 = null;
            } else {
                var7 = class393.field5594[this.field3582 - -1];
            }
            var8 = class393.field5594[this.field3582];
        }
        return var6.method1691(var7, arg0, -71, super.field1620, var8, 22, arg2, super.field1624, super.field1617, arg1, this.field3567);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLqa;)V", line = 109)
    public final void method557(byte arg0, class167 arg1) {
        ++field3589;
        Object var3 = null;
        int var4 = 18 % ((arg0 - 13) / 59);
        class424 var6;
        if (this.field3595 == null && this.field3580) {
            class335 var5 = this.method1576(arg1, true, 262144, (byte) -118);
            var6 = var5 != null ? var5.field4962 : null;
        } else {
            var6 = this.field3595;
            this.field3595 = null;
        }
        if (var6 != null) {
            class354.method2211(var6, this.field3582, super.field1620, super.field1617, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILqa;I)Lka;", line = 135)
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        ++field3586;
        return arg0 != -14322 ? null : this.method1575(arg0 + 14322, arg1, arg2);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)Z", line = 146)
    public final boolean method556(int arg0) {
        ++field3566;
        if (arg0 != -1) {
            method1577((String) null, -79);
        }
        return this.field3590;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I", line = 161)
    public final int method559(byte arg0) {
        if (arg0 < 3) {
            this.method554(-78, (class167) null);
        }
        ++field3584;
        return 22;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILqa;)Z", line = 172)
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field3587;
        if (arg2 <= 42) {
            this.field3576 = null;
        }
        class336 var5 = this.method1575(0, arg3, 131072);
        if (var5 != null) {
            class15 var6 = arg3.method312();
            var6.method47(super.field1620, super.field1624, super.field1617);
            return var5.method1131(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqa;I)V", line = 193)
    public final void method551(class167 arg0, int arg1) {
        ++field3585;
        Object var3 = null;
        class424 var5;
        if (this.field3595 == null && this.field3580) {
            class335 var4 = this.method1576(arg0, true, 262144, (byte) 106);
            var5 = var4 != null ? var4.field4962 : null;
        } else {
            var5 = this.field3595;
            this.field3595 = null;
        }
        if (arg1 < 62) {
            this.method1576((class167) null, false, 46, (byte) 51);
        }
        if (var5 != null) {
            class359.method2231(var5, this.field3582, super.field1620, super.field1617, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 224)
    public static final boolean method1577(String arg0, int arg1) {
        ++field3568;
        if (arg1 != 10) {
            field3588 = null;
        }
        return class293.method1886((byte) -123, true, 10, arg0);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lqa;B)Lem;", line = 241)
    public final class154 method562(class167 arg0, byte arg1) {
        ++field3581;
        if (this.field3593 == null) {
            this.field3593 = class332.method2104(super.field1624, this.method1575(0, arg0, 0), super.field1617, super.field1620, -127);
        }
        return arg1 >= -117 ? null : this.field3593;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqa;B)V", line = 255)
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 <= -119) {
            ++field3592;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILqa;)Lnj;", line = 269)
    public final class166 method554(int arg0, class167 arg1) {
        ++field3573;
        if (this.field3576 == null) {
            return null;
        } else {
            class15 var3 = arg1.method312();
            var3.method47(super.field1620, super.field1624, super.field1617);
            class166 var4 = null;
            if (this.field3591) {
                var4 = class392.method2363(3317, 1);
            }
            this.field3576.method1142(var3, var4 != null ? var4.field2497[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z", line = 295)
    public final boolean method547(int arg0) {
        ++field3577;
        int var2 = -125 / ((arg0 - -73) / 39);
        return this.field3580;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 305)
    public final void method549(boolean arg0) {
        this.field3590 = arg0;
        ++field3574;
        if (this.field3576 != null) {
            this.field3576.method1133(-65537 & this.field3576.method1166());
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lqa;Lku;IIIIZIZ)V", line = 321)
    public class238(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3943, arg1.field3909, arg1.field3939);
        this.field3590 = arg8;
        this.field3591 = ~arg1.field3872 != -1 && !arg6;
        this.field3582 = (byte) arg2;
        this.field3570 = arg6;
        super.field1620 = arg3;
        super.field1617 = arg5;
        this.field3567 = (byte) arg7;
        this.field3579 = (short) arg1.field3882;
        this.field3580 = arg0.method346() && arg1.field3929 && !this.field3570 && class220.field3371.method1213((byte) -35, class74.field1211) != 0;
        int var10 = 2048;
        if (this.field3590) {
            var10 |= 65536;
        }
        class335 var11 = this.method1576(arg0, this.field3580, var10, (byte) 89);
        if (var11 != null) {
            this.field3595 = var11.field4962;
            this.field3576 = var11.field4960;
            if (this.field3590) {
                this.field3576 = this.field3576.method1154((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILqa;ZLee;Z)V", line = 355)
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        if (arg4) {
            field3594 = null;
        }
        if (arg5 instanceof class238) {
            class238 var8 = (class238) arg5;
            if (this.field3576 != null && var8.field3576 != null) {
                this.field3576.method1157(var8.field3576, arg2, arg0, arg1, arg6);
            }
        }
        ++field3564;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)I", line = 382)
    public static final int method1578(int arg0, int arg1) {
        ++field3583;
        double var2 = (double) (255 & arg1 >> 16) / 256.0D;
        double var4 = (double) ((65355 & arg1) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 255) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (arg0 >= -76) {
            field3600 = 59;
        }
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (-var6 + var4) / (-var8 + var10);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (~var21 > -1) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 > -1) {
            var22 = 0;
        } else if (~var22 < -256) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 4;
        } else if (~var22 >= -218) {
            if (var22 > 192) {
                var21 >>= 2;
            } else if (~var22 < -180) {
                var21 >>= 1;
            }
        } else {
            var21 >>= 3;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 63) << 10);
    }
}
