import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class266 extends class53 {

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field4588 = 0;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILja;Z)V", line = 4)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field880 = arg1.method501(0) == 1;
        }
        if (!arg2) {
            field4586 = 77;
        }
        field4587++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V", line = 23)
    public static final void method1889(int arg0, byte arg1) {
        if (arg1 > -114) {
            field4588 = 72;
        }
        field4583++;
        class156 var2 = class206.method1525(9, -32701, arg0);
        var2.method1184((byte) 87);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[I", line = 36)
    public final int[] method59(int arg0, int arg1) {
        int[] var3 = this.field878.method1603(arg1, (byte) 127);
        if (arg0 != -15196) {
            field4590 = -67;
        }
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, arg1);
            int[] var5 = this.method391(1, 0, arg1);
            int[] var6 = this.method391(2, 0, arg1);
            for (int var7 = 0; var7 < class269.field4644; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        field4585++;
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 91)
    public static final void method1890(int arg0) {
        field4584++;
        class212 var1 = (class212) class311.field5302.method1250(true);
        if (arg0 != 23347) {
            return;
        }
        while (var1 != null) {
            class246 var2 = var1.field3608;
            if (class67.field1174 != var2.field4170 || class143.field2463 > var2.field4157) {
                var1.method1527(-117);
            } else if (var2.field4167 <= class143.field2463) {
                if (var2.field4158 > 0) {
                    class295 var3 = class35.field521[var2.field4158 - 1];
                    if (var3 != null && var3.field3259 >= 0 && var3.field3259 < 13312 && var3.field3218 >= 0 && var3.field3218 < 13312) {
                        var2.method1777(1, var3.field3259, class143.field2463, var3.field3218, class32.method217(var3.field3259, var3.field3218, true, var2.field4170) - var2.field4133);
                    }
                }
                if (var2.field4158 < 0) {
                    int var4 = -var2.field4158 - 1;
                    class96 var5;
                    if (class88.field1460 == var4) {
                        var5 = class279.field4831;
                    } else {
                        var5 = class169.field2842[var4];
                    }
                    if (var5 != null && var5.field3259 >= 0 && var5.field3259 < 13312 && var5.field3218 >= 0 && var5.field3218 < 13312) {
                        var2.method1777(arg0 ^ 0x5B32, var5.field3259, class143.field2463, var5.field3218, class32.method217(var5.field3259, var5.field3218, true, var2.field4170) - var2.field4133);
                    }
                }
                var2.method1781((byte) -123, class250.field4208);
                class213.method1571(class67.field1174, (int) var2.field4132, (int) var2.field4134, (int) var2.field4148, 60, var2, var2.field4161, -1L, false);
            }
            var1 = (class212) class311.field5302.method1256((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[[I", line = 146)
    public final int[][] method66(int arg0, int arg1) {
        field4589++;
        int var3 = 54 % ((76 - arg1) / 42);
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[] var5 = this.method391(2, 0, arg0);
            int[][] var6 = this.method388(117, 0, arg0);
            int[][] var7 = this.method388(119, 1, arg0);
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var7[0];
            int[] var14 = var6[2];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class269.field4644; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var8[var17] = var11[var17];
                    var10[var17] = var12[var17];
                    var9[var17] = var14[var17];
                } else if (var18 == 0) {
                    var8[var17] = var13[var17];
                    var10[var17] = var15[var17];
                    var9[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var8[var17] = var11[var17] * var18 + var13[var17] * var19 >> 12;
                    var10[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                    var9[var17] = var14[var17] * var18 + (var16[var17] * var19) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 227)
    public class266() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Ljf;", line = 266)
    public static final class215 method1891(byte arg0, int arg1) {
        field4592++;
        class215 var2 = (class215) class41.field655.method1193((long) arg1, arg0 + 190);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -96) {
            method1891((byte) 0, 72);
        }
        byte[] var3 = class176.field2956.method1911(1, arg1, -89);
        class215 var4 = new class215();
        if (var3 != null) {
            var4.method1586(arg0 ^ 0xFFFFFFA4, arg1, new class60(var3));
        }
        class41.field655.method1194(var4, (long) arg1, false);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIBII)V", line = 291)
    public static final void method1892(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4591++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg3 - arg7;
        int var13 = var11 * var11;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var14 << 1;
        int var17 = arg2 * arg2;
        int var18 = var17 << 1;
        int var19 = var15 << 1;
        int var20 = arg3 << 1;
        int var21 = var12 << 1;
        int var22 = -119 % ((-arg5 - 39) / 48);
        int var23 = var13 << 1;
        int var24 = (1 - var20) * var17 + var16;
        int var25 = var15 - (var21 - 1) * var23;
        int var26 = var14 - ((var20 - 1) * var18);
        int var27 = (1 - var21) * var13 + var19;
        int var28 = var14 << 2;
        int var29 = var17 << 2;
        int var30 = var15 << 2;
        int var31 = var13 << 2;
        int var32 = var16 * 3;
        int var33 = (var21 - 3) * var23;
        int var34 = (var20 - 3) * var18;
        int var35 = var19 * 3;
        int var36 = var28;
        int var37 = (arg3 - 1) * var29;
        int var38 = var30;
        int var39 = (var12 - 1) * var31;
        int[] var40 = class63.field1096[arg4];
        class150.method1151(7, var40, arg6 - arg2, arg1, arg6 - var11);
        class150.method1151(7, var40, arg6 - var11, arg0, arg6 + var11);
        class150.method1151(7, var40, arg6 + var11, arg1, arg2 + arg6);
        while (var8 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var32;
                    var26 += var36;
                    var32 += var28;
                    var36 += var28;
                    var10++;
                }
            }
            if (var26 < 0) {
                var24 += var32;
                var26 += var36;
                var10++;
                var32 += var28;
                var36 += var28;
            }
            var24 += -var37;
            boolean var41 = var12 >= var8;
            var37 -= var29;
            int var42 = arg6 + var10;
            var8--;
            int var43 = arg4 + var8;
            var26 += -var34;
            if (var41) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var9++;
                        var25 += var38;
                        var27 += var35;
                        var35 += var30;
                        var38 += var30;
                    }
                }
                if (var25 < 0) {
                    var25 += var38;
                    var9++;
                    var38 += var30;
                    var27 += var35;
                    var35 += var30;
                }
                var27 += -var39;
                var39 -= var31;
                var25 += -var33;
                var33 -= var31;
            }
            int var44 = arg4 - var8;
            var34 -= var29;
            int var45 = arg6 - var10;
            if (var41) {
                int var46 = arg6 + var9;
                int var47 = arg6 - var9;
                class150.method1151(7, class63.field1096[var44], var45, arg1, var47);
                class150.method1151(7, class63.field1096[var44], var47, arg0, var46);
                class150.method1151(7, class63.field1096[var44], var46, arg1, var42);
                class150.method1151(7, class63.field1096[var43], var45, arg1, var47);
                class150.method1151(7, class63.field1096[var43], var47, arg0, var46);
                class150.method1151(7, class63.field1096[var43], var46, arg1, var42);
            } else {
                class150.method1151(7, class63.field1096[var44], var45, arg1, var42);
                class150.method1151(7, class63.field1096[var43], var45, arg1, var42);
            }
        }
    }
}
