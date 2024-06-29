import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class74 {

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lc;")
    private class284 field891 = new class284(256);

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Lc;")
    private class284 field895 = new class284(256);

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lbc;")
    private class282 field894;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lbc;")
    private class282 field887;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field892 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "J")
    public static volatile long field893 = 0L;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Llj;")
    public static class24 field890;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Lcj;")
    public static class74 field886;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lbd;")
    public static class81 field884;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[[[Lab;")
    public static class133[][][] field889;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[II)Lik;")
    private final class295 method454(int arg0, int arg1, int[] arg2, int arg3) {
        field881++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFFB | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class295 var9 = (class295) this.field895.method1895(var7, -116);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class184 var10 = (class184) this.field891.method1895(var7, -123);
            if (var10 == null) {
                var10 = class184.method1188(this.field887, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field891.method1894(-1, var10, var7);
            }
            if (arg0 < 93) {
                return null;
            }
            class295 var11 = var10.method1190(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1935(116);
                this.field895.method1894(-1, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[II)Lik;")
    public final class295 method455(byte arg0, int[] arg1, int arg2) {
        field888++;
        if (arg0 != 81) {
            this.method454(-25, 126, (int[]) null, 123);
        }
        if (this.field887.method1856(-119) == 1) {
            return this.method454(arg0 + 15, 0, arg1, arg2);
        } else if (this.field887.method1874((byte) 18, arg2) == 1) {
            return this.method454(119, arg2, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([IIB)Lik;")
    public final class295 method456(int[] arg0, int arg1, byte arg2) {
        field883++;
        if (arg2 >= -118) {
            field889 = null;
        }
        if (this.field894.method1856(-105) == 1) {
            return this.method457(arg0, 0, 0, arg1);
        } else if (this.field894.method1874((byte) 18, arg1) == 1) {
            return this.method457(arg0, 0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([IIII)Lik;")
    private final class295 method457(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return null;
        }
        field882++;
        int var5 = arg3 ^ (arg2 << 4 & 0xFFF5 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class295 var9 = (class295) this.field895.method1895(var7, -111);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class186 var10 = class186.method1212(this.field894, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class295 var11 = var10.method1213();
            this.field895.method1894(-1, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field4669.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method458(boolean arg0) {
        field889 = null;
        field890 = null;
        field892 = null;
        if (arg0) {
            field884 = null;
            field886 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lbc;Lbc;)V")
    public class74(class282 arg0, class282 arg1) {
        this.field894 = arg0;
        this.field887 = arg1;
    }
}
