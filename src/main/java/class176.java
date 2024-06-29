import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class176 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Z")
    public static boolean field2746 = true;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Z")
    public static boolean field2748 = false;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "[Ljj;")
    public static class110[] field2749;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method1179(int arg0) {
        if (arg0 != -585749368) {
            method1180(true, true);
        }
        field2749 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZ)V")
    public static final void method1180(boolean arg0, boolean arg1) {
        field2743++;
        if (arg0) {
            if (class160.field2523 != -1) {
                class127.method847(-62, class160.field2523);
            }
            for (class229 var2 = (class229) class258.field4241.method871(-36); var2 != null; var2 = (class229) class258.field4241.method869(-14210)) {
                class72.method461(51, var2, true);
            }
            class160.field2523 = -1;
            class258.field4241 = new class130(8);
            class119.method778(-5490);
            class160.field2523 = class120.field1844;
            class219.method1533(false, 93);
            class268.method1842(42);
            class125.method836(-4, class160.field2523);
        }
        class276.field4574 = -1;
        class92.method600(false, class246.field3926);
        if (!arg1) {
            method1181(95, (byte) -94, 85, 45, -81);
        }
        class309.field5006 = new class208();
        class309.field5006.field850 = 3000;
        class309.field5006.field836 = 3000;
        if (class121.field1857 == 0) {
            class65.method417(-105, class3.field22);
            class229.method1614(10, 28);
            return;
        }
        if (class92.field1402 == 2) {
            class53.field715 = class165.field2603 << 7;
            class174.field2724 = class178.field2767 << 7;
        } else {
            class121.method789(0);
        }
        class78.method523(-1);
        class229.method1614(28, 28);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIII)V")
    public static final void method1181(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class63.field941 = arg2;
        field2750++;
        class87.field1356 = arg4;
        class53.field711 = arg0;
        if (arg1 != -95) {
            field2748 = true;
        }
        class75.field1180 = arg3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static final void method1182(byte arg0) {
        field2744++;
        int var1 = 35 % ((-arg0 - 5) / 42);
        class109.field1668.method144(0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
    public static final void method1183(int arg0, int arg1, int arg2) {
        int var3 = class223.field3550 * arg2 >> 8;
        if (arg0 == -1 && !class6.field52) {
            class210.method1490((byte) 104);
        } else if (arg0 != -1 && (class35.field441 != arg0 || !class57.method345((byte) -89)) && var3 != 0 && !class6.field52) {
            class298.method2070((byte) -34, class274.field4518, arg0, false, var3, 2, 0);
        }
        class35.field441 = arg0;
        if (arg1 != 0) {
            method1183(-37, 63, -3);
        }
        field2747++;
    }
}
