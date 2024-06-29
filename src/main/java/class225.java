import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class225 extends class457 {

    @OriginalMember(owner = "client!kw", name = "Cc", descriptor = "I")
    public int field3227 = -1;

    @OriginalMember(owner = "client!kw", name = "zc", descriptor = "I")
    public int field3224 = -1;

    @OriginalMember(owner = "client!kw", name = "yc", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!kw", name = "Ac", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!kw", name = "Bc", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!kw", name = "Dc", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!kw", name = "Ec", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!kw", name = "Fc", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!kw", name = "Gc", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!kw", name = "Hc", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!kw", name = "Ic", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!kw", name = "Jc", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!kw", name = "Kc", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!kw", name = "Lc", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!kw", name = "Mc", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!kw", name = "Nc", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!kw", name = "Oc", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!kw", name = "Pc", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!kw", name = "Qc", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!kw", name = "Rc", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!kw", name = "Sc", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!kw", name = "Tc", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!kw", name = "Uc", descriptor = "Lei;")
    public class161 field3245;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kw", name = "Vc", descriptor = "Ljava/lang/Class;")
    public static Class field3246;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1444(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)I", line = 3)
    public final int method1433(boolean arg0) {
        ++field3238;
        if (arg0) {
            this.method1437(-127);
        }
        if (this.field3245.field2409 != null) {
            class161 var2 = this.field3245.method1114(class195.field2888, 0);
            if (var2 != null && var2.field2421 != -1) {
                return var2.field2421;
            }
        }
        return this.field3245.field2421 == -1 ? super.method1433(false) : this.field3245.field2421;
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V", line = 24)
    public static final void method1434(int arg0) {
        if (class503.field6878.field1090) {
            class202.field2968 = 96;
        } else {
            try {
                Method var1 = (field3246 != null ? field3246 : (field3246 = method1444("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class202.field2968 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        ++field3232;
        if (arg0 < 111) {
            field3228 = -37;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZI)V", line = 60)
    public final void method1435(int arg0, boolean arg1, int arg2) {
        ++field3229;
        int var4 = super.field6483[0];
        int var5 = super.field6477[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (!arg1) {
            if (arg2 == 1) {
                ++var4;
                ++var5;
            }
            if (arg2 == 2) {
                ++var4;
            }
            if (arg2 == 3) {
                ++var4;
                --var5;
            }
            if (~arg2 == -5) {
                --var5;
            }
            if (arg2 == 5) {
                --var4;
                --var5;
            }
            if (~arg2 == -7) {
                --var4;
            }
            if (arg2 == 7) {
                --var4;
                ++var5;
            }
            if (~super.field6398 != 0 && ~class301.field4465.method2763(super.field6398, 31696).field1809 == -2) {
                super.field6398 = -1;
            }
            if (super.field6417 != -1) {
                class586 var6 = class569.field7652.method2128(super.field6417, -1);
                if (var6.field8178 && ~var6.field8185 != 0 && class301.field4465.method2763(var6.field8185, 31696).field1809 == 1) {
                    super.field6417 = -1;
                }
            }
            if (super.field6443 != -1) {
                class586 var7 = class569.field7652.method2128(super.field6443, -1);
                if (var7.field8178 && ~var7.field8185 != 0 && ~class301.field4465.method2763(var7.field8185, 31696).field1809 == -2) {
                    super.field6443 = -1;
                }
            }
            if (~super.field6485 > -10) {
                ++super.field6485;
            }
            for (int var8 = super.field6485; var8 > 0; --var8) {
                super.field6483[var8] = super.field6483[var8 - 1];
                super.field6477[var8] = super.field6477[var8 + -1];
                super.field6482[var8] = super.field6482[var8 + -1];
            }
            super.field6483[0] = var4;
            super.field6482[0] = (byte) arg0;
            super.field6477[0] = var5;
        }
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)Z", line = 154)
    private final boolean method1436(int arg0) {
        ++field3231;
        int var2 = 42 % ((arg0 - -18) / 39);
        return this.field3245.field2433;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILoa;I)Z", line = 168)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        ++field3230;
        if (this.field3245 != null && this.method1441((byte) 94, 131072, arg2)) {
            class391 var5 = arg2.method401();
            if (arg1 != -8003) {
                this.method1442((byte) 40);
            }
            int var6 = super.field6395.method3589(true);
            var5.method1294(var6);
            var5.method1285(super.field509, super.field518, super.field514);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field6478.length; ++var8) {
                if (super.field6478[var8] != null && super.field6478[var8].method237(arg0, arg3, var5, this.field3245.field2463 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field6478[0] = super.field6478[1] = super.field6478[2] = super.field6478[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Z", line = 206)
    public final boolean method1437(int arg0) {
        ++field3243;
        if (this.field3245 == null) {
            return false;
        } else {
            return arg0 != 5757 ? true : true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLoa;)V", line = 224)
    public final void method552(boolean arg0, class638 arg1) {
        ++field3241;
        if (this.field3245 != null) {
            if (super.field6476 || this.method1441((byte) 94, 0, arg1)) {
                class391 var3 = arg1.method401();
                var3.method1294(super.field6395.method3589(arg0));
                if (!arg0) {
                    this.field3245 = null;
                }
                var3.method1285(super.field509, super.field518 + -20, super.field514);
                this.method2640(super.field6476, var3, 21831, arg1, super.field6478);
                super.field6478[0] = super.field6478[1] = super.field6478[2] = super.field6478[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)I", line = 251)
    public final int method1438(byte arg0) {
        if (arg0 > -27) {
            return -38;
        } else {
            ++field3235;
            if (this.field3245.field2409 != null) {
                class161 var2 = this.field3245.method1114(class195.field2888, 0);
                if (var2 != null && var2.field2432 != -1) {
                    return var2.field2432;
                }
            }
            return this.field3245.field2432;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZI)V", line = 273)
    public final void method1439(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field520 = (byte) arg1;
        ++field3236;
        if (super.field6398 != -1 && ~class301.field4465.method2763(super.field6398, 31696).field1809 == -2) {
            super.field6398 = -1;
        }
        if (super.field6417 != -1) {
            class586 var7 = class569.field7652.method2128(super.field6417, -1);
            if (var7.field8178 && ~var7.field8185 != 0 && class301.field4465.method2763(var7.field8185, 31696).field1809 == 1) {
                super.field6417 = -1;
            }
        }
        if (~super.field6443 != 0) {
            class586 var8 = class569.field7652.method2128(super.field6443, -1);
            if (var8.field8178 && var8.field8185 != -1 && ~class301.field4465.method2763(var8.field8185, 31696).field1809 == -2) {
                super.field6443 = -1;
            }
        }
        if (!arg4) {
            int var9 = arg2 - super.field6483[0];
            int var10 = -super.field6477[0] + arg5;
            if (~var9 <= 7 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                if (~super.field6485 > -10) {
                    ++super.field6485;
                }
                for (int var11 = super.field6485; ~var11 < -1; --var11) {
                    super.field6483[var11] = super.field6483[var11 - 1];
                    super.field6477[var11] = super.field6477[var11 + -1];
                    super.field6482[var11] = super.field6482[var11 - 1];
                }
                super.field6483[0] = arg2;
                super.field6477[0] = arg5;
                super.field6482[0] = 1;
                return;
            }
        }
        super.field6484 = 0;
        if (arg3 < 126) {
            this.field3245 = null;
        }
        super.field6479 = 0;
        super.field6483[0] = arg2;
        super.field6485 = 0;
        super.field6477[0] = arg5;
        super.field509 = (super.field6483[0] << 9) + (arg0 << 8);
        super.field514 = (super.field6477[0] << 9) - -(arg0 << 8);
        if (super.field6480 != null) {
            super.field6480.method2289();
        }
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)I", line = 348)
    public final int method179(int arg0) {
        ++field3226;
        return arg0 != -1 ? 75 : super.field6429;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILoa;)Lwc;", line = 359)
    public final class60 method555(int arg0, class638 arg1) {
        ++field3239;
        if (this.field3245 != null && this.method1441((byte) 94, 2048, arg1)) {
            class391 var3 = arg1.method401();
            int var4 = super.field6395.method3589(true);
            var3.method1294(var4);
            var3.method1285(super.field509, super.field518 + -20, super.field514);
            class308 var5 = this.method2636((byte) 123);
            class161 var6 = this.field3245.field2409 == null ? this.field3245 : this.field3245.method1114(class195.field2888, 0);
            if (class274.field3872.field881 && var6.field2440 && var5.field4580) {
                class131 var7 = ~super.field6398 != 0 && super.field6427 == 0 ? class301.field4465.method2763(super.field6398, 31696) : null;
                class131 var8 = ~super.field6464 == 0 || super.field6428 && var7 != null ? null : class301.field4465.method2763(super.field6464, arg0 + 31696);
                int var9 = 0;
                if (super.field6446 != 0) {
                    var9 = this.method2635(-110);
                }
                class352 var10 = class123.method873(this.field3245.field2430 & 255, 65535 & this.field3245.field2444, super.field6380, super.field6478[0], var8 == null ? super.field6450 : super.field6426, var4, arg1, super.field6456, var9, this.field3245.field2463, 65535 & this.field3245.field2458, super.field6441, 255 & this.field3245.field2475, var8 != null ? var8 : var7, 1206584353);
                if (var10 != null) {
                    arg1.method387(false);
                    var10.method205(var3, (class494) null, 0);
                    arg1.method387(true);
                }
            }
            var3.method1294(var4);
            var3.method1285(super.field509, super.field518 + -5, super.field514);
            class60 var11 = null;
            if (this.method1436(arg0 ^ -58)) {
                var11 = class450.method2583(super.field6478.length, false);
            }
            this.method2640(false, var3, arg0 ^ 21831, arg1, super.field6478);
            if (super.field6480 != null) {
                class281 var12 = super.field6480.method2288();
                arg1.method390(super.field6478, var12, var3, var11 != null ? var11.field818 : null, 0);
            } else {
                arg1.method393(super.field6478, var3, var11 != null ? var11.field818 : null, 0);
            }
            super.field6430 = class460.field6516;
            super.field6478[arg0] = super.field6478[1] = super.field6478[2] = super.field6478[3] = null;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V", line = 426)
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 >= ~arg1) {
            for (int var5 = arg2; ~arg1 < ~var5; ++var5) {
                class476.field6655[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg1; arg2 > var6; ++var6) {
                class476.field6655[var6][arg4] = arg0;
            }
        }
        ++field3234;
        if (arg3 < 59) {
            method1434(-45);
        }
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)Z", line = 461)
    public final boolean method140(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field3242;
            return false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILgfa;IIZLoa;)V", line = 473)
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        ++field3223;
        int var8 = -59 % (-arg3 / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BILoa;)Z", line = 486)
    private final boolean method1441(byte arg0, int arg1, class638 arg2) {
        ++field3225;
        int var4 = arg1;
        class308 var5 = this.method2636((byte) 71);
        class131 var6 = super.field6398 != -1 && ~super.field6427 == -1 ? class301.field4465.method2763(super.field6398, 31696) : null;
        class131 var7 = super.field6464 == -1 || super.field6428 && var6 != null ? null : class301.field4465.method2763(super.field6464, 31696);
        int var8 = var5.field4566;
        int var9 = var5.field4592;
        if (~var8 != -1 || ~var9 != -1 || var5.field4601 != 0 || ~var5.field4562 != -1) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field6435 != -1 && super.field6437 <= class239.field3440 && ~class239.field3440 > ~super.field6467;
        if (var10) {
            arg1 |= 524288;
        }
        class352 var11 = super.field6478[0] = this.field3245.method1113(class301.field4465, 8192, var6, super.field6393, arg2, var7, super.field6400, super.field6402, super.field6413, arg1, super.field6426, super.field6450, class195.field2888, class310.field4615, super.field6472);
        if (var11 == null) {
            return false;
        } else {
            super.field6429 = var11.method220();
            this.method2643(var11, 0);
            int var12 = super.field6395.method3589(true);
            if (var8 == 0 && ~var9 == -1) {
                this.method2634(var12, (byte) -61, this.method1722((byte) -127) << 9, 0, 0, this.method1722((byte) -124) << 9);
            } else {
                this.method2634(var12, (byte) -61, var9, var5.field4568, var5.field4582, var8);
                if (super.field6456 != 0) {
                    super.field6478[0].method233(super.field6456);
                }
                if (~super.field6441 != -1) {
                    super.field6478[0].method223(super.field6441);
                }
                if (~super.field6380 != -1) {
                    super.field6478[0].method224(0, super.field6380, 0);
                }
            }
            if (var10) {
                var11.method186(super.field6399, super.field6457, super.field6454, super.field6435 & 255);
            }
            if (arg0 != 94) {
                field3228 = -36;
            }
            if (~super.field6417 != 0 && ~super.field6423 != 0) {
                class586 var13 = class569.field7652.method2128(super.field6417, arg0 ^ -95);
                boolean var14 = var13.field8187 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field6416 != -1) {
                        var15 = var4 | 5;
                    }
                    if (~super.field6404 != -1) {
                        var15 |= 2;
                    }
                }
                class352 var16 = super.field6478[1] = var13.method3267(super.field6447, super.field6392, var15, class301.field4465, (byte) -64, arg2, super.field6423);
                if (var16 != null) {
                    if (~super.field6404 != -1) {
                        var16.method224(0, -super.field6404 << 2, 0);
                    }
                    if (~super.field6416 != -1) {
                        var16.method225(super.field6416 * 2048);
                    }
                    if (var14) {
                        if (super.field6456 != 0) {
                            var16.method233(super.field6456);
                        }
                        if (~super.field6441 != -1) {
                            var16.method223(super.field6441);
                        }
                        if (~super.field6380 != -1) {
                            var16.method224(0, super.field6380, 0);
                        }
                    }
                }
            } else {
                super.field6478[1] = null;
            }
            if (super.field6443 != -1 && super.field6445 != -1) {
                class586 var17 = class569.field7652.method2128(super.field6443, arg0 ^ -95);
                boolean var18 = var17.field8187 == 3 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (~super.field6386 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field6385 != -1) {
                        var19 |= 2;
                    }
                }
                class352 var20 = super.field6478[3] = var17.method3270(super.field6445, arg2, super.field6432, class301.field4465, super.field6448, var19, arg0 + -22349);
                if (var20 != null) {
                    if (~super.field6385 != -1) {
                        var20.method224(0, -super.field6385 << 2, 0);
                    }
                    if (super.field6386 != 0) {
                        var20.method225(super.field6386 * 2048);
                    }
                    if (var18) {
                        if (super.field6456 != 0) {
                            var20.method233(super.field6456);
                        }
                        if (~super.field6441 != -1) {
                            var20.method223(super.field6441);
                        }
                        if (~super.field6380 != -1) {
                            var20.method224(0, super.field6380, 0);
                        }
                    }
                }
            } else {
                super.field6478[3] = null;
            }
            super.field6478[2] = null;
            if (super.field6486 != null) {
                if (class239.field3440 >= super.field6486.field4436) {
                    super.field6486 = null;
                } else if (~super.field6486.field4425 >= ~class239.field3440) {
                    class352 var21 = super.field6486.method1850(7 | var4, arg0 ^ -95, arg2);
                    if (var21 != null) {
                        var21.method224(-super.field509 + super.field6486.field4428, super.field6486.field4434 - super.field518 + 5, -super.field514 + super.field6486.field4430);
                        if (~var12 != -1) {
                            var21.method225(var12);
                        }
                        super.field6478[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)I", line = 684)
    public final int method1442(byte arg0) {
        ++field3233;
        if (this.field3245.field2409 != null) {
            class161 var2 = this.field3245.method1114(class195.field2888, 0);
            if (var2 != null && ~var2.field2414 != 0) {
                return var2.field2414;
            }
        }
        return arg0 != 100 ? 10 : this.field3245.field2414;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V", line = 707)
    public final void method142(boolean arg0) {
        ++field3237;
        if (arg0) {
            field3228 = -105;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILei;)V", line = 718)
    public final void method1443(int arg0, class161 arg1) {
        this.field3245 = arg1;
        if (arg0 != 0) {
            this.field3227 = -124;
        }
        ++field3244;
        if (super.field6480 != null) {
            super.field6480.method2289();
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Loa;B)Lac;", line = 733)
    public final class496 method551(class638 arg0, byte arg1) {
        ++field3240;
        if (arg1 >= -62) {
            this.method1435(-13, false, 25);
        }
        return null;
    }
}
