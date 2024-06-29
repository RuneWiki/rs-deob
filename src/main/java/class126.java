import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class126 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Z")
    public static boolean field1683 = false;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1685 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1686;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Ljava/lang/String;")
    public String field1690;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([Lwf;ZIIII)V", line = 5)
    public static final void method933(class333[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1687++;
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class333 var7 = arg0[var6];
            if (var7 != null && var7.field5142 == arg3) {
                class154.method1188(arg1, arg2, var7, arg4, -4);
                class260.method1793(arg2, arg4, var7, 97);
                if (var7.field5134 > (var7.field5044 - var7.field5172)) {
                    var7.field5134 = var7.field5044 - var7.field5172;
                }
                if (var7.field5136 > var7.field5037 - var7.field5056) {
                    var7.field5136 = var7.field5037 - var7.field5056;
                }
                if (var7.field5134 < 0) {
                    var7.field5134 = 0;
                }
                if (var7.field5136 < 0) {
                    var7.field5136 = 0;
                }
                if (var7.field5105 == 0) {
                    class45.method323(arg1, false, var7);
                }
            }
        }
        if (arg5 >= -100) {
            method934((byte) -75, 90);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V", line = 52)
    public static final void method934(byte arg0, int arg1) {
        class193.field2672 = 100;
        class308.field4544 = 3;
        if (arg0 == -121) {
            field1684++;
            class130.field1774 = -1;
            class144.field2014 = arg1;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIII)V", line = 66)
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -17731) {
            return;
        }
        if (arg0 == arg3 && arg4 == arg5 && arg2 == arg9 && arg1 == arg6) {
            class131.method1002(arg5, arg6, arg8, -29, arg0, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg5;
            int var12 = arg0 * 3;
            int var13 = arg4 * 3;
            int var14 = arg3 * 3;
            int var15 = arg9 * 3;
            int var16 = arg2 + var14 - var15 - arg0;
            int var17 = arg5 * 3;
            int var18 = var12 + var15 - var14 - var14;
            int var19 = arg1 * 3;
            int var20 = var17 + var19 - var13 - var13;
            int var21 = var13 + arg6 - arg5 - var19;
            int var22 = var14 - var12;
            int var23 = var13 - var17;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var18 * var25;
                int var27 = var24 * var25 >> 12;
                int var28 = var16 * var27;
                int var29 = var23 * var24;
                int var30 = var20 * var25;
                int var31 = var21 * var27;
                int var32 = var22 * var24;
                int var33 = (var26 + var28 + var32 >> 12) + arg0;
                int var34 = (var29 + var31 + var30 >> 12) + arg5;
                class131.method1002(var11, var34, arg8, -40, var10, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        field1688++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 161)
    public static void method936(boolean arg0) {
        field1686 = null;
        if (arg0) {
            method933((class333[]) null, false, 101, -99, 41, -24);
        }
    }
}
