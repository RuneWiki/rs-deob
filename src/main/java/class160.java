import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class160 {

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "J")
    public static long field2144 = 0L;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lbt;")
    public static class363 field2138 = new class363(16);

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lbt;")
    public static class363 field2146 = new class363(64);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2139++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
    public final int method1071(int arg0) {
        field2141++;
        if (arg0 < 40) {
            field2137 = 95;
        }
        return this.field2140;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)V")
    public static final void method1072(int arg0, boolean arg1) {
        field2136++;
        class125.field1658.method2300(arg0, arg1);
        class452.field6665.method2300(arg0, true);
        class202.field2859.method2300(arg0, true);
        class175.field2395.method2300(arg0, arg1);
        class399.field5775.method2300(arg0, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1073(int arg0, int arg1, int arg2, int arg3) {
        if (!class151.method1038(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class167.field2206;
        int var5 = arg2 << class167.field2206;
        int var6 = class215.field3069[arg0].method1429(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 == 1) {
            if (var4 > class339.field5004) {
                if (!class154.method1054(var4, var6, var5)) {
                    return false;
                }
                if (!class154.method1054(var4, var6, class100.field1271 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method1054(var4, var7, var5)) {
                    return false;
                }
                if (!class154.method1054(var4, var7, class100.field1271 + var5)) {
                    return false;
                }
            }
            if (class154.method1054(var4, var8, var5)) {
                return class154.method1054(var4, var8, class100.field1271 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class136.field1862) {
                if (!class154.method1054(var4, var6, class100.field1271 + var5)) {
                    return false;
                }
                if (!class154.method1054(class100.field1271 + var4, var6, class100.field1271 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method1054(var4, var7, class100.field1271 + var5)) {
                    return false;
                }
                if (!class154.method1054(class100.field1271 + var4, var7, class100.field1271 + var5)) {
                    return false;
                }
            }
            if (class154.method1054(var4, var8, class100.field1271 + var5)) {
                return class154.method1054(class100.field1271 + var4, var8, class100.field1271 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class339.field5004) {
                if (!class154.method1054(class100.field1271 + var4, var6, var5)) {
                    return false;
                }
                if (!class154.method1054(class100.field1271 + var4, var6, class100.field1271 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method1054(class100.field1271 + var4, var7, var5)) {
                    return false;
                }
                if (!class154.method1054(class100.field1271 + var4, var7, class100.field1271 + var5)) {
                    return false;
                }
            }
            if (class154.method1054(class100.field1271 + var4, var8, var5)) {
                return class154.method1054(class100.field1271 + var4, var8, class100.field1271 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class136.field1862) {
                if (!class154.method1054(var4, var6, var5)) {
                    return false;
                }
                if (!class154.method1054(class100.field1271 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class154.method1054(var4, var7, var5)) {
                    return false;
                }
                if (!class154.method1054(class100.field1271 + var4, var7, var5)) {
                    return false;
                }
            }
            if (class154.method1054(var4, var8, var5)) {
                return class154.method1054(class100.field1271 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class154.method1054(class135.field1852 + var4, var9, class135.field1852 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class154.method1054(var4, var8, class100.field1271 + var5);
        } else if (arg3 == 32) {
            return class154.method1054(class100.field1271 + var4, var8, class100.field1271 + var5);
        } else if (arg3 == 64) {
            return class154.method1054(class100.field1271 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class154.method1054(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1074(String arg0, byte arg1) {
        field2145++;
        if (arg1 != 5) {
            field2137 = 24;
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class17.method223(0, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class238.field3533; var3++) {
            String var4 = class163.field2161[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class17.method223(0, var4);
            if (var5 != null && var5.equals(var2)) {
                class238.field3533--;
                for (int var6 = var3; var6 < class238.field3533; var6++) {
                    class163.field2161[var6] = class163.field2161[var6 + 1];
                    class187.field2612[var6] = class187.field2612[var6 + 1];
                    class334.field4937[var6] = class334.field4937[var6 + 1];
                    class403.field5832[var6] = class403.field5832[var6 + 1];
                    class79.field996[var6] = class79.field996[var6 + 1];
                }
                class34.field487 = class26.field384;
                class441.field6415++;
                class257.method1773((byte) -10, class146.field1973);
                class159.field2132.method1727(-128, class248.method1646(arg0, (byte) -125));
                class159.field2132.method1712(arg0, arg1 - 102);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static void method1075(int arg0) {
        if (arg0 == 0) {
            field2146 = null;
            field2138 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V")
    public class160(int arg0, int arg1) {
        this.field2140 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static final void method1076(int arg0) {
        field2142++;
        if (class22.field310 == 0) {
            return;
        }
        try {
            if (++class263.field3899 > 2000) {
                if (class72.field933 != null) {
                    class72.field933.method2695(0);
                    class72.field933 = null;
                }
                if (class257.field3807 >= 1) {
                    class22.field310 = 0;
                    class244.field3616 = -5;
                    return;
                }
                if (class465.field6851 == field2147) {
                    class465.field6851 = class383.field5612;
                } else {
                    class465.field6851 = field2147;
                }
                class263.field3899 = 0;
                class257.field3807++;
                class22.field310 = 1;
            }
            if (class22.field310 == 1) {
                class199.field2818 = class267.field3963.method2206(class304.field4445, class465.field6851, true);
                class22.field310 = 2;
            }
            if (arg0 < -55) {
                if (class22.field310 == 2) {
                    if (class199.field2818.field5134 == 2) {
                        throw new IOException();
                    }
                    if (class199.field2818.field5134 != 1) {
                        return;
                    }
                    class72.field933 = new class440((Socket) class199.field2818.field5129, class267.field3963);
                    class199.field2818 = null;
                    class72.field933.method2694(class159.field2132.field3762, 1, class159.field2132.field3764, 0);
                    if (class423.field6115 != null) {
                        class423.field6115.method752(-104);
                    }
                    if (class182.field2565 != null) {
                        class182.field2565.method752(-61);
                    }
                    int var1 = class72.field933.method2697(-100);
                    if (class423.field6115 != null) {
                        class423.field6115.method752(-40);
                    }
                    if (class182.field2565 != null) {
                        class182.field2565.method752(-57);
                    }
                    if (var1 != 21) {
                        class244.field3616 = var1;
                        class22.field310 = 0;
                        class72.field933.method2695(0);
                        class72.field933 = null;
                        return;
                    }
                    class22.field310 = 3;
                }
                if (class22.field310 == 3) {
                    if (class72.field933.method2705(-92) < 1) {
                        return;
                    }
                    class404.field5852 = new String[class72.field933.method2697(-112)];
                    class22.field310 = 4;
                }
                if (class22.field310 == 4 && class72.field933.method2705(-84) >= class404.field5852.length * 8) {
                    class22.field306.field3762 = 0;
                    class72.field933.method2702(0, class404.field5852.length * 8, class22.field306.field3764, (byte) 118);
                    for (int var2 = 0; var2 < class404.field5852.length; var2++) {
                        class404.field5852[var2] = class104.method722(class22.field306.method1754(true), true);
                    }
                    class22.field310 = 0;
                    class244.field3616 = 21;
                    class72.field933.method2695(0);
                    class72.field933 = null;
                }
            }
        } catch (IOException var3) {
            if (class72.field933 != null) {
                class72.field933.method2695(0);
                class72.field933 = null;
            }
            if (class257.field3807 >= 1) {
                class22.field310 = 0;
                class244.field3616 = -4;
            } else {
                if (class465.field6851 == field2147) {
                    class465.field6851 = class383.field5612;
                } else {
                    class465.field6851 = field2147;
                }
                class263.field3899 = 0;
                class22.field310 = 1;
                class257.field3807++;
            }
        }
    }
}
