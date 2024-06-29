import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class604 extends class525 implements class559 {

    @OriginalMember(owner = "client!lia", name = "X", descriptor = "Z")
    private boolean field8383 = false;

    @OriginalMember(owner = "client!lia", name = "cb", descriptor = "Lvt;")
    public class736 field8388;

    @OriginalMember(owner = "client!lia", name = "U", descriptor = "Z")
    private boolean field8380;

    @OriginalMember(owner = "client!lia", name = "L", descriptor = "Lsea;")
    public static class399 field8371 = new class399();

    @OriginalMember(owner = "client!lia", name = "fb", descriptor = "Lus;")
    public static class328 field8391 = new class328(6, 3);

    @OriginalMember(owner = "client!lia", name = "lb", descriptor = "Lmq;")
    public static class78 field8397 = new class78(50, -1);

    @OriginalMember(owner = "client!lia", name = "J", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!lia", name = "K", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!lia", name = "M", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!lia", name = "N", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!lia", name = "O", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!lia", name = "P", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!lia", name = "Q", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!lia", name = "R", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!lia", name = "S", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!lia", name = "T", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!lia", name = "V", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!lia", name = "W", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!lia", name = "Y", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!lia", name = "Z", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!lia", name = "bb", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!lia", name = "db", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!lia", name = "eb", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!lia", name = "gb", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!lia", name = "hb", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!lia", name = "ib", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!lia", name = "jb", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!lia", name = "kb", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!lia", name = "ab", descriptor = "Lufa;")
    private class152 field8386;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lia", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field8398;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)I", line = 5)
    public static final int method3320(int arg0, int arg1) {
        ++field8395;
        if (arg1 != 22348) {
            method3322((byte) -126, -4, 29);
        }
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "(B)I", line = 17)
    public final int method269(byte arg0) {
        if (arg0 != 30) {
            this.field8383 = true;
        }
        ++field8376;
        return this.field8388.method4124((byte) 103);
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(Lha;B)Lufa;", line = 29)
    public final class152 method520(class454 arg0, byte arg1) {
        if (arg1 <= 114) {
            field8391 = null;
        }
        ++field8393;
        return this.field8386;
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)Z", line = 40)
    public final boolean method516(byte arg0) {
        if (arg0 > -67) {
            field8397 = null;
        }
        ++field8375;
        return false;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZLha;)V", line = 51)
    public final void method522(boolean arg0, class454 arg1) {
        ++field8370;
        if (!arg0) {
            class219 var3 = this.field8388.method4126(true, arg1, 262144, true, (byte) -116);
            if (var3 != null) {
                int var4 = super.field5790 >> 9;
                int var5 = super.field5784 >> 9;
                class376 var6 = arg1.method114();
                var6.method1963(super.field5790, super.field5791, super.field5784);
                this.field8388.method4122(arg1, var4, var5, var5, false, var3, var6, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)I", line = 76)
    public final int method735(int arg0) {
        if (arg0 != 24123) {
            this.field8388 = null;
        }
        ++field8379;
        return this.field8388.field10297;
    }

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "(B)Z", line = 87)
    public final boolean method256(byte arg0) {
        ++field8394;
        int var2 = -122 % ((-1 - arg0) / 36);
        return this.field8383;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lha;I)Lie;", line = 103)
    public final class607 method509(class454 arg0, int arg1) {
        ++field8392;
        class219 var3 = this.field8388.method4126(true, arg0, 2048, false, (byte) -124);
        if (var3 == null) {
            return null;
        } else {
            class376 var4 = arg0.method114();
            var4.method1963(super.field5790, super.field5791, super.field5784);
            class607 var5 = class311.method1814(arg1 ^ 9084, 1, this.field8380);
            if (arg1 != -8964) {
                return null;
            } else {
                int var6 = super.field5790 >> 9;
                int var7 = super.field5784 >> 9;
                this.field8388.method4122(arg0, var6, var7, var7, true, var3, var4, var6, false);
                if (class306.field3936) {
                    var3.method1375(var4, var5.field8425[0], class468.field6738, 0);
                } else {
                    var3.method1351(var4, var5.field8425[0], 0);
                }
                if (this.field8388.field10289 != null) {
                    class603 var8 = this.field8388.field10289.method2540();
                    if (class306.field3936) {
                        arg0.method155(var8, class468.field6738);
                    } else {
                        arg0.method102(var8);
                    }
                }
                this.field8383 = var3.method1338() || this.field8388.field10289 != null;
                if (this.field8386 != null) {
                    class465.method2750(super.field5791, this.field8386, super.field5790, var3, (byte) -123, super.field5784);
                } else {
                    this.field8386 = class517.method2966(super.field5790, var3, super.field5784, arg1 + 9080, super.field5791);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)I", line = 155)
    public final int method741(int arg0) {
        if (arg0 < 65) {
            this.field8388 = null;
        }
        ++field8389;
        return this.field8388.field10318;
    }

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "(I)V", line = 169)
    public static final void method3321(int arg0) {
        if (arg0 != 0) {
            method3323(67);
        }
        if (class681.field9312.field3240) {
            class722.field10162 = 96;
        } else {
            try {
                Method var1 = (field8398 != null ? field8398 : (field8398 = class696.method3874("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class722.field10162 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        ++field8373;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILha;)V", line = 210)
    public final void method732(int arg0, class454 arg1) {
        ++field8385;
        this.field8388.method4125(262144, arg1);
        if (arg0 != -10891) {
            this.field8388 = null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V", line = 221)
    public final void method736(byte arg0) {
        if (arg0 > -123) {
            this.method739((byte) 22);
        }
        ++field8384;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIBLha;)Z", line = 232)
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field8387;
        if (arg2 != -4) {
            field8391 = null;
        }
        class219 var5 = this.field8388.method4126(false, arg3, 131072, false, (byte) -126);
        if (var5 == null) {
            return false;
        } else {
            class376 var6 = arg3.method114();
            var6.method1963(super.field5790, super.field5791, super.field5784);
            return class306.field3936 ? var5.method1357(arg0, arg1, var6, false, 0, class468.field6738) : var5.method1378(arg0, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "(B)Z", line = 254)
    public final boolean method265(byte arg0) {
        ++field8369;
        int var2 = 19 / ((61 - arg0) / 45);
        return false;
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIII)V", line = 366)
    public class604(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class137.method857(arg9, arg8, (byte) -68));
        this.field8388 = new class736(arg0, arg1, arg8, arg9, super.field5779, arg3, this, arg7, arg10);
        this.field8380 = arg1.field3738 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(BII)I", line = 273)
    public static final int method3322(byte arg0, int arg1, int arg2) {
        if (arg0 <= 85) {
            field8397 = null;
        }
        ++field8374;
        if (~arg1 == 0) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg1) + var3;
        }
    }

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "(I)V", line = 296)
    public final void method523(int arg0) {
        if (arg0 != 0) {
            field8391 = null;
        }
        ++field8381;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZILmb;Lha;III)V", line = 309)
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        ++field8390;
        if (arg1 != 12473) {
            this.method256((byte) 111);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(B)Z", line = 320)
    public final boolean method739(byte arg0) {
        int var2 = -33 / (arg0 / 32);
        ++field8396;
        return this.field8388.method4123((byte) -38);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)I", line = 330)
    public final int method731(int arg0) {
        ++field8378;
        int var2 = -89 / ((arg0 - 36) / 42);
        return this.field8388.field10296;
    }

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "(I)I", line = 341)
    public final int method247(int arg0) {
        if (arg0 != 0) {
            this.field8380 = true;
        }
        ++field8372;
        return this.field8388.method4127((byte) -122);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lha;B)V", line = 352)
    public final void method740(class454 arg0, byte arg1) {
        ++field8382;
        if (arg1 < 16) {
            this.field8386 = null;
        }
        this.field8388.method4128(18119, arg0);
    }

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "(I)V", line = 376)
    public static void method3323(int arg0) {
        field8397 = null;
        if (arg0 == 1201463721) {
            field8371 = null;
            field8391 = null;
        }
    }
}
