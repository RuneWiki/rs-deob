import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class479 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lwm;")
    public static class399 field7061 = new class399(200);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Z")
    public static boolean field7063 = false;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field7066 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    public static int[] field7065 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    public static int[] field7062 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ls;")
    public static class186 field7064 = new class186(13, 0);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field7067 = 0;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field7068 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2856(byte arg0) {
        field7059++;
        if (class466.field6932 == 6) {
            class391.method2414(false, 5424);
            return;
        }
        int var1 = 11 % ((50 - arg0) / 51);
        if (class43.field593 > 0) {
            class391.method2414(class355.field5228, 5424);
        } else {
            class78.field1560 = class216.field3417;
            class216.field3417 = null;
            class253.method1639(12, -16646);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lan;", line = 36)
    public static final class20 method2857(Component arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method2857(null, true, false);
        }
        field7060++;
        return new class445(arg0, arg1);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 47)
    public static void method2858(byte arg0) {
        field7061 = null;
        field7065 = null;
        field7064 = null;
        field7066 = null;
        if (arg0 != -26) {
            method2859(95, -52, 50, null);
        }
        field7062 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILjava/lang/Class;)Lqi;", line = 62)
    public static final class402 method2859(int arg0, int arg1, int arg2, Class arg3) {
        class234 var4 = class518.field7511[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class440 var5 = var4.field3607; var5 != null; var5 = var5.field6528) {
            class402 var6 = var5.field6530;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6082 == arg1 && var6.field6077 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
