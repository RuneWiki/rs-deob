import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class268 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4713 = 1;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Loa;")
    public static class99 field4714 = class221.method1463(2844, "Clientscript error in: ");

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Loa;")
    public static class99 field4715 = class221.method1463(2844, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4716 = 0;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Luk;")
    public class98 field4718;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLoa;)V")
    public static final void method1775(boolean arg0, class99 arg1) {
        field4719++;
        if (class103.field1751 >= 2) {
            if (arg1.method706(class190.field3348, 123)) {
                class96.method642(255);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class259.method1678((class99) null, class198.method1332(58, new class99[] { class29.field538, class198.method1333(-92, var4), class120.field2125 }), (byte) -126, 0);
            }
            if (arg1.method706(class129.field2244, 127)) {
                class96.method642(255);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class259.method1678((class99) null, class198.method1332(125, new class99[] { class169.field3009, class198.method1333(-106, var7), class120.field2125 }), (byte) -126, 0);
                class143.method964(arg0);
                class96.method642(255);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class259.method1678((class99) null, class198.method1332(58, new class99[] { class269.field4729, class198.method1333(-116, var9), class120.field2125 }), (byte) -126, 0);
            }
            if (arg1.method706(class80.field1418, 124)) {
                class230.method1507(-118);
            }
            if (arg1.method706(class111.field2015, 123)) {
                class58.field975.method1398(false);
            }
            if (arg1.method706(class171.field3039, 116)) {
                class58.field975.method1397(!arg0);
            }
            if (arg1.method706(class57.field961, 123)) {
                class24.field368.method589((byte) 98);
                class133.field2322.method56(63);
                class58.field975.method1399((byte) -10);
            }
            if (arg1.method706(class174.field3075, 114)) {
                class41.field698 = true;
            }
            if (arg1.method706(class254.field4385, 121)) {
                class138.method943(0, 25);
            }
            if (arg1.method706(class133.field2321, 115)) {
                class170.field3022 = true;
            }
            if (arg1.method706(class141.field2478, 122)) {
                class170.field3022 = false;
            }
            if (arg1.method706(class47.field782, 117)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class177.field3091[var10].field2272[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method668(true, class265.field4684) && class161.field2856 != 0) {
                class100.method708(1000, arg1.method680((byte) 90, 6).method677(true));
            }
            if (arg1.method706(class76.field1353, 117) && class161.field2856 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method668(true, class239.field4126)) {
                class164.field2881 = arg1.method680((byte) -91, 12).method705(-34).method677(true);
                class259.method1678((class99) null, class198.method1332(58, new class99[] { class184.field3273, class198.method1333(-114, class164.field2881) }), (byte) -126, 0);
            }
            if (arg1.method706(class277.field4872, 126)) {
                class278.field4881 = true;
            }
        }
        class141.field2485++;
        if (arg0) {
            class131.field2277.method966((byte) 49, 37);
            class131.field2277.method1691(arg1.method659(67) - 1, (byte) 53);
            class131.field2277.method1725(arg1.method680((byte) -64, 2), 98);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method1776(boolean arg0) {
        field4714 = null;
        if (arg0) {
            field4716 = 37;
        }
        field4715 = null;
    }
}
