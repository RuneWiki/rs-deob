import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class245 implements class117 {

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Ltb;")
    private class657 field3416 = class48.field711;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lkea;")
    public class77 field3410;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
    private boolean field3401;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lkf;")
    public class720 field3422;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lsb;")
    public class93 field3397;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Lqk;")
    public static class148 field3412 = new class148(43, 12);

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Lnga;")
    public static class672 field3417 = null;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "Lju;")
    public static class102 field3421 = new class102(51, 3);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lwu;")
    public static class557 field3413;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)V")
    public static void method1552(boolean arg0) {
        field3417 = null;
        field3421 = null;
        field3413 = null;
        if (!arg0) {
            field3412 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ[FI)V")
    public final void method1553(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        field3396++;
        if (arg4 > 0 && !class447.method2664(0, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class447.method2664(0, arg0)) {
            int var6 = this.field3410.field1054;
            int var7 = 0;
            int var8 = arg0 > arg4 ? arg4 : arg0;
            int var9 = arg4 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg3;
            if (!arg2) {
                this.method1561(-49);
            }
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var7, this.method1554(-124), arg4, arg0, 0, class185.method1243(-108, this.field3410), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg4 = var9;
                var11 = var15;
                arg0 = var10;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3402++;
        this.method1555(-107);
        super.finalize();
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
    public final int method1554(int arg0) {
        field3419++;
        if (arg0 > -101) {
            this.method1554(2);
        }
        if (class720.field10164 == this.field3422) {
            if (class126.field1742 == this.field3410) {
                return 6407;
            }
            if (class4.field10 == this.field3410) {
                return 6408;
            }
            if (class197.field2845 == this.field3410) {
                return 6406;
            }
            if (class678.field9551 == this.field3410) {
                return 6409;
            }
            if (class442.field6065 == this.field3410) {
                return 6410;
            }
            if (class10.field92 == this.field3410) {
                return 6145;
            }
        } else if (class720.field10167 == this.field3422) {
            if (class126.field1742 == this.field3410) {
                return 34843;
            }
            if (class4.field10 == this.field3410) {
                return 34842;
            }
            if (class197.field2845 == this.field3410) {
                return 34844;
            }
            if (class678.field9551 == this.field3410) {
                return 34846;
            }
            if (class442.field6065 == this.field3410) {
                return 34847;
            }
            if (class10.field92 == this.field3410) {
                return 6145;
            }
        } else if (class720.field10168 == this.field3422) {
            if (class126.field1742 == this.field3410) {
                return 34837;
            }
            if (class4.field10 == this.field3410) {
                return 34836;
            }
            if (class197.field2845 == this.field3410) {
                return 34838;
            }
            if (class678.field9551 == this.field3410) {
                return 34840;
            }
            if (class442.field6065 == this.field3410) {
                return 34841;
            }
            if (class10.field92 == this.field3410) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    private final void method1555(int arg0) {
        if (this.field3408 > 0) {
            this.field3397.method598(this.method1561(-70), this.field3408, 0);
            this.field3408 = 0;
        }
        if (arg0 >= -101) {
            this.method1555(15);
        }
        field3404++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[BIII)V")
    public final void method1556(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field3420++;
        if (arg2 > 0 && !class447.method2664(0, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class447.method2664(0, arg3)) {
            int var6 = this.field3410.field1054;
            int var7 = 0;
            int var8 = arg2 >= arg3 ? arg3 : arg2;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            int var11 = 119 % ((arg4 + 8) / 45);
            byte[] var12 = arg1;
            byte[] var13 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var7, this.method1554(-115), arg2, arg3, 0, class185.method1243(-126, this.field3410), 5121, var12, 0);
                if (var8 <= 1) {
                    return;
                }
                int var14 = arg2 * var6;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var6; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var10; var20++) {
                        for (int var21 = 0; var21 < var9; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var6 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var6 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var6 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var6 + var26;
                            var17 += var6;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg2 = var9;
                arg3 = var10;
                var12 = var15;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[III)V")
    public final void method1557(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field3403++;
        if (arg0 > 0 && !class447.method2664(0, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class447.method2664(0, arg1)) {
            throw new IllegalArgumentException("");
        } else if (class4.field10 == this.field3410) {
            int var6 = 0;
            int var7 = arg0 < arg1 ? arg0 : arg1;
            int var8 = arg0 >> 1;
            if (arg4 != 65280) {
                method1552(false);
            }
            int var9 = arg1 >> 1;
            int[] var10 = arg2;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var6, this.method1554(-119), arg0, arg1, 0, 32993, this.field3397.field1362, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var18 & 0xFF;
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var18 >> 8 & 0xFF;
                        int var24 = var10[var14++];
                        int var25 = (var18 & 0xFF80F1) >> 16;
                        int var26 = (var19 >> 8 & 0xFF) + var23;
                        int var27 = (var19 >> 24 & 0xFF) + var22;
                        int var28 = (var19 & 0xFF) + var21;
                        int var29 = ((var19 & 0xFF1B52) >> 16) + var25;
                        int var30 = ((var20 & 0xFFFE) >> 8) + var26;
                        int var31 = (var20 >> 24 & 0xFF) + var27;
                        int var32 = (var20 & 0xFF) + var28;
                        int var33 = (var20 >> 16 & 0xFF) + var29;
                        int var34 = (var24 >> 8 & 0xFF) + var30;
                        int var35 = (var24 & 0xFF) + var32;
                        int var36 = (var24 >> 24 & 0xFF) + var31;
                        int var37 = ((var24 & 0xFFC458) >> 16) + var33;
                        var11[var12++] = class747.method4153(class747.method4153(class747.method4153(class136.method878(var36, 1020) << 22, class136.method878(var37, 1020) << 14), class136.method878(65280, var34 << 6)), class136.method878(1020, var35) >> 2);
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg0 = var8;
                arg1 = var9;
                var7 >>= 0x1;
                var6++;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lww;ILww;)V")
    public static final void method1558(class287 arg0, int arg1, class287 arg2) {
        field3411++;
        if (arg0.field3775 != null) {
            arg0.method1706((byte) 79);
        }
        arg0.field3781 = arg2;
        arg0.field3775 = arg2.field3775;
        arg0.field3775.field3781 = arg0;
        arg0.field3781.field3775 = arg0;
        int var3 = -20 % ((-arg1 - 1) / 52);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1559(int arg0, String arg1) {
        field3399++;
        if (!class13.field187 || (class626.field8934 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class147.field2030;
        int[] var4 = class351.field4456;
        for (int var5 = 0; var5 < var3; var5++) {
            class655 var6 = class40.field563[var4[var5]];
            if (var6.field9272 != null && var6.field9272.equalsIgnoreCase(arg1) && (class473.field6483 == var6 && (class626.field8934 & 0x10) != 0 || var6 != null && (class626.field8934 & 0x8) != 0)) {
                class238.field3306++;
                class120 var7 = class292.method1716(class608.field8668, true, class233.field3243);
                var7.field1653.method137(295502000, class480.field6527);
                var7.field1653.method142(class724.field10190, 5);
                var7.field1653.method148(0, 18);
                var7.field1653.method142(var4[var5], 5);
                var7.field1653.method142(class220.field3109, 5);
                class471.method2805(120, var7);
                var2 = true;
                class176.method1104(0, var6.method3470(-1), var6.field8414[0], var6.method3470(-1), 0, true, var6.field8421[0], (byte) -76, -2);
                break;
            }
        }
        if (arg0 < 100) {
            method1559(112, null);
        }
        if (!var2) {
            class216.method1417(class138.field1857.method891(-2041650704, class369.field4721) + arg1, (byte) 127, 4);
        }
        if (class13.field187) {
            class254.method1598((byte) -32);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLtb;)V")
    public final void method521(byte arg0, class657 arg1) {
        if (arg0 >= -65) {
            return;
        }
        field3414++;
        if (this.field3416 != arg1) {
            this.field3416 = arg1;
            this.method1562((byte) -107);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method770(int arg0) {
        field3418++;
        int var2 = this.field3397.method2950(true);
        int var3 = this.field3397.field1365[var2];
        if (this.field3406 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field3406);
            this.field3397.field1365[var2] = this.field3406;
        }
        if (arg0 != -27531) {
            this.method1556(35, null, -52, 4, -27);
        }
        OpenGL.glBindTexture(this.field3406, this.field3408);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    private final void method1560(int arg0, int arg1) {
        this.field3397.field6795 -= arg0;
        field3415++;
        this.field3397.field6795 += this.method1561(-97);
        if (arg1 < 64) {
            this.field3401 = true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)I")
    private final int method1561(int arg0) {
        if (arg0 > -60) {
            field3421 = null;
        }
        field3405++;
        int var2 = this.field3410.field1054 * this.field3398 * this.field3422.field10158;
        return this.field3401 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    private final void method1562(byte arg0) {
        this.field3397.method2933((byte) 104, this);
        if (arg0 >= -97) {
            field3409 = -91;
        }
        field3407++;
        if (class48.field711 == this.field3416) {
            OpenGL.glTexParameteri(this.field3406, 10241, this.field3401 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3406, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3406, 10241, this.field3401 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3406, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lsb;ILkea;Lkf;IZ)V")
    public class245(class93 arg0, int arg1, class77 arg2, class720 arg3, int arg4, boolean arg5) {
        this.field3410 = arg2;
        this.field3398 = arg4;
        this.field3406 = arg1;
        this.field3401 = arg5;
        this.field3422 = arg3;
        this.field3397 = arg0;
        OpenGL.glGenTextures(1, class648.field9193, 0);
        this.field3408 = class648.field9193[0];
        this.method1562((byte) -101);
        this.method1560(0, 125);
    }
}
