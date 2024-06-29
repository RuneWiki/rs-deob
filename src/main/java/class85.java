import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class85 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Z")
    public static boolean field1418 = false;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Laj;")
    public static class151 field1416;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1412;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static final void method597(boolean arg0) {
        class127.field2118.method94(34);
        if (arg0) {
            field1418 = false;
        }
        field1410++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method598(int arg0) {
        field1411++;
        if (arg0 == -22018) {
            class34.field537.method97(98);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method599(byte arg0) {
        field1412 = null;
        if (arg0 == -114) {
            field1416 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZB)V")
    public static final void method600(boolean arg0, byte arg1) {
        class171.field2773 = 0;
        class148.field2455 = null;
        field1415++;
        class148.field2456 = null;
        class148.field2454 = null;
        class27.field471 = null;
        class148.field2446 = null;
        class148.field2447 = null;
        class294.field4831 = null;
        class148.field2448 = null;
        if (arg0 && class148.field2441 != null) {
            class273.field4568 = class148.field2441.field3301;
        } else {
            class273.field4568 = -1;
        }
        class148.field2441 = null;
        class148.field2445 = null;
        class148.field2458 = null;
        class148.field2439.method455(arg1 ^ 0xFFFFA959);
        class302.field4921 = null;
        class148.field2435 = null;
        class203.field3247 = null;
        class72.field1259 = null;
        class303.field4941 = null;
        class203.field3251 = null;
        class166.field2694 = null;
        class253.field4282 = -1;
        class249.field4186 = null;
        class306.field4951 = -1;
        class5.field130 = null;
        class307.field4972 = null;
        if (arg1 != 7) {
            return;
        }
        class215.method1534((byte) 73);
        class58.field1013 = null;
        class58.field1008 = null;
        class149.field2469 = null;
        class218.method1556(128, arg1 + 1907952037, 64);
        class249.method1823(64, -1, 64);
        class202.method1418(32, 64);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILah;IIII)Z")
    public static final boolean method601(int arg0, int arg1, class1 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1417++;
        class81 var7 = class17.method101(arg2.field86, 34);
        if (var7.field1360 == arg4) {
            return true;
        }
        int var8;
        if (arg2.field77) {
            int var9 = arg2.field27 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class230 var10 = var7.method564(var8, arg2.field72, true);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field57;
        int var12 = arg2.field10;
        if ((var8 & 0x1) == 1) {
            var11 = arg2.field10;
            var12 = arg2.field57;
        }
        int var13 = var10.field4226;
        int var14 = var10.field4230;
        if (var7.field1357) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field1350 == 0) {
            var10.method1647(arg0 * 4 + 48, 48 - -((-var12 + 104 - arg5) * 4), var13, var14);
        } else {
            var10.method1660(arg0 * 4 + 48, (-arg5 + 104 - var12) * 4 + 48, var13, var14, var7.field1350);
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
    public static final void method602(boolean arg0) {
        class236.field3980.field4160 = 0;
        class169.field2731 = -1;
        class136.field2239.field4160 = 0;
        field1413++;
        class131.field2170 = -1;
        class243.field4073 = 0;
        class158.field2583 = -1;
        class275.field4586 = -1;
        class287.field4747 = 0;
        class150.field2480 = 0;
        class155.field2572 = 0;
        class259.field4360 = arg0;
        class57.method366((byte) -106);
        for (int var1 = 0; var1 < class15.field300.length; var1++) {
            if (class15.field300[var1] != null) {
                class15.field300[var1].field764 = -1;
            }
        }
        for (int var2 = 0; var2 < class57.field1002.length; var2++) {
            if (class57.field1002[var2] != null) {
                class57.field1002[var2].field764 = -1;
            }
        }
        class177.method1300(-32768);
        class169.field2739 = 1;
        class240.method1719(30, 31136);
        for (int var3 = 0; var3 < 100; var3++) {
            class143.field2351[var3] = true;
        }
        class228.method1611((byte) -87);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lhg;I)Lhg;")
    public static final class207 method603(class207 arg0, int arg1) {
        field1414++;
        if (arg0.field3465 != -1) {
            return class222.method1574(114, arg0.field3465);
        }
        int var2 = 37 / ((arg1 - 50) / 40);
        int var3 = arg0.field3405 >>> 16;
        class220 var4 = new class220(class306.field4952);
        for (class278 var5 = (class278) var4.method1563((byte) -107); var5 != null; var5 = (class278) var4.method1564(-1)) {
            if (var5.field4622 == var3) {
                return class222.method1574(110, (int) var5.field2213);
            }
        }
        return null;
    }
}
