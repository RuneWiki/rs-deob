import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class91 extends class259 {

    @OriginalMember(owner = "client!po", name = "z", descriptor = "Lbd;")
    public class339 field1193;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "Lgj;")
    public static class257 field1197 = new class257();

    @OriginalMember(owner = "client!po", name = "E", descriptor = "Z")
    public static boolean field1198 = false;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "[Lmj;")
    public static class256[] field1199 = new class256[50];

    @OriginalMember(owner = "client!po", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1201 = "Attack";

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "I")
    public static int field1202 = 0;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method569(byte arg0, int arg1) {
        field1196++;
        class279 var2 = class147.method1085(arg1, -19443, 11);
        if (arg0 != -79) {
            method570(-127, -19, false, false, -2, true, 102);
        }
        var2.method1996(true);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZZIZI)V", line = 24)
    public static final void method570(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg6 > arg0) {
            int var7 = (arg0 + arg6) / 2;
            int var8 = arg0;
            class122 var9 = class324.field5211[var7];
            class324.field5211[var7] = class324.field5211[arg6];
            class324.field5211[arg6] = var9;
            for (int var10 = arg0; var10 < arg6; var10++) {
                if (class28.method205(arg5, (byte) 127, arg2, arg4, arg1, var9, class324.field5211[var10]) <= 0) {
                    class122 var11 = class324.field5211[var10];
                    class324.field5211[var10] = class324.field5211[var8];
                    class324.field5211[var8++] = var11;
                }
            }
            class324.field5211[arg6] = class324.field5211[var8];
            class324.field5211[var8] = var9;
            method570(arg0, arg1, arg2, arg3, arg4, arg5, var8 - 1);
            method570(var8 + 1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        field1195++;
        if (arg3) {
            method571(59);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lbd;)V", line = 66)
    public class91(class339 arg0) {
        this.field1193 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V", line = 77)
    public static void method571(int arg0) {
        field1201 = null;
        field1199 = null;
        if (arg0 != 32) {
            field1198 = true;
        }
        field1197 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V", line = 89)
    public static final void method572(int arg0, int arg1, int arg2) {
        if (class31.field367 != arg2) {
            class25.field288 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class25.field288[var3] = (var3 << 12) / arg2;
            }
            class31.field367 = arg2;
            class311.field4878 = arg2 - 1;
            class143.field2282 = arg2 * 32;
        }
        if (class99.field1344 != arg0) {
            if (class31.field367 == arg0) {
                class111.field1553 = class25.field288;
            } else {
                class111.field1553 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class111.field1553[var4] = (var4 << 12) / arg0;
                }
            }
            class56.field663 = arg0 - 1;
            class99.field1344 = arg0;
        }
        int var5 = 124 % ((27 - arg1) / 54);
        field1194++;
    }
}
