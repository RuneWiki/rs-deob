import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class263 {

    @OriginalMember(owner = "client!v", name = "j", descriptor = "J")
    public long field4122 = 0L;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[J")
    public static long[] field4113 = new long[1000];

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
    public static int[] field4121 = new int[1000];

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4117 = new String[1000];

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static volatile int field4131 = 0;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lgh;")
    public class248 field4118;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[[[B")
    public static byte[][][] field4114;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 4)
    public static void method1884(int arg0) {
        field4117 = null;
        if (arg0 != -512) {
            method1887(-11, -80, -25, 95, -43, 51, 14, -37);
        }
        field4121 = null;
        field4114 = (byte[][][]) null;
        field4113 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)V", line = 22)
    public static final void method1885(boolean arg0, int arg1) {
        if (arg0) {
            field4113 = (long[]) null;
        }
        field4133++;
        class120.field1670.method1353(-1, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILvl;)Lvg;", line = 37)
    public static final class24 method1886(int arg0, class6 arg1) {
        if (arg0 != 22300) {
            method1886(-118, (class6) null);
        }
        field4128++;
        return new class24(arg1.method78((byte) -43), arg1.method78((byte) -36), arg1.method78((byte) -84), arg1.method78((byte) -48), arg1.method31(arg0 ^ 0xFFFFF184), arg1.method58(-288140008));
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIII)Z", line = 79)
    public static final boolean method1887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4120++;
        long var8 = class204.method1506(arg4, arg5 + arg7, arg0 + arg2);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x3CEFAA) >> 20;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class121 var13 = class249.method1790(67, var12);
            if (var13.field1723 == -1) {
                int[] var14 = class280.field4310;
                int var15 = arg3;
                if (var8 > 0L) {
                    var15 = arg1;
                }
                int var16 = (52736 - (arg2 * 512)) * 4 + arg7 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 515] = var15;
                        var14[var16 + 1024 + 3] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1538] = var15;
                        var14[var16 + 1539] = var15;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1539] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 512 + 3] = var15;
                        var14[var16 + 3 + 1024] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1538] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class70.method547(false, var10, arg5, arg0, arg7, var13, arg2)) {
                return false;
            }
        }
        long var17 = class20.method203(arg4, arg5 + arg7, arg2 - -arg0);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class121 var22 = class249.method1790(74, var21);
            if (var22.field1723 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var24 = (103 - arg2) * 512 * 4 + ((arg7 * 4) + 24624);
                    int[] var25 = class280.field4310;
                    if (var19 == 0 || var19 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1024 + 1] = var23;
                        var25[var24 + 512 + 2] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 2 + 1024] = var23;
                        var25[var24 + 1536 + 3] = var23;
                    }
                }
            } else if (!class70.method547(false, var19, arg5, arg0, arg7, var22, arg2)) {
                return false;
            }
        }
        if (arg6 != -3) {
            field4131 = 8;
        }
        long var26 = class145.method1075(arg4, arg5 + arg7, arg0 + arg2);
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            int var29 = ((int) var26 & 0x365F1D) >> 20;
            class121 var30 = class249.method1790(112, var28);
            if (var30.field1723 != -1 && !class70.method547(false, var29, arg5, arg0, arg7, var30, arg2)) {
                return false;
            }
        }
        return true;
    }
}
