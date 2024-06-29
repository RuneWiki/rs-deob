import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class132 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field2317 = new int[32];

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[Llc;")
    public static class143[] field2319 = new class143[500];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Llc;")
    public static class143 field2318 = class66.method374(" )2> ", -1);

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Llc;")
    public static class143 field2322 = class66.method374("(U(Y", -1);

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lgf;")
    public static class7 field2321;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method791(int arg0) {
        field2322 = null;
        field2319 = null;
        field2317 = null;
        field2321 = null;
        if (arg0 != -25480) {
            field2321 = null;
        }
        field2318 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLgf;)V")
    public static final void method792(byte arg0, class7 arg1) {
        field2320++;
        class3.field46 = class234.method1582(true, 0, arg1, class126.field2229);
        class115.field2026 = new class100[class3.field46.length];
        class283.field4993 = new class100[class3.field46.length];
        class214.field3952 = new class100[class3.field46.length];
        for (int var2 = 0; var2 < class3.field46.length; var2++) {
            class3.field46[var2].method593();
            class115.field2026[var2] = class3.field46[var2].method597();
            class3.field46[var2].method593();
            class283.field4993[var2] = class3.field46[var2].method597();
            class3.field46[var2].method593();
            class214.field3952[var2] = class3.field46[var2].method597();
            class3.field46[var2].method593();
        }
        class71.field1348 = class143.method875(0, false, class192.field3529, arg1);
        class51.field1013 = class214.method1482(-126, 0, arg1, class115.field2019);
        class72.field1358 = class214.method1482(-9, 0, arg1, class267.field4791);
        class269.field4815 = class214.method1482(127, 0, arg1, class225.field4076);
        class117.field2077 = class214.method1482(-52, 0, arg1, class36.field628);
        class140.field2442 = class85.method486(class158.field2860, arg1, 0, 16);
        class242.field4349 = class85.method486(class287.field5042, arg1, 0, 16);
        class185.field3356 = class140.method836(arg1, class248.field4459, 0, -106);
        int var3 = 12 / ((83 - arg0) / 41);
        class186.field3379 = class85.method486(class35.field611, arg1, 0, 16);
        class127.field2247 = class85.method486(class17.field291, arg1, 0, 16);
        class279.field4924 = class273.method1803(class80.field1449, arg1, (byte) 116, 0);
        class9.field171 = class273.method1803(class68.field1296, arg1, (byte) -125, 0);
        class256.field4608.method1314(class9.field171, (int[]) null);
        class134.field2341.method1314(class9.field171, (int[]) null);
        class239.field4326.method1314(class9.field171, (int[]) null);
        class160 var4 = class74.method422(arg1, class137.field2404, false, 0);
        var4.method1056();
        class99.field1787 = var4;
        class160[] var5 = class143.method875(0, false, class229.field4193, arg1);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1056();
        }
        class35.field610 = var5;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        for (int var11 = 0; var11 < class71.field1348.length; var11++) {
            class71.field1348[var11].method1050(var7 + var8, var8 + var10, var8 + var9);
        }
        class3.field46[0].method591(var7 + var8, var8 + var10, var8 + var9);
        class202.field3675 = class71.field1348;
    }
}
