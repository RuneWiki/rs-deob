import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class193 extends class105 {

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Lvf;")
    public static class265 field3471 = class87.method582(-46, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Lvf;")
    private static class265 field3472 = class87.method582(-46, "Loaded fonts");

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "Lvf;")
    public static class265 field3475 = class87.method582(-46, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Lvf;")
    public static class265 field3469 = field3472;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "[I")
    public static int[] field3473 = new int[50];

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Ldg;")
    public static class276 field3476 = new class276(64);

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "Z")
    public static boolean field3478 = false;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "Lvf;")
    public static class265 field3477 = class87.method582(-46, "<col=ffff00>");

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field3480 = -1;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "Lvf;")
    public static class265 field3479;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field3481;

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZII)I")
    private final int method1335(boolean arg0, int arg1, int arg2) {
        ++field3467;
        if (arg0) {
            return 35;
        } else {
            int var4 = arg2 * 57 + arg1;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lfl;BLfl;)V")
    public static final void method1336(class192 arg0, byte arg1, class192 arg2) {
        ++field3474;
        class263.field4592 = class30.method249(0, arg2, (byte) -83, class111.field1935, arg0);
        class42.field935 = (class251) class263.field4592;
        if (arg1 != 30) {
            method1337(16);
        }
        class22.field668 = class30.method249(0, arg2, (byte) -42, class56.field1136, arg0);
        class205.field3692 = class30.method249(0, arg2, (byte) -84, class223.field3978, arg0);
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)V")
    public static final void method1337(int arg0) {
        try {
            if (arg0 != 0) {
                field3472 = null;
            }
            Method var1 = (field3481 != null ? field3481 : (field3481 = method1339("java.lang.Runtime"))).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class105.field1851 = 1 + (int) (var3 / 1048576L);
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        ++field3466;
    }

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field3473 = null;
        if (arg0 != -1138) {
            method1336((class192) null, (byte) -106, (class192) null);
        }
        field3472 = null;
        field3477 = null;
        field3469 = null;
        field3471 = null;
        field3479 = null;
        field3476 = null;
        field3475 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            field3469 = null;
        }
        ++field3470;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class219.field3951[arg1];
            for (int var5 = 0; var5 < class94.field1668; ++var5) {
                var3[var5] = this.method1335(false, class277.field4894[var5], var4) % 4096;
            }
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1339(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
