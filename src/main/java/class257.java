import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class257 {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lge;")
    private class325 field3932 = new class325();

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3938 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3933 = -1;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public static int[] field3925 = new int[14];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lge;")
    private class325 field3941;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 6)
    public static final Class method1805(int arg0, String arg1) throws ClassNotFoundException {
        field3926++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != 3738) {
                method1812(24, 120, 106);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 48)
    public static void method1806(byte arg0) {
        int var1 = -29 / ((-arg0 - 49) / 36);
        field3925 = null;
        field3938 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Lge;", line = 67)
    public final class325 method1807(int arg0) {
        int var2 = 43 % ((arg0 - 58) / 62);
        field3935++;
        class325 var3 = this.field3941;
        if (this.field3932 == var3) {
            this.field3941 = null;
            return null;
        } else {
            this.field3941 = var3.field5017;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I", line = 86)
    public final int method1808(byte arg0) {
        field3928++;
        if (arg0 > -69) {
            this.field3941 = (class325) null;
        }
        int var2 = 0;
        class325 var3 = this.field3932.field5017;
        while (this.field3932 != var3) {
            var3 = var3.field5017;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIB)I", line = 111)
    public static final int method1809(int arg0, int arg1, byte arg2) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 125) {
            return -3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        field3931++;
        return arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lge;Z)V", line = 139)
    public final void method1810(class325 arg0, boolean arg1) {
        if (arg1) {
            method1815(-104, -93);
        }
        field3927++;
        if (arg0.field5018 != null) {
            arg0.method2257(false);
        }
        arg0.field5018 = this.field3932.field5018;
        arg0.field5017 = this.field3932;
        arg0.field5018.field5017 = arg0;
        arg0.field5017.field5018 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Lge;", line = 157)
    public final class325 method1811(int arg0) {
        field3934++;
        if (arg0 != 7) {
            field3933 = -74;
        }
        class325 var2 = this.field3932.field5017;
        if (this.field3932 == var2) {
            this.field3941 = null;
            return null;
        } else {
            this.field3941 = var2.field5017;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Z", line = 183)
    public static final boolean method1812(int arg0, int arg1, int arg2) {
        int var3 = class96.field1378[arg0][arg1][arg2];
        if (-class318.field4916 == var3) {
            return false;
        } else if (class318.field4916 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class120.method909(var4 + 1, class203.field3111[arg0][arg1][arg2], var5 + 1) && class120.method909(var4 + 128 - 1, class203.field3111[arg0][arg1 + 1][arg2], var5 + 1) && class120.method909(var4 + 128 - 1, class203.field3111[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class120.method909(var4 + 1, class203.field3111[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class96.field1378[arg0][arg1][arg2] = class318.field4916;
                return true;
            } else {
                class96.field1378[arg0][arg1][arg2] = -class318.field4916;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 267)
    public class257() {
        this.field3932.field5017 = this.field3932;
        this.field3932.field5018 = this.field3932;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Lge;", line = 218)
    public final class325 method1813(int arg0) {
        class325 var2 = this.field3932.field5017;
        field3942++;
        if (this.field3932 == var2) {
            return null;
        }
        var2.method2257(false);
        if (arg0 != 1) {
            this.field3941 = (class325) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V", line = 234)
    public static final void method1814(int arg0, int arg1) {
        class242.field3680.method741(arg1, (byte) 10);
        field3939++;
        if (arg0 != 20468) {
            method1815(-43, 79);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I", line = 257)
    public static final int method1815(int arg0, int arg1) {
        if (arg0 != 128) {
            field3929 = -20;
        }
        field3940++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V", line = 278)
    public final void method1816(int arg0) {
        field3936++;
        if (arg0 != 1) {
            method1806((byte) -75);
        }
        while (true) {
            class325 var2 = this.field3932.field5017;
            if (this.field3932 == var2) {
                this.field3941 = null;
                return;
            }
            var2.method2257(false);
        }
    }
}
