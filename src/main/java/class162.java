import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class162 {

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public int field2351 = -1;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "[I")
    public static int[] field2350 = new int[50];

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "Lmo;")
    public static class336 field2347 = new class336(64);

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "Lap;")
    public static class310 field2362 = new class310(26, -1);

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Lwk;")
    private class155 field2343;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "Lfg;")
    public static class269 field2363;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "Lfl;")
    public static class67 field2360;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Ljava/lang/String;")
    private String field2337;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Ljava/lang/String;")
    private String field2340;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "[I")
    private int[] field2336;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
    private int[] field2341;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "[I")
    private int[] field2344;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "[I")
    private int[] field2346;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "[I")
    private int[] field2349;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "[I")
    private int[] field2355;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "[I")
    private int[] field2356;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "[I")
    public static int[] field2359;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "[Lml;")
    public static class21[] field2364;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field2357;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field2358;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "[[I")
    private int[][] field2335;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[[I")
    private int[][] field2338;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "[[I")
    private int[][] field2339;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public static void method1198(boolean arg0) {
        field2364 = null;
        field2363 = null;
        field2359 = null;
        field2362 = null;
        field2360 = null;
        if (arg0) {
            field2347 = null;
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
    public static final void method1199(int arg0, int arg1) {
        class52 var2 = class385.field5285[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class52 var4 = class385.field5285[var3][arg0][arg1] = class385.field5285[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field759--;
                for (class131 var5 = var4.field763; var5 != null; var5 = var5.field1796) {
                    class325 var6 = var5.field1803;
                    if (var6.field4535 == arg0 && var6.field4539 == arg1) {
                        var6.field4531--;
                    }
                }
            }
        }
        if (class385.field5285[0][arg0][arg1] == null) {
            class385.field5285[0][arg0][arg1] = new class52(0, arg0, arg1);
            class385.field5285[0][arg0][arg1].field749 = 1;
        }
        class385.field5285[0][arg0][arg1].field757 = var2;
        class385.field5285[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILkk;I)V")
    private final void method1200(int arg0, class161 arg1, int arg2) {
        if (arg0 != 19424) {
            return;
        }
        field2345++;
        if (arg2 == 1) {
            this.field2340 = arg1.method1136(-93);
        } else if (arg2 == 2) {
            this.field2337 = arg1.method1136(-66);
        } else if (arg2 == 3) {
            int var22 = arg1.method1172((byte) 111);
            this.field2335 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2335[var23][0] = arg1.method1134(-16848);
                this.field2335[var23][1] = arg1.method1168(255);
                this.field2335[var23][2] = arg1.method1168(255);
            }
        } else if (arg2 == 4) {
            int var4 = arg1.method1172((byte) 71);
            this.field2339 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2339[var5][0] = arg1.method1134(-16848);
                this.field2339[var5][1] = arg1.method1168(255);
                this.field2339[var5][2] = arg1.method1168(255);
            }
            return;
        } else if (arg2 == 5) {
            arg1.method1134(-16848);
            return;
        } else if (arg2 == 6) {
            arg1.method1172((byte) 6);
            return;
        } else if (arg2 == 7) {
            arg1.method1172((byte) -120);
            return;
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method1172((byte) 52);
                return;
            }
            if (arg2 != 10) {
                if (arg2 == 12) {
                    arg1.method1168(255);
                    return;
                }
                if (arg2 == 13) {
                    int var6 = arg1.method1172((byte) 54);
                    this.field2336 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field2336[var7] = arg1.method1134(-16848);
                    }
                    return;
                }
                if (arg2 == 14) {
                    int var8 = arg1.method1172((byte) -115);
                    this.field2338 = new int[var8][2];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field2338[var9][0] = arg1.method1172((byte) 69);
                        this.field2338[var9][1] = arg1.method1172((byte) 125);
                    }
                    return;
                }
                if (arg2 == 15) {
                    arg1.method1134(arg0 ^ 0xFFFFF5D0);
                    return;
                }
                if (arg2 == 17) {
                    this.field2351 = arg1.method1134(-16848);
                    return;
                }
                if (arg2 == 18) {
                    int var18 = arg1.method1172((byte) -110);
                    this.field2346 = new int[var18];
                    this.field2358 = new String[var18];
                    this.field2344 = new int[var18];
                    this.field2349 = new int[var18];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field2344[var19] = arg1.method1168(255);
                        this.field2349[var19] = arg1.method1168(255);
                        this.field2346[var19] = arg1.method1168(255);
                        this.field2358[var19] = arg1.method1186(-1);
                    }
                } else if (arg2 == 19) {
                    int var10 = arg1.method1172((byte) 126);
                    this.field2353 = new int[var10];
                    this.field2357 = new String[var10];
                    this.field2356 = new int[var10];
                    this.field2341 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field2353[var11] = arg1.method1168(255);
                        this.field2341[var11] = arg1.method1168(255);
                        this.field2356[var11] = arg1.method1168(255);
                        this.field2357[var11] = arg1.method1186(-1);
                    }
                    return;
                } else if (arg2 == 249) {
                    int var12 = arg1.method1172((byte) -28);
                    if (this.field2343 == null) {
                        int var13 = class169.method1230(arg0 ^ 0x4BE0, var12);
                        this.field2343 = new class155(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg1.method1172((byte) -27) == 1;
                        int var16 = arg1.method1178((byte) 63);
                        class449 var17;
                        if (var15) {
                            var17 = new class69(arg1.method1186(-1));
                        } else {
                            var17 = new class478(arg1.method1168(255));
                        }
                        this.field2343.method1100(var17, -120, (long) var16);
                    }
                    return;
                }
                return;
            }
            int var20 = arg1.method1172((byte) 56);
            this.field2355 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field2355[var21] = arg1.method1168(255);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BZ)V")
    public static final void method1201(byte arg0, boolean arg1) {
        field2354++;
        if (arg1) {
            if (class238.field3475 != -1) {
                class372.method2273(class238.field3475, 7);
            }
            for (class249 var2 = (class249) class310.field4399.method1097(64); var2 != null; var2 = (class249) class310.field4399.method1105(false)) {
                if (!var2.method2715(-104)) {
                    var2 = (class249) class310.field4399.method1097(64);
                    if (var2 == null) {
                        break;
                    }
                }
                class365.method2240(var2, 9662, false, true);
            }
            class238.field3475 = -1;
            class310.field4399 = new class155(8);
            class477.method2823(true);
            class238.field3475 = class291.field4123;
            class464.method2770((byte) -86, false);
            class125.method947(-88);
            class457.method2740(class238.field3475);
        }
        class1.method1(false);
        class377.field5197 = -1;
        class486.method2863(-1, class193.field2875);
        int var3 = -125 % ((-arg0 - 22) / 34);
        class262.field3781 = new class39();
        class262.field3781.field4530 = 6656;
        class262.field3781.field4537 = 6656;
        class262.field3781.field5811[0] = 52;
        class184.field2784 = 0;
        class135.field1884 = 0;
        class262.field3781.field5807[0] = 52;
        if (class390.field5393 == 2) {
            class184.field2784 = class103.field1456 << 7;
            class135.field1884 = class352.field4836 << 7;
        } else {
            class168.method1220((byte) -92);
        }
        class161.method1146(1046693472);
        if (class135.field1884 == 0 || class184.field2784 == 0) {
            class237.method1649(10, false);
        } else {
            class243.method1686(-119);
            class237.method1649(28, false);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLkk;)V")
    public final void method1202(boolean arg0, class161 arg1) {
        if (arg0) {
            this.field2357 = null;
        }
        while (true) {
            int var3 = arg1.method1172((byte) -127);
            if (var3 == 0) {
                field2342++;
                return;
            }
            this.method1200(19424, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public final void method1203(int arg0) {
        if (arg0 >= -110) {
            this.field2346 = null;
        }
        field2352++;
        if (this.field2337 == null) {
            this.field2337 = this.field2340;
        }
    }
}
