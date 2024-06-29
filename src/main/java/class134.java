import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class134 extends class703 implements class761 {

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lvd;")
    public static class39 field1791;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)J")
    public final long method941(int arg0) {
        if (arg0 != 19512) {
            this.field1796 = -118;
        }
        ++field1797;
        return 0L;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
    public final int method942(byte arg0) {
        if (arg0 > -116) {
            this.method942((byte) -77);
        }
        ++field1792;
        return this.field1796;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[ILbs;[I[I)V")
    public static final void method943(int arg0, int[] arg1, class689 arg2, int[] arg3, int[] arg4) {
        ++field1794;
        if (arg0 != 34962) {
            method946(91, (String) null);
        }
        for (int var5 = 0; ~arg3.length < ~var5; ++var5) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field6116.length > var9) {
                if ((1 & var7) != 0) {
                    if (var6 == -1) {
                        arg2.field6116[var9] = null;
                    } else {
                        class288 var10 = class742.field10404.method2663(0, var6);
                        int var11 = var10.field4094;
                        class75 var12 = arg2.field6116[var9];
                        if (var12 != null) {
                            if (var12.field1046 == var6) {
                                if (~var11 == -1) {
                                    var12 = arg2.field6116[var9] = null;
                                } else if (~var11 != -2) {
                                    if (~var11 == -3) {
                                        var12.field1048 = 0;
                                    }
                                } else {
                                    var12.field1047 = 1;
                                    var12.field1043 = 0;
                                    var12.field1048 = 0;
                                    var12.field1042 = var8;
                                    var12.field1045 = 0;
                                    if (!arg2.field6095) {
                                        class294.method1865(0, arg2, var10, -18);
                                    }
                                }
                            } else if (var10.field4098 >= class742.field10404.method2663(0, var12.field1046).field4098) {
                                var12 = arg2.field6116[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class75 var13 = arg2.field6116[var9] = new class75();
                            var13.field1042 = var8;
                            var13.field1047 = 1;
                            var13.field1046 = var6;
                            var13.field1043 = 0;
                            var13.field1048 = 0;
                            var13.field1045 = 0;
                            if (!arg2.field6095) {
                                class294.method1865(0, arg2, var10, arg0 ^ -35007);
                            }
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII[F[FFI)V")
    public static final void method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, float[] arg8, float arg9, int arg10) {
        int var11 = arg5 - arg6;
        int var12 = arg3 - arg0;
        ++field1795;
        if (arg2 != -19454) {
            method950(112, -62, true);
        }
        int var13 = arg4 - arg10;
        float var14 = arg7[2] * (float) var12 + arg7[1] * (float) var11 + arg7[0] * (float) var13;
        float var15 = arg7[5] * (float) var12 + arg7[3] * (float) var13 + arg7[4] * (float) var11;
        float var16 = arg7[8] * (float) var12 + arg7[7] * (float) var11 + arg7[6] * (float) var13;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        float var19 = arg9 + 0.5F + (float) Math.asin((double) (var15 / var17)) / 3.1415927F;
        if (arg1 != 1) {
            if (~arg1 == -3) {
                var19 = -var19;
                var18 = -var18;
            } else if (~arg1 == -4) {
                float var20 = var18;
                var18 = var19;
                var19 = -var20;
            }
        } else {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        }
        arg8[0] = var18;
        arg8[1] = var19;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static void method945(int arg0) {
        if (arg0 == 16281) {
            field1791 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method946(int arg0, String arg1) {
        if (arg0 != 6981) {
            return 39;
        } else {
            ++field1801;
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                var3 = class631.method3639(arg1.charAt(var4), (byte) -31) + (var3 << 5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)V")
    public final void method947(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 == 5089) {
            this.method4000(arg1, true, arg2);
            ++field1799;
            this.field1796 = arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lwh;ILjaclib/memory/Buffer;IZ)V")
    public class134(class148 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1796 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lmi;")
    public static final class497 method948(int arg0, int arg1) {
        ++field1802;
        class497 var2 = new class497(arg0, false);
        int var3 = -112 / ((-22 - arg1) / 62);
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public final void method949(int arg0) {
        ++field1800;
        int var2 = -111 % ((56 - arg0) / 57);
        super.field9808.method1076((byte) -115, this);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)V")
    public static final void method950(int arg0, int arg1, boolean arg2) {
        class592.method3462(class430.field6382.method2679(class650.field9160, -71), arg2, arg1, arg0 + -64);
        ++field1798;
        if (arg0 != 0) {
            method943(-9, (int[]) null, (class689) null, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
    public final int method951(int arg0) {
        if (arg0 <= 35) {
            method943(43, (int[]) null, (class689) null, (int[]) null, (int[]) null);
        }
        ++field1793;
        return super.field9807;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lwh;I[BIZ)V")
    public class134(class148 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1796 = arg1;
    }
}
