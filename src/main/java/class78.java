import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class78 {

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Ldd;")
    public static class35 field1824 = class180.method1196((byte) -32, "hel");

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Ldd;")
    private static class35 field1822 = class180.method1196((byte) -126, " ");

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "[I")
    public static int[] field1821 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ldd;")
    private static class35 field1825 = class180.method1196((byte) -65, "Loading config )2 ");

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1819 = -2;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Ldd;")
    public static class35 field1816 = field1825;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1826 = 0;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Ldd;")
    public static class35 field1817 = field1822;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lo;")
    public static class134 field1815;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static final void method592(boolean arg0) {
        field1818++;
        int var1 = class122.field2673.method1314(class61.field1504);
        for (int var2 = 0; var2 < class59.field1469; var2++) {
            int var6 = class122.field2673.method1314(class110.method805(0, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        class52.field1166 = arg0;
        class57.field1436 = var1;
        int var3 = class59.field1469 * 15 + 21;
        class183.field3767 = class59.field1469 * 15 + 22;
        int var4 = class134.field2859 - var1 / 2;
        if (var4 + var1 > 765) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class9.field187;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        class97.field2146 = var4;
        if (var5 < 0) {
            var5 = 0;
        }
        class113.field2533 = var5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1815 = null;
        field1824 = null;
        field1817 = null;
        field1816 = null;
        field1825 = null;
        if (arg0 != -29722) {
            field1825 = null;
        }
        field1822 = null;
        field1821 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lag;Lag;Lag;I)V")
    public static final void method594(class8 arg0, class8 arg1, class8 arg2, int arg3) {
        class48.field1058 = arg2;
        field1820++;
        class93.field2068 = arg1;
        class134.field2863 = arg0;
        if (arg3 != 1) {
            method594(null, null, null, 67);
        }
    }
}
