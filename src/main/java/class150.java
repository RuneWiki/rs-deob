import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class150 {

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "Luq;")
    private class339 field2057 = new class339();

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Leba;")
    public static class550 field2050 = new class550(68, 2);

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "[F")
    public static float[] field2064 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "Llg;")
    public static class32 field2063 = new class32(2, 4, 4, 0);

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "F")
    public static float field2062;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "Luq;")
    private class339 field2065;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "[[Lir;")
    public static class27[][] field2058;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)Luq;")
    public final class339 method876(int arg0) {
        field2060++;
        class339 var2 = this.field2057.field4562;
        if (arg0 >= -59) {
            this.method885((byte) -32);
        }
        if (this.field2057 == var2) {
            return null;
        } else {
            var2.method1982((byte) -24);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Luq;I)V")
    public final void method877(class339 arg0, int arg1) {
        if (arg0.field4562 != null) {
            arg0.method1982((byte) -24);
        }
        field2054++;
        arg0.field4567 = this.field2057.field4567;
        arg0.field4562 = this.field2057;
        if (arg1 != 16) {
            method881(null, (byte) 8);
        }
        arg0.field4562.field4567 = arg0;
        arg0.field4567.field4562 = arg0;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)Luq;")
    public final class339 method878(boolean arg0) {
        field2052++;
        class339 var2 = this.field2057.field4567;
        if (this.field2057 == var2) {
            this.field2065 = null;
            return null;
        } else {
            this.field2065 = var2.field4567;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLuq;)V")
    public final void method879(byte arg0, class339 arg1) {
        if (arg1.field4562 != null) {
            arg1.method1982((byte) -24);
        }
        if (arg0 > -62) {
            return;
        }
        field2049++;
        arg1.field4562 = this.field2057.field4562;
        arg1.field4567 = this.field2057;
        arg1.field4562.field4567 = arg1;
        arg1.field4567.field4562 = arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Luq;")
    public final class339 method880(int arg0) {
        field2061++;
        class339 var2 = this.field2065;
        if (this.field2057 == var2) {
            this.field2065 = null;
            return null;
        } else if (arg0 == -11278) {
            this.field2065 = var2.field4567;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lwv;B)V")
    public static final void method881(class423 arg0, byte arg1) {
        field2059++;
        if (arg1 >= -112) {
            method881(null, (byte) -58);
        }
        class423 var2 = class292.method1730(arg0, (byte) -122);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class60.field750;
            var4 = class399.field5301;
        } else {
            var3 = var2.field5672;
            var4 = var2.field5561;
        }
        class604.method3363(arg0, var4, (byte) -97, false, var3);
        class455.method2561(var3, var4, -33, arg0);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static void method882(byte arg0) {
        field2063 = null;
        field2064 = null;
        field2050 = null;
        field2058 = null;
        if (arg0 != -54) {
            field2050 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
    public static final void method883(int arg0) {
        if (class657.field9356 == null) {
            class686 var1 = new class686();
            byte[] var2 = var1.method3886(128, 0, 16, 128);
            class657.field9356 = class440.method2477(var2, (byte) -83, false);
        }
        int var3 = 89 % ((-arg0 - 88) / 37);
        field2051++;
        if (class325.field4379 == null) {
            class205 var4 = new class205();
            byte[] var5 = var4.method1310(128, 128, 16, true);
            class325.field4379 = class440.method2477(var5, (byte) -75, false);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)V")
    public final void method884(int arg0) {
        field2056++;
        while (true) {
            class339 var2 = this.field2057.field4567;
            if (this.field2057 == var2) {
                if (arg0 >= -125) {
                    return;
                } else {
                    this.field2065 = null;
                    return;
                }
            }
            var2.method1982((byte) -24);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)Luq;")
    public final class339 method885(byte arg0) {
        if (arg0 >= -52) {
            this.method886(19);
        }
        field2055++;
        class339 var2 = this.field2057.field4567;
        if (this.field2057 == var2) {
            return null;
        } else {
            var2.method1982((byte) -24);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)I")
    public final int method886(int arg0) {
        field2053++;
        int var2 = arg0;
        for (class339 var3 = this.field2057.field4567; var3 != this.field2057; var3 = var3.field4567) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
    public class150() {
        this.field2057.field4562 = this.field2057;
        this.field2057.field4567 = this.field2057;
    }
}
