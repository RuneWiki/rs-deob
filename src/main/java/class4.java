import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class424 {

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    private int field27 = 4096;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "[I")
    private int[] field29 = new int[3];

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    private int field34 = 409;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    private int field35 = 4096;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field31 = 4096;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[I")
    public static int[] field30 = new int[14];

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Lhc;")
    public static class368 field28 = new class368("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "[I")
    public static int[] field37 = new int[32];

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V", line = 3)
    public static void method18(int arg0) {
        field37 = null;
        if (arg0 > 33) {
            field28 = null;
            field30 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lrg;BI)V", line = 20)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field26;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method2263((byte) 10);
                            this.field29[2] = class187.method1301(var5, 255) >> 12;
                            this.field29[0] = class187.method1301(16711680, var5) << 4;
                            this.field29[1] = class187.method1301(65280, var5) >> 4;
                        }
                    } else {
                        this.field27 = arg0.method2297(13352);
                    }
                } else {
                    this.field31 = arg0.method2297(arg1 ^ -13320);
                }
            } else {
                this.field35 = arg0.method2297(arg1 ^ -13320);
            }
        } else {
            this.field34 = arg0.method2297(arg1 + 13400);
        }
        if (arg1 != -48) {
            field30 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 149)
    public class4() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvg;BIILwn;Lde;II)V", line = 106)
    public static final void method20(class108 arg0, byte arg1, int arg2, int arg3, class77 arg4, class165 arg5, int arg6, int arg7) {
        ++field33;
        if (arg4 != null) {
            int var8;
            if (class26.field337 == 4) {
                var8 = (int) class332.field4483 & 16383;
            } else {
                var8 = (int) class332.field4483 - -class19.field249 & 16383;
            }
            int var9 = Math.max(arg0.field1568 / 2, arg0.field1577 / 2) + 10;
            int var10 = arg2 * arg2 + arg3 * arg3;
            if (var10 <= var9 * var9) {
                int var11 = 3 % ((42 - arg1) / 34);
                int var12 = class136.field2021[var8];
                int var13 = class136.field2020[var8];
                if (~class26.field337 != -5) {
                    var12 = var12 * 256 / (class129.field1950 + 256);
                    var13 = var13 * 256 / (class129.field1950 + 256);
                }
                int var14 = arg2 * var13 + arg3 * var12 >> 15;
                int var15 = arg3 * var13 + -(arg2 * var12) >> 15;
                arg4.method623(arg0.field1568 / 2 + arg6 + var14 + -(arg4.method632() / 2), arg7 - -(arg0.field1577 / 2) + -var15 - arg4.method619() / 2, arg5, arg6, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)[[I", line = 152)
    public final int[][] method21(int arg0, boolean arg1) {
        ++field36;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class303.field4135; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field29[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field34) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field29[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field34 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field29[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field34 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field27 * var12 >> 12;
                            var9[var11] = this.field31 * var14 >> 12;
                            var10[var11] = this.field35 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lgg;IIIII)V", line = 246)
    public static final void method22(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4247 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field4242[var6] != null) {
                ++arg0.field4247;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4247; ++var7) {
            int var8 = class296.field4069[arg1][arg2][arg3];
            while (var8 != 0) {
                class271 var12 = class122.field1838[(var8 & 255) - 1];
                var8 >>>= 8;
                if (arg0.field4242[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class296.field4069[arg1][arg4][arg5];
            while (var9 != 0) {
                class271 var11 = class122.field1838[(var9 & 255) - 1];
                var9 >>>= 8;
                if (arg0.field4242[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field4247 - 1; ++var10) {
                arg0.field4242[var10] = arg0.field4242[var10 + 1];
            }
            --arg0.field4247;
        }
    }
}
