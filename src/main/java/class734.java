import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class734 extends class322 {

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "Z")
    public static boolean field10226 = true;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "[I")
    public static int[] field10229 = new int[3];

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!sia", name = "r", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!sia", name = "s", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!sia", name = "t", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!sia", name = "u", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!sia", name = "v", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!sia", name = "w", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(B)V")
    public static void method4105(byte arg0) {
        field10229 = null;
        int var1 = 1 % ((31 - arg0) / 33);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I[I[ILkd;[I)V")
    public static final void method4106(int arg0, int[] arg1, int[] arg2, class280 arg3, int[] arg4) {
        int var5 = 0;
        if (arg0 < 71) {
            field10226 = true;
        }
        while (arg1.length > var5) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field7981.length > var9) {
                if (~(1 & var7) != -1) {
                    if (var6 == -1) {
                        arg3.field7981[var9] = null;
                    } else {
                        class709 var10 = class343.field4785.method3525(var6, (byte) 109);
                        int var11 = var10.field9848;
                        class132 var12 = arg3.field7981[var9];
                        if (var12 != null) {
                            if (~var12.field1944 != ~var6) {
                                if (var10.field9824 >= class343.field4785.method3525(var12.field1944, (byte) 123).field9824) {
                                    var12 = arg3.field7981[var9] = null;
                                }
                            } else if (~var11 == -1) {
                                var12 = arg3.field7981[var9] = null;
                            } else if (~var11 != -2) {
                                if (var11 == 2) {
                                    var12.field1941 = 0;
                                }
                            } else {
                                var12.field1946 = var8;
                                var12.field1947 = 0;
                                var12.field1941 = 0;
                                var12.field1942 = 0;
                                var12.field1940 = 1;
                                if (!arg3.field7970) {
                                    class346.method2239(-701644944, 0, arg3, var10);
                                }
                            }
                        }
                        if (var12 == null) {
                            class132 var13 = arg3.field7981[var9] = new class132();
                            var13.field1940 = 1;
                            var13.field1941 = 0;
                            var13.field1946 = var8;
                            var13.field1947 = 0;
                            var13.field1942 = 0;
                            var13.field1944 = var6;
                            if (!arg3.field7970) {
                                class346.method2239(-701644944, 0, arg3, var10);
                            }
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
            ++var5;
        }
        ++field10230;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lfp;I)V")
    public static final void method4107(class323 arg0, int arg1) {
        ++field10237;
        class196.field2613 = arg0.method2090(-119, "hitmarks");
        class404.field5715 = arg0.method2090(arg1 + 14016, "hitbar_default");
        class350.field4954 = arg0.method2090(111, "timerbar_default");
        class514.field7337 = arg0.method2090(arg1 ^ 13828, "headicons_pk");
        class8.field119 = arg0.method2090(arg1 ^ -13877, "headicons_prayer");
        field10236 = arg0.method2090(115, "hint_headicons");
        field10235 = arg0.method2090(-115, "hint_mapmarkers");
        class563.field7902 = arg0.method2090(-19, "mapflag");
        class29.field392 = arg0.method2090(arg1 ^ 13849, "cross");
        class609.field8565 = arg0.method2090(arg1 ^ -13881, "mapdots");
        class144.field2054 = arg0.method2090(109, "scrollbar");
        class237.field3178 = arg0.method2090(121, "name_icons");
        class199.field2622 = arg0.method2090(111, "floorshadows");
        class153.field2152 = arg0.method2090(111, "compass");
        class381.field5460 = arg0.method2090(arg1 + 13849, "otherlevel");
        if (arg1 != -13903) {
            method4109((byte) 103, -7);
        }
        class337.field4696 = arg0.method2090(-50, "hint_mapedge");
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -120 % ((arg0 - 70) / 51);
        ++field10232;
        if (!super.field4450.method2751(-18373)) {
            return super.field4450.field6521.method2558(5) && class160.method1057(super.field4450.field6521.method2556(false), (byte) 120) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(Z)I")
    public final int method4108(boolean arg0) {
        ++field10231;
        if (arg0) {
            field10236 = -53;
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field10227;
        if (super.field4450.method2751(-18373)) {
            super.field4451 = 2;
        }
        if (super.field4451 < 0 || super.field4451 > 2) {
            super.field4451 = this.method17((byte) -70);
        }
        if (arg0) {
            this.method17((byte) 53);
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lch;)V")
    public class734(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(BI)V")
    public static final void method4109(byte arg0, int arg1) {
        ++field10233;
        class592 var2 = class682.method3825(-652872096, 7, arg1);
        var2.method3350(0);
        if (arg0 > -17) {
            method4105((byte) 93);
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field10228;
        if (arg0 != 0) {
            field10236 = -3;
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        if (arg1 < 10) {
            return -119;
        } else {
            ++field10225;
            return super.field4450.method2751(-18373) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(ILch;)V")
    public class734(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "(B)Z")
    public final boolean method4110(byte arg0) {
        if (arg0 != -53) {
            this.method22(-36, -53);
        }
        ++field10224;
        return !super.field4450.method2751(arg0 + -18320);
    }
}
