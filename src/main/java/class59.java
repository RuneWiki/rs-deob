import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class59 extends class243 {

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    private int field1083 = 0;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    private int field1081 = 4096;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "Lub;")
    public static class227 field1084 = class257.method1749(")1p", 17263);

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "Lrb;")
    public static class254 field1090 = new class254(50);

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field1092 = 2;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "Lub;")
    private static class227 field1097 = class257.method1749("Loaded wordpack", 17263);

    @OriginalMember(owner = "client!g", name = "qb", descriptor = "Led;")
    public static class96 field1098 = null;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Lub;")
    public static class227 field1091 = field1097;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "[[I")
    public static int[][] field1094;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field1085;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field4230 = arg0.method1471(255) == 1;
                }
            } else {
                this.field1081 = arg0.method1447(0);
            }
        } else {
            this.field1083 = arg0.method1447(0);
        }
        if (arg1) {
            method362(83, -89);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class59() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBIIII)V")
    public static final void method358(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1088;
        class218.method1382(-123, arg3);
        int var7 = -arg0 + arg3;
        if (~var7 > -1) {
            var7 = 0;
        }
        int var8 = -arg3;
        if (arg2 != -109) {
            field1098 = null;
        }
        int var9 = 0;
        int var10 = arg3;
        int var11 = var7;
        int var12 = -var7;
        if (arg4 >= class161.field2718 && class46.field817 >= arg4) {
            int[] var13 = field1094[arg4];
            int var14 = class23.method111(-arg3 + arg5, class125.field2234, class19.field331, 0);
            int var15 = class23.method111(arg3 + arg5, class125.field2234, class19.field331, 0);
            int var16 = class23.method111(-var7 + arg5, class125.field2234, class19.field331, arg2 + 109);
            int var17 = class23.method111(arg5 + var7, class125.field2234, class19.field331, 0);
            class246.method1644(arg1, var13, var16, var14, 1);
            class246.method1644(arg6, var13, var17, var16, 1);
            class246.method1644(arg1, var13, var15, var17, arg2 ^ -110);
        }
        int var18 = -1;
        int var19 = -1;
        while (~var9 > ~var10) {
            var18 += 2;
            var19 += 2;
            var8 += var18;
            var12 += var19;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                class106.field1990[var11] = var9;
                var12 -= var11 << 1;
            }
            ++var9;
            if (~var8 <= -1) {
                --var10;
                var8 -= var10 << 1;
                int var20 = arg4 + var10;
                int var21 = -var10 + arg4;
                if (class161.field2718 <= var20 && ~var21 >= ~class46.field817) {
                    if (~var7 >= ~var10) {
                        int var22 = class23.method111(arg5 + var9, class125.field2234, class19.field331, 0);
                        int var23 = class23.method111(-var9 + arg5, class125.field2234, class19.field331, 0);
                        if (~class46.field817 <= ~var20) {
                            class246.method1644(arg1, field1094[var20], var22, var23, 1);
                        }
                        if (~class161.field2718 >= ~var21) {
                            class246.method1644(arg1, field1094[var21], var22, var23, arg2 ^ -110);
                        }
                    } else {
                        int var24 = class106.field1990[var10];
                        int var25 = class23.method111(arg5 + var9, class125.field2234, class19.field331, arg2 + 109);
                        int var26 = class23.method111(-var9 + arg5, class125.field2234, class19.field331, 0);
                        int var27 = class23.method111(arg5 + var24, class125.field2234, class19.field331, arg2 + 109);
                        int var28 = class23.method111(-var24 + arg5, class125.field2234, class19.field331, 0);
                        if (~var20 >= ~class46.field817) {
                            int[] var29 = field1094[var20];
                            class246.method1644(arg1, var29, var28, var26, 1);
                            class246.method1644(arg6, var29, var27, var28, 1);
                            class246.method1644(arg1, var29, var25, var27, arg2 + 110);
                        }
                        if (class161.field2718 <= var21) {
                            int[] var30 = field1094[var21];
                            class246.method1644(arg1, var30, var28, var26, 1);
                            class246.method1644(arg6, var30, var27, var28, 1);
                            class246.method1644(arg1, var30, var25, var27, 1);
                        }
                    }
                }
            }
            int var31 = -var9 + arg4;
            int var32 = arg4 + var9;
            if (~var32 <= ~class161.field2718 && ~class46.field817 <= ~var31) {
                int var33 = arg5 + var10;
                int var34 = -var10 + arg5;
                if (var33 >= class125.field2234 && ~class19.field331 <= ~var34) {
                    int var35 = class23.method111(var33, class125.field2234, class19.field331, 0);
                    int var36 = class23.method111(var34, class125.field2234, class19.field331, arg2 ^ -109);
                    if (var9 < var7) {
                        int var37 = ~var11 <= ~var9 ? var11 : class106.field1990[var9];
                        int var38 = class23.method111(arg5 + var37, class125.field2234, class19.field331, 0);
                        int var39 = class23.method111(arg5 - var37, class125.field2234, class19.field331, 0);
                        if (~var32 >= ~class46.field817) {
                            int[] var40 = field1094[var32];
                            class246.method1644(arg1, var40, var39, var36, 1);
                            class246.method1644(arg6, var40, var38, var39, 1);
                            class246.method1644(arg1, var40, var35, var38, arg2 ^ -110);
                        }
                        if (~class161.field2718 >= ~var31) {
                            int[] var41 = field1094[var31];
                            class246.method1644(arg1, var41, var39, var36, 1);
                            class246.method1644(arg6, var41, var38, var39, 1);
                            class246.method1644(arg1, var41, var35, var38, 1);
                        }
                    } else {
                        if (class46.field817 >= var32) {
                            class246.method1644(arg1, field1094[var32], var35, var36, 1);
                        }
                        if (var31 >= class161.field2718) {
                            class246.method1644(arg1, field1094[var31], var35, var36, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public static void method359(int arg0) {
        field1094 = null;
        field1090 = null;
        if (arg0 != -22075) {
            method359(-67);
        }
        field1097 = null;
        field1084 = null;
        field1091 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field1087;
        if (arg0 != 230) {
            method361(80, 42, 127, -88, 56, 97, 74, -121);
        }
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771) {
            int[][] var4 = this.method1616(-1, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class212.field3586 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var13 >= this.field1083) {
                    if (~var13 >= ~this.field1081) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field1081;
                    }
                } else {
                    var9[var11] = this.field1083;
                }
                if (var12 >= this.field1083) {
                    if (this.field1081 < var12) {
                        var8[var11] = this.field1081;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field1083;
                }
                if (var14 < this.field1083) {
                    var10[var11] = this.field1083;
                } else if (~var14 < ~this.field1081) {
                    var10[var11] = this.field1081;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lnj;I)Lwi;")
    public static final class21 method360(class226 arg0, int arg1) {
        if (arg1 > -20) {
            field1084 = null;
        }
        ++field1089;
        return new class21(arg0.method1433(120), arg0.method1433(117), arg0.method1433(121), arg0.method1433(109), arg0.method1433(108), arg0.method1433(125), arg0.method1433(116), arg0.method1433(119), arg0.method1444(171285352), arg0.method1471(255));
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1086;
        int var8 = arg2 + arg5;
        int var9 = -arg5 + arg7;
        int var10 = arg4 + arg5;
        for (int var11 = arg2; var8 > var11; ++var11) {
            class246.method1644(arg1, field1094[var11], arg3, arg4, arg0 + -1);
        }
        if (arg0 != 2) {
            field1084 = null;
        }
        int var12 = arg3 - arg5;
        for (int var13 = arg7; var9 < var13; --var13) {
            class246.method1644(arg1, field1094[var13], arg3, arg4, arg0 ^ 3);
        }
        for (int var14 = var8; ~var14 >= ~var9; ++var14) {
            int[] var15 = field1094[var14];
            class246.method1644(arg1, var15, var10, arg4, arg0 ^ 3);
            class246.method1644(arg6, var15, var12, var10, 1);
            class246.method1644(arg1, var15, arg3, var12, 1);
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(II)Lhj;")
    public static final class147 method362(int arg0, int arg1) {
        class147 var2 = (class147) class60.field1114.method1735((long) arg1, (byte) -69);
        ++field1080;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class197.field3385.method884(class99.method608((byte) 90, arg1), -103, class242.method1612(arg1, arg0 ^ -580810617));
            class147 var4 = new class147();
            var4.field2526 = arg1;
            if (arg0 != -32544) {
                method358(-50, 87, (byte) -128, 104, -119, -118, -128);
            }
            if (var3 != null) {
                var4.method924(new class226(var3), (byte) 63);
            }
            var4.method934(0);
            class60.field1114.method1730(var4, (long) arg1, (byte) -110);
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1082;
        int[] var3 = super.field4215.method984(arg1, 0);
        int var4 = 56 / ((-15 - arg0) / 51);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, arg1, 97);
            for (int var6 = 0; class212.field3586 > var6; ++var6) {
                int var7 = var5[var6];
                if (this.field1083 <= var7) {
                    if (this.field1081 >= var7) {
                        var3[var6] = var7;
                    } else {
                        var3[var6] = this.field1081;
                    }
                } else {
                    var3[var6] = this.field1083;
                }
            }
        }
        return var3;
    }
}
