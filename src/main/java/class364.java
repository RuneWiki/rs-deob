import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class364 extends class398 {

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    private int field5257 = 1;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field5254 = 1;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    private int field5259 = 204;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field5261 = 0;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field5262 = 104;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Llm;")
    public static class347 field5255;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLn;)V", line = 3)
    public static final void method2378(byte arg0, class25 arg1) {
        ++field5253;
        if (~class212.field2844 > -401) {
            if (class227.field2988 != arg1) {
                String var8;
                if (~arg1.field347 == -1) {
                    boolean var2 = true;
                    if (class227.field2988.field360 != -1 && arg1.field360 != -1) {
                        int var3 = arg1.field343 >= class227.field2988.field343 ? arg1.field343 : class227.field2988.field343;
                        int var4 = class227.field2988.field360 >= arg1.field360 ? arg1.field360 : class227.field2988.field360;
                        int var5 = 5 - -(var3 * 10 / 100) + var4;
                        int var6 = -arg1.field343 + class227.field2988.field343;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        if (~var5 > ~var6) {
                            var2 = false;
                        }
                    }
                    String var7 = class71.field1017 != 1 ? class346.field4972 : class124.field1725;
                    if (~arg1.field345 >= ~arg1.field343) {
                        var8 = arg1.method175(17881, true) + (var2 ? class9.method68(arg1.field343, class227.field2988.field343, (byte) -26) : "<col=ffffff>") + " (" + var7 + arg1.field343 + ")";
                    } else {
                        var8 = arg1.method175(17881, true) + (var2 ? class9.method68(arg1.field343, class227.field2988.field343, (byte) -26) : "<col=ffffff>") + " (" + var7 + arg1.field343 + "+" + (-arg1.field343 + arg1.field345) + ")";
                    }
                } else {
                    var8 = arg1.method175(17881, true) + " (" + class197.field2629 + arg1.field347 + ")";
                }
                if (class63.field844 == 1) {
                    ++class394.field5710;
                    class41.method299(0, class317.field4628, class384.field5553, (long) arg1.field4301, class156.field2125 + " -> <col=ffffff>" + var8, 17, false, 0);
                } else if (!class263.field3821) {
                    for (int var9 = 7; var9 >= 0; --var9) {
                        if (class286.field4142[var9] != null) {
                            short var10 = 0;
                            if (class71.field1017 == 0 && class286.field4142[var9].equalsIgnoreCase(class379.field5507)) {
                                if (class227.field2988.field343 < arg1.field343) {
                                    var10 = 2000;
                                }
                                if (~class227.field2988.field329 != -1 && arg1.field329 != 0) {
                                    if (class227.field2988.field329 == arg1.field329) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (class418.field6191[var9]) {
                                var10 = 2000;
                            }
                            short var11 = (short) (class365.field5276[var9] + var10);
                            int var12 = ~class310.field4564[var9] != 0 ? class310.field4564[var9] : class195.field2610;
                            class41.method299(0, var12, class286.field4142[var9], (long) arg1.field4301, "<col=ffffff>" + var8, var11, false, 0);
                            ++class193.field2587;
                        }
                    }
                } else if (~(8 & class189.field2547) != -1) {
                    class41.method299(0, class445.field6532, class394.field5739, (long) arg1.field4301, class375.field5454 + " -> <col=ffffff>" + var8, 42, false, 0);
                    ++class118.field1662;
                }
                for (class212 var13 = (class212) class321.field4726.method332(-2130841184); var13 != null; var13 = (class212) class321.field4726.method343((byte) -104)) {
                    if (var13.field2836 == 60) {
                        var13.field2838 = "<col=ffffff>" + var8;
                        break;
                    }
                }
                int var14 = 91 % ((arg0 - 10) / 36);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 132)
    public class364() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Llm;Llm;Llm;Z)V", line = 138)
    public static final void method2379(class347 arg0, class347 arg1, class347 arg2, boolean arg3) {
        ++field5260;
        if (!arg3) {
            method2378((byte) -120, (class25) null);
        }
        class185.field2501 = arg1;
        class227.method1316(arg2, 1280, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lpl;I)V", line = 151)
    public static final void method2380(class446 arg0, int arg1) {
        ++field5263;
        arg0.field6543 = false;
        if (arg0.field6542 != null) {
            arg0.field6542.field682 = 0;
        }
        for (class446 var2 = arg0.method501(); var2 != null; var2 = arg0.method469()) {
            method2380(var2, -117);
        }
        int var3 = 26 % ((arg1 - -36) / 47);
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V", line = 174)
    public static void method2381(int arg0) {
        field5255 = null;
        if (arg0 != 4096) {
            method2379((class347) null, (class347) null, (class347) null, true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I", line = 184)
    public final int[] method95(int arg0, int arg1) {
        ++field5256;
        int[] var3 = super.field5927.method305(arg0, (byte) 85);
        if (super.field5927.field591) {
            for (int var4 = 0; ~var4 > ~class140.field1922; ++var4) {
                int var5 = class375.field5448[var4];
                int var6 = class84.field1206[arg0];
                int var7 = this.field5254 * var5 >> 12;
                int var8 = this.field5257 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5254) * this.field5254;
                int var10 = var6 % (4096 / this.field5257) * this.field5257;
                if (~this.field5259 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field5259) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field5259 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 0) {
            field5255 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lnj;II)V", line = 271)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field5259 = arg0.method1343(255);
                }
            } else {
                this.field5257 = arg0.method1348(-115);
            }
        } else {
            this.field5254 = arg0.method1348(-90);
        }
        if (arg2 != -13132) {
            method2378((byte) 117, (class25) null);
        }
        ++field5252;
    }
}
