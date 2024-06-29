import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class169 extends class232 {

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Lok;")
    private class146 field2852 = class116.field1858;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "Lok;")
    public static class146 field2847 = null;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Lld;")
    public class118 field2849;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "Lld;")
    private class118 field2857;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Loh;")
    public static class15 field2865;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 6)
    private final void method1302(boolean arg0) {
        field2861++;
        this.field2857 = new class118(this.field2849.method812(3574));
        if (arg0) {
            this.field2857 = (class118) null;
        }
        for (class101 var2 = (class101) this.field2849.method807(-58); var2 != null; var2 = (class101) this.field2849.method806(49)) {
            class101 var3 = new class101((int) var2.field2883);
            this.field2857.method805(var3, (long) var2.field1627, 64);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Z", line = 28)
    public final boolean method1303(int arg0, int arg1) {
        if (arg1 != 1) {
            return true;
        }
        field2859++;
        if (this.field2849 == null) {
            return false;
        }
        if (this.field2857 == null) {
            this.method1302(false);
        }
        class101 var3 = (class101) this.field2857.method810((byte) -114, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)Lok;", line = 54)
    public final class146 method1304(byte arg0, int arg1) {
        field2863++;
        if (this.field2849 == null) {
            return this.field2852;
        }
        if (arg0 != -96) {
            method1307(-125);
        }
        class97 var3 = (class97) this.field2849.method810((byte) -116, (long) arg1);
        return var3 == null ? this.field2852 : var3.field1580;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V", line = 87)
    public static final void method1305(boolean arg0) {
        class215.field3560.method883(arg0);
        field2864++;
        class223.field3718 = 1;
        class86.field1372 = null;
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V", line = 99)
    public static final void method1306(int arg0) {
        class198.field3297++;
        field2862++;
        if (arg0 != 0) {
            field2847 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V", line = 110)
    public static void method1307(int arg0) {
        field2865 = null;
        if (arg0 < -79) {
            field2847 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(II)I", line = 128)
    public final int method1308(int arg0, int arg1) {
        field2853++;
        if (this.field2849 == null) {
            return this.field2854;
        }
        class101 var3 = (class101) this.field2849.method810((byte) -117, (long) arg1);
        if (var3 == null) {
            return this.field2854;
        } else {
            if (arg0 < 64) {
                this.method1303(89, -99);
            }
            return var3.field1627;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILwe;I)V", line = 165)
    private final void method1309(int arg0, class47 arg1, int arg2) {
        field2851++;
        if (arg2 == 1) {
            this.field2866 = arg1.method368(78);
        } else if (arg2 == 2) {
            this.field2856 = arg1.method368(arg0 + 31356);
        } else if (arg2 == 3) {
            this.field2852 = arg1.method337(-1);
        } else if (arg2 == 4) {
            this.field2854 = arg1.method373((byte) 36);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method379(-2);
            this.field2849 = new class118(class272.method1993(var4, 109));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method373((byte) 36);
                class171 var7;
                if (arg2 == 5) {
                    var7 = new class97(arg1.method337(-1));
                } else {
                    var7 = new class101(arg1.method373((byte) 36));
                }
                this.field2849.method805(var7, (long) var6, 88);
            }
        }
        if (arg0 != -31476) {
            field2860 = 101;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLok;)Z", line = 225)
    public final boolean method1310(byte arg0, class146 arg1) {
        if (arg0 > -7) {
            return true;
        }
        field2855++;
        if (this.field2849 == null) {
            return false;
        }
        if (this.field2857 == null) {
            this.method1313(-8);
        }
        for (class190 var3 = (class190) this.field2857.method810((byte) -122, arg1.method1093(-63)); var3 != null; var3 = (class190) this.field2857.method804(1)) {
            if (var3.field3142.method1100((byte) -97, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V", line = 254)
    public static final void method1311(int arg0) {
        field2848++;
        if (class264.field4515 == 0 || class264.field4515 == 5) {
            return;
        }
        try {
            if ((++class276.field4744) > 2000) {
                if (class98.field1582 != null) {
                    class98.field1582.method284((byte) -29);
                    class98.field1582 = null;
                }
                if (class13.field248 >= 1) {
                    class264.field4515 = 0;
                    class101.field1633 = -5;
                    return;
                }
                class276.field4744 = 0;
                class264.field4515 = 1;
                class13.field248++;
                if (class71.field1158 == class128.field2067) {
                    class71.field1158 = class267.field4599;
                } else {
                    class71.field1158 = class128.field2067;
                }
            }
            if (class264.field4515 == 1) {
                class78.field1248 = class232.field3876.method931(class17.field343, (byte) 43, class71.field1158);
                class264.field4515 = 2;
            }
            if (class264.field4515 == 2) {
                if (class78.field1248.field4265 == 2) {
                    throw new IOException();
                }
                if (class78.field1248.field4265 != 1) {
                    return;
                }
                class98.field1582 = new class40((Socket) class78.field1248.field4269, class232.field3876);
                class78.field1248 = null;
                long var1 = class116.field1862 = class161.field2734.method1123(-13726);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class47.field820.field857 = 0;
                class47.field820.method332(14, 82);
                class47.field820.method332(var3, 109);
                class98.field1582.method279(122, 0, 2, class47.field820.field860);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                int var4 = class98.field1582.method280((byte) -36);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                if (var4 != 0) {
                    class101.field1633 = var4;
                    class264.field4515 = 0;
                    class98.field1582.method284((byte) 77);
                    class98.field1582 = null;
                    return;
                }
                class264.field4515 = 3;
            }
            if (class264.field4515 == 3) {
                if (class98.field1582.method288(arg0 ^ 0x403) < 8) {
                    return;
                }
                class98.field1582.method277(client.field4080.field860, -127, 8, 0);
                client.field4080.field857 = 0;
                class80.field1276 = client.field4080.method329((byte) -118);
                class47.field820.field857 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class80.field1276 >> 32), (int) class80.field1276 };
                class47.field820.method332(10, 116);
                class47.field820.method387(var5[0], 92);
                class47.field820.method387(var5[1], 78);
                class47.field820.method387(var5[2], arg0 ^ 0x469);
                class47.field820.method387(var5[3], 80);
                class47.field820.method359(class161.field2734.method1123(-13726), arg0 - 899);
                class47.field820.method339(-96, class161.field2715);
                class47.field820.method358(class318.field5373, (byte) 105, class118.field1895);
                class277.field4751.field857 = 0;
                if (class238.field3973 == 40) {
                    class277.field4751.method332(18, 115);
                } else {
                    class277.field4751.method332(16, 84);
                }
                class277.field4751.method361(159 - (-class47.field820.field857 - class62.method479(-128, class139.field2318)), arg0 + 1635553093);
                class277.field4751.method387(528, arg0 ^ 0x470);
                class277.field4751.method332(class39.field694, 83);
                class277.field4751.method332(class251.field4204 ? 1 : 0, arg0 ^ 0x446);
                class277.field4751.method332(1, arg0 - 955);
                class277.field4751.method332(class157.method1228(1), 72);
                class277.field4751.method361(class148.field2518, 1635554120);
                class277.field4751.method361(class56.field997, 1635554120);
                class277.field4751.method332(class147.field2502, 98);
                class198.method1525(class277.field4751, 24);
                class277.field4751.method339(arg0 ^ 0xFFFFFB8A, class139.field2318);
                class277.field4751.method387(class92.field1468, 92);
                class277.field4751.method387(class102.method696(-114), 88);
                class157.field2654 = true;
                class277.field4751.method361(class32.field616, 1635554120);
                class277.field4751.method387(class84.field1335.method97(arg0 ^ 0x47D), arg0 ^ 0x47A);
                class277.field4751.method387(class168.field2844.method97(119), 106);
                class277.field4751.method387(class237.field3955.method97(127), 85);
                class277.field4751.method387(class75.field1218.method97(124), 79);
                class277.field4751.method387(class313.field5333.method97(127), arg0 ^ 0x466);
                class277.field4751.method387(class280.field4807.method97(arg0 - 1067), 99);
                class277.field4751.method387(class116.field1865.method97(124), 122);
                class277.field4751.method387(class275.field4728.method97(-64), arg0 - 948);
                class277.field4751.method387(class196.field3273.method97(122), 124);
                class277.field4751.method387(class79.field1273.method97(120), 127);
                class277.field4751.method387(class280.field4810.method97(-127), 121);
                class277.field4751.method387(class144.field2406.method97(118), arg0 - 921);
                class277.field4751.method387(class283.field4843.method97(-51), 127);
                class277.field4751.method387(class269.field4619.method97(arg0 - 902), 101);
                class277.field4751.method387(class36.field668.method97(-18), 87);
                class277.field4751.method387(class96.field1556.method97(arg0 ^ 0x479), 109);
                class277.field4751.method387(class266.field4582.method97(-102), 121);
                class277.field4751.method387(class217.field3588.method97(arg0 - 1049), 82);
                class277.field4751.method387(class73.field1186.method97(-26), 127);
                class277.field4751.method387(class1.field5.method97(120), 108);
                class277.field4751.method387(class32.field621.method97(119), arg0 ^ 0x478);
                class277.field4751.method387(class210.field3474.method97(117), 98);
                class277.field4751.method387(class263.field4371.method97(-78), 123);
                class277.field4751.method387(class73.field1199.method97(-101), 100);
                class277.field4751.method387(class27.field476.method97(124), 90);
                class277.field4751.method387(class72.field1174.method97(122), 118);
                class277.field4751.method387(class266.field4572.method97(-85), 123);
                class277.field4751.method387(class81.field1294.method97(120), 99);
                class277.field4751.method372(class47.field820.field857, class47.field820.field860, (byte) -97, 0);
                class98.field1582.method279(arg0 ^ 0xFFFFFB8A, 0, class277.field4751.field857, class277.field4751.field860);
                class47.field820.method1652(var5, true);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                client.field4080.method1652(var5, true);
                class264.field4515 = 4;
            }
            if (class264.field4515 == 4) {
                if (class98.field1582.method288(arg0 ^ 0x403) < 1) {
                    return;
                }
                int var7 = class98.field1582.method280((byte) -36);
                if (var7 == 21) {
                    class264.field4515 = 7;
                } else if (var7 == 29) {
                    class264.field4515 = 10;
                } else if (var7 == 1) {
                    class264.field4515 = 5;
                    class101.field1633 = var7;
                    return;
                } else if (var7 == 2) {
                    class264.field4515 = 8;
                } else if (var7 == 15) {
                    class264.field4515 = 0;
                    class101.field1633 = var7;
                    return;
                } else if (var7 == 23 && class13.field248 < 1) {
                    class13.field248++;
                    class264.field4515 = 1;
                    class276.field4744 = 0;
                    class98.field1582.method284((byte) 125);
                    class98.field1582 = null;
                    return;
                } else {
                    class264.field4515 = 0;
                    class101.field1633 = var7;
                    class98.field1582.method284((byte) -85);
                    class98.field1582 = null;
                    return;
                }
            }
            if (class264.field4515 == 6) {
                class47.field820.field857 = 0;
                class47.field820.method1656(17, arg0 ^ 0x413);
                class98.field1582.method279(127, 0, class47.field820.field857, class47.field820.field860);
                class264.field4515 = 4;
                return;
            }
            if (class264.field4515 == 7) {
                if (class98.field1582.method288(0) < 1) {
                    return;
                }
                class182.field3053 = class98.field1582.method280((byte) -36) * 60 + 180;
                class264.field4515 = 0;
                class101.field1633 = 21;
                class98.field1582.method284((byte) -48);
                class98.field1582 = null;
                return;
            }
            if (class264.field4515 == 10) {
                if (class98.field1582.method288(0) < 1) {
                    return;
                }
                class92.field1464 = class98.field1582.method280((byte) -36);
                class264.field4515 = 0;
                class101.field1633 = 29;
                class98.field1582.method284((byte) -48);
                class98.field1582 = null;
                return;
            }
            if (class264.field4515 == 8) {
                if (class98.field1582.method288(0) < 14) {
                    return;
                }
                class98.field1582.method277(client.field4080.field860, arg0 ^ 0xFFFFFBAF, 14, 0);
                client.field4080.field857 = 0;
                class191.field3164 = client.field4080.method368(-128);
                class14.field259 = client.field4080.method368(-116);
                class157.field2653 = client.field4080.method368(51) == 1;
                class158.field2675 = client.field4080.method368(79) == 1;
                class275.field4729 = client.field4080.method368(arg0 - 1126) == 1;
                class287.field4925 = client.field4080.method368(-94) == 1;
                class320.field5479 = client.field4080.method368(106) == 1;
                class161.field2730 = client.field4080.method379(-2);
                class248.field4119 = client.field4080.method368(-110) == 1;
                class202.field3366 = client.field4080.method368(76) == 1;
                class18.method137(true, class202.field3366);
                class135.method997(-21623, class202.field3366);
                if (!class251.field4204) {
                    if ((!class157.field2653 || class275.field4729) && !class248.field4119) {
                        try {
                            class107.field1740.method1084(-116, class232.field3876.field2162);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class185.field3097.method1084(-48, class232.field3876.field2162);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class199.field3331 = client.field4080.method1649((byte) 127);
                class46.field781 = client.field4080.method379(-2);
                class264.field4515 = 9;
            }
            if (arg0 != 1027) {
                field2860 = -70;
            }
            if (class264.field4515 == 9) {
                if (class98.field1582.method288(0) < class46.field781) {
                    return;
                }
                client.field4080.field857 = 0;
                class98.field1582.method277(client.field4080.field860, arg0 ^ 0x42D, class46.field781, 0);
                class101.field1633 = 2;
                class264.field4515 = 0;
                class118.method803(0);
                class273.field4707 = -1;
                class104.method710(false, (byte) -8);
                class199.field3331 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class98.field1582 != null) {
                class98.field1582.method284((byte) 97);
                class98.field1582 = null;
            }
            if (class13.field248 >= 1) {
                class264.field4515 = 0;
                class101.field1633 = -4;
            } else {
                class264.field4515 = 1;
                if (class71.field1158 == class128.field2067) {
                    class71.field1158 = class267.field4599;
                } else {
                    class71.field1158 = class128.field2067;
                }
                class276.field4744 = 0;
                class13.field248++;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwe;I)V", line = 630)
    public final void method1312(class47 arg0, int arg1) {
        if (arg1 < 106) {
            this.method1308(32, -80);
        }
        field2858++;
        while (true) {
            int var3 = arg0.method368(51);
            if (var3 == 0) {
                return;
            }
            this.method1309(-31476, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "(I)V", line = 655)
    private final void method1313(int arg0) {
        field2850++;
        this.field2857 = new class118(this.field2849.method812(3574));
        if (arg0 != -8) {
            this.field2854 = 23;
        }
        for (class97 var2 = (class97) this.field2849.method807(-43); var2 != null; var2 = (class97) this.field2849.method806(124)) {
            class190 var3 = new class190(var2.field1580, (int) var2.field2883);
            this.field2857.method805(var3, var2.field1580.method1093(-59), 69);
        }
    }
}
