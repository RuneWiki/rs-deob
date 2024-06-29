import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class246 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[Li;")
    public static class270[] field3214;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3215++;
        int var7 = arg1 + arg4;
        int var8 = arg0 + arg5;
        int var9 = arg3 + arg6;
        if (!class309.method1823(arg2 + 2, var8, var8, var9, var9, var8, arg1, arg6, arg1, var7)) {
            return false;
        } else if (!class309.method1823(arg2 + 2, var8, var8, var9, arg6, var8, arg1, arg6, var7, var7)) {
            return false;
        } else if (arg2 == 0) {
            if (arg1 < class614.field8512) {
                if (!class309.method1823(arg2 + 2, arg0, var8, var9, arg6, var8, arg1, var9, arg1, arg1)) {
                    return false;
                }
                if (!class309.method1823(arg2 ^ 0x2, arg0, var8, arg6, arg6, arg0, arg1, var9, arg1, arg1)) {
                    return false;
                }
            } else if (!class309.method1823(2, arg0, var8, var9, arg6, var8, var7, var9, var7, var7)) {
                return false;
            } else if (!class309.method1823(2, arg0, var8, arg6, arg6, arg0, var7, var9, var7, var7)) {
                return false;
            }
            if (class505.field6960 <= arg6) {
                if (!class309.method1823(2, arg0, var8, var9, var9, var8, arg1, var9, arg1, var7)) {
                    return false;
                }
                if (!class309.method1823(2, arg0, var8, var9, var9, arg0, arg1, var9, var7, var7)) {
                    return false;
                }
            } else if (!class309.method1823(2, arg0, var8, arg6, arg6, var8, arg1, arg6, arg1, var7)) {
                return false;
            } else if (!class309.method1823(2, arg0, var8, arg6, arg6, arg0, arg1, arg6, var7, var7)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static final void method1501(byte arg0) {
        field3212++;
        try {
            if (class574.field7844 == 1) {
                int var1 = class16.field217.method272((byte) 118);
                if (var1 > 0 && class16.field217.method293(-103)) {
                    int var2 = var1 - class253.field3319;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class16.field217.method286(208, var2);
                    return;
                }
                class16.field217.method301((byte) 98);
                class16.field217.method281(107);
                class307.field4110 = null;
                if (class285.field3762 == null) {
                    class574.field7844 = 0;
                } else {
                    class574.field7844 = 2;
                }
                class186.field2581 = null;
            }
            if (class574.field7844 == 3) {
                int var3 = class16.field217.method272((byte) 126);
                if (class174.field2461 > var3 && class16.field217.method293(-67)) {
                    int var4 = class288.field3804 + var3;
                    if (class174.field2461 < var4) {
                        var4 = class174.field2461;
                    }
                    class16.field217.method286(208, var4);
                    return;
                }
                class574.field7844 = 0;
                class288.field3804 = 0;
            }
            if (arg0 <= 104) {
                field3213 = 124;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class16.field217.method301((byte) 63);
            class285.field3762 = null;
            class307.field4110 = null;
            class574.field7844 = 0;
            class186.field2581 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public static void method1502(byte arg0) {
        if (arg0 != 1) {
            field3214 = null;
        }
        field3214 = null;
    }
}
