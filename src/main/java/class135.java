import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class135 extends class34 {

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Lke;")
    public static class256 field2346 = class316.method2202("Textures charg-Bes", 27626);

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lke;")
    public static class256 field2349 = class316.method2202("::setparticles", 27626);

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "[I")
    public static int[] field2345 = new int[50];

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Lke;")
    public static class256 field2341 = class316.method2202("Veuillez patienter )2 tentative de r-Btablissement)3", 27626);

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "Lke;")
    public static class256 field2358 = class316.method2202("Lade Texturen )2 ", 27626);

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V", line = 18)
    public static final void method959(int arg0, int arg1) {
        class91.field1665 = -1;
        class311.field5360 = arg0;
        class185.field3257 = -1;
        class297.method2083(false);
        int var2 = -16 % ((-arg1 - 16) / 45);
        field2352++;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V", line = 37)
    public static final void method960(byte arg0) {
        field2347++;
        if (arg0 != 115) {
            method961(54);
        }
        if (class137.field2390 == 0 || class137.field2390 == 5) {
            return;
        }
        try {
            if ((++class57.field1052) > 2000) {
                if (class196.field3586 != null) {
                    class196.field3586.method1627(125);
                    class196.field3586 = null;
                }
                if (class116.field2039 >= 1) {
                    class137.field2390 = 0;
                    class118.field2086 = -5;
                    return;
                }
                if (class53.field968 == class286.field4968) {
                    class286.field4968 = class5.field78;
                } else {
                    class286.field4968 = class53.field968;
                }
                class137.field2390 = 1;
                class116.field2039++;
                class57.field1052 = 0;
            }
            if (class137.field2390 == 1) {
                class98.field1754 = class272.field4658.method32(class286.field4968, (byte) 114, class29.field409);
                class137.field2390 = 2;
            }
            if (class137.field2390 == 2) {
                if (class98.field1754.field1500 == 2) {
                    throw new IOException();
                }
                if (class98.field1754.field1500 != 1) {
                    return;
                }
                class196.field3586 = new class243((Socket) class98.field1754.field1499, class272.field4658);
                class98.field1754 = null;
                long var1 = class62.field1103 = class46.field849.method1780(true);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class308.field5322.field738 = 0;
                class308.field5322.method308(14, -2);
                class308.field5322.method308(var3, -2);
                class196.field3586.method1636((byte) 20, 0, class308.field5322.field772, 2);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                int var4 = class196.field3586.method1629(0);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                if (var4 != 0) {
                    class137.field2390 = 0;
                    class118.field2086 = var4;
                    class196.field3586.method1627(arg0 ^ 0x1F);
                    class196.field3586 = null;
                    return;
                }
                class137.field2390 = 3;
            }
            if (class137.field2390 == 3) {
                if (class196.field3586.method1633((byte) -5) < 8) {
                    return;
                }
                class196.field3586.method1635(0, class23.field302.field772, 8, -1078);
                class23.field302.field738 = 0;
                int[] var5 = new int[4];
                class225.field3914 = class23.field302.method344((byte) -104);
                var5[2] = (int) (class225.field3914 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class225.field3914;
                class308.field5322.field738 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class308.field5322.method308(10, -2);
                class308.field5322.method365((byte) -32, var5[0]);
                class308.field5322.method365((byte) -32, var5[1]);
                class308.field5322.method365((byte) -32, var5[2]);
                class308.field5322.method365((byte) -32, var5[3]);
                class308.field5322.method330(255, class46.field849.method1780(true));
                class308.field5322.method361(class46.field853, arg0 ^ 0x73);
                class308.field5322.method324(class106.field1894, 2097244, class129.field2257);
                class168.field2971.field738 = 0;
                if (class86.field1550 == 40) {
                    class168.field2971.method308(18, -2);
                } else {
                    class168.field2971.method308(16, -2);
                }
                class168.field2971.method366(class308.field5322.field738 + (class174.method1266(1, class281.field4882) + 159), arg0 ^ 0xFFFFFFF2);
                class168.field2971.method365((byte) -32, 526);
                class168.field2971.method308(class203.field3668, -2);
                class168.field2971.method308(class72.field1318 ? 1 : 0, -2);
                class168.field2971.method308(1, -2);
                class168.field2971.method308(class35.method247(0), -2);
                class168.field2971.method366(class112.field1969, -96);
                class168.field2971.method366(class124.field2200, -110);
                class168.field2971.method308(class115.field2023, -2);
                class34.method238(class168.field2971, (byte) 56);
                class168.field2971.method361(class281.field4882, 0);
                class168.field2971.method365((byte) -32, class7.field107);
                class168.field2971.method365((byte) -32, class172.method1253(65));
                class17.field245 = true;
                class168.field2971.method366(class168.field2991, -95);
                class168.field2971.method365((byte) -32, class216.field3851.method1013(false));
                class168.field2971.method365((byte) -32, class185.field3258.method1013(false));
                class168.field2971.method365((byte) -32, class267.field4564.method1013(false));
                class168.field2971.method365((byte) -32, class166.field2939.method1013(false));
                class168.field2971.method365((byte) -32, class96.field1702.method1013(false));
                class168.field2971.method365((byte) -32, class246.field4184.method1013(false));
                class168.field2971.method365((byte) -32, class21.field277.method1013(false));
                class168.field2971.method365((byte) -32, class297.field5141.method1013(false));
                class168.field2971.method365((byte) -32, class153.field2743.method1013(false));
                class168.field2971.method365((byte) -32, class104.field1854.method1013(false));
                class168.field2971.method365((byte) -32, class240.field4094.method1013(false));
                class168.field2971.method365((byte) -32, class80.field1488.method1013(false));
                class168.field2971.method365((byte) -32, class73.field1336.method1013(false));
                class168.field2971.method365((byte) -32, class285.field4956.method1013(false));
                class168.field2971.method365((byte) -32, class298.field5163.method1013(false));
                class168.field2971.method365((byte) -32, class204.field3696.method1013(false));
                class168.field2971.method365((byte) -32, class195.field3568.method1013(false));
                class168.field2971.method365((byte) -32, class72.field1321.method1013(false));
                class168.field2971.method365((byte) -32, class142.field2488.method1013(false));
                class168.field2971.method365((byte) -32, class284.field4928.method1013(false));
                class168.field2971.method365((byte) -32, class72.field1317.method1013(false));
                class168.field2971.method365((byte) -32, class68.field1258.method1013(false));
                class168.field2971.method365((byte) -32, class22.field285.method1013(false));
                class168.field2971.method365((byte) -32, class249.field4233.method1013(false));
                class168.field2971.method365((byte) -32, class73.field1337.method1013(false));
                class168.field2971.method365((byte) -32, class153.field2729.method1013(false));
                class168.field2971.method365((byte) -32, class63.field1110.method1013(false));
                class168.field2971.method365((byte) -32, class39.field714.method1013(false));
                class168.field2971.method311(class308.field5322.field738, class308.field5322.field772, 255, 0);
                class196.field3586.method1636((byte) 20, 0, class168.field2971.field772, class168.field2971.field738);
                class308.field5322.method1606(-54, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class23.field302.method1606(-49, var5);
                class137.field2390 = 4;
            }
            if (class137.field2390 == 4) {
                if (class196.field3586.method1633((byte) -5) < 1) {
                    return;
                }
                int var7 = class196.field3586.method1629(arg0 - 115);
                if (var7 == 21) {
                    class137.field2390 = 7;
                } else if (var7 == 29) {
                    class137.field2390 = 10;
                } else if (var7 == 1) {
                    class137.field2390 = 5;
                    class118.field2086 = var7;
                    return;
                } else if (var7 == 2) {
                    class137.field2390 = 8;
                } else if (var7 == 15) {
                    class118.field2086 = var7;
                    class137.field2390 = 0;
                    return;
                } else if (var7 == 23 && class116.field2039 < 1) {
                    class57.field1052 = 0;
                    class116.field2039++;
                    class137.field2390 = 1;
                    class196.field3586.method1627(92);
                    class196.field3586 = null;
                    return;
                } else {
                    class137.field2390 = 0;
                    class118.field2086 = var7;
                    class196.field3586.method1627(90);
                    class196.field3586 = null;
                    return;
                }
            }
            if (class137.field2390 == 6) {
                class308.field5322.field738 = 0;
                class308.field5322.method1599(17, (byte) 109);
                class196.field3586.method1636((byte) 20, 0, class308.field5322.field772, class308.field5322.field738);
                class137.field2390 = 4;
                return;
            }
            if (class137.field2390 == 7) {
                if (class196.field3586.method1633((byte) -5) < 1) {
                    return;
                }
                class6.field99 = class196.field3586.method1629(0) * 60 + 180;
                class137.field2390 = 0;
                class118.field2086 = 21;
                class196.field3586.method1627(119);
                class196.field3586 = null;
                return;
            }
            if (class137.field2390 == 10) {
                if (class196.field3586.method1633((byte) -5) >= 1) {
                    class118.field2101 = class196.field3586.method1629(0);
                    class137.field2390 = 0;
                    class118.field2086 = 29;
                    class196.field3586.method1627(109);
                    class196.field3586 = null;
                    return;
                }
                return;
            }
            if (class137.field2390 == 8) {
                if (class196.field3586.method1633((byte) -5) < 14) {
                    return;
                }
                class196.field3586.method1635(0, class23.field302.field772, 14, -1078);
                class23.field302.field738 = 0;
                class106.field1896 = class23.field302.method357(false);
                class138.field2408 = class23.field302.method357(false);
                class36.field649 = class23.field302.method357(false) == 1;
                class316.field5454 = class23.field302.method357(false) == 1;
                class302.field5231 = class23.field302.method357(false) == 1;
                class154.field2759 = class23.field302.method357(false) == 1;
                class32.field519 = class23.field302.method357(false) == 1;
                class104.field1852 = class23.field302.method346(-16);
                class78.field1463 = class23.field302.method357(false) == 1;
                class21.field278 = class23.field302.method357(false) == 1;
                class138.method1025(class21.field278, true);
                class132.method900(class21.field278, 1);
                if (!class72.field1318) {
                    if ((!class36.field649 || class302.field5231) && !class78.field1463) {
                        try {
                            class252.field4282.method1766(class272.field4658.field52, 0);
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            class97.field1740.method1766(class272.field4658.field52, arg0 ^ 0x73);
                        } catch (Throwable var11) {
                        }
                    }
                }
                class9.field141 = class23.field302.method1596(255);
                class290.field5027 = class23.field302.method346(-16);
                class137.field2390 = 9;
            }
            if (class137.field2390 == 9) {
                if (class196.field3586.method1633((byte) -5) >= class290.field5027) {
                    class23.field302.field738 = 0;
                    class196.field3586.method1635(0, class23.field302.field772, class290.field5027, arg0 ^ 0xFFFFFBB9);
                    class118.field2086 = 2;
                    class137.field2390 = 0;
                    class85.method626((byte) -98);
                    class51.field937 = -1;
                    class288.method2008((byte) -117, false);
                    class9.field141 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class196.field3586 != null) {
                class196.field3586.method1627(107);
                class196.field3586 = null;
            }
            if (class116.field2039 >= 1) {
                class118.field2086 = -4;
                class137.field2390 = 0;
            } else {
                class116.field2039++;
                class57.field1052 = 0;
                if (class53.field968 == class286.field4968) {
                    class286.field4968 = class5.field78;
                } else {
                    class286.field4968 = class53.field968;
                }
                class137.field2390 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V", line = 423)
    public static void method961(int arg0) {
        field2346 = null;
        field2358 = null;
        if (arg0 != 22838) {
            method962((byte) 123);
        }
        field2341 = null;
        field2345 = null;
        field2349 = null;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V", line = 441)
    public static final void method962(byte arg0) {
        int var1 = -15 / ((arg0 - 68) / 53);
        if (class86.field1550 == 10 && class253.field4323) {
            class11.method67((byte) 74, 28);
        }
        if (class86.field1550 == 30) {
            class11.method67((byte) 74, 25);
        }
        field2350++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIIII)V", line = 477)
    public final void method963(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -76 / ((arg0 - 11) / 58);
        field2356++;
        int var7 = this.field2354 << 3;
        int var8 = this.field2351 << 3;
        int var9 = (arg4 << 4) + (var7 & 0xF);
        int var10 = (arg2 << 4) + (var8 & 0xF);
        this.method640(var8, var7, var10, var9, arg3, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V", line = 494)
    public static final void method964(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class63.field1107[var1] = false;
        }
        class64.field1118 = 0;
        class14.field192 = 0;
        class205.field3720 = -1;
        class192.field3510 = 1;
        field2359++;
        if (arg0 != -926) {
            method960((byte) -64);
        }
        class240.field4091 = -1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
    public abstract void method648(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public abstract void method643(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public abstract void method646(int arg0, int arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)V")
    public abstract void method649(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
    public abstract void method637(int arg0, int arg1);

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
    public abstract void method647(int arg0, int arg1);
}
