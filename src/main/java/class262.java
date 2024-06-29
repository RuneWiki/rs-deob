import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class262 extends class270 {

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "I")
    public int field4410 = 4;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public int field4400 = 4;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "[B")
    private byte[] field4397 = new byte[512];

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "Z")
    public boolean field4416 = true;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public int field4413 = 0;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public int field4399 = 4;

    @OriginalMember(owner = "client!ge", name = "tb", descriptor = "I")
    public int field4423 = 1638;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[I")
    public static int[] field4398 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lmh;")
    public static class62 field4403 = class201.method1405(true, "");

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public static int field4407 = -1;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "F")
    public static float field4408;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "[S")
    private short[] field4415;

    @OriginalMember(owner = "client!ge", name = "ub", descriptor = "[S")
    private short[] field4424;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 4)
    public static void method1809(int arg0) {
        if (arg0 == -18238) {
            field4398 = null;
            field4403 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmi;II)V", line = 17)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = -3 % ((-arg2 - 8) / 53);
        if (arg1 == 0) {
            this.field4416 = arg0.method702(-1) == 1;
        } else if (arg1 == 1) {
            this.field4399 = arg0.method702(-1);
        } else if (arg1 == 2) {
            this.field4423 = arg0.method699((byte) -43);
            if (this.field4423 < 0) {
                this.field4424 = new short[this.field4399];
                for (int var6 = 0; var6 < this.field4399; var6++) {
                    this.field4424[var6] = (short) arg0.method699((byte) -69);
                }
            }
        } else if (arg1 == 3) {
            this.field4410 = this.field4400 = arg0.method702(-1);
        } else if (arg1 == 4) {
            this.field4413 = arg0.method702(-1);
        } else if (arg1 == 5) {
            this.field4410 = arg0.method702(-1);
        } else if (arg1 == 6) {
            this.field4400 = arg0.method702(-1);
        }
        field4402++;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 106)
    private final void method1810(int arg0) {
        if (this.field4423 > 0) {
            this.field4415 = new short[this.field4399];
            this.field4424 = new short[this.field4399];
            for (int var3 = 0; var3 < this.field4399; var3++) {
                this.field4424[var3] = (short) ((int) (Math.pow((double) ((float) this.field4423 / 4096.0F), (double) var3) * 4096.0D));
                this.field4415[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field4424 != null && this.field4424.length == this.field4399) {
            this.field4415 = new short[this.field4399];
            for (int var2 = 0; var2 < this.field4399; var2++) {
                this.field4415[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field4409++;
        if (arg0 > -90) {
            method1814(-107, -99, 72, false, -43, -10, -13, -68, 66, 0, 111, -85, -128);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)Lmh;", line = 147)
    public static final class62 method1811(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg1;
        field4419++;
        if (var3 < -9) {
            return class199.field3351;
        } else if (var3 < -6) {
            return class143.field2281;
        } else if (var3 < -3) {
            return class148.field2329;
        } else if (var3 < 0) {
            return class244.field4155;
        } else if (var3 > 9) {
            return class36.field478;
        } else if (var3 <= 6) {
            if (arg0 != 3040) {
                method1811(96, 57, -33);
            }
            if (var3 <= 3) {
                return var3 > 0 ? class208.field3530 : class225.field3920;
            } else {
                return class266.field4493;
            }
        } else {
            return class32.field438;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI[I)V", line = 190)
    public final void method1812(byte arg0, int arg1, int[] arg2) {
        if (arg0 != -15) {
            this.field4415 = (short[]) null;
        }
        field4421++;
        int var4 = class166.field2702[arg1] * this.field4400;
        if (this.field4399 == 1) {
            short var38 = this.field4424[0];
            int var39 = this.field4415[0] << 12;
            int var40 = this.field4400 * var39 >> 12;
            int var41 = this.field4410 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = this.field4397[var43 & 0xFF] & 0xFF;
            int var45 = var43 + 1;
            int var46 = var42 & 0xFFF;
            if (var40 <= var45) {
                var45 = 0;
            }
            int var47 = this.field4397[var45 & 0xFF] & 0xFF;
            int var48 = class306.field5246[var46];
            if (this.field4416) {
                for (int var52 = 0; var52 < class109.field1770; var52++) {
                    int var53 = class283.field4840[var52] * this.field4410;
                    int var54 = this.method1817(var48, var41, 110, var39 * var53 >> 12, var46, var47, var44);
                    int var55 = var38 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class109.field1770; var49++) {
                    int var50 = class283.field4840[var49] * this.field4410;
                    int var51 = this.method1817(var48, var41, -83, var39 * var50 >> 12, var46, var47, var44);
                    arg2[var49] = var38 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field4424[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field4415[0] << 12;
            int var7 = this.field4410 * var6 >> 12;
            int var8 = this.field4400 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = this.field4397[var10 & 0xFF] & 0xFF;
            int var12 = var9 & 0xFFF;
            int var13 = class306.field5246[var12];
            int var14 = var10 + 1;
            if (var14 >= var8) {
                var14 = 0;
            }
            int var15 = this.field4397[var14 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class109.field1770; var16++) {
                int var17 = class283.field4840[var16] * this.field4410;
                int var18 = this.method1817(var13, var7, -67, var6 * var17 >> 12, var12, var15, var11);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field4399; var19++) {
            short var20 = this.field4424[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field4415[var19] << 12;
                int var22 = this.field4410 * var21 >> 12;
                int var23 = var4 * var21 >> 12;
                int var24 = var23 >> 12;
                int var25 = var24 + 1;
                int var26 = this.field4400 * var21 >> 12;
                int var27 = var23 & 0xFFF;
                if (var25 >= var26) {
                    var25 = 0;
                }
                int var28 = class306.field5246[var27];
                int var29 = this.field4397[var25 & 0xFF] & 0xFF;
                int var30 = this.field4397[var24 & 0xFF] & 0xFF;
                if (this.field4416 && (this.field4399 - 1) == var19) {
                    for (int var31 = 0; var31 < class109.field1770; var31++) {
                        int var32 = class283.field4840[var31] * this.field4410;
                        int var33 = this.method1817(var28, var22, -54, var21 * var32 >> 12, var27, var29, var30);
                        int var34 = (var20 * var33 >> 12) + arg2[var31];
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class109.field1770; var35++) {
                        int var36 = class283.field4840[var35] * this.field4410;
                        int var37 = this.method1817(var28, var22, 92, var21 * var36 >> 12, var27, var29, var30);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(B)V", line = 366)
    public static final void method1813(byte arg0) {
        class110.field1774.method1392(arg0 - 73);
        if (arg0 != 73) {
            method1818((class161) null, 93);
        }
        field4418++;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 381)
    public class262() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIZIIIIIIIII)Z", line = 407)
    public static final boolean method1814(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class278.field4767[var13][var14] = 0;
                class159.field2566[var13][var14] = 99999999;
            }
        }
        class278.field4767[arg11][arg5] = 99;
        class159.field2566[arg11][arg5] = 0;
        int var15 = arg11;
        field4411++;
        int var16 = arg5;
        if (arg12 <= 16) {
            return true;
        }
        byte var17 = 0;
        int var18 = 0;
        boolean var19 = false;
        class92.field1468[var17] = arg11;
        int var41 = var17 + 1;
        class182.field2900[var17] = arg5;
        int[][] var20 = class250.field4244[class7.field85].field3756;
        label389: while (var41 != var18) {
            var16 = class182.field2900[var18];
            var15 = class92.field1468[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg10 == var15 && arg2 == var16) {
                var19 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class250.field4244[class7.field85].method1553(arg9 - 1, arg8, (byte) -119, arg7, arg2, arg10, var16, var15)) {
                    var19 = true;
                    break;
                }
                if (arg9 < 10 && class250.field4244[class7.field85].method1556(arg2, arg8, var15, arg9 - 1, arg7, arg10, var16, -1)) {
                    var19 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg4 != 0 && class250.field4244[class7.field85].method1549(arg10, arg8, arg4, 0, arg0, var15, arg6, var16, arg2)) {
                var19 = true;
                break;
            }
            int var21 = class159.field2566[var15][var16] + 1;
            if (var15 > 0 && class278.field4767[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][var16 - (1 - arg8)] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg8 - 1) {
                        class92.field1468[var41] = var15 - 1;
                        class182.field2900[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class278.field4767[var15 - 1][var16] = 2;
                        class159.field2566[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class278.field4767[var15 + 1][var16] == 0 && (var20[arg8 + var15][var16] & 0x12C0183) == 0 && (var20[arg8 + var15][arg8 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= (arg8 - 1)) {
                        class92.field1468[var41] = var15 + 1;
                        class182.field2900[var41] = var16;
                        class278.field4767[var15 + 1][var16] = 8;
                        class159.field2566[var15 + 1][var16] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg8 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class278.field4767[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg8 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg8 - 1) {
                        class92.field1468[var41] = var15;
                        class182.field2900[var41] = var16 - 1;
                        class278.field4767[var15][var16 - 1] = 1;
                        class159.field2566[var15][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class278.field4767[var15][var16 + 1] == 0 && (var20[var15][arg8 + var16] & 0x12C0138) == 0 && (var20[var15 + arg8 - 1][arg8 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg8 - 1 <= var25) {
                        class92.field1468[var41] = var15;
                        class182.field2900[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class278.field4767[var15][var16 + 1] = 4;
                        class159.field2566[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg8 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class278.field4767[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 + arg8 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg8 + var15 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg8 - 1) {
                        class92.field1468[var41] = var15 - 1;
                        class182.field2900[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class278.field4767[var15 - 1][var16 - 1] = 3;
                        class159.field2566[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var26 + var16 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class278.field4767[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg8 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[var15 + arg8][arg8 + var16 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if ((arg8 - 1) <= var27) {
                        class92.field1468[var41] = var15 + 1;
                        class182.field2900[var41] = var16 - 1;
                        class278.field4767[var15 + 1][var16 - 1] = 9;
                        class159.field2566[var15 + 1][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + arg8][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class278.field4767[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg8 + var16] & 0x12C0138) == 0 && (var20[var15][var16 + arg8] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg8 - 1 <= var28) {
                        class92.field1468[var41] = var15 - 1;
                        class182.field2900[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class278.field4767[var15 - 1][var16 + 1] = 6;
                        class159.field2566[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg8 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class278.field4767[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg8 + var16] & 0x12C0138) == 0 && (var20[arg8 + var15][arg8 + var16] & 0x12C01E0) == 0 && (var20[var15 + arg8][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg8 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg8 + var16] & 0x12C01F8) != 0 || (var20[arg8 + var15][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label389;
                    }
                }
                class92.field1468[var41] = var15 + 1;
                class182.field2900[var41] = var16 + 1;
                var41 = var41 + 1 & 0xFFF;
                class278.field4767[var15 + 1][var16 + 1] = 12;
                class159.field2566[var15 + 1][var16 + 1] = var21;
            }
        }
        class69.field1059 = 0;
        if (!var19) {
            if (!arg3) {
                return false;
            }
            int var30 = 100;
            int var31 = 1000;
            byte var32 = 10;
            for (int var33 = arg10 - var32; var33 <= arg10 + var32; var33++) {
                for (int var34 = arg2 - var32; var34 <= arg2 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class159.field2566[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg10) {
                            var35 = arg10 - var33;
                        } else if ((arg10 + arg0 - 1) < var33) {
                            var35 = var33 + 1 - arg10 - arg0;
                        }
                        int var36 = 0;
                        if (arg2 > var34) {
                            var36 = arg2 - var34;
                        } else if (var34 > arg2 + arg4 - 1) {
                            var36 = var34 + 1 - arg2 - arg4;
                        }
                        int var37 = var35 * var35 + (var36 * var36);
                        if (var37 < var31 || var31 == var37 && class159.field2566[var33][var34] < var30) {
                            var31 = var37;
                            var16 = var34;
                            var30 = class159.field2566[var33][var34];
                            var15 = var33;
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg11 == var15 && arg5 == var16) {
                return false;
            }
            class69.field1059 = 1;
        }
        byte var38 = 0;
        class92.field1468[var38] = var15;
        int var42 = var38 + 1;
        class182.field2900[var38] = var16;
        int var39;
        int var40 = var39 = class278.field4767[var15][var16];
        while (arg11 != var15 || arg5 != var16) {
            if (var39 != var40) {
                class92.field1468[var42] = var15;
                class182.field2900[var42++] = var16;
                var39 = var40;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class278.field4767[var15][var16];
        }
        if (var42 > 0) {
            class304.method2082(arg1, (byte) -113, var42);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V", line = 916)
    public static final void method1815(int arg0, int arg1, byte arg2) {
        field4412++;
        class52 var3 = class7.field72[class7.field85][arg1][arg0];
        if (var3 == null) {
            class235.method1656(class7.field85, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class301 var5 = null;
        for (class301 var6 = (class301) var3.method334(arg2 - 18596); var6 != null; var6 = (class301) var3.method335((byte) 121)) {
            class37 var7 = class189.method1320(0, var6.field5187.field629);
            int var8 = var7.field538;
            if (var7.field528 == 1) {
                var8 = (var6.field5187.field620 + 1) * var8;
            }
            if (var4 < var8) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class235.method1656(class7.field85, arg1, arg0);
            return;
        }
        var3.method338(var5, arg2 + 76);
        class301 var9 = (class301) var3.method334(arg2 ^ 0x48BC);
        class41 var10 = null;
        class41 var11 = null;
        while (var9 != null) {
            class41 var12 = var9.field5187;
            if (var5.field5187.field629 != var12.field629) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field629 != var12.field629 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class301) var3.method335((byte) 81);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        if (arg2 != -77) {
            field4407 = -119;
        }
        class153.method1099(class7.field85, arg1, arg0, class165.method1186((byte) -58, arg0 * 128 + 64, arg1 * 128 + 64, class7.field85), var5.field5187, var13, var10, var11);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V", line = 1007)
    public static final void method1816(int arg0) {
        if (arg0 >= -40) {
            return;
        }
        field4417++;
        for (int var1 = 0; var1 < class133.field2163; var1++) {
            int var2 = class288.field4914[var1];
            class204 var3 = class301.field5186[var2];
            if (var3 != null) {
                class98.method786(var3, -118, var3.field3435.field4714);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII)I", line = 1037)
    private final int method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4414++;
        int var8 = arg4 - 4096;
        int var9 = arg3 >> 12;
        int var10 = arg3 & 0xFFF;
        int var11 = 126 / ((arg2 - 10) / 63);
        int var12 = var9 + 1;
        int var13 = class306.field5246[var10];
        if (arg1 <= var12) {
            var12 = 0;
        }
        int var14 = var12 & 0xFF;
        int var15 = var9 & 0xFF;
        int var16 = var10 - 4096;
        int var17 = this.field4397[arg6 + var15] & 0x3;
        int var18;
        if (var17 <= 1) {
            var18 = var17 == 0 ? arg4 + var10 : -var10 + arg4;
        } else {
            var18 = var17 == 2 ? var10 - arg4 : -arg4 + -var10;
        }
        int var19 = this.field4397[arg6 + var14] & 0x3;
        int var20;
        if (var19 > 1) {
            var20 = var19 == 2 ? var16 - arg4 : -var16 - arg4;
        } else {
            var20 = var19 == 0 ? arg4 + var16 : -var16 + arg4;
        }
        int var21 = ((var20 - var18) * var13 >> 12) + var18;
        int var22 = this.field4397[var15 + arg5] & 0x3;
        int var23;
        if (var22 <= 1) {
            var23 = var22 == 0 ? var8 + var10 : -var10 + var8;
        } else {
            var23 = var22 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var24 = this.field4397[arg5 + var14] & 0x3;
        int var25;
        if (var24 > 1) {
            var25 = var24 == 2 ? var16 - var8 : -var16 - var8;
        } else {
            var25 = var24 == 0 ? var16 + var8 : var8 - var16;
        }
        int var26 = ((var25 - var23) * var13 >> 12) + var23;
        return ((var26 - var21) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)V", line = 1119)
    public final void method231(byte arg0) {
        field4406++;
        this.field4397 = class199.method1394(this.field4413, 0);
        if (arg0 != 90) {
            return;
        }
        this.method1810(-114);
        for (int var2 = this.field4399 - 1; var2 >= 1; var2--) {
            short var3 = this.field4424[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4399--;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lei;I)V", line = 1150)
    public static final void method1818(class161 arg0, int arg1) {
        class174.method1236(true, arg0, 200000);
        field4405++;
        int var2 = -54 % ((-arg1 - 60) / 52);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I", line = 1162)
    public final int[] method6(int arg0, int arg1) {
        field4422++;
        if (arg0 != 18693) {
            return (int[]) null;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            this.method1812((byte) -15, arg1, var3);
        }
        return var3;
    }
}
