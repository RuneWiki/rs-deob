import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class218 extends class212 {

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
    public static int field3161 = 1;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!sba", name = "v", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1556(byte arg0, long arg1) {
        ++field3165;
        if (arg1 > 0L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                int var6 = -20 % ((arg0 - -6) / 62);
                while (var4 != 0L) {
                    ++var3;
                    var4 /= 37L;
                }
                StringBuffer var7 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    char var10 = class606.field8314[(int) (-(arg1 * 37L) + var8)];
                    if (~var10 == -96) {
                        int var11 = var7.length() + -1;
                        var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                        var10 = 160;
                    }
                    var7.append(var10);
                }
                var7.reverse();
                var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                return var7.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field3161 = -22;
        }
        ++field3163;
        return ~arg1 != -1 && ~super.field3004.field4453.method1849(arg0 ^ -32351) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (arg0) {
            field3161 = 46;
        }
        if (~super.field3006 != -1 && super.field3004.field4453.method1849(-32350) != 1) {
            super.field3006 = 0;
        }
        ++field3156;
        if (super.field3006 < 0 || ~super.field3006 < -2) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)I")
    public final int method1557(int arg0) {
        if (arg0 != -32350) {
            field3157 = 32;
        }
        ++field3166;
        return super.field3006;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ldh;)V")
    public class218(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        ++field3160;
        int var3 = -19 / ((arg0 - 82) / 35);
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)Z")
    public final boolean method1558(int arg0) {
        if (arg0 < 85) {
            field3161 = -109;
        }
        ++field3164;
        return true;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(ILdh;)V")
    public class218(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I[IILke;)V")
    public static final void method1559(int arg0, int[] arg1, int arg2, class598 arg3) {
        ++field3158;
        if (arg3.field5662 != null) {
            boolean var4 = true;
            for (int var5 = 0; arg3.field5662.length > var5; ++var5) {
                if (~arg3.field5662[var5] != ~arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && ~arg3.field5712 != 0) {
                class691 var6 = class456.field6436.method1021(arg3.field5712, 7);
                int var7 = var6.field9338;
                if (~var7 == -2) {
                    arg3.field5658 = 0;
                    arg3.field5693 = 0;
                    arg3.field5720 = 0;
                    arg3.field5644 = arg2;
                    arg3.field5670 = 1;
                    if (!arg3.field5735) {
                        class190.method1366(arg3, arg3.field5693, var6, arg0 ^ -24053);
                    }
                }
                if (~var7 == -3) {
                    arg3.field5720 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg0 != 23946) {
            method1559(126, (int[]) null, -73, (class598) null);
        }
        for (int var9 = 0; ~var9 > ~arg1.length; ++var9) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg3.field5662 == null || ~arg3.field5662[var9] == 0 || ~class456.field6436.method1021(arg1[var9], arg0 ^ 23949).field9329 <= ~class456.field6436.method1021(arg3.field5662[var9], 7).field9329) {
                arg3.field5644 = arg2;
                arg3.field5662 = arg1;
                break;
            }
        }
        if (var8) {
            arg3.field5662 = arg1;
            arg3.field5644 = arg2;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            this.method1557(40);
        }
        ++field3159;
        return 1;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1560(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field3162;
        int var6 = class486.method2865(class479.field6682, arg0, class58.field1150, -90);
        int var7 = class486.method2865(class479.field6682, arg2, class58.field1150, -94);
        int var8 = class486.method2865(class536.field7419, arg1, class140.field2314, 77);
        int var9 = class486.method2865(class536.field7419, arg3, class140.field2314, 59);
        int var10 = -27 / ((arg4 - -6) / 55);
        for (int var11 = var6; var11 <= var7; ++var11) {
            class47.method550(-27, var9, class691.field9345[var11], var8, arg5);
        }
    }
}
