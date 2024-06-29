import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class574 extends class299 {

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8298 = new String[] { method4225(method4224("T\u0012\nR|")), method4225(method4224("T\u0012\n]|")), method4225(method4224("T\u0012\nP|")), method4225(method4224("T\u0012\n\\|")), method4225(method4224("T\u0012\n^|")), method4225(method4224("T\u0012\n[|")), method4225(method4224("T\u0012\n_|")), method4225(method4224("T\u0012\nZ|")), method4225(method4224("T\u0012\nY|")), method4225(method4224("T\u0012\nQ|")) };

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
    public static int[] field8286 = new int[8];

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Llt;")
    public static class706 field8287 = new class706(6, 8);

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lhl;")
    public static class556 field8294 = new class556(17, -2);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lgda;")
    public static class58 field8296;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[Lsia;")
    public static class769[] field8295;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Z")
    public final boolean method4218(int arg0) {
        try {
            ++field8292;
            if (super.field4850.method3245((byte) -58)) {
                return false;
            } else if (arg0 != 3) {
                return true;
            } else {
                return super.field4850.method3243(-126) == class229.field3561;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8298[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public static void method4219(int arg0) {
        try {
            field8295 = null;
            field8287 = null;
            field8296 = null;
            field8294 = null;
            if (arg0 != 3) {
                method4223((byte) 125, 46, 83);
            }
            field8286 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8298[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
    public static final boolean method4220(int arg0, int arg1, int arg2) {
        try {
            int var3 = 109 / ((20 - arg2) / 43);
            ++field8283;
            return class625.method4565(arg0, 22206, arg1) & class370.method3045(arg0, (byte) 48, arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8298[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)I")
    public final int method4221(boolean arg0) {
        try {
            if (!arg0) {
                return -28;
            } else {
                ++field8284;
                return super.field4849;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8298[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ILes;)V")
    public class574(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method4222(byte arg0) {
        try {
            ++field8288;
            class527 var1 = null;
            try {
                int var2 = -14 / ((arg0 - -15) / 57);
                class218 var3 = class393.field6256.method628(-123, "", true);
                while (var3.field3402 == 0) {
                    class524.method3918(-4, 1L);
                }
                if (~var3.field3402 == -2) {
                    var1 = (class527) var3.field3407;
                    class176 var4 = class623.field8996.method3241(-2);
                    var1.method3941(-1, var4.field2799, 0, var4.field2805);
                }
            } catch (Exception var7) {
            }
            try {
                if (var1 != null) {
                    var1.method3940(1);
                }
            } catch (Exception var6) {
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8298[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field8289;
            super.field4849 = arg0;
            if (arg1) {
                field8295 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8298[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Les;)V")
    public class574(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field8293;
            if (super.field4850.method3245((byte) -58)) {
                return 3;
            } else if (super.field4850.method3243(-82) == class229.field3561) {
                if (~arg1 == -1) {
                    if (~super.field4850.field6375.method3507(true) == -2) {
                        return 2;
                    }
                    if (super.field4850.field6363.method1140(true) == 1) {
                        return 2;
                    }
                    if (~super.field4850.field6374.method1345(true) < -1) {
                        return 2;
                    }
                }
                return 1;
            } else {
                if (arg0 != 1) {
                    field8294 = null;
                }
                return 3;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8298[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                return 60;
            } else {
                ++field8291;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8298[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)Z")
    public static final boolean method4223(byte arg0, int arg1, int arg2) {
        try {
            ++field8285;
            if (arg0 > -94) {
                method4220(89, 95, -98);
            }
            return ~(arg1 & 458752) != -1 | class685.method4990(arg2, arg1, true) || class735.method5336(20889, arg2, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8298[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (super.field4850.method3243(-113) != class229.field3561) {
                super.field4849 = 1;
            } else if (super.field4850.method3245((byte) -58)) {
                super.field4849 = 0;
            }
            ++field8290;
            if (arg0 == -20456) {
                if (super.field4849 != 0 && super.field4849 != 1) {
                    super.field4849 = this.method847(0);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8298[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4224(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 84);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4225(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
