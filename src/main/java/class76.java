import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class76 extends class105 {

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    public static int[] field1375 = new int[100];

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Leb;")
    public static class230 field1377 = class68.method589(0, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Leb;")
    public static class230 field1378 = class68.method589(0, "<col=00ff00>");

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Leb;")
    public static class230 field1381 = class68.method589(0, "");

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lkk;")
    public static class223 field1374;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lsf;")
    public static class93 field1382;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lkk;I)Z")
    public static final boolean method633(class223 arg0, int arg1) {
        field1379++;
        if (arg0.method1550(class35.field655, 25648)) {
            return true;
        } else {
            if (arg1 < 39) {
                method634(-56);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method634(int arg0) {
        field1378 = null;
        field1375 = null;
        field1381 = null;
        field1382 = null;
        if (arg0 != 0) {
            method634(-32);
        }
        field1374 = null;
        field1377 = null;
    }
}
