import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class212 extends class135 {

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "[I")
    public static int[] field3314 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Lvj;")
    public static class115 field3316 = new class115(64);

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Lpk;")
    private class100 field3323;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILlj;I)V")
    private final void method1431(int arg0, class25 arg1, int arg2) {
        field3310++;
        if (arg2 == 249) {
            int var4 = arg1.method201(255);
            if (this.field3323 == null) {
                int var5 = class279.method1869((byte) -75, var4);
                this.field3323 = new class100(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method201(255) == 1;
                int var8 = arg1.method215((byte) 98);
                class120 var9;
                if (var7) {
                    var9 = new class2(arg1.method189(false));
                } else {
                    var9 = new class179(arg1.method214((byte) 44));
                }
                this.field3323.method662(0, var9, (long) var8);
            }
        }
        if (arg0 < 59) {
            this.field3323 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static final void method1432(int arg0) {
        field3318++;
        int var1 = class58.field817 * 128 + 64;
        int var2 = class168.field2642 * 128 + 64;
        int var3 = class99.method658(var2, class276.field4398, var1, -7185) - class203.field3177;
        if (class243.field3887 < 100) {
            if (var3 > class96.field1487) {
                class96.field1487 += (var3 - class96.field1487) * class243.field3887 / 1000 + class145.field2145;
                if (class96.field1487 > var3) {
                    class96.field1487 = var3;
                }
            }
            if (class96.field1487 > var3) {
                class96.field1487 -= (class96.field1487 - var3) * class243.field3887 / 1000 + class145.field2145;
                if (var3 > class96.field1487) {
                    class96.field1487 = var3;
                }
            }
            if (class66.field918 < var1) {
                class66.field918 += (var1 - class66.field918) * class243.field3887 / 1000 + class145.field2145;
                if (var1 < class66.field918) {
                    class66.field918 = var1;
                }
            }
            if (var2 > class54.field750) {
                class54.field750 += (var2 - class54.field750) * class243.field3887 / 1000 + class145.field2145;
                if (var2 < class54.field750) {
                    class54.field750 = var2;
                }
            }
            if (var1 < class66.field918) {
                class66.field918 -= class145.field2145 + ((class66.field918 - var1) * class243.field3887 / 1000);
                if (class66.field918 < var1) {
                    class66.field918 = var1;
                }
            }
            if (var2 < class54.field750) {
                class54.field750 -= (class54.field750 - var2) * class243.field3887 / 1000 + class145.field2145;
                if (class54.field750 < var2) {
                    class54.field750 = var2;
                }
            }
        } else {
            class66.field918 = class58.field817 * 128 + 64;
            class54.field750 = class168.field2642 * 128 + 64;
            class96.field1487 = class99.method658(class54.field750, class276.field4398, class66.field918, -7185) - class203.field3177;
        }
        int var4 = class115.field1708 * 128 + 64;
        int var5 = class178.field2784 * 128 + 64;
        int var6 = class99.method658(var5, class276.field4398, var4, -7185) - class3.field30;
        int var7 = var4 - class66.field918;
        int var8 = var6 - class96.field1487;
        int var9 = var5 - class54.field750;
        if (arg0 > -15) {
            return;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        int var13 = var12 - class77.field1092;
        if (var11 > class215.field3516) {
            class215.field3516 += class17.field200 + ((var11 - class215.field3516) * class98.field1527 / 1000);
            if (class215.field3516 > var11) {
                class215.field3516 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < class215.field3516) {
            class215.field3516 -= (class215.field3516 - var11) * class98.field1527 / 1000 + class17.field200;
            if (class215.field3516 < var11) {
                class215.field3516 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class77.field1092 += class17.field200 + (class98.field1527 * var13 / 1000);
            class77.field1092 &= 0x7FF;
        }
        if (var13 < 0) {
            class77.field1092 -= -var13 * class98.field1527 / 1000 + class17.field200;
            class77.field1092 &= 0x7FF;
        }
        int var14 = var12 - class77.field1092;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class77.field1092 = var12;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Llj;Z)V")
    public final void method1433(class25 arg0, boolean arg1) {
        field3311++;
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    field3324 = -32;
                    return;
                }
            }
            this.method1431(121, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZII)V")
    public static final void method1434(int arg0, boolean arg1, int arg2, int arg3) {
        class287 var4 = class261.method1786(arg2, arg1, 9);
        var4.method1914((byte) 46);
        field3315++;
        var4.field4549 = arg0;
        var4.field4547 = arg3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)I")
    public final int method1435(byte arg0, int arg1, int arg2) {
        field3321++;
        if (arg0 != 123) {
            field3316 = null;
        }
        if (this.field3323 == null) {
            return arg2;
        } else {
            class179 var4 = (class179) this.field3323.method665((byte) 125, (long) arg1);
            return var4 == null ? arg2 : var4.field2791;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
    public static void method1436(boolean arg0) {
        field3314 = null;
        if (arg0) {
            field3316 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
    public final String method1437(int arg0, String arg1, boolean arg2) {
        field3309++;
        if (!arg2) {
            return null;
        } else if (this.field3323 == null) {
            return arg1;
        } else {
            class2 var4 = (class2) this.field3323.method665((byte) -85, (long) arg0);
            return var4 == null ? arg1 : var4.field20;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static final void method1438(int arg0) {
        field3312++;
        class207.field3237 = 0;
        int var1 = (class149.field2227.field1226 >> 7) + class126.field1869;
        int var2 = (class149.field2227.field1273 >> 7) + class246.field3943;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class207.field3237 = 1;
        }
        if (arg0 != 4) {
            field3324 = 77;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class207.field3237 = 1;
        }
        if (class207.field3237 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class207.field3237 = 0;
        }
    }
}
