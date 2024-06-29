import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class337 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
    public static int[] field4592 = new int[50];

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lng;")
    public static class190 field4590 = new class190(20);

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field4598 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field4597;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4599;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method2096(int arg0) {
        if (class351.field4889 == 2) {
            class275.field3730 = 96;
        } else {
            try {
                Method var1 = (field4599 == null ? (field4599 = method2100("java.lang.Runtime")) : field4599).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class275.field3730 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field4595++;
        if (arg0 != 96) {
            field4598 = -95;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method2097(int arg0) {
        if (arg0 == 3008) {
            field4592 = null;
            field4590 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static final void method2098(int arg0) {
        class58.field831 = 0;
        field4596++;
        int var1 = (class307.field4211.field6197 >> 7) + class449.field6509;
        if (arg0 < 49) {
            field4592 = null;
        }
        int var2 = (class307.field4211.field6192 >> 7) + class354.field4981;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class58.field831 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class58.field831 = 1;
        }
        if (class58.field831 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class58.field831 = 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
    public static final void method2099(int arg0, boolean arg1) {
        class20.field259.method1254(arg0, -32);
        if (!arg1) {
            field4588++;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2100(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
