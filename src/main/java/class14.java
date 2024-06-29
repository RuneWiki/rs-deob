import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class14 {

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lvd;")
    private class258 field180;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "Lne;")
    private class138 field190;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "[B")
    public byte[] field181;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Laa;")
    public static class76 field185 = new class76(74, 3);

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field191 = -1;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Lem;")
    public static class496 field194 = new class496(0, 0);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Ll;")
    public static class127 field187;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "[I")
    public static int[] field188;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "[[Lao;")
    private class300[][] field182;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILba;IZ)Z", line = 5)
    public final boolean method182(int arg0, class502 arg1, int arg2, boolean arg3) {
        field189++;
        class276 var5 = (class276) arg1;
        int var6 = var5.field4122 + arg0 + 1;
        int var7 = var5.field4119 + arg2 + 1;
        int var8 = var7 + (this.field186 * var6);
        int var9 = var5.field4115;
        int var10 = var5.field4116;
        int var11 = this.field186 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var9 -= var12;
            var8 += this.field186 * var12;
        }
        if (this.field193 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field193;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
        }
        if (arg3) {
            this.field181 = null;
        }
        if (this.field186 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field186;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field186 + var11;
            return class524.method3104(var9, var17, var10, var16, this.field181, var8, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V", line = 80)
    private final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field183++;
        if (this.field182 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 2 >> 7;
        if (arg1 != -8259) {
            this.method186(67, null, 90, -77);
        }
        int var8 = arg3 - 1 >> 7;
        int var9 = arg0 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class300[] var11 = this.field182[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4460 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 121)
    public final void method184(boolean arg0) {
        this.field182 = new class300[this.field175][this.field178];
        if (!arg0) {
            return;
        }
        field179++;
        for (int var2 = 0; var2 < this.field178; var2++) {
            for (int var3 = 0; var3 < this.field175; var3++) {
                this.field182[var3][var2] = new class300(this.field180, this, this.field190, var3, var2, this.field177, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lsj;", line = 149)
    public static final class506 method185(int arg0, int arg1, int arg2) {
        if (arg0 != -1304589728) {
            field194 = null;
        }
        field192++;
        class506 var3 = (class506) class50.field634.method3059(97, (long) arg1 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class506(arg2, arg1);
            class50.field634.method3055(0, var3.field1739, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILba;II)V", line = 170)
    public final void method186(int arg0, class502 arg1, int arg2, int arg3) {
        field173++;
        class276 var5 = (class276) arg1;
        int var6 = var5.field4122 + arg3 + 1;
        int var7 = var5.field4119 + arg2 + 1;
        int var8 = var7 + (this.field186 * var6);
        int var9 = 0;
        int var10 = var5.field4115;
        int var11 = var5.field4116;
        int var12 = this.field186 - var11;
        int var13 = arg0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += this.field186 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (this.field193 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field193;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var8 += var16;
            var9 += var16;
            var7 = 1;
            var11 -= var16;
            var13 = arg0 + var16;
        }
        if (this.field186 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field186;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class304.method1893(var9, 107, var11, var12, var5.field4118, var13, this.field181, var10, var8);
            this.method183(var10, -8259, var7, var6, var11);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BZ[[ZIII)V", line = 244)
    public final void method187(byte arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        this.field180.method1574(false, -79);
        field176++;
        this.field180.method1557(18546, false);
        this.field180.method1613(-2, -1);
        this.field180.method1582(1, true);
        if (arg0 < 121) {
            this.method182(78, null, 120, false);
        }
        this.field180.method1594(1, 256);
        float var7 = 1.0F / (float) (this.field180.field3702 * 128);
        if (arg1) {
            for (int var22 = 0; var22 < this.field178; var22++) {
                int var23 = var22 << this.field177;
                int var24 = var22 + 1 << this.field177;
                label88: for (int var25 = 0; var25 < this.field175; var25++) {
                    int var26 = var25 << this.field177;
                    int var27 = var25 + 1 << this.field177;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((var28 - arg3) >= (-arg5) && arg5 >= var28 - arg3) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (-arg5 <= var29 - arg4 && (var29 - arg4) <= arg5 && arg2[var28 + arg5 - arg3][arg5 + var29 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field182[var25][var22].method1866(0);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field178; var8++) {
                int var9 = var8 << this.field177;
                int var10 = var8 + 1 << this.field177;
                for (int var11 = 0; var11 < this.field175; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field177;
                    int var14 = var11 + 1 << this.field177;
                    class299 var15 = this.field180.field3733;
                    var15.field6830 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((var16 - arg4) >= (-arg5) && (var16 - arg4) <= arg5) {
                            int var17 = this.field190.field5198 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg3 >= -arg5 && (var18 - arg3) <= arg5 && arg2[var18 + arg5 - arg3][var16 + arg5 - arg4]) {
                                    short[] var19 = this.field190.field2088[var17];
                                    if (var19 != null) {
                                        if (this.field180.field3821) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method2777((byte) 74, var19[var21] & 0xFFFF);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method2760(true, var19[var20] & 0xFFFF);
                                                var12++;
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field182[var11][var8].method1862(var15.field6868, 5123, var12, (byte) -110);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 432)
    public static void method188(int arg0) {
        field188 = null;
        field185 = null;
        field187 = null;
        if (arg0 >= -49) {
            method185(-54, 39, -21);
        }
        field194 = null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)V", line = 453)
    public static final void method189(int arg0, int arg1, int arg2) {
        if (arg1 != -19777) {
            method185(110, -43, 72);
        }
        if ((class137.field2023 > class137.field2026)) {
            class137.field2026 = (float) ((double) class137.field2026 / 30.0D + (double) class137.field2026);
            if (class137.field2026 > class137.field2023) {
                class137.field2026 = class137.field2023;
            }
            class239.method1468((byte) 18);
            class137.field2029 = (int) class137.field2026 >> 1;
            class137.field2027 = class158.method1124(class137.field2029, (byte) 1);
        } else if (class137.field2023 < class137.field2026) {
            class137.field2026 = (float) ((double) class137.field2026 - (double) class137.field2026 / 30.0D);
            if (class137.field2023 > class137.field2026) {
                class137.field2026 = class137.field2023;
            }
            class239.method1468((byte) 27);
            class137.field2029 = (int) class137.field2026 >> 1;
            class137.field2027 = class158.method1124(class137.field2029, (byte) 1);
        }
        field184++;
        if (class9.field87 != -1 && class30.field425 != -1) {
            int var3 = class9.field87 - class170.field2508;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class30.field425 - class473.field6977;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class170.field2508 += var3;
            if (var3 == 0 && var4 == 0) {
                class9.field87 = -1;
                class30.field425 = -1;
            }
            class473.field6977 += var4;
            class239.method1468((byte) -115);
        }
        if (class341.field5244 > 0) {
            class197.field2888--;
            if (class197.field2888 == 0) {
                class197.field2888 = 100;
                class341.field5244--;
            }
        } else {
            field191 = -1;
            class154.field2331 = -1;
        }
        if (!class164.field2444 || class6.field59 == null) {
            return;
        }
        for (class174 var5 = (class174) class6.field59.method2957(arg1 + 19871); var5 != null; var5 = (class174) class6.field59.method2947(-112)) {
            class473 var6 = class137.field2014.method699(var5.field2536.field3137, 117);
            if (var5.method1195(arg2, arg0, -10364)) {
                if (var6.field6956 != null) {
                    if (var6.field6956[4] != null) {
                        class393.method2363(var6.field6967, var6.field6956[4], -1, false, 0, -1, var6.field6927, 0, (long) var5.field2536.field3137, true, 1003);
                    }
                    if (var6.field6956[3] != null) {
                        class393.method2363(var6.field6967, var6.field6956[3], -1, false, arg1 ^ 0xFFFFB2BF, -1, var6.field6927, 0, (long) var5.field2536.field3137, true, 1004);
                    }
                    if (var6.field6956[2] != null) {
                        class393.method2363(var6.field6967, var6.field6956[2], -1, false, arg1 + 19777, -1, var6.field6927, 0, (long) var5.field2536.field3137, true, 1001);
                    }
                    if (var6.field6956[1] != null) {
                        class393.method2363(var6.field6967, var6.field6956[1], -1, false, 0, -1, var6.field6927, 0, (long) var5.field2536.field3137, true, 1007);
                    }
                    if (var6.field6956[0] != null) {
                        class393.method2363(var6.field6967, var6.field6956[0], -1, false, 0, -1, var6.field6927, 0, (long) var5.field2536.field3137, true, 1002);
                    }
                }
                if (!var5.field2536.field3138) {
                    var5.field2536.field3138 = true;
                    class64.method453(class228.field3214, var5.field2536.field3137, var6.field6967);
                }
                if (var5.field2536.field3138) {
                    class64.method453(class140.field2114, var5.field2536.field3137, var6.field6967);
                }
            } else if (var5.field2536.field3138) {
                var5.field2536.field3138 = false;
                class64.method453(class328.field5129, var5.field2536.field3137, var6.field6967);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILba;I)V", line = 594)
    public final void method190(int arg0, int arg1, class502 arg2, int arg3) {
        field174++;
        class276 var5 = (class276) arg2;
        int var6 = var5.field4119 + arg0 + arg1;
        int var7 = var5.field4122 + arg3 + 1;
        int var8 = var6 + (this.field186 * var7);
        int var9 = 0;
        int var10 = var5.field4115;
        int var11 = var5.field4116;
        int var12 = this.field186 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field186 * var13;
            var7 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field193) {
            int var15 = var7 + var10 + 1 - this.field193;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var9 += var16;
            var6 = 1;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field186) {
            int var17 = var6 + var11 + 1 - this.field186;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class364.method2175(var10, var11, 0, var5.field4118, this.field181, var14, var9, var12, var8);
            this.method183(var10, -8259, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lvd;Lne;)V", line = 668)
    public class14(class258 arg0, class138 arg1) {
        this.field180 = arg0;
        this.field190 = arg1;
        this.field186 = (this.field190.field5198 * this.field190.field5193 >> this.field180.field3701) + 2;
        this.field193 = (this.field190.field5200 * this.field190.field5193 >> this.field180.field3701) + 2;
        this.field181 = new byte[this.field193 * this.field186];
        this.field177 = this.field180.field3701 + 7 - this.field190.field5197;
        this.field175 = this.field190.field5198 >> this.field177;
        this.field178 = this.field190.field5200 >> this.field177;
    }
}
