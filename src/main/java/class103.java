import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class103 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field1734 = new int[2048];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lmb;")
    private static class96 field1745 = class243.method1708("Loading )2 please wait)3", (byte) 127);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lmb;")
    public static class96 field1742 = field1745;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lff;")
    public static class3 field1735;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ld;")
    public static class51 field1738;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field1743;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Z")
    public static boolean field1736;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public static int[] field1741;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[Lrf;")
    public static class30[] field1737;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lff;I)V")
    public static final void method778(class3 arg0, int arg1) {
        class196.field3395 = class9.method73(arg0, 0, false, class170.field2986);
        class250.field4323 = new class30[class196.field3395.length];
        field1737 = new class30[class196.field3395.length];
        class38.field655 = new class30[class196.field3395.length];
        for (int var2 = 0; var2 < class196.field3395.length; var2++) {
            class196.field3395[var2].method204();
            class250.field4323[var2] = class196.field3395[var2].method199();
            class196.field3395[var2].method204();
            field1737[var2] = class196.field3395[var2].method199();
            class196.field3395[var2].method204();
            class38.field655[var2] = class196.field3395[var2].method199();
            class196.field3395[var2].method204();
        }
        class93.field1536 = class239.method1673(arg0, arg1 + 13023, 0, class234.field4016);
        class221.field3787 = class73.method530(class83.field1402, 0, -121, arg0);
        field1746++;
        class242.field4206 = class73.method530(class92.field1518, 0, -120, arg0);
        class40.field691 = class73.method530(class254.field4388, 0, arg1 ^ 0x3187, arg0);
        class10.field178 = class73.method530(class6.field121, 0, -121, arg0);
        class181.field3140 = class157.method1140(0, 50, class96.field1577, arg0);
        class22.field388 = class157.method1140(0, arg1 ^ 0xFFFFCE12, class79.field1338, arg0);
        class141.field2526 = class162.method1180(arg0, class270.field4704, 0, 127);
        class140.field2502 = class157.method1140(0, 50, class276.field4802, arg0);
        class89.field1488 = class157.method1140(0, 50, class143.field2533, arg0);
        class226.field3847 = class32.method210(-26647, 0, arg0, class68.field1175);
        class45.field773 = class32.method210(-26647, 0, arg0, class132.field2369);
        class149.field2628.method137(class45.field773, (int[]) null);
        class244.field4235.method137(class45.field773, (int[]) null);
        class71.field1216.method137(class45.field773, (int[]) null);
        class174 var3 = class220.method1515(0, arg0, arg1 ^ arg1, field1744);
        var3.method1236();
        class144.field2568 = var3;
        class174[] var4 = class239.method1673(arg0, 255, 0, class60.field1039);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1236();
        }
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class185.field3225 = var4;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class93.field1536.length; var10++) {
            class93.field1536[var10].method1247(var7 + var9, var8 + var9, var6 + var9);
        }
        class196.field3395[0].method203(var7 + var9, var8 + var9, var6 + var9);
        class252.field4369 = class93.field1536;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method779(int arg0) {
        field1738 = null;
        field1741 = null;
        if (arg0 != 16215) {
            field1744 = -36;
        }
        field1742 = null;
        field1737 = null;
        field1735 = null;
        field1734 = null;
        field1745 = null;
        field1743 = null;
    }
}
