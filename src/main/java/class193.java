import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class193 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3118 = "wave:";

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Z")
    public static boolean field3123 = false;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lpf;")
    public static class269 field3120 = new class269(0, 0);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lvh;")
    public static class108 field3119;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBI)V")
    public static final void method1264(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3124++;
        class55 var5 = class62.method395(10, arg4, (byte) -66);
        var5.method340((byte) -110);
        if (arg3 <= -22) {
            var5.field954 = arg2;
            var5.field947 = arg0;
            var5.field953 = arg1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILec;IZI)V")
    public static final void method1265(int arg0, int arg1, class57 arg2, int arg3, boolean arg4, int arg5) {
        field3121++;
        if (arg2.field988 == -1 && arg2.field997 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg2.field985) {
            var6 += arg1 - arg2.field985;
        } else if (arg1 < arg2.field991) {
            var6 += arg2.field991 - arg1;
        }
        if (arg2.field983 < arg3) {
            var6 += arg3 - arg2.field983;
        } else if (arg3 < arg2.field1009) {
            var6 += arg2.field1009 - arg3;
        }
        int var7 = class196.field3167 * arg2.field1000 >> 8;
        if (arg2.field1004 == 0 || var6 - 64 > arg2.field1004 || class196.field3167 == 0 || arg2.field984 != arg0) {
            if (arg2.field1001 != null) {
                class10.field149.method259(arg2.field1001);
                arg2.field1001 = null;
            }
            if (arg2.field1008 != null) {
                class10.field149.method259(arg2.field1008);
                arg2.field1008 = null;
            }
        } else if (arg4) {
            var6 -= 64;
            if (var6 < 0) {
                var6 = 0;
            }
            int var8 = (arg2.field1004 - var6) * var7 / arg2.field1004;
            if (arg2.field1001 != null) {
                arg2.field1001.method1893(var8);
            } else if (arg2.field988 >= 0) {
                class218 var9 = class218.method1446(class207.field3449, arg2.field988, 0);
                if (var9 != null) {
                    class202 var10 = var9.method1448().method1339(class237.field3898);
                    class284 var11 = class284.method1877(var10, 100, var8);
                    var11.method1900(-1);
                    class10.field149.method254(var11);
                    arg2.field1001 = var11;
                }
            }
            if (arg2.field1008 != null) {
                arg2.field1008.method1893(var8);
                if (!arg2.field1008.method545(-105)) {
                    arg2.field1008 = null;
                }
            } else if (arg2.field997 != null && (arg2.field992 -= arg5) <= 0) {
                int var12 = (int) (Math.random() * (double) arg2.field997.length);
                class218 var13 = class218.method1446(class207.field3449, arg2.field997[var12], 0);
                if (var13 != null) {
                    class202 var14 = var13.method1448().method1339(class237.field3898);
                    class284 var15 = class284.method1877(var14, 100, var8);
                    var15.method1900(0);
                    class10.field149.method254(var15);
                    arg2.field1008 = var15;
                    arg2.field992 = arg2.field1003 + (int) ((double) (arg2.field998 - arg2.field1003) * Math.random());
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method1266(int arg0, int arg1) {
        int var2 = 25 / ((arg0 - 59) / 50);
        class55 var3 = class62.method395(5, arg1, (byte) -66);
        var3.method341((byte) 62);
        field3115++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)I")
    public static final int method1267(int arg0, boolean arg1) {
        field3116++;
        int var2 = 0;
        if (arg1) {
            field3126 = 61;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field3118 = null;
        if (arg0 == -17) {
            field3119 = null;
            field3120 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Leh;I)Lbb;")
    public static final class172 method1269(class101 arg0, int arg1) {
        field3122++;
        if (arg1 != -20104) {
            method1265(-30, 57, (class57) null, 82, true, 12);
        }
        return new class172(arg0.method686(-3), arg0.method686(-3), arg0.method686(arg1 + 20101), arg0.method686(-3), arg0.method658(22292), arg0.method669((byte) 36));
    }
}
