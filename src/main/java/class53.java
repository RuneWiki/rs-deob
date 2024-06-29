import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class72 {

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public int field1216 = -1;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public int field1221 = 0;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "I")
    public int field1231 = -1;

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "Z")
    public boolean field1232 = true;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lec;")
    public static class28 field1211 = class28.method210(-46, "Report abuse");

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lec;")
    private static class28 field1209 = class28.method210(-46, "Login to a members(W server to use this object)3");

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Lec;")
    public static class28 field1222 = field1209;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "Lec;")
    public static class28 field1229 = class28.method210(-46, "Login");

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lec;")
    public static class28 field1208 = class28.method210(-46, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lvb;")
    public static class122 field1214;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "[I")
    public static int[] field1213;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "[I")
    public static int[] field1219;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILud;)V")
    private final void method426(int arg0, int arg1, int arg2, class119 arg3) {
        field1212++;
        if (arg0 >= -83) {
            return;
        }
        if (arg1 == 1) {
            this.field1221 = arg3.method869(-25);
        } else if (arg1 == 2) {
            this.field1231 = arg3.method879((byte) 45);
        } else if (arg1 == 5) {
            this.field1232 = false;
        } else if (arg1 == 7) {
            this.field1216 = arg3.method869(-40);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lud;IB)V")
    public final void method427(class119 arg0, int arg1, byte arg2) {
        field1210++;
        while (true) {
            int var4 = arg0.method879((byte) 45);
            if (var4 == 0) {
                if (arg2 == 74) {
                    return;
                } else {
                    field1213 = null;
                    return;
                }
            }
            this.method426(-111, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lec;BLvb;Lec;)[Lea;")
    public static final class26[] method428(class28 arg0, byte arg1, class122 arg2, class28 arg3) {
        field1205++;
        int var4 = arg2.method942(arg0, 1);
        if (arg1 != -41) {
            method429(126);
        }
        int var5 = arg2.method930((byte) 91, var4, arg3);
        return class37.method304(arg2, var4, true, var5);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method429(int arg0) {
        field1219 = null;
        field1208 = null;
        field1213 = null;
        field1222 = null;
        field1209 = null;
        if (arg0 <= -85) {
            field1214 = null;
            field1229 = null;
            field1211 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    private final void method430(int arg0, int arg1) {
        field1207++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 != 14443) {
            return;
        }
        double var7 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = var3;
        if (var7 > var9) {
            var7 = var9;
        }
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field1220 = (int) (var17 * 256.0D);
        if (var7 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var9) / (-var7 + var11);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (-var7 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (-var11 + 2.0D - var7);
            }
        }
        if (this.field1220 < 0) {
            this.field1220 = 0;
        } else if (this.field1220 > 255) {
            this.field1220 = 255;
        }
        this.field1227 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field1215 = (int) (var19 * 256.0D);
        if (this.field1227 < 0) {
            this.field1227 = 0;
        } else if (this.field1227 > 255) {
            this.field1227 = 255;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lvb;Ljava/awt/Component;Lvb;I)V")
    public static final void method431(class122 arg0, Component arg1, class122 arg2, int arg3) {
        field1217++;
        if (class61.field1347) {
            return;
        }
        class61.field1367 = class21.method152(265, arg1, 8065, 128);
        class120.method906();
        class86.field1910 = class21.method152(265, arg1, 8065, 128);
        class120.method906();
        class74.field1633 = class21.method152(171, arg1, 8065, 509);
        class120.method906();
        class31.field658 = class21.method152(132, arg1, 8065, 360);
        class120.method906();
        class90.field1983 = class21.method152(200, arg1, 8065, 360);
        class120.method906();
        class74.field1645 = class21.method152(238, arg1, 8065, 202);
        class120.method906();
        class12.field194 = class21.method152(238, arg1, 8065, 203);
        class120.method906();
        class14.field257 = class21.method152(94, arg1, 8065, 74);
        class120.method906();
        class110.field2324 = class21.method152(94, arg1, 8065, 75);
        class120.method906();
        byte[] var4 = arg0.method934(2, class21.field453, class43.field912);
        class26 var5 = new class26(var4, arg1);
        class61.field1367.method92((byte) -4);
        var5.method185(0, 0);
        class86.field1910.method92((byte) -4);
        var5.method185(-637, 0);
        class74.field1633.method92((byte) -4);
        var5.method185(-128, 0);
        class31.field658.method92((byte) -4);
        var5.method185(-202, -371);
        class90.field1983.method92((byte) -4);
        var5.method185(-202, -171);
        class74.field1645.method92((byte) -4);
        var5.method185(0, -265);
        class12.field194.method92((byte) -4);
        var5.method185(-562, -265);
        class14.field257.method92((byte) -4);
        var5.method185(-128, -171);
        class110.field2324.method92((byte) -4);
        var5.method185(-562, -171);
        int[] var6 = new int[var5.field568];
        for (int var7 = 0; var7 < var5.field565; var7++) {
            for (int var23 = 0; var23 < var5.field568; var23++) {
                var6[var23] = var5.field563[var5.field568 + var5.field568 * var7 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field568; var24++) {
                var5.field563[var5.field568 * var7 + var24] = var6[var24];
            }
        }
        class61.field1367.method92((byte) -4);
        var5.method185(382, 0);
        class86.field1910.method92((byte) -4);
        var5.method185(-255, 0);
        class74.field1633.method92((byte) -4);
        var5.method185(254, 0);
        class31.field658.method92((byte) -4);
        var5.method185(180, -371);
        class90.field1983.method92((byte) -4);
        var5.method185(180, -171);
        class74.field1645.method92((byte) -4);
        var5.method185(382, -265);
        class12.field194.method92((byte) -4);
        var5.method185(-180, -265);
        class14.field257.method92((byte) -4);
        var5.method185(254, -171);
        class110.field2324.method92((byte) -4);
        var5.method185(-180, -171);
        class26 var8 = class63.method508((byte) 121, class21.field453, class118.field2513, arg2);
        class74.field1633.method92((byte) -4);
        var8.method188(382 - var8.field568 / 2 - 128, 18);
        class68.field1528 = class34.method292(arg2, class9.field172, 0, class21.field453);
        class49.field1146 = class34.method292(arg2, class109.field2294, 0, class21.field453);
        class129.field2798 = class72.method570((byte) 17, arg2, class21.field453, class34.field774);
        class51.field1190 = new class26(128, 265);
        class70.field1557 = new class26(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class51.field1190.field563[var9] = class61.field1367.field312[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class70.field1557.field563[var10] = class86.field1910.field312[var10];
        }
        class21.field483 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class21.field483[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class21.field483[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class21.field483[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class21.field483[var14 + 192] = 16777215;
        }
        class65.field1456 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class65.field1456[var15] = var15 * 1024;
        }
        if (arg3 > -11) {
            return;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class65.field1456[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class65.field1456[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class65.field1456[var18 + 192] = 16777215;
        }
        class125.field2720 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class125.field2720[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class125.field2720[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class125.field2720[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class125.field2720[var22 + 192] = 16777215;
        }
        class5.field93 = new int[32768];
        class22.field512 = new int[32768];
        class77.field1727 = new int[256];
        class40.method317(null, -122);
        class126.field2738 = new int[32768];
        class83.field1898 = new int[32768];
        field1230 = 0;
        class21.field477 = class21.field453;
        class21.field459 = class21.field453;
        if (class77.field1735 != 0) {
            class66.method529(false, class61.field1344, 2, class77.field1735, 10, class21.field453, class70.field1569, 0);
        }
        class93.field2057.method392(0, false);
        class61.field1347 = true;
        class117.field2492 = true;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public final void method432(int arg0) {
        field1224++;
        if (this.field1216 != arg0) {
            this.method430(14443, this.field1216);
            this.field1228 = this.field1227;
            this.field1225 = this.field1220;
            this.field1223 = this.field1215;
        }
        this.method430(arg0 ^ 0xFFFFC794, this.field1221);
    }
}
