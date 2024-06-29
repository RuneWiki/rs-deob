import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class201 extends class120 {

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public int field3215 = 0;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "Z")
    public boolean field3209 = true;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public int field3218 = 4;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    public int field3221 = 4;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    public int field3219 = 4;

    @OriginalMember(owner = "client!pg", name = "pb", descriptor = "I")
    public int field3230 = 1638;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "[B")
    private byte[] field3222 = new byte[512];

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "[I")
    public static int[] field3212 = new int[100];

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "I")
    public static int field3223 = 0;

    @OriginalMember(owner = "client!pg", name = "ob", descriptor = "Lok;")
    private static class41 field3229 = class137.method956("Connected to update server", 45);

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "Lok;")
    public static class41 field3216 = field3229;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!pg", name = "mb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!pg", name = "nb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "Lmh;")
    public static class65 field3220;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "[S")
    private short[] field3210;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "[S")
    private short[] field3225;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Llb;II)V", line = 25)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3209 = arg0.method792(2) == 1;
        } else if (arg2 == 1) {
            this.field3219 = arg0.method792(2);
        } else if (arg2 == 2) {
            this.field3230 = arg0.method771(-74);
            if (this.field3230 < 0) {
                this.field3225 = new short[this.field3219];
                for (int var5 = 0; var5 < this.field3219; var5++) {
                    this.field3225[var5] = (short) arg0.method771(-118);
                }
            }
        } else if (arg2 == 3) {
            this.field3218 = this.field3221 = arg0.method792(arg1 + 3);
        } else if (arg2 == 4) {
            this.field3215 = arg0.method792(2);
        } else if (arg2 == 5) {
            this.field3218 = arg0.method792(arg1 ^ 0xFFFFFFFD);
        } else if (arg2 == 6) {
            this.field3221 = arg0.method792(2);
        }
        field3211++;
        if (arg1 != -1) {
            field3220 = (class65) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 98)
    public final void method31(int arg0) {
        this.field3222 = class146.method1009((byte) -64, this.field3215);
        this.method1425(true);
        if (arg0 != -31851) {
            this.field3222 = (byte[]) null;
        }
        for (int var2 = this.field3219 - 1; var2 >= 1; var2--) {
            short var3 = this.field3225[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3219--;
        }
        field3214++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Llb;B)V", line = 130)
    public static final void method1424(class112 arg0, byte arg1) {
        field3228++;
        int var2 = -1 % ((41 - arg1) / 41);
        while (true) {
            while (arg0.field1607.length > arg0.field1640) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method792(2) == 1) {
                    var5 = arg0.method792(2);
                    var4 = arg0.method792(2);
                    var3 = true;
                }
                int var6 = arg0.method792(2);
                int var7 = arg0.method792(2);
                int var8 = class177.field2876 + class212.field3414 - (var7 * 64) - 1;
                int var9 = var6 * 64 - class120.field1773;
                if (var9 >= 0 && (var8 - 63) >= 0 && (var9 + 63) < class66.field1004 && var8 < class212.field3414) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var12 >= var5 * 8 && var5 * 8 + 8 > var12 && (var4 * 8) <= var13 && var13 < (var4 * 8 + 8)) {
                                byte var14 = arg0.method785((byte) -117);
                                if (var14 != 0) {
                                    if (class277.field4539[var10][var11] == null) {
                                        class277.field4539[var10][var11] = new byte[4096];
                                    }
                                    class277.field4539[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method785((byte) -109);
                                    if (class64.field939[var10][var11] == null) {
                                        class64.field939[var10][var11] = new byte[4096];
                                    }
                                    class64.field939[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method785((byte) -117);
                        if (var17 != 0) {
                            arg0.field1640++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V", line = 223)
    private final void method1425(boolean arg0) {
        if (this.field3230 > 0) {
            this.field3210 = new short[this.field3219];
            this.field3225 = new short[this.field3219];
            for (int var3 = 0; var3 < this.field3219; var3++) {
                this.field3225[var3] = (short) ((int) (Math.pow((double) ((float) this.field3230 / 4096.0F), (double) var3) * 4096.0D));
                this.field3210[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3225 != null && this.field3225.length == this.field3219) {
            this.field3210 = new short[this.field3219];
            for (int var2 = 0; var2 < this.field3219; var2++) {
                this.field3210[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field3227++;
        if (!arg0) {
            this.method1430(-26, (byte) 61, -53, 19, -52, 56, -108);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[II)V", line = 263)
    public final void method1426(int arg0, int[] arg1, int arg2) {
        field3213++;
        int var4 = class16.field216[arg0] * this.field3221;
        int var5 = 46 / ((-arg2) / 61);
        if (this.field3219 == 1) {
            short var39 = this.field3225[0];
            int var40 = this.field3210[0] << 12;
            int var41 = this.field3221 * var40 >> 12;
            int var42 = this.field3218 * var40 >> 12;
            int var43 = var4 * var40 >> 12;
            int var44 = var43 >> 12;
            int var45 = this.field3222[var44 & 0xFF] & 0xFF;
            int var46 = var43 & 0xFFF;
            int var47 = class75.field1117[var46];
            int var48 = var44 + 1;
            if (var48 >= var41) {
                var48 = 0;
            }
            int var49 = this.field3222[var48 & 0xFF] & 0xFF;
            if (this.field3209) {
                for (int var53 = 0; var53 < class307.field5160; var53++) {
                    int var54 = class203.field3278[var53] * this.field3218;
                    int var55 = this.method1430(var40 * var54 >> 12, (byte) -51, var47, var42, var46, var45, var49);
                    int var56 = var39 * var55 >> 12;
                    arg1[var53] = (var56 >> 1) + 2048;
                }
            } else {
                for (int var50 = 0; var50 < class307.field5160; var50++) {
                    int var51 = class203.field3278[var50] * this.field3218;
                    int var52 = this.method1430(var40 * var51 >> 12, (byte) -126, var47, var42, var46, var45, var49);
                    arg1[var50] = var39 * var52 >> 12;
                }
            }
            return;
        }
        short var6 = this.field3225[0];
        if (var6 > 8 || var6 < -8) {
            int var7 = this.field3210[0] << 12;
            int var8 = this.field3218 * var7 >> 12;
            int var9 = var4 * var7 >> 12;
            int var10 = this.field3221 * var7 >> 12;
            int var11 = var9 >> 12;
            int var12 = this.field3222[var11 & 0xFF] & 0xFF;
            int var13 = var9 & 0xFFF;
            int var14 = var11 + 1;
            int var15 = class75.field1117[var13];
            if (var10 <= var14) {
                var14 = 0;
            }
            int var16 = this.field3222[var14 & 0xFF] & 0xFF;
            for (int var17 = 0; var17 < class307.field5160; var17++) {
                int var18 = class203.field3278[var17] * this.field3218;
                int var19 = this.method1430(var7 * var18 >> 12, (byte) -119, var15, var8, var13, var12, var16);
                arg1[var17] = var6 * var19 >> 12;
            }
        }
        for (int var20 = 1; var20 < this.field3219; var20++) {
            short var21 = this.field3225[var20];
            if (var21 > 8 || var21 < -8) {
                int var22 = this.field3210[var20] << 12;
                int var23 = this.field3221 * var22 >> 12;
                int var24 = this.field3218 * var22 >> 12;
                int var25 = var4 * var22 >> 12;
                int var26 = var25 >> 12;
                int var27 = this.field3222[var26 & 0xFF] & 0xFF;
                int var28 = var25 & 0xFFF;
                int var29 = class75.field1117[var28];
                int var30 = var26 + 1;
                if (var30 >= var23) {
                    var30 = 0;
                }
                int var31 = this.field3222[var30 & 0xFF] & 0xFF;
                if (this.field3209 && this.field3219 - 1 == var20) {
                    for (int var32 = 0; var32 < class307.field5160; var32++) {
                        int var33 = class203.field3278[var32] * this.field3218;
                        int var34 = this.method1430(var22 * var33 >> 12, (byte) -68, var29, var24, var28, var27, var31);
                        int var35 = arg1[var32] + (var21 * var34 >> 12);
                        arg1[var32] = (var35 >> 1) + 2048;
                    }
                } else {
                    for (int var36 = 0; var36 < class307.field5160; var36++) {
                        int var37 = class203.field3278[var36] * this.field3218;
                        int var38 = this.method1430(var22 * var37 >> 12, (byte) -125, var29, var24, var28, var27, var31);
                        arg1[var36] += var21 * var38 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V", line = 424)
    public static final void method1427(boolean arg0) {
        if (arg0) {
            class205.field3312 = class207.field3356;
            class278.field4548 = class184.field3008;
            class134.field2010 = class256.field4114;
        } else {
            class205.field3312 = class97.field1425;
            class278.field4548 = class214.field3443;
            class134.field2010 = class236.field3791;
        }
        class308.field5184 = class205.field3312.length;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I", line = 448)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            method1427(false);
        }
        if (this.field1775.field1798) {
            this.method1426(arg0, var3, arg1 + 14884);
        }
        field3224++;
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 640)
    public class201() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)V", line = 478)
    public static void method1428(byte arg0) {
        field3220 = null;
        field3212 = null;
        field3216 = null;
        field3229 = null;
        if (arg0 > -54) {
            method1431(-66, -101, 126, -121);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V", line = 491)
    public static final void method1429(int arg0, int arg1) {
        class98.field1432--;
        field3217++;
        if (class98.field1432 == arg1) {
            return;
        }
        class21.method141(class306.field5129, arg1 + 1, class306.field5129, arg1, class98.field1432 - arg1);
        class21.method141(class203.field3286, arg1 + 1, class203.field3286, arg1, class98.field1432 - arg1);
        class21.method140(class296.field4780, arg1 + 1, class296.field4780, arg1, class98.field1432 - arg1);
        class21.method145(class300.field4872, arg1 + 1, class300.field4872, arg1, class98.field1432 - arg1);
        if (arg0 != 255) {
            field3212 = (int[]) null;
        }
        class21.method146(class123.field1818, arg1 + 1, class123.field1818, arg1, class98.field1432 - arg1);
        class21.method146(class118.field1727, arg1 + 1, class118.field1727, arg1, class98.field1432 - arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBIIIII)I", line = 525)
    private final int method1430(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3208++;
        if (arg1 >= -47) {
            return -80;
        }
        int var8 = arg4 - 4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 0xFFF;
        int var11 = var9 + 1;
        if (arg3 <= var11) {
            var11 = 0;
        }
        int var12 = var10 - 4096;
        int var13 = var11 & 0xFF;
        int var14 = class75.field1117[var10];
        int var15 = var9 & 0xFF;
        int var16 = this.field3222[var15 + arg5] & 0x3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var10 - arg4 : -var10 - arg4;
        } else {
            var17 = var16 == 0 ? arg4 + var10 : arg4 - var10;
        }
        int var18 = this.field3222[arg5 + var13] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg4 + var12 : -var12 + arg4;
        } else {
            var19 = var18 == 2 ? var12 - arg4 : -arg4 + -var12;
        }
        int var20 = this.field3222[var15 + arg6] & 0x3;
        int var21 = ((var19 - var17) * var14 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var10 : -var10 + var8;
        } else {
            var22 = var20 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var23 = this.field3222[arg6 + var13] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        } else {
            var24 = var23 == 0 ? var8 + var12 : -var12 + var8;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var21) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V", line = 609)
    public static final void method1431(int arg0, int arg1, int arg2, int arg3) {
        field3226++;
        if (class1.field3 != 0 && arg1 != 0 && class41.field620 < 50 && arg0 != -1) {
            class18.field227[class41.field620] = arg0;
            class52.field784[class41.field620] = arg1;
            class38.field587[class41.field620] = arg2;
            class271.field4360[class41.field620] = null;
            class38.field595[class41.field620] = 0;
            class41.field620++;
        }
        if (arg3 != -7685) {
            method1431(-114, 60, 33, -115);
        }
    }
}
