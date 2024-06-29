import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class156 {

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Ltn;")
    private class59 field2217 = new class59();

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lib;")
    private class106 field2221;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lgn;")
    public static class493 field2211 = new class493();

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field2220 = -50;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "[I")
    public static int[] field2228 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lfp;")
    public static class212 field2223;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1105(boolean arg0) {
        field2224++;
        this.field2217.method535((byte) -120);
        this.field2221.method874(0);
        this.field2218 = this.field2212;
        if (arg0) {
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Z", line = 20)
    public static final boolean method1106(int arg0, byte arg1) {
        if (arg1 == -38) {
            field2227++;
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 31)
    public final void method1107(int arg0, long arg1, Object arg2) {
        this.method1118(arg2, 4096, arg1, arg0);
        field2216++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 40)
    public static void method1108(int arg0) {
        field2211 = null;
        field2228 = null;
        field2223 = null;
        if (arg0 != 24310) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I", line = 54)
    public final int method1109(byte arg0) {
        int var2 = 92 / ((2 - arg0) / 60);
        field2210++;
        return this.field2218;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 64)
    public final Object method1110(int arg0) {
        field2209++;
        class135 var2 = (class135) this.field2221.method879((byte) -20);
        if (arg0 != -17845) {
            this.field2218 = 102;
        }
        while (var2 != null) {
            Object var3 = var2.method1032(250);
            if (var3 != null) {
                return var3;
            }
            class135 var4 = var2;
            var2 = (class135) this.field2221.method879((byte) -20);
            var4.method1525((byte) 114);
            var4.method2307((byte) 59);
            this.field2218 += var2.field1948;
        }
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JI)V", line = 95)
    private final void method1111(long arg0, int arg1) {
        field2213++;
        class135 var4 = (class135) this.field2221.method875(arg0, 125);
        if (arg1 == 10131) {
            this.method1120(var4, 79);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 115)
    public static final void method1112(boolean arg0) {
        if (!arg0) {
            method1108(64);
        }
        if (class489.field7187 == null || class25.field297 == null) {
            class25.field297 = new int[256];
            class489.field7187 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class489.field7187[var1] = (int) (Math.sin(var2) * 4096.0D);
                class25.field297[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2226++;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I", line = 145)
    public final int method1113(byte arg0) {
        field2225++;
        return arg0 == 58 ? this.field2212 : 59;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)I", line = 156)
    public final int method1114(byte arg0) {
        field2208++;
        int var2 = 0;
        class135 var3 = (class135) this.field2217.method537((byte) 87);
        int var4 = -33 % ((arg0 + 18) / 54);
        while (var3 != null) {
            if (!var3.method1030((byte) 109)) {
                var2++;
            }
            var3 = (class135) this.field2217.method540(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 180)
    public final Object method1115(long arg0, byte arg1) {
        field2222++;
        class135 var4 = (class135) this.field2221.method875(arg0, 126);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1032(250);
        if (var5 == null) {
            var4.method1525((byte) -61);
            var4.method2307((byte) 28);
            this.field2218 += var4.field1948;
            return null;
        } else if (arg1 == 58) {
            if (var4.method1030((byte) 116)) {
                class208 var6 = new class208(var5, var4.field1948);
                this.field2221.method878(var4.field3271, -2301, var6);
                this.field2217.method536(19, var6);
                var6.field5561 = 0L;
                var4.method1525((byte) 106);
                var4.method2307((byte) -80);
            } else {
                this.field2217.method536(-125, var4);
                var4.field5561 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 224)
    public final void method1116(int arg0, int arg1) {
        if (arg1 != -50) {
            return;
        }
        if (class240.field3544 != null) {
            for (class135 var3 = (class135) this.field2217.method537((byte) 87); var3 != null; var3 = (class135) this.field2217.method540(true)) {
                if (var3.method1030((byte) 113)) {
                    if (var3.method1032(250) == null) {
                        var3.method1525((byte) -87);
                        var3.method2307((byte) -108);
                        this.field2218++;
                    }
                } else if ((++var3.field5561) > ((long) arg0)) {
                    class135 var4 = class240.field3544.method2626(-128, var3);
                    this.field2221.method878(var3.field3271, -2301, var4);
                    class284.method1813(true, var3, var4);
                    var3.method1525((byte) 79);
                    var3.method2307((byte) 54);
                }
            }
        }
        field2215++;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 273)
    public final Object method1117(byte arg0) {
        field2214++;
        if (arg0 != -119) {
            field2211 = null;
        }
        class135 var2 = (class135) this.field2221.method880((byte) -23);
        while (var2 != null) {
            Object var3 = var2.method1032(250);
            if (var3 != null) {
                return var3;
            }
            class135 var4 = var2;
            var2 = (class135) this.field2221.method879((byte) -20);
            var4.method1525((byte) -118);
            var4.method2307((byte) -100);
            this.field2218 += var2.field1948;
        }
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/Object;IJI)V", line = 304)
    private final void method1118(Object arg0, int arg1, long arg2, int arg3) {
        field2219++;
        if (arg3 > this.field2212) {
            throw new IllegalStateException("s>cs");
        }
        this.method1111(arg2, 10131);
        this.field2218 -= arg3;
        while (this.field2218 < 0) {
            class135 var7 = (class135) this.field2217.method539((byte) 65);
            this.method1120(var7, 103);
        }
        class208 var6 = new class208(arg0, arg3);
        if (arg1 != 4096) {
            this.field2217 = null;
        }
        this.field2221.method878(arg2, -2301, var6);
        this.field2217.method536(-122, var6);
        var6.field5561 = 0L;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 347)
    public final void method1119(int arg0) {
        for (class135 var2 = (class135) this.field2217.method537((byte) 87); var2 != null; var2 = (class135) this.field2217.method540(true)) {
            if (var2.method1030((byte) 112)) {
                var2.method1525((byte) 68);
                var2.method2307((byte) 96);
                this.field2218 += var2.field1948;
            }
        }
        field2207++;
        if (arg0 <= 72) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lfq;I)V", line = 373)
    private final void method1120(class135 arg0, int arg1) {
        field2229++;
        if (arg1 > 40 && arg0 != null) {
            arg0.method1525((byte) 124);
            arg0.method2307((byte) -117);
            this.field2218 += arg0.field1948;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 395)
    public class156(int arg0) {
        this.field2218 = arg0;
        this.field2212 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2221 = new class106(var2);
    }
}
