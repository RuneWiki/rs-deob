import java.awt.Frame;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class271 implements Runnable {

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[Lhm;")
    public volatile class19[] field4512 = new class19[2];

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Z")
    public volatile boolean field4511 = false;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
    public volatile boolean field4507 = false;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lqd;")
    public static class40 field4499 = class147.method1106("::breakcon", (byte) -70);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4501 = -2;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
    public static boolean field4492 = false;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[I")
    public static int[] field4498 = new int[128];

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lke;")
    public class107 field4505;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field4503;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "[[Z")
    public static boolean[][] field4502;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1873(boolean arg0) {
        if (!arg0) {
            field4501 = -44;
        }
        field4500++;
        class112.field1949++;
        class19.field295.method1464(21, 0);
        class19.field295.method218(class304.method2073((byte) 45), -19914);
        class19.field295.method209(16711680, class112.field1945);
        class19.field295.method209(16711680, class73.field1287);
        class19.field295.method218(class104.field1848, -19914);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)Lrh;", line = 32)
    public static final class130 method1874(boolean arg0) {
        field4491++;
        try {
            return arg0 ? (class130) null : (class130) Class.forName("jc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V", line = 52)
    public static final void method1875(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method1310(65, 9, arg1);
        var4.method1302(-20040);
        if (arg0 <= 20) {
            method1877(false);
        }
        var4.field2902 = arg3;
        var4.field2908 = arg2;
        field4509++;
    }

    @OriginalMember(owner = "client!ee", name = "run", descriptor = "()V", line = 67)
    public final void run() {
        field4510++;
        this.field4507 = true;
        try {
            while (!this.field4511) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class19 var2 = this.field4512[var1];
                    if (var2 != null) {
                        var2.method117(-125);
                    }
                }
                class160.method1227(10L, false);
                class147.method1109((Object) null, this.field4505, 50);
            }
        } catch (Exception var7) {
            class44.method412(var7, -14997, (String) null);
        } finally {
            this.field4507 = false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I", line = 105)
    public static final int method1876(boolean arg0) {
        field4508++;
        try {
            if (class217.field3624 == 0) {
                if (class69.method535(arg0) - 5000L < class132.field2237) {
                    return 0;
                }
                class315.field5321 = class275.field4573.method812(class120.field2040, class92.field1670, 14038);
                class292.field4877 = class69.method535(true);
                class217.field3624 = 1;
            }
            if (class292.field4877 + 30000L < class69.method535(arg0)) {
                return class296.method2026(0, 1000);
            }
            if (class217.field3624 == 1) {
                if (class315.field5321.field1258 == 2) {
                    return class296.method2026(0, 1001);
                }
                if (class315.field5321.field1258 != 1) {
                    return -1;
                }
                class140.field2369 = new class104((Socket) class315.field5321.field1260, class275.field4573);
                class315.field5321 = null;
                int var1 = 0;
                class19.field295.field478 = 0;
                if (class1.field12) {
                    var1 = class62.field1181;
                }
                class19.field295.method218(242, -19914);
                class19.field295.method239((byte) -69, var1);
                class140.field2369.method779(class19.field295.field478, 16333, 0, class19.field295.field472);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                int var2 = class140.field2369.method789((byte) 22);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                if (var2 != 0) {
                    return class296.method2026(0, var2);
                }
                class217.field3624 = 2;
            }
            if (class217.field3624 == 2) {
                if (class140.field2369.method790((byte) 66) < 2) {
                    return -1;
                }
                class292.field4888 = class140.field2369.method789((byte) 22);
                class292.field4888 <<= 0x8;
                class292.field4888 += class140.field2369.method789((byte) 22);
                class217.field3624 = 3;
                class57.field1089 = 0;
                class153.field2591 = new byte[class292.field4888];
            }
            if (class217.field3624 != 3) {
                return -1;
            }
            int var3 = class140.field2369.method790((byte) 66);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class292.field4888 - class57.field1089) {
                var3 = class292.field4888 - class57.field1089;
            }
            class140.field2369.method785(var3, class153.field2591, class57.field1089, 28016);
            class57.field1089 += var3;
            if (class57.field1089 < class292.field4888) {
                return -1;
            } else if (class72.method538(arg0, class153.field2591)) {
                class89.field1611 = new class291[class168.field2760];
                int var4 = 0;
                for (int var5 = class270.field4486; var5 <= class166.field2752; var5++) {
                    class291 var6 = class78.method579(var5, arg0);
                    if (var6 != null) {
                        class89.field1611[var4++] = var6;
                    }
                }
                class140.field2369.method784(85);
                class140.field2369 = null;
                class217.field3624 = 0;
                class153.field2591 = null;
                class92.field1665 = 0;
                class132.field2237 = class69.method535(true);
                return 0;
            } else {
                return class296.method2026(0, 1002);
            }
        } catch (IOException var8) {
            return class296.method2026(0, 1003);
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(Z)V", line = 245)
    public static void method1877(boolean arg0) {
        field4503 = null;
        field4499 = null;
        if (!arg0) {
            field4501 = -26;
        }
        field4498 = null;
        field4502 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)V", line = 266)
    public static final void method1878(int arg0, int arg1, boolean arg2) {
        field4494++;
        if (class255.field4252 < 2 && class274.field4566 == 0 && !class274.field4549) {
            return;
        }
        class40 var3;
        if (class274.field4566 == 1 && class255.field4252 < 2) {
            var3 = class153.method1192(new class40[] { class12.field207, class276.field4599, class3.field27, class263.field4408 }, (byte) 123);
        } else if (class274.field4549 && class255.field4252 < 2) {
            var3 = class153.method1192(new class40[] { class277.field4638, class276.field4599, class300.field5012, class263.field4408 }, (byte) -113);
        } else if (class132.field2243 && class251.field4162[81] && class255.field4252 > 2) {
            var3 = class108.method819(class255.field4252 - 2, (byte) 124);
        } else {
            var3 = class108.method819(class255.field4252 - 1, (byte) 123);
        }
        if (class255.field4252 > 2) {
            var3 = class153.method1192(new class40[] { var3, class81.field1427, class276.method1927((byte) -72, class255.field4252 - 2), class157.field2636 }, (byte) -51);
        }
        if (!arg2) {
            field4492 = true;
        }
        int var4 = class230.field3789.method1821(var3, arg0 + 4, arg1 - -15, 16777215, 0, class217.field3614, class128.field2200);
        class129.method958(arg1, 15, arg0 + 4, 91, class230.field3789.method1830(var3) + var4);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 310)
    public static final void method1879(int arg0, int arg1) {
        field4506++;
        if (class6.field87 == arg0) {
            return;
        }
        if (class6.field87 == 0) {
            class268.method1867(true);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 40) {
            class172.method1271(81);
        }
        if (arg0 != 40 && class285.field4802 != null) {
            class285.field4802.method784(arg1 - 17579);
            class285.field4802 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class44.field840 = 0;
            class228.field3767 = 1;
            class160.field2676 = 0;
            class94.field1704 = 1;
            class50.field961 = 0;
            class257.method1805(true, 0);
        }
        if (arg0 == 25 || arg0 == 10) {
            class89.method692(27755);
        }
        if (arg0 == 5) {
            class268.method1865(class120.field2030, false);
        } else {
            class239.method1679((byte) 109);
        }
        boolean var3 = class6.field87 == 5 || class6.field87 == 10 || class6.field87 == 28;
        if (arg1 != 17646) {
            method1878(-119, -29, true);
        }
        if (var3 != var2) {
            if (var2) {
                class217.field3611 = class29.field613;
                if (class90.field1636 == 0) {
                    class28.method273((byte) 82, 2);
                } else {
                    class211.method1485(class29.field613, 2, class199.field3189, 113, 0, 255, false);
                }
                class123.field2139.method2085((byte) -109, false);
            } else {
                class28.method273((byte) 80, 2);
                class123.field2139.method2085((byte) -66, true);
            }
        }
        if (class21.field350 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class21.method135();
        }
        class6.field87 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 394)
    public static final void method1880(byte arg0) {
        if (arg0 != -31) {
            return;
        }
        for (int var1 = 0; var1 < class177.field2923; var1++) {
            int var2 = class65.field1229[var1];
            class42 var3 = class91.field1656[var2];
            if (var3 != null) {
                class189.method1363(var3.field796.field2089, -52, var3);
            }
        }
        field4496++;
    }
}
