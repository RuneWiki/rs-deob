import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class71 extends class50 {

    @OriginalMember(owner = "client!kc", name = "Ab", descriptor = "I")
    private int field1561 = 0;

    @OriginalMember(owner = "client!kc", name = "vb", descriptor = "I")
    private int field1556 = 0;

    @OriginalMember(owner = "client!kc", name = "Fb", descriptor = "Z")
    private boolean field1566 = false;

    @OriginalMember(owner = "client!kc", name = "Rb", descriptor = "B")
    private byte field1578 = 0;

    @OriginalMember(owner = "client!kc", name = "Tb", descriptor = "I")
    private int field1580 = 0;

    @OriginalMember(owner = "client!kc", name = "Jb", descriptor = "[I")
    private int[] field1570;

    @OriginalMember(owner = "client!kc", name = "Kb", descriptor = "[I")
    private int[] field1571;

    @OriginalMember(owner = "client!kc", name = "Yb", descriptor = "[I")
    private int[] field1585;

    @OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[I")
    private int[] field1562;

    @OriginalMember(owner = "client!kc", name = "ub", descriptor = "[I")
    private int[] field1555;

    @OriginalMember(owner = "client!kc", name = "Ib", descriptor = "[I")
    private int[] field1569;

    @OriginalMember(owner = "client!kc", name = "Cb", descriptor = "[I")
    private int[] field1563;

    @OriginalMember(owner = "client!kc", name = "yb", descriptor = "[I")
    private int[] field1559;

    @OriginalMember(owner = "client!kc", name = "Hb", descriptor = "[I")
    private int[] field1568;

    @OriginalMember(owner = "client!kc", name = "ac", descriptor = "[I")
    private int[] field1587;

    @OriginalMember(owner = "client!kc", name = "Db", descriptor = "[B")
    private byte[] field1564;

    @OriginalMember(owner = "client!kc", name = "bc", descriptor = "[B")
    private byte[] field1588;

    @OriginalMember(owner = "client!kc", name = "Sb", descriptor = "[B")
    private byte[] field1579;

    @OriginalMember(owner = "client!kc", name = "Nb", descriptor = "[B")
    private byte[] field1574;

    @OriginalMember(owner = "client!kc", name = "tb", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client!kc", name = "Mb", descriptor = "[S")
    private short[] field1573;

    @OriginalMember(owner = "client!kc", name = "Vb", descriptor = "[[I")
    private int[][] field1582;

    @OriginalMember(owner = "client!kc", name = "Xb", descriptor = "[[I")
    private int[][] field1584;

    @OriginalMember(owner = "client!kc", name = "Ob", descriptor = "[Lab;")
    private class3[] field1575;

    @OriginalMember(owner = "client!kc", name = "Pb", descriptor = "[Lie;")
    private class61[] field1576;

    @OriginalMember(owner = "client!kc", name = "Ub", descriptor = "[Lab;")
    private class3[] field1581;

    @OriginalMember(owner = "client!kc", name = "Lb", descriptor = "S")
    public short field1572;

    @OriginalMember(owner = "client!kc", name = "xb", descriptor = "S")
    public short field1558;

    @OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
    private static int field1553 = 0;

    @OriginalMember(owner = "client!kc", name = "rb", descriptor = "[I")
    private static int[] field1552 = new int[10000];

    @OriginalMember(owner = "client!kc", name = "wb", descriptor = "[I")
    private static int[] field1557 = new int[10000];

    @OriginalMember(owner = "client!kc", name = "Wb", descriptor = "[I")
    private static int[] field1583 = new int[128];

    @OriginalMember(owner = "client!kc", name = "zb", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!kc", name = "Eb", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!kc", name = "Gb", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!kc", name = "Qb", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!kc", name = "Zb", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
    private final void method563() {
        this.field1575 = null;
        this.field1581 = null;
        this.field1576 = null;
        this.field1566 = false;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public final void method564() {
        for (int var1 = 0; var1 < this.field1556; ++var1) {
            int var2 = this.field1570[var1];
            this.field1570[var1] = this.field1585[var1];
            this.field1585[var1] = -var2;
        }
        this.method563();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
    private static final int method565(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
    private static final int method566(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field1583[arg0];
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
    public static void method567() {
        field1552 = null;
        field1557 = null;
        field1583 = null;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()Lkc;")
    public final class71 method568() {
        class71 var1 = new class71();
        if (this.field1564 != null) {
            var1.field1564 = new byte[this.field1561];
            for (int var2 = 0; var2 < this.field1561; ++var2) {
                var1.field1564[var2] = this.field1564[var2];
            }
        }
        var1.field1556 = this.field1556;
        var1.field1561 = this.field1561;
        var1.field1580 = this.field1580;
        var1.field1570 = this.field1570;
        var1.field1571 = this.field1571;
        var1.field1585 = this.field1585;
        var1.field1562 = this.field1562;
        var1.field1555 = this.field1555;
        var1.field1569 = this.field1569;
        var1.field1579 = this.field1579;
        var1.field1574 = this.field1574;
        var1.field1588 = this.field1588;
        var1.field1573 = this.field1573;
        var1.field1578 = this.field1578;
        var1.field1563 = this.field1563;
        var1.field1559 = this.field1559;
        var1.field1568 = this.field1568;
        var1.field1587 = this.field1587;
        var1.field1554 = this.field1554;
        var1.field1582 = this.field1582;
        var1.field1584 = this.field1584;
        var1.field1575 = this.field1575;
        var1.field1576 = this.field1576;
        var1.field1572 = this.field1572;
        var1.field1558 = this.field1558;
        return var1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)Lue;")
    public final class133 method569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method572();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class133 var8 = new class133();
        var8.field3216 = new int[this.field1561];
        var8.field3227 = new int[this.field1561];
        var8.field3214 = new int[this.field1561];
        for (int var9 = 0; var9 < this.field1561; ++var9) {
            byte var10;
            if (this.field1564 == null) {
                var10 = 0;
            } else {
                var10 = this.field1564[var9];
            }
            if (this.field1588 != null && this.field1588[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class61 var17 = this.field1576[var9];
                        int var18 = (var17.field1295 * arg4 + var17.field1301 * arg3 + var17.field1298 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field3216[var9] = method566(var18);
                        var8.field3214[var9] = -1;
                    } else {
                        var8.field3214[var9] = -2;
                    }
                } else {
                    class3 var11;
                    if (this.field1581 != null && this.field1581[this.field1562[var9]] != null) {
                        var11 = this.field1581[this.field1562[var9]];
                    } else {
                        var11 = this.field1575[this.field1562[var9]];
                    }
                    int var12 = (var11.field26 * arg4 + var11.field36 * arg3 + var11.field24 * arg2) / (var11.field25 * var7) + arg0;
                    var8.field3216[var9] = method566(var12);
                    class3 var13;
                    if (this.field1581 != null && this.field1581[this.field1555[var9]] != null) {
                        var13 = this.field1581[this.field1555[var9]];
                    } else {
                        var13 = this.field1575[this.field1555[var9]];
                    }
                    int var14 = (var13.field26 * arg4 + var13.field36 * arg3 + var13.field24 * arg2) / (var13.field25 * var7) + arg0;
                    var8.field3227[var9] = method566(var14);
                    class3 var15;
                    if (this.field1581 != null && this.field1581[this.field1569[var9]] != null) {
                        var15 = this.field1581[this.field1569[var9]];
                    } else {
                        var15 = this.field1575[this.field1569[var9]];
                    }
                    int var16 = (var15.field26 * arg4 + var15.field36 * arg3 + var15.field24 * arg2) / (var15.field25 * var7) + arg0;
                    var8.field3214[var9] = method566(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class61 var26 = this.field1576[var9];
                    int var27 = (var26.field1295 * arg4 + var26.field1301 * arg3 + var26.field1298 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field3216[var9] = method565(this.field1573[var9] & 65535, var27);
                    var8.field3214[var9] = -1;
                } else {
                    var8.field3214[var9] = -2;
                }
            } else {
                int var19 = this.field1573[var9] & 65535;
                class3 var20;
                if (this.field1581 != null && this.field1581[this.field1562[var9]] != null) {
                    var20 = this.field1581[this.field1562[var9]];
                } else {
                    var20 = this.field1575[this.field1562[var9]];
                }
                int var21 = (var20.field26 * arg4 + var20.field36 * arg3 + var20.field24 * arg2) / (var20.field25 * var7) + arg0;
                var8.field3216[var9] = method565(var19, var21);
                class3 var22;
                if (this.field1581 != null && this.field1581[this.field1555[var9]] != null) {
                    var22 = this.field1581[this.field1555[var9]];
                } else {
                    var22 = this.field1575[this.field1555[var9]];
                }
                int var23 = (var22.field26 * arg4 + var22.field36 * arg3 + var22.field24 * arg2) / (var22.field25 * var7) + arg0;
                var8.field3227[var9] = method565(var19, var23);
                class3 var24;
                if (this.field1581 != null && this.field1581[this.field1569[var9]] != null) {
                    var24 = this.field1581[this.field1569[var9]];
                } else {
                    var24 = this.field1575[this.field1569[var9]];
                }
                int var25 = (var24.field26 * arg4 + var24.field36 * arg3 + var24.field24 * arg2) / (var24.field25 * var7) + arg0;
                var8.field3214[var9] = method565(var19, var25);
            }
        }
        this.method570();
        var8.field3220 = this.field1556;
        var8.field3224 = this.field1570;
        var8.field3209 = this.field1571;
        var8.field3221 = this.field1585;
        var8.field3208 = this.field1561;
        var8.field3219 = this.field1562;
        var8.field3203 = this.field1555;
        var8.field3205 = this.field1569;
        var8.field3210 = this.field1579;
        var8.field3225 = this.field1574;
        var8.field3239 = this.field1588;
        if (var8.field3239 != null) {
            var8.field3204 = this.field1573;
        } else {
            var8.field3204 = null;
        }
        var8.field3207 = this.field1578;
        var8.field3206 = this.field1580;
        var8.field3222 = this.field1563;
        var8.field3217 = this.field1559;
        var8.field3246 = this.field1568;
        var8.field3201 = this.field1582;
        var8.field3258 = this.field1584;
        return var8;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    private final void method570() {
        int var10002;
        if (this.field1587 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1556; ++var3) {
                int var7 = this.field1587[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1582 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field1582[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1556) {
                int var6 = this.field1587[var5];
                this.field1582[var6][var1[var6]++] = var5++;
            }
            this.field1587 = null;
        }
        if (this.field1554 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field1561; ++var10) {
                int var14 = this.field1554[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field1584 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field1584[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field1561) {
                int var13 = this.field1554[var12];
                this.field1584[var13][var8[var13]++] = var12++;
            }
            this.field1554 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "()V")
    public final void method571() {
        for (int var1 = 0; var1 < this.field1556; ++var1) {
            this.field1570[var1] = -this.field1570[var1];
            this.field1585[var1] = -this.field1585[var1];
        }
        this.method563();
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()V")
    public final void method572() {
        if (this.field1575 == null) {
            this.field1575 = new class3[this.field1556];
            for (int var1 = 0; var1 < this.field1556; ++var1) {
                this.field1575[var1] = new class3();
            }
            for (int var2 = 0; var2 < this.field1561; ++var2) {
                int var3 = this.field1562[var2];
                int var4 = this.field1555[var2];
                int var5 = this.field1569[var2];
                int var6 = this.field1570[var4] - this.field1570[var3];
                int var7 = this.field1571[var4] - this.field1571[var3];
                int var8 = this.field1585[var4] - this.field1585[var3];
                int var9 = this.field1570[var5] - this.field1570[var3];
                int var10 = this.field1571[var5] - this.field1571[var3];
                int var11 = this.field1585[var5] - this.field1585[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field1564 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field1564[var2];
                }
                if (var19 == 0) {
                    class3 var20 = this.field1575[var3];
                    var20.field24 += var16;
                    var20.field36 += var17;
                    var20.field26 += var18;
                    ++var20.field25;
                    class3 var21 = this.field1575[var4];
                    var21.field24 += var16;
                    var21.field36 += var17;
                    var21.field26 += var18;
                    ++var21.field25;
                    class3 var22 = this.field1575[var5];
                    var22.field24 += var16;
                    var22.field36 += var17;
                    var22.field26 += var18;
                    ++var22.field25;
                } else if (var19 == 1) {
                    if (this.field1576 == null) {
                        this.field1576 = new class61[this.field1561];
                    }
                    class61 var23 = this.field1576[var2] = new class61();
                    var23.field1298 = var16;
                    var23.field1301 = var17;
                    var23.field1295 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "()V")
    public final void method573() {
        for (int var1 = 0; var1 < this.field1556; ++var1) {
            this.field1585[var1] = -this.field1585[var1];
        }
        for (int var2 = 0; var2 < this.field1561; ++var2) {
            int var3 = this.field1562[var2];
            this.field1562[var2] = this.field1569[var2];
            this.field1569[var2] = var3;
        }
        this.method563();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lkc;Lkc;IIIZ)V")
    public static final void method574(class71 arg0, class71 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method578();
        arg0.method572();
        arg1.method578();
        arg1.method572();
        ++field1553;
        int var6 = 0;
        int[] var7 = arg1.field1570;
        int var8 = arg1.field1556;
        for (int var9 = 0; var9 < arg0.field1556; ++var9) {
            class3 var12 = arg0.field1575[var9];
            if (var12.field25 != 0) {
                int var13 = arg0.field1571[var9] - arg3;
                if (var13 <= arg1.field1586) {
                    int var14 = arg0.field1570[var9] - arg2;
                    if (var14 >= arg1.field1577 && var14 <= arg1.field1567) {
                        int var15 = arg0.field1585[var9] - arg4;
                        if (var15 >= arg1.field1560 && var15 <= arg1.field1565) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class3 var17 = arg1.field1575[var16];
                                if (var7[var16] == var14 && arg1.field1585[var16] == var15 && arg1.field1571[var16] == var13 && var17.field25 != 0) {
                                    if (arg0.field1581 == null) {
                                        arg0.field1581 = new class3[arg0.field1556];
                                    }
                                    if (arg1.field1581 == null) {
                                        arg1.field1581 = new class3[var8];
                                    }
                                    class3 var18 = arg0.field1581[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1581[var9] = new class3(var12);
                                    }
                                    class3 var19 = arg1.field1581[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1581[var16] = new class3(var17);
                                    }
                                    var18.field24 += var17.field24;
                                    var18.field36 += var17.field36;
                                    var18.field26 += var17.field26;
                                    var18.field25 += var17.field25;
                                    var19.field24 += var12.field24;
                                    var19.field36 += var12.field36;
                                    var19.field26 += var12.field26;
                                    var19.field25 += var12.field25;
                                    ++var6;
                                    field1552[var9] = field1553;
                                    field1557[var16] = field1553;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field1561; ++var10) {
                if (field1552[arg0.field1562[var10]] == field1553 && field1552[arg0.field1555[var10]] == field1553 && field1552[arg0.field1569[var10]] == field1553) {
                    if (arg0.field1564 == null) {
                        arg0.field1564 = new byte[arg0.field1561];
                    }
                    arg0.field1564[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field1561; ++var11) {
                if (field1557[arg1.field1562[var11]] == field1553 && field1557[arg1.field1555[var11]] == field1553 && field1557[arg1.field1569[var11]] == field1553) {
                    if (arg1.field1564 == null) {
                        arg1.field1564 = new byte[arg1.field1561];
                    }
                    arg1.field1564[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
    public final void method575(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1556; ++var4) {
            this.field1570[var4] = this.field1570[var4] * arg0 / 128;
            this.field1571[var4] = this.field1571[var4] * arg1 / 128;
            this.field1585[var4] = this.field1585[var4] * arg2 / 128;
        }
        this.method563();
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
    public final void method576(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1556; ++var4) {
            this.field1570[var4] += arg0;
            this.field1571[var4] += arg1;
            this.field1585[var4] += arg2;
        }
        this.method563();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lpb;II)Lkc;")
    public static final class71 method577(class100 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method762(arg1, arg2, (byte) 66);
        return var3 == null ? null : new class71(var3);
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "()V")
    private final void method578() {
        if (!this.field1566) {
            super.field1052 = 0;
            this.field1586 = 0;
            this.field1577 = 999999;
            this.field1567 = -999999;
            this.field1565 = -99999;
            this.field1560 = 99999;
            for (int var1 = 0; var1 < this.field1556; ++var1) {
                int var2 = this.field1570[var1];
                int var3 = this.field1571[var1];
                int var4 = this.field1585[var1];
                if (var2 < this.field1577) {
                    this.field1577 = var2;
                }
                if (var2 > this.field1567) {
                    this.field1567 = var2;
                }
                if (var4 < this.field1560) {
                    this.field1560 = var4;
                }
                if (var4 > this.field1565) {
                    this.field1565 = var4;
                }
                if (-var3 > super.field1052) {
                    super.field1052 = -var3;
                }
                if (var3 > this.field1586) {
                    this.field1586 = var3;
                }
            }
            this.field1566 = true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZ)Lkc;")
    public final class71 method579(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class71 var6;
            if (arg4) {
                var6 = new class71();
                var6.field1556 = this.field1556;
                var6.field1561 = this.field1561;
                var6.field1580 = this.field1580;
                var6.field1570 = this.field1570;
                var6.field1585 = this.field1585;
                var6.field1562 = this.field1562;
                var6.field1555 = this.field1555;
                var6.field1569 = this.field1569;
                var6.field1564 = this.field1564;
                var6.field1579 = this.field1579;
                var6.field1574 = this.field1574;
                var6.field1588 = this.field1588;
                var6.field1573 = this.field1573;
                var6.field1578 = this.field1578;
                var6.field1563 = this.field1563;
                var6.field1559 = this.field1559;
                var6.field1568 = this.field1568;
                var6.field1587 = this.field1587;
                var6.field1554 = this.field1554;
                var6.field1582 = this.field1582;
                var6.field1584 = this.field1584;
                var6.field1572 = this.field1572;
                var6.field1558 = this.field1558;
                var6.field1571 = new int[var6.field1556];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field1556; ++var8) {
                int var9 = this.field1570[var8];
                int var10 = this.field1571[var8];
                int var11 = this.field1585[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field1571[var8] = var10 + var14 - var7;
            }
            var6.method563();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(SS)V")
    public final void method580(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1561; ++var3) {
            if (this.field1573[var3] == arg0) {
                this.field1573[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "()V")
    public final void method581() {
        for (int var1 = 0; var1 < this.field1556; ++var1) {
            int var2 = this.field1585[var1];
            this.field1585[var1] = this.field1570[var1];
            this.field1570[var1] = -var2;
        }
        this.method563();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lkc;I)I")
    private final int method582(class71 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1570[arg1];
        int var5 = arg0.field1571[arg1];
        int var6 = arg0.field1585[arg1];
        for (int var7 = 0; var7 < this.field1556; ++var7) {
            if (this.field1570[var7] == var4 && this.field1571[var7] == var5 && this.field1585[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1570[this.field1556] = var4;
            this.field1571[this.field1556] = var5;
            this.field1585[this.field1556] = var6;
            if (arg0.field1587 != null) {
                this.field1587[this.field1556] = arg0.field1587[arg1];
            }
            var3 = this.field1556++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    private class71() {
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
    private class71(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class60 var4 = new class60(arg0);
        class60 var5 = new class60(arg0);
        class60 var6 = new class60(arg0);
        class60 var7 = new class60(arg0);
        class60 var8 = new class60(arg0);
        var4.field1227 = arg0.length - 18;
        int var9 = var4.method467(255);
        int var10 = var4.method467(255);
        int var11 = var4.method462((byte) 116);
        int var12 = var4.method462((byte) 116);
        int var13 = var4.method462((byte) 116);
        int var14 = var4.method462((byte) 116);
        int var15 = var4.method462((byte) 116);
        int var16 = var4.method462((byte) 116);
        int var17 = var4.method467(255);
        int var18 = var4.method467(255);
        int var19 = var4.method467(255);
        int var20 = var4.method467(255);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1556 = var9;
        this.field1561 = var10;
        this.field1580 = var11;
        this.field1570 = new int[var9];
        this.field1571 = new int[var9];
        this.field1585 = new int[var9];
        this.field1562 = new int[var10];
        this.field1555 = new int[var10];
        this.field1569 = new int[var10];
        if (var11 > 0) {
            this.field1563 = new int[var11];
            this.field1559 = new int[var11];
            this.field1568 = new int[var11];
        }
        if (var16 == 1) {
            this.field1587 = new int[var9];
        }
        if (var12 == 1) {
            this.field1564 = new byte[var10];
            this.field1588 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1579 = new byte[var10];
        } else {
            this.field1578 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1574 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1554 = new int[var10];
        }
        this.field1573 = new short[var10];
        var4.field1227 = var21;
        var5.field1227 = var36;
        var6.field1227 = var38;
        var7.field1227 = var40;
        var8.field1227 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method462((byte) 116);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method459(false);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method459(false);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method459(false);
            }
            this.field1570[var46] = var43 + var60;
            this.field1571[var46] = var44 + var61;
            this.field1585[var46] = var45 + var62;
            var43 = this.field1570[var46];
            var44 = this.field1571[var46];
            var45 = this.field1585[var46];
            if (var16 == 1) {
                this.field1587[var46] = var8.method462((byte) 116);
            }
        }
        var4.field1227 = var32;
        var5.field1227 = var28;
        var6.field1227 = var26;
        var7.field1227 = var30;
        var8.field1227 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field1573[var47] = (short) var4.method467(255);
            if (var12 == 1) {
                int var58 = var5.method462((byte) 116);
                if ((var58 & 1) == 1) {
                    this.field1564[var47] = 1;
                    var3 = true;
                } else {
                    this.field1564[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field1588[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field1588[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1579[var47] = var6.method449(true);
            }
            if (var14 == 1) {
                this.field1574[var47] = var7.method449(true);
            }
            if (var15 == 1) {
                this.field1554[var47] = var8.method462((byte) 116);
            }
        }
        var4.field1227 = var25;
        var5.field1227 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method462((byte) 116);
            if (var54 == 1) {
                var48 = var4.method459(false) + var51;
                var49 = var4.method459(false) + var48;
                var50 = var4.method459(false) + var49;
                var51 = var50;
                this.field1562[var52] = var48;
                this.field1555[var52] = var49;
                this.field1569[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method459(false) + var51;
                var51 = var50;
                this.field1562[var52] = var48;
                this.field1555[var52] = var49;
                this.field1569[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method459(false) + var51;
                var51 = var50;
                this.field1562[var52] = var48;
                this.field1555[var52] = var49;
                this.field1569[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method459(false) + var51;
                var51 = var50;
                this.field1562[var52] = var48;
                this.field1555[var52] = var57;
                this.field1569[var52] = var50;
            }
        }
        var4.field1227 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field1563[var53] = var4.method467(255);
            this.field1559[var53] = var4.method467(255);
            this.field1568[var53] = var4.method467(255);
        }
        if (!var2) {
            this.field1588 = null;
        }
        if (!var3) {
            this.field1564 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([Lkc;I)V")
    public class71(class71[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field1556 = 0;
        this.field1561 = 0;
        this.field1580 = 0;
        this.field1578 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class71 var14 = arg0[var8];
            if (var14 != null) {
                this.field1556 += var14.field1556;
                this.field1561 += var14.field1561;
                this.field1580 += var14.field1580;
                if (var14.field1579 != null) {
                    var4 = true;
                } else {
                    if (this.field1578 == -1) {
                        this.field1578 = var14.field1578;
                    }
                    if (this.field1578 != var14.field1578) {
                        var4 = true;
                    }
                }
                var3 |= var14.field1564 != null;
                var5 |= var14.field1574 != null;
                var6 |= var14.field1554 != null;
                var7 |= var14.field1588 != null;
            }
        }
        this.field1570 = new int[this.field1556];
        this.field1571 = new int[this.field1556];
        this.field1585 = new int[this.field1556];
        this.field1587 = new int[this.field1556];
        this.field1562 = new int[this.field1561];
        this.field1555 = new int[this.field1561];
        this.field1569 = new int[this.field1561];
        if (this.field1580 > 0) {
            this.field1563 = new int[this.field1580];
            this.field1559 = new int[this.field1580];
            this.field1568 = new int[this.field1580];
        }
        if (var3) {
            this.field1564 = new byte[this.field1561];
        }
        if (var4) {
            this.field1579 = new byte[this.field1561];
        }
        if (var5) {
            this.field1574 = new byte[this.field1561];
        }
        if (var7) {
            this.field1588 = new byte[this.field1561];
        }
        if (var6) {
            this.field1554 = new int[this.field1561];
        }
        this.field1573 = new short[this.field1561];
        this.field1556 = 0;
        this.field1561 = 0;
        this.field1580 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class71 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1561; ++var12) {
                    if (var3 && var11.field1564 != null) {
                        this.field1564[this.field1561] = var11.field1564[var12];
                    }
                    if (var4) {
                        if (var11.field1579 != null) {
                            this.field1579[this.field1561] = var11.field1579[var12];
                        } else {
                            this.field1579[this.field1561] = var11.field1578;
                        }
                    }
                    if (var5 && var11.field1574 != null) {
                        this.field1574[this.field1561] = var11.field1574[var12];
                    }
                    if (var7) {
                        if (var11.field1588 != null && var11.field1588[var12] != -1) {
                            this.field1588[this.field1561] = (byte) (var11.field1588[var12] + var9);
                        } else {
                            this.field1588[this.field1561] = -1;
                        }
                    }
                    if (var6 && var11.field1554 != null) {
                        this.field1554[this.field1561] = var11.field1554[var12];
                    }
                    this.field1573[this.field1561] = var11.field1573[var12];
                    this.field1562[this.field1561] = this.method582(var11, var11.field1562[var12]);
                    this.field1555[this.field1561] = this.method582(var11, var11.field1555[var12]);
                    this.field1569[this.field1561] = this.method582(var11, var11.field1569[var12]);
                    ++this.field1561;
                }
                for (int var13 = 0; var13 < var11.field1580; ++var13) {
                    this.field1563[this.field1580] = this.method582(var11, var11.field1563[var13]);
                    this.field1559[this.field1580] = this.method582(var11, var11.field1559[var13]);
                    this.field1568[this.field1580] = this.method582(var11, var11.field1568[var13]);
                    ++this.field1580;
                }
                var9 += var11.field1580;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lkc;ZZZ)V")
    public class71(class71 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field1556 = arg0.field1556;
        this.field1561 = arg0.field1561;
        this.field1580 = arg0.field1580;
        if (arg1) {
            this.field1570 = arg0.field1570;
            this.field1571 = arg0.field1571;
            this.field1585 = arg0.field1585;
        } else {
            this.field1570 = new int[this.field1556];
            this.field1571 = new int[this.field1556];
            this.field1585 = new int[this.field1556];
            for (int var5 = 0; var5 < this.field1556; ++var5) {
                this.field1570[var5] = arg0.field1570[var5];
                this.field1571[var5] = arg0.field1571[var5];
                this.field1585[var5] = arg0.field1585[var5];
            }
        }
        if (arg2) {
            this.field1573 = arg0.field1573;
        } else {
            this.field1573 = new short[this.field1561];
            for (int var6 = 0; var6 < this.field1561; ++var6) {
                this.field1573[var6] = arg0.field1573[var6];
            }
        }
        if (arg3) {
            this.field1574 = arg0.field1574;
        } else {
            this.field1574 = new byte[this.field1561];
            if (arg0.field1574 == null) {
                for (int var7 = 0; var7 < this.field1561; ++var7) {
                    this.field1574[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field1561; ++var8) {
                    this.field1574[var8] = arg0.field1574[var8];
                }
            }
        }
        this.field1562 = arg0.field1562;
        this.field1555 = arg0.field1555;
        this.field1569 = arg0.field1569;
        this.field1564 = arg0.field1564;
        this.field1579 = arg0.field1579;
        this.field1588 = arg0.field1588;
        this.field1578 = arg0.field1578;
        this.field1563 = arg0.field1563;
        this.field1559 = arg0.field1559;
        this.field1568 = arg0.field1568;
        this.field1587 = arg0.field1587;
        this.field1554 = arg0.field1554;
        this.field1582 = arg0.field1582;
        this.field1584 = arg0.field1584;
        this.field1575 = arg0.field1575;
        this.field1576 = arg0.field1576;
        this.field1581 = arg0.field1581;
        this.field1572 = arg0.field1572;
        this.field1558 = arg0.field1558;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field1583[var0++] = 255;
        }
        while (var0 < 16) {
            field1583[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field1583[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field1583[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field1583[var0++] = var1--;
        }
    }
}
