import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class260 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
    public static int[] field4137 = new int[5];

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Z")
    public static boolean field4139 = true;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "[Lid;")
    public static class149[] field4140 = new class149[6];

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Laf;")
    public static class68 field4134 = new class68(260);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4142;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4143;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1776(int arg0, int arg1, int arg2, long arg3) {
        class134 var5 = class288.field4563[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2133 != null && var5.field2133.field3779 == arg3) {
            return true;
        } else if (var5.field2143 != null && var5.field2143.field4372 == arg3) {
            return true;
        } else if (var5.field2140 != null && var5.field2140.field786 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2151; var6++) {
                if (var5.field2153[var6].field4574 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static final void method1777(int arg0) {
        field4138++;
        try {
            if (arg0 < -100) {
                Method var1 = (field4143 == null ? (field4143 = method1780("java.lang.Runtime")) : field4143).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class4.field44 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public abstract void method116(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field4140 = null;
        if (arg0 > -122) {
            method1778(-21);
        }
        field4134 = null;
        field4137 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Lik;")
    public class260 method1043(int arg0, int arg1, int arg2) {
        field4135++;
        return this;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public abstract void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
    public abstract int method119();

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z")
    public boolean method1029() {
        field4132++;
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lik;IIIZ)V")
    public void method1032(class260 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4141++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIZI)I")
    public static final int method1779(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg4;
            arg4 = var7;
        }
        int var8 = arg3 & 0x3;
        field4142++;
        if (arg5) {
            method1777(-82);
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg0 - arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg6;
        } else {
            return arg1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1780(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
