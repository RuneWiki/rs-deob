import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class73 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field1430 = 128;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field1435 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    private int field1432 = 128;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
    public boolean field1445 = false;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    private int field1440 = 0;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public int field1448 = -1;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    private int field1450 = 0;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1449 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "[Ljb;")
    public static class256[] field1452;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[S")
    private short[] field1436;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[S")
    private short[] field1437;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[S")
    private short[] field1442;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[S")
    private short[] field1451;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILlh;I)V")
    private final void method517(int arg0, class249 arg1, int arg2) {
        field1429++;
        if (arg2 <= 77) {
            method520((class249) null, -50);
        }
        if (arg0 == 1) {
            this.field1433 = arg1.method1674(1355769544);
        } else if (arg0 == 2) {
            this.field1448 = arg1.method1674(1355769544);
        } else if (arg0 == 4) {
            this.field1430 = arg1.method1674(1355769544);
        } else if (arg0 == 5) {
            this.field1432 = arg1.method1674(1355769544);
        } else if (arg0 == 6) {
            this.field1435 = arg1.method1674(1355769544);
        } else if (arg0 == 7) {
            this.field1440 = arg1.method1677(-6677);
        } else if (arg0 == 8) {
            this.field1450 = arg1.method1677(-6677);
        } else if (arg0 == 9) {
            this.field1445 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1677(-6677);
            this.field1437 = new short[var6];
            this.field1442 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1442[var7] = (short) arg1.method1674(1355769544);
                this.field1437[var7] = (short) arg1.method1674(1355769544);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1677(-6677);
            this.field1451 = new short[var4];
            this.field1436 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1451[var5] = (short) arg1.method1674(1355769544);
                this.field1436[var5] = (short) arg1.method1674(1355769544);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static void method518(byte arg0) {
        field1449 = null;
        field1452 = null;
        int var1 = 90 % ((61 - arg0) / 59);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg5 && arg4 == arg7 && arg0 == arg8 && arg2 == arg9) {
            class103.method711(arg5, arg9, (byte) 126, arg0, arg6, arg4);
        } else {
            int var10 = arg5;
            int var11 = arg4;
            int var12 = arg5 * 3;
            int var13 = arg4 * 3;
            int var14 = arg7 * 3;
            int var15 = arg3 * 3;
            int var16 = arg8 * 3;
            int var17 = arg2 * 3;
            int var18 = arg0 + var15 - var16 - arg5;
            int var19 = arg9 + var14 - var17 - arg4;
            int var20 = var17 + var13 - var14 - var14;
            int var21 = var16 + var12 - var15 - var15;
            int var22 = var15 - var12;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var23 * var24;
                int var31 = var21 * var25;
                int var32 = var22 * var24;
                int var33 = (var28 + var32 + var31 >> 12) + arg5;
                int var34 = arg4 + (var27 + var29 + var30 >> 12);
                class103.method711(var10, var34, (byte) 87, var33, arg6, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        field1441++;
        if (arg1 >= -15) {
            method519(51, -81, -54, 36, 92, -32, 125, -18, -46, 118);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Llh;I)Ljf;")
    public static final class183 method520(class249 arg0, int arg1) {
        field1431++;
        class183 var2 = new class183();
        if (arg1 != -10) {
            field1452 = null;
        }
        var2.field3201 = arg0.method1674(arg1 ^ 0xAF30993E);
        var2.field3211 = class143.method987(var2.field3201, (byte) 111);
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public static int method521(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Llh;I)V")
    public final void method522(class249 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1677(-6677);
            if (var3 == 0) {
                field1444++;
                if (arg1 != -1) {
                    method520((class249) null, 120);
                    return;
                }
                return;
            }
            this.method517(var3, arg0, 84);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Ljh;")
    public final class262 method523(int arg0, int arg1) {
        if (arg1 != -10) {
            return null;
        }
        field1446++;
        class262 var3 = (class262) class94.field1806.method1617(14366, (long) this.field1443);
        if (var3 == null) {
            class118 var4 = class118.method789(class95.field1837, this.field1433, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1442 != null) {
                for (int var5 = 0; var5 < this.field1442.length; var5++) {
                    var4.method803(this.field1442[var5], this.field1437[var5]);
                }
            }
            if (this.field1451 != null) {
                for (int var6 = 0; var6 < this.field1451.length; var6++) {
                    var4.method784(this.field1451[var6], this.field1436[var6]);
                }
            }
            var3 = var4.method801(this.field1440 + 64, this.field1450 + 850, -30, -50, -30);
            class94.field1806.method1615(var3, arg1 + 123, (long) this.field1443);
        }
        class262 var7;
        if (this.field1448 == -1 || arg0 == -1) {
            var7 = var3.method1482(true, true);
        } else {
            var7 = class47.method335((byte) -36, this.field1448).method1419(var3, 8493, arg0);
        }
        if (this.field1430 != 128 || this.field1432 != 128) {
            var7.method1467(this.field1430, this.field1432, this.field1430);
        }
        if (this.field1435 != 0) {
            if (this.field1435 == 90) {
                var7.method1483();
            }
            if (this.field1435 == 180) {
                var7.method1479();
            }
            if (this.field1435 == 270) {
                var7.method1476();
            }
        }
        return var7;
    }
}
