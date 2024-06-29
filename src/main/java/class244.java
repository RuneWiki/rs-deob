import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class244 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "La;")
    public static class436 field3395 = new class436(5000);

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Luf;")
    public static class310 field3403 = new class310(78, 3);

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Lfg;")
    public static class83 field3404 = new class83("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "S")
    public static short field3405 = 1;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1442(boolean arg0, String arg1, int arg2) {
        field3396++;
        if (arg1 == null) {
            return;
        }
        if (class336.field4605 >= 100) {
            class99.method662((byte) 41, class251.field3488.method590(class105.field1434, -22602));
            return;
        }
        String var3 = class451.method2659(arg1, (byte) -120);
        if (var3 == null) {
            return;
        }
        for (int var4 = arg2; var4 < class336.field4605; var4++) {
            String var8 = class451.method2659(class159.field2284[var4], (byte) -120);
            if (var8 != null && var8.equals(var3)) {
                class99.method662((byte) 41, arg1 + class178.field2521.method590(class105.field1434, -22602));
                return;
            }
            if (class463.field6729[var4] != null) {
                String var9 = class451.method2659(class463.field6729[var4], (byte) -120);
                if (var9 != null && var9.equals(var3)) {
                    class99.method662((byte) 41, arg1 + class178.field2521.method590(class105.field1434, -22602));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class223.field3106; var5++) {
            String var6 = class451.method2659(class52.field702[var5], (byte) -120);
            if (var6 != null && var6.equals(var3)) {
                class99.method662((byte) 41, class46.field641.method590(class105.field1434, -22602) + arg1 + class13.field162.method590(class105.field1434, -22602));
                return;
            }
            if (class133.field1926[var5] != null) {
                String var7 = class451.method2659(class133.field1926[var5], (byte) -120);
                if (var7 != null && var7.equals(var3)) {
                    class99.method662((byte) 41, class46.field641.method590(class105.field1434, arg2 - 22602) + arg1 + class13.field162.method590(class105.field1434, -22602));
                    return;
                }
            }
        }
        if (class451.method2659(class75.field1089.field2693, (byte) -120).equals(var3)) {
            class99.method662((byte) 41, class252.field3499.method590(class105.field1434, -22602));
            return;
        }
        class203.field2882++;
        class356.method1978((byte) 117, class163.field2323);
        field3395.method2084(class121.method780(arg1, (byte) 59) + 1, false);
        field3395.method2073(69, arg1);
        field3395.method2084(arg0 ? 1 : 0, false);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBIII)V")
    public static final void method1443(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3397++;
        field3395.field5069 = 0;
        if (arg1 != 16) {
            field3395 = null;
        }
        field3395.method2084(class255.field3544.field3043, false);
        field3395.method2084(arg4, false);
        field3395.method2084(arg0, false);
        field3395.method2070(81954016, arg3);
        field3395.method2070(81954016, arg2);
        class376.field5289 = -3;
        class310.field4243 = 1;
        client.field2804 = 0;
        class270.field3692 = 0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method1444(byte arg0) {
        field3395 = null;
        if (arg0 == -18) {
            field3403 = null;
            field3404 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLmi;[[B)V")
    public static final void method1445(byte arg0, class341 arg1, byte[][] arg2) {
        field3400++;
        int var3 = class207.field2938.length;
        int var4 = -58 % ((arg0 + 75) / 49);
        for (int var5 = 0; var5 < var3; var5++) {
            byte[] var6 = arg2[var5];
            if (var6 != null) {
                int var7 = (class101.field1378[var5] >> 8) * 64 - class215.field3059;
                int var8 = (class101.field1378[var5] & 0xFF) * 64 - class79.field1134;
                class503.method2959(false);
                arg1.method1906(var7, class418.field6109, var6, 104, var8, class6.field64);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
    public static final void method1446(byte arg0) {
        if (arg0 > -42) {
            field3404 = null;
        }
        field3399++;
        for (class64 var1 = (class64) class114.field1552.method3072((byte) 111); var1 != null; var1 = (class64) class114.field1552.method3066(2)) {
            if (var1.field873 == -1) {
                var1.field880 = 0;
                if (var1.field885 >= 0 && var1.field884 >= 0 && var1.field885 < class442.field6435 && var1.field884 < class232.field3217) {
                    class59.method378(-21863, var1);
                }
            } else {
                var1.method2946(-96);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I")
    public static final int method1447(int arg0, int arg1, int arg2, int arg3) {
        field3402++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        int var6 = arg1 / arg3;
        int var7 = arg3 - 1 & arg1;
        int var8 = class410.method2430(var4, var6, (byte) 126);
        int var9 = class410.method2430(var4 + 1, var6, (byte) 122);
        int var10 = class410.method2430(var4, var6 + 1, (byte) 122);
        int var11 = class410.method2430(var4 + 1, var6 + 1, (byte) 123);
        if (arg2 != 5000) {
            method1447(-21, -11, 96, 90);
        }
        int var12 = class29.method203(var5, arg3, false, var9, var8);
        int var13 = class29.method203(var5, arg3, false, var11, var10);
        return class29.method203(var7, arg3, false, var13, var12);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
    public static final void method1448(String[] arg0, short[] arg1, int arg2) {
        field3398++;
        if (arg2 != 12950) {
            field3403 = null;
        }
        class53.method334(arg0.length - 1, 0, false, arg1, arg0);
    }
}
