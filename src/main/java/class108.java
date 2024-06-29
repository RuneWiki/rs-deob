import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class108 {

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lvj;")
    public static class106 field1653 = new class106(16);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 35)
    public static final void method829(boolean arg0) {
        field1649++;
        while (class88.field1293.method65(class79.field1112, !arg0) >= 11) {
            int var1 = class88.field1293.method63(115, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class319.field4964[var1] == null) {
                var2 = true;
                class319.field4964[var1] = new class121();
                if (class149.field2251[var1] != null) {
                    class319.field4964[var1].method926(class149.field2251[var1], 3);
                }
            }
            class225.field3504[class262.field3900++] = var1;
            class121 var3 = class319.field4964[var1];
            var3.field4481 = class312.field4852;
            int var4 = class88.field1293.method63(124, 5);
            int var5 = class88.field1293.method63(114, 1);
            if (var5 == 1) {
                class227.field3515[class122.field1922++] = var1;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class160.field2387[class88.field1293.method63(127, 3)];
            if (var2) {
                var3.field4497 = var3.field4438 = var6;
            }
            int var7 = class88.field1293.method63(124, 5);
            int var8 = class88.field1293.method63(118, 1);
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method932((byte) 72, class235.field3602.field4477[0] + var4, class235.field3602.field4470[0] + var7, var8 == 1);
        }
        class88.field1293.method64(-127);
        if (arg0) {
            method833(73, -124, -123, (byte) -104, -48);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILhb;)Lnk;", line = 126)
    public static final class13 method830(int arg0, class35 arg1) {
        class13 var2 = new class13();
        var2.field151 = arg1.method300(-1394191632);
        field1652++;
        if (arg0 < 2) {
            return (class13) null;
        } else {
            var2.field144 = class69.method579(var2.field151, -32761);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 159)
    public static final void method831(int arg0) {
        if (class256.field3818 != null) {
            class256.field3818.method1852(16384);
        }
        int var1 = -125 / ((-arg0 - 34) / 38);
        if (class261.field3861 != null) {
            class261.field3861.method1852(16384);
        }
        class50.method460((byte) 77, class213.field3387, 22050, 2);
        field1651++;
        class256.field3818 = class171.method1252(class301.field4715, -14, class171.field2548, 0, 22050);
        class256.field3818.method1856(83, class110.field1747);
        class261.field3861 = class171.method1252(class301.field4715, -37, class171.field2548, 1, 2048);
        class261.field3861.method1856(94, class200.field3165);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 208)
    public static void method832(int arg0) {
        if (arg0 > -34) {
            method829(false);
        }
        field1653 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIBI)V", line = 243)
    public static final void method833(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1656++;
        if (class36.field534) {
            class194.method1416(arg2, arg1, arg0 + arg2, arg1 - -arg4);
            class194.method1413(arg2, arg1, arg0, arg4, 0);
        } else {
            class168.method1234(arg2, arg1, arg2 + arg0, arg1 + arg4);
            class168.method1224(arg2, arg1, arg0, arg4, 0);
        }
        if (class204.field3244 < 100) {
            return;
        }
        if (class162.field2400 == null || class162.field2400.field312 != arg0 || class162.field2400.field315 != arg4) {
            class134 var5 = new class134(arg0, arg4);
            class168.method1244(var5.field2101, arg0, arg4);
            class219.method1568(arg0, 0, class87.field1280, (byte) -101, arg4, 0, 0, class193.field3089, 0);
            if (class36.field534) {
                class162.field2400 = new class221(var5);
            } else {
                class162.field2400 = var5;
            }
            if (class36.field534) {
                class168.field2525 = null;
            } else {
                class128.field2023.method1474((byte) -105);
            }
        }
        class162.field2400.method189(arg2, arg1);
        if (arg3 < 7) {
            field1653 = (class106) null;
        }
        int var6 = class105.field1606 * arg4 / class193.field3089 + arg1;
        int var7 = class45.field712 * arg0 / class87.field1280 + arg2;
        int var8 = class57.field857 * arg4 / class193.field3089;
        int var9 = class121.field1913 * arg0 / class87.field1280;
        int var10 = 16711680;
        if (class3.field12 == 1) {
            var10 = 16777215;
        }
        if (class36.field534) {
            class194.method1412(var7, var6, var9, var8, var10, 128);
            class194.method1406(var7, var6, var9, var8, var10);
        } else {
            class168.method1226(var7, var6, var9, var8, var10, 128);
            class168.method1228(var7, var6, var9, var8, var10);
        }
        if (class261.field3862 <= 0) {
            return;
        }
        int var11;
        if (class27.field313 > 10) {
            var11 = (20 - class27.field313) * 25;
        } else {
            var11 = class27.field313 * 25;
        }
        for (class113 var12 = (class113) class95.field1363.method986(false); var12 != null; var12 = (class113) class95.field1363.method982(14877)) {
            if (class107.field1644 == var12.field1782) {
                int var13 = var12.field1774 * arg0 / class87.field1280 + arg2;
                int var14 = var12.field1780 * arg4 / class193.field3089 + arg1;
                if (class36.field534) {
                    class194.method1412(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
                } else {
                    class168.method1226(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 347)
    public static final void method834(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class252.field3767 != null) {
            class23 var1 = class252.field3767;
            synchronized (class252.field3767) {
                class252.field3767 = null;
            }
        }
        field1648++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I", line = 364)
    public static final int method835(int arg0, String arg1, int arg2, String arg3) {
        field1655++;
        int var4 = arg1.length();
        int var5 = 0;
        int var6 = arg3.length();
        char var7 = 0;
        char var8 = 0;
        int var9 = 0;
        while (var4 > var9 - var7 || (var5 - var8) < var6) {
            if (var9 - var7 >= var4) {
                return -1;
            }
            if (var6 <= var5 - var8) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg1.charAt(var9++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg3.charAt(var5++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var7 = class269.method1873(-224, var22);
            var8 = class269.method1873(-224, var24);
            char var26 = class59.method525(true, var22, arg2);
            char var27 = class59.method525(true, var24, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class310.method2148((byte) 41, var28, arg2) - class310.method2148((byte) 41, var29, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg2 == 2) {
                var13 = var4 - var11 - 1;
                var12 = var6 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class310.method2148((byte) 41, var16, arg2) - class310.method2148((byte) 41, var17, arg2);
                }
            }
        }
        if (arg0 <= 81) {
            field1653 = (class106) null;
        }
        int var18 = var4 - var6;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg1.charAt(var19);
            char var21 = arg3.charAt(var19);
            if (var20 != var21) {
                return class310.method2148((byte) 41, var20, arg2) - class310.method2148((byte) 41, var21, arg2);
            }
        }
        return 0;
    }
}
