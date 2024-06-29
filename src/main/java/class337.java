import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class337 extends class29 {

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "J")
    public static long field4968 = 0L;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field4972 = 0;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field4974 = 1;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field4970 = 1;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Lvq;")
    public static class24 field4976 = new class24(89, 2);

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 5)
    public static final void method2180(byte arg0) {
        class272.method1859(0, false);
        field4969++;
        class266.field3941 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class24.field336.length; var2++) {
            if (class161.field2148[var2] != -1 && class24.field336[var2] == null) {
                class24.field336[var2] = class243.field3602.method715(0, (byte) 45, class161.field2148[var2]);
                if (class24.field336[var2] == null) {
                    var1 = false;
                    class266.field3941++;
                }
            }
            if (class330.field4905[var2] != -1 && class38.field532[var2] == null) {
                class38.field532[var2] = class243.field3602.method705(class330.field4905[var2], 0, (byte) 109, class124.field1652[var2]);
                if (class38.field532[var2] == null) {
                    var1 = false;
                    class266.field3941++;
                }
            }
            if (class22.field314[var2] != -1 && class215.field3066[var2] == null) {
                class215.field3066[var2] = class243.field3602.method715(0, (byte) 110, class22.field314[var2]);
                if (class215.field3066[var2] == null) {
                    class266.field3941++;
                    var1 = false;
                }
            }
            if (class440.field6387[var2] != -1 && class322.field4762[var2] == null) {
                class322.field4762[var2] = class243.field3602.method715(0, (byte) 114, class440.field6387[var2]);
                if (class322.field4762[var2] == null) {
                    var1 = false;
                    class266.field3941++;
                }
            }
            if (class222.field3200 != null && class189.field2648[var2] == null && class222.field3200[var2] != -1) {
                class189.field2648[var2] = class243.field3602.method705(class222.field3200[var2], 0, (byte) 118, class124.field1652[var2]);
                if (class189.field2648[var2] == null) {
                    class266.field3941++;
                    var1 = false;
                }
            }
        }
        if (class339.field5003 == null) {
            if (class272.field4020 == null || !class82.field1013.method735(-1, class272.field4020.field3543 + "_staticelements")) {
                class339.field5003 = new class86(0);
            } else if (class82.field1013.method736(7000, class272.field4020.field3543 + "_staticelements")) {
                class339.field5003 = class446.method2742(class82.field1013, class33.field472, false, class272.field4020.field3543 + "_staticelements");
            } else {
                class266.field3941++;
                var1 = false;
            }
        }
        if (!var1) {
            class463.field6835 = 1;
            return;
        }
        boolean var3 = true;
        class259.field3817 = 0;
        for (int var4 = 0; var4 < class24.field336.length; var4++) {
            byte[] var20 = class38.field532[var4];
            if (var20 != null) {
                int var21 = (class356.field5174[var4] >> 8) * 64 - class28.field399;
                int var22 = (class356.field5174[var4] & 0xFF) * 64 - class134.field1846;
                if (class388.field5663) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class82.method551(var22, var21, var20, (byte) 59);
            }
            byte[] var23 = class322.field4762[var4];
            if (var23 != null) {
                int var24 = (class356.field5174[var4] >> 8) * 64 - class28.field399;
                int var25 = (class356.field5174[var4] & 0xFF) * 64 - class134.field1846;
                if (class388.field5663) {
                    var24 = 10;
                    var25 = 10;
                }
                var3 &= class82.method551(var25, var24, var23, (byte) 57);
            }
        }
        if (!var3) {
            class463.field6835 = 2;
            return;
        }
        if (class463.field6835 != 0) {
            class76.method536(true, class196.field2755.method2543(false, class153.field2073) + "<br>(100%)", false, class13.field215);
        }
        class60.method457(14597);
        class446.method2748(-17);
        boolean var5 = false;
        if (class74.field942.method69() && class13.field224) {
            for (int var6 = 0; var6 < class24.field336.length; var6++) {
                if (class322.field4762[var6] != null || class215.field3066[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class76.field969) {
            var7 = class136.field1868[class315.field4618];
        } else {
            var7 = class15.field249[class315.field4618];
        }
        if (class74.field942.method167()) {
            var7++;
        }
        class69.method509(7, 4, class195.field2745, class78.field984, var7, var5, class74.field942.method103() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class382.field5610[var8].method1221((byte) -42);
        }
        class145.method1004(0);
        class387.method2443(-1066, false);
        class264.method1818((byte) -120);
        class60.method457(14597);
        System.gc();
        class272.method1859(0, true);
        class377.method2383(true, 4, false);
        int[][] var9 = null;
        if (!class388.field5663) {
            class243.method1629((byte) 106, false);
            class124.method840(-28493, class78.field984 >> 4, class195.field2745 >> 4);
            class59.method451(5000);
            class3.method24(false, class74.field942, 4, (int[][]) null, (byte) -114);
            var9 = class264.field3910[0];
            class272.method1859(0, true);
            class92.method629(-8, false);
            if (class189.field2648 != null) {
                class315.method2083((byte) -102);
            }
        }
        if (class388.field5663) {
            class3.method28(false, true);
            class124.method840(-28493, class78.field984 >> 4, class195.field2745 >> 4);
            class59.method451(5000);
            class3.method24(false, class74.field942, 4, (int[][]) null, (byte) -117);
            var9 = class264.field3910[0];
            class272.method1859(0, true);
            class131.method882(26280, false);
        }
        class446.method2748(-7);
        class272.method1859(0, true);
        class401.method2505(class74.field942, true, 4, (class378) null, false, class382.field5610);
        class392.method2466(4, 44, class74.field942);
        class272.method1859(0, true);
        int var10 = class253.field3722;
        if (class423.field6117 < var10) {
            var10 = class423.field6117;
        }
        if (var10 < class423.field6117 - 1) {
            var10 = class423.field6117 - 1;
        }
        if (class163.method1082((byte) 95)) {
            class62.method462(0);
        } else {
            class62.method462(var10);
        }
        class2.method17(0);
        if (var5) {
            class204.method1400(true);
            class377.method2383(true, 1, true);
            if (!class388.field5663) {
                class243.method1629((byte) 7, true);
                class3.method24(true, class74.field942, 1, var9, (byte) -76);
                class272.method1859(0, true);
                class92.method629(113, true);
                class392.method2466(1, 46, class74.field942);
            }
            if (class388.field5663) {
                class3.method28(true, true);
                class3.method24(true, class74.field942, 1, var9, (byte) -123);
                class272.method1859(0, true);
                class131.method882(26280, true);
            }
            class446.method2748(-83);
            class272.method1859(0, true);
            class401.method2505(class74.field942, true, 1, class28.field401[0], true, class382.field5610);
            class392.method2466(1, 111, class74.field942);
            class272.method1859(0, true);
            class2.method17(0);
            class204.method1400(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class195.field2745; var18++) {
                for (int var19 = 0; var19 < class78.field984; var19++) {
                    class342.method2224(true, var18, var19, var11);
                }
            }
        }
        class51.method395((byte) 19);
        class60.method457(14597);
        class322.method2118(-126);
        class446.method2748(-58);
        class359.field5226 = false;
        class38.method343((byte) 52);
        if (class279.field4116 != null && class72.field933 != null && class120.field1610 == 25) {
            class257.method1773((byte) -10, class124.field1650);
            class296.field4319++;
            class159.field2132.method1721(25153, 1057001181);
        }
        if (!class388.field5663) {
            int var12 = (class92.field1147 - (class195.field2745 >> 4)) / 8;
            int var13 = (class92.field1147 + (class195.field2745 >> 4)) / 8;
            int var14 = (class135.field1854 - (class78.field984 >> 4)) / 8;
            int var15 = (class135.field1854 + (class78.field984 >> 4)) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var14 > var17 || var15 < var17) {
                        class243.field3602.method713("m" + var16 + "_" + var17, 0);
                        class243.field3602.method713("l" + var16 + "_" + var17, 0);
                    }
                }
            }
        }
        if (class120.field1610 == 28) {
            client.method1796(10, 122);
        } else {
            client.method1796(30, 101);
            if (class72.field933 != null) {
                class257.method1773((byte) -10, class401.field5799);
            }
        }
        class421.method2600((byte) 122);
        class60.method457(14597);
        class419.method2591((byte) -88);
        if (arg0 < 7) {
            field4970 = -105;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 437)
    public static void method2181(byte arg0) {
        field4976 = null;
        if (arg0 <= 41) {
            method2183((class104) null, 72);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V", line = 448)
    public static final void method2182(int arg0, int arg1, int arg2) {
        if (arg1 != 466) {
            method2180((byte) 63);
        }
        class31.field426[arg0] = arg2;
        field4977++;
        class331 var3 = (class331) class346.field5101.method609((long) arg0, 85);
        if (var3 == null) {
            class331 var4 = new class331(class43.method364(-16756) + 500L);
            class346.field5101.method606(1, var4, (long) arg0);
        } else {
            var3.field4908 = class43.method364(-16756) + 500L;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lct;I)I", line = 485)
    public static final int method2183(class104 arg0, int arg1) {
        field4973++;
        int var2 = 0;
        if (arg0.method708(class137.field1880, (byte) -98)) {
            var2++;
        }
        if (arg0.method708(class342.field5041, (byte) -90)) {
            var2++;
        }
        return arg1 >= -120 ? 109 : var2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IC)Z", line = 509)
    public static final boolean method2184(int arg0, char arg1) {
        field4975++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class454.method2811(false, arg1)) {
            return true;
        } else {
            char[] var2 = class251.field3688;
            int var3 = 0;
            if (arg0 >= -51) {
                method2182(16, 18, -119);
            }
            while (var2.length > var3) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
                var3++;
            }
            char[] var4 = class417.field6027;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
