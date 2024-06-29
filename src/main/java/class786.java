import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class class786 {

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field10802 = 0;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public static int field10810 = 0;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public int field10799;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field10800;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field10801;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field10803;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public int field10804;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field10805;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public static int field10806;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public static int field10808;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public int field10809;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public static int field10811;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field10812;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lha;Z)V", line = 11)
    public static final void method4304(class66 arg0, boolean arg1) {
        if (!arg1) {
            field10811 = 84;
        }
        field10805++;
        if (class546.field7706 != class251.field3549.field7710 && class378.field5427 != null && class28.method207(class251.field3549.field7710, arg0, (byte) -99)) {
            class546.field7706 = class251.field3549.field7710;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lnba;I)Ljava/lang/String;", line = 35)
    public static final String method4305(class312 arg0, int arg1) {
        field10800++;
        int var2 = 93 % ((arg1 - 21) / 39);
        if (arg0.field4636 == null || arg0.field4636.length() == 0) {
            return arg0.field4633 == null || arg0.field4633.length() <= 0 ? arg0.field4644 : arg0.field4644 + class674.field9583.method3825((byte) -10, class526.field7494) + arg0.field4633;
        } else if (arg0.field4633 == null || arg0.field4633.length() <= 0) {
            return arg0.field4644 + class674.field9583.method3825((byte) -10, class526.field7494) + arg0.field4636;
        } else {
            return arg0.field4644 + class674.field9583.method3825((byte) -10, class526.field7494) + arg0.field4633 + class674.field9583.method3825((byte) -10, class526.field7494) + arg0.field4636;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)Z", line = 66)
    public final boolean method4306(byte arg0) {
        field10801++;
        if (arg0 < 81) {
            method4305(null, 41);
        }
        return (this.field10809 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lha;Ld;B)V", line = 80)
    public static final void method4307(class66 arg0, class159 arg1, byte arg2) {
        field10803++;
        if (class436.field6206 == null) {
            return;
        }
        if (class261.field3682 < 10) {
            if (!class436.field6208.method3156((byte) 93, class436.field6206.field8665)) {
                class261.field3682 = class621.field8752.method3148(116, class436.field6206.field8665) / 10;
                return;
            }
            class118.method827(false);
            class261.field3682 = 10;
        }
        if (class261.field3682 == 10) {
            class436.field6239 = class436.field6206.field8662 >> 6 << 6;
            class436.field6233 = class436.field6206.field8663 >> 6 << 6;
            class436.field6225 = (class436.field6206.field8675 >> 6 << 6) + 64 - class436.field6233;
            class436.field6236 = (class436.field6206.field8661 >> 6 << 6) + 64 - class436.field6239;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class436.field6206.method3529((class251.field3549.field7719 >> 9) + class175.field2496, class251.field3549.field7710, var3, (class251.field3549.field7718 >> 9) + class103.field1295, false)) {
                var4 = var3[1] - class436.field6239;
                var5 = var3[2] - class436.field6233;
            }
            if (!class209.field3043 && var4 >= 0 && class436.field6236 > var4 && var5 >= 0 && class436.field6225 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class459.field6580 = var7;
                class450.field6465 = var6;
            } else if (class510.field7300 == -1 || class678.field9646 == -1) {
                class436.field6206.method3531((byte) 30, class436.field6206.field8670 & 0x3FFF, class436.field6206.field8670 >> 14 & 0x3FFF, var3);
                class450.field6465 = var3[2] - class436.field6233;
                class459.field6580 = var3[1] - class436.field6239;
            } else {
                class436.field6206.method3531((byte) 30, class678.field9646, class510.field7300, var3);
                class678.field9646 = -1;
                class510.field7300 = -1;
                class209.field3043 = false;
                if (var3 != null) {
                    class459.field6580 = var3[1] - class436.field6239;
                    class450.field6465 = var3[2] - class436.field6233;
                }
            }
            if (class436.field6206.field8666 == 37) {
                class436.field6216 = 3.0F;
                class436.field6217 = 3.0F;
            } else if (class436.field6206.field8666 == 50) {
                class436.field6216 = 4.0F;
                class436.field6217 = 4.0F;
            } else if (class436.field6206.field8666 == 75) {
                class436.field6216 = 6.0F;
                class436.field6217 = 6.0F;
            } else if (class436.field6206.field8666 == 100) {
                class436.field6216 = 8.0F;
                class436.field6217 = 8.0F;
            } else if (class436.field6206.field8666 == 200) {
                class436.field6216 = 16.0F;
                class436.field6217 = 16.0F;
            } else {
                class436.field6216 = 8.0F;
                class436.field6217 = 8.0F;
            }
            class436.field6222 = (int) class436.field6216 >> 1;
            class436.field6218 = class277.method1802((byte) 107, class436.field6222);
            class79.method601(true);
            class436.method2624();
            class425.field5983 = new class420();
            class436.field6220 += (int) (Math.random() * 5.0D) - 2;
            if (class436.field6220 < -8) {
                class436.field6220 = -8;
            }
            if (class436.field6220 > 8) {
                class436.field6220 = 8;
            }
            class436.field6219 += (int) (Math.random() * 5.0D) - 2;
            if (class436.field6219 < -16) {
                class436.field6219 = -16;
            }
            if (class436.field6219 > 16) {
                class436.field6219 = 16;
            }
            class436.method2615(arg1, class436.field6220 >> 2 << 10, class436.field6219 >> 1);
            class436.field6213.method3705((byte) -25, 1024, 256);
            class436.field6205.method3216(256, -1, 256);
            class436.field6209.method326(4096, 4);
            class324.field4862.method3267(0, 256);
            class261.field3682 = 20;
        } else if (class261.field3682 == 20) {
            class648.method3703(true, (byte) -77);
            class436.method2631(arg0, class436.field6220, class436.field6219);
            class261.field3682 = 60;
            class648.method3703(true, (byte) -47);
            class489.method2859(13102);
        } else if (class261.field3682 == 60) {
            if (class436.field6208.method3133(class436.field6206.field8665 + "_staticelements", true)) {
                if (!class436.field6208.method3156((byte) -70, class436.field6206.field8665 + "_staticelements")) {
                    return;
                }
                class436.field6215 = class655.method3756(class100.field1266, false, class436.field6206.field8665 + "_staticelements", class436.field6208);
            } else {
                class436.field6215 = new class242(0);
            }
            class436.method2619();
            class261.field3682 = 70;
            class648.method3703(true, (byte) -43);
            class489.method2859(13102);
        } else {
            if (arg2 < 104) {
                field10802 = -107;
            }
            if (class261.field3682 == 70) {
                class614.field8657 = new class734(arg0, 11, true, class359.field5219);
                class261.field3682 = 73;
                class648.method3703(true, (byte) -93);
                class489.method2859(13102);
            } else if (class261.field3682 == 73) {
                class518.field7405 = new class734(arg0, 12, true, class359.field5219);
                class261.field3682 = 76;
                class648.method3703(true, (byte) -54);
                class489.method2859(13102);
            } else if (class261.field3682 == 76) {
                class650.field9151 = new class734(arg0, 14, true, class359.field5219);
                class261.field3682 = 79;
                class648.method3703(true, (byte) -124);
                class489.method2859(13102);
            } else if (class261.field3682 == 79) {
                class682.field9684 = new class734(arg0, 17, true, class359.field5219);
                class261.field3682 = 82;
                class648.method3703(true, (byte) -81);
                class489.method2859(13102);
            } else if (class261.field3682 == 82) {
                class751.field10420 = new class734(arg0, 19, true, class359.field5219);
                class261.field3682 = 85;
                class648.method3703(true, (byte) -95);
                class489.method2859(13102);
            } else if (class261.field3682 == 85) {
                class363.field5252 = new class734(arg0, 22, true, class359.field5219);
                class261.field3682 = 88;
                class648.method3703(true, (byte) -38);
                class489.method2859(13102);
            } else if (class261.field3682 == 88) {
                class214.field3085 = new class734(arg0, 26, true, class359.field5219);
                class261.field3682 = 91;
                class648.method3703(true, (byte) -77);
                class489.method2859(13102);
            } else {
                class356.field5169 = new class734(arg0, 30, true, class359.field5219);
                class261.field3682 = 100;
                class648.method3703(true, (byte) -125);
                class489.method2859(13102);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)Z", line = 309)
    public final boolean method4308(boolean arg0) {
        field10812++;
        if (arg0) {
            return (this.field10809 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z", line = 322)
    public final boolean method4309(int arg0) {
        if (arg0 >= -121) {
            method4307(null, null, (byte) 122);
        }
        field10808++;
        return (this.field10809 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II[BLog;)Lhga;", line = 341)
    public static final class182 method4310(int arg0, int arg1, byte[] arg2, class673 arg3) {
        field10807++;
        if (arg2 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramRawARB(arg1, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class757.field10455, 0);
        if (class757.field10455[0] != -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
        if (arg0 != 25394) {
            field10811 = -47;
        }
        OpenGL.glBindProgramARB(arg1, 0);
        return new class182(arg3, arg1, var4);
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)Z", line = 373)
    public final boolean method4311(int arg0) {
        field10806++;
        if (arg0 == -1) {
            return (this.field10809 & 0x2) != 0;
        } else {
            return false;
        }
    }
}
