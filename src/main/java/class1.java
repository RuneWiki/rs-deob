import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field6 = 0;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public int field18 = 0;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lod;")
    public static class101 field3 = class46.method335(-65, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lod;")
    private static class101 field10 = class46.method335(-98, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lod;")
    public static class101 field2 = field10;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lsa;")
    public static class126 field1;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lh;")
    public class49 field15;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lh;")
    public class49 field9;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
    public static final void method1(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class40.field959; var2++) {
            class62 var3 = class18.field376[class73.field1586[var2]];
            int var4 = (class73.field1586[var2] << 14) + 536870912;
            if (var3 != null && var3.method95(-21094) && arg1 == var3.field1374.field2534 && var3.field1374.method875(73)) {
                int var5 = var3.field1341 >> 7;
                int var6 = var3.field1298 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1334 == 1 && (var3.field1341 & 0x7F) == 64 && (var3.field1298 & 0x7F) == 64) {
                        if (class28.field754[var5][var6] == class150.field3444) {
                            continue;
                        }
                        class28.field754[var5][var6] = class150.field3444;
                    }
                    if (!var3.field1374.field2518) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class33.field857.method587(class95.field2040, var3.field1341, var3.field1298, class65.method449((var3.field1334 - 1) * 64 + var3.field1298, var3.field1341 - (-(var3.field1334 * 64) + 64), class95.field2040, true), var3.field1334 * 64 + 60 - 64, var3, var3.field1310, var4, var3.field1309);
                }
            }
        }
        if (arg0 == -1320915417) {
            field14++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        field10 = null;
        field3 = null;
        field2 = null;
        field1 = null;
        if (arg0 != -2) {
            field2 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLjb;B)V")
    public static final void method3(boolean arg0, class64 arg1, byte arg2) {
        if (class13.field283 != null) {
            try {
                class13.field283.method444((byte) -110);
            } catch (Exception var8) {
            }
            class13.field283 = null;
        }
        field12++;
        if (arg2 >= -5) {
            field2 = null;
        }
        class13.field283 = arg1;
        class17.method136(arg0, 2);
        class40.field945 = null;
        class142.field3278 = null;
        class126.field2806 = 0;
        class3.field51.field3175 = 0;
        while (true) {
            class87 var3 = (class87) class157.field3602.method1142((byte) -102);
            if (var3 == null) {
                while (true) {
                    class87 var4 = (class87) class29.field766.method1142((byte) -74);
                    if (var4 == null) {
                        if (class8.field117 != 0) {
                            try {
                                class138 var5 = new class138(4);
                                var5.method1101(4, (byte) -32);
                                var5.method1101(class8.field117, (byte) -32);
                                var5.method1068(0, 28588);
                                class13.field283.method442(4, -108, 0, var5.field3213);
                            } catch (IOException var7) {
                                try {
                                    class13.field283.method444((byte) 107);
                                } catch (Exception var6) {
                                }
                                class6.field82++;
                                class13.field283 = null;
                            }
                        }
                        class94.field2030 = 0;
                        class67.field1521 = class10.method47(18889);
                        return;
                    }
                    class67.field1504.method684(var4, (byte) 63);
                    class119.field2617.method1137((byte) -89, var4.field2723, var4);
                    class35.field901++;
                    class121.field2655--;
                }
            }
            class46.field1089.method1137((byte) -89, var3.field2723, var3);
            class87.field1911--;
            class112.field2417++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method4(byte arg0) {
        class81.field1736 = false;
        class10.field152 = false;
        if (arg0 < -98) {
            field11++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method5(int arg0, int arg1) {
        field8++;
        class156.method1211((byte) -115);
        class143.method1140(2048);
        int var2 = class129.method999(125, arg1).field888;
        if (arg0 == var2) {
            return;
        }
        int var3 = class63.field1388[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class124.method949(0.9D);
                ((class118) class124.field2720).method887(0.9D, 0);
            }
            if (var3 == 2) {
                class124.method949(0.8D);
                ((class118) class124.field2720).method887(0.8D, 0);
            }
            if (var3 == 3) {
                class124.method949(0.7D);
                ((class118) class124.field2720).method887(0.7D, 0);
            }
            if (var3 == 4) {
                class124.method949(0.6D);
                ((class118) class124.field2720).method887(0.6D, 0);
            }
            class39.method294(14016);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class80.field1693 != var4) {
                if (class80.field1693 == 0 && class26.field680 != -1) {
                    class7.method33(class26.field680, 0, (byte) -97, false, class12.field245, var4);
                    class155.field3569 = false;
                } else if (var4 == 0) {
                    class140.method1122(true);
                    class155.field3569 = false;
                } else {
                    class86.method621(arg0 - 1, var4);
                }
                class80.field1693 = var4;
            }
        }
        if (var2 == 5) {
            client.field482 = var3;
        }
        if (var2 == 9) {
            class105.field2268 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class145.field3332 = 127;
            }
            if (var3 == 1) {
                class145.field3332 = 96;
            }
            if (var3 == 2) {
                class145.field3332 = 64;
            }
            if (var3 == 3) {
                class145.field3332 = 32;
            }
            if (var3 == 4) {
                class145.field3332 = 0;
            }
        }
        if (var2 == 6) {
            class144.field3323 = var3;
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class52.field1197 = 127;
        }
        if (var3 == 1) {
            class52.field1197 = 96;
        }
        if (var3 == 2) {
            class52.field1197 = 64;
        }
        if (var3 == 3) {
            class52.field1197 = 32;
        }
        if (var3 == 4) {
            class52.field1197 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILc;Lc;Lc;Lc;)V")
    public static final void method6(int arg0, class15 arg1, class15 arg2, class15 arg3, class15 arg4) {
        class35.field892 = arg2;
        class44.field1047 = arg1;
        class148.field3373 = arg4;
        class82.field1787 = arg3;
        if (arg0 != -30734) {
            field10 = null;
        }
        class100.field2161 = new class126[class35.field892.method106(66)][];
        class67.field1501 = new boolean[class35.field892.method106(arg0 ^ 0x7870)];
        field17++;
    }
}
