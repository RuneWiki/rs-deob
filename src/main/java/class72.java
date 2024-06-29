import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class72 extends class89 {

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    private int field1175 = 3216;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    private int field1171 = 3216;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "I")
    private int field1180 = 4096;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "[I")
    private int[] field1179 = new int[3];

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field1165 = 0;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "[[[B")
    public static byte[][][] field1168 = new byte[4][104][104];

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "Lda;")
    public static class275 field1172 = class255.method1672(99, " loggt sich ein)3");

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "[I")
    public static int[] field1177 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Lcb;")
    public static class120 field1166;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lda;B)Z")
    public static final boolean method468(class275 arg0, byte arg1) {
        ++field1174;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~class63.field1053; ++var2) {
                if (arg0.method1844(90, class148.field2585[var2])) {
                    return true;
                }
            }
            if (arg1 != -90) {
                method468((class275) null, (byte) -19);
            }
            return arg0.method1844(90, class66.field1094.field1910);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lma;I)V")
    public static final void method469(class105 arg0, int arg1) {
        ++field1178;
        if (arg1 == 2) {
            class246.field4339 = arg0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1169;
            int[] var3 = super.field1503.method229(arg0, (byte) -73);
            if (super.field1503.field664) {
                int var4 = class108.field1882 * this.field1180 >> 12;
                int[] var5 = this.method645(-126, 0, class277.field4837 & arg0 + -1);
                int[] var6 = this.method645(122, 0, arg0);
                int[] var7 = this.method645(87, 0, class277.field4837 & arg0 + 1);
                for (int var8 = 0; ~var8 > ~class65.field1070; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class1.field11 & var8 + -1] + -var6[class1.field11 & var8 + 1]) * var4 >> 12;
                    int var11 = var9 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var10 >> 4;
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class166.field2884[((var11 + 1) * var11 >> 1) + var12] & 255;
                    int var14 = var10 * var13 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = this.field1179[1] * var15 >> 12;
                    int var17 = var13 * 4096 >> 8;
                    int var18 = this.field1179[2] * var17 >> 12;
                    int var19 = this.field1179[0] * var14 >> 12;
                    var3[var8] = var16 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIIIIII)V")
    public static final void method470(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1170;
        class82.method535(arg4, 1152);
        int var7 = 0;
        int var8 = -arg5 + arg4;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = -arg4;
        int var10 = -var8;
        int var11 = arg4;
        int var12 = -1;
        if (~class149.field2603 >= ~arg6 && class141.field2493 >= arg6) {
            int[] var13 = class19.field280[arg6];
            int var14 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -arg4 + arg1);
            int var15 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 + arg4);
            int var16 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -var8 + arg1);
            int var17 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 + var8);
            class36.method216(var13, var14, arg3, -124, var16);
            class36.method216(var13, var16, arg2, -113, var17);
            class36.method216(var13, var17, arg3, -119, var15);
        }
        int var18 = var8;
        int var19 = -1;
        while (var7 < var11) {
            var12 += 2;
            var19 += 2;
            var9 += var19;
            var10 += var12;
            if (~var10 <= -1 && var18 >= 1) {
                --var18;
                class124.field2218[var18] = var7;
                var10 -= var18 << 1;
            }
            ++var7;
            if (var9 >= 0) {
                --var11;
                var9 -= var11 << 1;
                int var21 = arg6 + var11;
                int var22 = arg6 - var11;
                if (~class149.field2603 >= ~var21 && var22 <= class141.field2493) {
                    if (~var11 > ~var8) {
                        int var23 = class124.field2218[var11];
                        int var24 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 + var7);
                        int var25 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -var7 + arg1);
                        int var26 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 + var23);
                        int var27 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -var23 + arg1);
                        if (var21 <= class141.field2493) {
                            int[] var28 = class19.field280[var21];
                            class36.method216(var28, var25, arg3, -113, var27);
                            class36.method216(var28, var27, arg2, -119, var26);
                            class36.method216(var28, var26, arg3, -126, var24);
                        }
                        if (~class149.field2603 >= ~var22) {
                            int[] var29 = class19.field280[var22];
                            class36.method216(var29, var25, arg3, -125, var27);
                            class36.method216(var29, var27, arg2, -118, var26);
                            class36.method216(var29, var26, arg3, -122, var24);
                        }
                    } else {
                        int var30 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 - -var7);
                        int var31 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -var7 + arg1);
                        if (~class141.field2493 <= ~var21) {
                            class36.method216(class19.field280[var21], var31, arg3, -123, var30);
                        }
                        if (~class149.field2603 >= ~var22) {
                            class36.method216(class19.field280[var22], var31, arg3, -125, var30);
                        }
                    }
                }
            }
            int var32 = -var7 + arg6;
            int var33 = arg6 + var7;
            if (~var33 <= ~class149.field2603 && ~var32 >= ~class141.field2493) {
                int var34 = arg1 + var11;
                int var35 = arg1 - var11;
                if (~class246.field4355 >= ~var34 && class96.field1632 >= var35) {
                    int var36 = class93.method673(class246.field4355, (byte) 45, class96.field1632, var34);
                    int var37 = class93.method673(class246.field4355, (byte) 45, class96.field1632, var35);
                    if (var7 < var8) {
                        int var38 = var7 > var18 ? class124.field2218[var7] : var18;
                        int var39 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 + var38);
                        int var40 = class93.method673(class246.field4355, (byte) 45, class96.field1632, -var38 + arg1);
                        if (~var33 >= ~class141.field2493) {
                            int[] var41 = class19.field280[var33];
                            class36.method216(var41, var37, arg3, -126, var40);
                            class36.method216(var41, var40, arg2, -124, var39);
                            class36.method216(var41, var39, arg3, -126, var36);
                        }
                        if (class149.field2603 <= var32) {
                            int[] var42 = class19.field280[var32];
                            class36.method216(var42, var37, arg3, -114, var40);
                            class36.method216(var42, var40, arg2, -127, var39);
                            class36.method216(var42, var39, arg3, -122, var36);
                        }
                    } else {
                        if (var33 <= class141.field2493) {
                            class36.method216(class19.field280[var33], var37, arg3, -118, var36);
                        }
                        if (~var32 <= ~class149.field2603) {
                            class36.method216(class19.field280[var32], var37, arg3, -126, var36);
                        }
                    }
                }
            }
        }
        int var20 = 109 % ((32 - arg0) / 39);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
    public static final void method471(int arg0, int arg1) {
        class3 var2 = class235.field4101[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class3 var4 = class235.field4101[var3][arg0][arg1] = class235.field4101[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field34;
                for (int var5 = 0; var5 < var4.field29; ++var5) {
                    class37 var6 = var4.field48[var5];
                    if ((var6.field608 >> 29 & 3L) == 2L && var6.field616 == arg0 && var6.field617 == arg1) {
                        --var6.field621;
                    }
                }
            }
        }
        if (class235.field4101[0][arg0][arg1] == null) {
            class235.field4101[0][arg0][arg1] = new class3(0, arg0, arg1);
        }
        class235.field4101[0][arg0][arg1].field32 = var2;
        class235.field4101[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method472(boolean arg0) {
        field1168 = null;
        field1166 = null;
        if (arg0) {
            method472(true);
        }
        field1172 = null;
        field1177 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1175 = arg1.method608(60);
                }
            } else {
                this.field1171 = arg1.method608(arg0 ^ -20492);
            }
        } else {
            this.field1180 = arg1.method608(87);
        }
        if (arg0 != -20503) {
            this.method239(-125, true);
        }
        ++field1167;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
    private final void method473(boolean arg0) {
        ++field1164;
        double var2 = Math.cos((double) ((float) this.field1175 / 4096.0F));
        this.field1179[0] = (int) (Math.sin((double) ((float) this.field1171 / 4096.0F)) * var2 * 4096.0D);
        this.field1179[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1171 / 4096.0F)) * var2);
        if (arg0) {
            this.field1180 = 53;
        }
        this.field1179[2] = (int) (Math.sin((double) ((float) this.field1175 / 4096.0F)) * 4096.0D);
        int var4 = this.field1179[0] * this.field1179[0] >> 12;
        int var5 = this.field1179[2] * this.field1179[2] >> 12;
        int var6 = this.field1179[1] * this.field1179[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 - -var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field1179[0] = (this.field1179[0] << 12) / var7;
            this.field1179[2] = (this.field1179[2] << 12) / var7;
            this.field1179[1] = (this.field1179[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 == 1) {
            ++field1176;
            this.method473(false);
        }
    }
}
