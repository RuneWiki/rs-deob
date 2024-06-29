import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class177 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3195 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Loc;")
    public static class151 field3198 = class137.method873(2, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lv;")
    public static class218 field3197 = new class218();

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Loc;")
    private static class151 field3200 = class137.method873(2, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Loc;")
    public static class151 field3199 = class137.method873(2, "3D)2Softwarebibliothek gestartet");

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Loc;")
    public static class151 field3202 = field3200;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Loc;")
    public static class151 field3203 = class137.method873(2, "::clientdrop");

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lsd;B)V")
    public static final void method1125(class192 arg0, byte arg1) {
        class20.field452 = arg0;
        if (arg1 > 121) {
            class153.field2762 = class20.field452.method1210(true, 16);
            field3196++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method1126(int arg0) {
        field3197 = null;
        field3200 = null;
        field3198 = null;
        field3199 = null;
        field3202 = null;
        field3203 = null;
        if (arg0 != -24586) {
            field3203 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z")
    public static final boolean method1127(byte arg0) {
        field3204++;
        int var1 = 40 / ((-arg0 - 16) / 47);
        try {
            return class22.method186(-24480);
        } catch (IOException var5) {
            class16.method137(3);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class219.field3813 + "," + class171.field3104 + "," + class22.field487 + " - " + class68.field1329 + "," + (class232.field4188 + class228.field3975.field3978[0]) + "," + (class228.field3975.field4031[0] + class64.field1255) + " - ";
            for (int var4 = 0; var4 < class68.field1329 && var4 < 50; var4++) {
                var3 = var3 + class1.field34.field4087[var4] + ",";
            }
            class123.method746(var6, var3, -12134);
            class158.method1035(5298);
            return true;
        }
    }
}
