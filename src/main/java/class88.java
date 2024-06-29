import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class88 extends class330 {

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    private int field1046 = 2000;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    private int field1047 = 0;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    private int field1043 = 0;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    private int field1045 = 16;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    private int field1053 = 4096;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "Z")
    public static boolean field1042 = false;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "Lqk;")
    public static class1 field1048 = new class1(2, 0);

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "Z")
    public static boolean field1054 = true;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(B)V")
    public static void method652(byte arg0) {
        if (arg0 == 105) {
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        int var2 = -70 % ((arg0 - 50) / 41);
        ++field1052;
        class393.method2423(true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field1055;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = this.field1053 >> 1;
            int[][] var5 = super.field4630.method2481(-48);
            Random var6 = new Random((long) this.field1043);
            for (int var7 = 0; var7 < this.field1046; ++var7) {
                int var8 = ~this.field1053 >= -1 ? this.field1047 : -var4 + this.field1047 + class427.method2573(var6, this.field1053, -48);
                int var9 = 255 & var8 >> 4;
                int var10 = class427.method2573(var6, class80.field901, -74);
                int var11 = class427.method2573(var6, class291.field4285, -102);
                int var12 = (class654.field9189[var9] * this.field1045 >> 12) + var10;
                int var13 = var11 - -(class329.field4620[var9] * this.field1045 >> 12);
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class427.method2573(var6, 4096, -92) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (var28 - var10) * var25 + (var26 - -1024);
                        int var30 = class639.field8988 & var28;
                        int var31 = var21 & class385.field5505;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (arg1) {
            this.method466((class511) null, -116, (byte) 2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public static final void method654(boolean arg0) {
        ++field1044;
        if (arg0) {
            method657((class230) null, true, (byte[][][]) null, 82, (byte) 106);
        }
        class70.field770 = 0;
        class7.field40 = new class22[50];
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lsha;III)V")
    public static final void method655(class115 arg0, int arg1, int arg2, int arg3) {
        class604.field8475 = arg1;
        class478.field6635 = arg0;
        ++field1051;
        int var4 = -88 % ((-12 - arg3) / 59);
        class110.field1326 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field1049;
        int var4 = -5 % ((arg2 - -41) / 42);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field1053 = arg0.method3002(-1);
                        }
                    } else {
                        this.field1047 = arg0.method3002(-1);
                    }
                } else {
                    this.field1045 = arg0.method3013(44);
                }
            } else {
                this.field1046 = arg0.method3002(-1);
            }
        } else {
            this.field1043 = arg0.method3013(95);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Loq;IIIII)V")
    public static final void method656(class230 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class266.field3869 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class414.field5796) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class704.field9799 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class472 var14 = class59.field688[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class661.field9303[var11].method2525(var12, var13, (byte) 114) + class661.field9303[var11].method2525(var12 + 1, var13, (byte) 114) + class661.field9303[var11].method2525(var12, var13 + 1, (byte) 114) + class661.field9303[var11].method2525(var12 + 1, var13 + 1, (byte) 114)) / 4 - (class661.field9303[arg1].method2525(arg2, arg3, (byte) 114) + class661.field9303[arg1].method2525(arg2 + 1, arg3, (byte) 114) + class661.field9303[arg1].method2525(arg2, arg3 + 1, (byte) 114) + class661.field9303[arg1].method2525(arg2 + 1, arg3 + 1, (byte) 114)) / 4;
                                    class391 var16 = var14.field6548;
                                    class391 var17 = var14.field6544;
                                    if (var16 != null && var16.method83(false)) {
                                        arg0.method73(var16, (var12 - arg2) * class179.field2263 + (1 - arg4) * class760.field10442, var6, var15, class139.field1781, (var13 - arg3) * class179.field2263 + (1 - arg5) * class760.field10442, 117);
                                    }
                                    if (var17 != null && var17.method83(false)) {
                                        arg0.method73(var17, (var12 - arg2) * class179.field2263 + (1 - arg4) * class760.field10442, var6, var15, class139.field1781, (var13 - arg3) * class179.field2263 + (1 - arg5) * class760.field10442, 113);
                                    }
                                    for (class44 var18 = var14.field6551; var18 != null; var18 = var18.field466) {
                                        class253 var19 = var18.field465;
                                        if (var19 != null && var19.method83(false) && (var19.field3745 == var12 || var7 == var12) && (var19.field3758 == var13 || var9 == var13)) {
                                            int var20 = var19.field3754 - var19.field3745 + 1;
                                            int var21 = var19.field3755 - var19.field3758 + 1;
                                            arg0.method73(var19, (var19.field3745 - arg2) * class179.field2263 + (var20 - arg4) * class760.field10442, var6, var15, class139.field1781, (var19.field3758 - arg3) * class179.field2263 + (var21 - arg5) * class760.field10442, 123);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Loq;Z[[[BIB)Z")
    public static final boolean method657(class230 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class595.field8359) {
            return false;
        } else {
            int var5 = arg0.field3470 >> class732.field10110;
            int var6 = var5;
            int var7 = arg0.field3460 >> class732.field10110;
            int var8 = var7;
            if (arg0 instanceof class253) {
                var6 = ((class253) arg0).field3754;
                var8 = ((class253) arg0).field3755;
                var5 = ((class253) arg0).field3745;
                var7 = ((class253) arg0).field3758;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field3469 < class266.field3869 && var9 >= class379.field5432 && var9 < class407.field5727 && var10 >= class583.field8251 && var10 < class213.field2955) {
                        if ((arg2 == null || arg0.field3467 < arg3 || arg2[arg0.field3467][var9][var10] != arg4) && arg0.method1534(382) && !arg0.method1525(class139.field1781, (byte) -127)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class591.field8336 - 16 && var9 <= class591.field8336 + 16 && var10 >= class112.field1363 - 16 && var10 <= class112.field1363 + 16) {
                            if (class753.field10384) {
                                class393.field5594[class65.field724++].method3301((byte) 108, arg0);
                                class65.field724 %= class791.field10844;
                            } else {
                                arg0.method76(class139.field1781, -103);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}
