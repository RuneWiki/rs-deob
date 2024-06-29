import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class208 extends class298 {

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    private int field2877 = 4096;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    private int field2878 = 0;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "Lsd;")
    public static class74 field2874 = new class74(0, 10);

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "[[Z")
    public static boolean[][] field2880 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Lpn;")
    public static class72 field2879 = new class72(55, 11);

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "[I")
    public static int[] field2885 = new int[2];

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2883 = -1;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "[I")
    public static int[] field2887 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Lfi;")
    public static class180 field2882;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        if (arg0 != -24032) {
            method1154(true, (class198) null);
        }
        ++field2873;
        int[][] var3 = super.field4454.method1638((byte) 107, arg1);
        if (super.field4454.field3886) {
            int[][] var4 = this.method1878(0, arg1, 60);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class158.field1877; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field2878 >= ~var12) {
                    if (~var12 >= ~this.field2877) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field2877;
                    }
                } else {
                    var8[var11] = this.field2878;
                }
                if (~this.field2878 < ~var13) {
                    var9[var11] = this.field2878;
                } else if (var13 > this.field2877) {
                    var9[var11] = this.field2877;
                } else {
                    var9[var11] = var13;
                }
                if (var14 >= this.field2878) {
                    if (~this.field2877 > ~var14) {
                        var10[var11] = this.field2877;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field2878;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lqo;[I[II[I)V")
    public static final void method1151(class137 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        for (int var5 = 0; arg2.length > var5; ++var5) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (~var7 != -1 && ~arg0.field2487.length < ~var9) {
                if (~(1 & var7) != -1) {
                    if (var6 == -1) {
                        arg0.field2487[var9] = null;
                    } else {
                        class207 var10 = class175.field2103.method1267(-54, var6);
                        int var11 = var10.field2848;
                        class178 var12 = arg0.field2487[var9];
                        if (var12 != null) {
                            if (var12.field2143 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field2487[var9] = null;
                                } else if (~var11 == -2) {
                                    var12.field2145 = 0;
                                    var12.field2146 = 0;
                                    var12.field2144 = 1;
                                    var12.field2148 = var8;
                                    var12.field2147 = 0;
                                    class126.method602(var10, false, arg0.field1008, 0, arg0.field1005, false, arg0.field994);
                                } else if (var11 == 2) {
                                    var12.field2146 = 0;
                                }
                            } else if (var10.field2860 >= class175.field2103.method1267(-22, var12.field2143).field2860) {
                                var12 = arg0.field2487[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class178 var13 = arg0.field2487[var9] = new class178();
                            var13.field2148 = var8;
                            var13.field2144 = 1;
                            var13.field2147 = 0;
                            var13.field2145 = 0;
                            var13.field2146 = 0;
                            var13.field2143 = var6;
                            class126.method602(var10, false, arg0.field1008, 0, arg0.field1005, false, arg0.field994);
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        ++field2870;
        if (arg3 < 20) {
            method1154(false, (class198) null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1152(int arg0, String arg1) {
        ++field2869;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; ~var2 > ~class3.field25; ++var2) {
                if (arg1.equalsIgnoreCase(class150.field1823[var2])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class19.field258.field2736);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4449 = ~arg2.method895((byte) -120) == -2;
                }
            } else {
                this.field2877 = arg2.method916(21933);
            }
        } else {
            this.field2878 = arg2.method916(21933);
        }
        if (arg0 > -44) {
            method1153(-98, (class179) null);
        }
        ++field2872;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILvt;)Le;")
    public static final class104 method1153(int arg0, class179 arg1) {
        if (arg0 != -23758) {
            method1153(27, (class179) null);
        }
        ++field2881;
        return new class104(arg1.method906(-75), arg1.method906(-17), arg1.method906(-67), arg1.method906(-44), arg1.method899((byte) -78), arg1.method895((byte) -100));
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLcj;)V")
    public static final void method1154(boolean arg0, class198 arg1) {
        ++field2875;
        if (arg0) {
            method1151((class137) null, (int[]) null, (int[]) null, 18, (int[]) null);
        }
        class399 var2 = (class399) class350.field5031.method233(81, (long) arg1.field2457);
        if (var2 != null) {
            if (var2.field5688 != null) {
                class226.field3136.method509(var2.field5688);
                var2.field5688 = null;
            }
            var2.method702((byte) -114);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field2876;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, arg0);
            for (int var5 = 0; class158.field1877 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field2878 < ~var6) {
                    var3[var5] = this.field2878;
                } else if (var6 <= this.field2877) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field2877;
                }
            }
        }
        if (!arg1) {
            field2887 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(Z)V")
    public static void method1155(boolean arg0) {
        field2887 = null;
        field2882 = null;
        if (!arg0) {
            method1151((class137) null, (int[]) null, (int[]) null, 113, (int[]) null);
        }
        field2879 = null;
        field2885 = null;
        field2880 = null;
        field2874 = null;
    }

    static {
        new class40("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
