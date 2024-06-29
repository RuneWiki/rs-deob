import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class349 {

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lfa;")
    private class156 field4841 = new class156(64);

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lfs;")
    private class387 field4839;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lfs;")
    private class387 field4838;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "F")
    public static float field4835;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLvj;ZI)V", line = 3)
    public static final void method2103(boolean arg0, class305 arg1, boolean arg2, int arg3) {
        field4836++;
        int var4 = arg1.field4333;
        int var5 = (int) arg1.field3271;
        arg1.method1525((byte) -44);
        if (arg0) {
            class185.method1295(0, var4);
        }
        class394.method2415(var4, (byte) -58);
        class188 var6 = class371.method2286(0, var5);
        if (var6 != null) {
            class120.method951(var6, (byte) -109);
        }
        if (arg3 >= -16) {
            method2106(-27, -95, null, -41);
        }
        class418.method2547(22);
        if (!arg2 && class64.field761 != -1) {
            class389.method2393(class64.field761, -1, 1);
        }
        class511 var7 = new class511(class49.field545);
        for (class305 var8 = (class305) var7.method3045(4); var8 != null; var8 = (class305) var7.method3044(true)) {
            if (!var8.method1524(-115)) {
                var8 = (class305) var7.method3045(4);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4335 == 3) {
                int var9 = (int) var8.field3271;
                if (var9 >>> 16 == var4) {
                    method2103(true, var8, arg2, -34);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)Lnp;", line = 74)
    public final class339 method2104(int arg0, byte arg1) {
        field4840++;
        int var3 = -109 % ((arg1 - 20) / 55);
        class339 var4 = (class339) this.field4841.method1115((long) arg0, (byte) 58);
        if (var4 != null) {
            return var4;
        }
        byte[] var5;
        if (arg0 < 32768) {
            var5 = this.field4839.method2363(arg0, 0, 125);
        } else {
            var5 = this.field4838.method2363(arg0 & 0x7FFF, 0, 89);
        }
        class339 var6 = new class339();
        if (var5 != null) {
            var6.method2064(new class65(var5), -48);
        }
        if (arg0 >= 32768) {
            var6.method2061((byte) 51);
        }
        this.field4841.method1107(1, (long) arg0, var6);
        return var6;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 108)
    public static final void method2105(int arg0, int arg1) {
        field4842++;
        class215 var2 = class171.method1208(arg0, (byte) 117, 3);
        int var3 = 87 / ((arg1 + 54) / 52);
        var2.method1469((byte) -74);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILfs;I)Lcn;", line = 124)
    public static final class355 method2106(int arg0, int arg1, class387 arg2, int arg3) {
        field4837++;
        class65 var4 = new class65(arg2.method2363(arg1, arg0, arg3 ^ 0x76));
        class355 var5 = new class355(arg1, var4.method624((byte) -40), var4.method624((byte) -40), var4.method616((byte) 119), var4.method616((byte) 110), var4.method577(255) == 1, var4.method577(255), var4.method577(255));
        int var6 = var4.method577(255);
        for (int var7 = arg3; var7 < var6; var7++) {
            var5.field4961.method1015(false, new class402(var4.method577(arg3 ^ 0xFF), var4.method623((byte) 87), var4.method623((byte) -75), var4.method623((byte) -45), var4.method623((byte) 100), var4.method623((byte) 85), var4.method623((byte) -27), var4.method623((byte) -35), var4.method623((byte) -99)));
        }
        var5.method2144((byte) -83);
        return var5;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lya;IILc;III[[[B[I[I[I[I[IIBIIZ)V", line = 150)
    public static final void method2107(class38 arg0, int arg1, int arg2, class122 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class442.field6561 = arg0;
        class397.field5826 = arg1;
        class405.field6000 = arg3;
        class348.field4832 = class442.field6561.method322() > 0;
        class321.field4527 = arg4 >> class527.field7754;
        class209.field3040 = arg6 >> class527.field7754;
        class215.field3070 = arg4;
        class55.field585 = arg6;
        class456.field6707 = arg5;
        class400.field5938 = class321.field4527 - class385.field5672;
        if (class400.field5938 < 0) {
            class251.field3699 = -class400.field5938;
            class400.field5938 = 0;
        } else {
            class251.field3699 = 0;
        }
        class101.field1415 = class209.field3040 - class385.field5672;
        if (class101.field1415 < 0) {
            class226.field3302 = -class101.field1415;
            class101.field1415 = 0;
        } else {
            class226.field3302 = 0;
        }
        class74.field1016 = class385.field5672 + class321.field4527;
        if (class74.field1016 > class241.field3562) {
            class74.field1016 = class241.field3562;
        }
        class215.field3099 = class385.field5672 + class209.field3040;
        if (class215.field3099 > class497.field7388) {
            class215.field3099 = class497.field7388;
        }
        for (int var18 = 0; var18 < class385.field5672 + class385.field5672 + 2; var18++) {
            for (int var23 = 0; var23 < class385.field5672 + class385.field5672 + 2; var23++) {
                int var24 = class321.field4527 + var18 - class385.field5672;
                int var25 = class209.field3040 + var23 - class385.field5672;
                if (var24 >= 0 && var25 >= 0 && var24 < class241.field3562 && var25 < class497.field7388) {
                    int var26 = var24 << class527.field7754;
                    int var27 = var25 << class527.field7754;
                    int var28 = class283.field4115[class283.field4115.length - 1].method430(var24, var25) - (0x3E8 << class527.field7754 - 7);
                    int var29 = class52.field578 == null ? class283.field4115[0].method430(var24, var25) + class376.field5566 : class52.field578[0].method430(var24, var25) + class376.field5566;
                    class89.field1221[var18][var23] = class442.field6561.method365(var26, var28, var27, var26, var29, var27);
                } else {
                    class89.field1221[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class385.field5672 + class385.field5672 + 1; var19++) {
            for (int var22 = 0; var22 < class385.field5672 + class385.field5672 + 1; var22++) {
                class350.field4844[var19][var22] = class89.field1221[var19][var22] || class89.field1221[var19 + 1][var22] || class89.field1221[var19][var22 + 1] || class89.field1221[var19 + 1][var22 + 1];
            }
        }
        class28.field341 = arg8;
        class183.field2587 = arg9;
        class496.field7280 = arg10;
        class495.field7255 = arg11;
        class364.field5098 = arg12;
        class38.method366();
        class208.method1446(2);
        for (class462 var20 = (class462) class111.field1573.method2955(62); var20 != null; var20 = (class462) class111.field1573.method2952((byte) -61)) {
            var20.method2322(1024);
            class200.method1404(var20, -201);
        }
        if (class348.field4832) {
            for (int var21 = 0; var21 < class122.field1791; var21++) {
                class9.field115[var21].method3094(arg1, arg17, 104);
            }
        }
        if (arg2 > 1) {
            class442.field6561.method382(0);
            if (class198.field2896 == null || class198.field2896 instanceof class436) {
                class198.field2896 = new class170();
            }
        } else if (class198.field2896 == null || class198.field2896 instanceof class170) {
            class198.field2896 = new class436();
        }
        class198.field2896.method1204(arg2, 5000);
        class198.field2896.method1203(5000);
        if (class336.field4678 != null) {
            class476.method2876(true);
            class198.field2896.method1193((byte) -122, 22);
            class431.method2617(arg2, null, 0, (byte) 0, arg15, arg16);
            class198.field2896.method1203(5000);
            class198.field2896.method1193((byte) -117, 23);
            class476.method2876(false);
        }
        class431.method2617(arg2, arg7, arg13, arg14, arg15, arg16);
        class198.field2896.method1203(5000);
        class198.field2896.method1199(-125);
        class198.field2896.method1203(5000);
        if (arg2 > 1) {
            class442.field6561.method340(0);
        }
        class442.field6561.method291(0, null);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(ILfs;Lfs;)V", line = 312)
    public class349(int arg0, class387 arg1, class387 arg2) {
        this.field4839 = arg1;
        this.field4838 = arg2;
        if (this.field4839 != null) {
            this.field4839.method2367(0, 28724);
        }
        if (this.field4838 != null) {
            this.field4838.method2367(0, 28724);
        }
    }
}
