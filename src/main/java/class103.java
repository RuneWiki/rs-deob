import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class103 extends class195 {

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public int field1562 = 1638;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public int field1565 = 0;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public int field1564 = 4;

    @OriginalMember(owner = "client!rj", name = "pb", descriptor = "I")
    public int field1579 = 4;

    @OriginalMember(owner = "client!rj", name = "lb", descriptor = "I")
    public int field1575 = 4;

    @OriginalMember(owner = "client!rj", name = "qb", descriptor = "Z")
    public boolean field1580 = true;

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "[B")
    private byte[] field1574 = new byte[512];

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "[[[I")
    public static int[][][] field1567 = new int[4][13][13];

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Lvk;")
    public static class67 field1559 = new class67(4);

    @OriginalMember(owner = "client!rj", name = "rb", descriptor = "Lck;")
    public static class119 field1581 = class298.method1987((byte) 91, "null");

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!rj", name = "mb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!rj", name = "nb", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!rj", name = "sb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!rj", name = "tb", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!rj", name = "ub", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!rj", name = "vb", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "[S")
    private short[] field1570;

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "[S")
    private short[] field1572;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V", line = 4)
    private final void method675(int arg0) {
        if (this.field1562 > 0) {
            this.field1572 = new short[this.field1564];
            this.field1570 = new short[this.field1564];
            for (int var3 = 0; var3 < this.field1564; var3++) {
                this.field1572[var3] = (short) ((int) (Math.pow((double) ((float) this.field1562 / 4096.0F), (double) var3) * 4096.0D));
                this.field1570[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1572 != null && this.field1572.length == this.field1564) {
            this.field1570 = new short[this.field1564];
            for (int var2 = 0; var2 < this.field1564; var2++) {
                this.field1570[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field1577++;
        if (arg0 != -9) {
            this.field1570 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[II)V", line = 43)
    public final void method676(int arg0, int[] arg1, int arg2) {
        if (arg0 != -9) {
            return;
        }
        field1561++;
        int var4 = class215.field3424[arg2] * this.field1575;
        if (this.field1564 == 1) {
            short var38 = this.field1572[0];
            int var39 = this.field1570[0] << 12;
            int var40 = this.field1579 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = var41 >> 12;
            int var43 = var42 + 1;
            int var44 = var41 & 0xFFF;
            int var45 = this.field1574[var42 & 0xFF] & 0xFF;
            int var46 = class6.field142[var44];
            int var47 = this.field1575 * var39 >> 12;
            if (var43 >= var47) {
                var43 = 0;
            }
            int var48 = this.field1574[var43 & 0xFF] & 0xFF;
            if (this.field1580) {
                for (int var52 = 0; var52 < class157.field2504; var52++) {
                    int var53 = class157.field2505[var52] * this.field1579;
                    int var54 = this.method681(var46, var48, var45, (byte) -103, var40, var39 * var53 >> 12, var44);
                    int var55 = var38 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class157.field2504; var49++) {
                    int var50 = class157.field2505[var49] * this.field1579;
                    int var51 = this.method681(var46, var48, var45, (byte) -103, var40, var39 * var50 >> 12, var44);
                    arg1[var49] = var38 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field1572[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field1570[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = var7 >> 12;
            int var9 = this.field1574[var8 & 0xFF] & 0xFF;
            int var10 = var7 & 0xFFF;
            int var11 = this.field1579 * var6 >> 12;
            int var12 = class6.field142[var10];
            int var13 = this.field1575 * var6 >> 12;
            int var14 = var8 + 1;
            if (var14 >= var13) {
                var14 = 0;
            }
            int var15 = this.field1574[var14 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class157.field2504; var16++) {
                int var17 = class157.field2505[var16] * this.field1579;
                int var18 = this.method681(var12, var15, var9, (byte) -103, var11, var6 * var17 >> 12, var10);
                arg1[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field1564; var19++) {
            short var20 = this.field1572[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field1570[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = this.field1579 * var21 >> 12;
                int var24 = var22 >> 12;
                int var25 = this.field1575 * var21 >> 12;
                int var26 = this.field1574[var24 & 0xFF] & 0xFF;
                int var27 = var22 & 0xFFF;
                int var28 = class6.field142[var27];
                int var29 = var24 + 1;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var30 = this.field1574[var29 & 0xFF] & 0xFF;
                if (this.field1580 && (this.field1564 - 1) == var19) {
                    for (int var31 = 0; var31 < class157.field2504; var31++) {
                        int var32 = class157.field2505[var31] * this.field1579;
                        int var33 = this.method681(var28, var30, var26, (byte) -103, var23, var21 * var32 >> 12, var27);
                        int var34 = arg1[var31] + (var20 * var33 >> 12);
                        arg1[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class157.field2504; var35++) {
                        int var36 = class157.field2505[var35] * this.field1579;
                        int var37 = this.method681(var28, var30, var26, (byte) -103, var23, var21 * var36 >> 12, var27);
                        arg1[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lfj;II)V", line = 203)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            this.field1572 = (short[]) null;
        }
        field1585++;
        if (arg2 == 0) {
            this.field1580 = arg0.method64((byte) 67) == 1;
        } else if (arg2 == 1) {
            this.field1564 = arg0.method64((byte) -93);
        } else if (arg2 == 2) {
            this.field1562 = arg0.method59((byte) -68);
            if (this.field1562 < 0) {
                this.field1572 = new short[this.field1564];
                for (int var5 = 0; var5 < this.field1564; var5++) {
                    this.field1572[var5] = (short) arg0.method59((byte) -68);
                }
            }
        } else if (arg2 == 3) {
            this.field1579 = this.field1575 = arg0.method64((byte) 119);
        } else if (arg2 == 4) {
            this.field1565 = arg0.method64((byte) 55);
        } else if (arg2 == 5) {
            this.field1579 = arg0.method64((byte) 64);
        } else if (arg2 == 6) {
            this.field1575 = arg0.method64((byte) 67);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(III)V", line = 294)
    public static final void method677(int arg0, int arg1, int arg2) {
        if (arg2 == 4 && !class10.field184) {
            arg0 = 2;
            arg2 = 2;
        }
        if (arg1 != 30359) {
            method677(88, 44, -9);
        }
        field1560++;
        if (class132.field2008 != arg2) {
            if (class203.field3213) {
                return;
            }
            if (class132.field2008 != 0) {
                class171.field2719[class132.field2008].method293();
            }
            if (arg2 != 0) {
                class38 var3 = class171.field2719[arg2];
                var3.method295();
                var3.method294(arg0);
            }
            class70.field1105 = arg0;
            class132.field2008 = arg2;
        } else if (arg2 != 0 && class70.field1105 != arg0) {
            class171.field2719[arg2].method294(arg0);
            class70.field1105 = arg0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 354)
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Z)V", line = 358)
    public static final void method678(boolean arg0) {
        if (!arg0) {
            field1578++;
            class263.field4274.method1217(-24302);
            class207.field3298 = null;
            class126.field1947 = 1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(III)Leg;", line = 384)
    public static final class69 method679(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class69 var4 = var3.field1602;
            var3.field1602 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V", line = 395)
    public final void method14(int arg0) {
        field1573++;
        if (arg0 != 2048879374) {
            field1559 = (class67) null;
        }
        this.field1574 = class272.method1799(20291, this.field1565);
        this.method675(-9);
        for (int var2 = this.field1564 - 1; var2 >= 1; var2--) {
            short var3 = this.field1572[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1564--;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILml;II)V", line = 431)
    public static final void method680(int arg0, class134 arg1, int arg2, int arg3) {
        field1582++;
        if (class100.field1526 != 0 && class100.field1526 != 3 || !arg1.method884(false)) {
            return;
        }
        int var4 = arg1.field2134[arg0];
        if (arg3 < var4 || arg3 > arg1.field2043[arg0] + var4) {
            return;
        }
        int var5 = arg3 - arg1.field2180 / 2;
        int var6 = class42.field651 + class140.field2253 & 0x7FF;
        int var7 = arg0 - arg1.field2057 / 2;
        int var8 = class284.field4698[var6];
        int var9 = (class221.field3549 + 256) * var8 >> 8;
        if (arg2 <= 30) {
            method680(18, (class134) null, 7, 82);
        }
        int var10 = class284.field4699[var6];
        int var11 = (class221.field3549 + 256) * var10 >> 8;
        int var12 = var7 * var11 - (var5 * var9) >> 11;
        int var13 = class124.field1917.field4991 - var12 >> 7;
        int var14 = var5 * var11 + var7 * var9 >> 11;
        int var15 = class124.field1917.field4949 + var14 >> 7;
        boolean var16 = class173.method1104(var13, true, 0, 0, 1, 0, class124.field1917.field4973[0], var15, 0, (byte) 9, class124.field1917.field4963[0], 0);
        if (!var16) {
            return;
        }
        class6.field149.method32(var5, (byte) -99);
        class6.field149.method32(var7, (byte) -99);
        class6.field149.method40(class140.field2253, -54);
        class6.field149.method32(57, (byte) -99);
        class6.field149.method32(class42.field651, (byte) -99);
        class6.field149.method32(class221.field3549, (byte) -99);
        class6.field149.method32(89, (byte) -99);
        class6.field149.method40(class124.field1917.field4949, 123);
        class6.field149.method40(class124.field1917.field4991, 83);
        class6.field149.method32(class82.field1252, (byte) -99);
        class6.field149.method32(63, (byte) -99);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIBIII)I", line = 489)
    private final int method681(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1563++;
        int var8 = arg6 - 4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 0xFFF;
        int var11 = class6.field142[var10];
        int var12 = var10 - 4096;
        int var13 = var9 + 1;
        int var14 = var9 & 0xFF;
        int var15 = this.field1574[arg2 + var14] & 0x3;
        if (arg4 <= var13) {
            var13 = 0;
        }
        if (arg3 != -103) {
            this.field1580 = true;
        }
        int var16;
        if (var15 > 1) {
            var16 = var15 == 2 ? var10 - arg6 : -arg6 + -var10;
        } else {
            var16 = var15 == 0 ? arg6 + var10 : -var10 + arg6;
        }
        int var17 = var13 & 0xFF;
        int var18 = this.field1574[arg2 + var17] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var12 + arg6 : -var12 + arg6;
        } else {
            var19 = var18 == 2 ? var12 - arg6 : -arg6 + -var12;
        }
        int var20 = ((var19 - var16) * var11 >> 12) + var16;
        int var21 = this.field1574[var14 + arg1] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var10 - var8 : -var8 + -var10;
        } else {
            var22 = var21 == 0 ? var8 + var10 : -var10 + var8;
        }
        int var23 = this.field1574[arg1 + var17] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        } else {
            var24 = var23 == 0 ? var8 + var12 : -var12 + var8;
        }
        int var25 = ((var24 - var22) * var11 >> 12) + var22;
        return ((var25 - var20) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)[I", line = 604)
    public final int[] method11(int arg0, boolean arg1) {
        field1571++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (arg1) {
            return (int[]) null;
        } else {
            if (this.field3106.field2260) {
                this.method676(-9, var3, arg0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltl;I)V", line = 622)
    public static final void method682(class96 arg0, int arg1) {
        if (arg1 != 15889) {
            method680(84, (class134) null, -23, 21);
        }
        field1583++;
        class210.field3358 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V", line = 644)
    public static final void method683(int arg0, int arg1) {
        field1568++;
        class179 var2 = class53.method397(arg1, 1000, arg0);
        var2.method1146((byte) -48);
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V", line = 653)
    public static void method684(int arg0) {
        field1581 = null;
        field1567 = (int[][][]) null;
        if (arg0 != -520865913) {
            field1559 = (class67) null;
        }
        field1559 = null;
    }
}
