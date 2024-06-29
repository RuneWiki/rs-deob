import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class176 extends class26 {

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    private final int field2922;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    private final int field2921;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    private final int field2937;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    private final int field2926;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lbc;")
    public static class201 field2930 = new class201(4096);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lub;")
    public static class227 field2936 = class257.method1749("www)2wtrc", 17263);

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Lgh;")
    public static class106 field2935 = new class106(5000);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Lc;")
    public static class122 field2938;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[I")
    public static int[] field2932;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    public static int[] field2934;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ln;BI)Lwh;")
    public static final class163 method1120(class138 arg0, byte arg1, int arg2) {
        ++field2931;
        if (arg1 != -114) {
            return null;
        } else {
            return !class115.method728(false, arg0, arg2) ? null : class215.method1368(true);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIB)V")
    public final void method103(int arg0, int arg1, byte arg2) {
        ++field2927;
        if (arg2 <= 98) {
            method1122(-28, (Component) null, -128, 95, (class239) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1121(boolean arg0, byte[] arg1) {
        ++field2924;
        int var2 = arg1.length;
        if (!arg0) {
            field2935 = null;
        }
        byte[] var3 = new byte[var2];
        class68.method422(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        if (arg0 == 512) {
            ++field2925;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)V")
    public final void method106(int arg0, int arg1, byte arg2) {
        int var4 = this.field2937 * arg0 >> 12;
        int var5 = this.field2921 * arg0 >> 12;
        int var6 = this.field2926 * arg1 >> 12;
        int var7 = this.field2922 * arg1 >> 12;
        ++field2923;
        if (arg2 == -75) {
            class173.method1107(-62, var5, super.field433, var7, var4, var6);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Component;IILth;)Lo;")
    public static final class208 method1122(int arg0, Component arg1, int arg2, int arg3, class239 arg4) {
        ++field2929;
        if (class195.field3316 == 0) {
            throw new IllegalStateException();
        } else if (~arg2 <= -1 && arg2 < 2) {
            if (~arg3 > -257) {
                arg3 = 256;
            }
            try {
                class208 var5 = (class208) Class.forName("ni").newInstance();
                var5.field3547 = arg3;
                var5.field3539 = new int[256 * (class216.field3641 ? 2 : 1)];
                var5.method185(arg1);
                var5.field3552 = (arg3 & -1024) + 1024;
                if (~var5.field3552 < -16385) {
                    var5.field3552 = 16384;
                }
                var5.method183(var5.field3552);
                if (~class77.field1357 < -1 && class134.field2333 == null) {
                    class134.field2333 = new class66();
                    class134.field2333.field1198 = arg4;
                    arg4.method1596(class77.field1357, 0, class134.field2333);
                }
                if (class134.field2333 != null) {
                    if (class134.field2333.field1196[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class134.field2333.field1196[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg0 <= 6) {
                        field2932 = null;
                    }
                    class35 var6 = new class35(arg4, arg2);
                    var6.field3539 = new int[(!class216.field3641 ? 1 : 2) * 256];
                    var6.field3547 = arg3;
                    var6.method185(arg1);
                    var6.field3552 = 16384;
                    var6.method183(var6.field3552);
                    if (~class77.field1357 < -1 && class134.field2333 == null) {
                        class134.field2333 = new class66();
                        class134.field2333.field1198 = arg4;
                        arg4.method1596(class77.field1357, 0, class134.field2333);
                    }
                    if (class134.field2333 != null) {
                        if (class134.field2333.field1196[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class134.field2333.field1196[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class208();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field2938 = null;
        field2936 = null;
        field2935 = null;
        field2930 = null;
        field2932 = null;
        if (arg0 > -26) {
            method1120((class138) null, (byte) 123, 105);
        }
        field2934 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIII)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2922 = arg1;
        this.field2921 = arg0;
        this.field2937 = arg2;
        this.field2926 = arg3;
    }
}
