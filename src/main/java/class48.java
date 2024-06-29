import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class48 extends class130 {

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public int field1172 = 0;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lgg;")
    public class63 field1176 = class192.field3896;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field1180 = 0;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field1168 = 0;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lgg;")
    public static class63 field1185 = class116.method911(43, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "[I")
    public int[] field1170;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "[I")
    public int[] field1173;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "[I")
    public static int[] field1183;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[Lgg;")
    public class63[] field1169;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILab;)V")
    public final void method474(int arg0, class3 arg1) {
        while (true) {
            int var3 = arg1.method64(31790);
            if (var3 == 0) {
                if (arg0 != -28065) {
                    field1180 = 50;
                }
                field1174++;
                return;
            }
            this.method476(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static final void method475(byte arg0) {
        class93.method811(3448);
        field1182++;
        class28.method277(false);
        class1.method5(-1);
        class166.method1125(8991);
        class168.method1138(-21340);
        class47.method471(108);
        class64.method610(64);
        class162.method1106(-1);
        class162.method1102(50);
        class180.method1195(115);
        class136.method987(64);
        class94.method826(-1);
        ((class190) class25.field569).method1248(69);
        class143.field3058.method282((byte) -120);
        class155.field3247.method752(true);
        class188.field3797.method752(true);
        class176.field3622.method752(true);
        class108.field2446.method752(true);
        class47.field1142.method752(true);
        class10.field225.method752(true);
        int var1 = 9 % ((arg0 - 60) / 60);
        class18.field433.method752(true);
        class110.field2479.method752(true);
        class29.field681.method752(true);
        class134.field2906.method752(true);
        class111.field2503.method752(true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILab;I)V")
    private final void method476(int arg0, class3 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1181 = arg1.method64(31790);
        } else if (arg2 == 2) {
            this.field1177 = arg1.method64(arg0 + 31790);
        } else if (arg2 == 3) {
            this.field1176 = arg1.method28(arg0 - 1);
        } else if (arg2 == 4) {
            this.field1175 = arg1.method56(arg0 - 1);
        } else if (arg2 == 5) {
            this.field1172 = arg1.method46((byte) 65);
            this.field1173 = new int[this.field1172];
            this.field1169 = new class63[this.field1172];
            for (int var4 = 0; var4 < this.field1172; var4++) {
                this.field1173[var4] = arg1.method56(-1);
                this.field1169[var4] = arg1.method28(arg0 - 1);
            }
        } else if (arg2 == 6) {
            this.field1172 = arg1.method46((byte) 65);
            this.field1170 = new int[this.field1172];
            this.field1173 = new int[this.field1172];
            for (int var5 = 0; var5 < this.field1172; var5++) {
                this.field1173[var5] = arg1.method56(class180.method1200(arg0, -1));
                this.field1170[var5] = arg1.method56(-1);
            }
        }
        if (arg0 != 0) {
            method475((byte) -39);
        }
        field1171++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lbh;I)V")
    public static final void method477(class19 arg0, int arg1) {
        field1179++;
        if (class88.field2081) {
            class60.method556(arg0, (byte) 66);
            return;
        }
        if (class158.field3280 == 1 && class110.field2480 >= 715 && class143.field3074 >= 453) {
            class190.field3871 = !class190.field3871;
            if (class190.field3871) {
                class50.method483((byte) -90);
            } else {
                class9.method120(false, (byte) 114, class10.field225, class90.field2112, class153.field3210, 255);
            }
        }
        if (class136.field2932 == 5) {
            return;
        }
        if (arg1 != 255) {
            field1183 = null;
        }
        class106.field2421++;
        if (class136.field2932 != 10) {
            return;
        }
        if (class59.field1518 != 2 && class22.field512 == 0) {
            if (class158.field3280 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (var2 <= class110.field2480 && class110.field2480 <= var2 + var4 && var3 <= class143.field3074 && var3 + var5 >= class143.field3074) {
                    class16.method179(-8495);
                    return;
                }
            }
            if (class110.field2483 != null) {
                class16.method179(arg1 ^ 0xFFFFDE2E);
            }
        }
        int var6 = class143.field3074;
        int var7 = class110.field2480;
        int var8 = class158.field3280;
        if (class77.field1881 == 0) {
            short var9 = 302;
            short var10 = 291;
            boolean var11 = false;
            if (var8 == 1 && var7 >= var9 - 75 && var9 + 75 >= var7 && var6 >= var10 - 20 && var10 + 20 >= var6) {
                class138.field2964 = 0;
                class77.field1881 = 3;
            }
            short var12 = 462;
            if (class175.field3589 != 0) {
                while (class166.method1122((byte) 113)) {
                    if (class117.field2624 == 84) {
                        var11 = true;
                        break;
                    }
                }
            }
            if (var11 || var8 == 1 && var12 - 75 <= var7 && var12 + 75 >= var7 && var6 >= var10 - 20 && var6 <= var10 + 20) {
                class153.field3209 = class30.field741;
                class153.field3204 = class60.field1539;
                class153.field3212 = class30.field732;
                class138.field2964 = 0;
                class77.field1881 = 2;
            }
        } else if (class77.field1881 == 2) {
            short var15 = 231;
            int var21 = var15 + 30;
            if (var8 == 1 && var21 - 15 <= var6 && var21 > var6) {
                class138.field2964 = 0;
            }
            var21 += 15;
            if (var8 == 1 && var21 - 15 <= var6 && var6 < var21) {
                class138.field2964 = 1;
            }
            var21 += 15;
            short var16 = 302;
            short var17 = 321;
            if (var8 == 1 && var7 >= var16 - 75 && var16 + 75 >= var7 && var17 - 20 <= var6 && var6 <= var17 + 20) {
                class153.field3201 = class153.field3201.method594((byte) -90).method576((byte) 32);
                if (class153.field3201.method582(-60) == 0) {
                    class188.method1232(class39.field932, class30.field751, class30.field769, false);
                    return;
                }
                if (class153.field3205.method582(arg1 ^ 0xFFFFFF54) == 0) {
                    class188.method1232(class3.field100, class30.field727, class30.field753, false);
                    return;
                }
                class188.method1232(class4.field124, class30.field764, class30.field743, false);
                class121.method931(20, 1);
                return;
            }
            short var18 = 462;
            if (var8 == 1 && var7 >= var18 - 75 && var18 + 75 >= var7 && var6 >= var17 - 20 && var6 <= var17 + 20) {
                class77.field1881 = 0;
                class153.field3201 = class153.field3210;
                class153.field3205 = class153.field3210;
            }
            while (true) {
                boolean var19;
                label231: do {
                    while (class166.method1122((byte) 123)) {
                        var19 = false;
                        for (int var20 = 0; var20 < class135.field2922.method582(-58); var20++) {
                            if (class108.field2444 == class135.field2922.method573(255, var20)) {
                                var19 = true;
                                break;
                            }
                        }
                        if (class138.field2964 != 0) {
                            continue label231;
                        }
                        if (class117.field2624 == 85 && class153.field3201.method582(-113) > 0) {
                            class153.field3201 = class153.field3201.method596(0, class153.field3201.method582(arg1 - 376) - 1, -56);
                        }
                        if (class117.field2624 == 84 || class117.field2624 == 80) {
                            class138.field2964 = 1;
                        }
                        if (var19 && class153.field3201.method582(-65) < 12) {
                            class153.field3201 = class153.field3201.method598(125, class108.field2444);
                        }
                    }
                    return;
                } while (class138.field2964 != 1);
                if (class117.field2624 == 85 && class153.field3205.method582(-116) > 0) {
                    class153.field3205 = class153.field3205.method596(0, class153.field3205.method582(-113) - 1, -123);
                }
                if (class117.field2624 == 84 || class117.field2624 == 80) {
                    class138.field2964 = 0;
                }
                if (class175.field3589 != 0 && class117.field2624 == 84) {
                    class153.field3201 = class153.field3201.method594((byte) -82).method576((byte) 32);
                    if (class153.field3201.method582(arg1 - 370) == 0) {
                        class188.method1232(class39.field932, class30.field751, class30.field769, false);
                        return;
                    }
                    if (class153.field3205.method582(-53) == 0) {
                        class188.method1232(class3.field100, class30.field727, class30.field753, false);
                        return;
                    }
                    class188.method1232(class4.field124, class30.field764, class30.field743, false);
                    class121.method931(20, 1);
                    return;
                }
                if (var19 && class153.field3205.method582(arg1 - 382) < 20) {
                    class153.field3205 = class153.field3205.method598(arg1 ^ 0x82, class108.field2444);
                }
            }
        } else if (class77.field1881 == 3) {
            short var13 = 382;
            short var14 = 321;
            if (var8 == 1 && var7 >= var13 - 75 && var13 + 75 >= var7 && var6 >= var14 - 20 && var6 <= var14 + 20) {
                class77.field1881 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static void method478(int arg0) {
        field1183 = null;
        if (arg0 != 8948) {
            method477(null, -59);
        }
        field1185 = null;
    }
}
