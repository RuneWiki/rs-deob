import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class177 extends class175 {

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Lij;")
    private static class50 field2955 = class78.method578(122, "FULL");

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Lij;")
    public static class50 field2960 = class78.method578(125, " ");

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Lij;")
    public static class50 field2954 = field2955;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2957 = -1;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "Lij;")
    public static class50 field2964 = class78.method578(121, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "[Lij;")
    public static class50[] field2958 = new class50[100];

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "Lwi;")
    public static class21 field2967;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lda;")
    public static class22 field2959;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "[[I")
    public static int[][] field2963;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lij;Lce;B)Lij;")
    public static final class50 method1215(class50 arg0, class10 arg1, byte arg2) {
        if (~arg0.method390(class100.field1856, -1) != 0) {
            label62: while (true) {
                int var3 = arg0.method390(class201.field3309, -1);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method390(class251.field4360, -1);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method390(class239.field4092, -1);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg0.method390(class170.field2853, -1);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method390(class255.field4429, -1);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg0.method390(class175.field2932, -1);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class50 var9 = class245.field4271;
                                                        if (class6.field71 != null) {
                                                            var9 = class233.method1587(class6.field71.field128, (byte) 99);
                                                            try {
                                                                if (class6.field71.field132 != null) {
                                                                    byte[] var10 = ((String) class6.field71.field132).getBytes("ISO-8859-1");
                                                                    var9 = class2.method7(0, var10.length, -15075, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class80.method589(new class50[] { arg0.method363(0, var8, 0), var9, arg0.method397(64, var8 + 4) }, 28743);
                                                    }
                                                }
                                                arg0 = class80.method589(new class50[] { arg0.method363(0, var7, 0), class16.method123(class194.method1312(arg1, 100, 4), 79), arg0.method397(64, var7 - -2) }, 28743);
                                            }
                                        }
                                        arg0 = class80.method589(new class50[] { arg0.method363(0, var6, 0), class16.method123(class194.method1312(arg1, 100, 3), -118), arg0.method397(64, var6 - -2) }, 28743);
                                    }
                                }
                                arg0 = class80.method589(new class50[] { arg0.method363(0, var5, 0), class16.method123(class194.method1312(arg1, 100, 2), -109), arg0.method397(64, var5 + 2) }, 28743);
                            }
                        }
                        arg0 = class80.method589(new class50[] { arg0.method363(0, var4, 0), class16.method123(class194.method1312(arg1, 100, 1), 53), arg0.method397(64, var4 + 2) }, 28743);
                    }
                }
                arg0 = class80.method589(new class50[] { arg0.method363(0, var3, 0), class16.method123(class194.method1312(arg1, 100, 0), -126), arg0.method397(64, var3 + 2) }, 28743);
            }
        }
        ++field2965;
        return arg2 < 49 ? null : arg0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field2968;
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, arg0, arg1 + 44491);
            int[] var5 = this.method1210(1, arg0, 16745);
            int[] var6 = this.method1210(2, arg0, 16745);
            for (int var7 = 0; var7 < class211.field3514; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return arg1 != -27746 ? null : var3;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field2967 = null;
        field2955 = null;
        field2960 = null;
        field2958 = null;
        field2959 = null;
        field2963 = null;
        field2954 = null;
        int var1 = -73 % ((-61 - arg0) / 63);
        field2964 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field2956;
        if (!arg0) {
            method1216(9);
        }
        if (arg1 == 0) {
            super.field2925 = arg2.method1487(255) == 1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field2962;
        int[][] var3 = super.field2920.method117(arg0, (byte) -122);
        if (super.field2920.field356) {
            int[] var4 = this.method1210(2, arg0, 16745);
            int[][] var5 = this.method1206(0, arg0, (byte) -119);
            int[][] var6 = this.method1206(1, arg0, (byte) 74);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; ~class211.field3514 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var15[var16];
                        var8[var16] = var13[var16];
                        var9[var16] = var14[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return arg1 != -20740 ? null : var3;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class177() {
        super(3, false);
    }
}
