import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VUJNNHKQ")
public class class62 {

    @OriginalMember(owner = "VUJNNHKQ", name = "i", descriptor = "[I")
    private int[] field1540 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "j", descriptor = "[I")
    private int[] field1541 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "k", descriptor = "[I")
    private int[] field1542 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "m", descriptor = "I")
    private int field1544 = 100;

    @OriginalMember(owner = "VUJNNHKQ", name = "p", descriptor = "I")
    public int field1547 = 500;

    @OriginalMember(owner = "VUJNNHKQ", name = "u", descriptor = "[I")
    private static int[] field1552 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "v", descriptor = "[I")
    private static int[] field1553 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "w", descriptor = "[I")
    private static int[] field1554 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "x", descriptor = "[I")
    private static int[] field1555 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "y", descriptor = "[I")
    private static int[] field1556 = new int[5];

    @OriginalMember(owner = "VUJNNHKQ", name = "l", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "VUJNNHKQ", name = "q", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "VUJNNHKQ", name = "a", descriptor = "LMMADHCLT;")
    private class32 field1532;

    @OriginalMember(owner = "VUJNNHKQ", name = "b", descriptor = "LMMADHCLT;")
    private class32 field1533;

    @OriginalMember(owner = "VUJNNHKQ", name = "c", descriptor = "LMMADHCLT;")
    private class32 field1534;

    @OriginalMember(owner = "VUJNNHKQ", name = "d", descriptor = "LMMADHCLT;")
    private class32 field1535;

    @OriginalMember(owner = "VUJNNHKQ", name = "e", descriptor = "LMMADHCLT;")
    private class32 field1536;

    @OriginalMember(owner = "VUJNNHKQ", name = "f", descriptor = "LMMADHCLT;")
    private class32 field1537;

    @OriginalMember(owner = "VUJNNHKQ", name = "g", descriptor = "LMMADHCLT;")
    private class32 field1538;

    @OriginalMember(owner = "VUJNNHKQ", name = "h", descriptor = "LMMADHCLT;")
    private class32 field1539;

    @OriginalMember(owner = "VUJNNHKQ", name = "o", descriptor = "LMMADHCLT;")
    private class32 field1546;

    @OriginalMember(owner = "VUJNNHKQ", name = "n", descriptor = "LRMKIQWOG;")
    private class48 field1545;

    @OriginalMember(owner = "VUJNNHKQ", name = "r", descriptor = "[I")
    private static int[] field1549;

    @OriginalMember(owner = "VUJNNHKQ", name = "s", descriptor = "[I")
    private static int[] field1550;

    @OriginalMember(owner = "VUJNNHKQ", name = "t", descriptor = "[I")
    private static int[] field1551;

    @OriginalMember(owner = "VUJNNHKQ", name = "a", descriptor = "()V")
    public static final void method514() {
        field1550 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1550[var0] = 1;
            } else {
                field1550[var0] = -1;
            }
        }
        field1551 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1551[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1549 = new int[220500];
    }

    @OriginalMember(owner = "VUJNNHKQ", name = "a", descriptor = "(II)[I")
    public final int[] method515(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1549[var3] = 0;
        }
        if (arg1 < 10) {
            return field1549;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1532.method326(3);
        this.field1533.method326(3);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1534 != null) {
            this.field1534.method326(3);
            this.field1535.method326(3);
            var6 = (int) ((double) (this.field1534.field1069 - this.field1534.field1068) * 32.768D / var4);
            var7 = (int) ((double) this.field1534.field1068 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1536 != null) {
            this.field1536.method326(3);
            this.field1537.method326(3);
            var9 = (int) ((double) (this.field1536.field1069 - this.field1536.field1068) * 32.768D / var4);
            var10 = (int) ((double) this.field1536.field1068 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1540[var12] != 0) {
                field1552[var12] = 0;
                field1553[var12] = (int) ((double) this.field1542[var12] * var4);
                field1554[var12] = (this.field1540[var12] << 14) / 100;
                field1555[var12] = (int) ((double) (this.field1532.field1069 - this.field1532.field1068) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1541[var12]) / var4);
                field1556[var12] = (int) ((double) this.field1532.field1068 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1532.method327((byte) 1, arg0);
            int var42 = this.field1533.method327((byte) 1, arg0);
            if (this.field1534 != null) {
                int var43 = this.field1534.method327((byte) 1, arg0);
                int var44 = this.field1535.method327((byte) 1, arg0);
                var41 += this.method516(this.field1534.field1070, var44, true, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1536 != null) {
                int var45 = this.field1536.method327((byte) 1, arg0);
                int var46 = this.field1537.method327((byte) 1, arg0);
                var42 = var42 * ((this.method516(this.field1536.field1070, var46, true, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1540[var47] != 0) {
                    int var48 = field1553[var47] + var13;
                    if (var48 < arg0) {
                        field1549[var48] += this.method516(this.field1532.field1070, field1554[var47] * var42 >> 15, true, field1552[var47]);
                        field1552[var47] += (field1555[var47] * var41 >> 16) + field1556[var47];
                    }
                }
            }
        }
        if (this.field1538 != null) {
            this.field1538.method326(3);
            this.field1539.method326(3);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1538.method327((byte) 1, arg0);
                int var19 = this.field1539.method327((byte) 1, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1538.field1069 - this.field1538.field1068) * var18 >> 8) + this.field1538.field1068;
                } else {
                    var20 = ((this.field1538.field1069 - this.field1538.field1068) * var19 >> 8) + this.field1538.field1068;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1549[var17] = 0;
                }
            }
        }
        if (this.field1543 > 0 && this.field1544 > 0) {
            int var21 = (int) ((double) this.field1543 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1549[var22] += field1549[var22 - var21] * this.field1544 / 100;
            }
        }
        if (this.field1545.field1302[0] > 0 || this.field1545.field1302[1] > 0) {
            this.field1546.method326(3);
            int var23 = this.field1546.method327((byte) 1, arg0 + 1);
            int var24 = this.field1545.method419((byte) -98, 0, (float) var23 / 65536.0F);
            int var25 = this.field1545.method419((byte) -98, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1549[var24 + var26] * (long) class48.field1309 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1549[var24 + var26 - var38 - 1] * (long) class48.field1307[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1549[var26 - var39 - 1] * (long) class48.field1307[1][var39] >> 16);
                    }
                    field1549[var26] = var37;
                    var23 = this.field1546.method327((byte) 1, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1549[var24 + var26] * (long) class48.field1309 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1549[var24 + var26 - var35 - 1] * (long) class48.field1307[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1549[var26 - var36 - 1] * (long) class48.field1307[1][var36] >> 16);
                        }
                        field1549[var26] = var34;
                        var23 = this.field1546.method327((byte) 1, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1549[var24 + var26 - var31 - 1] * (long) class48.field1307[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1549[var26 - var32 - 1] * (long) class48.field1307[1][var32] >> 16);
                            }
                            field1549[var26] = var30;
                            this.field1546.method327((byte) 1, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1545.method419((byte) -98, 0, (float) var23 / 65536.0F);
                    var25 = this.field1545.method419((byte) -98, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1549[var40] < -32768) {
                field1549[var40] = -32768;
            }
            if (field1549[var40] > 32767) {
                field1549[var40] = 32767;
            }
        }
        return field1549;
    }

    @OriginalMember(owner = "VUJNNHKQ", name = "a", descriptor = "(IIZI)I")
    private final int method516(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return 4;
        } else if (arg0 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field1551[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field1550[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "VUJNNHKQ", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public final void method517(int arg0, class55 arg1) {
        this.field1532 = new class32();
        this.field1532.method324(-7321, arg1);
        this.field1533 = new class32();
        this.field1533.method324(-7321, arg1);
        int var3 = arg1.method455();
        if (var3 != 0) {
            arg1.field1456--;
            this.field1534 = new class32();
            this.field1534.method324(-7321, arg1);
            this.field1535 = new class32();
            this.field1535.method324(-7321, arg1);
        }
        int var4 = arg1.method455();
        if (var4 != 0) {
            arg1.field1456--;
            this.field1536 = new class32();
            this.field1536.method324(-7321, arg1);
            this.field1537 = new class32();
            this.field1537.method324(-7321, arg1);
        }
        int var5 = arg1.method455();
        if (var5 != 0) {
            arg1.field1456--;
            this.field1538 = new class32();
            this.field1538.method324(-7321, arg1);
            this.field1539 = new class32();
            this.field1539.method324(-7321, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method469();
            if (var7 == 0) {
                break;
            }
            this.field1540[var6] = var7;
            this.field1541[var6] = arg1.method468();
            this.field1542[var6] = arg1.method469();
        }
        this.field1543 = arg1.method469();
        this.field1544 = arg1.method469();
        this.field1547 = arg1.method457();
        this.field1548 = arg1.method457();
        this.field1545 = new class48();
        this.field1546 = new class32();
        if (arg0 != -7321) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field1545.method420(arg1, 593, this.field1546);
    }
}
