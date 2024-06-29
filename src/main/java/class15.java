import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class15 extends class337 {

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field179 = -1;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "[B")
    private byte[] field190;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "[[Z")
    public static boolean[][] field182;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V", line = 6)
    public static void method93(byte arg0) {
        field182 = (boolean[][]) null;
        if (arg0 != -42) {
            field182 = (boolean[][]) ((boolean[][]) null);
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 18)
    public final void method94(int arg0) {
        field172++;
        this.field180 = this.field186;
        this.field178 >>= 0x4;
        if (this.field178 < 0) {
            this.field178 = 0;
        } else if (this.field178 > 255) {
            this.field178 = 255;
        }
        if (arg0 == -11780) {
            this.method100(this.field184++, (byte) this.field178);
            this.field178 = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lgn;Ljava/lang/Object;B)V", line = 40)
    public static final void method95(class6 arg0, Object arg1, byte arg2) {
        field173++;
        if (arg0.field77 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field77.peekEvent() != null; var3++) {
            class20.method128(0, 1L);
        }
        if (arg2 >= -3) {
            field179 = -111;
        }
        if (arg1 != null) {
            arg0.field77.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZIIII)V", line = 69)
    public static final void method96(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class224.field3575 <= arg4 && class231.field3697 >= arg3 && class233.field3721 <= arg0 && arg2 <= class235.field3735) {
            class146.method1025(arg2, arg0, arg3, !arg1, arg4, arg5);
        } else {
            class335.method2309(arg0, arg3, arg4, arg5, -1, arg2);
        }
        if (!arg1) {
            field182 = (boolean[][]) ((boolean[][]) null);
        }
        field189++;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 92)
    public final void method97(int arg0) {
        if (arg0 == 1) {
            this.field178 = 0;
            field175++;
            this.field184 = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZI)V", line = 104)
    public final void method98(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field176 = 4096;
            this.field174 = this.field177 - (arg0 < 0 ? -arg0 : arg0);
            this.field174 = this.field174 * this.field174 >> 12;
            this.field178 = this.field174;
        } else {
            this.field176 = this.field181 * this.field174 >> 12;
            if (this.field176 < 0) {
                this.field176 = 0;
            } else if (this.field176 > 4096) {
                this.field176 = 4096;
            }
            this.field174 = this.field177 - (arg0 < 0 ? -arg0 : arg0);
            this.field174 = this.field174 * this.field174 >> 12;
            this.field174 = this.field176 * this.field174 >> 12;
            this.field178 += this.field180 * this.field174 >> 12;
            this.field180 = this.field186 * this.field180 >> 12;
        }
        if (arg1) {
            field183++;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lh;IIIII)V", line = 139)
    public static final void method99(class232 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class55.field731 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class4.field43) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class64.field844 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class230 var14 = class251.field3996[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class84.field1282[var11][var12 + 1][var13] + class84.field1282[var11][var12][var13] + class84.field1282[var11][var12][var13 + 1] + class84.field1282[var11][var12 + 1][var13 + 1]) / 4 - (class84.field1282[arg1][arg2 + 1][arg3] + class84.field1282[arg1][arg2][arg3] + class84.field1282[arg1][arg2][arg3 + 1] + class84.field1282[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class19 var16 = var14.field3676;
                                    if (var16 != null) {
                                        if (var16.field259.method509()) {
                                            arg0.method550(var16.field259, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field272 != null && var16.field272.method509()) {
                                            arg0.method550(var16.field272, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3680; var17++) {
                                        class271 var18 = var14.field3687[var17];
                                        if (var18 != null && var18.field4286.method509() && (var18.field4285 == var12 || var7 == var12) && (var18.field4297 == var13 || var9 == var13)) {
                                            int var19 = var18.field4287 + 1 - var18.field4285;
                                            int var20 = var18.field4289 + 1 - var18.field4297;
                                            arg0.method550(var18.field4286, (var18.field4285 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4297 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIFFF)V", line = 233)
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field177 = (int) (arg6 * 4096.0F);
        this.field181 = (int) (arg7 * 4096.0F);
        this.field180 = this.field186 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)V", line = 246)
    public void method100(int arg0, byte arg1) {
        field187++;
        this.field190[arg0] = arg1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lim;B)V", line = 262)
    public static final void method101(class192 arg0, byte arg1) {
        if (arg1 != 81) {
            method96(85, true, -57, -85, -55, 113);
        }
        field188++;
        int var2 = class188.field3046 >> 2 << 10;
        int var3 = class30.field424 >> 1;
        byte[][] var4 = new byte[class240.field3815][class331.field5158];
        while (arg0.field3129 < arg0.field3128.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1399(-1172389784) == 1) {
                var5 = true;
                var6 = arg0.method1399(-1172389784);
                var7 = arg0.method1399(-1172389784);
            }
            int var8 = arg0.method1399(arg1 - 1172389865);
            int var9 = arg0.method1399(arg1 - 1172389865);
            int var10 = var8 * 64 - class287.field4528;
            int var11 = class331.field5158 - (var9 * 64 - class161.field2636) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class240.field3815 > var10 + 63 && class331.field5158 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && var12 < var6 * 8 + 8 && var14 >= var7 * 8 && var14 < var7 * 8 + 8) {
                            var13[var11 - var14] = arg0.method1377(true);
                        }
                    }
                }
            } else if (var5) {
                arg0.field3129 += 64;
            } else {
                arg0.field3129 += 4096;
            }
        }
        int var15 = class240.field3815;
        int var16 = class331.field5158;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class342 var26 = class266.method1891((byte) 44, var25 - 1);
                        var17[var23] += var26.field5319;
                        var18[var23] += var26.field5329;
                        var19[var23] += var26.field5338;
                        var20[var23] += var26.field5328;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class342 var29 = class266.method1891((byte) 70, var28 - 1);
                        var17[var23] -= var29.field5319;
                        var18[var23] -= var29.field5329;
                        var19[var23] -= var29.field5338;
                        var20[var23] -= var29.field5328;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class308.field4814[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var31 += var17[var38];
                        var34 += var18[var38];
                        var35 += var20[var38];
                        var33 += var21[var38];
                        var32 += var19[var38];
                    }
                    if (var37 >= 0) {
                        var34 -= var18[var37];
                        var35 -= var20[var37];
                        var33 -= var21[var37];
                        var31 -= var17[var37];
                        var32 -= var19[var37];
                    }
                    if (var36 >= 0 && var33 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class78.method576(var34 / var33, var31 * 256 / var35, true, var32 / var33);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + var41 + (var40 & 0x380);
                            var39[class200.method1465(63, var22) + class200.method1465(var36 << 6, 4032)] = class25.field368[class299.method2091((byte) -77, 96, var42)];
                        } else if (var39 != null) {
                            var39[class200.method1465(var36 << 6, 4032) + class200.method1465(63, var22)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 501)
    public static final void method102(String arg0, int arg1) {
        int var2 = class248.method1760(arg0, false);
        field185++;
        if (~var2 != arg1) {
            int[] var3 = class124.field1855.method2213(class193.field3167.field4908[var2] >> 28 & 0x3, arg1 ^ 0x24, class193.field3167.field4908[var2] & 0x3FFF, class193.field3167.field4908[var2] >> 14 & 0x3FFF);
            class272.method1943(var3[2], var3[1], -1);
        }
    }
}
