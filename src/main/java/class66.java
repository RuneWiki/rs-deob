import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class66 extends class190 {

    @OriginalMember(owner = "client!g", name = "ic", descriptor = "Ldc;")
    public static class37 field1186 = class185.method1233((byte) 86, "_");

    @OriginalMember(owner = "client!g", name = "gc", descriptor = "[[I")
    public static int[][] field1184 = new int[104][104];

    @OriginalMember(owner = "client!g", name = "hc", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!g", name = "nc", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!g", name = "pc", descriptor = "I")
    public static int field1193 = 1;

    @OriginalMember(owner = "client!g", name = "qc", descriptor = "[Lce;")
    public static class28[] field1194 = new class28[2048];

    @OriginalMember(owner = "client!g", name = "dc", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!g", name = "ec", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!g", name = "fc", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!g", name = "jc", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!g", name = "kc", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!g", name = "oc", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!g", name = "rc", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!g", name = "mc", descriptor = "Lsj;")
    public class206 field1190;

    @OriginalMember(owner = "client!g", name = "lc", descriptor = "Z")
    public static boolean field1189;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Z")
    public final boolean method482(byte arg0) {
        if (arg0 != -108) {
            return false;
        } else {
            ++field1183;
            return this.field1190 != null;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static void method483(int arg0) {
        field1186 = null;
        if (arg0 != 2047) {
            method485(-11);
        }
        field1184 = null;
        field1194 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lmf;I)Z")
    public static final boolean method484(class136 arg0, int arg1) {
        ++field1195;
        if (arg0.field2659 == arg1) {
            class195.field3650 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
    public final int method5() {
        ++field1187;
        return super.field3516;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public static final void method485(int arg0) {
        if (class32.field657 != null) {
            class26 var1 = class32.field657;
            synchronized (class32.field657) {
                class32.field657 = null;
            }
        }
        ++field1192;
        int var2 = 73 / ((-54 - arg0) / 44);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lmi;")
    public static final class139 method486(int arg0, int arg1) {
        ++field1188;
        class139 var2 = (class139) class34.field691.method87(124, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 != 1) {
            return null;
        } else {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class32.field658.method1547(32767 & arg0, 0, 1);
            } else {
                var3 = class80.field1409.method1547(arg0, 0, 1);
            }
            class139 var4 = new class139();
            if (var3 != null) {
                var4.method977(new class28(var3), -28386);
            }
            class34.field691.method92((long) arg0, var4, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1181;
        if (this.field1190 != null) {
            class208 var11 = ~super.field3524 != 0 && ~super.field3537 == -1 ? class16.method113(super.field3524, (byte) 79) : null;
            class208 var12 = super.field3465 == -1 || ~super.field3466 == ~super.field3465 && var11 != null ? null : class16.method113(super.field3465, (byte) 110);
            class1 var13 = this.field1190.method1358(var11, 4, super.field3540, super.field3473, var12);
            if (var13 != null) {
                super.field3516 = var13.method5();
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                if (~this.field1190.field3861 != -1 && this.field1190.field3823 != 0) {
                    int var17 = class169.field3211[arg0];
                    int var18 = class169.field3220[arg0];
                    short var19 = this.field1190.field3861;
                    short var20 = this.field1190.field3823;
                    int var21 = -var19 / 2;
                    int var22 = -var20 / 2;
                    int var23 = var18 * var22 + -(var17 * var21) >> 16;
                    int var24 = var19 / 2;
                    int var25 = -var20 / 2;
                    int var26 = var17 * var25 + var18 * var24 >> 16;
                    int var27 = var20 / 2;
                    int var28 = var17 * var22 - -(var18 * var21) >> 16;
                    int var29 = var18 * var25 - var17 * var24 >> 16;
                    int var30 = class145.method1008(class125.field2246, super.field3505 + var28, super.field3490 - -var23, (byte) 123);
                    int var31 = class145.method1008(class125.field2246, super.field3505 + var26, super.field3490 + var29, (byte) -38);
                    int var32 = -var19 / 2;
                    int var33 = var17 * var27 + var18 * var32 >> 16;
                    int var34 = var18 * var27 - var17 * var32 >> 16;
                    int var35 = class145.method1008(class125.field2246, super.field3505 + var33, super.field3490 + var34, (byte) -101);
                    int var36 = var19 / 2;
                    int var37 = var20 / 2;
                    int var38 = var17 * var37 + var18 * var36 >> 16;
                    int var39 = var18 * var37 - var17 * var36 >> 16;
                    int var40 = ~var30 <= ~var35 ? var35 : var30;
                    int var41 = var31 > var30 ? var30 : var31;
                    int var42 = class145.method1008(class125.field2246, super.field3505 + var38, super.field3490 + var39, (byte) 100);
                    int var43 = var42 <= var31 ? var42 : var31;
                    int var44 = var35 < var42 ? var35 : var42;
                    var15 = 2047 & (int) (325.95D * Math.atan2((double) (-var44 + var41), (double) var20));
                    int var45 = var30 + var42;
                    if (~var15 != -1) {
                        var13.method21(var15);
                    }
                    var14 = 2047 & (int) (325.95D * Math.atan2((double) (-var43 + var40), (double) var19));
                    if (var14 != 0) {
                        var13.method9(var14);
                    }
                    if (var31 - -var35 < var45) {
                        var45 = var31 + var35;
                    }
                    var16 = (var45 >> 1) + -super.field3487;
                    if (~var16 != -1) {
                        var13.method14(0, var16, 0);
                    }
                }
                class1 var46 = null;
                if (~super.field3541 != 0 && ~super.field3526 != 0) {
                    class191 var47 = class207.method1370(super.field3541, (byte) -120);
                    var46 = var47.method1271(super.field3526, (byte) 95);
                    if (var46 != null) {
                        var46.method14(0, -super.field3478, 0);
                        if (var47.field3554) {
                            if (var15 != 0) {
                                var46.method21(var15);
                            }
                            if (~var14 != -1) {
                                var46.method9(var14);
                            }
                            if (~var16 != -1) {
                                var46.method14(0, var16, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class42) var13).method368(var46);
                }
                if (~this.field1190.field3851 == -2) {
                    var13.field1 = true;
                }
                var13.method19(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lhe;IZ)V")
    public static final void method487(class81 arg0, int arg1, boolean arg2) {
        ++field1182;
        if (class166.field3172 != null) {
            try {
                class166.field3172.method557(false);
            } catch (Exception var8) {
            }
            class166.field3172 = null;
        }
        class166.field3172 = arg0;
        class19.method129(arg1, arg2);
        class115.field2061 = 0;
        class5.field46 = null;
        class164.field3114.field526 = arg1;
        class61.field1122 = null;
        while (true) {
            class231 var3 = (class231) class99.field1722.method1042((byte) -25);
            if (var3 == null) {
                while (true) {
                    class231 var4 = (class231) class204.field3780.method1042((byte) -25);
                    if (var4 == null) {
                        if (~class215.field4010 != -1) {
                            try {
                                class28 var5 = new class28(4);
                                var5.method214((byte) 103, 4);
                                var5.method214((byte) 125, class215.field4010);
                                var5.method197(0, (byte) 51);
                                class166.field3172.method558(arg1 + 30000, 4, 0, var5.field502);
                            } catch (IOException var7) {
                                try {
                                    class166.field3172.method557(false);
                                } catch (Exception var6) {
                                }
                                ++class117.field2100;
                                class166.field3172 = null;
                            }
                        }
                        class136.field2587 = 0;
                        class52.field1045 = class214.method1416(arg1 ^ 22624);
                        return;
                    }
                    class245.field4483.method468(arg1, var4);
                    class68.field1230.method1044(var4, (byte) -14, var4.field1066);
                    ++class147.field2798;
                    --class229.field4213;
                }
            }
            class20.field331.method1044(var3, (byte) -14, var3.field1066);
            --class11.field147;
            ++class28.field506;
        }
    }
}
