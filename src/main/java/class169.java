import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class169 extends class240 {

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    private int field2935 = 0;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    private int field2937 = 0;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field2932 = 4096;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    private int field2944 = 16;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    private int field2934 = 2000;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lcd;")
    public static class64 field2941 = class44.method335((byte) 71, "Cache:");

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Lcd;")
    public static class64 field2939 = class44.method335((byte) 71, "Ablegen");

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "[I")
    public static int[] field2947 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!af", name = "db", descriptor = "J")
    public static long field2946 = 0L;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            return (int[]) null;
        }
        field2942++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int var4 = this.field2932 >> 1;
            int[][] var5 = this.field4094.method175(true);
            Random var6 = new Random((long) this.field2935);
            for (int var7 = 0; var7 < this.field2934; var7++) {
                int var8 = this.field2932 <= 0 ? this.field2937 : this.field2937 + class206.method1439(var6, (byte) 126, this.field2932) - var4;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class206.method1439(var6, (byte) 125, field2936);
                int var11 = class206.method1439(var6, (byte) 123, class131.field2320);
                int var12 = (class268.field4619[var9] * this.field2944 >> 12) + var10;
                int var13 = var11 + (class168.field2929[var9] * this.field2944 >> 12);
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class206.method1439(var6, (byte) 124, 4096) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = var26 + ((var28 - var10) * var25) + 1024;
                        int var30 = var21 & class74.field1407;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                        int var31 = class132.field2356 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILkh;)V", line = 142)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field2943++;
        if (arg1 == 0) {
            this.field2935 = arg2.method152((byte) -70);
        } else if (arg1 == 1) {
            this.field2934 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field2944 = arg2.method152((byte) -115);
        } else if (arg1 == 3) {
            this.field2937 = arg2.method112((byte) 92);
        } else if (arg1 == 4) {
            this.field2932 = arg2.method112((byte) 92);
        }
        if (arg0 != 2) {
            field2947 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqm;ILqm;)V", line = 201)
    public static final void method1200(class222 arg0, int arg1, class222 arg2) {
        class297.field5120 = arg2;
        field2933++;
        class80.field1484 = arg0;
        if (arg1 != 1024) {
            field2947 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIZ)V", line = 214)
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class189.field3257 = -1;
        field2938++;
        class274.field4699 = class233.field3934 * arg2 / arg0;
        if (arg4) {
            class69.field1335 = class226.field3845 * arg1 / arg3;
            class255.field4436 = -1;
            class155.method1117((byte) -41);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 338)
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 237)
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class181 var20 = new class181(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class304.field5203[var21][arg1][arg2] == null) {
                    class304.field5203[var21][arg1][arg2] = new class295(var21, arg1, arg2);
                }
            }
            class304.field5203[arg0][arg1][arg2].field5074 = var20;
        } else if (arg3 == 1) {
            class181 var22 = new class181(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class304.field5203[var23][arg1][arg2] == null) {
                    class304.field5203[var23][arg1][arg2] = new class295(var23, arg1, arg2);
                }
            }
            class304.field5203[arg0][arg1][arg2].field5074 = var22;
        } else {
            class45 var24 = new class45(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class304.field5203[var25][arg1][arg2] == null) {
                    class304.field5203[var25][arg1][arg2] = new class295(var25, arg1, arg2);
                }
            }
            class304.field5203[arg0][arg1][arg2].field5093 = var24;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 319)
    public final void method288(int arg0) {
        field2940++;
        class92.method692(0);
        if (arg0 != 17772) {
            field2941 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V", line = 342)
    public static void method1203(int arg0) {
        field2941 = null;
        field2939 = null;
        field2947 = null;
        int var1 = -35 / ((arg0) / 43);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Lnc;", line = 359)
    public static final class137 method1204(int arg0, int arg1) {
        field2945++;
        class137 var2 = (class137) class280.field4825.method1194((long) arg0, (byte) -64);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field4166.method1580(0, arg0, arg1);
        class137 var4 = new class137();
        if (var3 != null) {
            var4.method979(arg0, new class13(var3), 117);
        }
        class280.field4825.method1190(12669, var4, (long) arg0);
        return var4;
    }
}
