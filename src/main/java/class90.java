import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class90 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field1434 = 0;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1438 = "Loading sprites - ";

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    public static int[] field1437;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIILvg;I)V", line = 15)
    public static final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, class303 arg5, int arg6) {
        field1435++;
        long var7 = 0L;
        if (arg3 < 118) {
            return;
        }
        if (arg0 == 0) {
            var7 = class10.method78(arg2, arg1, arg6);
        } else if (arg0 == 1) {
            var7 = class214.method1505(arg2, arg1, arg6);
        } else if (arg0 == 2) {
            var7 = class176.method1259(arg2, arg1, arg6);
        } else if (arg0 == 3) {
            var7 = class263.method1796(arg2, arg1, arg6);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        class85 var12 = class201.method1431(-99, var10);
        int var13 = (int) var7 >> 20 & 0x3;
        boolean var14 = false;
        int var15 = ((int) var7 & 0x7DD25) >> 14;
        if (var12.method609(-118)) {
            class312.method2120(var12, arg6, true, arg2, arg1);
        }
        if (var7 == 0L) {
            return;
        }
        class253 var16 = null;
        class253 var17 = null;
        if (arg0 == 0) {
            class103 var18 = class201.method1430(arg2, arg1, arg6);
            if (var18 != null) {
                var17 = var18.field1600;
                var16 = var18.field1598;
            }
            if (var12.field1337 != 0) {
                arg5.method2066(var13, var12.field1368, 32, var15, !var12.field1348, arg6, arg1);
            }
        } else if (arg0 == 1) {
            class228 var19 = class214.method1506(arg2, arg1, arg6);
            if (var19 != null) {
                var17 = var19.field3628;
                var16 = var19.field3623;
            }
        } else if (arg0 == 2) {
            class26 var20 = class185.method1328(arg2, arg1, arg6);
            if (var20 != null) {
                var16 = var20.field406;
            }
            if (var12.field1337 != 0 && (var12.field1390 + arg1) < 104 && var12.field1390 + arg6 < 104 && var12.field1385 + arg1 < 104 && arg6 + var12.field1385 < 104) {
                arg5.method2065(var12.field1390, (byte) 113, var12.field1368, var12.field1385, var13, arg1, !var12.field1348, arg6);
            }
        } else if (arg0 == 3) {
            class279 var21 = class223.method1583(arg2, arg1, arg6);
            if (var21 != null) {
                var16 = var21.field4297;
            }
            if (var12.field1337 == 1) {
                arg5.method2070(true, arg1, arg6);
            }
        }
        if (var12.field1375 != null) {
            var12 = var12.method598((byte) -80);
        }
        if (!class94.field1516 || var12 == null || !var12.field1344) {
            return;
        }
        if (var15 == 2) {
            if ((var16 instanceof class233)) {
                ((class233) var16).method1644(-32138);
            } else {
                class50.method427(var15, 0, 104, 0, arg4, var12, var13 + 4, arg6, arg1);
            }
            if (var17 instanceof class233) {
                ((class233) var17).method1644(-32138);
            } else {
                class50.method427(var15, 0, 104, 0, arg4, var12, var13 + 1 & 0x3, arg6, arg1);
            }
        } else if (var15 == 5) {
            if (var16 instanceof class233) {
                ((class233) var16).method1644(-32138);
            } else {
                class50.method427(4, class338.field5286[var13] * 8, 104, class61.field981[var13] * 8, arg4, var12, var13, arg6, arg1);
            }
        } else if (var15 == 6) {
            if ((var16 instanceof class233)) {
                ((class233) var16).method1644(-32138);
            } else {
                class50.method427(4, class111.field1732[var13] * 8, 104, class239.field3810[var13] * 8, arg4, var12, var13 + 4, arg6, arg1);
            }
        } else if (var15 == 7) {
            if ((var16 instanceof class233)) {
                ((class233) var16).method1644(-32138);
            } else {
                class50.method427(4, 0, 104, 0, arg4, var12, (var13 + 2 & 0x3) + 4, arg6, arg1);
            }
        } else if (var15 == 8) {
            if ((var16 instanceof class233)) {
                ((class233) var16).method1644(-32138);
            } else {
                class50.method427(4, class111.field1732[var13] * 8, 104, class239.field3810[var13] * 8, arg4, var12, var13 + 4, arg6, arg1);
            }
            if (var17 instanceof class233) {
                ((class233) var17).method1644(-32138);
            } else {
                class50.method427(4, class111.field1732[var13] * 8, 104, class239.field3810[var13] * 8, arg4, var12, (var13 + 2 & 0x3) + 4, arg6, arg1);
            }
        } else if (var15 == 11) {
            if ((var16 instanceof class233)) {
                ((class233) var16).method1644(-32138);
            } else {
                class50.method427(10, 0, 104, 0, arg4, var12, var13 + 4, arg6, arg1);
            }
        } else if ((var16 instanceof class233)) {
            ((class233) var16).method1644(-32138);
        } else {
            class50.method427(var15, 0, 104, 0, arg4, var12, var13, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 214)
    public static void method650(int arg0) {
        field1437 = null;
        field1438 = null;
        int var1 = 112 % ((arg0 - 10) / 46);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V", line = 229)
    public static final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1441++;
        if (class321.method2189(arg0, (byte) 79)) {
            client.method396(class163.field2463[arg0], -1, arg5, arg1, arg3, arg6, arg4, arg7);
            if (arg2 > -35) {
                method650(99);
            }
        }
    }
}
