import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class253 extends class71 {

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    private int field4514 = -1;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "J")
    public static long field4510 = 0L;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "Lud;")
    public static class279 field4523 = class130.method1024("Votre liste noire est pleine (X100 noms maximum(Y)3", 255);

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "Lud;")
    private static class279 field4521 = class130.method1024("Loaded world list data", 255);

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field4519 = 3;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "Lud;")
    public static class279 field4522 = class130.method1024("Utiliser", 255);

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "Lud;")
    private static class279 field4529 = class130.method1024("Unable to find ", 255);

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lud;")
    public static class279 field4511 = field4529;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "Lud;")
    public static class279 field4530 = field4521;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lok;")
    public static class149 field4509;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "[I")
    public int[] field4518;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLqg;)I", line = 5)
    public static final int method1810(boolean arg0, class239 arg1) {
        field4513++;
        if (arg0) {
            return 13;
        }
        int var2 = arg1.field4216;
        class34 var3 = arg1.method15(62);
        if (arg1.field25 == var3.field765) {
            var2 = arg1.field4190;
        } else if (arg1.field25 == var3.field751 || arg1.field25 == var3.field759 || arg1.field25 == var3.field782 || arg1.field25 == var3.field758) {
            var2 = arg1.field4206;
        } else if (arg1.field25 == var3.field785 || arg1.field25 == var3.field761 || arg1.field25 == var3.field779 || arg1.field25 == var3.field757) {
            var2 = arg1.field4215;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V", line = 33)
    public static final void method1811(int arg0, int arg1) {
        field4516++;
        if (arg1 < 0 || arg0 > -102) {
            return;
        }
        int var2 = class212.field3722[arg1];
        int var3 = class304.field5400[arg1];
        int var4 = (int) class154.field2790[arg1];
        int var5 = class271.field4828[arg1];
        long var6 = class154.field2790[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (var5 == 17) {
            class243.field4317++;
            class314.field5534.method1634(38, 0);
            class314.field5534.method444((byte) 46, var3);
            class8 var8 = class273.method1940(var3, 124);
            if (var8.field161 != null && var8.field161[0][0] == 5) {
                int var9 = var8.field161[0][1];
                class326.field5679[var9] = 1 - class326.field5679[var9];
                class102.method864(var9, 83);
            }
        }
        if (var5 == 44 || var5 == 1005) {
            class55.method514(var3, (byte) -127, class184.field3373[arg1], var4, var2);
        }
        if (var5 == 48) {
            class239 var10 = class96.field1780[var4];
            if (var10 != null) {
                class233.field4088++;
                class315.method2228(var10.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var10.field34[0]);
                class185.field3396 = class232.field4074;
                class312.field5514 = 0;
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class314.field5534.method1634(204, 0);
                class314.field5534.method505(var4, (byte) 7);
            }
        }
        if (var5 == 38) {
            class249.field4418++;
            class314.field5534.method1634(33, 0);
            class314.field5534.method462(var4, true);
            class314.field5534.method497(var3, -114);
            class314.field5534.method462(var2, true);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, -125);
            class144.field2606 = var2;
        }
        if (var5 == 50 && class112.method913(0, var6, var2, var3)) {
            class314.field5534.method1634(23, 0);
            class314.field5534.method445((byte) 73, class290.field5161);
            class314.field5534.method493(var3 + class12.field396, -77);
            class314.field5534.method462(class178.field3209, true);
            class314.field5534.method462(class105.field1968, true);
            class314.field5534.method493((int) (var6 >>> 32) & Integer.MAX_VALUE, -75);
            class238.field4172++;
            class314.field5534.method493(class112.field2058 + var2, -81);
        }
        if (var5 == 15 && class112.method913(0, var6, var2, var3)) {
            class314.field5534.method1634(4, 0);
            class314.field5534.method445((byte) 28, class315.field5545);
            class314.field5534.method485(class12.field396 + var3, 111);
            class314.field5534.method485(class112.field2058 + var2, 5);
            class314.field5534.method505((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 7);
            class265.field4770++;
            class314.field5534.method505(class236.field4107, (byte) 7);
        }
        if (var5 == 49) {
            class239 var11 = class96.field1780[var4];
            if (var11 != null) {
                class315.method2228(var11.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var11.field34[0]);
                class140.field2554 = 2;
                class312.field5514 = 0;
                class185.field3396 = class232.field4074;
                class200.field3578 = class64.field1307;
                class314.field5534.method1634(162, 0);
                class309.field5479++;
                class314.field5534.method444((byte) 46, class290.field5161);
                class314.field5534.method493(var4, -53);
                class314.field5534.method485(class105.field1968, 25);
                class314.field5534.method462(class178.field3209, true);
            }
        }
        if (var5 == 22) {
            class73.field1431++;
            class314.field5534.method1634(255, 0);
            class314.field5534.method485(var2, 110);
            class314.field5534.method485(var4, 19);
            class314.field5534.method497(var3, 120);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 111);
            class144.field2606 = var2;
        }
        if (var5 == 60) {
            class239 var12 = class96.field1780[var4];
            if (var12 != null) {
                class315.method2228(var12.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var12.field34[0]);
                class185.field3396 = class232.field4074;
                class200.field3578 = class64.field1307;
                class312.field5514 = 0;
                class140.field2554 = 2;
                class294.field5248++;
                class314.field5534.method1634(70, 0);
                class314.field5534.method462(var4, true);
            }
        }
        if (var5 == 57) {
            class239 var13 = class96.field1780[var4];
            if (var13 != null) {
                class315.method2228(var13.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var13.field34[0]);
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class312.field5514 = 0;
                class179.field3244++;
                class185.field3396 = class232.field4074;
                class314.field5534.method1634(224, 0);
                class314.field5534.method485(var4, 124);
            }
        }
        if (var5 == 18) {
            class273.field4863++;
            class112.method913(0, var6, var2, var3);
            class314.field5534.method1634(176, 0);
            class314.field5534.method462(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class314.field5534.method485(var2 + class112.field2058, 40);
            class314.field5534.method485(class12.field396 + var3, 119);
        }
        if (var5 == 37) {
            class279.field4964++;
            class314.field5534.method1634(111, 0);
            class314.field5534.method444((byte) 46, var3);
            class314.field5534.method505(var4, (byte) 7);
            class314.field5534.method505(var2, (byte) 7);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 121);
            class144.field2606 = var2;
        }
        if (var5 == 10) {
            class28.field660++;
            class314.field5534.method1634(152, 0);
            class314.field5534.method485(var4, 120);
            class314.field5534.method498(var3, -119);
            class314.field5534.method505(var2, (byte) 7);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 116);
            class144.field2606 = var2;
        }
        if (var5 == 25) {
            class130.field2381++;
            if (class214.field3764 == 1) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            } else {
                boolean var14 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
                if (!var14) {
                    class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
                }
            }
            class185.field3396 = class232.field4074;
            class312.field5514 = 0;
            class200.field3578 = class64.field1307;
            class140.field2554 = 2;
            class314.field5534.method1634(216, 0);
            class314.field5534.method505(var2 + class112.field2058, (byte) 7);
            class314.field5534.method462(var4, true);
            class314.field5534.method485(class12.field396 + var3, 22);
        }
        if (var5 == 23) {
            class102 var16 = class122.field2196[var4];
            if (var16 != null) {
                class322.field5619++;
                class315.method2228(var16.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var16.field34[0]);
                class200.field3578 = class64.field1307;
                class185.field3396 = class232.field4074;
                class140.field2554 = 2;
                class312.field5514 = 0;
                class314.field5534.method1634(165, 0);
                class314.field5534.method485(var4, 93);
            }
        }
        if (var5 == 34) {
            class123.field2236++;
            if (class214.field3764 == 1) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            } else {
                boolean var17 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
                if (!var17) {
                    class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
                }
            }
            class185.field3396 = class232.field4074;
            class312.field5514 = 0;
            class140.field2554 = 2;
            class200.field3578 = class64.field1307;
            class314.field5534.method1634(202, 0);
            class314.field5534.method493(class12.field396 + var3, -64);
            class314.field5534.method485(class112.field2058 + var2, 44);
            class314.field5534.method493(var4, -85);
        }
        if (var5 == 47) {
            class102 var19 = class122.field2196[var4];
            if (var19 != null) {
                class315.method2228(var19.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var19.field34[0]);
                class140.field2554 = 2;
                class312.field5514 = 0;
                class199.field3554++;
                class200.field3578 = class64.field1307;
                class185.field3396 = class232.field4074;
                class314.field5534.method1634(119, 0);
                class314.field5534.method462(class236.field4107, true);
                class314.field5534.method493(var4, -72);
                class314.field5534.method444((byte) 46, class315.field5545);
            }
        }
        if (var5 == 6) {
            class314.field5534.method1634(90, 0);
            class260.field4628++;
            class314.field5534.method485(class236.field4107, 14);
            class314.field5534.method445((byte) 79, class315.field5545);
            class314.field5534.method462(var2, true);
            class314.field5534.method498(var3, -114);
        }
        if (var5 == 13) {
            class314.field5534.method1634(115, 0);
            class57.field1211++;
            class314.field5534.method462(var2, true);
            class314.field5534.method462(var4, true);
            class314.field5534.method498(var3, -116);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 117);
            class144.field2606 = var2;
        }
        if (var5 == 58) {
            class102 var20 = class122.field2196[var4];
            if (var20 != null) {
                class315.method2228(var20.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var20.field34[0]);
                class185.field3396 = class232.field4074;
                class312.field5514 = 0;
                class280.field4998++;
                class140.field2554 = 2;
                class200.field3578 = class64.field1307;
                class314.field5534.method1634(246, 0);
                class314.field5534.method493(var4, -89);
            }
        }
        if (var5 == 32) {
            class102 var21 = class122.field2196[var4];
            if (var21 != null) {
                class315.method2228(var21.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var21.field34[0]);
                class200.field3578 = class64.field1307;
                class312.field5514 = 0;
                class261.field4652++;
                class185.field3396 = class232.field4074;
                class140.field2554 = 2;
                class314.field5534.method1634(173, 0);
                class314.field5534.method505(var4, (byte) 7);
            }
        }
        if (var5 == 59) {
            class239 var22 = class96.field1780[var4];
            if (var22 != null) {
                class315.method2228(var22.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var22.field34[0]);
                class309.field5481++;
                class185.field3396 = class232.field4074;
                class312.field5514 = 0;
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class314.field5534.method1634(79, 0);
                class314.field5534.method485(var4, 111);
            }
        }
        if (var5 == 1007) {
            class166.field2995++;
            class112.method913(0, var6, var2, var3);
            class314.field5534.method1634(61, 0);
            class314.field5534.method505(class12.field396 + var3, (byte) 7);
            class314.field5534.method462((int) (var6 >>> 32) & Integer.MAX_VALUE, true);
            class314.field5534.method462(class112.field2058 + var2, true);
        }
        if (var5 == 5) {
            class138.method1069(-71);
        }
        if (var5 == 4) {
            class239 var23 = class96.field1780[var4];
            if (var23 != null) {
                class74.field1466++;
                class315.method2228(var23.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var23.field34[0]);
                class312.field5514 = 0;
                class185.field3396 = class232.field4074;
                class140.field2554 = 2;
                class200.field3578 = class64.field1307;
                class314.field5534.method1634(192, 0);
                class314.field5534.method485(var4, 37);
            }
        }
        if (var5 == 29) {
            class314.field5534.method1634(159, 0);
            class314.field5534.method505(var2, (byte) 7);
            class282.field5036++;
            class314.field5534.method505(var4, (byte) 7);
            class314.field5534.method497(var3, -110);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, -86);
            class144.field2606 = var2;
        }
        if (var5 == 30) {
            class102 var24 = class122.field2196[var4];
            if (var24 != null) {
                class149.field2702++;
                class315.method2228(var24.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var24.field34[0]);
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class185.field3396 = class232.field4074;
                class312.field5514 = 0;
                class314.field5534.method1634(147, 0);
                class314.field5534.method493(var4, -83);
            }
        }
        if (var5 == 1) {
            class119.field2142++;
            class112.method913(0, var6, var2, var3);
            class314.field5534.method1634(137, 0);
            class314.field5534.method493(class112.field2058 + var2, -66);
            class314.field5534.method493(class12.field396 + var3, -65);
            class314.field5534.method493((int) (var6 >>> 32) & Integer.MAX_VALUE, -42);
        }
        if (var5 == 33) {
            if (class214.field3764 == 1) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            } else {
                boolean var25 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
                if (!var25) {
                    class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
                }
            }
            class284.field5073++;
            class312.field5514 = 0;
            class140.field2554 = 2;
            class200.field3578 = class64.field1307;
            class185.field3396 = class232.field4074;
            class314.field5534.method1634(11, 0);
            class314.field5534.method485(class12.field396 + var3, 74);
            class314.field5534.method493(var4, -74);
            class314.field5534.method462(class112.field2058 + var2, true);
        }
        if (var5 == 39) {
            class157.field2822++;
            class314.field5534.method1634(92, 0);
            class314.field5534.method462(class236.field4107, true);
            class314.field5534.method505(var2, (byte) 7);
            class314.field5534.method493(var4, -123);
            class314.field5534.method445((byte) 26, var3);
            class314.field5534.method498(class315.field5545, -123);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, -56);
            class144.field2606 = var2;
        }
        if (var5 == 41) {
            class74.field1449++;
            class314.field5534.method1634(206, 0);
            class314.field5534.method493(var4, -38);
            class314.field5534.method497(var3, -120);
            class314.field5534.method493(var2, -115);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, -86);
            class144.field2606 = var2;
        }
        if (var5 == 12) {
            class239 var27 = class96.field1780[var4];
            if (var27 != null) {
                class315.method2228(var27.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var27.field34[0]);
                class200.field3578 = class64.field1307;
                class185.field3396 = class232.field4074;
                field4512++;
                class312.field5514 = 0;
                class140.field2554 = 2;
                class314.field5534.method1634(169, 0);
                class314.field5534.method485(var4, 99);
            }
        }
        if (var5 == 1006) {
            class312.field5514 = 0;
            class140.field2554 = 2;
            class12.field393++;
            class185.field3396 = class232.field4074;
            class200.field3578 = class64.field1307;
            class314.field5534.method1634(37, 0);
            class314.field5534.method462(var4, true);
        }
        if (var5 == 9) {
            if (var4 == 0) {
                class126.field2342 = 1;
                class321.method2264(class287.field5134, var2, var3);
            } else if (var4 == 1) {
                class314.field5534.method1634(168, 0);
                class314.field5534.method462(class12.field396 + var3, true);
                class126.field2344++;
                class314.field5534.method445((byte) 16, class315.field5545);
                class314.field5534.method505(class236.field4107, (byte) 7);
                class314.field5534.method462(class112.field2058 + var2, true);
            }
        }
        if (var5 == 35) {
            class314.field5534.method1634(38, 0);
            class243.field4317++;
            class314.field5534.method444((byte) 46, var3);
            class8 var28 = class273.method1940(var3, -114);
            if (var28.field161 != null && var28.field161[0][0] == 5) {
                int var29 = var28.field161[0][1];
                if (class326.field5679[var29] != var28.field239[0]) {
                    class326.field5679[var29] = var28.field239[0];
                    class102.method864(var29, -100);
                }
            }
        }
        if (var5 == 36) {
            class102 var30 = class122.field2196[var4];
            if (var30 != null) {
                class315.method2228(var30.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var30.field34[0]);
                class185.field3396 = class232.field4074;
                class140.field2554 = 2;
                class312.field5514 = 0;
                class73.field1423++;
                class200.field3578 = class64.field1307;
                class314.field5534.method1634(85, 0);
                class314.field5534.method493(class105.field1968, -105);
                class314.field5534.method497(class290.field5161, 35);
                class314.field5534.method462(var4, true);
                class314.field5534.method493(class178.field3209, -119);
            }
        }
        if (var5 == 42) {
            class314.field5534.method1634(161, 0);
            class314.field5534.method462(var2, true);
            class204.field3629++;
            class314.field5534.method462(var4, true);
            class314.field5534.method498(var3, -124);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, -111);
            class144.field2606 = var2;
        }
        if (var5 == 8) {
            class102 var31 = class122.field2196[var4];
            if (var31 != null) {
                class315.method2228(var31.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var31.field34[0]);
                class312.field5514 = 0;
                class185.field3396 = class232.field4074;
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class298.field5283++;
                class314.field5534.method1634(232, 0);
                class314.field5534.method493(var4, -64);
            }
        }
        if (var5 == 40) {
            class201.field3589++;
            boolean var32 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
            if (!var32) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            }
            class312.field5514 = 0;
            class185.field3396 = class232.field4074;
            class200.field3578 = class64.field1307;
            class140.field2554 = 2;
            class314.field5534.method1634(130, 0);
            class314.field5534.method485(class12.field396 + var3, 46);
            class314.field5534.method497(class315.field5545, -101);
            class314.field5534.method505(class112.field2058 + var2, (byte) 7);
            class314.field5534.method505(var4, (byte) 7);
            class314.field5534.method493(class236.field4107, -43);
        }
        if (var5 == 51) {
            class239 var34 = class96.field1780[var4];
            if (var34 != null) {
                class103.field1942++;
                class315.method2228(var34.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var34.field34[0]);
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class185.field3396 = class232.field4074;
                class312.field5514 = 0;
                class314.field5534.method1634(195, 0);
                class314.field5534.method505(var4, (byte) 7);
            }
        }
        if (var5 == 20) {
            class239 var35 = class96.field1780[var4];
            if (var35 != null) {
                class315.method2228(var35.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var35.field34[0]);
                class200.field3578 = class64.field1307;
                class140.field2554 = 2;
                class111.field2035++;
                class185.field3396 = class232.field4074;
                class312.field5514 = 0;
                class314.field5534.method1634(104, 0);
                class314.field5534.method462(var4, true);
            }
        }
        if (var5 == 1003) {
            class185.field3396 = class232.field4074;
            class200.field3578 = class64.field1307;
            class312.field5514 = 0;
            class140.field2554 = 2;
            class102 var36 = class122.field2196[var4];
            if (var36 != null) {
                class125 var37 = var36.field1921;
                if (var37.field2321 != null) {
                    var37 = var37.method999(13102);
                }
                if (var37 != null) {
                    class314.field5534.method1634(183, 0);
                    class314.field5534.method505(var37.field2327, (byte) 7);
                    class18.field554++;
                }
            }
        }
        if (var5 == 46) {
            class8 var38 = class273.method1940(var3, -40);
            boolean var39 = true;
            if (var38.field326 > 0) {
                var39 = class246.method1754(-105, var38);
            }
            if (var39) {
                class314.field5534.method1634(38, 0);
                class314.field5534.method444((byte) 46, var3);
                class243.field4317++;
            }
        }
        if (var5 == 31) {
            class273.field4859++;
            class112.method913(0, var6, var2, var3);
            class314.field5534.method1634(180, 0);
            class314.field5534.method485(Integer.MAX_VALUE & (int) (var6 >>> 32), 100);
            class314.field5534.method505(var3 + class12.field396, (byte) 7);
            class314.field5534.method493(class112.field2058 + var2, -109);
        }
        if (var5 == 43) {
            if (var4 == 0) {
                class198.field3541 = 1;
                class321.method2264(class287.field5134, var2, var3);
            } else if (class145.field2623 > 0 && class284.field5075[82] && class284.field5075[81]) {
                class157.method1222(class12.field396 + var3, class112.field2058 + var2, class287.field5134, (byte) 28);
            } else {
                class7.field132++;
                class314.field5534.method1634(97, 0);
                class314.field5534.method462(class112.field2058 + var2, true);
                class314.field5534.method505(class12.field396 + var3, (byte) 7);
            }
        }
        if (var5 == 14 && class320.field5597 == null) {
            class52.method441((byte) 120, var2, var3);
            class320.field5597 = class103.method868(250, var2, var3);
            class50.method426(class320.field5597, false);
        }
        if (var5 == 16) {
            class239 var40 = class96.field1780[var4];
            if (var40 != null) {
                class98.field1846++;
                class315.method2228(var40.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var40.field34[0]);
                class200.field3578 = class64.field1307;
                class312.field5514 = 0;
                class185.field3396 = class232.field4074;
                class140.field2554 = 2;
                class314.field5534.method1634(46, 0);
                class314.field5534.method485(class236.field4107, 57);
                class314.field5534.method498(class315.field5545, -122);
                class314.field5534.method505(var4, (byte) 7);
            }
        }
        if (var5 == 21) {
            class222.field3921++;
            boolean var41 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
            if (!var41) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            }
            class140.field2554 = 2;
            class200.field3578 = class64.field1307;
            class312.field5514 = 0;
            class185.field3396 = class232.field4074;
            class314.field5534.method1634(135, 0);
            class314.field5534.method485(var4, 35);
            class314.field5534.method462(class178.field3209, true);
            class314.field5534.method445((byte) 67, class290.field5161);
            class314.field5534.method493(class112.field2058 + var2, -68);
            class314.field5534.method462(class12.field396 + var3, true);
            class314.field5534.method462(class105.field1968, true);
        }
        if (var5 == 24) {
            class8 var43 = class103.method868(250, var2, var3);
            if (var43 != null) {
                class17.method151(57);
                class246 var44 = client.method1798(var43);
                class249.method1784(-13180, var43.field285, var2, var43.field294, var44.field4369, var44.method1751((byte) 82), var3);
                class98.field1839 = 0;
                class244.field4332 = class94.method791(var43, 14);
                if (class244.field4332 == null) {
                    class244.field4332 = class87.field1672;
                }
                if (var43.field223) {
                    class73.field1429 = class115.method929(new class279[] { var43.field272, client.field4467 }, (byte) 60);
                } else {
                    class73.field1429 = class115.method929(new class279[] { class20.field569, var43.field232, client.field4467 }, (byte) 60);
                }
            }
            return;
        }
        if (var5 == 2) {
            class314.field5534.method1634(123, 0);
            class314.field5534.method505(var2, (byte) 7);
            class3.field109++;
            class314.field5534.method498(var3, -116);
            class314.field5534.method493(var4, -110);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 118);
            class144.field2606 = var2;
        }
        if (var5 == 7) {
            class17.method151(51);
            class8 var50 = class273.method1940(var3, -101);
            class105.field1968 = var4;
            class98.field1839 = 1;
            class178.field3209 = var2;
            class290.field5161 = var3;
            class50.method426(var50, false);
            class141.field2564 = class115.method929(new class279[] { class269.field4816, class220.method1612(-2254, var4).field2861, client.field4467 }, (byte) 60);
            if (class141.field2564 == null) {
                class141.field2564 = class113.field2071;
            }
            return;
        }
        if (var5 == 1002) {
            class200.field3578 = class64.field1307;
            class252.field4499++;
            class185.field3396 = class232.field4074;
            class140.field2554 = 2;
            class312.field5514 = 0;
            class314.field5534.method1634(12, 0);
            class314.field5534.method493(var4, -54);
        }
        if (var5 == 1001) {
            class8 var45 = class273.method1940(var3, -52);
            if (var45 == null || var45.field332[var2] < 100000) {
                class314.field5534.method1634(12, 0);
                class314.field5534.method493(var4, -72);
                class252.field4499++;
            } else {
                class59.method532(class115.method929(new class279[] { class191.method1447(5, var45.field332[var2]), class172.field3112, class220.method1612(-2254, var4).field2861 }, (byte) 60), class60.field1265, 0, 29437);
            }
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, -33);
            class144.field2606 = var2;
        }
        if (var5 == 19) {
            if (class214.field3764 == 1) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            } else {
                boolean var46 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
                if (!var46) {
                    class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
                }
            }
            class312.field5514 = 0;
            class12.field379++;
            class140.field2554 = 2;
            class200.field3578 = class64.field1307;
            class185.field3396 = class232.field4074;
            class314.field5534.method1634(64, 0);
            class314.field5534.method485(class12.field396 + var3, 53);
            class314.field5534.method485(var4, 110);
            class314.field5534.method505(class112.field2058 + var2, (byte) 7);
        }
        if (var5 == 28) {
            class112.method913(0, var6, var2, var3);
            class88.field1678++;
            class314.field5534.method1634(194, 0);
            class314.field5534.method505(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 7);
            class314.field5534.method493(var2 + class112.field2058, -105);
            class314.field5534.method485(var3 + class12.field396, 108);
        }
        if (var5 == 26) {
            class142.field2577++;
            if (class214.field3764 == 1) {
                class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
            } else {
                boolean var48 = class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 0, 0, false, 0, class72.field1420.field11[0], var3);
                if (!var48) {
                    class315.method2228(var2, 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var3);
                }
            }
            class312.field5514 = 0;
            class185.field3396 = class232.field4074;
            class140.field2554 = 2;
            class200.field3578 = class64.field1307;
            class314.field5534.method1634(51, 0);
            class314.field5534.method493(var4, -82);
            class314.field5534.method493(var2 + class112.field2058, -104);
            class314.field5534.method485(class12.field396 + var3, 61);
        }
        if (var5 == 45) {
            class314.field5534.method1634(27, 0);
            class102.field1910++;
            class314.field5534.method445((byte) 112, var3);
            class314.field5534.method493(var4, -64);
            class314.field5534.method493(var2, -80);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 127);
            class144.field2606 = var2;
        }
        if (var5 == 3) {
            class180.field3273++;
            class314.field5534.method1634(145, 0);
            class314.field5534.method445((byte) 12, class290.field5161);
            class314.field5534.method445((byte) 11, var3);
            class314.field5534.method485(var2, 43);
            class314.field5534.method493(class178.field3209, -46);
            class314.field5534.method493(class105.field1968, -82);
            class314.field5534.method485(var4, 9);
            class216.field3803 = 0;
            class184.field3384 = class273.method1940(var3, 127);
            class144.field2606 = var2;
        }
        if (var5 == 11) {
            if (var4 == 0) {
                class321.method2264(class287.field5134, var2, var3);
            } else if (var4 == 1) {
                if (class145.field2623 > 0 && class284.field5075[82] && class284.field5075[81]) {
                    class157.method1222(class12.field396 + var3, class112.field2058 + var2, class287.field5134, (byte) 28);
                } else if (class315.method2228(var2, 1, class72.field1420.field34[0], -22495, 0, 0, 0, 0, true, 0, class72.field1420.field11[0], var3)) {
                    class314.field5534.method464(class289.field5148, false);
                    class314.field5534.method464(class287.field5133, false);
                    class314.field5534.method505(class126.field2349, (byte) 7);
                    class314.field5534.method464(57, false);
                    class314.field5534.method464(class212.field3714, false);
                    class314.field5534.method464(class5.field122, false);
                    class314.field5534.method464(89, false);
                    class314.field5534.method505(class72.field1420.field86, (byte) 7);
                    class314.field5534.method505(class72.field1420.field79, (byte) 7);
                    class314.field5534.method464(class100.field1872, false);
                    class314.field5534.method464(63, false);
                }
            }
        }
        if (class98.field1839 != 0) {
            class98.field1839 = 0;
            class50.method426(class273.method1940(class290.field5161, 125), false);
        }
        if (class38.field848) {
            class17.method151(74);
        }
        if (class184.field3384 != null && class216.field3803 == 0) {
            class50.method426(class184.field3384, false);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lok;ZLok;II)Lfg;", line = 1108)
    public static final class211 method1812(class149 arg0, boolean arg1, class149 arg2, int arg3, int arg4) {
        boolean var5 = true;
        if (arg3 != 255) {
            return (class211) null;
        }
        field4525++;
        int[] var6 = arg2.method1182(arg4, 0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1170(var6[var7], (byte) 126, arg4);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method1170(var9, (byte) 124, 0);
                } else {
                    var10 = arg0.method1170(0, (byte) 123, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class211(arg2, arg0, arg4, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[[I", line = 1166)
    public int[][] method86(int arg0, int arg1) {
        int[][] var3 = this.field1400.method1746((byte) 52, arg0);
        field4528++;
        int var4 = -24 / ((-arg1 - 70) / 54);
        if (this.field1400.field4363 && this.method1815(false)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = (class324.field5667 == this.field4517 ? arg0 : this.field4517 * arg0 / class324.field5667) * this.field4527;
            if (class215.field3787 == this.field4527) {
                for (int var12 = 0; var12 < class215.field3787; var12++) {
                    int var13 = this.field4518[var8++];
                    var7[var12] = class52.method442(var13, 255) << 4;
                    var6[var12] = class52.method442(var13, 65280) >> 4;
                    var5[var12] = class52.method442(var13 >> 12, 4080);
                }
            } else {
                for (int var9 = 0; var9 < class215.field3787; var9++) {
                    int var10 = this.field4527 * var9 / class215.field3787;
                    int var11 = this.field4518[var8 + var10];
                    var7[var9] = class52.method442(255, var11) << 4;
                    var6[var9] = class52.method442(4080, var11 >> 4);
                    var5[var9] = class52.method442(4080, var11 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)I", line = 1235)
    public static final int method1813(int arg0) {
        field4515++;
        if (arg0 != 27398) {
            method1811(-35, 51);
        }
        return class243.field4321 && class284.field5075[81] && class194.field3488 > 2 ? class75.field1469[class194.field3488 - 2] : class75.field1469[class194.field3488 - 1];
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V", line = 1258)
    public static void method1814(int arg0) {
        field4522 = null;
        field4530 = null;
        field4511 = null;
        field4509 = null;
        int var1 = -65 % ((-arg0 - 43) / 46);
        field4529 = null;
        field4523 = null;
        field4521 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)Z", line = 1276)
    public final boolean method1815(boolean arg0) {
        field4526++;
        if (arg0) {
            this.field4517 = -31;
        }
        if (this.field4518 != null) {
            return true;
        } else if (this.field4514 >= 0) {
            class66 var2 = class135.field2458 >= 0 ? class67.method595(this.field4514, class135.field2458, -8443, class3.field110) : class14.method98(class3.field110, this.field4514, -4482);
            var2.method572();
            this.field4517 = var2.field1375;
            this.field4518 = var2.field1323;
            this.field4527 = var2.field1377;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 1305)
    public class253() {
        super(0, false);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZLvh;)V", line = 1309)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method1812((class149) null, true, (class149) null, -11, -110);
        }
        field4524++;
        if (arg0 == 0) {
            this.field4514 = arg2.method468(28214);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)I", line = 1340)
    public final int method625(byte arg0) {
        field4520++;
        int var2 = 29 / ((arg0 - 53) / 56);
        return this.field4514;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V", line = 1351)
    public final void method85(int arg0) {
        super.method85(arg0 ^ 0x0);
        this.field4518 = null;
        if (arg0 == 30767) {
            field4508++;
        }
    }
}
