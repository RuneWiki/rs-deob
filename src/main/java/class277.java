import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class277 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lme;")
    private class668 field3633 = new class668(64);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lpe;")
    private class615 field3631;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lpe;")
    private class615 field3626;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lqp;")
    public static class440 field3629;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lpe;")
    public static class615 field3630;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[Ler;")
    public static class209[] field3627;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 5)
    public static void method1677(int arg0) {
        field3629 = null;
        field3630 = null;
        if (arg0 >= -51) {
            field3630 = null;
        }
        field3627 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)I", line = 27)
    public static final int method1678(int arg0, int arg1, int arg2) {
        field3628++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 == -31711 ? (arg2 & 0xFF80) + var3 : -15;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lbga;", line = 49)
    public final class370 method1679(int arg0, int arg1) {
        field3632++;
        class370 var3 = (class370) this.field3633.method3655(54, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3626.method3346(-1, 0, arg0 & 0x7FFF);
        } else {
            var4 = this.field3631.method3346(-1, 0, arg0);
        }
        if (arg1 >= -73) {
            return null;
        }
        class370 var5 = new class370();
        if (var4 != null) {
            var5.method2137(new class418(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method2127((byte) 34);
        }
        this.field3633.method3650((long) arg0, -120, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ILpe;Lpe;)V", line = 90)
    public class277(int arg0, class615 arg1, class615 arg2) {
        this.field3631 = arg1;
        this.field3626 = arg2;
        if (this.field3631 != null) {
            this.field3631.method3341(0, -19046);
        }
        if (this.field3626 != null) {
            this.field3626.method3341(0, -19046);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILoa;)V", line = 113)
    public static final void method1680(int arg0, class43 arg1) {
        field3634++;
        int var2 = class399.field5100;
        int var3 = class630.field8791;
        int var4 = class238.field3206;
        int var5 = class539.field7003;
        int var6 = -10660793;
        arg1.method400(var6, var2, var5, (byte) 87, var4, var3);
        arg1.method400(-16777216, var2 + 1, 16, (byte) 45, var4 - 2, var3 + 1);
        arg1.method354(var4 - 2, -16777216, -75, var2 + 1, var5 + -19, var3 + 18);
        class456.field5983.method3243(class604.field8148.method3280((byte) -96, class144.field1890), var2 + 3, var3 + 14, var6, -1, -46);
        if (arg0 < 26) {
            return;
        }
        int var7 = class691.field9440.method2214(-2703);
        int var8 = class691.field9440.method2208(30114);
        int var9 = 0;
        for (class57 var10 = (class57) class658.field9176.method2090(true); var10 != null; var10 = (class57) class658.field9176.method2088(-152)) {
            int var11 = (class291.field3758 - var9 - 1) * 16 + (var3 + 31);
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var11 - 13 < var8 && (var11 + 3) > var8 && var10.field775) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class302.method1770(1002, var10.field776)) {
                var13 = class232.field3109.method1292(0, (int) var10.field774).field9520;
            } else if (var10.field759 != -1) {
                var13 = class232.field3109.method1292(0, var10.field759).field9520;
            } else if (class478.method2652(123, var10.field776)) {
                class234 var16 = (class234) class505.field6640.method39((long) ((int) var10.field774), 31750);
                if (var16 != null) {
                    class532 var17 = var16.field3131;
                    class699 var18 = var17.field6914;
                    if (var18.field9714 != null) {
                        var18 = var18.method3823(class397.field5054, -32574);
                    }
                    if (var18 != null) {
                        var13 = var18.field9700;
                    }
                }
            } else if (class226.method1419(var10.field776, (byte) 124)) {
                Object var14 = null;
                class698 var15;
                if (var10.field776 == 1004) {
                    var15 = class348.field4436.method1900(74, (int) var10.field774);
                } else {
                    var15 = class348.field4436.method1900(62, (int) (var10.field774 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field9630 != null) {
                    var15 = var15.method3815(65535, class397.field5054);
                }
                if (var15 != null) {
                    var13 = var15.field9669;
                }
            }
            String var19 = class45.method419(false, var10);
            if (var13 != null) {
                var19 = var19 + class37.method301((byte) -99, var13);
            }
            class456.field5983.method3239(class256.field3469, var12, 0, var11, 0, class386.field4958, var19, var2 + 3);
            var9++;
            if (var10.field766) {
                class422.field5455.method2751(class411.field5305.method2900(true, var19) + var2 + 5, var11 - 12);
            }
        }
        class619.method3379(class238.field3206, class630.field8791, class399.field5100, 0, class539.field7003);
    }
}
