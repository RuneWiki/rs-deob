import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class284 extends class313 {

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field4499 = 4;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "[B")
    private byte[] field4500 = new byte[512];

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public int field4497 = 0;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "Z")
    public boolean field4501 = true;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public int field4510 = 4;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public int field4504 = 1638;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public int field4514 = 4;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field4509 = 0;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4506 = "white:";

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field4508 = 0;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "[S")
    private short[] field4502;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "[S")
    private short[] field4507;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 17)
    public class284() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILpi;)V", line = 24)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            field4509 = 86;
        }
        if (arg0 == 0) {
            this.field4501 = arg2.method2364(-9069) == 1;
        } else if (arg0 == 1) {
            this.field4514 = arg2.method2364(-9069);
        } else if (arg0 == 2) {
            this.field4504 = arg2.method2326(48);
            if (this.field4504 < 0) {
                this.field4502 = new short[this.field4514];
                for (int var5 = 0; var5 < this.field4514; var5++) {
                    this.field4502[var5] = (short) arg2.method2326(-82);
                }
            }
        } else if (arg0 == 3) {
            this.field4510 = this.field4499 = arg2.method2364(-9069);
        } else if (arg0 == 4) {
            this.field4497 = arg2.method2364(-9069);
        } else if (arg0 == 5) {
            this.field4510 = arg2.method2364(-9069);
        } else if (arg0 == 6) {
            this.field4499 = arg2.method2364(arg1 ^ 0x66DB);
        }
        field4505++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[II)V", line = 116)
    public final void method1935(int arg0, int[] arg1, int arg2) {
        field4503++;
        if (arg0 >= -13) {
            return;
        }
        int var4 = class1.field6[arg2] * this.field4499;
        if (this.field4514 == 1) {
            short var5 = this.field4502[0];
            int var6 = this.field4507[0] << 12;
            int var7 = this.field4510 * var6 >> 12;
            int var8 = this.field4499 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = this.field4500[var10 & 0xFF] & 0xFF;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var13 = this.field4500[var11 & 0xFF] & 0xFF;
            int var14 = var9 & 0xFFF;
            int var15 = class331.field5275[var14];
            if (this.field4501) {
                for (int var19 = 0; var19 < class133.field2269; var19++) {
                    int var20 = class8.field104[var19] * this.field4510;
                    int var21 = this.method1940(var12, var7, var14, var6 * var20 >> 12, -27731, var15, var13);
                    int var22 = var5 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class133.field2269; var16++) {
                    int var17 = class8.field104[var16] * this.field4510;
                    int var18 = this.method1940(var12, var7, var14, var6 * var17 >> 12, -27731, var15, var13);
                    arg1[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field4502[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field4507[0] << 12;
            int var25 = var4 * var24 >> 12;
            int var26 = this.field4499 * var24 >> 12;
            int var27 = var25 >> 12;
            int var28 = this.field4510 * var24 >> 12;
            int var29 = var25 & 0xFFF;
            int var30 = class331.field5275[var29];
            int var31 = this.field4500[var27 & 0xFF] & 0xFF;
            int var32 = var27 + 1;
            if (var26 <= var32) {
                var32 = 0;
            }
            int var33 = this.field4500[var32 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class133.field2269; var34++) {
                int var35 = class8.field104[var34] * this.field4510;
                int var36 = this.method1940(var31, var28, var29, var24 * var35 >> 12, -27731, var30, var33);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field4514; var37++) {
            short var38 = this.field4502[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field4507[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field4510 * var39 >> 12;
                int var42 = var40 >> 12;
                int var43 = var40 & 0xFFF;
                int var44 = this.field4499 * var39 >> 12;
                int var45 = var42 + 1;
                int var46 = class331.field5275[var43];
                int var47 = this.field4500[var42 & 0xFF] & 0xFF;
                if (var44 <= var45) {
                    var45 = 0;
                }
                int var48 = this.field4500[var45 & 0xFF] & 0xFF;
                if (this.field4501 && (this.field4514 - 1) == var37) {
                    for (int var49 = 0; var49 < class133.field2269; var49++) {
                        int var50 = class8.field104[var49] * this.field4510;
                        int var51 = this.method1940(var47, var41, var43, var39 * var50 >> 12, -27731, var46, var48);
                        int var52 = arg1[var49] + (var38 * var51 >> 12);
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class133.field2269; var53++) {
                        int var54 = class8.field104[var53] * this.field4510;
                        int var55 = this.method1940(var47, var41, var43, var39 * var54 >> 12, -27731, var46, var48);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 276)
    public static void method1936(byte arg0) {
        field4506 = null;
        if (arg0 >= -10) {
            field4506 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)I", line = 289)
    public static final int method1937(int arg0, int arg1, int arg2) {
        class66 var3 = (class66) class70.field1146.method732((long) arg1, true);
        field4512++;
        if (var3 == null) {
            return 0;
        } else {
            if (arg0 != 2) {
                field4506 = (String) null;
            }
            return arg2 >= 0 && var3.field1071.length > arg2 ? var3.field1071[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[I", line = 320)
    public final int[] method111(int arg0, int arg1) {
        field4498++;
        if (arg0 != 4) {
            this.field4507 = (short[]) null;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            this.method1935(-83, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIII)V", line = 341)
    public static final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4495++;
        if (arg7 != 29067) {
            method1936((byte) 95);
        }
        if (arg5 < 0 || arg1 < 0 || arg5 >= 103 || arg1 >= 103) {
            return;
        }
        if (arg3 == 0) {
            class297 var8 = class269.method1846(arg4, arg5, arg1);
            if (var8 != null) {
                int var9 = (int) (var8.field4732 >>> 32) & Integer.MAX_VALUE;
                if (arg0 == 2) {
                    var8.field4741 = new class71(var9, 2, arg2 + 4, arg4, arg5, arg1, arg6, false, var8.field4741);
                    var8.field4744 = new class71(var9, 2, arg2 + 1 & 0x3, arg4, arg5, arg1, arg6, false, var8.field4744);
                } else {
                    var8.field4741 = new class71(var9, arg0, arg2, arg4, arg5, arg1, arg6, false, var8.field4741);
                }
            }
        }
        if (arg3 == 1) {
            class44 var10 = class100.method870(arg4, arg5, arg1);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field701 >>> 32);
                if (arg0 == 4 || arg0 == 5) {
                    var10.field700 = new class71(var11, 4, arg2, arg4, arg5, arg1, arg6, false, var10.field700);
                } else if (arg0 == 6) {
                    var10.field700 = new class71(var11, 4, arg2 + 4, arg4, arg5, arg1, arg6, false, var10.field700);
                } else if (arg0 == 7) {
                    var10.field700 = new class71(var11, 4, (arg2 + 2 & 0x3) + 4, arg4, arg5, arg1, arg6, false, var10.field700);
                } else if (arg0 == 8) {
                    var10.field700 = new class71(var11, 4, arg2 + 4, arg4, arg5, arg1, arg6, false, var10.field700);
                    var10.field694 = new class71(var11, 4, (arg2 + 2 & 0x3) + 4, arg4, arg5, arg1, arg6, false, var10.field694);
                }
            }
        }
        if (arg3 == 2) {
            class241 var12 = class105.method901(arg4, arg5, arg1);
            if (arg0 == 11) {
                arg0 = 10;
            }
            if (var12 != null) {
                var12.field3940 = new class71((int) (var12.field3936 >>> 32) & Integer.MAX_VALUE, arg0, arg2, arg4, arg5, arg1, arg6, false, var12.field3940);
            }
        }
        if (arg3 == 3) {
            class330 var13 = class132.method1085(arg4, arg5, arg1);
            if (var13 != null) {
                var13.field5257 = new class71(Integer.MAX_VALUE & (int) (var13.field5260 >>> 32), 22, arg2, arg4, arg5, arg1, arg6, false, var13.field5257);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V", line = 443)
    private final void method1939(int arg0) {
        field4496++;
        if (this.field4504 > 0) {
            this.field4502 = new short[this.field4514];
            this.field4507 = new short[this.field4514];
            for (int var2 = 0; var2 < this.field4514; var2++) {
                this.field4502[var2] = (short) ((int) (Math.pow((double) ((float) this.field4504 / 4096.0F), (double) var2) * 4096.0D));
                this.field4507[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4502 != null && this.field4502.length == this.field4514) {
            this.field4507 = new short[this.field4514];
            for (int var3 = 0; var3 < this.field4514; var3++) {
                this.field4507[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 0) {
            this.method182(68);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 494)
    public final void method182(int arg0) {
        field4511++;
        this.field4500 = class170.method1341(this.field4497, (byte) 60);
        this.method1939(0);
        int var2 = this.field4514 - 1;
        if (arg0 != 25833) {
            return;
        }
        while (var2 >= 1) {
            short var3 = this.field4502[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4514--;
            var2--;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIII)I", line = 533)
    private final int method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4513++;
        int var8 = arg2 - 4096;
        int var9 = arg3 >> 12;
        int var10 = var9 + 1;
        if (arg4 != -27731) {
            method1936((byte) -103);
        }
        int var11 = arg3 & 0xFFF;
        if (var10 >= arg1) {
            var10 = 0;
        }
        int var12 = var9 & 0xFF;
        int var13 = var11 - 4096;
        int var14 = var10 & 0xFF;
        int var15 = this.field4500[arg0 + var12] & 0x3;
        int var16;
        if (var15 > 1) {
            var16 = var15 == 2 ? var11 - arg2 : -var11 - arg2;
        } else {
            var16 = var15 == 0 ? arg2 + var11 : -var11 + arg2;
        }
        int var17 = this.field4500[arg0 + var14] & 0x3;
        int var18;
        if (var17 <= 1) {
            var18 = var17 == 0 ? arg2 + var13 : -var13 + arg2;
        } else {
            var18 = var17 == 2 ? var13 - arg2 : -var13 - arg2;
        }
        int var19 = this.field4500[arg6 + var12] & 0x3;
        int var20 = class331.field5275[var11];
        int var21 = var16 + ((var18 - var16) * var20 >> 12);
        int var22;
        if (var19 <= 1) {
            var22 = var19 == 0 ? var8 + var11 : -var11 + var8;
        } else {
            var22 = var19 == 2 ? var11 - var8 : -var8 + -var11;
        }
        int var23 = this.field4500[arg6 + var14] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var13 - var8 : -var13 - var8;
        } else {
            var24 = var23 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var25 = var22 + ((var24 - var22) * var20 >> 12);
        return ((var25 - var21) * arg5 >> 12) + var21;
    }
}
