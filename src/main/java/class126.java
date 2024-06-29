import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class126 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Lvm;")
    private class687 field2075 = new class687();

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Ljava/lang/String;")
    public String field2078;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Lmha;")
    public static class419 field2080 = new class419(0, 1);

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    private volatile int field2085;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Lre;")
    private class602 field2084;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILf;)V", line = 8)
    public final void method993(int arg0, class759 arg1) {
        class687 var3 = this.field2075;
        synchronized (this.field2075) {
            if (arg0 != -1) {
                this.field2084 = null;
            }
            this.field2075.method3870(arg1, 0);
            this.field2085++;
        }
        field2082++;
        if (this.field2084 != null) {
            class602 var4 = this.field2084;
            synchronized (this.field2084) {
                this.field2084.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method994(byte arg0) {
        if (arg0 > -58) {
            return false;
        } else {
            field2081++;
            return this.field2085 == 0;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLkf;)V", line = 46)
    public final void method995(boolean arg0, class256 arg1) {
        arg1.field3511 = arg0;
        field2083++;
        class687 var3 = this.field2075;
        synchronized (this.field2075) {
            this.field2075.method3870(arg1, 0);
            this.field2085++;
        }
        if (this.field2084 != null) {
            class602 var4 = this.field2084;
            synchronized (this.field2084) {
                this.field2084.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 73)
    public class126(String arg0) {
        this.field2078 = arg0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lkf;B)V", line = 81)
    public final void method996(class256 arg0, byte arg1) {
        arg0.field3511 = true;
        field2086++;
        int var3 = 0 % ((-arg1 - 31) / 39);
        class687 var4 = this.field2075;
        synchronized (this.field2075) {
            this.field2075.method3870(arg0, 0);
            this.field2085++;
        }
        if (this.field2084 != null) {
            class602 var5 = this.field2084;
            synchronized (this.field2084) {
                this.field2084.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Lva;", line = 103)
    public final class499 method997(int arg0) {
        field2076++;
        Object var2 = null;
        int var3 = 14 % ((arg0 + 15) / 50);
        class687 var4 = this.field2075;
        synchronized (this.field2075) {
            class499 var5 = this.field2075.method3874((byte) 8);
            var5.method2815(-123);
            this.field2085--;
            return var5;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V", line = 120)
    public static void method998(int arg0) {
        field2080 = null;
        if (arg0 > -93) {
            method998(-11);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lre;Z)V", line = 130)
    public final void method999(class602 arg0, boolean arg1) {
        this.field2084 = arg0;
        if (!arg1) {
            this.field2085 = -34;
        }
        field2079++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIZII)Z", line = 142)
    public static final boolean method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field2077++;
        int var9 = class472.field6475.field10322[0];
        int var10 = class472.field6475.field10321[0];
        if (var9 < 0 || var9 >= class719.field10004 || var10 < 0 || var10 >= class107.field1453) {
            return false;
        } else if (arg7 >= 0 && arg7 < class719.field10004 && arg1 >= 0 && class107.field1453 > arg1) {
            int var11 = class270.method1627(arg3, var9, class456.field6226[class472.field6475.field3508], var10, class472.field6475.method2256(arg8), class142.field2270, arg6, arg5, arg0, 28002, arg1, arg2, class481.field6585, arg7, arg4);
            if (var11 < 1) {
                return false;
            }
            class359.field5044 = class142.field2270[var11 - 1];
            class102.field1421 = class481.field6585[var11 - 1];
            class376.field5231 = false;
            class140.method1075(false);
            return true;
        } else {
            return false;
        }
    }
}
