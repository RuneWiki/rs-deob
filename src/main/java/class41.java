import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lab;")
    public static class148 field607 = new class148();

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field612 = new String[500];

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Llc;")
    public static class86 field611 = new class86(64);

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[S")
    public static short[] field616 = new short[] { 14, 29, 30, 48, 4, 51, 18, 8 };

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Ljava/lang/String;")
    public static String field620 = "red:";

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[I")
    public static int[] field613 = new int[14];

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
    public static boolean field617 = true;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lhc;")
    public static class235 field619;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field615;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class30.field414 * arg3 + class177.field2483 * arg0 >> 16;
        int var6 = class177.field2483 * arg3 - class30.field414 * arg0 >> 16;
        int var7 = class228.field3464 * arg1 + class158.field2201 * var6 >> 16;
        int var8 = class158.field2201 * arg1 - class228.field3464 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class228.field3464 * arg2 + class158.field2201 * var6 >> 16;
        int var12 = class158.field2201 * arg2 - class228.field3464 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < field614 && var13 < field614) {
            return false;
        } else if (var9 > class252.field3849 && var13 > class252.field3849) {
            return false;
        } else if (var10 < class180.field2530 && var14 < class180.field2530) {
            return false;
        } else {
            return var10 <= class86.field1168 || var14 <= class86.field1168;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method271(int arg0) {
        field606++;
        for (int var1 = 0; var1 < class94.field1317; var1++) {
            class67 var2 = class151.method1013(true, var1);
            if (var2 != null && var2.field911 == 0) {
                class119.field1677[var1] = 0;
                class120.field1688[var1] = 0;
            }
        }
        class230.field3487 = new class4(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field609++;
        if (class93.field1294 <= arg3 && class296.field4668 >= arg3 && arg7 >= class93.field1294 && arg7 <= class296.field4668 && class93.field1294 <= arg2 && class296.field4668 >= arg2 && arg6 >= class93.field1294 && class296.field4668 >= arg6 && class273.field4228 <= arg8 && arg8 <= class127.field1782 && class273.field4228 <= arg1 && arg1 <= class127.field1782 && arg0 >= class273.field4228 && class127.field1782 >= arg0 && class273.field4228 <= arg5 && class127.field1782 >= arg5) {
            class297.method1987(arg3, arg6, arg0, arg5, arg7, arg1, arg9, arg8, arg2, 94);
        } else {
            class204.method1297(arg0, arg1, arg9, 128, arg5, arg6, arg7, arg3, arg2, arg8);
        }
        if (arg4 >= -6) {
            field620 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method273(int arg0, int arg1) {
        field608++;
        return field612[arg1].length() <= arg0 ? class285.field4468[arg1] : class285.field4468[arg1] + class119.field1675 + field612[arg1];
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static void method274(int arg0) {
        field615 = null;
        field616 = null;
        int var1 = -61 % ((arg0 - 38) / 33);
        field613 = null;
        field607 = null;
        field619 = null;
        field611 = null;
        field620 = null;
        field612 = null;
    }
}
