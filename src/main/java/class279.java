import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class279 extends class105 {

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    private int field4933 = 0;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    private int field4941 = 0;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    private int field4943 = 16;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    private int field4942 = 2000;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    private int field4934 = 4096;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "[I")
    public static int[] field4928 = new int[2048];

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lvf;")
    public static class265 field4930 = class87.method582(-46, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field4931 = 0;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "[I")
    public static int[] field4944 = new int[1000];

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lvf;")
    public static class265 field4937 = class87.method582(-46, "<)4col> x");

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "[[[I")
    public static int[][][] field4936;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 == 255) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 == -5) {
                                this.field4934 = arg2.method927(arg1 + -129);
                            }
                        } else {
                            this.field4933 = arg2.method927(126);
                        }
                    } else {
                        this.field4943 = arg2.method920((byte) 118);
                    }
                } else {
                    this.field4942 = arg2.method927(arg1 + -129);
                }
            } else {
                this.field4941 = arg2.method920((byte) 111);
            }
            ++field4939;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Z)V")
    public static final void method1901(boolean arg0) {
        ++field4940;
        Container var1;
        if (class141.field2621 != null) {
            var1 = class141.field2621;
        } else if (class49.field1044 != null) {
            var1 = class49.field1044;
        } else {
            var1 = class281.field4957.field4024;
        }
        if (!arg0) {
            class78.field1489 = var1.getSize().width;
            class145.field2700 = var1.getSize().height;
            if (class49.field1044 == var1) {
                Insets var2 = class49.field1044.getInsets();
                class78.field1489 -= var2.left - -var2.right;
                class145.field2700 -= var2.top + var2.bottom;
            }
            if (class232.method1565((byte) 83) < 2) {
                class193.field3468 = 0;
                class147.field2755 = (class78.field1489 + -765) / 2;
                class26.field706 = 765;
                class50.field1053 = 503;
            } else {
                class147.field2755 = 0;
                class50.field1053 = class145.field2700;
                class193.field3468 = 0;
                class26.field706 = class78.field1489;
            }
            class125.field2241.setSize(class26.field706, class50.field1053);
            if (class49.field1044 != var1) {
                class125.field2241.setLocation(class147.field2755, class193.field3468);
            } else {
                Insets var3 = class49.field1044.getInsets();
                class125.field2241.setLocation(class147.field2755 + var3.left, class193.field3468 + var3.top);
            }
            if (~class8.field271 != 0) {
                class232.method1568(true, true);
            }
            class208.method1428(-1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = this.field4934 >> 1;
            int[][] var5 = super.field1862.method459(0);
            Random var6 = new Random((long) this.field4941);
            for (int var7 = 0; ~var7 > ~this.field4942; ++var7) {
                int var8 = this.field4934 <= 0 ? this.field4933 : -var4 + this.field4933 + class100.method664((byte) -86, var6, this.field4934);
                int var9 = class100.method664((byte) -86, var6, class94.field1668);
                int var10 = class100.method664((byte) -86, var6, class102.field1804);
                int var11 = (var8 & 4083) >> 4;
                int var12 = var10 - -(class264.field4604[var11] * this.field4943 >> 12);
                int var13 = var9 - -(class227.field4029[var11] * this.field4943 >> 12);
                int var14 = -var10 + var12;
                int var15 = -var9 + var13;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var9;
                        var9 = var10;
                        var10 = var17;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (~var13 > ~var9) {
                        int var19 = var9;
                        var9 = var13;
                        int var20 = var10;
                        var13 = var19;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var10;
                    int var22 = -var9 + var13;
                    int var23 = var12 - var10;
                    int var24 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = -(class100.method664((byte) -86, var6, 4096) >> 2) + 1024;
                    int var26 = var10 < var12 ? 1 : -1;
                    int var27 = -var22 / 2;
                    for (int var28 = var9; var28 < var13; ++var28) {
                        int var29 = class1.field20 & var28;
                        var27 += var23;
                        int var30 = (-var9 + var28) * var24 + var25 + 1024;
                        int var31 = class11.field377 & var21;
                        if (var27 > 0) {
                            var21 += var26;
                            var27 += -var22;
                        }
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        if (arg0 != 8055) {
            return null;
        } else {
            ++field4938;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class279() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        ++field4924;
        class123.method831(87);
        if (arg0) {
            field4937 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnc;I)V")
    public static final void method1902(class122 arg0, int arg1) {
        ++field4929;
        class242 var2 = (class242) class32.field804.method1842(-1, arg0.field2163.method1793(43));
        if (var2 != null) {
            if (var2.field4203 != null) {
                class49.field1039.method1660(var2.field4203);
                var2.field4203 = null;
            }
            var2.method97(158);
        }
        if (arg1 <= 16) {
            method1903((byte) 95, -75, 66, -32, -18, -1, 108, 44);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1903(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        ++field4925;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg5 * arg5;
        int var12 = -arg3 + arg5;
        int var13 = -arg3 + arg6;
        int var14 = var12 * var12;
        int var15 = arg6 * arg6;
        int var16 = var13 * var13;
        int var17 = var15 << 1;
        int var18 = 123 % ((-18 - arg0) / 36);
        int var19 = var16 << 1;
        int var20 = var11 << 1;
        int var21 = var14 << 1;
        int var22 = arg6 << 1;
        int var23 = var13 << 1;
        int var24 = (-var22 + 1) * var11 - -var17;
        int var25 = (1 - var23) * var14 - -var19;
        int var26 = -((var23 + -1) * var21) + var16;
        int var27 = var11 << 2;
        int var28 = -((var22 + -1) * var20) + var15;
        int var29 = var14 << 2;
        int var30 = (var22 - 3) * var20;
        int var31 = var15 << 2;
        int var32 = var16 << 2;
        int var33 = var19 * 3;
        int var34 = (var23 + -3) * var21;
        int var35 = var31;
        int var36 = (arg6 + -1) * var27;
        int var37 = var32;
        int var38 = var17 * 3;
        int var39 = (var13 - 1) * var29;
        int[] var40 = class44.field973[arg4];
        class203.method1394(var40, -arg5 + arg2, -var12 + arg2, -7249, arg7);
        class203.method1394(var40, arg2 - var12, arg2 + var12, -7249, arg1);
        class203.method1394(var40, arg2 - -var12, arg2 + arg5, -7249, arg7);
        while (~var9 < -1) {
            if (~var24 > -1) {
                while (var24 < 0) {
                    var24 += var38;
                    ++var8;
                    var38 += var31;
                    var28 += var35;
                    var35 += var31;
                }
            }
            if (var28 < 0) {
                var24 += var38;
                var38 += var31;
                ++var8;
                var28 += var35;
                var35 += var31;
            }
            boolean var41 = var13 >= var9;
            var28 += -var30;
            var30 -= var27;
            var24 += -var36;
            if (var41) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var32;
                        var33 += var32;
                        ++var10;
                    }
                }
                if (~var26 > -1) {
                    var26 += var37;
                    var25 += var33;
                    ++var10;
                    var33 += var32;
                    var37 += var32;
                }
                var26 += -var34;
                var34 -= var29;
                var25 += -var39;
                var39 -= var29;
            }
            var36 -= var27;
            --var9;
            int var42 = -var9 + arg4;
            int var43 = -var8 + arg2;
            int var44 = arg2 - -var8;
            int var45 = arg4 + var9;
            if (!var41) {
                class203.method1394(class44.field973[var42], var43, var44, -7249, arg7);
                class203.method1394(class44.field973[var45], var43, var44, -7249, arg7);
            } else {
                int var46 = arg2 + var10;
                int var47 = -var10 + arg2;
                class203.method1394(class44.field973[var42], var43, var47, -7249, arg7);
                class203.method1394(class44.field973[var42], var47, var46, -7249, arg1);
                class203.method1394(class44.field973[var42], var46, var44, -7249, arg7);
                class203.method1394(class44.field973[var45], var43, var47, -7249, arg7);
                class203.method1394(class44.field973[var45], var47, var46, -7249, arg1);
                class203.method1394(class44.field973[var45], var46, var44, -7249, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static final void method1904(byte arg0) {
        if (arg0 <= 9) {
            field4930 = null;
        }
        class1.field24.method1893(-120);
        ++field4935;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method1905(byte arg0) {
        field4944 = null;
        field4936 = null;
        field4937 = null;
        if (arg0 <= 73) {
            method1904((byte) 14);
        }
        field4928 = null;
        field4930 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIZ[Ljg;IIIII[B)V")
    public static final void method1906(int arg0, int arg1, int arg2, boolean arg3, class257[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        if (arg7 < 95) {
            method1902((class122) null, -44);
        }
        int var11 = -1;
        ++field4932;
        class135 var12 = new class135(arg10);
        while (true) {
            int var13 = var12.method895(32767);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method947(27126);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 63;
                int var17 = (4044 & var14) >> 6;
                int var18 = var12.method920((byte) 112);
                int var19 = var14 >> 12;
                int var20 = var18 & 3;
                int var21 = var18 >> 2;
                if (arg6 == var19 && var17 >= arg8 && ~(arg8 + 8) < ~var17 && var16 >= arg9 && ~(arg9 + 8) < ~var16) {
                    class130 var22 = class84.method574(-128, var11);
                    int var23 = class68.method489(false, var17 & 7, var22.field2309, var20, arg2, var16 & 7, var22.field2328) + arg0;
                    int var24 = class122.method816(var16 & 7, 2, var22.field2328, var22.field2309, var20, arg2, 7 & var17) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class257 var25 = null;
                        if (!arg3) {
                            int var26 = arg1;
                            if ((class230.field4064[1][var23][var24] & 2) == 2) {
                                var26 = arg1 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class164.method1083(!arg3, var11, arg3, 77, arg1, var21, var23, var25, arg1, 3 & arg2 + var20, var24);
                    }
                }
            }
        }
    }
}
