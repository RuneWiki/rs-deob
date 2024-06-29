import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class80 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lik;")
    public static class267 field1289 = new class267(100);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1290 = -1;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lcl;ZB)V")
    public static final void method528(class199 arg0, boolean arg1, byte arg2) {
        field1287++;
        int var3 = arg0.field3026;
        int var4 = (int) arg0.field1321;
        arg0.method538(80);
        if (arg1) {
            method529(-91, var3);
        }
        class200.method1258(-123, var3);
        class289 var5 = class89.method574((byte) -15, var4);
        if (var5 != null) {
            class295.method1980(var5, 0);
        }
        int var6 = class218.field3278;
        int var7 = 0;
        if (arg2 < 28) {
            method529(-40, -16);
        }
        while (var6 > var7) {
            if (class195.method1218(-5, class84.field1339[var7])) {
                class13.method73(var7, 1);
            }
            var7++;
        }
        if (class218.field3278 == 1) {
            class218.field3275 = false;
            class8.method40(0, class213.field3190, class283.field4239, class32.field470, class236.field3558);
        } else {
            class8.method40(0, class213.field3190, class283.field4239, class32.field470, class236.field3558);
            int var8 = class192.field2953.method1036(class96.field1514);
            for (int var9 = 0; var9 < class218.field3278; var9++) {
                int var10 = class192.field2953.method1036(class233.method1486(0, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class283.field4239 = var8 + 8;
            class32.field470 = class218.field3278 * 15 + (class141.field2060 ? 26 : 22);
        }
        if (class136.field1987 != -1) {
            class273.method1811(true, class136.field1987, 1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public static final void method529(int arg0, int arg1) {
        field1288++;
        if (arg1 == -1 || !class220.field3307[arg1]) {
            return;
        }
        class154.field2312.method1951(104, arg1);
        if (class234.field3532[arg1] == null) {
            return;
        }
        boolean var2 = true;
        if (arg0 >= -48) {
            method528((class199) null, false, (byte) 73);
        }
        for (int var3 = 0; var3 < class234.field3532[arg1].length; var3++) {
            if (class234.field3532[arg1][var3] != null) {
                if (class234.field3532[arg1][var3].field4394 == 2) {
                    var2 = false;
                } else {
                    class234.field3532[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class234.field3532[arg1] = null;
        }
        class220.field3307[arg1] = false;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method530(int arg0) {
        if (arg0 == -3) {
            field1289 = null;
        }
    }
}
