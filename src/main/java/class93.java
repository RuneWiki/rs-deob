import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class93 extends class242 {

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "Z")
    public static boolean field1509 = false;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1507 = 0;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Lsb;")
    public static class221 field1510 = new class221(64);

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field1506;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (!arg0) {
            method663(60, -84, -92);
        }
        if (super.field4257.field2357) {
            int[] var4 = this.method1647(2, arg1, 48);
            int[][] var5 = this.method1648(26484, arg1, 0);
            int[][] var6 = this.method1648(26484, arg1, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; class264.field4654 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var10[var16];
                    var7[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var8[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var8[var16] = var14[var16];
                    var7[var16] = var13[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method659(byte arg0) {
        ++field1515;
        if (!class16.field295 && ~class128.field2232 != -3) {
            try {
                class60.field972.method1875(class194.field3418, true);
                int var1 = 34 % ((-23 - arg0) / 51);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)[Lti;")
    public static final class5[] method660(int arg0) {
        ++field1514;
        class5[] var1 = new class5[class149.field2579];
        for (int var2 = 0; ~var2 > ~class149.field2579; ++var2) {
            var1[var2] = new class5(field1512, class221.field3828, class243.field4263[var2], class124.field2172[var2], class97.field1562[var2], class57.field915[var2], class182.field3178[var2], class16.field309);
        }
        if (arg0 >= -115) {
            field1508 = -78;
        }
        class126.method868(-15434);
        return var1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field1513;
        int var3 = -26 % ((arg1 - 73) / 41);
        int[] var4 = super.field4251.method1417((byte) 105, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0, 48);
            int[] var6 = this.method1647(1, arg0, 48);
            int[] var7 = this.method1647(2, arg0, 48);
            for (int var8 = 0; ~class264.field4654 < ~var8; ++var8) {
                int var9 = var7[var8];
                if (var9 == 4096) {
                    var4[var8] = var5[var8];
                } else if (~var9 != -1) {
                    var4[var8] = var5[var8] * var9 - -((4096 - var9) * var6[var8]) >> 12;
                } else {
                    var4[var8] = var6[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[Lpk;II[BZIII)V")
    public static final void method661(int arg0, int arg1, int arg2, class99[] arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field1505;
        class25 var11 = new class25(arg6);
        if (arg2 != 3) {
            method659((byte) -50);
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method190(32767);
            if (~var13 == -1) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method210(arg2 + 65533);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = 63 & var14 >> 6;
                int var17 = var14 >> 12;
                int var18 = var14 & 63;
                int var19 = var11.method189((byte) -103);
                int var20 = var19 & 3;
                int var21 = var19 >> 2;
                if (~arg0 == ~var17 && var16 >= arg5 && var16 < arg5 - -8 && var18 >= arg9 && ~var18 > ~(arg9 + 8)) {
                    class130 var22 = class32.method277((byte) -125, var12);
                    int var23 = class19.method144(var22.field2265, 7 & var16, var20, var22.field2277, 7 & var18, -29387, arg10) + arg1;
                    int var24 = class279.method1852(var20, 7 & var18, var22.field2277, var22.field2265, arg10, -106, 7 & var16) + arg4;
                    if (~var23 < -1 && var24 > 0 && var23 < 103 && ~var24 > -104) {
                        class99 var25 = null;
                        if (!arg7) {
                            int var26 = arg8;
                            if (~(2 & class259.field4598[1][var23][var24]) == -3) {
                                var26 = arg8 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class17.method131(var21, !arg7, arg8, arg8, arg7, var25, var12, 3 & arg10 + var20, var24, var23, 951286498);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
    public static void method662(boolean arg0) {
        field1510 = null;
        if (!arg0) {
            method659((byte) 109);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(III)Ll;")
    public static final class160 method663(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2841; ++var4) {
                class160 var5 = var3.field2845[var4];
                if ((var5.field2805 >> 29 & 3L) == 2L && var5.field2814 == arg1 && var5.field2796 == arg2) {
                    class221.method1490(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field1511;
        if (~arg1 == -1) {
            super.field4248 = arg2.method189((byte) -103) == 1;
        }
        if (arg0 > -119) {
            this.method71(false, -39);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class93() {
        super(3, false);
    }
}
