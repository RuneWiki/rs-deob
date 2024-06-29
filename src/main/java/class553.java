import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class553 {

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "Lpa;")
    private class387 field7868 = new class387(64);

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "Lpa;")
    public class387 field7881 = new class387(64);

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Lcb;")
    public class544 field7869;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "Lcb;")
    private class544 field7872;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "Z")
    public static boolean field7873 = false;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "[Lva;")
    public static class520[] field7876 = new class520[14];

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field7875 = 0;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIZIIII)Z")
    public static final boolean method3214(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field7870++;
        if (arg2 != 14) {
            return false;
        }
        int var9 = class251.field3549.field6448[0];
        int var10 = class251.field3549.field6445[0];
        if (var9 < 0 || var9 >= class109.field1314 || var10 < 0 || class760.field10479 <= var10) {
            return false;
        } else if (arg1 >= 0 && class109.field1314 > arg1 && arg8 >= 0 && arg8 < class760.field10479) {
            int var11 = class579.method3365(arg1, arg2 ^ 0xFFFFFF71, arg0, arg7, var9, arg5, class234.field3394[class251.field3549.field7710], class302.field4527, arg3, arg6, arg4, class667.field9390, var10, class251.field3549.method2692((byte) -124), arg8);
            if (var11 < 1) {
                return false;
            }
            class697.field9843 = class302.field4527[var11 - 1];
            class336.field4995 = class667.field9390[var11 - 1];
            class334.field4981 = false;
            class777.method4274(false);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)Lwl;")
    public final class427 method3215(byte arg0, int arg1) {
        field7879++;
        class387 var3 = this.field7868;
        class427 var4;
        synchronized (this.field7868) {
            var4 = (class427) this.field7868.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field7872;
        byte[] var6;
        synchronized (this.field7872) {
            var6 = this.field7872.method3150(arg1, -119, 34);
        }
        class427 var7 = new class427();
        if (arg0 < 92) {
            this.field7872 = null;
        }
        var7.field6005 = this;
        if (var6 != null) {
            var7.method2541(-1, new class120(var6));
        }
        class387 var8 = this.field7868;
        synchronized (this.field7868) {
            this.field7868.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)V")
    public final void method3216(int arg0, int arg1, int arg2) {
        field7877++;
        this.field7868 = new class387(arg0);
        this.field7881 = new class387(arg2);
        if (arg1 != -1) {
            this.field7872 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(BI)V")
    public final void method3217(byte arg0, int arg1) {
        class387 var3 = this.field7868;
        synchronized (this.field7868) {
            int var4 = 68 / ((-arg0 - 46) / 51);
            this.field7868.method2366(arg1, 119);
        }
        field7871++;
        class387 var5 = this.field7881;
        synchronized (this.field7881) {
            this.field7881.method2366(arg1, 127);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public final void method3218(int arg0) {
        field7878++;
        class387 var2 = this.field7868;
        synchronized (this.field7868) {
            this.field7868.method2364(1);
        }
        class387 var3 = this.field7881;
        synchronized (this.field7881) {
            if (arg0 != -1) {
                field7875 = 41;
            }
            this.field7881.method2364(1);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
    public static void method3219(byte arg0) {
        if (arg0 < 43) {
            method3221(false, -44);
        }
        field7876 = null;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public final void method3220(int arg0) {
        class387 var2 = this.field7868;
        synchronized (this.field7868) {
            if (arg0 != 0) {
                return;
            }
            this.field7868.method2369(-1);
        }
        field7867++;
        class387 var3 = this.field7881;
        synchronized (this.field7881) {
            this.field7881.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)I")
    public static final int method3221(boolean arg0, int arg1) {
        field7880++;
        int var2 = class463.field6612;
        if (var2 == 0) {
            return arg0 ? 0 : class614.field8677;
        } else if (var2 == 1) {
            return class614.field8677;
        } else if (var2 == 2) {
            return 0;
        } else {
            if (arg1 <= 105) {
                field7875 = 98;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Liv;ILcb;Lcb;)V")
    public class553(class106 arg0, int arg1, class544 arg2, class544 arg3) {
        this.field7869 = arg3;
        this.field7872 = arg2;
        this.field7872.method3147(34, -51);
    }
}
