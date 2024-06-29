import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class565 {

    @OriginalMember(owner = "client!an", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8252 = new String[] { method4224(method4223("g$\u0017X")), method4224(method4223("h?UfE")), method4224(method4223("r\u007fU\u001a\u0010")), method4224(method4223("h?UeE")) };

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field8250 = -1;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lui;")
    public static class251 field8248 = new class251(4);

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[Ltb;")
    public static class392[] field8251;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZLlt;)Z")
    public static final boolean method4221(int arg0, boolean arg1, class182 arg2) {
        try {
            field8249++;
            class795.field11567.method740(arg2.field2353[arg0], arg2.field2351[arg0], arg2.field2352[arg0], class305.field4247);
            int var3 = class305.field4247[2];
            if (var3 < 50) {
                return false;
            }
            arg2.field2346[arg0] = (short) (class305.field4247[0] * class599.field8599 / var3 + class433.field6277);
            if (arg1) {
                method4221(124, false, null);
            }
            arg2.field2355[arg0] = (short) (class305.field4247[1] * class667.field9417 / var3 + class796.field11573);
            arg2.field2350[arg0] = (short) var3;
            return true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8252[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8252[0] : field8252[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Llca;")
    public abstract class562 method3790(int arg0);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method4222(byte arg0) {
        try {
            field8251 = null;
            if (arg0 >= -79) {
                field8250 = 100;
            }
            field8248 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8252[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
    public abstract void method3801(int arg0, int arg1);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method3792(byte arg0, int arg1);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I")
    public abstract int method3795(boolean arg0, int arg1);

    @OriginalMember(owner = "client!an", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4223(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!an", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4224(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
