import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class314 extends class249 {

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    private int field4249;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "J")
    public static long field4254;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "[B")
    private byte[] field4245;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V", line = 3)
    public final void method1492(int arg0) {
        this.field4249 = 0;
        this.field4241 = 0;
        if (arg0 != 17168) {
            field4246 = 74;
        }
        field4240++;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)V", line = 19)
    public final void method1488(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4251 = this.field4250 - (arg0 < 0 ? -arg0 : arg0);
            this.field4252 = 4096;
            this.field4251 = this.field4251 * this.field4251 >> 12;
            this.field4249 = this.field4251;
        } else {
            this.field4252 = this.field4253 * this.field4251 >> 12;
            this.field4251 = this.field4250 - (arg0 >= 0 ? arg0 : -arg0);
            if (this.field4252 < 0) {
                this.field4252 = 0;
            } else if (this.field4252 > 4096) {
                this.field4252 = 4096;
            }
            this.field4251 = this.field4251 * this.field4251 >> 12;
            this.field4251 = this.field4252 * this.field4251 >> 12;
            this.field4249 += this.field4251 * this.field4247 >> 12;
            this.field4247 = this.field4257 * this.field4247 >> 12;
        }
        if (arg1 != 776104748) {
            this.method1937(-26, -106, (byte) -69);
        }
        field4255++;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)V", line = 57)
    public static final void method1936(byte arg0) {
        if (arg0 == -20) {
            class749.method4175(100);
            field4256++;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIB)V", line = 71)
    public void method1937(int arg0, int arg1, byte arg2) {
        this.field4245[arg0] = arg2;
        field4248++;
        if (arg1 != 0) {
            this.method1937(-1, 93, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lqk;IIZB)V", line = 84)
    public static final void method1938(class146 arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field4243++;
        int var5 = arg0.field2016;
        int var6 = arg0.field1997;
        if (arg4 > -26) {
            return;
        }
        if (arg0.field2018 == 0) {
            arg0.field2016 = arg0.field2091;
        } else if (arg0.field2018 == 1) {
            arg0.field2016 = arg1 - arg0.field2091;
        } else if (arg0.field2018 == 2) {
            arg0.field2016 = arg0.field2091 * arg1 >> 14;
        }
        if (arg0.field2078 == 0) {
            arg0.field1997 = arg0.field2095;
        } else if (arg0.field2078 == 1) {
            arg0.field1997 = arg2 - arg0.field2095;
        } else if (arg0.field2078 == 2) {
            arg0.field1997 = arg0.field2095 * arg2 >> 14;
        }
        if (arg0.field2018 == 4) {
            arg0.field2016 = arg0.field1997 * arg0.field1975 / arg0.field2059;
        }
        if (arg0.field2078 == 4) {
            arg0.field1997 = arg0.field2059 * arg0.field2016 / arg0.field1975;
        }
        if (class284.field3960 && (client.method2732(arg0).field6793 != 0 || arg0.field2112 == 0)) {
            if (arg0.field1997 < 5 && arg0.field2016 < 5) {
                arg0.field1997 = 5;
                arg0.field2016 = 5;
            } else {
                if (arg0.field2016 <= 0) {
                    arg0.field2016 = 5;
                }
                if (arg0.field1997 <= 0) {
                    arg0.field1997 = 5;
                }
            }
        }
        if (class543.field7887 == arg0.field1990) {
            class594.field8450 = arg0;
        }
        if (arg3 && arg0.field2051 != null && arg0.field2016 != var5 || arg0.field1997 != var6) {
            class362 var7 = new class362();
            var7.field5297 = arg0.field2051;
            var7.field5304 = arg0;
            class441.field6290.method3559(var7, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 170)
    public final void method1487(int arg0) {
        this.field4249 >>= 0x4;
        field4242++;
        this.field4247 = this.field4257;
        if (this.field4249 < 0) {
            this.field4249 = 0;
        } else if (this.field4249 > 255) {
            this.field4249 = 255;
        }
        this.method1937(this.field4241++, arg0 ^ arg0, (byte) this.field4249);
        this.field4249 = 0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILcs;)I", line = 188)
    public static final int method1939(int arg0, class335 arg1) {
        field4244++;
        if (arg0 >= -65) {
            field4254 = -46L;
        }
        if (arg1.field4571 == 0) {
            return 0;
        }
        if (arg1.field4576 != -1) {
            class335 var2 = null;
            if (arg1.field4576 < 32768) {
                class63 var3 = (class63) class389.field5608.method4020((long) arg1.field4576, (byte) -67);
                if (var3 != null) {
                    var2 = var3.field1004;
                }
            } else if (arg1.field4576 >= 32768) {
                var2 = class536.field7796[arg1.field4576 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field3923 - var2.field3923;
                int var5 = arg1.field3916 - var2.field3916;
                if (var4 != 0 || var5 != 0) {
                    arg1.method2059((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, false);
                }
            }
        }
        if (arg1 instanceof class639) {
            class639 var6 = (class639) arg1;
            if (var6.field9075 != -1 && (var6.field4637 == 0 || var6.field4643 > 0)) {
                var6.method2059(var6.field9075, false);
                var6.field9075 = -1;
            }
        } else if (arg1 instanceof class571) {
            class571 var7 = (class571) arg1;
            if (var7.field8222 != -1 && (var7.field4637 == 0 || var7.field4643 > 0)) {
                int var8 = var7.field3923 - ((var7.field8222 - class41.field693 - class41.field693) * 256);
                int var9 = var7.field3916 - ((var7.field8237 - class71.field1085 - class71.field1085) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method2059((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, false);
                }
                var7.field8222 = -1;
            }
        }
        return arg1.method2067(0);
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIIIFFF)V", line = 270)
    public class314(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4253 = (int) (arg7 * 4096.0F);
        this.field4250 = (int) (arg6 * 4096.0F);
        this.field4247 = this.field4257 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
