import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class750 extends class331 {

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
    public boolean field10491 = false;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "Z")
    private boolean field10500 = true;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Lem;")
    public static class610 field10490 = new class610(1);

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "F")
    public static float field10501;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
    public static int field10495;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    public static int field10499;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "J")
    public static long field10503;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "Lql;")
    public static class187 field10496;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "Let;")
    public static class718 field10502;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (arg0 != -1959) {
            this.method224(51);
        }
        ++field10488;
        if (!super.field4203.method343((byte) 127).method360(-5531)) {
            super.field4202 = 0;
        }
        if (~super.field4202 > -1 || ~super.field4202 < -6) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        ++field10499;
        this.field10491 = false;
        super.field4202 = arg1;
        if (arg0 <= 113) {
            method4186((byte) 116);
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
    public static void method4186(byte arg0) {
        field10490 = null;
        field10502 = null;
        if (arg0 != -12) {
            field10503 = -93L;
        }
        field10496 = null;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)Z")
    public final boolean method4187(byte arg0) {
        ++field10486;
        if (arg0 <= 103) {
            method4190(-25, true);
        }
        return super.field4203.method343((byte) 126).method360(-5531);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(ILts;)V")
    public class750(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([Lmb;II)V")
    public static final void method4188(class410[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class410 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field5783;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field5783 > (var7 & 1) + var6) {
                    class410 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method4188(arg0, arg1, var4 - 1);
            method4188(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)Ljt;")
    public static final class635 method4189(byte arg0, int arg1) {
        ++field10497;
        class635[] var2 = class68.method508(0);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class635 var5 = var2[var3];
            if (var5.field8797 == arg1) {
                return var5;
            }
        }
        int var4 = -4 % ((arg0 - -13) / 45);
        return null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field10495;
        if (arg1 != 1) {
            return 33;
        } else if (!super.field4203.method343((byte) 126).method360(-5531)) {
            return 3;
        } else {
            return arg0 == 3 && !class376.method2278(-5, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
    public static final void method4190(int arg0, boolean arg1) {
        ++field10489;
        class379.field5303 = null;
        class714.field10062 = arg0;
        class130.field1562 = -1;
        class55.field799 = null;
        class98.field1225 = -1;
        class646.field8905 = false;
        if (!arg1) {
            field10496 = null;
        }
        class244.field3142 = 1;
        class74.field991 = 0;
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(B)I")
    public final int method4191(byte arg0) {
        ++field10493;
        return arg0 >= -119 ? -101 : super.field4202;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return -13;
        } else {
            ++field10498;
            this.field10491 = true;
            return !super.field4203.method343((byte) 124).method360(arg0 + -5544) ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII[FIII)V")
    public static final void method4192(byte arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        ++field10492;
        if (~arg5 < -1 && !class487.method2850((byte) 66, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class487.method2850((byte) 98, arg1)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class447.method2638((byte) 18, arg2);
            int var8 = 0;
            int var9 = ~arg1 < ~arg5 ? arg5 : arg1;
            int var10 = arg5 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var7];
            if (arg0 <= -52) {
                while (true) {
                    OpenGL.glTexImage2Df(arg4, var8, arg6, arg5, arg1, 0, arg2, 5126, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg5 * var7;
                    for (int var15 = 0; var7 > var15; ++var15) {
                        int var17 = var15;
                        int var18 = var15;
                        int var19 = var14 + var15;
                        for (int var20 = 0; var11 > var20; ++var20) {
                            for (int var21 = 0; ~var21 > ~var10; ++var21) {
                                float var22 = var12[var18];
                                int var23 = var7 + var18;
                                float var24 = var12[var23] + var22;
                                float var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                float var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = var27 * 0.25F;
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    float[] var16 = var13;
                    var13 = var12;
                    arg1 = var11;
                    arg5 = var10;
                    var12 = var16;
                    var10 >>= 1;
                    var11 >>= 1;
                    ++var8;
                    var9 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(B)Z")
    public final boolean method4193(byte arg0) {
        if (arg0 < 46) {
            field10496 = null;
        }
        ++field10494;
        return this.field10500;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lkha;I)V")
    public static final void method4194(class687 arg0, int arg1) {
        class402.field5564 = arg0;
        if (arg1 != 5126) {
            method4194((class687) null, -34);
        }
        ++field10487;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(IZ)V")
    public final void method4195(int arg0, boolean arg1) {
        ++field10485;
        this.field10500 = arg1;
        if (arg0 != -1) {
            this.method227(-78, -17);
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lts;)V")
    public class750(class41 arg0) {
        super(arg0);
    }
}
