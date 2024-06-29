import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Ltd;")
    private static class136 field1362 = class145.method1172("Unable to find ", 45);

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Ltd;")
    public static class136 field1366 = class145.method1172("leuchten2:", 45);

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Ltd;")
    public static class136 field1364 = class145.method1172("<col=00ff00>", 45);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Ltd;")
    private static class136 field1379 = class145.method1172("Connection lost", 45);

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Ltd;")
    private static class136 field1376 = class145.method1172("<col=ffff00>*V", 45);

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Ltd;")
    private static class136 field1380 = class145.method1172("Your account is already logged in)3", 45);

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Ltd;")
    public static class136 field1367 = field1379;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Ltd;")
    private static class136 field1383 = class145.method1172("Error loading your profile)3", 45);

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Ltd;")
    private static class136 field1387 = class145.method1172("Your ignore list is full)3 Max of 100 hit", 45);

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[[I")
    public static int[][] field1374 = new int[5][5000];

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field1384 = 1;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "Ltd;")
    public static class136 field1386 = field1383;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Ltd;")
    public static class136 field1385 = field1362;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Ltd;")
    public static class136 field1378 = field1387;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Ltd;")
    public static class136 field1390 = field1380;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[B")
    public byte[] field1369;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[B")
    public byte[] field1372;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method481(byte arg0) {
        field1386 = null;
        field1376 = null;
        field1385 = null;
        field1383 = null;
        field1366 = null;
        if (arg0 >= -127) {
            field1370 = -29;
        }
        field1378 = null;
        field1387 = null;
        field1367 = null;
        field1364 = null;
        field1380 = null;
        field1362 = null;
        field1390 = null;
        field1374 = null;
        field1379 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lmd;Ltd;Ltd;Z)Lne;")
    public static final class95 method482(class87 arg0, class136 arg1, class136 arg2, boolean arg3) {
        if (!arg3) {
            field1387 = null;
        }
        int var4 = arg0.method645(arg1, arg3);
        field1382++;
        int var5 = arg0.method656(var4, arg2, -100);
        return class121.method940(arg0, var4, -105, var5);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lne;ILne;)V")
    public static final void method483(class95 arg0, int arg1, class95 arg2) {
        field1388++;
        if (class155.field3545) {
            class100.method811(arg2, (byte) -102, arg0);
            return;
        }
        if (class139.field3248 == 0 || class139.field3248 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg0.method724(class8.field148, 382, 245 - var3, 16777215, -1);
            class114.method897(230, var4, 304, 34, 9179409);
            class114.method897(231, var4 + 1, 302, 32, 0);
            class114.method891(232, var4 + 2, class75.field1695 * 3, 30, 9179409);
            class114.method891(class75.field1695 * 3 + 232, var4 + 2, 300 - class75.field1695 * 3, 30, 0);
            arg0.method724(class81.field1910, 382, 276 - var3, 16777215, -1);
        }
        if (class139.field3248 == 20) {
            class112.field2609.method693(382 - class112.field2609.field2170 / 2, -(class112.field2609.field2163 / 2) + 271);
            short var5 = 211;
            arg0.method724(class81.field1931, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method724(class81.field1925, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method724(class81.field1942, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method702(class79.method570(arg1 - 9202, new class136[] { class154.field3512, class95.method717(class81.field1929) }), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method702(class79.method570(0, new class136[] { class84.field1989, class81.field1904.method1128(92) }), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class139.field3248 == 10) {
            class112.field2609.method693(202, 171);
            if (class105.field2488 == 0) {
                short var6 = 251;
                arg0.method724(class149.field3431, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 291;
                short var8 = 302;
                class43.field990.method693(var8 - 73, var7 + -20);
                arg0.method723(class129.field3092, var8 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class43.field990.method693(var9 - 73, var7 + -20);
                arg0.method723(class121.field2817, var9 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class105.field2488 == 2) {
                short var10 = 211;
                short var11 = 302;
                short var12 = 321;
                arg0.method724(class81.field1931, 382, var10, 16776960, 0);
                int var30 = var10 + 15;
                arg0.method724(class81.field1925, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg0.method724(class81.field1942, 382, var31, 16776960, 0);
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                arg0.method702(class79.method570(0, new class136[] { class154.field3512, class95.method717(class81.field1929), class151.field3465 == 0 & class44.field1013 % 40 < 20 ? field1376 : class81.field1934 }), 272, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg0.method702(class79.method570(arg1 ^ 0x23F2, new class136[] { class84.field1989, class81.field1904.method1128(arg1 ^ 0xFFFFDC64), class44.field1013 % 40 < 20 & class151.field3465 == 1 ? field1376 : class81.field1934 }), 274, var34, 16777215, 0);
                int var35 = var34 + 15;
                class43.field990.method693(var11 - 73, var12 + -20);
                arg0.method724(class52.field1164, var11, var12 + 5, 16777215, 0);
                short var13 = 462;
                class43.field990.method693(var13 - 73, var12 + -20);
                arg0.method724(class89.field2114, var13, var12 + 5, 16777215, 0);
            } else if (class105.field2488 == 3) {
                short var14 = 236;
                short var15 = 382;
                arg0.method724(class55.field1256, 382, 211, 16776960, 0);
                arg0.method724(class56.field1269, 382, var14, 16777215, 0);
                int var36 = var14 + 15;
                arg0.method724(class146.field3364, 382, var36, 16777215, 0);
                int var37 = var36 + 15;
                short var16 = 321;
                arg0.method724(class38.field882, 382, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method724(class38.field888, 382, var38, 16777215, 0);
                class43.field990.method693(var15 - 73, var16 + -20);
                int var39 = var38 + 15;
                arg0.method724(class89.field2114, var15, var16 + 5, 16777215, 0);
            }
        }
        if (class99.field2378 != 1) {
            if (client.field462 > 0) {
                class29.method248(arg1 - 9258, client.field462);
                client.field462 = 0;
            }
            class77.method557((byte) -18);
        }
        class86.field2016[class113.field2627 ? 1 : 0].method693(725, 463);
        if (class139.field3248 > 5 && class108.field2565 != 2 && class54.field1194 == 0) {
            if (class56.field1264 == null) {
                class56.field1264 = class155.method1215(class81.field1934, class77.field1776, -125, class143.field3328);
            } else {
                byte var17 = 5;
                short var18 = 463;
                byte var19 = 35;
                class56.field1264.method693(var17, var18);
                byte var20 = 100;
                arg0.method724(class79.method570(0, new class136[] { class35.field840, class18.field357, class19.method140(class44.field1011, -84) }), var20 / 2 + var17, var18 + -2 - -(var19 / 2), 16777215, 0);
                if (class145.field3351 == null) {
                    arg2.method724(class5.field104, var17 + var20 / 2, var19 / 2 + var18 - -12, 16777215, 0);
                } else {
                    arg2.method724(class15.field309, var20 / 2 + var17, var18 - -(var19 / 2) - -12, 16777215, 0);
                }
            }
        }
        try {
            if (arg1 != 9202) {
                method482(null, null, null, false);
            }
            Graphics var21 = class14.field279.getGraphics();
            class12.field219.method521(0, 0, 0, var21);
        } catch (Exception var22) {
            class14.field279.repaint();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static final void method484(boolean arg0) {
        field1389++;
        if (arg0) {
            method482(null, null, null, true);
        }
        class56.method445(11097);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Lkf;")
    public static final class75 method485(int arg0, boolean arg1) {
        field1363++;
        if (arg1) {
            return null;
        }
        class75 var2 = (class75) class28.field617.method1162((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1797.method669(arg0, 5, -99);
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method551(90, new class127(var3));
        }
        class28.field617.method1164((long) arg0, var4, (byte) 127);
        return var4;
    }
}
