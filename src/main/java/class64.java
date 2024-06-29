import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class64 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[Lli;")
    public static class185[] field1118 = new class185[100];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "J")
    public long field1117;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lbb;")
    public class75 field1110;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lbb;")
    public class75 field1119;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Lbb;")
    public class75 field1120;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLhi;Lhi;)V")
    public static final void method430(byte arg0, class250 arg1, class250 arg2) {
        field1112++;
        if (arg0 >= 60) {
            class211.field3862 = arg1;
            class264.field4684 = arg2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static final void method431(byte arg0) {
        int var1 = 63 % ((arg0 + 78) / 48);
        if (class80.field1399 == 30) {
            class276.method1892((byte) -126, 25);
        }
        field1122++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1118 = null;
        int var1 = 36 % ((arg0 + 36) / 57);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public static final void method433(byte arg0) {
        class92.field1765 &= 0x7FF;
        if (class43.field681 < 128) {
            class43.field681 = 128;
        }
        field1115++;
        int var1 = class46.field732 >> 7;
        int var2 = class215.field3942 >> 7;
        int var3 = 0;
        if (class43.field681 > 383) {
            class43.field681 = 383;
        }
        int var4 = class236.method1606(93, class215.field3942, class46.field732, class265.field4703);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class265.field4703;
                    if (var7 < 3 && (class239.field4262[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class150.field2836[var7][var5][var6] & 0xFF) * 8 + var4 - class201.field3694[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (arg0 <= 39) {
            method435(65);
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class55.field937) {
            class55.field937 += (var9 - class55.field937) / 24;
        } else if (class55.field937 > var9) {
            class55.field937 += (var9 - class55.field937) / 80;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public static final void method434(int arg0, int arg1) {
        if (arg1 != 0) {
            field1108 = -113;
        }
        class165.field3078.method85((byte) 75, arg0);
        field1113++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static final void method435(int arg0) {
        field1109++;
        int var1 = 0;
        if (arg0 != 128) {
            field1118 = null;
        }
        while (var1 < class185.field3453) {
            int var10002 = class209.field3822[var1]--;
            if (class209.field3822[var1] >= -10) {
                label87: {
                    class11 var3 = class23.field385[var1];
                    if (var3 == null) {
                        var3 = class11.method101(class223.field4091, class46.field743[var1], 0);
                        if (var3 == null) {
                            break label87;
                        }
                        class209.field3822[var1] += var3.method98();
                        class23.field385[var1] = var3;
                    }
                    if (class209.field3822[var1] < 0) {
                        label90: {
                            int var10;
                            if (class174.field3180[var1] == 0) {
                                var10 = class250.field4461;
                            } else {
                                int var4 = (class174.field3180[var1] & 0xFF) * 128;
                                int var5 = class174.field3180[var1] >> 16 & 0xFF;
                                int var6 = var5 * 128 + 64 - class241.field4310.field2694;
                                if (var6 < 0) {
                                    var6 = -var6;
                                }
                                int var7 = (class174.field3180[var1] & 0xFF17) >> 8;
                                int var8 = var7 * 128 + 64 - class241.field4310.field2687;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var6 + var8 - 128;
                                if (var4 < var9) {
                                    class209.field3822[var1] = -100;
                                    break label90;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class280.field4965 / var4;
                            }
                            if (var10 > 0) {
                                class91 var11 = var3.method99().method598(class133.field2383);
                                class100 var12 = class100.method663(var11, 100, var10);
                                var12.method670(class161.field3040[var1] - 1);
                                class90.field1744.method801(var12);
                            }
                            class209.field3822[var1] = -100;
                        }
                    }
                }
            } else {
                class185.field3453--;
                for (int var2 = var1; var2 < class185.field3453; var2++) {
                    class46.field743[var2] = class46.field743[var2 + 1];
                    class23.field385[var2] = class23.field385[var2 + 1];
                    class161.field3040[var2] = class161.field3040[var2 + 1];
                    class209.field3822[var2] = class209.field3822[var2 + 1];
                    class174.field3180[var2] = class174.field3180[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class134.field2405 && !class134.method952(arg0 - 251)) {
            if (class193.field3568 != 0 && class38.field607 != -1) {
                class38.method241(class181.field3325, class193.field3568, 41, 0, false, class38.field607);
            }
            class134.field2405 = false;
        } else if (class193.field3568 != 0 && class38.field607 != -1 && !class134.method952(-26)) {
            class50.field817++;
            class182.field3349.method577(253, 0);
            class182.field3349.method842(class38.field607, arg0 - 6724);
            class38.field607 = -1;
        }
    }
}
