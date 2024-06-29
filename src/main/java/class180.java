import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class180 {

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Z")
    private boolean field3004 = false;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public int field2995 = 0;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public int field3007 = 0;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public static int[] field2994 = new int[32];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public static boolean field3000 = false;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Leg;")
    public static class37 field3005 = class174.method1167("Okay", 78);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Leg;")
    public static class37 field3013 = class174.method1167(": ", -31);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static volatile int field3003 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    private int field3006;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "J")
    public long field3015;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Laa;")
    public static class183 field3002;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "[Leg;")
    public static class37[] field3011;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lva;IB)V")
    private final void method1189(class187 arg0, int arg1, byte arg2) {
        if (arg2 > -64) {
            return;
        }
        field3014++;
        if (arg1 == 1) {
            this.field3006 = arg0.method1244(false);
        } else if (arg1 == 2) {
            arg0.method1268(255);
        } else if (arg1 == 3) {
            this.field3018 = arg0.method1290((byte) 90);
            this.field2999 = arg0.method1290((byte) 90);
            this.field2992 = arg0.method1290((byte) 90);
        } else if (arg1 == 4) {
            this.field3012 = arg0.method1268(255);
            this.field3009 = arg0.method1290((byte) 90);
        } else if (arg1 == 6) {
            this.field2996 = arg0.method1268(255);
        } else if (arg1 == 8) {
            this.field3007 = 1;
        } else if (arg1 == 9) {
            this.field2995 = 1;
        } else if (arg1 == 10) {
            this.field3004 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZ)V")
    public static final void method1190(boolean arg0, boolean arg1) {
        field2998++;
        if (arg0) {
            if (class234.field4044 != -1) {
                class130.method923(true, class234.field4044);
            }
            for (class190 var2 = (class190) class120.field2022.method993(-15322); var2 != null; var2 = (class190) class120.field2022.method988(4586)) {
                class256.method1746(var2, true, (byte) 76);
            }
            class234.field4044 = -1;
            class120.field2022 = new class140(8);
            class290.method1945(0);
            class234.field4044 = class62.field1016;
            class58.method413(-1025659988, false);
            class176.method1178(false);
            class202.method1405(13046, class234.field4044);
        }
        class82.field1285 = new class188();
        class82.field1285.field1799 = 3000;
        class82.field1285.field1793 = 3000;
        class182.method1202(class124.field2086, 6099);
        class102.method683(10, false);
        if (!arg1) {
            field3005 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public final void method1191(boolean arg0) {
        field2993++;
        if (arg0) {
            return;
        }
        this.field3016 = class76.field1189[this.field3006];
        this.field2997 = (int) Math.sqrt((double) (this.field3018 * this.field3018 + this.field2999 * this.field2999 + this.field2992 * this.field2992));
        if (this.field3009 == 0) {
            this.field3009 = 1;
        }
        if (this.field3012 == 0) {
            this.field3015 = 2147483647L;
        } else if (this.field3012 == 1) {
            this.field3015 = (long) (this.field2997 * 8 / this.field3009);
            this.field3015 *= this.field3015;
        } else if (this.field3012 == 2) {
            this.field3015 = (long) (this.field2997 * 8 / this.field3009);
        }
        if (this.field3004) {
            this.field2997 *= -1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
    public static void method1192(boolean arg0) {
        field3011 = null;
        if (!arg0) {
            method1192(true);
        }
        field2994 = null;
        field3005 = null;
        field3013 = null;
        field3002 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLva;)V")
    public final void method1193(boolean arg0, class187 arg1) {
        if (arg0) {
            this.method1189((class187) null, -45, (byte) 127);
        }
        field3008++;
        while (true) {
            int var3 = arg1.method1268(255);
            if (var3 == 0) {
                return;
            }
            this.method1189(arg1, var3, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZI)V")
    public static final void method1194(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class286.field5050 <= arg4 && class96.field1507 >= arg4) {
            int var5 = class139.method975(class178.field2972, true, arg2, class217.field3741);
            int var6 = class139.method975(class178.field2972, true, arg1, class217.field3741);
            class55.method358(var6, var5, arg0, -17071, arg4);
        }
        if (!arg3) {
            field3017++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3010++;
        if (arg7 != -1) {
            return;
        }
        class81 var10 = null;
        for (class81 var11 = (class81) class140.field2402.method1566(-3); var11 != null; var11 = (class81) class140.field2402.method1570(3)) {
            if (var11.field1260 == arg6 && var11.field1261 == arg0 && var11.field1272 == arg1 && var11.field1264 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class81();
            var10.field1261 = arg0;
            var10.field1264 = arg9;
            var10.field1260 = arg6;
            var10.field1272 = arg1;
            class82.method553(var10, arg7 ^ 0x5F);
            class140.field2402.method1574(var10, 0);
        }
        var10.field1274 = arg2;
        var10.field1263 = arg5;
        var10.field1270 = arg8;
        var10.field1276 = arg4;
        var10.field1279 = arg3;
    }
}
