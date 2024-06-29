import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class14 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lkc;")
    public static class157 field147 = new class157("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lmg;")
    public static class530 field148 = new class530();

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lc;")
    public static class512 field146;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([BZI)V")
    public static final void method93(byte[] arg0, boolean arg1, int arg2) {
        field145++;
        if (class248.field3370 == null) {
            class248.field3370 = new class319(20000);
        }
        if (arg2 != -3021) {
            return;
        }
        class248.field3370.method1885(arg0.length, 0, false, arg0);
        if (!arg1) {
            return;
        }
        class366.method2188(true, class248.field3370.field4336);
        class504.field7378 = new class468[class355.field5130];
        int var3 = 0;
        for (int var4 = class189.field2778; var4 <= class395.field5692; var4++) {
            class468 var5 = class184.method1242(var4, 119);
            if (var5 != null) {
                class504.field7378[var3++] = var5;
            }
        }
        class425.field6184 = false;
        class314.field4256 = class254.method1522((byte) -51);
        class248.field3370 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static void method94(int arg0) {
        field147 = null;
        field146 = null;
        field148 = null;
        if (arg0 != 0) {
            method94(79);
        }
    }
}
