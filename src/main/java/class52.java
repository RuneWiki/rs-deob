import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class52 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lvf;")
    public static class265 field1081 = class87.method582(-46, ")4l=");

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[S")
    public static short[] field1083 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Ldg;")
    public static class276 field1085 = new class276(50);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[Lr;")
    public static class229[] field1091 = new class229[0];

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lvf;")
    public static class265 field1090 = class87.method582(-46, "l");

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lvf;")
    public static class265 field1092 = class87.method582(-46, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Ldk;")
    public class179 field1084;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lgk;")
    public static class6 field1089;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method408(boolean arg0) {
        for (class181 var1 = (class181) class49.field1042.method1851(arg0); var1 != null; var1 = (class181) class49.field1042.method1847(false)) {
            int var2 = var1.field3217;
            if (class202.method1390(2, var2)) {
                boolean var3 = true;
                class6[] var4 = class178.field3174[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field226;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field393;
                    class6 var7 = class21.method204(var6, -16257);
                    if (var7 != null) {
                        class176.method1145((byte) -58, var7);
                    }
                }
            }
        }
        field1087++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIILdk;IJ)Z")
    public static final boolean method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class179 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class72.method508(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Lf;")
    public static final class209 method410(boolean arg0, int arg1) {
        if (!arg0) {
            method408(false);
        }
        class209 var2 = (class209) class70.field1357.method1887(116, (long) arg1);
        field1088++;
        if (var2 != null) {
            return var2;
        }
        class209 var3 = class116.method779(1, arg1, false, class202.field3627, class181.field3212);
        if (var3 != null) {
            class70.field1357.method1892(var3, (long) arg1, (byte) -126);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method411(int arg0) {
        field1083 = null;
        field1081 = null;
        if (arg0 != 0) {
            return;
        }
        field1089 = null;
        field1085 = null;
        field1090 = null;
        field1091 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lvf;")
    public static final class265 method412(int arg0, int arg1) {
        field1082++;
        if (arg0 < 999999999) {
            return class241.method1609(true, arg0);
        } else {
            if (arg1 != 2800) {
                method411(49);
            }
            return class181.field3213;
        }
    }
}
