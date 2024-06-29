import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class345 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Loe;")
    public static class127 field5118 = new class127(78, -2);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Z")
    public static volatile boolean field5120 = true;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lsk;")
    public static class423 field5119 = new class423("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lft;")
    public static class4 field5121 = new class4();

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lqq;")
    public static class318 field5116;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method2112(int arg0) {
        field5119 = null;
        field5116 = null;
        field5118 = null;
        if (arg0 == 4) {
            field5121 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILuj;I)V")
    public static final void method2113(int arg0, int arg1, class249 arg2, int arg3) {
        if (arg2.field2174 == arg0 && arg0 != -1) {
            class87 var4 = class429.field6302.method106(-117, arg0);
            int var5 = var4.field1503;
            if (var5 == 1) {
                arg2.field2193 = 0;
                arg2.field2186 = 0;
                arg2.field2141 = 0;
                arg2.field2150 = 1;
                arg2.field2188 = arg3;
                class70.method516(var4, arg2.field3217, arg2.field2141, false, arg2.field3218, arg2.field3222, (byte) -79);
            }
            if (var5 == 2) {
                arg2.field2193 = 0;
            }
        } else if (arg0 == -1 || arg2.field2174 == -1 || class429.field6302.method106(-96, arg0).field1527 >= class429.field6302.method106(arg1 ^ 0xFFFFFFA9, arg2.field2174).field1527) {
            arg2.field2174 = arg0;
            arg2.field2150 = 1;
            arg2.field2186 = 0;
            arg2.field2141 = 0;
            arg2.field2230 = arg2.field2231;
            arg2.field2193 = 0;
            arg2.field2188 = arg3;
            if (arg2.field2174 != -1) {
                class70.method516(class429.field6302.method106(-113, arg2.field2174), arg2.field3217, arg2.field2141, false, arg2.field3218, arg2.field3222, (byte) -79);
            }
        }
        if (arg1 != 0) {
            method2114(-91);
        }
        field5115++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method2114(int arg0) {
        field5117++;
        if (class163.field2534 != null) {
            class163.field2534.method1795((byte) 127);
            class163.field2534 = null;
        }
        class145.method954(arg0 + 117);
        class111.method796();
        for (int var1 = 0; var1 < 4; var1++) {
            class91.field1641[var1].method2224(-1568);
        }
        class434.method2536(arg0 - 20860, false);
        System.gc();
        class15.method82((byte) 89, 2);
        class338.field5058 = -1;
        class127.field2053 = false;
        class187.method1157(true, (byte) -11);
        class381.field5550 = 0;
        class21.field269 = 0;
        class451.field6933 = 0;
        class320.field4827 = 0;
        class178.field2783 = 0;
        for (int var2 = 0; var2 < class228.field3487.length; var2++) {
            class228.field3487[var2] = null;
        }
        class288.method1759(0);
        for (int var3 = arg0; var3 < 2048; var3++) {
            class224.field3450[var3] = null;
        }
        class352.field5175 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class195.field3085[var4] = null;
        }
        class252.field3845.method2412(119);
        class119.method833(arg0 - 1);
        class379.field5542 = 0;
        class273.field4144.method1625(62);
        class327.method2036((byte) 88);
        class251.method1511(-1690);
        class41.method290(arg0 ^ 0xFFFFB25D, true);
        try {
            class209.method1278(arg0 ^ 0x1601, class7.field86.field3929, "loggedout");
        } catch (Throwable var5) {
        }
        class306.field4644 = 0L;
        class221.field3420 = null;
    }
}
