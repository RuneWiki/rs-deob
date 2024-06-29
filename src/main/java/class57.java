import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class57 {

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[I")
    public static int[] field809 = new int[1];

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Lrga;")
    public static class280 field804 = new class280(36, 8);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[Laca;")
    public static class134[] field812;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)[Lju;", line = 3)
    public static final class227[] method356(byte arg0) {
        if (arg0 <= 36) {
            return null;
        } else {
            field811++;
            return new class227[] { class350.field4469, class350.field4471, class350.field4472, class350.field4473, class350.field4474, class350.field4475, class350.field4476, class350.field4477, class350.field4478, class350.field4479, class350.field4480, class350.field4481, class350.field4482, class350.field4483 };
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 18)
    public static final Object method357(int arg0, byte[] arg1, boolean arg2) {
        field806++;
        if (arg1 == null) {
            return null;
        }
        if (~arg1.length < arg0 && !class698.field9871) {
            try {
                class257 var3 = (class257) Class.forName("nea").getDeclaredConstructor().newInstance();
                var3.method1249(arg1, true);
                return var3;
            } catch (Throwable var4) {
                class698.field9871 = true;
            }
        }
        return arg2 ? class257.method1498(arg1, -25553) : arg1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;Les;)I", line = 47)
    public static final int method358(int arg0, String arg1, class630 arg2) {
        if (arg0 != -1) {
            return 104;
        }
        field810++;
        int var3 = arg2.field8812;
        byte[] var4 = class433.method2278(arg1, (byte) -47);
        arg2.method3462(-139194328, var4.length);
        arg2.field8812 += class468.field5950.method895(var4.length, arg2.field8812, arg2.field8804, var4, 8, 0);
        return arg2.field8812 - var3;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 71)
    public static void method360(byte arg0) {
        if (arg0 > -127) {
            method364(87, null, null, -78, null, -1, -13, 45);
        }
        field812 = null;
        field809 = null;
        field804 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lcj;", line = 83)
    public static final class177 method361(int arg0, int arg1) {
        field808++;
        class177 var2 = (class177) class606.field8527.method2418((long) arg0, (byte) 100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class651.field9187.method3365(arg0, 127, 0);
        class177 var4 = new class177();
        if (arg1 > -88) {
            method356((byte) 105);
        }
        if (var3 != null) {
            var4.method1120(new class630(var3), -84, arg0);
        }
        class606.field8527.method2409((long) arg0, var4, 1);
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[IIII)V", line = 108)
    public static final void method362(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field807++;
        arg0--;
        int var5 = 30 / ((-arg4 - 47) / 57);
        int var14 = arg3 - 1;
        int var6 = var14 - 7;
        while (arg0 < var6) {
            int var7 = arg0 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg0 = var13 + 1;
            arg1[arg0] = arg2;
        }
        while (arg0 < var14) {
            arg0++;
            arg1[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIZ)I", line = 140)
    public static final int method363(int arg0, boolean arg1, int arg2, boolean arg3) {
        field805++;
        class492 var4 = class183.method1141(arg1, (byte) 50, arg2);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && var4.field6496.length > arg0) {
            return arg3 ? var4.field6496[arg0] : 44;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILqi;Lbda;ILac;III)V", line = 167)
    public static final void method364(int arg0, class514 arg1, class441 arg2, int arg3, class307 arg4, int arg5, int arg6, int arg7) {
        field803++;
        class164 var8 = new class164();
        var8.field2150 = arg6 << 9;
        if (arg0 > -110) {
            method364(37, null, null, 99, null, -51, -118, -51);
        }
        var8.field2166 = arg7;
        var8.field2162 = arg5 << 9;
        if (arg2 != null) {
            var8.field2155 = arg2;
            int var9 = arg2.field5525;
            int var10 = arg2.field5534;
            if (arg3 == 1 || arg3 == 3) {
                var9 = arg2.field5534;
                var10 = arg2.field5525;
            }
            var8.field2158 = arg6 + var10 << 9;
            var8.field2153 = arg2.field5557 << 9;
            var8.field2148 = arg2.field5555;
            var8.field2157 = arg2.field5579;
            var8.field2164 = arg2.field5512;
            var8.field2149 = arg2.field5590;
            var8.field2159 = arg5 + var9 << 9;
            var8.field2169 = arg2.field5511;
            var8.field2144 = arg2.field5561;
            var8.field2145 = arg2.field5593;
            if (arg2.field5574 != null) {
                var8.field2154 = true;
                var8.method937((byte) -99);
            }
            if (var8.field2164 != null) {
                var8.field2163 = var8.field2148 + ((int) ((double) (var8.field2145 - var8.field2148) * Math.random()));
            }
            class236.field2953.method239(var8, (byte) 93);
        } else if (arg4 != null) {
            var8.field2167 = arg4;
            class586 var11 = arg4.field3902;
            if (var11.field8205 != null) {
                var8.field2154 = true;
                var11 = var11.method3220(-4261, class684.field9606);
            }
            if (var11 != null) {
                var8.field2158 = var11.field8210 + arg6 << 9;
                var8.field2159 = var11.field8210 + arg5 << 9;
                var8.field2149 = class494.method2667(false, arg4);
                var8.field2153 = var11.field8235 << 9;
                var8.field2157 = var11.field8189;
                var8.field2169 = var11.field8175;
            }
            class702.field9921.method239(var8, (byte) 93);
        } else if (arg1 != null) {
            var8.field2165 = arg1;
            var8.field2159 = arg1.method2785(-1) + arg5 << 9;
            var8.field2158 = arg6 + arg1.method2785(-1) << 9;
            var8.field2149 = class259.method1512(arg1, false);
            var8.field2169 = arg1.field7023;
            var8.field2157 = arg1.field7001;
            var8.field2153 = arg1.field7006 << 9;
            class646.field9086.method402(var8, (byte) -65, (long) arg1.field9676);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Las;B)Las;")
    public abstract class25 method359(class25 arg0, byte arg1);
}
