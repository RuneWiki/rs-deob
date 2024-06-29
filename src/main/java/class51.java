import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class51 extends class108 {

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Lgd;")
    private static class40 field1290 = class14.method90(false, "New User");

    @OriginalMember(owner = "client!i", name = "I", descriptor = "Lgd;")
    public static class40 field1293 = field1290;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Loe;")
    public static class89 field1299 = new class89();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Lgd;")
    public static class40 field1300 = class14.method90(false, ")3");

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Lgd;")
    public static class40 field1301 = class14.method90(false, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lgd;")
    public static class40 field1302 = class14.method90(false, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Lhb;")
    public static class43 field1303 = new class43(5000);

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lgd;")
    public static class40 field1309 = class14.method90(false, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field1304 = -1;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Lgd;")
    public static class40 field1310 = class14.method90(false, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Lgd;")
    private static class40 field1307 = class14.method90(false, "Walk here");

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "Lgd;")
    public static class40 field1311 = field1307;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Lrb;")
    public static class103 field1306;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Lgd;")
    public class40 field1295;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "[I")
    public static int[] field1308;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 5)
    public static void method395(int arg0) {
        field1300 = null;
        field1299 = null;
        field1306 = null;
        field1311 = null;
        field1302 = null;
        if (arg0 != 5117) {
            method396(-29, 92, (byte) 119);
        }
        field1310 = null;
        field1309 = null;
        field1290 = null;
        field1308 = null;
        field1301 = null;
        field1303 = null;
        field1293 = null;
        field1307 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I", line = 28)
    public static final int method396(int arg0, int arg1, byte arg2) {
        int var3 = arg1 * 57 + arg0;
        field1294++;
        int var4 = 61 / ((arg2 - 15) / 46);
        int var5 = var3 ^ var3 << 13;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[B[Lq;IBIII)V", line = 44)
    public static final void method397(int arg0, int arg1, int arg2, byte[] arg3, class99[] arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -22) {
            field1305 = -21;
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg9 + var15 > 0 && arg9 + var15 < 103) {
                    arg4[arg0].field2367[arg7 + var10][arg9 + var15] = class101.method709(arg4[arg0].field2367[arg7 + var10][arg9 + var15], -16777217);
                }
            }
        }
        class104 var11 = new class104(arg3);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg8 == var12 && var13 >= arg1 && var13 < arg1 + 8 && var14 >= arg5 && arg5 + 8 > var14) {
                        class114.method885((byte) -126, var11, arg7 + class67.method484(var13 & 0x7, var14 & 0x7, true, arg2), 0, 0, arg9 + class50.method394(var14 & 0x7, var13 & 0x7, arg2, 5480), arg2, arg0);
                    } else {
                        class114.method885((byte) -108, var11, -1, 0, 0, -1, 0, 0);
                    }
                }
            }
        }
        field1292++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([Lq;Lud;Z[BII)V", line = 111)
    public static final void method398(class99[] arg0, class124 arg1, boolean arg2, byte[] arg3, int arg4, int arg5) {
        if (arg2) {
            return;
        }
        class104 var6 = new class104(arg3);
        int var7 = -1;
        field1296++;
        while (true) {
            int var8 = var6.method803((byte) -43);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method803((byte) -34);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method798((byte) -109);
                int var15 = var14 >> 2;
                int var16 = arg5 + var12;
                int var17 = arg4 + var11;
                int var18 = var14 & 0x3;
                if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                    int var19 = var13;
                    class99 var20 = null;
                    if ((class112.field2716[1][var17][var16] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg0[var19];
                    }
                    class9.method50(var17, var20, var18, var7, arg1, var15, var13, var16, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLgd;ILjava/awt/Color;)V", line = 187)
    public static final void method399(byte arg0, class40 arg1, int arg2, Color arg3) {
        field1287++;
        try {
            Graphics var4 = class30.field761.getGraphics();
            if (class35.field893 == null) {
                class35.field893 = new Font("Helvetica", 1, 13);
                class53.field1358 = class30.field761.getFontMetrics(class35.field893);
            }
            if (arg0 <= 44) {
                method401(97);
            }
            if (class64.field1571) {
                class64.field1571 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class80.field1838, class92.field2105);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class60.field1512 == null) {
                    class60.field1512 = class30.field761.createImage(304, 34);
                }
                Graphics var5 = class60.field1512.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class35.field893);
                var5.setColor(Color.white);
                arg1.method250(22, var5, -8874, (304 - arg1.method254(class53.field1358, 0)) / 2);
                var4.drawImage(class60.field1512, class80.field1838 / 2 - 152, class92.field2105 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class80.field1838 / 2 - 152;
                int var7 = class92.field2105 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg2 * 3 + var6 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class35.field893);
                var4.setColor(Color.white);
                arg1.method250(var7 + 22, var4, -8874, (304 - arg1.method254(class53.field1358, 0)) / 2 + var6);
            }
        } catch (Exception var9) {
            class30.field761.repaint();
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BJ)V", line = 282)
    public static final void method400(byte arg0, long arg1) {
        field1289++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class13.method78(false, arg1 - 1L);
            class13.method78(false, 1L);
        } else {
            class13.method78(false, arg1);
        }
        int var3 = -94 % ((arg0 + 67) / 58);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 303)
    public static final void method401(int arg0) {
        if (arg0 != 2) {
            field1290 = null;
        }
        class99.field2365.method561((byte) -74);
        field1288++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 316)
    public static final void method402(int arg0, int arg1) {
        field1297++;
        int var2 = -79 % ((arg0 + 79) / 46);
        if (class114.field2744 == null) {
            return;
        }
        if (class11.field291 != 0) {
            if (class50.field1280 == null) {
                return;
            }
            class112.field2688 = arg1;
        } else if (class21.field491 >= 0) {
            class21.field491 = arg1;
            class114.field2744.method75(arg1, -25, 0);
            return;
        }
    }
}
