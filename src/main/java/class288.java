import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class288 {

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4283 = new String[] { method2344(method2343("Mv(%+\u0013")), method2344(method2343("Mv(%*\u0013")), method2344(method2343("Mv(%-\u0013")), method2344(method2343("Mv(%\u001dT@=y\u0000Uta")) };

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Z")
    public static boolean field4281 = false;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Lel;")
    public static class573 field4279 = new class573(71, -1);

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IBI)I", line = 3)
    public final int method2339(int arg0, byte arg1, int arg2) {
        try {
            field4280++;
            int var4 = class94.field1062 <= arg2 ? arg2 : class94.field1062;
            if (class234.field3524 == this) {
                return 0;
            } else if (class115.field1372 == this) {
                return var4 - arg0;
            } else {
                if (arg1 >= -24) {
                    method2340((byte) -28);
                }
                return class255.field3952 == this ? (var4 - arg0) / 2 : 0;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4283[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V", line = 28)
    public static void method2340(byte arg0) {
        try {
            int var1 = -114 / ((arg0 + 19) / 36);
            field4279 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4283[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        try {
            field4282++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4283[3] + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IB)V", line = 53)
    public static final void method2341(int arg0, byte arg1) {
        try {
            if (arg1 != -47) {
                method2341(-23, (byte) -32);
            }
            field4278++;
            class348.field5385 = -1;
            class560.field8334 = arg0;
            class348.field5385 = -1;
            class685.method5024(-1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4283[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ldf;ZZ)V", line = 69)
    public static final void method2342(class420 arg0, boolean arg1, boolean arg2) {
        arg0.field6204 = arg2;
        if (!class329.field5187) {
            class294.method2408(arg0, class443.field6518);
        } else if (arg1) {
            class180.field2498[class180.field2498.length - 1].method2141(30234, arg0);
        } else {
            int var3 = class770.method5566(arg0.field6201);
            int var4 = class595.field8726[2] * arg0.method1093(-3) / arg0.field6208;
            int var5 = class770.method5566(arg0.field6201 - var4);
            int var6 = class770.method5566(arg0.field6201 + var4);
            if (var5 == var6) {
                class180.field2498[var3].method2141(30234, arg0);
            } else if (var6 - var5 == 1) {
                class180.field2498[class574.field8475 + var5].method2141(30234, arg0);
            } else {
                class180.field2498[class180.field2498.length - 1].method2141(30234, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2343(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2344(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
