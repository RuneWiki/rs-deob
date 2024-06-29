import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class81 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[[I")
    public static int[][] field1045 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
    public static int[] field1040 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1047 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIILuc;I)Luc;", line = 5)
    public static final class201 method480(int arg0, int arg1, int arg2, int arg3, int arg4, class201 arg5, int arg6) {
        long var7 = (long) arg6;
        field1046++;
        class201 var9 = (class201) class270.field4255.method1239((byte) -66, var7);
        if (var9 == null) {
            class207 var10 = class207.method1414(class48.field582, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1407(64, 768, -50, -10, -50);
            class270.field4255.method1243(var9, var7, -29282);
        }
        if (arg0 != 768) {
            method482(-58, 72, -117, -15, 91);
        }
        int var11 = arg5.method728();
        int var12 = arg5.method721();
        int var13 = arg5.method718();
        int var14 = arg5.method696();
        class201 var15 = var9.method707(true, true, true);
        if (arg4 != 0) {
            var15.method698(arg4);
        }
        if (class250.field3787) {
            class108 var16 = (class108) var15;
            if (arg2 != class184.method1278(class138.field1940, -13660, arg1 + var13, arg3 - -var11) || arg2 != class184.method1278(class138.field1940, -13660, arg1 + var14, arg3 + var12)) {
                for (int var17 = 0; var17 < var16.field1442; var17++) {
                    var16.field1427[var17] += class184.method1278(class138.field1940, -13660, var16.field1450[var17] + arg1, var16.field1461[var17] - -arg3) - arg2;
                }
                var16.field1426.field3109 = false;
                var16.field1430.field2160 = false;
            }
        } else {
            class333 var18 = (class333) var15;
            if (class184.method1278(class138.field1940, arg0 ^ 0xFFFFC9A4, arg1 + var13, arg3 + var11) != arg2 || class184.method1278(class138.field1940, arg0 - 14428, arg1 + var14, arg3 + var12) != arg2) {
                for (int var19 = 0; var19 < var18.field5109; var19++) {
                    var18.field5091[var19] += class184.method1278(class138.field1940, -13660, var18.field5081[var19] + arg1, var18.field5099[var19] + arg3) - arg2;
                }
                var18.field5086 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 92)
    public static void method481(boolean arg0) {
        field1045 = (int[][]) null;
        if (arg0) {
            method481(true);
        }
        field1040 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)I", line = 104)
    public static final int method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -105) {
            return -81;
        }
        field1042++;
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg2) : arg4;
        int var7 = var5 >= 8 ? arg4 : arg3;
        return ((var5 & 0x1) == 0 ? var7 : -var7) + ((var5 & 0x2) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lp;I)V", line = 121)
    public static final void method483(class107 arg0, int arg1) {
        field1048++;
        int var2 = arg0.method643(-14205);
        class179.field2605 = new class74[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class179.field2605[var3] = new class74();
            class179.field2605[var3].field945 = arg0.method643(-14205);
            class179.field2605[var3].field946 = arg0.method653(0);
        }
        class254.field3858 = arg0.method643(arg1 ^ 0x5DE4);
        class85.field1089 = arg0.method643(-14205);
        class29.field367 = arg0.method643(-14205);
        class175.field2507 = new class163[class85.field1089 + 1 - class254.field3858];
        if (arg1 != -27289) {
            field1038 = 100;
        }
        for (int var4 = 0; var4 < class29.field367; var4++) {
            int var5 = arg0.method643(arg1 ^ 0x5DE4);
            class163 var6 = class175.field2507[var5] = new class163();
            var6.field2677 = arg0.method661(arg1 ^ 0x6A98);
            var6.field2676 = arg0.method676(true);
            var6.field2254 = var5 + class254.field3858;
            var6.field2248 = arg0.method653(0);
            var6.field2249 = arg0.method653(0);
        }
        class98.field1279 = arg0.method676(true);
        class192.field2764 = true;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V", line = 170)
    public static final void method484(boolean arg0) {
        field1039++;
        class97.field1267.method1241(126);
        if (arg0) {
            field1045 = (int[][]) ((int[][]) null);
        }
        class183.field2640.method1241(117);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V", line = 185)
    public static final void method485(long arg0, int arg1) {
        field1044++;
        if (arg1 != 1) {
            method481(false);
        }
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class262.method1882((byte) -95, arg0 - 1L);
            class262.method1882((byte) -120, 1L);
        } else {
            class262.method1882((byte) -112, arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 207)
    public static final void method486(int arg0, String arg1, int arg2) {
        field1049++;
        class96 var3 = class141.method935(arg0, arg2, 95);
        var3.method581((byte) -101);
        var3.field1249 = arg1;
    }
}
