import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class100 {

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "Lje;")
    private class367 field1395 = new class367();

    @OriginalMember(owner = "client!lfa", name = "t", descriptor = "Lje;")
    private class367 field1407 = new class367();

    @OriginalMember(owner = "client!lfa", name = "u", descriptor = "Lje;")
    private class367 field1408 = new class367();

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "Lje;")
    private class367 field1409 = new class367();

    @OriginalMember(owner = "client!lfa", name = "y", descriptor = "Lac;")
    private class501 field1412 = new class501(4);

    @OriginalMember(owner = "client!lfa", name = "C", descriptor = "B")
    private byte field1416 = 0;

    @OriginalMember(owner = "client!lfa", name = "D", descriptor = "I")
    public volatile int field1417 = 0;

    @OriginalMember(owner = "client!lfa", name = "B", descriptor = "I")
    public volatile int field1415 = 0;

    @OriginalMember(owner = "client!lfa", name = "A", descriptor = "Lac;")
    private class501 field1414 = new class501(8);

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1389 = 0;

    @OriginalMember(owner = "client!lfa", name = "s", descriptor = "[I")
    public static int[] field1406 = new int[5];

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!lfa", name = "r", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!lfa", name = "x", descriptor = "J")
    private long field1411;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "Lov;")
    public static class171 field1401;

    @OriginalMember(owner = "client!lfa", name = "E", descriptor = "Lqb;")
    private class205 field1418;

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "Lwo;")
    private class691 field1413;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Z")
    public final boolean method721(int arg0) {
        field1390++;
        if (this.field1413 != null) {
            long var2 = class577.method3295((byte) 15);
            int var4 = (int) (var2 - this.field1411);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1411 = var2;
            this.field1410 += var4;
            if (this.field1410 > 30000) {
                try {
                    this.field1413.method3893((byte) -125);
                } catch (Exception var27) {
                }
                this.field1413 = null;
            }
        }
        if (this.field1413 == null) {
            return this.method733(9670) == 0 && this.method726(100) == 0;
        }
        try {
            this.field1413.method3889(1);
            class205 var5 = (class205) this.field1395.method2126(-1);
            if (arg0 >= -78) {
                return true;
            }
            while (var5 != null) {
                this.field1412.field6892 = 0;
                this.field1412.method2817(1, true);
                this.field1412.method2832(14255, (int) var5.field8154);
                this.field1413.method3891(this.field1412.field6855, 0, 79, 4);
                this.field1407.method2123(var5, -1);
                var5 = (class205) this.field1395.method2117(100);
            }
            for (class205 var6 = (class205) this.field1408.method2126(-1); var6 != null; var6 = (class205) this.field1408.method2117(100)) {
                this.field1412.field6892 = 0;
                this.field1412.method2817(0, true);
                this.field1412.method2832(14255, (int) var6.field8154);
                this.field1413.method3891(this.field1412.field6855, 0, 120, 4);
                this.field1409.method2123(var6, -1);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1413.method3894(3);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1410 = 0;
                byte var9 = 0;
                if (this.field1418 == null) {
                    var9 = 8;
                } else if (this.field1418.field2868 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1414.field6892;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field1413.method3892(this.field1414.field6855, 2656, var10, this.field1414.field6892);
                    if (this.field1416 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1414.field6855[this.field1414.field6892 + var11] = (byte) class324.method1944(this.field1414.field6855[this.field1414.field6892 + var11], this.field1416);
                        }
                    }
                    this.field1414.field6892 += var10;
                    if (var9 <= this.field1414.field6892) {
                        if (this.field1418 == null) {
                            this.field1414.field6892 = 0;
                            int var12 = this.field1414.method2874((byte) -75);
                            int var13 = this.field1414.method2845(-1);
                            int var14 = this.field1414.method2874((byte) -75);
                            int var15 = this.field1414.method2840(false);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class205 var21;
                            if (var17) {
                                for (var21 = (class205) this.field1409.method2126(-1); var21 != null && var21.field8154 != var18; var21 = (class205) this.field1409.method2117(100)) {
                                }
                            } else {
                                for (var21 = (class205) this.field1407.method2126(-1); var21 != null && var21.field8154 != var18; var21 = (class205) this.field1407.method2117(100)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field1418 = var21;
                            this.field1418.field2870 = new class501(var15 + this.field1418.field2867 + var22);
                            this.field1418.field2870.method2817(var16, true);
                            this.field1418.field2870.method2836(var15, -22164);
                            this.field1414.field6892 = 0;
                            this.field1418.field2868 = 8;
                        } else if (this.field1418.field2868 != 0) {
                            throw new IOException();
                        } else if (this.field1414.field6855[0] == -1) {
                            this.field1414.field6892 = 0;
                            this.field1418.field2868 = 1;
                        } else {
                            this.field1418 = null;
                        }
                    }
                } else {
                    int var23 = this.field1418.field2870.field6855.length - this.field1418.field2867;
                    int var24 = 512 - this.field1418.field2868;
                    if (var23 - this.field1418.field2870.field6892 < var24) {
                        var24 = var23 - this.field1418.field2870.field6892;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field1413.method3892(this.field1418.field2870.field6855, 2656, var24, this.field1418.field2870.field6892);
                    if (this.field1416 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1418.field2870.field6855[this.field1418.field2870.field6892 + var25] = (byte) class324.method1944(this.field1418.field2870.field6855[this.field1418.field2870.field6892 + var25], this.field1416);
                        }
                    }
                    this.field1418.field2870.field6892 += var24;
                    this.field1418.field2868 += var24;
                    if (this.field1418.field2870.field6892 == var23) {
                        this.field1418.method3301(73);
                        this.field1418.field8762 = false;
                        this.field1418 = null;
                    } else if (this.field1418.field2868 == 512) {
                        this.field1418.field2868 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1413.method3893((byte) -123);
            } catch (Exception var26) {
            }
            this.field1415 = -2;
            this.field1413 = null;
            this.field1417++;
            return this.method733(9670) == 0 && this.method726(91) == 0;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
    private final void method722(int arg0) {
        if (arg0 >= -42) {
            this.field1409 = null;
        }
        field1388++;
        if (this.field1413 == null) {
            return;
        }
        try {
            this.field1412.field6892 = 0;
            this.field1412.method2817(6, true);
            this.field1412.method2832(14255, 3);
            this.field1413.method3891(this.field1412.field6855, 0, 120, 4);
        } catch (IOException var3) {
            try {
                this.field1413.method3893((byte) -123);
            } catch (Exception var2) {
            }
            this.field1413 = null;
            this.field1417++;
            this.field1415 = -2;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        field1392++;
        int var2 = -108 / ((arg0 + 64) / 41);
        return this.method726(102) >= 20;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)V")
    public final void method724(boolean arg0) {
        if (arg0) {
            field1402++;
            if (this.field1413 != null) {
                this.field1413.method3893((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(Z)V")
    public final void method725(boolean arg0) {
        field1396++;
        if (this.field1413 == null) {
            return;
        }
        try {
            this.field1412.field6892 = 0;
            this.field1412.method2817(7, arg0);
            if (!arg0) {
                this.method723(42);
            }
            this.field1412.method2832(14255, 0);
            this.field1413.method3891(this.field1412.field6855, 0, 112, 4);
        } catch (IOException var3) {
            try {
                this.field1413.method3893((byte) -122);
            } catch (Exception var2) {
            }
            this.field1415 = -2;
            this.field1413 = null;
            this.field1417++;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)I")
    private final int method726(int arg0) {
        field1405++;
        if (arg0 < 88) {
            method736(true);
        }
        return this.field1408.method2128(true) + this.field1409.method2128(true);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BZ)V")
    public final void method727(byte arg0, boolean arg1) {
        field1399++;
        if (this.field1413 == null) {
            return;
        }
        try {
            this.field1412.field6892 = 0;
            this.field1412.method2817(arg1 ? 2 : 3, true);
            if (arg0 < 25) {
                this.method733(-23);
            }
            this.field1412.method2832(14255, 0);
            this.field1413.method3891(this.field1412.field6855, 0, 87, 4);
        } catch (IOException var4) {
            try {
                this.field1413.method3893((byte) -122);
            } catch (Exception var3) {
            }
            this.field1417++;
            this.field1415 = -2;
            this.field1413 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)I")
    public static final int method728(byte arg0) {
        field1404++;
        if (arg0 != -75) {
            field1406 = null;
        }
        return class208.field2928;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZIBI)Lqb;")
    public final class205 method729(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field1398++;
        if (arg0 != 203266800) {
            return null;
        }
        long var6 = (long) ((arg2 << 16) + arg4);
        class205 var8 = new class205();
        var8.field8154 = var6;
        var8.field8763 = arg1;
        var8.field2867 = arg3;
        if (arg1) {
            if (this.method733(9670) >= 20) {
                throw new RuntimeException();
            }
            this.field1395.method2123(var8, -1);
        } else if (this.method726(94) < 20) {
            this.field1408.method2123(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)Z")
    public final boolean method730(byte arg0) {
        field1393++;
        if (arg0 > -41) {
            return false;
        } else {
            return this.method733(9670) >= 20;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1403++;
        int var7 = class528.field7160;
        int[] var8 = class439.field6091;
        class114.field1579 = 0;
        for (int var9 = 0; var9 < class698.field9912 + var7; var9++) {
            class568 var32 = null;
            class124 var33;
            if (var7 <= var9) {
                var33 = ((class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var9 - var7])).field5552;
                var32 = ((class61) var33).field674;
                if (var32.field8079 != null) {
                    var32 = var32.method3259((byte) 99, class578.field8156);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class671.field9407[var8[var9]];
            }
            if (var33.field1787 >= 0 && (class241.field3299 == var33.field1747 || class143.field2063.field4053 == var33.field4053)) {
                class81.method632(var33.method510((byte) -17), arg3 >> 1, arg4, var33, (byte) 96, arg0, arg1 >> 1);
                if (class431.field6023[0] >= 0) {
                    if (var33.field1709 != null && (var9 >= var7 || class152.field2221 == 0 || class152.field2221 == 3 || class152.field2221 == 1 && class549.method3086(((class677) var33).field9693, (byte) -63)) && class538.field7268 > class114.field1579) {
                        class538.field7275[class114.field1579] = class377.field5030.method1736(17046, var33.field1709) / 2;
                        class538.field7261[class114.field1579] = class431.field6023[0];
                        class538.field7266[class114.field1579] = class431.field6023[1];
                        class538.field7262[class114.field1579] = var33.field1757;
                        class538.field7265[class114.field1579] = var33.field1723;
                        class538.field7276[class114.field1579] = var33.field1755;
                        class538.field7269[class114.field1579] = var33.field1709;
                        class114.field1579++;
                    }
                    int var34 = class431.field6023[1] + arg5;
                    int var45;
                    if (var33.field1764 || var33.field1712 <= class186.field2697) {
                        var45 = var34 - Math.max(class377.field5030.field3859, class636.field8803[0].method1653());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var9 >= var7) {
                            var37 = var32.field8062;
                            if (var37 == -1) {
                                var37 = var33.method895(-25227).field896;
                            }
                        } else {
                            class677 var38 = class671.field9407[var8[var9]];
                            var37 = var33.method895(-25227).field896;
                            if (var38.field9660) {
                                var36 = 2;
                            }
                        }
                        class702[] var39 = class636.field8803;
                        if (var37 != -1) {
                            class702[] var40 = (class702[]) class4.field33.method3747((byte) -66, (long) var37);
                            if (var40 == null) {
                                class168[] var41 = class168.method1186(class508.field6961, var37, 0);
                                if (var41 != null) {
                                    var40 = new class702[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class334.field4506.method146(var41[var42], true);
                                    }
                                    class4.field33.method3748((long) var37, var40, 12537);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class702 var43 = var39[0];
                        class702 var44 = var39[var36];
                        var45 = var34 - Math.max(class377.field5030.field3859, var43.method1653());
                        int var46 = class431.field6023[0] + arg2 - (var43.method1658() >> 1);
                        int var47 = var43.method1658() * var33.field1705 / 255;
                        if (var33.field1705 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method3927(var46, var45);
                        class334.field4506.method123(var46, var45, var46 + var47, var45 + var43.method1653());
                        var44.method3927(var46, var45);
                        class334.field4506.method200(arg2, arg5, arg2 + arg3, arg1 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field1764) {
                        if (class186.field2697 < var33.field1713) {
                            class702 var48 = class181.field2624[var33.field1754 ? 2 : 0];
                            class702 var49 = class181.field2624[var33.field1754 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class61) {
                                var51 = var32.field8050;
                                if (var51 == -1) {
                                    var51 = var33.method895(-25227).field907;
                                }
                            } else {
                                var51 = var33.method895(-25227).field907;
                            }
                            if (var51 != -1) {
                                class702[] var52 = (class702[]) class178.field2582.method3747((byte) -66, (long) var51);
                                if (var52 == null) {
                                    class168[] var53 = class168.method1186(class508.field6961, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class702[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class334.field4506.method146(var53[var54], true);
                                        }
                                        class178.field2582.method3748((long) var51, var52, 12537);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field1754 ? 2 : 0];
                                    var49 = var52[var33.field1754 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field1713 - class186.field2697;
                            int var56;
                            if (var55 <= var33.field1767) {
                                var56 = var48.method1658();
                            } else {
                                int var57 = var55 - var33.field1767;
                                int var58 = var33.field1708 == 0 ? 0 : (var33.field1727 - var57) / var33.field1708 * var33.field1708;
                                var56 = var48.method1658() * var58 / var33.field1727;
                            }
                            int var59 = var48.method1653();
                            var45 -= var59;
                            int var60 = class431.field6023[0] + arg2 - (var48.method1658() >> 1);
                            var48.method3927(var60, var45);
                            class334.field4506.method123(var60, var45, var56 + var60, var45 + var59);
                            var49.method3927(var60, var45);
                            var45 -= 2;
                            class334.field4506.method200(arg2, arg5, arg2 + arg3, arg1 + arg5);
                        }
                        if (var9 < var7) {
                            class677 var61 = (class677) var33;
                            if (var61.field9690 != -1) {
                                var45 -= 25;
                                class606.field8426[var61.field9690].method3927(class431.field6023[0] + arg2 - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field9662 != -1) {
                                var45 -= 25;
                                class664.field9316[var61.field9662].method3927(class431.field6023[0] + arg2 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field8078 >= 0 && class664.field9316.length > var32.field8078) {
                            var45 -= 25;
                            class702 var62 = class664.field9316[var32.field8078];
                            var62.method3927(class431.field6023[0] + (arg2 - (var62.method1658() >> 1)), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class677) {
                        int var69 = 0;
                        class372[] var70 = class309.field4278;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class372 var76 = var70[var71];
                            if (var76 != null && var76.field5001 == 1 && class636.field8790[var9 - var7] == var76.field5009) {
                                class702 var77 = class671.field9409[var76.field5010];
                                if (var69 < var77.method1653()) {
                                    var69 = var77.method1653();
                                }
                                if (class186.field2697 % 20 < 10) {
                                    var77.method3927(class431.field6023[0] + arg2 - 12, -var77.method1653() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class372[] var64 = class309.field4278;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class372 var67 = var64[var65];
                            if (var67 != null && var67.field5001 == 10 && var8[var9] == var67.field5009) {
                                class702 var68 = class671.field9409[var67.field5010];
                                if (var63 < var68.method1653()) {
                                    var63 = var68.method1653();
                                }
                                var68.method3927(class431.field6023[0] + arg2 - 12, var45 - var68.method1653());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class186.field2697 < var33.field1741[var73]) {
                            int var74 = var33.method510((byte) -17) / 2;
                            class81.method632(var74, arg3 >> 1, arg4, var33, (byte) 107, arg0, arg1 >> 1);
                            if (class431.field6023[0] > -1) {
                                int var75 = class636.field8814[var33.field1737[var73]].method1658();
                                if (var73 == 1) {
                                    class431.field6023[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class431.field6023[1] -= 10;
                                    class431.field6023[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class431.field6023[0] += var75 - 9;
                                    class431.field6023[1] -= 10;
                                }
                                class636.field8814[var33.field1737[var73]].method3927(arg2 + class431.field6023[0] - (var75 >> 1), arg5 + -12 - -class431.field6023[1]);
                                class499.field6781.method2418(false, 0, Integer.toString(var33.field1771[var73]), class431.field6023[1] + arg5 + 3, -1, class431.field6023[0] + -1 + arg2);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class574.field8119; var10++) {
            int var28 = class340.field4556[var10];
            class124 var29;
            if (var28 >= 2048) {
                var29 = ((class393) class299.field4071.method970((byte) 89, (long) (var28 - 2048))).field5552;
            } else {
                var29 = class671.field9407[var28];
            }
            int var30 = class131.field1888[var10];
            class124 var31;
            if (var30 < 2048) {
                var31 = class671.field9407[var30];
            } else {
                var31 = ((class393) class299.field4071.method970((byte) 89, (long) (var30 - 2048))).field5552;
            }
            class676.method3832(arg1, --var29.field1696, arg2, arg0, arg5, 16777215, arg3, var31, arg4, var29);
        }
        if (arg6) {
            method736(false);
        }
        int var11 = class377.field5030.field3874 + class377.field5030.field3859 + 2;
        for (int var12 = 0; var12 < class114.field1579; var12++) {
            int var13 = class538.field7261[var12];
            int var14 = class538.field7266[var12];
            int var15 = class538.field7275[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class538.field7266[var27] - var11) < (var14 + 2) && (class538.field7266[var27] + 2) > (var14 - var11) && class538.field7275[var27] + class538.field7261[var27] > var13 - var15 && (var13 + var15) > (class538.field7261[var27] - class538.field7275[var27]) && var14 > class538.field7266[var27] - var11) {
                        var14 = class538.field7266[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class538.field7266[var12] = var14;
            String var17 = class538.field7269[var12];
            if (class205.field2871 == 0) {
                int var18 = 16776960;
                if (class538.field7262[var12] < 6) {
                    var18 = class623.field8651[class538.field7262[var12]];
                }
                if (class538.field7262[var12] == 6) {
                    var18 = class241.field3299 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class538.field7262[var12] == 7) {
                    var18 = class241.field3299 % 20 >= 10 ? 65535 : 255;
                }
                if (class538.field7262[var12] == 8) {
                    var18 = class241.field3299 % 20 < 10 ? 45056 : 8454016;
                }
                if (class538.field7262[var12] == 9) {
                    int var19 = 150 - class538.field7276[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class538.field7262[var12] == 10) {
                    int var20 = 150 - class538.field7276[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = -(-(var20 * 327680) - 255) - ((var20 + -100) * 5) - 32768000;
                    }
                }
                if (class538.field7262[var12] == 11) {
                    int var21 = 150 - class538.field7276[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class538.field7265[var12] == 0) {
                    class428.field5986.method2418(false, -16777216, var17, arg5 + var14, var22, arg2 + var13);
                }
                if (class538.field7265[var12] == 1) {
                    class428.field5986.method2422(var22, -16777216, arg2 + var13, var17, arg5 + var14, 42, class241.field3299);
                }
                if (class538.field7265[var12] == 2) {
                    class428.field5986.method2425(var17, -1, class241.field3299, arg2 + var13, var22, -16777216, arg5 + var14);
                }
                if (class538.field7265[var12] == 3) {
                    class428.field5986.method2412(arg2 + var13, true, 150 - class538.field7276[var12], class241.field3299, var17, arg5 + var14, var22, -16777216);
                }
                if (class538.field7265[var12] == 4) {
                    int var23 = (150 - class538.field7276[var12]) * (class377.field5030.method1736(17046, var17) + 100) / 150;
                    class334.field4506.method123(arg2 + var13 - 50, arg5, arg2 - (-var13 - 50), arg1 + arg5);
                    class428.field5986.method2423(var17, var13 + arg2 + 50 - var23, false, var22, arg5 + var14, -16777216);
                    class334.field4506.method200(arg2, arg5, arg2 + arg3, arg5 - -arg1);
                }
                if (class538.field7265[var12] == 5) {
                    int var24 = 150 - class538.field7276[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class377.field5030.field3874 + class377.field5030.field3859;
                    class334.field4506.method123(arg2, arg5 + var14 - var26 - 1, arg2 + arg3, arg5 + var14 + 5);
                    class428.field5986.method2418(arg6, -16777216, var17, arg5 + var14 + var25, var22, arg2 + var13);
                    class334.field4506.method200(arg2, arg5, arg2 + arg3, arg1 + arg5);
                }
            } else {
                class428.field5986.method2418(false, -16777216, var17, arg5 + var14, -256, arg2 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
    public final void method732(int arg0) {
        try {
            this.field1413.method3893((byte) -124);
            if (arg0 >= -110) {
                field1401 = null;
            }
        } catch (Exception var2) {
        }
        field1391++;
        this.field1416 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1415 = -1;
        this.field1417++;
        this.field1413 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "(I)I")
    public final int method733(int arg0) {
        field1400++;
        return arg0 == 9670 ? this.field1395.method2128(true) + this.field1407.method2128(true) : 35;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZZLwo;)V")
    public final void method734(boolean arg0, boolean arg1, class691 arg2) {
        field1394++;
        if (this.field1413 != null) {
            try {
                this.field1413.method3893((byte) -128);
            } catch (Exception var8) {
            }
            this.field1413 = null;
        }
        this.field1413 = arg2;
        this.method722(-82);
        this.method727((byte) 96, arg0);
        this.field1418 = null;
        this.field1414.field6892 = 0;
        while (true) {
            class205 var4 = (class205) this.field1407.method2116(4);
            if (var4 == null) {
                if (arg1) {
                    this.method732(92);
                }
                while (true) {
                    class205 var5 = (class205) this.field1409.method2116(4);
                    if (var5 == null) {
                        if (this.field1416 != 0) {
                            try {
                                this.field1412.field6892 = 0;
                                this.field1412.method2817(4, true);
                                this.field1412.method2817(this.field1416, true);
                                this.field1412.method2837(0, -2);
                                this.field1413.method3891(this.field1412.field6855, 0, 83, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field1413.method3893((byte) -127);
                                } catch (Exception var6) {
                                }
                                this.field1415 = -2;
                                this.field1413 = null;
                                this.field1417++;
                            }
                        }
                        this.field1410 = 0;
                        this.field1411 = class577.method3295((byte) 15);
                        return;
                    }
                    this.field1408.method2123(var5, -1);
                }
            }
            this.field1395.method2123(var4, -1);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)V")
    public final void method735(int arg0) {
        int var2 = -120 / ((-arg0 - 4) / 35);
        if (this.field1413 != null) {
            this.field1413.method3888(-53);
        }
        field1397++;
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(Z)V")
    public static void method736(boolean arg0) {
        if (arg0) {
            method728((byte) 39);
        }
        field1401 = null;
        field1406 = null;
    }
}
