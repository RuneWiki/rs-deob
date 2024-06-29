import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class303 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lok;")
    private static class146 field5195 = class235.method1724(-12908, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lok;")
    public static class146 field5196 = field5195;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[Lok;")
    public static class146[] field5198 = new class146[200];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[Lvd;")
    public static class130[] field5200 = new class130[4];

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[[B")
    public static byte[][] field5202 = new byte[250][];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lok;")
    public static class146 field5194 = class235.method1724(-12908, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    public static int[] field5197 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lok;")
    private static class146 field5204 = class235.method1724(-12908, "Loaded wordpack");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5193 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Z")
    public static boolean field5201 = false;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5207 = -1;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lok;")
    public static class146 field5199 = field5204;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field5206;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2141(byte arg0) {
        field5203++;
        if (arg0 >= -22) {
            method2142((byte) -5);
        }
        for (int var1 = 0; var1 < class151.field2574; var1++) {
            int var2 = class210.field3476[var1];
            class282 var3 = class173.field2906[var2];
            if (var3 != null) {
                class132.method981(var3, var3.field4838.field5150, (byte) 16);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 34)
    public static void method2142(byte arg0) {
        field5197 = null;
        int var1 = -93 / ((arg0 + 24) / 50);
        field5198 = null;
        field5204 = null;
        field5200 = null;
        field5195 = null;
        field5194 = null;
        field5206 = null;
        field5196 = null;
        field5202 = (byte[][]) null;
        field5199 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLoh;)V", line = 57)
    public static final void method2143(boolean arg0, class15 arg1) {
        if (arg0) {
            method2141((byte) -91);
        }
        field5208++;
        class150.field2555 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILr;IB)V", line = 101)
    public static final void method2145(int arg0, class264 arg1, int arg2, byte arg3) {
        if (arg1.field4397 == 1) {
            class135.field2269++;
            class281.method2039(arg1.field4461, 0L, (short) 49, 12241, -1, 0, class161.field2740, arg1.field4469);
        }
        field5205++;
        if (arg1.field4397 == 2 && !class272.field4668) {
            class146 var4 = class206.method1563((byte) 0, arg1);
            if (var4 != null) {
                class100.field1622++;
                class281.method2039(arg1.field4461, 0L, (short) 32, 12241, -1, -1, class112.method758(arg3 - 109, new class146[] { class113.field1826, arg1.field4484 }), var4);
            }
        }
        if (arg1.field4397 == 3) {
            class279.field4788++;
            class281.method2039(arg1.field4461, 0L, (short) 41, 12241, -1, 0, class161.field2740, class198.field3305);
        }
        if (arg1.field4397 == 4) {
            class142.field2364++;
            class281.method2039(arg1.field4461, 0L, (short) 47, 12241, -1, 0, class161.field2740, arg1.field4469);
        }
        if (arg1.field4397 == 5) {
            class276.field4742++;
            class281.method2039(arg1.field4461, 0L, (short) 40, 12241, -1, 0, class161.field2740, arg1.field4469);
        }
        if (arg3 != 26) {
            field5197 = (int[]) null;
        }
        if (arg1.field4397 == 6 && class31.field575 == null) {
            class115.field1852++;
            class281.method2039(arg1.field4461, 0L, (short) 11, 12241, -1, -1, class161.field2740, arg1.field4469);
        }
        if (arg1.field4536 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field4523; var6++) {
                for (int var7 = 0; var7 < arg1.field4445; var7++) {
                    int var8 = (arg1.field4436 + 32) * var7;
                    int var9 = (arg1.field4399 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field4458[var5];
                        var8 += arg1.field4512[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg0 && arg2 < (var8 + 32) && arg0 < (var9 + 32)) {
                        class101.field1631 = var5;
                        class51.field927 = arg1;
                        if (arg1.field4437[var5] > 0) {
                            class248 var10 = class84.method589(false, arg1.field4437[var5] - 1);
                            if (class161.field2736 == 1 && class37.method263((byte) 81, client.method1789(arg1))) {
                                if (class283.field4849 != arg1.field4461 || class281.field4827 != var5) {
                                    class281.method2039(arg1.field4461, (long) var10.field4141, (short) 14, 12241, -1, var5, class112.method758(-71, new class146[] { class281.field4825, class113.field1803, var10.field4149 }), class224.field3735);
                                    class3.field15++;
                                }
                            } else if (!class272.field4668 || !class37.method263((byte) 117, client.method1789(arg1))) {
                                class146[] var11 = var10.field4124;
                                class269.field4620++;
                                if (class236.field3939) {
                                    var11 = class229.method1683(-106, var11);
                                }
                                if (class37.method263((byte) -128, client.method1789(arg1))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class44.field758++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 17;
                                            } else {
                                                var13 = 4;
                                            }
                                            class281.method2039(arg1.field4461, (long) var10.field4141, var13, 12241, -1, var5, class112.method758(-32, new class146[] { class145.field2420, var10.field4149 }), var11[var12]);
                                        }
                                    }
                                }
                                if (class21.method150(arg3 - 26, client.method1789(arg1))) {
                                    class281.method2039(arg1.field4461, (long) var10.field4141, (short) 48, 12241, class269.field4618, var5, class112.method758(-62, new class146[] { class145.field2420, var10.field4149 }), class224.field3735);
                                    class28.field483++;
                                }
                                if (class37.method263((byte) 43, client.method1789(arg1)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 15;
                                            }
                                            class123.field2009++;
                                            if (var14 == 1) {
                                                var15 = 36;
                                            }
                                            if (var14 == 2) {
                                                var15 = 35;
                                            }
                                            class281.method2039(arg1.field4461, (long) var10.field4141, var15, arg3 + 12215, -1, var5, class112.method758(-106, new class146[] { class145.field2420, var10.field4149 }), var11[var14]);
                                        }
                                    }
                                }
                                class146[] var16 = arg1.field4520;
                                if (class236.field3939) {
                                    var16 = class229.method1683(89, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class45.field764++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 60;
                                            }
                                            if (var17 == 1) {
                                                var18 = 44;
                                            }
                                            if (var17 == 2) {
                                                var18 = 46;
                                            }
                                            if (var17 == 3) {
                                                var18 = 31;
                                            }
                                            if (var17 == 4) {
                                                var18 = 16;
                                            }
                                            class281.method2039(arg1.field4461, (long) var10.field4141, var18, arg3 + 12215, -1, var5, class112.method758(123, new class146[] { class145.field2420, var10.field4149 }), var16[var17]);
                                        }
                                    }
                                }
                                class281.method2039(arg1.field4461, (long) var10.field4141, (short) 1003, arg3 + 12215, class152.field2585, var5, class112.method758(arg3 ^ 0x61, new class146[] { class145.field2420, var10.field4149 }), class237.field3954);
                            } else if ((class180.field3023 & 0x10) == 16) {
                                class281.method2039(arg1.field4461, (long) var10.field4141, (short) 21, 12241, -1, var5, class112.method758(-94, new class146[] { class238.field3968, class113.field1803, var10.field4149 }), class135.field2257);
                                class234.field3913++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field4462) {
            return;
        }
        if (!class272.field4668) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class146 var20 = class58.method456((byte) 14, arg1, var19);
                if (var20 != null) {
                    class121.field1990++;
                    class281.method2039(arg1.field4461, (long) (var19 + 1), (short) 1006, 12241, class4.method17(var19, arg3 - 26, arg1), arg1.field4417, arg1.field4466, var20);
                }
            }
            class146 var21 = class206.method1563((byte) 0, arg1);
            if (var21 != null) {
                class100.field1622++;
                class281.method2039(arg1.field4461, 0L, (short) 32, 12241, -1, arg1.field4417, arg1.field4466, var21);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class146 var23 = class58.method456((byte) 82, arg1, var22);
                if (var23 != null) {
                    class121.field1990++;
                    class281.method2039(arg1.field4461, (long) (var22 + 1), (short) 30, 12241, class4.method17(var22, 0, arg1), arg1.field4417, arg1.field4466, var23);
                }
            }
            if (class82.method580(client.method1789(arg1), arg3 - 148)) {
                class115.field1852++;
                class281.method2039(arg1.field4461, 0L, (short) 11, 12241, -1, arg1.field4417, class161.field2740, class228.field3813);
            }
        } else if (class196.method1517((byte) -111, client.method1789(arg1)) && (class180.field3023 & 0x20) == 32) {
            class251.field4205++;
            class281.method2039(arg1.field4461, 0L, (short) 57, 12241, -1, arg1.field4417, class112.method758(-77, new class146[] { class238.field3968, class87.field1387, arg1.field4466 }), class135.field2257);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILmj;)Lmj;")
    public abstract class223 method2144(int arg0, class223 arg1);
}
