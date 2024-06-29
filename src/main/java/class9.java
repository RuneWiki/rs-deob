import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class99 {

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    private int field231 = 0;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Laf;")
    public static class7 field221 = class48.method406(40, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "Laf;")
    public static class7 field226 = class48.method406(40, "b12_full");

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Laf;")
    public static class7 field230 = class48.method406(40, "blinken2:");

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "Lnd;")
    public static class94 field219 = new class94();

    @OriginalMember(owner = "client!ba", name = "pb", descriptor = "Laf;")
    public static class7 field243 = null;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
    public static int field241 = 0;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
    public static int field239 = 128;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "Laf;")
    public static class7 field237 = class48.method406(40, "hitmarks");

    @OriginalMember(owner = "client!ba", name = "ob", descriptor = "Laf;")
    public static class7 field242 = class48.method406(40, ")1p");

    @OriginalMember(owner = "client!ba", name = "qb", descriptor = "Laf;")
    private static class7 field244 = class48.method406(40, "Error loading your profile)3");

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "Laf;")
    public static class7 field238 = field244;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "Lnd;")
    public static class94 field240 = new class94();

    @OriginalMember(owner = "client!ba", name = "rb", descriptor = "Laf;")
    private static class7 field245 = class48.method406(40, "Prepared sound engine");

    @OriginalMember(owner = "client!ba", name = "wb", descriptor = "I")
    public static int field250 = -1;

    @OriginalMember(owner = "client!ba", name = "tb", descriptor = "Laf;")
    public static class7 field247 = field245;

    @OriginalMember(owner = "client!ba", name = "ub", descriptor = "Laf;")
    public static class7 field248 = class48.method406(40, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!ba", name = "yb", descriptor = "[[[Lnd;")
    public static class94[][][] field252 = new class94[4][104][104];

    @OriginalMember(owner = "client!ba", name = "Ab", descriptor = "Laf;")
    public static class7 field254 = class48.method406(40, "<col=ffff00>");

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!ba", name = "sb", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ba", name = "zb", descriptor = "Lof;")
    public static class103 field253;

    @OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lqc;")
    public static class114 field249;

    @OriginalMember(owner = "client!ba", name = "xb", descriptor = "Lfd;")
    public static class40 field251;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Color;Laf;I)V")
    public static final void method104(int arg0, Color arg1, class7 arg2, int arg3) {
        try {
            Graphics var4 = class13.field324.getGraphics();
            if (class103.field2465 == null) {
                class103.field2465 = new Font("Helvetica", 1, 13);
                class153.field3569 = class13.field324.getFontMetrics(class103.field2465);
            }
            if (class8.field217) {
                class8.field217 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class79.field1839, class81.field1864);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class83.field1966 == null) {
                    class83.field1966 = class13.field324.createImage(304, 34);
                }
                Graphics var5 = class83.field1966.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, arg0, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class103.field2465);
                var5.setColor(Color.white);
                arg2.method87(22, var5, (304 - arg2.method81(class153.field3569, 47)) / 2, 14199);
                var4.drawImage(class83.field1966, class79.field1839 / 2 - 152, class81.field1864 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class79.field1839 / 2 - 152;
                int var7 = class81.field1864 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class103.field2465);
                var4.setColor(Color.white);
                arg2.method87(var7 + 22, var4, (304 - arg2.method81(class153.field3569, 61)) / 2 + var6, 14199);
            }
        } catch (Exception var9) {
            class13.field324.repaint();
        }
        field225++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILrd;)V")
    private final void method105(int arg0, int arg1, int arg2, class122 arg3) {
        if (arg1 == 1) {
            this.field231 = arg3.method953(73);
        }
        field227++;
        if (arg0 < 9) {
            this.method109(false);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Z")
    public static final boolean method106(int arg0, byte arg1) {
        field233++;
        if (class101.field2389[arg0]) {
            return true;
        } else if (class144.field3407.method565(40, arg0)) {
            if (arg1 < 87) {
                field253 = null;
            }
            int var2 = class144.field3407.method562((byte) -121, arg0);
            if (var2 == 0) {
                class101.field2389[arg0] = true;
                return true;
            }
            if (class52.field1251[arg0] == null) {
                class52.field1251[arg0] = new class103[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class52.field1251[arg0][var3] == null) {
                    byte[] var4 = class144.field3407.method572(arg0, false, var3);
                    if (var4 != null) {
                        class52.field1251[arg0][var3] = new class103();
                        class52.field1251[arg0][var3].field2442 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class52.field1251[arg0][var3].method841(65535, new class122(var4));
                        } else {
                            class52.field1251[arg0][var3].method845(new class122(var4), (byte) 29);
                        }
                    }
                }
            }
            class101.field2389[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IB)V")
    private final void method107(int arg0, byte arg1) {
        field223++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var3 > var7) {
            var9 = var3;
        }
        if (var5 > var9) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = var7;
        int var15 = 71 % ((25 - arg1) / 53);
        double var16 = 0.0D;
        if (var3 < var7) {
            var13 = var3;
        }
        if (var5 < var13) {
            var13 = var5;
        }
        double var18 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var7 == var9) {
                var11 = (var3 - var5) / (var9 - var13);
            } else if (var3 == var9) {
                var11 = (var5 - var7) / (-var13 + var9) + 2.0D;
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (var9 - var13) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var9 - var13) / (var9 + var13);
            }
            if (var18 >= 0.5D) {
                var16 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        this.field229 = (int) (var16 * 256.0D);
        double var20 = var11 / 6.0D;
        if (this.field229 < 0) {
            this.field229 = 0;
        } else if (this.field229 > 255) {
            this.field229 = 255;
        }
        this.field236 = (int) (var18 * 256.0D);
        if (this.field236 < 0) {
            this.field236 = 0;
        } else if (this.field236 > 255) {
            this.field236 = 255;
        }
        if (var18 > 0.5D) {
            this.field222 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field222 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field222 < 1) {
            this.field222 = 1;
        }
        this.field224 = (int) ((double) this.field222 * var20);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
    public static final void method108(long arg0, int arg1) {
        field220++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class105.field2573; var3++) {
            if (class39.field968[var3] == arg0) {
                class83.field1945++;
                class105.field2573--;
                for (int var4 = var3; var4 < class105.field2573; var4++) {
                    class39.field968[var4] = class39.field968[var4 + 1];
                }
                class95.field2260 = class69.field1508;
                class47.field1150.method1131(139, 2027385224);
                class47.field1150.method956(arg0, -822368080);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        field232++;
        this.method107(this.field231, (byte) 88);
        if (arg0) {
            field241 = -128;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static void method110(int arg0) {
        field230 = null;
        field243 = null;
        field244 = null;
        field226 = null;
        field247 = null;
        int var1 = 4 / ((arg0 + 54) / 34);
        field248 = null;
        field253 = null;
        field249 = null;
        field242 = null;
        field240 = null;
        field237 = null;
        field254 = null;
        field221 = null;
        field238 = null;
        field252 = null;
        field251 = null;
        field219 = null;
        field245 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lrd;IB)V")
    public final void method111(class122 arg0, int arg1, byte arg2) {
        if (arg2 <= 121) {
            method106(-76, (byte) -46);
        }
        field235++;
        while (true) {
            int var4 = arg0.method931((byte) 124);
            if (var4 == 0) {
                return;
            }
            this.method105(107, var4, arg1, arg0);
        }
    }
}
