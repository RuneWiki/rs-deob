import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class670 extends class350 {

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "Lbu;")
    public static class21 field9312 = new class21(130, -2);

    @OriginalMember(owner = "client!lca", name = "L", descriptor = "Loo;")
    public static class652 field9316 = new class652(260);

    @OriginalMember(owner = "client!lca", name = "M", descriptor = "I")
    public static int field9317 = 0;

    @OriginalMember(owner = "client!lca", name = "N", descriptor = "Lbu;")
    public static class21 field9318 = new class21(104, -2);

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "F")
    public static float field9310;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!lca", name = "I", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!lca", name = "K", descriptor = "I")
    public static int field9315;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lca", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field9319;

    @OriginalMember(owner = "client!lca", name = "J", descriptor = "[B")
    private byte[] field9314;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3803(int arg0, int arg1, int arg2, int arg3) {
        this.field9314 = new byte[arg0 * arg2 * arg1 * 2];
        int var5 = 71 / ((55 - arg3) / 32);
        field9315++;
        this.method158(arg1, 127, arg2, arg0);
        return this.field9314;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(Z)V")
    public static final void method3804(boolean arg0) {
        if (arg0) {
            field9318 = null;
        }
        field9309++;
        try {
            Method var1 = (field9319 == null ? (field9319 = method3809("java.lang.Runtime")) : field9319).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class355.field5003 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3805(String arg0, byte arg1) {
        int var2 = 31 / ((arg1 - 69) / 51);
        field9308++;
        return class451.method2687(10, arg0, true, 3760);
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
    public class670() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBI)V")
    public final void method1039(int arg0, byte arg1, int arg2) {
        field9313++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg2 & arg1) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field9314[var10001] = var5;
        this.field9314[var6] = var5;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Leea;")
    public static final class142 method3806(Throwable arg0, String arg1) {
        field9307++;
        class142 var2;
        if ((arg0 instanceof class142)) {
            var2 = (class142) arg0;
            var2.field2094 = var2.field2094 + ' ' + arg1;
        } else {
            var2 = new class142(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)[Lti;")
    public static final class463[] method3807(byte arg0) {
        field9311++;
        int var1 = 110 % ((arg0 + 41) / 62);
        return new class463[] { class100.field1155, class784.field10758, class564.field8005 };
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
    public static void method3808(int arg0) {
        field9318 = null;
        if (arg0 != 255) {
            method3805(null, (byte) 88);
        }
        field9312 = null;
        field9316 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3809(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
