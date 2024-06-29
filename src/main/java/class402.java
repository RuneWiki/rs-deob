import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class402 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[I")
    public static int[] field5324 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field5325 = 0;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
    public static int[] field5326 = new int[1];

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method2297(int arg0) {
        class505.field6968 = class254.field3332.field9366 + class254.field3332.field9375 + 2;
        field5327++;
        class86.field1053 = class325.field4382.field9375 + class325.field4382.field9366 + 2;
        class187.field2606 = new String[500];
        for (int var1 = 0; var1 < class187.field2606.length; var1++) {
            class187.field2606[var1] = "";
        }
        if (arg0 != -24268) {
            field5326 = null;
        }
        class592.method3278((byte) -59, class371.field4880.method2141(class422.field5539, true));
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static final void method2298(byte arg0) {
        field5323++;
        for (class354 var1 = (class354) class101.field1211.method2506(68); var1 != null; var1 = (class354) class101.field1211.method2505(-113)) {
            if (class471.method2721(var1.field4729, (byte) -125)) {
                class432.method2435((byte) 48, var1);
            }
        }
        if (arg0 > -40) {
            method2300((byte) 55);
        }
        if (class137.field1873 == 1) {
            class143.method819(200);
            return;
        }
        class576.method3180(class102.field1224, class172.field2446, class114.field1464, class464.field6078, -46);
        int var2 = class254.field3332.method3765(class371.field4903.method2141(class422.field5539, true), (byte) 6);
        for (class354 var3 = (class354) class101.field1211.method2506(68); var3 != null; var3 = (class354) class101.field1211.method2505(-126)) {
            int var4 = class500.method2841(var3, -122);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class172.field2446 = var2 + 8;
        class464.field6078 = class137.field1873 * 16 + (class218.field2857 ? 26 : 22);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
    public static final void method2299(int arg0, int arg1) {
        class117 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class270 var4 = class454.field5981[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class641.field8846; var5++) {
                    for (int var6 = 0; var6 < class329.field4421; var6++) {
                        var2 = var4.method1361(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class62.field762;
                            int var8 = var5 << class62.field762;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class270 var10 = class454.field5981[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1611(var6, true, var5) - var10.method1611(var6, true, var5);
                                    int var12 = var4.method1611(var6 + 1, true, var5) - var10.method1611(var6 + 1, true, var5);
                                    int var13 = var4.method1611(var6 + 1, true, var5 + 1) - var10.method1611(var6 + 1, true, var5 + 1);
                                    int var14 = var4.method1611(var6, true, var5 + 1) - var10.method1611(var6, true, var5 + 1);
                                    var10.method1352(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static void method2300(byte arg0) {
        field5326 = null;
        field5324 = null;
        if (arg0 != -105) {
            field5325 = 63;
        }
    }
}
