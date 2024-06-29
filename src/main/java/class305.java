import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class305 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lhc;")
    public static class368 field4152 = new class368("flash2:", "", "", "");

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[[[B")
    public static byte[][][] field4155;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Ljk;", line = 4)
    public static final class403 method1843(int arg0, int arg1, int arg2) {
        class63 var3 = class341.field4617[arg0][arg1][arg2];
        return var3 == null ? null : var3.field863;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZIB)V", line = 15)
    public static final void method1844(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        field4151++;
        if (class341.field4617 == null) {
            class354.field4765.method461(arg1, -16777216, arg4, -91, arg2, arg0);
            return;
        }
        class368.field5106++;
        if (class359.field4970 != null && class359.field4970.field40 - ((class359.field4970.method1285(-105) - 1) * 64) >> 7 == class93.field1300 && (class359.field4970.field44 - (class359.field4970.method1285(-126) * 64 - 64) >> 7) == class233.field3265) {
            class233.field3265 = -1;
            class93.field1300 = -1;
            class49.method404(-123);
        }
        class192.method1332(126);
        if (!arg3) {
            class237.method1550(-24501);
        }
        class159.method1154((byte) -45);
        class274.method1730(arg4, arg0, 512, arg1, true, arg2);
        int var6 = class399.field5535;
        int var7 = class353.field4746;
        int var8 = class127.field1905;
        int var9 = class65.field885;
        if (class26.field337 == 1) {
            int var10 = (int) class356.field4785;
            if (var10 < (class343.field4624 >> 8)) {
                var10 = class343.field4624 >> 8;
            }
            if (class1.field3[4] && class419.field5822[4] + 128 > var10) {
                var10 = class419.field5822[4] + 128;
            }
            int var11 = (int) class332.field4483 + class312.field4239 & 0x3FFF;
            class341.method2083(var10, var11, ((var10 >> 3) * 3) + 600, 0, class431.field6044, class436.field6153, class50.method408(class343.field4623, class359.field4970.field40, class359.field4970.field44, 16) - 50, var7);
        } else if (class26.field337 == 4) {
            int var12 = (int) class356.field4785;
            if (var12 < class343.field4624 >> 8) {
                var12 = class343.field4624 >> 8;
            }
            if (class1.field3[4] && (class419.field5822[4] + 128) > var12) {
                var12 = class419.field5822[4] + 128;
            }
            int var13 = (int) class332.field4483 & 0x3FFF;
            class341.method2083(var12, var13, ((var12 >> 3) * 3) + 600, 0, class431.field6044, class436.field6153, class50.method408(class343.field4623, class24.field309, class81.field1126, 16) - 50, var7);
        } else if (class26.field337 == 5) {
            class39.method345((byte) 29, var7);
        }
        int var14 = class63.field874;
        int var15 = class104.field1433;
        int var16 = class375.field5213;
        int var17 = class389.field5410;
        int var18 = class86.field1208;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class1.field3[var19]) {
                int var22 = (int) ((double) (-class118.field1802[var19]) + (double) (class118.field1802[var19] * 2 + 1) * Math.random() + Math.sin((double) class162.field2298[var19] / 100.0D * (double) class30.field411[var19]) * (double) class419.field5822[var19]);
                if (var19 == 4) {
                    class389.field5410 += var22;
                    if (class389.field5410 < 1024) {
                        class389.field5410 = 1024;
                    } else if (class389.field5410 > 3072) {
                        class389.field5410 = 3072;
                    }
                }
                if (var19 == 2) {
                    class375.field5213 += var22;
                }
                if (var19 == 0) {
                    class63.field874 += var22;
                }
                if (var19 == 3) {
                    class86.field1208 = class86.field1208 + var22 & 0x3FFF;
                }
                if (var19 == 1) {
                    class104.field1433 += var22;
                }
            }
        }
        if (class63.field874 < 0) {
            class63.field874 = 0;
        }
        if (class375.field5213 < 0) {
            class375.field5213 = 0;
        }
        if ((class284.field3862 << 7) - 1 < class63.field874) {
            class63.field874 = (class284.field3862 << 7) - 1;
        }
        if (class375.field5213 > (class354.field4768 << 7) - 1) {
            class375.field5213 = (class354.field4768 << 7) - 1;
        }
        class217.method1444((byte) -127);
        class405.method2505((byte) -112);
        class354.field4765.method227(var8, var6, var8 + var9, var6 - -var7);
        class354.field4765.method202();
        int var20 = class337.field4559;
        if (class399.field5537 == null) {
            class354.field4765.method183(var20);
        } else {
            class399.field5537.method542(var7, (byte) 60, class389.field5410, var6, class253.field3516 << 3, class86.field1208, var20, class354.field4765, var9, var8);
        }
        class140.method1025(255);
        class406.field5619.method1872(class63.field874, class104.field1433, class375.field5213, -class389.field5410 & 0x3FFF, -class86.field1208 & 0x3FFF, -class103.field1426 & 0x3FFF);
        class354.field4765.method168(class406.field5619);
        class354.field4765.method194(var9 / 2 + var8, var7 / 2 + var6, class261.field3599 << 1, class261.field3599 << 1);
        class334.method2038(var7 / 2 + var6, class261.field3599 << 1, var9 / 2 + var8, class261.field3599 << 1, (byte) 112);
        class438.method2694(class63.field874, -class86.field1208 & 0x3FFF, -class103.field1426 & 0x3FFF, 111, -class389.field5410 & 0x3FFF, class104.field1433, class375.field5213);
        if (arg5 <= 111) {
            field4152 = null;
        }
        byte var21 = class125.method956(1) == 2 ? (byte) class368.field5106 : 1;
        class163.method1175(class354.field4765, class246.field3467, class141.field2068, class406.field5619, class63.field874, class104.field1433, class375.field5213, class237.field3379, class344.field4658, class219.field3080, class149.field2164, class191.field2756, class196.field2844, class343.field4623 + 1, var21, class359.field4970.field40 >> 7, class359.field4970.field44 >> 7, !class341.field4607);
        class140.method1025(255);
        if (class98.field1383 == 30) {
            class294.method1791(var6, var9, var8, 2, 256, 256, var7);
            class395.method2458(-127, 256, var8, var7, var6, var9, 256);
            class282.method1771(var8, var7, 256, (byte) 66, var6, 256, var9);
            class367.method2312(var6, 4, var8, var7, var9);
        }
        class10.method52();
        class375.field5213 = var16;
        class104.field1433 = var15;
        class389.field5410 = var17;
        class63.field874 = var14;
        class86.field1208 = var18;
        if (class42.field553 && class19.field258.method524(-110) == 0) {
            class42.field553 = false;
        }
        if (class42.field553) {
            class354.field4765.method461(var9, -16777216, var7, -91, var8, var6);
            class405.method2502(1, false, class31.field432, class326.field4432.method2313((byte) -82, class445.field6241));
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lw;", line = 208)
    public static final class236 method1845(int arg0, int arg1) {
        field4153++;
        class236 var2 = (class236) class42.field559.method2529(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class300.field4102.method1926(0, arg1, 1);
        class236 var4 = new class236();
        var4.field3350 = arg1;
        if (var3 != null) {
            var4.method1541(new class366(var3), 0);
        }
        var4.method1543(-36);
        int var5 = 71 / ((35 - arg0) / 38);
        if (var4.field3353 == 2 && class309.field4193.method837((byte) -72, (long) arg1) == null) {
            class309.field4193.method835(4, new class166(class75.field1070), (long) arg1);
            class131.field1966[class75.field1070++] = var4;
        }
        class42.field559.method2527(35, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 243)
    public static void method1846(int arg0) {
        field4155 = null;
        if (arg0 != 875936801) {
            method1845(26, 24);
        }
        field4152 = null;
    }
}
