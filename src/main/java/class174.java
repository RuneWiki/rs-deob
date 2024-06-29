import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class174 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public static int[] field2825 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method1258(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class85.field1288; var3++) {
            class94 var4 = class99.field1555[var3];
            if (var4.field1490 == 1) {
                int var5 = var4.field1496 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1501 * var5 >> 8) + var4.field1488;
                    int var7 = (var4.field1498 * var5 >> 8) + var4.field1487;
                    int var8 = (var4.field1492 * var5 >> 8) + var4.field1500;
                    int var9 = (var4.field1502 * var5 >> 8) + var4.field1503;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1490 == 2) {
                int var10 = arg0 - var4.field1496;
                if (var10 > 0) {
                    int var11 = (var4.field1501 * var10 >> 8) + var4.field1488;
                    int var12 = (var4.field1498 * var10 >> 8) + var4.field1487;
                    int var13 = (var4.field1492 * var10 >> 8) + var4.field1500;
                    int var14 = (var4.field1502 * var10 >> 8) + var4.field1503;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1490 == 3) {
                int var15 = var4.field1488 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1508 * var15 >> 8) + var4.field1496;
                    int var17 = (var4.field1506 * var15 >> 8) + var4.field1489;
                    int var18 = (var4.field1492 * var15 >> 8) + var4.field1500;
                    int var19 = (var4.field1502 * var15 >> 8) + var4.field1503;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1490 == 4) {
                int var20 = arg2 - var4.field1488;
                if (var20 > 0) {
                    int var21 = (var4.field1508 * var20 >> 8) + var4.field1496;
                    int var22 = (var4.field1506 * var20 >> 8) + var4.field1489;
                    int var23 = (var4.field1492 * var20 >> 8) + var4.field1500;
                    int var24 = (var4.field1502 * var20 >> 8) + var4.field1503;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1490 == 5) {
                int var25 = arg1 - var4.field1500;
                if (var25 > 0) {
                    int var26 = (var4.field1508 * var25 >> 8) + var4.field1496;
                    int var27 = (var4.field1506 * var25 >> 8) + var4.field1489;
                    int var28 = (var4.field1501 * var25 >> 8) + var4.field1488;
                    int var29 = (var4.field1498 * var25 >> 8) + var4.field1487;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 232)
    public static void method1259(int arg0) {
        if (arg0 < 32) {
            method1259(24);
        }
        field2825 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V", line = 335)
    public static final void method1260(int arg0, int arg1, int arg2) {
        class90.method611();
        field2824++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class8.field98 = class135.method943(arg1, arg2, arg0, class51.field622, 0, 0);
        if (class8.field98 == null) {
            class78.method463(-1);
            return;
        }
        class17.field201 = arg2;
        class219.field3558 = arg1;
        class275.method1898(-97, class51.field622);
        class161.method1130(73, 0);
        class134.method941(71);
    }
}
