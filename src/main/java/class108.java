import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class108 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1768 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
    public static int[] field1767 = new int[256];

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lsc;")
    public static class181 field1773 = class149.method967(255, "::errortest");

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lsc;")
    public static class181 field1769 = class149.method967(255, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lsc;")
    public static class181 field1770 = class149.method967(255, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1772 = 0;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "F")
    public static float field1775;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Ljb;")
    public static class11 field1766;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method722(byte arg0) {
        if (class174.field2914 != null) {
            class174.field2914.method1711(-31);
        }
        int var1 = -21 / ((-arg0 - 49) / 53);
        field1774++;
        if (class8.field156 != null) {
            class8.field156.method1711(-55);
        }
        class113.method752(class82.field1317, 2, 22050, -1);
        class174.field2914 = class163.method1089(class224.field3870, 117, 22050, 0, class107.field1740);
        class174.field2914.method1702(class237.field4121, 113);
        class8.field156 = class163.method1089(class224.field3870, 119, 2048, 1, class107.field1740);
        class8.field156.method1702(class90.field1420, 127);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
    public static final void method723(boolean arg0, int arg1) {
        if (arg0) {
            class115.field1871.method1796(20, arg1);
            field1778++;
            class194.field3391.method1796(20, arg1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljb;Ljb;I)V")
    public static final void method724(class11 arg0, class11 arg1, int arg2) {
        class164.field2797 = class69.method484(arg0, 0, arg1, -117, class228.field3918);
        field1765++;
        class221.field3823 = (class14) class164.field2797;
        if (arg2 == 8910) {
            class18.field316 = class69.method484(arg0, 0, arg1, -113, class128.field2124);
            class114.field1853 = class69.method484(arg0, 0, arg1, -100, class123.field2021);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lo;I)V")
    public static final void method725(class175 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field1776++;
        class175 var2 = class58.method423(-28, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class41.field620;
            var4 = class143.field2321;
        } else {
            var3 = var2.field3041;
            var4 = var2.field3057;
        }
        class162.method1081(var4, false, arg0, (byte) -69, var3);
        class113.method750(var4, var3, arg1 ^ 0x1, arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method726(int arg0) {
        field1766 = null;
        field1770 = null;
        field1767 = null;
        int var1 = 63 / ((-arg0 - 57) / 37);
        field1773 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)I")
    public static final int method727(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -10) {
            return -57;
        } else {
            int var5 = 65536 - class72.field1145[arg1 * 1024 / arg4] >> 1;
            field1771++;
            return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
        }
    }
}
