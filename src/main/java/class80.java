import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class80 extends class183 {

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public int field1448 = 1638;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    public int field1451 = 0;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "Z")
    public boolean field1455 = true;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    public int field1449 = 4;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "I")
    public int field1450 = 4;

    @OriginalMember(owner = "client!vl", name = "mb", descriptor = "[B")
    private byte[] field1465 = new byte[512];

    @OriginalMember(owner = "client!vl", name = "gb", descriptor = "I")
    public int field1459 = 4;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "I")
    public static int field1457 = 0;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    public static int field1446 = 0;

    @OriginalMember(owner = "client!vl", name = "hb", descriptor = "[Lqg;")
    public static class244[] field1460 = new class244[4];

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!vl", name = "fb", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!vl", name = "lb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!vl", name = "nb", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!vl", name = "ob", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "Lek;")
    public static class185 field1447;

    @OriginalMember(owner = "client!vl", name = "ib", descriptor = "[S")
    private short[] field1461;

    @OriginalMember(owner = "client!vl", name = "jb", descriptor = "[S")
    private short[] field1462;

    @OriginalMember(owner = "client!vl", name = "kb", descriptor = "[[[B")
    public static byte[][][] field1463;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)V", line = 5)
    private final void method565(boolean arg0) {
        if (!arg0) {
            field1447 = (class185) null;
        }
        field1452++;
        if (this.field1448 > 0) {
            this.field1462 = new short[this.field1459];
            this.field1461 = new short[this.field1459];
            for (int var2 = 0; var2 < this.field1459; var2++) {
                this.field1462[var2] = (short) ((int) (Math.pow((double) ((float) this.field1448 / 4096.0F), (double) var2) * 4096.0D));
                this.field1461[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1462 != null && this.field1462.length == this.field1459) {
            this.field1461 = new short[this.field1459];
            for (int var3 = 0; var3 < this.field1459; var3++) {
                this.field1461[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 46)
    public final void method25(int arg0) {
        field1454++;
        this.field1465 = class308.method2098(2, this.field1451);
        this.method565(true);
        if (arg0 != -8) {
            field1463 = (byte[][][]) ((byte[][][]) null);
        }
        for (int var2 = this.field1459 - 1; var2 >= 1; var2--) {
            short var3 = this.field1462[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1459--;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 189)
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILkh;I)V", line = 80)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field1458++;
        if (arg2 == 0) {
            this.field1455 = arg1.method93(false) == 1;
        } else if (arg2 == 1) {
            this.field1459 = arg1.method93(false);
        } else if (arg2 == 2) {
            this.field1448 = arg1.method113((byte) -87);
            if (this.field1448 < 0) {
                this.field1462 = new short[this.field1459];
                for (int var5 = 0; var5 < this.field1459; var5++) {
                    this.field1462[var5] = (short) arg1.method113((byte) -95);
                }
            }
        } else if (arg2 == 3) {
            this.field1449 = this.field1450 = arg1.method93(false);
        } else if (arg2 == 4) {
            this.field1451 = arg1.method93(false);
        } else if (arg2 == 5) {
            this.field1449 = arg1.method93(false);
        } else if (arg2 == 6) {
            this.field1450 = arg1.method93(false);
        }
        if (arg0 >= -43) {
            method566(66, -93, (class185) null, 83);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILek;I)Lkb;", line = 174)
    public static final class35 method566(int arg0, int arg1, class185 arg2, int arg3) {
        field1464++;
        if (arg1 != -9594) {
            method571((byte) -44);
        }
        return class208.method1444(arg3, arg1 ^ 0x4B32, arg0, arg2) ? class158.method1061((byte) -128) : null;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIIIIII)I", line = 195)
    private final int method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1453++;
        int var8 = arg1 >> 12;
        int var9 = arg5 - 4096;
        int var10 = var8 + 1;
        if (var10 >= arg3) {
            var10 = 0;
        }
        int var11 = var10 & 0xFF;
        int var12 = arg1 & 0xFFF;
        if (arg6 > -82) {
            field1446 = -105;
        }
        int var13 = var12 - 4096;
        int var14 = class246.field4367[var12];
        int var15 = var8 & 0xFF;
        int var16 = this.field1465[arg0 + var15] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? var12 + arg5 : -var12 + arg5;
        } else {
            var17 = var16 == 2 ? var12 - arg5 : -arg5 + -var12;
        }
        int var18 = this.field1465[arg0 + var11] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg5 + var13 : -var13 + arg5;
        } else {
            var19 = var18 == 2 ? var13 - arg5 : -arg5 + -var13;
        }
        int var20 = this.field1465[arg2 + var15] & 0x3;
        int var21 = ((var19 - var17) * var14 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var9 + var12 : -var12 + var9;
        } else {
            var22 = var20 == 2 ? var12 - var9 : -var9 + -var12;
        }
        int var23 = this.field1465[arg2 + var11] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var13 - var9 : -var9 + -var13;
        } else {
            var24 = var23 == 0 ? var9 + var13 : -var13 + var9;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var21) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lkh;B)Lsb;", line = 275)
    public static final class111 method568(class14 arg0, byte arg1) {
        int var2 = -43 / ((arg1 + 36) / 39);
        field1456++;
        return new class111(arg0.method113((byte) 32), arg0.method113((byte) -99), arg0.method113((byte) -100), arg0.method113((byte) -102), arg0.method114(0), arg0.method114(0), arg0.method93(false));
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)[I", line = 285)
    public final int[] method10(int arg0, int arg1) {
        field1467++;
        if (arg1 != -1) {
            this.method565(false);
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            this.method569(arg0, var3, arg1 ^ 0xF04521B3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[II)V", line = 318)
    public final void method569(int arg0, int[] arg1, int arg2) {
        field1466++;
        int var4 = class42.field746[arg0] * this.field1450;
        if (arg2 != 263904844) {
            return;
        }
        if (this.field1459 == 1) {
            short var5 = this.field1462[0];
            int var6 = this.field1461[0] << 12;
            int var7 = this.field1450 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field1449 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var8 & 0xFFF;
            int var12 = this.field1465[var10 & 0xFF] & 0xFF;
            int var13 = class246.field4367[var11];
            int var14 = var10 + 1;
            if (var14 >= var7) {
                var14 = 0;
            }
            int var15 = this.field1465[var14 & 0xFF] & 0xFF;
            if (this.field1455) {
                for (int var16 = 0; var16 < class22.field393; var16++) {
                    int var17 = class97.field1737[var16] * this.field1449;
                    int var18 = this.method567(var12, var6 * var17 >> 12, var15, var9, var13, var11, -106);
                    int var19 = var5 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class22.field393; var20++) {
                    int var21 = class97.field1737[var20] * this.field1449;
                    int var22 = this.method567(var12, var6 * var21 >> 12, var15, var9, var13, var11, -98);
                    arg1[var20] = var5 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field1462[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field1461[0] << 12;
            int var25 = this.field1449 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = var26 >> 12;
            int var28 = this.field1450 * var24 >> 12;
            int var29 = this.field1465[var27 & 0xFF] & 0xFF;
            int var30 = var27 + 1;
            int var31 = var26 & 0xFFF;
            int var32 = class246.field4367[var31];
            if (var28 <= var30) {
                var30 = 0;
            }
            int var33 = this.field1465[var30 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class22.field393; var34++) {
                int var35 = class97.field1737[var34] * this.field1449;
                int var36 = this.method567(var29, var24 * var35 >> 12, var33, var25, var32, var31, -120);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field1459; var37++) {
            short var38 = this.field1462[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field1461[var37] << 12;
                int var40 = this.field1449 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field1450 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var41 & 0xFFF;
                int var45 = class246.field4367[var44];
                int var46 = this.field1465[var43 & 0xFF] & 0xFF;
                int var47 = var43 + 1;
                if (var42 <= var47) {
                    var47 = 0;
                }
                int var48 = this.field1465[var47 & 0xFF] & 0xFF;
                if (this.field1455 && this.field1459 - 1 == var37) {
                    for (int var49 = 0; var49 < class22.field393; var49++) {
                        int var50 = class97.field1737[var49] * this.field1449;
                        int var51 = this.method567(var46, var39 * var50 >> 12, var48, var40, var45, var44, -121);
                        int var52 = (var38 * var51 >> 12) + arg1[var49];
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class22.field393; var53++) {
                        int var54 = class97.field1737[var53] * this.field1449;
                        int var55 = this.method567(var46, var39 * var54 >> 12, var48, var40, var45, var44, -119);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIILhg;IJ)Z", line = 477)
    public static final boolean method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class174 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class104.method699(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(B)V", line = 488)
    public static void method571(byte arg0) {
        field1463 = (byte[][][]) null;
        field1447 = null;
        if (arg0 != 26) {
            method571((byte) 67);
        }
        field1460 = null;
    }
}
