import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class146 extends class259 {

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Z")
    public volatile boolean field2685 = true;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "Lcc;")
    public static class209 field2688 = class95.method669(99, " <col=ffffff>");

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "[I")
    public static int[] field2689 = new int[128];

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "Lcc;")
    public static class209 field2687 = class95.method669(100, "Nehmen");

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "[Lha;")
    public static class30[] field2692 = new class30[28];

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "Lcc;")
    public static class209 field2686 = class95.method669(81, "cyan:");

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field2691 = 10;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "Z")
    public boolean field2682;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "Z")
    public boolean field2693;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)V")
    public static final void method1016(int arg0, int arg1) {
        field2684++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class52.field1032[arg0];
        int var3 = class106.field2096[arg0];
        int var4 = class40.field680[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class111.field2248[arg0];
        long var6 = class111.field2248[arg0];
        if (var4 == 13) {
            class289.field5098++;
            class84.field1677.method287((byte) 124, 244);
            class84.field1677.method767(arg1 - 1, class172.field3147);
            class84.field1677.method737(var2, (byte) 48);
            class84.field1677.method740(255, var3);
            class84.field1677.method729(class222.field4053, -2100025528);
        }
        if (var4 == 15) {
            class204.field3652++;
            class84.field1677.method287((byte) 122, 5);
            class84.field1677.method758(var2, 1469334200);
            class84.field1677.method725(28307, var5);
            class84.field1677.method725(28307, var3);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 36) {
            class181.field3267++;
            class84.field1677.method287((byte) 118, 176);
            class84.field1677.method740(255, var5);
            class84.field1677.method758(var2, 1469334200);
            class84.field1677.method725(28307, var3);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 50) {
            class249.method1732((byte) 118);
        }
        if (var4 == 30) {
            class163 var8 = class60.field1207[var5];
            if (var8 != null) {
                class253.field4555++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var8.field1567[0], 2, var8.field1548[0]);
                class159.field2895 = 2;
                class253.field4571 = class76.field1413;
                class284.field5002 = 0;
                class31.field570 = class237.field4246;
                class84.field1677.method287((byte) 123, 38);
                class84.field1677.method740(255, var5);
            }
        }
        if (var4 == 42) {
            class108 var9 = class103.field1993[var5];
            if (var9 != null) {
                class148.field2710++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var9.field1567[0], 2, var9.field1548[0]);
                class284.field5002 = 0;
                class253.field4571 = class76.field1413;
                class159.field2895 = 2;
                class31.field570 = class237.field4246;
                class84.field1677.method287((byte) 127, 216);
                class84.field1677.method725(arg1 + 28307, var5);
            }
        }
        if (var4 == 10) {
            class108 var10 = class103.field1993[var5];
            if (var10 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], arg1 ^ 0x117A, false, var10.field1567[0], 2, var10.field1548[0]);
                class277.field4881++;
                class159.field2895 = 2;
                class284.field5002 = 0;
                class31.field570 = class237.field4246;
                class253.field4571 = class76.field1413;
                class84.field1677.method287((byte) 122, 78);
                class84.field1677.method754(false, class222.field4053);
                class84.field1677.method740(255, var5);
                class84.field1677.method767(-1, class172.field3147);
            }
        }
        if (var4 == 1) {
            class37.method282(var2, var6, var3, (byte) -127);
            class74.field1393++;
            class84.field1677.method287((byte) 122, 148);
            class84.field1677.method732(128, var2 + class245.field4444);
            class84.field1677.method725(28307, var3 + class174.field3178);
            class84.field1677.method740(255, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 17 && class86.field1699 == null) {
            class191.method1314(var2, var3, arg1 + 35);
            class86.field1699 = class116.method827(var3, (byte) 61, var2);
            class126.method907(class86.field1699, 0);
        }
        if (var4 == 21) {
            class108 var11 = class103.field1993[var5];
            if (var11 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var11.field1567[0], 2, var11.field1548[0]);
                class253.field4571 = class76.field1413;
                class53.field1039++;
                class31.field570 = class237.field4246;
                class284.field5002 = 0;
                class159.field2895 = 2;
                class84.field1677.method287((byte) 126, 169);
                class84.field1677.method740(255, var5);
            }
        }
        if (var4 == 60) {
            class108 var12 = class103.field1993[var5];
            if (var12 != null) {
                class20.field387++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var12.field1567[0], 2, var12.field1548[0]);
                class31.field570 = class237.field4246;
                class284.field5002 = 0;
                class253.field4571 = class76.field1413;
                class159.field2895 = 2;
                class84.field1677.method287((byte) 118, 19);
                class84.field1677.method732(arg1 ^ 0x80, var5);
            }
        }
        if (var4 == 8) {
            class42 var13 = class116.method827(var3, (byte) 38, var2);
            if (var13 != null) {
                class70.method514((byte) 110);
                class62.method464(var3, -1673439672, class14.method108(-73, client.method1070(var13)), var2);
                class25.field445 = 0;
                class184.field3318 = class44.method330(var13, 121);
                if (class184.field3318 == null) {
                    class184.field3318 = class259.field4675;
                }
                if (!var13.field795) {
                    class44.field879 = class229.method1604(new class209[] { class19.field375, var13.field807, class173.field3157 }, (byte) 36);
                    return;
                }
                class44.field879 = class229.method1604(new class209[] { var13.field799, class173.field3157 }, (byte) 51);
            }
            return;
        }
        if (var4 == 29) {
            class108 var14 = class103.field1993[var5];
            if (var14 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var14.field1567[0], 2, var14.field1548[0]);
                class284.field5002 = 0;
                class159.field2895 = 2;
                class253.field4571 = class76.field1413;
                class235.field4229++;
                class31.field570 = class237.field4246;
                class84.field1677.method287((byte) 127, 76);
                class84.field1677.method725(28307, var5);
            }
        }
        if (var4 == 9) {
            class145.field2675++;
            class37.method282(var2, var6, var3, (byte) -95);
            class84.field1677.method287((byte) 123, 151);
            class84.field1677.method767(-1, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class84.field1677.method732(128, class245.field4444 + var2);
            class84.field1677.method732(128, var3 + class174.field3178);
        }
        if (var4 == 1004) {
            class213.field3857++;
            class253.field4571 = class76.field1413;
            class159.field2895 = 2;
            class31.field570 = class237.field4246;
            class284.field5002 = 0;
            class84.field1677.method287((byte) 126, 77);
            class84.field1677.method732(128, var5);
        }
        if (var4 == 37) {
            class163 var15 = class60.field1207[var5];
            if (var15 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var15.field1567[0], 2, var15.field1548[0]);
                class31.field570 = class237.field4246;
                class228.field4158++;
                class159.field2895 = 2;
                class253.field4571 = class76.field1413;
                class284.field5002 = 0;
                class84.field1677.method287((byte) 126, 212);
                class84.field1677.method740(255, var5);
            }
        }
        if (var4 == 32) {
            class84.field1677.method287((byte) 125, 53);
            class90.field1779++;
            class84.field1677.method725(arg1 + 28307, var3);
            class84.field1677.method767(-1, var5);
            class84.field1677.method767(~arg1, class172.field3147);
            class84.field1677.method737(class222.field4053, (byte) 48);
            class84.field1677.method758(var2, 1469334200);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 40) {
            class84.field1677.method287((byte) 123, 117);
            class59.field1187++;
            class84.field1677.method740(arg1 + 255, var5);
            class84.field1677.method725(28307, var3);
            class84.field1677.method729(var2, -2100025528);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 1006) {
            class284.field5002 = 0;
            class159.field2895 = 2;
            class253.field4571 = class76.field1413;
            class31.field570 = class237.field4246;
            class163 var16 = class60.field1207[var5];
            if (var16 != null) {
                class237 var17 = var16.field2969;
                if (var17.field4295 != null) {
                    var17 = var17.method1636(50);
                }
                if (var17 != null) {
                    class167.field3013++;
                    class84.field1677.method287((byte) 118, 21);
                    class84.field1677.method732(128, var17.field4255);
                }
            }
        }
        if (var4 == 22) {
            class163 var18 = class60.field1207[var5];
            if (var18 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], arg1 + 4474, false, var18.field1567[0], 2, var18.field1548[0]);
                class284.field5002 = 0;
                class71.field1351++;
                class159.field2895 = 2;
                class253.field4571 = class76.field1413;
                class31.field570 = class237.field4246;
                class84.field1677.method287((byte) 121, 112);
                class84.field1677.method732(arg1 ^ 0x80, var5);
            }
        }
        if (var4 == 45) {
            if (class218.field3936 == 1) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            } else {
                boolean var19 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                if (!var19) {
                    class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                }
            }
            class284.field5002 = 0;
            class31.field570 = class237.field4246;
            class159.field2895 = 2;
            class253.field4571 = class76.field1413;
            class84.field1677.method287((byte) 119, 69);
            class84.field1677.method732(arg1 ^ 0x80, var3 + class174.field3178);
            class150.field2750++;
            class84.field1677.method725(arg1 ^ 0x6E93, var5);
            class84.field1677.method767(-1, class245.field4444 + var2);
        }
        if (var4 == 6) {
            class70.method514((byte) 110);
            class42 var21 = class247.method1719(var2, arg1 ^ 0xFFFFDE25);
            class25.field445 = 1;
            class156.field2854 = var2;
            class182.field3285 = var5;
            class83.field1657 = var3;
            class126.method907(var21, 0);
            class114.field2289 = class229.method1604(new class209[] { class35.field608, class249.method1728(var5, true).field1629, class173.field3157 }, (byte) 101);
            if (class114.field2289 == null) {
                class114.field2289 = class191.field3468;
            }
            return;
        }
        if (var4 == 12) {
            class265.field4752++;
            if (class218.field3936 == 1) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            } else {
                boolean var22 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                if (!var22) {
                    class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                }
            }
            class159.field2895 = 2;
            class253.field4571 = class76.field1413;
            class284.field5002 = 0;
            class31.field570 = class237.field4246;
            class84.field1677.method287((byte) 126, 75);
            class84.field1677.method740(255, var5);
            class84.field1677.method725(28307, class245.field4444 + var2);
            class84.field1677.method767(arg1 - 1, class174.field3178 + var3);
        }
        if (var4 == 5) {
            if (class218.field3936 == 1) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], arg1 + 4474, false, var2, 2, var3);
            } else {
                boolean var24 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                if (!var24) {
                    class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                }
            }
            class31.field570 = class237.field4246;
            class159.field2895 = 2;
            class253.field4571 = class76.field1413;
            class14.field270++;
            class284.field5002 = 0;
            class84.field1677.method287((byte) 120, 236);
            class84.field1677.method725(28307, class174.field3178 + var3);
            class84.field1677.method767(~arg1, var5);
            class84.field1677.method725(28307, class245.field4444 + var2);
        }
        if (var4 == 2 && class37.method282(var2, var6, var3, (byte) -117)) {
            class84.field1677.method287((byte) 126, 217);
            class130.field2493++;
            class84.field1677.method732(128, class245.field4444 + var2);
            class84.field1677.method725(28307, class174.field3178 + var3);
            class84.field1677.method754(false, class222.field4053);
            class84.field1677.method767(arg1 - 1, class172.field3147);
            class84.field1677.method725(28307, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 58) {
            class173.field3162++;
            class84.field1677.method287((byte) 127, 243);
            class84.field1677.method758(var2, 1469334200);
            class42 var26 = class247.method1719(var2, -8667);
            if (var26.field855 != null && var26.field855[0][0] == 5) {
                int var27 = var26.field855[0][1];
                class38.field647[var27] = 1 - class38.field647[var27];
                class253.method1749((byte) 87, var27);
            }
        }
        if (var4 == 41) {
            class108 var28 = class103.field1993[var5];
            if (var28 != null) {
                class195.field3498++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var28.field1567[0], 2, var28.field1548[0]);
                class253.field4571 = class76.field1413;
                class31.field570 = class237.field4246;
                class159.field2895 = 2;
                class284.field5002 = 0;
                class84.field1677.method287((byte) 120, 46);
                class84.field1677.method740(255, var5);
            }
        }
        if (var4 == 44) {
            class108 var29 = class103.field1993[var5];
            if (var29 != null) {
                class160.field2908++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var29.field1567[0], 2, var29.field1548[0]);
                class253.field4571 = class76.field1413;
                class31.field570 = class237.field4246;
                class159.field2895 = 2;
                class284.field5002 = 0;
                class84.field1677.method287((byte) 125, 13);
                class84.field1677.method740(255, var5);
            }
        }
        if (var4 == 20) {
            class163 var30 = class60.field1207[var5];
            if (var30 != null) {
                class132.field2533++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var30.field1567[0], 2, var30.field1548[0]);
                class31.field570 = class237.field4246;
                class284.field5002 = 0;
                class253.field4571 = class76.field1413;
                class159.field2895 = 2;
                class84.field1677.method287((byte) 119, 238);
                class84.field1677.method767(arg1 - 1, class83.field1657);
                class84.field1677.method767(arg1 - 1, var5);
                class84.field1677.method732(128, class182.field3285);
                class84.field1677.method758(class156.field2854, arg1 + 1469334200);
            }
        }
        if (var4 == 24) {
            class108 var31 = class103.field1993[var5];
            if (var31 != null) {
                class83.field1665++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], arg1 ^ 0x117A, false, var31.field1567[0], 2, var31.field1548[0]);
                class253.field4571 = class76.field1413;
                class159.field2895 = 2;
                class284.field5002 = 0;
                class31.field570 = class237.field4246;
                class84.field1677.method287((byte) 119, 133);
                class84.field1677.method758(class156.field2854, arg1 + 1469334200);
                class84.field1677.method732(128, class182.field3285);
                class84.field1677.method767(-1, var5);
                class84.field1677.method740(arg1 ^ 0xFF, class83.field1657);
            }
        }
        if (var4 == 26) {
            class163 var32 = class60.field1207[var5];
            if (var32 != null) {
                class215.field3880++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var32.field1567[0], 2, var32.field1548[0]);
                class31.field570 = class237.field4246;
                class253.field4571 = class76.field1413;
                class159.field2895 = 2;
                class284.field5002 = 0;
                class84.field1677.method287((byte) 118, 100);
                class84.field1677.method725(28307, class172.field3147);
                class84.field1677.method740(255, var5);
                class84.field1677.method729(class222.field4053, arg1 ^ 0x82D42748);
            }
        }
        if (var4 == 4) {
            class108 var33 = class103.field1993[var5];
            if (var33 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var33.field1567[0], 2, var33.field1548[0]);
                class253.field4571 = class76.field1413;
                class284.field5002 = 0;
                class31.field570 = class237.field4246;
                class206.field3677++;
                class159.field2895 = 2;
                class84.field1677.method287((byte) 122, 166);
                class84.field1677.method732(128, var5);
            }
        }
        if (var4 == 51) {
            class84.field1677.method287((byte) 124, 149);
            class84.field1677.method754(false, var2);
            class198.field3542++;
            class84.field1677.method740(arg1 + 255, var5);
            class84.field1677.method767(-1, var3);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 25) {
            class241.field4346++;
            boolean var34 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], arg1 + 4474, false, var2, 2, var3);
            if (!var34) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            }
            class284.field5002 = 0;
            class159.field2895 = 2;
            class31.field570 = class237.field4246;
            class253.field4571 = class76.field1413;
            class84.field1677.method287((byte) 118, 90);
            class84.field1677.method767(-1, class174.field3178 + var3);
            class84.field1677.method740(255, class172.field3147);
            class84.field1677.method767(~arg1, class245.field4444 + var2);
            class84.field1677.method754(false, class222.field4053);
            class84.field1677.method740(arg1 ^ 0xFF, var5);
        }
        if (var4 == 31) {
            if (var5 == 0) {
                class147.method1019(class99.field1937, var3, var2);
            } else if (var5 == 1) {
                if (class198.field3550 > 0 && class228.field4153[82] && class228.field4153[81]) {
                    class227.method1593(class99.field1937, class245.field4444 + var2, class174.field3178 + var3, 66);
                } else if (class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], arg1 + 4474, true, var2, 1, var3)) {
                    class84.field1677.method773(-6385, class10.field207);
                    class84.field1677.method773(-6385, class132.field2531);
                    class84.field1677.method740(255, class253.field4565);
                    class84.field1677.method773(-6385, 57);
                    class84.field1677.method773(arg1 ^ 0xFFFFE70F, class54.field1066);
                    class84.field1677.method773(arg1 - 6385, class132.field2523);
                    class84.field1677.method773(-6385, 89);
                    class84.field1677.method740(arg1 ^ 0xFF, class223.field4069.field1571);
                    class84.field1677.method740(255, class223.field4069.field1534);
                    class84.field1677.method773(-6385, class48.field922);
                    class84.field1677.method773(-6385, 63);
                }
            }
        }
        if (var4 == 34 && class37.method282(var2, var6, var3, (byte) -98)) {
            class97.field1898++;
            class84.field1677.method287((byte) 127, 214);
            class84.field1677.method740(arg1 ^ 0xFF, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class84.field1677.method767(arg1 - 1, class83.field1657);
            class84.field1677.method767(-1, var3 + class174.field3178);
            class84.field1677.method732(128, class245.field4444 + var2);
            class84.field1677.method737(class156.field2854, (byte) 48);
            class84.field1677.method767(-1, class182.field3285);
        }
        if (var4 == 1002) {
            class37.method282(var2, var6, var3, (byte) -106);
            class117.field2345++;
            class84.field1677.method287((byte) 122, 161);
            class84.field1677.method725(28307, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class84.field1677.method725(arg1 + 28307, var3 - -class174.field3178);
            class84.field1677.method732(arg1 ^ 0x80, class245.field4444 + var2);
        }
        if (var4 == 3) {
            class84.field1677.method287((byte) 127, 178);
            class172.field3140++;
            class84.field1677.method740(255, var5);
            class84.field1677.method725(28307, var3);
            class84.field1677.method737(var2, (byte) 48);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 35) {
            class84.field1677.method287((byte) 122, 232);
            class244.field4427++;
            class84.field1677.method767(-1, var5);
            class84.field1677.method732(128, var3);
            class84.field1677.method754(false, var2);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, arg1 ^ 0xFFFFDE25);
            class45.field899 = var3;
        }
        if (var4 == 33) {
            if (class218.field3936 == 1) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            } else {
                boolean var36 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                if (!var36) {
                    class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                }
            }
            class253.field4571 = class76.field1413;
            class202.field3637++;
            class31.field570 = class237.field4246;
            class159.field2895 = 2;
            class284.field5002 = 0;
            class84.field1677.method287((byte) 119, 24);
            class84.field1677.method740(255, class174.field3178 + var3);
            class84.field1677.method725(28307, var5);
            class84.field1677.method767(-1, class245.field4444 + var2);
        }
        if (var4 == 39) {
            class42 var38 = class247.method1719(var2, -8667);
            boolean var39 = true;
            if (var38.field715 > 0) {
                var39 = class157.method1094(250, var38);
            }
            if (var39) {
                class84.field1677.method287((byte) 125, 243);
                class173.field3162++;
                class84.field1677.method758(var2, arg1 + 1469334200);
            }
        }
        if (var4 == 43 || var4 == 1003) {
            class65.method481(var2, -24377, class20.field391[arg0], var5, var3);
        }
        if (var4 == 28) {
            class84.field1677.method287((byte) 125, 119);
            class68.field1295++;
            class84.field1677.method754(false, var2);
            class84.field1677.method725(28307, var3);
            class84.field1677.method725(28307, var5);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, arg1 - 8667);
            class45.field899 = var3;
        }
        if (var4 == 11) {
            class19.field374++;
            class37.method282(var2, var6, var3, (byte) -91);
            class84.field1677.method287((byte) 120, 127);
            class84.field1677.method732(128, class245.field4444 + var2);
            class84.field1677.method725(arg1 ^ 0x6E93, var3 + class174.field3178);
            class84.field1677.method740(255, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 1005) {
            class284.field5002 = 0;
            class253.field4571 = class76.field1413;
            class159.field2895 = 2;
            class31.field570 = class237.field4246;
            class84.field1677.method287((byte) 124, 183);
            class84.field1677.method732(128, var5);
            class274.field4856++;
        }
        if (var4 == 16) {
            if (var5 == 0) {
                class246.field4456 = true;
                class147.method1019(class99.field1937, var3, var2);
            } else if (var5 == 1) {
                class109.field2210++;
                class84.field1677.method287((byte) 125, 240);
                class84.field1677.method740(255, class172.field3147);
                class84.field1677.method740(arg1 ^ 0xFF, class245.field4444 + var2);
                class84.field1677.method725(28307, class174.field3178 + var3);
                class84.field1677.method754(false, class222.field4053);
            }
        }
        if (var4 == 46) {
            class108 var40 = class103.field1993[var5];
            if (var40 != null) {
                class141.field2610++;
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var40.field1567[0], 2, var40.field1548[0]);
                class284.field5002 = 0;
                class159.field2895 = 2;
                class31.field570 = class237.field4246;
                class253.field4571 = class76.field1413;
                class84.field1677.method287((byte) 122, 137);
                class84.field1677.method725(arg1 ^ 0x6E93, var5);
            }
        }
        if (var4 == 59) {
            class84.field1677.method287((byte) 122, 243);
            class84.field1677.method758(var2, arg1 ^ 0x579442B8);
            class173.field3162++;
            class42 var41 = class247.method1719(var2, -8667);
            if (var41.field855 != null && var41.field855[0][0] == 5) {
                int var42 = var41.field855[0][1];
                if (class38.field647[var42] != var41.field745[0]) {
                    class38.field647[var42] = var41.field745[0];
                    class253.method1749((byte) -66, var42);
                }
            }
        }
        if (var4 == 57) {
            class76.field1409++;
            class84.field1677.method287((byte) 125, 49);
            class84.field1677.method740(arg1 + 255, var3);
            class84.field1677.method725(28307, var5);
            class84.field1677.method754(false, var2);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, arg1 - 8667);
            class45.field899 = var3;
        }
        if (var4 == 23) {
            if (var5 == 0) {
                class18.field369 = true;
                class147.method1019(class99.field1937, var3, var2);
            } else if (class198.field3550 > 0 && class228.field4153[82] && class228.field4153[81]) {
                class227.method1593(class99.field1937, class245.field4444 + var2, class174.field3178 + var3, 63);
            } else {
                class84.field1677.method287((byte) 126, 186);
                class214.field3868++;
                class84.field1677.method725(28307, class245.field4444 + var2);
                class84.field1677.method725(28307, class174.field3178 + var3);
            }
        }
        if (var4 == 48) {
            class84.field1677.method287((byte) 121, 102);
            class65.field1260++;
            class84.field1677.method737(class156.field2854, (byte) 48);
            class84.field1677.method725(28307, class182.field3285);
            class84.field1677.method767(-1, var3);
            class84.field1677.method732(128, var5);
            class84.field1677.method758(var2, 1469334200);
            class84.field1677.method725(28307, class83.field1657);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 18) {
            class84.field1677.method287((byte) 119, 123);
            class216.field3899++;
            class84.field1677.method767(-1, var5);
            class84.field1677.method737(var2, (byte) 48);
            class84.field1677.method767(-1, var3);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, arg1 ^ 0xFFFFDE25);
            class45.field899 = var3;
        }
        if (var4 == 49) {
            class75.field1405++;
            if (class218.field3936 == 1) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            } else {
                boolean var43 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                if (!var43) {
                    class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
                }
            }
            class284.field5002 = 0;
            class31.field570 = class237.field4246;
            class159.field2895 = 2;
            class253.field4571 = class76.field1413;
            class84.field1677.method287((byte) 124, 131);
            class84.field1677.method725(28307, class245.field4444 + var2);
            class84.field1677.method725(28307, var5);
            class84.field1677.method767(~arg1, class174.field3178 + var3);
        }
        if (var4 == 14) {
            class37.method282(var2, var6, var3, (byte) -113);
            class38.field655++;
            class84.field1677.method287((byte) 118, 22);
            class84.field1677.method725(arg1 + 28307, var3 - -class174.field3178);
            class84.field1677.method732(128, class245.field4444 + var2);
            class84.field1677.method725(arg1 + 28307, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 19) {
            class163 var45 = class60.field1207[var5];
            if (var45 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var45.field1567[0], 2, var45.field1548[0]);
                class197.field3531++;
                class284.field5002 = 0;
                class31.field570 = class237.field4246;
                class253.field4571 = class76.field1413;
                class159.field2895 = 2;
                class84.field1677.method287((byte) 120, 86);
                class84.field1677.method740(arg1 ^ 0xFF, var5);
            }
        }
        if (var4 == 1007) {
            class42 var46 = class247.method1719(var2, arg1 - 8667);
            if (var46 == null || var46.field856[var3] < 100000) {
                class84.field1677.method287((byte) 119, 77);
                class84.field1677.method732(128, var5);
                class213.field3857++;
            } else {
                class238.method1649((byte) -125, class246.field4451, 0, class229.method1604(new class209[] { class66.method485(var46.field856[var3], (byte) 78), class81.field1523, class249.method1728(var5, true).field1629 }, (byte) 88));
            }
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, arg1 - 8667);
            class45.field899 = var3;
        }
        if (var4 == 47) {
            class84.field1677.method287((byte) 121, 34);
            class84.field1677.method767(~arg1, var5);
            field2690++;
            class84.field1677.method729(var2, -2100025528);
            class84.field1677.method740(arg1 ^ 0xFF, var3);
            class224.field4090 = 0;
            class12.field232 = class247.method1719(var2, -8667);
            class45.field899 = var3;
        }
        if (var4 == 7) {
            class219.field3986++;
            boolean var47 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            if (!var47) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], 4474, false, var2, 2, var3);
            }
            class159.field2895 = 2;
            class253.field4571 = class76.field1413;
            class31.field570 = class237.field4246;
            class284.field5002 = 0;
            class84.field1677.method287((byte) 125, 50);
            class84.field1677.method767(-1, class83.field1657);
            class84.field1677.method725(arg1 + 28307, var3 - -class174.field3178);
            class84.field1677.method758(class156.field2854, 1469334200);
            class84.field1677.method725(28307, class245.field4444 + var2);
            class84.field1677.method767(-1, var5);
            class84.field1677.method732(128, class182.field3285);
        }
        if (var4 == 38) {
            class163 var49 = class60.field1207[var5];
            if (var49 != null) {
                class266.method1816(1, class223.field4069.field1567[0], 0, 1, 0, 0, class223.field4069.field1548[0], arg1 ^ 0x117A, false, var49.field1567[0], 2, var49.field1548[0]);
                class31.field570 = class237.field4246;
                class253.field4571 = class76.field1413;
                class23.field437++;
                class159.field2895 = 2;
                class284.field5002 = 0;
                class84.field1677.method287((byte) 121, 164);
                class84.field1677.method740(255, var5);
            }
        }
        if (class25.field445 != arg1) {
            class25.field445 = 0;
            class126.method907(class247.method1719(class156.field2854, -8667), 0);
        }
        if (class260.field4689) {
            class70.method514((byte) 110);
        }
        if (class12.field232 != null && class224.field4090 == 0) {
            class126.method907(class12.field232, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)I")
    public abstract int method11(int arg0);

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V")
    public static void method1017(int arg0) {
        field2688 = null;
        field2687 = null;
        int var1 = -115 / ((-arg0 - 21) / 50);
        field2689 = null;
        field2686 = null;
        field2692 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method12(boolean arg0);
}
