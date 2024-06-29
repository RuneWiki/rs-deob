import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class271 {

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field4820 = 100;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field4819 = 0;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lcf;")
    public static class93 field4818 = class147.method1066(":", -48);

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Lcf;")
    private static class93 field4821 = class147.method1066("skill: ", -48);

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lcf;")
    public static class93 field4823 = class147.method1066(" (X", -48);

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Lcf;")
    public static class93 field4824 = field4821;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Llh;I)V")
    public static final void method1800(class286 arg0, int arg1) {
        field4817++;
        class12 var2 = null;
        try {
            class22 var3 = arg0.method1961((byte) 119, "runescape");
            while (var3.field290 == 0) {
                class53.method290(1L, true);
            }
            if (~var3.field290 == arg1) {
                var2 = (class12) var3.field292;
                class280 var4 = class129.method938((byte) 68);
                var2.method53(var4.field5027, true, 0, var4.field5011);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method52(-7802);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method1801(boolean arg0) {
        field4821 = null;
        field4824 = null;
        field4818 = null;
        field4823 = null;
        if (arg0) {
            field4820 = 109;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
    public static final void method1802() {
        class246.field4429 = 0;
        label191: for (int var0 = 0; var0 < class280.field5029; var0++) {
            class268 var1 = class108.field1855[var0];
            if (class213.field3905 != null) {
                for (int var2 = 0; var2 < class213.field3905.length; var2++) {
                    if (class213.field3905[var2] != -1000000 && (var1.field4770 <= class213.field3905[var2] || var1.field4784 <= class213.field3905[var2]) && (var1.field4778 <= class35.field540[var2] || var1.field4788 <= class35.field540[var2]) && (var1.field4778 >= class103.field1798[var2] || var1.field4788 >= class103.field1798[var2]) && (var1.field4793 <= class199.field3611[var2] || var1.field4779 <= class199.field3611[var2]) && (var1.field4793 >= class200.field3627[var2] || var1.field4779 >= class200.field3627[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4794 == 1) {
                int var3 = var1.field4795 + class11.field153 - class206.field3703;
                if (var3 >= 0 && var3 <= class11.field153 + class11.field153) {
                    int var4 = var1.field4791 + class11.field153 - class133.field2335;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4772 + class11.field153 - class133.field2335;
                    if (var5 > class11.field153 + class11.field153) {
                        var5 = class11.field153 + class11.field153;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class15.field200[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class166.field2931 - var1.field4778;
                        if (var7 > 32) {
                            var1.field4775 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4775 = 2;
                            var7 = -var7;
                        }
                        var1.field4781 = (var1.field4793 - class272.field4825 << 8) / var7;
                        var1.field4771 = (var1.field4779 - class272.field4825 << 8) / var7;
                        var1.field4774 = (var1.field4770 - class263.field4692 << 8) / var7;
                        var1.field4777 = (var1.field4784 - class263.field4692 << 8) / var7;
                        class258.field4642[class246.field4429++] = var1;
                    }
                }
            } else if (var1.field4794 == 2) {
                int var8 = var1.field4791 + class11.field153 - class133.field2335;
                if (var8 >= 0 && var8 <= class11.field153 + class11.field153) {
                    int var9 = var1.field4795 + class11.field153 - class206.field3703;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4790 + class11.field153 - class206.field3703;
                    if (var10 > class11.field153 + class11.field153) {
                        var10 = class11.field153 + class11.field153;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class15.field200[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class272.field4825 - var1.field4793;
                        if (var12 > 32) {
                            var1.field4775 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4775 = 4;
                            var12 = -var12;
                        }
                        var1.field4773 = (var1.field4778 - class166.field2931 << 8) / var12;
                        var1.field4776 = (var1.field4788 - class166.field2931 << 8) / var12;
                        var1.field4774 = (var1.field4770 - class263.field4692 << 8) / var12;
                        var1.field4777 = (var1.field4784 - class263.field4692 << 8) / var12;
                        class258.field4642[class246.field4429++] = var1;
                    }
                }
            } else if (var1.field4794 == 4) {
                int var13 = var1.field4770 - class263.field4692;
                if (var13 > 128) {
                    int var14 = var1.field4791 + class11.field153 - class133.field2335;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4772 + class11.field153 - class133.field2335;
                    if (var15 > class11.field153 + class11.field153) {
                        var15 = class11.field153 + class11.field153;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4795 + class11.field153 - class206.field3703;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4790 + class11.field153 - class206.field3703;
                        if (var17 > class11.field153 + class11.field153) {
                            var17 = class11.field153 + class11.field153;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class15.field200[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4775 = 5;
                            var1.field4773 = (var1.field4778 - class166.field2931 << 8) / var13;
                            var1.field4776 = (var1.field4788 - class166.field2931 << 8) / var13;
                            var1.field4781 = (var1.field4793 - class272.field4825 << 8) / var13;
                            var1.field4771 = (var1.field4779 - class272.field4825 << 8) / var13;
                            class258.field4642[class246.field4429++] = var1;
                        }
                    }
                }
            }
        }
    }
}
