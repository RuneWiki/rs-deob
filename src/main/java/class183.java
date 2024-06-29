import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class183 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lbh;")
    public class273 field2900 = new class273();

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lol;")
    public static class231 field2901 = new class231(16);

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static volatile int field2915 = 0;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[I")
    public static int[] field2912 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Lwm;")
    public static class152 field2913 = class157.method1048("http:)4)4", 118);

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field2920 = -1;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Lek;")
    public static class183 field2919 = new class183();

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "F")
    public static float field2911;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Lah;")
    public static class205 field2918;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lbh;")
    private class273 field2908;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Lre;")
    public static class277 field2914;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lbh;I)V", line = 5)
    public final void method1213(class273 arg0, int arg1) {
        if (arg0.field4685 != null) {
            arg0.method1880(arg1 - 21281);
        }
        arg0.field4687 = this.field2900.field4687;
        arg0.field4685 = this.field2900;
        field2906++;
        if (arg1 != -4087) {
            field2914 = (class277) null;
        }
        arg0.field4685.field4687 = arg0;
        arg0.field4687.field4685 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLbh;)V", line = 23)
    public final void method1214(boolean arg0, class273 arg1) {
        if (arg1.field4685 != null) {
            arg1.method1880(-25368);
        }
        arg1.field4685 = this.field2900.field4685;
        arg1.field4687 = this.field2900;
        arg1.field4685.field4687 = arg1;
        field2910++;
        if (arg0) {
            method1216(-59, 62, 21, 92, -41, 41);
        }
        arg1.field4687.field4685 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lbh;", line = 45)
    public final class273 method1215(byte arg0) {
        field2904++;
        if (arg0 >= -88) {
            field2920 = 56;
        }
        class273 var2 = this.field2900.field4687;
        if (this.field2900 == var2) {
            return null;
        } else {
            var2.method1880(-25368);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)Z", line = 61)
    public static final boolean method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class227.field3700[arg0][var8][var9] == -class244.field4064) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class65.field984[arg0][arg1][arg3] + arg5;
            if (!class150.method943(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class150.method943(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class150.method943(var10, var12, var14)) {
                return false;
            } else if (class150.method943(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class224.method1544(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class150.method943(var6 + 1, class65.field984[arg0][arg1][arg3] + arg5, var7 + 1) && class150.method943(var6 + 128 - 1, class65.field984[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class150.method943(var6 + 128 - 1, class65.field984[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class150.method943(var6 + 1, class65.field984[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lbh;", line = 133)
    public final class273 method1217(int arg0) {
        field2909++;
        class273 var2 = this.field2900.field4685;
        if (this.field2900 == var2) {
            this.field2908 = null;
            return null;
        } else {
            this.field2908 = var2.field4685;
            int var3 = 50 % ((14 - arg0) / 56);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 166)
    public static void method1218(boolean arg0) {
        field2914 = null;
        field2901 = null;
        field2918 = null;
        field2912 = null;
        field2913 = null;
        field2919 = null;
        if (!arg0) {
            field2920 = -115;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Lbh;", line = 183)
    public final class273 method1219(int arg0) {
        field2907++;
        class273 var2 = this.field2908;
        if (arg0 != 16) {
            return (class273) null;
        } else if (this.field2900 == var2) {
            this.field2908 = null;
            return null;
        } else {
            this.field2908 = var2.field4685;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V", line = 203)
    public static final void method1220(byte arg0) {
        field2902++;
        class306.field5254.method1613(-22696);
        class176.field2833.method1613(-22696);
        if (arg0 != -59) {
            method1222(true, 78, (class152) null);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 385)
    public class183() {
        this.field2900.field4687 = this.field2900;
        this.field2900.field4685 = this.field2900;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Lbh;", line = 219)
    public final class273 method1221(byte arg0) {
        if (arg0 < 35) {
            field2914 = (class277) null;
        }
        class273 var2 = this.field2900.field4687;
        field2917++;
        if (this.field2900 == var2) {
            this.field2908 = null;
            return null;
        } else {
            this.field2908 = var2.field4687;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILwm;)V", line = 246)
    public static final void method1222(boolean arg0, int arg1, class152 arg2) {
        field2899++;
        short[] var3 = new short[arg1];
        class152 var4 = arg2.method1023((byte) 60);
        int var5 = 0;
        for (int var6 = 0; var6 < class176.field2841; var6++) {
            class312 var7 = class189.method1253((byte) 63, var6);
            if ((!arg0 || var7.field5350) && var7.field5349 == -1 && var7.field5407 == -1 && var7.field5360 == 0 && var7.field5393.method1023((byte) 56).method988(var4, 0) != -1) {
                if (var5 >= 250) {
                    client.field4356 = null;
                    class114.field1623 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class114.field1623 = var5;
        client.field4356 = var3;
        class280.field4782 = 0;
        class152[] var10 = new class152[class114.field1623];
        for (int var11 = 0; var11 < class114.field1623; var11++) {
            var10[var11] = class189.method1253((byte) 127, var3[var11]).field5393;
        }
        class184.method1226(client.field4356, var10, -18653);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Lbh;", line = 319)
    public final class273 method1223(int arg0) {
        field2898++;
        if (arg0 < 52) {
            field2920 = -123;
        }
        class273 var2 = this.field2908;
        if (this.field2900 == var2) {
            this.field2908 = null;
            return null;
        } else {
            this.field2908 = var2.field4687;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V", line = 360)
    public final void method1224(byte arg0) {
        while (true) {
            class273 var2 = this.field2900.field4687;
            if (this.field2900 == var2) {
                field2903++;
                this.field2908 = null;
                if (arg0 != 56) {
                    method1216(96, -64, 54, -21, -17, -6);
                }
                return;
            }
            var2.method1880(-25368);
        }
    }
}
