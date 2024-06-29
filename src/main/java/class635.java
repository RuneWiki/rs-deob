import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class635 extends class322 {

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "D")
    public static double field8745;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lch;)V", line = 4)
    public class635(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I", line = 11)
    public final int method17(byte arg0) {
        ++field8746;
        int var2 = 123 / ((arg0 - 70) / 51);
        return 1;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)V", line = 21)
    public final void method22(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method23(true);
        }
        super.field4451 = arg1;
        ++field8750;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(ILch;)V", line = 32)
    public class635(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lbg;Lha;III)V", line = 35)
    public static final void method3529(class464 arg0, class58 arg1, int arg2, int arg3, int arg4) {
        ++field8753;
        class724.field10104.method2767((byte) -19);
        if (!class186.field2511) {
            for (class507 var5 = (class507) arg0.method2765(-12261); var5 != null; var5 = (class507) arg0.method2759(-15361)) {
                class344 var6 = class678.field9273.method3088((byte) -111, var5.field7257);
                if (class82.method637(83, var6)) {
                    boolean var7 = class677.method3770(arg4, var5, arg3, var6, arg1, (byte) -83);
                    if (var7) {
                        class357.method2295(var6, 0, arg1, var5);
                    }
                }
            }
            if (arg2 != 1) {
                method3531(false, -14, 107, (String) null, true, 90, false, -118, -127L, -95L, (String) null, -89, -6);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(Z)I", line = 68)
    public final int method3530(boolean arg0) {
        ++field8751;
        if (arg0) {
            field8745 = 0.07145571476750219D;
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIILjava/lang/String;ZIZIJJLjava/lang/String;II)V", line = 79)
    public static final void method3531(boolean arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5, boolean arg6, int arg7, long arg8, long arg9, String arg10, int arg11, int arg12) {
        ++field8748;
        if (!class436.field6192 && class25.field341 < 500) {
            int var15 = ~arg5 != arg12 ? arg5 : class86.field1057;
            class37 var16 = new class37(arg3, arg10, var15, arg7, arg2, arg9, arg11, arg1, arg6, arg0, arg8, arg4);
            class464.method2768(var16, false);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 94)
    public final void method23(boolean arg0) {
        if (arg0) {
            field8745 = 2.0508715910873483D;
        }
        if (super.field4451 != 1 && ~super.field4451 != -1) {
            super.field4451 = this.method17((byte) -66);
        }
        ++field8749;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[II[II[FIII[FII)V", line = 111)
    public static final void method3532(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, float[] arg6, int arg7, int arg8, int arg9, float[] arg10, int arg11, int arg12) {
        ++field8752;
        int var13 = arg5 * arg7 + arg0;
        if (arg9 <= -93) {
            int var14 = arg3 * arg12 + arg11;
            int var15 = -arg8 + arg5;
            int var16 = arg3 - arg8;
            if (arg4 != null) {
                if (arg10 == null) {
                    for (int var17 = 0; var17 < arg1; ++var17) {
                        int var18 = arg8 + var13;
                        while (var18 > var13) {
                            arg2[var14++] = arg4[var13++];
                        }
                        var13 += var15;
                        var14 += var16;
                    }
                } else {
                    for (int var19 = 0; var19 < arg1; ++var19) {
                        int var20 = arg8 + var13;
                        while (~var13 > ~var20) {
                            arg2[var14] = arg4[var13];
                            arg6[var14++] = arg10[var13++];
                        }
                        var13 += var15;
                        var14 += var16;
                    }
                }
            } else {
                for (int var21 = 0; ~var21 > ~arg1; ++var21) {
                    int var22 = arg8 + var13;
                    while (~var13 > ~var22) {
                        arg6[var14++] = arg10[var13++];
                    }
                    var14 += var16;
                    var13 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I", line = 195)
    public final int method19(int arg0, int arg1) {
        if (arg1 <= 10) {
            field8745 = 1.033663394373885D;
        }
        ++field8747;
        return 1;
    }
}
