import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class247 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
    public boolean field3802 = true;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lmo;")
    public static class531 field3808 = new class531(13, 3);

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "C")
    private char field3804;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Ljava/lang/String;")
    public String field3810;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lza;B)V")
    public static final void method1597(class288 arg0, byte arg1) {
        field3805++;
        int var2 = class229.field3561;
        int var3 = class280.field4218;
        int var4 = class383.field5601;
        int var5 = class186.field2991;
        int var6 = -10660793;
        arg0.method1809(var3, var2, var6, var5, var4, -7456);
        arg0.method1809(var3 + 1, var2 + 1, -16777216, 16, var4 - 2, -7456);
        arg0.method1806(1, var4 - 2, var2 + 1, -16777216, var5 - 19, var3 - -18);
        class356.field5232.method2017(var2 + 3, var6, -1, (byte) -81, var3 + 14, class265.field4034.method1977(class146.field2452, 123));
        int var7 = class393.field5991.method132(64);
        int var8 = class393.field5991.method139(-101);
        int var9 = 0;
        int var10 = 69 % ((12 - arg1) / 58);
        for (class328 var11 = (class328) class373.field5469.method1892(86); var11 != null; var11 = (class328) class373.field5469.method1893((byte) -2)) {
            int var12 = var3 + ((class332.field5041 - 1 + -var9) * 16) + 31;
            short var13 = -1;
            if (var2 < var7 && var7 < var2 + var4 && (var12 - 13) < var8 && var12 + 3 > var8 && var11.field4978) {
                var13 = -256;
            }
            int[] var14 = null;
            if (class40.method251(var11.field4972, -7010)) {
                var14 = class135.field2271.method1636((int) var11.field4981, -123).field196;
            } else if (var11.field4973 != -1) {
                var14 = class135.field2271.method1636(var11.field4973, -127).field196;
            } else if (class470.method2810(-95, var11.field4972)) {
                class435 var17 = (class435) class209.field3337.method1622((long) ((int) var11.field4981), -127);
                if (var17 != null) {
                    class163 var18 = var17.field6471;
                    class51 var19 = var18.field2613;
                    if (var19.field1038 != null) {
                        var19 = var19.method475(class402.field6080, -1);
                    }
                    if (var19 != null) {
                        var14 = var19.field1053;
                    }
                }
            } else if (class473.method2826(-96, var11.field4972)) {
                Object var15 = null;
                class306 var16;
                if (var11.field4972 == 1003) {
                    var16 = class123.field2142.method1530((byte) -121, (int) var11.field4981);
                } else {
                    var16 = class123.field2142.method1530((byte) -106, (int) (var11.field4981 >>> 32 & 0x7FFFFFFFL));
                }
                if (var16.field4593 != null) {
                    var16 = var16.method1951(class402.field6080, 0);
                }
                if (var16 != null) {
                    var14 = var16.field4644;
                }
            }
            String var20 = class477.method2850(93, var11);
            if (var14 != null) {
                var20 = var20 + class444.method2658(var14, -86);
            }
            class356.field5232.method2007(0, class365.field5333, var20, 1, var13, var12, var2 + 3, client.field3219);
            if (var11.field4974) {
                class271.field4119.method159(var2 + class272.field4126.method2808(var20, -106) + 5, var12 + -12);
            }
            var9++;
        }
        class140.method1049(class383.field5601, class280.field4218, 11, class229.field3561, class186.field2991);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BILnn;)V")
    private final void method1598(byte arg0, int arg1, class289 arg2) {
        field3803++;
        if (arg1 == 1) {
            this.field3804 = class289.method1878(89, arg2.method1816(true));
        } else if (arg1 == 2) {
            this.field3809 = arg2.method1815((byte) -84);
        } else if (arg1 == 4) {
            this.field3802 = false;
        } else if (arg1 == 5) {
            this.field3810 = arg2.method1834(-17823);
        }
        int var4 = -34 % ((69 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method1599(int arg0) {
        field3808 = null;
        if (arg0 > -103) {
            field3808 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V")
    public static final void method1600(int arg0, int arg1, int arg2, int arg3) {
        class234 var4 = class518.field7511[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class210 var5 = var4.field3605;
        class210 var6 = var4.field3602;
        if (var5 != null) {
            var5.field3359 = var5.field3359 * arg3 / (0x10 << class353.field5216 - 7);
            var5.field3352 = var5.field3352 * arg3 / (0x10 << class353.field5216 - 7);
        }
        if (var6 != null) {
            var6.field3359 = var6.field3359 * arg3 / (0x10 << class353.field5216 - 7);
            var6.field3352 = var6.field3352 * arg3 / (0x10 << class353.field5216 - 7);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lnn;I)V")
    public final void method1601(class289 arg0, int arg1) {
        if (arg1 != 2) {
            return;
        }
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                field3807++;
                return;
            }
            this.method1598((byte) 127, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
    public final boolean method1602(int arg0) {
        if (arg0 != 115) {
            this.method1602(10);
        }
        field3806++;
        return this.field3804 == 's';
    }

    static {
        new class309("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field3811 = 0;
    }
}
