import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class86 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1769 = -1;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lsg;")
    public static class30 field1767 = class167.method1221((byte) 33, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[Lsg;")
    public static class30[] field1772 = new class30[100];

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[Lgj;")
    public static class192[] field1774;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V")
    public static final void method723(int arg0, long arg1) {
        field1768++;
        if (arg1 == 0L || arg0 != 32563) {
            return;
        }
        if (!(class117.field2307 < 100 || class2.field43) || class117.field2307 >= 200) {
            class268.method1838(0, -1, class273.field4784, class55.field1203);
            return;
        }
        class30 var3 = class197.method1422(arg1, -124).method256(126);
        for (int var4 = 0; var4 < class117.field2307; var4++) {
            if (class103.field2083[var4] == arg1) {
                class268.method1838(0, -1, class160.method1188(new class30[] { var3, class31.field796 }, 0), class55.field1203);
                return;
            }
        }
        for (int var5 = 0; var5 < class141.field2730; var5++) {
            if (class254.field4485[var5] == arg1) {
                class268.method1838(0, arg0 - 32564, class160.method1188(new class30[] { class93.field1866, var3, class88.field1801 }, 0), class55.field1203);
                return;
            }
        }
        if (var3.method267(-52, class247.field4394.field2349)) {
            class268.method1838(0, arg0 ^ 0xFFFF80CC, class276.field4814, class55.field1203);
            return;
        }
        class30.field621++;
        class204.field3661[class117.field2307] = var3;
        class103.field2083[class117.field2307] = arg1;
        class90.field1807[class117.field2307] = 0;
        class145.field2785[class117.field2307] = class55.field1203;
        class130.field2569[class117.field2307] = 0;
        class123.field2417[class117.field2307] = false;
        class117.field2307++;
        class210.field3781 = class14.field308;
        class196.field3553.method1267(239, -9);
        class196.field3553.method72(-1033389592, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Lrk;")
    public static final class146 method724(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class146 var4 = var3.field3537;
            var3.field3537 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method725(int arg0) {
        field1774 = null;
        field1772 = null;
        if (arg0 != 239) {
            field1770 = -103;
        }
        field1767 = null;
    }
}
