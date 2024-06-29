import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class71 extends class78 {

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "Lnh;")
    public class115 field1120;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "[I")
    public static int[] field1116 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1114 = "flash3:";

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "[I")
    public static int[] field1115 = new int[50];

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "S")
    public static short field1117 = 320;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field1121 = new String[100];

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V", line = 5)
    public static void method546(boolean arg0) {
        field1114 = null;
        field1115 = null;
        field1121 = null;
        if (arg0) {
            field1116 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 21)
    public static final void method547(byte arg0) {
        field1118++;
        try {
            if (arg0 <= 35) {
                return;
            }
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class95.field1567 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLda;IIILda;Z)I", line = 57)
    public static final int method548(boolean arg0, class120 arg1, int arg2, int arg3, int arg4, class120 arg5, boolean arg6) {
        int var7 = class298.method2082(arg4, arg1, -21879, arg6, arg5);
        field1119++;
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = 59 % ((arg2 - 76) / 33);
            int var9 = class298.method2082(arg3, arg1, -21879, arg0, arg5);
            return arg0 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lnh;)V", line = 88)
    public class71(class115 arg0) {
        this.field1120 = arg0;
    }
}
