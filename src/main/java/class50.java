import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class50 extends class102 {

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    private int field1066 = 4096;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    private int field1082 = 2000;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    private int field1069 = 0;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    private int field1085 = 0;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    private int field1086 = 16;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lqe;")
    public static class179 field1077 = class206.method1380(" loggt sich aus)3", (byte) -127);

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "[I")
    public static int[] field1073 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lqe;")
    public static class179 field1078 = class206.method1380("Lade Sprites )2 ", (byte) 67);

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lqe;")
    private static class179 field1072 = class206.method1380("Unexpected loginserver response)3", (byte) -126);

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field1080 = 0;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "Lqe;")
    public static class179 field1074 = field1072;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field1076 = 0;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lee;")
    public static class49 field1070;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lee;")
    public static class49 field1083;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Leh;")
    public static class52 field1075;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "[I")
    public static int[] field1071;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)[Llg;")
    public static final class126[] method331(int arg0) {
        ++field1068;
        class126[] var1 = new class126[class226.field4186];
        for (int var2 = 0; var2 < class226.field4186; ++var2) {
            int var3 = class187.field3493[var2] * class150.field2703[var2];
            byte[] var4 = class173.field3102[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; ++var6) {
                var5[var6] = class175.field3185[class107.method696(var4[var6], 255)];
            }
            var1[var2] = new class126(class22.field544, class9.field257, class31.field674[var2], class143.field2611[var2], class187.field3493[var2], class150.field2703[var2], var5);
        }
        class17.method129((byte) -128);
        if (arg0 != 255) {
            method331(67);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public static void method332(int arg0) {
        field1077 = null;
        field1070 = null;
        field1078 = null;
        if (arg0 != 128) {
            field1074 = null;
        }
        field1075 = null;
        field1074 = null;
        field1073 = null;
        field1072 = null;
        field1071 = null;
        field1083 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
    public static final void method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0 + arg2;
        int var7 = -arg3 + arg5;
        ++field1079;
        if (var6 != 0) {
            if (~var7 == -1) {
                class187.method1262(arg3, arg0, false, arg4, arg2);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = arg3 - (arg0 * var8 >> 12);
                int var10;
                int var11;
                if (class235.field4336 <= arg0) {
                    if (~class40.field869 <= ~arg0) {
                        var10 = arg0;
                        var11 = arg3;
                    } else {
                        var11 = (class40.field869 * var8 >> 12) + var9;
                        var10 = class40.field869;
                    }
                } else {
                    var11 = var9 - -(class235.field4336 * var8 >> 12);
                    var10 = class235.field4336;
                }
                if (var11 >= class168.field3037) {
                    if (class70.field1403 < var11) {
                        var11 = class70.field1403;
                        var10 = (class70.field1403 - var9 << 12) / var8;
                    }
                } else {
                    var11 = class168.field3037;
                    var10 = (-var9 + class168.field3037 << 12) / var8;
                }
                int var12;
                int var13;
                if (~class235.field4336 >= ~arg2) {
                    if (~class40.field869 > ~arg2) {
                        var12 = class40.field869;
                        var13 = var9 - -(class40.field869 * var8 >> 12);
                    } else {
                        var12 = arg2;
                        var13 = arg5;
                    }
                } else {
                    var13 = (class235.field4336 * var8 >> 12) + var9;
                    var12 = class235.field4336;
                }
                if (var13 >= class168.field3037) {
                    if (class70.field1403 < var13) {
                        var13 = class70.field1403;
                        var12 = (-var9 + class70.field1403 << 12) / var8;
                    }
                } else {
                    var12 = (-var9 + class168.field3037 << 12) / var8;
                    var13 = class168.field3037;
                }
                if (arg1 < 3) {
                    field1073 = null;
                }
                class81.method520(var10, var12, 126, var11, var13, arg4);
            }
        } else {
            if (var7 != 0) {
                class107.method703(arg4, 0, arg0, arg3, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lrb;IIIII)V")
    public static final void method334(class186 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class155.field2793 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class39.field834) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class33.field719 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class197 var14 = class229.field4232[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class30.field665[var11][var12 + 1][var13] + class30.field665[var11][var12][var13] + class30.field665[var11][var12][var13 + 1] + class30.field665[var11][var12 + 1][var13 + 1]) / 4 - (class30.field665[arg1][arg2 + 1][arg3] + class30.field665[arg1][arg2][arg3] + class30.field665[arg1][arg2][arg3 + 1] + class30.field665[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class237 var16 = var14.field3680;
                                    if (var16 != null) {
                                        if (var16.field4382.method1261()) {
                                            arg0.method1259(var16.field4382, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4362 != null && var16.field4362.method1261()) {
                                            arg0.method1259(var16.field4362, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3662; ++var17) {
                                        class167 var18 = var14.field3672[var17];
                                        if (var18 != null && var18.field3010.method1261() && (var18.field3006 == var12 || var7 == var12) && (var18.field3018 == var13 || var9 == var13)) {
                                            int var19 = var18.field3011 - var18.field3006 + 1;
                                            int var20 = var18.field3023 - var18.field3018 + 1;
                                            arg0.method1259(var18.field3010, (var18.field3006 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3018 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field1081;
        if (arg0 != 14005) {
            this.method191(112);
        }
        class56.method390(-1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            field1076 = 125;
        }
        ++field1067;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = this.field1066 >> 1;
            int[][] var5 = super.field1960.method700((byte) -67);
            Random var6 = new Random((long) this.field1085);
            for (int var7 = 0; var7 < this.field1082; ++var7) {
                int var8 = ~this.field1066 >= -1 ? this.field1069 : this.field1069 + -var4 + class4.method26(var6, 12024, this.field1066);
                int var9 = 255 & var8 >> 4;
                int var10 = class4.method26(var6, 12024, class155.field2796);
                int var11 = class4.method26(var6, 12024, class117.field2216);
                int var12 = var10 - -(class229.field4243[var9] * this.field1086 >> 12);
                int var13 = (class40.field866[var9] * this.field1086 >> 12) + var11;
                int var14 = -var10 + var12;
                int var15 = var13 - var11;
                if (~var14 != -1 || ~var15 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var10 = var12;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 1024 + -(class4.method26(var6, 12024, 4096) >> 2);
                    int var26 = 2048 / var22;
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = var28 & class227.field4193;
                        int var30 = (var28 - var10) * var26 + 1024 + var25;
                        int var31 = var21 & class233.field4296;
                        var24 += var23;
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field1066 = arg0.method1252(2);
                        }
                    } else {
                        this.field1069 = arg0.method1252(2);
                    }
                } else {
                    this.field1086 = arg0.method1243(3);
                }
            } else {
                this.field1082 = arg0.method1252(2);
            }
        } else {
            this.field1085 = arg0.method1243(3);
        }
        if (arg2) {
            this.method13((class185) null, 116, false);
        }
        ++field1084;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }
}
