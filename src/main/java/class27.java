import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class27 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    public static int[] field606 = new int[100];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lgg;")
    private static class63 field611 = class116.method911(43, "Prepared visibility map");

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lgg;")
    public static class63 field613 = class116.method911(43, ")4lang)4de");

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lgg;")
    public static class63 field614 = field611;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
    public abstract int method261(byte arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhf;ILmc;I)V")
    public static final void method262(class71 arg0, int arg1, class111 arg2, int arg3) {
        byte[] var4 = null;
        int var5 = -17 % ((-arg3 - 7) / 50);
        field609++;
        class148 var6 = class69.field1729;
        synchronized (class69.field1729) {
            for (class34 var7 = (class34) class69.field1729.method1033(0); var7 != null; var7 = (class34) class69.field1729.method1035(0)) {
                if ((long) arg1 == var7.field3612 && var7.field808 == arg0 && var7.field812 == 0) {
                    var4 = var7.field807;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = arg0.method671((byte) 89, arg1);
            arg2.method890((byte) -100, true, arg0, var8, arg1);
        } else {
            arg2.method890((byte) -66, true, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method263(byte arg0, Component arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)I")
    public static final int method264(byte arg0, int arg1) {
        field607++;
        class72 var2 = class129.method956(arg1, 14);
        int var3 = var2.field1809;
        int var4 = var2.field1806;
        int var5 = -11 % ((-arg0 - 28) / 34);
        int var6 = var2.field1805;
        int var7 = class180.field3659[var4 - var6];
        return var7 & class24.field545[var3] >> var6;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjc;Ljava/awt/Component;Ljc;)V")
    public static final void method265(byte arg0, class85 arg1, Component arg2, class85 arg3) {
        field612++;
        if (class177.field3642) {
            return;
        }
        class178.method1180();
        int var4 = 122 / ((70 - arg0) / 51);
        byte[] var5 = arg1.method743(class153.field3210, 0, class189.field3812);
        class114.field2549 = new class200(var5, arg2);
        class124.field2752 = class114.field2549.method1308();
        class41.field952 = class163.method1108((byte) -126, class153.field3210, class144.field3083, arg3);
        class88.field2070 = class163.method1108((byte) 24, class153.field3210, class109.field2457, arg3);
        class131.field2858 = class163.method1108((byte) -121, class153.field3210, class177.field3627, arg3);
        class180.field3664 = class37.method348(arg3, 59, class153.field3210, class114.field2560);
        class136.field2936 = class37.method348(arg3, 110, class153.field3210, class123.field2722);
        class34.field814 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            class34.field814[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class34.field814[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class34.field814[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            class34.field814[var9 + 192] = 16777215;
        }
        class127.field2802 = new int[256];
        for (int var10 = 0; var10 < 64; var10++) {
            class127.field2802[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class127.field2802[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class127.field2802[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class127.field2802[var13 + 192] = 16777215;
        }
        class26.field601 = new int[256];
        for (int var14 = 0; var14 < 64; var14++) {
            class26.field601[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class26.field601[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class26.field601[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class26.field601[var17 + 192] = 16777215;
        }
        class182.field3700 = new int[32768];
        class19.field452 = new int[32768];
        class158.field3271 = new int[256];
        class158.method1094((byte) 79, null);
        class88.field2081 = false;
        class157.field3266 = new int[32768];
        class153.field3205 = class153.field3210;
        if (class90.field2106 == 0) {
            class190.field3871 = true;
        } else {
            class190.field3871 = false;
        }
        class153.field3201 = class153.field3210;
        class77.field1881 = 0;
        class48.field1183 = new int[32768];
        if (class190.field3871) {
            class91.method779((byte) 102, 2);
        } else {
            class136.method993(class153.field3210, class10.field225, 255, 64, class90.field2112, false, 2);
        }
        class129.method959(false, (byte) -112);
        class177.field3642 = true;
        class114.field2549.method1314(0, 0);
        class124.field2752.method1314(382, 0);
        class41.field952.method1083(382 - class41.field952.field3254 / 2, 18);
        class91.field2129 = new class200(128, 254);
        class73.field1810 = new class200(128, 254);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method266(Component arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method267(int arg0) {
        if (arg0 < 25) {
            field613 = null;
        }
        field614 = null;
        field613 = null;
        field606 = null;
        field611 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
    public static final void method268(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -51 / ((arg3 + 70) / 51);
        field610++;
        class54 var5 = class12.method149(arg1, arg0, 12226);
        if (var5 != null && var5.field1339 != null) {
            class131 var6 = new class131();
            var6.field2853 = var5.field1339;
            var6.field2862 = var5;
            class130.method963(var6, (byte) -59);
        }
        class33.field793 = arg1;
        class60.field1538 = arg0;
        class167.field3452 = arg2;
        class181.field3680 = true;
        class113.method901(0, var5);
    }
}
