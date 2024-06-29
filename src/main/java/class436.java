import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class436 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lada;")
    public static class144 field5827 = new class144(104, -2);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public int field5825;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field5830;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field5831;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public static final void method2542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field5828++;
        if (arg1 != 8509) {
            field5827 = null;
        }
        class432 var8 = new class432();
        var8.field5783 = arg6;
        var8.field5788 = arg2;
        var8.field5786 = arg7;
        var8.field5781 = arg0;
        var8.field5784 = arg3;
        var8.field5791 = class617.field9123 + arg4;
        var8.field5789 = arg5;
        class626.field9219.method2241((byte) 66, var8);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method2543(int arg0) {
        field5827 = null;
        if (arg0 != 104) {
            method2542(115, 0, 86, -63, -110, -13, 84, null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static final void method2544(int arg0) {
        try {
            Method var1 = (field5831 == null ? (field5831 = method2545("java.lang.Runtime")) : field5831).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class132.field1814 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field5826++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2545(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
