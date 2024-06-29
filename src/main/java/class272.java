import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class272 {

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Z")
    public static boolean field4668 = false;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lok;")
    public static class146 field4667 = class235.method1724(-12908, "<br>");

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4671 = -1;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lok;")
    public static class146 field4665 = class235.method1724(-12908, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4672 = 0;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lok;")
    public static class146 field4666 = class235.method1724(-12908, "Card:");

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1990(byte arg0) {
        field4673++;
        if (!class295.field4998) {
            if (class124.field2029 != 0) {
                class250.field4183 = class218.field3612;
                class263.field4372 = class258.field4295;
            } else if (class251.field4203 == 0) {
                class263.field4372 = class232.field3875;
                class250.field4183 = class316.field5368;
            } else {
                class263.field4372 = class120.field1974;
                class250.field4183 = class215.field3542;
            }
            class45.field763 = 1;
            class21.field405[0] = client.field4085;
            class224.field3739[0] = 1001;
            class227.field3782[0] = class187.field3118;
            class214.field3525[0] = class161.field2740;
        }
        if (class236.field3943 != -1) {
            class274.method2000(class236.field3943, false);
        }
        for (int var1 = 0; var1 < class227.field3783; var1++) {
            if (class14.field264[var1]) {
                class269.field4623[var1] = true;
            }
            class79.field1270[var1] = class14.field264[var1];
            class14.field264[var1] = false;
        }
        if (arg0 < 99) {
            method1992(20, -78);
        }
        class51.field927 = null;
        class190.field3141 = -1;
        if (class271.field4640) {
            class189.field3125 = true;
        }
        class295.field5004 = null;
        class25.field437 = -1;
        class7.field167 = class203.field3385;
        if (class236.field3943 != -1) {
            class227.field3783 = 0;
            class278.method2023(-1, 0, -1412584499, 0, 0, class148.field2518, class236.field3943, 0, class56.field997);
        }
        if (class271.field4640) {
            class131.method976();
        } else {
            class181.method1422();
        }
        class264.method1916((byte) -36);
        if (class295.field4998) {
            if (class177.field3003) {
                class140.method1036(-72);
            } else {
                class302.method2137(18);
            }
        } else if (class295.field5004 != null) {
            class213.method1592(class19.field372, class295.field5004, class17.field350, true);
        } else if (class190.field3141 != -1) {
            class213.method1592(class190.field3141, (class264) null, class25.field437, true);
        }
        int var2 = class295.field4998 ? -1 : class89.method619(-3);
        if (var2 == -1) {
            var2 = class60.field1027;
        }
        class196.method1516(var2, false);
        if (class85.field1351 == 1) {
            class85.field1351 = 2;
        }
        if (class192.field3193 == 1) {
            class192.field3193 = 2;
        }
        if (class150.field2556 == 3) {
            for (int var3 = 0; var3 < class227.field3783; var3++) {
                if (class79.field1270[var3]) {
                    if (class271.field4640) {
                        class131.method974(class175.field2922[var3], class298.field5068[var3], class91.field1442[var3], class52.field952[var3], 16711935, 128);
                    } else {
                        class181.method1428(class175.field2922[var3], class298.field5068[var3], class91.field1442[var3], class52.field952[var3], 16711935, 128);
                    }
                } else if (class269.field4623[var3]) {
                    if (class271.field4640) {
                        class131.method974(class175.field2922[var3], class298.field5068[var3], class91.field1442[var3], class52.field952[var3], 16711680, 128);
                    } else {
                        class181.method1428(class175.field2922[var3], class298.field5068[var3], class91.field1442[var3], class52.field952[var3], 16711680, 128);
                    }
                }
            }
        }
        class185.method1451(class203.field3387, (byte) -110, class102.field1639.field5380, class102.field1639.field5409, class214.field3534);
        class214.field3534 = 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 149)
    public static void method1991(int arg0) {
        if (arg0 != 4957) {
            method1991(107);
        }
        field4666 = null;
        field4665 = null;
        field4667 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Z", line = 184)
    public static final boolean method1992(int arg0, int arg1) {
        field4663++;
        if (class279.field4786[arg1]) {
            return true;
        } else if (class160.field2711.method102(0, arg1)) {
            int var2 = class160.field2711.method95(64, arg1);
            if (var2 == 0) {
                class279.field4786[arg1] = true;
                return true;
            }
            if (class92.field1459[arg1] == null) {
                class92.field1459[arg1] = new class264[var2];
            }
            if (arg0 != 2306) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class92.field1459[arg1][var3] == null) {
                    byte[] var4 = class160.field2711.method92(arg1, arg0 - 2306, var3);
                    if (var4 != null) {
                        class264 var5 = class92.field1459[arg1][var3] = new class264();
                        var5.field4461 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1906(new class47(var4), arg0 - 2420);
                        } else {
                            var5.method1912(true, new class47(var4));
                        }
                    }
                }
            }
            class279.field4786[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)I", line = 242)
    public static final int method1993(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field4670++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 < 100) {
            return -30;
        } else {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }
}
