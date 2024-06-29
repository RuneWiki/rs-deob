import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 extends class129 {

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "[Luc;")
    public class120[] field514;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Lmc;")
    public static class75 field512 = class30.method234(true, "mapdots");

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Lmc;")
    public static class75 field517 = class30.method234(true, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "Lmb;")
    public static class74 field515 = new class74(4096);

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lmc;")
    public static class75 field520 = class30.method234(true, "Entfernen");

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lmc;")
    public static class75 field522 = class30.method234(true, "::fpsoff");

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lmc;")
    public static class75 field521 = class30.method234(true, "b12_full");

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lmc;")
    public static class75 field526 = class30.method234(true, "@whi@");

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "Lmc;")
    public static class75 field528 = class30.method234(true, "Side panel redrawn");

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "Lmc;")
    public static class75 field527 = class30.method234(true, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lmc;")
    public static class75 field529 = class30.method234(true, ":duelreq:");

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "Lmc;")
    public static class75 field531 = class30.method234(true, "weiss:");

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "[Lnc;")
    public static class81[] field524;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)[Laa;", line = 9)
    public static final class2[] method172(int arg0) {
        field518++;
        class2[] var1 = new class2[class5.field76];
        if (arg0 < 17) {
            return null;
        }
        for (int var2 = 0; var2 < class5.field76; var2++) {
            class2 var3 = var1[var2] = new class2();
            var3.field36 = class130.field3170;
            var3.field35 = class55.field1395;
            var3.field33 = class47.field1154[var2];
            var3.field30 = class43.field1031[var2];
            var3.field34 = class100.field2592[var2];
            var3.field31 = class36.field880[var2];
            int var4 = var3.field34 * var3.field31;
            byte[] var5 = class118.field2924[var2];
            var3.field32 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field32[var6] = class85.field2109[class56.method456(var5[var6], 255)];
            }
        }
        class41.method317(7);
        return var1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLmc;ILmc;)V", line = 56)
    public static final void method173(boolean arg0, class75 arg1, int arg2, class75 arg3) {
        field519++;
        if (class110.field2780) {
            class110.field2780 = false;
            class76.method659(247);
            class21.method148((byte) 82);
            class70.method593((byte) -101);
            class40.method310(-122);
            class128.method1005((byte) -109, class71.field1814, class37.field894, class114.field2869, class76.field1932);
            class126.method999(class36.field868 == -1, -1, class15.field289, (byte) -106, class130.field3167);
            class58.field1471 = true;
            class82.field2043 = true;
            class23.field455 = true;
        }
        short var4 = 151;
        class8.method46(-1);
        int var6 = var4 - 3;
        class114.field2869.method427(arg3, 257, var6, 0);
        class114.field2869.method427(arg3, 256, var6 - 1, 16777215);
        if (arg1 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class114.field2869.method410(arg1) + 4;
                class66.method569(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class114.field2869.method427(arg1, 257, var6, 0);
            class114.field2869.method427(arg1, 256, var6 - 1, 16777215);
        }
        if (arg2 < 87) {
            method175(63);
        }
        class85.method704(20427);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lj;Lj;B)V", line = 111)
    public static final void method174(class54 arg0, class54 arg1, byte arg2) {
        field513++;
        class58.field1465.method767(false);
        if (class110.field2787 == 0 || class110.field2787 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg0.method427(class107.field2694, 180, 74 - var3, 16777215);
            class66.method578(28, var4, 304, 34, 9179409);
            class66.method578(29, var4 + 1, 302, 32, 0);
            class66.method569(30, var4 + 2, class62.field1627 * 3, 30, 9179409);
            class66.method569(class62.field1627 * 3 + 30, var4 + 2, 300 - class62.field1627 * 3, 30, 0);
            arg0.method427(class47.field1122, 180, 105 - var3, 16777215);
        }
        if (arg2 != -41) {
            method174(null, null, (byte) 38);
        }
        if (class110.field2787 == 20) {
            class79.field1991.method687(0, 0);
            byte var5 = 40;
            arg0.method424(class47.field1166, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg0.method424(class47.field1139, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg0.method424(class47.field1157, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg0.method412(class69.method586(new class75[] { class36.field861, class47.field1149 }, (byte) 75), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg0.method412(class69.method586(new class75[] { class85.field2105, class47.field1130.method631(0) }, (byte) 23), 92, var24, 16777215, true);
            int var26 = var24 + 15;
        }
        if (class110.field2787 == 10) {
            class79.field1991.method687(0, 0);
            if (class91.field2236 == 0) {
                byte var13 = 80;
                arg0.method424(class84.field2078, 180, var13, 16776960, true);
                byte var14 = 100;
                int var35 = var13 + 30;
                byte var15 = 120;
                class43.field1033.method687(var14 - 73, var15 - 20);
                arg0.method408(class35.field851, var14 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class43.field1033.method687(var16 - 73, var15 + -20);
                arg0.method408(class110.field2786, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class91.field2236 == 2) {
                byte var6 = 40;
                arg0.method424(class47.field1166, 180, var6, 16776960, true);
                byte var7 = 100;
                int var23 = var6 + 15;
                arg0.method424(class47.field1139, 180, var23, 16776960, true);
                short var8 = 150;
                int var25 = var23 + 15;
                arg0.method424(class47.field1157, 180, var25, 16776960, true);
                int var27 = var25 + 15;
                int var28 = var27 + 10;
                arg0.method412(class69.method586(new class75[] { class36.field861, class47.field1149, class34.field781 % 40 < 20 & class27.field549 == 0 ? class50.field1259 : class47.field1150 }, (byte) 38), 90, var28, 16777215, true);
                int var29 = var28 + 15;
                arg0.method412(class69.method586(new class75[] { class85.field2105, class47.field1130.method631(0), class27.field549 == 1 & class34.field781 % 40 < 20 ? class50.field1259 : class47.field1150 }, (byte) 97), 92, var29, 16777215, true);
                int var30 = var29 + 15;
                class43.field1033.method687(var7 - 73, var8 + -20);
                arg0.method424(class98.field2461, var7, var8 + 5, 16777215, true);
                short var9 = 260;
                class43.field1033.method687(var9 - 73, var8 + -20);
                arg0.method424(class59.field1520, var9, var8 + 5, 16777215, true);
            } else if (class91.field2236 == 3) {
                arg0.method424(class97.field2442, 180, 40, 16776960, true);
                short var10 = 180;
                byte var11 = 65;
                arg0.method424(class59.field1474, 180, var11, 16777215, true);
                int var31 = var11 + 15;
                arg0.method424(class108.field2736, 180, var31, 16777215, true);
                short var12 = 150;
                int var32 = var31 + 15;
                arg0.method424(class1.field17, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg0.method424(class25.field511, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                class43.field1033.method687(var10 - 73, var12 - 20);
                arg0.method424(class59.field1520, var10, var12 + 5, 16777215, true);
            }
        }
        class43.method325(0);
        try {
            Graphics var17 = class108.field2738.getGraphics();
            class58.field1465.method403(202, (byte) -93, var17, 171);
            class41.field999.method403(0, (byte) 75, var17, 0);
            class131.field3189.method403(637, (byte) 92, var17, 0);
            if (class110.field2780) {
                class110.field2780 = false;
                class70.field1784.method403(128, (byte) 115, var17, 0);
                class62.field1612.method403(202, (byte) 89, var17, 371);
                class70.field1781.method403(0, (byte) -66, var17, 265);
                class94.field2358.method403(562, (byte) -104, var17, 265);
                class88.field2176.method403(128, (byte) -107, var17, 171);
                class38.field904.method403(562, (byte) -73, var17, 171);
            }
        } catch (Exception var18) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V", line = 253)
    public static void method175(int arg0) {
        field529 = null;
        field526 = null;
        field524 = null;
        field512 = null;
        field527 = null;
        field515 = null;
        field521 = null;
        field528 = null;
        field517 = null;
        field520 = null;
        field531 = null;
        field522 = null;
        if (arg0 != 10858) {
            method175(-128);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lja;Lja;IZ)V", line = 280)
    public class26(class55 arg0, class55 arg1, int arg2, boolean arg3) {
        class32 var5 = new class32();
        int var6 = arg0.method430(24094, arg2);
        this.field514 = new class120[var6];
        int[] var7 = arg0.method434((byte) -109, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class42 var9 = null;
            byte[] var10 = arg0.method436(var7[var8], 5, arg2);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class42 var12 = (class42) var5.method248(32); var12 != null; var12 = (class42) var5.method252(58)) {
                if (var12.field1006 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method439(0, var11, 127);
                } else {
                    var13 = arg1.method439(var11, 0, 127);
                }
                var9 = new class42(var11, var13);
                var5.method245(var9, 0);
            }
            this.field514[var7[var8]] = new class120(var10, var9);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)Z", line = 338)
    public final boolean method176(int arg0, int arg1) {
        if (arg1 != 100) {
            method174(null, null, (byte) -2);
        }
        field516++;
        return this.field514[arg0].field2957;
    }
}
