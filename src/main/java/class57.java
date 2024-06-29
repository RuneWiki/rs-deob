import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "S")
    public static short field879 = 256;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "[I")
    public static int[] field888 = new int[32];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "S")
    public static short field882 = 256;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lqa;")
    public static class152 field883 = null;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method454(int arg0, int arg1) {
        if (arg0 != 15827) {
            method457(127, -96, 85, (byte) -72, -85);
        }
        field880++;
        return class63.field1008[arg1].length() > 0 ? class231.field3597[arg1] + class111.field1745 + class63.field1008[arg1] : class231.field3597[arg1];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    public static final void method455(int arg0, byte arg1) {
        field885++;
        class244.field3782.method1778(arg0, -107);
        class130.field2018.method1778(arg0, -88);
        class126.field1980.method1778(arg0, -106);
        class159.field2442.method1778(arg0, -94);
        if (arg1 <= 22) {
            field879 = 78;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZIII)V")
    public static final void method456(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class28.field415 = arg2;
        class98.field1566 = arg0;
        class135.field2106 = arg6;
        class259.field3977 = arg1;
        field884++;
        class111.field1754 = arg5;
        if (arg3 && class28.field415 >= 100) {
            class69.field1100 = class98.field1566 * 128 + 64;
            class266.field4245 = class259.field3977 * 128 + 64;
            class295.field4631 = class224.method1502((byte) -128, class274.field4318, class69.field1100, class266.field4245) - class135.field2106;
        }
        if (arg4 != 22822) {
            method458(15);
        }
        class6.field111 = 2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBI)V")
    public static final void method457(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class63.field1011 != 0 && arg0 != 0 && class88.field1443 < 50 && arg2 != -1) {
            class94.field1528[class88.field1443] = arg2;
            class94.field1517[class88.field1443] = arg0;
            class48.field786[class88.field1443] = arg4;
            class163.field2482[class88.field1443] = null;
            class206.field3199[class88.field1443] = 0;
            class1.field15[class88.field1443] = arg1;
            class88.field1443++;
        }
        field887++;
        if (arg3 <= 97) {
            field889 = -54;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        field888 = null;
        if (arg0 != 24762) {
            method460(88);
        }
        field883 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILbf;Lbf;IIIIJ)V")
    public static final void method459(int arg0, int arg1, int arg2, int arg3, class205 arg4, class205 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class247 var12 = new class247();
        var12.field3820 = arg10;
        var12.field3821 = arg1 * 128 + 64;
        var12.field3811 = arg2 * 128 + 64;
        var12.field3823 = arg3;
        var12.field3814 = arg4;
        var12.field3816 = arg5;
        var12.field3813 = arg6;
        var12.field3815 = arg7;
        var12.field3809 = arg8;
        var12.field3810 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class255.field3907[var13][arg1][arg2] == null) {
                class255.field3907[var13][arg1][arg2] = new class23(var13, arg1, arg2);
            }
        }
        class255.field3907[arg0][arg1][arg2].field356 = var12;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method460(int arg0) {
        int var1 = -26 / ((arg0 - 58) / 35);
        class80.field1338.method1782(93);
        field881++;
    }
}
