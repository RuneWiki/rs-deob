import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class119 extends class482 {

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Lh;")
    public static class434 field1739 = new class434(45, 1);

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Lgd;")
    public static class206 field1743 = new class206("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Lr;")
    public static class110 field1740;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Lvq;")
    public static class295 field1742;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static void method745(int arg0) {
        if (arg0 != -14625) {
            method746(84, (byte) 42);
        }
        field1740 = null;
        field1743 = null;
        field1739 = null;
        field1742 = null;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V")
    public static final void method746(int arg0, byte arg1) {
        field1741++;
        if (class18.field258 == arg0) {
            return;
        }
        if (class18.field258 == 0) {
            class260.method1462(119);
        }
        int var2 = -92 / ((arg1 + 75) / 35);
        if (arg0 == 40) {
            class191.method1092(123);
        }
        if (arg0 != 40 && class123.field1799 != null) {
            class123.field1799.method2310(-123);
            class123.field1799 = null;
        }
        if (class18.field258 == 25 || class18.field258 == 28) {
            class19.field262.field1651 = 2;
            class34.field519.field1651 = 2;
            class104.field1514.field1651 = 2;
            class168.field2323.field1651 = 2;
            class209.field2834.field1651 = 2;
            class196.field2673.field1651 = 2;
            class365.field5028.field1651 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class2.field39 = 0;
            class6.field74 = 0;
            class453.field6150 = 1;
            class123.field1802 = 0;
            class98.field1433 = 1;
            class294.method1651(true, 64);
            class19.field262.field1651 = 1;
            class34.field519.field1651 = 1;
            class104.field1514.field1651 = 1;
            class168.field2323.field1651 = 1;
            class209.field2834.field1651 = 1;
            class196.field2673.field1651 = 1;
            class365.field5028.field1651 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class302.method1692(31534);
        }
        if (arg0 == 5) {
            class23.method140(18, class473.field6525, class98.field1432);
        } else {
            class12.method76((byte) 2);
        }
        boolean var3 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var4 = class18.field258 == 5 || class18.field258 == 10 || class18.field258 == 28;
        if (var3 != var4) {
            if (var3) {
                class60.field811 = class429.field5868;
                if (class488.field6789.field6688 == 0) {
                    class449.method2641(2, 2);
                } else {
                    class404.method2443(class488.field6789.field6688, 0, 2, -71, class330.field4383, false, class429.field5868);
                }
                class477.field6599.method1378(false, 5797);
            } else {
                class449.method2641(2, 2);
                class477.field6599.method1378(true, 5797);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class98.field1432.method2019();
        }
        class18.field258 = arg0;
    }
}
