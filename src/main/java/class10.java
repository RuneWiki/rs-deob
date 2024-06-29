import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class10 extends class23 {

    @OriginalMember(owner = "client!se", name = "N", descriptor = "[B")
    private byte[] field191 = new byte[512];

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    private int field205 = 4;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    private int field203 = 4;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    private int field195 = 0;

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "I")
    private int field213 = 4;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "Z")
    private boolean field210 = true;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "I")
    private int field217 = 1638;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "Llc;")
    private static class143 field186 = class66.method374("Jun", -1);

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Llc;")
    private static class143 field188 = class66.method374("Oct", -1);

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Llc;")
    public static class143 field190 = class66.method374("http:)4)4", -1);

    @OriginalMember(owner = "client!se", name = "T", descriptor = "Llc;")
    private static class143 field197 = class66.method374("Feb", -1);

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "Llc;")
    private static class143 field204 = class66.method374("May", -1);

    @OriginalMember(owner = "client!se", name = "P", descriptor = "Llc;")
    private static class143 field193 = class66.method374("Sep", -1);

    @OriginalMember(owner = "client!se", name = "db", descriptor = "Llc;")
    private static class143 field207 = class66.method374("Aug", -1);

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Llc;")
    private static class143 field194 = class66.method374("Dec", -1);

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "Llc;")
    private static class143 field209 = class66.method374("Nov", -1);

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Llc;")
    private static class143 field199 = class66.method374("Mar", -1);

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "[Lpk;")
    public static class94[] field208 = new class94[4];

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "Llc;")
    public static class143 field219 = class66.method374(" )2> <col=ffff00>", -1);

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!se", name = "rb", descriptor = "Llc;")
    private static class143 field221 = class66.method374("Jul", -1);

    @OriginalMember(owner = "client!se", name = "tb", descriptor = "Llc;")
    private static class143 field223 = class66.method374("Jan", -1);

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "Llc;")
    private static class143 field214 = class66.method374("Apr", -1);

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "[Llc;")
    public static class143[] field202 = new class143[] { field223, field197, field199, field214, field204, field186, field221, field207, field193, field188, field209, field194 };

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!se", name = "qb", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!se", name = "sb", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "[S")
    private short[] field189;

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "[S")
    private short[] field215;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "[[[B")
    public static byte[][][] field201;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
    private final void method82(int[] arg0, int arg1, int arg2) {
        ++field206;
        if (arg2 != 255) {
            this.method86(-39, 94);
        }
        int var4 = class31.field495[arg1] * this.field203;
        if (this.field213 == 1) {
            short var5 = this.field189[0];
            int var6 = this.field215[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = var7 >> 12;
            int var9 = 255 & this.field191[255 & var8];
            int var10 = this.field203 * var6 >> 12;
            int var11 = this.field205 * var6 >> 12;
            int var12 = var7 & 4095;
            int var13 = var8 + 1;
            int var14 = class9.field167[var12];
            if (~var10 >= ~var13) {
                var13 = 0;
            }
            int var15 = 255 & this.field191[var13 & 255];
            if (this.field210) {
                for (int var16 = 0; ~class72.field1359 < ~var16; ++var16) {
                    int var17 = class3.field43[var16] * this.field205;
                    int var18 = this.method90((byte) 105, var12, var14, var6 * var17 >> 12, var9, var11, var15);
                    int var19 = var5 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; class72.field1359 > var20; ++var20) {
                    int var21 = class3.field43[var20] * this.field205;
                    int var22 = this.method90((byte) 117, var12, var14, var6 * var21 >> 12, var9, var11, var15);
                    arg0[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field189[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field215[0] << 12;
                int var25 = this.field205 * var24 >> 12;
                int var26 = this.field203 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = this.field191[var28 & 255] & 255;
                if (~var29 <= ~var26) {
                    var29 = 0;
                }
                int var31 = var27 & 4095;
                int var32 = this.field191[var29 & 255] & 255;
                int var33 = class9.field167[var31];
                for (int var34 = 0; ~var34 > ~class72.field1359; ++var34) {
                    int var54 = class3.field43[var34] * this.field205;
                    int var55 = this.method90((byte) 106, var31, var33, var24 * var54 >> 12, var30, var25, var32);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field213 < ~var35; ++var35) {
                short var36 = this.field189[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field215[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field203 * var37 >> 12;
                    int var40 = this.field205 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var38 & 4095;
                    int var43 = class9.field167[var42];
                    int var44 = var41 + 1;
                    if (var39 <= var44) {
                        var44 = 0;
                    }
                    int var45 = 255 & this.field191[255 & var41];
                    int var46 = 255 & this.field191[var44 & 255];
                    if (this.field210 && ~(this.field213 + -1) == ~var35) {
                        for (int var47 = 0; var47 < class72.field1359; ++var47) {
                            int var48 = class3.field43[var47] * this.field205;
                            int var49 = this.method90((byte) 118, var42, var43, var37 * var48 >> 12, var45, var40, var46);
                            int var50 = arg0[var47] - -(var36 * var49 >> 12);
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class72.field1359; ++var51) {
                            int var52 = class3.field43[var51] * this.field205;
                            int var53 = this.method90((byte) 118, var42, var43, var37 * var52 >> 12, var45, var40, var46);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field203 = arg0.method1265(125);
                                }
                            } else {
                                this.field205 = arg0.method1265(123);
                            }
                        } else {
                            this.field195 = arg0.method1265(126);
                        }
                    } else {
                        this.field205 = this.field203 = arg0.method1265(115);
                    }
                } else {
                    this.field217 = arg0.method1274((byte) 103);
                    if (~this.field217 > -1) {
                        this.field189 = new short[this.field213];
                        for (int var5 = 0; ~var5 > ~this.field213; ++var5) {
                            this.field189[var5] = (short) arg0.method1274((byte) 121);
                        }
                    }
                }
            } else {
                this.field213 = arg0.method1265(113);
            }
        } else {
            this.field210 = ~arg0.method1265(118) == -2;
        }
        ++field192;
        if (!arg2) {
            field202 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static final void method84(byte arg0) {
        class1.field13.method824(arg0 ^ 70);
        ++field218;
        if (arg0 != -52) {
            field209 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field211;
        this.field191 = class34.method233(this.field195, 26939);
        this.method89(false);
        for (int var2 = this.field213 + -1; var2 >= 1; --var2) {
            short var3 = this.field189[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field213;
        }
        int var4 = 24 / ((arg0 - 22) / 60);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field196;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            this.method82(var3, arg1, 255);
        }
        if (arg0 >= -13) {
            field199 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method87(int arg0) {
        field194 = null;
        field186 = null;
        field208 = null;
        field202 = null;
        field188 = null;
        field197 = null;
        field190 = null;
        field204 = null;
        field223 = null;
        field214 = null;
        field199 = null;
        field221 = null;
        field207 = null;
        field201 = null;
        field209 = null;
        field219 = null;
        if (arg0 != 255) {
            method87(65);
        }
        field193 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lgf;I)V")
    public static final void method88(class7 arg0, int arg1) {
        int var2 = 51 % ((arg1 - -3) / 46);
        ++field187;
        class202.field3680 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    private final void method89(boolean arg0) {
        if (this.field217 > 0) {
            this.field215 = new short[this.field213];
            this.field189 = new short[this.field213];
            for (int var2 = 0; ~var2 > ~this.field213; ++var2) {
                this.field189[var2] = (short) ((int) (Math.pow((double) ((float) this.field217 / 4096.0F), (double) var2) * 4096.0D));
                this.field215[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field189 != null && ~this.field189.length == ~this.field213) {
            this.field215 = new short[this.field213];
            for (int var3 = 0; this.field213 > var3; ++var3) {
                this.field215[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field198;
        if (arg0) {
            this.field205 = -45;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BIIIIII)I")
    private final int method90(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field200;
        int var8 = arg1 + -4096;
        int var9 = -120 / ((40 - arg0) / 52);
        int var10 = arg3 >> 12;
        int var11 = var10 + 1;
        int var12 = arg3 & 4095;
        int var13 = var12 - 4096;
        int var14 = class9.field167[var12];
        if (~arg5 >= ~var11) {
            var11 = 0;
        }
        int var15 = var10 & 255;
        int var16 = var11 & 255;
        int var17 = this.field191[arg4 + var15] & 3;
        int var18;
        if (var17 > 1) {
            var18 = ~var17 != -3 ? -arg1 + -var12 : -arg1 + var12;
        } else {
            var18 = var17 == 0 ? arg1 + var12 : -var12 + arg1;
        }
        int var19 = this.field191[var16 - -arg4] & 3;
        int var20;
        if (var19 > 1) {
            var20 = var19 != 2 ? -var13 - arg1 : var13 - arg1;
        } else {
            var20 = ~var19 == -1 ? arg1 + var13 : -var13 + arg1;
        }
        int var21 = this.field191[arg6 + var15] & 3;
        int var22 = var18 - -((var20 - var18) * var14 >> 12);
        int var23;
        if (var21 > 1) {
            var23 = var21 != 2 ? -var8 + -var12 : -var8 + var12;
        } else {
            var23 = var21 == 0 ? var12 - -var8 : -var12 + var8;
        }
        int var24 = this.field191[arg6 + var16] & 3;
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 != -3 ? -var8 + -var13 : -var8 + var13;
        } else {
            var25 = var24 != 0 ? -var13 + var8 : var8 + var13;
        }
        int var26 = ((-var23 + var25) * var14 >> 12) + var23;
        return var22 - -((-var22 + var26) * arg2 >> 12);
    }
}
