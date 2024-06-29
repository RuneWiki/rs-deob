import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class378 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field5506;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
    public int[] field5509;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
    public int[] field5512;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Lns;")
    public static class55 field5508 = new class55(14, 2);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method2273(int arg0) {
        field5508 = null;
        if (arg0 != -17295) {
            field5508 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2274(int arg0, int arg1) {
        field5505++;
        if (arg1 != 31782) {
            field5508 = null;
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class145.field1974.method937((byte) -70, class27.field356) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class17.field252.method937((byte) 102, class27.field356) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI)V")
    public static final void method2275(boolean arg0, int arg1) {
        if (arg0) {
            if (class6.field69 != -1) {
                class161.method972(124, class6.field69);
            }
            for (class333 var2 = (class333) class308.field4647.method2296(5773); var2 != null; var2 = (class333) class308.field4647.method2304(100)) {
                if (!var2.method624(18651)) {
                    var2 = (class333) class308.field4647.method2296(5773);
                    if (var2 == null) {
                        break;
                    }
                }
                class367.method2204(true, (byte) -108, false, var2);
            }
            class6.field69 = -1;
            class308.field4647 = new class382(8);
            class426.method2622(110);
            class6.field69 = class442.field6500;
            class39.method224(114, false);
            class141.method887((byte) -99);
            class384.method2314(class6.field69);
        }
        field5511++;
        class459.method2849(-116);
        if (arg1 <= 2) {
            return;
        }
        class1.field5 = -1;
        class56.method322(0, class57.field764);
        class113.field1500 = new class169();
        class113.field1500.field1892 = 6656;
        class113.field1500.field2019[0] = 52;
        class113.field1500.field1900 = 6656;
        class196.field2967 = 0;
        class185.field2790 = 0;
        class113.field1500.field2018[0] = 52;
        if (class80.field1054 == 2) {
            class185.field2790 = class402.field6007 << 7;
            class196.field2967 = class341.field5105 << 7;
        } else {
            class172.method1059(1);
        }
        class149.method930((byte) -105);
        if (class185.field2790 == 0 || class196.field2967 == 0) {
            class316.method1929(false, 10);
        } else {
            class135.method846(80);
            class316.method1929(false, 28);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
    public static final int method2276(byte arg0) {
        if (arg0 != 2) {
            field5508 = null;
        }
        field5507++;
        return 6;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
    public class378(int arg0) {
        this.field5506 = arg0;
        this.field5509 = new int[this.field5506];
        this.field5512 = new int[this.field5506];
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
    public static final void method2277(int arg0, int arg1) {
        if (arg0 == -2995) {
            class251.field3762.method1481(3, arg1);
            field5510++;
            class446.field6580.method1481(3, arg1);
        }
    }
}
