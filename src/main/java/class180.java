import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class180 {

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    private int field2357 = -1;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "Z")
    private boolean field2367 = false;

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field2372 = new String[0];

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "Z")
    public static boolean field2362 = true;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!cfa", name = "q", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "Lhh;")
    public static class140 field2366;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "Lkc;")
    public static class144 field2361;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method1222(int arg0, String arg1, int arg2) {
        field2365++;
        if (arg2 != -1) {
            field2366 = null;
        }
        if (arg0 > this.field2357) {
            this.field2357 = arg0;
        }
        if (arg0 >= this.field2372.length) {
            this.method1228(arg0, 23544);
        }
        this.field2372[arg0] = arg1;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZI)I")
    private final int method1223(boolean arg0, int arg1) {
        if (!arg0) {
            return -100;
        }
        field2373++;
        int var3 = this.field2372.length;
        while (var3 <= arg1) {
            if (!this.field2367) {
                var3 += this.field2371;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field2371 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method1224(int arg0) {
        field2369++;
        String[] var2 = new String[this.field2357 + 1];
        class421.method2533(this.field2372, arg0, var2, 0, this.field2357 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!cfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2370++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field2357; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field2372[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIIIZIIII)V")
    public static final void method1225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7) {
            return;
        }
        field2359++;
        if (!class422.method2542(-86, arg8)) {
            return;
        }
        if (class230.field2956[arg8] == null) {
            client.method2041(class419.field6032[arg8], -1, arg1, arg11, arg0, arg9, arg4, arg6, arg2, arg10, arg5, arg3);
        } else {
            client.method2041(class230.field2956[arg8], -1, arg1, arg11, arg0, arg9, arg4, arg6, arg2, arg10, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILuq;IZ)Lgl;")
    public static final class625 method1226(int arg0, class172 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field2366 = null;
        }
        field2358++;
        byte[] var4 = arg1.method1188(arg0, -18047, arg2);
        return var4 == null ? null : new class625(var4);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V")
    public static void method1227(int arg0) {
        field2361 = null;
        if (arg0 != -1019) {
            method1227(69);
        }
        field2366 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)V")
    private final void method1228(int arg0, int arg1) {
        field2364++;
        String[] var3 = new String[this.method1223(true, arg0)];
        if (arg1 == 23544) {
            class421.method2533(this.field2372, 0, var3, 0, this.field2372.length);
            this.field2372 = var3;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IZ)V")
    public class180(int arg0, boolean arg1) {
        this.field2367 = arg1;
        this.field2371 = arg0;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1229(byte arg0, String arg1) {
        this.method1222(this.field2357 + 1, arg1, -1);
        field2368++;
        if (arg0 != -2) {
            this.method1222(-96, null, 28);
        }
    }
}
