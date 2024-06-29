import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class557 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lhu;")
    public static class131 field7978;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Loh;")
    public static class404 field7980;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lha;B)V")
    public static final void method3267(class58 arg0, byte arg1) {
        field7979++;
        if (class107.field1138.method1727(-41) == 0) {
            return;
        }
        if (arg1 <= 111) {
            field7980 = null;
        }
        if (class654.field9334.field9850.method1512(94) == 0) {
            for (class672 var2 = (class672) class107.field1138.method1719(65280); var2 != null; var2 = (class672) class107.field1138.method1723(-20665)) {
                class361.field4643.method904(var2.field9538, 0, var2.field9539, var2.field9540, class322.field4116, arg0, var2.field9536, false, var2.field9535 ? class90.field937.field2201 : null, arg0, var2.field9541, false);
                var2.method864(12983);
            }
            class486.method2933(true);
            return;
        }
        if (class673.field9546 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class673.field9546 = class93.method632(class100.field1044, 0, class179.field2100, 0, 0, var3);
            class199.field2352 = class673.field9546.method373(class353.method2088(class330.field4275, class613.field8770, 0, -77), class155.method958(class394.field5410, class613.field8770, 0), true);
        }
        for (class672 var4 = (class672) class107.field1138.method1719(65280); var4 != null; var4 = (class672) class107.field1138.method1723(-20665)) {
            class361.field4643.method904(var4.field9538, 0, var4.field9539, var4.field9540, class199.field2352, arg0, var4.field9536, false, var4.field9535 ? class90.field937.field2201 : null, class673.field9546, var4.field9541, false);
            var4.method864(12983);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([II[I[ILefa;)V")
    public static final void method3268(int[] arg0, int arg1, int[] arg2, int[] arg3, class183 arg4) {
        field7982++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = arg3[var5];
            int var10 = 0;
            while (var8 != 0 && var10 < arg4.field7105.length) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg4.field7105[var10] = null;
                    } else {
                        class25 var11 = class637.field9158.method1905(52, var7);
                        int var12 = var11.field250;
                        class154 var13 = arg4.field7105[var10];
                        if (var13 != null) {
                            if (var13.field1690 == var7) {
                                if (var12 == 0) {
                                    var13 = arg4.field7105[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field1698 = 0;
                                    var13.field1700 = var9;
                                    var13.field1694 = 0;
                                    var13.field1697 = 1;
                                    var13.field1699 = 0;
                                    if (!arg4.field7108) {
                                        class629.method3607(arg4, var11, -126, 0);
                                    }
                                } else if (var12 == 2) {
                                    var13.field1698 = 0;
                                }
                            } else if (var11.field272 >= class637.field9158.method1905(61, var13.field1690).field272) {
                                var13 = arg4.field7105[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class154 var14 = arg4.field7105[var10] = new class154();
                            var14.field1698 = 0;
                            var14.field1690 = var7;
                            var14.field1694 = 0;
                            var14.field1700 = var9;
                            var14.field1697 = 1;
                            var14.field1699 = 0;
                            if (!arg4.field7108) {
                                class629.method3607(arg4, var11, -117, 0);
                            }
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
        int var6 = 28 / ((65 - arg1) / 53);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3269(byte arg0, String arg1) {
        field7981++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != 24) {
            return -120;
        }
        while (var2 < class752.field10524) {
            if (arg1.equalsIgnoreCase(class19.field175[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method3270(byte arg0) {
        if (arg0 > -20) {
            method3268(null, 5, null, null, null);
        }
        field7978 = null;
        field7980 = null;
    }
}
