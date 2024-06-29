import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class180 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Lbg;")
    public static class324 field2535 = new class324(3, -1);

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lgk;")
    public static class331 field2538 = new class331("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lgk;")
    public static class331 field2539 = new class331("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!up", name = "g", descriptor = "S")
    public static short field2540 = 32767;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Luu;Lma;IIIIIIJ)V", line = 7)
    public static final void method1263(class188 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2536++;
        int var10 = arg2 * arg2 + arg7 * arg7;
        if (arg5 != 256 || (long) var10 > arg8) {
            return;
        }
        int var11 = Math.min(arg0.field2711 / 2, arg0.field2672 / 2);
        if (var11 * var11 >= var10) {
            class100.method859(arg3, true, class38.field437[arg4], arg0, arg1, arg7, arg2, arg6);
            return;
        }
        var11 -= 10;
        int var12;
        if (class462.field6802 == 4) {
            var12 = (int) class328.field4588 & 0x3FFF;
        } else {
            var12 = (int) class328.field4588 + class455.field6702 & 0x3FFF;
        }
        int var13 = class340.field4724[var12];
        int var14 = class340.field4715[var12];
        if (class462.field6802 != 4) {
            var14 = var14 * 256 / (class465.field6839 + 256);
            var13 = var13 * 256 / (class465.field6839 + 256);
        }
        int var15 = arg2 * var14 + arg7 * var13 >> 15;
        int var16 = arg7 * var14 - (arg2 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class523.field7687[arg4].method127((float) arg0.field2711 / 2.0F + (float) arg3 + (float) var19, (float) arg0.field2672 / 2.0F + (float) arg6 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 61)
    public static final void method1264(byte arg0) {
        field2537++;
        class109.field1547.method2917((byte) -128);
        class500.field7422.method1944(98);
        class104.field1458.method543((byte) -98);
        class384.field5645.method781((byte) -24);
        class515.field7587.method1212(false);
        class270.field3995.method10((byte) -73);
        class153.field2169.method1584(2);
        class151.field2145.method2117(true);
        class29.field357.method1679(1068);
        class276.field4060.method2830((byte) -79);
        class284.field4134.method2501(-52);
        class504.field7479.method2004(34);
        class175.field2483.method840(-93);
        class11.field128.method1563((byte) 84);
        class215.field3100.method2735((byte) 122);
        class428.field6311.method2700(7569);
        class172.field2451.method1350((byte) 25);
        class171.field2434.method3018(64);
        class387.field5733.method1177(true);
        class348.field4829.method60((byte) 106);
        class62.method561(8);
        class293.method1859((byte) -107);
        class427.method2603(1);
        if (class365.field5281 != class297.field4260) {
            for (int var1 = 0; var1 < class371.field5515.length; var1++) {
                class371.field5515[var1] = null;
            }
            class474.field6984 = 0;
        }
        class85.method757(-99);
        class264.method1689(51);
        class382.method2330(false);
        class345.method2085(-1);
        class239.method1590(false);
        class41.field485.method1105(false);
        class225.field3300.method396();
        class427.field6304.method2872((byte) -63);
        class170.method1194((byte) 3);
        class391.field5757.method2377(0);
        class322.field4533.method2377(0);
        class3.field44.method2377(0);
        class196.field2868.method2377(0);
        class283.field4117.method2377(0);
        class91.field1256.method2377(0);
        class512.field7556.method2377(0);
        class62.field726.method2377(0);
        class240.field3533.method2377(0);
        class68.field879.method2377(0);
        class242.field3579.method2377(0);
        class279.field4087.method2377(0);
        class82.field1116.method2377(0);
        class55.field584.method2377(0);
        class129.field1865.method2377(0);
        class233.field3429.method2377(0);
        class305.field4337.method2377(0);
        class126.field1843.method2377(0);
        class193.field2807.method2377(0);
        class192.field2806.method2377(0);
        class8.field94.method2377(0);
        class355.field4952.method2377(0);
        class495.field7251.method2377(0);
        class161.field2270.method2377(0);
        if (arg0 <= 36) {
            return;
        }
        class275.field4059.method2377(0);
        class109.field1549.method2377(0);
        class263.field3865.method2377(0);
        class131.field1907.method2377(0);
        class479.field7046.method2377(0);
        class186.field2600.method2377(0);
        class405.field6027.method1105(false);
        class87.field1180.method1105(false);
        class265.field3912.method1105(false);
        class400.field5935.method1105(false);
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V", line = 156)
    public static void method1265(int arg0) {
        field2538 = null;
        field2535 = null;
        field2539 = null;
        if (arg0 != -5631) {
            method1263(null, null, -35, 96, -117, 84, 19, -50, -97L);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lcw;II)Z", line = 170)
    public static final boolean method1266(class120 arg0, int arg1, int arg2) {
        if (arg1 < 76) {
            field2538 = null;
        }
        field2534++;
        int var3 = arg0.method952(-67, 2);
        if (var3 == 0) {
            if (arg0.method952(-117, 1) != 0) {
                method1266(arg0, 104, arg2);
            }
            int var4 = arg0.method952(-64, 6);
            int var5 = arg0.method952(-121, 6);
            boolean var6 = arg0.method952(-61, 1) == 1;
            if (var6) {
                class8.field92[class293.field4221++] = arg2;
            }
            if (class384.field5647[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class241 var7 = class133.field1940[arg2];
            class364 var8 = class384.field5647[arg2] = new class364();
            var8.field1716 = arg2;
            if (class72.field921[arg2] != null) {
                var8.method2168(class72.field921[arg2], Integer.MIN_VALUE);
            }
            var8.method957(125, var7.field3565);
            var8.field1713 = var7.field3564;
            int var9 = var7.field3568;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FD38E) >> 14;
            var8.field5063 = var7.field3563;
            int var12 = var9 & 0xFF;
            var8.field1782[0] = class373.field5539[arg2];
            var8.field6328 = (byte) var10;
            var8.method2172((var12 << 6) + var5 - class476.field7013, 0, (var11 << 6) + var4 - class340.field4713);
            var8.field5076 = false;
            class133.field1940[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method952(-121, 2);
            int var14 = class133.field1940[arg2].field3568;
            class133.field1940[arg2].field3568 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method952(-49, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class133.field1940[arg2].field3568;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class133.field1940[arg2].field3568 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method952(-121, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF14) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class133.field1940[arg2].field3568;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class133.field1940[arg2].field3568 = (var27 << 28) + var29 + (var28 << 14);
            return false;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V", line = 327)
    public static final void method1267(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        if (var3 != null && var3.field2082 != null) {
            var3.field2082 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lri;")
    public abstract class74 method795(int arg0);

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public abstract void method797(int arg0);

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public abstract void method794(int arg0);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
    public abstract boolean method796(int arg0, int arg1);
}
