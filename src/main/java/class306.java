import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class306 extends class162 {

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4977 = "Discard";

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "[S")
    public static short[] field4981 = new short[256];

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4983 = "shake:";

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
    public abstract boolean method168(byte arg0);

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method170(byte arg0);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLfa;)V")
    public static final void method2091(byte arg0, class273 arg1) {
        class14.field205 = arg1;
        field4975++;
        if (arg0 > -15) {
            field4983 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBI)Lvi;")
    public static final class205 method2092(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 22) {
            field4981 = null;
        }
        field4982++;
        long var5 = ((long) arg1 & 0xFFFFL) << 32 | ((long) arg0 & 0xFFFFL) << 48 | (long) arg4 << 16 & 0xFFFFL << 16 | (long) arg2 & 0xFFFFL;
        class205 var7 = (class205) class120.field1843.method149((byte) -123, var5);
        if (var7 != null) {
            return var7;
        }
        class81[] var8 = null;
        class71 var9 = class99.method643(arg3 - 91, arg2);
        if (var9.field1033 != null) {
            var8 = new class81[var9.field1033.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class59 var11 = class189.method1279(var9.field1033[var10], (byte) 107);
                var8[var10] = new class81(var11.field905, var11.field897, var11.field901, var11.field900, var11.field911, var11.field910, var11.field907, var11.field908);
            }
        }
        class205 var12 = new class205(var9.field1032, var8, var9.field1025, arg0, arg1, arg4);
        class120.field1843.method152(var12, var5, true);
        return var12;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BZZIIII)V")
    public static final void method2093(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < arg3) {
            int var7 = arg4;
            int var8 = (arg3 + arg4) / 2;
            class203 var9 = class276.field4576[var8];
            class276.field4576[var8] = class276.field4576[arg3];
            class276.field4576[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (class132.method883(-1, arg2, var9, arg1, class276.field4576[var10], arg6, arg5) <= 0) {
                    class203 var11 = class276.field4576[var10];
                    class276.field4576[var10] = class276.field4576[var7];
                    class276.field4576[var7++] = var11;
                }
            }
            class276.field4576[arg3] = class276.field4576[var7];
            class276.field4576[var7] = var9;
            method2093((byte) 103, arg1, arg2, var7 - 1, arg4, arg5, arg6);
            method2093((byte) 111, arg1, arg2, arg3, var7 + 1, arg5, arg6);
        }
        field4978++;
        int var12 = -43 / ((28 - arg0) / 50);
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
    public static void method2094(int arg0) {
        if (arg0 > 76) {
            field4977 = null;
            field4983 = null;
            field4981 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Ll;")
    public static final class169 method2095(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class169 var4 = var3.field2411;
            var3.field2411 = null;
            return var4;
        }
    }
}
