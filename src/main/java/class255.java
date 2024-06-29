import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class255 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Ljava/util/Random;")
    public static Random field3452 = new Random();

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3458 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3459 = "skill: ";

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lpg;")
    public static class112 field3462;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lkb;")
    public static class80[] field3460;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
    public static final void method1661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg0 - arg2) >= class433.field6144 && class69.field1047 >= (arg0 + arg2) && (arg3 - arg2) >= class39.field595 && class134.field1917 >= arg3 + arg2) {
            class138.method1082(arg2, arg0, arg4, (byte) -68, arg3);
        } else {
            class440.method2727(arg3, arg0, arg4, arg2, (byte) -128);
        }
        field3456++;
        if (arg1 != 13557) {
            field3458 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg6 && arg0 == arg5 && arg1 == arg9 && arg2 == arg7) {
            class287.method1815(arg1, arg2, -20897, arg8, arg5, arg6);
        } else {
            int var10 = arg6;
            int var11 = arg5;
            int var12 = arg6 * 3;
            int var13 = arg5 * 3;
            int var14 = arg3 * 3;
            int var15 = arg0 * 3;
            int var16 = arg9 * 3;
            int var17 = arg7 * 3;
            int var18 = arg1 + var14 - (arg6 + var16);
            int var19 = var15 + arg2 - var17 - arg5;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = (var30 + var32 + var28 >> 12) + arg5;
                class287.method1815(var33, var34, -20897, arg8, var11, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        field3455++;
        if (arg4 >= -18) {
            field3459 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lrk;I)V")
    public static final void method1663(class427 arg0, int arg1) {
        class301.field4045 = arg0;
        field3454++;
        if (arg1 != 1398447724) {
            method1662(-88, -92, -105, 48, 112, 25, -79, -123, -100, 44);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)I")
    public static final int method1664(int arg0, byte arg1) {
        field3457++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 >= -88) {
                method1663((class427) null, -124);
            }
            return class257.method1672(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1665(int arg0) {
        field3462 = null;
        field3460 = null;
        if (arg0 == 3) {
            field3459 = null;
            field3452 = null;
            field3458 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    public static final void method1666(byte arg0, int arg1) {
        if (arg0 < 78) {
            method1663((class427) null, 10);
        }
        class150.field2298 = arg1;
        field3453++;
        class410 var2 = class418.field5861;
        synchronized (class418.field5861) {
            class418.field5861.method2533(0);
        }
        class410 var3 = class373.field5245;
        synchronized (class373.field5245) {
            class373.field5245.method2533(0);
        }
    }
}
