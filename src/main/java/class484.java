import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class484 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lkl;")
    public static class55 field7072 = new class55(9, 0, 4, 1);

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Ldi;")
    public static class83 field7075 = new class83(66, 2);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Lwj;")
    public static class270 field7077 = new class270(108, -2);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[[S")
    public static short[][] field7078;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILco;)V", line = 3)
    public static final void method2846(int arg0, class77 arg1) {
        field7076++;
        int var2 = arg1.field1088 - class441.field6516;
        int var3 = arg1.field1080 * 128 + (arg1.method626((byte) 120) * 64);
        int var4 = arg1.field1077 * 128 + arg1.method626((byte) 120) * 64;
        arg1.field1118 = 0;
        arg1.field1732 += (var3 - arg1.field1732) / var2;
        arg1.field1735 += (var4 - arg1.field1735) / var2;
        if (arg1.field1028 == 0) {
            arg1.method619(-18477, 8192);
        }
        if (arg1.field1028 == 1) {
            arg1.method619(-18477, 12288);
        }
        if (arg1.field1028 == 2) {
            arg1.method619(-18477, 0);
        }
        if (~arg1.field1028 == arg0) {
            arg1.method619(-18477, 4096);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2847(int arg0) {
        class511.field7575.method1768(-127);
        field7074++;
        class324.field4405.method1405(true);
        class168.field2515.method1341(1);
        class78.field1141.method2107((byte) -65);
        class158.field2401.method2209(-1);
        class328.field4480.method3089((byte) -108);
        class222.field3168.method123((byte) 50);
        class27.field357.method1475((byte) 63);
        class302.field4142.method1567(7470);
        class73.field996.method822(true);
        class501.field7375.method1304(false);
        class227.field3232.method2420(64);
        class362.field5299.method142(115);
        class351.field5158.method2294(-108);
        class177.field2622.method2034(57);
        class214.field2995.method1269(-120);
        int var1 = 14 / ((arg0 - 55) / 60);
        class328.field4481.method2644((byte) -118);
        class104.field1572.method1599(98);
        class253.field3517.method722(-2);
        class360.field5255.method2284(false);
        class461.method2707((byte) -124);
        class49.method436(8192);
        class110.method800(false);
        class135.method918(8170);
        class33.field440.method1066(4080);
        class318.field4371.method1066(4080);
        class386.field5631.method1066(4080);
        class172.field2552.method1066(4080);
        class429.field6318.method1066(4080);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIIBZ)V", line = 81)
    public static final void method2848(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field7073++;
        if (!arg4 && class38.field474 == arg2 && class434.field6363 == arg1 && class436.field6379 == class124.field1854 || class20.field269.method1712(class152.field2332, false)) {
            return;
        }
        class434.field6363 = arg1;
        class38.field474 = arg2;
        class124.field1854 = class436.field6379;
        if (class20.field269.method1712(class152.field2332, false)) {
            class124.field1854 = 0;
        }
        if (arg0) {
            class448.method2651(28, (byte) 112);
        } else {
            class448.method2651(25, (byte) 112);
        }
        class203.method1262(class297.field4084, true, class156.field2371.method2731(62, class372.field5455), 2048);
        int var5 = class510.field7566;
        class510.field7566 = (class38.field474 - (class527.field7799 >> 4)) * 8;
        int var6 = class14.field204;
        class14.field204 = (class434.field6363 - (class422.field6182 >> 4)) * 8;
        class61.field764 = class350.method2091(class38.field474 * 8, class434.field6363 * 8);
        class398.field5823 = null;
        int var7 = class510.field7566 - var5;
        int var8 = class14.field204 - var6;
        if (arg0) {
            class275.field3772 = 0;
            int var9 = (class527.field7799 - 1) * 128;
            int var10 = class422.field6182 * 128 - 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class502 var12 = class378.field5533[var11];
                if (var12 != null) {
                    var12.field1732 -= var7 * 128;
                    var12.field1735 -= var8 * 128;
                    if (var12.field1732 >= 0 && var9 >= var12.field1732 && var12.field1735 >= 0 && var10 >= var12.field1735) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field1127[var14] -= var7;
                            var12.field1117[var14] -= var8;
                            if (var12.field1127[var14] < 0 || var12.field1127[var14] >= class527.field7799 || var12.field1117[var14] < 0 || class422.field6182 <= var12.field1117[var14]) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class65.field899[class275.field3772++] = var11;
                        } else {
                            class378.field5533[var11].method2939(116, null);
                            class378.field5533[var11] = null;
                        }
                    } else {
                        class378.field5533[var11].method2939(67, null);
                        class378.field5533[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class502 var23 = class378.field5533[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field1127[var24] -= var7;
                        var23.field1117[var24] -= var8;
                    }
                    var23.field1735 -= var8 * 128;
                    var23.field1732 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class438 var21 = class12.field182[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1127[var22] -= var7;
                    var21.field1117[var22] -= var8;
                }
                var21.field1735 -= var8 * 128;
                var21.field1732 -= var7 * 128;
            }
        }
        class371[] var17 = class218.field3046;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class371 var20 = var17[var18];
            if (var20 != null) {
                var20.field5423 -= var7 * 128;
                var20.field5422 -= var8 * 128;
            }
        }
        if (arg3 <= 24) {
            method2846(-112, null);
        }
        class365.method2202(var7, var8, 103);
        for (class12 var19 = (class12) class438.field6435.method2818((byte) 126); var19 != null; var19 = (class12) class438.field6435.method2820((byte) -58)) {
            var19.field191 -= var8;
            var19.field190 -= var7;
            if (class403.field5918 != 3 && (var19.field190 < 0 || var19.field191 < 0 || class527.field7799 <= var19.field190 || class422.field6182 <= var19.field191)) {
                var19.method1565(0);
            }
        }
        if (class228.field3244 != 0) {
            class285.field3961 -= var8;
            class228.field3244 -= var7;
        }
        class438.method2577(88);
        if (arg0) {
            class458.field6723 -= var8;
            class329.field4493 -= var7 * 128;
            class373.field5478 -= var8 * 128;
            class501.field7377 -= var8;
            class439.field6489 -= var7;
            class309.field4203 -= var7;
            if (Math.abs(var7) > class527.field7799 || Math.abs(var8) > class422.field6182) {
                class136.method920((byte) -1);
            }
        } else if (class491.field7168 == 4) {
            class405.field5940 -= var7 * 128;
            class177.field2621 -= var8 * 128;
            class121.field1818 -= var8 * 128;
            class240.field3370 -= var7 * 128;
        } else {
            class491.field7168 = 1;
        }
        class44.method411((byte) 53);
        class214.method1327(5743);
        class511.field7570.method2814((byte) 95);
        class53.field641.method2814((byte) 74);
        class388.field5656.method2457(8165);
        class78.method631(-1);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 326)
    public static void method2849(int arg0) {
        field7072 = null;
        field7078 = null;
        field7075 = null;
        field7077 = null;
        if (arg0 != 25) {
            method2848(false, -123, -7, (byte) 55, false);
        }
    }
}
