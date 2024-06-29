import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class113 extends class326 {

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public int field1563 = 4;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public int field1576 = 4;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public int field1564 = 4;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "Z")
    public boolean field1562 = true;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public int field1584 = 1638;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "[B")
    private byte[] field1574 = new byte[512];

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    public int field1588 = 0;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "S")
    public static short field1567 = 256;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1569 = " ";

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "[Lq;")
    public static class193[] field1570 = new class193[14];

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field1583 = " from your ignore list first.";

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field1585 = -1;

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
    public static int field1590 = 0;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[S")
    private short[] field1579;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "[S")
    private short[] field1582;

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 4)
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Ljava/lang/String;", line = 9)
    public static final String method796(int arg0) {
        field1581++;
        String var1;
        if (class244.field3811 == 1 && class78.field1046 < 2) {
            var1 = class24.field366 + field1569 + class78.field1054 + " ->";
        } else if (class56.field783 && class78.field1046 < 2) {
            var1 = class133.field1957 + field1569 + class249.field3931 + " ->";
        } else if (class191.field3044 && class260.field4093[81] && class78.field1046 > 2) {
            var1 = class207.method1525(8, class78.field1046 - 2);
        } else {
            var1 = class207.method1525(8, class78.field1046 - 1);
        }
        if (~class78.field1046 < arg0) {
            var1 = var1 + "<col=ffffff> / " + (class78.field1046 - 2) + class78.field1044;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V", line = 34)
    public final void method99(byte arg0) {
        this.field1574 = class305.method2114(-256, this.field1588);
        field1572++;
        this.method798(0);
        if (arg0 != 31) {
            this.field1574 = (byte[]) null;
        }
        for (int var2 = this.field1576 - 1; var2 >= 1; var2--) {
            short var3 = this.field1579[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1576--;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 65)
    public static final void method797(boolean arg0) {
        if (!arg0) {
            field1575 = -31;
        }
        field1566++;
        if (class163.field2645 == 2) {
            if (class337.field5281 == class215.field3387 && class57.field812 == class57.field808) {
                class163.field2645 = 0;
                if (class191.field3044 && class260.field4093[81] && class78.field1046 > 2) {
                    class244.method1748(class78.field1046 - 2, -11035);
                } else {
                    class244.method1748(class78.field1046 - 1, -11035);
                }
            }
        } else if (class215.field3387 == class205.field3256 && class57.field812 == class271.field4207) {
            class163.field2645 = 0;
            if (class191.field3044 && class260.field4093[81] && class78.field1046 > 2) {
                class244.method1748(class78.field1046 - 2, -11035);
            } else {
                class244.method1748(class78.field1046 - 1, -11035);
            }
        } else {
            class57.field808 = class271.field4207;
            class337.field5281 = class205.field3256;
            class163.field2645 = 2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V", line = 120)
    private final void method798(int arg0) {
        field1573++;
        if (arg0 < this.field1584) {
            this.field1579 = new short[this.field1576];
            this.field1582 = new short[this.field1576];
            for (int var2 = 0; var2 < this.field1576; var2++) {
                this.field1579[var2] = (short) ((int) (Math.pow((double) ((float) this.field1584 / 4096.0F), (double) var2) * 4096.0D));
                this.field1582[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field1579 != null && this.field1579.length == this.field1576) {
            this.field1582 = new short[this.field1576];
            for (int var3 = 0; var3 < this.field1576; var3++) {
                this.field1582[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I", line = 173)
    public final int[] method103(int arg0, int arg1) {
        field1571++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 >= -25) {
            return (int[]) null;
        } else {
            if (this.field5112.field3583) {
                this.method804(var3, -105, arg1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(JB)V", line = 194)
    public static final void method799(long arg0, byte arg1) {
        field1578++;
        if (arg1 >= -13 || arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class162.field2640; var3++) {
            if (class316.field4982[var3] == arg0) {
                class162.field2640--;
                for (int var4 = var3; var4 < class162.field2640; var4++) {
                    class316.field4982[var4] = class316.field4982[var4 + 1];
                    class281.field4349[var4] = class281.field4349[var4 + 1];
                    class214.field3385[var4] = class214.field3385[var4 + 1];
                }
                class193.field3068++;
                class294.field4555 = class220.field3487;
                class183.field2965.method1947((byte) -109, 86);
                class183.field2965.method53((byte) 116, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(B)I", line = 240)
    public static final int method800(byte arg0) {
        field1561++;
        if (class134.field1966 != null) {
            return 3;
        } else if (class109.field1458 && class9.field172) {
            return 2;
        } else {
            if (arg0 > -1) {
                field1569 = (String) null;
            }
            return class109.field1458 && !class9.field172 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBIII)I", line = 277)
    private final int method801(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1580++;
        int var8 = arg0 - 4096;
        int var9 = arg4 >> 12;
        int var10 = arg4 & 0xFFF;
        if (arg3 != -62) {
            this.field1574 = (byte[]) null;
        }
        int var11 = var10 - 4096;
        int var12 = class243.field3791[var10];
        int var13 = var9 + 1;
        int var14 = var9 & 0xFF;
        int var15 = this.field1574[var14 + arg6] & 0x3;
        int var16;
        if (var15 <= 1) {
            var16 = var15 == 0 ? arg0 + var10 : -var10 + arg0;
        } else {
            var16 = var15 == 2 ? var10 - arg0 : -arg0 + -var10;
        }
        if (arg1 <= var13) {
            var13 = 0;
        }
        int var17 = var13 & 0xFF;
        int var18 = this.field1574[arg6 + var17] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var11 - arg0 : -arg0 + -var11;
        } else {
            var19 = var18 == 0 ? var11 + arg0 : -var11 + arg0;
        }
        int var20 = this.field1574[arg5 + var14] & 0x3;
        int var21 = ((var19 - var16) * var12 >> 12) + var16;
        int var22;
        if (var20 > 1) {
            var22 = var20 == 2 ? var10 - var8 : -var8 + -var10;
        } else {
            var22 = var20 == 0 ? var10 + var8 : var8 - var10;
        }
        int var23 = this.field1574[var17 + arg5] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var11 : var8 - var11;
        } else {
            var24 = var23 == 2 ? var11 - var8 : -var8 + -var11;
        }
        int var25 = ((var24 - var22) * var12 >> 12) + var22;
        return var21 + ((var25 - var21) * arg2 >> 12);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V", line = 351)
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1589++;
        int var7 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg4);
        int var8 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg3);
        int var9 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1);
        int var10 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg2);
        int var11 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg4 + arg6);
        int var12 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg3 - arg6);
        if (arg5 >= -89) {
            return;
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class256.method1853(class284.field4402[var13], var9, arg0, var10, 0);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class256.method1853(class284.field4402[var14], var9, arg0, var10, 0);
        }
        int var15 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + arg6);
        int var16 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg2 - arg6);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class284.field4402[var17];
            class256.method1853(var18, var9, arg0, var15, 0);
            class256.method1853(var18, var16, arg0, var10, 0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[S)[S", line = 408)
    public static final short[] method803(int arg0, short[] arg1) {
        field1587++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        class54.method427(arg1, 0, var2, 0, arg1.length);
        if (arg0 > -45) {
            field1569 = (String) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V", line = 428)
    public final void method804(int[] arg0, int arg1, int arg2) {
        field1586++;
        int var4 = -43 / ((-arg1 - 5) / 39);
        int var5 = class34.field508[arg2] * this.field1563;
        if (this.field1576 == 1) {
            int var6 = this.field1582[0] << 12;
            int var7 = this.field1563 * var6 >> 12;
            short var8 = this.field1579[0];
            int var9 = var5 * var6 >> 12;
            int var10 = this.field1564 * var6 >> 12;
            int var11 = var9 >> 12;
            int var12 = var11 + 1;
            int var13 = this.field1574[var11 & 0xFF] & 0xFF;
            int var14 = var9 & 0xFFF;
            if (var12 >= var7) {
                var12 = 0;
            }
            int var15 = class243.field3791[var14];
            int var16 = this.field1574[var12 & 0xFF] & 0xFF;
            if (this.field1562) {
                for (int var20 = 0; var20 < class166.field2731; var20++) {
                    int var21 = class110.field1527[var20] * this.field1564;
                    int var22 = this.method801(var14, var10, var15, (byte) -62, var6 * var21 >> 12, var16, var13);
                    int var23 = var8 * var22 >> 12;
                    arg0[var20] = (var23 >> 1) + 2048;
                }
            } else {
                for (int var17 = 0; var17 < class166.field2731; var17++) {
                    int var18 = class110.field1527[var17] * this.field1564;
                    int var19 = this.method801(var14, var10, var15, (byte) -62, var6 * var18 >> 12, var16, var13);
                    arg0[var17] = var8 * var19 >> 12;
                }
            }
            return;
        }
        short var24 = this.field1579[0];
        if (var24 > 8 || var24 < -8) {
            int var25 = this.field1582[0] << 12;
            int var26 = var5 * var25 >> 12;
            int var27 = this.field1564 * var25 >> 12;
            int var28 = var26 >> 12;
            int var29 = this.field1574[var28 & 0xFF] & 0xFF;
            int var30 = var28 + 1;
            int var31 = this.field1563 * var25 >> 12;
            if (var31 <= var30) {
                var30 = 0;
            }
            int var32 = this.field1574[var30 & 0xFF] & 0xFF;
            int var33 = var26 & 0xFFF;
            int var34 = class243.field3791[var33];
            for (int var35 = 0; var35 < class166.field2731; var35++) {
                int var36 = class110.field1527[var35] * this.field1564;
                int var37 = this.method801(var33, var27, var34, (byte) -62, var25 * var36 >> 12, var32, var29);
                arg0[var35] = var24 * var37 >> 12;
            }
        }
        for (int var38 = 1; var38 < this.field1576; var38++) {
            short var39 = this.field1579[var38];
            if (var39 > 8 || var39 < -8) {
                int var40 = this.field1582[var38] << 12;
                int var41 = this.field1563 * var40 >> 12;
                int var42 = var5 * var40 >> 12;
                int var43 = this.field1564 * var40 >> 12;
                int var44 = var42 >> 12;
                int var45 = var44 + 1;
                int var46 = this.field1574[var44 & 0xFF] & 0xFF;
                if (var45 >= var41) {
                    var45 = 0;
                }
                int var47 = var42 & 0xFFF;
                int var48 = class243.field3791[var47];
                int var49 = this.field1574[var45 & 0xFF] & 0xFF;
                if (this.field1562 && this.field1576 - 1 == var38) {
                    for (int var50 = 0; var50 < class166.field2731; var50++) {
                        int var51 = class110.field1527[var50] * this.field1564;
                        int var52 = this.method801(var47, var43, var48, (byte) -62, var40 * var51 >> 12, var49, var46);
                        int var53 = arg0[var50] + (var39 * var52 >> 12);
                        arg0[var50] = (var53 >> 1) + 2048;
                    }
                } else {
                    for (int var54 = 0; var54 < class166.field2731; var54++) {
                        int var55 = class110.field1527[var54] * this.field1564;
                        int var56 = this.method801(var47, var43, var48, (byte) -62, var40 * var55 >> 12, var49, var46);
                        arg0[var54] += var39 * var56 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V", line = 595)
    public static void method805(int arg0) {
        field1583 = null;
        if (arg0 >= -57) {
            field1569 = (String) null;
        }
        field1569 = null;
        field1570 = null;
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(B)V", line = 608)
    public static final void method806(byte arg0) {
        class24.field367 = true;
        if (arg0 != -46) {
            field1569 = (String) null;
        }
        field1568++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLvl;)V", line = 625)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field1577++;
        if (arg1) {
            method800((byte) 55);
        }
        if (arg0 == 0) {
            this.field1562 = arg2.method58(-288140008) == 1;
        } else if (arg0 == 1) {
            this.field1576 = arg2.method58(-288140008);
        } else if (arg0 == 2) {
            this.field1584 = arg2.method78((byte) -84);
            if (this.field1584 < 0) {
                this.field1579 = new short[this.field1576];
                for (int var5 = 0; var5 < this.field1576; var5++) {
                    this.field1579[var5] = (short) arg2.method78((byte) -94);
                }
            }
        } else if (arg0 == 3) {
            this.field1564 = this.field1563 = arg2.method58(-288140008);
        } else if (arg0 == 4) {
            this.field1588 = arg2.method58(-288140008);
        } else if (arg0 == 5) {
            this.field1564 = arg2.method58(-288140008);
        } else if (arg0 == 6) {
            this.field1563 = arg2.method58(-288140008);
        }
    }
}
