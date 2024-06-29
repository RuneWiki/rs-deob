import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 extends class6 {

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[J")
    private long[] field415 = new long[10];

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    private int field422 = 1;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    private int field423 = 256;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    private int field420 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "J")
    private long field413 = class80.method491(2);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lai;")
    public static class10 field414 = class44.method278("und Ihr Passwort ein)3", -53);

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lai;")
    public static class10 field418 = class44.method278("null", 91);

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lai;")
    public static class10 field421 = class44.method278("::fpsoff", 110);

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BIIII)V")
    public static final void method178(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -124) {
            method180(23, 30);
        }
        if (class135.field2539 == 0 && !class32.field482) {
            class107.method692(class10.field119, 35, arg4 - arg2, 0, arg1 - arg3, class79.field1397, arg0 ^ 0x4);
            class191.field3632++;
        }
        field424++;
        int var5 = -1;
        for (int var6 = 0; var6 < class164.field3133; var6++) {
            int var7 = class164.field3134[var6];
            int var8 = var7 >> 7 & 0x7F;
            int var9 = var7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && class36.field560.method588(class42.field687, var9, var8, var7) >= 0) {
                    class47 var12 = class184.method1189(var11, 6);
                    if (var12.field788 != null) {
                        var12 = var12.method299(false);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class135.field2539 == 1) {
                        class102.field1916++;
                        class107.method692(class67.method440(0, new class10[] { class141.field2660, class98.field1806, var12.field809 }), 28, var8, var7, var9, class34.field528, arg0 ^ 0xE);
                    } else if (!class32.field482) {
                        class82.field1431++;
                        class10[] var13 = var12.field780;
                        if (class189.field3603) {
                            var13 = class129.method905(var13, 0);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class151.field2903++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 32;
                                    }
                                    if (var14 == 1) {
                                        var15 = 4;
                                    }
                                    if (var14 == 2) {
                                        var15 = 25;
                                    }
                                    if (var14 == 3) {
                                        var15 = 51;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1003;
                                    }
                                    class107.method692(class67.method440(0, new class10[] { class174.field3357, var12.field809 }), var15, var8, var7, var9, var13[var14], arg0 - 3);
                                }
                            }
                        }
                        class107.method692(class67.method440(0, new class10[] { class174.field3357, var12.field809 }), 1006, var8, var12.field830 << 14, var9, class36.field580, -117);
                    } else if ((class49.field871 & 0x4) == 4) {
                        class74.field1270++;
                        class107.method692(class67.method440(0, new class10[] { class33.field501, class98.field1806, var12.field809 }), 16, var8, var7, var9, class3.field30, -118);
                    }
                }
                if (var10 == 1) {
                    class125 var16 = class168.field3249[var11];
                    if (var16.field2386.field3575 == 1 && (var16.field1100 & 0x7F) == 64 && (var16.field1097 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class93.field1690; var17++) {
                            class125 var20 = class168.field3249[class166.field3187[var17]];
                            if (var20 != null && var16 != var20 && var20.field2386.field3575 == 1 && var16.field1100 == var20.field1100 && var16.field1097 == var20.field1097) {
                                class186.method1196(class166.field3187[var17], -1166, var8, var20.field2386, var9);
                            }
                        }
                        for (int var18 = 0; var18 < class189.field3616; var18++) {
                            class38 var19 = class2.field10[class174.field3355[var18]];
                            if (var19 != null && var16.field1100 == var19.field1100 && var16.field1097 == var19.field1097) {
                                class26.method171(class174.field3355[var18], var9, 78, var19, var8);
                            }
                        }
                    }
                    class186.method1196(var11, arg0 ^ 0x4F6, var8, var16.field2386, var9);
                }
                if (var10 == 0) {
                    class38 var21 = class2.field10[var11];
                    if ((var21.field1100 & 0x7F) == 64 && (var21.field1097 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class93.field1690; var22++) {
                            class125 var25 = class168.field3249[class166.field3187[var22]];
                            if (var25 != null && var25.field2386.field3575 == 1 && var21.field1100 == var25.field1100 && var21.field1097 == var25.field1097) {
                                class186.method1196(class166.field3187[var22], arg0 - 1042, var8, var25.field2386, var9);
                            }
                        }
                        for (int var23 = 0; var23 < class189.field3616; var23++) {
                            class38 var24 = class2.field10[class174.field3355[var23]];
                            if (var24 != null && var21 != var24 && var21.field1100 == var24.field1100 && var21.field1097 == var24.field1097) {
                                class26.method171(class174.field3355[var23], var9, 42, var24, var8);
                            }
                        }
                    }
                    class26.method171(var11, var9, 121, var21, var8);
                }
                if (var10 == 3) {
                    class192 var26 = class33.field508[class42.field687][var9][var8];
                    if (var26 != null) {
                        for (class42 var27 = (class42) var26.method1219(-14190); var27 != null; var27 = (class42) var26.method1221((byte) 121)) {
                            class94 var28 = class104.method678(500, var27.field694);
                            if (class135.field2539 == 1) {
                                class107.method692(class67.method440(arg0 + 124, new class10[] { class141.field2660, class42.field700, var28.field1718 }), 36, var8, var27.field694, var9, class34.field528, -126);
                                class174.field3350++;
                            } else if (!class32.field482) {
                                class66.field1147++;
                                class10[] var29 = var28.field1738;
                                if (class189.field3603) {
                                    var29 = class129.method905(var29, 0);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class14.field223++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 11;
                                        }
                                        if (var30 == 1) {
                                            var31 = 58;
                                        }
                                        if (var30 == 2) {
                                            var31 = 46;
                                        }
                                        if (var30 == 3) {
                                            var31 = 29;
                                        }
                                        if (var30 == 4) {
                                            var31 = 48;
                                        }
                                        class107.method692(class67.method440(arg0 ^ 0xFFFFFF84, new class10[] { class116.field2220, var28.field1718 }), var31, var8, var27.field694, var9, var29[var30], -124);
                                    } else if (var30 == 2) {
                                        class7.field81++;
                                        class107.method692(class67.method440(0, new class10[] { class116.field2220, var28.field1718 }), 46, var8, var27.field694, var9, class176.field3368, arg0 + 7);
                                    }
                                }
                                class107.method692(class67.method440(arg0 ^ 0xFFFFFF84, new class10[] { class116.field2220, var28.field1718 }), 1007, var8, var27.field694, var9, class36.field580, -121);
                            } else if ((class49.field871 & 0x1) == 1) {
                                class107.method692(class67.method440(arg0 ^ 0xFFFFFF84, new class10[] { class33.field501, class42.field700, var28.field1718 }), 5, var8, var27.field694, var9, class3.field30, -124);
                                class136.field2554++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public final void method17(int arg0) {
        field427++;
        int var2 = 62 % ((arg0 + 12) / 60);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field415[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method179(int arg0) {
        field421 = null;
        field418 = null;
        field414 = null;
        int var1 = -110 % ((arg0 - 31) / 42);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lhb;")
    public static final class67 method180(int arg0, int arg1) {
        field416++;
        class67 var2 = (class67) class144.field2719.method222(-32, (long) arg1);
        if (arg0 != 127) {
            method179(56);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class192.field3653.method159((byte) 120, arg1, 14);
        class67 var4 = new class67();
        if (var3 != null) {
            var4.method442(-92, new class114(var3));
        }
        class144.field2719.method225(arg0 ^ 0xFFFFACA3, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class28() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field415[var1] = this.field413;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)I")
    public static final int method181(int arg0, int arg1, int arg2) {
        if (arg2 != 18956) {
            return 47;
        }
        field419++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
    public final int method19(int arg0, int arg1, int arg2) {
        if (arg0 != -580924254) {
            return -5;
        }
        field425++;
        int var4 = this.field423;
        this.field423 = 300;
        int var5 = this.field422;
        this.field422 = 1;
        this.field413 = class80.method491(arg0 + 580924256);
        if (this.field415[this.field426] == 0L) {
            this.field423 = var4;
            this.field422 = var5;
        } else if (this.field415[this.field426] < this.field413) {
            this.field423 = (int) ((long) (arg2 * 2560) / (this.field413 - this.field415[this.field426]));
        }
        if (this.field423 < 25) {
            this.field423 = 25;
        }
        if (this.field423 > 256) {
            this.field423 = 256;
            this.field422 = (int) ((long) arg2 - (this.field413 - this.field415[this.field426]) / 10L);
        }
        if (this.field422 > arg2) {
            this.field422 = arg2;
        }
        this.field415[this.field426] = this.field413;
        this.field426 = (this.field426 + 1) % 10;
        if (this.field422 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field415[var6] != 0L) {
                    this.field415[var6] += this.field422;
                }
            }
        }
        if (this.field422 < arg1) {
            this.field422 = arg1;
        }
        int var7 = 0;
        class172.method1130((long) this.field422, (byte) -79);
        while (this.field420 < 256) {
            this.field420 += this.field423;
            var7++;
        }
        this.field420 &= 0xFF;
        return var7;
    }
}
