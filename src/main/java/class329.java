import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class329 {

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "Lrb;")
    private class197 field4561;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Lcl;")
    private class145 field4551;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lbg;")
    private class272 field4558;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lkn;")
    public static class442 field4564 = new class442("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "S")
    public static short field4567 = 256;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "[[Z")
    public static boolean[][] field4566 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Lkh;")
    private class11 field4565;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "[I")
    public static int[] field4569;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "[Lne;")
    private class173[] field4563;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lnq;I)V")
    public static final void method2118(class268 arg0, int arg1) {
        field4560++;
        class19.field341 = arg0;
        if (arg1 != -175) {
            field4567 = -3;
        }
        class214.field2976 = class19.field341.method1739(71, 16);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZBLr;Lr;I)Lne;")
    private final class173 method2119(boolean arg0, byte arg1, class99 arg2, class99 arg3, int arg4) {
        field4552++;
        if (this.field4565 == null) {
            throw new RuntimeException();
        }
        this.field4565.field191 = arg4 * 8 + 5;
        if (this.field4565.field191 >= this.field4565.field230.length) {
            throw new RuntimeException();
        } else if (this.field4563[arg4] == null) {
            int var6 = this.field4565.method185(25239);
            int var7 = this.field4565.method185(25239);
            class173 var8 = new class173(arg4, arg3, arg2, this.field4561, this.field4551, var6, var7, arg0);
            if (arg1 == 45) {
                this.field4563[arg4] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field4563[arg4];
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z")
    public final boolean method2120(int arg0) {
        field4557++;
        if (this.field4565 != null) {
            return true;
        }
        if (arg0 >= -57) {
            this.method2119(true, (byte) -113, (class99) null, (class99) null, -57);
        }
        if (this.field4558 == null) {
            if (this.field4561.method1276((byte) -28)) {
                return false;
            }
            this.field4558 = this.field4561.method1271(255, true, -115, (byte) 0, 255);
        }
        if (this.field4558.field2254) {
            return false;
        } else {
            this.field4565 = new class11(this.field4558.method1075(-7537));
            this.field4563 = new class173[(this.field4565.field230.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method2121(String arg0, byte arg1, char arg2) {
        field4553++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 != 85) {
            return -107;
        }
        while (var4 > var5) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;BILr;)Lne;")
    public final class173 method2122(class99 arg0, byte arg1, int arg2, class99 arg3) {
        if (arg1 < 117) {
            method2125(58, 79);
        }
        field4562++;
        return this.method2119(true, (byte) 45, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILuo;Z[[I)V")
    public static final void method2123(boolean arg0, int arg1, class345 arg2, boolean arg3, int[][] arg4) {
        if (!arg0) {
            return;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            int[][] var6;
            if (arg4 == null) {
                var6 = null;
            } else {
                var6 = new int[class211.field2954 + 1][class290.field4061 + 1];
                for (int var7 = 0; var7 <= class290.field4061; var7++) {
                    for (int var11 = 0; var11 <= class211.field2954; var11++) {
                        var6[var11][var7] = class57.field783[var5][var11][var7] - arg4[var11][var7];
                    }
                }
            }
            int var8 = 0;
            int var9 = 0;
            if (!arg3) {
                if (class171.field2346) {
                    var9 |= 0x8;
                }
                if (class312.field4271) {
                    var8 |= 0x2;
                }
                if (class327.field4508 != 0) {
                    if (var5 == 0 || class445.field6242 >= 96) {
                        var9 |= 0x10;
                    }
                    var8 |= 0x1;
                }
            }
            if (class312.field4271) {
                var9 |= 0x7;
            }
            class242 var10 = arg2.method88(class211.field2954, class290.field4061, class57.field783[var5], var6, 128, var8, var9);
            class28.method303(var5, var10);
        }
        field4559++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public final void method2124(int arg0) {
        field4555++;
        if (this.field4563 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4563.length; var2++) {
            if (this.field4563[var2] != null) {
                this.field4563[var2].method1131((byte) 118);
            }
        }
        for (int var3 = arg0; var3 < this.field4563.length; var3++) {
            if (this.field4563[var3] != null) {
                this.field4563[var3].method1134(250);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)I")
    public static final int method2125(int arg0, int arg1) {
        field4554++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= arg0) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
    public static final boolean method2126(int arg0) throws IOException {
        field4556++;
        if (class156.field2207 == null) {
            return false;
        }
        int var1 = class156.field2207.method2213(arg0 ^ 0xFFFFFF8F);
        if (var1 == 0) {
            return false;
        }
        if (class304.field4190 == -1) {
            class156.field2207.method2209(1, class333.field4591.field230, 0, 1509);
            class333.field4591.field191 = 0;
            class304.field4190 = class333.field4591.method1189(9775);
            var1--;
            class15.field290 = class229.field3327[class304.field4190];
        }
        if (class15.field290 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class156.field2207.method2209(1, class333.field4591.field230, 0, 1509);
            class15.field290 = class333.field4591.field230[0] & 0xFF;
            var1--;
        }
        if (class15.field290 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class156.field2207.method2209(2, class333.field4591.field230, 0, 1509);
            class333.field4591.field191 = 0;
            class15.field290 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
            var1 -= 2;
        }
        if (class15.field290 > var1) {
            return false;
        }
        class333.field4591.field191 = 0;
        class156.field2207.method2209(class15.field290, class333.field4591.field230, 0, 1509);
        class50.field698 = class206.field2833;
        class263.field3677 = 0;
        class206.field2833 = class181.field2490;
        class181.field2490 = class304.field4190;
        if (class304.field4190 == 44) {
            int var2 = class333.field4591.method188(-128);
            int var3 = class333.field4591.method174(255);
            int var4 = class333.field4591.method185(25239);
            if (class401.method2519(1, var2)) {
                class1.method1(false, var4, var3);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 210) {
            int var5 = class333.field4591.method205(-957401312);
            int var6 = class333.field4591.method174(arg0 + 256);
            String var7 = class333.field4591.method171(-9265);
            if (class401.method2519(1, var6)) {
                class30.method313(var5, -29133, var7);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 237) {
            class197.field2709 = class333.field4591.method172((byte) 52);
            for (int var8 = 0; var8 < class197.field2709; var8++) {
                class249.field3517[var8] = class333.field4591.method171(class108.method765(arg0, 9264));
                class303.field4182[var8] = class333.field4591.method171(-9265);
                if (class303.field4182[var8].equals("")) {
                    class303.field4182[var8] = class249.field3517[var8];
                }
                class245.field3464[var8] = class333.field4591.method171(arg0 - 9264);
                class69.field1017[var8] = class333.field4591.method171(-9265);
                if (class69.field1017[var8].equals("")) {
                    class69.field1017[var8] = class245.field3464[var8];
                }
                class187.field2528[var8] = false;
            }
            class159.field2236 = class367.field5186;
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 49) {
            int var9 = class333.field4591.method202(7);
            int var10 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
            int var11 = class333.field4591.method188(-128);
            if (class401.method2519(1, var10)) {
                class125.method849((byte) 57, var11, var9);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 18) {
            int var12 = class333.field4591.method174(255);
            int var13 = class333.field4591.method172((byte) 52);
            boolean var14 = (var13 & 0x1) == 1;
            while (class15.field290 > class333.field4591.field191) {
                int var15 = class333.field4591.method175(255);
                int var16 = class333.field4591.method174(255);
                int var17 = 0;
                if (var16 != 0) {
                    var17 = class333.field4591.method172((byte) 52);
                    if (var17 == 255) {
                        var17 = class333.field4591.method185(25239);
                    }
                }
                class56.method458(var15, var14, var17, var12, (byte) 115, var16 - 1);
            }
            class440.field6196[class387.method2454(class454.field6490++, 31)] = var12;
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 25) {
            int var18 = class333.field4591.method188(-128);
            int var19 = class333.field4591.method205(-957401312);
            int var20 = class333.field4591.method158(true);
            int var21 = class333.field4591.method166(false);
            int var22 = class333.field4591.method188(-128);
            if (class401.method2519(1, var21)) {
                class17.method244(-49, var18, var19, var20, var22);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 92) {
            int var23 = class333.field4591.method185(25239);
            int var24 = class333.field4591.method174(255);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class333.field4591.method174(255);
            int var26 = class333.field4591.method202(86);
            if (class401.method2519(1, var25)) {
                class75.method555(var23, var24, 126, var26);
                class360 var27 = class51.method433((byte) 87, var24);
                class17.method244(arg0 ^ 0x73, var27.field4960, var26, var27.field4956, var27.field4967);
                class151.method1024(arg0 + 1, var27.field4932, var26, var27.field4940, var27.field4919);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 15) {
            boolean var28 = class333.field4591.method172((byte) 52) == 1;
            String var29 = class333.field4591.method171(-9265);
            String var30 = var29;
            if (var28) {
                var30 = class333.field4591.method171(-9265);
            }
            long var31 = (long) class333.field4591.method174(255);
            long var33 = (long) class333.field4591.method208(27308);
            int var35 = class333.field4591.method172((byte) 52);
            long var36 = (var31 << 32) + var33;
            boolean var38 = false;
            int var39 = 0;
            while (true) {
                if (var39 >= 100) {
                    if (var35 <= 1) {
                        if (!(!class387.field5561 || class74.field1068) || class292.field4086) {
                            var38 = true;
                        } else if (class273.method1784(var30, ~arg0)) {
                            var38 = true;
                        }
                    }
                    break;
                }
                if (class316.field4313[var39] == var36) {
                    var38 = true;
                    break;
                }
                var39++;
            }
            if (!var38 && class389.field5591 == 0) {
                class316.field4313[class260.field3642] = var36;
                class260.field3642 = (class260.field3642 + 1) % 100;
                String var40 = class128.method875(-1, class181.method1179(class357.method2294(class333.field4591, arg0 + 17), (byte) 111));
                if (var35 == 2) {
                    class384.method2437(var40, 1, "<img=1>" + var29, -1, (String) null, 7, 0, "<img=1>" + var30);
                } else if (var35 == 1) {
                    class384.method2437(var40, 1, "<img=0>" + var29, -1, (String) null, 7, 0, "<img=0>" + var30);
                } else {
                    class384.method2437(var40, arg0 ^ 0xFFFFFFFE, var29, -1, (String) null, 3, 0, var30);
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 239) {
            class53.field743 = class333.field4591.method172((byte) 52);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 47) {
            boolean var41 = class333.field4591.method172((byte) 52) == 1;
            String var42 = class333.field4591.method171(-9265);
            String var43 = class333.field4591.method171(arg0 - 9264);
            int var44 = class333.field4591.method174(255);
            int var45 = class333.field4591.method172((byte) 52);
            String var46 = "";
            boolean var47 = false;
            if (var44 > 0) {
                var46 = class333.field4591.method171(-9265);
                var47 = class333.field4591.method172((byte) 52) == 1;
            }
            for (int var48 = 0; var48 < class272.field3777; var48++) {
                if (var41) {
                    if (var43.equals(class288.field4045[var48])) {
                        class288.field4045[var48] = var42;
                        var42 = null;
                        class22.field398[var48] = var43;
                        break;
                    }
                } else if (var42.equals(class288.field4045[var48])) {
                    if (class218.field3018[var48] != var44) {
                        class218.field3018[var48] = var44;
                        if (var44 > 0) {
                            class41.method378(0, "", 5, "", var42 + class79.field1121.method2763(-94, class210.field2935), (byte) -28);
                        }
                        if (var44 == 0) {
                            class41.method378(0, "", 5, "", var42 + class255.field3587.method2763(arg0 + 52, class210.field2935), (byte) -33);
                        }
                    }
                    class22.field398[var48] = var43;
                    class73.field1044[var48] = var46;
                    class184.field2513[var48] = var45;
                    var42 = null;
                    class66.field990[var48] = var47;
                    break;
                }
            }
            if (var42 != null && class272.field3777 < 200) {
                class288.field4045[class272.field3777] = var42;
                class22.field398[class272.field3777] = var43;
                class218.field3018[class272.field3777] = var44;
                class73.field1044[class272.field3777] = var46;
                class184.field2513[class272.field3777] = var45;
                class66.field990[class272.field3777] = var47;
                class272.field3777++;
            }
            class159.field2236 = class367.field5186;
            boolean var49 = false;
            int var50 = class272.field3777;
            while (var50 > 0) {
                boolean var51 = true;
                var50--;
                for (int var52 = 0; var52 < var50; var52++) {
                    if (class218.field3018[var52] != class277.field3883 && class218.field3018[var52 + 1] == class277.field3883 || class218.field3018[var52] == 0 && class218.field3018[var52 + 1] != 0) {
                        int var53 = class218.field3018[var52];
                        class218.field3018[var52] = class218.field3018[var52 + 1];
                        class218.field3018[var52 + 1] = var53;
                        String var54 = class73.field1044[var52];
                        class73.field1044[var52] = class73.field1044[var52 + 1];
                        class73.field1044[var52 + 1] = var54;
                        String var55 = class288.field4045[var52];
                        class288.field4045[var52] = class288.field4045[var52 + 1];
                        class288.field4045[var52 + 1] = var55;
                        String var56 = class22.field398[var52];
                        class22.field398[var52] = class22.field398[var52 + 1];
                        class22.field398[var52 + 1] = var56;
                        int var57 = class184.field2513[var52];
                        class184.field2513[var52] = class184.field2513[var52 + 1];
                        class184.field2513[var52 + 1] = var57;
                        boolean var58 = class66.field990[var52];
                        class66.field990[var52] = class66.field990[var52 + 1];
                        var51 = false;
                        class66.field990[var52 + 1] = var58;
                    }
                }
                if (var51) {
                    break;
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 60) {
            class381.method2427(-31499);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 145) {
            int var59 = class333.field4591.method172((byte) 52);
            if (class333.field4591.method172((byte) 52) == 0) {
                class352.field4818[var59] = new class148();
            } else {
                class333.field4591.field191--;
                class352.field4818[var59] = new class148(class333.field4591);
            }
            class304.field4190 = -1;
            class303.field4189 = class367.field5186;
            return true;
        } else if (class304.field4190 == 0) {
            class328.field4538 = class333.field4591.method172((byte) 52);
            class304.field4190 = -1;
            class274.field3822 = class367.field5186;
            return true;
        } else if (class304.field4190 == 207) {
            int var60 = class333.field4591.method185(25239);
            int var61 = class333.field4591.method188(-128);
            if (var61 == 65535) {
                var61 = -1;
            }
            int var62 = class333.field4591.method158(true);
            if (class401.method2519(1, var62)) {
                class40.method374(var61, (byte) -31, var60);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 16) {
            int var63 = class333.field4591.method158(true);
            if (var63 == 65535) {
                var63 = -1;
            }
            int var64 = class333.field4591.method158(true);
            int var65 = class333.field4591.method174(255);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class333.field4591.method166(false);
            int var67 = class333.field4591.method202(arg0 + 61);
            if (class401.method2519(1, var64)) {
                for (int var68 = var63; var68 <= var65; var68++) {
                    long var69 = ((long) var67 << 32) + (long) var68;
                    class139 var71 = (class139) class389.field5584.method886(var69, 25651);
                    class139 var72;
                    if (var71 != null) {
                        var72 = new class139(var71.field1985, var66);
                        var71.method2467((byte) 99);
                    } else if (var68 == -1) {
                        var72 = new class139(class442.method2767(var67, -1229996208).field6351.field1985, var66);
                    } else {
                        var72 = new class139(0, var66);
                    }
                    class389.field5584.method883((byte) -54, var69, var72);
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 37) {
            int var73 = class333.field4591.method205(-957401312);
            int var74 = class333.field4591.method188(-128);
            int var75 = class333.field4591.method188(-128);
            if (class401.method2519(1, var74)) {
                class405.method2544(var73, 12, var75);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 6) {
            int var76 = class333.field4591.method174(255);
            String var77 = class333.field4591.method171(-9265);
            int var78 = class333.field4591.method174(arg0 + 256);
            if (class401.method2519(1, var78)) {
                class90.method629(arg0 ^ 0xFFFFFFA8, var77, var76);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 53) {
            int var79 = class333.field4591.method174(255);
            int var80 = class333.field4591.method206(87);
            class120.method821(arg0 + 76, var79, var80);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 155) {
            int var81 = class333.field4591.method185(25239);
            class406.field5772 = class241.field3426.method1913(var81, -72);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 184) {
            int var82 = class333.field4591.method158(true);
            int var83 = class333.field4591.method158(true);
            int var84 = class333.field4591.method188(-128);
            int var85 = class333.field4591.method205(-957401312);
            if (class401.method2519(1, var84)) {
                class362.method2330(var85, (byte) -121, (var82 << 16) + var83);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 203) {
            class64.field874 = class333.field4591.method207(7124);
            class304.field4190 = -1;
            class274.field3822 = class367.field5186;
            return true;
        } else if (class304.field4190 == 125) {
            int var86 = class333.field4591.method177((byte) 55);
            int var87 = class333.field4591.method187(arg0 ^ 0x4A98);
            int var88 = class333.field4591.method177((byte) 55);
            class142.field2034 = var88 >> 1;
            class412.field5841.method930(var86, (var88 & 0x1) == 1, var87, -121, class142.field2034);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 176) {
            int var89 = class333.field4591.method174(arg0 + 256);
            int var90 = class333.field4591.method185(25239);
            if (class401.method2519(1, var89)) {
                class26 var91 = (class26) class454.field6477.method886((long) var90, 25651);
                if (var91 != null) {
                    class325.method2090(var91, true, false, arg0 - 9);
                }
                if (class109.field1567 != null) {
                    class404.method2531(arg0 ^ 0xFFFF9701, class109.field1567);
                    class109.field1567 = null;
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 81) {
            int var92 = class333.field4591.method202(17);
            int var93 = class333.field4591.method185(25239);
            int var94 = class333.field4591.method158(true);
            if (class401.method2519(1, var94)) {
                class26 var95 = (class26) class454.field6477.method886((long) var93, 25651);
                class26 var96 = (class26) class454.field6477.method886((long) var92, 25651);
                if (var96 != null) {
                    class325.method2090(var96, var95 == null || var95.field463 != var96.field463, false, -10);
                }
                if (var95 != null) {
                    var95.method2467((byte) -104);
                    class454.field6477.method883((byte) -54, (long) var92, var95);
                }
                class453 var97 = class442.method2767(var93, -1229996208);
                if (var97 != null) {
                    class404.method2531(26878, var97);
                }
                class453 var98 = class442.method2767(var92, -1229996208);
                if (var98 != null) {
                    class404.method2531(26878, var98);
                    class224.method1496(true, (byte) 121, var98);
                }
                if (class59.field801 != -1) {
                    class46.method410(1, class59.field801, -124);
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 72) {
            int var99 = class333.field4591.method175(255);
            int var100 = class333.field4591.method185(25239);
            int var101 = class333.field4591.method172((byte) 52);
            String var102 = "";
            String var103 = var102;
            if ((var101 & 0x1) != 0) {
                var102 = class333.field4591.method171(-9265);
                if ((var101 & 0x2) == 0) {
                    var103 = var102;
                } else {
                    var103 = class333.field4591.method171(-9265);
                }
            }
            String var104 = class333.field4591.method171(-9265);
            if (var99 == 99) {
                class418.method2626(5998, var104);
            } else if (var103.equals("") || !class273.method1784(var103, arg0 + 1)) {
                class41.method378(var100, var102, var99, var103, var104, (byte) -120);
            } else {
                class304.field4190 = -1;
                return true;
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 149) {
            class416.field5924 = class333.field4591.method206(82);
            class50.field701 = class333.field4591.method172((byte) 52);
            while (class15.field290 > class333.field4591.field191) {
                class304.field4190 = class333.field4591.method172((byte) 52);
                class230.method1589(115);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 252) {
            class415.field5888 = class333.field4591.method172((byte) 52);
            class359.field4901 = class333.field4591.method172((byte) 52);
            class197.field2706 = class333.field4591.method172((byte) 52);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 68) {
            class46.method407(class15.field290, class241.field3426, false, class333.field4591);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 180) {
            class14.method229((byte) 28);
            class156.field2206 += 32;
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 236) {
            int var105 = class333.field4591.method174(255);
            int var106 = class333.field4591.method172((byte) 52);
            int var107 = class333.field4591.method172((byte) 52);
            int var108 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
            int var109 = class333.field4591.method172((byte) 52);
            int var110 = class333.field4591.method172((byte) 52);
            if (class401.method2519(1, var105)) {
                class48.method416(var109, var107, -118, var106, var110, var108);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 183) {
            int var111 = class333.field4591.method172((byte) 52);
            int var112 = class333.field4591.method158(true);
            if (class401.method2519(1, var112)) {
                class132.field1887 = var111;
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 174) {
            for (int var113 = 0; var113 < class297.field4156.length; var113++) {
                if (class34.field532[var113] != class297.field4156[var113]) {
                    class297.field4156[var113] = class34.field532[var113];
                    class280.method1831(var113, 25212);
                    class133.field1917[class387.method2454(31, class156.field2206++)] = var113;
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 84) {
            String var114 = class333.field4591.method171(-9265);
            int var115 = class333.field4591.method206(-116);
            int var116 = class333.field4591.method174(255);
            if (var116 == 65535) {
                var116 = -1;
            }
            int var117 = class333.field4591.method172((byte) 52);
            if (var115 >= 1 && var115 <= 8) {
                if (var114.equalsIgnoreCase("null")) {
                    var114 = null;
                }
                class223.field3127[var115 - 1] = var114;
                class312.field4274[var115 - 1] = var116;
                class106.field1460[var115 - 1] = var117 == 0;
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 89) {
            int var118 = class333.field4591.method174(255);
            if (var118 == 65535) {
                var118 = -1;
            }
            int var119 = class333.field4591.method172((byte) 52);
            int var120 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
            int var121 = class333.field4591.method172((byte) 52);
            class273.method1780(var118, arg0 ^ 0xFFFF8975, var121, var119, var120);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 200) {
            int var122 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
            if (class401.method2519(arg0 + 2, var122)) {
                class83.method605(-84);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 233) {
            int var123 = class333.field4591.method174(255);
            int var124 = class333.field4591.method172((byte) 52);
            int var125 = class333.field4591.method172((byte) 52);
            int var126 = class333.field4591.method172((byte) 52);
            int var127 = class333.field4591.method172((byte) 52);
            int var128 = class333.field4591.method174(255);
            if (class401.method2519(1, var123)) {
                class161.field2247[var124] = true;
                class318.field4341[var124] = var125;
                class434.field6126[var124] = var126;
                class53.field735[var124] = var127;
                class66.field987[var124] = var128;
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 148) {
            boolean var129 = class333.field4591.method172((byte) 52) == 1;
            String var130 = class333.field4591.method171(-9265);
            String var131 = var130;
            if (var129) {
                var131 = class333.field4591.method171(-9265);
            }
            long var132 = class333.field4591.method161(false);
            long var134 = (long) class333.field4591.method174(255);
            long var136 = (long) class333.field4591.method208(arg0 + 27309);
            int var138 = class333.field4591.method172((byte) 52);
            int var139 = class333.field4591.method174(255);
            long var140 = (var134 << 32) + var136;
            boolean var142 = false;
            int var143 = 0;
            while (true) {
                if (var143 >= 100) {
                    if (var138 <= 1 && class273.method1784(var131, arg0 + 1)) {
                        var142 = true;
                    }
                    break;
                }
                if (class316.field4313[var143] == var140) {
                    var142 = true;
                    break;
                }
                var143++;
            }
            if (!var142 && class389.field5591 == 0) {
                class316.field4313[class260.field3642] = var140;
                class260.field3642 = (class260.field3642 + 1) % 100;
                String var144 = class54.method443(var139, false).method2056(-106, class333.field4591);
                if (var138 == 2) {
                    class384.method2437(var144, 1, "<img=1>" + var130, var139, class357.method2282(true, var132), 20, 0, "<img=1>" + var131);
                } else if (var138 == 1) {
                    class384.method2437(var144, 1, "<img=0>" + var130, var139, class357.method2282(true, var132), 20, 0, "<img=0>" + var131);
                } else {
                    class384.method2437(var144, 1, var130, var139, class357.method2282(true, var132), 20, 0, var131);
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 201) {
            int var145 = class333.field4591.method174(255);
            if (var145 == 65535) {
                var145 = -1;
            }
            int var146 = class333.field4591.method166(false);
            int var147 = class333.field4591.method185(25239);
            if (class401.method2519(1, var146)) {
                class248.method1670(-1, var145, 122, var147, 1);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 10) {
            int var148 = class333.field4591.method172((byte) 52);
            int var149 = class333.field4591.method172((byte) 52);
            if (var148 == 255) {
                var149 = -1;
                var148 = -1;
            }
            class132.method912(var149, (byte) -104, var148);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 87) {
            int var150 = class333.field4591.method174(255);
            int var151 = class333.field4591.method174(255);
            int var152 = class333.field4591.method174(255);
            int var153 = class333.field4591.method174(arg0 + 256);
            if (class401.method2519(1, var150) && class143.field2057[var151] != null) {
                for (int var154 = var152; var154 < var153; var154++) {
                    int var155 = class333.field4591.method208(27308);
                    if (var154 < class143.field2057[var151].length && class143.field2057[var151][var154] != null) {
                        class143.field2057[var151][var154].field6386 = var155;
                    }
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 52) {
            int var156 = class333.field4591.method188(-128);
            int var157 = class333.field4591.method188(-128);
            int var158 = class333.field4591.method188(-128);
            int var159 = class333.field4591.method174(255);
            int var160 = class333.field4591.method205(-957401312);
            if (class401.method2519(1, var159)) {
                class248.method1670(var158, var156 << 16 | var157, 116, var160, 7);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 138) {
            class50.field701 = class333.field4591.method177((byte) 55);
            class416.field5924 = class333.field4591.method177((byte) 55);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 172) {
            int var161 = class333.field4591.method158(true);
            int var162 = class333.field4591.method177((byte) 55);
            boolean var163 = (var162 & 0x1) == 1;
            class438.method2750(var161, (byte) -101, var163);
            class440.field6196[class387.method2454(class454.field6490++, 31)] = var161;
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 160 || class304.field4190 == 41 || class304.field4190 == 45 || class304.field4190 == 58 || class304.field4190 == 57 || class304.field4190 == 179 || class304.field4190 == 102 || class304.field4190 == 71 || class304.field4190 == 46 || class304.field4190 == 227 || class304.field4190 == 122 || class304.field4190 == 162 || class304.field4190 == 231 || class304.field4190 == 169 || class304.field4190 == 73) {
            class230.method1589(115);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 150) {
            String var164 = class333.field4591.method171(-9265);
            int var165 = class333.field4591.method174(255);
            String var166 = class54.method443(var165, false).method2056(32, class333.field4591);
            class384.method2437(var166, 1, var164, var165, (String) null, 19, 0, var164);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 40) {
            class189.method1233(false, -30088);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 97) {
            int var167 = class333.field4591.method174(arg0 + 256);
            int var168 = class333.field4591.method205(arg0 ^ 0x3910C8DF);
            class120.method821(116, var167, var168);
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 253) {
            int var169 = class333.field4591.method158(true);
            int var170 = class333.field4591.method166(false);
            byte var171 = class333.field4591.method179(false);
            if (class401.method2519(1, var170)) {
                class264.method1724((byte) -108, var171, var169);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 3) {
            int var172 = class333.field4591.method172((byte) 52);
            boolean var173 = (var172 & 0x1) == 1;
            String var174 = class333.field4591.method171(-9265);
            String var175 = class333.field4591.method171(-9265);
            if (var175.equals("")) {
                var175 = var174;
            }
            String var176 = class333.field4591.method171(arg0 - 9264);
            String var177 = class333.field4591.method171(arg0 - 9264);
            if (var177.equals("")) {
                var177 = var176;
            }
            if (var173) {
                for (int var178 = 0; var178 < class197.field2709; var178++) {
                    if (class303.field4182[var178].equals(var177)) {
                        class249.field3517[var178] = var174;
                        class303.field4182[var178] = var175;
                        class245.field3464[var178] = var176;
                        class69.field1017[var178] = var177;
                        break;
                    }
                }
            } else {
                class249.field3517[class197.field2709] = var174;
                class303.field4182[class197.field2709] = var175;
                class245.field3464[class197.field2709] = var176;
                class69.field1017[class197.field2709] = var177;
                class187.field2528[class197.field2709] = class387.method2454(2, var172) == 2;
                class197.field2709++;
            }
            class304.field4190 = -1;
            class159.field2236 = class367.field5186;
            return true;
        } else if (class304.field4190 == 23) {
            int var179 = class333.field4591.method188(arg0 - 127);
            int var180 = class333.field4591.method174(arg0 + 256);
            String var181 = class333.field4591.method171(-9265);
            if (class401.method2519(arg0 ^ 0xFFFFFFFE, var179)) {
                class90.method629(arg0 + 15, var181, var180);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 34) {
            class333.field4591.field191 += 28;
            if (class333.field4591.method204(0)) {
                class2.method10(class333.field4591, (byte) -84, class333.field4591.field191 - 28);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 221) {
            int var182 = class333.field4591.method174(255);
            int var183 = class333.field4591.method205(-957401312);
            int var184 = class333.field4591.method158(true);
            int var185 = class333.field4591.method174(255);
            if (var183 >> 30 != 0) {
                int var210 = (var183 & 0x353DDD68) >> 28;
                int var211 = (var183 >> 14 & 0x3FFF) - class212.field2968;
                int var212 = (var183 & 0x3FFF) - class447.field6269;
                if (var211 >= 0 && var212 >= 0 && var211 < class211.field2954 && var212 < class290.field4061) {
                    int var213 = var211 * 128 + 64;
                    int var214 = var212 * 128 + 64;
                    class367 var215 = new class367(var182, 0, class276.field3837, var210, var213, class285.method1858(var213, var210, var214, arg0 ^ 0x3F) - var184, var214, var211, var211, var212, var212);
                    class59.field802.method643(new class366(var215), -73);
                }
            } else if ((var183 >> 29) != 0) {
                int var186 = var183 & 0xFFFF;
                class198 var187 = class98.field1358[var186];
                if (var187 != null) {
                    if (var182 == 65535) {
                        var182 = -1;
                    }
                    boolean var188 = true;
                    if (var182 != -1 && var187.field5300 != -1) {
                        if (var187.field5300 == var182) {
                            class80 var193 = class393.method2484(var182, arg0 - 104);
                            if (var193.field1144 && var193.field1125 != -1) {
                                class411 var194 = class108.method761((byte) -82, var193.field1125);
                                int var195 = var194.field5832;
                                if (var195 == 0 || var195 == 2) {
                                    var188 = false;
                                } else if (var195 == 1) {
                                    var188 = true;
                                }
                            }
                        } else {
                            class80 var189 = class393.method2484(var182, -74);
                            class80 var190 = class393.method2484(var187.field5300, -79);
                            if (var189.field1125 != -1 && var190.field1125 != -1) {
                                class411 var191 = class108.method761((byte) -82, var189.field1125);
                                class411 var192 = class108.method761((byte) -82, var190.field1125);
                                if (var191.field5825 < var192.field5825) {
                                    var188 = false;
                                }
                            }
                        }
                    }
                    if (var188) {
                        var187.field5300 = var182;
                        var187.field5295 = 0;
                        var187.field5320 = class276.field3837 + var185;
                        var187.field5257 = 0;
                        var187.field5288 = var184;
                        var187.field5316 = 1;
                        if (class276.field3837 < var187.field5320) {
                            var187.field5295 = -1;
                        }
                        if (var187.field5300 != -1 && class276.field3837 == var187.field5320) {
                            int var196 = class393.method2484(var187.field5300, -118).field1125;
                            if (var196 != -1) {
                                class411 var197 = class108.method761((byte) -82, var196);
                                if (var197 != null && var197.field5824 != null) {
                                    class431.method2721(var187.field6266, var187.field6262, var197, 112, false, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var183 >> 28 != 0) {
                int var198 = var183 & 0xFFFF;
                class134 var199;
                if (class40.field588 == var198) {
                    var199 = class412.field5841;
                } else {
                    var199 = class381.field5447[var198];
                }
                if (var199 != null) {
                    if (var182 == 65535) {
                        var182 = -1;
                    }
                    boolean var200 = true;
                    if (var182 != -1 && var199.field5300 != -1) {
                        if (var199.field5300 == var182) {
                            class80 var201 = class393.method2484(var182, -124);
                            if (var201.field1144 && var201.field1125 != -1) {
                                class411 var202 = class108.method761((byte) -82, var201.field1125);
                                int var203 = var202.field5832;
                                if (var203 == 0 || var203 == 2) {
                                    var200 = false;
                                } else if (var203 == 1) {
                                    var200 = true;
                                }
                            }
                        } else {
                            class80 var204 = class393.method2484(var182, arg0 + 64);
                            class80 var205 = class393.method2484(var199.field5300, 111);
                            if (var204.field1125 != -1 && var205.field1125 != -1) {
                                class411 var206 = class108.method761((byte) -82, var204.field1125);
                                class411 var207 = class108.method761((byte) -82, var205.field1125);
                                if (var207.field5825 > var206.field5825) {
                                    var200 = false;
                                }
                            }
                        }
                    }
                    if (var200) {
                        var199.field5320 = class276.field3837 + var185;
                        var199.field5288 = var184;
                        var199.field5316 = 1;
                        var199.field5300 = var182;
                        var199.field5295 = 0;
                        var199.field5257 = 0;
                        if (var199.field5320 > class276.field3837) {
                            var199.field5295 = -1;
                        }
                        if (var199.field5300 == 65535) {
                            var199.field5300 = -1;
                        }
                        if (var199.field5300 != -1 && class276.field3837 == var199.field5320) {
                            int var208 = class393.method2484(var199.field5300, -59).field1125;
                            if (var208 != -1) {
                                class411 var209 = class108.method761((byte) -82, var208);
                                if (var209 != null && var209.field5824 != null) {
                                    class431.method2721(var199.field6266, var199.field6262, var209, 105, class412.field5841 == var199, 0);
                                }
                            }
                        }
                    }
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 161) {
            class157.field2220 = class367.field5186;
            if (class15.field290 == 0) {
                class33.field517 = null;
                class316.field4319 = 0;
                class121.field1700 = null;
                class349.field4806 = null;
                class304.field4190 = -1;
                return true;
            }
            class33.field517 = class333.field4591.method171(-9265);
            boolean var216 = class333.field4591.method172((byte) 52) == 1;
            if (var216) {
                class333.field4591.method171(-9265);
            }
            long var217 = class333.field4591.method161(false);
            class349.field4806 = class158.method1058(false, var217);
            class292.field4087 = class333.field4591.method162(-4436);
            int var219 = class333.field4591.method172((byte) 52);
            if (var219 == 255) {
                class304.field4190 = -1;
                return true;
            }
            class316.field4319 = var219;
            class218[] var220 = new class218[100];
            for (int var221 = 0; var221 < class316.field4319; var221++) {
                var220[var221] = new class218();
                var220[var221].field3008 = class333.field4591.method171(-9265);
                boolean var227 = class333.field4591.method172((byte) 52) == 1;
                if (var227) {
                    var220[var221].field3011 = class333.field4591.method171(-9265);
                } else {
                    var220[var221].field3011 = var220[var221].field3008;
                }
                var220[var221].field3010 = class333.field4591.method174(255);
                var220[var221].field3014 = class333.field4591.method162(arg0 - 4435);
                var220[var221].field3017 = class333.field4591.method171(-9265);
                if (var220[var221].field3011.equals(class412.field5841.field1922)) {
                    class103.field1421 = var220[var221].field3014;
                }
            }
            boolean var222 = false;
            int var223 = class316.field4319;
            while (var223 > 0) {
                boolean var224 = true;
                var223--;
                for (int var225 = 0; var225 < var223; var225++) {
                    if (var220[var225].field3008.compareTo(var220[var225 + 1].field3008) > 0) {
                        class218 var226 = var220[var225];
                        var220[var225] = var220[var225 + 1];
                        var220[var225 + 1] = var226;
                        var224 = false;
                    }
                }
                if (var224) {
                    break;
                }
            }
            class121.field1700 = var220;
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 135) {
            class416.field5924 = class333.field4591.method177((byte) 55);
            class50.field701 = class333.field4591.method172((byte) 52);
            for (class107 var228 = (class107) class367.field5182.method885(-123); var228 != null; var228 = (class107) class367.field5182.method881((byte) -68)) {
                int var230 = (int) (var228.field5600 & 0x3FFFL);
                int var231 = (int) (var228.field5600 >> 14 & 0x3FFFL);
                int var232 = (int) (var228.field5600 >> 28 & 0x3L);
                if (class142.field2034 == var232 && class50.field701 <= var230 && var230 < (class50.field701 + 8) && class416.field5924 <= var231 && var231 < (class416.field5924 + 8)) {
                    var228.method2467((byte) -67);
                    class328.method2112(-1, class142.field2034, var231, var230);
                }
            }
            for (class380 var229 = (class380) class24.field414.method646(48); var229 != null; var229 = (class380) class24.field414.method641(false)) {
                if (var229.field5422 >= class50.field701 && var229.field5422 < (class50.field701 + 8) && class416.field5924 <= var229.field5419 && var229.field5419 < class416.field5924 + 8 && class142.field2034 == var229.field5420) {
                    var229.field5416 = 0;
                }
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 42) {
            int var233 = class333.field4591.method158(true);
            int var234 = class333.field4591.method205(-957401312);
            int var235 = class333.field4591.method158(true);
            int var236 = class333.field4591.method205(-957401312);
            if (class401.method2519(1, var235)) {
                class248.method1670(var236, var233, arg0 + 121, var234, 5);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 117) {
            int var237 = class333.field4591.method166(false);
            int var238 = class333.field4591.method185(25239);
            if (class401.method2519(1, var237)) {
                class248.method1670(-1, -1, 122, var238, 3);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 141) {
            int var239 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
            int var240 = class333.field4591.method205(-957401312);
            int var241 = class333.field4591.method174(arg0 + 256);
            if (var241 == 65535) {
                var241 = -1;
            }
            if (class401.method2519(1, var239)) {
                class248.method1670(-1, var241, 111, var240, 2);
            }
            class304.field4190 = -1;
            return true;
        } else if (class304.field4190 == 74) {
            class178.field2448 = class333.field4591.method172((byte) 52);
            class159.field2236 = class367.field5186;
            class304.field4190 = -1;
            return true;
        } else {
            if (arg0 != -1) {
                method2123(false, 66, (class345) null, true, (int[][]) null);
            }
            if (class304.field4190 == 248) {
                if (class217.field2997 != null) {
                    class388.method2460(-1538, -1, false, class284.field4010, -1);
                }
                byte[] var242 = new byte[class15.field290];
                class333.field4591.method1182(var242, ~arg0, 0, class15.field290);
                String var243 = class286.method1868(class15.field290, 0, (byte) 83, var242);
                class159.method1060(true, class241.field3426, class326.field4462 == 1, var243, -29841);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 165) {
                if (class15.field290 == 0) {
                    class160.field2244 = class205.field2818.method2763(-89, class210.field2935);
                } else {
                    class160.field2244 = class333.field4591.method171(-9265);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 137) {
                boolean var244 = class333.field4591.method172((byte) 52) == 1;
                String var245 = class333.field4591.method171(-9265);
                String var246 = var245;
                if (var244) {
                    var246 = class333.field4591.method171(arg0 - 9264);
                }
                long var247 = (long) class333.field4591.method174(255);
                long var249 = (long) class333.field4591.method208(27308);
                int var251 = class333.field4591.method172((byte) 52);
                int var252 = class333.field4591.method174(255);
                long var253 = (var247 << 32) + var249;
                boolean var255 = false;
                int var256 = 0;
                while (true) {
                    if (var256 >= 100) {
                        if (var251 <= 1 && class273.method1784(var246, arg0 + 1)) {
                            var255 = true;
                        }
                        break;
                    }
                    if (class316.field4313[var256] == var253) {
                        var255 = true;
                        break;
                    }
                    var256++;
                }
                if (!var255 && class389.field5591 == 0) {
                    class316.field4313[class260.field3642] = var253;
                    class260.field3642 = (class260.field3642 + 1) % 100;
                    String var257 = class54.method443(var252, false).method2056(105, class333.field4591);
                    if (var251 == 2) {
                        class384.method2437(var257, 1, "<img=1>" + var245, var252, (String) null, 18, 0, "<img=1>" + var246);
                    } else if (var251 == 1) {
                        class384.method2437(var257, 1, "<img=0>" + var245, var252, (String) null, 18, 0, "<img=0>" + var246);
                    } else {
                        class384.method2437(var257, arg0 + 2, var245, var252, (String) null, 18, 0, var246);
                    }
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 59) {
                int var258 = class333.field4591.method174(255);
                String var259 = class333.field4591.method171(-9265);
                Object[] var260 = new Object[var259.length() + 1];
                for (int var261 = var259.length() - 1; var261 >= 0; var261--) {
                    if (var259.charAt(var261) == 's') {
                        var260[var261 + 1] = class333.field4591.method171(-9265);
                    } else {
                        var260[var261 + 1] = Integer.valueOf(class333.field4591.method185(25239));
                    }
                }
                var260[0] = Integer.valueOf(class333.field4591.method185(25239));
                if (class401.method2519(1, var258)) {
                    class7 var262 = new class7();
                    var262.field97 = var260;
                    class177.method1168(var262);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 212) {
                int var263 = class333.field4591.method172((byte) 52);
                int var264 = var263 >> 5;
                int var265 = var263 & 0x1F;
                if (var265 == 0) {
                    class131.field1864[var264] = null;
                    class304.field4190 = -1;
                    return true;
                }
                class285 var266 = new class285();
                var266.field4017 = var265;
                var266.field4011 = class333.field4591.method172((byte) 52);
                if (var266.field4011 >= 0 && var266.field4011 < class239.field3413.length) {
                    if (var266.field4017 == 1 || var266.field4017 == 10) {
                        var266.field4025 = class333.field4591.method174(arg0 + 256);
                        class333.field4591.field191 += 5;
                    } else if (var266.field4017 >= 2 && var266.field4017 <= 6) {
                        if (var266.field4017 == 2) {
                            var266.field4012 = 64;
                            var266.field4020 = 64;
                        }
                        if (var266.field4017 == 3) {
                            var266.field4020 = 0;
                            var266.field4012 = 64;
                        }
                        if (var266.field4017 == 4) {
                            var266.field4012 = 64;
                            var266.field4020 = 128;
                        }
                        if (var266.field4017 == 5) {
                            var266.field4012 = 0;
                            var266.field4020 = 64;
                        }
                        if (var266.field4017 == 6) {
                            var266.field4020 = 64;
                            var266.field4012 = 128;
                        }
                        var266.field4017 = 2;
                        var266.field4019 = class333.field4591.method174(255);
                        var266.field4026 = class333.field4591.method174(255);
                        var266.field4027 = class333.field4591.method172((byte) 52);
                        var266.field4022 = class333.field4591.method174(255);
                    }
                    var266.field4024 = class333.field4591.method174(255);
                    if (var266.field4024 == 65535) {
                        var266.field4024 = -1;
                    }
                    class131.field1864[var264] = var266;
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 65) {
                int var267 = class333.field4591.method174(255);
                int var268 = class333.field4591.method166(false);
                int var269 = class333.field4591.method174(255);
                if (class401.method2519(1, var268)) {
                    class34.method335(-121, var267, var269, 0);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 130) {
                int var270 = class333.field4591.method174(255);
                int var271 = class333.field4591.method172((byte) 52);
                boolean var272 = (var271 & 0x1) == 1;
                class132.method913(var272, var270, ~arg0);
                int var273 = class333.field4591.method174(arg0 + 256);
                for (int var274 = 0; var274 < var273; var274++) {
                    int var275 = class333.field4591.method174(255);
                    int var276 = class333.field4591.method187(-19097);
                    if (var276 == 255) {
                        var276 = class333.field4591.method205(arg0 - 957401311);
                    }
                    class56.method458(var274, var272, var276, var270, (byte) 116, var275 - 1);
                }
                class440.field6196[class387.method2454(31, class454.field6490++)] = var270;
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 254) {
                int var277 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
                int var278 = class333.field4591.method172((byte) 52);
                int var279 = class333.field4591.method172((byte) 52);
                int var280 = class333.field4591.method174(255);
                int var281 = class333.field4591.method172((byte) 52);
                int var282 = class333.field4591.method172((byte) 52);
                if (class401.method2519(arg0 + 2, var277)) {
                    class206.method1337(var281, (byte) 118, var279, var278, var280, true, var282);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 166) {
                int var283 = class333.field4591.method174(arg0 + 256);
                int var284 = class333.field4591.method184((byte) 125);
                int var285 = class333.field4591.method194(30339);
                if (class401.method2519(1, var283)) {
                    class228.method1582((byte) 20, var284, var285);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 192) {
                class18.method253(-105);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 241) {
                if (class59.field801 != -1) {
                    class46.method410(0, class59.field801, -109);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 4) {
                boolean var286 = class333.field4591.method172((byte) 52) == 1;
                String var287 = class333.field4591.method171(-9265);
                String var288 = var287;
                if (var286) {
                    var288 = class333.field4591.method171(-9265);
                }
                long var289 = class333.field4591.method161(false);
                long var291 = (long) class333.field4591.method174(255);
                long var293 = (long) class333.field4591.method208(arg0 + 27309);
                int var295 = class333.field4591.method172((byte) 52);
                long var296 = (var291 << 32) + var293;
                boolean var298 = false;
                int var299 = 0;
                while (true) {
                    if (var299 >= 100) {
                        if (var295 <= 1) {
                            if (!(!class387.field5561 || class74.field1068) || class292.field4086) {
                                var298 = true;
                            } else if (class273.method1784(var288, ~arg0)) {
                                var298 = true;
                            }
                        }
                        break;
                    }
                    if (class316.field4313[var299] == var296) {
                        var298 = true;
                        break;
                    }
                    var299++;
                }
                if (!var298 && class389.field5591 == 0) {
                    class316.field4313[class260.field3642] = var296;
                    class260.field3642 = (class260.field3642 + 1) % 100;
                    String var300 = class128.method875(-1, class181.method1179(class357.method2294(class333.field4591, arg0 ^ -17), (byte) 111));
                    if (var295 == 2 || var295 == 3) {
                        class384.method2437(var300, arg0 ^ 0xFFFFFFFE, "<img=1>" + var287, -1, class357.method2282(true, var289), 9, 0, "<img=1>" + var288);
                    } else if (var295 == 1) {
                        class384.method2437(var300, 1, "<img=0>" + var287, -1, class357.method2282(true, var289), 9, 0, "<img=0>" + var288);
                    } else {
                        class384.method2437(var300, 1, var287, -1, class357.method2282(true, var289), 9, 0, var288);
                    }
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 219) {
                int var301 = class333.field4591.method202(arg0 + 93);
                int var302 = class333.field4591.method174(arg0 ^ 0xFFFFFF00);
                class89.method628(var302, var301, -68);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 82) {
                int var303 = class333.field4591.method174(255);
                int var304 = class333.field4591.method194(arg0 + 30340);
                if (class401.method2519(1, var303)) {
                    class248.method1670(0, 2047, arg0 ^ 0xFFFFFF87, var304, 5);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 114) {
                String var305 = class333.field4591.method171(-9265);
                String var306 = class128.method875(arg0, class181.method1179(class357.method2294(class333.field4591, arg0 ^ 0xFFFFFFEF), (byte) 111));
                class41.method378(0, var305, 6, var305, var306, (byte) 126);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 238) {
                int var307 = class333.field4591.method174(255);
                if (class401.method2519(1, var307)) {
                    class420.method2635((byte) 73);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 154) {
                int var308 = class333.field4591.method202(94);
                int var309 = class333.field4591.method177((byte) 55);
                int var310 = class333.field4591.method206(arg0 ^ 0xFFFFFFDA);
                class113.field1635[var309] = var308;
                class183.field2496[var309] = var310;
                class194.field2677[var309] = 1;
                int var311 = class59.field808[var309] - 1;
                for (int var312 = 0; var312 < var311; var312++) {
                    if (var308 >= class352.field4819[var312]) {
                        class194.field2677[var309] = var312 + 2;
                    }
                }
                class271.field3764[class387.method2454(class190.field2618++, 31)] = var309;
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 24) {
                int var313 = class333.field4591.method206(-122);
                int var314 = class333.field4591.method188(-128);
                if (var314 == 65535) {
                    var314 = -1;
                }
                class21.method278(var313, (byte) -84, var314);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 20) {
                int var315 = class333.field4591.method187(-19097);
                int var316 = class333.field4591.method174(255);
                if (var316 == 65535) {
                    var316 = -1;
                }
                int var317 = class333.field4591.method211(27026);
                class275.method1793(var315, var317, var316, (byte) -73);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 86) {
                int var318 = class333.field4591.method158(true);
                int var319 = class333.field4591.method202(44);
                int var320 = class333.field4591.method187(-19097);
                if (class401.method2519(1, var318)) {
                    class53.method437(var319, false, var320);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 234) {
                int var321 = class333.field4591.method166(false);
                int var322 = class333.field4591.method158(true);
                int var323 = class333.field4591.method205(arg0 ^ 0x3910C8DF);
                if (class401.method2519(1, var321)) {
                    class264.method1724((byte) -93, var323, var322);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 249) {
                int var324 = class333.field4591.method174(255);
                int var325 = class333.field4591.method205(-957401312);
                int var326 = class333.field4591.method174(255);
                if (var326 == 65535) {
                    var326 = -1;
                }
                int var327 = class333.field4591.method188(-128);
                if (var327 == 65535) {
                    var327 = -1;
                }
                int var328 = class333.field4591.method194(30339);
                if (class401.method2519(1, var324)) {
                    for (int var329 = var327; var329 <= var326; var329++) {
                        long var330 = ((long) var328 << 32) + ((long) var329);
                        class139 var332 = (class139) class389.field5584.method886(var330, arg0 ^ 0xFFFF9BCC);
                        class139 var333;
                        if (var332 != null) {
                            var333 = new class139(var325, var332.field1979);
                            var332.method2467((byte) 68);
                        } else if (var329 == -1) {
                            var333 = new class139(var325, class442.method2767(var328, -1229996208).field6351.field1979);
                        } else {
                            var333 = new class139(var325, -1);
                        }
                        class389.field5584.method883((byte) -54, var330, var333);
                    }
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 80) {
                int var334 = class333.field4591.method174(255);
                int var335 = class333.field4591.method172((byte) 52);
                int var336 = class333.field4591.method202(22);
                int var337 = class333.field4591.method158(true);
                if (class401.method2519(1, var337)) {
                    class26 var338 = (class26) class454.field6477.method886((long) var336, 25651);
                    if (var338 != null) {
                        class325.method2090(var338, var338.field463 != var334, false, -10);
                    }
                    class196.method1266(false, var335, (byte) 93, var334, var336);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 62) {
                int var339 = class333.field4591.method174(255);
                int var340 = class333.field4591.method187(-19097);
                int var341 = class333.field4591.method166(false);
                if (class401.method2519(1, var341)) {
                    if (var340 == 2) {
                        class374.method2392((byte) -52);
                    }
                    class59.field801 = var339;
                    class33.method332(1, var339);
                    class231.method1590(false, true);
                    class177.method1164(class59.field801);
                    for (int var342 = 0; var342 < 100; var342++) {
                        class377.field5395[var342] = true;
                    }
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 147) {
                class135.field1970 = class333.field4591.method166(false) * 30;
                class304.field4190 = -1;
                class274.field3822 = class367.field5186;
                return true;
            } else if (class304.field4190 == 196) {
                class64.method488(class333.field4591.method171(-9265), 155);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 106) {
                int var343 = class333.field4591.method188(-128);
                byte var344 = class333.field4591.method162(-4436);
                class89.method628(var343, var344, -65);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 107) {
                int var345 = class333.field4591.method206(-125);
                int var346 = var345 >> 2;
                int var347 = var345 & 0x3;
                int var348 = class387.field5566[var346];
                int var349 = class333.field4591.method205(-957401312);
                int var350 = var349 >> 28 & 0x3;
                int var351 = var349 >> 14 & 0x3FFF;
                int var352 = var349 & 0x3FFF;
                int var353 = class333.field4591.method188(-128);
                if (var353 == 65535) {
                    var353 = -1;
                }
                int var354 = var351 - class212.field2968;
                int var355 = var352 - class447.field6269;
                class154.method1032(var350, var354, (byte) 106, var355, var346, var353, var348, var347);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 158) {
                class389.method2466((byte) 111);
                class304.field4190 = -1;
                return false;
            } else if (class304.field4190 == 131) {
                class189.method1233(true, -30088);
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 8) {
                for (int var356 = 0; var356 < class381.field5447.length; var356++) {
                    if (class381.field5447[var356] != null) {
                        class381.field5447[var356].field5264 = -1;
                    }
                }
                for (int var357 = 0; var357 < class98.field1358.length; var357++) {
                    if (class98.field1358[var357] != null) {
                        class98.field1358[var357].field5264 = -1;
                    }
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 48) {
                int var358 = class333.field4591.method194(30339);
                int var359 = class333.field4591.method174(255);
                int var360 = class333.field4591.method190((byte) 123);
                int var361 = class333.field4591.method209((byte) -99);
                if (class401.method2519(arg0 + 2, var359)) {
                    class50.method424((byte) -40, var361, var360, var358);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 195) {
                int var362 = class333.field4591.method166(false);
                int var363 = class333.field4591.method177((byte) 55);
                int var364 = class333.field4591.method174(255);
                class198 var365 = class98.field1358[var362];
                if (var365 != null) {
                    class248.method1668(var364, var363, var365, -1);
                }
                class304.field4190 = -1;
                return true;
            } else if (class304.field4190 == 151) {
                String var366 = class333.field4591.method171(-9265);
                boolean var367 = class333.field4591.method172((byte) 52) == 1;
                String var368;
                if (var367) {
                    var368 = class333.field4591.method171(-9265);
                } else {
                    var368 = var366;
                }
                int var369 = class333.field4591.method174(255);
                byte var370 = class333.field4591.method162(-4436);
                boolean var371 = false;
                if (var370 == -128) {
                    var371 = true;
                }
                if (var371) {
                    if (class316.field4319 == 0) {
                        class304.field4190 = -1;
                        return true;
                    }
                    boolean var372 = false;
                    int var373;
                    for (var373 = 0; class316.field4319 > var373 && (!class121.field1700[var373].field3011.equals(var368) || class121.field1700[var373].field3010 != var369); var373++) {
                    }
                    if (var373 < class316.field4319) {
                        while (var373 < class316.field4319 - 1) {
                            class121.field1700[var373] = class121.field1700[var373 + 1];
                            var373++;
                        }
                        class316.field4319--;
                        class121.field1700[class316.field4319] = null;
                    }
                } else {
                    String var374 = class333.field4591.method171(-9265);
                    class218 var375 = new class218();
                    var375.field3017 = var374;
                    var375.field3014 = var370;
                    var375.field3008 = var366;
                    var375.field3010 = var369;
                    var375.field3011 = var368;
                    int var376;
                    for (var376 = class316.field4319 - 1; var376 >= 0; var376--) {
                        int var377 = class121.field1700[var376].field3011.compareTo(var375.field3011);
                        if (var377 == 0) {
                            class121.field1700[var376].field3010 = var369;
                            class121.field1700[var376].field3014 = var370;
                            class121.field1700[var376].field3017 = var374;
                            if (var368.equals(class412.field5841.field1922)) {
                                class103.field1421 = var370;
                            }
                            class157.field2220 = class367.field5186;
                            class304.field4190 = -1;
                            return true;
                        }
                        if (var377 < 0) {
                            break;
                        }
                    }
                    if (class121.field1700.length <= class316.field4319) {
                        class304.field4190 = -1;
                        return true;
                    }
                    for (int var378 = class316.field4319 - 1; var378 > var376; var378--) {
                        class121.field1700[var378 + 1] = class121.field1700[var378];
                    }
                    if (class316.field4319 == 0) {
                        class121.field1700 = new class218[100];
                    }
                    class121.field1700[var376 + 1] = var375;
                    class316.field4319++;
                    if (var368.equals(class412.field5841.field1922)) {
                        class103.field1421 = var370;
                    }
                }
                class157.field2220 = class367.field5186;
                class304.field4190 = -1;
                return true;
            } else {
                class271.method1776(-2296, (Throwable) null, "T1 - " + class304.field4190 + "," + class206.field2833 + "," + class50.field698 + " - " + class15.field290);
                class389.method2466((byte) 111);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
    public static void method2127(int arg0) {
        if (arg0 >= 34) {
            field4569 = null;
            field4566 = null;
            field4564 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lrb;Lcl;)V")
    public class329(class197 arg0, class145 arg1) {
        this.field4561 = arg0;
        this.field4551 = arg1;
        if (!this.field4561.method1276((byte) -28)) {
            this.field4558 = this.field4561.method1271(255, true, 86, (byte) 0, 255);
        }
    }
}
