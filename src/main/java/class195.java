import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class195 {

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    private int field2941 = 128;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    private int field2935 = 0;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    private int field2951 = 128;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Z")
    public boolean field2937 = false;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "Z")
    public boolean field2949 = false;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    private int field2945 = 0;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public int field2950 = -1;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    private int field2934 = 0;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field2944 = -1;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "Lsf;")
    public static class398 field2952 = new class398();

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    private int field2946;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[S")
    private short[] field2939;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "[S")
    private short[] field2943;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "[S")
    private short[] field2947;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "[S")
    private short[] field2948;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILdr;IZ)Lwp;")
    public final class292 method1164(int arg0, int arg1, int arg2, class261 arg3, int arg4, boolean arg5) {
        field2954++;
        int var7 = arg1;
        class379 var8 = this.field2950 == -1 || arg0 == -1 ? null : class98.method629(this.field2950, (byte) -115);
        if (var8 != null) {
            var7 = arg1 | var8.method2283(28432, arg4, false, arg0);
        }
        if (this.field2951 != 128) {
            var7 |= 0x2;
        }
        if (arg5) {
            this.field2941 = 45;
        }
        if (this.field2941 != 128 || this.field2945 != 0) {
            var7 |= 0x5;
        }
        class241 var9 = class186.field2797;
        class292 var10;
        synchronized (class186.field2797) {
            var10 = (class292) class186.field2797.method1491((long) (this.field2940 |= arg3.field3971 << 29), 0);
        }
        if (var10 == null || arg3.method372(var10.method1274(), var7) != 0) {
            if (var10 != null) {
                var7 = arg3.method407(var7, var10.method1274());
            }
            int var11 = var7;
            if (this.field2943 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field2948 != null) {
                var11 |= 0x4000;
            }
            class49 var12 = class451.method2775(0, this.field2946, class280.field4294, 18325);
            if (var12 == null) {
                return null;
            }
            var10 = arg3.method390(var12, var11, class396.field5926, this.field2935 + 64, this.field2934 - -850);
            if (this.field2943 != null) {
                for (int var13 = 0; var13 < this.field2943.length; var13++) {
                    var10.method1259(this.field2943[var13], this.field2947[var13]);
                }
            }
            if (this.field2948 != null) {
                for (int var14 = 0; var14 < this.field2948.length; var14++) {
                    var10.method1257(this.field2948[var14], this.field2939[var14]);
                }
            }
            var10.method1277(var7);
            class241 var15 = class186.field2797;
            synchronized (class186.field2797) {
                class186.field2797.method1488(128, (long) (this.field2940 |= arg3.field3971 << 29), var10);
            }
        }
        class292 var16 = var8 == null ? var10.method1264((byte) 2, var7, true) : var8.method2286((byte) 2, var10, arg4, (byte) 16, arg0, arg2, 0, var7);
        if (this.field2941 != 128 || this.field2951 != 128) {
            var16.method1268(this.field2941, this.field2951, this.field2941);
        }
        if (this.field2945 != 0) {
            if (this.field2945 == 90) {
                var16.method1286(4096);
            }
            if (this.field2945 == 180) {
                var16.method1286(8192);
            }
            if (this.field2945 == 270) {
                var16.method1286(12288);
            }
        }
        var16.method1277(arg1);
        return var16;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static final void method1165(int arg0) {
        class241 var1 = class189.field2838;
        synchronized (class189.field2838) {
            class189.field2838.method1482((byte) 87);
        }
        field2936++;
        class241 var2 = class338.field5048;
        synchronized (class338.field5048) {
            class338.field5048.method1482((byte) 50);
        }
        class241 var3 = class427.field6289;
        synchronized (class427.field6289) {
            class427.field6289.method1482((byte) 58);
        }
        int var4 = -2 / ((5 - arg0) / 60);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
    public static void method1166(int arg0) {
        if (arg0 == -8) {
            field2952 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLef;)V")
    public final void method1167(byte arg0, class385 arg1) {
        if (arg0 != -29) {
            this.field2940 = -42;
        }
        field2942++;
        while (true) {
            int var3 = arg1.method2343(255);
            if (var3 == 0) {
                return;
            }
            this.method1168((byte) -113, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLef;I)V")
    private final void method1168(byte arg0, class385 arg1, int arg2) {
        if (arg0 > -94) {
            this.field2951 = 111;
        }
        if (arg2 == 1) {
            this.field2946 = arg1.method2323(-65);
        } else if (arg2 == 2) {
            this.field2950 = arg1.method2323(-41);
        } else if (arg2 == 4) {
            this.field2941 = arg1.method2323(-28);
        } else if (arg2 == 5) {
            this.field2951 = arg1.method2323(-59);
        } else if (arg2 == 6) {
            this.field2945 = arg1.method2323(-123);
        } else if (arg2 == 7) {
            this.field2935 = arg1.method2343(255);
        } else if (arg2 == 8) {
            this.field2934 = arg1.method2343(255);
        } else if (arg2 == 9) {
            this.field2937 = true;
        } else if (arg2 == 10) {
            this.field2949 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method2343(255);
            this.field2943 = new short[var4];
            this.field2947 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2943[var5] = (short) arg1.method2323(-64);
                this.field2947[var5] = (short) arg1.method2323(-128);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2343(255);
            this.field2939 = new short[var6];
            this.field2948 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2948[var7] = (short) arg1.method2323(-38);
                this.field2939[var7] = (short) arg1.method2323(-70);
            }
        }
        field2938++;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILfh;I)V")
    public static final void method1169(int arg0, int arg1, class170 arg2, int arg3) {
        field2953++;
        if (arg0 != 0) {
            method1165(-101);
        }
        if (class132.field1692) {
            if (!client.method2796(arg2).method1907(-1) || (class108.field1435 & 0x20) == 0) {
                return;
            }
            class371.method2234(arg2.field2525, 9, arg2.field2511, false, class284.field4319, (byte) -65, class411.field6116 + " -> " + arg2.field2533, class105.field1411, 0L, true);
            class43.field539++;
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var8 = class184.method1121(arg2, var4, (byte) -112);
            if (var8 != null) {
                class154.field2115++;
                class371.method2234(arg2.field2525, 1006, arg2.field2511, false, var8, (byte) -65, arg2.field2533, class266.method1647(arg2, 31368, var4), (long) (var4 + 1), true);
            }
        }
        String var5 = class364.method2188(0, arg2);
        if (var5 != null) {
            class36.field431++;
            class371.method2234(arg2.field2525, 25, arg2.field2511, false, var5, (byte) -65, arg2.field2533, arg2.field2621, 0L, true);
        }
        for (int var6 = 4; var6 >= 0; var6--) {
            String var7 = class184.method1121(arg2, var6, (byte) -47);
            if (var7 != null) {
                class371.method2234(arg2.field2525, 60, arg2.field2511, false, var7, (byte) -65, arg2.field2533, class266.method1647(arg2, 31368, var6), (long) (var6 + 1), true);
                class154.field2115++;
            }
        }
        if (!client.method2796(arg2).method1900(-77)) {
            return;
        }
        class134.field1742++;
        if (arg2.field2557 != null) {
            class371.method2234(arg2.field2525, 21, arg2.field2511, false, arg2.field2557, (byte) -65, "", -1, 0L, true);
            return;
        }
        class371.method2234(arg2.field2525, 21, arg2.field2511, false, class174.field2661.method937((byte) -31, class27.field356), (byte) -65, "", -1, 0L, true);
        return;
    }
}
