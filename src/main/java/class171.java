import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class171 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2545 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2549 = null;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[Lof;")
    public static class421[] field2548;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1309(byte arg0) {
        field2550++;
        if (arg0 != -8) {
            field2545 = null;
        }
        class120.field1872.method112(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1310(int arg0) {
        field2549 = null;
        field2545 = null;
        if (arg0 != -1309794792) {
            method1311(-86, (class90) null);
        }
        field2548 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILja;)V")
    public static final void method1311(int arg0, class90 arg1) {
        field2546++;
        arg1.method752(0, 0, class113.field1819, 350);
        arg1.method681(0, 0, class113.field1819, 350, class276.field4158 << 24 | 0x332277, 1);
        int var2 = 0;
        if (arg0 < 34) {
            method1309((byte) 101);
        }
        while (var2 < 100) {
            int var4 = class200.field2932[var2];
            int var5 = class220.field3280[var2];
            arg1.method681(var4, var5, 2, 2, class161.field2438[var2] << 24 | 0xFFFFFF, 1);
            var2++;
        }
        for (int var3 = 0; var3 < class137.field2192.length; var3++) {
            class107.field1763.method1677(350 - class106.field1749 - (class90.field1436 * var3 + (2 - -class269.field4041.field2740)), -1, (byte) 20, -16777216, class137.field2192[var3], 10);
        }
        arg1.method718(class113.field1819, 6, 350 - class106.field1749, 0, -1);
        class250.field3620.method1677(350 - class150.field2295.field2740 - 1, -1, (byte) 20, -16777216, "--> " + class336.field4817 + "*", 10);
    }
}
