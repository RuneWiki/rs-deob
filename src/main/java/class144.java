import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class144 extends class396 {

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2033 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lra;")
    public static class57 field2031;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjf;)Ljf;", line = 3)
    public static final class119 method847(int arg0, class119 arg1) {
        field2036++;
        if (arg0 != -19393) {
            field2033 = null;
        }
        class119 var2 = client.method1086(arg1);
        if (var2 == null) {
            var2 = arg1.field1504;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 21)
    public static final void method848(int arg0, int arg1) {
        field2035++;
        class417 var2 = (class417) class201.field2774.method1204((byte) -120, (long) arg1);
        if (var2 != null) {
            var2.method2290((byte) 98);
            if (arg0 != 0) {
                field2037 = 30;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V", line = 39)
    public static void method849(byte arg0) {
        field2033 = null;
        field2031 = null;
        if (arg0 != -75) {
            method847(-69, (class119) null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILam;)[Ld;", line = 51)
    public static final class83[] method850(int arg0, class378 arg1) {
        field2034++;
        if (!arg1.method2383(0)) {
            return new class83[0];
        }
        class241 var2 = arg1.method2385(false);
        while (var2.field3268 == 0) {
            class278.method1757(10L, 0);
        }
        if (var2.field3268 == 2) {
            return new class83[0];
        }
        int[] var3 = (int[]) var2.field3270;
        class83[] var4 = new class83[var3.length >> 2];
        int var5 = 0;
        if (arg0 != -14773) {
            method850(-20, (class378) null);
        }
        while (var4.length > var5) {
            class83 var6 = new class83();
            var4[var5] = var6;
            var6.field938 = var3[var5 << 2];
            var6.field933 = var3[(var5 << 2) + 1];
            var6.field931 = var3[(var5 << 2) + 2];
            var6.field934 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)Z", line = 104)
    public static final boolean method851(int arg0, int arg1, int arg2, int arg3) {
        if (!class377.method2370(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class132.field1814[arg0].method1990(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class170.field2390) {
                    if (!class37.method223(var4, var6, var5)) {
                        return false;
                    }
                    if (!class37.method223(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class37.method223(var4, var7, var5)) {
                        return false;
                    }
                    if (!class37.method223(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class37.method223(var4, var8, var5)) {
                    return false;
                }
                if (!class37.method223(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class24.field238) {
                    if (!class37.method223(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class37.method223(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class37.method223(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class37.method223(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class37.method223(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class37.method223(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class170.field2390) {
                    if (!class37.method223(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class37.method223(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class37.method223(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class37.method223(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class37.method223(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class37.method223(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class24.field238) {
                    if (!class37.method223(var4, var6, var5)) {
                        return false;
                    }
                    if (!class37.method223(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class37.method223(var4, var7, var5)) {
                        return false;
                    }
                    if (!class37.method223(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class37.method223(var4, var8, var5)) {
                    return false;
                }
                if (!class37.method223(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class37.method223(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class37.method223(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class37.method223(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class37.method223(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class37.method223(var4, var8, var5);
        } else {
            return true;
        }
    }
}
