import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class11 extends class170 {

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    private int field384 = 585;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "Lmh;")
    public static class128 field381 = class22.method156(124, "<img=1>");

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Lmh;")
    public static class128 field378 = class22.method156(126, "<col=ffffff>");

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Lmh;")
    public static class128 field379 = class22.method156(125, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!se", name = "R", descriptor = "Lmh;")
    public static class128 field372 = class22.method156(124, ":duelstake:");

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Lpe;")
    public static class94 field375;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[I", line = 14)
    public final int[] method69(byte arg0, int arg1) {
        field377++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (arg0 != 85) {
            this.field384 = -46;
        }
        if (this.field2977.field4552) {
            int var4 = class307.field5221[arg1];
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                int var6 = class118.field2002[var5];
                if (var6 > this.field384 && (4096 - this.field384) > var6 && var4 > 2048 - this.field384 && var4 < (this.field384 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field384);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field384 && var6 < (this.field384 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field384;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field384);
                } else if (this.field384 > var4 || (4096 - this.field384) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field384;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field384);
                } else if (this.field384 <= var6 && 4096 - this.field384 >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field384);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 99)
    public static void method86(int arg0) {
        field378 = null;
        field375 = null;
        field379 = null;
        field381 = null;
        if (arg0 != 0) {
            field381 = (class128) null;
        }
        field372 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIIIIZ)Z", line = 128)
    public static final boolean method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field374++;
        if (class163.field2796.method118(-1) == 2) {
            return class230.method1578(arg3, arg2, arg8, arg11, arg10, arg9, arg0, arg7, arg4, arg5, 96, arg1);
        } else if (class163.field2796.method118(-1) > 2) {
            return class53.method361(arg5, arg7, arg1, class163.field2796.method118(-1), arg10, arg11, (byte) 29, arg3, arg2, arg4, arg9, arg0, arg8);
        } else if (arg6 == 0) {
            return class303.method2059(arg5, 124, arg3, arg0, arg2, arg1, arg7, arg11, arg4, arg9, arg8, arg10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 199)
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V", line = 155)
    public static final void method88(byte arg0) {
        field382++;
        if (class257.field4412 != null) {
            class257.field4412.method1675(-111);
        }
        if (class310.field5264 != null) {
            class310.field5264.method1675(-114);
        }
        class309.method2104(22050, class31.field689, 2, 5304);
        class257.field4412 = class190.method1274(class288.field4925, 0, 22050, (byte) 83, class203.field3589);
        if (arg0 >= 90) {
            class257.field4412.method1679(class313.field5289, true);
            class310.field5264 = class190.method1274(class288.field4925, 1, 2048, (byte) 104, class203.field3589);
            class310.field5264.method1679(class188.field3260, true);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)Lsl;", line = 176)
    public static final class92 method89(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class92 var4 = var3.field2586;
            var3.field2586 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(BI)V", line = 203)
    public static final void method90(byte arg0, int arg1) {
        field380++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class267.field4635[arg1];
        int var3 = class309.field5251[arg1];
        int var4 = class117.field1979[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class1.field22[arg1];
        long var6 = class1.field22[arg1];
        if (var4 == 39) {
            class10 var8 = class233.method1606(true, var3);
            boolean var9 = true;
            if (var8.field222 > 0) {
                var9 = class74.method492(-31, var8);
            }
            if (var9) {
                class71.field1320.method570(165, -1);
                class223.field3909++;
                class71.field1320.method1337(-86, var3);
            }
        }
        if (var4 == 1001) {
            class34.field727 = 2;
            class97.field1685 = class241.field4129;
            class148.field2549 = 0;
            class240.field4097 = class45.field915;
            class71.field1320.method570(237, arg0 + 25);
            class90.field1529++;
            class71.field1320.method1310(255, var5);
        }
        if (var4 == 29) {
            class259.field4476++;
            boolean var10 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var10) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class148.field2549 = 0;
            class97.field1685 = class241.field4129;
            class34.field727 = 2;
            class240.field4097 = class45.field915;
            class71.field1320.method570(66, -1);
            class71.field1320.method1314((byte) -124, var2 + class221.field3889);
            class71.field1320.method1314((byte) -128, class4.field72 + var3);
            class71.field1320.method1314((byte) -127, var5);
        }
        if (var4 == 42) {
            class30.method220(var6, arg0 + 23587, var3, var2);
            class71.field1320.method570(190, -1);
            class290.field4960++;
            class71.field1320.method1310(255, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class71.field1320.method1310(255, class4.field72 + var3);
            class71.field1320.method1324(class221.field3889 + var2, arg0 + 15829);
        }
        if (var4 == 57) {
            class71.field1320.method570(94, -1);
            class71.field1320.method1314((byte) -125, var5);
            class74.field1381++;
            class71.field1320.method1309(arg0 ^ 0x18, var3);
            class71.field1320.method1314((byte) -125, var2);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 21) {
            class10 var12 = class271.method1908(var3, var2, false);
            if (var12 != null) {
                class250.method1747(arg0 ^ 0xFFFF8D4C);
                class222.method1529(class33.method234(-128, client.method1657(var12)), var3, (byte) 40, var2);
                class28.field591 = 0;
                class140.field2398 = class45.method302(0, var12);
                if (class140.field2398 == null) {
                    class140.field2398 = class62.field1182;
                }
                if (var12.field294) {
                    class120.field2024 = class28.method177((byte) -77, new class128[] { var12.field334, field378 });
                } else {
                    class120.field2024 = class28.method177((byte) -85, new class128[] { class90.field1534, var12.field238, field378 });
                }
            }
            return;
        }
        if (var4 == 22) {
            class115 var13 = class201.field3560[var5];
            if (var13 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var13.field450[0], 0, class163.field2796.field450[0], var13.field422[0], 0, 0, false);
                class240.field4097 = class45.field915;
                class34.field727 = 2;
                class187.field3238++;
                class148.field2549 = 0;
                class97.field1685 = class241.field4129;
                class71.field1320.method570(173, -1);
                class71.field1320.method1310(255, var5);
            }
        }
        if (var4 == 14) {
            class183.field3216++;
            boolean var14 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var14) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class148.field2549 = 0;
            class240.field4097 = class45.field915;
            class97.field1685 = class241.field4129;
            class34.field727 = 2;
            class71.field1320.method570(214, -1);
            class71.field1320.method1314((byte) -124, var5);
            class71.field1320.method1324(class65.field1257, 15803);
            class71.field1320.method1298(class221.field3889 + var2, (byte) -103);
            class71.field1320.method1324(class4.field72 + var3, 15803);
            class71.field1320.method1337(-97, class88.field1514);
        }
        if (var4 == 46) {
            class223.field3909++;
            class71.field1320.method570(165, -1);
            class71.field1320.method1337(-110, var3);
            class10 var16 = class233.method1606(true, var3);
            if (var16.field320 != null && var16.field320[0][0] == 5) {
                int var17 = var16.field320[0][1];
                class104.field1778[var17] = 1 - class104.field1778[var17];
                class290.method1998(var17, true);
            }
        }
        if (var4 == 7) {
            class12.field394++;
            class30.method220(var6, 23561, var3, var2);
            class71.field1320.method570(131, -1);
            class71.field1320.method1314((byte) -125, class4.field72 + var3);
            class71.field1320.method1298(class221.field3889 + var2, (byte) -117);
            class71.field1320.method1314((byte) -128, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 20) {
            class194.field3399++;
            boolean var18 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var18) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class34.field727 = 2;
            class148.field2549 = 0;
            class97.field1685 = class241.field4129;
            class240.field4097 = class45.field915;
            class71.field1320.method570(47, -1);
            class71.field1320.method1324(class221.field3889 + var2, 15803);
            class71.field1320.method1310(arg0 ^ 0xFFFFFF19, var5);
            class71.field1320.method1298(class4.field72 + var3, (byte) -118);
        }
        if (var4 == 15) {
            class115 var20 = class201.field3560[var5];
            if (var20 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var20.field450[0], arg0 ^ 0xFFFFFFE6, class163.field2796.field450[0], var20.field422[0], 0, 0, false);
                class1.field28++;
                class34.field727 = 2;
                class148.field2549 = 0;
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class71.field1320.method570(153, arg0 + 25);
                class71.field1320.method1314((byte) -124, class268.field4650);
                class71.field1320.method1298(class176.field3106, (byte) -100);
                class71.field1320.method1314((byte) -125, var5);
                class71.field1320.method1353(class43.field872, false);
            }
        }
        if (var4 == 24) {
            class129.field2251++;
            class71.field1320.method570(44, -1);
            class71.field1320.method1298(class65.field1257, (byte) -102);
            class71.field1320.method1314((byte) -127, var5);
            class71.field1320.method1314((byte) -127, var2);
            class71.field1320.method1337(arg0 ^ 0x32, var3);
            class71.field1320.method1309(-2, class88.field1514);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 35) {
            class296.field5059++;
            class71.field1320.method570(235, -1);
            class71.field1320.method1298(var5, (byte) -104);
            class71.field1320.method1298(var2, (byte) -111);
            class71.field1320.method1309(-2, var3);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 40) {
            class115 var21 = class201.field3560[var5];
            if (var21 != null) {
                class219.field3852++;
                method87(1, 0, 2, 1, class163.field2796.field422[0], var21.field450[0], 0, class163.field2796.field450[0], var21.field422[0], 0, 0, false);
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class34.field727 = 2;
                class148.field2549 = 0;
                class71.field1320.method570(83, -1);
                class71.field1320.method1295(class88.field1514, -1372336584);
                class71.field1320.method1298(var5, (byte) -117);
                class71.field1320.method1324(class65.field1257, 15803);
            }
        }
        if (var4 == 6) {
            class241.field4114++;
            class71.field1320.method570(144, -1);
            class71.field1320.method1324(var2, arg0 + 15829);
            class71.field1320.method1310(255, var5);
            class71.field1320.method1310(arg0 + 281, class176.field3106);
            class71.field1320.method1353(class43.field872, false);
            class71.field1320.method1295(var3, -1372336584);
            class71.field1320.method1310(255, class268.field4650);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 30) {
            class132.field2283++;
            class71.field1320.method570(39, arg0 ^ 0x19);
            class71.field1320.method1298(var5, (byte) -112);
            class71.field1320.method1324(var2, 15803);
            class71.field1320.method1337(-116, var3);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 59) {
            class123 var22 = class140.field2405[var5];
            if (var22 != null) {
                class212.field3762++;
                method87(1, 0, 2, 1, class163.field2796.field422[0], var22.field450[0], arg0 + 26, class163.field2796.field450[0], var22.field422[0], 0, 0, false);
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class34.field727 = 2;
                class148.field2549 = 0;
                class71.field1320.method570(127, arg0 ^ 0x19);
                class71.field1320.method1324(var5, 15803);
            }
        }
        if (var4 == 44) {
            class115 var23 = class201.field3560[var5];
            if (var23 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var23.field450[0], arg0 ^ 0xFFFFFFE6, class163.field2796.field450[0], var23.field422[0], 0, 0, false);
                class240.field4097 = class45.field915;
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class148.field2549 = 0;
                class311.field5265++;
                class71.field1320.method570(126, -1);
                class71.field1320.method1310(255, var5);
            }
        }
        if (var4 == 32) {
            class71.field1320.method570(21, -1);
            class71.field1320.method1298(var2, (byte) -115);
            class71.field1320.method1314((byte) -127, var5);
            class28.field598++;
            class71.field1320.method1337(arg0 - 77, var3);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 5) {
            class223.field3909++;
            class71.field1320.method570(165, -1);
            class71.field1320.method1337(arg0 - 26, var3);
            class10 var24 = class233.method1606(true, var3);
            if (var24.field320 != null && var24.field320[0][0] == 5) {
                int var25 = var24.field320[0][1];
                if (class104.field1778[var25] != var24.field236[0]) {
                    class104.field1778[var25] = var24.field236[0];
                    class290.method1998(var25, true);
                }
            }
        }
        if (var4 == 17) {
            class123 var26 = class140.field2405[var5];
            if (var26 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var26.field450[0], 0, class163.field2796.field450[0], var26.field422[0], 0, 0, false);
                class34.field727 = 2;
                class130.field2280++;
                class148.field2549 = 0;
                class240.field4097 = class45.field915;
                class97.field1685 = class241.field4129;
                class71.field1320.method570(139, -1);
                class71.field1320.method1309(-2, class88.field1514);
                class71.field1320.method1310(arg0 ^ 0xFFFFFF19, class65.field1257);
                class71.field1320.method1314((byte) -128, var5);
            }
        }
        if (var4 == 47) {
            class8.method67(true);
        }
        if (var4 == 25 && class36.field739 == null) {
            class91.method573(var2, var3, arg0 ^ 0xFFFFFFE6);
            class36.field739 = class271.method1908(var3, var2, false);
            class7.method48(class36.field739, 0);
        }
        if (var4 == 12) {
            class71.field1320.method570(65, arg0 ^ 0x19);
            class71.field1320.method1298(var5, (byte) -115);
            class208.field3665++;
            class71.field1320.method1314((byte) -125, var2);
            class71.field1320.method1295(var3, -1372336584);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 34 || var4 == 1006) {
            class309.method2106(class210.field3725[arg1], var3, false, var2, var5);
        }
        if (var4 == 33) {
            class123 var27 = class140.field2405[var5];
            if (var27 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var27.field450[0], 0, class163.field2796.field450[0], var27.field422[0], 0, 0, false);
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class240.field4097 = class45.field915;
                class134.field2338++;
                class148.field2549 = 0;
                class71.field1320.method570(51, -1);
                class71.field1320.method1324(var5, 15803);
            }
        }
        if (var4 == 48) {
            class123 var28 = class140.field2405[var5];
            if (var28 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var28.field450[0], arg0 ^ 0xFFFFFFE6, class163.field2796.field450[0], var28.field422[0], 0, 0, false);
                class240.field4097 = class45.field915;
                class148.field2549 = 0;
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class30.field665++;
                class71.field1320.method570(55, -1);
                class71.field1320.method1324(var5, 15803);
            }
        }
        if (var4 == 8) {
            class43.field881++;
            class71.field1320.method570(11, -1);
            class71.field1320.method1324(var2, arg0 ^ 0xFFFFC25D);
            class71.field1320.method1295(var3, -1372336584);
            class71.field1320.method1324(var5, 15803);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 10) {
            class123 var29 = class140.field2405[var5];
            if (var29 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var29.field450[0], 0, class163.field2796.field450[0], var29.field422[0], 0, 0, false);
                class148.field2549 = 0;
                class34.field727 = 2;
                class232.field4015++;
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class71.field1320.method570(54, -1);
                class71.field1320.method1298(var5, (byte) -128);
            }
        }
        if (var4 == 31) {
            class250.method1747(29354);
            class10 var49 = class233.method1606(true, var3);
            class268.field4650 = var5;
            class43.field872 = var3;
            class28.field591 = 1;
            class176.field3106 = var2;
            class7.method48(var49, 0);
            class194.field3381 = class28.method177((byte) -72, new class128[] { class102.field1751, class180.method1226(false, var5).field3506, field378 });
            if (class194.field3381 == null) {
                class194.field3381 = class72.field1339;
            }
            return;
        }
        if (var4 == 1005) {
            class10 var30 = class233.method1606(true, var3);
            if (var30 == null || var30.field324[var2] < 100000) {
                class145.field2492++;
                class71.field1320.method570(60, -1);
                class71.field1320.method1298(var5, (byte) -109);
            } else {
                class212.method1456(class28.method177((byte) -73, new class128[] { class257.method1811(var30.field324[var2], (byte) 12), class58.field1113, class180.method1226(false, var5).field3506 }), 1, class273.field4733, 0);
            }
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 36) {
            class115 var31 = class201.field3560[var5];
            if (var31 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var31.field450[0], 0, class163.field2796.field450[0], var31.field422[0], 0, 0, false);
                class148.field2549 = 0;
                class293.field5023++;
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class240.field4097 = class45.field915;
                class71.field1320.method570(0, arg0 ^ 0x19);
                class71.field1320.method1314((byte) -126, var5);
            }
        }
        if (var4 == 28) {
            class71.field1320.method570(125, -1);
            class200.field3501++;
            class71.field1320.method1298(var5, (byte) -106);
            class71.field1320.method1337(-43, var3);
            class71.field1320.method1298(var2, (byte) -100);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 9) {
            class115 var32 = class201.field3560[var5];
            if (var32 != null) {
                class175.field3096++;
                method87(1, 0, 2, 1, class163.field2796.field422[0], var32.field450[0], 0, class163.field2796.field450[0], var32.field422[0], 0, 0, false);
                class240.field4097 = class45.field915;
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class148.field2549 = 0;
                class71.field1320.method570(73, -1);
                class71.field1320.method1314((byte) -125, var5);
            }
        }
        if (var4 == 16) {
            class115 var33 = class201.field3560[var5];
            if (var33 != null) {
                class9.field197++;
                method87(1, 0, 2, 1, class163.field2796.field422[0], var33.field450[0], 0, class163.field2796.field450[0], var33.field422[0], 0, 0, false);
                class148.field2549 = 0;
                class240.field4097 = class45.field915;
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class71.field1320.method570(184, -1);
                class71.field1320.method1310(255, var5);
            }
        }
        if (var4 == 49) {
            class71.field1320.method570(233, -1);
            class204.field3603++;
            class71.field1320.method1314((byte) -125, var2);
            class71.field1320.method1314((byte) -125, var5);
            class71.field1320.method1337(-85, var3);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (var4 == 43 && class30.method220(var6, 23561, var3, var2)) {
            class71.field1320.method570(9, -1);
            class56.field1069++;
            class71.field1320.method1298(class268.field4650, (byte) -107);
            class71.field1320.method1298((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -103);
            class71.field1320.method1353(class43.field872, false);
            class71.field1320.method1324(class4.field72 + var3, 15803);
            class71.field1320.method1324(class176.field3106, 15803);
            class71.field1320.method1314((byte) -126, class221.field3889 + var2);
        }
        if (var4 == 1007) {
            class34.field727 = 2;
            class240.field4097 = class45.field915;
            class148.field2549 = 0;
            class97.field1685 = class241.field4129;
            class115 var34 = class201.field3560[var5];
            if (var34 != null) {
                class208 var35 = var34.field1934;
                if (var35.field3655 != null) {
                    var35 = var35.method1429((byte) -96);
                }
                if (var35 != null) {
                    class255.field4391++;
                    class71.field1320.method570(112, -1);
                    class71.field1320.method1310(arg0 ^ 0xFFFFFF19, var35.field3679);
                }
            }
        }
        if (var4 == 45) {
            class71.field1320.method570(232, -1);
            class71.field1320.method1295(var3, arg0 ^ 0x51CC31DE);
            class71.field1320.method1295(class88.field1514, -1372336584);
            class276.field4776++;
            class71.field1320.method1298(var2, (byte) -110);
            class71.field1320.method1324(class65.field1257, 15803);
        }
        if (var4 == 38) {
            class71.field1320.method570(57, -1);
            class71.field1320.method1314((byte) -126, var2);
            class71.field1320.method1309(-2, var3);
            class71.field1320.method1314((byte) -127, var5);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class259.field4464++;
            class91.field1558 = var2;
        }
        if (var4 == 11) {
            class123 var36 = class140.field2405[var5];
            if (var36 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var36.field450[0], arg0 + 26, class163.field2796.field450[0], var36.field422[0], 0, 0, false);
                class273.field4741++;
                class148.field2549 = 0;
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class34.field727 = 2;
                class71.field1320.method570(213, arg0 ^ 0x19);
                class71.field1320.method1298(var5, (byte) -107);
            }
        }
        if (var4 == 26 && class30.method220(var6, 23561, var3, var2)) {
            class17.field497++;
            class71.field1320.method570(161, arg0 ^ 0x19);
            class71.field1320.method1314((byte) -128, class4.field72 + var3);
            class71.field1320.method1298((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -111);
            class71.field1320.method1324(class221.field3889 + var2, 15803);
            class71.field1320.method1324(class65.field1257, 15803);
            class71.field1320.method1337(-55, class88.field1514);
        }
        if (arg0 != -26) {
            return;
        }
        if (var4 == 13) {
            class189.field3289++;
            class30.method220(var6, arg0 + 23587, var3, var2);
            class71.field1320.method570(59, -1);
            class71.field1320.method1310(arg0 ^ 0xFFFFFF19, class221.field3889 + var2);
            class71.field1320.method1298((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -123);
            class71.field1320.method1310(255, var3 + class4.field72);
        }
        if (var4 == 2) {
            class123 var37 = class140.field2405[var5];
            if (var37 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var37.field450[0], 0, class163.field2796.field450[0], var37.field422[0], 0, 0, false);
                class34.field727 = 2;
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class148.field2549 = 0;
                class71.field1320.method570(218, -1);
                class115.field1927++;
                class71.field1320.method1310(255, var5);
            }
        }
        if (var4 == 37) {
            class114.field1908++;
            boolean var38 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var38) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class148.field2549 = 0;
            class240.field4097 = class45.field915;
            class97.field1685 = class241.field4129;
            class34.field727 = 2;
            class71.field1320.method570(174, -1);
            class71.field1320.method1310(255, class221.field3889 + var2);
            class71.field1320.method1298(class4.field72 + var3, (byte) -100);
            class71.field1320.method1324(var5, arg0 + 15829);
        }
        if (var4 == 18) {
            boolean var40 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, arg0 + 26, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var40) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class34.field727 = 2;
            class240.field4097 = class45.field915;
            class148.field2549 = 0;
            class97.field1685 = class241.field4129;
            class71.field1320.method570(79, -1);
            class199.field3464++;
            class71.field1320.method1324(class4.field72 + var3, 15803);
            class71.field1320.method1298(class176.field3106, (byte) -128);
            class71.field1320.method1314((byte) -126, var5);
            class71.field1320.method1314((byte) -124, class268.field4650);
            class71.field1320.method1314((byte) -125, class221.field3889 + var2);
            class71.field1320.method1337(-73, class43.field872);
        }
        if (var4 == 1) {
            class123 var42 = class140.field2405[var5];
            if (var42 != null) {
                class36.field741++;
                method87(1, 0, 2, 1, class163.field2796.field422[0], var42.field450[0], 0, class163.field2796.field450[0], var42.field422[0], 0, 0, false);
                class148.field2549 = 0;
                class240.field4097 = class45.field915;
                class97.field1685 = class241.field4129;
                class34.field727 = 2;
                class71.field1320.method570(114, -1);
                class71.field1320.method1298(var5, (byte) -103);
            }
        }
        if (var4 == 4) {
            class123 var43 = class140.field2405[var5];
            if (var43 != null) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var43.field450[0], 0, class163.field2796.field450[0], var43.field422[0], 0, 0, false);
                class148.field2549 = 0;
                class34.field727 = 2;
                class155.field2669++;
                class97.field1685 = class241.field4129;
                class240.field4097 = class45.field915;
                class71.field1320.method570(69, -1);
                class71.field1320.method1314((byte) -128, class268.field4650);
                class71.field1320.method1337(-104, class43.field872);
                class71.field1320.method1324(class176.field3106, 15803);
                class71.field1320.method1314((byte) -124, var5);
            }
        }
        if (var4 == 1004) {
            class30.method220(var6, 23561, var3, var2);
            class71.field1320.method570(183, -1);
            class71.field1320.method1324(Integer.MAX_VALUE & (int) (var6 >>> 32), 15803);
            class71.field1320.method1298(class4.field72 + var3, (byte) -116);
            class71.field1320.method1314((byte) -128, class221.field3889 + var2);
            class259.field4474++;
        }
        if (var4 == 58) {
            class298.field5080++;
            boolean var44 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var44) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class97.field1685 = class241.field4129;
            class148.field2549 = 0;
            class34.field727 = 2;
            class240.field4097 = class45.field915;
            class71.field1320.method570(33, -1);
            class71.field1320.method1310(255, class4.field72 + var3);
            class71.field1320.method1324(var5, arg0 ^ 0xFFFFC25D);
            class71.field1320.method1324(var2 + class221.field3889, 15803);
        }
        if (var4 == 1002) {
            class145.field2492++;
            class97.field1685 = class241.field4129;
            class240.field4097 = class45.field915;
            class148.field2549 = 0;
            class34.field727 = 2;
            class71.field1320.method570(60, -1);
            class71.field1320.method1298(var5, (byte) -127);
        }
        if (var4 == 41) {
            class37.field747++;
            boolean var46 = method87(0, 0, 2, 0, class163.field2796.field422[0], var2, 0, class163.field2796.field450[0], var3, 0, 0, false);
            if (!var46) {
                method87(1, 0, 2, 1, class163.field2796.field422[0], var2, arg0 ^ 0xFFFFFFE6, class163.field2796.field450[0], var3, 0, 0, false);
            }
            class240.field4097 = class45.field915;
            class148.field2549 = 0;
            class97.field1685 = class241.field4129;
            class34.field727 = 2;
            class71.field1320.method570(239, arg0 + 25);
            class71.field1320.method1324(var5, 15803);
            class71.field1320.method1310(255, class221.field3889 + var2);
            class71.field1320.method1324(class4.field72 + var3, 15803);
        }
        if (var4 == 51) {
            class52.method356(class133.field2315, var2, var3);
        }
        if (var4 == 23) {
            class259.field4479 = true;
            class52.method356(class133.field2315, var2, var3);
        }
        if (var4 == 19) {
            class30.method220(var6, arg0 + 23587, var3, var2);
            class71.field1320.method570(211, -1);
            class71.field1320.method1314((byte) -124, class221.field3889 + var2);
            class71.field1320.method1310(arg0 ^ 0xFFFFFF19, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class71.field1320.method1314((byte) -125, class4.field72 + var3);
            class150.field2579++;
        }
        if (var4 == 3) {
            class123 var48 = class140.field2405[var5];
            if (var48 != null) {
                class22.field547++;
                method87(1, 0, 2, 1, class163.field2796.field422[0], var48.field450[0], 0, class163.field2796.field450[0], var48.field422[0], 0, 0, false);
                class34.field727 = 2;
                class240.field4097 = class45.field915;
                class97.field1685 = class241.field4129;
                class148.field2549 = 0;
                class71.field1320.method570(53, arg0 ^ 0x19);
                class71.field1320.method1310(arg0 + 281, var5);
            }
        }
        if (var4 == 50) {
            class71.field1320.method570(76, -1);
            class71.field1320.method1310(255, var5);
            class103.field1758++;
            class71.field1320.method1298(var2, (byte) -110);
            class71.field1320.method1295(var3, -1372336584);
            class5.field91 = 0;
            class144.field2462 = class233.method1606(true, var3);
            class91.field1558 = var2;
        }
        if (class28.field591 != 0) {
            class28.field591 = 0;
            class7.method48(class233.method1606(true, class43.field872), 0);
        }
        if (class31.field685) {
            class250.method1747(arg0 + 29380);
        }
        if (class144.field2462 != null && class5.field91 == 0) {
            class7.method48(class144.field2462, 0);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 1177)
    public static final void method91(boolean arg0) {
        field383++;
        class182 var1 = new class182();
        int var2 = 0;
        if (arg0) {
            method88((byte) 58);
        }
        while (var2 < 13) {
            for (int var3 = 0; var3 < 13; var3++) {
                class178.field3136[var2][var3] = var1;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILbg;B)V", line = 1206)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field376++;
        if (arg0 == 0) {
            this.field384 = arg1.method1308(-22);
        }
        if (arg2 != 13) {
            field379 = (class128) null;
        }
    }
}
