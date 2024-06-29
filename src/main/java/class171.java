import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class171 extends class478 {

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "Z")
    private boolean field1911 = true;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
    private int field1913 = 4096;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "Lsb;")
    public static class305 field1912 = new class305(58, 7);

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)V")
    public static final void method929(int arg0, int arg1) {
        ++field1908;
        class76 var2 = class3.method28(arg0, (byte) 42, arg1);
        var2.method406(arg0 ^ -975503967);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field1911 = ~arg1.method620((byte) -127) == -2;
            }
        } else {
            this.field1913 = arg1.method643((byte) -77);
        }
        ++field1907;
        if (arg0 != 255) {
            field1912 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class171() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1910;
        if (arg4 != 1) {
            method929(-37, -2);
        }
        if (~arg2 == ~arg7 && ~arg1 == ~arg5 && arg8 == arg9 && arg0 == arg6) {
            class646.method3617(arg3, arg6, (byte) -92, arg5, arg2, arg8);
        } else {
            int var10 = arg2;
            int var11 = arg5;
            int var12 = arg2 * 3;
            int var13 = arg5 * 3;
            int var14 = arg7 * 3;
            int var15 = arg1 * 3;
            int var16 = arg9 * 3;
            int var17 = arg0 * 3;
            int var18 = arg8 + var14 + -var16 + -arg2;
            int var19 = -var17 + arg6 - -var15 + -arg5;
            int var20 = -var14 + var16 - var14 + var12;
            int var21 = -var15 + var17 - -var13 + -var15;
            int var22 = -var12 + var14;
            int var23 = var15 - var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg2;
                int var34 = arg5 - -(var30 + var32 + var28 >> 12);
                class646.method3617(arg3, var34, (byte) -92, var11, var10, var33);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field1909;
        if (!arg0) {
            method932(-37);
        }
        int[][] var3 = super.field6889.method2091(-121, arg1);
        if (super.field6889.field4765) {
            int[] var4 = this.method2752(class156.field1746 & arg1 + -1, 86, 0);
            int[] var5 = this.method2752(arg1, -35, 0);
            int[] var6 = this.method2752(class156.field1746 & arg1 + 1, 95, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class436.field6154; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field1913;
                int var12 = (var5[var10 + 1 & class204.field2414] + -var5[class204.field2414 & var10 + -1]) * this.field1913;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field1911) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method931(int arg0, boolean arg1, String arg2) {
        int var3 = -79 % ((3 - arg0) / 59);
        ++field1905;
        class538.method3032(arg2, arg1, 256, -1, -1);
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public static void method932(int arg0) {
        field1912 = null;
        if (arg0 != 16777216) {
            field1900 = -82;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIILtq;Ltq;)V")
    public static final void method933(int arg0, int arg1, int arg2, class94 arg3, class94 arg4) {
        class499 var5 = class472.method2722(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7231 = arg3;
            var5.field7228 = arg4;
            int var6 = class666.field9303 == class156.field1743 ? 1 : 0;
            if (arg3.method180(-1)) {
                if (arg3.method177(-111)) {
                    class13.field115[var6][class635.field8946[var6]++] = arg3;
                } else {
                    class469.field6711[var6][class321.field3949[var6]++] = arg3;
                }
            } else {
                class476.field6867[var6][class701.field9822[var6]++] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method180(-1)) {
                    if (arg4.method177(-116)) {
                        class13.field115[var6][class635.field8946[var6]++] = arg4;
                        return;
                    }
                    class469.field6711[var6][class321.field3949[var6]++] = arg4;
                    return;
                }
                class476.field6867[var6][class701.field9822[var6]++] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBI)Lsp;")
    public static final class677 method934(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 122) {
            return null;
        } else {
            ++field1902;
            class499 var4 = class487.field7044[arg1][arg0][arg3];
            if (var4 == null) {
                return null;
            } else {
                class677 var5 = null;
                int var6 = -1;
                for (class245 var7 = var4.field7215; var7 != null; var7 = var7.field3027) {
                    class613 var8 = var7.field3029;
                    if (var8 instanceof class677) {
                        class677 var9 = (class677) var8;
                        int var10 = 252 + -256 + var9.method1414(-31789) * 256;
                        int var11 = -var10 + var9.field5179 >> 9;
                        int var12 = var9.field5176 - var10 >> 9;
                        int var13 = var9.field5179 + var10 >> 9;
                        int var14 = var9.field5176 + var10 >> 9;
                        if (~arg0 <= ~var11 && ~arg3 <= ~var12 && ~var13 <= ~arg0 && ~arg3 >= ~var14) {
                            int var15 = (var14 + 1 - arg3) * (-arg0 + var13 + 1);
                            if (~var15 < ~var6) {
                                var5 = var9;
                                var6 = var15;
                            }
                        }
                    }
                }
                return var5;
            }
        }
    }
}
