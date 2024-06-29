import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class423 extends class114 {

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Lla;")
    public static class319 field6450 = new class319(94, 2);

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lfg;")
    public static class84 field6452 = new class84(10, 2, 2, 0);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "F")
    public static float field6454;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[I")
    public static int[] field6449;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public static void method2580(byte arg0) {
        field6449 = null;
        field6452 = null;
        if (arg0 <= 109) {
            field6454 = -0.29996228F;
        }
        field6450 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method2581(boolean arg0) {
        class239.method1574(22050, class203.field2716.field1148, (byte) -127, 2);
        field6451++;
        class355.field5491 = new class206();
        class355.field5491.method1399(128, 9, true);
        class85.field1240 = class513.method3066(class312.field4572, -86, 22050, class85.field1245, 0);
        class85.field1240.method404(0, class355.field5491);
        class204.method1378(class359.field5511, 1, class149.field1964, class256.field3536, class355.field5491);
        class406.field6165 = class513.method3066(class312.field4572, -58, 2048, class85.field1245, 1);
        class31.field463 = new class130();
        class406.field6165.method404(0, class31.field463);
        if (arg0) {
            method2581(false);
        }
        class533.field7840 = new class335(22050, class56.field818);
        class8.field152 = class162.field2111.method1265("scape main", 121);
    }
}
