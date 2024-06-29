import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class251 {

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lkd;")
    public static class296 field3885 = new class296(0, -1);

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Ldb;")
    public static class39 field3887 = new class39(16);

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3889 = 3353893;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3890 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3891 = 1;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)J")
    public static final long method1709(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3026; var4++) {
            class128 var5 = var3.field3037[var4];
            if ((var5.field1880 >> 29 & 0x3L) == 2L && var5.field1882 == arg1 && var5.field1870 == arg2) {
                return var5.field1880;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBII)I")
    public static final int method1710(int arg0, byte arg1, int arg2, int arg3) {
        field3886++;
        if (arg1 != 27) {
            field3890 = -53;
        }
        if (arg0 >= arg2) {
            return arg0 > arg3 ? arg3 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V")
    public static final void method1711(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class43.field771; var3++) {
            for (int var4 = 0; var4 < class117.field1761; var4++) {
                for (int var5 = 0; var5 < class137.field1992; var5++) {
                    class201 var6 = class3.field40[var3][var4][var5];
                    if (var6 != null) {
                        class176 var7 = var6.field3024;
                        if (var7 != null && var7.field2575.method1494()) {
                            class272.method1824(var7.field2575, var3, var4, var5, 1, 1);
                            if (var7.field2580 != null && var7.field2580.method1494()) {
                                class272.method1824(var7.field2580, var3, var4, var5, 1, 1);
                                var7.field2575.method1492(var7.field2580, 0, 0, 0, false);
                                var7.field2580 = var7.field2580.method1475(arg0, arg1, arg2);
                            }
                            var7.field2575 = var7.field2575.method1475(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3026; var8++) {
                            class128 var10 = var6.field3037[var8];
                            if (var10 != null && var10.field1874.method1494()) {
                                class272.method1824(var10.field1874, var3, var4, var5, var10.field1879 + 1 - var10.field1882, var10.field1876 - var10.field1870 + 1);
                                var10.field1874 = var10.field1874.method1475(arg0, arg1, arg2);
                            }
                        }
                        class29 var9 = var6.field3033;
                        if (var9 != null && var9.field533.method1494()) {
                            class173.method1156(var9.field533, var3, var4, var5);
                            var9.field533 = var9.field533.method1475(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        if (arg0 != 58) {
            method1711(-66, 17, -15);
        }
        field3885 = null;
        field3887 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1713(String arg0, int arg1, boolean arg2) {
        field3884++;
        String var3 = class186.method1211(3, class143.method972(arg0, 2));
        boolean var4 = arg2;
        for (int var5 = 0; var5 < class266.field4155; var5++) {
            class224 var6 = class166.field2438[class205.field3068[var5]];
            if (var6 != null && var6.field3488 != null && var6.field3488.equalsIgnoreCase(var3)) {
                if (arg1 == 1) {
                    class59.field964.method1540(27, (byte) -2);
                    class59.field964.method437(true, 0);
                    class59.field964.method431(true, class205.field3068[var5]);
                    class181.field2631++;
                } else if (arg1 == 4) {
                    class83.field1277++;
                    class59.field964.method1540(58, (byte) -2);
                    class59.field964.method437(true, 0);
                    class59.field964.method431(!arg2, class205.field3068[var5]);
                } else if (arg1 == 5) {
                    class254.field3922++;
                    class59.field964.method1540(1, (byte) -2);
                    class59.field964.method445((byte) -95, class205.field3068[var5]);
                    class59.field964.method402(-6680, 0);
                } else if (arg1 == 6) {
                    class59.field964.method1540(161, (byte) -2);
                    class112.field1718++;
                    class59.field964.method437(true, 0);
                    class59.field964.method445((byte) -83, class205.field3068[var5]);
                } else if (arg1 == 7) {
                    class126.field1860++;
                    class59.field964.method1540(251, (byte) -2);
                    class59.field964.method428(class205.field3068[var5], (byte) 46);
                    class59.field964.method438(-123, 0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class260.method1759(0, "", 128, class194.field2929 + var3);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1714(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg2;
            arg2 = var7;
        }
        field3883++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 7 + 1 - arg3 - arg1;
        } else if (arg5 > -17) {
            return -12;
        } else if (var8 == 2) {
            return 8 - arg2 - arg0;
        } else {
            return arg3;
        }
    }
}
