import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class313 extends class77 {

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lsl;")
    public static class422 field4714 = new class422("", 16);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Ltl;")
    public static class400 field4716 = new class400(8);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
    public static int[] field4718 = new int[14];

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4717;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field4719;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILfi;Lfi;)V")
    public static final void method1936(int arg0, class35 arg1, class35 arg2) {
        if (arg1.field435 != null) {
            arg1.method283(2);
        }
        int var3 = 109 % ((arg0 - 60) / 37);
        field4715++;
        arg1.field435 = arg2.field435;
        arg1.field434 = arg2;
        arg1.field435.field434 = arg1;
        arg1.field434.field435 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1937(byte arg0) {
        field4716 = null;
        field4714 = null;
        if (arg0 <= -70) {
            field4718 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1938(int arg0) {
        if (arg0 != 0) {
            method1936(-38, (class35) null, (class35) null);
        }
        field4717++;
        if (class153.field2137 == 2) {
            class45.field646 = 96;
            return;
        }
        try {
            Method var1 = (field4719 == null ? (field4719 = method1940("java.lang.Runtime")) : field4719).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class45.field646 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1939(int arg0, int arg1, int arg2, int arg3) {
        if (!class247.method1583(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class426.field6091;
        int var5 = arg2 << class426.field6091;
        int var6 = class479.field6745[arg0].method199(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 == 1) {
            if (var4 > class100.field1420) {
                if (!class92.method710(var4, var6, var5)) {
                    return false;
                }
                if (!class92.method710(var4, var6, class75.field1055 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class92.method710(var4, var7, var5)) {
                    return false;
                }
                if (!class92.method710(var4, var7, class75.field1055 + var5)) {
                    return false;
                }
            }
            if (class92.method710(var4, var8, var5)) {
                return class92.method710(var4, var8, class75.field1055 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class208.field3132) {
                if (!class92.method710(var4, var6, class75.field1055 + var5)) {
                    return false;
                }
                if (!class92.method710(class75.field1055 + var4, var6, class75.field1055 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class92.method710(var4, var7, class75.field1055 + var5)) {
                    return false;
                }
                if (!class92.method710(class75.field1055 + var4, var7, class75.field1055 + var5)) {
                    return false;
                }
            }
            if (class92.method710(var4, var8, class75.field1055 + var5)) {
                return class92.method710(class75.field1055 + var4, var8, class75.field1055 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class100.field1420) {
                if (!class92.method710(class75.field1055 + var4, var6, var5)) {
                    return false;
                }
                if (!class92.method710(class75.field1055 + var4, var6, class75.field1055 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class92.method710(class75.field1055 + var4, var7, var5)) {
                    return false;
                }
                if (!class92.method710(class75.field1055 + var4, var7, class75.field1055 + var5)) {
                    return false;
                }
            }
            if (class92.method710(class75.field1055 + var4, var8, var5)) {
                return class92.method710(class75.field1055 + var4, var8, class75.field1055 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class208.field3132) {
                if (!class92.method710(var4, var6, var5)) {
                    return false;
                }
                if (!class92.method710(class75.field1055 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class92.method710(var4, var7, var5)) {
                    return false;
                }
                if (!class92.method710(class75.field1055 + var4, var7, var5)) {
                    return false;
                }
            }
            if (class92.method710(var4, var8, var5)) {
                return class92.method710(class75.field1055 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class92.method710(class47.field683 + var4, var9, class47.field683 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class92.method710(var4, var8, class75.field1055 + var5);
        } else if (arg3 == 32) {
            return class92.method710(class75.field1055 + var4, var8, class75.field1055 + var5);
        } else if (arg3 == 64) {
            return class92.method710(class75.field1055 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class92.method710(var4, var8, var5);
        } else {
            return true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1940(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
