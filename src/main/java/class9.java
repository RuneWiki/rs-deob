import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class9 extends class51 {

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lhi;")
    public static class82 field70 = class95.method664((byte) -62, "weiss:");

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Lhi;")
    public static class82 field76 = class95.method664((byte) -103, "showingVideoAd");

    @OriginalMember(owner = "client!n", name = "N", descriptor = "Lhi;")
    public static class82 field77 = class95.method664((byte) -105, "Schlie-8en");

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "J")
    public static long field71;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "[I")
    public static int[] field80;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V", line = 15)
    public static final void method53(int arg0, byte arg1) {
        class167.field2914.method2177(arg0, -120);
        class256.field4399.method2177(arg0, 125);
        if (arg1 != 20) {
            field73 = 97;
        }
        field72++;
        class200.field3432.method2177(arg0, 99);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)V", line = 28)
    public static final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class147.field2485) {
            int var8 = arg3 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class294.field4931 - class143.field2441) * var8 / 100 + class143.field2441;
            arg1 = arg1 * var9 >> 8;
        }
        int var10 = 2048 - arg5 & 0x7FF;
        field68++;
        int var11 = 2048 - arg0 & 0x7FF;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg1;
        if (~var10 != arg2) {
            int var15 = class102.field1819[var10];
            int var16 = class102.field1813[var10];
            var13 = -arg1 * var16 >> 16;
            var14 = arg1 * var15 >> 16;
        }
        if (var11 != 0) {
            int var17 = class102.field1813[var11];
            var12 = var14 * var17 >> 16;
            int var18 = class102.field1819[var11];
            var14 = var14 * var18 >> 16;
        }
        class219.field3792 = arg4 - var12;
        class197.field3380 = arg5;
        class134.field2322 = arg6 - var13;
        class4.field32 = arg7 - var14;
        class224.field3887 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V", line = 98)
    public static final void method55(byte arg0) {
        class138.field2365.method2172(false);
        if (arg0 >= 78) {
            field79++;
            class285.field4796.method2172(false);
        }
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V", line = 115)
    public static final void method57(int arg0) {
        class166.field2899.method2168(0);
        field78++;
        if (arg0 == 2171) {
            class28.field383.method2168(0);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V", line = 129)
    public static final void method58(int arg0, int arg1, int arg2, int arg3) {
        class75 var4 = class257.method1840(false, arg2, arg0);
        field74++;
        if (var4 != null && var4.field1231 != null) {
            class331 var5 = new class331();
            var5.field5635 = var4.field1231;
            var5.field5649 = var4;
            class15.method92(var5, arg1 + 661942562);
        }
        class193.field3272 = arg3;
        class15.field133 = arg0;
        class256.field4406 = true;
        class65.field1016 = arg2;
        class138.method937(var4, 16);
        if (arg1 != -661942672) {
            field76 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lhi;", line = 157)
    public static final class82 method59(byte arg0, int arg1) {
        field81++;
        class82 var2 = class327.method2240((byte) -74, arg1);
        if (arg0 < 19) {
            return (class82) null;
        }
        for (int var3 = var2.method535(true) - 3; var3 > 0; var3 -= 3) {
            var2 = class29.method182(-6039, new class82[] { var2.method573(0, 61, var3), class316.field5432, var2.method558((byte) -66, var3) });
        }
        if (var2.method535(true) <= 9) {
            return var2.method535(true) > 6 ? class29.method182(-6039, new class82[] { class264.field4510, var2.method573(0, 85, var2.method535(true) - 4), class112.field2034, class72.field1108, var2, class330.field5624 }) : class29.method182(-6039, new class82[] { class164.field2875, var2, class302.field5149 });
        } else {
            return class29.method182(-6039, new class82[] { class204.field3573, var2.method573(0, 118, var2.method535(true) - 8), class23.field323, class72.field1108, var2, class330.field5624 });
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIBIIIIII)V", line = 186)
    public static final void method60(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field75++;
        int var11 = arg1 - arg2;
        int var12 = arg8 - arg3;
        boolean var13;
        if (class205.field3592 > 0 && class205.field3592 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg10;
        int var15 = 983040 / arg5;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var17 = arg10 * var16 + arg0 >> 16;
            int var18 = (var16 + 1) * arg10 + arg0 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg9 + var17;
                int var10000 = arg9 + var18;
                int var22 = arg2 + var16 >> 6;
                if (var22 >= 0 && (class308.field5244.length - 1) >= var22) {
                    int[][] var23 = class308.field5244[var22];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = arg5 * var24 + arg6 >> 16;
                        int var26 = (var24 + 1) * arg5 + arg6 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg7 + var25;
                            var10000 = arg7 + var26;
                            int var30 = arg3 + var24 >> 6;
                            if (var30 >= 0 && (var23.length - 1) >= var30 && var23[var30] != null) {
                                int var31 = ((var24 + arg3 & 0x3F) << 6) + (var16 + arg2 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class157 var33 = class99.method682(var32 - 1, (byte) -85);
                                    if (var13 && class26.field349 == var33.field2689) {
                                        class74 var34 = new class74();
                                        var34.field1130 = var28;
                                        var34.field1128 = var20;
                                        var34.field1129 = var33.field2689;
                                        class171.field2945.method1940((byte) -96, var34);
                                    }
                                    class181.field3100[var33.field2689].method600(var20 - 7, var28 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg4 < 60) {
            method62(-70);
        }
        for (class74 var35 = (class74) class171.field2945.method1936(16173); var35 != null; var35 = (class74) class171.field2945.method1926((byte) 90)) {
            class181.field3100[var35.field1129].method600(var35.field1128 - 7, var35.field1130 - 7);
            class320.method2202(var35.field1128, var35.field1130, 15, 16776960, 128);
            class320.method2202(var35.field1128, var35.field1130, 7, 16777215, 256);
        }
        class171.field2945.method1938(71);
    }

    @OriginalMember(owner = "client!n", name = "j", descriptor = "(I)V", line = 311)
    public static void method62(int arg0) {
        field70 = null;
        if (arg0 > -115) {
            method53(83, (byte) -74);
        }
        field80 = null;
        field76 = null;
        field77 = null;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method56(int arg0);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "(I)Z")
    public abstract boolean method61(int arg0);
}
