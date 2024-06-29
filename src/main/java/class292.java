import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class292 extends class206 {

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lwa;")
    private static class75 field5009 = class66.method560("Sun", false);

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lwa;")
    private static class75 field5008 = class66.method560("Wed", false);

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "[I")
    public static int[] field5014 = new int[99];

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lwa;")
    private static class75 field5016 = class66.method560("Thu", false);

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lwa;")
    private static class75 field5011 = class66.method560("Mon", false);

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lwa;")
    private static class75 field5010 = class66.method560("Tue", false);

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "Lwa;")
    private static class75 field5015 = class66.method560("Sat", false);

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lwa;")
    private static class75 field5022 = class66.method560("Fri", false);

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "[Lwa;")
    public static class75[] field5007 = new class75[] { field5009, field5011, field5010, field5008, field5016, field5022, field5015 };

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Lwa;")
    public static class75 field5023;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "Lwa;")
    public static class75 field5025;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "F")
    public static float field5020;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Lpi;")
    public static class294 field5024;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZILhj;II)V", line = 5)
    public static final void method2034(int arg0, boolean arg1, int arg2, class28 arg3, int arg4, int arg5) {
        field5018++;
        if (class311.field5301 >= 50 || arg4 < 0 || arg3.field367 == null || arg0 >= arg3.field367.length || arg3.field367[arg0] == null) {
            return;
        }
        int var6 = arg3.field367[arg0][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0x77) >> 4;
        int var9 = var6 & 0xF;
        if (arg3.field367[arg0].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field367[arg0].length);
            if (var10 > 0) {
                var7 = arg3.field367[arg0][var10];
            }
        }
        if (var9 == 0) {
            if (arg1) {
                class20.method130(var7, var8, 0, 97);
            }
        } else if (class285.field4909 != 0) {
            class268.field4641[class311.field5301] = var7;
            class130.field2242[class311.field5301] = var8;
            int var11 = (arg2 - 64) / 128;
            int var12 = (arg5 - 64) / 128;
            class39.field588[class311.field5301] = 0;
            class262.field4393[class311.field5301] = null;
            class93.field1515[class311.field5301] = (var11 << 16) + (var12 << 8) + var9;
            class311.field5301++;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5014[var1] = var0 / 4;
        }
        field5023 = class66.method560(" steht bereits auf Ihrer Freunde)2Liste(Q", false);
        field5025 = class66.method560("b12_full", false);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 74)
    public static final void method2035(int arg0) {
        field5021++;
        while (class136.field2328.method89(class299.field5105, -21530) >= 11) {
            int var1 = class136.field2328.method92(11, 8);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class169.field2842[var1] == null) {
                class169.field2842[var1] = new class96();
                if (class48.field786[var1] != null) {
                    class169.field2842[var1].method737(class48.field786[var1], (byte) 94);
                }
                var2 = true;
            }
            class65.field1131[class229.field3894++] = var1;
            class96 var3 = class169.field2842[var1];
            var3.field3271 = class143.field2463;
            int var4 = class136.field2328.method92(5, arg0 + 20176);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class136.field2328.method92(1, arg0 ^ 0xFFFFB130);
            if (var5 == 1) {
                class72.field1214[class173.field2924++] = var1;
            }
            int var6 = class136.field2328.method92(5, arg0 ^ 0xFFFFB130);
            int var7 = class136.field2328.method92(1, arg0 + 20176);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class263.field4558[class136.field2328.method92(3, 8)];
            if (var2) {
                var3.field3206 = var3.field3274 = var8;
            }
            var3.method741(class279.field4831.field3236[0] + var6, class279.field4831.field3205[0] + var4, true, var7 == 1);
        }
        class136.field2328.method97((byte) 77);
        if (arg0 != -20168) {
            field5011 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZ)V", line = 141)
    public static final void method2036(byte arg0, boolean arg1) {
        field5017++;
        byte[][] var2;
        if (arg1) {
            var2 = class294.field5055;
        } else {
            var2 = class109.field1876;
        }
        int var3 = class267.field4595.length;
        int var4 = 0;
        if (arg0 >= -56) {
            field5007 = (class75[]) null;
        }
        while (var3 > var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class288.field4952[var4] >> 8) * 64 - class275.field4737;
                int var7 = (class288.field4952[var4] & 0xFF) * 64 - class175.field2939;
                class54.method393((byte) 43);
                class273.method1945(class286.field4931, var5, var6, arg1, (byte) 36, var7);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 178)
    public static void method2037(byte arg0) {
        field5008 = null;
        field5009 = null;
        field5010 = null;
        field5016 = null;
        field5014 = null;
        field5024 = null;
        field5025 = null;
        field5011 = null;
        field5023 = null;
        int var1 = 43 % ((-arg0 - 57) / 34);
        field5007 = null;
        field5022 = null;
        field5015 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIB)V", line = 211)
    public static final void method2038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field5013++;
        int var8 = arg2 + arg6;
        int var9 = arg4 - arg2;
        int var10 = arg2 + arg5;
        for (int var11 = arg6; var11 < var8; var11++) {
            class150.method1151(7, class63.field1096[var11], arg5, arg0, arg4);
        }
        int var12 = arg3 - arg2;
        int var13 = arg3;
        int var14 = 54 % ((-arg7 - 41) / 32);
        while (var12 < var13) {
            class150.method1151(7, class63.field1096[var13], arg5, arg0, arg4);
            var13--;
        }
        for (int var15 = var8; var15 <= var12; var15++) {
            int[] var16 = class63.field1096[var15];
            class150.method1151(7, var16, arg5, arg0, var10);
            class150.method1151(7, var16, var10, arg1, var9);
            class150.method1151(7, var16, var9, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)I", line = 259)
    public static final int method2039(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method2034(26, true, -19, (class28) null, 114, 41);
        }
        field5006++;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V", line = 295)
    public class292(int arg0, int arg1) {
        this.field5012 = arg0;
        this.field5019 = arg1;
    }
}
