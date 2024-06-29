import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class691 extends class667 implements class407 {

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    private int field10115;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10122 = new String[] { method5062(method5061("]\u0013$o")), method5062(method5061("HHf-n")), method5062(method5061("Z\u0005)-/Z\b!w-\u001b")), method5062(method5061("Z\u0005)-V\u001b")), method5062(method5061("Z\u0005)-W\u001b")), method5062(method5061("Z\u0005)-R\u001b")), method5062(method5061("Z\u0005)-Q\u001b")), method5062(method5061("Z\u0005)-P\u001b")), method5062(method5061("Z\u0005)-U\u001b")) };

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field10120;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I", line = 3)
    public final int method3185(byte arg0) {
        try {
            ++field10117;
            if (arg0 >= -126) {
                this.field10115 = -79;
            }
            return this.field10115;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10122[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method5060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field10116;
            class7.method50(arg3, (byte) 91);
            int var7 = 0;
            int var8 = -arg5 + arg3;
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = arg3;
            int var10 = -arg3;
            int var11 = var8;
            int var12 = -var8;
            if (arg2 > -50) {
                method5060(95, 107, 107, 51, 11, 123, -96);
            }
            int var13 = -1;
            if (~arg1 <= ~class676.field9807 && ~class381.field5786 <= ~arg1) {
                int[] var14 = class243.field3731[arg1];
                int var15 = class541.method4089(class200.field3119, class676.field9797, -arg3 + arg0, 18286);
                int var16 = class541.method4089(class200.field3119, class676.field9797, arg0 - -arg3, 18286);
                int var17 = class541.method4089(class200.field3119, class676.field9797, arg0 - var8, 18286);
                int var18 = class541.method4089(class200.field3119, class676.field9797, arg0 + var8, 18286);
                class319.method2702(var14, var15, var17, true, arg4);
                class319.method2702(var14, var17, var18, true, arg6);
                class319.method2702(var14, var18, var16, true, arg4);
            }
            int var19 = -1;
            while (var7 < var9) {
                var19 += 2;
                var13 += 2;
                var12 += var19;
                var10 += var13;
                if (~var12 <= -1 && ~var11 <= -2) {
                    --var11;
                    class20.field232[var11] = var7;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (~var10 <= -1) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = arg1 - var9;
                    int var21 = arg1 + var9;
                    if (class676.field9807 <= var21 && class381.field5786 >= var20) {
                        if (var9 < var8) {
                            int var22 = class20.field232[var9];
                            int var23 = class541.method4089(class200.field3119, class676.field9797, arg0 - -var7, 18286);
                            int var24 = class541.method4089(class200.field3119, class676.field9797, -var7 + arg0, 18286);
                            int var25 = class541.method4089(class200.field3119, class676.field9797, arg0 + var22, 18286);
                            int var26 = class541.method4089(class200.field3119, class676.field9797, -var22 + arg0, 18286);
                            if (~class381.field5786 <= ~var21) {
                                int[] var27 = class243.field3731[var21];
                                class319.method2702(var27, var24, var26, true, arg4);
                                class319.method2702(var27, var26, var25, true, arg6);
                                class319.method2702(var27, var25, var23, true, arg4);
                            }
                            if (var20 >= class676.field9807) {
                                int[] var28 = class243.field3731[var20];
                                class319.method2702(var28, var24, var26, true, arg4);
                                class319.method2702(var28, var26, var25, true, arg6);
                                class319.method2702(var28, var25, var23, true, arg4);
                            }
                        } else {
                            int var29 = class541.method4089(class200.field3119, class676.field9797, arg0 + var7, 18286);
                            int var30 = class541.method4089(class200.field3119, class676.field9797, -var7 + arg0, 18286);
                            if (~var21 >= ~class381.field5786) {
                                class319.method2702(class243.field3731[var21], var30, var29, true, arg4);
                            }
                            if (var20 >= class676.field9807) {
                                class319.method2702(class243.field3731[var20], var30, var29, true, arg4);
                            }
                        }
                    }
                }
                int var31 = arg1 - var7;
                int var32 = arg1 - -var7;
                if (var32 >= class676.field9807 && ~var31 >= ~class381.field5786) {
                    int var33 = arg0 - -var9;
                    int var34 = -var9 + arg0;
                    if (~var33 <= ~class200.field3119 && var34 <= class676.field9797) {
                        int var35 = class541.method4089(class200.field3119, class676.field9797, var33, 18286);
                        int var36 = class541.method4089(class200.field3119, class676.field9797, var34, 18286);
                        if (var7 >= var8) {
                            if (~var32 >= ~class381.field5786) {
                                class319.method2702(class243.field3731[var32], var36, var35, true, arg4);
                            }
                            if (class676.field9807 <= var31) {
                                class319.method2702(class243.field3731[var31], var36, var35, true, arg4);
                            }
                        } else {
                            int var37 = ~var7 >= ~var11 ? var11 : class20.field232[var7];
                            int var38 = class541.method4089(class200.field3119, class676.field9797, arg0 + var37, 18286);
                            int var39 = class541.method4089(class200.field3119, class676.field9797, arg0 - var37, 18286);
                            if (class381.field5786 >= var32) {
                                int[] var40 = class243.field3731[var32];
                                class319.method2702(var40, var36, var39, true, arg4);
                                class319.method2702(var40, var39, var38, true, arg6);
                                class319.method2702(var40, var38, var35, true, arg4);
                            }
                            if (class676.field9807 <= var31) {
                                int[] var41 = class243.field3731[var31];
                                class319.method2702(var41, var36, var39, true, arg4);
                                class319.method2702(var41, var39, var38, true, arg6);
                                class319.method2702(var41, var38, var35, true, arg4);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var43) {
            throw class759.method5498(var43, field10122[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI[BI)V", line = 204)
    public final void method3186(byte arg0, int arg1, byte[] arg2, int arg3) {
        try {
            this.method4912((byte) 107, arg2, arg3);
            ++field10119;
            if (arg0 != -82) {
                this.field10115 = 87;
            }
            this.field10115 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10122[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10122[1] : field10122[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lffa;ILjaclib/memory/Buffer;IZ)V", line = 218)
    public class691(class197 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        try {
            this.field10115 = arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10122[2] + (arg0 != null ? field10122[1] : field10122[0]) + ',' + arg1 + ',' + (arg2 != null ? field10122[1] : field10122[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I", line = 226)
    public final int method3184(int arg0) {
        try {
            if (arg0 != -24909) {
                this.method3186((byte) -106, 22, (byte[]) null, -45);
            }
            ++field10118;
            return super.field9696;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10122[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lffa;I[BIZ)V", line = 240)
    public class691(class197 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        try {
            this.field10115 = arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10122[2] + (arg0 != null ? field10122[1] : field10122[0]) + ',' + arg1 + ',' + (arg2 != null ? field10122[1] : field10122[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)J", line = 248)
    public final long method3187(byte arg0) {
        try {
            int var2 = 98 % ((arg0 - 91) / 33);
            ++field10120;
            return 0L;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10122[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)V", line = 262)
    public final void method456(boolean arg0) {
        try {
            ++field10121;
            if (!arg0) {
                super.field9700.method1734(0, this);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10122[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5061(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 19);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5062(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
