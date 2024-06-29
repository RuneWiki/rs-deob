import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class92 extends class591 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
    public int[] field1401;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public int[] field1399;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "F")
    public static float field1398;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lvu;")
    public static class199 field1400;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field1404;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILmv;Lmv;)V")
    public static final void method509(int arg0, int arg1, class295 arg2, class295 arg3) {
        class571.field8301 = arg3;
        field1403++;
        if (arg0 != 15743) {
            method510((byte) -62);
        }
        class310.field4568 = arg2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method510(byte arg0) {
        field1400 = null;
        if (arg0 > -81) {
            method510((byte) 35);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method511(int arg0) {
        if (arg0 != 0) {
            method510((byte) 104);
        }
        if (class61.field978.field2983) {
            class190.field2576 = 96;
        } else {
            try {
                Method var1 = (field1404 == null ? (field1404 = method512("java.lang.Runtime")) : field1404).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class190.field2576 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field1402++;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(II[I[I)V")
    public class92(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1401 = arg2;
        this.field1399 = arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method512(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
