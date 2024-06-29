import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class261 {

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    private int field4003;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "[Lia;")
    private class320[] field4006;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field3999 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field4002 = -1;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4000 = "Ok";

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "Z")
    public static boolean field4005 = false;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field4009 = -1;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "J")
    private long field4001;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Lia;")
    private class320 field3996;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Loo;")
    public static class73 field4008;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lia;IJ)V", line = 6)
    public final void method1917(class320 arg0, int arg1, long arg2) {
        field4011++;
        if (arg0.field4928 != null) {
            arg0.method2262((byte) -102);
        }
        class320 var5 = this.field4006[(int) ((long) (this.field4003 - arg1) & arg2)];
        arg0.field4934 = var5;
        arg0.field4928 = var5.field4928;
        arg0.field4928.field4934 = arg0;
        arg0.field4932 = arg2;
        arg0.field4934.field4928 = arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I", line = 31)
    public static final int method1918(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg1 != 22) {
            field4009 = 103;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        field4004++;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZJ)Lia;", line = 54)
    public final class320 method1919(boolean arg0, long arg1) {
        this.field4001 = arg1;
        field3998++;
        if (arg0) {
            return (class320) null;
        }
        class320 var4 = this.field4006[(int) ((long) (this.field4003 - 1) & arg1)];
        for (this.field3996 = var4.field4934; this.field3996 != var4; this.field3996 = this.field3996.field4934) {
            if (this.field3996.field4932 == arg1) {
                class320 var5 = this.field3996;
                this.field3996 = this.field3996.field4934;
                return var5;
            }
        }
        this.field3996 = null;
        return null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Lia;", line = 84)
    public final class320 method1920(int arg0) {
        field4007++;
        if (this.field3996 == null) {
            return null;
        }
        class320 var2 = this.field4006[(int) (this.field4001 & (long) (this.field4003 - 1))];
        while (this.field3996 != var2) {
            if (this.field3996.field4932 == this.field4001) {
                class320 var3 = this.field3996;
                this.field3996 = this.field3996.field4934;
                return var3;
            }
            this.field3996 = this.field3996.field4934;
        }
        this.field3996 = null;
        if (arg0 > -111) {
            return (class320) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lqi;IBIILrg;I)V", line = 137)
    public static final void method1921(class246 arg0, int arg1, byte arg2, int arg3, int arg4, class342 arg5, int arg6) {
        field4010++;
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 * arg1 + arg4 * arg4;
        int var8;
        if (class314.field4858 == 4) {
            var8 = (int) class313.field4846 & 0x7FF;
        } else {
            var8 = (int) class313.field4846 + class290.field4513 & 0x7FF;
        }
        int var9 = Math.max(arg5.field5374 / 2, arg5.field5339 / 2) + 10;
        if ((var9 * var9) < var7) {
            return;
        }
        int var10 = class107.field1604[var8];
        int var11 = class107.field1605[var8];
        if (class314.field4858 != 4) {
            var11 = var11 * 256 / (class236.field3676 + 256);
            var10 = var10 * 256 / (class236.field3676 + 256);
        }
        int var12 = arg1 * var11 + arg4 * var10 >> 16;
        if (arg2 > -29) {
            return;
        }
        int var13 = arg4 * var11 - (arg1 * var10) >> 16;
        if (class240.field3737) {
            ((class289) arg0).method2087(arg5.field5374 / 2 + var12 + arg6 - (arg0.field3832 / 2), arg5.field5339 / 2 + -(arg0.field3825 / 2) + -var13 + arg3, (class2) arg5.method2399(false, 0));
        } else {
            ((class77) arg0).method708(arg5.field5374 / 2 + arg6 - (-var12 - -(arg0.field3832 / 2)), arg5.field5339 / 2 + -var13 + arg3 - arg0.field3825 / 2, arg5.field5272, arg5.field5428);
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V", line = 183)
    public class261(int arg0) {
        this.field4003 = arg0;
        this.field4006 = new class320[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class320 var3 = this.field4006[var2] = new class320();
            var3.field4934 = var3;
            var3.field4928 = var3;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)Lah;", line = 205)
    public static final class36 method1922(int arg0, int arg1, int arg2, int arg3) {
        field3997++;
        if (arg3 != -13860) {
            return (class36) null;
        }
        class36 var4 = new class36();
        var4.field543 = arg1;
        var4.field540 = arg2;
        class135.field2251.method375(var4, (long) arg0, -87);
        class290.method2106(0, arg2);
        class342 var5 = class355.method2497(0, arg0);
        if (var5 != null) {
            class339.method2380(var5, arg3 ^ 0xFFFFC9B5);
        }
        if (class356.field5672 != null) {
            class339.method2380(class356.field5672, 117);
            class356.field5672 = null;
        }
        int var6 = class66.field1006;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class260.method1911((byte) 11, class356.field5670[var7])) {
                class226.method1687(var7, (byte) 59);
            }
        }
        if (class66.field1006 == 1) {
            class6.field89 = false;
            class89.method800(class135.field2259, (byte) -64, class43.field700, class310.field4785, class10.field141);
        } else {
            class89.method800(class135.field2259, (byte) -64, class43.field700, class310.field4785, class10.field141);
            int var8 = class64.field988.method1194(class222.field3450);
            for (int var9 = 0; var9 < class66.field1006; var9++) {
                int var10 = class64.field988.method1194(class78.method720(var9, false));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class135.field2259 = (class149.field2444 ? 26 : 22) + class66.field1006 * 15;
            class43.field700 = var8 + 8;
        }
        if (var5 != null) {
            class205.method1530(var5, false, 0);
        }
        class49.method472(arg2, (byte) -128);
        if (class164.field2604 != -1) {
            class238.method1768((byte) 28, 1, class164.field2604);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V", line = 294)
    public static void method1923(boolean arg0) {
        if (arg0) {
            field4009 = -64;
        }
        field4008 = null;
        field4000 = null;
    }
}
