import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class208 extends class175 {

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field3451 = 3072;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    private int field3457 = 2048;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    private int field3454 = 1024;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "[Z")
    public static boolean[] field3458 = new boolean[100];

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "[Lij;")
    public static class50[] field3452 = new class50[200];

    @OriginalMember(owner = "client!o", name = "U", descriptor = "Lij;")
    private static class50 field3456 = class78.method578(121, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lij;")
    public static class50 field3449 = class78.method578(121, ":duelstake:");

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Lij;")
    public static class50 field3455 = class78.method578(125, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Lij;")
    private static class50 field3461 = class78.method578(127, "Select");

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lij;")
    public static class50 field3450 = field3461;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Lij;")
    public static class50 field3453 = field3456;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "[I")
    public static int[] field3459;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 != 0) {
            this.method39(false, 77, (class217) null);
        }
        this.field3457 = -this.field3454 + this.field3451;
        ++field3460;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrj;II)V")
    public static final void method1397(class93 arg0, int arg1, int arg2) {
        ++field3447;
        Object[] var3 = arg0.field1739;
        int var4 = (Integer) var3[0];
        class31 var5 = class41.method315(var4, -3777);
        if (var5 != null) {
            class221.field3727 = 0;
            if (arg1 != 14245) {
                field3459 = null;
            }
            int var6 = 0;
            int var7 = 0;
            int var8 = -1;
            int[] var9 = var5.field618;
            int[] var10 = var5.field634;
            byte var11 = -1;
            try {
                class216.field3569 = new class50[var5.field623];
                class247.field4302 = new int[var5.field631];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var3.length > var14; ++var14) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg0.field1741;
                        }
                        if (~var15 == 2147483645) {
                            var15 = arg0.field1734;
                        }
                        if (~var15 == 2147483644) {
                            var15 = arg0.field1740 == null ? -1 : arg0.field1740.field155;
                        }
                        if (~var15 == 2147483643) {
                            var15 = arg0.field1745;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg0.field1740 != null ? arg0.field1740.field216 : -1;
                        }
                        if (~var15 == 2147483641) {
                            var15 = arg0.field1743 == null ? -1 : arg0.field1743.field155;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg0.field1743 != null ? arg0.field1743.field216 : -1;
                        }
                        if (~var15 == 2147483639) {
                            var15 = arg0.field1735;
                        }
                        if (~var15 == 2147483638) {
                            var15 = arg0.field1747;
                        }
                        class247.field4302[var12++] = var15;
                    } else if (var3[var14] instanceof class50) {
                        class50 var16 = (class50) var3[var14];
                        if (var16.method367(class216.field3575, arg1 + -14244)) {
                            var16 = arg0.field1733;
                        }
                        class216.field3569[var13++] = var16;
                    }
                }
                int var17 = 0;
                label3359: while (true) {
                    ++var17;
                    if (arg2 < var17) {
                        throw new RuntimeException("slow");
                    }
                    ++var8;
                    int var440 = var9[var8];
                    if (var440 < 100) {
                        if (var440 == 0) {
                            class21.field450[var6++] = var10[var8];
                            continue;
                        }
                        if (var440 == 1) {
                            int var18 = var10[var8];
                            class21.field450[var6++] = class54.field968[var18];
                            continue;
                        }
                        if (~var440 == -3) {
                            int var19 = var10[var8];
                            --var6;
                            class239.method1631(0, var19, class21.field450[var6]);
                            continue;
                        }
                        if (var440 == 3) {
                            class211.field3511[var7++] = var5.field630[var8];
                            continue;
                        }
                        if (var440 == 6) {
                            var8 += var10[var8];
                            continue;
                        }
                        if (var440 == 7) {
                            var6 -= 2;
                            if (~class21.field450[var6 + 1] != ~class21.field450[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var440 == 8) {
                            var6 -= 2;
                            if (class21.field450[var6 + 1] == class21.field450[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var440 == 9) {
                            var6 -= 2;
                            if (class21.field450[var6] < class21.field450[var6 - -1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var440 == 10) {
                            var6 -= 2;
                            if (~class21.field450[var6 + 1] > ~class21.field450[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (~var440 == -22) {
                            if (~class221.field3727 == -1) {
                                return;
                            }
                            class206 var20 = class129.field2257[--class221.field3727];
                            var5 = var20.field3418;
                            class216.field3569 = var20.field3420;
                            class247.field4302 = var20.field3419;
                            var9 = var5.field618;
                            var8 = var20.field3412;
                            var10 = var5.field634;
                            continue;
                        }
                        if (~var440 == -26) {
                            int var21 = var10[var8];
                            class21.field450[var6++] = class197.method1326(false, var21);
                            continue;
                        }
                        if (~var440 == -28) {
                            int var22 = var10[var8];
                            --var6;
                            class96.method725(class21.field450[var6], 0, var22);
                            continue;
                        }
                        if (~var440 == -32) {
                            var6 -= 2;
                            if (~class21.field450[var6] >= ~class21.field450[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var440 == 32) {
                            var6 -= 2;
                            if (~class21.field450[var6] <= ~class21.field450[var6 - -1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var440 == 33) {
                            class21.field450[var6++] = class247.field4302[var10[var8]];
                            continue;
                        }
                        int var10001;
                        if (~var440 == -35) {
                            var10001 = var10[var8];
                            --var6;
                            class247.field4302[var10001] = class21.field450[var6];
                            continue;
                        }
                        if (var440 == 35) {
                            class211.field3511[var7++] = class216.field3569[var10[var8]];
                            continue;
                        }
                        if (~var440 == -37) {
                            var10001 = var10[var8];
                            --var7;
                            class216.field3569[var10001] = class211.field3511[var7];
                            continue;
                        }
                        if (~var440 == -38) {
                            int var23 = var10[var8];
                            var7 -= var23;
                            class50 var24 = class45.method344(var7, (byte) -96, class211.field3511, var23);
                            class211.field3511[var7++] = var24;
                            continue;
                        }
                        if (~var440 == -39) {
                            --var6;
                            continue;
                        }
                        if (~var440 == -40) {
                            --var7;
                            continue;
                        }
                        if (var440 == 40) {
                            int var25 = var10[var8];
                            class31 var26 = class41.method315(var25, -3777);
                            int[] var27 = new int[var26.field631];
                            class50[] var28 = new class50[var26.field623];
                            for (int var29 = 0; ~var29 > ~var26.field629; ++var29) {
                                var27[var29] = class21.field450[-var26.field629 + var6 - -var29];
                            }
                            for (int var30 = 0; ~var30 > ~var26.field620; ++var30) {
                                var28[var30] = class211.field3511[-var26.field620 + var7 + var30];
                            }
                            var6 -= var26.field629;
                            var7 -= var26.field620;
                            class206 var31 = new class206();
                            var31.field3412 = var8;
                            var31.field3418 = var5;
                            var31.field3420 = class216.field3569;
                            var31.field3419 = class247.field4302;
                            if (class221.field3727 >= class129.field2257.length) {
                                throw new RuntimeException();
                            }
                            var5 = var26;
                            class129.field2257[class221.field3727++] = var31;
                            var8 = -1;
                            class216.field3569 = var28;
                            class247.field4302 = var27;
                            var10 = var26.field634;
                            var9 = var26.field618;
                            continue;
                        }
                        if (~var440 == -43) {
                            class21.field450[var6++] = class106.field1910[var10[var8]];
                            continue;
                        }
                        if (var440 == 43) {
                            int var32 = var10[var8];
                            --var6;
                            class106.field1910[var32] = class21.field450[var6];
                            class59.method463(var32, (byte) 7);
                            continue;
                        }
                        if (~var440 == -45) {
                            int var33 = var10[var8] & 65535;
                            --var6;
                            int var34 = class21.field450[var6];
                            int var35 = var10[var8] >> 16;
                            if (~var34 <= -1 && ~var34 >= -5001) {
                                class87.field1687[var35] = var34;
                                byte var36 = -1;
                                if (~var33 == -106) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (~var37 <= ~var34) {
                                        continue label3359;
                                    }
                                    class6.field80[var35][var37] = var36;
                                    ++var37;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (~var440 == -46) {
                            int var38 = var10[var8];
                            --var6;
                            int var39 = class21.field450[var6];
                            if (~var39 <= -1 && var39 < class87.field1687[var38]) {
                                class21.field450[var6++] = class6.field80[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var440 == -47) {
                            var6 -= 2;
                            int var40 = var10[var8];
                            int var41 = class21.field450[var6];
                            if (~var41 <= -1 && ~class87.field1687[var40] < ~var41) {
                                class6.field80[var40][var41] = class21.field450[var6 - -1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var440 == -48) {
                            class50 var42 = class22.field509[var10[var8]];
                            if (var42 == null) {
                                var42 = class155.field2704;
                            }
                            class211.field3511[var7++] = var42;
                            continue;
                        }
                        if (~var440 == -49) {
                            int var43 = var10[var8];
                            --var7;
                            class22.field509[var43] = class211.field3511[var7];
                            class2.method8(var43, (byte) 110);
                            continue;
                        }
                        if (~var440 == -52) {
                            class56 var44 = var5.field622[var10[var8]];
                            --var6;
                            class199 var45 = (class199) var44.method443((long) class21.field450[var6], (byte) -74);
                            if (var45 != null) {
                                var8 += var45.field3286;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var10[var8] != 1) {
                        var46 = false;
                    } else {
                        var46 = true;
                    }
                    if (var440 < 300) {
                        if (var440 == 100) {
                            var6 -= 3;
                            int var47 = class21.field450[var6];
                            int var48 = class21.field450[var6 + 1];
                            int var49 = class21.field450[var6 + 2];
                            if (~var48 == -1) {
                                throw new RuntimeException();
                            }
                            class10 var50 = class89.method698(var47, (byte) 94);
                            if (var50.field297 == null) {
                                var50.field297 = new class10[var49 + 1];
                            }
                            if (~var49 <= ~var50.field297.length) {
                                class10[] var51 = new class10[var49 - -1];
                                for (int var52 = 0; var52 < var50.field297.length; ++var52) {
                                    var51[var52] = var50.field297[var52];
                                }
                                var50.field297 = var51;
                            }
                            if (~var49 < -1 && var50.field297[var49 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var49 + -1));
                            }
                            class10 var53 = new class10();
                            var53.field227 = var48;
                            var53.field149 = var53.field155 = var50.field155;
                            var53.field216 = var49;
                            var53.field222 = true;
                            var50.field297[var49] = var53;
                            if (!var46) {
                                class53.field957 = var53;
                            } else {
                                class104.field1897 = var53;
                            }
                            class140.method979((byte) 32, var50);
                            continue;
                        }
                        if (var440 == 101) {
                            class10 var54 = !var46 ? class53.field957 : class104.field1897;
                            if (~var54.field216 == 0) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class10 var55 = class89.method698(var54.field155, (byte) 94);
                            var55.field297[var54.field216] = null;
                            class140.method979((byte) 66, var55);
                            continue;
                        }
                        if (var440 == 102) {
                            --var6;
                            class10 var56 = class89.method698(class21.field450[var6], (byte) 94);
                            var56.field297 = null;
                            class140.method979((byte) 48, var56);
                            continue;
                        }
                        if (~var440 == -201) {
                            var6 -= 2;
                            int var57 = class21.field450[var6];
                            int var58 = class21.field450[var6 + 1];
                            class10 var59 = class62.method475(var58, var57, arg1 ^ -14246);
                            if (var59 != null && var58 != -1) {
                                class21.field450[var6++] = 1;
                                if (!var46) {
                                    class53.field957 = var59;
                                } else {
                                    class104.field1897 = var59;
                                }
                                continue;
                            }
                            class21.field450[var6++] = 0;
                            continue;
                        }
                        if (~var440 == -202) {
                            --var6;
                            int var60 = class21.field450[var6];
                            class10 var61 = class89.method698(var60, (byte) 94);
                            if (var61 == null) {
                                class21.field450[var6++] = 0;
                            } else {
                                class21.field450[var6++] = 1;
                                if (var46) {
                                    class104.field1897 = var61;
                                } else {
                                    class53.field957 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (var440 < 500) {
                        if (~var440 == -404) {
                            var6 -= 2;
                            int var428 = class21.field450[var6];
                            int var429 = class21.field450[var6 + 1];
                            if (~var428 <= -8) {
                                var428 -= 7;
                            }
                            class239.field4067.field3092.method294(var428, var429, 768);
                            continue;
                        }
                        if (var440 == 404) {
                            var6 -= 2;
                            int var430 = class21.field450[var6 + 1];
                            int var431 = class21.field450[var6];
                            class239.field4067.field3092.method293(var430, var431, -24163);
                            continue;
                        }
                        if (var440 == 410) {
                            --var6;
                            boolean var432 = ~class21.field450[var6] != -1;
                            class239.field4067.field3092.method285(var432, arg1 ^ 14279);
                            continue;
                        }
                    } else if ((~var440 > -1001 || ~var440 <= -1101) && (~var440 > -2001 || var440 >= 2100)) {
                        if (~var440 <= -1101 && var440 < 1200 || var440 >= 2100 && var440 < 2200) {
                            class10 var425;
                            if (var440 >= 2000) {
                                var440 -= 1000;
                                --var6;
                                var425 = class89.method698(class21.field450[var6], (byte) 94);
                            } else {
                                var425 = var46 ? class104.field1897 : class53.field957;
                            }
                            if (~var440 == -1101) {
                                var6 -= 2;
                                var425.field156 = class21.field450[var6];
                                if (var425.field156 > -var425.field243 + var425.field138) {
                                    var425.field156 = -var425.field243 + var425.field138;
                                }
                                if (~var425.field156 > -1) {
                                    var425.field156 = 0;
                                }
                                var425.field239 = class21.field450[var6 + 1];
                                if (~var425.field239 < ~(-var425.field242 + var425.field292)) {
                                    var425.field239 = -var425.field242 + var425.field292;
                                }
                                if (var425.field239 < 0) {
                                    var425.field239 = 0;
                                }
                                class140.method979((byte) 55, var425);
                                continue;
                            }
                            if (~var440 == -1102) {
                                --var6;
                                var425.field280 = class21.field450[var6];
                                class140.method979((byte) 125, var425);
                                continue;
                            }
                            if (var440 == 1102) {
                                --var6;
                                var425.field146 = class21.field450[var6] == 1;
                                class140.method979((byte) 125, var425);
                                continue;
                            }
                            if (~var440 == -1104) {
                                --var6;
                                var425.field252 = class21.field450[var6];
                                class140.method979((byte) 82, var425);
                                continue;
                            }
                            if (var440 == 1104) {
                                --var6;
                                var425.field202 = class21.field450[var6];
                                class140.method979((byte) 116, var425);
                                continue;
                            }
                            if (~var440 == -1106) {
                                --var6;
                                var425.field225 = class21.field450[var6];
                                class140.method979((byte) 121, var425);
                                continue;
                            }
                            if (var440 == 1106) {
                                --var6;
                                var425.field296 = class21.field450[var6];
                                class140.method979((byte) 122, var425);
                                continue;
                            }
                            if (~var440 == -1108) {
                                --var6;
                                var425.field176 = class21.field450[var6] == 1;
                                class140.method979((byte) 28, var425);
                                continue;
                            }
                            if (~var440 == -1109) {
                                var425.field232 = 1;
                                --var6;
                                var425.field159 = class21.field450[var6];
                                class140.method979((byte) 78, var425);
                                continue;
                            }
                            if (var440 == 1109) {
                                var6 -= 6;
                                var425.field215 = class21.field450[var6];
                                var425.field173 = class21.field450[var6 + 1];
                                var425.field183 = class21.field450[var6 + 2];
                                var425.field276 = class21.field450[var6 - -3];
                                var425.field172 = class21.field450[var6 + 4];
                                var425.field218 = class21.field450[var6 + 5];
                                class140.method979((byte) 69, var425);
                                continue;
                            }
                            if (var440 == 1110) {
                                --var6;
                                int var426 = class21.field450[var6];
                                if (var425.field200 != var426) {
                                    var425.field301 = 0;
                                    var425.field237 = 0;
                                    var425.field200 = var426;
                                    class140.method979((byte) 119, var425);
                                }
                                continue;
                            }
                            if (~var440 == -1112) {
                                --var6;
                                var425.field223 = class21.field450[var6] == 1;
                                class140.method979((byte) 118, var425);
                                continue;
                            }
                            if (~var440 == -1113) {
                                --var7;
                                class50 var427 = class211.field3511[var7];
                                if (!var427.method367(var425.field137, 1)) {
                                    var425.field137 = var427;
                                    class140.method979((byte) 116, var425);
                                }
                                continue;
                            }
                            if (var440 == 1113) {
                                --var6;
                                var425.field163 = class21.field450[var6];
                                class140.method979((byte) 42, var425);
                                continue;
                            }
                            if (var440 == 1114) {
                                var6 -= 3;
                                var425.field154 = class21.field450[var6];
                                var425.field271 = class21.field450[var6 + 1];
                                var425.field207 = class21.field450[var6 + 2];
                                class140.method979((byte) 107, var425);
                                continue;
                            }
                            if (~var440 == -1116) {
                                --var6;
                                var425.field248 = class21.field450[var6] == 1;
                                class140.method979((byte) 26, var425);
                                continue;
                            }
                            if (var440 == 1116) {
                                --var6;
                                var425.field193 = class21.field450[var6];
                                class140.method979((byte) 21, var425);
                                continue;
                            }
                            if (var440 == 1117) {
                                --var6;
                                var425.field184 = class21.field450[var6];
                                class140.method979((byte) 87, var425);
                                continue;
                            }
                            if (~var440 == -1119) {
                                --var6;
                                var425.field213 = class21.field450[var6] == 1;
                                class140.method979((byte) 67, var425);
                                continue;
                            }
                            if (var440 == 1119) {
                                --var6;
                                var425.field254 = class21.field450[var6] == 1;
                                class140.method979((byte) 24, var425);
                                continue;
                            }
                            if (var440 == 1120) {
                                var6 -= 2;
                                var425.field138 = class21.field450[var6];
                                var425.field292 = class21.field450[var6 + 1];
                                class140.method979((byte) 17, var425);
                                if (var425.field227 == 0) {
                                    class254.method1716(827759824, false, var425);
                                }
                                continue;
                            }
                            if (var440 == 1121) {
                                var6 -= 2;
                                class140.method979((byte) 116, var425);
                                continue;
                            }
                            if (~var440 == -1123) {
                                --var6;
                                var425.field186 = ~class21.field450[var6] == -2;
                                class140.method979((byte) 91, var425);
                                continue;
                            }
                        } else if (~var440 <= -1201 && var440 < 1300 || ~var440 <= -2201 && ~var440 > -2301) {
                            class10 var68;
                            if (~var440 <= -2001) {
                                var440 -= 1000;
                                --var6;
                                var68 = class89.method698(class21.field450[var6], (byte) 94);
                            } else {
                                var68 = !var46 ? class53.field957 : class104.field1897;
                            }
                            class140.method979((byte) 20, var68);
                            if (~var440 == -1201 || var440 == 1205) {
                                var6 -= 2;
                                int var69 = class21.field450[var6];
                                int var70 = class21.field450[var6 - -1];
                                if (var69 == -1) {
                                    var68.field300 = -1;
                                    var68.field159 = -1;
                                    var68.field232 = 1;
                                } else {
                                    var68.field300 = var69;
                                    var68.field205 = var70;
                                    class239 var71 = class15.method111(var69, false);
                                    var68.field215 = var71.field4052;
                                    var68.field276 = var71.field4119;
                                    if (var440 == 1205) {
                                        var68.field264 = false;
                                    } else {
                                        var68.field264 = true;
                                    }
                                    var68.field172 = var71.field4107;
                                    var68.field183 = var71.field4086;
                                    var68.field173 = var71.field4074;
                                    var68.field218 = var71.field4049;
                                    if (~var68.field290 >= -1) {
                                        if (var68.field229 > 0) {
                                            var68.field218 = var68.field218 * 32 / var68.field229;
                                        }
                                    } else {
                                        var68.field218 = var68.field218 * 32 / var68.field290;
                                    }
                                }
                                continue;
                            }
                            if (var440 == 1201) {
                                var68.field232 = 2;
                                --var6;
                                var68.field159 = class21.field450[var6];
                                continue;
                            }
                            if (~var440 == -1203) {
                                var68.field232 = 3;
                                var68.field159 = class239.field4067.field3092.method290((byte) 47);
                                continue;
                            }
                            if (var440 == 1203) {
                                var68.field232 = 6;
                                --var6;
                                var68.field159 = class21.field450[var6];
                                continue;
                            }
                            if (var440 == 1204) {
                                var68.field232 = 5;
                                --var6;
                                var68.field159 = class21.field450[var6];
                                continue;
                            }
                        } else if (~var440 <= -1301 && ~var440 > -1401 || ~var440 <= -2301 && ~var440 > -2401) {
                            class10 var421;
                            if (~var440 > -2001) {
                                var421 = !var46 ? class53.field957 : class104.field1897;
                            } else {
                                var440 -= 1000;
                                --var6;
                                var421 = class89.method698(class21.field450[var6], (byte) 94);
                            }
                            if (~var440 == -1301) {
                                --var6;
                                int var422 = class21.field450[var6] - 1;
                                if (var422 >= 0 && var422 <= 9) {
                                    --var7;
                                    var421.method70(class211.field3511[var7], var422, (byte) -49);
                                    continue;
                                }
                                --var7;
                                continue;
                            }
                            if (~var440 == -1302) {
                                var6 -= 2;
                                int var423 = class21.field450[var6];
                                int var424 = class21.field450[var6 + 1];
                                var421.field277 = class62.method475(var424, var423, arg1 + -14246);
                                continue;
                            }
                            if (~var440 == -1303) {
                                --var6;
                                var421.field284 = ~class21.field450[var6] == -2;
                                continue;
                            }
                            if (~var440 == -1304) {
                                --var6;
                                var421.field231 = class21.field450[var6];
                                continue;
                            }
                            if (~var440 == -1305) {
                                --var6;
                                var421.field295 = class21.field450[var6];
                                continue;
                            }
                            if (var440 == 1305) {
                                --var7;
                                var421.field181 = class211.field3511[var7];
                                continue;
                            }
                            if (~var440 == -1307) {
                                --var7;
                                var421.field201 = class211.field3511[var7];
                                continue;
                            }
                            if (var440 == 1307) {
                                var421.field199 = null;
                                continue;
                            }
                        } else {
                            if (~var440 <= -1401 && var440 < 1500 || var440 >= 2400 && var440 < 2500) {
                                class10 var72;
                                if (var440 >= 2000) {
                                    var440 -= 1000;
                                    --var6;
                                    var72 = class89.method698(class21.field450[var6], (byte) 94);
                                } else {
                                    var72 = var46 ? class104.field1897 : class53.field957;
                                }
                                int[] var73 = null;
                                --var7;
                                class50 var74 = class211.field3511[var7];
                                if (~var74.method396(1) < -1 && ~var74.method393(-1 + var74.method396(arg1 + -14244), (byte) -34) == -90) {
                                    --var6;
                                    int var75 = class21.field450[var6];
                                    if (~var75 < -1) {
                                        var73 = new int[var75];
                                        while (~(var75--) < -1) {
                                            --var6;
                                            var73[var75] = class21.field450[var6];
                                        }
                                    }
                                    var74 = var74.method363(0, -1 + var74.method396(arg1 ^ 14244), arg1 + -14245);
                                }
                                Object[] var76 = new Object[var74.method396(1) + 1];
                                for (int var77 = var76.length + -1; ~var77 <= -2; --var77) {
                                    if (~var74.method393(var77 + -1, (byte) 126) != -116) {
                                        --var6;
                                        var76[var77] = new Integer(class21.field450[var6]);
                                    } else {
                                        --var7;
                                        var76[var77] = class211.field3511[var7];
                                    }
                                }
                                --var6;
                                int var78 = class21.field450[var6];
                                if (~var78 != 0) {
                                    var76[0] = new Integer(var78);
                                } else {
                                    var76 = null;
                                }
                                var72.field206 = true;
                                if (var440 != 1400) {
                                    if (~var440 != -1402) {
                                        if (~var440 == -1403) {
                                            var72.field266 = var76;
                                        } else if (var440 != 1403) {
                                            if (var440 == 1404) {
                                                var72.field209 = var76;
                                            } else if (var440 != 1405) {
                                                if (~var440 != -1407) {
                                                    if (~var440 == -1408) {
                                                        var72.field275 = var76;
                                                        var72.field153 = var73;
                                                    } else if (~var440 != -1409) {
                                                        if (~var440 != -1410) {
                                                            if (var440 != 1410) {
                                                                if (~var440 != -1412) {
                                                                    if (~var440 == -1413) {
                                                                        var72.field214 = var76;
                                                                    } else if (var440 == 1414) {
                                                                        var72.field299 = var73;
                                                                        var72.field249 = var76;
                                                                    } else if (~var440 == -1416) {
                                                                        var72.field230 = var76;
                                                                        var72.field235 = var73;
                                                                    } else if (var440 != 1416) {
                                                                        if (~var440 != -1418) {
                                                                            if (var440 == 1418) {
                                                                                var72.field269 = var76;
                                                                            } else if (var440 != 1419) {
                                                                                if (var440 != 1420) {
                                                                                    if (var440 != 1421) {
                                                                                        if (var440 != 1422) {
                                                                                            if (~var440 != -1424) {
                                                                                                if (~var440 != -1425) {
                                                                                                    if (~var440 != -1426) {
                                                                                                        if (~var440 == -1427) {
                                                                                                            var72.field196 = var76;
                                                                                                        } else if (var440 == 1427) {
                                                                                                            var72.field217 = var76;
                                                                                                        } else if (var440 == 1428) {
                                                                                                            var72.field226 = var76;
                                                                                                            var72.field194 = var73;
                                                                                                        } else if (~var440 == -1430) {
                                                                                                            var72.field141 = var73;
                                                                                                            var72.field192 = var76;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var72.field134 = var76;
                                                                                                    }
                                                                                                } else {
                                                                                                    var72.field177 = var76;
                                                                                                }
                                                                                            } else {
                                                                                                var72.field253 = var76;
                                                                                            }
                                                                                        } else {
                                                                                            var72.field147 = var76;
                                                                                        }
                                                                                    } else {
                                                                                        var72.field291 = var76;
                                                                                    }
                                                                                } else {
                                                                                    var72.field255 = var76;
                                                                                }
                                                                            } else {
                                                                                var72.field195 = var76;
                                                                            }
                                                                        } else {
                                                                            var72.field289 = var76;
                                                                        }
                                                                    } else {
                                                                        var72.field168 = var76;
                                                                    }
                                                                } else {
                                                                    var72.field143 = var76;
                                                                }
                                                            } else {
                                                                var72.field161 = var76;
                                                            }
                                                        } else {
                                                            var72.field240 = var76;
                                                        }
                                                    } else {
                                                        var72.field142 = var76;
                                                    }
                                                } else {
                                                    var72.field140 = var76;
                                                }
                                            } else {
                                                var72.field258 = var76;
                                            }
                                        } else {
                                            var72.field166 = var76;
                                        }
                                    } else {
                                        var72.field185 = var76;
                                    }
                                } else {
                                    var72.field187 = var76;
                                }
                                continue;
                            }
                            if (var440 < 1600) {
                                class10 var79 = var46 ? class104.field1897 : class53.field957;
                                if (~var440 == -1501) {
                                    class21.field450[var6++] = var79.field272;
                                    continue;
                                }
                                if (~var440 == -1502) {
                                    class21.field450[var6++] = var79.field241;
                                    continue;
                                }
                                if (var440 == 1502) {
                                    class21.field450[var6++] = var79.field243;
                                    continue;
                                }
                                if (~var440 == -1504) {
                                    class21.field450[var6++] = var79.field242;
                                    continue;
                                }
                                if (var440 == 1504) {
                                    class21.field450[var6++] = !var79.field268 ? 0 : 1;
                                    continue;
                                }
                                if (var440 == 1505) {
                                    class21.field450[var6++] = var79.field149;
                                    continue;
                                }
                            } else if (~var440 <= -1701) {
                                if (~var440 <= -1801) {
                                    if (var440 >= 1900) {
                                        if (var440 >= 2600) {
                                            if (var440 < 2700) {
                                                --var6;
                                                class10 var80 = class89.method698(class21.field450[var6], (byte) 94);
                                                if (var440 == 2600) {
                                                    class21.field450[var6++] = var80.field156;
                                                    continue;
                                                }
                                                if (~var440 == -2602) {
                                                    class21.field450[var6++] = var80.field239;
                                                    continue;
                                                }
                                                if (~var440 == -2603) {
                                                    class211.field3511[var7++] = var80.field137;
                                                    continue;
                                                }
                                                if (~var440 == -2604) {
                                                    class21.field450[var6++] = var80.field138;
                                                    continue;
                                                }
                                                if (var440 == 2604) {
                                                    class21.field450[var6++] = var80.field292;
                                                    continue;
                                                }
                                                if (var440 == 2605) {
                                                    class21.field450[var6++] = var80.field218;
                                                    continue;
                                                }
                                                if (var440 == 2606) {
                                                    class21.field450[var6++] = var80.field183;
                                                    continue;
                                                }
                                                if (var440 == 2607) {
                                                    class21.field450[var6++] = var80.field172;
                                                    continue;
                                                }
                                                if (~var440 == -2609) {
                                                    class21.field450[var6++] = var80.field276;
                                                    continue;
                                                }
                                                if (~var440 == -2610) {
                                                    class21.field450[var6++] = var80.field252;
                                                    continue;
                                                }
                                            } else if (~var440 <= -2801) {
                                                if (~var440 <= -2901) {
                                                    if (var440 >= 3200) {
                                                        if (~var440 <= -3301) {
                                                            if (~var440 > -3401) {
                                                                if (var440 == 3300) {
                                                                    class21.field450[var6++] = class244.field4245;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3302) {
                                                                    var6 -= 2;
                                                                    int var81 = class21.field450[var6 - -1];
                                                                    int var82 = class21.field450[var6];
                                                                    class21.field450[var6++] = class104.method787(var81, -77, var82);
                                                                    continue;
                                                                }
                                                                if (var440 == 3302) {
                                                                    var6 -= 2;
                                                                    int var83 = class21.field450[var6 + 1];
                                                                    int var84 = class21.field450[var6];
                                                                    class21.field450[var6++] = class70.method533(var83, (byte) -84, var84);
                                                                    continue;
                                                                }
                                                                if (var440 == 3303) {
                                                                    var6 -= 2;
                                                                    int var85 = class21.field450[var6];
                                                                    int var86 = class21.field450[var6 - -1];
                                                                    class21.field450[var6++] = class248.method1690(127, var85, var86);
                                                                    continue;
                                                                }
                                                                if (var440 == 3304) {
                                                                    --var6;
                                                                    int var87 = class21.field450[var6];
                                                                    class21.field450[var6++] = class64.method503(var87, 5).field4123;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3306) {
                                                                    --var6;
                                                                    int var88 = class21.field450[var6];
                                                                    class21.field450[var6++] = class190.field3154[var88];
                                                                    continue;
                                                                }
                                                                if (var440 == 3306) {
                                                                    --var6;
                                                                    int var89 = class21.field450[var6];
                                                                    class21.field450[var6++] = class83.field1542[var89];
                                                                    continue;
                                                                }
                                                                if (var440 == 3307) {
                                                                    --var6;
                                                                    int var90 = class21.field450[var6];
                                                                    class21.field450[var6++] = class86.field1662[var90];
                                                                    continue;
                                                                }
                                                                if (var440 == 3308) {
                                                                    int var91 = (class239.field4067.field3990 >> 7) + class61.field1124;
                                                                    int var92 = class201.field3312;
                                                                    int var93 = (class239.field4067.field4027 >> 7) + class254.field4394;
                                                                    class21.field450[var6++] = (var92 << 28) - -(var91 << 14) - -var93;
                                                                    continue;
                                                                }
                                                                if (var440 == 3309) {
                                                                    --var6;
                                                                    int var94 = class21.field450[var6];
                                                                    class21.field450[var6++] = class51.method413(var94, 268428685) >> 14;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3311) {
                                                                    --var6;
                                                                    int var95 = class21.field450[var6];
                                                                    class21.field450[var6++] = var95 >> 28;
                                                                    continue;
                                                                }
                                                                if (var440 == 3311) {
                                                                    --var6;
                                                                    int var96 = class21.field450[var6];
                                                                    class21.field450[var6++] = class51.method413(16383, var96);
                                                                    continue;
                                                                }
                                                                if (var440 == 3312) {
                                                                    class21.field450[var6++] = class151.field2628 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3314) {
                                                                    var6 -= 2;
                                                                    int var97 = class21.field450[var6] + 32768;
                                                                    int var98 = class21.field450[var6 + 1];
                                                                    class21.field450[var6++] = class104.method787(var98, -67, var97);
                                                                    continue;
                                                                }
                                                                if (~var440 == -3315) {
                                                                    var6 -= 2;
                                                                    int var99 = class21.field450[var6] + 32768;
                                                                    int var100 = class21.field450[var6 + 1];
                                                                    class21.field450[var6++] = class70.method533(var100, (byte) -101, var99);
                                                                    continue;
                                                                }
                                                                if (var440 == 3315) {
                                                                    var6 -= 2;
                                                                    int var101 = class21.field450[var6] - -32768;
                                                                    int var102 = class21.field450[var6 + 1];
                                                                    class21.field450[var6++] = class248.method1690(125, var101, var102);
                                                                    continue;
                                                                }
                                                                if (~var440 == -3317) {
                                                                    if (class18.field397 >= 2) {
                                                                        class21.field450[var6++] = class18.field397;
                                                                    } else {
                                                                        class21.field450[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var440 == -3318) {
                                                                    class21.field450[var6++] = class22.field510;
                                                                    continue;
                                                                }
                                                                if (var440 == 3318) {
                                                                    class21.field450[var6++] = class14.field332;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3322) {
                                                                    class21.field450[var6++] = class224.field3766;
                                                                    continue;
                                                                }
                                                                if (var440 == 3322) {
                                                                    class21.field450[var6++] = class191.field3171;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3324) {
                                                                    if (~class24.field532 <= -6 && class24.field532 <= 9) {
                                                                        class21.field450[var6++] = 1;
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3325) {
                                                                    if (class24.field532 >= 5 && class24.field532 <= 9) {
                                                                        class21.field450[var6++] = class24.field532;
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3326) {
                                                                    if (~class1.field14 >= -1) {
                                                                        class21.field450[var6++] = 0;
                                                                    } else {
                                                                        class21.field450[var6++] = 1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var440 == -3327) {
                                                                    class21.field450[var6++] = class239.field4067.field3089;
                                                                    continue;
                                                                }
                                                                if (var440 == 3327) {
                                                                    class21.field450[var6++] = class239.field4067.field3092.field697 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3329) {
                                                                    class21.field450[var6++] = class255.field4403;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3330) {
                                                                    class21.field450[var6++] = class66.field1262;
                                                                    continue;
                                                                }
                                                            } else if (~var440 > -3501) {
                                                                if (var440 == 3400) {
                                                                    var6 -= 2;
                                                                    int var103 = class21.field450[var6];
                                                                    int var104 = class21.field450[var6 + 1];
                                                                    class117 var105 = class211.method1413((byte) -24, var103);
                                                                    class211.field3511[var7++] = var105.method844(var104, (byte) -111);
                                                                    continue;
                                                                }
                                                                if (~var440 == -3409) {
                                                                    var6 -= 4;
                                                                    int var106 = class21.field450[var6 - -2];
                                                                    int var107 = class21.field450[var6 + 1];
                                                                    int var108 = class21.field450[var6 + 3];
                                                                    int var109 = class21.field450[var6];
                                                                    class117 var110 = class211.method1413((byte) -5, var106);
                                                                    if (var110.field2060 == var109 && ~var110.field2061 == ~var107) {
                                                                        if (~var107 != -116) {
                                                                            class21.field450[var6++] = var110.method845(var108, arg1 + -14358);
                                                                        } else {
                                                                            class211.field3511[var7++] = var110.method844(var108, (byte) -122);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var107 == 115) {
                                                                        class211.field3511[var7++] = class155.field2704;
                                                                    } else {
                                                                        class21.field450[var6++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (var440 >= 3700) {
                                                                if (var440 < 4000) {
                                                                    if (var440 == 3903) {
                                                                        --var6;
                                                                        int var111 = class21.field450[var6];
                                                                        class21.field450[var6++] = class19.field402[var111].method721((byte) 107);
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -3905) {
                                                                        --var6;
                                                                        int var112 = class21.field450[var6];
                                                                        class21.field450[var6++] = class19.field402[var112].field1771;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -3906) {
                                                                        --var6;
                                                                        int var113 = class21.field450[var6];
                                                                        class21.field450[var6++] = class19.field402[var113].field1763;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -3907) {
                                                                        --var6;
                                                                        int var114 = class21.field450[var6];
                                                                        class21.field450[var6++] = class19.field402[var114].field1768;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 3907) {
                                                                        --var6;
                                                                        int var115 = class21.field450[var6];
                                                                        class21.field450[var6++] = class19.field402[var115].field1773;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -3909) {
                                                                        --var6;
                                                                        int var116 = class21.field450[var6];
                                                                        class21.field450[var6++] = class19.field402[var116].field1764;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 3910) {
                                                                        --var6;
                                                                        int var117 = class21.field450[var6];
                                                                        int var118 = class19.field402[var117].method719((byte) -45);
                                                                        class21.field450[var6++] = ~var118 == -1 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 3911) {
                                                                        --var6;
                                                                        int var119 = class21.field450[var6];
                                                                        int var120 = class19.field402[var119].method719((byte) -45);
                                                                        class21.field450[var6++] = ~var120 != -3 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 3912) {
                                                                        --var6;
                                                                        int var121 = class21.field450[var6];
                                                                        int var122 = class19.field402[var121].method719((byte) -45);
                                                                        class21.field450[var6++] = var122 != 5 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 3913) {
                                                                        --var6;
                                                                        int var123 = class21.field450[var6];
                                                                        int var124 = class19.field402[var123].method719((byte) -45);
                                                                        class21.field450[var6++] = var124 != 1 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                } else if (var440 >= 4100) {
                                                                    if (var440 >= 4200) {
                                                                        if (var440 >= 4300) {
                                                                            if (~var440 > -4401) {
                                                                                if (~var440 == -4301) {
                                                                                    var6 -= 2;
                                                                                    int var125 = class21.field450[var6];
                                                                                    int var126 = class21.field450[var6 + 1];
                                                                                    class193 var127 = class120.method870(var126, (byte) -122);
                                                                                    if (!var127.method1307(1427)) {
                                                                                        class21.field450[var6++] = class8.method48(-21178, var125).method487(-89, var127.field3206, var126);
                                                                                    } else {
                                                                                        class211.field3511[var7++] = class8.method48(class201.method1339(arg1, -25885), var125).method476(2652, var126, var127.field3198);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                            } else if (~var440 <= -4501) {
                                                                                if (~var440 <= -4601) {
                                                                                    if (var440 < 5100) {
                                                                                        if (var440 == 5000) {
                                                                                            class21.field450[var6++] = class153.field2683;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5002) {
                                                                                            var6 -= 3;
                                                                                            class153.field2683 = class21.field450[var6];
                                                                                            class21.field443 = class21.field450[var6 + 1];
                                                                                            ++class166.field2821;
                                                                                            class36.field704 = class21.field450[var6 + 2];
                                                                                            class190.field3141.method1598((byte) -124, 245);
                                                                                            class190.field3141.method1471(class153.field2683, (byte) 24);
                                                                                            class190.field3141.method1471(class21.field443, (byte) 24);
                                                                                            class190.field3141.method1471(class36.field704, (byte) 24);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5002) {
                                                                                            var6 -= 2;
                                                                                            int var128 = class21.field450[var6];
                                                                                            int var129 = class21.field450[var6 + 1];
                                                                                            ++class108.field1929;
                                                                                            --var7;
                                                                                            class50 var130 = class211.field3511[var7];
                                                                                            class190.field3141.method1598((byte) -87, 187);
                                                                                            class190.field3141.method1464(var130.method368((byte) -103), 867341416);
                                                                                            class190.field3141.method1471(var128 + -1, (byte) 24);
                                                                                            class190.field3141.method1471(var129, (byte) 24);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5003) {
                                                                                            class50 var131 = null;
                                                                                            --var6;
                                                                                            int var132 = class21.field450[var6];
                                                                                            if (~var132 > -101) {
                                                                                                var131 = class177.field2958[var132];
                                                                                            }
                                                                                            if (var131 == null) {
                                                                                                var131 = class200.field3298;
                                                                                            }
                                                                                            class211.field3511[var7++] = var131;
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5004) {
                                                                                            --var6;
                                                                                            int var133 = class21.field450[var6];
                                                                                            int var134 = -1;
                                                                                            if (var133 < 100 && class177.field2958[var133] != null) {
                                                                                                var134 = class238.field4041[var133];
                                                                                            }
                                                                                            class21.field450[var6++] = var134;
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5005) {
                                                                                            class21.field450[var6++] = class21.field443;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5009) {
                                                                                            --var7;
                                                                                            class50 var135 = class211.field3511[var7];
                                                                                            if (var135.method371(-118, class205.field3403)) {
                                                                                                class233.method1584((byte) -128, var135);
                                                                                                continue;
                                                                                            }
                                                                                            if (~class18.field397 == -1 && (class255.field4403 == 1 || ~class66.field1262 == -2)) {
                                                                                                continue;
                                                                                            }
                                                                                            ++class119.field2098;
                                                                                            class50 var136 = var135.method402(2023);
                                                                                            byte var137 = 0;
                                                                                            byte var138 = 0;
                                                                                            if (!var136.method371(-119, class16.field371)) {
                                                                                                if (!var136.method371(-120, class68.field1287)) {
                                                                                                    if (var136.method371(arg1 + -14370, class70.field1348)) {
                                                                                                        var137 = 2;
                                                                                                        var135 = var135.method397(64, class70.field1348.method396(1));
                                                                                                    } else if (var136.method371(-120, class82.field1471)) {
                                                                                                        var135 = var135.method397(64, class82.field1471.method396(1));
                                                                                                        var137 = 3;
                                                                                                    } else if (var136.method371(-127, class136.field2364)) {
                                                                                                        var137 = 4;
                                                                                                        var135 = var135.method397(64, class136.field2364.method396(1));
                                                                                                    } else if (!var136.method371(arg1 ^ -14303, class255.field4421)) {
                                                                                                        if (var136.method371(-128, class223.field3745)) {
                                                                                                            var137 = 6;
                                                                                                            var135 = var135.method397(64, class223.field3745.method396(1));
                                                                                                        } else if (!var136.method371(-123, class45.field825)) {
                                                                                                            if (var136.method371(-118, class8.field127)) {
                                                                                                                var135 = var135.method397(arg1 + -14181, class8.field127.method396(1));
                                                                                                                var137 = 8;
                                                                                                            } else if (var136.method371(-126, class125.field2204)) {
                                                                                                                var135 = var135.method397(64, class125.field2204.method396(arg1 ^ 14244));
                                                                                                                var137 = 9;
                                                                                                            } else if (!var136.method371(-118, class112.field1986)) {
                                                                                                                if (var136.method371(-119, class95.field1769)) {
                                                                                                                    var135 = var135.method397(arg1 ^ 14309, class95.field1769.method396(1));
                                                                                                                    var137 = 11;
                                                                                                                } else if (~class44.field804 != -1) {
                                                                                                                    if (!var136.method371(-119, class16.field368)) {
                                                                                                                        if (!var136.method371(arg1 ^ -14289, class68.field1288)) {
                                                                                                                            if (!var136.method371(arg1 ^ -14299, class70.field1350)) {
                                                                                                                                if (var136.method371(-120, class82.field1477)) {
                                                                                                                                    var135 = var135.method397(arg1 + -14181, class82.field1477.method396(1));
                                                                                                                                    var137 = 3;
                                                                                                                                } else if (!var136.method371(-124, class136.field2347)) {
                                                                                                                                    if (!var136.method371(-125, class255.field4425)) {
                                                                                                                                        if (!var136.method371(-120, class223.field3750)) {
                                                                                                                                            if (var136.method371(-121, class45.field829)) {
                                                                                                                                                var137 = 7;
                                                                                                                                                var135 = var135.method397(64, class45.field829.method396(arg1 ^ 14244));
                                                                                                                                            } else if (var136.method371(arg1 ^ -14292, class8.field118)) {
                                                                                                                                                var137 = 8;
                                                                                                                                                var135 = var135.method397(64, class8.field118.method396(1));
                                                                                                                                            } else if (var136.method371(arg1 + -14371, class125.field2192)) {
                                                                                                                                                var137 = 9;
                                                                                                                                                var135 = var135.method397(64, class125.field2192.method396(1));
                                                                                                                                            } else if (var136.method371(-122, class112.field1983)) {
                                                                                                                                                var137 = 10;
                                                                                                                                                var135 = var135.method397(64, class112.field1983.method396(1));
                                                                                                                                            } else if (var136.method371(arg1 ^ -14299, class95.field1775)) {
                                                                                                                                                var137 = 11;
                                                                                                                                                var135 = var135.method397(64, class95.field1775.method396(arg1 ^ 14244));
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            var137 = 6;
                                                                                                                                            var135 = var135.method397(64, class223.field3750.method396(arg1 ^ 14244));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var135 = var135.method397(arg1 + -14181, class255.field4425.method396(1));
                                                                                                                                        var137 = 5;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var135 = var135.method397(64, class136.field2347.method396(arg1 + -14244));
                                                                                                                                    var137 = 4;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var135 = var135.method397(64, class70.field1350.method396(1));
                                                                                                                                var137 = 2;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var137 = 1;
                                                                                                                            var135 = var135.method397(arg1 + -14181, class68.field1288.method396(1));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var135 = var135.method397(64, class16.field368.method396(arg1 + -14244));
                                                                                                                        var137 = 0;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                var137 = 10;
                                                                                                                var135 = var135.method397(arg1 + -14181, class112.field1986.method396(arg1 + -14244));
                                                                                                            }
                                                                                                        } else {
                                                                                                            var135 = var135.method397(64, class45.field825.method396(1));
                                                                                                            var137 = 7;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var137 = 5;
                                                                                                        var135 = var135.method397(64, class255.field4421.method396(arg1 ^ 14244));
                                                                                                    }
                                                                                                } else {
                                                                                                    var135 = var135.method397(64, class68.field1287.method396(1));
                                                                                                    var137 = 1;
                                                                                                }
                                                                                            } else {
                                                                                                var135 = var135.method397(64, class16.field371.method396(1));
                                                                                                var137 = 0;
                                                                                            }
                                                                                            class50 var139 = var135.method402(2023);
                                                                                            if (var139.method371(-128, class41.field760)) {
                                                                                                var138 = 1;
                                                                                                var135 = var135.method397(arg1 + -14181, class41.field760.method396(arg1 + -14244));
                                                                                            } else if (var139.method371(-127, class184.field3027)) {
                                                                                                var135 = var135.method397(64, class184.field3027.method396(1));
                                                                                                var138 = 2;
                                                                                            } else if (var139.method371(-124, class84.field1627)) {
                                                                                                var135 = var135.method397(64, class84.field1627.method396(1));
                                                                                                var138 = 3;
                                                                                            } else if (!var139.method371(-126, class205.field3408)) {
                                                                                                if (var139.method371(-124, class261.field4551)) {
                                                                                                    var135 = var135.method397(64, class261.field4551.method396(1));
                                                                                                    var138 = 5;
                                                                                                } else if (~class44.field804 != -1) {
                                                                                                    if (!var139.method371(-118, class41.field767)) {
                                                                                                        if (var139.method371(arg1 ^ -14298, class184.field3021)) {
                                                                                                            var135 = var135.method397(64, class184.field3021.method396(1));
                                                                                                            var138 = 2;
                                                                                                        } else if (!var139.method371(-123, class84.field1621)) {
                                                                                                            if (!var139.method371(-120, class205.field3401)) {
                                                                                                                if (var139.method371(-126, class261.field4548)) {
                                                                                                                    var135 = var135.method397(64, class261.field4548.method396(arg1 + -14244));
                                                                                                                    var138 = 5;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var135 = var135.method397(arg1 ^ 14309, class205.field3401.method396(1));
                                                                                                                var138 = 4;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var135 = var135.method397(64, class84.field1621.method396(1));
                                                                                                            var138 = 3;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var135 = var135.method397(arg1 ^ 14309, class41.field767.method396(1));
                                                                                                        var138 = 1;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var138 = 4;
                                                                                                var135 = var135.method397(arg1 + -14181, class205.field3408.method396(1));
                                                                                            }
                                                                                            class190.field3141.method1598((byte) -91, 246);
                                                                                            class190.field3141.method1471(0, (byte) 24);
                                                                                            int var140 = class190.field3141.field3581;
                                                                                            class190.field3141.method1471(var137, (byte) 24);
                                                                                            class190.field3141.method1471(var138, (byte) 24);
                                                                                            class189.method1273(false, class190.field3141, var135);
                                                                                            class190.field3141.method1458(-var140 + class190.field3141.field3581, arg1 + -14246);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5010) {
                                                                                            var7 -= 2;
                                                                                            class50 var141 = class211.field3511[var7 + 1];
                                                                                            class50 var142 = class211.field3511[var7];
                                                                                            if (~class18.field397 != -1 || ~class255.field4403 != -2 && class66.field1262 != 1) {
                                                                                                class190.field3141.method1598((byte) -87, 104);
                                                                                                class190.field3141.method1471(0, (byte) 24);
                                                                                                ++class115.field2015;
                                                                                                int var143 = class190.field3141.field3581;
                                                                                                class190.field3141.method1464(var142.method368((byte) -103), arg1 ^ 867345357);
                                                                                                class189.method1273(false, class190.field3141, var141);
                                                                                                class190.field3141.method1458(-var143 + class190.field3141.field3581, -1);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5010) {
                                                                                            --var6;
                                                                                            int var144 = class21.field450[var6];
                                                                                            class50 var145 = null;
                                                                                            if (~var144 > -101) {
                                                                                                var145 = class39.field720[var144];
                                                                                            }
                                                                                            if (var145 == null) {
                                                                                                var145 = class200.field3298;
                                                                                            }
                                                                                            class211.field3511[var7++] = var145;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5012) {
                                                                                            --var6;
                                                                                            int var146 = class21.field450[var6];
                                                                                            class50 var147 = null;
                                                                                            if (~var146 > -101) {
                                                                                                var147 = class188.field3105[var146];
                                                                                            }
                                                                                            if (var147 == null) {
                                                                                                var147 = class200.field3298;
                                                                                            }
                                                                                            class211.field3511[var7++] = var147;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5013) {
                                                                                            --var6;
                                                                                            int var148 = class21.field450[var6];
                                                                                            int var149 = -1;
                                                                                            if (~var148 > -101) {
                                                                                                var149 = class182.field2994[var148];
                                                                                            }
                                                                                            class21.field450[var6++] = var149;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5016) {
                                                                                            class50 var150;
                                                                                            if (class239.field4067 != null && class239.field4067.field3097 != null) {
                                                                                                var150 = class239.field4067.field3097;
                                                                                            } else {
                                                                                                var150 = class245.field4276;
                                                                                            }
                                                                                            class211.field3511[var7++] = var150;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5017) {
                                                                                            class21.field450[var6++] = class36.field704;
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5017) {
                                                                                            class21.field450[var6++] = class188.field3114;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5051) {
                                                                                            --var6;
                                                                                            int var151 = class21.field450[var6];
                                                                                            class211.field3511[var7++] = class199.method1331((byte) -108, var151).field3706;
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5051) {
                                                                                            --var6;
                                                                                            int var152 = class21.field450[var6];
                                                                                            class221 var153 = class199.method1331((byte) -128, var152);
                                                                                            if (var153.field3709 != null) {
                                                                                                class21.field450[var6++] = var153.field3709.length;
                                                                                            } else {
                                                                                                class21.field450[var6++] = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5052) {
                                                                                            var6 -= 2;
                                                                                            int var154 = class21.field450[var6 + 1];
                                                                                            int var155 = class21.field450[var6];
                                                                                            class221 var156 = class199.method1331((byte) -65, var155);
                                                                                            int var157 = var156.field3709[var154];
                                                                                            class21.field450[var6++] = var157;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5054) {
                                                                                            --var6;
                                                                                            int var158 = class21.field450[var6];
                                                                                            class221 var159 = class199.method1331((byte) -91, var158);
                                                                                            if (var159.field3711 == null) {
                                                                                                class21.field450[var6++] = 0;
                                                                                            } else {
                                                                                                class21.field450[var6++] = var159.field3711.length;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5055) {
                                                                                            var6 -= 2;
                                                                                            int var160 = class21.field450[var6 + 1];
                                                                                            int var161 = class21.field450[var6];
                                                                                            class21.field450[var6++] = class199.method1331((byte) -117, var161).field3711[var160];
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5055) {
                                                                                            --var6;
                                                                                            int var162 = class21.field450[var6];
                                                                                            class211.field3511[var7++] = class260.method1751(-81, var162).method1285(arg1 + -14123);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5057) {
                                                                                            --var6;
                                                                                            int var163 = class21.field450[var6];
                                                                                            class191 var164 = class260.method1751(-82, var163);
                                                                                            if (var164.field3166 == null) {
                                                                                                class21.field450[var6++] = 0;
                                                                                            } else {
                                                                                                class21.field450[var6++] = var164.field3166.length;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5058) {
                                                                                            var6 -= 2;
                                                                                            int var165 = class21.field450[var6];
                                                                                            int var166 = class21.field450[var6 + 1];
                                                                                            class21.field450[var6++] = class260.method1751(-71, var165).field3166[var166];
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5058) {
                                                                                            class146.field2531 = new class80();
                                                                                            --var6;
                                                                                            class146.field2531.field1463 = class21.field450[var6];
                                                                                            class146.field2531.field1465 = class260.method1751(-88, class146.field2531.field1463);
                                                                                            class146.field2531.field1459 = new int[class146.field2531.field1465.method1289((byte) -94)];
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5059) {
                                                                                            class190.field3141.method1598((byte) -97, 177);
                                                                                            ++class200.field3304;
                                                                                            class190.field3141.method1471(0, (byte) 24);
                                                                                            int var167 = class190.field3141.field3581;
                                                                                            class190.field3141.method1471(0, (byte) 24);
                                                                                            class190.field3141.method1494(class146.field2531.field1463, (byte) -33);
                                                                                            class146.field2531.field1465.method1298(class190.field3141, class146.field2531.field1459, 0);
                                                                                            class190.field3141.method1458(-var167 + class190.field3141.field3581, -1);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5061) {
                                                                                            ++class43.field783;
                                                                                            --var7;
                                                                                            class50 var168 = class211.field3511[var7];
                                                                                            class190.field3141.method1598((byte) -92, 109);
                                                                                            class190.field3141.method1471(0, (byte) 24);
                                                                                            int var169 = class190.field3141.field3581;
                                                                                            class190.field3141.method1464(var168.method368((byte) -103), arg1 + 867327171);
                                                                                            class190.field3141.method1494(class146.field2531.field1463, (byte) -89);
                                                                                            class146.field2531.field1465.method1298(class190.field3141, class146.field2531.field1459, 0);
                                                                                            class190.field3141.method1458(-var169 + class190.field3141.field3581, arg1 + -14246);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5062) {
                                                                                            ++class200.field3304;
                                                                                            class190.field3141.method1598((byte) -119, 177);
                                                                                            class190.field3141.method1471(0, (byte) 24);
                                                                                            int var170 = class190.field3141.field3581;
                                                                                            class190.field3141.method1471(1, (byte) 24);
                                                                                            class190.field3141.method1494(class146.field2531.field1463, (byte) -121);
                                                                                            class146.field2531.field1465.method1298(class190.field3141, class146.field2531.field1459, 0);
                                                                                            class190.field3141.method1458(class190.field3141.field3581 - var170, -1);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5062) {
                                                                                            var6 -= 2;
                                                                                            int var171 = class21.field450[var6];
                                                                                            int var172 = class21.field450[var6 - -1];
                                                                                            class21.field450[var6++] = class199.method1331((byte) -85, var171).field3713[var172];
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5064) {
                                                                                            var6 -= 2;
                                                                                            int var173 = class21.field450[var6];
                                                                                            int var174 = class21.field450[var6 + 1];
                                                                                            class21.field450[var6++] = class199.method1331((byte) -68, var173).field3712[var174];
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5065) {
                                                                                            var6 -= 2;
                                                                                            int var175 = class21.field450[var6 - -1];
                                                                                            int var176 = class21.field450[var6];
                                                                                            if (~var175 == 0) {
                                                                                                class21.field450[var6++] = -1;
                                                                                            } else {
                                                                                                class21.field450[var6++] = class199.method1331((byte) -70, var176).method1518(var175, (byte) -83);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5065) {
                                                                                            var6 -= 2;
                                                                                            int var177 = class21.field450[var6];
                                                                                            int var178 = class21.field450[var6 + 1];
                                                                                            if (var178 == -1) {
                                                                                                class21.field450[var6++] = -1;
                                                                                            } else {
                                                                                                class21.field450[var6++] = class199.method1331((byte) -123, var177).method1514(var178, -1921);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5067) {
                                                                                            --var6;
                                                                                            int var179 = class21.field450[var6];
                                                                                            class21.field450[var6++] = class260.method1751(-50, var179).method1289((byte) -128);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5067) {
                                                                                            var6 -= 2;
                                                                                            int var180 = class21.field450[var6];
                                                                                            int var181 = class21.field450[var6 + 1];
                                                                                            int var182 = class260.method1751(-81, var180).method1294(28400, var181);
                                                                                            class21.field450[var6++] = var182;
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5068) {
                                                                                            var6 -= 2;
                                                                                            int var183 = class21.field450[var6];
                                                                                            int var184 = class21.field450[var6 + 1];
                                                                                            class146.field2531.field1459[var183] = var184;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5070) {
                                                                                            var6 -= 2;
                                                                                            int var185 = class21.field450[var6];
                                                                                            int var186 = class21.field450[var6 + 1];
                                                                                            class146.field2531.field1459[var185] = var186;
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5070) {
                                                                                            var6 -= 3;
                                                                                            int var187 = class21.field450[var6 + 2];
                                                                                            int var188 = class21.field450[var6 + 1];
                                                                                            int var189 = class21.field450[var6];
                                                                                            class191 var190 = class260.method1751(arg1 ^ -14231, var189);
                                                                                            if (var190.method1294(28400, var188) != 0) {
                                                                                                throw new RuntimeException("bad command");
                                                                                            }
                                                                                            class21.field450[var6++] = var190.method1301(var187, true, var188);
                                                                                            continue;
                                                                                        }
                                                                                    } else if (var440 < 5200) {
                                                                                        if (var440 == 5100) {
                                                                                            if (class46.field846[86]) {
                                                                                                class21.field450[var6++] = 1;
                                                                                            } else {
                                                                                                class21.field450[var6++] = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5101) {
                                                                                            if (!class46.field846[82]) {
                                                                                                class21.field450[var6++] = 0;
                                                                                            } else {
                                                                                                class21.field450[var6++] = 1;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5102) {
                                                                                            if (!class46.field846[81]) {
                                                                                                class21.field450[var6++] = 0;
                                                                                            } else {
                                                                                                class21.field450[var6++] = 1;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                    } else if (var440 >= 5300) {
                                                                                        if (~var440 <= -5401) {
                                                                                            if (~var440 <= -5501) {
                                                                                                if (~var440 > -5601) {
                                                                                                    if (~var440 == -5501) {
                                                                                                        var6 -= 4;
                                                                                                        int var191 = class21.field450[var6];
                                                                                                        int var192 = class21.field450[var6 + 1];
                                                                                                        int var193 = class21.field450[var6 - -2];
                                                                                                        int var194 = class21.field450[var6 + 3];
                                                                                                        class142.method990((16383 & var191) + -class254.field4394, arg1 ^ -17940, ((268423467 & var191) >> 14) + -class61.field1124, var192, false, var193, var194);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var440 == 5501) {
                                                                                                        var6 -= 4;
                                                                                                        int var195 = class21.field450[var6 + 1];
                                                                                                        int var196 = class21.field450[var6];
                                                                                                        int var197 = class21.field450[var6 + 2];
                                                                                                        int var198 = class21.field450[var6 + 3];
                                                                                                        class215.method1430(64, (16383 & var196) + -class254.field4394, var197, var198, ((268419535 & var196) >> 14) + -class61.field1124, var195);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5503) {
                                                                                                        var6 -= 6;
                                                                                                        int var199 = class21.field450[var6];
                                                                                                        if (var199 >= 2) {
                                                                                                            throw new RuntimeException();
                                                                                                        }
                                                                                                        class14.field331 = var199;
                                                                                                        int var200 = class21.field450[var6 + 1];
                                                                                                        if (class123.field2166[class14.field331].length >> 1 <= var200 - -1) {
                                                                                                            throw new RuntimeException();
                                                                                                        }
                                                                                                        class87.field1684 = 0;
                                                                                                        class241.field4144 = var200;
                                                                                                        class191.field3176 = class21.field450[var6 - -2];
                                                                                                        class148.field2546 = class21.field450[var6 + 3];
                                                                                                        int var201 = class21.field450[var6 + 4];
                                                                                                        if (var201 >= 2) {
                                                                                                            throw new RuntimeException();
                                                                                                        }
                                                                                                        class172.field2880 = var201;
                                                                                                        int var202 = class21.field450[var6 - -5];
                                                                                                        if (~(class123.field2166[class172.field2880].length >> 1) >= ~(var202 + 1)) {
                                                                                                            throw new RuntimeException();
                                                                                                        }
                                                                                                        class228.field3835 = var202;
                                                                                                        class130.field2291 = 3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var440 == 5503) {
                                                                                                        class255.method1722(-128);
                                                                                                        continue;
                                                                                                    }
                                                                                                } else if (var440 >= 5700) {
                                                                                                    if (~var440 > -6101) {
                                                                                                        if (var440 == 6001) {
                                                                                                            --var6;
                                                                                                            int var203 = class21.field450[var6];
                                                                                                            if (~var203 > -2) {
                                                                                                                var203 = 1;
                                                                                                            }
                                                                                                            if (var203 > 4) {
                                                                                                                var203 = 4;
                                                                                                            }
                                                                                                            class99.field1828 = var203;
                                                                                                            if (~class99.field1828 == -2) {
                                                                                                                class13.method92(0.9F);
                                                                                                            }
                                                                                                            if (class99.field1828 == 2) {
                                                                                                                class13.method92(0.8F);
                                                                                                            }
                                                                                                            if (~class99.field1828 == -4) {
                                                                                                                class13.method92(0.7F);
                                                                                                            }
                                                                                                            if (class99.field1828 == 4) {
                                                                                                                class13.method92(0.6F);
                                                                                                            }
                                                                                                            class25.method240(4096);
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6002) {
                                                                                                            --var6;
                                                                                                            class2.method11(class21.field450[var6] == 1, (byte) -114);
                                                                                                            class178.method1220(-48);
                                                                                                            class191.method1290(28);
                                                                                                            if (class174.method1198(arg1 ^ 14245) && class193.field3211) {
                                                                                                                if (class115.field2016 == null) {
                                                                                                                    class115.field2016 = new byte[4][104][104];
                                                                                                                }
                                                                                                                byte var204 = (byte) (255 & class6.field79 + -4);
                                                                                                                for (int var205 = 0; var205 < 4; ++var205) {
                                                                                                                    for (int var206 = 0; ~var206 > -105; ++var206) {
                                                                                                                        for (int var207 = 0; ~var207 > -105; ++var207) {
                                                                                                                            class115.field2016[var205][var206][var207] = var204;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6004) {
                                                                                                            --var6;
                                                                                                            class193.field3211 = ~class21.field450[var6] == -2;
                                                                                                            if (class174.method1198(0) && class193.field3211) {
                                                                                                                byte var208 = (byte) (255 & class6.field79 - 4);
                                                                                                                if (class115.field2016 == null) {
                                                                                                                    class115.field2016 = new byte[4][104][104];
                                                                                                                }
                                                                                                                for (int var209 = 0; ~var209 > -5; ++var209) {
                                                                                                                    for (int var210 = 0; var210 < 104; ++var210) {
                                                                                                                        for (int var211 = 0; ~var211 > -105; ++var211) {
                                                                                                                            class115.field2016[var209][var210][var211] = var208;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            class196.method1321(class186.field3058, arg1 + -14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6005) {
                                                                                                            --var6;
                                                                                                            class172.field2878 = class21.field450[var6] == 1;
                                                                                                            class191.method1290(28);
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6006) {
                                                                                                            --var6;
                                                                                                            class21.field459 = ~class21.field450[var6] == -2;
                                                                                                            ((class220) class13.field309).method1507(4609, !class21.field459);
                                                                                                            class196.method1321(class186.field3058, arg1 ^ 14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6007) {
                                                                                                            --var6;
                                                                                                            class44.field808 = class21.field450[var6] == 1;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6009) {
                                                                                                            --var6;
                                                                                                            class56.field998 = ~class21.field450[var6] == -2;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6010) {
                                                                                                            --var6;
                                                                                                            class146.field2530 = ~class21.field450[var6] == -2;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6011) {
                                                                                                            --var6;
                                                                                                            class76.field1440 = ~class21.field450[var6] == -2;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6012) {
                                                                                                            --var6;
                                                                                                            int var212 = class21.field450[var6];
                                                                                                            if (~var212 > -1 || ~var212 < -3) {
                                                                                                                var212 = 0;
                                                                                                            }
                                                                                                            class83.field1556 = var212;
                                                                                                            class196.method1321(class186.field3058, arg1 + -14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6013) {
                                                                                                            --var6;
                                                                                                            client.field1525 = class21.field450[var6] == 1;
                                                                                                            if (~class99.field1828 == -2) {
                                                                                                                class13.method92(0.9F);
                                                                                                            }
                                                                                                            if (~class99.field1828 == -3) {
                                                                                                                class13.method92(0.8F);
                                                                                                            }
                                                                                                            if (class99.field1828 == 3) {
                                                                                                                class13.method92(0.7F);
                                                                                                            }
                                                                                                            if (~class99.field1828 == -5) {
                                                                                                                class13.method92(0.6F);
                                                                                                            }
                                                                                                            class191.method1290(28);
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6015) {
                                                                                                            --var6;
                                                                                                            class70.field1344 = ~class21.field450[var6] == -2;
                                                                                                            class196.method1321(class186.field3058, arg1 + -14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6015) {
                                                                                                            --var6;
                                                                                                            class126.field2210 = ~class21.field450[var6] == -2;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6017) {
                                                                                                            --var6;
                                                                                                            int var213 = class21.field450[var6];
                                                                                                            if (~var213 > -1 || var213 > 2) {
                                                                                                                var213 = 0;
                                                                                                            }
                                                                                                            class170.field2841 = var213;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6017) {
                                                                                                            --var6;
                                                                                                            class5.field68 = ~class21.field450[var6] == -2;
                                                                                                            class6.method42((byte) 120);
                                                                                                            class196.method1321(class186.field3058, arg1 + -14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6018) {
                                                                                                            --var6;
                                                                                                            int var214 = class21.field450[var6];
                                                                                                            if (var214 < 0) {
                                                                                                                var214 = 0;
                                                                                                            }
                                                                                                            if (~var214 < -128) {
                                                                                                                var214 = 127;
                                                                                                            }
                                                                                                            class196.field3249 = var214;
                                                                                                            class196.method1321(class186.field3058, 0);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6020) {
                                                                                                            --var6;
                                                                                                            int var215 = class21.field450[var6];
                                                                                                            if (var215 < 0) {
                                                                                                                var215 = 0;
                                                                                                            }
                                                                                                            if (~var215 < -256) {
                                                                                                                var215 = 255;
                                                                                                            }
                                                                                                            if (~class66.field1260 != ~var215) {
                                                                                                                if (class66.field1260 == 0 && class250.field4347 != -1) {
                                                                                                                    class248.method1689(0, (byte) -78, class56.field1014, class250.field4347, false, var215);
                                                                                                                    class91.field1718 = false;
                                                                                                                } else if (var215 != 0) {
                                                                                                                    class44.method341(var215, -1);
                                                                                                                } else {
                                                                                                                    class187.method1266(32);
                                                                                                                    class91.field1718 = false;
                                                                                                                }
                                                                                                                class66.field1260 = var215;
                                                                                                            }
                                                                                                            class196.method1321(class186.field3058, arg1 ^ 14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6020) {
                                                                                                            --var6;
                                                                                                            int var216 = class21.field450[var6];
                                                                                                            if (var216 < 0) {
                                                                                                                var216 = 0;
                                                                                                            }
                                                                                                            if (~var216 < -128) {
                                                                                                                var216 = 127;
                                                                                                            }
                                                                                                            class203.field3379 = var216;
                                                                                                            class196.method1321(class186.field3058, arg1 + -14245);
                                                                                                            class190.field3152 = false;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6021) {
                                                                                                            --var6;
                                                                                                            class194.field3216 = class21.field450[var6] == 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                    } else if (~var440 <= -6201) {
                                                                                                        if (~var440 <= -6301) {
                                                                                                            if (var440 < 6400) {
                                                                                                                if (~var440 == -6301) {
                                                                                                                    class21.field450[var6++] = (int) (class104.method785(arg1 + -14246) / 60000L);
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (var440 == 6301) {
                                                                                                                    class21.field450[var6++] = (int) (class104.method785(-1) / 86400000L) - 11745;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (var440 == 6302) {
                                                                                                                    var6 -= 3;
                                                                                                                    int var217 = class21.field450[var6 + 1];
                                                                                                                    int var218 = class21.field450[var6];
                                                                                                                    int var219 = class21.field450[var6 + 2];
                                                                                                                    class84.field1618.clear();
                                                                                                                    class84.field1618.set(11, 12);
                                                                                                                    class84.field1618.set(var219, var217, var218);
                                                                                                                    class21.field450[var6++] = (int) (class84.field1618.getTime().getTime() / 86400000L) - 11745;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6304) {
                                                                                                                    class84.field1618.clear();
                                                                                                                    class84.field1618.setTime(new Date(class104.method785(-1)));
                                                                                                                    class21.field450[var6++] = class84.field1618.get(1);
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6305) {
                                                                                                                    --var6;
                                                                                                                    int var220 = class21.field450[var6];
                                                                                                                    boolean var221 = true;
                                                                                                                    if (~var220 > -1) {
                                                                                                                        var221 = ~((var220 + 1) % 4) == -1;
                                                                                                                    } else if (var220 < 1582) {
                                                                                                                        var221 = var220 % 4 == 0;
                                                                                                                    } else if (var220 % 4 == 0) {
                                                                                                                        if (~(var220 % 100) != -1) {
                                                                                                                            var221 = true;
                                                                                                                        } else if (~(var220 % 400) != -1) {
                                                                                                                            var221 = false;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var221 = false;
                                                                                                                    }
                                                                                                                    class21.field450[var6++] = !var221 ? 0 : 1;
                                                                                                                    continue;
                                                                                                                }
                                                                                                            } else if (~var440 > -6501) {
                                                                                                                if (var440 == 6400) {
                                                                                                                    class21.field450[var6++] = class162.field2776 ? 1 : 0;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6402) {
                                                                                                                    --var7;
                                                                                                                    class50 var222 = class211.field3511[var7];
                                                                                                                    --var6;
                                                                                                                    int var223 = class21.field450[var6];
                                                                                                                    String var224;
                                                                                                                    try {
                                                                                                                        var224 = new String(var222.method404(8202), "ISO-8859-1");
                                                                                                                    } catch (UnsupportedEncodingException var438) {
                                                                                                                        var224 = new String(var222.method404(8202));
                                                                                                                    }
                                                                                                                    if (class162.field2776) {
                                                                                                                        if (class206.field3414 == null) {
                                                                                                                            class206.field3414 = new browsercontrol("about:blank");
                                                                                                                        }
                                                                                                                        class58.field1043 = var223;
                                                                                                                        class206.field3414.navigate(var224);
                                                                                                                        class27.field579 = true;
                                                                                                                    }
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6403) {
                                                                                                                    if (class206.field3414 != null) {
                                                                                                                        class206.field3414.navigate("about:blank");
                                                                                                                        class58.field1043 = 0;
                                                                                                                        class27.field579 = true;
                                                                                                                    }
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6404) {
                                                                                                                    class211.field3511[var7++] = class255.field4397;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6405) {
                                                                                                                    class211.field3511[var7++] = class163.field2785;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (var440 == 6405) {
                                                                                                                    class21.field450[var6++] = !class254.method1717((byte) -124) ? 0 : 1;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                if (~var440 == -6407) {
                                                                                                                    class21.field450[var6++] = class106.method795(class201.method1339(arg1, -14316)) ? 1 : 0;
                                                                                                                    continue;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (~var440 == -6201) {
                                                                                                                var6 -= 2;
                                                                                                                class210.field3493 = (short) class21.field450[var6];
                                                                                                                if (class210.field3493 <= 0) {
                                                                                                                    class210.field3493 = 256;
                                                                                                                }
                                                                                                                class71.field1371 = (short) class21.field450[var6 + 1];
                                                                                                                if (class71.field1371 <= 0) {
                                                                                                                    class71.field1371 = 205;
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (var440 == 6201) {
                                                                                                                var6 -= 2;
                                                                                                                class182.field2999 = (short) class21.field450[var6];
                                                                                                                if (class182.field2999 <= 0) {
                                                                                                                    class182.field2999 = 256;
                                                                                                                }
                                                                                                                class25.field539 = (short) class21.field450[var6 + 1];
                                                                                                                if (~class25.field539 >= -1) {
                                                                                                                    class25.field539 = 320;
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (var440 == 6202) {
                                                                                                                var6 -= 4;
                                                                                                                class196.field3248 = (short) class21.field450[var6];
                                                                                                                if (~class196.field3248 >= -1) {
                                                                                                                    class196.field3248 = 1;
                                                                                                                }
                                                                                                                class213.field3527 = (short) class21.field450[var6 + 1];
                                                                                                                if (~class213.field3527 >= -1) {
                                                                                                                    class213.field3527 = 32767;
                                                                                                                } else if (~class196.field3248 < ~class213.field3527) {
                                                                                                                    class213.field3527 = class196.field3248;
                                                                                                                }
                                                                                                                class70.field1331 = (short) class21.field450[var6 + 2];
                                                                                                                if (~class70.field1331 >= -1) {
                                                                                                                    class70.field1331 = 1;
                                                                                                                }
                                                                                                                class26.field552 = (short) class21.field450[var6 + 3];
                                                                                                                if (~class26.field552 < -1) {
                                                                                                                    if (class26.field552 < class70.field1331) {
                                                                                                                        class26.field552 = class70.field1331;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    class26.field552 = 32767;
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var440 == -6204) {
                                                                                                                class29.method257(0, class115.field2018.field242, false, class115.field2018.field243, arg1 ^ 14278, 0);
                                                                                                                class21.field450[var6++] = class200.field3292;
                                                                                                                class21.field450[var6++] = class101.field1858;
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var440 == -6205) {
                                                                                                                class21.field450[var6++] = class182.field2999;
                                                                                                                class21.field450[var6++] = class25.field539;
                                                                                                                continue;
                                                                                                            }
                                                                                                            if (~var440 == -6206) {
                                                                                                                class21.field450[var6++] = class210.field3493;
                                                                                                                class21.field450[var6++] = class71.field1371;
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (~var440 == -6102) {
                                                                                                            class21.field450[var6++] = class99.field1828;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6102) {
                                                                                                            class21.field450[var6++] = !class174.method1198(0) ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6103) {
                                                                                                            class21.field450[var6++] = !class193.field3211 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6106) {
                                                                                                            class21.field450[var6++] = !class172.field2878 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6106) {
                                                                                                            class21.field450[var6++] = !class21.field459 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6108) {
                                                                                                            class21.field450[var6++] = class44.field808 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6109) {
                                                                                                            class21.field450[var6++] = !class56.field998 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6109) {
                                                                                                            class21.field450[var6++] = class146.field2530 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6110) {
                                                                                                            class21.field450[var6++] = !class76.field1440 ? 0 : 1;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6112) {
                                                                                                            class21.field450[var6++] = class83.field1556;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6112) {
                                                                                                            class21.field450[var6++] = client.field1525 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6115) {
                                                                                                            class21.field450[var6++] = class70.field1344 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6116) {
                                                                                                            class21.field450[var6++] = class126.field2210 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6116) {
                                                                                                            class21.field450[var6++] = class170.field2841;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6117) {
                                                                                                            class21.field450[var6++] = class5.field68 ? 1 : 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6118) {
                                                                                                            class21.field450[var6++] = class196.field3249;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (~var440 == -6120) {
                                                                                                            class21.field450[var6++] = class66.field1260;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6120) {
                                                                                                            class21.field450[var6++] = class203.field3379;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (var440 == 6121) {
                                                                                                            class21.field450[var6++] = 0;
                                                                                                            continue;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (~var440 == -5601) {
                                                                                                        var7 -= 2;
                                                                                                        if (~class25.field537 == -11 && class178.field2970 == 0 && class167.field2834 == 0) {
                                                                                                            class50 var225 = class211.field3511[var7];
                                                                                                            class50 var226 = class211.field3511[var7 + 1];
                                                                                                            class213.method1416(var226, var225, true);
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5602) {
                                                                                                        class225.method1537((byte) -101);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5603) {
                                                                                                        if (class178.field2970 == 0) {
                                                                                                            class91.field1719 = -2;
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var440 == 5603) {
                                                                                                        var6 -= 4;
                                                                                                        if (~class25.field537 == -11 && ~class178.field2970 == -1 && class167.field2834 == 0) {
                                                                                                            class114.method824(class21.field450[var6 + 1], class21.field450[var6], class21.field450[var6 + 3], class21.field450[var6 + 2], -25652);
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5605) {
                                                                                                        --var7;
                                                                                                        if (~class25.field537 == -11 && class178.field2970 == 0 && class167.field2834 == 0) {
                                                                                                            class233.method1582(112, class211.field3511[var7].method368((byte) -103));
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5606) {
                                                                                                        var7 -= 2;
                                                                                                        var6 -= 4;
                                                                                                        if (class25.field537 == 10 && class178.field2970 == 0 && class167.field2834 == 0) {
                                                                                                            class35.method282(class21.field450[var6 + 1], class21.field450[var6 + 2], class211.field3511[var7].method368((byte) -103), class21.field450[var6], class21.field450[var6 + 3], (byte) 101, class211.field3511[var7 + 1]);
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5607) {
                                                                                                        if (~class167.field2834 == -1) {
                                                                                                            class233.field3915 = -2;
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5608) {
                                                                                                        class21.field450[var6++] = class91.field1719;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var440 == 5608) {
                                                                                                        class21.field450[var6++] = class65.field1231;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (var440 == 5609) {
                                                                                                        class21.field450[var6++] = class233.field3915;
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var440 == -5611) {
                                                                                                        for (int var227 = 0; var227 < 5; ++var227) {
                                                                                                            class211.field3511[var7++] = class91.field1722.length <= var227 ? class200.field3298 : class91.field1722[var227];
                                                                                                            class91.field1722[var227].method411(arg1 ^ 14245);
                                                                                                        }
                                                                                                        class91.field1722 = null;
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (~var440 == -5401) {
                                                                                                    ++class121.field2135;
                                                                                                    var7 -= 2;
                                                                                                    class50 var228 = class211.field3511[var7];
                                                                                                    --var6;
                                                                                                    int var229 = class21.field450[var6];
                                                                                                    class50 var230 = class211.field3511[var7 + 1];
                                                                                                    class190.field3141.method1598((byte) -127, 196);
                                                                                                    class190.field3141.method1471(1 + (class122.method886(var228, 50) - -class122.method886(var230, arg1 + -14195)), (byte) 24);
                                                                                                    class190.field3141.method1482(var228, -29586);
                                                                                                    class190.field3141.method1482(var230, arg1 ^ -17461);
                                                                                                    class190.field3141.method1471(var229, (byte) 24);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var440 == -5402) {
                                                                                                    var6 -= 2;
                                                                                                    class102.field1875[class21.field450[var6]] = (short) class121.method880(class21.field450[var6 + 1], (byte) -127);
                                                                                                    class223.method1531(-20184);
                                                                                                    class25.method240(4096);
                                                                                                    class245.method1672((byte) -49);
                                                                                                    class56.method438((byte) -66);
                                                                                                    class15.method110(53);
                                                                                                    continue;
                                                                                                }
                                                                                                if (var440 == 5405) {
                                                                                                    var6 -= 2;
                                                                                                    int var231 = class21.field450[var6];
                                                                                                    int var232 = class21.field450[var6 + 1];
                                                                                                    if (var231 >= 0 && ~var231 > -3) {
                                                                                                        class123.field2166[var231] = new int[var232 << 1][4];
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var440 == 5406) {
                                                                                                    var6 -= 7;
                                                                                                    int var233 = class21.field450[var6];
                                                                                                    int var234 = class21.field450[var6 - -1] << 1;
                                                                                                    int var235 = class21.field450[var6 + 2];
                                                                                                    int var236 = class21.field450[var6 - -3];
                                                                                                    int var237 = class21.field450[var6 - -6];
                                                                                                    int var238 = class21.field450[var6 + 4];
                                                                                                    int var239 = class21.field450[var6 + 5];
                                                                                                    if (var233 >= 0 && ~var233 > -3 && class123.field2166[var233] != null && ~var234 <= -1 && class123.field2166[var233].length > var234) {
                                                                                                        class123.field2166[var233][var234] = new int[] { 128 * class51.method413(var235 >> 14, 16383), var236, class51.method413(16383, var235) * 128, var237 };
                                                                                                        class123.field2166[var233][var234 + 1] = new int[] { (class51.method413(var238, 268435279) >> 14) * 128, var239, class51.method413(var238, 16383) * 128 };
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var440 == -5408) {
                                                                                                    --var6;
                                                                                                    int var240 = class123.field2166[class21.field450[var6]].length >> 1;
                                                                                                    class21.field450[var6++] = var240;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var440 == -5409) {
                                                                                                    class21.field450[var6++] = 0;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var440 == -5410) {
                                                                                                    class2.method6((byte) -113);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var440 == -5412) {
                                                                                                    if (class251.field4357 != null) {
                                                                                                        System.exit(0);
                                                                                                    } else {
                                                                                                        class215.method1426(false, class41.method313(arg1 + -14246), (byte) 96);
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var440 == 5419) {
                                                                                                    class50 var241 = class200.field3298;
                                                                                                    if (class6.field71 != null) {
                                                                                                        var241 = class233.method1587(class6.field71.field128, (byte) 95);
                                                                                                        try {
                                                                                                            if (class6.field71.field132 != null) {
                                                                                                                byte[] var242 = ((String) class6.field71.field132).getBytes("ISO-8859-1");
                                                                                                                var241 = class2.method7(0, var242.length, -15075, var242);
                                                                                                            }
                                                                                                        } catch (UnsupportedEncodingException var437) {
                                                                                                        }
                                                                                                    }
                                                                                                    class211.field3511[var7++] = var241;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var440 == -5421) {
                                                                                                    class21.field450[var6++] = ~class36.field686 == -3 ? 1 : 0;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var440 == 5421) {
                                                                                                    --var7;
                                                                                                    class50 var243 = class211.field3511[var7];
                                                                                                    --var6;
                                                                                                    boolean var244 = ~class21.field450[var6] == -2;
                                                                                                    class215.method1426(var244, class80.method589(new class50[] { class41.method313(arg1 ^ -14246), var243 }, 28743), (byte) 76);
                                                                                                    continue;
                                                                                                }
                                                                                            }
                                                                                        } else if (var440 == 5304) {
                                                                                            class21.field450[var6++] = 0;
                                                                                            continue;
                                                                                        }
                                                                                    } else {
                                                                                        if (~var440 == -5201) {
                                                                                            --var6;
                                                                                            class33.method274(class21.field450[var6], 122);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5202) {
                                                                                            class21.field450[var6++] = class219.method1500(arg1 + -14136);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5202) {
                                                                                            --var6;
                                                                                            class66.method509(50, class21.field450[var6]);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5203) {
                                                                                            --var7;
                                                                                            class191.method1286((byte) 38, class211.field3511[var7]);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var440 == -5205) {
                                                                                            class211.field3511[var7 - 1] = class179.method1222(class211.field3511[var7 - 1], (byte) -125);
                                                                                            continue;
                                                                                        }
                                                                                        if (var440 == 5205) {
                                                                                            --var7;
                                                                                            class44.method336(class211.field3511[var7], true);
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else if (~var440 == -4501) {
                                                                                    var6 -= 2;
                                                                                    int var245 = class21.field450[var6];
                                                                                    int var246 = class21.field450[var6 + 1];
                                                                                    class193 var247 = class120.method870(var246, (byte) -121);
                                                                                    if (var247.method1307(1427)) {
                                                                                        class211.field3511[var7++] = class142.method995(var245, 2).method890(0, var246, var247.field3198);
                                                                                    } else {
                                                                                        class21.field450[var6++] = class142.method995(var245, 2).method892(var247.field3206, var246, -2);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                            } else if (~var440 == -4401) {
                                                                                var6 -= 2;
                                                                                int var248 = class21.field450[var6];
                                                                                int var249 = class21.field450[var6 - -1];
                                                                                class193 var250 = class120.method870(var249, (byte) -114);
                                                                                if (!var250.method1307(1427)) {
                                                                                    class21.field450[var6++] = class53.method426((byte) -90, var248).method1649(var250.field3206, var249, true);
                                                                                } else {
                                                                                    class211.field3511[var7++] = class53.method426((byte) -90, var248).method1662(var250.field3198, class201.method1339(arg1, -14246), var249);
                                                                                }
                                                                                continue;
                                                                            }
                                                                        } else {
                                                                            if (~var440 == -4201) {
                                                                                --var6;
                                                                                int var251 = class21.field450[var6];
                                                                                class211.field3511[var7++] = class15.method111(var251, false).field4103;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4202) {
                                                                                var6 -= 2;
                                                                                int var252 = class21.field450[var6 + 1];
                                                                                int var253 = class21.field450[var6];
                                                                                class239 var254 = class15.method111(var253, false);
                                                                                if (var252 >= 1 && ~var252 >= -6 && var254.field4079[var252 - 1] != null) {
                                                                                    class211.field3511[var7++] = var254.field4079[var252 + -1];
                                                                                    continue;
                                                                                }
                                                                                class211.field3511[var7++] = class200.field3298;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4203) {
                                                                                var6 -= 2;
                                                                                int var255 = class21.field450[var6 + 1];
                                                                                int var256 = class21.field450[var6];
                                                                                class239 var257 = class15.method111(var256, false);
                                                                                if (~var255 <= -2 && ~var255 >= -6 && var257.field4063[var255 + -1] != null) {
                                                                                    class211.field3511[var7++] = var257.field4063[var255 + -1];
                                                                                    continue;
                                                                                }
                                                                                class211.field3511[var7++] = class200.field3298;
                                                                                continue;
                                                                            }
                                                                            if (var440 == 4203) {
                                                                                --var6;
                                                                                int var258 = class21.field450[var6];
                                                                                class21.field450[var6++] = class15.method111(var258, false).field4093;
                                                                                continue;
                                                                            }
                                                                            if (var440 == 4204) {
                                                                                --var6;
                                                                                int var259 = class21.field450[var6];
                                                                                class21.field450[var6++] = class15.method111(var259, false).field4117 != 1 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (var440 == 4205) {
                                                                                --var6;
                                                                                int var260 = class21.field450[var6];
                                                                                class239 var261 = class15.method111(var260, false);
                                                                                if (var261.field4058 == -1 && var261.field4047 >= 0) {
                                                                                    class21.field450[var6++] = var261.field4047;
                                                                                    continue;
                                                                                }
                                                                                class21.field450[var6++] = var260;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4207) {
                                                                                --var6;
                                                                                int var262 = class21.field450[var6];
                                                                                class239 var263 = class15.method111(var262, false);
                                                                                if (~var263.field4058 <= -1 && var263.field4047 >= 0) {
                                                                                    class21.field450[var6++] = var263.field4047;
                                                                                    continue;
                                                                                }
                                                                                class21.field450[var6++] = var262;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4208) {
                                                                                --var6;
                                                                                int var264 = class21.field450[var6];
                                                                                class21.field450[var6++] = !class15.method111(var264, false).field4077 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4209) {
                                                                                var6 -= 2;
                                                                                int var265 = class21.field450[var6 + 1];
                                                                                int var266 = class21.field450[var6];
                                                                                class193 var267 = class120.method870(var265, (byte) -112);
                                                                                if (var267.method1307(1427)) {
                                                                                    class211.field3511[var7++] = class15.method111(var266, false).method1620(var265, var267.field3198, 0);
                                                                                } else {
                                                                                    class21.field450[var6++] = class15.method111(var266, false).method1632(var267.field3206, var265, -5998);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var440 == 4210) {
                                                                                --var7;
                                                                                class50 var268 = class211.field3511[var7];
                                                                                --var6;
                                                                                int var269 = class21.field450[var6];
                                                                                class51.method419(~var269 == -2, -117, var268);
                                                                                class21.field450[var6++] = class252.field4380;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4212) {
                                                                                if (class64.field1227 != null && class137.field2378 < class252.field4380) {
                                                                                    class21.field450[var6++] = class51.method413(65535, class64.field1227[class137.field2378++]);
                                                                                    continue;
                                                                                }
                                                                                class21.field450[var6++] = -1;
                                                                                continue;
                                                                            }
                                                                            if (~var440 == -4213) {
                                                                                class137.field2378 = 0;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (~var440 == -4101) {
                                                                            --var7;
                                                                            class50 var270 = class211.field3511[var7];
                                                                            --var6;
                                                                            int var271 = class21.field450[var6];
                                                                            class211.field3511[var7++] = class80.method589(new class50[] { var270, class78.method579(var271, -26225) }, 28743);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4102) {
                                                                            var7 -= 2;
                                                                            class50 var272 = class211.field3511[var7 + 1];
                                                                            class50 var273 = class211.field3511[var7];
                                                                            class211.field3511[var7++] = class80.method589(new class50[] { var273, var272 }, 28743);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4103) {
                                                                            --var7;
                                                                            class50 var274 = class211.field3511[var7];
                                                                            --var6;
                                                                            int var275 = class21.field450[var6];
                                                                            class211.field3511[var7++] = class80.method589(new class50[] { var274, class223.method1527(-113, true, var275) }, class201.method1339(arg1, 18402));
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4103) {
                                                                            --var7;
                                                                            class50 var276 = class211.field3511[var7];
                                                                            class211.field3511[var7++] = var276.method402(2023);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4104) {
                                                                            --var6;
                                                                            int var277 = class21.field450[var6];
                                                                            long var278 = (long) var277 * 86400000L + 1014768000000L;
                                                                            class84.field1618.setTime(new Date(var278));
                                                                            int var280 = class84.field1618.get(5);
                                                                            int var281 = class84.field1618.get(2);
                                                                            int var282 = class84.field1618.get(1);
                                                                            class211.field3511[var7++] = class80.method589(new class50[] { class78.method579(var280, -26225), class256.field4455, class172.field2869[var281], class256.field4455, class78.method579(var282, -26225) }, 28743);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4105) {
                                                                            var7 -= 2;
                                                                            class50 var283 = class211.field3511[var7];
                                                                            class50 var284 = class211.field3511[var7 - -1];
                                                                            if (class239.field4067.field3092 != null && class239.field4067.field3092.field697) {
                                                                                class211.field3511[var7++] = var284;
                                                                                continue;
                                                                            }
                                                                            class211.field3511[var7++] = var283;
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4106) {
                                                                            --var6;
                                                                            int var285 = class21.field450[var6];
                                                                            class211.field3511[var7++] = class78.method579(var285, -26225);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4107) {
                                                                            var7 -= 2;
                                                                            class21.field450[var6++] = class211.field3511[var7].method398(5502, class211.field3511[var7 - -1]);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4108) {
                                                                            var6 -= 2;
                                                                            int var286 = class21.field450[var6];
                                                                            int var287 = class21.field450[var6 + 1];
                                                                            --var7;
                                                                            class50 var288 = class211.field3511[var7];
                                                                            byte[] var289 = class87.field1675.method190((byte) -42, 0, var287);
                                                                            class38 var290 = new class38(var289);
                                                                            var290.method1064(class256.field4432, (int[]) null);
                                                                            class21.field450[var6++] = var290.method1069(var288, var286);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4110) {
                                                                            var6 -= 2;
                                                                            --var7;
                                                                            class50 var291 = class211.field3511[var7];
                                                                            int var292 = class21.field450[var6 + 1];
                                                                            int var293 = class21.field450[var6];
                                                                            byte[] var294 = class87.field1675.method190((byte) -99, 0, var292);
                                                                            class38 var295 = new class38(var294);
                                                                            var295.method1064(class256.field4432, (int[]) null);
                                                                            class21.field450[var6++] = var295.method1060(var291, var293);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4110) {
                                                                            var7 -= 2;
                                                                            class50 var296 = class211.field3511[var7];
                                                                            class50 var297 = class211.field3511[var7 + 1];
                                                                            --var6;
                                                                            if (~class21.field450[var6] != -2) {
                                                                                class211.field3511[var7++] = var297;
                                                                            } else {
                                                                                class211.field3511[var7++] = var296;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4112) {
                                                                            --var7;
                                                                            class50 var298 = class211.field3511[var7];
                                                                            class211.field3511[var7++] = class152.method1057(var298);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4113) {
                                                                            --var7;
                                                                            class50 var299 = class211.field3511[var7];
                                                                            --var6;
                                                                            int var300 = class21.field450[var6];
                                                                            if (~var300 == 0) {
                                                                                throw new RuntimeException("null char");
                                                                            }
                                                                            class211.field3511[var7++] = var299.method408((byte) 125, var300);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4114) {
                                                                            --var6;
                                                                            int var301 = class21.field450[var6];
                                                                            class21.field450[var6++] = !class95.method718(var301, 89) ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4114) {
                                                                            --var6;
                                                                            int var302 = class21.field450[var6];
                                                                            class21.field450[var6++] = !class172.method1189(var302, -97) ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4115) {
                                                                            --var6;
                                                                            int var303 = class21.field450[var6];
                                                                            class21.field450[var6++] = class159.method1123(111, var303) ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4116) {
                                                                            --var6;
                                                                            int var304 = class21.field450[var6];
                                                                            class21.field450[var6++] = class87.method695(var304, -14718) ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4117) {
                                                                            --var7;
                                                                            class50 var305 = class211.field3511[var7];
                                                                            if (var305 == null) {
                                                                                class21.field450[var6++] = 0;
                                                                            } else {
                                                                                class21.field450[var6++] = var305.method396(1);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4118) {
                                                                            --var7;
                                                                            class50 var306 = class211.field3511[var7];
                                                                            var6 -= 2;
                                                                            int var307 = class21.field450[var6];
                                                                            int var308 = class21.field450[var6 + 1];
                                                                            class211.field3511[var7++] = var306.method363(var307, var308, 0);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4119) {
                                                                            --var7;
                                                                            class50 var309 = class211.field3511[var7];
                                                                            class50 var310 = class203.method1374((byte) 123, var309.method396(arg1 + -14244));
                                                                            boolean var311 = false;
                                                                            for (int var312 = 0; var312 < var309.method396(1); ++var312) {
                                                                                int var313 = var309.method393(var312, (byte) 127);
                                                                                if (var313 == 60) {
                                                                                    var311 = true;
                                                                                } else if (~var313 == -63) {
                                                                                    var311 = false;
                                                                                } else if (!var311) {
                                                                                    var310.method364(var313, -88);
                                                                                }
                                                                            }
                                                                            var310.method409(arg1 + -14246);
                                                                            class211.field3511[var7++] = var310;
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4121) {
                                                                            var6 -= 2;
                                                                            --var7;
                                                                            class50 var314 = class211.field3511[var7];
                                                                            int var315 = class21.field450[var6];
                                                                            int var316 = class21.field450[var6 + 1];
                                                                            class21.field450[var6++] = var314.method365(127, var315, var316);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4122) {
                                                                            var7 -= 2;
                                                                            class50 var317 = class211.field3511[var7];
                                                                            class50 var318 = class211.field3511[var7 + 1];
                                                                            --var6;
                                                                            int var319 = class21.field450[var6];
                                                                            class21.field450[var6++] = var317.method395(false, var318, var319);
                                                                            continue;
                                                                        }
                                                                        if (~var440 == -4123) {
                                                                            --var6;
                                                                            int var320 = class21.field450[var6];
                                                                            class21.field450[var6++] = class112.method816(var320, (byte) 85);
                                                                            continue;
                                                                        }
                                                                        if (var440 == 4123) {
                                                                            --var6;
                                                                            int var321 = class21.field450[var6];
                                                                            class21.field450[var6++] = class251.method1702(var321, (byte) 70);
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var440 == -4001) {
                                                                        var6 -= 2;
                                                                        int var322 = class21.field450[var6 + 1];
                                                                        int var323 = class21.field450[var6];
                                                                        class21.field450[var6++] = var323 - -var322;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4002) {
                                                                        var6 -= 2;
                                                                        int var324 = class21.field450[var6];
                                                                        int var325 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = -var325 + var324;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4002) {
                                                                        var6 -= 2;
                                                                        int var326 = class21.field450[var6];
                                                                        int var327 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = var326 * var327;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4003) {
                                                                        var6 -= 2;
                                                                        int var328 = class21.field450[var6 + 1];
                                                                        int var329 = class21.field450[var6];
                                                                        class21.field450[var6++] = var329 / var328;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4005) {
                                                                        --var6;
                                                                        int var330 = class21.field450[var6];
                                                                        class21.field450[var6++] = (int) (Math.random() * (double) var330);
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4006) {
                                                                        --var6;
                                                                        int var331 = class21.field450[var6];
                                                                        class21.field450[var6++] = (int) ((double) (var331 + 1) * Math.random());
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4006) {
                                                                        var6 -= 5;
                                                                        int var332 = class21.field450[var6];
                                                                        int var333 = class21.field450[var6 - -1];
                                                                        int var334 = class21.field450[var6 + 3];
                                                                        int var335 = class21.field450[var6 + 4];
                                                                        int var336 = class21.field450[var6 + 2];
                                                                        class21.field450[var6++] = (var333 - var332) * (-var336 + var335) / (var334 - var336) + var332;
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4007) {
                                                                        var6 -= 2;
                                                                        long var337 = (long) class21.field450[var6];
                                                                        long var339 = (long) class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = (int) (var337 - -(var337 * var339 / 100L));
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4008) {
                                                                        var6 -= 2;
                                                                        int var341 = class21.field450[var6];
                                                                        int var342 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = class29.method261(var341, 1 << var342);
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4009) {
                                                                        var6 -= 2;
                                                                        int var343 = class21.field450[var6];
                                                                        int var344 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = class51.method413(var343, -(1 << var344) + -1);
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4010) {
                                                                        var6 -= 2;
                                                                        int var345 = class21.field450[var6];
                                                                        int var346 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = class51.method413(1 << var346, var345) != 0 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4012) {
                                                                        var6 -= 2;
                                                                        int var347 = class21.field450[var6 + 1];
                                                                        int var348 = class21.field450[var6];
                                                                        class21.field450[var6++] = var348 % var347;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4013) {
                                                                        var6 -= 2;
                                                                        int var349 = class21.field450[var6];
                                                                        int var350 = class21.field450[var6 + 1];
                                                                        if (~var349 != -1) {
                                                                            class21.field450[var6++] = (int) Math.pow((double) var349, (double) var350);
                                                                        } else {
                                                                            class21.field450[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4014) {
                                                                        var6 -= 2;
                                                                        int var351 = class21.field450[var6];
                                                                        int var352 = class21.field450[var6 + 1];
                                                                        if (var351 != 0) {
                                                                            if (var352 != 0) {
                                                                                class21.field450[var6++] = (int) Math.pow((double) var351, 1.0D / (double) var352);
                                                                            } else {
                                                                                class21.field450[var6++] = Integer.MAX_VALUE;
                                                                            }
                                                                        } else {
                                                                            class21.field450[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4014) {
                                                                        var6 -= 2;
                                                                        int var353 = class21.field450[var6 + 1];
                                                                        int var354 = class21.field450[var6];
                                                                        class21.field450[var6++] = class51.method413(var353, var354);
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4015) {
                                                                        var6 -= 2;
                                                                        int var355 = class21.field450[var6];
                                                                        int var356 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = class29.method261(var355, var356);
                                                                        continue;
                                                                    }
                                                                    if (var440 == 4016) {
                                                                        var6 -= 2;
                                                                        int var357 = class21.field450[var6];
                                                                        int var358 = class21.field450[var6 + 1];
                                                                        class21.field450[var6++] = ~var357 > ~var358 ? var357 : var358;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4018) {
                                                                        var6 -= 2;
                                                                        int var359 = class21.field450[var6];
                                                                        int var360 = class21.field450[var6 - -1];
                                                                        class21.field450[var6++] = ~var360 <= ~var359 ? var360 : var359;
                                                                        continue;
                                                                    }
                                                                    if (~var440 == -4019) {
                                                                        var6 -= 3;
                                                                        long var361 = (long) class21.field450[var6];
                                                                        long var363 = (long) class21.field450[var6 + 1];
                                                                        long var365 = (long) class21.field450[var6 - -2];
                                                                        class21.field450[var6++] = (int) (var361 * var365 / var363);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (var440 == 3600) {
                                                                    if (~class178.field2974 == -1) {
                                                                        class21.field450[var6++] = -2;
                                                                    } else if (~class178.field2974 == -2) {
                                                                        class21.field450[var6++] = -1;
                                                                    } else {
                                                                        class21.field450[var6++] = class227.field3830;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var440 == 3601) {
                                                                    --var6;
                                                                    int var367 = class21.field450[var6];
                                                                    if (class178.field2974 == 2 && ~class227.field3830 < ~var367) {
                                                                        class211.field3511[var7++] = field3452[var367];
                                                                        continue;
                                                                    }
                                                                    class211.field3511[var7++] = class200.field3298;
                                                                    continue;
                                                                }
                                                                if (var440 == 3602) {
                                                                    --var6;
                                                                    int var368 = class21.field450[var6];
                                                                    if (class178.field2974 == 2 && ~class227.field3830 < ~var368) {
                                                                        class21.field450[var6++] = class141.field2477[var368];
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (var440 == 3603) {
                                                                    --var6;
                                                                    int var369 = class21.field450[var6];
                                                                    if (class178.field2974 == 2 && var369 < class227.field3830) {
                                                                        class21.field450[var6++] = class216.field3567[var369];
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3605) {
                                                                    --var7;
                                                                    class50 var370 = class211.field3511[var7];
                                                                    --var6;
                                                                    int var371 = class21.field450[var6];
                                                                    class70.method531(var370, var371, arg1 ^ 14135);
                                                                    continue;
                                                                }
                                                                if (var440 == 3605) {
                                                                    --var7;
                                                                    class50 var372 = class211.field3511[var7];
                                                                    class10.method59(var372.method368((byte) -103), 0);
                                                                    continue;
                                                                }
                                                                if (var440 == 3606) {
                                                                    --var7;
                                                                    class50 var373 = class211.field3511[var7];
                                                                    class68.method526(false, var373.method368((byte) -103));
                                                                    continue;
                                                                }
                                                                if (var440 == 3607) {
                                                                    --var7;
                                                                    class50 var374 = class211.field3511[var7];
                                                                    class188.method1269(arg1 + -27266, var374.method368((byte) -103));
                                                                    continue;
                                                                }
                                                                if (~var440 == -3609) {
                                                                    --var7;
                                                                    class50 var375 = class211.field3511[var7];
                                                                    class114.method821(6554, var375.method368((byte) -103));
                                                                    continue;
                                                                }
                                                                if (var440 == 3609) {
                                                                    --var7;
                                                                    class50 var376 = class211.field3511[var7];
                                                                    if (var376.method371(-121, class178.field2969) || var376.method371(-122, class153.field2677)) {
                                                                        var376 = var376.method397(64, 7);
                                                                    }
                                                                    class21.field450[var6++] = !class74.method556(var376, 114) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var440 == 3610) {
                                                                    --var6;
                                                                    int var377 = class21.field450[var6];
                                                                    if (~class178.field2974 == -3 && var377 < class227.field3830) {
                                                                        class211.field3511[var7++] = class224.field3764[var377];
                                                                        continue;
                                                                    }
                                                                    class211.field3511[var7++] = class200.field3298;
                                                                    continue;
                                                                }
                                                                if (var440 == 3611) {
                                                                    if (class261.field4545 != null) {
                                                                        class211.field3511[var7++] = class261.field4545.method375(true);
                                                                    } else {
                                                                        class211.field3511[var7++] = class200.field3298;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var440 == 3612) {
                                                                    if (class261.field4545 == null) {
                                                                        class21.field450[var6++] = 0;
                                                                    } else {
                                                                        class21.field450[var6++] = class82.field1482;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var440 == 3613) {
                                                                    --var6;
                                                                    int var378 = class21.field450[var6];
                                                                    if (class261.field4545 != null && ~var378 > ~class82.field1482) {
                                                                        class211.field3511[var7++] = class140.field2442[var378].field1265.method375(true);
                                                                        continue;
                                                                    }
                                                                    class211.field3511[var7++] = class200.field3298;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3615) {
                                                                    --var6;
                                                                    int var379 = class21.field450[var6];
                                                                    if (class261.field4545 != null && ~class82.field1482 < ~var379) {
                                                                        class21.field450[var6++] = class140.field2442[var379].field1258;
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (var440 == 3615) {
                                                                    --var6;
                                                                    int var380 = class21.field450[var6];
                                                                    if (class261.field4545 != null && ~class82.field1482 < ~var380) {
                                                                        class21.field450[var6++] = class140.field2442[var380].field1268;
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3617) {
                                                                    class21.field450[var6++] = class95.field1774;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3618) {
                                                                    --var7;
                                                                    class50 var381 = class211.field3511[var7];
                                                                    class43.method318((byte) -31, var381);
                                                                    continue;
                                                                }
                                                                if (var440 == 3618) {
                                                                    class21.field450[var6++] = class114.field1995;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3620) {
                                                                    --var7;
                                                                    class50 var382 = class211.field3511[var7];
                                                                    class31.method264((byte) -100, var382.method368((byte) -103));
                                                                    continue;
                                                                }
                                                                if (~var440 == -3621) {
                                                                    class197.method1327(arg1 ^ -30424);
                                                                    continue;
                                                                }
                                                                if (var440 == 3621) {
                                                                    if (class178.field2974 != 0) {
                                                                        class21.field450[var6++] = class73.field1379;
                                                                    } else {
                                                                        class21.field450[var6++] = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var440 == 3622) {
                                                                    --var6;
                                                                    int var383 = class21.field450[var6];
                                                                    if (~class178.field2974 != -1 && class73.field1379 > var383) {
                                                                        class211.field3511[var7++] = class223.method1533((byte) -30, class227.field3823[var383]).method375(true);
                                                                        continue;
                                                                    }
                                                                    class211.field3511[var7++] = class200.field3298;
                                                                    continue;
                                                                }
                                                                if (var440 == 3623) {
                                                                    --var7;
                                                                    class50 var384 = class211.field3511[var7];
                                                                    if (var384.method371(arg1 ^ -14299, class178.field2969) || var384.method371(-120, class153.field2677)) {
                                                                        var384 = var384.method397(arg1 ^ 14309, 7);
                                                                    }
                                                                    class21.field450[var6++] = !class6.method41((byte) -117, var384) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var440 == 3624) {
                                                                    --var6;
                                                                    int var385 = class21.field450[var6];
                                                                    if (class140.field2442 != null && ~var385 > ~class82.field1482 && class140.field2442[var385].field1265.method387(class239.field4067.field3097, true)) {
                                                                        class21.field450[var6++] = 1;
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (var440 == 3625) {
                                                                    if (class219.field3662 == null) {
                                                                        class211.field3511[var7++] = class200.field3298;
                                                                    } else {
                                                                        class211.field3511[var7++] = class219.field3662.method375(true);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var440 == -3627) {
                                                                    --var6;
                                                                    int var386 = class21.field450[var6];
                                                                    if (class261.field4545 != null && var386 < class82.field1482) {
                                                                        class211.field3511[var7++] = class140.field2442[var386].field1267;
                                                                        continue;
                                                                    }
                                                                    class211.field3511[var7++] = class200.field3298;
                                                                    continue;
                                                                }
                                                                if (~var440 == -3628) {
                                                                    --var6;
                                                                    int var387 = class21.field450[var6];
                                                                    if (class178.field2974 == 2 && var387 >= 0 && class227.field3830 > var387) {
                                                                        class21.field450[var6++] = !class196.field3251[var387] ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    class21.field450[var6++] = 0;
                                                                    continue;
                                                                }
                                                                if (var440 == 3628) {
                                                                    --var7;
                                                                    class50 var388 = class211.field3511[var7];
                                                                    if (var388.method371(arg1 ^ -14302, class178.field2969) || var388.method371(-118, class153.field2677)) {
                                                                        var388 = var388.method397(64, 7);
                                                                    }
                                                                    class21.field450[var6++] = class243.method1654((byte) 71, var388);
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (~var440 == -3201) {
                                                                var6 -= 3;
                                                                class244.method1667(class21.field450[var6 + 2], class21.field450[var6 + 1], (byte) -126, class21.field450[var6]);
                                                                continue;
                                                            }
                                                            if (var440 == 3201) {
                                                                --var6;
                                                                class139.method970(class21.field450[var6], (byte) 40);
                                                                continue;
                                                            }
                                                            if (~var440 == -3203) {
                                                                var6 -= 2;
                                                                class239.method1626(class21.field450[var6], class21.field450[var6 - -1], arg1 + -14121);
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (var440 == 3100) {
                                                            --var7;
                                                            class50 var389 = class211.field3511[var7];
                                                            class54.method431(var389, 0, arg1 ^ 14245, class200.field3298);
                                                            continue;
                                                        }
                                                        if (~var440 == -3102) {
                                                            var6 -= 2;
                                                            class84.method643(class239.field4067, class21.field450[var6 + 1], class21.field450[var6], true);
                                                            continue;
                                                        }
                                                        if (~var440 == -3104) {
                                                            class116.method837(true);
                                                            continue;
                                                        }
                                                        if (~var440 == -3105) {
                                                            ++class246.field4283;
                                                            --var7;
                                                            class50 var390 = class211.field3511[var7];
                                                            int var391 = 0;
                                                            if (var390.method406((byte) -77)) {
                                                                var391 = var390.method384(10);
                                                            }
                                                            class190.field3141.method1598((byte) -121, 30);
                                                            class190.field3141.method1446(-9, var391);
                                                            continue;
                                                        }
                                                        if (var440 == 3105) {
                                                            --var7;
                                                            class50 var392 = class211.field3511[var7];
                                                            ++class59.field1073;
                                                            class190.field3141.method1598((byte) -100, 248);
                                                            class190.field3141.method1464(var392.method368((byte) -103), arg1 ^ 867345357);
                                                            continue;
                                                        }
                                                        if (var440 == 3106) {
                                                            ++class103.field1889;
                                                            --var7;
                                                            class50 var393 = class211.field3511[var7];
                                                            class190.field3141.method1598((byte) -118, 137);
                                                            class190.field3141.method1471(var393.method396(arg1 + -14244) + 1, (byte) 24);
                                                            class190.field3141.method1482(var393, -29586);
                                                            continue;
                                                        }
                                                        if (var440 == 3107) {
                                                            --var6;
                                                            int var394 = class21.field450[var6];
                                                            --var7;
                                                            class50 var395 = class211.field3511[var7];
                                                            class260.method1752(var394, var395, (byte) -33);
                                                            continue;
                                                        }
                                                        if (~var440 == -3109) {
                                                            var6 -= 3;
                                                            int var396 = class21.field450[var6];
                                                            int var397 = class21.field450[var6 - -1];
                                                            int var398 = class21.field450[var6 + 2];
                                                            class10 var399 = class89.method698(var398, (byte) 94);
                                                            class54.method433(var397, var399, var396, 16244);
                                                            continue;
                                                        }
                                                        if (~var440 == -3110) {
                                                            var6 -= 2;
                                                            int var400 = class21.field450[var6];
                                                            class10 var401 = var46 ? class104.field1897 : class53.field957;
                                                            int var402 = class21.field450[var6 + 1];
                                                            class54.method433(var402, var401, var400, 16244);
                                                            continue;
                                                        }
                                                        if (var440 == 3110) {
                                                            ++class189.field3129;
                                                            --var6;
                                                            int var403 = class21.field450[var6];
                                                            class190.field3141.method1598((byte) -124, 50);
                                                            class190.field3141.method1494(var403, (byte) -43);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    --var6;
                                                    class10 var404 = class89.method698(class21.field450[var6], (byte) 94);
                                                    if (~var440 == -2801) {
                                                        class21.field450[var6++] = class164.method1145((byte) 50, client.method605(var404));
                                                        continue;
                                                    }
                                                    if (~var440 == -2802) {
                                                        --var6;
                                                        int var405 = class21.field450[var6];
                                                        int var441 = var405 - 1;
                                                        if (var404.field199 != null && ~var441 > ~var404.field199.length && var404.field199[var441] != null) {
                                                            class211.field3511[var7++] = var404.field199[var441];
                                                            continue;
                                                        }
                                                        class211.field3511[var7++] = class200.field3298;
                                                        continue;
                                                    }
                                                    if (~var440 == -2803) {
                                                        if (var404.field181 != null) {
                                                            class211.field3511[var7++] = var404.field181;
                                                        } else {
                                                            class211.field3511[var7++] = class200.field3298;
                                                        }
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (~var440 == -2701) {
                                                    --var6;
                                                    class10 var406 = class89.method698(class21.field450[var6], (byte) 94);
                                                    class21.field450[var6++] = var406.field300;
                                                    continue;
                                                }
                                                if (var440 == 2701) {
                                                    --var6;
                                                    class10 var407 = class89.method698(class21.field450[var6], (byte) 94);
                                                    if (var407.field300 != -1) {
                                                        class21.field450[var6++] = var407.field205;
                                                    } else {
                                                        class21.field450[var6++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (~var440 == -2703) {
                                                    --var6;
                                                    int var408 = class21.field450[var6];
                                                    class87 var409 = (class87) class132.field2304.method443((long) var408, (byte) -99);
                                                    if (var409 == null) {
                                                        class21.field450[var6++] = 0;
                                                    } else {
                                                        class21.field450[var6++] = 1;
                                                    }
                                                    continue;
                                                }
                                                if (var440 == 2703) {
                                                    --var6;
                                                    class10 var410 = class89.method698(class21.field450[var6], (byte) 94);
                                                    if (var410.field297 == null) {
                                                        class21.field450[var6++] = 0;
                                                        continue;
                                                    }
                                                    int var411 = var410.field297.length;
                                                    for (int var412 = 0; var410.field297.length > var412; ++var412) {
                                                        if (var410.field297[var412] == null) {
                                                            var411 = var412;
                                                            break;
                                                        }
                                                    }
                                                    class21.field450[var6++] = var411;
                                                    continue;
                                                }
                                                if (~var440 == -2705 || var440 == 2705) {
                                                    var6 -= 2;
                                                    int var413 = class21.field450[var6 - -1];
                                                    int var414 = class21.field450[var6];
                                                    class87 var415 = (class87) class132.field2304.method443((long) var414, (byte) -84);
                                                    if (var415 != null && var415.field1678 == var413) {
                                                        class21.field450[var6++] = 1;
                                                    } else {
                                                        class21.field450[var6++] = 0;
                                                    }
                                                    continue;
                                                }
                                            }
                                        } else {
                                            --var6;
                                            class10 var416 = class89.method698(class21.field450[var6], (byte) 94);
                                            if (~var440 == -2501) {
                                                class21.field450[var6++] = var416.field272;
                                                continue;
                                            }
                                            if (var440 == 2501) {
                                                class21.field450[var6++] = var416.field241;
                                                continue;
                                            }
                                            if (var440 == 2502) {
                                                class21.field450[var6++] = var416.field243;
                                                continue;
                                            }
                                            if (var440 == 2503) {
                                                class21.field450[var6++] = var416.field242;
                                                continue;
                                            }
                                            if (var440 == 2504) {
                                                class21.field450[var6++] = !var416.field268 ? 0 : 1;
                                                continue;
                                            }
                                            if (~var440 == -2506) {
                                                class21.field450[var6++] = var416.field149;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class10 var417 = var46 ? class104.field1897 : class53.field957;
                                        if (~var440 == -1801) {
                                            class21.field450[var6++] = class164.method1145((byte) 27, client.method605(var417));
                                            continue;
                                        }
                                        if (var440 == 1801) {
                                            --var6;
                                            int var418 = class21.field450[var6];
                                            int var442 = var418 - 1;
                                            if (var417.field199 != null && var442 < var417.field199.length && var417.field199[var442] != null) {
                                                class211.field3511[var7++] = var417.field199[var442];
                                                continue;
                                            }
                                            class211.field3511[var7++] = class200.field3298;
                                            continue;
                                        }
                                        if (~var440 == -1803) {
                                            if (var417.field181 != null) {
                                                class211.field3511[var7++] = var417.field181;
                                            } else {
                                                class211.field3511[var7++] = class200.field3298;
                                            }
                                            continue;
                                        }
                                    }
                                } else {
                                    class10 var419 = var46 ? class104.field1897 : class53.field957;
                                    if (~var440 == -1701) {
                                        class21.field450[var6++] = var419.field300;
                                        continue;
                                    }
                                    if (var440 == 1701) {
                                        if (~var419.field300 != 0) {
                                            class21.field450[var6++] = var419.field205;
                                        } else {
                                            class21.field450[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var440 == 1702) {
                                        class21.field450[var6++] = var419.field216;
                                        continue;
                                    }
                                }
                            } else {
                                class10 var420 = var46 ? class104.field1897 : class53.field957;
                                if (~var440 == -1601) {
                                    class21.field450[var6++] = var420.field156;
                                    continue;
                                }
                                if (var440 == 1601) {
                                    class21.field450[var6++] = var420.field239;
                                    continue;
                                }
                                if (~var440 == -1603) {
                                    class211.field3511[var7++] = var420.field137;
                                    continue;
                                }
                                if (~var440 == -1604) {
                                    class21.field450[var6++] = var420.field138;
                                    continue;
                                }
                                if (~var440 == -1605) {
                                    class21.field450[var6++] = var420.field292;
                                    continue;
                                }
                                if (~var440 == -1606) {
                                    class21.field450[var6++] = var420.field218;
                                    continue;
                                }
                                if (~var440 == -1607) {
                                    class21.field450[var6++] = var420.field183;
                                    continue;
                                }
                                if (var440 == 1607) {
                                    class21.field450[var6++] = var420.field172;
                                    continue;
                                }
                                if (var440 == 1608) {
                                    class21.field450[var6++] = var420.field276;
                                    continue;
                                }
                                if (~var440 == -1610) {
                                    class21.field450[var6++] = var420.field252;
                                    continue;
                                }
                            }
                        }
                    } else {
                        class10 var62;
                        if (var440 < 2000) {
                            var62 = var46 ? class104.field1897 : class53.field957;
                        } else {
                            --var6;
                            var62 = class89.method698(class21.field450[var6], (byte) 94);
                            var440 -= 1000;
                        }
                        if (var440 == 1000) {
                            var6 -= 4;
                            var62.field282 = class21.field450[var6];
                            var62.field260 = class21.field450[var6 - -1];
                            int var63 = class21.field450[var6 + 3];
                            if (var63 >= 0) {
                                if (var63 > 5) {
                                    var63 = 5;
                                }
                            } else {
                                var63 = 0;
                            }
                            int var64 = class21.field450[var6 + 2];
                            if (~var64 <= -1) {
                                if (~var64 < -6) {
                                    var64 = 5;
                                }
                            } else {
                                var64 = 0;
                            }
                            var62.field182 = (byte) var64;
                            var62.field278 = (byte) var63;
                            class140.method979((byte) 123, var62);
                            class28.method253((byte) 119, var62);
                            continue;
                        }
                        if (var440 == 1001) {
                            var6 -= 4;
                            var62.field229 = class21.field450[var6];
                            var62.field178 = class21.field450[var6 + 1];
                            var62.field290 = 0;
                            var62.field174 = 0;
                            int var65 = class21.field450[var6 + 3];
                            if (~var65 > -1) {
                                var65 = 0;
                            } else if (var65 > 4) {
                                var65 = 4;
                            }
                            int var66 = class21.field450[var6 + 2];
                            var62.field157 = (byte) var65;
                            if (var66 >= 0) {
                                if (var66 > 4) {
                                    var66 = 4;
                                }
                            } else {
                                var66 = 0;
                            }
                            var62.field265 = (byte) var66;
                            class140.method979((byte) 19, var62);
                            if (~var62.field227 == -1) {
                                class254.method1716(827759824, false, var62);
                            }
                            class28.method253((byte) 118, var62);
                            continue;
                        }
                        if (~var440 == -1004) {
                            --var6;
                            boolean var67 = ~class21.field450[var6] == -2;
                            if (!var67 == var62.field268) {
                                var62.field268 = var67;
                                class140.method979((byte) 117, var62);
                            }
                            continue;
                        }
                        if (~var440 == -1005) {
                            var6 -= 2;
                            var62.field139 = class21.field450[var6];
                            var62.field251 = class21.field450[var6 + 1];
                            class140.method979((byte) 42, var62);
                            if (~var62.field227 == -1) {
                                class254.method1716(827759824, false, var62);
                            }
                            class28.method253((byte) 122, var62);
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var439) {
                if (var5.field624 != null) {
                    class50 var434 = class203.method1374((byte) 79, 30);
                    var434.method381((byte) -84, class241.field4145).method381((byte) -90, var5.field624);
                    for (int var435 = class221.field3727 + -1; var435 >= 0; --var435) {
                        var434.method381((byte) -46, class74.field1399).method381((byte) -63, class129.field2257[var435].field3418.field624);
                    }
                    if (~var11 == -41) {
                        int var436 = var10[var8];
                        var434.method381((byte) -78, class148.field2550).method381((byte) -50, class78.method579(var436, -26225));
                    }
                    if (class40.field737 != 0) {
                        class54.method431(class80.method589(new class50[] { class32.field641, var5.field624 }, 28743), 0, 0, class200.field3298);
                    }
                    class121.method883("CS2 - scr:" + var5.field635 + " op:" + var11 + new String(var434.method404(8202)), (byte) -72, var439);
                } else {
                    if (class40.field737 != 0) {
                        class54.method431(class249.field4326, 0, 0, class200.field3298);
                    }
                    class121.method883("CS2 - scr:" + var5.field635 + " op:" + var11, (byte) -86, var439);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field3463;
        if (arg1 != -27746) {
            this.method39(true, 3, (class217) null);
        }
        int[] var3 = super.field2941.method1427(arg1 + 6465, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, arg0, 16745);
            for (int var5 = 0; ~class211.field3514 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field3457 >> 12) + this.field3454;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public static void method1398(int arg0) {
        field3456 = null;
        field3449 = null;
        field3459 = null;
        field3452 = null;
        field3453 = null;
        field3455 = null;
        field3461 = null;
        field3450 = null;
        if (arg0 >= 47) {
            field3458 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field3464;
        int[][] var3 = super.field2920.method117(arg0, (byte) -125);
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, arg0, (byte) -121);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class211.field3514; ++var11) {
                var9[var11] = (var5[var11] * this.field3457 >> 12) + this.field3454;
                var7[var11] = (var8[var11] * this.field3457 >> 12) + this.field3454;
                var10[var11] = (var6[var11] * this.field3457 >> 12) + this.field3454;
            }
        }
        return arg1 != -20740 ? null : var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3448;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field2925 = ~arg2.method1487(255) == -2;
                }
            } else {
                this.field3451 = arg2.method1441(83);
            }
        } else {
            this.field3454 = arg2.method1441(-119);
        }
        if (!arg0) {
            field3449 = null;
        }
    }
}
