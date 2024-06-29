import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class292 extends class287 {

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field4518 = 2;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "B")
    public static byte field4516;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lud;")
    public class17 field4517;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lqg;")
    public class206 field4529;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Le;")
    public class237 field4522;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Lug;")
    public static class253 field4525;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lid;")
    public class266 field4534;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 7)
    public final void method2038(int arg0) {
        this.field4529 = null;
        this.field4522 = null;
        this.field4517 = null;
        if (arg0 != -31597) {
            this.method2038(-7);
        }
        this.field4534 = null;
        field4515++;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V", line = 43)
    public static void method2039(int arg0) {
        field4525 = null;
        if (arg0 <= 9) {
            method2039(69);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)Lbh;", line = 58)
    public static final class18 method2040(byte arg0) {
        if (arg0 >= -111) {
            method2039(-99);
        }
        field4519++;
        class18 var1;
        if (class109.field1458) {
            var1 = new class143(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], class207.field3298[0], class81.field1101);
        } else {
            var1 = new class201(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], class207.field3298[0], class81.field1101);
        }
        class207.method1526(0);
        return var1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIIIIIIII)V", line = 78)
    public static final void method2041(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class278.field4290.field4244; var9++) {
            if (class278.field4290.method1936((byte) -72, var9)) {
                int[] var10 = class136.field2174.method2049(class278.field4290.field4249[var9] & 0x3FFF, class278.field4290.field4249[var9] >> 28 & 0x3, class278.field4290.field4249[var9] >> 14 & 0x3FFF, 24540);
                if (var10 != null) {
                    int var11 = var10[1] - class60.field885;
                    int var12 = class340.field5301 + class4.field42 - var10[2] - 1;
                    int var13 = (var12 - arg3) * (arg1 - arg8) / (arg7 - arg3) + arg8;
                    int var14 = class278.field4290.method1934(arg0, var9);
                    int var15 = (arg6 - arg2) * (var11 - arg5) / (arg4 - arg5) + arg2;
                    class38 var16 = null;
                    if (var14 == 0) {
                        if ((double) class163.field2650 == 3.0D) {
                            var16 = class257.field4058;
                        }
                        if ((double) class163.field2650 == 4.0D) {
                            var16 = class295.field4577;
                        }
                        if ((double) class163.field2650 == 6.0D) {
                            var16 = class22.field338;
                        }
                        if ((double) class163.field2650 >= 8.0D) {
                            var16 = class303.field4680;
                        }
                    }
                    int var17 = 16777215;
                    if (var14 == 1) {
                        if ((double) class163.field2650 == 3.0D) {
                            var16 = class22.field338;
                        }
                        if ((double) class163.field2650 == 4.0D) {
                            var16 = class303.field4680;
                        }
                        if ((double) class163.field2650 == 6.0D) {
                            var16 = class132.field1945;
                        }
                        if ((double) class163.field2650 >= 8.0D) {
                            var16 = class344.field5348;
                        }
                    }
                    if (var14 == 2) {
                        if ((double) class163.field2650 == 3.0D) {
                            var16 = class132.field1945;
                        }
                        if ((double) class163.field2650 == 4.0D) {
                            var16 = class344.field5348;
                        }
                        var17 = 16755200;
                        if ((double) class163.field2650 == 6.0D) {
                            var16 = class153.field2367;
                        }
                        if ((double) class163.field2650 >= 8.0D) {
                            var16 = class259.field4077;
                        }
                    }
                    if (class278.field4290.field4254[var9] != -1) {
                        var17 = class278.field4290.field4254[var9];
                    }
                    if (var16 != null) {
                        int var18 = class29.field430.method2251(class278.field4290.field4246[var9], (int[]) null, class306.field4779);
                        int var19 = var13 - (var18 - 1) * var16.method324() / 2;
                        int var20 = var19 + var16.method327() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class306.field4779[var21];
                            if (var21 < (var18 - 1)) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var16.method320(var22, var15, var20, var17, true);
                            var20 += var16.method324();
                        }
                    }
                }
            }
        }
        if (arg0) {
            field4518 = 65;
        }
        field4535++;
    }
}
