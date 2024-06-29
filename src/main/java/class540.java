import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class540 {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Llp;")
    private class272 field7913 = new class272(256);

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Llp;")
    private class272 field7919 = new class272(256);

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Luu;")
    private class191 field7917;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Luu;")
    private class191 field7910;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lla;")
    public static class319 field7915 = new class319(89, -2);

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Z")
    public static volatile boolean field7916 = true;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB[I)Ljp;", line = 5)
    public final class242 method3187(int arg0, byte arg1, int[] arg2) {
        field7911++;
        if (this.field7910.method1294(arg1 - 48) == 1) {
            return this.method3190(-99, arg2, 0, arg0);
        } else if (this.field7910.method1290(false, arg0) == 1) {
            return this.method3190(-90, arg2, arg0, 0);
        } else if (arg1 == 47) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V", line = 30)
    public static final void method3188(int arg0, int arg1) {
        field7909++;
        class177 var2 = class344.method2229(7, arg0, (byte) 111);
        var2.method1194(-118);
        if (arg1 != 20758) {
            method3189(true);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 43)
    public static void method3189(boolean arg0) {
        if (arg0) {
            field7915 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[III)Ljp;", line = 58)
    private final class242 method3190(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 > -76) {
            this.field7913 = null;
        }
        field7914++;
        int var5 = arg3 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFA);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class242 var9 = (class242) this.field7919.method1747(var7, false);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class494 var10 = (class494) this.field7913.method1747(var7, false);
            if (var10 == null) {
                var10 = class494.method2946(this.field7910, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field7913.method1751(var7, -123, var10);
            }
            class242 var11 = var10.method2947(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method25(-13489);
                this.field7919.method1751(var7, -99, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([III)Ljp;", line = 114)
    public final class242 method3191(int[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field7918 = -46;
        }
        field7908++;
        if (this.field7917.method1294(-1) == 1) {
            return this.method3192(arg2, 0, arg0, -2147479553);
        } else if (this.field7917.method1290(false, arg2) == 1) {
            return this.method3192(0, arg2, arg0, -2147479553);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Luu;Luu;)V", line = 177)
    public class540(class191 arg0, class191 arg1) {
        this.field7917 = arg0;
        this.field7910 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II[II)Ljp;", line = 143)
    private final class242 method3192(int arg0, int arg1, int[] arg2, int arg3) {
        field7912++;
        int var5 = arg0 ^ ((arg1 & arg3) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class242 var9 = (class242) this.field7919.method1747(var7, false);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class314 var10 = class314.method1976(this.field7917, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class242 var11 = var10.method1977();
            this.field7919.method1751(var7, arg3 + 2147479468, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field3400.length;
            }
            return var11;
        } else {
            return null;
        }
    }
}
