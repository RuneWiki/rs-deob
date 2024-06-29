import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class104 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Z")
    public boolean field1548 = false;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Z")
    public boolean field1563 = false;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
    public boolean field1550 = false;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
    public boolean field1565 = false;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public int field1566 = 2;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public int field1567 = -1;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public int field1570 = 5;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public int field1568 = 99;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public int field1574 = -1;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public int field1573 = -1;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public int field1561 = -1;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public int field1578 = -1;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "[[S")
    public static short[][] field1552 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lkr;")
    public static class524 field1562 = new class524(16);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lan;")
    public class20 field1571;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lfu;")
    public static class266 field1572;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
    public int[] field1551;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "[I")
    private int[] field1557;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "[I")
    public int[] field1575;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[Z")
    public boolean[] field1558;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "[[I")
    public int[][] field1560;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lsi;I)V")
    public final void method763(class391 arg0, int arg1) {
        if (arg1 != -1) {
            this.method770((byte) -66, -23, 72, 63, null, 31, 33, (byte) -2);
        }
        field1556++;
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                return;
            }
            this.method768(var3, (byte) 60, arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lt;IBIII)Lt;")
    public final class471 method764(class471 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1554++;
        int var7 = this.field1575[arg5];
        int var8 = this.field1551[arg5];
        class327 var9 = this.field1571.method128(var8 >> 16, -10423);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method381((byte) 1, arg1, true);
        }
        class327 var11 = null;
        if ((this.field1563 || class299.field4102) && arg4 != -1 && this.field1551.length > arg4) {
            int var12 = this.field1551[arg4];
            var11 = this.field1571.method128(var12 >> 16, -10423);
            arg4 = var12 & 0xFFFF;
        }
        class327 var13 = null;
        class327 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1557 != null) {
            if (arg5 < this.field1557.length) {
                var15 = this.field1557[arg5];
                if (var15 != 65535) {
                    var13 = this.field1571.method128(var15 >> 16, -10423);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1563 || class299.field4102) && arg4 != -1 && this.field1557.length > arg4) {
                var16 = this.field1557[arg4];
                if (var16 != 65535) {
                    var14 = this.field1571.method128(var16 >> 16, -10423);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1548) {
            arg1 |= 0x200;
        }
        if (var9.method1899(-1, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method1900((byte) -87, var10)) {
            arg1 |= 0x100;
        }
        int var17 = 83 / ((-arg2 - 31) / 37);
        if (var9.method1896(var10, (byte) 122)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1899(-1, var15)) {
                arg1 |= 0x80;
            }
            if (var13.method1900((byte) -87, var15)) {
                arg1 |= 0x100;
            }
            if (var13.method1896(var15, (byte) 122)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1899(-1, arg4)) {
                arg1 |= 0x80;
            }
            if (var11.method1900((byte) -87, arg4)) {
                arg1 |= 0x100;
            }
            if (var11.method1896(arg4, (byte) 122)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1899(-1, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method1900((byte) -87, var16)) {
                arg1 |= 0x100;
            }
            if (var14.method1896(var16, (byte) 122)) {
                arg1 |= 0x400;
            }
        }
        int var18 = arg1 | 0x20;
        class471 var19 = arg0.method381((byte) 1, var18, true);
        var19.method2777(var9, var7, this.field1548, var10, var11, arg4, 65535, arg3 - 1, 0);
        if (var13 != null) {
            var19.method2777(var13, var7, this.field1548, var15, var14, var16, 65535, arg3 - 1, 0);
        }
        return var19;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method765(String arg0, int arg1) {
        if (arg1 != 128) {
            field1562 = null;
        }
        field1555++;
        return class491.method2879(true, (byte) 95, 10, arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final void method766(byte arg0) {
        if (this.field1574 == -1) {
            if (this.field1558 == null) {
                this.field1574 = 0;
            } else {
                this.field1574 = 2;
            }
        }
        if (this.field1561 == -1) {
            if (this.field1558 == null) {
                this.field1561 = 0;
            } else {
                this.field1561 = 2;
            }
        }
        if (arg0 <= 70) {
            this.field1548 = false;
        }
        field1576++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        field1562 = null;
        if (arg0 != 1024) {
            field1572 = null;
        }
        field1552 = null;
        field1572 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLsi;)V")
    private final void method768(int arg0, byte arg1, class391 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method2353((byte) 71);
            this.field1575 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1575[var5] = arg2.method2353((byte) 82);
            }
            this.field1551 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1551[var6] = arg2.method2353((byte) 106);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1551[var7] = (arg2.method2353((byte) 119) << 16) + this.field1551[var7];
            }
        } else if (arg0 == 2) {
            this.field1567 = arg2.method2353((byte) 95);
        } else if (arg0 == 3) {
            this.field1558 = new boolean[256];
            int var8 = arg2.method2348(-2);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1558[arg2.method2348(-2)] = true;
            }
        } else if (arg0 == 4) {
            this.field1550 = true;
        } else if (arg0 == 5) {
            this.field1570 = arg2.method2348(-2);
        } else if (arg0 == 6) {
            this.field1578 = arg2.method2353((byte) 82);
        } else if (arg0 == 7) {
            this.field1573 = arg2.method2353((byte) 83);
        } else if (arg0 == 8) {
            this.field1568 = arg2.method2348(-2);
        } else if (arg0 == 9) {
            this.field1561 = arg2.method2348(-2);
        } else if (arg0 == 10) {
            this.field1574 = arg2.method2348(-2);
        } else if (arg0 == 11) {
            this.field1566 = arg2.method2348(-2);
        } else if (arg0 == 12) {
            int var10 = arg2.method2348(-2);
            this.field1557 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1557[var11] = arg2.method2353((byte) 77);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1557[var12] = (arg2.method2353((byte) 109) << 16) + this.field1557[var12];
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method2353((byte) 87);
            this.field1560 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method2348(-2);
                if (var15 > 0) {
                    this.field1560[var14] = new int[var15];
                    this.field1560[var14][0] = arg2.method2338(true);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field1560[var14][var16] = arg2.method2353((byte) 80);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1548 = true;
        } else if (arg0 == 15) {
            this.field1563 = true;
        } else if (arg0 == 16) {
            this.field1565 = true;
        }
        field1549++;
        if (arg1 <= 47) {
            this.method769(false, 4, 71, 126);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIII)I")
    public final int method769(boolean arg0, int arg1, int arg2, int arg3) {
        field1577++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1551[arg3];
        class327 var8 = null;
        class327 var9 = this.field1571.method128(var7 >> 16, -10423);
        int var10 = var7 & 0xFFFF;
        if (arg1 != 1024) {
            method767(-70);
        }
        if (var9 == null) {
            return var5;
        }
        if ((this.field1563 || class299.field4102) && arg2 != -1 && arg2 < this.field1551.length) {
            int var11 = this.field1551[arg2];
            var8 = this.field1571.method128(var11 >> 16, -10423);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1548) {
            var5 |= 0x200;
        }
        if (var9.method1899(-1, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1900((byte) -87, var10)) {
            var5 |= 0x100;
        }
        if (var9.method1896(var10, (byte) 122)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1899(arg1 ^ 0xFFFFFBFF, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1900((byte) -87, var6)) {
                var5 |= 0x100;
            }
            if (var8.method1896(var6, (byte) 122)) {
                var5 |= 0x400;
            }
        }
        if (this.field1557 != null && arg0) {
            if (arg3 < this.field1557.length) {
                int var12 = this.field1557[arg3];
                if (var12 != 65535) {
                    class327 var13 = this.field1571.method128(var12 >> 16, -10423);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1899(-1, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1900((byte) -87, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1896(var14, (byte) 122)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1563 || class299.field4102) && arg2 != -1 && arg2 < this.field1557.length) {
                int var15 = this.field1557[arg2];
                if (var15 != 65535) {
                    class327 var16 = this.field1571.method128(var15 >> 16, -10423);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1899(arg1 - 1025, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1900((byte) -87, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1896(var17, (byte) 122)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIIILt;IIB)Lt;")
    public final class471 method770(byte arg0, int arg1, int arg2, int arg3, class471 arg4, int arg5, int arg6, byte arg7) {
        field1559++;
        int var9 = this.field1575[arg5];
        int var10 = this.field1551[arg5];
        class327 var11 = this.field1571.method128(var10 >> 16, -10423);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method381(arg7, arg1, true);
        }
        class327 var13 = null;
        if ((this.field1563 || class299.field4102) && arg6 != -1 && this.field1551.length > arg6) {
            int var14 = this.field1551[arg6];
            var13 = this.field1571.method128(var14 >> 16, -10423);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field1548) {
            arg1 |= 0x200;
        }
        if (var11.method1899(-1, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method1900((byte) -87, var12)) {
            arg1 |= 0x100;
        }
        if (var11.method1896(var12, (byte) 122)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1899(-1, arg6)) {
                arg1 |= 0x80;
            }
            if (var13.method1900((byte) -87, arg6)) {
                arg1 |= 0x100;
            }
            if (var13.method1896(arg6, (byte) 122)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class471 var16 = arg4.method381(arg7, var15, true);
        if (arg0 > -87) {
            return null;
        } else {
            var16.method2777(var11, var9, this.field1548, var12, var13, arg6, 65535, arg2 - 1, arg3);
            return var16;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)I")
    public static final int method771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1569++;
        if (arg4 != 29922) {
            method767(-71);
        }
        if (class211.field2950 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg2 >> 7;
            int var7 = arg3 >> 7;
            if (arg1 < 0 || arg0 < 0 || arg1 > class527.field7799 - 1 || class422.field6182 - 1 < arg0) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class527.field7799 - 1 || var7 > (class422.field6182 - 1)) {
                return 0;
            }
            boolean var8 = (class267.field3700[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
            if ((arg2 & 0x7F) == 0) {
                boolean var9 = (class267.field3700[1][var6 - 1][arg3 >> 7] & 0x2) != 0;
                boolean var10 = (class267.field3700[1][var6][arg3 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class267.field3700[1][arg1][arg0] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x7F) == 0) {
                boolean var11 = (class267.field3700[1][arg2 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class267.field3700[1][arg2 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class267.field3700[1][arg1][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class211.field2950[arg5].method361(arg2, arg3);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[I[Ljava/lang/Object;BI)V")
    public static final void method772(int arg0, int[] arg1, Object[] arg2, byte arg3, int arg4) {
        if (arg3 != -105) {
            return;
        }
        field1564++;
        if (arg4 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg0; var10 < arg4; var10++) {
            if (var7 + (var10 & var9) > arg1[var10]) {
                int var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                Object var12 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var12;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg4] = arg2[var6];
        arg2[var6] = var8;
        method772(arg0, arg1, arg2, (byte) -105, var6 - 1);
        method772(var6 + 1, arg1, arg2, (byte) -105, arg4);
    }

    static {
        new class466("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
