import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class128 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[C")
    public static char[] field2011 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field2018 = 0;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "J")
    public static long field2021 = 0L;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "J")
    public long field2012;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lhd;")
    public class128 field2015;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lhd;")
    public class128 field2022;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method908(int arg0) {
        while (true) {
            class265 var1 = (class265) class212.field3511.method1651((byte) 121);
            if (var1 == null) {
                if (arg0 != -1) {
                    return;
                }
                field2013++;
                return;
            }
            class43 var3;
            if (var1.field4262 < 0) {
                int var2 = -var1.field4262 - 1;
                if (class123.field1961 == var2) {
                    var3 = class239.field3829;
                } else {
                    var3 = class270.field4355[var2];
                }
            } else {
                int var4 = var1.field4262 - 1;
                var3 = class12.field127[var4];
            }
            if (var3 != null) {
                class158 var5 = class5.method29(var1.field4267, true);
                int var6;
                int var7;
                if (var1.field4259 == 1 || var1.field4259 == 3) {
                    var6 = var5.field2507;
                    var7 = var5.field2487;
                } else {
                    var6 = var5.field2487;
                    var7 = var5.field2507;
                }
                int var8 = (var7 + 1 >> 1) + var1.field4256;
                int var9 = (var6 >> 1) + var1.field4251;
                int var10 = var1.field4256 + (var7 >> 1);
                int var11 = (var6 + 1 >> 1) + var1.field4251;
                int[][] var12 = class267.field4304[class56.field941];
                int var13 = var12[var10][var9] + var12[var10][var11] + var12[var8][var11] + var12[var8][var9] >> 2;
                class2 var14 = null;
                int var15 = class183.field3012[var1.field4250];
                if (var15 == 0) {
                    class209 var19 = class281.method1885(class56.field941, var1.field4256, var1.field4251);
                    if (var19 != null) {
                        var14 = var19.field3305;
                    }
                } else if (var15 == 1) {
                    class259 var16 = class129.method919(class56.field941, var1.field4256, var1.field4251);
                    if (var16 != null) {
                        var14 = var16.field4174;
                    }
                } else if (var15 == 2) {
                    class179 var17 = class159.method1098(class56.field941, var1.field4256, var1.field4251);
                    if (var17 != null) {
                        var14 = var17.field2932;
                    }
                } else if (var15 == 3) {
                    class188 var18 = class99.method675(class56.field941, var1.field4256, var1.field4251);
                    if (var18 != null) {
                        var14 = var18.field3057;
                    }
                }
                if (var14 != null) {
                    class126.method876(0, var1.field4256, var1.field4260 + 1, var1.field4251, var15, var1.field4263 + 1, class56.field941, 0, -1, 5);
                    var3.field712 = var1.field4251 * 128 + var6 * 64;
                    var3.field663 = class29.field360 + var1.field4263;
                    var3.field687 = var13;
                    int var20 = var1.field4254;
                    var3.field622 = var14;
                    var3.field703 = var1.field4256 * 128 + var7 * 64;
                    var3.field656 = class29.field360 + var1.field4260;
                    int var21 = var1.field4268;
                    if (var21 < var20) {
                        int var22 = var20;
                        var20 = var21;
                        var21 = var22;
                    }
                    var3.field700 = var1.field4256 + var20;
                    var3.field680 = var1.field4256 + var21;
                    int var23 = var1.field4255;
                    int var24 = var1.field4269;
                    if (var24 < var23) {
                        int var25 = var23;
                        var23 = var24;
                        var24 = var25;
                    }
                    var3.field693 = var1.field4251 + var24;
                    var3.field683 = var1.field4251 + var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        field2016++;
        if (this.field2015 == null) {
            return false;
        } else {
            if (!arg0) {
                method911(-83);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I")
    public static final int method910(int arg0) {
        int var1 = -71 % ((-arg0 - 52) / 53);
        field2017++;
        if (class9.field92) {
            return 0;
        } else if (class129.method918(false)) {
            return class86.field1419 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method911(int arg0) {
        field2011 = null;
        if (arg0 != 7199) {
            field2021 = -54L;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static final void method912(int arg0) {
        if (arg0 != 64) {
            return;
        }
        for (int var1 = 0; var1 < class246.field3912; var1++) {
            int var2 = class184.field3020[var1];
            class131 var3 = class12.field127[var2];
            if (var3 != null) {
                class263.method1766(arg0 ^ 0x640, var3, var3.field2056.field4048);
            }
        }
        field2014++;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public final void method913(int arg0) {
        if (arg0 != -3542) {
            this.method913(53);
        }
        field2019++;
        if (this.field2015 != null) {
            this.field2015.field2022 = this.field2022;
            this.field2022.field2015 = this.field2015;
            this.field2022 = null;
            this.field2015 = null;
        }
    }
}
