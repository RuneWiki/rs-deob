import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class113 extends class254 {

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1607 = 0;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "[I")
    public static int[] field1620 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lkb;")
    public static class29 field1608;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method729(byte arg0) {
        field1620 = null;
        if (arg0 != 88) {
            method729((byte) 94);
        }
        field1608 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1617++;
        int var7 = class177.method1152(class93.field1418, class254.field3857, arg4, 112);
        int var8 = class177.method1152(class93.field1418, class254.field3857, arg5, -9);
        int var9 = class177.method1152(class93.field1412, class142.field2061, arg1, 8);
        int var10 = class177.method1152(class93.field1412, class142.field2061, arg0, 112);
        int var11 = class177.method1152(class93.field1418, class254.field3857, arg4 + arg3, -83);
        int var12 = class177.method1152(class93.field1418, class254.field3857, arg5 - arg3, 126);
        for (int var13 = var7; var13 < var11; var13++) {
            class183.method1181(arg6, (byte) -69, var10, class163.field2370[var13], var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class183.method1181(arg6, (byte) -69, var10, class163.field2370[var14], var9);
        }
        int var15 = 93 % ((42 - arg2) / 51);
        int var16 = class177.method1152(class93.field1412, class142.field2061, arg1 + arg3, 111);
        int var17 = class177.method1152(class93.field1412, class142.field2061, arg0 - arg3, -103);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class163.field2370[var18];
            class183.method1181(arg6, (byte) -69, var16, var19, var9);
            class183.method1181(arg6, (byte) -69, var10, var19, var17);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)Lsk;")
    public static final class109 method731(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        return var3 == null || var3.field1930 == null ? null : var3.field1930;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static final void method732(int arg0) {
        field1606++;
        if (class221.method1425(2) != 2) {
            return;
        }
        int var1 = class166.field2422 % 104;
        byte var2 = (byte) (class166.field2422 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class10.field175[var3][var1][var16] = var2;
            }
        }
        if (arg0 != 1000000) {
            method730(-33, -43, -64, -19, 4, 85, -60);
        }
        if (class163.field2364 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class251.field3829[var4] = -1000000;
            class97.field1465[var4] = 1000000;
            class67.field1045[var4] = 0;
            class128.field1882[var4] = 1000000;
            class193.field2773[var4] = 0;
        }
        if (class68.field1069 != 1) {
            int var15 = class81.method542(class89.field1355, -1, class163.field2364, class223.field3341);
            if ((var15 - class169.field2442) >= 800 || (class189.field2684[class163.field2364][class89.field1355 >> 7][class223.field3341 >> 7] & 0x4) == 0) {
                return;
            }
            class56.method380(-1, class223.field3341 >> 7, class89.field1355 >> 7, false, class16.field233, 1);
            return;
        }
        if ((class189.field2684[class163.field2364][class55.field847.field45 >> 7][class55.field847.field94 >> 7] & 0x4) != 0) {
            class56.method380(-1, class55.field847.field94 >> 7, class55.field847.field45 >> 7, false, class16.field233, 0);
        }
        if (class146.field2097 >= 310) {
            return;
        }
        int var5 = class89.field1355 >> 7;
        int var6 = class55.field847.field94 >> 7;
        int var7 = class55.field847.field45 >> 7;
        int var8 = class223.field3341 >> 7;
        int var9;
        if (var5 >= var7) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 < var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if (var10 >= var9) {
            int var11 = 32768;
            int var12 = var9 * 65536 / var10;
            while (var6 != var8) {
                if (var6 > var8) {
                    var8++;
                } else if (var8 > var6) {
                    var8--;
                }
                if ((class189.field2684[class163.field2364][var5][var8] & 0x4) != 0) {
                    class56.method380(-1, var8, var5, false, class16.field233, 1);
                    return;
                }
                var11 += var12;
                if (var11 >= 65536) {
                    var11 -= 65536;
                    if (var7 > var5) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class189.field2684[class163.field2364][var5][var8] & 0x4) != 0) {
                        class56.method380(arg0 ^ 0xFFF0BDBF, var8, var5, false, class16.field233, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = 32768;
        int var14 = var10 * 65536 / var9;
        while (var5 != var7) {
            if (var5 < var7) {
                var5++;
            } else if (var5 > var7) {
                var5--;
            }
            if ((class189.field2684[class163.field2364][var5][var8] & 0x4) != 0) {
                class56.method380(-1, var8, var5, false, class16.field233, 1);
                return;
            }
            var13 += var14;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var8 < var6) {
                    var8++;
                } else if (var8 > var6) {
                    var8--;
                }
                if ((class189.field2684[class163.field2364][var5][var8] & 0x4) != 0) {
                    class56.method380(-1, var8, var5, false, class16.field233, 1);
                    return;
                }
            }
        }
        return;
    }
}
