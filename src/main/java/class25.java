import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 extends RuntimeException {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field324;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Ljava/lang/String;")
    public String field321;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lwa;")
    public static class75 field322 = class66.method560("Schrifts-=tze geladen)3", false);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lwa;")
    public static class75 field320 = class66.method560("Bitte warten Sie)3)3)3", false);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lgb;")
    public static class158 field323 = new class158(500);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lwa;")
    public static class75 field326 = class66.method560(":", false);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    public static int[] field327 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lwa;")
    public static class75 field329 = class66.method560("Nehmen", false);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILre;II)V", line = 9)
    public static final void method169(int arg0, class262 arg1, int arg2, int arg3) {
        field319++;
        if (arg1.field4443 == 1) {
            class232.method1694(-501, arg1.field4474, (short) 50, 0, class121.field2037, arg1.field4418, 0L);
            class200.field3388++;
        }
        if (arg1.field4443 == 2 && !class161.field2738) {
            class75 var4 = class48.method348(113, arg1);
            if (var4 != null) {
                class246.field4152++;
                class232.method1694(-501, var4, (short) 3, -1, class66.method562((byte) -64, new class75[] { class194.field3241, arg1.field4498 }), arg1.field4418, 0L);
            }
        }
        if (arg1.field4443 == 3) {
            class232.method1694(-501, class39.field601, (short) 35, 0, class121.field2037, arg1.field4418, 0L);
            class91.field1500++;
        }
        if (arg1.field4443 == 4) {
            class232.method1694(-501, arg1.field4474, (short) 16, 0, class121.field2037, arg1.field4418, 0L);
            class238.field3995++;
        }
        if (arg1.field4443 == 5) {
            class155.field2662++;
            class232.method1694(-501, arg1.field4474, (short) 28, 0, class121.field2037, arg1.field4418, 0L);
        }
        if (arg1.field4443 == 6 && class286.field4929 == null) {
            class232.method1694(-501, arg1.field4474, (short) 21, -1, class121.field2037, arg1.field4418, 0L);
            class104.field1770++;
        }
        if (arg1.field4441 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field4408; var6++) {
                for (int var7 = 0; var7 < arg1.field4429; var7++) {
                    int var8 = (arg1.field4490 + 32) * var7;
                    int var9 = (arg1.field4387 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field4388[var5];
                        var9 += arg1.field4476[var5];
                    }
                    if (arg2 >= var8 && var9 <= arg3 && arg2 < var8 + 32 && (var9 + 32) > arg3) {
                        class20.field277 = var5;
                        class180.field3019 = arg1;
                        if (arg1.field4410[var5] > 0) {
                            class278 var10 = class199.method1475(arg1.field4410[var5] - 1, (byte) 114);
                            if (class13.field176 == 1 && class106.method827(true, client.method1734(arg1))) {
                                if (class158.field2715 != arg1.field4418 || class281.field4846 != var5) {
                                    class154.field2646++;
                                    class232.method1694(-501, class244.field4110, (short) 12, var5, class66.method562((byte) -54, new class75[] { class237.field3994, class305.field5209, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                }
                            } else if (!class161.field2738 || !class106.method827(true, client.method1734(arg1))) {
                                class75[] var11 = var10.field4769;
                                if (class78.field1344) {
                                    var11 = class54.method395(var11, true);
                                }
                                class304.field5204++;
                                if (class106.method827(true, client.method1734(arg1))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 33;
                                            } else {
                                                var13 = 32;
                                            }
                                            class166.field2804++;
                                            class232.method1694(-501, var11[var12], var13, var5, class66.method562((byte) 115, new class75[] { class98.field1631, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                        } else if (var12 == 4) {
                                            class232.method1694(-501, class43.field705, (short) 32, var5, class66.method562((byte) 124, new class75[] { class98.field1631, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                            class125.field2089++;
                                        }
                                    }
                                }
                                if (class242.method1766(11680, client.method1734(arg1))) {
                                    class232.method1694(-501, class244.field4110, (short) 38, var5, class66.method562((byte) -67, new class75[] { class98.field1631, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                    class187.field3125++;
                                }
                                if (class106.method827(true, client.method1734(arg1)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class156.field2683++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 7;
                                            }
                                            if (var14 == 1) {
                                                var15 = 24;
                                            }
                                            if (var14 == 2) {
                                                var15 = 11;
                                            }
                                            class232.method1694(-501, var11[var14], var15, var5, class66.method562((byte) 126, new class75[] { class98.field1631, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                        }
                                    }
                                }
                                class75[] var16 = arg1.field4502;
                                if (class78.field1344) {
                                    var16 = class54.method395(var16, true);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class42.field683++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 29;
                                            }
                                            if (var17 == 1) {
                                                var18 = 20;
                                            }
                                            if (var17 == 2) {
                                                var18 = 18;
                                            }
                                            if (var17 == 3) {
                                                var18 = 14;
                                            }
                                            if (var17 == 4) {
                                                var18 = 40;
                                            }
                                            class232.method1694(-501, var16[var17], var18, var5, class66.method562((byte) -105, new class75[] { class98.field1631, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                        }
                                    }
                                }
                                class232.method1694(-501, class245.field4122, (short) 1002, var5, class66.method562((byte) -42, new class75[] { class98.field1631, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                            } else if ((class123.field2056 & 0x10) == 16) {
                                class232.method1694(-501, class197.field3307, (short) 30, var5, class66.method562((byte) 118, new class75[] { class215.field3673, class305.field5209, var10.field4770 }), arg1.field4418, (long) var10.field4786);
                                class7.field93++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg0 >= -67) {
            field320 = (class75) null;
        }
        if (!arg1.field4540) {
            return;
        }
        if (!class161.field2738) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class75 var20 = class2.method6((byte) 110, var19, arg1);
                if (var20 != null) {
                    class173.field2912++;
                    class232.method1694(-501, var20, (short) 1007, arg1.field4382, arg1.field4524, arg1.field4418, (long) (var19 + 1));
                }
            }
            class75 var21 = class48.method348(114, arg1);
            if (var21 != null) {
                class246.field4152++;
                class232.method1694(-501, var21, (short) 3, arg1.field4382, arg1.field4524, arg1.field4418, 0L);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class75 var23 = class2.method6((byte) 46, var22, arg1);
                if (var23 != null) {
                    class232.method1694(-501, var23, (short) 22, arg1.field4382, arg1.field4524, arg1.field4418, (long) (var22 + 1));
                    class173.field2912++;
                }
            }
            if (class17.method101(client.method1734(arg1), 1)) {
                class232.method1694(-501, class297.field5079, (short) 21, arg1.field4382, class121.field2037, arg1.field4418, 0L);
                class104.field1770++;
            }
        } else if (class212.method1565(-27287, client.method1734(arg1)) && (class123.field2056 & 0x20) == 32) {
            class232.method1694(-501, class197.field3307, (short) 23, arg1.field4382, class66.method562((byte) -50, new class75[] { class215.field3673, class61.field1083, arg1.field4524 }), arg1.field4418, 0L);
            class210.field3592++;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 342)
    public class25(Throwable arg0, String arg1) {
        this.field324 = arg0;
        this.field321 = arg1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 357)
    public static void method170(byte arg0) {
        field326 = null;
        int var1 = 32 / ((22 - arg0) / 43);
        field327 = null;
        field322 = null;
        field329 = null;
        field320 = null;
        field323 = null;
    }
}
