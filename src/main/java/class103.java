import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class103 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1509 = "Started 3d Library";

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1508 = 0;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1510 = -1;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1513 = " has logged in.";

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
    public static boolean field1507 = false;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "F")
    public static float field1502;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lgf;")
    public static class140 field1505;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Log;")
    public static class157 field1498;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Ljava/awt/Font;")
    public static Font field1506;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[I")
    public static int[] field1501;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILog;)Z", line = 25)
    public static final boolean method709(int arg0, class157 arg1) {
        field1503++;
        if (arg1.field2470 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2470.length; var2++) {
            int var3 = class44.method233(arg1, var2, (byte) 17);
            int var4 = arg1.field2538[var2];
            if (arg1.field2470[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2470[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2470[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        int var5 = 20 / ((arg0 + 50) / 61);
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 79)
    public static final void method710(int arg0) {
        field1499++;
        if (class5.field75 == 10 && class232.field3690) {
            class278.method2012(28, -95);
        }
        if (class5.field75 == 30) {
            class278.method2012(25, -43);
        }
        if (arg0 != -5) {
            method712(-40);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILog;ILbf;I)V", line = 99)
    public static final void method711(int arg0, int arg1, int arg2, class157 arg3, int arg4, class58 arg5, int arg6) {
        field1504++;
        if (arg5 == null) {
            return;
        }
        int var7 = (int) class330.field5090 + class69.field983 & arg1;
        int var8 = Math.max(arg3.field2468 / 2, arg3.field2520 / 2) + 10;
        int var9 = arg0 * arg0 + arg2 * arg2;
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class170.field2801[var7];
        int var11 = var10 * 256 / (class320.field4963 + 256);
        int var12 = class170.field2810[var7];
        int var13 = var12 * 256 / (class320.field4963 + 256);
        int var14 = arg2 * var11 + (arg0 * var13) >> 16;
        int var15 = arg2 * var13 - (arg0 * var11) >> 16;
        if (class232.field3690) {
            ((class314) arg5).method2205(arg3.field2468 / 2 + arg4 + var14 - (arg5.field813 / 2), arg3.field2520 / 2 + arg6 + -var15 + -(arg5.field817 / 2), (class314) arg3.method1130(-41, false));
        } else {
            ((class220) arg5).method1573(arg3.field2468 / 2 + arg4 + var14 - arg5.field813 / 2, arg3.field2520 / 2 + (arg6 - var15 - arg5.field817 / 2), arg3.field2502, arg3.field2582);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 140)
    public static void method712(int arg0) {
        field1498 = null;
        field1513 = null;
        field1501 = null;
        field1509 = null;
        field1505 = null;
        field1506 = null;
        int var1 = -124 % ((-arg0 - 1) / 46);
    }
}
