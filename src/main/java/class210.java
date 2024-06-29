import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class210 extends class200 {

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "Lle;")
    public class43 field3646;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "Loa;")
    public static class99 field3645 = class221.method1463(2844, "T");

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Loa;")
    private static class99 field3644 = class221.method1463(2844, "glow2:");

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "Loa;")
    public static class99 field3650 = field3644;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "Loa;")
    public static class99 field3648 = field3644;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "Loa;")
    private static class99 field3653 = class221.method1463(2844, "level: ");

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "Loa;")
    public static class99 field3652 = field3653;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Lq;")
    public static class126 field3649;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZBLud;)V")
    public static final void method1410(boolean arg0, byte arg1, class2 arg2) {
        field3647++;
        int var3 = (int) arg2.field2187;
        int var4 = arg2.field12;
        arg2.method828((byte) 125);
        if (arg0) {
            class183.method1253(var4, (byte) -121);
        }
        class220.method1462((byte) -106, var4);
        class107 var5 = class22.method131(var3, 1538872048);
        if (var5 != null) {
            class238.method1555(var5, 10555);
        }
        int var6 = class258.field4497;
        int var7 = -60 % ((19 - arg1) / 40);
        for (int var8 = 0; var8 < var6; var8++) {
            if (class53.method366(20, class258.field4502[var8])) {
                class67.method443(-32055, var8);
            }
        }
        if (class258.field4497 == 1) {
            class244.field4209 = false;
            class62.method408(class90.field1539, class217.field3769, 99, class284.field4938, class238.field4114);
        } else {
            class62.method408(class90.field1539, class217.field3769, 121, class284.field4938, class238.field4114);
            int var9 = class228.field3950.method480(class23.field333);
            for (int var10 = 0; var10 < class258.field4497; var10++) {
                int var11 = class228.field3950.method480(class165.method1111(var10, -1));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class238.field4114 = var9 + 8;
            class217.field3769 = class258.field4497 * 15 + 22;
        }
        if (class9.field75 != -1) {
            class220.method1460(1, (byte) 126, class9.field75);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIILuk;IZJ)Z")
    public static final boolean method1411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class98 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class64.field1079 == class189.field3337;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class253.field4372 || var24 >= class172.field3051) {
                    return false;
                }
                class216 var25 = class128.field2236[arg0][var15][var24];
                if (var25 != null && var25.field3748 >= 5) {
                    return false;
                }
            }
        }
        class77 var16 = new class77();
        var16.field1372 = arg11;
        var16.field1374 = arg0;
        var16.field1363 = arg5;
        var16.field1369 = arg6;
        var16.field1359 = arg7;
        var16.field1367 = arg8;
        var16.field1373 = arg9;
        var16.field1362 = arg1;
        var16.field1357 = arg2;
        var16.field1361 = arg1 + arg3 - 1;
        var16.field1371 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class128.field2236[var22][var17][var20] == null) {
                        class128.field2236[var22][var17][var20] = new class216(var22, var17, var20);
                    }
                }
                class216 var23 = class128.field2236[arg0][var17][var20];
                var23.field3743[var23.field3748] = var16;
                var23.field3755[var23.field3748] = var21;
                var23.field3753 |= var21;
                var23.field3748++;
                if (var13 && class60.field1002[var17][var20] != 0) {
                    var14 = class60.field1002[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class60.field1002[var18][var19] == 0) {
                        class60.field1002[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class242.field4198[class288.field5032++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILoa;B)V")
    public static final void method1412(int arg0, class99 arg1, byte arg2) {
        field3651++;
        class138.field2440++;
        class131.field2277.method966((byte) 49, 148);
        int var3 = 12 % ((5 - arg2) / 59);
        class131.field2277.method1696(arg0, (byte) 126);
        class131.field2277.method1718(-128, arg1.method697(-23666));
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lle;)V")
    public class210(class43 arg0) {
        this.field3646 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field3649 = null;
        field3644 = null;
        field3648 = null;
        field3650 = null;
        int var1 = 68 % ((-arg0 - 13) / 33);
        field3653 = null;
        field3652 = null;
        field3645 = null;
    }
}
