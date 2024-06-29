import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class233 extends class179 {

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lke;")
    public static class256 field3989 = class316.method2202("ul", 27626);

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lfg;")
    public static class48 field3981 = new class48();

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "Lke;")
    public static class256 field3994 = class316.method2202("OK", 27626);

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "Lke;")
    public static class256 field3990 = class316.method2202(" )2>", 27626);

    @OriginalMember(owner = "client!gh", name = "bb", descriptor = "Lke;")
    public static class256 field3992 = class316.method2202("Ausw-=hlen", 27626);

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!gh", name = "cb", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "Lla;")
    public static class188 field3984;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "(I)V", line = 4)
    public static void method1578(int arg0) {
        if (arg0 != -25530) {
            field3993 = 54;
        }
        field3994 = null;
        field3984 = null;
        field3992 = null;
        field3989 = null;
        field3990 = null;
        field3981 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V", line = 18)
    private class233(int arg0) {
        super(0, true);
        this.field3983 = 4096;
        this.field3983 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 32)
    public class233() {
        this(4096);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Llk;I)V", line = 39)
    public static final void method1579(class252 arg0, int arg1) {
        field3985++;
        class287.field4977 = arg0;
        if (arg1 != -1) {
            method1580(-12, (class188) null, -55);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILla;I)I", line = 50)
    public static final int method1580(int arg0, class188 arg1, int arg2) {
        field3988++;
        if (arg1.field3302 == null || arg0 >= arg1.field3302.length) {
            return -2;
        }
        try {
            if (arg2 != -4) {
                field3992 = (class256) null;
            }
            int[] var3 = arg1.field3302[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var4++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 1) {
                    var7 = class14.field188[var3[var4++]];
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 2) {
                    var7 = class17.field240[var3[var4++]];
                }
                if (var8 == 3) {
                    var7 = class30.field475[var3[var4++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class188 var12 = class182.method1335((byte) 102, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class254.method1753(var13, true).field590 || class21.field278)) {
                        for (int var14 = 0; var14 < var12.field3347.length; var14++) {
                            if ((var13 + 1) == var12.field3347[var14]) {
                                var7 += var12.field3351[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class97.field1741[var3[var4++]];
                }
                if (var8 == 6) {
                    var7 = class152.field2724[class17.field240[var3[var4++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class97.field1741[var3[var4++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class121.field2124.field2549;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class66.field1178[var15]) {
                            var7 += class17.field240[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class188 var18 = class182.method1335((byte) 105, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class254.method1753(var19, true).field590 || class21.field278)) {
                        for (int var20 = 0; var20 < var18.field3347.length; var20++) {
                            if (var19 + 1 == var18.field3347[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class121.field2128;
                }
                if (var8 == 12) {
                    var7 = class270.field4616;
                }
                if (var8 == 13) {
                    int var21 = class97.field1741[var3[var4++]];
                    int var22 = var3[var4++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var4++];
                    var7 = class21.method137(-7787, var23);
                }
                if (var8 == 18) {
                    var7 = (class121.field2124.field1192 >> 7) + class134.field2336;
                }
                if (var8 == 19) {
                    var7 = (class121.field2124.field1197 >> 7) + class10.field147;
                }
                if (var8 == 20) {
                    var7 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var7;
                    }
                    if (var6 == 1) {
                        var5 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var5 /= var7;
                    }
                    if (var6 == 3) {
                        var5 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "(I)V", line = 253)
    public static final void method1581(int arg0) {
        field3991++;
        if (class211.field3803 != -1) {
            class200.method1433(-21, class211.field3803);
        }
        for (int var1 = 0; var1 < class138.field2396; var1++) {
            if (class53.field974[var1]) {
                class302.field5220[var1] = true;
            }
            class308.field5331[var1] = class53.field974[var1];
            class53.field974[var1] = false;
        }
        class216.field3853 = class45.field840;
        if (class253.field4323) {
            class28.field380 = true;
        }
        class255.field4364 = -1;
        class91.field1658 = null;
        class40.field727 = -1;
        if (class211.field3803 != -1) {
            class138.field2396 = 0;
            class102.method738(class112.field1969, -1, class124.field2200, true, 0, 0, class211.field3803, 0, 0);
        }
        if (class253.field4323) {
            class60.method479();
        } else {
            class178.method1304();
        }
        class29.field398 = 0;
        if (arg0 != 2) {
            field3995 = -78;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILra;I)V", line = 308)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field3987++;
        if (arg0 < 108) {
            field3981 = (class48) null;
        }
        if (arg2 == 0) {
            this.field3983 = (arg1.method357(false) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(III)Z", line = 335)
    public static final boolean method1582(int arg0, int arg1, int arg2) {
        int var3 = class305.field5275[arg0][arg1][arg2];
        if (-class121.field2131 == var3) {
            return false;
        } else if (class121.field2131 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class101.method732(var4 + 1, class118.field2090[arg0][arg1][arg2], var5 + 1) && class101.method732(var4 + 128 - 1, class118.field2090[arg0][arg1 + 1][arg2], var5 + 1) && class101.method732(var4 + 128 - 1, class118.field2090[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class101.method732(var4 + 1, class118.field2090[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class305.field5275[arg0][arg1][arg2] = class121.field2131;
                return true;
            } else {
                class305.field5275[arg0][arg1][arg2] = -class121.field2131;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I", line = 367)
    public final int[] method41(int arg0, int arg1) {
        field3986++;
        if (arg1 != -31598) {
            this.method54(121, (class41) null, -126);
        }
        int[] var3 = this.field3157.method1258(-96, arg0);
        if (this.field3157.field3081) {
            class299.method2088(var3, 0, class161.field2858, this.field3983);
        }
        return var3;
    }
}
