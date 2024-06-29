import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class144 extends class715 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[Lqe;")
    public class491[] field1837;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lpd;")
    public static class267 field1840 = new class267();

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lo;")
    public static class31 field1842 = new class31(64);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method989(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class253[] var7 = class443.field6310;
        int var8 = 0;
        if (arg1 != 28) {
            method993(111, 11, 86);
        }
        while (var7.length > var8) {
            class253 var9 = var7[var8];
            if (var9 != null && var9.field3558 == 2) {
                class50.method340(arg2, false, var9.field3563 * 2, var9.field3564, var9.field3559, arg6, arg5 >> 1, arg4 >> 1, var9.field3557);
                if (class632.field8926[0] > -1 && (class673.field9441 % 20) < 10) {
                    class112 var10 = class351.field5119[var9.field3560];
                    int var11 = class632.field8926[0] + arg3 - 12;
                    int var12 = arg0 + class632.field8926[1] - 28;
                    var10.method785(var11, var12);
                    class651.method3726(var12, 111, var12 + var10.method792(), var11, var11 + var10.method781());
                }
            }
            var8++;
        }
        field1838++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
    public static final boolean method990(int arg0, byte arg1) {
        if (arg1 <= 75) {
            field1842 = null;
        }
        field1841++;
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([Lqe;)V")
    public class144(class491[] arg0) {
        this.field1837 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method991(int arg0) {
        field1842 = null;
        field1840 = null;
        if (arg0 > -63) {
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
    public static final int method992(int arg0, int arg1) {
        field1839++;
        byte var2;
        if (arg1 > 12000) {
            class481.method2822(0);
            var2 = 4;
        } else if (arg1 > 5000) {
            var2 = 3;
            class566.method3293(true);
        } else if (arg1 > 2000) {
            var2 = 2;
            class478.method2814(0);
        } else {
            var2 = 1;
            class34.method232((byte) -69, true);
        }
        if (arg0 != ~class145.field1852.field9002.method2258((byte) -76)) {
            class145.field1852.method3632(class145.field1852.field9016, true, 2);
            class226.method1559((byte) 50, false, 2);
        }
        class781.method4285(3);
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
    public static final boolean method993(int arg0, int arg1, int arg2) {
        field1836++;
        class322 var3 = class496.field7061.method319(62, arg1);
        if (arg2 != 20110) {
            field1840 = null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method2101(arg2 - 19985, arg0);
    }
}
