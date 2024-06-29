import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class233 {

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Loh;")
    public static class263 field4071 = class253.method1681(-123, "::serverjs5drop");

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static volatile int field4070 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient;")
    public static client field4074;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[[B")
    public static byte[][] field4077;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILue;II)[Lw;")
    public static final class141[] method1561(int arg0, class86 arg1, int arg2, int arg3) {
        field4068++;
        if (class254.method1687(arg2, (byte) 89, arg1, arg0)) {
            if (arg3 > -47) {
                method1568(72, -53);
            }
            return class174.method1150(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class276.field4831 >= arg1 && class11.field249 <= arg4) {
            boolean var6;
            if (arg3 < class51.field1099) {
                var6 = false;
                arg3 = class51.field1099;
            } else if (class198.field3587 < arg3) {
                arg3 = class198.field3587;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg5 < class51.field1099) {
                arg5 = class51.field1099;
                var7 = false;
            } else if (class198.field3587 < arg5) {
                var7 = false;
                arg5 = class198.field3587;
            } else {
                var7 = true;
            }
            if (arg1 < class11.field249) {
                arg1 = class11.field249;
            } else {
                class191.method1255(arg5, arg0, arg3, 104, class38.field870[arg1++]);
            }
            if (arg4 <= class276.field4831) {
                class191.method1255(arg5, arg0, arg3, 111, class38.field870[arg4--]);
            } else {
                arg4 = class276.field4831;
            }
            if (var7 && var6) {
                for (int var8 = arg1; var8 <= arg4; var8++) {
                    int[] var9 = class38.field870[var8];
                    var9[arg5] = var9[arg3] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg1; var10 <= arg4; var10++) {
                    class38.field870[var10][arg5] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg1; var11 <= arg4; var11++) {
                    class38.field870[var11][arg3] = arg0;
                }
            }
        }
        field4075++;
        if (arg2 > -87) {
            method1562(-10, 71, 107, 53, 74, -41);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1563(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -108) {
            method1563(-110, 19, 21, -83, (byte) -111, -70, -116, -110);
        }
        field4066++;
        if (arg0 == arg5) {
            class61.method379(arg7, arg5, arg1, arg6, false, arg3, arg2);
        } else if (class51.field1099 <= (arg7 - arg5) && (arg5 + arg7) <= class198.field3587 && (arg1 - arg0) >= class11.field249 && arg1 + arg0 <= class276.field4831) {
            class23.method171(9073, arg1, arg5, arg0, arg6, arg3, arg7, arg2);
        } else {
            class70.method450(arg3, arg1, arg5, 0, arg6, arg2, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBI)I")
    public static final int method1564(int arg0, int arg1, byte arg2, int arg3) {
        field4069++;
        if (arg2 > -124) {
            field4070 = -47;
        }
        int var4 = arg0 & arg3 - 1;
        int var5 = arg1 / arg3;
        int var6 = arg0 / arg3;
        int var7 = arg1 & arg3 - 1;
        int var8 = class170.method1123(var6, var5, (byte) -123);
        int var9 = class170.method1123(var6 + 1, var5, (byte) -123);
        int var10 = class170.method1123(var6, var5 + 1, (byte) -123);
        int var11 = class170.method1123(var6 + 1, var5 + 1, (byte) -123);
        int var12 = class112.method735(var9, arg3, (byte) 92, var8, var4);
        int var13 = class112.method735(var11, arg3, (byte) 116, var10, var4);
        return class112.method735(var13, arg3, (byte) 90, var12, var7);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)Loh;")
    public static final class263 method1565(int arg0, long arg1) {
        field4067++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % (long) arg0) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class4.field86[(int) (var8 - (arg1 * 37L))];
            }
            class263 var7 = new class263();
            var7.field4605 = var6;
            var7.field4591 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1566(int arg0) {
        field4074 = null;
        field4077 = null;
        if (arg0 >= -57) {
            field4070 = 96;
        }
        field4071 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZ)V")
    public static final void method1567(int arg0, int arg1, int arg2, boolean arg3) {
        field4073++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class198.field3580 = arg1;
        class20.field462 = arg0;
        if (arg2 < -53) {
            class137.field2526 = arg3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method1568(int arg0, int arg1) {
        field4065++;
        class216.method1466((byte) -88);
        if (arg1 >= -71) {
            return;
        }
        class260.method1713((byte) -119);
        int var2 = class107.method720(arg0, (byte) 30).field3349;
        if (var2 == 0) {
            return;
        }
        int var3 = class48.field1038[arg0];
        if (var2 == 5) {
            class188.field3376 = var3;
        }
        if (var2 == 9) {
            class50.field1074 = var3;
        }
        if (var2 == 6) {
            class162.field2960 = var3;
        }
    }
}
