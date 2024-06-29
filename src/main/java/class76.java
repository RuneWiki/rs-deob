import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class76 extends class227 {

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "Lao;")
    public static class191 field954 = new class191(45, 5);

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field959 = 1406;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "Lsd;")
    public static class63 field957 = new class63(12, 0, 1, 0);

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method441(byte arg0, int arg1) {
        if (arg0 > -93) {
            return 52;
        } else {
            ++field955;
            return 127 & arg1;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 15)
    public class76() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILgp;I)V", line = 18)
    public static final void method442(int arg0, int arg1, class36 arg2, int arg3) {
        ++field958;
        if (arg2 != null && class69.field806.field2165 != arg2) {
            int var4 = arg2.field368;
            int var5 = arg2.field372;
            int var6 = arg2.field361;
            int var7 = (int) arg2.field367;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            long var8 = arg2.field367;
            if (var6 == 15) {
                if (class509.field7372 > 0 && class413.field5893.method1472(arg1 + 28251, 82) && class413.field5893.method1472(28251, 81)) {
                    class21.method116(class357.field4867 + var4, class418.field6074 + var5, (byte) -16, class96.field1170.field3695);
                } else {
                    class474.field7032 = 0;
                    class396.field5749 = arg3;
                    class410.field5875 = arg0;
                    class169.field2190 = 1;
                    ++class20.field185;
                    class492.method2979(class204.field2698, 60);
                    class106.field1443.method2410(false, class418.field6074 + var5);
                    class106.field1443.method2444((byte) 65, class357.field4867 + var4);
                }
            }
            if (var6 == 4) {
                class410.field5875 = arg0;
                class474.field7032 = 0;
                class396.field5749 = arg3;
                ++class334.field4420;
                class169.field2190 = 2;
                class492.method2979(class323.field4301, 38);
                class106.field1443.method2419(-9321, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                class106.field1443.method2444((byte) 65, var7);
                class106.field1443.method2410(false, class418.field6074 + var5);
                class106.field1443.method2446(class357.field4867 + var4, (byte) 127);
                class199.method1279(arg1 + -1, var5, var4);
            }
            if (var6 == 1002) {
                class396.field5749 = arg3;
                class169.field2190 = 2;
                class410.field5875 = arg0;
                class474.field7032 = 0;
                ++class325.field4321;
                class492.method2979(class433.field6314, arg1 ^ 117);
                class106.field1443.method2444((byte) 65, var7);
            }
            if (~var6 == -10) {
                class450 var10 = class19.method108(true, var5, var4);
                if (var10 != null) {
                    class193.method1100(var10, (byte) 0);
                }
            }
            if (var6 == 57) {
                class169.field2190 = 2;
                ++class330.field4382;
                class410.field5875 = arg0;
                class396.field5749 = arg3;
                class474.field7032 = 0;
                class492.method2979(class92.field1094, 22);
                class106.field1443.method2427((byte) 87, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                class106.field1443.method2444((byte) 65, class235.field3143);
                class106.field1443.method2446(class96.field1170.field1211, (byte) 118);
                class106.field1443.method2425(-706417304, class519.field7656);
                class106.field1443.method2410(false, class273.field3644);
            }
            if (var6 == 1011) {
                ++class128.field1656;
                class396.field5749 = arg3;
                class410.field5875 = arg0;
                class474.field7032 = 0;
                class169.field2190 = 2;
                class492.method2979(class534.field7855, 83);
                class106.field1443.method2444((byte) 65, var7);
            }
            if (var6 == 5) {
                if (class509.field7372 > 0 && class413.field5893.method1472(28251, 82) && class413.field5893.method1472(28251, 81)) {
                    class21.method116(class357.field4867 + var4, class418.field6074 - -var5, (byte) -16, class96.field1170.field3695);
                } else {
                    class415.method2550(var7, (byte) -94, var4, var5);
                    if (var7 != 1) {
                        class396.field5749 = arg3;
                        class169.field2190 = 1;
                        class410.field5875 = arg0;
                        class474.field7032 = 0;
                    } else {
                        class106.field1443.method2449((byte) 122, -1);
                        class106.field1443.method2449((byte) 126, -1);
                        class106.field1443.method2444((byte) 65, (int) class143.field1907);
                        class106.field1443.method2449((byte) 126, 57);
                        class106.field1443.method2449((byte) 120, class299.field3928);
                        class106.field1443.method2449((byte) 127, class420.field6099);
                        class106.field1443.method2449((byte) 122, 89);
                        class106.field1443.method2444((byte) 65, class96.field1170.field3704);
                        class106.field1443.method2444((byte) 65, class96.field1170.field3694);
                        class106.field1443.method2449((byte) 118, 63);
                    }
                    class139.method861(true, -4, 1, var5, 0, 1, arg1 + -111, 0, var4);
                }
            }
            if (~var6 == -45 || var6 == 1012) {
                class531.method3147(arg2.field369, 27818, var7, var5, var4);
            }
            if (~var6 == -50) {
                ++class272.field3635;
                class396.field5749 = arg3;
                class169.field2190 = 2;
                class474.field7032 = 0;
                class410.field5875 = arg0;
                class492.method2979(class135.field1786, 45);
                class106.field1443.method2410(false, class357.field4867 + var4);
                class106.field1443.method2444((byte) 65, var7);
                class106.field1443.method2444((byte) 65, class418.field6074 + var5);
                class106.field1443.method2449((byte) 122, class413.field5893.method1472(28251, 82) ? 1 : 0);
                class199.method1279(-1, var5, var4);
            }
            if (var6 == 46) {
                class531 var11 = class29.field272[var7];
                if (var11 != null) {
                    class396.field5749 = arg3;
                    ++class279.field3696;
                    class169.field2190 = 2;
                    class410.field5875 = arg0;
                    class474.field7032 = 0;
                    class492.method2979(class418.field6071, 89);
                    class106.field1443.method2446(var7, (byte) 124);
                    class106.field1443.method2427((byte) 72, !class413.field5893.method1472(arg1 ^ 28251, 82) ? 0 : 1);
                    class139.method861(true, -2, var11.method546(arg1 + 24273), var11.field1251[0], 0, var11.method546(arg1 ^ 24273), arg1 + -128, 0, var11.field1249[0]);
                }
            }
            if (~var6 == -18) {
                class474.field7032 = 0;
                ++class132.field1745;
                class169.field2190 = 2;
                class410.field5875 = arg0;
                class396.field5749 = arg3;
                class492.method2979(class502.field7328, 116);
                class106.field1443.method2410(false, class357.field4867 + var4);
                class106.field1443.method2410(false, class418.field6074 + var5);
                class106.field1443.method2449((byte) 125, class413.field5893.method1472(28251, 82) ? 1 : 0);
                class106.field1443.method2410(false, var7);
                class199.method1279(-1, var5, var4);
            }
            if (~var6 == -17 && class446.field6492 == null) {
                class68.method395(var5, var4, true);
                class446.field6492 = class19.method108(true, var5, var4);
                class413.method2521(class446.field6492, false);
            }
            if (var6 == 25) {
                class531 var12 = class29.field272[var7];
                if (var12 != null) {
                    class410.field5875 = arg0;
                    class396.field5749 = arg3;
                    ++class330.field4382;
                    class474.field7032 = 0;
                    class169.field2190 = 2;
                    class492.method2979(class92.field1094, 51);
                    class106.field1443.method2427((byte) 27, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                    class106.field1443.method2444((byte) 65, class235.field3143);
                    class106.field1443.method2446(var7, (byte) 120);
                    class106.field1443.method2425(-706417304, class519.field7656);
                    class106.field1443.method2410(false, class273.field3644);
                    class139.method861(true, -2, var12.method546(24273), var12.field1251[0], 0, var12.method546(arg1 ^ 24273), -118, 0, var12.field1249[0]);
                }
            }
            if (var6 == 21) {
                class22 var13 = class339.field4484[var7];
                if (var13 != null) {
                    class396.field5749 = arg3;
                    class410.field5875 = arg0;
                    ++class392.field5665;
                    class474.field7032 = 0;
                    class169.field2190 = 2;
                    class492.method2979(class471.field6997, 37);
                    class106.field1443.method2446(var7, (byte) 122);
                    class106.field1443.method2417(class413.field5893.method1472(28251, 82) ? 1 : 0, -28577);
                    class139.method861(true, -2, var13.method546(arg1 ^ 24273), var13.field1251[0], 0, var13.method546(24273), -120, 0, var13.field1249[0]);
                }
            }
            if (~var6 == -14) {
                class474.field7032 = 0;
                class410.field5875 = arg0;
                class396.field5749 = arg3;
                class169.field2190 = 2;
                ++class228.field3077;
                class492.method2979(class440.field6390, 89);
                class106.field1443.method2427((byte) 82, class413.field5893.method1472(28251, 82) ? 1 : 0);
                class106.field1443.method2446(class357.field4867 + var4, (byte) 119);
                class106.field1443.method2401(128, class418.field6074 + var5);
                class106.field1443.method2401(arg1 + 128, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class408.method2496(2, var4, var8, var5);
            }
            if (var6 == 47) {
                class474.field7032 = 0;
                class396.field5749 = arg3;
                class169.field2190 = 2;
                class410.field5875 = arg0;
                ++class523.field7701;
                class492.method2979(class256.field3399, 125);
                class106.field1443.method2446(class418.field6074 + var5, (byte) 121);
                class106.field1443.method2401(128, class357.field4867 + var4);
                class106.field1443.method2410(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class106.field1443.method2419(-9321, class413.field5893.method1472(arg1 + 28251, 82) ? 1 : 0);
                class408.method2496(2, var4, var8, var5);
            }
            if (var6 == 59) {
                class474.field7032 = 0;
                ++class394.field5688;
                class169.field2190 = 2;
                class396.field5749 = arg3;
                class410.field5875 = arg0;
                class492.method2979(class283.field3749, arg1 ^ 100);
                class106.field1443.method2439(1783527048, class519.field7656);
                class106.field1443.method2444((byte) 65, class273.field3644);
                class106.field1443.method2446(class357.field4867 + var4, (byte) 122);
                class106.field1443.method2444((byte) 65, class235.field3143);
                class106.field1443.method2401(128, var7);
                class106.field1443.method2427((byte) 44, class413.field5893.method1472(arg1 + 28251, 82) ? 1 : 0);
                class106.field1443.method2446(var5 - -class418.field6074, (byte) 122);
                class199.method1279(-1, var5, var4);
            }
            if (~var6 == -24) {
                class410.field5875 = arg0;
                class169.field2190 = 1;
                class396.field5749 = arg3;
                class474.field7032 = 0;
                ++class273.field3639;
                class492.method2979(class465.field6924, 24);
                class106.field1443.method2401(128, class418.field6074 - -var5);
                class106.field1443.method2446(class273.field3644, (byte) 121);
                class106.field1443.method2439(1783527048, class519.field7656);
                class106.field1443.method2410(false, class235.field3143);
                class106.field1443.method2446(class357.field4867 - -var4, (byte) 125);
                class139.method861(true, -4, 1, var5, 0, 1, -115, 0, var4);
            }
            if (~var6 == -13) {
                class474.field7032 = 0;
                class169.field2190 = 2;
                class410.field5875 = arg0;
                class396.field5749 = arg3;
                ++class454.field6790;
                class492.method2979(class260.field3465, 88);
                class106.field1443.method2410(false, var5 - -class418.field6074);
                class106.field1443.method2410(false, var4 - -class357.field4867);
                class106.field1443.method2446(var7, (byte) 123);
                class106.field1443.method2427((byte) 93, class413.field5893.method1472(28251, 82) ? 1 : 0);
                class199.method1279(~arg1, var5, var4);
            }
            if (~var6 == -4) {
                class531 var14 = class29.field272[var7];
                if (var14 != null) {
                    class410.field5875 = arg0;
                    class474.field7032 = 0;
                    ++class363.field4959;
                    class169.field2190 = 2;
                    class396.field5749 = arg3;
                    class492.method2979(class435.field6352, 76);
                    class106.field1443.method2449((byte) 126, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                    class106.field1443.method2446(var7, (byte) 124);
                    class139.method861(true, -2, var14.method546(24273), var14.field1251[0], 0, var14.method546(24273), -99, 0, var14.field1249[0]);
                }
            }
            if (var6 == 45) {
                class531 var15 = class29.field272[var7];
                if (var15 != null) {
                    class410.field5875 = arg0;
                    class396.field5749 = arg3;
                    ++class131.field1714;
                    class474.field7032 = 0;
                    class169.field2190 = 2;
                    class492.method2979(class419.field6087, 39);
                    class106.field1443.method2410(false, var7);
                    class106.field1443.method2449((byte) 124, class413.field5893.method1472(arg1 ^ 28251, 82) ? 1 : 0);
                    class139.method861(true, -2, var15.method546(24273), var15.field1251[0], 0, var15.method546(arg1 + 24273), -106, 0, var15.field1249[0]);
                }
            }
            if (var6 == 10) {
                class531 var16 = class29.field272[var7];
                if (var16 != null) {
                    ++class245.field3227;
                    class474.field7032 = 0;
                    class410.field5875 = arg0;
                    class169.field2190 = 2;
                    class396.field5749 = arg3;
                    class492.method2979(class443.field6457, 51);
                    class106.field1443.method2427((byte) 47, class413.field5893.method1472(28251, 82) ? 1 : 0);
                    class106.field1443.method2446(var7, (byte) 127);
                    class139.method861(true, -2, var16.method546(24273), var16.field1251[0], 0, var16.method546(24273), arg1 + -121, 0, var16.field1249[0]);
                }
            }
            if (~var6 == -23) {
                class22 var17 = class339.field4484[var7];
                if (var17 != null) {
                    class169.field2190 = 2;
                    ++class35.field353;
                    class474.field7032 = 0;
                    class410.field5875 = arg0;
                    class396.field5749 = arg3;
                    class492.method2979(class487.field7155, arg1 + 79);
                    class106.field1443.method2427((byte) 48, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                    class106.field1443.method2410(false, var7);
                    class139.method861(true, -2, var17.method546(arg1 ^ 24273), var17.field1251[0], 0, var17.method546(arg1 ^ 24273), -120, 0, var17.field1249[0]);
                }
            }
            if (var6 == 1009) {
                class396.field5749 = arg3;
                class169.field2190 = 2;
                class474.field7032 = 0;
                class410.field5875 = arg0;
                ++class162.field2104;
                class492.method2979(class119.field1554, 122);
                class106.field1443.method2427((byte) 121, class413.field5893.method1472(28251, 82) ? 1 : 0);
                class106.field1443.method2410(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
                class106.field1443.method2401(128, var4 - -class357.field4867);
                class106.field1443.method2410(false, class418.field6074 + var5);
                class408.method2496(2, var4, var8, var5);
            }
            if (arg1 == 0) {
                if (~var6 == -49) {
                    class531 var18 = class29.field272[var7];
                    if (var18 != null) {
                        class396.field5749 = arg3;
                        class169.field2190 = 2;
                        class410.field5875 = arg0;
                        ++class67.field768;
                        class474.field7032 = 0;
                        class492.method2979(class391.field5654, 69);
                        class106.field1443.method2446(var7, (byte) 121);
                        class106.field1443.method2449((byte) 118, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                        class139.method861(true, -2, var18.method546(24273), var18.field1251[0], 0, var18.method546(24273), -108, 0, var18.field1249[0]);
                    }
                }
                if (~var6 == -52) {
                    class22 var19 = class339.field4484[var7];
                    if (var19 != null) {
                        class474.field7032 = 0;
                        class169.field2190 = 2;
                        class410.field5875 = arg0;
                        ++class471.field6987;
                        class396.field5749 = arg3;
                        class492.method2979(class458.field6837, 31);
                        class106.field1443.method2419(arg1 ^ -9321, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                        class106.field1443.method2444((byte) 65, var7);
                        class139.method861(true, -2, var19.method546(24273), var19.field1251[0], 0, var19.method546(24273), -112, 0, var19.field1249[0]);
                    }
                }
                if (var6 == 50) {
                    class396.field5749 = arg3;
                    class169.field2190 = 2;
                    class410.field5875 = arg0;
                    ++class521.field7668;
                    class474.field7032 = 0;
                    class492.method2979(class523.field7700, arg1 ^ 69);
                    class106.field1443.method2417(!class413.field5893.method1472(28251, 82) ? 0 : 1, -28577);
                    class106.field1443.method2446(var4 - -class357.field4867, (byte) 119);
                    class106.field1443.method2410(false, var5 - -class418.field6074);
                    class106.field1443.method2410(false, var7);
                    class199.method1279(~arg1, var5, var4);
                }
                if (~var6 == -59) {
                    ++class323.field4298;
                    class169.field2190 = 2;
                    class410.field5875 = arg0;
                    class396.field5749 = arg3;
                    class474.field7032 = 0;
                    class492.method2979(class71.field908, 56);
                    class106.field1443.method2401(128, var4 - -class357.field4867);
                    class106.field1443.method2444((byte) 65, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    class106.field1443.method2410(false, var5 - -class418.field6074);
                    class106.field1443.method2417(!class413.field5893.method1472(arg1 ^ 28251, 82) ? 0 : 1, -28577);
                    class408.method2496(2, var4, var8, var5);
                }
                if (~var6 == -1007) {
                    class396.field5749 = arg3;
                    class169.field2190 = 2;
                    class410.field5875 = arg0;
                    class474.field7032 = 0;
                    class22 var20 = class339.field4484[var7];
                    if (var20 != null) {
                        class212 var21 = var20.field220;
                        if (var21.field2903 != null) {
                            var21 = var21.method1350(class52.field606, -1);
                        }
                        if (var21 != null) {
                            ++class23.field229;
                            class492.method2979(class270.field3597, 53);
                            class106.field1443.method2444((byte) 65, var21.field2850);
                        }
                    }
                }
                if (~var6 == -31) {
                    class474.field7032 = 0;
                    class410.field5875 = arg0;
                    ++class228.field3075;
                    class396.field5749 = arg3;
                    class169.field2190 = 2;
                    class492.method2979(class458.field6833, 79);
                    class106.field1443.method2410(false, class357.field4867 + var4);
                    class106.field1443.method2444((byte) 65, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    class106.field1443.method2417(class413.field5893.method1472(28251, 82) ? 1 : 0, -28577);
                    class106.field1443.method2444((byte) 65, var5 - -class418.field6074);
                    class408.method2496(arg1 + 2, var4, var8, var5);
                }
                if (~var6 == -21) {
                    class474.field7032 = 0;
                    class410.field5875 = arg0;
                    ++class59.field687;
                    class396.field5749 = arg3;
                    class169.field2190 = 2;
                    class492.method2979(class321.field4280, 86);
                    class106.field1443.method2444((byte) 65, class235.field3143);
                    class106.field1443.method2417(!class413.field5893.method1472(28251, 82) ? 0 : 1, arg1 + -28577);
                    class106.field1443.method2410(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    class106.field1443.method2444((byte) 65, class273.field3644);
                    class106.field1443.method2401(128, class357.field4867 + var4);
                    class106.field1443.method2444((byte) 65, class418.field6074 + var5);
                    class106.field1443.method2425(-706417304, class519.field7656);
                    class408.method2496(2, var4, var8, var5);
                }
                if (~var6 == -19) {
                    class450 var22 = class19.method108(true, var5, var4);
                    if (var22 != null) {
                        class227.method1451(4226);
                        class222 var23 = client.method1253(var22);
                        class226.method1448(var22, arg1 + 123, var23.method1401(-72), var23.field2980);
                        class48.field531 = class360.method2125(var22, (byte) -7);
                        class191.field2465 = var22.field6631 + "<col=ffffff>";
                        if (class48.field531 == null) {
                            class48.field531 = "Null";
                        }
                    }
                } else {
                    if (~var6 == -9) {
                        class531 var24 = class29.field272[var7];
                        if (var24 != null) {
                            class396.field5749 = arg3;
                            class410.field5875 = arg0;
                            ++class212.field2870;
                            class169.field2190 = 2;
                            class474.field7032 = 0;
                            class492.method2979(class427.field6208, 95);
                            class106.field1443.method2444((byte) 65, var7);
                            class106.field1443.method2427((byte) 110, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                            class139.method861(true, -2, var24.method546(24273), var24.field1251[0], 0, var24.method546(24273), -110, 0, var24.field1249[0]);
                        }
                    }
                    if (var6 == 1007 || var6 == 1001 || ~var6 == -1011 || var6 == 1003 || ~var6 == -1005) {
                        class91.method504(var7, var6, var4, false);
                    }
                    if (~var6 == -20) {
                        class531 var25 = class29.field272[var7];
                        if (var25 != null) {
                            class474.field7032 = 0;
                            class410.field5875 = arg0;
                            ++class144.field1916;
                            class396.field5749 = arg3;
                            class169.field2190 = 2;
                            class492.method2979(class500.field7302, 25);
                            class106.field1443.method2410(false, var7);
                            class106.field1443.method2419(-9321, !class413.field5893.method1472(28251, 82) ? 0 : 1);
                            class139.method861(true, -2, var25.method546(arg1 + 24273), var25.field1251[0], 0, var25.method546(24273), -104, 0, var25.field1249[0]);
                        }
                    }
                    if (~var6 == -7) {
                        class531 var26 = class29.field272[var7];
                        if (var26 != null) {
                            ++class413.field5897;
                            class169.field2190 = 2;
                            class474.field7032 = 0;
                            class410.field5875 = arg0;
                            class396.field5749 = arg3;
                            class492.method2979(class331.field4387, 29);
                            class106.field1443.method2446(var7, (byte) 119);
                            class106.field1443.method2417(!class413.field5893.method1472(28251, 82) ? 0 : 1, -28577);
                            class139.method861(true, -2, var26.method546(24273), var26.field1251[0], 0, var26.method546(arg1 + 24273), -128, 0, var26.field1249[0]);
                        }
                    }
                    if (var6 == 11) {
                        class22 var27 = class339.field4484[var7];
                        if (var27 != null) {
                            ++class81.field991;
                            class169.field2190 = 2;
                            class410.field5875 = arg0;
                            class396.field5749 = arg3;
                            class474.field7032 = 0;
                            class492.method2979(class63.field732, 15);
                            class106.field1443.method2417(!class413.field5893.method1472(28251, 82) ? 0 : 1, -28577);
                            class106.field1443.method2444((byte) 65, class273.field3644);
                            class106.field1443.method2421(class519.field7656, arg1 ^ -1066855704);
                            class106.field1443.method2444((byte) 65, class235.field3143);
                            class106.field1443.method2446(var7, (byte) 126);
                            class139.method861(true, -2, var27.method546(24273), var27.field1251[0], 0, var27.method546(24273), -101, 0, var27.field1249[0]);
                        }
                    }
                    if (var6 == 60) {
                        class22 var28 = class339.field4484[var7];
                        if (var28 != null) {
                            class410.field5875 = arg0;
                            ++class454.field6788;
                            class396.field5749 = arg3;
                            class474.field7032 = 0;
                            class169.field2190 = 2;
                            class492.method2979(class185.field2402, 54);
                            class106.field1443.method2449((byte) 126, class413.field5893.method1472(arg1 + 28251, 82) ? 1 : 0);
                            class106.field1443.method2410(false, var7);
                            class139.method861(true, -2, var28.method546(arg1 + 24273), var28.field1251[0], 0, var28.method546(24273), -108, 0, var28.field1249[0]);
                        }
                    }
                    if (var6 == 2) {
                        class22 var29 = class339.field4484[var7];
                        if (var29 != null) {
                            class396.field5749 = arg3;
                            class410.field5875 = arg0;
                            ++class322.field4287;
                            class169.field2190 = 2;
                            class474.field7032 = 0;
                            class492.method2979(class88.field1045, 83);
                            class106.field1443.method2444((byte) 65, var7);
                            class106.field1443.method2449((byte) 116, class413.field5893.method1472(28251, 82) ? 1 : 0);
                            class139.method861(true, -2, var29.method546(24273), var29.field1251[0], 0, var29.method546(arg1 + 24273), -105, 0, var29.field1249[0]);
                        }
                    }
                    if (class323.field4302) {
                        class227.method1451(4226);
                    }
                    if (class431.field6266 != null && class243.field3217 == 0) {
                        class413.method2521(class431.field6266, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)V", line = 746)
    public static void method443(int arg0) {
        field954 = null;
        field957 = null;
        int var1 = 104 / ((-28 - arg0) / 55);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I", line = 759)
    public final int[] method62(int arg0, int arg1) {
        ++field956;
        int[] var3 = super.field3068.method1970(arg1, (byte) 127);
        if (arg0 != 15811) {
            field957 = null;
        }
        if (super.field3068.field4480) {
            int[][] var4 = this.method1460(arg1, 0, arg0 + -15811);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class446.field6486 > var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
