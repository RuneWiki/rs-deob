import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WLTAOGXS")
public class class60 {

    @OriginalMember(owner = "WLTAOGXS", name = "a", descriptor = "I")
    private int field1555 = 1;

    @OriginalMember(owner = "WLTAOGXS", name = "j", descriptor = "[I")
    private int[] field1564 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "k", descriptor = "[I")
    private int[] field1565 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "l", descriptor = "[I")
    private int[] field1566 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "n", descriptor = "I")
    private int field1568 = 100;

    @OriginalMember(owner = "WLTAOGXS", name = "q", descriptor = "I")
    public int field1571 = 500;

    @OriginalMember(owner = "WLTAOGXS", name = "v", descriptor = "[I")
    private static int[] field1576 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "w", descriptor = "[I")
    private static int[] field1577 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "x", descriptor = "[I")
    private static int[] field1578 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "y", descriptor = "[I")
    private static int[] field1579 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "z", descriptor = "[I")
    private static int[] field1580 = new int[5];

    @OriginalMember(owner = "WLTAOGXS", name = "m", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "WLTAOGXS", name = "r", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "WLTAOGXS", name = "o", descriptor = "LGHIPAIQX;")
    private class20 field1569;

    @OriginalMember(owner = "WLTAOGXS", name = "b", descriptor = "LLYKGAWTC;")
    private class37 field1556;

    @OriginalMember(owner = "WLTAOGXS", name = "c", descriptor = "LLYKGAWTC;")
    private class37 field1557;

    @OriginalMember(owner = "WLTAOGXS", name = "d", descriptor = "LLYKGAWTC;")
    private class37 field1558;

    @OriginalMember(owner = "WLTAOGXS", name = "e", descriptor = "LLYKGAWTC;")
    private class37 field1559;

    @OriginalMember(owner = "WLTAOGXS", name = "f", descriptor = "LLYKGAWTC;")
    private class37 field1560;

    @OriginalMember(owner = "WLTAOGXS", name = "g", descriptor = "LLYKGAWTC;")
    private class37 field1561;

    @OriginalMember(owner = "WLTAOGXS", name = "h", descriptor = "LLYKGAWTC;")
    private class37 field1562;

    @OriginalMember(owner = "WLTAOGXS", name = "i", descriptor = "LLYKGAWTC;")
    private class37 field1563;

    @OriginalMember(owner = "WLTAOGXS", name = "p", descriptor = "LLYKGAWTC;")
    private class37 field1570;

    @OriginalMember(owner = "WLTAOGXS", name = "s", descriptor = "[I")
    private static int[] field1573;

    @OriginalMember(owner = "WLTAOGXS", name = "t", descriptor = "[I")
    private static int[] field1574;

    @OriginalMember(owner = "WLTAOGXS", name = "u", descriptor = "[I")
    private static int[] field1575;

    @OriginalMember(owner = "WLTAOGXS", name = "a", descriptor = "()V")
    public static final void method551() {
        field1574 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1574[var0] = 1;
            } else {
                field1574[var0] = -1;
            }
        }
        field1575 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1575[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1573 = new int[220500];
    }

    @OriginalMember(owner = "WLTAOGXS", name = "a", descriptor = "(II)[I")
    public final int[] method552(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1573[var3] = 0;
        }
        if (arg1 < 10) {
            return field1573;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1556.method387(-955);
        this.field1557.method387(-955);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1558 != null) {
            this.field1558.method387(-955);
            this.field1559.method387(-955);
            var6 = (int) ((double) (this.field1558.field1056 - this.field1558.field1055) * 32.768D / var4);
            var7 = (int) ((double) this.field1558.field1055 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1560 != null) {
            this.field1560.method387(-955);
            this.field1561.method387(-955);
            var9 = (int) ((double) (this.field1560.field1056 - this.field1560.field1055) * 32.768D / var4);
            var10 = (int) ((double) this.field1560.field1055 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1564[var12] != 0) {
                field1576[var12] = 0;
                field1577[var12] = (int) ((double) this.field1566[var12] * var4);
                field1578[var12] = (this.field1564[var12] << 14) / 100;
                field1579[var12] = (int) ((double) (this.field1556.field1056 - this.field1556.field1055) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1565[var12]) / var4);
                field1580[var12] = (int) ((double) this.field1556.field1055 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1556.method388((byte) 75, arg0);
            int var42 = this.field1557.method388((byte) 75, arg0);
            if (this.field1558 != null) {
                int var43 = this.field1558.method388((byte) 75, arg0);
                int var44 = this.field1559.method388((byte) 75, arg0);
                var41 += this.method553(this.field1558.field1057, var44, var8, 996) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1560 != null) {
                int var45 = this.field1560.method388((byte) 75, arg0);
                int var46 = this.field1561.method388((byte) 75, arg0);
                var42 = var42 * ((this.method553(this.field1560.field1057, var46, var11, 996) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1564[var47] != 0) {
                    int var48 = field1577[var47] + var13;
                    if (var48 < arg0) {
                        field1573[var48] += this.method553(this.field1556.field1057, field1578[var47] * var42 >> 15, field1576[var47], 996);
                        field1576[var47] += (field1579[var47] * var41 >> 16) + field1580[var47];
                    }
                }
            }
        }
        if (this.field1562 != null) {
            this.field1562.method387(-955);
            this.field1563.method387(-955);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1562.method388((byte) 75, arg0);
                int var19 = this.field1563.method388((byte) 75, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1562.field1056 - this.field1562.field1055) * var18 >> 8) + this.field1562.field1055;
                } else {
                    var20 = ((this.field1562.field1056 - this.field1562.field1055) * var19 >> 8) + this.field1562.field1055;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1573[var17] = 0;
                }
            }
        }
        if (this.field1567 > 0 && this.field1568 > 0) {
            int var21 = (int) ((double) this.field1567 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1573[var22] += field1573[var22 - var21] * this.field1568 / 100;
            }
        }
        if (this.field1569.field790[0] > 0 || this.field1569.field790[1] > 0) {
            this.field1570.method387(-955);
            int var23 = this.field1570.method388((byte) 75, arg0 + 1);
            int var24 = this.field1569.method230((float) var23 / 65536.0F, 0, 4);
            int var25 = this.field1569.method230((float) var23 / 65536.0F, 1, 4);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1573[var24 + var26] * (long) class20.field797 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1573[var24 + var26 - var38 - 1] * (long) class20.field795[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1573[var26 - var39 - 1] * (long) class20.field795[1][var39] >> 16);
                    }
                    field1573[var26] = var37;
                    var23 = this.field1570.method388((byte) 75, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1573[var24 + var26] * (long) class20.field797 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1573[var24 + var26 - var35 - 1] * (long) class20.field795[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1573[var26 - var36 - 1] * (long) class20.field795[1][var36] >> 16);
                        }
                        field1573[var26] = var34;
                        var23 = this.field1570.method388((byte) 75, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1573[var24 + var26 - var31 - 1] * (long) class20.field795[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1573[var26 - var32 - 1] * (long) class20.field795[1][var32] >> 16);
                            }
                            field1573[var26] = var30;
                            this.field1570.method388((byte) 75, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1569.method230((float) var23 / 65536.0F, 0, 4);
                    var25 = this.field1569.method230((float) var23 / 65536.0F, 1, 4);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1573[var40] < -32768) {
                field1573[var40] = -32768;
            }
            if (field1573[var40] > 32767) {
                field1573[var40] = 32767;
            }
        }
        return field1573;
    }

    @OriginalMember(owner = "WLTAOGXS", name = "a", descriptor = "(IIII)I")
    private final int method553(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 13 / arg3;
        if (arg0 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field1575[arg2 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field1574[arg2 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "WLTAOGXS", name = "a", descriptor = "(BLGLMIQHJI;)V")
    public final void method554(byte arg0, class21 arg1) {
        this.field1556 = new class37();
        this.field1556.method385((byte) 8, arg1);
        this.field1557 = new class37();
        this.field1557.method385((byte) 8, arg1);
        int var3 = arg1.method244();
        if (arg0 == 8) {
            boolean var4 = false;
        } else {
            this.field1555 = 110;
        }
        if (var3 != 0) {
            arg1.field818--;
            this.field1558 = new class37();
            this.field1558.method385((byte) 8, arg1);
            this.field1559 = new class37();
            this.field1559.method385((byte) 8, arg1);
        }
        int var5 = arg1.method244();
        if (var5 != 0) {
            arg1.field818--;
            this.field1560 = new class37();
            this.field1560.method385((byte) 8, arg1);
            this.field1561 = new class37();
            this.field1561.method385((byte) 8, arg1);
        }
        int var6 = arg1.method244();
        if (var6 != 0) {
            arg1.field818--;
            this.field1562 = new class37();
            this.field1562.method385((byte) 8, arg1);
            this.field1563 = new class37();
            this.field1563.method385((byte) 8, arg1);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg1.method258();
            if (var8 == 0) {
                break;
            }
            this.field1564[var7] = var8;
            this.field1565[var7] = arg1.method257();
            this.field1566[var7] = arg1.method258();
        }
        this.field1567 = arg1.method258();
        this.field1568 = arg1.method258();
        this.field1571 = arg1.method246();
        this.field1572 = arg1.method246();
        this.field1569 = new class20();
        this.field1570 = new class37();
        this.field1569.method231(false, this.field1570, arg1);
    }
}
