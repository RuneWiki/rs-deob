import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class167 extends class406 {

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[Lqm;")
    public static class77[] field2335 = new class77[32768];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 7)
    public static void method1128(boolean arg0) {
        if (!arg0) {
            field2334 = -13;
        }
        field2335 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lrd;I)[Lk;", line = 21)
    public static final class337[] method1129(class185 arg0, int arg1) {
        field2341++;
        if (!arg0.method1266(21)) {
            return new class337[0];
        }
        class315 var2 = arg0.method1272((byte) -128);
        while (var2.field4498 == 0) {
            class150.method907(10L, (byte) -32);
        }
        if (var2.field4498 == 2) {
            return new class337[0];
        }
        int[] var3 = (int[]) var2.field4497;
        class337[] var4 = new class337[var3.length >> 2];
        if (arg1 < 52) {
            return null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class337 var6 = new class337();
            var4[var5] = var6;
            var6.field4783 = var3[var5 << 2];
            var6.field4786 = var3[(var5 << 2) + 1];
            var6.field4785 = var3[(var5 << 2) + 2];
            var6.field4784 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 74)
    public static final byte[] method1130(boolean arg0, int arg1, Object arg2) {
        field2336++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class409.method2615(-82, var3) : var3;
        } else if (arg2 instanceof class95) {
            class95 var4 = (class95) arg2;
            return var4.method525(11499);
        } else {
            if (arg1 >= -10) {
                method1130(true, 93, (Object) null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lln;", line = 112)
    public static final class211 method1131(int arg0) {
        field2333++;
        if (arg0 != -9088) {
            field2334 = 1;
        }
        try {
            return (class211) Class.forName("ms").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)Z", line = 127)
    public static final boolean method1132(int arg0, int arg1, int arg2, int arg3) {
        if (!class261.method1746(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class161.field2122[arg0].method328(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class113.field1380) {
                    if (!class331.method2131(var4, var6, var5)) {
                        return false;
                    }
                    if (!class331.method2131(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class331.method2131(var4, var7, var5)) {
                        return false;
                    }
                    if (!class331.method2131(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class331.method2131(var4, var8, var5)) {
                    return false;
                }
                if (!class331.method2131(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class54.field655) {
                    if (!class331.method2131(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class331.method2131(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class331.method2131(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class331.method2131(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class331.method2131(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class331.method2131(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class113.field1380) {
                    if (!class331.method2131(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class331.method2131(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class331.method2131(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class331.method2131(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class331.method2131(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class331.method2131(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class54.field655) {
                    if (!class331.method2131(var4, var6, var5)) {
                        return false;
                    }
                    if (!class331.method2131(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class331.method2131(var4, var7, var5)) {
                        return false;
                    }
                    if (!class331.method2131(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class331.method2131(var4, var8, var5)) {
                    return false;
                }
                if (!class331.method2131(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class331.method2131(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class331.method2131(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class331.method2131(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class331.method2131(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class331.method2131(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIZI)V", line = 311)
    public static final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field2339++;
        class248 var10 = null;
        for (class248 var11 = (class248) class151.field1872.method506((byte) -128); var11 != null; var11 = (class248) class151.field1872.method514(true)) {
            if (var11.field3537 == arg5 && var11.field3540 == arg2 && var11.field3545 == arg0 && var11.field3538 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class248();
            var10.field3537 = arg5;
            var10.field3538 = arg6;
            var10.field3540 = arg2;
            var10.field3545 = arg0;
            class225.method1502(var10, false);
            class151.field1872.method509((byte) 127, var10);
        }
        if (arg8) {
            method1131(-47);
        }
        var10.field3542 = arg3;
        var10.field3535 = arg1;
        var10.field3539 = arg9;
        var10.field3541 = arg7;
        var10.field3543 = arg4;
    }
}
