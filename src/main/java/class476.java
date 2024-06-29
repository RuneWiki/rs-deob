import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class476 {

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Lkfa;")
    private class382 field6821;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "J")
    public long field6820;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6818 = "";

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field6817 = 0;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Z")
    public static boolean field6819 = false;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field6823;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field6824;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static final void method2786(int arg0) {
        field6822++;
        if (arg0 != 24695) {
            method2787(39, -110L, -33, 43, true, (byte) 94, null, 42, null, false, -110);
        }
        if (class653.field9220.field9985) {
            class246.field3583 = 96;
            return;
        }
        try {
            Method var1 = (field6824 == null ? (field6824 = method2790("java.lang.Runtime")) : field6824).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class246.field3583 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IJIIZBLjava/lang/String;ILjava/lang/String;ZI)V")
    public static final void method2787(int arg0, long arg1, int arg2, int arg3, boolean arg4, byte arg5, String arg6, int arg7, String arg8, boolean arg9, int arg10) {
        field6823++;
        if (class324.field4519 || class400.field5784 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class324.field4521 : arg10;
        class673 var13 = new class673(arg6, arg8, var12, arg7, arg2, arg1, arg0, arg3, arg4, arg9);
        class150.field2533.method3904(var13, arg5 ^ 0xFFFFFFE6);
        if (arg5 != -26) {
            field6819 = true;
        }
        class400.field5784++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2788(String arg0, byte arg1) {
        if (arg1 >= -38) {
            method2788(null, (byte) 13);
        }
        field6816++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class520.field7677; var2++) {
            if (arg0.equalsIgnoreCase(class437.field6290[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lkfa;J[Lafa;)V")
    public class476(class382 arg0, long arg1, class189[] arg2) {
        this.field6821 = arg0;
        this.field6820 = arg1;
    }

    @OriginalMember(owner = "client!qn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6815++;
        this.field6821.method2333(this.field6820, 105);
        super.finalize();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public static void method2789(boolean arg0) {
        field6818 = null;
        if (arg0) {
            field6818 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2790(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
