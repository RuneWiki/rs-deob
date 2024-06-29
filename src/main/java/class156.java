import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class156 extends class145 {

    @OriginalMember(owner = "client!od", name = "q", descriptor = "J")
    public static long field2848 = 0L;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lmb;")
    public static class132 field2851 = class166.method1092("Verbindung mit Update)2Server)3)3)3", 111);

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lmb;")
    public static class132 field2852 = class166.method1092("Benutzeroberfl-=che geladen)3", 116);

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "[I")
    public static int[] field2849;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
    public static final void method1019(int arg0, int arg1) {
        class169 var2 = class101.field1900[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class169 var4 = class101.field1900[var3][arg0][arg1] = class101.field1900[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3109--;
                for (int var5 = 0; var5 < var4.field3096; var5++) {
                    class78 var6 = var4.field3103[var5];
                    if ((var6.field1355 >> 29 & 0x3L) == 2L && var6.field1353 == arg0 && var6.field1362 == arg1) {
                        var6.field1361--;
                    }
                }
            }
        }
        if (class101.field1900[0][arg0][arg1] == null) {
            class101.field1900[0][arg0][arg1] = new class169(0, arg0, arg1);
        }
        class101.field1900[0][arg0][arg1].field3111 = var2;
        class101.field1900[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
    public static final int method1020(int arg0, byte arg1) {
        int var2 = -37 % ((arg1 + 14) / 59);
        field2847++;
        if (class149.field2736 == 1) {
            return 7;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 191) {
            return 5;
        } else if (arg0 == 69) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method1021(int arg0) {
        if (arg0 >= -96) {
            method1019(23, -18);
        }
        field2852 = null;
        field2849 = null;
        field2851 = null;
    }
}
