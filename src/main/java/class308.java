import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class308 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field5026 = 0;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field5027 = 0;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "[S")
    public static short[] field5042 = new short[256];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public int field5024;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field5025;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public int field5031;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field5033;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field5037;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field5039;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public int field5041;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[Lbn;")
    public static class75[] field5035;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 18)
    public static final void method2247(byte arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class58.field1148 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var7) {
                }
            }
        } catch (Exception var8) {
        }
        field5023++;
        int var6 = -113 % ((-arg0 - 54) / 32);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lek;Z)V", line = 54)
    public static final void method2248(class206 arg0, boolean arg1) {
        field5034++;
        class269.field4391 = arg0;
        if (arg1) {
            method2249((byte) 101);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 65)
    public static void method2249(byte arg0) {
        if (arg0 > -36) {
            field5027 = 31;
        }
        field5035 = null;
        field5042 = null;
    }
}
