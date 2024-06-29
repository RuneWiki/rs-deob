import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class54 extends class194 {

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lqk;")
    public class207 field1014;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field1019;

    // $FF: synthetic field
    @OriginalMember(owner = "client!df", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field1020;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class54() {
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lv;Lqk;Z)I")
    public static final int method406(class149 arg0, class207 arg1, boolean arg2) {
        field1015++;
        int var3 = arg0.field2593;
        arg0.method1066(arg1.field3663, (byte) 110);
        if (arg2) {
            return -32;
        } else {
            arg0.field2593 += class25.field524.method1904(arg0.field2568, 16595, 0, arg0.field2593, arg1.field3652, arg1.field3663);
            return arg0.field2593 - var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method407(int arg0) {
        field1018++;
        if (arg0 != -11863) {
            method408(false, 28);
        }
        try {
            Method var1 = (field1020 == null ? (field1020 = method410("java.lang.Runtime")) : field1020).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class170.field3023 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)I")
    public static final int method408(boolean arg0, int arg1) {
        if (!arg0) {
            field1019 = 57;
        }
        field1017++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static final void method409(int arg0) {
        class261.field4645.method767(222, (byte) 70);
        class261.field4645.method1083(false, class261.field4651);
        if (arg0 > -25) {
            method409(91);
        }
        field1016++;
        class265.field4691++;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lqk;I)V")
    public class54(class207 arg0, int arg1) {
        this.field1014 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method410(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
