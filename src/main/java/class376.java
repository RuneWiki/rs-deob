import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class376 extends class214 {

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field5320 = 0;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "[Laq;")
    public static class385[] field5318;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "[Lvn;")
    public static class490[] field5316;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field5319;
        if (~arg2 == -1) {
            super.field3032 = arg0.method2503(true) == 1;
        }
        if (arg1 > -114) {
            method2247((String) null, -61, (String) null, 57);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class376() {
        super(3, false);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
    public static void method2245(boolean arg0) {
        field5316 = null;
        field5318 = null;
        if (!arg0) {
            field5318 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
    public static final void method2246(boolean arg0, int arg1) {
        ++field5322;
        if (arg0) {
            method2246(true, 27);
        }
        class130.field1832 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method2247(String arg0, int arg1, String arg2, int arg3) {
        ++field5317;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~(-var8 + var6) > ~var4 || var5 > var7 - var9) {
            if (-var8 + var6 >= var4) {
                return -1;
            }
            if (-var9 + var7 >= var5) {
                return 1;
            }
            char var22;
            if (var8 != 0) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg2.charAt(var6++);
            }
            char var24;
            if (~var9 == -1) {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class455.method2627(24661, var22);
            var9 = class455.method2627(arg1 ^ -3990, var24);
            char var26 = class229.method1442(var22, arg3, -22000);
            char var27 = class229.method1442(var24, arg3, -22000);
            if (~var26 != ~var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class46.method365(arg3, (byte) -70, var28) + -class46.method365(arg3, (byte) -70, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 + -1 + -var11;
                var17 = var5 + -1 - var11;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg0.charAt(var17);
            if (var18 != var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class46.method365(arg3, (byte) -70, var20) - class46.method365(arg3, (byte) -70, var21);
                }
            }
        }
        if (arg1 != -28609) {
            method2247((String) null, -74, (String) null, -45);
        }
        int var12 = -var5 + var4;
        if (~var12 != -1) {
            return var12;
        } else {
            for (int var13 = 0; ~var13 > ~var10; ++var13) {
                char var14 = arg2.charAt(var13);
                char var15 = arg0.charAt(var13);
                if (var14 != var15) {
                    return class46.method365(arg3, (byte) -70, var14) - class46.method365(arg3, (byte) -70, var15);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field5321;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644) {
            int[] var4 = this.method1352(arg0, 2, -28);
            int[][] var5 = this.method1354(0, arg0, (byte) 23);
            int[][] var6 = this.method1354(1, arg0, (byte) 23);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class399.field5585 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (arg1 != 92) {
            method2247((String) null, -36, (String) null, -11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        if (arg0 != 123) {
            return null;
        } else {
            ++field5315;
            int[] var3 = super.field3024.method2585(arg1, 0);
            if (super.field3024.field6135) {
                int[] var4 = this.method1352(arg1, 0, -41);
                int[] var5 = this.method1352(arg1, 1, -40);
                int[] var6 = this.method1352(arg1, 2, -107);
                for (int var7 = 0; ~var7 > ~class399.field5585; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    static {
        new class112("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
