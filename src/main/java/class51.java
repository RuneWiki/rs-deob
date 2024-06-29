import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class51 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lwt;")
    public static class202 field806 = new class202("", 13);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field807;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 6)
    public static final void method312(int arg0, int arg1) {
        field805++;
        class338 var2 = class230.method1580(10, -1332166328, arg0);
        var2.method2052(100);
        if (arg1 > -116) {
            field807 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 20)
    public static void method313(int arg0) {
        field806 = null;
        if (arg0 == 21072) {
            field807 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 33)
    public static final void method314(int arg0) {
        class350.method2203((byte) -124, class283.field4065);
        field802++;
        class456.field6744++;
        if (class518.field7546 && class100.field1462) {
            int var1 = class54.field838.method1751(32);
            int var2 = class54.field838.method1749((byte) -124);
            int var3 = var1 - class141.field2117;
            int var4 = var2 - class479.field7038;
            if (class110.field1573 > var3) {
                var3 = class110.field1573;
            }
            if (class283.field4065.field553 + var3 > class110.field1573 + class163.field2399.field553) {
                var3 = class163.field2399.field553 + class110.field1573 - class283.field4065.field553;
            }
            if (arg0 >= -48) {
                field806 = null;
            }
            if (class518.field7543 > var4) {
                var4 = class518.field7543;
            }
            if (class283.field4065.field472 + var4 > class518.field7543 - -class163.field2399.field472) {
                var4 = class518.field7543 + class163.field2399.field472 - class283.field4065.field472;
            }
            int var5 = var3 + class163.field2399.field505 - class110.field1573;
            int var6 = var4 + class163.field2399.field415 - class518.field7543;
            if (class54.field838.method1747(120)) {
                if (class283.field4065.field483 < class456.field6744) {
                    int var8 = var3 - class12.field164;
                    int var9 = var4 - class88.field1338;
                    if (var8 > class283.field4065.field404 || -class283.field4065.field404 > var8 || var9 > class283.field4065.field404 || -class283.field4065.field404 > var9) {
                        class229.field3428 = true;
                    }
                }
                if (class283.field4065.field421 != null && class229.field3428) {
                    class168 var10 = new class168();
                    var10.field2488 = class283.field4065;
                    var10.field2486 = var5;
                    var10.field2484 = class283.field4065.field421;
                    var10.field2481 = var6;
                    class360.method2238(var10);
                }
            } else {
                if (class229.field3428) {
                    class138.method920((byte) -43);
                    if (class283.field4065.field432 != null) {
                        class168 var7 = new class168();
                        var7.field2484 = class283.field4065.field432;
                        var7.field2481 = var6;
                        var7.field2486 = var5;
                        var7.field2491 = class82.field1262;
                        var7.field2488 = class283.field4065;
                        class360.method2238(var7);
                    }
                    if (class82.field1262 != null && client.method1339(class283.field4065) != null) {
                        class340.method2081(class283.field4065, class82.field1262, 7);
                    }
                } else if ((class242.field3574 == 1 || class278.method1818(4519)) && class450.field6706 > 2) {
                    class29.method170(class141.field2117 + class12.field164, class88.field1338 + class479.field7038, (byte) 44);
                } else if (class255.method1706(0)) {
                    class29.method170(class141.field2117 + class12.field164, class88.field1338 + class479.field7038, (byte) 20);
                }
                class283.field4065 = null;
            }
        } else if (class456.field6744 > 1) {
            class283.field4065 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLm;Lqa;)V", line = 151)
    public static final void method315(byte arg0, class126 arg1, class162 arg2) {
        field803++;
        if (class460.field6800 == null) {
            return;
        }
        if (class482.field7062 < 10) {
            if (!class460.field6802.method2925(4, class460.field6800.field1576)) {
                class482.field7062 = class277.field3994.method2938(0, class460.field6800.field1576) / 10;
                return;
            }
            class180.method1227(10483);
            class482.field7062 = 10;
        }
        if (arg0 >= -72) {
            field807 = null;
        }
        if (class482.field7062 == 10) {
            class460.field6818 = class460.field6800.field1578 >> 6 << 6;
            class460.field6825 = class460.field6800.field1582 >> 6 << 6;
            class460.field6815 = (class460.field6800.field1583 >> 6 << 6) + 64 - class460.field6818;
            class460.field6830 = (class460.field6800.field1595 >> 6 << 6) + 64 - class460.field6825;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class460.field6800.method682(class500.field7365.field1768, var3, (byte) 92, (class500.field7365.field1763 >> 7) + class68.field1038, (class500.field7365.field1769 >> 7) + class24.field259)) {
                var4 = var3[1] - class460.field6818;
                var5 = var3[2] - class460.field6825;
            }
            if (!class25.field268 && var4 >= 0 && var4 < class460.field6815 && var5 >= 0 && class460.field6830 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class271.field3940 = var6;
                class335.field4715 = var7;
            } else if (class359.field5516 == -1 || class277.field3996 == -1) {
                class460.field6800.method681(var3, class460.field6800.field1586 & 0x3FFF, (byte) -122, (class460.field6800.field1586 & 0xFFFE207) >> 14);
                class335.field4715 = var3[2] - class460.field6825;
                class271.field3940 = var3[1] - class460.field6818;
            } else {
                class460.field6800.method681(var3, class277.field3996, (byte) -12, class359.field5516);
                class25.field268 = false;
                class277.field3996 = -1;
                class359.field5516 = -1;
                if (var3 != null) {
                    class271.field3940 = var3[1] - class460.field6818;
                    class335.field4715 = var3[2] - class460.field6825;
                }
            }
            if (class460.field6800.field1589 == 37) {
                class460.field6808 = 3.0F;
                class460.field6813 = 3.0F;
            } else if (class460.field6800.field1589 == 50) {
                class460.field6808 = 4.0F;
                class460.field6813 = 4.0F;
            } else if (class460.field6800.field1589 == 75) {
                class460.field6808 = 6.0F;
                class460.field6813 = 6.0F;
            } else if (class460.field6800.field1589 == 100) {
                class460.field6808 = 8.0F;
                class460.field6813 = 8.0F;
            } else if (class460.field6800.field1589 == 200) {
                class460.field6808 = 16.0F;
                class460.field6813 = 16.0F;
            } else {
                class460.field6808 = 8.0F;
                class460.field6813 = 8.0F;
            }
            class460.field6812 = (int) class460.field6808 >> 1;
            class460.field6811 = class48.method301((byte) -1, class460.field6812);
            class34.method194((byte) -70);
            class460.method2754();
            class365.field5583 = new class123();
            class460.field6806 += (int) (Math.random() * 5.0D) - 2;
            if (class460.field6806 < -8) {
                class460.field6806 = -8;
            }
            if (class460.field6806 > 8) {
                class460.field6806 = 8;
            }
            class460.field6807 += (int) (Math.random() * 5.0D) - 2;
            if (class460.field6807 < -16) {
                class460.field6807 = -16;
            }
            if (class460.field6807 > 16) {
                class460.field6807 = 16;
            }
            class460.method2765(arg1, class460.field6806 >> 2 << 10, class460.field6807 >> 1);
            class460.field6804.method538(1024, 1, 256);
            class460.field6797.method1206(128, 256, 256);
            class460.field6796.method2695(4096, false);
            class64.field961.method3036(256, (byte) -128);
            class482.field7062 = 20;
        } else if (class482.field7062 == 20) {
            class334.method2032(-28, true);
            class460.method2764(arg2, class460.field6806, class460.field6807);
            class482.field7062 = 60;
            class334.method2032(121, true);
            class457.method2742(0);
        } else if (class482.field7062 == 60) {
            if (class460.field6802.method2948(class460.field6800.field1576 + "_staticelements", (byte) 33)) {
                if (!class460.field6802.method2925(4, class460.field6800.field1576 + "_staticelements")) {
                    return;
                }
                class460.field6805 = class243.method1630((byte) 82, class460.field6800.field1576 + "_staticelements", class410.field6174, class460.field6802);
            } else {
                class460.field6805 = new class28(0);
            }
            class460.method2757();
            class482.field7062 = 70;
            class334.method2032(125, true);
            class457.method2742(0);
        } else if (class482.field7062 == 70) {
            class390.field5881 = new class362(arg2, 11, true, class364.field5570);
            class482.field7062 = 73;
            class334.method2032(115, true);
            class457.method2742(0);
        } else if (class482.field7062 == 73) {
            class321.field4599 = new class362(arg2, 12, true, class364.field5570);
            class482.field7062 = 76;
            class334.method2032(106, true);
            class457.method2742(0);
        } else if (class482.field7062 == 76) {
            class123.field1868 = new class362(arg2, 14, true, class364.field5570);
            class482.field7062 = 79;
            class334.method2032(-9, true);
            class457.method2742(0);
        } else if (class482.field7062 == 79) {
            class115.field1735 = new class362(arg2, 17, true, class364.field5570);
            class482.field7062 = 82;
            class334.method2032(-81, true);
            class457.method2742(0);
        } else if (class482.field7062 == 82) {
            class209.field3010 = new class362(arg2, 19, true, class364.field5570);
            class482.field7062 = 85;
            class334.method2032(-124, true);
            class457.method2742(0);
        } else if (class482.field7062 == 85) {
            class186.field2767 = new class362(arg2, 22, true, class364.field5570);
            class482.field7062 = 88;
            class334.method2032(105, true);
            class457.method2742(0);
        } else if (class482.field7062 == 88) {
            class291.field4173 = new class362(arg2, 26, true, class364.field5570);
            class482.field7062 = 91;
            class334.method2032(-83, true);
            class457.method2742(0);
        } else {
            class402.field6045 = new class362(arg2, 30, true, class364.field5570);
            class482.field7062 = 100;
            class334.method2032(-117, true);
            class457.method2742(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 379)
    public static final void method316(int arg0) {
        field804++;
        if (arg0 != 0) {
            method312(105, -120);
        }
        for (class278 var1 = (class278) class422.field6338.method816(arg0 + 119); var1 != null; var1 = (class278) class422.field6338.method812(94)) {
            if (var1.field4004 > 0) {
                var1.field4004--;
            }
            if (var1.field4004 != 0) {
                if (var1.field4005 > 0) {
                    var1.field4005--;
                }
                if (var1.field4005 == 0 && var1.field4008 >= 1 && var1.field4002 >= 1 && var1.field4008 <= (class30.field323 - 2) && var1.field4002 <= class182.field2661 - 2 && (var1.field4006 < 0 || class121.method794(var1.field4012, arg0 + 16384, var1.field4006))) {
                    class474.method2829(arg0 + 123, var1.field4016, -1, var1.field4012, var1.field4015, var1.field4002, var1.field4006, var1.field4008, var1.field4014);
                    var1.field4005 = -1;
                    if (var1.field4010 == var1.field4006 && var1.field4010 == -1) {
                        var1.method2049(arg0 - 51);
                    } else if (var1.field4010 == var1.field4006 && var1.field4014 == var1.field4007 && var1.field4012 == var1.field4009) {
                        var1.method2049(-79);
                    }
                }
            } else if (var1.field4010 < 0 || class121.method794(var1.field4009, arg0 ^ 0x4000, var1.field4010)) {
                class474.method2829(118, var1.field4016, -1, var1.field4009, var1.field4015, var1.field4002, var1.field4010, var1.field4008, var1.field4007);
                var1.method2049(-117);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljd;IIII)V", line = 433)
    public static final void method317(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class23.method147(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class361.field5554) {
            class23.method147(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class23.method147(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class484.field7096) {
            class23.method147(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class484.field7096) {
            class23.method147(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class361.field5554 && arg4 <= class484.field7096) {
            class23.method147(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class23.method147(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class361.field5554 && arg4 > 0) {
            class23.method147(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}
