import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class22 extends class28 {

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "[Lbf;")
    public class14[] field515;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "Lja;")
    public static class62 field513 = class30.method243(43, "(U5");

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "Lja;")
    public static class62 field529 = class30.method243(43, "blaugr-Un:");

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "Lja;")
    public static class62 field521 = class30.method243(43, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "Lja;")
    public static class62 field528 = class30.method243(43, "::fpson");

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "[I")
    public static int[] field516;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "[I")
    public static int[] field524;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)Z")
    public final boolean method167(int arg0, int arg1) {
        if (arg0 == 32402) {
            field523++;
            return this.field515[arg1].field330;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(II)Lja;")
    public static final class62 method168(int arg0, int arg1) {
        if (arg1 != 4) {
            field528 = null;
        }
        field520++;
        return arg0 < 999999999 ? class31.method249(true, arg0) : class81.field1961;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    public static final void method169(byte arg0, int arg1) {
        field525++;
        class137.method1100(1);
        class24.method191(74);
        int var2 = class105.method851((byte) -125, arg1).field1375;
        if (var2 == 0) {
            return;
        }
        int var3 = class24.field598[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class66.method510(0.9D);
                ((class13) class66.field1651).method98((byte) 7, 0.9D);
            }
            if (var3 == 2) {
                class66.method510(0.8D);
                ((class13) class66.field1651).method98((byte) 7, 0.8D);
            }
            if (var3 == 3) {
                class66.method510(0.7D);
                ((class13) class66.field1651).method98((byte) 7, 0.7D);
            }
            if (var3 == 4) {
                class66.method510(0.6D);
                ((class13) class66.field1651).method98((byte) 7, 0.6D);
            }
            class32.method255(25243);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class141.field3308 != var4) {
                if (class141.field3308 == 0 && client.field497 != -1) {
                    class83.method645(var4, class31.field761, (byte) -127, false, 0, client.field497);
                    class56.field1383 = false;
                } else if (var4 == 0) {
                    class68.method539(false);
                    class56.field1383 = false;
                } else {
                    class134.method1073(103, var4);
                }
                class141.field3308 = var4;
            }
        }
        if (var2 == 9) {
            class150.field3528 = var3;
        }
        if (var2 == 6) {
            class3.field19 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class83.field1993 = 127;
            }
            if (var3 == 1) {
                class83.field1993 = 96;
            }
            if (var3 == 2) {
                class83.field1993 = 64;
            }
            if (var3 == 3) {
                class83.field1993 = 32;
            }
            if (var3 == 4) {
                class83.field1993 = 0;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class82.field1977 = 127;
            }
            if (var3 == 1) {
                class82.field1977 = 96;
            }
            if (var3 == 2) {
                class82.field1977 = 64;
            }
            if (var3 == 3) {
                class82.field1977 = 32;
            }
            if (var3 == 4) {
                class82.field1977 = 0;
            }
        }
        if (var2 == 5) {
            class1.field15 = var3;
        }
        if (arg0 <= 60) {
            method173(-31, null, -6, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(JI)V")
    public static final void method170(long arg0, int arg1) {
        field526++;
        if (arg0 != 0L) {
            class136.field3140.method810(-2, arg1);
            class136.field3140.method1008(arg0, (byte) 38);
            class138.field3189++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lhe;B)I")
    public static final int method171(class54 arg0, byte arg1) {
        field514++;
        class77 var2 = (class77) class131.field2992.method537(-1, ((long) arg0.field1291 << 32) + (long) arg0.field1257);
        int var3 = -97 % ((arg1 + 28) / 58);
        return var2 == null ? arg0.field1273 : var2.field1908;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Lae;I)V")
    public static final void method172(class6 arg0, int arg1) {
        arg0.field141 = 0;
        field517++;
        if (arg1 < 11) {
            return;
        }
        int var2 = arg0.field143 * 128 + arg0.field149 * 64;
        if (arg0.field164 == 0) {
            arg0.field137 = 1024;
        }
        int var3 = arg0.field166 * 128 + arg0.field149 * 64;
        if (arg0.field164 == 1) {
            arg0.field137 = 1536;
        }
        if (arg0.field164 == 2) {
            arg0.field137 = 0;
        }
        if (arg0.field164 == 3) {
            arg0.field137 = 512;
        }
        int var4 = arg0.field150 - class86.field2060;
        arg0.field134 += (var2 - arg0.field134) / var4;
        arg0.field136 += (var3 - arg0.field136) / var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILja;ILjava/awt/Color;)V")
    public static final void method173(int arg0, class62 arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class9.field240.getGraphics();
            if (class53.field1224 == null) {
                class53.field1224 = new Font("Helvetica", 1, 13);
                class100.field2325 = class9.field240.getFontMetrics(class53.field1224);
            }
            if (class67.field1672) {
                class67.field1672 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class121.field2779, class137.field3168);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class134.field3057 == null) {
                    class134.field3057 = class9.field240.createImage(304, 34);
                }
                Graphics var5 = class134.field3057.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class53.field1224);
                var5.setColor(Color.white);
                arg1.method443(var5, 22, (304 - arg1.method469(class100.field2325, -1)) / arg2, -106);
                var4.drawImage(class134.field3057, class121.field2779 / 2 - 152, class137.field3168 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class137.field3168 / 2 - 18;
                int var7 = class121.field2779 / 2 - 152;
                var4.setColor(arg3);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(var7 + arg0 * 3 + 2, var6 - -2, 300 - arg0 * 3, 30);
                var4.setFont(class53.field1224);
                var4.setColor(Color.white);
                arg1.method443(var4, var6 + 22, (304 - arg1.method469(class100.field2325, -1)) / 2 + var7, -94);
            }
        } catch (Exception var9) {
            class9.field240.repaint();
        }
        field533++;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    public static void method174(byte arg0) {
        field521 = null;
        field529 = null;
        field513 = null;
        if (arg0 == 76) {
            field528 = null;
            field524 = null;
            field516 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
    public static final void method175(int arg0, int arg1, byte arg2) {
        int var3 = 1;
        int[] var4 = new int[4];
        field530++;
        int[] var5 = new int[4];
        var5[0] = arg1;
        var4[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class59.field1450[var6] != arg1) {
                var5[var3] = class59.field1450[var6];
                var4[var3] = class151.field3557[var6];
                var3++;
            }
        }
        int var7 = -12 / ((20 - arg2) / 44);
        class59.field1450 = var5;
        class151.field3557 = var4;
        class122.method967(class151.field3557, class126.field2861.length - 1, 0, class59.field1450, class126.field2861, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lkc;")
    public static final class71 method176(Throwable arg0, String arg1) {
        class71 var2;
        if (arg0 instanceof class71) {
            var2 = (class71) arg0;
            var2.field1802 = var2.field1802 + ' ' + arg1;
        } else {
            var2 = new class71(arg0, arg1);
        }
        field519++;
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lpd;Lpd;IZ)V")
    public class22(class108 arg0, class108 arg1, int arg2, boolean arg3) {
        class105 var5 = new class105();
        int var6 = arg0.method864(0, arg2);
        this.field515 = new class14[var6];
        int[] var7 = arg0.method872(arg2, 9613);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method867(arg2, 15, var7[var8]);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class88 var11 = (class88) var5.method840(true);
            class88 var12 = null;
            while (var11 != null) {
                if (var11.field2079 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class88) var5.method841((byte) 18);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method874(0, var10, (byte) -89);
                } else {
                    var13 = arg1.method874(var10, 0, (byte) -113);
                }
                var12 = new class88(var10, var13);
                var5.method847(var12, (byte) 114);
            }
            this.field515[var7[var8]] = new class14(var9, var12);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lkb;I)V")
    public static final void method177(class70 arg0, int arg1) {
        if (arg1 != 19316) {
            field513 = null;
        }
        field527++;
        class120.field2756 = arg0;
    }
}
