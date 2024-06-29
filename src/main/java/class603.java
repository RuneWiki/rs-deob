import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class603 extends class450 {

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "Z")
    private boolean field7915 = true;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "Z")
    public boolean field7924 = false;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "Lhda;")
    public static class752 field7923 = new class752(70, 8);

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
    public static int field7928 = 0;

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "F")
    public static float field7926;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "Loca;")
    public static class266 field7927;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field7929;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field7930;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field7931;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3285(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method3277(byte arg0) {
        int var2 = 37 / ((-57 - arg0) / 62);
        ++field7912;
        return this.field7915;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)I", line = 15)
    public final int method75(int arg0, int arg1) {
        ++field7917;
        if (arg0 != 0) {
            this.method67(true, 93);
        }
        if (!super.field6171.method1680(-18640).method1227(-109)) {
            return 3;
        } else {
            return ~arg1 == -4 && !class128.method1013("jagdx", (byte) -124) ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(ILup;)V", line = 39)
    public class603(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V", line = 43)
    public static void method3278(int arg0) {
        if (arg0 != 0) {
            method3283(91);
        }
        field7927 = null;
        field7923 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)I", line = 55)
    public static final int method3279(int arg0) {
        ++field7920;
        int var1 = 0;
        Field[] var2 = (field7929 != null ? field7929 : (field7929 = method3285("up"))).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
            Field var5 = var3[var4];
            if ((field7930 != null ? field7930 : (field7930 = method3285("qv"))).isAssignableFrom(var5.getType())) {
                ++var1;
            }
        }
        if (arg0 >= -12) {
            field7923 = null;
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V", line = 86)
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            this.method3280(28);
        }
        ++field7918;
        if (!super.field6171.method1680(-18640).method1227(-24)) {
            super.field6170 = 0;
        }
        if (~super.field6170 > -1 || super.field6170 > 5) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)Z", line = 103)
    public final boolean method3280(int arg0) {
        ++field7913;
        if (arg0 != 260) {
            field7927 = null;
        }
        return super.field6171.method1680(-18640).method1227(-100);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLfs;Z)V", line = 120)
    public static final void method3281(boolean arg0, class556 arg1, boolean arg2) {
        ++field7922;
        if (~class181.field2730 > -401) {
            class166 var3 = arg1.field7328;
            String var4 = arg1.field7318;
            if (var3.field2575 != null) {
                var3 = var3.method1190((byte) 70, class74.field901);
                if (var3 == null) {
                    return;
                }
                var4 = var3.field2567;
            }
            if (var3.field2563) {
                if (arg1.field7322 != 0) {
                    String var5 = class683.field9532 == class12.field187 ? class517.field6870.method2877(class713.field9854, (byte) -108) : class517.field6868.method2877(class713.field9854, (byte) -108);
                    var4 = var4 + class161.method1153(class472.field6475.field5330, !arg0, arg1.field7322) + " (" + var5 + arg1.field7322 + ")";
                }
                if (class142.field2268 && !arg2) {
                    class62 var6 = ~class495.field6680 != 0 ? class505.field6754.method4149(-6119, class495.field6680) : null;
                    if (~(class575.field7557 & 2) != -1 && (var6 == null || var3.method1197(-156, var6.field761, class495.field6680) != var6.field761)) {
                        ++class330.field4712;
                        class586.method3203(true, (long) arg1.field10297, (long) arg1.field10297, false, 0, 9, false, -1, class414.field5733, class719.field10008, (byte) 87, class341.field4808 + " -> <col=ffff00>" + var4, 0);
                    }
                }
                if (!arg2) {
                    String[] var7 = var3.field2547;
                    if (class714.field9860) {
                        var7 = class286.method1771(-28574, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (var3.field2554 == 0 || !var7[var8].equalsIgnoreCase(class517.field6863.method2877(class713.field9854, (byte) -108)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 59;
                                }
                                int var10 = class456.field6235;
                                if (~var8 == -2) {
                                    var9 = 6;
                                }
                                if (var8 == 2) {
                                    var9 = 18;
                                }
                                if (~var8 == -4) {
                                    var9 = 11;
                                }
                                if (~var8 == -5) {
                                    var9 = 47;
                                }
                                if (~var3.field2524 == ~var8) {
                                    var10 = var3.field2539;
                                }
                                if (~var3.field2564 == ~var8) {
                                    var10 = var3.field2518;
                                }
                                class586.method3203(true, (long) arg1.field10297, (long) arg1.field10297, false, 0, var9, false, -1, var7[var8].equalsIgnoreCase(class517.field6863.method2877(class713.field9854, (byte) -108)) ? var3.field2565 : var10, var7[var8], (byte) 87, "<col=ffff00>" + var4, 0);
                                ++class155.field2362;
                            }
                        }
                    }
                    if (var3.field2554 == 1 && var7 != null) {
                        for (int var11 = 4; var11 >= 0; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class517.field6863.method2877(class713.field9854, (byte) -108))) {
                                short var12 = 0;
                                if (~arg1.field7322 < ~class472.field6475.field5330) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (~var11 == -1) {
                                    var13 = 59;
                                }
                                if (var11 == 1) {
                                    var13 = 6;
                                }
                                if (var11 == 2) {
                                    var13 = 18;
                                }
                                if (~var11 == -4) {
                                    var13 = 11;
                                }
                                if (~var11 == -5) {
                                    var13 = 47;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                class586.method3203(true, (long) arg1.field10297, (long) arg1.field10297, false, 0, var13, false, -1, var3.field2565, var7[var11], (byte) 87, "<col=ffff00>" + var4, 0);
                                ++class89.field1088;
                            }
                        }
                    }
                }
                ++class1.field3;
                class586.method3203(arg0, (long) arg1.field10297, (long) arg1.field10297, false, 0, 1002, arg2, -1, class339.field4797, class517.field6862.method2877(class713.field9854, (byte) -108), (byte) 87, "<col=ffff00>" + var4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)I", line = 277)
    public final int method3282(boolean arg0) {
        ++field7914;
        if (!arg0) {
            this.method3282(false);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V", line = 288)
    public final void method67(boolean arg0, int arg1) {
        this.field7924 = false;
        if (!arg0) {
            method3278(12);
        }
        ++field7921;
        super.field6170 = arg1;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lup;)V", line = 343)
    public class603(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)V", line = 308)
    public static final void method3283(int arg0) {
        if (arg0 == 3) {
            ++field7925;
            if (!class66.field828.field2900) {
                try {
                    Method var1 = (field7931 != null ? field7931 : (field7931 = method3285("java.lang.Runtime"))).getMethod("maxMemory");
                    if (var1 != null) {
                        try {
                            Runtime var2 = Runtime.getRuntime();
                            Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                            class365.field5128 = (int) (var3 / 1048576L) - -1;
                            return;
                        } catch (Throwable var4) {
                            return;
                        }
                    }
                } catch (Exception var5) {
                    return;
                }
            } else {
                class365.field5128 = 96;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZI)V", line = 346)
    public final void method3284(boolean arg0, int arg1) {
        ++field7919;
        this.field7915 = arg0;
        if (arg1 != 0) {
            this.field7915 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)I", line = 365)
    public final int method68(boolean arg0) {
        ++field7916;
        this.field7924 = true;
        if (arg0) {
            this.field7915 = true;
        }
        return !super.field6171.method1680(-18640).method1227(-110) ? 0 : 2;
    }
}
