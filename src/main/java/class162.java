import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class162 extends class14 {

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    private final int field2744;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    private final int field2749;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    private final int field2747;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    private final int field2752;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lwa;")
    public static class75 field2750 = class66.method560("Verbindung zum Update)2Server hergestellt)3", false);

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lwa;")
    public static class75 field2754 = class66.method560(": ", false);

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field2753 = 2;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Li;")
    public static class203 field2745 = new class203(64);

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "[[B")
    public static byte[][] field2762 = new byte[50][];

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Lwa;")
    public static class75 field2764 = class66.method560("Spieler", false);

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Lcb;")
    public static class267 field2761;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 5)
    public final void method8(int arg0, int arg1, int arg2) {
        if (arg0 != 100) {
            method1212(false, 13, 55);
        }
        field2751++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 20)
    public static final void method1210(int arg0, int arg1) {
        field2759++;
        class116.field1958.method1199(arg1, 127);
        int var2 = 110 % ((arg0 - 48) / 52);
        class282.field4855.method1199(arg1, 120);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lpj;IIIII)V", line = 51)
    public static final void method1211(class171 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class28.field366 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class150.field2573) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class262.field4440 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class242 var14 = class271.field4681[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class53.field879[var11][var12 + 1][var13] + class53.field879[var11][var12][var13] + class53.field879[var11][var12][var13 + 1] + class53.field879[var11][var12 + 1][var13 + 1]) / 4 - (class53.field879[arg1][arg2 + 1][arg3] + class53.field879[arg1][arg2][arg3] + class53.field879[arg1][arg2][arg3 + 1] + class53.field879[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class167 var16 = var14.field4098;
                                    if (var16 != null) {
                                        if (var16.field2815.method420()) {
                                            arg0.method447(var16.field2815, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2809 != null && var16.field2809.method420()) {
                                            arg0.method447(var16.field2809, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4086; var17++) {
                                        class285 var18 = var14.field4083[var17];
                                        if (var18 != null && var18.field4898.method420() && (var18.field4907 == var12 || var7 == var12) && (var18.field4895 == var13 || var9 == var13)) {
                                            int var19 = var18.field4911 + 1 - var18.field4907;
                                            int var20 = var18.field4896 + 1 - var18.field4895;
                                            arg0.method447(var18.field4898, (var18.field4907 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4895 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)V", line = 151)
    public static final void method1212(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method1213((byte) 5);
        }
        class6.field77[arg2] = arg1;
        class272 var3 = (class272) class242.field4080.method1007((long) arg2, -17004);
        if (var3 == null) {
            class272 var4 = new class272(4611686018427387905L);
            class242.field4080.method1004((byte) 73, (long) arg2, var4);
        } else if (var3.field4696 != 4611686018427387905L) {
            var3.field4696 = class78.method669(2047) + 500L | 0x4000000000000000L;
        }
        field2757++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V", line = 177)
    public final void method13(int arg0, int arg1, int arg2) {
        field2765++;
        if (arg2 <= 58) {
            this.method8(-33, 84, 56);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 191)
    public static final void method1213(byte arg0) {
        class31.field451.method1200(false);
        if (arg0 <= -38) {
            class213.field3626.method1200(false);
            field2758++;
            class12.field157.method1200(false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 205)
    public static final void method1214(int arg0, boolean arg1) {
        field2760++;
        if (!class51.method375(arg0, -123)) {
            return;
        }
        if (!arg1) {
            field2753 = -75;
        }
        class262[] var2 = class249.field4198[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class262 var4 = var2[var3];
            if (var4 != null) {
                var4.field4406 = 0;
                var4.field4505 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIII)V", line = 237)
    public class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2744 = arg0;
        this.field2749 = arg2;
        this.field2747 = arg3;
        this.field2752 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZI)V", line = 255)
    public final void method4(int arg0, boolean arg1, int arg2) {
        int var4 = this.field2749 * arg2 >> 12;
        int var5 = this.field2744 * arg2 >> 12;
        field2748++;
        int var6 = this.field2747 * arg0 >> 12;
        int var7 = this.field2752 * arg0 >> 12;
        method1215(this.field183, var4, var7, arg1, var5, var6);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZII)V", line = 268)
    public static final void method1215(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = arg1 - arg4;
        field2755++;
        int var7 = arg5 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class170.method1253(arg5, (byte) 92, arg2, arg0, arg4);
            }
        } else if (var7 == 0) {
            class26.method177(arg2, arg4, (byte) 69, arg0, arg1);
        } else if (!arg3) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class153.field2635 > arg1) {
                var10 = (class153.field2635 * var8 >> 12) + var9;
                var11 = class153.field2635;
            } else if (class288.field4956 < arg1) {
                var10 = (class288.field4956 * var8 >> 12) + var9;
                var11 = class288.field4956;
            } else {
                var10 = arg5;
                var11 = arg1;
            }
            int var12;
            int var13;
            if (class153.field2635 > arg4) {
                var13 = class153.field2635;
                var12 = (class153.field2635 * var8 >> 12) + var9;
            } else if (arg4 > class288.field4956) {
                var12 = var9 + (class288.field4956 * var8 >> 12);
                var13 = class288.field4956;
            } else {
                var12 = arg2;
                var13 = arg4;
            }
            if (var10 < class90.field1495) {
                var11 = (class90.field1495 - var9 << 12) / var8;
                var10 = class90.field1495;
            } else if (class294.field5041 < var10) {
                var10 = class294.field5041;
                var11 = (class294.field5041 - var9 << 12) / var8;
            }
            if (var12 < class90.field1495) {
                var13 = (class90.field1495 - var9 << 12) / var8;
                var12 = class90.field1495;
            } else if (class294.field5041 < var12) {
                var13 = (class294.field5041 - var9 << 12) / var8;
                var12 = class294.field5041;
            }
            class203.method1513(var13, arg0, var12, var10, 8539, var11);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILwa;Lwa;)V", line = 371)
    public static final void method1216(byte arg0, int arg1, class75 arg2, class75 arg3) {
        field2756++;
        class63.method545((class75) null, arg1, arg2, 1, -1, arg3);
        if (arg0 != 38) {
            method1215(-26, -71, 9, false, -111, -77);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lkf;", line = 383)
    public static final class211 method1217(int arg0) {
        field2746++;
        if (arg0 != -1087515668) {
            return (class211) null;
        }
        try {
            return (class211) Class.forName("kj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class198();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 415)
    public static void method1218(boolean arg0) {
        field2762 = (byte[][]) null;
        field2750 = null;
        field2754 = null;
        field2764 = null;
        field2745 = null;
        field2761 = null;
        if (!arg0) {
            field2753 = 117;
        }
    }
}
