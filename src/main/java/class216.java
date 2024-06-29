import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class216 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "J")
    public long field4178 = 0L;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lrd;")
    private static class173 field4182 = class133.method843("glow1:", 23);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lrd;")
    public static class173 field4181 = class133.method843(":chalreq:", -66);

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lrd;")
    public static class173 field4180 = field4182;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lrd;")
    public static class173 field4172 = field4182;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Laf;")
    public static class7 field4185 = new class7(50);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field4192 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Z")
    public static boolean field4191 = false;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field4194 = -1;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lbc;")
    public static class14 field4179;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Ldd;")
    public class35 field4183;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Ldd;")
    public class35 field4184;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lbc;ZIILbc;)Le;")
    public static final class41 method1413(class14 arg0, boolean arg1, int arg2, int arg3, class14 arg4) {
        field4173++;
        int[] var5 = arg0.method119(arg3, false);
        boolean var6 = true;
        int var7 = 0;
        if (arg2 != 16711935) {
            method1413(null, false, 119, 20, null);
        }
        while (var7 < var5.length) {
            byte[] var8 = arg0.method141(arg3, var5[var7], (byte) 125);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg4.method141(0, var9, (byte) 58);
                } else {
                    var10 = arg4.method141(var9, 0, (byte) 123);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class41(arg0, arg4, arg3, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILbc;)[Ldh;")
    public static final class39[] method1414(int arg0, int arg1, class14 arg2) {
        field4175++;
        if (arg1 != 0) {
            field4180 = null;
        }
        return class80.method497(56, arg2, arg0) ? class176.method1169((byte) -113) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field4172 = null;
        field4185 = null;
        field4181 = null;
        field4179 = null;
        field4180 = null;
        field4182 = null;
        if (arg0 != 54) {
            method1416(92, 52, false, -122);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZI)I")
    public static final int method1416(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 256 - arg0;
        field4189++;
        if (!arg2) {
            field4185 = null;
        }
        return ((arg1 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg0 & 0xFF0000) + ((arg1 & 0xFF00FF) * var4 + ((arg3 & 0xFF00FF) * arg0) & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILve;II)V")
    public static final void method1417(int arg0, int arg1, class212 arg2, int arg3, int arg4) {
        field4177++;
        if (class175.field3447 == arg2 || (class195.field3792 >= 400 || arg1 != 8)) {
            return;
        }
        class173 var5;
        if (arg2.field4099 == 0) {
            var5 = class173.method1158(arg1 - 11, new class173[] { arg2.field4097, class207.method1371(arg2.field4110, class175.field3447.field4110, 26451), class78.field1524, class52.field1073, class93.method588(arg2.field4110, true), class173.field3370 });
        } else {
            var5 = class173.method1158(-3, new class173[] { arg2.field4097, class78.field1524, class22.field471, class93.method588(arg2.field4099, true), class173.field3370 });
        }
        if (class9.field166 == 1) {
            class19.method172((byte) -55, (short) 58, (long) arg0, class20.field444, arg3, class173.method1158(-3, new class173[] { class150.field2849, class129.field2433, var5 }), arg4);
            class144.field2690++;
        } else if (!class182.field3582) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class135.field2557[var6] != null) {
                    class157.field2945++;
                    short var8 = 0;
                    if (class48.field1022 == 0 && class135.field2557[var6].method1123(57, class60.field1174)) {
                        if (arg2.field4110 > class175.field3447.field4110) {
                            var8 = 2000;
                        }
                        if (class175.field3447.field4115 != 0 && arg2.field4115 != 0) {
                            if (class175.field3447.field4115 == arg2.field4115) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class157.field2944[var6]) {
                        var8 = 2000;
                    }
                    boolean var9 = false;
                    short var10 = class147.field2785[var6];
                    short var11 = (short) (var8 + var10);
                    class19.method172((byte) 121, var11, (long) arg0, class135.field2557[var6], arg3, class173.method1158(-3, new class173[] { class159.field2970, var5 }), arg4);
                }
            }
        } else if ((class36.field780 & 0x8) == 8) {
            class38.field797++;
            class19.method172((byte) 104, (short) 21, (long) arg0, class48.field1023, arg3, class173.method1158(-3, new class173[] { class42.field868, class129.field2433, var5 }), arg4);
        }
        for (int var7 = 0; var7 < class195.field3792; var7++) {
            if (class179.field3526[var7] == 30) {
                class21.field461[var7] = class173.method1158(-3, new class173[] { class159.field2970, var5 });
                return;
            }
        }
    }
}
