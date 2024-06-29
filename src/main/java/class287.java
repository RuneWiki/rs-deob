import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class287 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Z")
    public static boolean field3914 = false;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3913 = -2;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Laq;")
    public static class385 field3915;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1768(int arg0) {
        field3915 = null;
        if (arg0 != 0) {
            method1770((class487) null, -13, 22, (class250) null, 67, -125, -71, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -109, (byte) 58, 121, -63, false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILpi;Lpi;)V")
    public static final void method1769(int arg0, int arg1, int arg2, class467 arg3, class467 arg4) {
        class406 var5 = class11.method105(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5617 = arg3;
            var5.field5624 = arg4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkm;IILdr;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1770(class487 arg0, int arg1, int arg2, class250 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class259.field3611 = arg0;
        class491.field6928 = arg1;
        class441.field6059 = arg3;
        class101.field1443 = class259.field3611.method1051() > 0;
        class381.field5398 = arg4 >> class259.field3616;
        class8.field171 = arg6 >> class259.field3616;
        class117.field1648 = arg4;
        class211.field2979 = arg6;
        class471.field6587 = arg5;
        class443.field6111 = class381.field5398 - class125.field1713;
        if (class443.field6111 < 0) {
            class456.field6313 = -class443.field6111;
            class443.field6111 = 0;
        } else {
            class456.field6313 = 0;
        }
        class175.field2568 = class8.field171 - class125.field1713;
        if (class175.field2568 < 0) {
            class175.field2576 = -class175.field2568;
            class175.field2568 = 0;
        } else {
            class175.field2576 = 0;
        }
        class371.field5246 = class381.field5398 + class125.field1713;
        if (class371.field5246 > class456.field6299) {
            class371.field5246 = class456.field6299;
        }
        class153.field2206 = class8.field171 + class125.field1713;
        if (class153.field2206 > class205.field2946) {
            class153.field2206 = class205.field2946;
        }
        for (int var18 = 0; var18 < class125.field1713 + class125.field1713 + 2; var18++) {
            for (int var23 = 0; var23 < class125.field1713 + class125.field1713 + 2; var23++) {
                int var24 = class381.field5398 + var18 - class125.field1713;
                int var25 = class8.field171 + var23 - class125.field1713;
                if (var24 >= 0 && var25 >= 0 && var24 < class456.field6299 && var25 < class205.field2946) {
                    int var26 = var24 << class259.field3616;
                    int var27 = var25 << class259.field3616;
                    int var28 = class366.field5215[class366.field5215.length - 1].method710(var24, var25) - 1000;
                    int var29 = class8.field166 == null ? class366.field5215[0].method710(var24, var25) + class372.field5263 : class8.field166[0].method710(var24, var25) + class372.field5263;
                    class451.field6194[var18][var23] = class259.field3611.method1113(var26, var28, var27, var26, var29, var27);
                } else {
                    class451.field6194[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class125.field1713 + class125.field1713 + 1; var19++) {
            for (int var22 = 0; var22 < class125.field1713 + class125.field1713 + 1; var22++) {
                class435.field5973[var19][var22] = class451.field6194[var19][var22] || class451.field6194[var19 + 1][var22] || class451.field6194[var19][var22 + 1] || class451.field6194[var19 + 1][var22 + 1];
            }
        }
        class307.field4202 = arg8;
        class129.field1822 = arg9;
        class229.field3242 = arg10;
        class35.field570 = arg11;
        class343.field4706 = arg12;
        class18.method157();
        class349.method2085((byte) -125);
        for (class370 var20 = (class370) class123.field1703.method2823(118); var20 != null; var20 = (class370) class123.field1703.method2818(0)) {
            var20.method2773(26979);
            class295.method1825(true, var20);
        }
        if (class101.field1443) {
            for (int var21 = 0; var21 < class19.field321; var21++) {
                class488.field6890[var21].method1689(-101, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class259.field3611.method1141(0);
            if (class302.field4135 == null || class302.field4135 instanceof class135) {
                class302.field4135 = new class349();
            }
        } else if (class302.field4135 == null || class302.field4135 instanceof class349) {
            class302.field4135 = new class135();
        }
        class302.field4135.method813(-82, arg2);
        class302.field4135.method814(-13417);
        if (class96.field1366 != null) {
            class251.method1562(true);
            class302.field4135.method811(4, 22);
            class215.method1355(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class302.field4135.method814(-13417);
            class302.field4135.method811(4, 23);
            class251.method1562(false);
        }
        class215.method1355(arg2, arg7, arg13, arg14, arg15, arg16);
        class302.field4135.method814(-13417);
        class302.field4135.method817(true);
        class302.field4135.method814(-13417);
        if (arg2 > 1) {
            class259.field3611.method1087(0);
        }
        class259.field3611.method1083(0, (class488[]) null);
    }
}
