import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 extends class106 {

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public int field1395 = 0;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "[Llf;")
    public class124[] field1405 = new class124[5];

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "[I")
    public int[] field1404 = new int[5];

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Loc;")
    private static class151 field1390 = class137.method873(2, "Loading textures )2 ");

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Loc;")
    public static class151 field1409 = class137.method873(2, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Loc;")
    public static class151 field1391 = class137.method873(2, "(U(Y");

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Loc;")
    public static class151 field1417 = field1390;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "Llh;")
    public class126 field1407;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lqe;")
    public class173 field1403;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "Lue;")
    public class213 field1419;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "Lvg;")
    public class225 field1415;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Lc;")
    public class23 field1412;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lgg;")
    public class72 field1392;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Lgh;")
    public class73 field1400;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Z")
    public boolean field1396;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Z")
    public boolean field1401;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "Z")
    public boolean field1410;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    public static void method475(byte arg0) {
        field1409 = null;
        field1391 = null;
        field1417 = null;
        int var1 = 7 % ((58 - arg0) / 60);
        field1390 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIIIIII)V")
    public static final void method476(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class27.field573 = arg5;
        class158.field2851 = new boolean[8][32][class27.field573 + class27.field573 + 1][class27.field573 + class27.field573 + 1];
        class95.field1774 = 0;
        class90.field1656 = 0;
        class4.field80 = arg3;
        class118.field2134 = arg4;
        class146.field2617 = arg3 / 2;
        class123.field2203 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class27.field573 + class27.field573 + 3][class27.field573 + class27.field573 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class228.field4027 = class61.field1191[var8];
                class142.field2584 = class61.field1208[var8];
                class39.field797 = class61.field1191[var16];
                class14.field325 = class61.field1208[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class27.field573 + 1); var19 <= class27.field573 + 1; var19++) {
                    for (int var20 = -(class27.field573 + 1); var20 <= class27.field573 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class116.method710(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class27.field573 + var19 + 1][class27.field573 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class27.field573; var11 < class27.field573; var11++) {
                    for (int var12 = -class27.field573; var12 < class27.field573; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class27.field573 + 1][var12 + var15 + class27.field573 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class27.field573 + 1][var12 + var15 + class27.field573 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class27.field573 + 1][var12 + var15 + class27.field573 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class27.field573 + 1][var12 + var15 + class27.field573 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class158.field2851[var9][var10][class27.field573 + var11][class27.field573 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I")
    public static final int method477(int arg0, int arg1, int arg2, int arg3) {
        field1414++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg2 & arg1 - 1;
        if (arg3 <= 105) {
            field1418 = 65;
        }
        int var7 = arg2 / arg1;
        int var8 = class112.method676(-561200762, var4, var7);
        int var9 = class112.method676(-561200762, var4 + 1, var7);
        int var10 = class112.method676(-561200762, var4, var7 + 1);
        int var11 = class112.method676(-561200762, var4 + 1, var7 + 1);
        int var12 = class28.method216(var5, var8, arg1, (byte) -126, var9);
        int var13 = class28.method216(var5, var10, arg1, (byte) -111, var11);
        return class28.method216(var6, var12, arg1, (byte) 111, var13);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(III)V")
    public class72(int arg0, int arg1, int arg2) {
        this.field1398 = arg1;
        this.field1413 = this.field1416 = arg0;
        this.field1408 = arg2;
    }
}
