import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class227 extends class205 {

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    private int field4242 = 0;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    private int field4249 = 0;

    @OriginalMember(owner = "client!vi", name = "mb", descriptor = "I")
    private int field4259 = 0;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "[I")
    public static int[] field4247 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "Lvd;")
    public static class222 field4253 = class212.method1357("und haben es deaktiviert)3 Klicken Sie auf der", 10731);

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "Lph;")
    public static class166 field4256 = new class166(500);

    @OriginalMember(owner = "client!vi", name = "rb", descriptor = "[[I")
    public static int[][] field4264 = new int[104][104];

    @OriginalMember(owner = "client!vi", name = "pb", descriptor = "Lvd;")
    public static class222 field4262 = class212.method1357(" )2> <col=ff9040>", 10731);

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    private int field4243;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    private int field4244;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    private int field4248;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!vi", name = "kb", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!vi", name = "lb", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!vi", name = "nb", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!vi", name = "qb", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!vi", name = "sb", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!vi", name = "ob", descriptor = "Lr;")
    public static class178 field4261;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
    public static final void method1488(int arg0, int arg1) {
        ++field4252;
        class139 var2 = (class139) class217.field4032.method1517(0);
        if (arg0 != 20339) {
            field4262 = null;
        }
        while (var2 != null) {
            if (~((long) arg1) == ~(65535L & var2.field2555 >> 48)) {
                var2.method826(-22101);
            }
            var2 = (class139) class217.field4032.method1522(-1);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([BII)I")
    public static final int method1489(byte[] arg0, int arg1, int arg2) {
        ++field4254;
        if (arg2 != -1) {
            method1493(89, (class222) null);
        }
        return class175.method1104(arg0, (byte) -76, arg1, 0);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field4258;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4249 = (arg0.method661(255) << 12) / 100;
                }
            } else {
                this.field4242 = (arg0.method661(255) << 12) / 100;
            }
        } else {
            this.field4259 = arg0.method700((byte) 64);
        }
        int var5 = 122 / ((-47 - arg1) / 34);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lab;ILab;)V")
    public static final void method1490(class3 arg0, int arg1, class3 arg2) {
        if (arg1 != 4096) {
            method1488(19, -51);
        }
        class98.field1835 = arg0;
        class127.field2454 = arg2;
        ++field4260;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)[Lva;")
    public static final class219[] method1491(byte arg0) {
        class219[] var1 = new class219[class84.field1612];
        if (arg0 != 76) {
            field4262 = null;
        }
        for (int var2 = 0; ~class84.field1612 < ~var2; ++var2) {
            class219 var3 = new class219();
            var3.field4059 = class102.field1892;
            var3.field4060 = class223.field4182;
            var3.field4058 = class174.field3279[var2];
            var3.field4054 = class218.field4050[var2];
            var3.field4057 = class185.field3429[var2];
            var3.field4061 = class83.field1584[var2];
            var3.field4055 = class235.field4398;
            var3.field4056 = class157.field3020[var2];
            var1[var2] = var3;
        }
        ++field4246;
        class160.method1009(true);
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)V")
    public static void method1492(int arg0) {
        field4264 = null;
        if (arg0 == -7523) {
            field4247 = null;
            field4261 = null;
            field4253 = null;
            field4262 = null;
            field4256 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILvd;)Z")
    public static final boolean method1493(int arg0, class222 arg1) {
        ++field4263;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 != -28311) {
                method1492(100);
            }
            for (int var2 = 0; var2 < class86.field1630; ++var2) {
                if (arg1.method1452(class31.field657[var2], (byte) -126)) {
                    return true;
                }
            }
            return arg1.method1452(class17.field432.field853, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBI)V")
    private final void method1494(int arg0, int arg1, byte arg2, int arg3) {
        ++field4245;
        int var5 = ~arg3 > ~arg0 ? arg0 : arg3;
        if (arg2 > -108) {
            this.field4242 = 110;
        }
        int var6 = ~arg0 <= ~arg3 ? arg3 : arg0;
        int var7 = ~arg1 > ~var6 ? arg1 : var6;
        int var8 = ~var5 <= ~arg1 ? var5 : arg1;
        this.field4248 = (var7 + var8) / 2;
        int var9 = -var7 + var8;
        if (~this.field4248 < -1 && this.field4248 < 4096) {
            this.field4257 = (var9 << 12) / (~this.field4248 < -2049 ? -(this.field4248 * 2) + 8192 : this.field4248 * 2);
        } else {
            this.field4257 = 0;
        }
        if (~var9 >= -1) {
            this.field4251 = 0;
        } else {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (var8 - arg3 << 12) / var9;
            int var12 = (-arg1 + var8 << 12) / var9;
            if (~arg0 == ~var8) {
                this.field4251 = arg3 != var7 ? 4096 - var11 : 20480 - -var12;
            } else if (arg3 != var8) {
                this.field4251 = ~arg0 != ~var7 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field4251 = ~arg1 == ~var7 ? var10 + 4096 : -var12 + 12288;
            }
            this.field4251 /= 6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)V")
    private final void method1495(int arg0, int arg1, int arg2, int arg3) {
        ++field4255;
        int var5 = arg2 > 2048 ? arg0 + arg2 + -(arg0 * arg2 >> 12) : (4096 - -arg0) * arg2 >> 12;
        if (var5 <= 0) {
            this.field4244 = this.field4243 = this.field4265 = arg2;
        } else {
            int var6 = -var5 + arg2 + arg2;
            int var7 = arg1 * 6;
            int var8 = (-var6 + var5 << 12) / var5;
            int var10 = var8 * var5 >> 12;
            int var11 = var7 >> 12;
            int var12 = -(var11 << 12) + var7;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var6 + var13;
            if (var11 != 0) {
                if (~var11 != -2) {
                    if (var11 != 2) {
                        if (var11 != 3) {
                            if (~var11 != -5) {
                                if (var11 == 5) {
                                    this.field4244 = var5;
                                    this.field4243 = var6;
                                    this.field4265 = var14;
                                }
                            } else {
                                this.field4243 = var6;
                                this.field4244 = var15;
                                this.field4265 = var5;
                            }
                        } else {
                            this.field4265 = var5;
                            this.field4243 = var14;
                            this.field4244 = var6;
                        }
                    } else {
                        this.field4243 = var5;
                        this.field4244 = var6;
                        this.field4265 = var15;
                    }
                } else {
                    this.field4243 = var5;
                    this.field4244 = var14;
                    this.field4265 = var6;
                }
            } else {
                this.field4265 = var6;
                this.field4243 = var15;
                this.field4244 = var5;
            }
        }
        if (arg3 != 24309) {
            this.field4257 = -110;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field4250;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[][] var4 = this.method1323(0, arg0, -5920);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class118.field2245 > var11; ++var11) {
                this.method1494(var5[var11], var7[var11], (byte) -111, var6[var11]);
                this.field4248 += this.field4249;
                this.field4257 += this.field4242;
                for (this.field4251 += this.field4259; ~this.field4251 > -1; this.field4251 += 4096) {
                }
                if (this.field4248 < 0) {
                    this.field4248 = 0;
                }
                if (this.field4257 < 0) {
                    this.field4257 = 0;
                }
                if (~this.field4248 < -4097) {
                    this.field4248 = 4096;
                }
                if (~this.field4257 < -4097) {
                    this.field4257 = 4096;
                }
                while (this.field4251 > 4096) {
                    this.field4251 -= 4096;
                }
                this.method1495(this.field4257, this.field4251, this.field4248, 24309);
                var9[var11] = this.field4244;
                var8[var11] = this.field4243;
                var10[var11] = this.field4265;
            }
        }
        if (arg1 <= 98) {
            this.field4244 = 9;
        }
        return var3;
    }
}
