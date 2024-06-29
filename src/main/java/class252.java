import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class252 {

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lhu;")
    private class76 field3367 = new class76(64);

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lr;")
    private class110 field3369;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Z")
    public static boolean field3365 = false;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
    public static int[] field3364 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field3368;

    // $FF: synthetic field
    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3370;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[Lnk;")
    public static class464[] field3366;

    // $FF: synthetic method
    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1417(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkb;III[Z)Z", line = 4)
    public static final boolean method1412(class449 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class312.field4112 != class221.field2945) {
            int var6 = class289.field3896[arg1].method368(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class177 var8 = class289.field3896[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method368(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method373(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method372(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 47)
    public static final void method1413(int arg0) {
        int var1 = -40 % ((arg0 + 2) / 61);
        field3362++;
        if (class241.field3211 == 2) {
            class428.field5792 = 96;
            return;
        }
        try {
            Method var2 = (field3370 == null ? (field3370 = method1417("java.lang.Runtime")) : field3370).getMethod("maxMemory");
            if (var2 != null) {
                try {
                    Runtime var3 = Runtime.getRuntime();
                    Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                    class428.field5792 = (int) (var4 / 1048576L) + 1;
                    return;
                } catch (Throwable var5) {
                    return;
                }
            }
        } catch (Exception var6) {
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 81)
    public static void method1414(int arg0) {
        field3366 = null;
        field3364 = null;
        if (arg0 < 108) {
            field3361 = 73;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V", line = 93)
    public static final void method1415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= 70) {
            method1414(114);
        }
        if (arg5 >= class425.field5751 && class136.field1985 >= arg1 && arg2 >= class221.field2942 && arg0 <= class205.field2784) {
            class104.method636(arg1, arg5, arg2, arg0, arg4, (byte) -103);
        } else {
            class72.method464((byte) -50, arg4, arg1, arg0, arg2, arg5);
        }
        field3360++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)Lcr;", line = 114)
    public final class372 method1416(boolean arg0, int arg1) {
        field3368++;
        class76 var3 = this.field3367;
        class372 var4;
        synchronized (this.field3367) {
            var4 = (class372) this.field3367.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3369.method702((byte) -110, arg1, 19);
        if (!arg0) {
            method1414(-3);
        }
        class372 var6 = new class372();
        if (var5 != null) {
            var6.method2286(new class32(var5), -98);
        }
        class76 var7 = this.field3367;
        synchronized (this.field3367) {
            this.field3367.method505((long) arg1, var6, 68);
            return var6;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldn;ILr;)V", line = 156)
    public class252(class329 arg0, int arg1, class110 arg2) {
        this.field3369 = arg2;
        this.field3363 = this.field3369.method694(19, (byte) 119);
    }
}
