import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class151 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3740 = 0;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lfc;")
    public static class39 field3744 = class90.method774("(U2", -123);

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3739 = 0;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[Z")
    public static boolean[] field3736 = new boolean[5];

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lgb;")
    public static class45 field3748 = new class45();

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lfc;")
    public static class39 field3751 = class90.method774("Anmelde)2Zeitlimit -Uberschritten)3", -97);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
    public static int[] field3737;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[Lue;")
    public static class141[] field3750;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[[I")
    public static int[][] field3749;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lwa;", line = 29)
    public static final class149 method1199(int arg0) {
        field3743++;
        try {
            if (arg0 > -69) {
                field3751 = null;
            }
            return (class149) Class.forName("sa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class28();
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lfc;ILjava/awt/Color;I)V", line = 45)
    public static final void method1200(class39 arg0, int arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class140.field3523.getGraphics();
            if (class42.field1139 == null) {
                class42.field1139 = new Font("Helvetica", 1, 13);
                class132.field3338 = class140.field3523.getFontMetrics(class42.field1139);
            }
            if (class70.field1655) {
                class70.field1655 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class13.field339, class89.field2095);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class61.field1491 == null) {
                    class61.field1491 = class140.field3523.createImage(304, 34);
                }
                Graphics var5 = class61.field1491.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class42.field1139);
                var5.setColor(Color.white);
                arg0.method475((304 - arg0.method434(class132.field3338, -26799)) / 2, 22, 0, var5);
                var4.drawImage(class61.field1491, class13.field339 / 2 - 152, class89.field2095 / arg1 + -18, null);
            } catch (Exception var8) {
                int var6 = class13.field339 / 2 - 152;
                int var7 = class89.field2095 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class42.field1139);
                var4.setColor(Color.white);
                arg0.method475((304 - arg0.method434(class132.field3338, -26799)) / 2 + var6, var7 + 22, 0, var4);
            }
        } catch (Exception var9) {
            class140.field3523.repaint();
        }
        field3745++;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 118)
    public static void method1201(int arg0) {
        field3751 = null;
        if (arg0 != -792446169) {
            return;
        }
        field3750 = null;
        field3736 = null;
        field3749 = null;
        field3737 = null;
        field3744 = null;
        field3748 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lue;B)V", line = 140)
    public static final void method1202(class141 arg0, byte arg1) {
        for (int var2 = 0; var2 < class92.field2162.length; var2++) {
            class92.field2162[var2] = 0;
        }
        if (arg1 >= -82) {
            field3738 = -47;
        }
        field3742++;
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class92.field2162[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class97.field2314[var15] = (class92.field2162[var15 + 1] + class92.field2162[var15 - 128] + class92.field2162[var15 + -1] + class92.field2162[var15 + 128]) / 4;
                }
            }
            int[] var13 = class92.field2162;
            class92.field2162 = class97.field2314;
            class97.field2314 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field3546; var7++) {
            for (int var8 = 0; var8 < arg0.field3543; var8++) {
                if (arg0.field3544[var6++] != 0) {
                    int var9 = arg0.field3547 + var8 + 16;
                    int var10 = var7 + arg0.field3545 + 16;
                    int var11 = (var10 << 7) + var9;
                    class92.field2162[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILmf;Lrb;)V", line = 251)
    public static final void method1203(int arg0, int arg1, class89 arg2, class120 arg3) {
        field3747++;
        class108 var4 = new class108();
        var4.field2706 = arg2;
        int var5 = 127 % ((arg1 + 32) / 57);
        var4.field3619 = arg0;
        var4.field2704 = 1;
        var4.field2707 = arg3;
        class2 var6 = class7.field214;
        synchronized (class7.field214) {
            class7.field214.method19(var4, 7);
        }
        class58.method585(-1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V", line = 274)
    public static final void method1204(int arg0, int arg1, int arg2) {
        field3741++;
        int var3 = 0;
        if (arg1 < 62) {
            return;
        }
        for (int var4 = 0; var4 < 100; var4++) {
            if (class112.field2936[var4] != null) {
                int var5 = class7.field229 + 70 + 4 - var3 * 14;
                int var6 = class145.field3623[var4];
                if (var5 < -20) {
                    break;
                }
                if (var6 == 0) {
                    var3++;
                }
                class39 var7 = class139.field3515[var4];
                if (var7 != null && var7.method472(0, class89.field2091)) {
                    var7 = var7.method469(5, (byte) -120);
                }
                if (var7 != null && var7.method472(0, class43.field1177)) {
                    var7 = var7.method469(5, (byte) -106);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class94.field2203 == 0 || class94.field2203 == 1 && class35.method399(var7, 126))) {
                    if (var5 - 14 < arg2 && arg2 <= var5 && !var7.method462(-116, class94.field2197.field3575)) {
                        if (class5.field178 >= 1) {
                            class92.method786(0, 56, 0, 6, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) -93), class3.field89);
                            class68.field1612++;
                        }
                        class92.method786(0, 54, 0, 42, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) 108), class13.field350);
                        class2.field38++;
                        class34.field898++;
                        class92.method786(0, 4, 0, 73, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) 89), class111.field2854);
                    }
                    var3++;
                }
                if ((var6 == 3 || var6 == 7) && class76.field1734 == 0 && (var6 == 7 || class92.field2164 == 0 || class92.field2164 == 1 && class35.method399(var7, 122))) {
                    var3++;
                    if (arg2 > var5 - 14 && var5 >= arg2) {
                        class2.field38++;
                        class34.field898++;
                        if (class5.field178 >= 1) {
                            class68.field1612++;
                            class92.method786(0, 56, 0, 11, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) -51), class3.field89);
                        }
                        class92.method786(0, 54, 0, 75, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) 79), class13.field350);
                        class92.method786(0, 4, 0, 46, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) -66), class111.field2854);
                    }
                }
                if (var6 == 4 && (class13.field349 == 0 || class13.field349 == 1 && class35.method399(var7, 124))) {
                    var3++;
                    if (arg2 > var5 - 14 && var5 >= arg2) {
                        class134.field3379++;
                        class92.method786(0, 55, 0, 59, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) -68), class142.field3570);
                    }
                }
                if ((var6 == 5 || var6 == 6) && class76.field1734 == 0 && class92.field2164 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class13.field349 == 0 || class13.field349 == 1 && class35.method399(var7, 125))) {
                    var3++;
                    if (arg2 > var5 - 14 && var5 >= arg2) {
                        class25.field685++;
                        class92.method786(0, 10, 0, 30, 0, class137.method1111(new class39[] { class58.field1427, var7 }, (byte) 108), class96.field2278);
                    }
                }
            }
        }
    }
}
