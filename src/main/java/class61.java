import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class61 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    public boolean field1033 = true;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
    public static volatile boolean field1035 = true;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field1037 = 50;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lcf;")
    public static class93 field1025 = class147.method1066("OK", -48);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lcd;")
    public static class27 field1034;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lcf;")
    public static class93 field1032;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIBI)V")
    public static final void method381(int arg0, int arg1, byte arg2, int arg3) {
        class93 var4 = class130.method949((byte) -77, new class93[] { class82.field1509, class148.method1067(-7015, arg0), class218.field3974, class148.method1067(-7015, arg1 >> 6), class218.field3974, class148.method1067(-7015, arg3 >> 6), class218.field3974, class148.method1067(-7015, arg1 & 0x3F), class218.field3974, class148.method1067(-7015, arg3 & 0x3F) });
        field1031++;
        var4.method683(-87);
        class164.method1186(var4, (byte) 21);
        if (arg2 <= 11) {
            method388(40, (class177) null, (class177) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method382(int arg0) {
        field1032 = null;
        field1025 = null;
        if (arg0 != -244) {
            field1037 = -77;
        }
        field1034 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public static final void method383(int arg0, int arg1, int arg2) {
        field1039++;
        if (class146.method1062((byte) -103, arg0)) {
            class78.method542(arg2, class6.field82[arg0], 0);
            if (arg1 != 73) {
                method381(-17, 6, (byte) 47, 32);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static final void method384(boolean arg0) {
        field1038++;
        if (class164.field2886 == null) {
            return;
        }
        if (class144.field2499 < 10) {
            if (!class9.field130.method1286((byte) 77, class164.field2886.field2773)) {
                class144.field2499 = class148.field2609.method1276(class164.field2886.field2773, -77) / 10;
                return;
            }
            class209.method1469(arg0);
            class144.field2499 = 10;
        }
        if (class144.field2499 == 10) {
            if (class164.field2886.field2770 == 37) {
                class105.field1823 = 3.0F;
                class178.field3134 = 3.0F;
            } else if (class164.field2886.field2770 == 50) {
                class105.field1823 = 4.0F;
                class178.field3134 = 4.0F;
            } else if (class164.field2886.field2770 == 75) {
                class105.field1823 = 6.0F;
                class178.field3134 = 6.0F;
            } else if (class164.field2886.field2770 == 100) {
                class105.field1823 = 8.0F;
                class178.field3134 = 8.0F;
            } else if (class164.field2886.field2770 == 200) {
                class105.field1823 = 16.0F;
                class178.field3134 = 16.0F;
            } else {
                class105.field1823 = 8.0F;
                class178.field3134 = 8.0F;
            }
            class76.field1404 = class164.field2886.field2772 >> 6 << 6;
            class183.field3373 = (class164.field2886.field2783 >> 6 << 6) + 64 - class76.field1404;
            class251.field4518 = class164.field2886.field2782 >> 6 << 6;
            int var1 = class229.field4111 + (class166.field2927.field3868 >> 7) - class251.field4518;
            class148.field2599 = (class164.field2886.field2784 >> 6 << 6) + 64 - class251.field4518;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class183.field3373 - (class4.field52 + (class166.field2927.field3784 >> 7) + 1 - class76.field1404);
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class148.field2599 && var4 >= 0 && class183.field3373 > var4) {
                class154.field2700 = var4;
                class71.field1287 = var2;
            } else {
                class154.field2700 = class183.field3373 + class76.field1404 - (class164.field2886.field2786 * 64) - 1;
                class71.field1287 = class164.field2886.field2780 * 64 - class251.field4518;
            }
            class287.method1967(84);
            int var5 = class183.field3373 >> 6;
            int var6 = class18.field232 >> 2 << 10;
            int var7 = class148.field2599 >> 6;
            class151.field2652 = new int[var7][var5][];
            class180.field3174 = new int[var7][var5][];
            class212.field3896 = new byte[var7][var5][];
            class159.field2810 = new int[class141.field2455 + 1];
            class232.field4143 = new byte[var7][var5][];
            class74.field1351 = new byte[var7][var5][];
            class37.field558 = new byte[var7][var5][];
            class69.field1263 = new int[var7][var5][];
            int var8 = class11.field144 >> 1;
            class257.field4632 = new byte[var7][var5][];
            class237.method1618(var8, var6, 101);
            class144.field2499 = 20;
        } else if (class144.field2499 == 20) {
            class165.method1192(0, new class280(class9.field130.method1278(class270.field4814, arg0, class164.field2886.field2773)));
            class144.field2499 = 30;
            class145.method1055(true, (byte) -68);
            class110.method788((byte) -90);
        } else if (class144.field2499 == 30) {
            class120.method890(new class280(class9.field130.method1278(class35.field551, false, class164.field2886.field2773)), (byte) -120);
            class144.field2499 = 40;
            class110.method788((byte) -124);
        } else if (class144.field2499 == 40) {
            class117.method865(122, new class280(class9.field130.method1278(class109.field1860, false, class164.field2886.field2773)));
            class144.field2499 = 50;
            class110.method788((byte) 10);
        } else if (class144.field2499 == 50) {
            class153.method1095(-10052, new class280(class9.field130.method1278(class47.field764, false, class164.field2886.field2773)));
            class144.field2499 = 60;
            class145.method1055(true, (byte) -128);
            class110.method788((byte) 54);
        } else if (class144.field2499 == 60) {
            if (class9.field130.method1275((byte) -118, class130.method949((byte) -77, new class93[] { class164.field2886.field2773, class119.field2113 }))) {
                if (!class9.field130.method1286((byte) 36, class130.method949((byte) -77, new class93[] { class164.field2886.field2773, class119.field2113 }))) {
                    return;
                }
                class234.field4165 = class139.method1013(71, class130.method949((byte) -77, new class93[] { class164.field2886.field2773, class119.field2113 }), class9.field130);
            } else {
                class234.field4165 = new class129(0);
            }
            class144.field2499 = 70;
            class110.method788((byte) -93);
        } else if (class144.field2499 == 70) {
            class168.field2958 = new class27(11, true, class190.field3481);
            class144.field2499 = 73;
            class145.method1055(true, (byte) -51);
            class110.method788((byte) -124);
        } else if (class144.field2499 == 73) {
            class272.field4843 = new class27(12, true, class190.field3481);
            class144.field2499 = 76;
            class145.method1055(true, (byte) -106);
            class110.method788((byte) 113);
        } else if (class144.field2499 == 76) {
            class178.field3112 = new class27(14, true, class190.field3481);
            class144.field2499 = 79;
            class145.method1055(true, (byte) -120);
            class110.method788((byte) -104);
        } else if (class144.field2499 == 79) {
            field1034 = new class27(17, true, class190.field3481);
            class144.field2499 = 82;
            class145.method1055(true, (byte) -96);
            class110.method788((byte) -90);
        } else if (!arg0) {
            if (class144.field2499 == 82) {
                class210.field3806 = new class27(19, true, class190.field3481);
                class144.field2499 = 85;
                class145.method1055(true, (byte) -122);
                class110.method788((byte) -112);
            } else if (class144.field2499 == 85) {
                class87.field1565 = new class27(22, true, class190.field3481);
                class144.field2499 = 88;
                class145.method1055(true, (byte) -48);
                class110.method788((byte) -95);
            } else if (class144.field2499 == 88) {
                class284.field5092 = new class27(26, true, class190.field3481);
                class144.field2499 = 91;
                class145.method1055(true, (byte) -106);
                class110.method788((byte) -126);
            } else {
                class203.field3659 = new class27(30, true, class190.field3481);
                class144.field2499 = 100;
                class145.method1055(true, (byte) -83);
                class110.method788((byte) -113);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method385(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1030++;
        if (class146.method1062((byte) -103, arg0)) {
            class56.method316(arg3, -1, arg2, false, class6.field82[arg0], arg4);
            if (arg1 != 19169) {
                method383(54, 34, -100);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method386(byte arg0) {
        if (arg0 < 13) {
            return;
        }
        field1042++;
        while (class250.field4504.method1565(class72.field1300, -117336381) >= 11) {
            int var1 = class250.field4504.method1569(false, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class224.field4031[var1] == null) {
                class224.field4031[var1] = new class237();
                var2 = true;
                if (class72.field1301[var1] != null) {
                    class224.field4031[var1].method1617((byte) -120, class72.field1301[var1]);
                }
            }
            class234.field4166[class252.field4543++] = var1;
            class237 var3 = class224.field4031[var1];
            var3.field3793 = class275.field4921;
            int var4 = class250.field4504.method1569(false, 1);
            int var5 = class250.field4504.method1569(false, 5);
            int var6 = class250.field4504.method1569(false, 1);
            if (var6 == 1) {
                class264.field4708[class138.field2407++] = var1;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class143.field2478[class250.field4504.method1569(false, 3)];
            if (var2) {
                var3.field3770 = var3.field3807 = var7;
            }
            int var8 = class250.field4504.method1569(false, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1614((byte) -76, class166.field2927.field3820[0] + var5, var4 == 1, class166.field2927.field3805[0] + var8);
        }
        class250.field4504.method1571(113);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Z")
    public static final boolean method387(int arg0) {
        field1028++;
        if (arg0 != 10) {
            method381(121, -34, (byte) 100, 67);
        }
        class266 var1 = class172.field3011;
        synchronized (class172.field3011) {
            if (class211.field3876 == class123.field2194) {
                return false;
            } else {
                class131.field2318 = class263.field4684[class123.field2194];
                class217.field3945 = class195.field3566[class123.field2194];
                class123.field2194 = class123.field2194 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILhg;Lhg;)V")
    public static final void method388(int arg0, class177 arg1, class177 arg2) {
        field1023++;
        if (arg0 != 73) {
            field1037 = -118;
        }
        class106.field1828 = arg1;
        class126.field2233 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1024 = arg3;
        this.field1041 = arg0;
        this.field1027 = arg4;
        this.field1029 = arg2;
        this.field1033 = arg6;
        this.field1036 = arg5;
        this.field1026 = arg1;
    }
}
