import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class151 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
    public static boolean field2465 = false;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field2468 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lab;")
    public static class279 field2463 = new class279(5);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lbm;")
    public static class307 field2467;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 5)
    public static final void method981(int arg0, int arg1) {
        field2466++;
        class2 var2 = class212.method1433(arg0, arg1, -13802);
        var2.method16((byte) 124);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 18)
    public static void method982(int arg0) {
        field2467 = null;
        if (arg0 > -60) {
            field2468 = 114;
        }
        field2463 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 31)
    public static final String method983(boolean arg0, int arg1, int arg2, int arg3) {
        field2462++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg2;
            if (arg1 >= -112) {
                return (String) null;
            }
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg2;
                int var9 = var8 - arg2 * arg3;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBZ)I", line = 88)
    public static final int method984(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != -15) {
            return 108;
        }
        class281 var4 = (class281) class21.field449.method303((long) arg0, (byte) 122);
        field2464++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4327.length; var6++) {
            if (var4.field4327[var6] >= 0 && var4.field4327[var6] < class328.field5038) {
                class337 var7 = class95.method636(22111, var4.field4327[var6]);
                if (var7.field5188 != null) {
                    class166 var8 = (class166) var7.field5188.method303((long) arg1, (byte) 127);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field4324[var6] * var8.field2682;
                        } else {
                            var5 += var8.field2682;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)Z", line = 142)
    public static final boolean method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLkl;)Z", line = 172)
    public static final boolean method986(boolean arg0, class68 arg1) {
        field2470++;
        if (!arg0) {
            method981(66, 114);
        }
        if (arg1.field1438 == 205) {
            class276.field4225 = 250;
            return true;
        } else {
            return false;
        }
    }
}
