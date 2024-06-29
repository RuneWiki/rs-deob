import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class252 {

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Ljc;")
    public class252 field4109;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lpg;")
    public class435 field4113;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4102 = "Examine";

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
    public static int[] field4106 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4108;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method1748(int arg0, int arg1, boolean arg2, int arg3) {
        field4111++;
        int var4 = 43 % ((arg0 + 30) / 35);
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            int var5 = 2;
            for (int var6 = arg3 / arg1; var6 != 0; var6 /= arg1) {
                var5++;
            }
            char[] var7 = new char[var5];
            var7[0] = '+';
            for (int var8 = var5 - 1; var8 > 0; var8--) {
                int var9 = arg3;
                arg3 /= arg1;
                int var10 = var9 - (arg1 * arg3);
                if (var10 >= 10) {
                    var7[var8] = (char) (var10 + 87);
                } else {
                    var7[var8] = (char) (var10 + 48);
                }
            }
            return new String(var7);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lmo;IZLmo;)V")
    public static final void method1749(class447 arg0, int arg1, boolean arg2, class447 arg3) {
        class368.field5587 = arg3;
        class190.field3107 = arg2;
        class308.field4878 = arg0;
        field4103++;
        int var4 = class368.field5587.method2773(arg1 - 67) - 1;
        class308.field4880 = var4 * 256 + class368.field5587.method2758(var4, 14535);
        class317.field4971 = new String[] { null, null, null, null, class422.field6234 };
        if (arg1 != 128) {
            method1750(-125, -106, -111, 40);
        }
        class119.field1638 = new String[] { null, null, class412.field6098, null, null };
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1750(int arg0, int arg1, int arg2, int arg3) {
        if (!class427.method2649(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class275.field4396[arg0].method779(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class40.field507) {
                    if (!class318.method2117(var4, var6, var5)) {
                        return false;
                    }
                    if (!class318.method2117(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class318.method2117(var4, var7, var5)) {
                        return false;
                    }
                    if (!class318.method2117(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class318.method2117(var4, var8, var5)) {
                    return false;
                }
                if (!class318.method2117(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class379.field5746) {
                    if (!class318.method2117(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class318.method2117(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class318.method2117(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class318.method2117(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class318.method2117(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class318.method2117(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class40.field507) {
                    if (!class318.method2117(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class318.method2117(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class318.method2117(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class318.method2117(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class318.method2117(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class318.method2117(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class379.field5746) {
                    if (!class318.method2117(var4, var6, var5)) {
                        return false;
                    }
                    if (!class318.method2117(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class318.method2117(var4, var7, var5)) {
                        return false;
                    }
                    if (!class318.method2117(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class318.method2117(var4, var8, var5)) {
                    return false;
                }
                if (!class318.method2117(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class318.method2117(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class318.method2117(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class318.method2117(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class318.method2117(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class318.method2117(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static final void method1751(int arg0) {
        if (arg0 != -1) {
            method1752(4);
        }
        field4104++;
        if (class279.field4460 != 3) {
            class155.field2434 = -1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field4106 = null;
        field4108 = null;
        if (arg0 != -37) {
            field4106 = null;
        }
        field4102 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)Z")
    public static final boolean method1753(int arg0, int arg1, int arg2, int arg3) {
        if (class427.method2649(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class318.method2117(var4 + 1, class275.field4396[arg0].method779(arg1, arg2) + arg3, var5 + 1) && class318.method2117(var4 + 128 - 1, class275.field4396[arg0].method779(arg1 + 1, arg2) + arg3, var5 + 1) && class318.method2117(var4 + 128 - 1, class275.field4396[arg0].method779(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class318.method2117(var4 + 1, class275.field4396[arg0].method779(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
    public class252(int arg0, int arg1) {
        this.field4110 = arg0;
        this.field4107 = arg1;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljc;I)V")
    public class252(class252 arg0, int arg1) {
        this.field4109 = arg0;
        this.field4110 = this.field4109.field4110;
        this.field4107 = this.field4109.field4107 + arg1;
        this.field4113 = this.field4109.field4113;
    }
}
