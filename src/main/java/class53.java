import java.awt.Font;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lpb;")
    public static class105 field1203 = new class105();

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lja;")
    private static class62 field1219 = class30.method243(43, "Loaded config");

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lja;")
    public static class62 field1220 = field1219;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lja;")
    public static class62 field1223 = class30.method243(43, "<img=0>");

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[Lja;")
    public static class62[] field1226 = new class62[500];

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Luc;")
    public class140 field1204;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Luc;")
    public class140 field1205;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Luc;")
    public class140 field1211;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lea;")
    public static class29 field1218;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field1224;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[[[B")
    public static byte[][][] field1222;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
    public static final int method361(int arg0, int arg1, int arg2, int arg3) {
        field1215++;
        int var4 = arg0 / arg1;
        int var5 = arg2 / arg1;
        if (arg3 != 14828) {
            field1225 = -19;
        }
        int var6 = arg1 - 1 & arg0;
        int var7 = arg1 - 1 & arg2;
        int var8 = class54.method367(true, var5, var4);
        int var9 = class54.method367(true, var5, var4 + 1);
        int var10 = class54.method367(true, var5 + 1, var4);
        int var11 = class54.method367(true, var5 + 1, var4 + 1);
        int var12 = class140.method1117(true, var6, var8, arg1, var9);
        int var13 = class140.method1117(true, var6, var10, arg1, var11);
        return class140.method1117(true, var7, var12, arg1, var13);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method362(byte arg0) {
        if (arg0 > -38) {
            method361(5, -33, 48, 19);
        }
        field1218 = null;
        field1223 = null;
        field1222 = null;
        field1226 = null;
        field1219 = null;
        field1220 = null;
        field1224 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILmf;Lmf;)V")
    public static final void method363(int arg0, class89 arg1, class89 arg2) {
        field1216++;
        if (class51.field1181) {
            class94.method721(arg1, (byte) 115, arg2);
            return;
        }
        if (class103.field2405 == 0 || class103.field2405 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg1.method696(class30.field746, 382, 245 - var3, 16777215, -1);
            class19.method144(230, var4, 304, 34, 9179409);
            class19.method144(231, var4 + 1, 302, 32, 0);
            class19.method143(232, var4 + 2, class83.field2005 * 3, 30, 9179409);
            class19.method143(class83.field2005 * 3 + 232, var4 + 2, 300 - class83.field2005 * 3, 30, 0);
            arg1.method696(class7.field208, 382, 276 - var3, 16777215, -1);
        }
        if (class103.field2405 == 20) {
            class15.field370.method932(382 - class15.field370.field2625 / 2, 271 - class15.field370.field2624 / 2);
            short var5 = 211;
            arg1.method696(class7.field217, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg1.method696(class7.field213, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg1.method696(class7.field218, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg1.method688(class70.method594(new class62[] { class4.field49, class89.method679(class7.field210) }, arg0 + 847), 272, var26, 16777215, 0);
            int var27 = var26 + 15;
            arg1.method688(class70.method594(new class62[] { class81.field1951, class7.field215.method458(false) }, 1229), 274, var27, 16777215, 0);
            int var28 = var27 + 15;
        }
        if (class103.field2405 == 10) {
            class15.field370.method932(202, 171);
            if (class10.field244 == 0) {
                short var13 = 302;
                short var14 = 251;
                arg1.method696(class72.field1844, 382, var14, 16776960, 0);
                short var15 = 291;
                class40.field939.method932(var13 - 73, var15 + -20);
                arg1.method677(class45.field1033, var13 - 73, var15 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var16 = 462;
                int var39 = var14 + 30;
                class40.field939.method932(var16 - 73, var15 - 20);
                arg1.method677(class155.field3587, var16 - 73, var15 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class10.field244 == 2) {
                short var6 = 302;
                short var7 = 211;
                arg1.method696(class7.field217, 382, var7, 16776960, 0);
                int var29 = var7 + 15;
                short var8 = 321;
                arg1.method696(class7.field213, 382, var29, 16776960, 0);
                int var30 = var29 + 15;
                arg1.method696(class7.field218, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                int var32 = var31 + 10;
                arg1.method688(class70.method594(new class62[] { class4.field49, class89.method679(class7.field210), class86.field2060 % 40 < 20 & class94.field2192 == 0 ? class108.field2503 : class7.field211 }, 1229), 272, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg1.method688(class70.method594(new class62[] { class81.field1951, class7.field215.method458(false), class94.field2192 == 1 & class86.field2060 % 40 < 20 ? class108.field2503 : class7.field211 }, arg0 + 847), 274, var33, 16777215, 0);
                class40.field939.method932(var6 - 73, var8 - 20);
                arg1.method696(class16.field381, var6, var8 + 5, 16777215, 0);
                int var34 = var33 + 15;
                short var9 = 462;
                class40.field939.method932(var9 - 73, var8 - 20);
                arg1.method696(class70.field1782, var9, var8 + 5, 16777215, 0);
            } else if (class10.field244 == 3) {
                arg1.method696(class130.field2977, 382, 211, 16776960, 0);
                short var10 = 236;
                short var11 = 382;
                arg1.method696(class111.field2547, 382, var10, 16777215, 0);
                int var35 = var10 + 15;
                arg1.method696(class71.field1810, 382, var35, 16777215, 0);
                int var36 = var35 + 15;
                arg1.method696(class142.field3322, 382, var36, 16777215, 0);
                short var12 = 321;
                int var37 = var36 + 15;
                arg1.method696(class32.field766, 382, var37, 16777215, 0);
                class40.field939.method932(var11 - 73, var12 + -20);
                arg1.method696(class70.field1782, var11, var12 + 5, 16777215, 0);
                int var38 = var37 + 15;
            }
        }
        if (class113.field2604 != 1) {
            if (class50.field1148 > 0) {
                class9.method77((byte) 116, class50.field1148);
                class50.field1148 = 0;
            }
            class83.method647(true);
        }
        class151.field3553[class6.field160 ? 1 : 0].method932(725, 463);
        if (class103.field2405 > 5 && class128.field2901 != 2 && class52.field1189 == 0) {
            if (class39.field919 == null) {
                class39.field919 = class93.method717(class149.field3504, class7.field211, class96.field2248, -104);
            } else {
                byte var17 = 5;
                short var18 = 463;
                class39.field919.method932(var17, var18);
                byte var19 = 100;
                byte var20 = 35;
                arg1.method696(class70.method594(new class62[] { class26.field626, class119.field2728, class31.method249(true, class59.field1449) }, arg0 ^ 0x5B3), var19 / 2 + var17, var20 / 2 + -2 + var18, 16777215, 0);
                if (class100.field2320 == null) {
                    arg2.method696(class134.field3075, var19 / 2 + var17, var18 + 12 - -(var20 / 2), 16777215, 0);
                } else {
                    arg2.method696(class12.field284, var19 / 2 + var17, var20 / 2 - -12 + var18, 16777215, 0);
                }
            }
        }
        try {
            Graphics var21 = class9.field240.getGraphics();
            class105.field2419.method83(0, (byte) -119, var21, 0);
        } catch (Exception var22) {
            class9.field240.repaint();
        }
        if (arg0 != 382) {
            method361(-25, 76, -83, -97);
        }
    }
}
