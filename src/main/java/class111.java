import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class111 extends class359 {

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Lvn;")
    public class169 field1280 = new class169();

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1283 = new String[200];

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "[I")
    public static int[] field1281 = new int[5];

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public static int field1287;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field1288;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "[Lac;")
    public static class319[] field1285;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V")
    public static final void method612(byte arg0) {
        try {
            Method var1 = (field1288 == null ? (field1288 = method616("java.lang.Runtime")) : field1288).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class343.field5053 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != 87) {
            field1285 = null;
        }
        field1282++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Z")
    public static final boolean method613(int arg0, int arg1) {
        field1287++;
        if (arg1 == 15 || arg1 == 51 || arg1 == 6 || arg1 == 13 || arg1 == 46) {
            return true;
        } else if (arg1 == 39 || arg1 == 12 || arg1 == 1009) {
            return true;
        } else {
            if (arg0 != -13) {
                field1283 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public static void method614(int arg0) {
        if (arg0 != 24482) {
            field1281 = null;
        }
        field1283 = null;
        field1281 = null;
        field1285 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIBI)V")
    public static final void method615(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 3) {
            field1283 = null;
        }
        field1286++;
        class417 var5 = (class417) class201.field2774.method1204((byte) -62, (long) arg4);
        if (var5 == null) {
            var5 = new class417();
            class201.field2774.method1202(arg3 - 4, (long) arg4, var5);
        }
        if (var5.field5987.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field5987.length; var8++) {
                var6[var8] = var5.field5987[var8];
                var7[var8] = var5.field5984[var8];
            }
            for (int var9 = var5.field5987.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field5987 = var6;
            var5.field5984 = var7;
        }
        var5.field5987[arg2] = arg0;
        var5.field5984[arg2] = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method616(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
