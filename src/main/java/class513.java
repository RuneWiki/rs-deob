import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class513 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lbn;")
    public static class301 field7542 = class452.method2679(125);

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field7546 = -1;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Z")
    public static boolean field7547;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lad;")
    public static class11 field7548;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field7545;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mt", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field7549;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V")
    public static final void method3053(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7545++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = 18 / ((arg3 - 40) / 38);
        class183.method1212(arg0, class333.field4265[arg1], true, arg4 - arg2, arg4 - -arg2);
        int var9 = -1;
        while (var5 < var6) {
            var9 += 2;
            var5++;
            var7 += var9;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var10 = class333.field4265[arg1 + var6];
                int[] var11 = class333.field4265[arg1 - var6];
                int var12 = arg4 + var5;
                int var13 = arg4 - var5;
                class183.method1212(arg0, var10, true, var13, var12);
                class183.method1212(arg0, var11, true, var13, var12);
            }
            int var14 = arg4 + var6;
            int var15 = arg4 - var6;
            int[] var16 = class333.field4265[arg1 + var5];
            int[] var17 = class333.field4265[arg1 - var5];
            class183.method1212(arg0, var16, true, var15, var14);
            class183.method1212(arg0, var17, true, var15, var14);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3054(int arg0, int arg1, int arg2, int arg3) {
        field7543++;
        class323 var4 = (class323) class67.method384(arg1, arg3, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class514.method3058(var4, 53);
        }
        class323 var6 = (class323) class346.method2038(arg1, arg3, arg2, field7549 == null ? (field7549 = method3056("wk")) : field7549);
        if (var6 != null) {
            var5 &= class514.method3058(var6, 88);
        }
        if (arg0 <= 9) {
            field7542 = null;
        }
        class323 var7 = (class323) class205.method1342(arg1, arg3, arg2);
        if (var7 != null) {
            var5 &= class514.method3058(var7, 67);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public static void method3055(boolean arg0) {
        field7548 = null;
        field7542 = null;
        if (arg0) {
            method3053(-102, -106, 88, 26, -42);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3056(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class169("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field7547 = false;
        field7548 = new class11(64);
    }
}
