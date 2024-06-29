import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class342 {

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Ltq;")
    public class536 field4194 = new class536(20);

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "Ltq;")
    private class536 field4199 = new class536(64);

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Lwm;")
    private class30 field4191;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Lwm;")
    public class30 field4187;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4192 = new String[100];

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILfda;ILfda;IBII)V")
    public static final void method1981(int arg0, int arg1, int arg2, class381 arg3, int arg4, class381 arg5, int arg6, byte arg7, int arg8, int arg9) {
        field4196++;
        int var10 = arg3.method183(-21397);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class772 var12 = (class772) class237.field3231.method2931((long) var10, (byte) -116);
        if (var12 == null) {
            class388[] var13 = class388.method2226(class172.field2270, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class576.field7320.method977(var13[0], true);
            class237.field3231.method2918((long) var10, var12, 90);
        }
        class345.method2001(arg0 >> 1, arg1, arg5.field2900, -4263, arg6 >> 1, 0, arg5.field2896, arg9, arg5.method190((byte) 72) * 256, arg5.field2895);
        if (arg7 <= 39) {
            field4192 = null;
        }
        int var14 = arg4 + class128.field1716[0] - 18;
        int var15 = arg2 / 4 * 18 + var14;
        int var16 = arg8 + class128.field1716[1] - 16 - 54;
        int var17 = arg2 % 4 * 18 + var16;
        var12.method4203(var15, var17);
        if (arg3 == arg5) {
            class576.field7320.method3075(var15 - 1, 18, 18, (byte) 85, var17 - 1, -256);
        }
        class548.method2967(var15 - 1, var17 + 18, var17 - 1, (byte) -105, var15 + 18);
        class622 var18 = class634.method3385(98);
        var18.field7864 = var15;
        var18.field7865 = arg3;
        var18.field7866 = var17;
        var18.field7869 = var17 + 16;
        var18.field7871 = var15 + 16;
        class168.field2229.method855(0, var18);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
    public static final int method1982(int arg0) {
        if (class485.field6252.field6911.method1417(false) == 0) {
            for (int var1 = 0; var1 < class86.field1199; var1++) {
                if (class278.field3615[var1].method375(3206) == 's' || class278.field3615[var1].method375(3206) == 'S') {
                    class485.field6252.method2986(1, class485.field6252.field6911, (byte) 116);
                    class778.field10632 = true;
                    break;
                }
            }
        }
        field4193++;
        if (arg0 != 100) {
            return -46;
        }
        if (class93.field1291 == class4.field27) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class502.method2786(-7114);
            if (class788.field10789 == 0L) {
                class788.field10789 = var4;
            }
            if (var3 > 16384 && (var4 - class788.field10789) < 5000L) {
                if (var4 - class746.field10198 > 1000L) {
                    System.gc();
                    class746.field10198 = var4;
                }
                return 0;
            }
        }
        if (class93.field1291 == class4.field31) {
            if (class198.field2762 == null) {
                class198.field2762 = new class369(class722.field9484, class161.field2125, class676.field8742, class667.field8679);
            }
            if (!class198.field2762.method2122((byte) -79)) {
                return 0;
            }
            class560.method3034(null, (byte) -123, true, 0);
            class598.field7609 = !class385.method2213(-4);
            class566.field7173 = class662.method3608(class598.field7609 ? 34 : 32, 1, (byte) -49, false);
            class204.field2819 = class662.method3608(33, 1, (byte) -63, false);
            class171.field2264 = class662.method3608(13, 1, (byte) -128, false);
        }
        if (class93.field1291 == class4.field32) {
            boolean var6 = class204.field2819.method157(-94);
            int var7 = class253.field3439[33].method3196((byte) 110);
            int var8 = var7 + class253.field3439[class598.field7609 ? 34 : 32].method3196((byte) 104);
            int var9 = var8 + class253.field3439[13].method3196((byte) 111);
            int var10 = var9 + (var6 ? 100 : class204.field2819.method159(0));
            if (var10 != 400) {
                return var10 / 4;
            }
            class75.field1061 = class566.field7173.method140(-15616);
            class11.field99 = class204.field2819.method140(arg0 - 15716);
            class491.method2742(1, class566.field7173);
            int var11 = class485.field6252.field6919.method3637(false);
            class732.field9589 = new class527(class201.field2799, class496.field6338, class204.field2819);
            int[] var12 = class732.field9589.method2895(var11, 98);
            if (var12.length == 0) {
                var12 = class732.field9589.method2895(0, 101);
            }
            class685 var13 = new class685(class566.field7173, class171.field2264);
            if (var12.length > 0) {
                class377.field4619 = new class646[var12.length];
                for (int var14 = 0; var14 < class377.field4619.length; var14++) {
                    class377.field4619[var14] = new class98(class732.field9589.method2897(var12[var14], (byte) -33), var13);
                }
            }
        }
        if (class93.field1291 == class4.field33) {
            class747.method4059(0, class566.field7173, class171.field2264, class30.method145(arg0 ^ 0x1C));
        }
        if (class93.field1291 == class4.field34) {
            int var15 = class429.method2479(2);
            int var16 = class160.method1021(-91);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class93.field1291 == class4.field35) {
            if (class377.field4619 != null && class377.field4619.length > 0) {
                if (class377.field4619[0].method487((byte) -87) < 100) {
                    return 0;
                }
                if (class377.field4619.length > 1 && class732.field9589.method2894((byte) -62) && class377.field4619[1].method487((byte) -87) < 100) {
                    return 0;
                }
            }
            class419.method2415(class576.field7320, 11717);
            class304.method1798((byte) -105, class576.field7320);
            class26.method113((byte) 95, 1);
        }
        if (class93.field1291 == class4.field36) {
            for (int var17 = 0; var17 < 4; var17++) {
                class179.field2391[var17] = class266.method1677((byte) 114, class276.field3602, class240.field3280);
            }
        }
        if (class93.field1291 == class4.field37) {
            class172.field2270 = class662.method3608(8, 1, (byte) -108, false);
            class383.field4788 = class662.method3608(0, 1, (byte) -96, false);
            class154.field1959 = class662.method3608(1, 1, (byte) -40, false);
            class735.field9972 = class662.method3608(2, 1, (byte) -95, false);
            class622.field7868 = class662.method3608(3, 1, (byte) -79, false);
            class664.field8660 = class662.method3608(4, 1, (byte) -69, false);
            class650.field8282 = class662.method3608(5, 1, (byte) -87, true);
            class788.field10798 = class662.method3608(6, 1, (byte) -50, true);
            class470.field6128 = class662.method3608(7, 1, (byte) -42, false);
            class11.field120 = class662.method3608(9, 1, (byte) -38, false);
            class778.field10633 = class662.method3608(10, 1, (byte) -25, false);
            class559.field7105 = class662.method3608(11, 1, (byte) -71, false);
            class67.field884 = class662.method3608(12, 1, (byte) -94, false);
            class681.field8795 = class662.method3608(14, 1, (byte) -40, false);
            class407.field5402 = class662.method3608(15, 1, (byte) -106, false);
            class381.field4740 = class662.method3608(16, 1, (byte) -116, false);
            class151.field1918 = class662.method3608(17, 1, (byte) -56, false);
            class655.field8450 = class662.method3608(18, 1, (byte) -102, false);
            class410.field5436 = class662.method3608(19, 1, (byte) -50, false);
            class29.field254 = class662.method3608(20, 1, (byte) -123, false);
            class654.field8390 = class662.method3608(21, 1, (byte) -114, false);
            class169.field2248 = class662.method3608(22, 1, (byte) -25, false);
            class162.field2163 = class662.method3608(23, 1, (byte) -33, true);
            class325.field4006 = class662.method3608(24, 1, (byte) -73, false);
            class356.field4344 = class662.method3608(25, 1, (byte) -100, false);
            class526.field6686 = class662.method3608(26, 1, (byte) -93, true);
            class740.field10029 = class662.method3608(27, 1, (byte) -72, false);
            class273.field3577 = class662.method3608(28, 1, (byte) -110, true);
            class580.field7337 = class662.method3608(29, 1, (byte) -100, false);
            class414.field5480 = class662.method3608(30, 1, (byte) -21, true);
            class790.field10813 = class662.method3608(31, 1, (byte) -102, true);
            class740.field10032 = class662.method3608(36, 2, (byte) -53, true);
        }
        if (class93.field1291 == class4.field38) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class253.field3439[var19] != null) {
                    var18 += class253.field3439[var19].method3196((byte) 87) * class429.field5639[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class683.field8815 < 0) {
                    class683.field8815 = var18;
                }
                return (var18 - class683.field8815) * 100 / (100 - class683.field8815);
            }
            class607.method3260(class172.field2270, arg0 ^ 0x64);
            class747.method4059(0, class172.field2270, class171.field2264, class30.method145(111));
        }
        if (class93.field1291 == class4.field39) {
            if (class780.field10643 == -1) {
                class780.field10643 = class788.field10798.method135(0, "scape main");
            }
            class595.method3209(105);
            class26.method113((byte) 95, 2);
        }
        if (class93.field1291 == class4.field40) {
            class263.method1668(class414.field5480, arg0 - 1455598152, class740.field10014);
        }
        if (class93.field1291 == class4.field41) {
            int var20 = class503.method2791((byte) -82);
            if (var20 < 100) {
                return var20;
            }
            class557.method3022((byte) 56, class273.field3577.method148((byte) 125, 1));
            class37.method227((byte) 109, class273.field3577.method148((byte) -128, 3));
            class754.field10274 = new class334(class273.field3577);
        }
        if (class93.field1291 == class4.field42) {
            if (class20.field190 != -1 && !class470.field6128.method127((byte) 90, class20.field190, 0)) {
                return 99;
            }
            class345.field4229 = new class434(class526.field6686, class11.field120, class172.field2270);
            class761.field10377 = new class755(class201.field2799, class496.field6338, class735.field9972);
            class66.field869 = new class356(class201.field2799, class496.field6338, class735.field9972, class754.field10274);
            class542.field6810 = new class382(class201.field2799, class496.field6338, class735.field9972, class172.field2270);
            class407.field5416 = new class684(class201.field2799, class496.field6338, class151.field1918);
            class571.field7223 = new class199(class201.field2799, class496.field6338, class735.field9972);
            class235.field3225 = new class472(class201.field2799, class496.field6338, class735.field9972);
            class111.field1482 = new class342(class201.field2799, class496.field6338, class735.field9972, class172.field2270);
            class115.field1518 = new class691(class201.field2799, class496.field6338, class735.field9972, class470.field6128);
            class515.field6571 = new class511(class201.field2799, class496.field6338, class735.field9972);
            class736.field9975 = new class341(class201.field2799, class496.field6338, class735.field9972);
            class390.field4983 = new class783(class201.field2799, class496.field6338, true, class381.field4740, class470.field6128);
            class272.field3575 = new class401(class201.field2799, class496.field6338, class735.field9972, class172.field2270);
            class702.field9289 = new class480(class201.field2799, class496.field6338, class735.field9972, class172.field2270);
            class595.field7561 = new class131(class201.field2799, class496.field6338, true, class655.field8450, class470.field6128);
            class640.field8189 = new class117(class201.field2799, class496.field6338, true, class761.field10377, class410.field5436, class470.field6128);
            class55.field713 = new class306(class201.field2799, class496.field6338, class735.field9972);
            class143.field1864 = new class778(class201.field2799, class496.field6338, class29.field254, class383.field4788, class154.field1959);
            class55.field708 = new class723(class201.field2799, class496.field6338, class735.field9972);
            class526.field6688 = new class545(class201.field2799, class496.field6338, class735.field9972);
            class62.field819 = new class93(class201.field2799, class496.field6338, class654.field8390, class470.field6128);
            class406.field5387 = new class280(class201.field2799, class496.field6338, class735.field9972);
            class4.field53 = new class670(class201.field2799, class496.field6338, class735.field9972);
            class589.field7476 = new class108(class201.field2799, class496.field6338, class735.field9972);
            class229.field3089 = new class37(class201.field2799, class496.field6338, class169.field2248);
            class182.field2489 = new class451(class201.field2799, class496.field6338, class735.field9972);
            class451.field5893 = new class44(class201.field2799, class496.field6338, class735.field9972);
            class50.method323(class172.field2270, class171.field2264, class470.field6128, class622.field7868, (byte) -91);
            class225.method1452(class580.field7337, (byte) 92);
            class32.field318 = new class203(class496.field6338, class325.field4006, class356.field4344);
            class389.field4977 = new class517(class496.field6338, class325.field4006, class356.field4344, new class261());
            class504.method2792((byte) -120);
            class390.field4983.method4294(true, class485.field6252.field6942.method2278(false) == 0);
            class381.field4705 = new class228();
            class723.method3873(false);
            class752.method4076(class740.field10029, (byte) -87);
            class480.method2693(class345.field4229, -120, class470.field6128);
            class731 var21 = new class731(class778.field10633.method142(-1, "huffman", ""));
            class33.method186(var21, 0);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class259.field3487 = class168.method1069(5123);
            class231.field3108 = new class364(true, class740.field10014);
        }
        if (class93.field1291 == class4.field44) {
            int var22 = class571.method3081(-1, class172.field2270) + class303.method1795(true, false);
            int var23 = class650.method3507(arg0 ^ 0x74) + class160.method1021(-120);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class93.field1291 == class4.field45) {
            class402.method2343(class162.field2163, class571.field7223, class235.field3225, class390.field4983, class272.field3575, class702.field9289, class381.field4705);
        }
        if (class93.field1291 == class4.field46) {
            class176.field2317 = new int[class589.field7476.field1461];
            class27.field230 = new String[class4.field53.field8695];
            class681.field8791 = new boolean[class589.field7476.field1461];
            for (int var24 = 0; var24 < class589.field7476.field1461; var24++) {
                if (class589.field7476.method642(var24, -17).field653 == 0) {
                    class681.field8791[var24] = true;
                    class104.field1396++;
                }
                class176.field2317[var24] = -1;
            }
            class117.method703(-105);
            class251.field3425 = class622.field7868.method135(0, "loginscreen");
            class318.field3956 = class622.field7868.method135(0, "lobbyscreen");
            class650.field8282.method147((byte) -128, true, false);
            class788.field10798.method147((byte) -128, true, true);
            class172.field2270.method147((byte) -128, true, true);
            class171.field2264.method147((byte) -128, true, true);
            class778.field10633.method147((byte) -128, true, true);
            class622.field7868.method147((byte) -128, true, true);
            class499.field6406 = true;
            class735.field9972.field294 = 2;
            class151.field1918.field294 = 2;
            class381.field4740.field294 = 2;
            class655.field8450.field294 = 2;
            class410.field5436.field294 = 2;
            class29.field254.field294 = 2;
            class654.field8390.field294 = 2;
        }
        if (class93.field1291 == class4.field47) {
            if (!class683.method3667(class251.field3425, arg0 - 192)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class647.field8259[class251.field3425].length; var26++) {
                class391 var27 = class647.field8259[class251.field3425][var26];
                if (var27.field5007 == 5 && var27.field5160 != -1 && !class172.field2270.method127((byte) 78, var27.field5160, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class93.field1291 == class4.field48) {
            class589.method3167(true, 1);
        }
        if (class93.field1291 == class4.field49) {
            class601.field7648.method1330(255);
            try {
                class181.field2469.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class566.field7173 = null;
            class377.field4619 = null;
            class732.field9589 = null;
            class181.field2469 = null;
            class204.field2819 = null;
            class601.field7648 = null;
            class141.method802(arg0 ^ 0xFFFFFFE2);
            class64.field836 = class485.field6252.field6911.method1417(false) == 1;
            class485.field6252.method2986(1, class485.field6252.field6911, (byte) -100);
            if (class64.field836) {
                class485.field6252.method2986(0, class485.field6252.field6922, (byte) -92);
            } else if (class485.field6252.field6922.field5492 && class231.field3108.field4432 < 512 && class231.field3108.field4432 != 0) {
                class485.field6252.method2986(0, class485.field6252.field6922, (byte) 67);
            }
            class627.method3356(arg0 ^ 0x55);
            if (class64.field836) {
                class432.method2483((byte) 76, 0, false);
            } else {
                class432.method2483((byte) 76, class485.field6252.field6922.method2402(false), false);
            }
            class52.method329(-1, false, class485.field6252.field6935.method643(false), -1, 0);
            class419.method2415(class576.field7320, 11717);
            class304.method1798((byte) -105, class576.field7320);
            class192.method1341(class172.field2270, class576.field7320, 0);
            class742.method4035((byte) 61, class662.field8639);
        }
        return class232.method1488((byte) -87);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
    public static final void method1983(int arg0, int arg1, int arg2) {
        field4195++;
        class62.method368(arg0, (byte) 70, arg1);
        if (arg2 != -16858) {
            field4197 = 67;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
    public final void method1984(int arg0) {
        class536 var2 = this.field4199;
        synchronized (this.field4199) {
            this.field4199.method2932((byte) 80);
        }
        field4188++;
        if (arg0 > 20) {
            class536 var3 = this.field4194;
            synchronized (this.field4194) {
                this.field4194.method2932((byte) 80);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
    public final void method1985(int arg0) {
        field4189++;
        class536 var2 = this.field4199;
        synchronized (this.field4199) {
            this.field4199.method2919(0);
        }
        class536 var3 = this.field4194;
        synchronized (this.field4194) {
            if (arg0 != -9315) {
                this.method1984(-108);
            }
            this.field4194.method2919(0);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Leja;")
    public final class678 method1986(int arg0, int arg1) {
        field4198++;
        class536 var3 = this.field4199;
        class678 var4;
        synchronized (this.field4199) {
            var4 = (class678) this.field4199.method2931((long) arg1, (byte) -95);
            if (arg0 != 2) {
                this.field4194 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field4191;
        byte[] var6;
        synchronized (this.field4191) {
            var6 = this.field4191.method139(46, (byte) -94, arg1);
        }
        class678 var7 = new class678();
        var7.field8770 = this;
        if (var6 != null) {
            var7.method3645(24518, new class234(var6));
        }
        class536 var8 = this.field4199;
        synchronized (this.field4199) {
            this.field4199.method2918((long) arg1, var7, 116);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public static void method1987(byte arg0) {
        if (arg0 <= 120) {
            field4197 = -32;
        }
        field4192 = null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)V")
    public final void method1988(int arg0, int arg1) {
        class536 var3 = this.field4199;
        synchronized (this.field4199) {
            if (arg0 <= 77) {
                return;
            }
            this.field4199.method2928(true, arg1);
        }
        field4190++;
        class536 var4 = this.field4194;
        synchronized (this.field4194) {
            this.field4194.method2928(true, arg1);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lega;ILwm;Lwm;)V")
    private class342(class473 arg0, int arg1, class30 arg2, class30 arg3) {
        this.field4191 = arg2;
        this.field4187 = arg3;
        this.field4191.method138(0, 46);
    }
}
