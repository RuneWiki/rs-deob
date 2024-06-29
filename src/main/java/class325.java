import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class325 extends class125 {

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Lob;")
    public static class521 field4891 = new class521(42, -1);

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "[I")
    public static int[] field4898 = new int[8];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "F")
    public float field4864;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "F")
    public float field4871;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "F")
    public float field4875;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "F")
    public float field4876;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "F")
    public float field4877;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "F")
    public float field4879;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "F")
    public float field4884;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "F")
    public float field4885;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "F")
    public float field4887;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "F")
    public float field4889;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "F")
    public float field4894;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "F")
    public float field4895;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III[I)V")
    public final void method220(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4864 + (float) arg0 * this.field4885 + (float) arg1 * this.field4884 + this.field4889);
        arg3[0] = (int) ((float) arg2 * this.field4871 + (float) arg0 * this.field4877 + (float) arg1 * this.field4879 + this.field4875);
        arg3[1] = (int) ((float) arg2 * this.field4895 + (float) arg0 * this.field4876 + (float) arg1 * this.field4894 + this.field4887);
        field4868++;
    }

    @OriginalMember(owner = "client!qg", name = "xa", descriptor = "()V")
    public final void method209() {
        field4872++;
        this.field4876 = this.field4885 = this.field4879 = this.field4884 = this.field4871 = this.field4895 = this.field4875 = this.field4887 = this.field4889 = 0.0F;
        this.field4877 = this.field4894 = this.field4864 = 1.0F;
    }

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "([I)V")
    public final void method215(int[] arg0) {
        field4897++;
        float var2 = (float) arg0[0] - this.field4875;
        float var3 = (float) arg0[1] - this.field4887;
        float var4 = (float) arg0[2] - this.field4889;
        arg0[0] = (int) (this.field4885 * var4 + this.field4877 * var2 + this.field4876 * var3);
        arg0[2] = (int) (this.field4864 * var4 + this.field4895 * var3 + this.field4871 * var2);
        arg0[1] = (int) (this.field4884 * var4 + this.field4894 * var3 + this.field4879 * var2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method2066(int arg0) {
        if (arg0 != 1711383713) {
            field4898 = null;
        }
        field4898 = null;
        field4891 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()Lc;")
    public final class125 method205() {
        field4890++;
        class325 var1 = new class325();
        var1.field4889 = this.field4889;
        var1.field4875 = this.field4875;
        var1.field4887 = this.field4887;
        var1.field4895 = this.field4895;
        var1.field4876 = this.field4876;
        var1.field4884 = this.field4884;
        var1.field4885 = this.field4885;
        var1.field4864 = this.field4864;
        var1.field4894 = this.field4894;
        var1.field4879 = this.field4879;
        var1.field4871 = this.field4871;
        var1.field4877 = this.field4877;
        return var1;
    }

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "(I)V")
    public final void method219(int arg0) {
        field4899++;
        this.field4877 = 1.0F;
        this.field4894 = this.field4864 = class379.field5727[arg0 & 0x3FFF];
        this.field4884 = class379.field5721[arg0 & 0x3FFF];
        this.field4895 = -this.field4884;
        this.field4879 = this.field4871 = this.field4875 = this.field4876 = this.field4887 = this.field4885 = this.field4889 = 0.0F;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)[F")
    public final float[] method2067(boolean arg0) {
        class448.field6561[0] = this.field4877;
        class448.field6561[13] = 0.0F;
        field4878++;
        class448.field6561[12] = 0.0F;
        class448.field6561[2] = this.field4885;
        class448.field6561[10] = this.field4864;
        class448.field6561[1] = this.field4876;
        class448.field6561[5] = this.field4894;
        class448.field6561[4] = this.field4879;
        class448.field6561[8] = this.field4871;
        class448.field6561[14] = 0.0F;
        class448.field6561[6] = this.field4884;
        class448.field6561[9] = this.field4895;
        return arg0 ? null : class448.field6561;
    }

    @OriginalMember(owner = "client!qg", name = "ra", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.field4894 = 1.0F;
        field4896++;
        this.field4877 = this.field4864 = class379.field5727[arg0 & 0x3FFF];
        this.field4871 = class379.field5721[arg0 & 0x3FFF];
        this.field4885 = -this.field4871;
        this.field4879 = this.field4875 = this.field4876 = this.field4895 = this.field4887 = this.field4884 = this.field4889 = 0.0F;
    }

    @OriginalMember(owner = "client!qg", name = "ka", descriptor = "(I)V")
    public final void method208(int arg0) {
        field4882++;
        float var2 = class379.field5727[arg0 & 0x3FFF];
        float var3 = class379.field5721[arg0 & 0x3FFF];
        float var4 = this.field4876;
        float var5 = this.field4894;
        float var6 = this.field4895;
        this.field4876 = var2 * var4 - (this.field4885 * var3);
        float var7 = this.field4887;
        this.field4885 = this.field4885 * var2 + var3 * var4;
        this.field4894 = var2 * var5 - this.field4884 * var3;
        this.field4884 = this.field4884 * var2 + var3 * var5;
        this.field4895 = var2 * var6 - (this.field4864 * var3);
        this.field4864 = this.field4864 * var2 + var3 * var6;
        this.field4887 = var2 * var7 - this.field4889 * var3;
        this.field4889 = this.field4889 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLuq;)V")
    public static final void method2068(byte arg0, class114 arg1) {
        field4892++;
        if (arg0 != 17 || class225.field3679 != arg1.field1592) {
            return;
        }
        if (class398.field5947.field2660 == null) {
            arg1.field1732 = 0;
            arg1.field1741 = 0;
            return;
        }
        arg1.field1702 = 150;
        arg1.field1674 = (int) (Math.sin((double) class475.field6854 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field1681 = 5;
        arg1.field1732 = class261.field4008;
        arg1.field1741 = class158.method1085(class398.field5947.field2660, 32311);
        arg1.field1661 = class398.field5947.field1925;
        arg1.field1693 = class398.field5947.field1966;
        arg1.field1699 = class398.field5947.field1921;
        arg1.field1695 = 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILqd;II)Lrg;")
    public static final class457 method2069(int arg0, class315 arg1, int arg2, int arg3) {
        field4866++;
        int var4 = arg0 << 8 | arg1.field4743;
        class457 var5 = (class457) class78.field1135.method232(false, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class491.field7054.method2558(class491.field7054.method2538(var4, 117), 107);
        if (var6 == null) {
            int var8 = arg3 + 65536 << 8 | arg1.field4743;
            class457 var9 = (class457) class78.field1135.method232(false, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class491.field7054.method2558(class491.field7054.method2538(var8, 114), 74);
            if (var10 == null) {
                int var12 = arg1.field4743 | 0xFFFF00;
                class457 var13 = (class457) class78.field1135.method232(false, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                if (arg2 != 1131661840) {
                    field4898 = null;
                }
                byte[] var14 = class491.field7054.method2558(class491.field7054.method2538(var12, 115), 77);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class457 var15 = class500.method2964(var14, -6);
                    var15.field6649 = arg1;
                    class78.field1135.method231(var15, (long) var12 << 16, -111);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class457 var11 = class500.method2964(var10, arg2 - 1131661846);
                var11.field6649 = arg1;
                class78.field1135.method231(var11, (long) var8 << 16, -96);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class457 var7 = class500.method2964(var6, -6);
            var7.field6649 = arg1;
            class78.field1135.method231(var7, (long) var4 << 16, arg2 - 1131661917);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BFFFIII)V")
    public final void method2070(byte arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6) {
        if (arg4 == 0) {
            this.field4877 = arg5;
            this.field4864 = 1.0F;
            this.field4894 = arg6;
            this.field4876 = this.field4885 = this.field4879 = this.field4884 = this.field4871 = this.field4895 = 0.0F;
        } else {
            float var8 = class379.field5727[arg4 & 0x3FFF];
            float var9 = class379.field5721[arg4 & 0x3FFF];
            this.field4864 = 1.0F;
            this.field4876 = (float) arg5 * var9;
            this.field4894 = (float) arg6 * var8;
            this.field4885 = this.field4884 = this.field4871 = this.field4895 = 0.0F;
            this.field4877 = (float) arg5 * var8;
            this.field4879 = (float) arg6 * -var9;
        }
        if (arg0 <= 96) {
            this.field4894 = 0.5110766F;
        }
        field4865++;
        this.field4889 = arg3;
        this.field4887 = arg2;
        this.field4875 = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "(I)V")
    public final void method211(int arg0) {
        field4881++;
        this.field4864 = 1.0F;
        this.field4877 = this.field4894 = class379.field5727[arg0 & 0x3FFF];
        this.field4876 = class379.field5721[arg0 & 0x3FFF];
        this.field4879 = -this.field4876;
        this.field4871 = this.field4875 = this.field4895 = this.field4887 = this.field4885 = this.field4884 = this.field4889 = 0.0F;
    }

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "(III)V")
    public final void method207(int arg0, int arg1, int arg2) {
        this.field4875 += arg0;
        this.field4887 += arg1;
        field4883++;
        this.field4889 += arg2;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
    public static final void method2071(boolean arg0) {
        if (!arg0) {
            field4898 = null;
        }
        if (class429.field6373 == 8) {
            class74.method643(4, (byte) -98);
        } else if (class429.field6373 == 4 || class429.field6373 == 5) {
            class74.method643(2, (byte) -71);
        } else if (class429.field6373 == 11) {
            class74.method643(2, (byte) -16);
        }
        field4886++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method2072(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4893++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg6 - arg5;
        int var12 = arg4 - arg5;
        int var13 = arg6 * arg6;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        if (arg2 != -46) {
            method2071(true);
        }
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class416.field6200[arg3];
        class359.method2255((byte) -81, var39, arg7 - var11, -arg6 + arg7, arg1);
        class359.method2255((byte) -100, var39, arg7 + var11, -var11 + arg7, arg0);
        class359.method2255((byte) -78, var39, arg7 + arg6, arg7 + var11, arg1);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg3 - var9;
            int var42 = arg3 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class359.method2255((byte) -110, class416.field6200[var41], var46, var44, arg1);
                class359.method2255((byte) -117, class416.field6200[var41], var45, var46, arg0);
                class359.method2255((byte) -83, class416.field6200[var41], var43, var45, arg1);
                class359.method2255((byte) -117, class416.field6200[var42], var46, var44, arg1);
                class359.method2255((byte) -123, class416.field6200[var42], var45, var46, arg0);
                class359.method2255((byte) -92, class416.field6200[var42], var43, var45, arg1);
            } else {
                class359.method2255((byte) -126, class416.field6200[var41], var43, var44, arg1);
                class359.method2255((byte) -89, class416.field6200[var42], var43, var44, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "za", descriptor = "(Lc;)V")
    public final void method214(class125 arg0) {
        field4888++;
        class325 var2 = (class325) arg0;
        this.field4895 = var2.field4895;
        this.field4877 = var2.field4877;
        this.field4884 = var2.field4884;
        this.field4887 = var2.field4887;
        this.field4889 = var2.field4889;
        this.field4864 = var2.field4864;
        this.field4871 = var2.field4871;
        this.field4875 = var2.field4875;
        this.field4879 = var2.field4879;
        this.field4894 = var2.field4894;
        this.field4885 = var2.field4885;
        this.field4876 = var2.field4876;
    }

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "(III[I)V")
    public final void method217(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4864 + (float) arg0 * this.field4885 + (float) arg1 * this.field4884);
        field4873++;
        arg3[1] = (int) ((float) arg2 * this.field4895 + (float) arg0 * this.field4876 + (float) arg1 * this.field4894);
        arg3[0] = (int) ((float) arg2 * this.field4871 + (float) arg0 * this.field4877 + (float) arg1 * this.field4879);
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "(III)V")
    public final void method206(int arg0, int arg1, int arg2) {
        this.field4875 = arg0;
        this.field4889 = arg2;
        this.field4877 = this.field4894 = this.field4864 = 1.0F;
        this.field4876 = this.field4885 = this.field4879 = this.field4884 = this.field4871 = this.field4895 = 0.0F;
        this.field4887 = arg1;
        field4874++;
    }

    @OriginalMember(owner = "client!qg", name = "ja", descriptor = "(I)V")
    public final void method210(int arg0) {
        field4867++;
        float var2 = class379.field5727[arg0 & 0x3FFF];
        float var3 = class379.field5721[arg0 & 0x3FFF];
        float var4 = this.field4877;
        float var5 = this.field4879;
        float var6 = this.field4871;
        float var7 = this.field4875;
        this.field4877 = this.field4885 * var3 + var2 * var4;
        this.field4879 = this.field4884 * var3 + var2 * var5;
        this.field4885 = this.field4885 * var2 - var3 * var4;
        this.field4871 = this.field4864 * var3 + var2 * var6;
        this.field4884 = this.field4884 * var2 - var3 * var5;
        this.field4875 = this.field4889 * var3 + var2 * var7;
        this.field4864 = this.field4864 * var2 - (var3 * var6);
        this.field4889 = this.field4889 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)[F")
    public final float[] method2073(int arg0) {
        class448.field6561[4] = this.field4879;
        class448.field6561[14] = this.field4889;
        field4870++;
        if (arg0 > -4) {
            field4891 = null;
        }
        class448.field6561[8] = this.field4871;
        class448.field6561[13] = this.field4887;
        class448.field6561[10] = this.field4864;
        class448.field6561[6] = this.field4884;
        class448.field6561[5] = this.field4894;
        class448.field6561[9] = this.field4895;
        class448.field6561[1] = this.field4876;
        class448.field6561[0] = this.field4877;
        class448.field6561[12] = this.field4875;
        class448.field6561[2] = this.field4885;
        return class448.field6561;
    }

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "(IIIIII)V")
    public final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4869++;
        float var7 = class379.field5727[arg3 & 0x3FFF];
        float var8 = class379.field5721[arg3 & 0x3FFF];
        float var9 = class379.field5727[arg4 & 0x3FFF];
        float var10 = class379.field5721[arg4 & 0x3FFF];
        float var11 = class379.field5727[arg5 & 0x3FFF];
        float var12 = class379.field5721[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4879 = var7 * var12;
        this.field4895 = var9 * var13 + var10 * var12;
        this.field4894 = var7 * var11;
        this.field4877 = var9 * var11 + var10 * var14;
        this.field4884 = -var8;
        this.field4876 = -var9 * var12 + var10 * var13;
        this.field4871 = -var10 * var11 + var9 * var14;
        this.field4885 = var7 * var10;
        this.field4864 = var7 * var9;
        this.field4889 = (float) (-arg0) * this.field4885 - ((float) arg1 * this.field4884) - ((float) arg2 * this.field4864);
        this.field4875 = (float) (-arg0) * this.field4877 - (float) arg1 * this.field4879 - (float) arg2 * this.field4871;
        this.field4887 = (float) (-arg0) * this.field4876 - (float) arg1 * this.field4894 - (float) arg2 * this.field4895;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLc;)V")
    public final void method2074(byte arg0, class125 arg1) {
        field4880++;
        class325 var3 = (class325) arg1;
        this.field4877 = var3.field4877;
        this.field4871 = var3.field4885;
        this.field4879 = var3.field4876;
        this.field4894 = var3.field4894;
        this.field4895 = var3.field4884;
        this.field4885 = var3.field4871;
        this.field4876 = var3.field4879;
        this.field4864 = var3.field4864;
        this.field4884 = var3.field4895;
        this.field4875 = -(this.field4871 * var3.field4889 + this.field4879 * var3.field4887 + this.field4877 * var3.field4875);
        if (arg0 >= 9) {
            this.field4887 = -(this.field4895 * var3.field4889 + this.field4894 * var3.field4887 + this.field4876 * var3.field4875);
            this.field4889 = -(this.field4864 * var3.field4889 + this.field4885 * var3.field4875 + this.field4884 * var3.field4887);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class325() {
        this.method209();
    }
}
