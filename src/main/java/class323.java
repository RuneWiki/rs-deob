import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class323 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lgd;")
    private class170 field5035 = new class170(256);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lgd;")
    private class170 field5041 = new class170(256);

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Ll;")
    private class133 field5037;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Ll;")
    private class133 field5039;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method2195(boolean arg0, int arg1) {
        field5033++;
        if (arg1 == -1 || !class71.field1175[arg1]) {
            return;
        }
        class132.field2090.method971(arg1, (byte) 41);
        if (class163.field2463[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class163.field2463[arg1].length; var3++) {
            if (class163.field2463[arg1][var3] != null) {
                if (class163.field2463[arg1][var3].field3468 == 2) {
                    var2 = false;
                } else {
                    class163.field2463[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class163.field2463[arg1] = null;
        }
        class71.field1175[arg1] = false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[II)Ljf;", line = 63)
    public final class340 method2196(int arg0, int[] arg1, int arg2) {
        field5036++;
        if (this.field5037.method981((byte) -75) == 1) {
            return this.method2199(arg1, (byte) -18, arg0, 0);
        } else if (this.field5037.method954(arg2 - 89531, arg0) == 1) {
            return this.method2199(arg1, (byte) -18, 0, arg0);
        } else {
            if (arg2 != 65530) {
                this.field5037 = (class133) null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([III)Ljf;", line = 86)
    public final class340 method2197(int[] arg0, int arg1, int arg2) {
        field5042++;
        if (this.field5039.method981((byte) -100) == 1) {
            return this.method2198(0, arg2, arg0, (byte) -93);
        }
        if (arg1 > -94) {
            this.method2197((int[]) null, 0, 54);
        }
        if (this.field5039.method954(-24001, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method2198(arg2, 0, arg0, (byte) 82);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ll;Ll;)V", line = 159)
    public class323(class133 arg0, class133 arg1) {
        this.field5037 = arg0;
        this.field5039 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II[IB)Ljf;", line = 115)
    private final class340 method2198(int arg0, int arg1, int[] arg2, byte arg3) {
        field5034++;
        int var5 = ((arg0 & 0x50000FFF) << 4 | arg0 >>> 12) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class340 var9 = (class340) this.field5041.method1222(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class196 var10 = (class196) this.field5035.method1222(0, var7);
            if (var10 == null) {
                var10 = class196.method1394(this.field5039, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field5035.method1227(var10, 0, var7);
            }
            class340 var11 = var10.method1399(arg2);
            if (var11 == null) {
                return null;
            } else {
                int var12 = -81 % ((-arg3 - 39) / 53);
                var10.method403(1);
                this.field5041.method1227(var11, 0, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([IBII)Ljf;", line = 174)
    private final class340 method2199(int[] arg0, byte arg1, int arg2, int arg3) {
        int var5 = (arg3 << 4 & 0xFFFA | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        field5040++;
        class340 var9 = (class340) this.field5041.method1222(0, var7);
        if (arg1 != -18) {
            this.field5035 = (class170) null;
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class328 var10 = class328.method2226(this.field5037, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class340 var11 = var10.method2225();
            this.field5041.method1227(var11, arg1 + 18, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field5313.length;
            }
            return var11;
        } else {
            return null;
        }
    }
}
