import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class181 {

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static volatile int field2723 = 0;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public static int[] field2719 = new int[4096];

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[Lmm;")
    public static class114[] field2721 = new class114[14];

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lpi;")
    public static class201 field2724 = new class201(64);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lhc;I)Luh;")
    public static final class64 method1278(class53 arg0, int arg1) {
        if (arg1 != 0) {
            method1280(-1, 66, (class270) null);
        }
        field2718++;
        return new class64(arg0.method337(arg1 + 101), arg0.method337(81), arg0.method337(117), arg0.method337(108), arg0.method362(-4), arg0.method366(-16505));
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field2719 = null;
        field2724 = null;
        field2721 = null;
        if (arg0 != 2) {
            method1279(-11);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILlc;)Llf;")
    public static final class94 method1280(int arg0, int arg1, class270 arg2) {
        if (arg0 != 1) {
            method1278((class53) null, 14);
        }
        field2717++;
        return class248.method1706((byte) 114, arg1, arg2) ? class293.method1990(0) : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILth;I)V")
    public static final void method1281(int arg0, class247 arg1, int arg2) {
        int var3 = 0;
        class92.field1482 = 0;
        int var4 = 0;
        field2720++;
        int var5 = -1;
        int[] var6 = arg1.field3650;
        int[] var7 = arg1.field3652;
        byte var8 = -1;
        try {
            int var9 = 0;
            if (arg0 <= -25) {
                label4038: while (true) {
                    var9++;
                    if (arg2 < var9) {
                        throw new RuntimeException("slow");
                    }
                    var5++;
                    int var526 = var6[var5];
                    if (var526 < 100) {
                        if (var526 == 0) {
                            class221.field3217[var3++] = var7[var5];
                            continue;
                        }
                        if (var526 == 1) {
                            int var10 = var7[var5];
                            class221.field3217[var3++] = class303.field4900[var10];
                            continue;
                        }
                        if (var526 == 2) {
                            int var11 = var7[var5];
                            var3--;
                            class110.method841(var11, -129, class221.field3217[var3]);
                            continue;
                        }
                        if (var526 == 3) {
                            class214.field3145[var4++] = arg1.field3646[var5];
                            continue;
                        }
                        if (var526 == 6) {
                            var5 += var7[var5];
                            continue;
                        }
                        if (var526 == 7) {
                            var3 -= 2;
                            if (class221.field3217[var3 + 1] != class221.field3217[var3]) {
                                var5 += var7[var5];
                            }
                            continue;
                        }
                        if (var526 == 8) {
                            var3 -= 2;
                            if (class221.field3217[var3 + 1] == class221.field3217[var3]) {
                                var5 += var7[var5];
                            }
                            continue;
                        }
                        if (var526 == 9) {
                            var3 -= 2;
                            if (class221.field3217[var3 + 1] > class221.field3217[var3]) {
                                var5 += var7[var5];
                            }
                            continue;
                        }
                        if (var526 == 10) {
                            var3 -= 2;
                            if (class221.field3217[var3 + 1] < class221.field3217[var3]) {
                                var5 += var7[var5];
                            }
                            continue;
                        }
                        if (var526 == 21) {
                            if (class92.field1482 == 0) {
                                return;
                            }
                            class284 var12 = class65.field980[--class92.field1482];
                            class230.field3375 = var12.field4561;
                            arg1 = var12.field4570;
                            var5 = var12.field4562;
                            var7 = arg1.field3652;
                            class245.field3607 = var12.field4564;
                            var6 = arg1.field3650;
                            continue;
                        }
                        if (var526 == 25) {
                            int var13 = var7[var5];
                            class221.field3217[var3++] = class137.method1034((byte) -17, var13);
                            continue;
                        }
                        if (var526 == 27) {
                            int var14 = var7[var5];
                            var3--;
                            class213.method1494(class221.field3217[var3], (byte) -30, var14);
                            continue;
                        }
                        if (var526 == 31) {
                            var3 -= 2;
                            if (class221.field3217[var3 + 1] >= class221.field3217[var3]) {
                                var5 += var7[var5];
                            }
                            continue;
                        }
                        if (var526 == 32) {
                            var3 -= 2;
                            if (class221.field3217[var3 + 1] <= class221.field3217[var3]) {
                                var5 += var7[var5];
                            }
                            continue;
                        }
                        if (var526 == 33) {
                            class221.field3217[var3++] = class245.field3607[var7[var5]];
                            continue;
                        }
                        int var10001;
                        if (var526 == 34) {
                            var10001 = var7[var5];
                            var3--;
                            class245.field3607[var10001] = class221.field3217[var3];
                            continue;
                        }
                        if (var526 == 35) {
                            class214.field3145[var4++] = class230.field3375[var7[var5]];
                            continue;
                        }
                        if (var526 == 36) {
                            var10001 = var7[var5];
                            var4--;
                            class230.field3375[var10001] = class214.field3145[var4];
                            continue;
                        }
                        if (var526 == 37) {
                            int var15 = var7[var5];
                            var4 -= var15;
                            String var16 = class209.method1475(var15, var4, 1, class214.field3145);
                            class214.field3145[var4++] = var16;
                            continue;
                        }
                        if (var526 == 38) {
                            var3--;
                            continue;
                        }
                        if (var526 == 39) {
                            var4--;
                            continue;
                        }
                        if (var526 == 40) {
                            int var17 = var7[var5];
                            class247 var18 = class25.method167(var17, -106);
                            int[] var19 = new int[var18.field3644];
                            String[] var20 = new String[var18.field3638];
                            for (int var21 = 0; var21 < var18.field3640; var21++) {
                                var19[var21] = class221.field3217[var3 + var21 - var18.field3640];
                            }
                            for (int var22 = 0; var22 < var18.field3639; var22++) {
                                var20[var22] = class214.field3145[var22 + var4 - var18.field3639];
                            }
                            var3 -= var18.field3640;
                            var4 -= var18.field3639;
                            class284 var23 = new class284();
                            var23.field4564 = class245.field3607;
                            var23.field4570 = arg1;
                            var23.field4562 = var5;
                            var23.field4561 = class230.field3375;
                            if (class92.field1482 >= class65.field980.length) {
                                throw new RuntimeException();
                            }
                            arg1 = var18;
                            class65.field980[class92.field1482++] = var23;
                            var7 = var18.field3652;
                            class245.field3607 = var19;
                            var6 = var18.field3650;
                            class230.field3375 = var20;
                            var5 = -1;
                            continue;
                        }
                        if (var526 == 42) {
                            class221.field3217[var3++] = class128.field2143[var7[var5]];
                            continue;
                        }
                        if (var526 == 43) {
                            int var24 = var7[var5];
                            var3--;
                            class128.field2143[var24] = class221.field3217[var3];
                            class309.method2097(1, var24);
                            continue;
                        }
                        if (var526 == 44) {
                            int var25 = var7[var5] >> 16;
                            int var26 = var7[var5] & 0xFFFF;
                            var3--;
                            int var27 = class221.field3217[var3];
                            if (var27 >= 0 && var27 <= 5000) {
                                class282.field4548[var25] = var27;
                                byte var28 = -1;
                                if (var26 == 105) {
                                    var28 = 0;
                                }
                                int var29 = 0;
                                while (true) {
                                    if (var29 >= var27) {
                                        continue label4038;
                                    }
                                    class172.field2628[var25][var29] = var28;
                                    var29++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var526 == 45) {
                            var3--;
                            int var30 = class221.field3217[var3];
                            int var31 = var7[var5];
                            if (var30 >= 0 && class282.field4548[var31] > var30) {
                                class221.field3217[var3++] = class172.field2628[var31][var30];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var526 == 46) {
                            var3 -= 2;
                            int var32 = class221.field3217[var3];
                            int var33 = var7[var5];
                            if (var32 >= 0 && class282.field4548[var33] > var32) {
                                class172.field2628[var33][var32] = class221.field3217[var3 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var526 == 47) {
                            String var34 = class303.field4906[var7[var5]];
                            if (var34 == null) {
                                var34 = "null";
                            }
                            class214.field3145[var4++] = var34;
                            continue;
                        }
                        if (var526 == 48) {
                            int var35 = var7[var5];
                            var4--;
                            class303.field4906[var35] = class214.field3145[var4];
                            class300.method2048(var35, -126);
                            continue;
                        }
                        if (var526 == 51) {
                            class143 var36 = arg1.field3642[var7[var5]];
                            var3--;
                            class108 var37 = (class108) var36.method1073(-1, (long) class221.field3217[var3]);
                            if (var37 != null) {
                                var5 += var37.field1828;
                            }
                            continue;
                        }
                    }
                    boolean var38;
                    if (var7[var5] == 1) {
                        var38 = true;
                    } else {
                        var38 = false;
                    }
                    if (var526 < 300) {
                        if (var526 == 100) {
                            var3 -= 3;
                            int var506 = class221.field3217[var3];
                            int var507 = class221.field3217[var3 + 1];
                            int var508 = class221.field3217[var3 + 2];
                            if (var507 == 0) {
                                throw new RuntimeException();
                            }
                            class263 var509 = class144.method1078(var506, 8534);
                            if (var509.field4143 == null) {
                                var509.field4143 = new class263[var508 + 1];
                            }
                            if (var508 >= var509.field4143.length) {
                                class263[] var510 = new class263[var508 + 1];
                                for (int var511 = 0; var511 < var509.field4143.length; var511++) {
                                    var510[var511] = var509.field4143[var511];
                                }
                                var509.field4143 = var510;
                            }
                            if (var508 > 0 && var509.field4143[var508 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var508 - 1));
                            }
                            class263 var512 = new class263();
                            var512.field4145 = var508;
                            var512.field4202 = var512.field4083 = var509.field4083;
                            var512.field4167 = true;
                            var512.field4129 = var507;
                            var509.field4143[var508] = var512;
                            if (var38) {
                                class297.field4764 = var512;
                            } else {
                                class143.field2325 = var512;
                            }
                            class63.method476(var509, 14105);
                            continue;
                        }
                        if (var526 == 101) {
                            class263 var513 = var38 ? class297.field4764 : class143.field2325;
                            if (var513.field4145 == -1) {
                                if (var38) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class263 var514 = class144.method1078(var513.field4083, 8534);
                            var514.field4143[var513.field4145] = null;
                            class63.method476(var514, 14105);
                            continue;
                        }
                        if (var526 == 102) {
                            var3--;
                            class263 var515 = class144.method1078(class221.field3217[var3], 8534);
                            var515.field4143 = null;
                            class63.method476(var515, 14105);
                            continue;
                        }
                        if (var526 == 200) {
                            var3 -= 2;
                            int var516 = class221.field3217[var3];
                            int var517 = class221.field3217[var3 + 1];
                            class263 var518 = class34.method219(var516, 26, var517);
                            if (var518 != null && var517 != -1) {
                                class221.field3217[var3++] = 1;
                                if (var38) {
                                    class297.field4764 = var518;
                                } else {
                                    class143.field2325 = var518;
                                }
                                continue;
                            }
                            class221.field3217[var3++] = 0;
                            continue;
                        }
                        if (var526 == 201) {
                            var3--;
                            int var519 = class221.field3217[var3];
                            class263 var520 = class144.method1078(var519, 8534);
                            if (var520 == null) {
                                class221.field3217[var3++] = 0;
                            } else {
                                class221.field3217[var3++] = 1;
                                if (var38) {
                                    class297.field4764 = var520;
                                } else {
                                    class143.field2325 = var520;
                                }
                            }
                            continue;
                        }
                    } else if (var526 < 500) {
                        if (var526 == 403) {
                            var3 -= 2;
                            int var499 = class221.field3217[var3];
                            int var500 = class221.field3217[var3 + 1];
                            for (int var501 = 0; var501 < class36.field465.length; var501++) {
                                if (class36.field465[var501] == var499) {
                                    class213.field3139.field3063.method2034(var500, 1, var501);
                                    continue label4038;
                                }
                            }
                            int var502 = 0;
                            while (true) {
                                if (var502 >= class172.field2626.length) {
                                    continue label4038;
                                }
                                if (class172.field2626[var502] == var499) {
                                    class213.field3139.field3063.method2034(var500, 1, var502);
                                    continue label4038;
                                }
                                var502++;
                            }
                        }
                        if (var526 == 404) {
                            var3 -= 2;
                            int var503 = class221.field3217[var3];
                            int var504 = class221.field3217[var3 + 1];
                            class213.field3139.field3063.method2026(true, var503, var504);
                            continue;
                        }
                        if (var526 == 410) {
                            var3--;
                            boolean var505 = class221.field3217[var3] != 0;
                            class213.field3139.field3063.method2024(var505, (byte) -127);
                            continue;
                        }
                    } else if (var526 >= 1000 && var526 < 1100 || var526 >= 2000 && var526 < 2100) {
                        class263 var493;
                        if (var526 < 2000) {
                            var493 = var38 ? class297.field4764 : class143.field2325;
                        } else {
                            var3--;
                            var493 = class144.method1078(class221.field3217[var3], 8534);
                            var526 -= 1000;
                        }
                        if (var526 == 1000) {
                            var3 -= 4;
                            var493.field4101 = class221.field3217[var3];
                            var493.field4164 = class221.field3217[var3 + 1];
                            int var494 = class221.field3217[var3 + 3];
                            if (var494 < 0) {
                                var494 = 0;
                            } else if (var494 > 5) {
                                var494 = 5;
                            }
                            int var495 = class221.field3217[var3 + 2];
                            var493.field4149 = (byte) var494;
                            if (var495 < 0) {
                                var495 = 0;
                            } else if (var495 > 5) {
                                var495 = 5;
                            }
                            var493.field4193 = (byte) var495;
                            class63.method476(var493, 14105);
                            class276.method1921(var493, (byte) 123);
                            if (var493.field4145 == -1) {
                                class62.method471(-28056, var493.field4083);
                            }
                            continue;
                        }
                        if (var526 == 1001) {
                            var3 -= 4;
                            var493.field4163 = class221.field3217[var3];
                            var493.field4190 = class221.field3217[var3 + 1];
                            var493.field4175 = 0;
                            var493.field4210 = 0;
                            int var496 = class221.field3217[var3 + 2];
                            int var497 = class221.field3217[var3 + 3];
                            if (var496 < 0) {
                                var496 = 0;
                            } else if (var496 > 4) {
                                var496 = 4;
                            }
                            var493.field4099 = (byte) var496;
                            if (var497 < 0) {
                                var497 = 0;
                            } else if (var497 > 4) {
                                var497 = 4;
                            }
                            var493.field4086 = (byte) var497;
                            class63.method476(var493, 14105);
                            class276.method1921(var493, (byte) -18);
                            if (var493.field4129 == 0) {
                                class107.method826((byte) 94, var493, false);
                            }
                            continue;
                        }
                        if (var526 == 1003) {
                            var3--;
                            boolean var498 = class221.field3217[var3] == 1;
                            if (var493.field4178 != var498) {
                                var493.field4178 = var498;
                                class63.method476(var493, 14105);
                            }
                            if (var493.field4145 == -1) {
                                class225.method1563(var493.field4083, -9468);
                            }
                            continue;
                        }
                        if (var526 == 1004) {
                            var3 -= 2;
                            var493.field4139 = class221.field3217[var3];
                            var493.field4119 = class221.field3217[var3 + 1];
                            class63.method476(var493, 14105);
                            class276.method1921(var493, (byte) -78);
                            if (var493.field4129 == 0) {
                                class107.method826((byte) 118, var493, false);
                            }
                            continue;
                        }
                        if (var526 == 1005) {
                            var3--;
                            var493.field4147 = class221.field3217[var3] == 1;
                            continue;
                        }
                    } else if (var526 >= 1100 && var526 < 1200 || var526 >= 2100 && var526 < 2200) {
                        class263 var489;
                        if (var526 < 2000) {
                            var489 = var38 ? class297.field4764 : class143.field2325;
                        } else {
                            var3--;
                            var489 = class144.method1078(class221.field3217[var3], 8534);
                            var526 -= 1000;
                        }
                        if (var526 == 1100) {
                            var3 -= 2;
                            var489.field4097 = class221.field3217[var3];
                            if (var489.field4097 > (var489.field4171 - var489.field4215)) {
                                var489.field4097 = var489.field4171 - var489.field4215;
                            }
                            if (var489.field4097 < 0) {
                                var489.field4097 = 0;
                            }
                            var489.field4160 = class221.field3217[var3 + 1];
                            if (var489.field4207 - var489.field4046 < var489.field4160) {
                                var489.field4160 = var489.field4207 - var489.field4046;
                            }
                            if (var489.field4160 < 0) {
                                var489.field4160 = 0;
                            }
                            class63.method476(var489, 14105);
                            if (var489.field4145 == -1) {
                                class76.method571(var489.field4083, (byte) 45);
                            }
                            continue;
                        }
                        if (var526 == 1101) {
                            var3--;
                            var489.field4114 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            if (var489.field4145 == -1) {
                                class112.method847(6, var489.field4083);
                            }
                            continue;
                        }
                        if (var526 == 1102) {
                            var3--;
                            var489.field4118 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1103) {
                            var3--;
                            var489.field4204 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1104) {
                            var3--;
                            var489.field4085 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1105) {
                            var3--;
                            var489.field4090 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1106) {
                            var3--;
                            var489.field4134 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1107) {
                            var3--;
                            var489.field4165 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1108) {
                            var489.field4158 = 1;
                            var3--;
                            var489.field4060 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            if (var489.field4145 == -1) {
                                class134.method1018(var489.field4083, false);
                            }
                            continue;
                        }
                        if (var526 == 1109) {
                            var3 -= 6;
                            var489.field4043 = class221.field3217[var3];
                            var489.field4069 = class221.field3217[var3 + 1];
                            var489.field4211 = class221.field3217[var3 + 2];
                            var489.field4071 = class221.field3217[var3 + 3];
                            var489.field4219 = class221.field3217[var3 + 4];
                            var489.field4217 = class221.field3217[var3 + 5];
                            class63.method476(var489, 14105);
                            if (var489.field4145 == -1) {
                                class17.method116(var489.field4083, -214748365);
                                class36.method228(var489.field4083, true);
                            }
                            continue;
                        }
                        if (var526 == 1110) {
                            var3--;
                            int var490 = class221.field3217[var3];
                            if (var489.field4122 != var490) {
                                var489.field4130 = 0;
                                var489.field4076 = 0;
                                var489.field4156 = 1;
                                var489.field4122 = var490;
                                class63.method476(var489, 14105);
                            }
                            if (var489.field4145 == -1) {
                                class8.method51((byte) 81, var489.field4083);
                            }
                            continue;
                        }
                        if (var526 == 1111) {
                            var3--;
                            var489.field4081 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1112) {
                            var4--;
                            String var491 = class214.field3145[var4];
                            if (!var491.equals(var489.field4061)) {
                                var489.field4061 = var491;
                                class63.method476(var489, 14105);
                            }
                            if (var489.field4145 == -1) {
                                class34.method221((byte) -25, var489.field4083);
                            }
                            continue;
                        }
                        if (var526 == 1113) {
                            var3--;
                            var489.field4063 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1114) {
                            var3 -= 3;
                            var489.field4051 = class221.field3217[var3];
                            var489.field4131 = class221.field3217[var3 + 1];
                            var489.field4187 = class221.field3217[var3 + 2];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1115) {
                            var3--;
                            var489.field4180 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1116) {
                            var3--;
                            var489.field4105 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1117) {
                            var3--;
                            var489.field4072 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1118) {
                            var3--;
                            var489.field4177 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1119) {
                            var3--;
                            var489.field4222 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1120) {
                            var3 -= 2;
                            var489.field4171 = class221.field3217[var3];
                            var489.field4207 = class221.field3217[var3 + 1];
                            class63.method476(var489, 14105);
                            if (var489.field4129 == 0) {
                                class107.method826((byte) 126, var489, false);
                            }
                            continue;
                        }
                        if (var526 == 1121) {
                            var3 -= 2;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1122) {
                            var3--;
                            var489.field4089 = class221.field3217[var3] == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                        if (var526 == 1123) {
                            var3--;
                            var489.field4217 = class221.field3217[var3];
                            class63.method476(var489, 14105);
                            if (var489.field4145 == -1) {
                                class17.method116(var489.field4083, -214748365);
                            }
                            continue;
                        }
                        if (var526 == 1124) {
                            var3--;
                            int var492 = class221.field3217[var3];
                            var489.field4127 = var492 == 1;
                            class63.method476(var489, 14105);
                            continue;
                        }
                    } else if (!(var526 < 1200 || var526 >= 1300) || !(var526 < 2200 || var526 >= 2300)) {
                        class263 var39;
                        if (var526 >= 2000) {
                            var526 -= 1000;
                            var3--;
                            var39 = class144.method1078(class221.field3217[var3], 8534);
                        } else {
                            var39 = var38 ? class297.field4764 : class143.field2325;
                        }
                        class63.method476(var39, 14105);
                        if (var526 == 1200 || var526 == 1205 || var526 == 1208 || var526 == 1209) {
                            var3 -= 2;
                            int var40 = class221.field3217[var3 + 1];
                            int var41 = class221.field3217[var3];
                            if (var39.field4145 == -1) {
                                class107.method823(var39.field4083, (byte) 76);
                                class17.method116(var39.field4083, -214748365);
                                class36.method228(var39.field4083, true);
                            }
                            if (var41 == -1) {
                                var39.field4218 = -1;
                                var39.field4060 = -1;
                                var39.field4158 = 1;
                                continue;
                            }
                            if (var526 == 1208 || var526 == 1209) {
                                var39.field4221 = true;
                            } else {
                                var39.field4221 = false;
                            }
                            var39.field4218 = var41;
                            var39.field4059 = var40;
                            class31 var42 = class12.method88(var41, 27838);
                            var39.field4211 = var42.field379;
                            var39.field4071 = var42.field387;
                            var39.field4043 = var42.field357;
                            var39.field4219 = var42.field329;
                            var39.field4217 = var42.field339;
                            if (var526 == 1205) {
                                var39.field4067 = false;
                            } else {
                                var39.field4067 = true;
                            }
                            if (var39.field4210 > 0) {
                                var39.field4217 = var39.field4217 * 32 / var39.field4210;
                            } else if (var39.field4163 > 0) {
                                var39.field4217 = var39.field4217 * 32 / var39.field4163;
                            }
                            var39.field4069 = var42.field394;
                            continue;
                        }
                        if (var526 == 1201) {
                            var39.field4158 = 2;
                            var3--;
                            var39.field4060 = class221.field3217[var3];
                            if (var39.field4145 == -1) {
                                class134.method1018(var39.field4083, false);
                            }
                            continue;
                        }
                        if (var526 == 1202) {
                            var39.field4158 = 3;
                            var39.field4060 = class213.field3139.field3063.method2030(110);
                            if (var39.field4145 == -1) {
                                class134.method1018(var39.field4083, false);
                            }
                            continue;
                        }
                        if (var526 == 1203) {
                            var39.field4158 = 6;
                            var3--;
                            var39.field4060 = class221.field3217[var3];
                            if (var39.field4145 == -1) {
                                class134.method1018(var39.field4083, false);
                            }
                            continue;
                        }
                        if (var526 == 1204) {
                            var39.field4158 = 5;
                            var3--;
                            var39.field4060 = class221.field3217[var3];
                            if (var39.field4145 == -1) {
                                class134.method1018(var39.field4083, false);
                            }
                            continue;
                        }
                        if (var526 == 1206) {
                            var3 -= 4;
                            var39.field4150 = class221.field3217[var3];
                            var39.field4159 = class221.field3217[var3 + 1];
                            var39.field4172 = class221.field3217[var3 + 2];
                            var39.field4209 = class221.field3217[var3 + 3];
                            class63.method476(var39, 14105);
                            continue;
                        }
                        if (var526 == 1207) {
                            var3 -= 2;
                            var39.field4201 = class221.field3217[var3];
                            var39.field4054 = class221.field3217[var3 + 1];
                            class63.method476(var39, 14105);
                            continue;
                        }
                    } else if ((var526 < 1300 || var526 >= 1400) && (var526 < 2300 || var526 >= 2400)) {
                        if (var526 >= 1400 && var526 < 1500 || var526 >= 2400 && var526 < 2500) {
                            class263 var482;
                            if (var526 >= 2000) {
                                var526 -= 1000;
                                var3--;
                                var482 = class144.method1078(class221.field3217[var3], 8534);
                            } else {
                                var482 = var38 ? class297.field4764 : class143.field2325;
                            }
                            var4--;
                            String var483 = class214.field3145[var4];
                            int[] var484 = null;
                            if (var483.length() > 0 && var483.charAt(var483.length() - 1) == 'Y') {
                                var3--;
                                int var485 = class221.field3217[var3];
                                if (var485 > 0) {
                                    var484 = new int[var485];
                                    while (var485-- > 0) {
                                        var3--;
                                        var484[var485] = class221.field3217[var3];
                                    }
                                }
                                var483 = var483.substring(0, var483.length() - 1);
                            }
                            Object[] var486 = new Object[var483.length() + 1];
                            for (int var487 = var486.length - 1; var487 >= 1; var487--) {
                                if (var483.charAt(var487 - 1) == 's') {
                                    var4--;
                                    var486[var487] = class214.field3145[var4];
                                } else {
                                    var3--;
                                    var486[var487] = Integer.valueOf(class221.field3217[var3]);
                                }
                            }
                            var3--;
                            int var488 = class221.field3217[var3];
                            if (var488 == -1) {
                                var486 = null;
                            } else {
                                var486[0] = Integer.valueOf(var488);
                            }
                            var482.field4194 = true;
                            if (var526 == 1400) {
                                var482.field4100 = var486;
                            } else if (var526 == 1401) {
                                var482.field4203 = var486;
                            } else if (var526 == 1402) {
                                var482.field4057 = var486;
                            } else if (var526 == 1403) {
                                var482.field4115 = var486;
                            } else if (var526 == 1404) {
                                var482.field4157 = var486;
                            } else if (var526 == 1405) {
                                var482.field4224 = var486;
                            } else if (var526 == 1406) {
                                var482.field4176 = var486;
                            } else if (var526 == 1407) {
                                var482.field4070 = var484;
                                var482.field4049 = var486;
                            } else if (var526 == 1408) {
                                var482.field4102 = var486;
                            } else if (var526 == 1409) {
                                var482.field4117 = var486;
                            } else if (var526 == 1410) {
                                var482.field4181 = var486;
                            } else if (var526 == 1411) {
                                var482.field4047 = var486;
                            } else if (var526 == 1412) {
                                var482.field4103 = var486;
                            } else if (var526 == 1414) {
                                var482.field4225 = var484;
                                var482.field4182 = var486;
                            } else if (var526 == 1415) {
                                var482.field4087 = var486;
                                var482.field4096 = var484;
                            } else if (var526 == 1416) {
                                var482.field4135 = var486;
                            } else if (var526 == 1417) {
                                var482.field4162 = var486;
                            } else if (var526 == 1418) {
                                var482.field4053 = var486;
                            } else if (var526 == 1419) {
                                var482.field4154 = var486;
                            } else if (var526 == 1420) {
                                var482.field4066 = var486;
                            } else if (var526 == 1421) {
                                var482.field4116 = var486;
                            } else if (var526 == 1422) {
                                var482.field4212 = var486;
                            } else if (var526 == 1423) {
                                var482.field4080 = var486;
                            } else if (var526 == 1424) {
                                var482.field4138 = var486;
                            } else if (var526 == 1425) {
                                var482.field4064 = var486;
                            } else if (var526 == 1426) {
                                var482.field4113 = var486;
                            } else if (var526 == 1427) {
                                var482.field4082 = var486;
                            } else if (var526 == 1428) {
                                var482.field4195 = var484;
                                var482.field4155 = var486;
                            } else if (var526 == 1429) {
                                var482.field4189 = var486;
                                var482.field4144 = var484;
                            }
                            continue;
                        }
                        if (var526 < 1600) {
                            class263 var481 = var38 ? class297.field4764 : class143.field2325;
                            if (var526 == 1500) {
                                class221.field3217[var3++] = var481.field4206;
                                continue;
                            }
                            if (var526 == 1501) {
                                class221.field3217[var3++] = var481.field4140;
                                continue;
                            }
                            if (var526 == 1502) {
                                class221.field3217[var3++] = var481.field4215;
                                continue;
                            }
                            if (var526 == 1503) {
                                class221.field3217[var3++] = var481.field4046;
                                continue;
                            }
                            if (var526 == 1504) {
                                class221.field3217[var3++] = var481.field4178 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 1505) {
                                class221.field3217[var3++] = var481.field4202;
                                continue;
                            }
                        } else if (var526 < 1700) {
                            class263 var480 = var38 ? class297.field4764 : class143.field2325;
                            if (var526 == 1600) {
                                class221.field3217[var3++] = var480.field4097;
                                continue;
                            }
                            if (var526 == 1601) {
                                class221.field3217[var3++] = var480.field4160;
                                continue;
                            }
                            if (var526 == 1602) {
                                class214.field3145[var4++] = var480.field4061;
                                continue;
                            }
                            if (var526 == 1603) {
                                class221.field3217[var3++] = var480.field4171;
                                continue;
                            }
                            if (var526 == 1604) {
                                class221.field3217[var3++] = var480.field4207;
                                continue;
                            }
                            if (var526 == 1605) {
                                class221.field3217[var3++] = var480.field4217;
                                continue;
                            }
                            if (var526 == 1606) {
                                class221.field3217[var3++] = var480.field4211;
                                continue;
                            }
                            if (var526 == 1607) {
                                class221.field3217[var3++] = var480.field4219;
                                continue;
                            }
                            if (var526 == 1608) {
                                class221.field3217[var3++] = var480.field4071;
                                continue;
                            }
                            if (var526 == 1609) {
                                class221.field3217[var3++] = var480.field4204;
                                continue;
                            }
                            if (var526 == 1610) {
                                class221.field3217[var3++] = var480.field4043;
                                continue;
                            }
                            if (var526 == 1611) {
                                class221.field3217[var3++] = var480.field4069;
                                continue;
                            }
                            if (var526 == 1612) {
                                class221.field3217[var3++] = var480.field4090;
                                continue;
                            }
                        } else if (var526 < 1800) {
                            class263 var49 = var38 ? class297.field4764 : class143.field2325;
                            if (var526 == 1700) {
                                class221.field3217[var3++] = var49.field4218;
                                continue;
                            }
                            if (var526 == 1701) {
                                if (var49.field4218 == -1) {
                                    class221.field3217[var3++] = 0;
                                } else {
                                    class221.field3217[var3++] = var49.field4059;
                                }
                                continue;
                            }
                            if (var526 == 1702) {
                                class221.field3217[var3++] = var49.field4145;
                                continue;
                            }
                        } else if (var526 < 1900) {
                            class263 var50 = var38 ? class297.field4764 : class143.field2325;
                            if (var526 == 1800) {
                                class221.field3217[var3++] = client.method903(var50).method1724((byte) 124);
                                continue;
                            }
                            if (var526 == 1801) {
                                var3--;
                                int var51 = class221.field3217[var3];
                                int var527 = var51 - 1;
                                if (var50.field4092 != null && var527 < var50.field4092.length && var50.field4092[var527] != null) {
                                    class214.field3145[var4++] = var50.field4092[var527];
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 1802) {
                                if (var50.field4111 == null) {
                                    class214.field3145[var4++] = "";
                                } else {
                                    class214.field3145[var4++] = var50.field4111;
                                }
                                continue;
                            }
                        } else if (var526 < 2600) {
                            var3--;
                            class263 var479 = class144.method1078(class221.field3217[var3], 8534);
                            if (var526 == 2500) {
                                class221.field3217[var3++] = var479.field4206;
                                continue;
                            }
                            if (var526 == 2501) {
                                class221.field3217[var3++] = var479.field4140;
                                continue;
                            }
                            if (var526 == 2502) {
                                class221.field3217[var3++] = var479.field4215;
                                continue;
                            }
                            if (var526 == 2503) {
                                class221.field3217[var3++] = var479.field4046;
                                continue;
                            }
                            if (var526 == 2504) {
                                class221.field3217[var3++] = var479.field4178 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 2505) {
                                class221.field3217[var3++] = var479.field4202;
                                continue;
                            }
                        } else if (var526 < 2700) {
                            var3--;
                            class263 var478 = class144.method1078(class221.field3217[var3], 8534);
                            if (var526 == 2600) {
                                class221.field3217[var3++] = var478.field4097;
                                continue;
                            }
                            if (var526 == 2601) {
                                class221.field3217[var3++] = var478.field4160;
                                continue;
                            }
                            if (var526 == 2602) {
                                class214.field3145[var4++] = var478.field4061;
                                continue;
                            }
                            if (var526 == 2603) {
                                class221.field3217[var3++] = var478.field4171;
                                continue;
                            }
                            if (var526 == 2604) {
                                class221.field3217[var3++] = var478.field4207;
                                continue;
                            }
                            if (var526 == 2605) {
                                class221.field3217[var3++] = var478.field4217;
                                continue;
                            }
                            if (var526 == 2606) {
                                class221.field3217[var3++] = var478.field4211;
                                continue;
                            }
                            if (var526 == 2607) {
                                class221.field3217[var3++] = var478.field4219;
                                continue;
                            }
                            if (var526 == 2608) {
                                class221.field3217[var3++] = var478.field4071;
                                continue;
                            }
                            if (var526 == 2609) {
                                class221.field3217[var3++] = var478.field4204;
                                continue;
                            }
                            if (var526 == 2610) {
                                class221.field3217[var3++] = var478.field4043;
                                continue;
                            }
                            if (var526 == 2611) {
                                class221.field3217[var3++] = var478.field4069;
                                continue;
                            }
                            if (var526 == 2612) {
                                class221.field3217[var3++] = var478.field4090;
                                continue;
                            }
                        } else if (var526 < 2800) {
                            if (var526 == 2700) {
                                var3--;
                                class263 var468 = class144.method1078(class221.field3217[var3], 8534);
                                class221.field3217[var3++] = var468.field4218;
                                continue;
                            }
                            if (var526 == 2701) {
                                var3--;
                                class263 var469 = class144.method1078(class221.field3217[var3], 8534);
                                if (var469.field4218 == -1) {
                                    class221.field3217[var3++] = 0;
                                } else {
                                    class221.field3217[var3++] = var469.field4059;
                                }
                                continue;
                            }
                            if (var526 == 2702) {
                                var3--;
                                int var470 = class221.field3217[var3];
                                class133 var471 = (class133) class251.field3793.method1073(-1, (long) var470);
                                if (var471 == null) {
                                    class221.field3217[var3++] = 0;
                                } else {
                                    class221.field3217[var3++] = 1;
                                }
                                continue;
                            }
                            if (var526 == 2703) {
                                var3--;
                                class263 var472 = class144.method1078(class221.field3217[var3], 8534);
                                if (var472.field4143 == null) {
                                    class221.field3217[var3++] = 0;
                                    continue;
                                }
                                int var473 = var472.field4143.length;
                                for (int var474 = 0; var474 < var472.field4143.length; var474++) {
                                    if (var472.field4143[var474] == null) {
                                        var473 = var474;
                                        break;
                                    }
                                }
                                class221.field3217[var3++] = var473;
                                continue;
                            }
                            if (var526 == 2704 || var526 == 2705) {
                                var3 -= 2;
                                int var475 = class221.field3217[var3];
                                int var476 = class221.field3217[var3 + 1];
                                class133 var477 = (class133) class251.field3793.method1073(-1, (long) var475);
                                if (var477 != null && var477.field2187 == var476) {
                                    class221.field3217[var3++] = 1;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                        } else if (var526 < 2900) {
                            var3--;
                            class263 var466 = class144.method1078(class221.field3217[var3], 8534);
                            if (var526 == 2800) {
                                class221.field3217[var3++] = client.method903(var466).method1724((byte) 119);
                                continue;
                            }
                            if (var526 == 2801) {
                                var3--;
                                int var467 = class221.field3217[var3];
                                int var528 = var467 - 1;
                                if (var466.field4092 != null && var528 < var466.field4092.length && var466.field4092[var528] != null) {
                                    class214.field3145[var4++] = var466.field4092[var528];
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 2802) {
                                if (var466.field4111 == null) {
                                    class214.field3145[var4++] = "";
                                } else {
                                    class214.field3145[var4++] = var466.field4111;
                                }
                                continue;
                            }
                        } else if (var526 < 3200) {
                            if (var526 == 3100) {
                                var4--;
                                String var52 = class214.field3145[var4];
                                class258.method1777(-1, 0, "", var52);
                                continue;
                            }
                            if (var526 == 3101) {
                                var3 -= 2;
                                class272.method1899(true, class213.field3139, class221.field3217[var3 + 1], class221.field3217[var3]);
                                continue;
                            }
                            if (var526 == 3103) {
                                class161.method1170((byte) 76);
                                continue;
                            }
                            if (var526 == 3104) {
                                class243.field3575++;
                                var4--;
                                String var53 = class214.field3145[var4];
                                int var54 = 0;
                                if (class129.method976(109, var53)) {
                                    var54 = class219.method1531(var53, 2781);
                                }
                                class144.field2338.method683(true, 219);
                                class144.field2338.method385(var54, 455748840);
                                continue;
                            }
                            if (var526 == 3105) {
                                class206.field3031++;
                                var4--;
                                String var55 = class214.field3145[var4];
                                class144.field2338.method683(true, 149);
                                class144.field2338.method382(902642416, class143.method1064((byte) -87, var55));
                                continue;
                            }
                            if (var526 == 3106) {
                                class241.field3532++;
                                var4--;
                                String var56 = class214.field3145[var4];
                                class144.field2338.method683(true, 164);
                                class144.field2338.method360(var56.length() + 1, 25759);
                                class144.field2338.method338(var56, 1970);
                                continue;
                            }
                            if (var526 == 3107) {
                                var3--;
                                int var57 = class221.field3217[var3];
                                var4--;
                                String var58 = class214.field3145[var4];
                                class120.method893(96, var58, var57);
                                continue;
                            }
                            if (var526 == 3108) {
                                var3 -= 3;
                                int var59 = class221.field3217[var3];
                                int var60 = class221.field3217[var3 + 1];
                                int var61 = class221.field3217[var3 + 2];
                                class263 var62 = class144.method1078(var61, 8534);
                                class232.method1606(var60, var59, 0, var62);
                                continue;
                            }
                            if (var526 == 3109) {
                                var3 -= 2;
                                int var63 = class221.field3217[var3];
                                int var64 = class221.field3217[var3 + 1];
                                class263 var65 = var38 ? class297.field4764 : class143.field2325;
                                class232.method1606(var64, var63, 0, var65);
                                continue;
                            }
                            if (var526 == 3110) {
                                class180.field2714++;
                                var3--;
                                int var66 = class221.field3217[var3];
                                class144.field2338.method683(true, 231);
                                class144.field2338.method376(var66, false);
                                continue;
                            }
                        } else if (var526 < 3300) {
                            if (var526 == 3200) {
                                var3 -= 3;
                                class245.method1688(0, class221.field3217[var3], class221.field3217[var3 + 1], 255, class221.field3217[var3 + 2]);
                                continue;
                            }
                            if (var526 == 3201) {
                                var3--;
                                class94.method724(-119, class221.field3217[var3], 255);
                                continue;
                            }
                            if (var526 == 3202) {
                                var3 -= 2;
                                class100.method787(-1, class221.field3217[var3 + 1], 255, class221.field3217[var3]);
                                continue;
                            }
                        } else if (var526 < 3400) {
                            if (var526 == 3300) {
                                class221.field3217[var3++] = class199.field2930;
                                continue;
                            }
                            if (var526 == 3301) {
                                var3 -= 2;
                                int var432 = class221.field3217[var3];
                                int var433 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class306.method2079(var432, var433, false);
                                continue;
                            }
                            if (var526 == 3302) {
                                var3 -= 2;
                                int var434 = class221.field3217[var3];
                                int var435 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class24.method164(var435, var434, -1);
                                continue;
                            }
                            if (var526 == 3303) {
                                var3 -= 2;
                                int var436 = class221.field3217[var3 + 1];
                                int var437 = class221.field3217[var3];
                                class221.field3217[var3++] = class260.method1784(-2, var437, var436);
                                continue;
                            }
                            if (var526 == 3304) {
                                var3--;
                                int var438 = class221.field3217[var3];
                                class221.field3217[var3++] = class129.method977(-8467, var438).field2332;
                                continue;
                            }
                            if (var526 == 3305) {
                                var3--;
                                int var439 = class221.field3217[var3];
                                class221.field3217[var3++] = class52.field724[var439];
                                continue;
                            }
                            if (var526 == 3306) {
                                var3--;
                                int var440 = class221.field3217[var3];
                                class221.field3217[var3++] = class185.field2761[var440];
                                continue;
                            }
                            if (var526 == 3307) {
                                var3--;
                                int var441 = class221.field3217[var3];
                                class221.field3217[var3++] = class140.field2269[var441];
                                continue;
                            }
                            if (var526 == 3308) {
                                int var442 = class37.field474;
                                int var443 = (class213.field3139.field3753 >> 7) + class149.field2390;
                                int var444 = (class213.field3139.field3660 >> 7) + class163.field2520;
                                class221.field3217[var3++] = (var442 << 28) + (var444 << 14) + var443;
                                continue;
                            }
                            if (var526 == 3309) {
                                var3--;
                                int var445 = class221.field3217[var3];
                                class221.field3217[var3++] = class301.method2056(268419727, var445) >> 14;
                                continue;
                            }
                            if (var526 == 3310) {
                                var3--;
                                int var446 = class221.field3217[var3];
                                class221.field3217[var3++] = var446 >> 28;
                                continue;
                            }
                            if (var526 == 3311) {
                                var3--;
                                int var447 = class221.field3217[var3];
                                class221.field3217[var3++] = class301.method2056(var447, 16383);
                                continue;
                            }
                            if (var526 == 3312) {
                                class221.field3217[var3++] = class255.field3857 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3313) {
                                var3 -= 2;
                                int var448 = class221.field3217[var3 + 1];
                                int var449 = class221.field3217[var3] + 32768;
                                class221.field3217[var3++] = class306.method2079(var449, var448, false);
                                continue;
                            }
                            if (var526 == 3314) {
                                var3 -= 2;
                                int var450 = class221.field3217[var3] + 32768;
                                int var451 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class24.method164(var451, var450, -1);
                                continue;
                            }
                            if (var526 == 3315) {
                                var3 -= 2;
                                int var452 = class221.field3217[var3] + 32768;
                                int var453 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class260.method1784(-2, var452, var453);
                                continue;
                            }
                            if (var526 == 3316) {
                                if (class228.field3349 >= 2) {
                                    class221.field3217[var3++] = class228.field3349;
                                } else {
                                    class221.field3217[var3++] = 0;
                                }
                                continue;
                            }
                            if (var526 == 3317) {
                                class221.field3217[var3++] = class283.field4556;
                                continue;
                            }
                            if (var526 == 3318) {
                                class221.field3217[var3++] = class114.field1884;
                                continue;
                            }
                            if (var526 == 3321) {
                                class221.field3217[var3++] = class45.field589;
                                continue;
                            }
                            if (var526 == 3322) {
                                class221.field3217[var3++] = class305.field4933;
                                continue;
                            }
                            if (var526 == 3323) {
                                if (class43.field564 >= 5 && class43.field564 <= 9) {
                                    class221.field3217[var3++] = 1;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3324) {
                                if (class43.field564 >= 5 && class43.field564 <= 9) {
                                    class221.field3217[var3++] = class43.field564;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3325) {
                                class221.field3217[var3++] = class171.field2585 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3326) {
                                class221.field3217[var3++] = class213.field3139.field3068;
                                continue;
                            }
                            if (var526 == 3327) {
                                class221.field3217[var3++] = class213.field3139.field3063.field4775 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3328) {
                                class221.field3217[var3++] = class284.field4567 && !class291.field4630 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3329) {
                                class221.field3217[var3++] = class124.field2080 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3330) {
                                var3--;
                                int var454 = class221.field3217[var3];
                                class221.field3217[var3++] = class210.method1479(-14720, var454);
                                continue;
                            }
                            if (var526 == 3331) {
                                var3 -= 2;
                                int var455 = class221.field3217[var3];
                                int var456 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class166.method1190(var456, var455, false, 0);
                                continue;
                            }
                            if (var526 == 3332) {
                                var3 -= 2;
                                int var457 = class221.field3217[var3];
                                int var458 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class166.method1190(var458, var457, true, 0);
                                continue;
                            }
                            if (var526 == 3333) {
                                class221.field3217[var3++] = class263.field4141;
                                continue;
                            }
                            if (var526 == 3335) {
                                class221.field3217[var3++] = class87.field1385;
                                continue;
                            }
                            if (var526 == 3336) {
                                var3 -= 4;
                                int var459 = class221.field3217[var3 + 1];
                                int var460 = class221.field3217[var3];
                                int var461 = (var459 << 14) + var460;
                                int var462 = class221.field3217[var3 + 2];
                                int var463 = class221.field3217[var3 + 3];
                                int var464 = (var462 << 28) + var461;
                                int var465 = var463 + var464;
                                class221.field3217[var3++] = var465;
                                continue;
                            }
                            if (var526 == 3337) {
                                class221.field3217[var3++] = class281.field4525;
                                continue;
                            }
                        } else if (var526 < 3500) {
                            if (var526 == 3400) {
                                var3 -= 2;
                                int var67 = class221.field3217[var3];
                                int var68 = class221.field3217[var3 + 1];
                                class137 var69 = class76.method567(var67, -2882);
                                class214.field3145[var4++] = var69.method1029(var68, (byte) 1);
                                continue;
                            }
                            if (var526 == 3408) {
                                var3 -= 4;
                                int var70 = class221.field3217[var3];
                                int var71 = class221.field3217[var3 + 2];
                                int var72 = class221.field3217[var3 + 1];
                                int var73 = class221.field3217[var3 + 3];
                                class137 var74 = class76.method567(var71, -2882);
                                if (var74.field2221 == var70 && var74.field2239 == var72) {
                                    if (var72 == 115) {
                                        class214.field3145[var4++] = var74.method1029(var73, (byte) 1);
                                    } else {
                                        class221.field3217[var3++] = var74.method1030(false, var73);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var526 == 3409) {
                                var3 -= 3;
                                int var75 = class221.field3217[var3];
                                int var76 = class221.field3217[var3 + 2];
                                int var77 = class221.field3217[var3 + 1];
                                if (var77 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class137 var78 = class76.method567(var77, -2882);
                                if (var78.field2239 != var75) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class221.field3217[var3++] = var78.method1036(var76, -67) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3410) {
                                var4--;
                                String var79 = class214.field3145[var4];
                                var3--;
                                int var80 = class221.field3217[var3];
                                if (var80 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class137 var81 = class76.method567(var80, -2882);
                                if (var81.field2239 != 's') {
                                    throw new RuntimeException("C3410-1");
                                }
                                class221.field3217[var3++] = var81.method1027(var79, -69) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3411) {
                                var3--;
                                int var82 = class221.field3217[var3];
                                class137 var83 = class76.method567(var82, -2882);
                                class221.field3217[var3++] = var83.field2238.method1066((byte) -82);
                                continue;
                            }
                        } else if (var526 < 3700) {
                            if (var526 == 3600) {
                                if (class111.field1856 == 0) {
                                    class221.field3217[var3++] = -2;
                                } else if (class111.field1856 == 1) {
                                    class221.field3217[var3++] = -1;
                                } else {
                                    class221.field3217[var3++] = class110.field1832;
                                }
                                continue;
                            }
                            if (var526 == 3601) {
                                var3--;
                                int var408 = class221.field3217[var3];
                                if (class111.field1856 == 2 && var408 < class110.field1832) {
                                    class214.field3145[var4++] = class223.field3268[var408];
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 3602) {
                                var3--;
                                int var409 = class221.field3217[var3];
                                if (class111.field1856 == 2 && var409 < class110.field1832) {
                                    class221.field3217[var3++] = class268.field4315[var409];
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3603) {
                                var3--;
                                int var410 = class221.field3217[var3];
                                if (class111.field1856 == 2 && var410 < class110.field1832) {
                                    class221.field3217[var3++] = class292.field4637[var410];
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3604) {
                                var3--;
                                int var411 = class221.field3217[var3];
                                var4--;
                                String var412 = class214.field3145[var4];
                                class211.method1484(var411, 99999999, var412);
                                continue;
                            }
                            if (var526 == 3605) {
                                var4--;
                                String var413 = class214.field3145[var4];
                                class264.method1822(class143.method1064((byte) -68, var413), -8002);
                                continue;
                            }
                            if (var526 == 3606) {
                                var4--;
                                String var414 = class214.field3145[var4];
                                class209.method1474(class143.method1064((byte) -71, var414), -23814);
                                continue;
                            }
                            if (var526 == 3607) {
                                var4--;
                                String var415 = class214.field3145[var4];
                                class301.method2057(false, 78, class143.method1064((byte) -123, var415));
                                continue;
                            }
                            if (var526 == 3608) {
                                var4--;
                                String var416 = class214.field3145[var4];
                                class143.method1065((byte) 122, class143.method1064((byte) -103, var416));
                                continue;
                            }
                            if (var526 == 3609) {
                                var4--;
                                String var417 = class214.field3145[var4];
                                if (var417.startsWith("<img=0>") || var417.startsWith("<img=1>")) {
                                    var417 = var417.substring(7);
                                }
                                class221.field3217[var3++] = class128.method974(1128, var417) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3610) {
                                var3--;
                                int var418 = class221.field3217[var3];
                                if (class111.field1856 == 2 && var418 < class110.field1832) {
                                    class214.field3145[var4++] = class258.field3980[var418];
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 3611) {
                                if (class35.field448 == null) {
                                    class214.field3145[var4++] = "";
                                } else {
                                    class214.field3145[var4++] = class85.method633((byte) 27, class35.field448);
                                }
                                continue;
                            }
                            if (var526 == 3612) {
                                if (class35.field448 == null) {
                                    class221.field3217[var3++] = 0;
                                } else {
                                    class221.field3217[var3++] = class78.field1261;
                                }
                                continue;
                            }
                            if (var526 == 3613) {
                                var3--;
                                int var419 = class221.field3217[var3];
                                if (class35.field448 != null && class78.field1261 > var419) {
                                    class214.field3145[var4++] = class85.method633((byte) 27, class62.field939[var419].field565);
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 3614) {
                                var3--;
                                int var420 = class221.field3217[var3];
                                if (class35.field448 != null && class78.field1261 > var420) {
                                    class221.field3217[var3++] = class62.field939[var420].field567;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3615) {
                                var3--;
                                int var421 = class221.field3217[var3];
                                if (class35.field448 != null && class78.field1261 > var421) {
                                    class221.field3217[var3++] = class62.field939[var421].field563;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3616) {
                                class221.field3217[var3++] = class273.field4421;
                                continue;
                            }
                            if (var526 == 3617) {
                                var4--;
                                String var422 = class214.field3145[var4];
                                class249.method1720(false, var422);
                                continue;
                            }
                            if (var526 == 3618) {
                                class221.field3217[var3++] = class51.field706;
                                continue;
                            }
                            if (var526 == 3619) {
                                var4--;
                                String var423 = class214.field3145[var4];
                                class217.method1512(class143.method1064((byte) -81, var423), 13196);
                                continue;
                            }
                            if (var526 == 3620) {
                                class69.method524(205);
                                continue;
                            }
                            if (var526 == 3621) {
                                if (class111.field1856 == 0) {
                                    class221.field3217[var3++] = -1;
                                } else {
                                    class221.field3217[var3++] = class47.field659;
                                }
                                continue;
                            }
                            if (var526 == 3622) {
                                var3--;
                                int var424 = class221.field3217[var3];
                                if (class111.field1856 != 0 && class47.field659 > var424) {
                                    class214.field3145[var4++] = class121.method920(110, class203.field3007[var424]);
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 3623) {
                                var4--;
                                String var425 = class214.field3145[var4];
                                if (var425.startsWith("<img=0>") || var425.startsWith("<img=1>")) {
                                    var425 = var425.substring(7);
                                }
                                class221.field3217[var3++] = class288.method1968(1792, var425) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3624) {
                                var3--;
                                int var426 = class221.field3217[var3];
                                if (class62.field939 != null && class78.field1261 > var426 && class62.field939[var426].field565.equalsIgnoreCase(class213.field3139.field3069)) {
                                    class221.field3217[var3++] = 1;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3625) {
                                if (class284.field4573 == null) {
                                    class214.field3145[var4++] = "";
                                } else {
                                    class214.field3145[var4++] = class85.method633((byte) 27, class284.field4573);
                                }
                                continue;
                            }
                            if (var526 == 3626) {
                                var3--;
                                int var427 = class221.field3217[var3];
                                if (class35.field448 != null && class78.field1261 > var427) {
                                    class214.field3145[var4++] = class62.field939[var427].field562;
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 3627) {
                                var3--;
                                int var428 = class221.field3217[var3];
                                if (class111.field1856 == 2 && var428 >= 0 && var428 < class110.field1832) {
                                    class221.field3217[var3++] = class240.field3519[var428] ? 1 : 0;
                                    continue;
                                }
                                class221.field3217[var3++] = 0;
                                continue;
                            }
                            if (var526 == 3628) {
                                var4--;
                                String var429 = class214.field3145[var4];
                                if (var429.startsWith("<img=0>") || var429.startsWith("<img=1>")) {
                                    var429 = var429.substring(7);
                                }
                                class221.field3217[var3++] = class7.method38(false, var429);
                                continue;
                            }
                            if (var526 == 3629) {
                                class221.field3217[var3++] = class303.field4899;
                                continue;
                            }
                            if (var526 == 3630) {
                                var4--;
                                String var430 = class214.field3145[var4];
                                class301.method2057(true, 94, class143.method1064((byte) -79, var430));
                                continue;
                            }
                            if (var526 == 3631) {
                                var3--;
                                int var431 = class221.field3217[var3];
                                class221.field3217[var3++] = class221.field3226[var431] ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 4000) {
                            if (var526 == 3903) {
                                var3--;
                                int var84 = class221.field3217[var3];
                                class221.field3217[var3++] = class313.field5026[var84].method609((byte) 123);
                                continue;
                            }
                            if (var526 == 3904) {
                                var3--;
                                int var85 = class221.field3217[var3];
                                class221.field3217[var3++] = class313.field5026[var85].field1301;
                                continue;
                            }
                            if (var526 == 3905) {
                                var3--;
                                int var86 = class221.field3217[var3];
                                class221.field3217[var3++] = class313.field5026[var86].field1291;
                                continue;
                            }
                            if (var526 == 3906) {
                                var3--;
                                int var87 = class221.field3217[var3];
                                class221.field3217[var3++] = class313.field5026[var87].field1292;
                                continue;
                            }
                            if (var526 == 3907) {
                                var3--;
                                int var88 = class221.field3217[var3];
                                class221.field3217[var3++] = class313.field5026[var88].field1298;
                                continue;
                            }
                            if (var526 == 3908) {
                                var3--;
                                int var89 = class221.field3217[var3];
                                class221.field3217[var3++] = class313.field5026[var89].field1299;
                                continue;
                            }
                            if (var526 == 3910) {
                                var3--;
                                int var90 = class221.field3217[var3];
                                int var91 = class313.field5026[var90].method610(-123);
                                class221.field3217[var3++] = var91 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3911) {
                                var3--;
                                int var92 = class221.field3217[var3];
                                int var93 = class313.field5026[var92].method610(-41);
                                class221.field3217[var3++] = var93 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3912) {
                                var3--;
                                int var94 = class221.field3217[var3];
                                int var95 = class313.field5026[var94].method610(-104);
                                class221.field3217[var3++] = var95 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 3913) {
                                var3--;
                                int var96 = class221.field3217[var3];
                                int var97 = class313.field5026[var96].method610(-64);
                                class221.field3217[var3++] = var97 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var526 < 4100) {
                            if (var526 == 4000) {
                                var3 -= 2;
                                int var363 = class221.field3217[var3 + 1];
                                int var364 = class221.field3217[var3];
                                class221.field3217[var3++] = var363 + var364;
                                continue;
                            }
                            if (var526 == 4001) {
                                var3 -= 2;
                                int var365 = class221.field3217[var3];
                                int var366 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var365 - var366;
                                continue;
                            }
                            if (var526 == 4002) {
                                var3 -= 2;
                                int var367 = class221.field3217[var3];
                                int var368 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var367 * var368;
                                continue;
                            }
                            if (var526 == 4003) {
                                var3 -= 2;
                                int var369 = class221.field3217[var3];
                                int var370 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var369 / var370;
                                continue;
                            }
                            if (var526 == 4004) {
                                var3--;
                                int var371 = class221.field3217[var3];
                                class221.field3217[var3++] = (int) ((double) var371 * Math.random());
                                continue;
                            }
                            if (var526 == 4005) {
                                var3--;
                                int var372 = class221.field3217[var3];
                                class221.field3217[var3++] = (int) (Math.random() * (double) (var372 + 1));
                                continue;
                            }
                            if (var526 == 4006) {
                                var3 -= 5;
                                int var373 = class221.field3217[var3 + 2];
                                int var374 = class221.field3217[var3];
                                int var375 = class221.field3217[var3 + 3];
                                int var376 = class221.field3217[var3 + 1];
                                int var377 = class221.field3217[var3 + 4];
                                class221.field3217[var3++] = (var376 - var374) * (var377 - var373) / (var375 - var373) + var374;
                                continue;
                            }
                            if (var526 == 4007) {
                                var3 -= 2;
                                long var378 = (long) class221.field3217[var3 + 1];
                                long var380 = (long) class221.field3217[var3];
                                class221.field3217[var3++] = (int) (var378 * var380 / 100L + var380);
                                continue;
                            }
                            if (var526 == 4008) {
                                var3 -= 2;
                                int var382 = class221.field3217[var3];
                                int var383 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class200.method1408(0x1 << var383, var382);
                                continue;
                            }
                            if (var526 == 4009) {
                                var3 -= 2;
                                int var384 = class221.field3217[var3];
                                int var385 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class301.method2056(var384, -(0x1 << var385) - 1);
                                continue;
                            }
                            if (var526 == 4010) {
                                var3 -= 2;
                                int var386 = class221.field3217[var3];
                                int var387 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class301.method2056(var386, 0x1 << var387) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var526 == 4011) {
                                var3 -= 2;
                                int var388 = class221.field3217[var3];
                                int var389 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var388 % var389;
                                continue;
                            }
                            if (var526 == 4012) {
                                var3 -= 2;
                                int var390 = class221.field3217[var3];
                                int var391 = class221.field3217[var3 + 1];
                                if (var390 == 0) {
                                    class221.field3217[var3++] = 0;
                                } else {
                                    class221.field3217[var3++] = (int) Math.pow((double) var390, (double) var391);
                                }
                                continue;
                            }
                            if (var526 == 4013) {
                                var3 -= 2;
                                int var392 = class221.field3217[var3 + 1];
                                int var393 = class221.field3217[var3];
                                if (var393 == 0) {
                                    class221.field3217[var3++] = 0;
                                } else if (var392 == 0) {
                                    class221.field3217[var3++] = Integer.MAX_VALUE;
                                } else {
                                    class221.field3217[var3++] = (int) Math.pow((double) var393, 1.0D / (double) var392);
                                }
                                continue;
                            }
                            if (var526 == 4014) {
                                var3 -= 2;
                                int var394 = class221.field3217[var3];
                                int var395 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class301.method2056(var395, var394);
                                continue;
                            }
                            if (var526 == 4015) {
                                var3 -= 2;
                                int var396 = class221.field3217[var3];
                                int var397 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = class200.method1408(var397, var396);
                                continue;
                            }
                            if (var526 == 4016) {
                                var3 -= 2;
                                int var398 = class221.field3217[var3];
                                int var399 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var398 >= var399 ? var399 : var398;
                                continue;
                            }
                            if (var526 == 4017) {
                                var3 -= 2;
                                int var400 = class221.field3217[var3];
                                int var401 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var400 > var401 ? var400 : var401;
                                continue;
                            }
                            if (var526 == 4018) {
                                var3 -= 3;
                                long var402 = (long) class221.field3217[var3];
                                long var404 = (long) class221.field3217[var3 + 1];
                                long var406 = (long) class221.field3217[var3 + 2];
                                class221.field3217[var3++] = (int) (var402 * var406 / var404);
                                continue;
                            }
                        } else if (var526 < 4200) {
                            if (var526 == 4100) {
                                var4--;
                                String var313 = class214.field3145[var4];
                                var3--;
                                int var314 = class221.field3217[var3];
                                class214.field3145[var4++] = var313 + var314;
                                continue;
                            }
                            if (var526 == 4101) {
                                var4 -= 2;
                                String var315 = class214.field3145[var4];
                                String var316 = class214.field3145[var4 + 1];
                                class214.field3145[var4++] = var315 + var316;
                                continue;
                            }
                            if (var526 == 4102) {
                                var4--;
                                String var317 = class214.field3145[var4];
                                var3--;
                                int var318 = class221.field3217[var3];
                                class214.field3145[var4++] = var317 + class201.method1423(true, false, var318);
                                continue;
                            }
                            if (var526 == 4103) {
                                var4--;
                                String var319 = class214.field3145[var4];
                                class214.field3145[var4++] = var319.toLowerCase();
                                continue;
                            }
                            if (var526 == 4104) {
                                var3--;
                                int var320 = class221.field3217[var3];
                                long var321 = ((long) var320 + 11745L) * 86400000L;
                                class51.field697.setTime(new Date(var321));
                                int var323 = class51.field697.get(5);
                                int var324 = class51.field697.get(2);
                                int var325 = class51.field697.get(1);
                                class214.field3145[var4++] = var323 + "-" + class43.field570[var324] + "-" + var325;
                                continue;
                            }
                            if (var526 == 4105) {
                                var4 -= 2;
                                String var326 = class214.field3145[var4];
                                String var327 = class214.field3145[var4 + 1];
                                if (class213.field3139.field3063 != null && class213.field3139.field3063.field4775) {
                                    class214.field3145[var4++] = var327;
                                    continue;
                                }
                                class214.field3145[var4++] = var326;
                                continue;
                            }
                            if (var526 == 4106) {
                                var3--;
                                int var328 = class221.field3217[var3];
                                class214.field3145[var4++] = Integer.toString(var328);
                                continue;
                            }
                            if (var526 == 4107) {
                                var4 -= 2;
                                class221.field3217[var3++] = class57.method404(-123, class230.method1600(class87.field1385, class214.field3145[var4], 0, class214.field3145[var4 + 1]));
                                continue;
                            }
                            if (var526 == 4108) {
                                var3 -= 2;
                                int var329 = class221.field3217[var3];
                                int var330 = class221.field3217[var3 + 1];
                                var4--;
                                String var331 = class214.field3145[var4];
                                class221.field3217[var3++] = class167.method1193(0, var330).method57(var331, var329);
                                continue;
                            }
                            if (var526 == 4109) {
                                var3 -= 2;
                                int var332 = class221.field3217[var3];
                                int var333 = class221.field3217[var3 + 1];
                                var4--;
                                String var334 = class214.field3145[var4];
                                class221.field3217[var3++] = class167.method1193(0, var333).method77(var334, var332);
                                continue;
                            }
                            if (var526 == 4110) {
                                var4 -= 2;
                                String var335 = class214.field3145[var4];
                                String var336 = class214.field3145[var4 + 1];
                                var3--;
                                if (class221.field3217[var3] == 1) {
                                    class214.field3145[var4++] = var335;
                                } else {
                                    class214.field3145[var4++] = var336;
                                }
                                continue;
                            }
                            if (var526 == 4111) {
                                var4--;
                                String var337 = class214.field3145[var4];
                                class214.field3145[var4++] = class10.method69(var337);
                                continue;
                            }
                            if (var526 == 4112) {
                                var4--;
                                String var338 = class214.field3145[var4];
                                var3--;
                                int var339 = class221.field3217[var3];
                                if (var339 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class214.field3145[var4++] = var338 + (char) var339;
                                continue;
                            }
                            if (var526 == 4113) {
                                var3--;
                                int var340 = class221.field3217[var3];
                                class221.field3217[var3++] = class147.method1090((char) var340, -8213) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 4114) {
                                var3--;
                                int var341 = class221.field3217[var3];
                                class221.field3217[var3++] = class92.method694((byte) -104, (char) var341) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 4115) {
                                var3--;
                                int var342 = class221.field3217[var3];
                                class221.field3217[var3++] = class187.method1336((char) var342, 101) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 4116) {
                                var3--;
                                int var343 = class221.field3217[var3];
                                class221.field3217[var3++] = class133.method1012(4194303, (char) var343) ? 1 : 0;
                                continue;
                            }
                            if (var526 == 4117) {
                                var4--;
                                String var344 = class214.field3145[var4];
                                if (var344 == null) {
                                    class221.field3217[var3++] = 0;
                                } else {
                                    class221.field3217[var3++] = var344.length();
                                }
                                continue;
                            }
                            if (var526 == 4118) {
                                var3 -= 2;
                                var4--;
                                String var345 = class214.field3145[var4];
                                int var346 = class221.field3217[var3];
                                int var347 = class221.field3217[var3 + 1];
                                class214.field3145[var4++] = var345.substring(var346, var347);
                                continue;
                            }
                            if (var526 == 4119) {
                                var4--;
                                String var348 = class214.field3145[var4];
                                StringBuffer var349 = new StringBuffer(var348.length());
                                boolean var350 = false;
                                for (int var351 = 0; var348.length() > var351; var351++) {
                                    char var352 = var348.charAt(var351);
                                    if (var352 == '<') {
                                        var350 = true;
                                    } else if (var352 == '>') {
                                        var350 = false;
                                    } else if (!var350) {
                                        var349.append(var352);
                                    }
                                }
                                class214.field3145[var4++] = var349.toString();
                                continue;
                            }
                            if (var526 == 4120) {
                                var4--;
                                String var353 = class214.field3145[var4];
                                var3 -= 2;
                                int var354 = class221.field3217[var3];
                                int var355 = class221.field3217[var3 + 1];
                                class221.field3217[var3++] = var353.indexOf(var354, var355);
                                continue;
                            }
                            if (var526 == 4121) {
                                var4 -= 2;
                                String var356 = class214.field3145[var4 + 1];
                                var3--;
                                int var357 = class221.field3217[var3];
                                String var358 = class214.field3145[var4];
                                class221.field3217[var3++] = var358.indexOf(var356, var357);
                                continue;
                            }
                            if (var526 == 4122) {
                                var3--;
                                int var359 = class221.field3217[var3];
                                class221.field3217[var3++] = Character.toLowerCase((char) var359);
                                continue;
                            }
                            if (var526 == 4123) {
                                var3--;
                                int var360 = class221.field3217[var3];
                                class221.field3217[var3++] = Character.toUpperCase((char) var360);
                                continue;
                            }
                            if (var526 == 4124) {
                                var3--;
                                boolean var361 = class221.field3217[var3] != 0;
                                var3--;
                                int var362 = class221.field3217[var3];
                                class214.field3145[var4++] = class291.method1980((byte) -23, (long) var362, var361, class87.field1385, 0);
                                continue;
                            }
                        } else if (var526 < 4300) {
                            if (var526 == 4200) {
                                var3--;
                                int var98 = class221.field3217[var3];
                                class214.field3145[var4++] = class12.method88(var98, 27838).field349;
                                continue;
                            }
                            if (var526 == 4201) {
                                var3 -= 2;
                                int var99 = class221.field3217[var3];
                                int var100 = class221.field3217[var3 + 1];
                                class31 var101 = class12.method88(var99, 27838);
                                if (var100 >= 1 && var100 <= 5 && var101.field354[var100 - 1] != null) {
                                    class214.field3145[var4++] = var101.field354[var100 - 1];
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 4202) {
                                var3 -= 2;
                                int var102 = class221.field3217[var3];
                                int var103 = class221.field3217[var3 + 1];
                                class31 var104 = class12.method88(var102, 27838);
                                if (var103 >= 1 && var103 <= 5 && var104.field385[var103 - 1] != null) {
                                    class214.field3145[var4++] = var104.field385[var103 - 1];
                                    continue;
                                }
                                class214.field3145[var4++] = "";
                                continue;
                            }
                            if (var526 == 4203) {
                                var3--;
                                int var105 = class221.field3217[var3];
                                class221.field3217[var3++] = class12.method88(var105, 27838).field376;
                                continue;
                            }
                            if (var526 == 4204) {
                                var3--;
                                int var106 = class221.field3217[var3];
                                class221.field3217[var3++] = class12.method88(var106, 27838).field367 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 4205) {
                                var3--;
                                int var107 = class221.field3217[var3];
                                class31 var108 = class12.method88(var107, 27838);
                                if (var108.field323 == -1 && var108.field378 >= 0) {
                                    class221.field3217[var3++] = var108.field378;
                                    continue;
                                }
                                class221.field3217[var3++] = var107;
                                continue;
                            }
                            if (var526 == 4206) {
                                var3--;
                                int var109 = class221.field3217[var3];
                                class31 var110 = class12.method88(var109, 27838);
                                if (var110.field323 >= 0 && var110.field378 >= 0) {
                                    class221.field3217[var3++] = var110.field378;
                                    continue;
                                }
                                class221.field3217[var3++] = var109;
                                continue;
                            }
                            if (var526 == 4207) {
                                var3--;
                                int var111 = class221.field3217[var3];
                                class221.field3217[var3++] = class12.method88(var111, 27838).field364 ? 1 : 0;
                                continue;
                            }
                            if (var526 == 4208) {
                                var3 -= 2;
                                int var112 = class221.field3217[var3];
                                int var113 = class221.field3217[var3 + 1];
                                class192 var114 = class51.method308((byte) -73, var113);
                                if (var114.method1369(0)) {
                                    class214.field3145[var4++] = class12.method88(var112, 27838).method197(var114.field2837, var113, (byte) -121);
                                } else {
                                    class221.field3217[var3++] = class12.method88(var112, 27838).method203(var114.field2840, var113, -41);
                                }
                                continue;
                            }
                            if (var526 == 4210) {
                                var4--;
                                String var115 = class214.field3145[var4];
                                var3--;
                                int var116 = class221.field3217[var3];
                                class192.method1362(var115, 7490, var116 == 1);
                                class221.field3217[var3++] = class289.field4617;
                                continue;
                            }
                            if (var526 == 4211) {
                                if (class45.field610 != null && class289.field4617 > class170.field2579) {
                                    class221.field3217[var3++] = class301.method2056(class45.field610[class170.field2579++], 65535);
                                    continue;
                                }
                                class221.field3217[var3++] = -1;
                                continue;
                            }
                            if (var526 == 4212) {
                                class170.field2579 = 0;
                                continue;
                            }
                        } else if (var526 >= 4400) {
                            if (var526 < 4500) {
                                if (var526 == 4400) {
                                    var3 -= 2;
                                    int var117 = class221.field3217[var3 + 1];
                                    int var118 = class221.field3217[var3];
                                    class192 var119 = class51.method308((byte) -73, var117);
                                    if (var119.method1369(0)) {
                                        class214.field3145[var4++] = class48.method297(false, var118).method716(var119.field2837, var117, -1644);
                                    } else {
                                        class221.field3217[var3++] = class48.method297(false, var118).method705(var119.field2840, 19850, var117);
                                    }
                                    continue;
                                }
                            } else if (var526 >= 4600) {
                                if (var526 < 5100) {
                                    if (var526 == 5000) {
                                        class221.field3217[var3++] = class185.field2767;
                                        continue;
                                    }
                                    if (var526 == 5001) {
                                        var3 -= 3;
                                        class185.field2764++;
                                        class185.field2767 = class221.field3217[var3];
                                        class134.field2197 = class221.field3217[var3 + 1];
                                        class152.field2407 = class221.field3217[var3 + 2];
                                        class144.field2338.method683(true, 234);
                                        class144.field2338.method360(class185.field2767, 25759);
                                        class144.field2338.method360(class134.field2197, 25759);
                                        class144.field2338.method360(class152.field2407, 25759);
                                        continue;
                                    }
                                    if (var526 == 5002) {
                                        class141.field2279++;
                                        var3 -= 2;
                                        var4--;
                                        String var120 = class214.field3145[var4];
                                        int var121 = class221.field3217[var3 + 1];
                                        int var122 = class221.field3217[var3];
                                        class144.field2338.method683(true, 90);
                                        class144.field2338.method382(902642416, class143.method1064((byte) -107, var120));
                                        class144.field2338.method360(var122 - 1, 25759);
                                        class144.field2338.method360(var121, 25759);
                                        continue;
                                    }
                                    if (var526 == 5003) {
                                        var3--;
                                        int var123 = class221.field3217[var3];
                                        String var124 = null;
                                        if (var123 < 100) {
                                            var124 = class267.field4267[var123];
                                        }
                                        if (var124 == null) {
                                            var124 = "";
                                        }
                                        class214.field3145[var4++] = var124;
                                        continue;
                                    }
                                    if (var526 == 5004) {
                                        var3--;
                                        int var125 = class221.field3217[var3];
                                        int var126 = -1;
                                        if (var125 < 100 && class267.field4267[var125] != null) {
                                            var126 = class202.field2977[var125];
                                        }
                                        class221.field3217[var3++] = var126;
                                        continue;
                                    }
                                    if (var526 == 5005) {
                                        class221.field3217[var3++] = class134.field2197;
                                        continue;
                                    }
                                    if (var526 == 5008) {
                                        var4--;
                                        String var127 = class214.field3145[var4];
                                        if (var127.startsWith("::")) {
                                            class279.method1937((byte) -12, var127);
                                            continue;
                                        }
                                        if (class228.field3349 == 0 && (class284.field4567 && !class291.field4630 || class124.field2080)) {
                                            continue;
                                        }
                                        class220.field3203++;
                                        String var128 = var127.toLowerCase();
                                        byte var129 = 0;
                                        byte var130 = 0;
                                        if (var128.startsWith(class115.field1912)) {
                                            var129 = 0;
                                            var127 = var127.substring(class115.field1912.length());
                                        } else if (var128.startsWith(class48.field672)) {
                                            var127 = var127.substring(class48.field672.length());
                                            var129 = 1;
                                        } else if (var128.startsWith(class113.field1871)) {
                                            var127 = var127.substring(class113.field1871.length());
                                            var129 = 2;
                                        } else if (var128.startsWith(class53.field773)) {
                                            var129 = 3;
                                            var127 = var127.substring(class53.field773.length());
                                        } else if (var128.startsWith(class258.field4004)) {
                                            var127 = var127.substring(class258.field4004.length());
                                            var129 = 4;
                                        } else if (var128.startsWith(class276.field4471)) {
                                            var127 = var127.substring(class276.field4471.length());
                                            var129 = 5;
                                        } else if (var128.startsWith(class123.field2041)) {
                                            var129 = 6;
                                            var127 = var127.substring(class123.field2041.length());
                                        } else if (var128.startsWith(class26.field292)) {
                                            var127 = var127.substring(class26.field292.length());
                                            var129 = 7;
                                        } else if (var128.startsWith(class209.field3094)) {
                                            var127 = var127.substring(class209.field3094.length());
                                            var129 = 8;
                                        } else if (var128.startsWith(class292.field4638)) {
                                            var129 = 9;
                                            var127 = var127.substring(class292.field4638.length());
                                        } else if (var128.startsWith(class110.field1835)) {
                                            var129 = 10;
                                            var127 = var127.substring(class110.field1835.length());
                                        } else if (var128.startsWith(class261.field4036)) {
                                            var127 = var127.substring(class261.field4036.length());
                                            var129 = 11;
                                        } else if (class87.field1385 != 0) {
                                            if (var128.startsWith(class65.field985)) {
                                                var129 = 0;
                                                var127 = var127.substring(class65.field985.length());
                                            } else if (var128.startsWith(class279.field4490)) {
                                                var129 = 1;
                                                var127 = var127.substring(class279.field4490.length());
                                            } else if (var128.startsWith(class276.field4467)) {
                                                var127 = var127.substring(class276.field4467.length());
                                                var129 = 2;
                                            } else if (var128.startsWith(client.field1982)) {
                                                var129 = 3;
                                                var127 = var127.substring(client.field1982.length());
                                            } else if (var128.startsWith(class45.field590)) {
                                                var129 = 4;
                                                var127 = var127.substring(class45.field590.length());
                                            } else if (var128.startsWith(class287.field4594)) {
                                                var129 = 5;
                                                var127 = var127.substring(class287.field4594.length());
                                            } else if (var128.startsWith(class236.field3456)) {
                                                var127 = var127.substring(class236.field3456.length());
                                                var129 = 6;
                                            } else if (var128.startsWith(class121.field2007)) {
                                                var129 = 7;
                                                var127 = var127.substring(class121.field2007.length());
                                            } else if (var128.startsWith(class213.field3137)) {
                                                var129 = 8;
                                                var127 = var127.substring(class213.field3137.length());
                                            } else if (var128.startsWith(class300.field4840)) {
                                                var129 = 9;
                                                var127 = var127.substring(class300.field4840.length());
                                            } else if (var128.startsWith(class231.field3392)) {
                                                var129 = 10;
                                                var127 = var127.substring(class231.field3392.length());
                                            } else if (var128.startsWith(class101.field1708)) {
                                                var127 = var127.substring(class101.field1708.length());
                                                var129 = 11;
                                            }
                                        }
                                        String var131 = var127.toLowerCase();
                                        if (var131.startsWith(class213.field3136)) {
                                            var127 = var127.substring(class213.field3136.length());
                                            var130 = 1;
                                        } else if (var131.startsWith(class299.field4810)) {
                                            var127 = var127.substring(class299.field4810.length());
                                            var130 = 2;
                                        } else if (var131.startsWith(class75.field1177)) {
                                            var127 = var127.substring(class75.field1177.length());
                                            var130 = 3;
                                        } else if (var131.startsWith(class159.field2478)) {
                                            var127 = var127.substring(class159.field2478.length());
                                            var130 = 4;
                                        } else if (var131.startsWith(class206.field3033)) {
                                            var127 = var127.substring(class206.field3033.length());
                                            var130 = 5;
                                        } else if (class87.field1385 != 0) {
                                            if (var131.startsWith(class230.field3376)) {
                                                var130 = 1;
                                                var127 = var127.substring(class230.field3376.length());
                                            } else if (var131.startsWith(class242.field3569)) {
                                                var130 = 2;
                                                var127 = var127.substring(class242.field3569.length());
                                            } else if (var131.startsWith(class220.field3215)) {
                                                var130 = 3;
                                                var127 = var127.substring(class220.field3215.length());
                                            } else if (var131.startsWith(class139.field2265)) {
                                                var127 = var127.substring(class139.field2265.length());
                                                var130 = 4;
                                            } else if (var131.startsWith(class219.field3194)) {
                                                var127 = var127.substring(class219.field3194.length());
                                                var130 = 5;
                                            }
                                        }
                                        class144.field2338.method683(true, 186);
                                        class144.field2338.method360(0, 25759);
                                        int var132 = class144.field2338.field735;
                                        class144.field2338.method360(var129, 25759);
                                        class144.field2338.method360(var130, 25759);
                                        class123.method945(var127, true, class144.field2338);
                                        class144.field2338.method355(class144.field2338.field735 - var132, 104);
                                        continue;
                                    }
                                    if (var526 == 5009) {
                                        var4 -= 2;
                                        String var133 = class214.field3145[var4];
                                        String var134 = class214.field3145[var4 + 1];
                                        if (class228.field3349 != 0 || (!class284.field4567 || class291.field4630) && !class124.field2080) {
                                            class235.field3434++;
                                            class144.field2338.method683(true, 157);
                                            class144.field2338.method360(0, 25759);
                                            int var135 = class144.field2338.field735;
                                            class144.field2338.method382(902642416, class143.method1064((byte) -107, var133));
                                            class123.method945(var134, true, class144.field2338);
                                            class144.field2338.method355(class144.field2338.field735 - var135, 116);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5010) {
                                        var3--;
                                        int var136 = class221.field3217[var3];
                                        String var137 = null;
                                        if (var136 < 100) {
                                            var137 = class65.field983[var136];
                                        }
                                        if (var137 == null) {
                                            var137 = "";
                                        }
                                        class214.field3145[var4++] = var137;
                                        continue;
                                    }
                                    if (var526 == 5011) {
                                        var3--;
                                        int var138 = class221.field3217[var3];
                                        String var139 = null;
                                        if (var138 < 100) {
                                            var139 = class188.field2793[var138];
                                        }
                                        if (var139 == null) {
                                            var139 = "";
                                        }
                                        class214.field3145[var4++] = var139;
                                        continue;
                                    }
                                    if (var526 == 5012) {
                                        var3--;
                                        int var140 = class221.field3217[var3];
                                        int var141 = -1;
                                        if (var140 < 100) {
                                            var141 = class208.field3087[var140];
                                        }
                                        class221.field3217[var3++] = var141;
                                        continue;
                                    }
                                    if (var526 == 5015) {
                                        String var142;
                                        if (class213.field3139 == null || class213.field3139.field3069 == null) {
                                            var142 = class161.field2491;
                                        } else {
                                            var142 = class213.field3139.method1469((byte) -4);
                                        }
                                        class214.field3145[var4++] = var142;
                                        continue;
                                    }
                                    if (var526 == 5016) {
                                        class221.field3217[var3++] = class152.field2407;
                                        continue;
                                    }
                                    if (var526 == 5017) {
                                        class221.field3217[var3++] = class237.field3466;
                                        continue;
                                    }
                                    if (var526 == 5050) {
                                        var3--;
                                        int var143 = class221.field3217[var3];
                                        class214.field3145[var4++] = class185.method1327((byte) -66, var143).field2387;
                                        continue;
                                    }
                                    if (var526 == 5051) {
                                        var3--;
                                        int var144 = class221.field3217[var3];
                                        class149 var145 = class185.method1327((byte) -75, var144);
                                        if (var145.field2386 == null) {
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var145.field2386.length;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5052) {
                                        var3 -= 2;
                                        int var146 = class221.field3217[var3];
                                        int var147 = class221.field3217[var3 + 1];
                                        class149 var148 = class185.method1327((byte) -115, var146);
                                        int var149 = var148.field2386[var147];
                                        class221.field3217[var3++] = var149;
                                        continue;
                                    }
                                    if (var526 == 5053) {
                                        var3--;
                                        int var150 = class221.field3217[var3];
                                        class149 var151 = class185.method1327((byte) -83, var150);
                                        if (var151.field2376 == null) {
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var151.field2376.length;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5054) {
                                        var3 -= 2;
                                        int var152 = class221.field3217[var3];
                                        int var153 = class221.field3217[var3 + 1];
                                        class221.field3217[var3++] = class185.method1327((byte) -58, var152).field2376[var153];
                                        continue;
                                    }
                                    if (var526 == 5055) {
                                        var3--;
                                        int var154 = class221.field3217[var3];
                                        class214.field3145[var4++] = class25.method169(var154, false).method698((byte) 66);
                                        continue;
                                    }
                                    if (var526 == 5056) {
                                        var3--;
                                        int var155 = class221.field3217[var3];
                                        class92 var156 = class25.method169(var155, false);
                                        if (var156.field1485 == null) {
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var156.field1485.length;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5057) {
                                        var3 -= 2;
                                        int var157 = class221.field3217[var3];
                                        int var158 = class221.field3217[var3 + 1];
                                        class221.field3217[var3++] = class25.method169(var157, false).field1485[var158];
                                        continue;
                                    }
                                    if (var526 == 5058) {
                                        class114.field1893 = new class249();
                                        var3--;
                                        class114.field1893.field3773 = class221.field3217[var3];
                                        class114.field1893.field3770 = class25.method169(class114.field1893.field3773, false);
                                        class114.field1893.field3769 = new int[class114.field1893.field3770.method702(0)];
                                        continue;
                                    }
                                    if (var526 == 5059) {
                                        class254.field3830++;
                                        class144.field2338.method683(true, 222);
                                        class144.field2338.method360(0, 25759);
                                        int var159 = class144.field2338.field735;
                                        class144.field2338.method360(0, 25759);
                                        class144.field2338.method376(class114.field1893.field3773, false);
                                        class114.field1893.field3770.method699(class144.field2338, false, class114.field1893.field3769);
                                        class144.field2338.method355(class144.field2338.field735 - var159, 93);
                                        continue;
                                    }
                                    if (var526 == 5060) {
                                        class91.field1455++;
                                        var4--;
                                        String var160 = class214.field3145[var4];
                                        class144.field2338.method683(true, 42);
                                        class144.field2338.method360(0, 25759);
                                        int var161 = class144.field2338.field735;
                                        class144.field2338.method382(902642416, class143.method1064((byte) -77, var160));
                                        class144.field2338.method376(class114.field1893.field3773, false);
                                        class114.field1893.field3770.method699(class144.field2338, false, class114.field1893.field3769);
                                        class144.field2338.method355(class144.field2338.field735 - var161, 110);
                                        continue;
                                    }
                                    if (var526 == 5061) {
                                        class144.field2338.method683(true, 222);
                                        class144.field2338.method360(0, 25759);
                                        class254.field3830++;
                                        int var162 = class144.field2338.field735;
                                        class144.field2338.method360(1, 25759);
                                        class144.field2338.method376(class114.field1893.field3773, false);
                                        class114.field1893.field3770.method699(class144.field2338, false, class114.field1893.field3769);
                                        class144.field2338.method355(class144.field2338.field735 - var162, 103);
                                        continue;
                                    }
                                    if (var526 == 5062) {
                                        var3 -= 2;
                                        int var163 = class221.field3217[var3];
                                        int var164 = class221.field3217[var3 + 1];
                                        class221.field3217[var3++] = class185.method1327((byte) -64, var163).field2383[var164];
                                        continue;
                                    }
                                    if (var526 == 5063) {
                                        var3 -= 2;
                                        int var165 = class221.field3217[var3];
                                        int var166 = class221.field3217[var3 + 1];
                                        class221.field3217[var3++] = class185.method1327((byte) -118, var165).field2382[var166];
                                        continue;
                                    }
                                    if (var526 == 5064) {
                                        var3 -= 2;
                                        int var167 = class221.field3217[var3];
                                        int var168 = class221.field3217[var3 + 1];
                                        if (var168 == -1) {
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            class221.field3217[var3++] = class185.method1327((byte) -100, var167).method1117((char) var168, (byte) 94);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5065) {
                                        var3 -= 2;
                                        int var169 = class221.field3217[var3];
                                        int var170 = class221.field3217[var3 + 1];
                                        if (var170 == -1) {
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            class221.field3217[var3++] = class185.method1327((byte) -100, var169).method1116(0, (char) var170);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5066) {
                                        var3--;
                                        int var171 = class221.field3217[var3];
                                        class221.field3217[var3++] = class25.method169(var171, false).method702(0);
                                        continue;
                                    }
                                    if (var526 == 5067) {
                                        var3 -= 2;
                                        int var172 = class221.field3217[var3];
                                        int var173 = class221.field3217[var3 + 1];
                                        int var174 = class25.method169(var172, false).method695(76, var173);
                                        class221.field3217[var3++] = var174;
                                        continue;
                                    }
                                    if (var526 == 5068) {
                                        var3 -= 2;
                                        int var175 = class221.field3217[var3];
                                        int var176 = class221.field3217[var3 + 1];
                                        class114.field1893.field3769[var175] = var176;
                                        continue;
                                    }
                                    if (var526 == 5069) {
                                        var3 -= 2;
                                        int var177 = class221.field3217[var3];
                                        int var178 = class221.field3217[var3 + 1];
                                        class114.field1893.field3769[var177] = var178;
                                        continue;
                                    }
                                    if (var526 == 5070) {
                                        var3 -= 3;
                                        int var179 = class221.field3217[var3];
                                        int var180 = class221.field3217[var3 + 1];
                                        int var181 = class221.field3217[var3 + 2];
                                        class92 var182 = class25.method169(var179, false);
                                        if (var182.method695(47, var180) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class221.field3217[var3++] = var182.method696(var181, var180, 0);
                                        continue;
                                    }
                                    if (var526 == 5071) {
                                        var4--;
                                        String var183 = class214.field3145[var4];
                                        var3--;
                                        boolean var184 = class221.field3217[var3] == 1;
                                        class208.method1473(-41, var184, var183);
                                        class221.field3217[var3++] = class289.field4617;
                                        continue;
                                    }
                                    if (var526 == 5072) {
                                        if (class45.field610 != null && class170.field2579 < class289.field4617) {
                                            class221.field3217[var3++] = class301.method2056(65535, class45.field610[class170.field2579++]);
                                            continue;
                                        }
                                        class221.field3217[var3++] = -1;
                                        continue;
                                    }
                                    if (var526 == 5073) {
                                        class170.field2579 = 0;
                                        continue;
                                    }
                                } else if (var526 < 5200) {
                                    if (var526 == 5100) {
                                        if (class82.field1326[86]) {
                                            class221.field3217[var3++] = 1;
                                        } else {
                                            class221.field3217[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5101) {
                                        if (class82.field1326[82]) {
                                            class221.field3217[var3++] = 1;
                                        } else {
                                            class221.field3217[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5102) {
                                        if (class82.field1326[81]) {
                                            class221.field3217[var3++] = 1;
                                        } else {
                                            class221.field3217[var3++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var526 < 5300) {
                                    if (var526 == 5200) {
                                        var3--;
                                        class69.method523(class221.field3217[var3], (byte) 122);
                                        continue;
                                    }
                                    if (var526 == 5201) {
                                        class221.field3217[var3++] = class251.method1733(37);
                                        continue;
                                    }
                                    if (var526 == 5205) {
                                        var3--;
                                        class281.method1942(true, class221.field3217[var3], -1, false, -1);
                                        continue;
                                    }
                                    if (var526 == 5206) {
                                        var3--;
                                        int var185 = class221.field3217[var3];
                                        class242 var186 = class46.method290((var185 & 0xFFFD293) >> 14, var185 & 0x3FFF);
                                        if (var186 == null) {
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            class221.field3217[var3++] = var186.field3562;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5207) {
                                        var3--;
                                        class242 var187 = class46.method289(class221.field3217[var3]);
                                        if (var187 != null && var187.field3560 != null) {
                                            class214.field3145[var4++] = var187.field3560;
                                            continue;
                                        }
                                        class214.field3145[var4++] = "";
                                        continue;
                                    }
                                    if (var526 == 5208) {
                                        class221.field3217[var3++] = class123.field2036;
                                        class221.field3217[var3++] = class119.field1927;
                                        continue;
                                    }
                                    if (var526 == 5209) {
                                        class221.field3217[var3++] = class46.field623 + class30.field319;
                                        class221.field3217[var3++] = class46.field620 + class46.field621 - class121.field1989 - 1;
                                        continue;
                                    }
                                    if (var526 == 5210) {
                                        var3--;
                                        int var188 = class221.field3217[var3];
                                        class242 var189 = class46.method289(var188);
                                        if (var189 == null) {
                                            class221.field3217[var3++] = 0;
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = class301.method2056(var189.field3553 >> 14, 16383);
                                            class221.field3217[var3++] = class301.method2056(16383, var189.field3553);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5211) {
                                        var3--;
                                        int var190 = class221.field3217[var3];
                                        class242 var191 = class46.method289(var190);
                                        if (var191 == null) {
                                            class221.field3217[var3++] = 0;
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var191.field3564 - var191.field3557;
                                            class221.field3217[var3++] = var191.field3561 - var191.field3544;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5212) {
                                        class159 var192 = class55.method393(false);
                                        if (var192 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            class221.field3217[var3++] = var192.field2466;
                                            int var193 = class46.field620 + class46.field621 - var192.field2469 - 1 | var192.field2476 - -class46.field623 << 14 | var192.field2473 << 28;
                                            class221.field3217[var3++] = var193;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5213) {
                                        class159 var194 = class249.method1716((byte) -82);
                                        if (var194 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            class221.field3217[var3++] = var194.field2466;
                                            int var195 = class46.field620 + class46.field621 - var194.field2469 - 1 | class46.field623 + var194.field2476 << 14 | var194.field2473 << 28;
                                            class221.field3217[var3++] = var195;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5214) {
                                        var3--;
                                        int var196 = class221.field3217[var3];
                                        class242 var197 = class121.method921(true);
                                        if (var197 != null) {
                                            boolean var198 = var197.method1656((byte) 76, var196 & 0x3FFF, var196 >> 28 & 0x3, (var196 & 0xFFFDD8B) >> 14, class82.field1323);
                                            if (var198) {
                                                class277.method1923(class82.field1323[1], class82.field1323[2], 103);
                                            }
                                        }
                                        continue;
                                    }
                                    if (var526 == 5215) {
                                        var3 -= 2;
                                        int var199 = class221.field3217[var3];
                                        int var200 = class221.field3217[var3 + 1];
                                        boolean var201 = false;
                                        class205 var202 = class46.method286((var199 & 0xFFFE043) >> 14, var199 & 0x3FFF);
                                        for (class242 var203 = (class242) var202.method1450(false); var203 != null; var203 = (class242) var202.method1448(false)) {
                                            if (var203.field3562 == var200) {
                                                var201 = true;
                                                break;
                                            }
                                        }
                                        if (var201) {
                                            class221.field3217[var3++] = 1;
                                        } else {
                                            class221.field3217[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5218) {
                                        var3--;
                                        int var204 = class221.field3217[var3];
                                        class242 var205 = class46.method289(var204);
                                        if (var205 == null) {
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            class221.field3217[var3++] = var205.field3550;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5220) {
                                        class221.field3217[var3++] = class89.field1439 == 100 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 5221) {
                                        var3--;
                                        int var206 = class221.field3217[var3];
                                        class277.method1923((var206 & 0xFFFED3C) >> 14, var206 & 0x3FFF, 94);
                                        continue;
                                    }
                                    if (var526 == 5222) {
                                        class242 var207 = class121.method921(true);
                                        if (var207 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            boolean var208 = var207.method1658(class46.field623 + class30.field319, -class121.field1989 + class46.field620 + class46.field621 - 1, 7, class82.field1323);
                                            if (var208) {
                                                class221.field3217[var3++] = class82.field1323[1];
                                                class221.field3217[var3++] = class82.field1323[2];
                                            } else {
                                                class221.field3217[var3++] = -1;
                                                class221.field3217[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var526 == 5223) {
                                        var3 -= 2;
                                        int var209 = class221.field3217[var3];
                                        int var210 = class221.field3217[var3 + 1];
                                        class281.method1942(true, var209, var210 >> 14 & 0x3FFF, false, var210 & 0x3FFF);
                                        continue;
                                    }
                                    if (var526 == 5224) {
                                        var3--;
                                        int var211 = class221.field3217[var3];
                                        class242 var212 = class121.method921(true);
                                        if (var212 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            boolean var213 = var212.method1656((byte) 89, var211 & 0x3FFF, (var211 & 0x3A75E4AC) >> 28, (var211 & 0xFFFC6D0) >> 14, class82.field1323);
                                            if (var213) {
                                                class221.field3217[var3++] = class82.field1323[1];
                                                class221.field3217[var3++] = class82.field1323[2];
                                            } else {
                                                class221.field3217[var3++] = -1;
                                                class221.field3217[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var526 == 5225) {
                                        var3--;
                                        int var214 = class221.field3217[var3];
                                        class242 var215 = class121.method921(true);
                                        if (var215 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = -1;
                                        } else {
                                            boolean var216 = var215.method1658((var214 & 0xFFFF6C5) >> 14, var214 & 0x3FFF, 7, class82.field1323);
                                            if (var216) {
                                                class221.field3217[var3++] = class82.field1323[1];
                                                class221.field3217[var3++] = class82.field1323[2];
                                            } else {
                                                class221.field3217[var3++] = -1;
                                                class221.field3217[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var526 == 5226) {
                                        var3--;
                                        class281.method1947(class221.field3217[var3], 2);
                                        continue;
                                    }
                                    if (var526 == 5227) {
                                        var3 -= 2;
                                        int var217 = class221.field3217[var3];
                                        int var218 = class221.field3217[var3 + 1];
                                        class281.method1942(true, var217, (var218 & 0xFFFEF56) >> 14, true, var218 & 0x3FFF);
                                        continue;
                                    }
                                    if (var526 == 5228) {
                                        var3--;
                                        class214.field3152 = class221.field3217[var3] == 1;
                                        continue;
                                    }
                                    if (var526 == 5229) {
                                        class221.field3217[var3++] = class214.field3152 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 5230) {
                                        var3--;
                                        int var219 = class221.field3217[var3];
                                        class5.method25(3, var219);
                                        continue;
                                    }
                                    if (var526 == 5231) {
                                        var3 -= 2;
                                        int var220 = class221.field3217[var3];
                                        boolean var221 = class221.field3217[var3 + 1] == 1;
                                        if (class312.field4998 == null) {
                                            continue;
                                        }
                                        class259 var222 = class312.field4998.method1073(-1, (long) var220);
                                        if (var222 != null && !var221) {
                                            var222.method1781(5250);
                                            continue;
                                        }
                                        if (var222 == null && var221) {
                                            class259 var223 = new class259();
                                            class312.field4998.method1074((byte) 39, var223, (long) var220);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5232) {
                                        var3--;
                                        int var224 = class221.field3217[var3];
                                        if (class312.field4998 == null) {
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class259 var225 = class312.field4998.method1073(-1, (long) var224);
                                            class221.field3217[var3++] = var225 == null ? 0 : 1;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5233) {
                                        var3 -= 2;
                                        int var226 = class221.field3217[var3];
                                        boolean var227 = class221.field3217[var3 + 1] == 1;
                                        if (class171.field2584 == null) {
                                            continue;
                                        }
                                        class259 var228 = class171.field2584.method1073(-1, (long) var226);
                                        if (var228 != null && !var227) {
                                            var228.method1781(5250);
                                            continue;
                                        }
                                        if (var228 == null && var227) {
                                            class259 var229 = new class259();
                                            class171.field2584.method1074((byte) 39, var229, (long) var226);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5234) {
                                        var3--;
                                        int var230 = class221.field3217[var3];
                                        if (class171.field2584 == null) {
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class259 var231 = class171.field2584.method1073(-1, (long) var230);
                                            class221.field3217[var3++] = var231 == null ? 0 : 1;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5235) {
                                        class221.field3217[var3++] = class46.field628 == null ? -1 : class46.field628.field3562;
                                        continue;
                                    }
                                } else if (var526 < 5400) {
                                    if (var526 == 5300) {
                                        var3 -= 2;
                                        class221.field3217[var3++] = 0;
                                        continue;
                                    }
                                    if (var526 == 5301) {
                                        continue;
                                    }
                                    if (var526 == 5302) {
                                        class221.field3217[var3++] = 0;
                                        continue;
                                    }
                                    if (var526 == 5303) {
                                        var3--;
                                        class221.field3217[var3++] = 0;
                                        class221.field3217[var3++] = 0;
                                        continue;
                                    }
                                    if (var526 == 5305) {
                                        byte var304 = -1;
                                        class221.field3217[var3++] = var304;
                                        continue;
                                    }
                                    if (var526 == 5306) {
                                        class221.field3217[var3++] = class227.method1570(35);
                                        continue;
                                    }
                                    if (var526 == 5307) {
                                        var3--;
                                        int var305 = class221.field3217[var3];
                                        if (var305 < 0 || var305 > 2) {
                                            var305 = 0;
                                        }
                                        class33.method212(-1, -1, var305, false, 0);
                                        continue;
                                    }
                                    if (var526 == 5308) {
                                        class221.field3217[var3++] = class64.field969;
                                        continue;
                                    }
                                    if (var526 == 5309) {
                                        var3--;
                                        int var306 = class221.field3217[var3];
                                        if (var306 < 0 || var306 > 2) {
                                            var306 = 0;
                                        }
                                        class64.field969 = var306;
                                        class89.method667(1, class273.field4426);
                                        continue;
                                    }
                                } else if (var526 < 5500) {
                                    if (var526 == 5400) {
                                        var3--;
                                        int var232 = class221.field3217[var3];
                                        class138.field2242++;
                                        var4 -= 2;
                                        String var233 = class214.field3145[var4];
                                        String var234 = class214.field3145[var4 + 1];
                                        class144.field2338.method683(true, 243);
                                        class144.field2338.method360(class261.method1792(var233, -126) + class261.method1792(var234, -127) + 1, 25759);
                                        class144.field2338.method338(var233, 1970);
                                        class144.field2338.method338(var234, 1970);
                                        class144.field2338.method360(var232, 25759);
                                        continue;
                                    }
                                    if (var526 == 5401) {
                                        var3 -= 2;
                                        class274.field4444[class221.field3217[var3]] = (short) class240.method1643(117, class221.field3217[var3 + 1]);
                                        class103.method807((byte) -117);
                                        class309.method2089((byte) -109);
                                        class217.method1519((byte) -123);
                                        class19.method132(true);
                                        class172.method1216(-101);
                                        continue;
                                    }
                                    if (var526 == 5405) {
                                        var3 -= 2;
                                        int var235 = class221.field3217[var3 + 1];
                                        int var236 = class221.field3217[var3];
                                        if (var236 >= 0 && var236 < 2) {
                                            class226.field3319[var236] = new int[var235 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var526 == 5406) {
                                        var3 -= 7;
                                        int var237 = class221.field3217[var3];
                                        int var238 = class221.field3217[var3 + 2];
                                        int var239 = class221.field3217[var3 + 1] << 1;
                                        int var240 = class221.field3217[var3 + 3];
                                        int var241 = class221.field3217[var3 + 4];
                                        int var242 = class221.field3217[var3 + 5];
                                        int var243 = class221.field3217[var3 + 6];
                                        if (var237 >= 0 && var237 < 2 && class226.field3319[var237] != null && var239 >= 0 && class226.field3319[var237].length > var239) {
                                            class226.field3319[var237][var239] = new int[] { class301.method2056(var238 >> 14, 16383) * 128, var240, class301.method2056(16383, var238) * 128, var243 };
                                            class226.field3319[var237][var239 + 1] = new int[] { class301.method2056(var241 >> 14, 16383) * 128, var242, class301.method2056(16383, var241) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var526 == 5407) {
                                        var3--;
                                        int var244 = class226.field3319[class221.field3217[var3]].length >> 1;
                                        class221.field3217[var3++] = var244;
                                        continue;
                                    }
                                    if (var526 == 5411) {
                                        if (class195.field2881 == null) {
                                            class218.method1520(class246.method1696(false), 16, false);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5419) {
                                        String var245 = "";
                                        if (class65.field981 != null) {
                                            if (class65.field981.field932 == null) {
                                                var245 = class17.method119(-123, class65.field981.field934);
                                            } else {
                                                var245 = (String) class65.field981.field932;
                                            }
                                        }
                                        class214.field3145[var4++] = var245;
                                        continue;
                                    }
                                    if (var526 == 5420) {
                                        class221.field3217[var3++] = class122.field2024 == 3 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 5421) {
                                        var4--;
                                        String var246 = class214.field3145[var4];
                                        var3--;
                                        boolean var247 = class221.field3217[var3] == 1;
                                        String var248 = class246.method1696(false) + var246;
                                        if (class195.field2881 == null && (!var247 || class122.field2024 == 3 || !class122.field2011.startsWith("win") || class186.field2774)) {
                                            class218.method1520(var248, 16, var247);
                                            continue;
                                        }
                                        class75.field1178 = var248;
                                        class256.field3875 = var247;
                                        class5.field48 = class273.field4426.method929(true, var248);
                                        continue;
                                    }
                                    if (var526 == 5422) {
                                        var4 -= 2;
                                        String var249 = class214.field3145[var4 + 1];
                                        String var250 = class214.field3145[var4];
                                        var3--;
                                        int var251 = class221.field3217[var3];
                                        if (var250.length() > 0) {
                                            if (class91.field1470 == null) {
                                                class91.field1470 = new String[class308.field4957[class121.field1986]];
                                            }
                                            class91.field1470[var251] = var250;
                                        }
                                        if (var249.length() > 0) {
                                            if (class243.field3572 == null) {
                                                class243.field3572 = new String[class308.field4957[class121.field1986]];
                                            }
                                            class243.field3572[var251] = var249;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5423) {
                                        var4--;
                                        System.out.println(class214.field3145[var4]);
                                        continue;
                                    }
                                    if (var526 == 5424) {
                                        var3 -= 11;
                                        class43.field568 = class221.field3217[var3];
                                        class89.field1436 = class221.field3217[var3 + 1];
                                        class296.field4760 = class221.field3217[var3 + 2];
                                        class138.field2243 = class221.field3217[var3 + 3];
                                        class106.field1810 = class221.field3217[var3 + 4];
                                        class299.field4826 = class221.field3217[var3 + 5];
                                        class102.field1771 = class221.field3217[var3 + 6];
                                        class125.field2120 = class221.field3217[var3 + 7];
                                        class242.field3549 = class221.field3217[var3 + 8];
                                        class44.field575 = class221.field3217[var3 + 9];
                                        class301.field4880 = class221.field3217[var3 + 10];
                                        class191.field2827.method1885(2, class106.field1810);
                                        class191.field2827.method1885(2, class299.field4826);
                                        class191.field2827.method1885(2, class102.field1771);
                                        class191.field2827.method1885(2, class125.field2120);
                                        class191.field2827.method1885(2, class242.field3549);
                                        class247.field3655 = true;
                                        continue;
                                    }
                                    if (var526 == 5425) {
                                        class52.method313(120);
                                        class247.field3655 = false;
                                        continue;
                                    }
                                    if (var526 == 5426) {
                                        var3--;
                                        class298.field4792 = class221.field3217[var3];
                                        continue;
                                    }
                                    if (var526 == 5427) {
                                        var3 -= 2;
                                        class298.field4788 = class221.field3217[var3];
                                        class74.field1176 = class221.field3217[var3 + 1];
                                        continue;
                                    }
                                    if (var526 == 5428) {
                                        var3 -= 2;
                                        int var252 = class221.field3217[var3];
                                        int var253 = class221.field3217[var3 + 1];
                                        class221.field3217[var3++] = class297.method2018((byte) 117, var253, var252) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var526 < 5600) {
                                    if (var526 == 5500) {
                                        var3 -= 4;
                                        int var254 = class221.field3217[var3 + 2];
                                        int var255 = class221.field3217[var3];
                                        int var256 = class221.field3217[var3 + 1];
                                        int var257 = class221.field3217[var3 + 3];
                                        class48.method296((byte) -47, var256, (var255 & 0x3FFF) - class149.field2390, false, ((var255 & 0xFFFE8F3) >> 14) - class163.field2520, var257, var254);
                                        continue;
                                    }
                                    if (var526 == 5501) {
                                        var3 -= 4;
                                        int var258 = class221.field3217[var3 + 2];
                                        int var259 = class221.field3217[var3];
                                        int var260 = class221.field3217[var3 + 3];
                                        int var261 = class221.field3217[var3 + 1];
                                        class110.method842(var261, var258, ((var259 & 0xFFFD5A3) >> 14) - class163.field2520, 2047, var260, (var259 & 0x3FFF) - class149.field2390);
                                        continue;
                                    }
                                    if (var526 == 5502) {
                                        var3 -= 6;
                                        int var262 = class221.field3217[var3];
                                        if (var262 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class268.field4304 = var262;
                                        int var263 = class221.field3217[var3 + 1];
                                        if (var263 + 1 >= class226.field3319[class268.field4304].length >> 1) {
                                            throw new RuntimeException();
                                        }
                                        class124.field2051 = 0;
                                        class287.field4606 = var263;
                                        class192.field2836 = class221.field3217[var3 + 2];
                                        class179.field2680 = class221.field3217[var3 + 3];
                                        int var264 = class221.field3217[var3 + 4];
                                        if (var264 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class182.field2732 = var264;
                                        int var265 = class221.field3217[var3 + 5];
                                        if ((var265 + 1) >= (class226.field3319[class182.field2732].length >> 1)) {
                                            throw new RuntimeException();
                                        }
                                        class192.field2843 = var265;
                                        class119.field1931 = 3;
                                        continue;
                                    }
                                    if (var526 == 5503) {
                                        class63.method480(false);
                                        continue;
                                    }
                                    if (var526 == 5504) {
                                        var3 -= 2;
                                        class76.method569(class221.field3217[var3 + 1], class221.field3217[var3], 109);
                                        continue;
                                    }
                                    if (var526 == 5505) {
                                        class221.field3217[var3++] = (int) class180.field2705;
                                        continue;
                                    }
                                    if (var526 == 5506) {
                                        class221.field3217[var3++] = (int) class102.field1736;
                                        continue;
                                    }
                                    if (var526 == 5507) {
                                        class293.method1993((byte) -74);
                                        continue;
                                    }
                                    if (var526 == 5508) {
                                        class94.method725(21988);
                                        continue;
                                    }
                                    if (var526 == 5509) {
                                        class268.method1854((byte) 78);
                                        continue;
                                    }
                                    if (var526 == 5510) {
                                        class138.method1044(true);
                                        continue;
                                    }
                                    if (var526 == 5512) {
                                        class147.method1091(8263);
                                        continue;
                                    }
                                } else if (var526 < 5700) {
                                    if (var526 == 5600) {
                                        var4 -= 2;
                                        String var266 = class214.field3145[var4];
                                        String var267 = class214.field3145[var4 + 1];
                                        var3--;
                                        int var268 = class221.field3217[var3];
                                        if (class98.field1677 == 10 && class32.field403 == 0 && class126.field2127 == 0 && class291.field4629 == 0 && class267.field4265 == 0) {
                                            class19.method134(255, var268, var267, var266);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5601) {
                                        class172.method1229(12);
                                        continue;
                                    }
                                    if (var526 == 5602) {
                                        if (class126.field2127 == 0) {
                                            class256.field3878 = -2;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5603) {
                                        var3 -= 4;
                                        if (class98.field1677 == 10 && class32.field403 == 0 && class126.field2127 == 0 && class291.field4629 == 0 && class267.field4265 == 0) {
                                            class87.method649(class221.field3217[var3 + 3], class221.field3217[var3 + 1], class221.field3217[var3 + 2], -126, class221.field3217[var3]);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5604) {
                                        var4--;
                                        if (class98.field1677 == 10 && class32.field403 == 0 && class126.field2127 == 0 && class291.field4629 == 0 && class267.field4265 == 0) {
                                            class313.method2107(class143.method1064((byte) -119, class214.field3145[var4]), 112);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5605) {
                                        var3 -= 7;
                                        var4 -= 3;
                                        if (class98.field1677 == 10 && class32.field403 == 0 && class126.field2127 == 0 && class291.field4629 == 0 && class267.field4265 == 0) {
                                            class120.method897(class214.field3145[var4 + 1], class214.field3145[var4 + 2], class143.method1064((byte) -74, class214.field3145[var4]), (byte) -127, class221.field3217[var3 + 1], class221.field3217[var3 + 6] == 1, class221.field3217[var3 + 5] == 1, class221.field3217[var3], class221.field3217[var3 + 4] == 1, class221.field3217[var3 + 3], class221.field3217[var3 + 2]);
                                        }
                                        continue;
                                    }
                                    if (var526 == 5606) {
                                        if (class291.field4629 == 0) {
                                            class145.field2347 = -2;
                                        }
                                        continue;
                                    }
                                    if (var526 == 5607) {
                                        class221.field3217[var3++] = class256.field3878;
                                        continue;
                                    }
                                    if (var526 == 5608) {
                                        class221.field3217[var3++] = class222.field3260;
                                        continue;
                                    }
                                    if (var526 == 5609) {
                                        class221.field3217[var3++] = class145.field2347;
                                        continue;
                                    }
                                    if (var526 == 5610) {
                                        for (int var269 = 0; var269 < 5; var269++) {
                                            class214.field3145[var4++] = class209.field3097.length <= var269 ? "" : class85.method633((byte) 27, class209.field3097[var269]);
                                        }
                                        class209.field3097 = null;
                                        continue;
                                    }
                                    if (var526 == 5611) {
                                        class221.field3217[var3++] = class308.field4956;
                                        continue;
                                    }
                                } else if (var526 < 6100) {
                                    if (var526 == 6001) {
                                        var3--;
                                        int var270 = class221.field3217[var3];
                                        if (var270 < 1) {
                                            var270 = 1;
                                        }
                                        if (var270 > 4) {
                                            var270 = 4;
                                        }
                                        class240.field3525 = var270;
                                        if (class240.field3525 == 1) {
                                            class244.method1676(0.9F);
                                        }
                                        if (class240.field3525 == 2) {
                                            class244.method1676(0.8F);
                                        }
                                        if (class240.field3525 == 3) {
                                            class244.method1676(0.7F);
                                        }
                                        if (class240.field3525 == 4) {
                                            class244.method1676(0.6F);
                                        }
                                        class309.method2089((byte) -73);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6002) {
                                        var3--;
                                        class267.method1834(-31477, ~class221.field3217[var3] == -2);
                                        class44.method266(false);
                                        class284.method1955(25);
                                        class297.method2019((byte) 102);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6003) {
                                        var3--;
                                        class51.field705 = class221.field3217[var3] == 1;
                                        class297.method2019((byte) 120);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6005) {
                                        var3--;
                                        class225.field3308 = class221.field3217[var3] == 1;
                                        class284.method1955(25);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6006) {
                                        var3--;
                                        class56.field817 = class221.field3217[var3] == 1;
                                        ((class274) class244.field3600).method1909(false, !class56.field817);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6007) {
                                        var3--;
                                        class207.field3054 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6008) {
                                        var3--;
                                        class229.field3368 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6009) {
                                        var3--;
                                        class69.field1112 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6010) {
                                        var3--;
                                        class22.field247 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6011) {
                                        var3--;
                                        int var271 = class221.field3217[var3];
                                        if (var271 < 0 || var271 > 2) {
                                            var271 = 0;
                                        }
                                        class74.field1173 = var271;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6012) {
                                        var3--;
                                        class47.field658 = class221.field3217[var3] == 1;
                                        if (class240.field3525 == 1) {
                                            class244.method1676(0.9F);
                                        }
                                        if (class240.field3525 == 2) {
                                            class244.method1676(0.8F);
                                        }
                                        if (class240.field3525 == 3) {
                                            class244.method1676(0.7F);
                                        }
                                        if (class240.field3525 == 4) {
                                            class244.method1676(0.6F);
                                        }
                                        class284.method1955(25);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6014) {
                                        var3--;
                                        class294.field4688 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6015) {
                                        var3--;
                                        class243.field3577 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6016) {
                                        var3--;
                                        int var272 = class221.field3217[var3];
                                        if (var272 < 0 || var272 > 2) {
                                            var272 = 0;
                                        }
                                        class146.field2351 = var272;
                                        continue;
                                    }
                                    if (var526 == 6017) {
                                        var3--;
                                        class281.field4536 = class221.field3217[var3] == 1;
                                        class146.method1087(false);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6018) {
                                        var3--;
                                        int var273 = class221.field3217[var3];
                                        if (var273 < 0) {
                                            var273 = 0;
                                        }
                                        if (var273 > 127) {
                                            var273 = 127;
                                        }
                                        class208.field3085 = var273;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6019) {
                                        var3--;
                                        int var274 = class221.field3217[var3];
                                        if (var274 < 0) {
                                            var274 = 0;
                                        }
                                        if (var274 > 255) {
                                            var274 = 255;
                                        }
                                        if (class99.field1688 != var274) {
                                            if (class99.field1688 == 0 && class48.field667 != -1) {
                                                class120.method889(class300.field4850, class48.field667, false, 0, (byte) -85, var274);
                                                class101.field1710 = false;
                                            } else if (var274 == 0) {
                                                class152.method1124((byte) 127);
                                                class101.field1710 = false;
                                            } else {
                                                class71.method534(var274, 13672);
                                            }
                                            class99.field1688 = var274;
                                        }
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6020) {
                                        var3--;
                                        int var275 = class221.field3217[var3];
                                        if (var275 < 0) {
                                            var275 = 0;
                                        }
                                        if (var275 > 127) {
                                            var275 = 127;
                                        }
                                        class171.field2582 = var275;
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        continue;
                                    }
                                    if (var526 == 6021) {
                                        var3--;
                                        class108.field1829 = class221.field3217[var3] == 1;
                                        class297.method2019((byte) 99);
                                        continue;
                                    }
                                    if (var526 == 6023) {
                                        var3--;
                                        int var276 = class221.field3217[var3];
                                        boolean var277 = false;
                                        if (var276 < 0) {
                                            var276 = 0;
                                        }
                                        if (var276 > 2) {
                                            var276 = 2;
                                        }
                                        if (class246.field3634 < 96) {
                                            var277 = true;
                                            var276 = 0;
                                        }
                                        class88.method656(var276);
                                        class89.method667(1, class273.field4426);
                                        class145.field2344 = false;
                                        class221.field3217[var3++] = var277 ? 0 : 1;
                                        continue;
                                    }
                                    if (var526 == 6024) {
                                        var3--;
                                        int var278 = class221.field3217[var3];
                                        if (var278 < 0 || var278 > 2) {
                                            var278 = 0;
                                        }
                                        class77.field1218 = var278;
                                        class89.method667(1, class273.field4426);
                                        continue;
                                    }
                                    if (var526 == 6027) {
                                        var3--;
                                        continue;
                                    }
                                    if (var526 == 6028) {
                                        var3--;
                                        class32.field398 = class221.field3217[var3] != 0;
                                        class89.method667(1, class273.field4426);
                                        continue;
                                    }
                                } else if (var526 < 6200) {
                                    if (var526 == 6101) {
                                        class221.field3217[var3++] = class240.field3525;
                                        continue;
                                    }
                                    if (var526 == 6102) {
                                        class221.field3217[var3++] = class273.method1903(100) ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6103) {
                                        class221.field3217[var3++] = class51.field705 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6105) {
                                        class221.field3217[var3++] = class225.field3308 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6106) {
                                        class221.field3217[var3++] = class56.field817 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6107) {
                                        class221.field3217[var3++] = class207.field3054 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6108) {
                                        class221.field3217[var3++] = class229.field3368 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6109) {
                                        class221.field3217[var3++] = class69.field1112 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6110) {
                                        class221.field3217[var3++] = class22.field247 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6111) {
                                        class221.field3217[var3++] = class74.field1173;
                                        continue;
                                    }
                                    if (var526 == 6112) {
                                        class221.field3217[var3++] = class47.field658 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6114) {
                                        class221.field3217[var3++] = class294.field4688 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6115) {
                                        class221.field3217[var3++] = class243.field3577 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6116) {
                                        class221.field3217[var3++] = class146.field2351;
                                        continue;
                                    }
                                    if (var526 == 6117) {
                                        class221.field3217[var3++] = class281.field4536 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6118) {
                                        class221.field3217[var3++] = class208.field3085;
                                        continue;
                                    }
                                    if (var526 == 6119) {
                                        class221.field3217[var3++] = class99.field1688;
                                        continue;
                                    }
                                    if (var526 == 6120) {
                                        class221.field3217[var3++] = class171.field2582;
                                        continue;
                                    }
                                    if (var526 == 6121) {
                                        class221.field3217[var3++] = 0;
                                        continue;
                                    }
                                    if (var526 == 6123) {
                                        class221.field3217[var3++] = class88.method664();
                                        continue;
                                    }
                                    if (var526 == 6124) {
                                        class221.field3217[var3++] = class77.field1218;
                                        continue;
                                    }
                                    if (var526 == 6126) {
                                        class221.field3217[var3++] = 0;
                                        continue;
                                    }
                                    if (var526 == 6127) {
                                        class221.field3217[var3++] = class306.field4942 ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6128) {
                                        class221.field3217[var3++] = class32.field398 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var526 < 6300) {
                                    if (var526 == 6200) {
                                        var3 -= 2;
                                        class124.field2085 = (short) class221.field3217[var3];
                                        if (class124.field2085 <= 0) {
                                            class124.field2085 = 256;
                                        }
                                        class69.field1104 = (short) class221.field3217[var3 + 1];
                                        if (class69.field1104 <= 0) {
                                            class69.field1104 = 205;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6201) {
                                        var3 -= 2;
                                        class66.field1025 = (short) class221.field3217[var3];
                                        if (class66.field1025 <= 0) {
                                            class66.field1025 = 256;
                                        }
                                        class91.field1458 = (short) class221.field3217[var3 + 1];
                                        if (class91.field1458 <= 0) {
                                            class91.field1458 = 320;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6202) {
                                        var3 -= 4;
                                        class92.field1491 = (short) class221.field3217[var3];
                                        if (class92.field1491 <= 0) {
                                            class92.field1491 = 1;
                                        }
                                        class246.field3636 = (short) class221.field3217[var3 + 1];
                                        if (class246.field3636 <= 0) {
                                            class246.field3636 = 32767;
                                        } else if (class92.field1491 > class246.field3636) {
                                            class246.field3636 = class92.field1491;
                                        }
                                        class138.field2251 = (short) class221.field3217[var3 + 2];
                                        if (class138.field2251 <= 0) {
                                            class138.field2251 = 1;
                                        }
                                        class235.field3432 = (short) class221.field3217[var3 + 3];
                                        if (class235.field3432 <= 0) {
                                            class235.field3432 = 32767;
                                        } else if (class235.field3432 < class138.field2251) {
                                            class235.field3432 = class138.field2251;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6203) {
                                        class182.method1282((byte) -51, class135.field2203.field4046, 0, class135.field2203.field4215, 0, false);
                                        class221.field3217[var3++] = class126.field2129;
                                        class221.field3217[var3++] = class199.field2936;
                                        continue;
                                    }
                                    if (var526 == 6204) {
                                        class221.field3217[var3++] = class66.field1025;
                                        class221.field3217[var3++] = class91.field1458;
                                        continue;
                                    }
                                    if (var526 == 6205) {
                                        class221.field3217[var3++] = class124.field2085;
                                        class221.field3217[var3++] = class69.field1104;
                                        continue;
                                    }
                                } else if (var526 < 6400) {
                                    if (var526 == 6300) {
                                        class221.field3217[var3++] = (int) (class3.method14(29853) / 60000L);
                                        continue;
                                    }
                                    if (var526 == 6301) {
                                        class221.field3217[var3++] = (int) (class3.method14(29853) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var526 == 6302) {
                                        var3 -= 3;
                                        int var279 = class221.field3217[var3];
                                        int var280 = class221.field3217[var3 + 1];
                                        int var281 = class221.field3217[var3 + 2];
                                        class51.field697.clear();
                                        class51.field697.set(11, 12);
                                        class51.field697.set(var281, var280, var279);
                                        class221.field3217[var3++] = (int) (class51.field697.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var526 == 6303) {
                                        class51.field697.clear();
                                        class51.field697.setTime(new Date(class3.method14(29853)));
                                        class221.field3217[var3++] = class51.field697.get(1);
                                        continue;
                                    }
                                    if (var526 == 6304) {
                                        var3--;
                                        int var282 = class221.field3217[var3];
                                        boolean var283 = true;
                                        if (var282 < 0) {
                                            var283 = (var282 + 1) % 4 == 0;
                                        } else if (var282 < 1582) {
                                            var283 = (var282 % 4) == 0;
                                        } else if ((var282 % 4) != 0) {
                                            var283 = false;
                                        } else if ((var282 % 100) != 0) {
                                            var283 = true;
                                        } else if (var282 % 400 != 0) {
                                            var283 = false;
                                        }
                                        class221.field3217[var3++] = var283 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var526 < 6500) {
                                    if (var526 == 6405) {
                                        class221.field3217[var3++] = class183.method1286(false) ? 1 : 0;
                                        continue;
                                    }
                                    if (var526 == 6406) {
                                        class221.field3217[var3++] = class202.method1429(21917) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var526 < 6600) {
                                    if (var526 == 6500) {
                                        if (class98.field1677 == 10 && class32.field403 == 0 && class126.field2127 == 0 && class291.field4629 == 0) {
                                            class221.field3217[var3++] = class162.method1175((byte) 117) == -1 ? 0 : 1;
                                            continue;
                                        }
                                        class221.field3217[var3++] = 1;
                                        continue;
                                    }
                                    if (var526 == 6501) {
                                        class229 var292 = class41.method255(8889);
                                        if (var292 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = 0;
                                            class214.field3145[var4++] = "";
                                            class221.field3217[var3++] = 0;
                                            class214.field3145[var4++] = "";
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var292.field3365;
                                            class221.field3217[var3++] = var292.field1687;
                                            class214.field3145[var4++] = var292.field3367;
                                            class277 var293 = var292.method1593(115);
                                            class221.field3217[var3++] = var293.field4482;
                                            class214.field3145[var4++] = var293.field4481;
                                            class221.field3217[var3++] = var292.field1679;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6502) {
                                        class229 var294 = class43.method265(0);
                                        if (var294 == null) {
                                            class221.field3217[var3++] = -1;
                                            class221.field3217[var3++] = 0;
                                            class214.field3145[var4++] = "";
                                            class221.field3217[var3++] = 0;
                                            class214.field3145[var4++] = "";
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var294.field3365;
                                            class221.field3217[var3++] = var294.field1687;
                                            class214.field3145[var4++] = var294.field3367;
                                            class277 var295 = var294.method1593(124);
                                            class221.field3217[var3++] = var295.field4482;
                                            class214.field3145[var4++] = var295.field4481;
                                            class221.field3217[var3++] = var294.field1679;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6503) {
                                        var3--;
                                        int var296 = class221.field3217[var3];
                                        if (class98.field1677 == 10 && class32.field403 == 0 && class126.field2127 == 0 && class291.field4629 == 0) {
                                            class221.field3217[var3++] = class276.method1919(var296, (byte) 118) ? 1 : 0;
                                            continue;
                                        }
                                        class221.field3217[var3++] = 0;
                                        continue;
                                    }
                                    if (var526 == 6504) {
                                        var3--;
                                        class210.field3109 = class221.field3217[var3];
                                        class89.method667(1, class273.field4426);
                                        continue;
                                    }
                                    if (var526 == 6505) {
                                        class221.field3217[var3++] = class210.field3109;
                                        continue;
                                    }
                                    if (var526 == 6506) {
                                        var3--;
                                        int var297 = class221.field3217[var3];
                                        class229 var298 = class22.method154(var297, false);
                                        if (var298 == null) {
                                            class221.field3217[var3++] = -1;
                                            class214.field3145[var4++] = "";
                                            class221.field3217[var3++] = 0;
                                            class214.field3145[var4++] = "";
                                            class221.field3217[var3++] = 0;
                                        } else {
                                            class221.field3217[var3++] = var298.field1687;
                                            class214.field3145[var4++] = var298.field3367;
                                            class277 var299 = var298.method1593(94);
                                            class221.field3217[var3++] = var299.field4482;
                                            class214.field3145[var4++] = var299.field4481;
                                            class221.field3217[var3++] = var298.field1679;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6507) {
                                        var3 -= 4;
                                        boolean var300 = class221.field3217[var3 + 1] == 1;
                                        int var301 = class221.field3217[var3 + 2];
                                        boolean var302 = class221.field3217[var3 + 3] == 1;
                                        int var303 = class221.field3217[var3];
                                        class191.method1354(var303, var301, (byte) -68, var300, var302);
                                        continue;
                                    }
                                } else if (var526 < 6700) {
                                    if (var526 == 6600) {
                                        var3--;
                                        class299.field4829 = class221.field3217[var3] == 1;
                                        class89.method667(1, class273.field4426);
                                        continue;
                                    }
                                    if (var526 == 6601) {
                                        class221.field3217[var3++] = class299.field4829 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var526 < 6900) {
                                    if (var526 == 6800) {
                                        var3--;
                                        int var284 = class221.field3217[var3];
                                        class66 var285 = class206.method1458(var284, 22464);
                                        if (var285.field991 == null) {
                                            class214.field3145[var4++] = "";
                                        } else {
                                            class214.field3145[var4++] = var285.field991;
                                        }
                                        continue;
                                    }
                                    if (var526 == 6801) {
                                        var3--;
                                        int var286 = class221.field3217[var3];
                                        class66 var287 = class206.method1458(var286, 22464);
                                        class221.field3217[var3++] = var287.field993;
                                        continue;
                                    }
                                    if (var526 == 6802) {
                                        var3--;
                                        int var288 = class221.field3217[var3];
                                        class66 var289 = class206.method1458(var288, 22464);
                                        class221.field3217[var3++] = var289.field1014;
                                        continue;
                                    }
                                    if (var526 == 6803) {
                                        var3--;
                                        int var290 = class221.field3217[var3];
                                        class66 var291 = class206.method1458(var290, 22464);
                                        class221.field3217[var3++] = var291.field987;
                                        continue;
                                    }
                                }
                            } else if (var526 == 4500) {
                                var3 -= 2;
                                int var307 = class221.field3217[var3];
                                int var308 = class221.field3217[var3 + 1];
                                class192 var309 = class51.method308((byte) -73, var308);
                                if (var309.method1369(0)) {
                                    class214.field3145[var4++] = class74.method557(3, var307).method953(var309.field2837, (byte) 84, var308);
                                } else {
                                    class221.field3217[var3++] = class74.method557(3, var307).method954(var308, var309.field2840, true);
                                }
                                continue;
                            }
                        } else if (var526 == 4300) {
                            var3 -= 2;
                            int var310 = class221.field3217[var3];
                            int var311 = class221.field3217[var3 + 1];
                            class192 var312 = class51.method308((byte) -73, var311);
                            if (var312.method1369(0)) {
                                class214.field3145[var4++] = class303.method2062(var310, -113).method798((byte) -124, var312.field2837, var311);
                            } else {
                                class221.field3217[var3++] = class303.method2062(var310, -123).method797(var311, var312.field2840, -125);
                            }
                            continue;
                        }
                    } else {
                        class263 var43;
                        if (var526 >= 2000) {
                            var3--;
                            var43 = class144.method1078(class221.field3217[var3], 8534);
                            var526 -= 1000;
                        } else {
                            var43 = var38 ? class297.field4764 : class143.field2325;
                        }
                        if (var526 == 1300) {
                            var3--;
                            int var44 = class221.field3217[var3] - 1;
                            if (var44 >= 0 && var44 <= 9) {
                                var4--;
                                var43.method1811(0, var44, class214.field3145[var4]);
                                continue;
                            }
                            var4--;
                            continue;
                        }
                        if (var526 == 1301) {
                            var3 -= 2;
                            int var45 = class221.field3217[var3];
                            int var46 = class221.field3217[var3 + 1];
                            var43.field4048 = class34.method219(var45, 73, var46);
                            continue;
                        }
                        if (var526 == 1302) {
                            var3--;
                            var43.field4174 = class221.field3217[var3] == 1;
                            continue;
                        }
                        if (var526 == 1303) {
                            var3--;
                            var43.field4095 = class221.field3217[var3];
                            continue;
                        }
                        if (var526 == 1304) {
                            var3--;
                            var43.field4216 = class221.field3217[var3];
                            continue;
                        }
                        if (var526 == 1305) {
                            var4--;
                            var43.field4111 = class214.field3145[var4];
                            continue;
                        }
                        if (var526 == 1306) {
                            var4--;
                            var43.field4088 = class214.field3145[var4];
                            continue;
                        }
                        if (var526 == 1307) {
                            var43.field4092 = null;
                            continue;
                        }
                        if (var526 == 1308) {
                            var3--;
                            var43.field4205 = class221.field3217[var3];
                            var3--;
                            var43.field4137 = class221.field3217[var3];
                            continue;
                        }
                        if (var526 == 1309) {
                            var3--;
                            int var47 = class221.field3217[var3];
                            var3--;
                            int var48 = class221.field3217[var3];
                            if (var48 >= 1 && var48 <= 10) {
                                var43.method1808(0, var48 - 1, var47);
                            }
                            continue;
                        }
                        if (var526 == 1310) {
                            var4--;
                            var43.field4112 = class214.field3145[var4];
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var525) {
            if (arg1.field3651 == null) {
                if (class113.field1868 != 0) {
                    class258.method1777(-1, 0, "", "Clientscript error - check log for details");
                }
                class5.method27(-42, "CS2 - scr:" + arg1.field4008 + " op:" + var8, var525);
            } else {
                StringBuffer var522 = new StringBuffer(30);
                var522.append("%0a - in: ").append(arg1.field3651);
                for (int var523 = class92.field1482 - 1; var523 >= 0; var523--) {
                    var522.append("%0a - via: ").append(class65.field980[var523].field4570.field3651);
                }
                if (var8 == 40) {
                    int var524 = var7[var5];
                    var522.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var524));
                }
                if (class113.field1868 != 0) {
                    class258.method1777(-1, 0, "", "Clientscript error in: " + arg1.field3651);
                }
                class5.method27(-104, "CS2 - scr:" + arg1.field4008 + " op:" + var8 + var522.toString(), var525);
            }
        }
    }
}
