import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class29 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lpj;")
    public static class284 field531 = new class284();

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
    public static boolean field536 = false;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "J")
    public long field534;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lpk;")
    public static class237 field540;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lbg;")
    public class264 field533;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIILbg;IZJ)Z")
    public static final boolean method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class264 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class166.field2451 == class134.field1963;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class117.field1761 || var24 >= class137.field1992) {
                    return false;
                }
                class201 var25 = class3.field40[arg0][var15][var24];
                if (var25 != null && var25.field3026 >= 5) {
                    return false;
                }
            }
        }
        class128 var16 = new class128();
        var16.field1880 = arg11;
        var16.field1878 = arg0;
        var16.field1883 = arg5;
        var16.field1873 = arg6;
        var16.field1884 = arg7;
        var16.field1874 = arg8;
        var16.field1881 = arg9;
        var16.field1882 = arg1;
        var16.field1870 = arg2;
        var16.field1879 = arg1 + arg3 - 1;
        var16.field1876 = arg2 + arg4 - 1;
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
                    if (class3.field40[var22][var17][var20] == null) {
                        class3.field40[var22][var17][var20] = new class201(var22, var17, var20);
                    }
                }
                class201 var23 = class3.field40[arg0][var17][var20];
                var23.field3037[var23.field3026] = var16;
                var23.field3020[var23.field3026] = var21;
                var23.field3036 |= var21;
                var23.field3026++;
                if (var13 && class114.field1738[var17][var20] != 0) {
                    var14 = class114.field1738[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class114.field1738[var18][var19] == 0) {
                        class114.field1738[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class236.field3633[class239.field3689++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method205(int arg0) {
        field540 = null;
        field531 = null;
        if (arg0 != 1024) {
            field537 = 54;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILkc;)V")
    public static final void method206(int arg0, class25 arg1) {
        field535++;
        int var2 = arg1.field495 - class120.field1794;
        int var3 = arg1.field404 * 128 + (arg1.method168(-105) * 64);
        int var4 = arg1.field428 * 128 + (arg1.method168(-111) * 64);
        arg1.field478 = 0;
        arg1.field455 += (var4 - arg1.field455) / var2;
        arg1.field425 += (var3 - arg1.field425) / var2;
        if (arg1.field481 == 0) {
            arg1.field484 = 1024;
        }
        if (arg0 <= 21) {
            field540 = null;
        }
        if (arg1.field481 == 1) {
            arg1.field484 = 1536;
        }
        if (arg1.field481 == 2) {
            arg1.field484 = 0;
        }
        if (arg1.field481 == 3) {
            arg1.field484 = 512;
        }
    }
}
