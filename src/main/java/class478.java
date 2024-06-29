import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public abstract class class478 extends class333 {

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "Z")
    public boolean field6881;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "[Lcu;")
    public class478[] field6888;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "[F")
    public static float[] field6878 = new float[16];

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public int field6887;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Lmp;")
    public class143 field6886;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Lj;")
    public class353 field6889;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
    public void method2749(int arg0, int arg1, int arg2) {
        field6891++;
        int var4 = this.field6887 == 255 ? arg1 : this.field6887;
        if (arg0 != 1033) {
            method2754((byte) 33, null);
        }
        if (this.field6881) {
            this.field6886 = new class143(var4, arg1, arg2);
        } else {
            this.field6889 = new class353(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
    public int method2750(boolean arg0) {
        if (arg0) {
            this.method33(-30, null, 116);
        }
        field6883++;
        return -1;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method2751(int arg0) {
        field6878 = null;
        if (arg0 < 115) {
            method2754((byte) -9, null);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public void method34(byte arg0) {
        if (arg0 != 23) {
            this.method107(true);
        }
        field6882++;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(III)[I")
    public final int[] method2752(int arg0, int arg1, int arg2) {
        field6884++;
        int var4 = 110 / ((arg1 - 38) / 44);
        return this.field6888[arg2].field6881 ? this.field6888[arg2].method35(arg0, -11323) : this.field6888[arg2].method104(true, arg0)[0];
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
    public void method107(boolean arg0) {
        field6877++;
        if (!arg0) {
            this.field6886 = null;
        }
        if (this.field6881) {
            this.field6886.method790(0);
            this.field6886 = null;
        } else {
            this.field6889.method2092(62);
            this.field6889 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILnp;I)V")
    public void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 == 255) {
            field6890++;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    public int method109(int arg0) {
        field6885++;
        return arg0 == -1 ? -1 : -126;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method2753(int arg0, int arg1, byte arg2) {
        if (arg2 != 11) {
            this.field6888 = null;
        }
        field6880++;
        if (this.field6888[arg0].field6881) {
            int[] var4 = this.field6888[arg0].method35(arg1, arg2 - 11334);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field6888[arg0].method104(true, arg1);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2754(byte arg0, String arg1) {
        field6876++;
        class208.field2464 = arg1;
        if (class591.field8347 == null) {
            return;
        }
        if (arg0 != 42) {
            method2751(8);
        }
        try {
            String var2 = class591.field8347.getParameter("cookieprefix");
            String var3 = class591.field8347.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class492.method2855(false, class557.method3157(-53) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class627.method3523("document.cookie=\"" + var5 + "\"", true, class591.field8347);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)[I")
    public int[] method35(int arg0, int arg1) {
        if (arg1 == -11323) {
            field6879++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)[[I")
    public int[][] method104(boolean arg0, int arg1) {
        field6875++;
        if (!arg0) {
            this.field6886 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IZ)V")
    public class478(int arg0, boolean arg1) {
        this.field6881 = arg1;
        this.field6888 = new class478[arg0];
    }
}
