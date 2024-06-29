import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class161 extends class89 {

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lhh;")
    public static class163 field2948 = class137.method1065("Standort", 17);

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Loj;")
    public static class17 field2949 = new class17(500);

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lhh;")
    public static class163 field2955 = class137.method1065("(U0a )2 in: ", 17);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Z")
    public static boolean field2956 = false;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lhh;")
    public static class163 field2957 = class137.method1065("Musik)2Engine vorbereitet)3", 17);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lvf;")
    public static class71 field2954;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[[[I")
    public static int[][][] field2958;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static final void method1176(boolean arg0) {
        field2950++;
        if (arg0 || class31.field481 == 0) {
            return;
        }
        try {
            if ((++class58.field955) > 2000) {
                if (class188.field3443 != null) {
                    class188.field3443.method1724(!arg0);
                    class188.field3443 = null;
                }
                if (class75.field1403 >= 1) {
                    class244.field4321 = -5;
                    class31.field481 = 0;
                    return;
                }
                class31.field481 = 1;
                if (class256.field4492 == class243.field4295) {
                    class243.field4295 = class256.field4483;
                } else {
                    class243.field4295 = class256.field4492;
                }
                class58.field955 = 0;
                class75.field1403++;
            }
            if (class31.field481 == 1) {
                class39.field650 = class169.field3090.method1245(false, class243.field4295, class129.field2514);
                class31.field481 = 2;
            }
            if (class31.field481 == 2) {
                if (class39.field650.field3566 == 2) {
                    throw new IOException();
                }
                if (class39.field650.field3566 != 1) {
                    return;
                }
                class188.field3443 = new class255((Socket) class39.field650.field3563, class169.field3090);
                class39.field650 = null;
                class188.field3443.method1729(class191.field3499.field1562, class191.field3499.field1541, 0, 5000);
                if (class59.field973 != null) {
                    class59.field973.method428(25297);
                }
                if (class253.field4431 != null) {
                    class253.field4431.method428(25297);
                }
                int var1 = class188.field3443.method1730(false);
                if (class59.field973 != null) {
                    class59.field973.method428(25297);
                }
                if (class253.field4431 != null) {
                    class253.field4431.method428(25297);
                }
                if (var1 != 21) {
                    class31.field481 = 0;
                    class244.field4321 = var1;
                    class188.field3443.method1724(true);
                    class188.field3443 = null;
                    return;
                }
                class31.field481 = 3;
            }
            if (class31.field481 == 3) {
                if (class188.field3443.method1725(false) < 1) {
                    return;
                }
                class254.field4447 = new class163[class188.field3443.method1730(false)];
                class31.field481 = 4;
            }
            if (class31.field481 == 4 && class188.field3443.method1725(arg0) >= class254.field4447.length * 8) {
                class33.field502.field1541 = 0;
                class188.field3443.method1727(class33.field502.field1562, (byte) -96, class254.field4447.length * 8, 0);
                for (int var2 = 0; var2 < class254.field4447.length; var2++) {
                    class254.field4447[var2] = class12.method76(class33.field502.method652(32767), (byte) 105);
                }
                class31.field481 = 0;
                class244.field4321 = 21;
                class188.field3443.method1724(true);
                class188.field3443 = null;
            }
        } catch (IOException var3) {
            if (class188.field3443 != null) {
                class188.field3443.method1724(true);
                class188.field3443 = null;
            }
            if (class75.field1403 < 1) {
                class31.field481 = 1;
                class58.field955 = 0;
                if (class256.field4492 == class243.field4295) {
                    class243.field4295 = class256.field4483;
                } else {
                    class243.field4295 = class256.field4492;
                }
                class75.field1403++;
            } else {
                class244.field4321 = -4;
                class31.field481 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
    public static final void method1177(int arg0, int arg1) {
        field2951++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class23.field375[arg0];
        int var3 = class213.field3882[arg0];
        int var4 = class4.field76[arg0];
        long var5 = class51.field860[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var7 = (int) class51.field860[arg0];
        if (var4 == 12) {
            class191.field3499.method75(63, 26);
            class74.field1387++;
            class191.field3499.method624((byte) 109, var3);
            class191.field3499.method616(-8618, var7);
            class191.field3499.method646(var2, 128);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 116, var3);
            class32.field494 = var2;
        }
        if (var4 == 58 && class18.field283 == null) {
            class181.method1327(var2, var3, (byte) 62);
            class18.field283 = class137.method1062(var2, 1, var3);
            class213.method1517((byte) 11, class18.field283);
        }
        if (var4 == 42) {
            class191.field3499.method75(153, arg1 ^ 0x6A);
            class191.field3499.method631(var7, -1);
            class134.field2600++;
            class191.field3499.method646(var2, 128);
            class191.field3499.method624((byte) 109, var3);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 127, var3);
            class32.field494 = var2;
        }
        if (var4 == 37) {
            class58.field962++;
            class191.field3499.method75(254, 25);
            class191.field3499.method616(-8618, var2);
            class191.field3499.method634(var7, 119);
            class191.field3499.method640((byte) -7, var3);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 127, var3);
            class32.field494 = var2;
        }
        if (var4 == 45) {
            class49.method348(class20.field323, var2, var3);
        }
        if (var4 == 5) {
            class126 var8 = class106.field2029[var7];
            if (var8 != null) {
                class120.field2258++;
                class239.method1652(var8.field3614[0], 2, 1, 0, 1, arg1 - 71, var8.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class65.field1104 = 2;
                class246.field4337 = class265.field4604;
                class21.field333 = 0;
                class192.field3516 = class84.field1598;
                class191.field3499.method75(233, arg1 ^ 0x6C);
                class191.field3499.method616(-8618, var7);
            }
        }
        if (var4 == 6) {
            class194.field3525++;
            boolean var9 = class239.method1652(var2, 2, 0, 0, 0, 9, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var9) {
                class239.method1652(var2, 2, 1, 0, 1, 117, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class65.field1104 = 2;
            class21.field333 = 0;
            class246.field4337 = class265.field4604;
            class192.field3516 = class84.field1598;
            class191.field3499.method75(177, 104);
            class191.field3499.method631(class62.field1035 + var2, -1);
            class191.field3499.method646(class257.field4500 + var3, 128);
            class191.field3499.method634(var7, arg1 + 125);
        }
        if (var4 == 1004) {
            class69 var11 = class124.method989((byte) 111, var3);
            if (var11 == null || var11.field1332[var2] < 100000) {
                class191.field3499.method75(175, 113);
                class136.field2632++;
                class191.field3499.method646(var7, arg1 + 128);
            } else {
                class56.method396(class145.method1101(arg1, new class163[] { class136.method1061(var11.field1332[var2], (byte) 112), class247.field4367, class120.method939(22952, var7).field1903 }), 105, class170.field3120, 0);
            }
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 113, var3);
            class32.field494 = var2;
        }
        if (var4 == 1) {
            class247.field4355++;
            class131.method1035(var3, true, var5, var2);
            class191.field3499.method75(88, arg1 ^ 0x5E);
            class191.field3499.method631(class257.field4500 + var3, arg1 + -1);
            class191.field3499.method646(class62.field1035 + var2, 128);
            class191.field3499.method634((int) (var5 >>> 32) & Integer.MAX_VALUE, 122);
        }
        if (var4 == 30) {
            class96.field1807++;
            class191.field3499.method75(37, 58);
            class191.field3499.method631(var2, -1);
            class191.field3499.method631(var7, -1);
            class191.field3499.method624((byte) 109, var3);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 118, var3);
            class32.field494 = var2;
        }
        if (var4 == 3) {
            class126 var12 = class106.field2029[var7];
            if (var12 != null) {
                class239.method1652(var12.field3614[0], 2, 1, 0, 1, 110, var12.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class179.field3249++;
                class21.field333 = 0;
                class246.field4337 = class265.field4604;
                class65.field1104 = 2;
                class192.field3516 = class84.field1598;
                class191.field3499.method75(134, 120);
                class191.field3499.method634(var7, 82);
            }
        }
        if (var4 == 49) {
            class126 var13 = class106.field2029[var7];
            if (var13 != null) {
                class239.method1652(var13.field3614[0], 2, 1, 0, 1, arg1 ^ 0x76, var13.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class65.field1104 = 2;
                class192.field3516 = class84.field1598;
                class21.field333 = 0;
                class220.field4003++;
                class246.field4337 = class265.field4604;
                class191.field3499.method75(178, 63);
                class191.field3499.method631(var7, ~arg1);
            }
        }
        if (var4 == 50 && class131.method1035(var3, true, var5, var2)) {
            class215.field3915++;
            class191.field3499.method75(0, 89);
            class191.field3499.method616(arg1 - 8618, class257.field4500 + var3);
            class191.field3499.method631(class65.field1097, arg1 - 1);
            class191.field3499.method634(class62.field1035 + var2, 110);
            class191.field3499.method634(Integer.MAX_VALUE & (int) (var5 >>> 32), -58);
            class191.field3499.method624((byte) 109, class97.field1831);
        }
        if (var4 == 17) {
            class218.method1550(-23494);
            class69 var14 = class124.method989((byte) 108, var3);
            class152.field2841 = var7;
            class81.field1524 = var2;
            class240.field4275 = var3;
            class56.field928 = 1;
            class213.method1517((byte) 11, var14);
            class187.field3420 = class145.method1101(0, new class163[] { class222.field4041, class120.method939(22952, var7).field1903, class28.field433 });
            if (class187.field3420 == null) {
                class187.field3420 = class67.field1148;
            }
            return;
        }
        if (var4 == 51) {
            class152.field2849++;
            class191.field3499.method75(78, arg1 ^ 0x1F);
            class191.field3499.method631(var2, -1);
            class191.field3499.method653(arg1 ^ 0x5698F650, var3);
            class191.field3499.method634(var7, arg1 + 77);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 118, var3);
            class32.field494 = var2;
        }
        if (var4 == 8) {
            class57.field939++;
            boolean var15 = class239.method1652(var2, 2, 0, 0, 0, arg1 ^ 0xFFFFFFC4, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var15) {
                class239.method1652(var2, 2, 1, 0, 1, 120, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class246.field4337 = class265.field4604;
            class192.field3516 = class84.field1598;
            class65.field1104 = 2;
            class21.field333 = 0;
            class191.field3499.method75(57, arg1 ^ 0x6D);
            class191.field3499.method653(arg1 ^ 0x5698F650, class97.field1831);
            class191.field3499.method631(class65.field1097, -1);
            class191.field3499.method634(var7, -83);
            class191.field3499.method634(var2 + class62.field1035, 92);
            class191.field3499.method634(class257.field4500 + var3, -106);
        }
        if (var4 == 21) {
            class126 var17 = class106.field2029[var7];
            if (var17 != null) {
                class239.method1652(var17.field3614[0], 2, 1, 0, 1, 119, var17.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class192.field3516 = class84.field1598;
                class21.field333 = 0;
                class124.field2396++;
                class246.field4337 = class265.field4604;
                class65.field1104 = 2;
                class191.field3499.method75(226, 100);
                class191.field3499.method634(var7, 74);
            }
        }
        if (var4 == 15 && class131.method1035(var3, true, var5, var2)) {
            class191.field3499.method75(182, 73);
            class191.field3499.method646(class62.field1035 + var2, 128);
            class191.field3499.method646(class81.field1524, 128);
            class123.field2351++;
            class191.field3499.method646(var3 + class257.field4500, 128);
            class191.field3499.method616(arg1 ^ 0xFFFFDE56, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class191.field3499.method640((byte) -7, class240.field4275);
            class191.field3499.method646(class152.field2841, 128);
        }
        if (var4 == 9) {
            class191.field3499.method75(238, 48);
            class216.field3938++;
            class191.field3499.method616(-8618, var7);
            class191.field3499.method653(arg1 ^ 0x5698F650, var3);
            class191.field3499.method631(var2, -1);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 115, var3);
            class32.field494 = var2;
        }
        if (var4 == 29) {
            class2 var18 = class111.field2098[var7];
            if (var18 != null) {
                class36.field607++;
                class239.method1652(var18.field3614[0], 2, 1, 0, 1, 112, var18.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class65.field1104 = 2;
                class246.field4337 = class265.field4604;
                class192.field3516 = class84.field1598;
                class21.field333 = 0;
                class191.field3499.method75(170, 107);
                class191.field3499.method634(var7, arg1 - 37);
                class191.field3499.method640((byte) -7, class240.field4275);
                class191.field3499.method616(-8618, class81.field1524);
                class191.field3499.method631(class152.field2841, -1);
            }
        }
        if (var4 == 39) {
            class2 var19 = class111.field2098[var7];
            if (var19 != null) {
                class239.method1652(var19.field3614[0], 2, 1, 0, 1, 122, var19.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class129.field2509++;
                class192.field3516 = class84.field1598;
                class65.field1104 = 2;
                class21.field333 = 0;
                class246.field4337 = class265.field4604;
                class191.field3499.method75(187, 105);
                class191.field3499.method616(-8618, var7);
            }
        }
        if (var4 == 2) {
            class197.field3560++;
            boolean var20 = class239.method1652(var2, 2, 0, 0, 0, 123, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var20) {
                class239.method1652(var2, 2, 1, 0, 1, 112, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class21.field333 = 0;
            class246.field4337 = class265.field4604;
            class65.field1104 = 2;
            class192.field3516 = class84.field1598;
            class191.field3499.method75(202, 54);
            class191.field3499.method634(class62.field1035 + var2, 82);
            class191.field3499.method634(var7, 91);
            class191.field3499.method646(class257.field4500 + var3, 128);
        }
        if (var4 == 44) {
            class191.field3499.method75(98, 33);
            class29.field456++;
            class191.field3499.method624((byte) 109, var3);
            class191.field3499.method616(-8618, var2);
            class191.field3499.method604(class97.field1831, 1543219568);
            class191.field3499.method634(class65.field1097, arg1 ^ 0x59);
        }
        if (var4 == 57) {
            class126 var22 = class106.field2029[var7];
            if (var22 != null) {
                class149.field2802++;
                class239.method1652(var22.field3614[0], 2, 1, 0, 1, 18, var22.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class192.field3516 = class84.field1598;
                class65.field1104 = 2;
                class246.field4337 = class265.field4604;
                class21.field333 = 0;
                class191.field3499.method75(114, arg1 + 46);
                class191.field3499.method631(var7, -1);
            }
        }
        if (var4 == 34) {
            class149.field2804++;
            boolean var23 = class239.method1652(var2, 2, 0, 0, 0, 15, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var23) {
                class239.method1652(var2, 2, 1, 0, 1, 113, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class192.field3516 = class84.field1598;
            class65.field1104 = 2;
            class246.field4337 = class265.field4604;
            class21.field333 = 0;
            class191.field3499.method75(6, 51);
            class191.field3499.method634(class257.field4500 + var3, arg1 ^ 0x6E);
            class191.field3499.method634(var7, 93);
            class191.field3499.method646(class62.field1035 + var2, 128);
        }
        if (var4 == 16) {
            class24.field386++;
            class191.field3499.method75(130, 94);
            class191.field3499.method604(var3, 1543219568);
            class69 var25 = class124.method989((byte) 117, var3);
            if (var25.field1289 != null && var25.field1289[0][0] == 5) {
                int var26 = var25.field1289[0][1];
                class119.field2252[var26] = 1 - class119.field2252[var26];
                class115.method920((byte) -116, var26);
            }
        }
        if (var4 == 23) {
            class2 var27 = class111.field2098[var7];
            if (var27 != null) {
                class110.field2083++;
                class239.method1652(var27.field3614[0], 2, 1, 0, 1, arg1 + 119, var27.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class192.field3516 = class84.field1598;
                class21.field333 = 0;
                class246.field4337 = class265.field4604;
                class65.field1104 = 2;
                class191.field3499.method75(10, arg1 ^ 0x45);
                class191.field3499.method646(var7, 128);
            }
        }
        if (var4 == 1001) {
            class65.field1104 = 2;
            class246.field4337 = class265.field4604;
            class21.field333 = 0;
            class192.field3516 = class84.field1598;
            class2 var28 = class111.field2098[var7];
            if (var28 != null) {
                class181 var29 = var28.field41;
                if (var29.field3329 != null) {
                    var29 = var29.method1330(-1);
                }
                if (var29 != null) {
                    class74.field1398++;
                    class191.field3499.method75(184, 26);
                    class191.field3499.method616(arg1 ^ 0xFFFFDE56, var29.field3322);
                }
            }
        }
        if (var4 == 24) {
            class209.field3793++;
            class191.field3499.method75(41, 53);
            class191.field3499.method646(var2, arg1 + 128);
            class191.field3499.method616(-8618, var7);
            class191.field3499.method640((byte) -7, class97.field1831);
            class191.field3499.method653(1452865104, var3);
            class191.field3499.method634(class65.field1097, 100);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 111, var3);
            class32.field494 = var2;
        }
        if (var4 == 1002) {
            class48.field805++;
            class131.method1035(var3, true, var5, var2);
            class191.field3499.method75(132, 56);
            class191.field3499.method631(Integer.MAX_VALUE & (int) (var5 >>> 32), -1);
            class191.field3499.method616(-8618, class62.field1035 + var2);
            class191.field3499.method634(var3 + class257.field4500, -54);
        }
        if (var4 == 38) {
            class126 var30 = class106.field2029[var7];
            if (var30 != null) {
                class85.field1609++;
                class239.method1652(var30.field3614[0], 2, 1, 0, 1, -105, var30.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class21.field333 = 0;
                class246.field4337 = class265.field4604;
                class65.field1104 = 2;
                class192.field3516 = class84.field1598;
                class191.field3499.method75(128, arg1 + 30);
                class191.field3499.method616(-8618, var7);
            }
        }
        if (var4 == 43) {
            class126 var31 = class106.field2029[var7];
            if (var31 != null) {
                class239.method1652(var31.field3614[0], 2, 1, 0, 1, 113, var31.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class246.field4337 = class265.field4604;
                class65.field1104 = 2;
                class192.field3516 = class84.field1598;
                class21.field333 = 0;
                class175.field3202++;
                class191.field3499.method75(220, 29);
                class191.field3499.method634(var7, 97);
            }
        }
        if (var4 == 14) {
            class130.field2522++;
            class191.field3499.method75(28, 53);
            class191.field3499.method646(var2, 128);
            class191.field3499.method631(var7, -1);
            class191.field3499.method604(var3, 1543219568);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 122, var3);
            class32.field494 = var2;
        }
        if (var4 == 10) {
            class2 var32 = class111.field2098[var7];
            if (var32 != null) {
                class239.method1652(var32.field3614[0], 2, 1, 0, 1, 126, var32.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class38.field639++;
                class192.field3516 = class84.field1598;
                class21.field333 = 0;
                class65.field1104 = 2;
                class246.field4337 = class265.field4604;
                class191.field3499.method75(47, arg1 ^ 0x32);
                class191.field3499.method634(var7, 125);
            }
        }
        if (var4 == 1005) {
            class21.field333 = 0;
            class192.field3516 = class84.field1598;
            class65.field1104 = 2;
            class136.field2632++;
            class246.field4337 = class265.field4604;
            class191.field3499.method75(175, 47);
            class191.field3499.method646(var7, 128);
        }
        if (var4 == 32) {
            class131.method1035(var3, true, var5, var2);
            class191.field3499.method75(122, 26);
            class191.field3499.method631(var3 + class257.field4500, ~arg1);
            class181.field3299++;
            class191.field3499.method631((int) (var5 >>> 32) & Integer.MAX_VALUE, -1);
            class191.field3499.method634(class62.field1035 + var2, 124);
        }
        if (var4 == 33) {
            class175.method1302(arg1 + 3);
        }
        if (var4 == 26) {
            class191.field3499.method75(130, 113);
            class191.field3499.method604(var3, 1543219568);
            class24.field386++;
            class69 var33 = class124.method989((byte) 119, var3);
            if (var33.field1289 != null && var33.field1289[0][0] == 5) {
                int var34 = var33.field1289[0][1];
                if (class119.field2252[var34] != var33.field1313[0]) {
                    class119.field2252[var34] = var33.field1313[0];
                    class115.method920((byte) -98, var34);
                }
            }
        }
        if (var4 == 48) {
            class126 var35 = class106.field2029[var7];
            if (var35 != null) {
                class174.field3164++;
                class239.method1652(var35.field3614[0], 2, 1, 0, 1, arg1 ^ 0xFFFFFFD2, var35.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class246.field4337 = class265.field4604;
                class21.field333 = 0;
                class65.field1104 = 2;
                class192.field3516 = class84.field1598;
                class191.field3499.method75(142, 98);
                class191.field3499.method653(1452865104, class240.field4275);
                class191.field3499.method634(var7, 100);
                class191.field3499.method616(-8618, class152.field2841);
                class191.field3499.method616(-8618, class81.field1524);
            }
        }
        if (var4 == 25) {
            class126 var36 = class106.field2029[var7];
            if (var36 != null) {
                class239.method1652(var36.field3614[0], 2, 1, 0, 1, arg1 + 40, var36.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class65.field1104 = 2;
                class21.field333 = 0;
                class14.field216++;
                class246.field4337 = class265.field4604;
                class192.field3516 = class84.field1598;
                class191.field3499.method75(121, 58);
                class191.field3499.method634(var7, -94);
            }
        }
        if (var4 == 7) {
            class179.field3250++;
            class191.field3499.method75(58, 98);
            class191.field3499.method616(-8618, var7);
            class191.field3499.method634(class152.field2841, -114);
            class191.field3499.method646(var2, 128);
            class191.field3499.method640((byte) -7, var3);
            class191.field3499.method646(class81.field1524, 128);
            class191.field3499.method624((byte) 109, class240.field4275);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 127, var3);
            class32.field494 = var2;
        }
        if (var4 == 40) {
            class259.field4533++;
            boolean var37 = class239.method1652(var2, 2, 0, 0, 0, 9, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var37) {
                class239.method1652(var2, 2, 1, 0, 1, 39, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class246.field4337 = class265.field4604;
            class21.field333 = 0;
            class192.field3516 = class84.field1598;
            class65.field1104 = 2;
            class191.field3499.method75(203, 97);
            class191.field3499.method631(var7, -1);
            class191.field3499.method616(-8618, class257.field4500 + var3);
            class191.field3499.method646(class62.field1035 + var2, 128);
        }
        if (var4 == 20) {
            class16.field232++;
            class191.field3499.method75(59, 25);
            class191.field3499.method640((byte) -7, var3);
            class191.field3499.method616(-8618, var2);
            class191.field3499.method646(var7, arg1 + 128);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 120, var3);
            class32.field494 = var2;
        }
        if (var4 == 1003) {
            class21.field333 = 0;
            class246.field4337 = class265.field4604;
            class192.field3516 = class84.field1598;
            class149.field2806++;
            class65.field1104 = 2;
            class191.field3499.method75(117, 83);
            class191.field3499.method634(var7, 88);
        }
        if (var4 == 22) {
            class160.field2939++;
            class131.method1035(var3, true, var5, var2);
            class191.field3499.method75(136, 44);
            class191.field3499.method631(Integer.MAX_VALUE & (int) (var5 >>> 32), ~arg1);
            class191.field3499.method616(-8618, class257.field4500 + var3);
            class191.field3499.method631(var2 + class62.field1035, ~arg1);
        }
        if (var4 == 28) {
            class2 var39 = class111.field2098[var7];
            if (var39 != null) {
                class32.field492++;
                class239.method1652(var39.field3614[0], 2, 1, 0, 1, arg1 - 14, var39.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class192.field3516 = class84.field1598;
                class246.field4337 = class265.field4604;
                class65.field1104 = 2;
                class21.field333 = 0;
                class191.field3499.method75(163, 95);
                class191.field3499.method624((byte) 109, class97.field1831);
                class191.field3499.method616(-8618, class65.field1097);
                class191.field3499.method631(var7, -1);
            }
        }
        if (var4 == 36) {
            class76.field1439++;
            class191.field3499.method75(133, 99);
            class191.field3499.method631(var2, arg1 - 1);
            class191.field3499.method604(var3, 1543219568);
            class191.field3499.method631(var7, -1);
            class244.field4319 = 0;
            class213.field3885 = class124.method989((byte) 110, var3);
            class32.field494 = var2;
        }
        if (var4 == 19 || var4 == 1007) {
            class169.method1260(var2, var7, var3, class60.field993[arg0], arg1 ^ 0x2E7D);
        }
        if (var4 == 41) {
            class239.field4273++;
            boolean var40 = class239.method1652(var2, 2, 0, 0, 0, arg1 - 81, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var40) {
                class239.method1652(var2, 2, 1, 0, 1, 118, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class246.field4337 = class265.field4604;
            class192.field3516 = class84.field1598;
            class65.field1104 = 2;
            class21.field333 = 0;
            class191.field3499.method75(236, 118);
            class191.field3499.method634(var7, -82);
            class191.field3499.method646(class257.field4500 + var3, 128);
            class191.field3499.method631(class62.field1035 + var2, -1);
        }
        if (var4 == 13) {
            class126 var42 = class106.field2029[var7];
            if (var42 != null) {
                class254.field4446++;
                class239.method1652(var42.field3614[0], 2, 1, 0, 1, 16, var42.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class246.field4337 = class265.field4604;
                class21.field333 = 0;
                class65.field1104 = 2;
                class192.field3516 = class84.field1598;
                class191.field3499.method75(252, 31);
                class191.field3499.method634(class65.field1097, arg1 + 124);
                class191.field3499.method640((byte) -7, class97.field1831);
                class191.field3499.method631(var7, ~arg1);
            }
        }
        if (var4 == 11) {
            class2 var43 = class111.field2098[var7];
            if (var43 != null) {
                class239.method1652(var43.field3614[0], 2, 1, 0, 1, -14, var43.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class246.field4337 = class265.field4604;
                class239.field4261++;
                class192.field3516 = class84.field1598;
                class65.field1104 = 2;
                class21.field333 = 0;
                class191.field3499.method75(115, 99);
                class191.field3499.method634(var7, -27);
            }
        }
        if (var4 == 35) {
            class168.field3081++;
            class131.method1035(var3, true, var5, var2);
            class191.field3499.method75(11, 90);
            class191.field3499.method634(class257.field4500 + var3, -112);
            class191.field3499.method634(var2 + class62.field1035, 97);
            class191.field3499.method616(arg1 - 8618, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 31) {
            class191.field3499.method75(35, 49);
            class191.field3499.method616(arg1 - 8618, var2);
            class191.field3499.method646(var7, 128);
            class191.field3499.method653(1452865104, var3);
            class244.field4319 = 0;
            class104.field2010++;
            class213.field3885 = class124.method989((byte) 110, var3);
            class32.field494 = var2;
        }
        if (var4 == 46) {
            class2 var44 = class111.field2098[var7];
            if (var44 != null) {
                class239.field4250++;
                class239.method1652(var44.field3614[0], 2, 1, 0, 1, 110, var44.field3629[0], false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                class21.field333 = 0;
                class246.field4337 = class265.field4604;
                class192.field3516 = class84.field1598;
                class65.field1104 = 2;
                class191.field3499.method75(32, 41);
                class191.field3499.method616(-8618, var7);
            }
        }
        if (var4 == 47) {
            class69 var45 = class137.method1062(var2, 1, var3);
            if (var45 != null) {
                class218.method1550(-23494);
                class181.method1328(arg1 + 3487, var3, class100.method807(4096, client.method826(var45)), var2);
                class56.field928 = 0;
                class9.field151 = class165.method1240(-1, var45);
                if (class9.field151 == null) {
                    class9.field151 = class253.field4440;
                }
                if (var45.field1240) {
                    class223.field4060 = class145.method1101(0, new class163[] { var45.field1290, class28.field433 });
                    return;
                }
                class223.field4060 = class145.method1101(0, new class163[] { class93.field1761, var45.field1246, class28.field433 });
            }
            return;
        }
        if (var4 == 4) {
            class69 var46 = class124.method989((byte) 118, var3);
            boolean var47 = true;
            if (var46.field1217 > 0) {
                var47 = class237.method1643(var46, arg1);
            }
            if (var47) {
                class191.field3499.method75(130, 34);
                class191.field3499.method604(var3, 1543219568);
                class24.field386++;
            }
        }
        if (var4 == 18) {
            boolean var48 = class239.method1652(var2, 2, 0, 0, 0, arg1 - 89, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            if (!var48) {
                class239.method1652(var2, 2, 1, 0, 1, -94, var3, false, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
            }
            class240.field4284++;
            class192.field3516 = class84.field1598;
            class65.field1104 = 2;
            class21.field333 = 0;
            class246.field4337 = class265.field4604;
            class191.field3499.method75(104, arg1 ^ 0x1A);
            class191.field3499.method634(class62.field1035 + var2, arg1 ^ 0x56);
            class191.field3499.method616(-8618, class152.field2841);
            class191.field3499.method634(var3 + class257.field4500, 101);
            class191.field3499.method604(class240.field4275, arg1 ^ 0x5BFBA970);
            class191.field3499.method646(var7, 128);
            class191.field3499.method616(arg1 - 8618, class81.field1524);
        }
        if (class56.field928 != arg1) {
            class56.field928 = 0;
            class213.method1517((byte) 11, class124.method989((byte) 126, class240.field4275));
        }
        if (class187.field3426) {
            class218.method1550(-23494);
        }
        if (class213.field3885 != null && class244.field4319 == 0) {
            class213.method1517((byte) 11, class213.field3885);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1178(int arg0, int arg1, int arg2) {
        field2952++;
        class215 var3 = class260.method1762(116, arg2);
        int var4 = var3.field3923;
        int var5 = var3.field3914;
        int var6 = var3.field3926;
        int var7 = class157.field2897[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        if (arg1 > -65) {
            method1177(-105, -51);
        }
        class84.method676((byte) -81, var5, ~var8 & class213.field3881[var5] | var8 & arg0 << var4);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method1179(int arg0) {
        if (arg0 != 41) {
            field2954 = null;
        }
        field2955 = null;
        field2948 = null;
        field2957 = null;
        field2954 = null;
        field2958 = null;
        field2949 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2953++;
        class135[] var7 = class174.field3174;
        if (arg3 != -27203) {
            field2948 = null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class135 var9 = var7[var8];
            if (var9 != null && var9.field2612 == 2) {
                class130.method1034(arg2 >> 1, arg1, var9.field2609 * 2, (var9.field2603 - class257.field4500 << 7) + var9.field2608, arg6, 93, arg0 >> 1, (var9.field2616 - class62.field1035 << 7) + var9.field2610);
                if (class81.field1522 > -1 && (class227.field4092 % 20) < 10) {
                    class243.field4303[var9.field2602].method101(arg5 + class81.field1522 - 12, arg4 - -class225.field4077 - 28);
                }
            }
        }
    }
}
