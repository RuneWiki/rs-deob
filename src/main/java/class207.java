import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class207 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3551 = 0;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lsc;")
    public static class181 field3553 = class149.method967(255, ":tradereq:");

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    public static int[] field3556 = new int[5];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
    public static boolean field3552 = true;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method1376(byte arg0) {
        field3555++;
        if (class216.field3713 != null) {
            class216.field3713.method313(97);
            class216.field3713 = null;
        }
        class206.method1374((byte) 83);
        class256.method1747();
        for (int var1 = 0; var1 < 4; var1++) {
            class109.field1784[var1].method71(102);
        }
        class16.method142((byte) -65);
        System.gc();
        class60.method433(2, false);
        class148.field2479 = false;
        class152.field2527 = -1;
        int var2 = 44 / ((29 - arg0) / 62);
        class86.method583((byte) 63, true);
        class253.field4420 = 0;
        class222.field3844 = 0;
        class183.field3214 = false;
        for (int var3 = 0; var3 < class74.field1187.length; var3++) {
            class74.field1187[var3] = null;
        }
        class137.field2237 = 0;
        class152.field2538 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class39.field602[var4] = null;
            class86.field1373[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class129.field2140[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class132.field2183[var6][var7][var8] = null;
                }
            }
        }
        class184.method1257((byte) -65);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3553 = null;
        int var1 = 9 / ((-arg0 - 10) / 37);
        field3556 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lcc;")
    public static final class32 method1378(int arg0, int arg1) {
        field3558++;
        class32 var2 = (class32) class115.field1876.method1794(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = -103 / ((-arg0 - 53) / 39);
        class32 var4 = class8.method58(class217.field3731, true, arg1, false, class244.field4231);
        if (var4 != null) {
            class115.field1876.method1795(14177, (long) arg1, var4);
        }
        return var4;
    }
}
