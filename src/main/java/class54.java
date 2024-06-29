import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 extends class128 {

    @OriginalMember(owner = "client!j", name = "Wb", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client!j", name = "cc", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!j", name = "Ub", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!j", name = "Lb", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!j", name = "Xb", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client!j", name = "Jb", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!j", name = "Ob", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!j", name = "bc", descriptor = "Lhe;")
    private class47 field1430;

    @OriginalMember(owner = "client!j", name = "Tb", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!j", name = "Rb", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client!j", name = "Mb", descriptor = "Lub;")
    public static class122 field1415 = new class122();

    @OriginalMember(owner = "client!j", name = "ic", descriptor = "La;")
    private static class1 field1437 = class113.method934(-11538, "Loaded gamescreen");

    @OriginalMember(owner = "client!j", name = "hc", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!j", name = "dc", descriptor = "La;")
    private static class1 field1432 = class113.method934(-11538, "Accept challenge");

    @OriginalMember(owner = "client!j", name = "ec", descriptor = "La;")
    public static class1 field1433 = class113.method934(-11538, "Okay");

    @OriginalMember(owner = "client!j", name = "fc", descriptor = "La;")
    public static class1 field1434 = field1437;

    @OriginalMember(owner = "client!j", name = "oc", descriptor = "La;")
    public static class1 field1443 = class113.method934(-11538, "mapfunction");

    @OriginalMember(owner = "client!j", name = "kc", descriptor = "La;")
    public static class1 field1439 = class113.method934(-11538, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!j", name = "nc", descriptor = "La;")
    public static class1 field1442 = class113.method934(-11538, "Absender:");

    @OriginalMember(owner = "client!j", name = "gc", descriptor = "La;")
    public static class1 field1435 = field1432;

    @OriginalMember(owner = "client!j", name = "pc", descriptor = "I")
    public static int field1444 = 1;

    @OriginalMember(owner = "client!j", name = "lc", descriptor = "La;")
    public static class1 field1440 = class113.method934(-11538, "");

    @OriginalMember(owner = "client!j", name = "Kb", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!j", name = "Nb", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!j", name = "Pb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!j", name = "Qb", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!j", name = "Sb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!j", name = "Vb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!j", name = "Yb", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!j", name = "Zb", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!j", name = "ac", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!j", name = "jc", descriptor = "Lwc;")
    public static class134 field1438;

    @OriginalMember(owner = "client!j", name = "mc", descriptor = "Lwc;")
    public static class134 field1441;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 14)
    public static final void method535(int arg0) {
        class31.field842 = 0;
        field1419++;
        class80.field2030 = 0;
        class19.method294(false);
        class85.method755(48);
        class24.method324(3799);
        if (arg0 <= 75) {
            return;
        }
        for (int var1 = 0; var1 < class31.field842; var1++) {
            int var3 = class11.field376[var1];
            if (class82.field2066 != class120.field2995[var3].field2011) {
                class120.field2995[var3].field3185 = null;
                class120.field2995[var3] = null;
            }
        }
        if (class100.field2550 != class15.field489.field268) {
            throw new RuntimeException("gnp1 pos:" + class15.field489.field268 + " psize:" + class100.field2550);
        }
        for (int var2 = 0; var2 < class49.field1343; var2++) {
            if (class120.field2995[class22.field678[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class49.field1343);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILbd;I)Le;", line = 64)
    public static final class25 method536(int arg0, class11 arg1, int arg2) {
        if (arg0 != 2) {
            method538(-42, null, null, null, -3, (byte) -48);
        }
        field1428++;
        return class8.method149(arg0 ^ 0xFFFFFF96, arg1, arg2) ? class44.method469(0) : null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 79)
    public static void method537(byte arg0) {
        field1433 = null;
        field1443 = null;
        field1438 = null;
        field1442 = null;
        int var1 = 17 % ((arg0 + 10) / 62);
        field1437 = null;
        field1440 = null;
        field1441 = null;
        field1415 = null;
        field1434 = null;
        field1432 = null;
        field1435 = null;
        field1439 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILab;[Lad;[BIB)V", line = 107)
    public static final void method538(int arg0, class3 arg1, class5[] arg2, byte[] arg3, int arg4, byte arg5) {
        if (arg5 >= -76) {
            method538(-120, null, null, null, -1, (byte) -104);
        }
        class8 var6 = new class8(arg3);
        field1418++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method179((byte) 52);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method179((byte) 62);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method145(false);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg0 + var12;
                int var18 = var11 + arg4;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class5 var19 = null;
                    int var20 = var13;
                    if ((class34.field899[1][var17][var18] & 0x2) == 2) {
                        var20 = var13 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg2[var20];
                    }
                    class19.method302(var16, var19, var17, arg1, -18, var15, var7, var18, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Color;La;I)V", line = 189)
    public static final void method539(int arg0, Color arg1, class1 arg2, int arg3) {
        field1429++;
        try {
            Graphics var4 = class122.field3052.getGraphics();
            if (class31.field843 == null) {
                class31.field843 = new Font("Helvetica", 1, 13);
                class14.field470 = class122.field3052.getFontMetrics(class31.field843);
            }
            if (class97.field2405) {
                class97.field2405 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class23.field712, class95.field2375);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class53.field1400 == null) {
                    class53.field1400 = class122.field3052.createImage(304, 34);
                }
                Graphics var5 = class53.field1400.getGraphics();
                var5.setColor(arg1);
                int var6 = -71 % ((arg3 - 8) / 54);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class31.field843);
                var5.setColor(Color.white);
                arg2.method16((byte) -124, (304 - arg2.method24(-48, class14.field470)) / 2, 22, var5);
                var4.drawImage(class53.field1400, class23.field712 / 2 - 152, class95.field2375 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class23.field712 / 2 - 152;
                int var8 = class95.field2375 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class31.field843);
                var4.setColor(Color.white);
                arg2.method16((byte) -32, (304 - arg2.method24(-46, class14.field470)) / 2 + var7, var8 + 22, var4);
            }
        } catch (Exception var10) {
            class122.field3052.repaint();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLa;)V", line = 260)
    public static final void method540(byte arg0, class1 arg1) {
        field1413++;
        if (arg1 == null || arg1.method10(-3136) == 0) {
            class93.field2333 = 0;
            return;
        }
        class1 var2 = arg1;
        class1[] var3 = new class1[100];
        if (arg0 != -96) {
            field1439 = null;
        }
        int var4 = 0;
        while (true) {
            int var5 = var2.method8((byte) -5, 32);
            if (var5 == -1) {
                class1 var6 = var2.method40(false);
                if (var6.method10(arg0 ^ 0xC60) > 0) {
                    var3[var4++] = var6.method30(class64.method626(arg0, 32));
                }
                class93.field2333 = 0;
                label51: for (int var7 = 0; var7 < class63.field1593; var7++) {
                    class115 var8 = class89.method763(var7, 10);
                    if (var8.field2841 == -1 && var8.field2830 != null) {
                        class1 var9 = var8.field2830.method30(arg0 - 32);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method11(var3[var10], 32) == -1) {
                                continue label51;
                            }
                        }
                        class38.field1018[class93.field2333] = var9;
                        class9.field314[class93.field2333] = var7;
                        class93.field2333++;
                        if (class93.field2333 >= class38.field1018.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class1 var11 = var2.method19(0, 0, var5).method40(false);
            if (var11.method10(-3136) > 0) {
                var3[var4++] = var11.method30(arg0 - 32);
            }
            var2 = var2.method1((byte) 95, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Lpa;", line = 350)
    public final class91 method42(int arg0) {
        if (this.field1430 != null) {
            int var2 = class82.field2066 - this.field1420;
            if (var2 > 100 && this.field1430.field1256 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (this.field1430.field1225[this.field1422] >= var2) {
                            break label38;
                        }
                        var2 -= this.field1430.field1225[this.field1422];
                        this.field1422++;
                    } while (this.field1430.field1244.length > this.field1422);
                    this.field1422 -= this.field1430.field1256;
                } while (this.field1422 >= 0 && this.field1430.field1244.length > this.field1422);
                this.field1430 = null;
            }
            this.field1420 = class82.field2066 - var2;
        }
        field1427++;
        class49 var3 = class32.method390(this.field1431, (byte) 123);
        int var4 = 83 % ((41 - arg0) / 47);
        if (var3.field1319 != null) {
            var3 = var3.method518(-20);
        }
        return var3 == null ? null : var3.method514(this.field1425, 103, this.field1426, this.field1422, this.field1417, this.field1414, this.field1430, this.field1423, this.field1412);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V", line = 399)
    public static final void method541(byte arg0) {
        field1421++;
        class8.field254.method268((byte) -88);
        if (arg0 != -96) {
            field1443 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 411)
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field1425 = arg3;
        this.field1431 = arg0;
        this.field1423 = arg6;
        this.field1414 = arg2;
        this.field1426 = arg4;
        this.field1412 = arg5;
        this.field1417 = arg1;
        if (arg7 != -1) {
            this.field1430 = class4.method104(arg7, 2);
            this.field1422 = 0;
            this.field1420 = class82.field2066 - 1;
            if (arg8 && this.field1430.field1256 != -1) {
                this.field1422 = (int) ((double) this.field1430.field1244.length * Math.random());
                this.field1420 -= (int) (Math.random() * (double) this.field1430.field1225[this.field1422]);
                return;
            }
        }
    }
}
