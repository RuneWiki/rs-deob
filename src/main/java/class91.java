import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class91 extends class152 {

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "[B")
    private byte[] field1437 = new byte[512];

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "Z")
    public boolean field1440 = true;

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "I")
    public int field1442 = 4;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    public int field1436 = 1638;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public int field1438 = 4;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public int field1430 = 0;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    public int field1433 = 4;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field1422 = -1;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "[I")
    public static int[] field1428 = new int[50];

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "Lce;")
    public static class126 field1427 = class206.method1445(-7923, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!tg", name = "ob", descriptor = "[I")
    public static int[] field1445 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tg", name = "pb", descriptor = "I")
    public static int field1446 = 1;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "Z")
    public static boolean field1424 = true;

    @OriginalMember(owner = "client!tg", name = "qb", descriptor = "Z")
    public static boolean field1447 = false;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "Lcc;")
    public static class313 field1423;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "[S")
    private short[] field1434;

    @OriginalMember(owner = "client!tg", name = "nb", descriptor = "[S")
    private short[] field1444;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V", line = 4)
    public static final void method629(int arg0) {
        class254.field4264.method1185(1);
        class197.field3369.method1185(1);
        if (arg0 >= 65) {
            field1432++;
            class223.field3763.method1185(1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)V", line = 25)
    public static void method630(byte arg0) {
        field1428 = null;
        field1445 = null;
        if (arg0 <= 27) {
            field1424 = true;
        }
        field1423 = null;
        field1427 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 51)
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(B)V", line = 56)
    private final void method631(byte arg0) {
        if (this.field1436 > 0) {
            this.field1434 = new short[this.field1438];
            this.field1444 = new short[this.field1438];
            for (int var2 = 0; var2 < this.field1438; var2++) {
                this.field1444[var2] = (short) ((int) (Math.pow((double) ((float) this.field1436 / 4096.0F), (double) var2) * 4096.0D));
                this.field1434[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1444 != null && this.field1444.length == this.field1438) {
            this.field1434 = new short[this.field1438];
            for (int var3 = 0; var3 < this.field1438; var3++) {
                this.field1434[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        field1431++;
        if (arg0 > -122) {
            this.field1434 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILbb;)V", line = 129)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg1 == 0) {
            this.field1440 = arg2.method948(-126) == 1;
        } else if (arg1 == 1) {
            this.field1438 = arg2.method948(arg0 ^ 0xFFFFFF8A);
        } else if (arg1 == 2) {
            this.field1436 = arg2.method931((byte) 110);
            if (this.field1436 < 0) {
                this.field1444 = new short[this.field1438];
                for (int var5 = 0; var5 < this.field1438; var5++) {
                    this.field1444[var5] = (short) arg2.method931((byte) 91);
                }
            }
        } else if (arg1 == 3) {
            this.field1433 = this.field1442 = arg2.method948(-122);
        } else if (arg1 == 4) {
            this.field1430 = arg2.method948(-123);
        } else if (arg1 == 5) {
            this.field1433 = arg2.method948(-121);
        } else if (arg1 == 6) {
            this.field1442 = arg2.method948(-128);
        }
        if (arg0 == 8) {
            field1426++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[I", line = 214)
    public final int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            field1427 = (class126) null;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        field1425++;
        if (this.field2776.field4516) {
            this.method633(var3, arg1, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)I", line = 234)
    private final int method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1443++;
        int var8 = arg4 - 4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 0xFFF;
        int var11 = var9 + 1;
        int var12 = var10 - 4096;
        int var13 = var9 & 0xFF;
        if (var11 >= arg3) {
            var11 = 0;
        }
        int var14 = class27.field387[var10];
        int var15 = var11 & 0xFF;
        int var16 = this.field1437[var13 + arg5] & 0x3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var10 - arg4 : -arg4 + -var10;
        } else {
            var17 = var16 == 0 ? arg4 + var10 : -var10 + arg4;
        }
        if (arg2 > -58) {
            method630((byte) 122);
        }
        int var18 = this.field1437[arg5 + var15] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg4 + var12 : -var12 + arg4;
        } else {
            var19 = var18 == 2 ? var12 - arg4 : -var12 - arg4;
        }
        int var20 = ((var19 - var17) * var14 >> 12) + var17;
        int var21 = this.field1437[arg1 + var13] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var10 : var8 - var10;
        } else {
            var22 = var21 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var23 = this.field1437[arg1 + var15] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var12 : -var12 + var8;
        } else {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var20) * arg6 >> 12) + var20;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIZ)V", line = 308)
    public final void method633(int[] arg0, int arg1, boolean arg2) {
        field1429++;
        int var4 = class122.field2038[arg1] * this.field1442;
        if (!arg2) {
            method630((byte) 72);
        }
        if (this.field1438 == 1) {
            int var38 = this.field1434[0] << 12;
            short var39 = this.field1444[0];
            int var40 = this.field1442 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            int var42 = this.field1433 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 + 1;
            if (var40 <= var44) {
                var44 = 0;
            }
            int var45 = this.field1437[var43 & 0xFF] & 0xFF;
            int var46 = this.field1437[var44 & 0xFF] & 0xFF;
            int var47 = var41 & 0xFFF;
            int var48 = class27.field387[var47];
            if (this.field1440) {
                for (int var52 = 0; var52 < class244.field4133; var52++) {
                    int var53 = class29.field406[var52] * this.field1433;
                    int var54 = this.method632(var38 * var53 >> 12, var46, -124, var42, var47, var45, var48);
                    int var55 = var39 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class244.field4133; var49++) {
                    int var50 = class29.field406[var49] * this.field1433;
                    int var51 = this.method632(var38 * var50 >> 12, var46, -115, var42, var47, var45, var48);
                    arg0[var49] = var39 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field1444[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field1434[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field1442 * var6 >> 12;
            int var9 = this.field1433 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var7 & 0xFFF;
            int var12 = var10 + 1;
            if (var12 >= var8) {
                var12 = 0;
            }
            int var13 = class27.field387[var11];
            int var14 = this.field1437[var12 & 0xFF] & 0xFF;
            int var15 = this.field1437[var10 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class244.field4133; var16++) {
                int var17 = class29.field406[var16] * this.field1433;
                int var18 = this.method632(var6 * var17 >> 12, var14, -76, var9, var11, var15, var13);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field1438; var19++) {
            short var20 = this.field1444[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field1434[var19] << 12;
                int var22 = this.field1442 * var21 >> 12;
                int var23 = var4 * var21 >> 12;
                int var24 = this.field1433 * var21 >> 12;
                int var25 = var23 >> 12;
                int var26 = var23 & 0xFFF;
                int var27 = class27.field387[var26];
                int var28 = this.field1437[var25 & 0xFF] & 0xFF;
                int var29 = var25 + 1;
                if (var29 >= var22) {
                    var29 = 0;
                }
                int var30 = this.field1437[var29 & 0xFF] & 0xFF;
                if (this.field1440 && (this.field1438 - 1) == var19) {
                    for (int var31 = 0; var31 < class244.field4133; var31++) {
                        int var32 = class29.field406[var31] * this.field1433;
                        int var33 = this.method632(var21 * var32 >> 12, var30, -64, var24, var26, var28, var27);
                        int var34 = arg0[var31] + (var20 * var33 >> 12);
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class244.field4133; var35++) {
                        int var36 = class29.field406[var35] * this.field1433;
                        int var37 = this.method632(var21 * var36 >> 12, var30, -59, var24, var26, var28, var27);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V", line = 475)
    public final void method2(byte arg0) {
        this.field1437 = class64.method469(this.field1430, -107);
        this.method631((byte) -123);
        for (int var2 = this.field1438 - 1; var2 >= 1; var2--) {
            short var3 = this.field1444[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1438--;
        }
        int var4 = 125 / ((arg0 - 2) / 37);
        field1441++;
    }
}
