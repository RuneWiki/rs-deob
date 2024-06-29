import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class354 {

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    private int field5522 = 32;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Z")
    private boolean field5533 = false;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "J")
    private long field5520 = class6.method37(10828);

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    private int field5543 = 0;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    private int field5541 = 0;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    private int field5542 = 0;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[Ltf;")
    private class162[] field5547 = new class162[8];

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    private int field5549 = 0;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[Ltf;")
    private class162[] field5545 = new class162[8];

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "J")
    private long field5552 = 0L;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Z")
    private boolean field5553 = true;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "J")
    private long field5550 = 0L;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "J")
    public static long field5532 = 0L;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field5534 = 0;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
    public static boolean field5523 = false;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field5544;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    private int field5548;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Ltf;")
    private class162 field5517;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[I")
    public int[] field5530;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILtf;B)V", line = 7)
    private final void method2456(int arg0, class162 arg1, byte arg2) {
        int var4 = arg0 >> 5;
        class162 var5 = this.field5545[var4];
        field5529++;
        if (var5 == null) {
            this.field5547[var4] = arg1;
        } else {
            var5.field2309 = arg1;
        }
        this.field5545[var4] = arg1;
        if (arg2 == 30) {
            arg1.field2307 = arg0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V", line = 28)
    private final void method2457(byte arg0, int arg1) {
        field5551++;
        this.field5542 -= arg1;
        if (this.field5542 < 0) {
            this.field5542 = 0;
        }
        if (this.field5517 != null) {
            this.field5517.method282(arg1);
        }
        if (arg0 > -51) {
            this.field5548 = -98;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 46)
    public final void method2458(int arg0) {
        if (arg0 == 2) {
            field5536++;
            this.field5553 = true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)V", line = 58)
    public static final void method2459(int arg0, int arg1, boolean arg2) {
        class42 var3 = class166.method1242(7, arg0, -1249071392);
        var3.method307((byte) -125);
        field5526++;
        var3.field523 = arg1;
        if (!arg2) {
            method2461(-76);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 72)
    public final synchronized void method2460(byte arg0) {
        field5535++;
        if (this.field5533) {
            return;
        }
        if (arg0 >= -100) {
            this.method2458(32);
        }
        long var2 = class6.method37(10828);
        try {
            if ((this.field5520 + 500000L) < var2) {
                this.field5520 = var2 - 500000L;
            }
            while (this.field5520 + 5000L < var2) {
                this.method2457((byte) -120, 256);
                this.field5520 += (long) (256000 / class85.field1091);
            }
        } catch (Exception var9) {
            this.field5520 = var2;
        }
        if (this.field5530 == null) {
            return;
        }
        try {
            if (this.field5552 != 0L) {
                if (var2 < this.field5552) {
                    return;
                }
                this.method27(this.field5546);
                this.field5553 = true;
                this.field5552 = 0L;
            }
            int var5 = this.method31();
            if (this.field5549 < this.field5543 - var5) {
                this.field5549 = this.field5543 - var5;
            }
            int var6 = this.field5548 + this.field5544;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field5546) {
                this.field5546 += 1024;
                var5 = 0;
                if (this.field5546 > 16384) {
                    this.field5546 = 16384;
                }
                this.method32();
                this.method27(this.field5546);
                if (this.field5546 < (var6 + 256)) {
                    var6 = this.field5546 - 256;
                    this.field5548 = var6 - this.field5544;
                }
                this.field5553 = true;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method2468(this.field5530, 256);
                this.method33();
            }
            if (var2 > this.field5550) {
                if (this.field5553) {
                    this.field5553 = false;
                } else if (this.field5549 == 0 && this.field5541 == 0) {
                    this.method32();
                    this.field5552 = var2 + 2000L;
                    return;
                } else {
                    this.field5548 = Math.min(this.field5541, this.field5549);
                    this.field5541 = this.field5549;
                }
                this.field5549 = 0;
                this.field5550 = var2 + 2000L;
            }
            this.field5543 = var5;
        } catch (Exception var8) {
            this.method32();
            this.field5552 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 193)
    public void method27(int arg0) throws Exception {
        field5531++;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 201)
    public static final void method2461(int arg0) {
        field5516++;
        class328.method2268(0, false);
        class152.field2137 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class101.field1316.length; var2++) {
            if (class182.field2484[var2] != -1 && class101.field1316[var2] == null) {
                class101.field1316[var2] = class5.field61.method1089(class182.field2484[var2], (byte) 114, 0);
                if (class101.field1316[var2] == null) {
                    var1 = false;
                    class152.field2137++;
                }
            }
            if (class294.field4286[var2] != -1 && class48.field649[var2] == null) {
                class48.field649[var2] = class5.field61.method1078(0, class294.field4286[var2], class356.field5573[var2], 0);
                if (class48.field649[var2] == null) {
                    var1 = false;
                    class152.field2137++;
                }
            }
            if (class47.field623) {
                if (class75.field994[var2] != -1 && class305.field4461[var2] == null) {
                    class305.field4461[var2] = class5.field61.method1089(class75.field994[var2], (byte) 116, 0);
                    if (class305.field4461[var2] == null) {
                        var1 = false;
                        class152.field2137++;
                    }
                }
                if (class303.field4442[var2] != -1 && class264.field3838[var2] == null) {
                    class264.field3838[var2] = class5.field61.method1089(class303.field4442[var2], (byte) 122, 0);
                    if (class264.field3838[var2] == null) {
                        class152.field2137++;
                        var1 = false;
                    }
                }
            }
            if (class45.field550 != null && class277.field3972[var2] == null && class45.field550[var2] != -1) {
                class277.field3972[var2] = class5.field61.method1078(0, class45.field550[var2], class356.field5573[var2], 0);
                if (class277.field3972[var2] == null) {
                    var1 = false;
                    class152.field2137++;
                }
            }
        }
        if (class260.field3764 == null) {
            if (class67.field862 == null || !class114.field1473.method1061(class67.field862.field4567 + "_labels", arg0 + 4)) {
                class260.field3764 = new class10(0);
            } else if (class114.field1473.method1082(class67.field862.field4567 + "_labels", 2)) {
                class260.field3764 = class221.method1606(class114.field1473, -2, class67.field862.field4567 + "_labels", class225.field3244);
            } else {
                class152.field2137++;
                var1 = false;
            }
        }
        if (!var1) {
            class191.field2648 = 1;
            return;
        }
        class355.field5564 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class101.field1316.length; var4++) {
            byte[] var5 = class48.field649[var4];
            if (var5 != null) {
                int var6 = (class305.field4457[var4] >> 8) * 64 - class331.field4867;
                int var7 = (class305.field4457[var4] & 0xFF) * 64 - class355.field5556;
                if (class48.field644) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class169.method1255(0, var7, var6, var5);
            }
            if (class47.field623) {
                byte[] var8 = class264.field3838[var4];
                if (var8 != null) {
                    int var9 = (class305.field4457[var4] >> 8) * 64 - class331.field4867;
                    int var10 = (class305.field4457[var4] & 0xFF) * 64 - class355.field5556;
                    if (class48.field644) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class169.method1255(0, var10, var9, var8);
                }
            }
        }
        if (!var3) {
            class191.field2648 = 2;
            return;
        }
        boolean var11 = false;
        if (class191.field2648 != 0) {
            class190.method1383((byte) -57, class207.field2885 + "<br>(100%)", true);
        }
        class323.method2235(false);
        class195.method1408(-7603);
        if (class47.field623 && class177.field2436) {
            for (int var12 = 0; var12 < class101.field1316.length; var12++) {
                if (class264.field3838[var12] != null || class305.field4461[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class289.method1985(4, 104, 104, class47.field623 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class231.field3312[var13].method56(arg0 + 11742);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class9.field101[var14][var15][var16] = 0;
                }
            }
        }
        class291.method1996(false, 14713);
        if (class47.field623) {
            class151.field2132.method1174();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class151.field2133[var17][var18].field12 = true;
                }
            }
        }
        if (class47.field623) {
            class22.method135();
        }
        if (class47.field623) {
            class102.method725(false);
        }
        class323.method2235(false);
        System.gc();
        class328.method2268(0, true);
        class304.method2131(false, (byte) -15);
        if (!class48.field644) {
            class217.method1576(false, arg0 ^ 0xFFFFFFFB);
            class328.method2268(0, true);
            if (class47.field623) {
                int var19 = class359.field5616.field4842[0] >> 3;
                int var20 = class359.field5616.field4936[0] >> 3;
                class44.method314(var19, var20, 1);
            }
            class190.method1377(24505, false);
            if (class277.field3972 != null) {
                class290.method1989((byte) 91);
            }
        }
        if (class48.field644) {
            class88.method643(false, false);
            class328.method2268(arg0 ^ 0xFFFFFFFA, true);
            if (class47.field623) {
                int var21 = class359.field5616.field4936[0] >> 3;
                int var22 = class359.field5616.field4842[0] >> 3;
                class44.method314(var22, var21, 1);
            }
            class288.method1973(false, 13371);
        }
        class195.method1408(-7603);
        class328.method2268(0, true);
        class191.method1384(class231.field3312, (byte) 71, class48.field644 ? class305.field4460 : (int[][][]) null, false);
        if (class47.field623) {
            class22.method147();
        }
        class328.method2268(arg0 ^ arg0, true);
        int var23 = class247.field3602;
        if (var23 > class56.field724) {
            var23 = class56.field724;
        }
        if (var23 < class56.field724 - 1) {
            int var24 = class56.field724 - 1;
        }
        if (class138.method1038(true)) {
            class273.method1856(0);
        } else {
            class273.method1856(class247.field3602);
        }
        class99.method709(1);
        if (class47.field623 && var11) {
            class85.method621(true);
            class304.method2131(true, (byte) -15);
            if (!class48.field644) {
                class217.method1576(true, 1);
                class328.method2268(0, true);
                class190.method1377(24505, true);
            }
            if (class48.field644) {
                class88.method643(true, false);
                class328.method2268(0, true);
                class288.method1973(true, 13371);
            }
            class195.method1408(-7603);
            class328.method2268(0, true);
            class191.method1384(class231.field3312, (byte) 71, class48.field644 ? class305.field4460 : (int[][][]) null, true);
            class328.method2268(0, true);
            class99.method709(1);
            class85.method621(false);
        }
        if (class47.field623) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class151.field2133[var25][var26].method7(class74.field978[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class273.method1855(var27, var28, -14327);
            }
        }
        class44.method312(124);
        class323.method2235(false);
        class190.method1381(arg0 ^ 0xFFFFFF8E);
        class195.method1408(-7603);
        class171.field2372 = false;
        if (class47.field623) {
            class351.method2446(arg0 - 3466, true);
        }
        if (class288.field4173 != null && class265.field3848 != null && class316.field4661 == 25) {
            class251.field3681.method1309(23, 236);
            class302.field4417++;
            class251.field3681.method2084(true, 1057001181);
        }
        if (!class48.field644) {
            int var29 = (class253.field3699 - 6) / 8;
            int var30 = (class253.field3699 + 6) / 8;
            int var31 = (class289.field4179 - 6) / 8;
            int var32 = (class289.field4179 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var29 || var33 > var30 || var34 < var31 || var32 < var34) {
                        class5.field61.method1074(22, "m" + var33 + "_" + var34);
                        class5.field61.method1074(71, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class316.field4661 == 28) {
            class59.method445(10, (byte) 117);
        } else {
            class59.method445(30, (byte) 90);
            if (class265.field3848 != null) {
                class251.field3681.method1309(arg0 ^ 0xFFFFFFED, 113);
            }
        }
        class280.method1889(false);
        class323.method2235(false);
        class233.method1658((byte) 53);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 702)
    public final synchronized void method2462(int arg0) {
        if (arg0 != 14680) {
            this.method2457((byte) 53, 98);
        }
        field5540++;
        if (class82.field1063 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class82.field1063.field5579[var3] == this) {
                    class82.field1063.field5579[var3] = null;
                }
                if (class82.field1063.field5579[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class82.field1063.field5576 = true;
                while (class82.field1063.field5583) {
                    class177.method1299((byte) 64, 50L);
                }
                class82.field1063 = null;
            }
        }
        this.method32();
        this.field5533 = true;
        this.field5530 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()I", line = 746)
    public int method31() throws Exception {
        field5525++;
        return this.field5546;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILfh;I)Lfe;", line = 757)
    public static final class153 method2463(int arg0, int arg1, class140 arg2, int arg3) {
        field5528++;
        if (class134.method1020(1, arg2, arg3, arg1)) {
            if (arg0 != 32) {
                method2461(10);
            }
            return class235.method1674(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V", line = 772)
    public void method32() {
        field5539++;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "()V", line = 779)
    public void method33() throws Exception {
        field5537++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 789)
    public void method29(Component arg0) throws Exception {
        field5519++;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V", line = 796)
    public static final void method2464(int arg0) {
        field5538++;
        int var1 = 0 / ((arg0 + 24) / 36);
        if (class232.field3333) {
            return;
        }
        class311.field4573 = true;
        if (class48.field638) {
            class247.field3601 = (float) ((int) class247.field3601 - 65 & 0xFFFFFF80);
        } else {
            class206.field2874 += (-class206.field2874 - 24.0F) / 2.0F;
        }
        class232.field3333 = true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ltf;I)V", line = 830)
    public final synchronized void method2465(class162 arg0, int arg1) {
        if (arg1 == 8) {
            field5527++;
            this.field5517 = arg0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 851)
    public final synchronized void method2466(byte arg0) {
        this.field5553 = true;
        field5518++;
        try {
            int var2 = -5 / ((-arg0) / 39);
            this.method28();
        } catch (Exception var4) {
            this.method32();
            this.field5552 = class6.method37(10828) + 2000L;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILwf;II)V", line = 871)
    public static final void method2467(int arg0, int arg1, class333 arg2, int arg3, int arg4) {
        field5524++;
        class323.method2235(false);
        if (arg4 != 0) {
            method2463(10, 30, (class140) null, -107);
        }
        if (class47.field623) {
            class129.method989(arg0, arg3, arg2.field5056 + arg0, arg2.field5172 + arg3);
        } else {
            class37.method235(arg0, arg3, arg0 + arg2.field5056, arg3 - -arg2.field5172);
        }
        if (class160.field2292 != 2 && class160.field2292 != 5 && class48.field637 != null) {
            int var5 = (int) class247.field3601 + field5534 & 0x7FF;
            int var6 = 464 - (class359.field5616.field4893 / 32);
            int var7 = (class359.field5616.field4855 / 32) + 48;
            if (class47.field623) {
                ((class361) class48.field637).method2510(arg0, arg3, arg2.field5056, arg2.field5172, var7, var6, var5, class318.field4690 + 256, (class361) arg2.method2325(false, (byte) -18));
            } else {
                ((class11) class48.field637).method72(arg0, arg3, arg2.field5056, arg2.field5172, var7, var6, var5, class318.field4690 + 256, arg2.field5195, arg2.field5057);
            }
            if (class260.field3764 != null) {
                for (int var8 = 0; var8 < class260.field3764.field122; var8++) {
                    if (class260.field3764.field121[var8] != null && class260.field3764.field117[var8] >> 28 == class56.field724) {
                        int var9 = (class260.field3764.field117[var8] >> 14 & 0x3FFF) - class331.field4867;
                        int var10 = (class260.field3764.field117[var8] & 0x3FFF) - class355.field5556;
                        if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
                            int var11 = var9 * 4 + 2 - (class359.field5616.field4855 / 32);
                            int var12 = var10 * 4 + 2 - (class359.field5616.field4893 / 32);
                            class172.method1264(arg3, arg2, arg0, class260.field3764.field121[var8].field5493, var11, var12, arg4 + 2);
                        }
                    }
                }
            }
            for (int var13 = 0; var13 < class146.field2032; var13++) {
                int var14 = class287.field4152[var13] * 4 + 2 - (class359.field5616.field4855 / 32);
                int var15 = class211.field2984[var13] * 4 + 2 - class359.field5616.field4893 / 32;
                class219 var16 = class345.method2392(class1.field6[var13], 0);
                if (var16.field3125 != null) {
                    var16 = var16.method1589(0);
                    if (var16 == null || var16.field3111 == -1) {
                        continue;
                    }
                }
                class172.method1264(arg3, arg2, arg0, var16.field3111, var14, var15, 2);
            }
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class54 var19 = class20.field221[class56.field724][var17][var18];
                    if (var19 != null) {
                        int var20 = var17 * 4 + 2 - (class359.field5616.field4855 / 32);
                        int var21 = var18 * 4 + 2 - (class359.field5616.field4893 / 32);
                        class154.method1187(arg0, arg2, arg3, var20, arg4 ^ 0x2, var21, class67.field855[0]);
                    }
                }
            }
            for (int var22 = 0; var22 < class257.field3747; var22++) {
                class169 var23 = class251.field3688[class305.field4455[var22]];
                if (var23 != null && var23.method1251(0)) {
                    class157 var24 = var23.field2345;
                    if (var24 != null && var24.field2206 != null) {
                        var24 = var24.method1210(-37);
                    }
                    if (var24 != null && var24.field2196 && var24.field2217) {
                        int var25 = var23.field4855 / 32 - (class359.field5616.field4855 / 32);
                        int var26 = var23.field4893 / 32 - (class359.field5616.field4893 / 32);
                        if (var24.field2230 == -1) {
                            class154.method1187(arg0, arg2, arg3, var25, arg4 + 2, var26, class67.field855[1]);
                        } else {
                            class172.method1264(arg3, arg2, arg0, var24.field2230, var25, var26, arg4 ^ 0x2);
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < class112.field1441; var27++) {
                class239 var28 = class311.field4574[class288.field4157[var27]];
                if (var28 != null && var28.method1251(0)) {
                    int var29 = var28.field4855 / 32 - (class359.field5616.field4855 / 32);
                    boolean var30 = false;
                    int var31 = var28.field4893 / 32 - (class359.field5616.field4893 / 32);
                    long var32 = class201.method1476(arg4 - 120, var28.field3475);
                    for (int var34 = 0; var34 < class45.field559; var34++) {
                        if (class158.field2251[var34] == var32 && class237.field3431[var34] != 0) {
                            var30 = true;
                            break;
                        }
                    }
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class255.field3740; var36++) {
                        if (class242.field3504[var36].field304 == var32) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    if (class359.field5616.field3472 != 0 && var28.field3472 != 0 && class359.field5616.field3472 == var28.field3472) {
                        var37 = true;
                    }
                    if (var30) {
                        class154.method1187(arg0, arg2, arg3, var29, 2, var31, class67.field855[3]);
                    } else if (var35) {
                        class154.method1187(arg0, arg2, arg3, var29, arg4 + 2, var31, class67.field855[5]);
                    } else if (var37) {
                        class154.method1187(arg0, arg2, arg3, var29, arg4 ^ 0x2, var31, class67.field855[4]);
                    } else {
                        class154.method1187(arg0, arg2, arg3, var29, 2, var31, class67.field855[2]);
                    }
                }
            }
            int var38 = 0;
            class234[] var39 = class102.field1326;
            while (var39.length > var38) {
                class234 var40 = var39[var38];
                if (var40 != null && var40.field3359 != 0 && class313.field4603 % 20 < 10) {
                    if (var40.field3359 == 1 && var40.field3358 >= 0 && var40.field3358 < class251.field3688.length) {
                        class169 var41 = class251.field3688[var40.field3358];
                        if (var41 != null) {
                            int var42 = var41.field4893 / 32 - (class359.field5616.field4893 / 32);
                            int var43 = var41.field4855 / 32 - (class359.field5616.field4855 / 32);
                            class338.method2354(arg2, 360000, arg0, 7403, var42, arg3, var43, var40.field3355);
                        }
                    }
                    if (var40.field3359 == 2) {
                        int var44 = (var40.field3363 - class355.field5556) * 4 + 2 - (class359.field5616.field4893 / 32);
                        int var45 = var40.field3360 * 4;
                        int var46 = (var40.field3354 - class331.field4867) * 4 + 2 - (class359.field5616.field4855 / 32);
                        int var47 = var45 * var45;
                        class338.method2354(arg2, var47, arg0, 7403, var44, arg3, var46, var40.field3355);
                    }
                    if (var40.field3359 == 10 && var40.field3358 >= 0 && var40.field3358 < class311.field4574.length) {
                        class239 var48 = class311.field4574[var40.field3358];
                        if (var48 != null) {
                            int var49 = var48.field4855 / 32 - class359.field5616.field4855 / 32;
                            int var50 = var48.field4893 / 32 - (class359.field5616.field4893 / 32);
                            class338.method2354(arg2, 360000, arg0, 7403, var50, arg3, var49, var40.field3355);
                        }
                    }
                }
                var38++;
            }
            if (class116.field1499 != 0) {
                int var51 = class116.field1499 * 4 + (class359.field5616.method1699(-1) * 2) + 2 - (class359.field5616.field4855 / 32) - 2;
                int var52 = class5.field53 * 4 + 2 - class359.field5616.field4893 / 32 - (-(class359.field5616.method1699(arg4 + -1) * 2) + 2);
                class154.method1187(arg0, arg2, arg3, var51, 2, var52, class264.field3842[class133.field1818 ? 1 : 0]);
            }
            if (class47.field623) {
                class129.method997(arg2.field5056 / 2 + arg0 - 1, arg2.field5172 / 2 + -1 + arg3, 3, 3, 16777215);
            } else {
                class37.method231(arg2.field5056 / 2 + arg0 - 1, arg2.field5172 / 2 + arg3 + -1, 3, 3, 16777215);
            }
        } else if (class47.field623) {
            class158 var53 = arg2.method2325(false, (byte) -18);
            if (var53 != null) {
                var53.method85(arg0, arg3);
            }
        } else {
            class37.method236(arg0, arg3, 0, arg2.field5195, arg2.field5057);
        }
        class185.field2520[arg1] = true;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "()V", line = 1177)
    public void method28() throws Exception {
        field5521++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([II)V", line = 1193)
    private final void method2468(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class82.field1059) {
            var3 = arg1 << 1;
        }
        class87.method631(arg0, 0, var3);
        this.field5542 -= arg1;
        if (this.field5517 != null && this.field5542 <= 0) {
            this.field5542 += class85.field1091 >> 4;
            class353.method2455(this.field5517, (byte) 24);
            this.method2456(this.field5517.method801(), this.field5517, (byte) 30);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class162 var10 = null;
                        class162 var11 = this.field5547[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class43 var12 = var11.field2308;
                                if (var12 == null || var12.field540 <= var8) {
                                    var11.field2310 = true;
                                    int var13 = var11.method289();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field540 += var13;
                                    }
                                    if (var4 >= this.field5522) {
                                        break label105;
                                    }
                                    class162 var14 = var11.method284();
                                    if (var14 != null) {
                                        int var15 = var11.field2307;
                                        while (var14 != null) {
                                            this.method2456(var15 * var14.method801() >> 8, var14, (byte) 30);
                                            var14 = var11.method285();
                                        }
                                    }
                                    class162 var16 = var11.field2309;
                                    var11.field2309 = null;
                                    if (var10 == null) {
                                        this.field5547[var7] = var16;
                                    } else {
                                        var10.field2309 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5545[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2309;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class162 var18 = this.field5547[var17];
                this.field5547[var17] = this.field5545[var17] = null;
                while (var18 != null) {
                    class162 var19 = var18.field2309;
                    var18.field2309 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5542 < 0) {
            this.field5542 = 0;
        }
        if (this.field5517 != null) {
            this.field5517.method286(arg0, 0, arg1);
        }
        this.field5520 = class6.method37(10828);
    }
}
