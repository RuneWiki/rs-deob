import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class230 extends class273 {

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "[S")
    private short[] field3703 = new short[257];

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    private int field3711 = 0;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Ls;")
    public static class304 field3713 = new class304(5000);

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "[S")
    public static short[] field3715 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Z")
    public static boolean field3717 = false;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public static int field3720 = 0;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "J")
    public static long field3722;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lng;")
    public static class245 field3714;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "[I")
    private int[] field3702;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "[I")
    private int[] field3719;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "[[I")
    private int[][] field3710;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 6)
    private final void method1575(int arg0) {
        field3706++;
        int[] var2 = this.field3710[1];
        int[] var3 = this.field3710[0];
        int[] var4 = this.field3710[this.field3710.length - 1];
        int[] var5 = this.field3710[this.field3710.length - 2];
        this.field3719 = new int[] { var3[0] + var3[0] - var2[0], -var2[1] - -var3[1] + var3[1] };
        this.field3702 = new int[] { var5[0] + var5[0] - var4[arg0], var5[1] + var5[1] - var4[1] };
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIIIIII)V", line = 27)
    public static final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3705++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg1 - arg7;
        int var12 = arg6 - arg7;
        int var13 = arg1 * arg1;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = var12 * var12;
        int var18 = var13 << 1;
        if (arg0 != -32750) {
            return;
        }
        int var19 = arg6 << 1;
        int var20 = var15 << 1;
        int var21 = (1 - var19) * var13 + var16;
        int var22 = var17 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var23) * var15 + var22;
        int var25 = var14 - ((var19 - 1) * var18);
        int var26 = var17 - ((var23 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 * 3;
        int var30 = var15 << 2;
        int var31 = var22 * 3;
        int var32 = var17 << 2;
        int var33 = (var19 - 3) * var18;
        int var34 = (var23 - 3) * var20;
        int var35 = (arg6 - 1) * var27;
        int var36 = var28;
        int var37 = var32;
        int[] var38 = class175.field2675[arg3];
        class253.method1704(arg2 - arg1, -var11 + arg2, arg4, var38, 7);
        int var39 = (var12 - 1) * var30;
        class253.method1704(arg2 - var11, arg2 + var11, arg5, var38, 7);
        class253.method1704(arg2 + var11, arg2 - -arg1, arg4, var38, 7);
        while (var9 > 0) {
            if (var21 < 0) {
                while (var21 < 0) {
                    var25 += var36;
                    var21 += var29;
                    var8++;
                    var29 += var28;
                    var36 += var28;
                }
            }
            if (var25 < 0) {
                var25 += var36;
                var36 += var28;
                var8++;
                var21 += var29;
                var29 += var28;
            }
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var37;
                        var10++;
                        var37 += var32;
                        var24 += var31;
                        var31 += var32;
                    }
                }
                if (var26 < 0) {
                    var24 += var31;
                    var26 += var37;
                    var10++;
                    var31 += var32;
                    var37 += var32;
                }
                var24 += -var39;
                var26 += -var34;
                var34 -= var30;
                var39 -= var30;
            }
            var9--;
            int var41 = arg3 - var9;
            var21 += -var35;
            var25 += -var33;
            int var42 = arg2 - var8;
            int var43 = arg2 + var8;
            int var44 = arg3 + var9;
            var33 -= var27;
            var35 -= var27;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class253.method1704(var42, var46, arg4, class175.field2675[var41], arg0 + 32757);
                class253.method1704(var46, var45, arg5, class175.field2675[var41], 7);
                class253.method1704(var45, var43, arg4, class175.field2675[var41], 7);
                class253.method1704(var42, var46, arg4, class175.field2675[var44], 7);
                class253.method1704(var46, var45, arg5, class175.field2675[var44], 7);
                class253.method1704(var45, var43, arg4, class175.field2675[var44], 7);
            } else {
                class253.method1704(var42, var43, arg4, class175.field2675[var41], arg0 ^ 0xFFFF8015);
                class253.method1704(var42, var43, arg4, class175.field2675[var44], 7);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILgn;)V", line = 199)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg1 == 0) {
            this.field3711 = arg2.method2043((byte) -121);
            this.field3710 = new int[arg2.method2043((byte) -122)][2];
            for (int var4 = 0; var4 < this.field3710.length; var4++) {
                this.field3710[var4][0] = arg2.method1994(false);
                this.field3710[var4][1] = arg2.method1994(false);
            }
        }
        if (arg0 < 27) {
            this.method331(5, -16);
        }
        field3701++;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V", line = 229)
    public static void method1577(byte arg0) {
        if (arg0 > -43) {
            method1576(26, -79, 54, 84, -119, -59, 115, 42);
        }
        field3715 = null;
        field3714 = null;
        field3713 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[I", line = 241)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            this.method1581(69, -27);
        }
        field3709++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            for (int var5 = 0; var5 < class27.field346; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3703[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(IIIIIIII)V", line = 282)
    public static final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3707++;
        if (class183.method1263(0, arg6)) {
            client.method890(class219.field3487[arg6], arg4, arg1, arg5, arg7, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 295)
    public static final void method1579(int arg0) {
        field3700++;
        if (class144.field2287 != -1) {
            class188.method1295(class144.field2287, arg0 + 32687, -1, -1);
            class144.field2287 = -1;
        }
        if (arg0 != -32769) {
            field3720 = 112;
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 323)
    private final void method1580(int arg0) {
        int var2 = this.field3711;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field3710.length - 1 && this.field3710[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3710[var5 - 1];
                int[] var7 = this.field3710[var5];
                int var8 = this.method1581(var5 - 2, -92)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1581(var5 + 1, -120)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var9 + var11 - var8 - var10;
                int var14 = var8 - var9 - var13;
                int var16 = var10 - var8;
                int var17 = var12 * var12 >> 12;
                int var18 = (var12 * var13 >> 12) * var17 >> 12;
                int var19 = var14 * var17 >> 12;
                int var20 = var12 * var16 >> 12;
                int var21 = var9 + var20 + var18 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3703[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field3710.length - 1) > var24 && var23 >= this.field3710[var24][0]; var24++) {
                }
                int[] var25 = this.field3710[var24 - 1];
                int[] var26 = this.field3710[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class125.field1958[(var27 & 0x1FF1) >> 5] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field3703[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; this.field3710.length - 1 > var33 && this.field3710[var33][0] <= var32; var33++) {
                }
                int[] var34 = this.field3710[var33];
                int[] var35 = this.field3710[var33 - 1];
                int var36 = (var32 - var35[0] << 12) / (var34[0] - var35[0]);
                int var37 = 4096 - var36;
                int var38 = var35[1] * var37 + (var34[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3703[var31] = (short) var38;
            }
        }
        if (arg0 == 8177) {
            field3699++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 494)
    public class230() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 503)
    public final void method349(int arg0) {
        field3712++;
        if (this.field3710 == null) {
            this.field3710 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field3710.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3711 == 2) {
            this.method1575(0);
        }
        class27.method207((byte) -108);
        if (arg0 != 1) {
            field3714 = (class245) null;
        }
        this.method1580(8177);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)[I", line = 526)
    private final int[] method1581(int arg0, int arg1) {
        if (arg1 >= -91) {
            this.method1581(-6, 40);
        }
        field3708++;
        if (arg0 >= 0) {
            return this.field3710.length > arg0 ? this.field3710[arg0] : this.field3702;
        } else {
            return this.field3719;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IB)Lsb;", line = 551)
    public static final class285 method1582(int arg0, byte arg1) {
        class285 var2 = (class285) class132.field2089.method1294((long) arg0, 115);
        field3704++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class318.field4988.method2103(0, 29, arg0);
        class285 var4 = new class285();
        if (var3 != null) {
            var4.method1866(new class303(var3), arg0, (byte) -99);
        }
        class132.field2089.method1292((long) arg0, arg1 - 54, var4);
        return arg1 == -51 ? var4 : (class285) null;
    }
}
