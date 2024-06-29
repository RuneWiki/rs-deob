import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class373 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lkg;")
    public static class275 field4788 = new class275(8, 2);

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lde;")
    public static class534 field4792 = new class534(4);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lha;I)V")
    public static final void method2144(class60 arg0, int arg1) {
        field4790++;
        int var2 = 0;
        if (arg1 != 16017) {
            return;
        }
        int var3 = 0;
        if (class676.field9448) {
            var2 = class209.method1347(0);
            var3 = class453.method2540(-120);
        }
        arg0.method534(var2, var3, class356.field4586 + var2, var3 + 350);
        arg0.method528(var2, var3, class356.field4586, 350, class573.field8046 << 24 | 0x332277, 1);
        class236.method1478(-120, var3, class356.field4586 + var2, var2, var3 + 350);
        int var4 = 350 / class518.field7267;
        if (class5.field47 > 0) {
            int var5 = 346 - class518.field7267 - 4;
            int var6 = var4 * var5 / (var4 + class5.field47 - 1);
            int var7 = 4;
            if (class5.field47 > 1) {
                var7 += (class5.field47 - class71.field997 - 1) * (var5 - var6) / (class5.field47 - 1);
            }
            arg0.method528(var2 + class356.field4586 - 16, var3 - -var7, 12, var6, class573.field8046 << 24 | 0x332277, 2);
            for (int var8 = class71.field997; (class71.field997 + var4) > var8 && var8 < class5.field47; var8++) {
                String[] var9 = class249.method1538('\b', arg1 ^ 0x3E91, class404.field5114[var8]);
                int var10 = (class356.field4586 - 16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg0.method534(var2 + var12, var3, var2 + var12 + var10 - 8, var3 + 350);
                    class372.field4774.method555(-1, class378.method2161(var9[var11], (byte) -17), arg1 ^ 0x3E91, -16777216, var2 + var12, var3 + 350 - class560.field7906 - (2 - (-((-class71.field997 + var8) * class518.field7267) + -class697.field9708.field3434)));
                }
            }
        }
        class164.field2272.method559(-1, (byte) -93, "Build: 638", class356.field4586 + var2 - 25, -16777216, var3 + 350 - 20);
        arg0.method534(var2, var3, class356.field4586 + var2, var3 - -350);
        arg0.method439(var3 + 350 - class560.field7906, var2, class356.field4586, true, -1);
        class242.field3132.method555(-1, "--> " + class378.method2161(class482.field6539, (byte) -17), arg1 - 16017, -16777216, var2 + 10, var3 + 350 - 1 + -class270.field3406.field3434);
        if (!class430.field5752) {
            return;
        }
        int var13 = -1;
        if (class463.field6224 % 30 > 15) {
            var13 = 16777215;
        }
        arg0.method441(12, (var2 + class270.field3406.method1619(false, "--> " + class378.method2161(class482.field6539, (byte) -17).substring(0, class298.field3915))) + 10, var13, var3 + 350 - class270.field3406.field3434 - 11, -22315);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method2145(byte arg0) {
        field4788 = null;
        field4792 = null;
        if (arg0 <= 32) {
            field4792 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILnd;ZII)V")
    public static final void method2146(int arg0, int arg1, int arg2, class547 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != -9854) {
            method2148(8, null, null, -1.1104853F, -0.39976278F, 0.9881841F, -0.78887236F, -64, 55, true, 33, 0.7057746F, 85);
        }
        if (arg5 <= 0) {
            class393.method2216(arg4, arg2, arg3, arg0 ^ 0xFFFFD982, arg1, arg6);
        } else {
            class272.field3416 = arg6;
            class230.field3028 = arg3;
            class514.field7217 = 1;
            client.field3977 = null;
            class709.field9849 = arg4;
            class174.field2415 = arg1;
            class615.field8495 = arg2;
            class360.field4661 = class126.field1799.method1377(-11427) / arg5;
            if (class360.field4661 < 1) {
                class360.field4661 = 1;
            }
        }
        field4793++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Llk;I)[I")
    public static final int[] method2147(class589 arg0, int arg1) {
        field4791++;
        class461 var2 = new class461(518);
        int[] var3 = new int[arg1];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method2578(10, arg1 - 1221492244);
        var2.method2568(var3[0], -535701016);
        var2.method2568(var3[1], -535701016);
        var2.method2568(var3[2], -535701016);
        var2.method2568(var3[3], -535701016);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method2568((int) (Math.random() * 9.9999999E7D), -535701016);
        }
        var2.method2620((int) (Math.random() * 9.9999999E7D), false);
        var2.method2599(-1, class501.field7097, class144.field2030);
        arg0.field8251.method2614(3, 0, var2.field6180, var2.field6193);
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BLsb;FFFFIIZIFI)V")
    public static final void method2148(int arg0, byte[] arg1, class294 arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, boolean arg9, int arg10, float arg11, int arg12) {
        field4787++;
        int var13 = 0;
        if (!arg9) {
            field4788 = null;
        }
        while (arg8 > var13) {
            class474.method2715(var13, arg12, arg5, arg0, (byte) 109, arg2, arg4, arg6, arg8, arg11, arg3, arg10, arg7, arg1);
            arg10 += arg0 * arg7;
            var13++;
        }
    }
}
