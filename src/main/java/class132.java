import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class132 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lqe;")
    public static class168 field2317 = class66.method448("headicons_pk", -125);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lqe;")
    public static class168 field2318 = class66.method448("::", -119);

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field2322 = 0;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field2323 = 3;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lqe;")
    public static class168 field2321 = class66.method448("Speicher wird zugewiesen)3", -121);

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method892(int arg0) {
        field2318 = null;
        if (arg0 != 64) {
            field2319 = 31;
        }
        field2317 = null;
        field2321 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III[BIZI[Ltb;)V")
    public static final void method893(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, class52[] arg7) {
        field2320++;
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
                            arg7[var9].field731[arg2 + var10][arg0 + var11] = class86.method571(arg7[var9].field731[arg2 + var10][arg0 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class112 var12 = new class112(arg3);
        int var13 = 0;
        if (arg1 <= 126) {
            method894(null, 72, null, 109, 66, null, -76, 68);
        }
        while (var13 < var8) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class256.method1695((byte) 102, var12, 0, arg6, arg4, arg0 + var15, var14 - -arg2, var13, arg5);
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lmj;ILnc;IILnc;II)V")
    public static final void method894(class129 arg0, int arg1, class136 arg2, int arg3, int arg4, class136 arg5, int arg6, int arg7) {
        class163.field2801 = arg0;
        class185.field3245 = arg4;
        class89.field1389 = arg3;
        class53.field733 = arg7;
        class74.field1131 = arg1;
        field2324++;
        if (class227.field3872 != null) {
            return;
        }
        class86.field1340 = true;
        if (class175.field3062 == null) {
            class175.field3062 = class134.method906(class152.field2645, class187.field3289, 0, -69);
        }
        if (class100.field1589 == null) {
            class100.field1589 = class102.method679(class152.field2645, -11892, class163.field2798, 0);
        }
        if (class204.field3541 == null) {
            class204.field3541 = class102.method679(class152.field2645, -11892, class148.field2582, 0);
        }
        if (class92.field1440 == null) {
            class92.field1440 = class102.method679(class152.field2645, -11892, class213.field3673, 0);
        }
        int var8 = class53.field733 / 5 * 4;
        int var9 = class53.field733 / 5;
        class216.method1393(class185.field3245, class74.field1131, class53.field733, class89.field1389, 0, 168);
        class216.method1407(class185.field3245, class74.field1131, var9, 23, 12425273, 9135624);
        class216.method1407(class185.field3245 + var9, class74.field1131, var8, 23, 5197647, 2697513);
        arg5.method925(class125.field2056, var9 / 2 + class185.field3245, class74.field1131 - -15, 0, -1);
        if (class92.field1440 != null) {
            class92.field1440[1].method1038(class185.field3245 + var9 + 2, class74.field1131 + 1);
            arg2.method941(class51.field687, class185.field3245 + var9 + 12, class74.field1131 - -10, 16777215, -1);
            class92.field1440[0].method1038(class185.field3245 + var9 + 2, class74.field1131 + 12);
            arg2.method941(class7.field79, class185.field3245 + var9 + 12, class74.field1131 - -21, 16777215, -1);
        }
        if (class204.field3541 != null) {
            int var10 = class185.field3245 + var9 + 140;
            if (class148.field2581[0] == 0 && class9.field106[0] == 0) {
                class204.field3541[2].method1038(var10, class74.field1131 + 4);
            } else {
                class204.field3541[0].method1038(var10, class74.field1131 + 4);
            }
            if (class148.field2581[0] == 0 && class9.field106[0] == 1) {
                class204.field3541[3].method1038(var10 + 15, class74.field1131 - -4);
            } else {
                class204.field3541[1].method1038(var10 + 15, class74.field1131 - -4);
            }
            arg5.method941(class81.field1224, var10 + 32, class74.field1131 + 17, 16777215, -1);
            int var11 = class185.field3245 + var9 + 250;
            if (class148.field2581[0] == 1 && class9.field106[0] == 0) {
                class204.field3541[2].method1038(var11, class74.field1131 + 4);
            } else {
                class204.field3541[0].method1038(var11, class74.field1131 + 4);
            }
            if (class148.field2581[0] == 1 && class9.field106[0] == 1) {
                class204.field3541[3].method1038(var11 + 15, class74.field1131 + 4);
            } else {
                class204.field3541[1].method1038(var11 + 15, class74.field1131 + 4);
            }
            arg5.method941(class55.field756, var11 + 32, class74.field1131 + 17, 16777215, -1);
            int var12 = class185.field3245 + var9 + 360;
            if (class148.field2581[0] == 2 && class9.field106[0] == 0) {
                class204.field3541[2].method1038(var12, class74.field1131 + 4);
            } else {
                class204.field3541[0].method1038(var12, class74.field1131 + 4);
            }
            if (class148.field2581[0] == 2 && class9.field106[0] == 1) {
                class204.field3541[3].method1038(var12 + 15, class74.field1131 + 4);
            } else {
                class204.field3541[1].method1038(var12 + 15, class74.field1131 + 4);
            }
            arg5.method941(class213.field3695, var12 + 32, class74.field1131 + 17, 16777215, -1);
            int var13 = class185.field3245 + var9 + 470;
            if (class148.field2581[0] == 3 && class9.field106[0] == 0) {
                class204.field3541[2].method1038(var13, class74.field1131 + 4);
            } else {
                class204.field3541[0].method1038(var13, class74.field1131 + 4);
            }
            if (class148.field2581[0] == 3 && class9.field106[0] == 1) {
                class204.field3541[3].method1038(var13 + 15, class74.field1131 + 4);
            } else {
                class204.field3541[1].method1038(var13 + 15, class74.field1131 + 4);
            }
            arg5.method941(class101.field1614, var13 + 32, class74.field1131 - -17, 16777215, -1);
        }
        class216.method1405(class53.field733 - 10 - 58, class74.field1131 + 4, 58, 16, 0);
        class192.field3357 = -1;
        if (class175.field3062 != null) {
            byte var14 = 88;
            byte var15 = 19;
            int var16 = (class89.field1389 - 23) / (var15 - -1);
            int var17 = class53.field733 / (var14 + 1);
            int var18;
            int var19;
            do {
                var18 = var16;
                var19 = var17;
                if (class230.field3907 <= (var17 - 1) * var16) {
                    var17--;
                }
                if ((var16 - 1) * var17 >= class230.field3907) {
                    var16--;
                }
                if (class230.field3907 <= (var16 - 1) * var17) {
                    var16--;
                }
            } while (var16 != var18 || var17 != var19);
            int var20 = (class53.field733 - var14 * var17) / (var17 + 1);
            int var21 = (class89.field1389 - var15 * var16 - 23) / (var16 + 1);
            if (var20 > 5) {
                var20 = 5;
            }
            int var22 = (class53.field733 - (var17 - 1) * var20 - var14 * var17) / 2;
            if (var21 > 5) {
                var21 = 5;
            }
            int var23 = (class89.field1389 - (var16 - 1) * var21 - var15 * var16 - 23) / 2;
            int var24 = var22;
            int var25 = var23 + 23;
            int var26 = 0;
            for (int var27 = 0; var27 < class230.field3907; var27++) {
                class171 var28 = class129.field2252[var27];
                class168 var29 = class128.method867((byte) 123, var28.field2981);
                boolean var30 = true;
                if (var28.field2981 == -1) {
                    var30 = false;
                    var29 = class101.field1594;
                } else if (var28.field2981 > 1980) {
                    var29 = class255.field4428;
                    var30 = false;
                }
                if (var24 <= class146.field2550 && class161.field2765 >= var25 && class146.field2550 < var24 + var14 && class161.field2765 < var25 + var15 && var30) {
                    class192.field3357 = var27;
                    class175.field3062[var28.field2972 ? 1 : 0].method60(class185.field3245 + var24, class74.field1131 + var25, 128, 16777215);
                } else {
                    class175.field3062[var28.field2972 ? 1 : 0].method73(class185.field3245 + var24, class74.field1131 + var25);
                }
                if (class100.field1589 != null) {
                    class100.field1589[var28.field2970 + (var28.field2972 ? 8 : 0)].method1038(class185.field3245 + var24 + 29, class74.field1131 + var25);
                }
                arg5.method925(class128.method867((byte) 78, var28.field2979), class185.field3245 + var24 + 15, class74.field1131 - -5 + var15 / 2 + var25, 0, -1);
                arg2.method925(var29, class185.field3245 + var24 + 60, var15 / 2 + 5 + class74.field1131 + var25, 268435455, -1);
                var25 += var21 + var15;
                var26++;
                if (var26 >= var16) {
                    var24 += var20 + var14;
                    var25 = var23 + 23;
                    var26 = 0;
                }
            }
        }
        if (arg6 != -1594) {
            method894(null, -83, null, -95, -91, null, 71, -45);
        }
    }
}
