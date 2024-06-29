import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class148 extends class208 implements class226 {

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "Z")
    private boolean field2375 = false;

    @OriginalMember(owner = "client!g", name = "rb", descriptor = "Lnb;")
    public class356 field2387;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "Z")
    private boolean field2383;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "Lsv;")
    public static class570 field2369 = new class570(53, -1);

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "[F")
    public static float[] field2386 = new float[4];

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!g", name = "sb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!g", name = "tb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "Lmg;")
    private class248 field2384;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "Low;")
    public static class665 field2381;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILha;)V")
    public final void method1163(int arg0, class475 arg1) {
        if (arg0 != 18030) {
            this.method1166(-15);
        }
        ++field2372;
        this.field2387.method2158(arg1, arg0 + -27182);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
    public final boolean method1164(byte arg0) {
        if (arg0 != 4) {
            field2386 = null;
        }
        ++field2368;
        return this.field2387.method2155((byte) -126);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIIIIIII)V")
    public class148(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5727 == 1, class98.method807(1, arg12, arg13));
        this.field2387 = new class356(arg0, arg1, arg12, arg13, super.field10361, arg3, this, arg7, arg14);
        this.field2383 = arg1.field5754 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
    public final int method1165(byte arg0) {
        ++field2366;
        if (arg0 <= 89) {
            field2386 = null;
        }
        return this.field2387.field5054;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(ILha;)V")
    public final void method192(int arg0, class475 arg1) {
        ++field2382;
        class233 var3 = this.field2387.method2152(true, arg1, -124, 262144, true);
        if (var3 != null) {
            class765 var4 = arg1.method457();
            var4.method1568(super.field10347, super.field10358, super.field10350);
            this.field2387.method2148(super.field3038, (byte) 111, super.field3027, var4, var3, super.field3035, false, arg1, super.field3030);
        }
        if (arg0 < 2) {
            this.method1172((byte) -46);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
    public final int method1166(int arg0) {
        int var2 = -112 / ((arg0 - 14) / 62);
        ++field2378;
        return this.field2387.field5067;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)I")
    public final int method1167(int arg0) {
        ++field2363;
        if (arg0 < 75) {
            this.method1164((byte) -66);
        }
        return this.field2387.method2147(110);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLea;)V")
    public static final void method1168(byte arg0, class21 arg1) {
        ++field2371;
        if (arg0 == 105) {
            class421 var2 = (class421) class221.field3243.method4253((long) arg1.field4051, -1);
            if (var2 != null) {
                if (var2.field5835 != null) {
                    class234.field3399.method4220(var2.field5835);
                    var2.field5835 = null;
                }
                var2.method4237(-1);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILha;Lnfa;ZI)V")
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        ++field2367;
        if (arg0 == -24659) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(ILha;)V")
    public final void method1169(int arg0, class475 arg1) {
        ++field2377;
        this.field2387.method2157(arg1, (byte) -42);
        if (arg0 != -10526) {
            this.method205((byte) -70, (class475) null);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(BLha;)Lmg;")
    public final class248 method205(byte arg0, class475 arg1) {
        ++field2374;
        if (arg0 != 45) {
            field2386 = null;
        }
        return this.field2384;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)Z")
    public final boolean method1170(int arg0) {
        ++field2389;
        if (arg0 != 16383) {
            this.field2384 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public final void method196(int arg0) {
        ++field2376;
        if (arg0 != -10382) {
            this.method205((byte) -111, (class475) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)Z")
    public final boolean method197(boolean arg0) {
        if (!arg0) {
            this.method1175((byte) 1);
        }
        ++field2364;
        return false;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(Z)V")
    public static void method1171(boolean arg0) {
        if (arg0) {
            field2386 = null;
            field2369 = null;
            field2381 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BIILha;)Z")
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field2365;
        int var5 = -77 / ((51 - arg0) / 51);
        class233 var6 = this.field2387.method2152(false, arg3, -121, 131072, false);
        if (var6 == null) {
            return false;
        } else {
            class765 var7 = arg3.method457();
            var7.method1568(super.field10347, super.field10358, super.field10350);
            return class765.field10581 ? var6.method584(arg1, arg2, var7, false, 0, class349.field4956) : var6.method589(arg1, arg2, var7, false, 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lha;I)Luh;")
    public final class162 method204(class475 arg0, int arg1) {
        ++field2385;
        if (arg1 != -1) {
            return null;
        } else {
            class233 var3 = this.field2387.method2152(true, arg0, arg1 ^ 118, 2048, false);
            if (var3 == null) {
                return null;
            } else {
                class765 var4 = arg0.method457();
                var4.method1568(super.field10347, super.field10358, super.field10350);
                class162 var5 = class527.method3085(1, this.field2383, 0);
                this.field2387.method2148(super.field3038, (byte) 111, super.field3027, var4, var3, super.field3035, true, arg0, super.field3030);
                if (!class765.field10581) {
                    var3.method575(var4, var5.field2500[0], 0);
                } else {
                    var3.method546(var4, var5.field2500[0], class349.field4956, 0);
                }
                if (this.field2387.field5071 != null) {
                    class667 var6 = this.field2387.field5071.method1346();
                    if (!class765.field10581) {
                        arg0.method455(var6);
                    } else {
                        arg0.method429(var6, class349.field4956);
                    }
                }
                this.field2375 = var3.method558() || this.field2387.field5071 != null;
                if (this.field2384 == null) {
                    this.field2384 = class229.method1563(super.field10350, super.field10358, (byte) -103, var3, super.field10347);
                } else {
                    class182.method1319(super.field10350, super.field10347, super.field10358, this.field2384, var3, (byte) 50);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public final void method1172(byte arg0) {
        ++field2373;
        if (arg0 < 72) {
            this.field2383 = true;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)I")
    public final int method1173(boolean arg0) {
        ++field2379;
        return !arg0 ? -41 : this.field2387.method2159(-112);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)I")
    public final int method1174(byte arg0) {
        int var2 = -19 / ((arg0 - -63) / 47);
        ++field2388;
        return this.field2387.field5040;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(B)Z")
    public final boolean method1175(byte arg0) {
        if (arg0 <= 38) {
            this.method205((byte) 77, (class475) null);
        }
        ++field2370;
        return this.field2375;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lpe;B)V")
    public final void method1176(class685 arg0, byte arg1) {
        this.field2387.method2153(arg0, true);
        ++field2380;
        if (arg1 != 82) {
            this.method1167(26);
        }
    }
}
