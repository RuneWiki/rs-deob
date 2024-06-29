import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public abstract class class652 {

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field9150 = 0;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "Lsb;")
    public static class305 field9151 = new class305(34, 7);

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "Lib;")
    public static class14 field9152 = new class14(0, 1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field9153;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field9156;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "[B")
    public static byte[] field9155;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "[Z")
    public static boolean[] field9154;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1161(int arg0, byte arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
    public abstract void method1158(int arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static final void method3632(boolean arg0) {
        if (class353.field4757.field6611) {
            class689.field9702 = 96;
        } else {
            try {
                Method var1 = (field9156 == null ? (field9156 = method3635("java.lang.Runtime")) : field9156).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class689.field9702 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0) {
            method3634(109, (byte) 110, false, 57);
        }
        field9153++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public static void method3633(byte arg0) {
        field9154 = null;
        field9152 = null;
        field9151 = null;
        int var1 = 21 % ((arg0 + 23) / 49);
        field9155 = null;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I")
    public abstract int method1162(int arg0, int arg1);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBZI)I")
    public static final int method3634(int arg0, byte arg1, boolean arg2, int arg3) {
        field9149++;
        if (arg1 != 99) {
            method3633((byte) 27);
        }
        class628 var4 = class555.method3150(arg0, arg1 ^ 0x63, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field8850.length > arg3) {
            return var4.field8850[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)Lof;")
    public abstract class538 method1154(boolean arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3635(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
