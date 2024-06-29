import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class101 extends class306 {

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public int field1356 = 0;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public int field1353 = 4;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "Z")
    public boolean field1364 = true;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public int field1359 = 4;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "[B")
    private byte[] field1362 = new byte[512];

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public int field1367 = 1638;

    @OriginalMember(owner = "client!jk", name = "cb", descriptor = "I")
    public int field1374 = 4;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "Lfo;")
    public static class296 field1354 = new class296();

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field1370 = 10;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "Z")
    public static boolean field1371 = false;

    @OriginalMember(owner = "client!jk", name = "db", descriptor = "I")
    public static int field1375 = -1;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "Lnk;")
    public static class16 field1368;

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lnk;")
    public static class16 field1372;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "[S")
    private short[] field1360;

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "[S")
    private short[] field1373;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V", line = 4)
    public final void method43(byte arg0) {
        this.field1362 = class185.method1276(this.field1356, 7390);
        field1361++;
        this.method640(255);
        if (arg0 >= -103) {
            this.field1353 = 93;
        }
        for (int var2 = this.field1359 - 1; var2 >= 1; var2--) {
            short var3 = this.field1373[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1359--;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 36)
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I", line = 42)
    public final int[] method47(int arg0, int arg1) {
        field1357++;
        int[] var3 = this.field4757.method903(arg0, -97);
        if (this.field4757.field1898) {
            this.method641(arg0, var3, -14118);
        }
        if (arg1 != -1546337535) {
            this.method47(-104, -29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V", line = 71)
    public static final void method639(byte arg0) {
        if (arg0 != -123) {
            method639((byte) -27);
        }
        class302.field4709 = null;
        class120.field1666 = null;
        class180.field2702 = null;
        field1363++;
        class201.field3051 = null;
        class315.field4948 = null;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 88)
    private final void method640(int arg0) {
        if (this.field1367 > 0) {
            this.field1360 = new short[this.field1359];
            this.field1373 = new short[this.field1359];
            for (int var3 = 0; var3 < this.field1359; var3++) {
                this.field1373[var3] = (short) ((int) (Math.pow((double) ((float) this.field1367 / 4096.0F), (double) var3) * 4096.0D));
                this.field1360[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1373 != null && this.field1373.length == this.field1359) {
            this.field1360 = new short[this.field1359];
            for (int var2 = 0; var2 < this.field1359; var2++) {
                this.field1360[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field1358++;
        if (arg0 != 255) {
            field1370 = 114;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[II)V", line = 131)
    public final void method641(int arg0, int[] arg1, int arg2) {
        field1365++;
        int var4 = class111.field1553[arg0] * this.field1374;
        if (arg2 != -14118) {
            this.method640(-20);
        }
        if (this.field1359 == 1) {
            int var38 = this.field1360[0] << 12;
            int var39 = this.field1374 * var38 >> 12;
            int var40 = this.field1353 * var38 >> 12;
            short var41 = this.field1373[0];
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = this.field1362[var43 & 0xFF] & 0xFF;
            if (var39 <= var44) {
                var44 = 0;
            }
            int var46 = this.field1362[var44 & 0xFF] & 0xFF;
            int var47 = var42 & 0xFFF;
            int var48 = class95.field1312[var47];
            if (this.field1364) {
                for (int var49 = 0; var49 < class31.field367; var49++) {
                    int var50 = class25.field288[var49] * this.field1353;
                    int var51 = this.method642(var46, var40, var38 * var50 >> 12, -3, var45, var47, var48);
                    int var52 = var41 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class31.field367; var53++) {
                    int var54 = class25.field288[var53] * this.field1353;
                    int var55 = this.method642(var46, var40, var38 * var54 >> 12, -3, var45, var47, var48);
                    arg1[var53] = var41 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field1373[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field1360[0] << 12;
            int var7 = this.field1374 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field1353 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var8 & 0xFFF;
            int var12 = class95.field1312[var11];
            int var13 = var10 + 1;
            if (var7 <= var13) {
                var13 = 0;
            }
            int var14 = this.field1362[var10 & 0xFF] & 0xFF;
            int var15 = this.field1362[var13 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class31.field367; var16++) {
                int var17 = class25.field288[var16] * this.field1353;
                int var18 = this.method642(var15, var9, var6 * var17 >> 12, -3, var14, var11, var12);
                arg1[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field1359; var19++) {
            short var20 = this.field1373[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field1360[var19] << 12;
                int var22 = this.field1353 * var21 >> 12;
                int var23 = this.field1374 * var21 >> 12;
                int var24 = var4 * var21 >> 12;
                int var25 = var24 >> 12;
                int var26 = this.field1362[var25 & 0xFF] & 0xFF;
                int var27 = var24 & 0xFFF;
                int var28 = var25 + 1;
                int var29 = class95.field1312[var27];
                if (var28 >= var23) {
                    var28 = 0;
                }
                int var30 = this.field1362[var28 & 0xFF] & 0xFF;
                if (this.field1364 && this.field1359 - 1 == var19) {
                    for (int var31 = 0; var31 < class31.field367; var31++) {
                        int var32 = class25.field288[var31] * this.field1353;
                        int var33 = this.method642(var30, var22, var21 * var32 >> 12, -3, var26, var27, var29);
                        int var34 = (var20 * var33 >> 12) + arg1[var31];
                        arg1[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class31.field367; var35++) {
                        int var36 = class25.field288[var35] * this.field1353;
                        int var37 = this.method642(var30, var22, var21 * var36 >> 12, arg2 + 14115, var26, var27, var29);
                        arg1[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIII)I", line = 296)
    private final int method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1366++;
        if (arg3 != -3) {
            this.field1356 = 42;
        }
        int var8 = arg2 >> 12;
        int var9 = arg2 & 0xFFF;
        int var10 = var9 - 4096;
        int var11 = class95.field1312[var9];
        int var12 = var8 + 1;
        int var13 = var8 & 0xFF;
        if (var12 >= arg1) {
            var12 = 0;
        }
        int var14 = var12 & 0xFF;
        int var15 = this.field1362[arg4 + var13] & 0x3;
        int var16 = arg5 - 4096;
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? var9 - arg5 : -arg5 + -var9;
        } else {
            var17 = var15 == 0 ? arg5 + var9 : -var9 + arg5;
        }
        int var18 = this.field1362[arg4 + var14] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var10 - arg5 : -arg5 + -var10;
        } else {
            var19 = var18 == 0 ? arg5 + var10 : -var10 + arg5;
        }
        int var20 = this.field1362[arg0 + var13] & 0x3;
        int var21 = ((var19 - var17) * var11 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var9 + var16 : -var9 + var16;
        } else {
            var22 = var20 == 2 ? var9 - var16 : -var9 - var16;
        }
        int var23 = this.field1362[arg0 + var14] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var10 - var16 : -var10 + -var16;
        } else {
            var24 = var23 == 0 ? var10 + var16 : -var10 + var16;
        }
        int var25 = ((var24 - var22) * var11 >> 12) + var22;
        return ((var25 - var21) * arg6 >> 12) + var21;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 371)
    public static void method643(int arg0) {
        if (arg0 != -21573) {
            field1354 = (class296) null;
        }
        field1354 = null;
        field1368 = null;
        field1372 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILlf;I)V", line = 415)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.field1364 = true;
        }
        if (arg2 == 0) {
            this.field1364 = arg1.method1043(true) == 1;
        } else if (arg2 == 1) {
            this.field1359 = arg1.method1043(true);
        } else if (arg2 == 2) {
            this.field1367 = arg1.method1021(arg0 ^ 0x3BE5);
            if (this.field1367 < 0) {
                this.field1373 = new short[this.field1359];
                for (int var5 = 0; var5 < this.field1359; var5++) {
                    this.field1373[var5] = (short) arg1.method1021(-1);
                }
            }
        } else if (arg2 == 3) {
            this.field1353 = this.field1374 = arg1.method1043(true);
        } else if (arg2 == 4) {
            this.field1356 = arg1.method1043(true);
        } else if (arg2 == 5) {
            this.field1353 = arg1.method1043(true);
        } else if (arg2 == 6) {
            this.field1374 = arg1.method1043(true);
        }
        field1355++;
    }
}
