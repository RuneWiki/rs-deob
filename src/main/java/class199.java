import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class199 extends class99 {

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Z")
    private boolean field3429 = true;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "Z")
    private boolean field3438 = true;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lr;")
    public static class66 field3425 = class93.method641(43, "");

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lr;")
    private static class66 field3427 = class93.method641(43, "Loaded interfaces");

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lr;")
    public static class66 field3426 = field3427;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
    public static int field3441 = 0;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "Lr;")
    private static class66 field3440 = class93.method641(43, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Lr;")
    public static class66 field3428 = field3440;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "[I")
    public static int[] field3443;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "[Ldh;")
    public static class265[] field3431;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        ++field3435;
        boolean var1 = false;
        if (arg0 == 6364) {
            while (!var1) {
                var1 = true;
                for (int var2 = 0; var2 < class176.field3105 + -1; ++var2) {
                    if (class43.field710[var2] < 1000 && ~class43.field710[var2 - -1] < -1001) {
                        var1 = false;
                        class66 var3 = class9.field96[var2];
                        class9.field96[var2] = class9.field96[var2 - -1];
                        class9.field96[var2 - -1] = var3;
                        class66 var4 = class25.field325[var2];
                        class25.field325[var2] = class25.field325[var2 + 1];
                        class25.field325[var2 + 1] = var4;
                        int var5 = class60.field1025[var2];
                        class60.field1025[var2] = class60.field1025[var2 - -1];
                        class60.field1025[var2 + 1] = var5;
                        int var6 = class188.field3272[var2];
                        class188.field3272[var2] = class188.field3272[var2 - -1];
                        class188.field3272[var2 - -1] = var6;
                        short var7 = class43.field710[var2];
                        class43.field710[var2] = class43.field710[var2 + 1];
                        class43.field710[var2 + 1] = var7;
                        long var8 = class70.field1414[var2];
                        class70.field1414[var2] = class70.field1414[var2 - -1];
                        class70.field1414[var2 + 1] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
    public static final int method1298(int arg0, int arg1) {
        if (arg0 > -83) {
            method1300((class40) null, (byte) 100);
        }
        ++field3430;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3439;
        int[] var3 = super.field1943.method749(false, arg1);
        if (arg0 != -61) {
            field3428 = null;
        }
        if (super.field1943.field2147) {
            int[] var4 = this.method682(0, this.field3429 ? -arg1 + class45.field833 : arg1, 29149);
            if (!this.field3438) {
                class46.method332(var4, 0, var3, 0, field3432);
            } else {
                for (int var5 = 0; field3432 > var5; ++var5) {
                    var3[var5] = var4[class98.field1914 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)Z")
    public static final boolean method1299(int arg0, int arg1) {
        ++field3433;
        if (arg0 != 32157) {
            method1298(-72, -38);
        }
        return ~(arg1 >> 20 & 1) != -1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field3444;
        int[][] var3 = super.field1946.method823(arg0, (byte) 3);
        if (super.field1946.field2297) {
            int[][] var4 = this.method683(-85, 0, !this.field3429 ? arg0 : -arg0 + class45.field833);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            if (this.field3438) {
                for (int var11 = 0; ~field3432 < ~var11; ++var11) {
                    var7[var11] = var6[-var11 + class98.field1914];
                    var9[var11] = var5[-var11 + class98.field1914];
                    var8[var11] = var10[class98.field1914 - var11];
                }
            } else {
                for (int var12 = 0; ~field3432 < ~var12; ++var12) {
                    var7[var12] = var6[var12];
                    var9[var12] = var5[var12];
                    var8[var12] = var10[var12];
                }
            }
        }
        if (!arg1) {
            field3440 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field3437;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1938 = ~arg0.method1677(-6677) == -2;
                }
            } else {
                this.field3429 = arg0.method1677(-6677) == 1;
            }
        } else {
            this.field3438 = ~arg0.method1677(-6677) == -2;
        }
        if (arg2 != -1) {
            method1299(26, 123);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lra;B)V")
    public static final void method1300(class40 arg0, byte arg1) {
        ++field3442;
        class143.method986(true);
        if (class127.field2380 == null) {
            if (!class97.field1896) {
                class60.method394(500);
            } else {
                if (class264.field4627 == 1) {
                    int var2 = class91.field1760 / 5;
                    int var3 = class105.field2027 + var2 - -140;
                    if (class188.field3274 >= var3 && class188.field3274 <= var3 + 14 && class175.field3081 + 4 <= class174.field3068 && class175.field3081 + 18 >= class174.field3068) {
                        class257.method1722(122, 0, 0);
                        return;
                    }
                    if (~class188.field3274 <= ~(var3 + 15) && var3 + 80 >= class188.field3274 && ~class174.field3068 <= ~(class175.field3081 + 4) && class175.field3081 - -18 >= class174.field3068) {
                        class257.method1722(126, 0, 1);
                        return;
                    }
                    int var4 = class105.field2027 + var2 + 250;
                    if (var4 <= class188.field3274 && ~class188.field3274 >= ~(var4 + 14) && ~(class175.field3081 - -4) >= ~class174.field3068 && ~class174.field3068 >= ~(class175.field3081 + 18)) {
                        class257.method1722(112, 1, 0);
                        return;
                    }
                    if (~class188.field3274 <= ~(var4 - -15) && ~class188.field3274 >= ~(var4 + 80) && class175.field3081 - -4 <= class174.field3068 && ~(class175.field3081 + 18) <= ~class174.field3068) {
                        class257.method1722(124, 1, 1);
                        return;
                    }
                    int var5 = class105.field2027 + var2 + 360;
                    if (var5 <= class188.field3274 && ~(var5 + 14) <= ~class188.field3274 && class174.field3068 >= class175.field3081 - -4 && class174.field3068 <= class175.field3081 + 18) {
                        class257.method1722(105, 2, 0);
                        return;
                    }
                    if (~(var5 + 15) >= ~class188.field3274 && class188.field3274 <= var5 + 80 && class174.field3068 >= class175.field3081 + 4 && ~(class175.field3081 + 18) <= ~class174.field3068) {
                        class257.method1722(115, 2, 1);
                        return;
                    }
                    int var6 = class105.field2027 + var2 + 470;
                    if (class188.field3274 >= var6 && class188.field3274 <= var6 + 14 && class174.field3068 >= class175.field3081 + 4 && ~(class175.field3081 - -18) <= ~class174.field3068) {
                        class257.method1722(112, 3, 0);
                        return;
                    }
                    if (~class188.field3274 <= ~(var6 + 15) && var6 + 80 >= class188.field3274 && ~(class175.field3081 + 4) >= ~class174.field3068 && class175.field3081 + 18 >= class174.field3068) {
                        class257.method1722(124, 3, 1);
                        return;
                    }
                    if (~class31.field463 != 0) {
                        class200 var7 = class107.field2045[class31.field463];
                        if (var7.field3447 != !class260.field4587) {
                            byte[] var8 = class212.method1372(2, new class66[] { var7.field3456, class57.field978 }).method445((byte) -110);
                            class35.field518 = new String(var8, 0, var8.length);
                            class61.field1028 = var7.field3450;
                            if (~class81.field1585 != -1) {
                                class151.field2707 = class61.field1028 + 50000;
                                class111.field2136 = class61.field1028 + 40000;
                                class89.field1732 = class111.field2136;
                            }
                            if (class78.field1540 != null) {
                                class78.field1540.field1087 = true;
                                class215.method1385(class78.field1540, -119);
                            }
                            return;
                        }
                        class66 var9 = class9.field100;
                        if (~class81.field1585 != -1) {
                            var9 = class212.method1372(2, new class66[] { class197.field3406, class144.method989(var7.field3450 + 7000, 0) });
                        }
                        class66 var10 = class212.method1372(2, new class66[] { class244.field4259, var7.field3456, class57.field978, var9, class138.field2532, class144.method989(class69.field1401, 0), class242.field4236, class144.method989(class182.field3194, 0), class184.field3216, class144.method989(0, 0), class3.field35, class144.method989(class203.field3477, 0), class196.field3399, class144.method989(class150.field2704, 0) });
                        try {
                            arg0.getAppletContext().showDocument(var10.method444(-16294), "_self");
                        } catch (Exception var11) {
                        }
                    }
                }
                if (arg1 < 63) {
                    field3432 = -85;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field3431 = null;
        if (arg0 != 1) {
            method1300((class40) null, (byte) 117);
        }
        field3426 = null;
        field3443 = null;
        field3425 = null;
        field3440 = null;
        field3427 = null;
        field3428 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lcj;Lcj;Lcj;I)V")
    public static final void method1302(class28 arg0, class28 arg1, class28 arg2, int arg3) {
        ++field3436;
        class144.field2634 = arg2;
        if (arg3 >= -72) {
            method1298(-11, 6);
        }
        class144.field2622 = arg0;
        class38.field559 = arg1;
    }
}
