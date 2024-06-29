import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class36 extends class243 {

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    private int field591 = 4096;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    private int field594 = 4096;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    private int field605 = 4096;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lub;")
    public static class227 field595 = class257.method1749("Spieler kann nicht gefunden werden: ", 17263);

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lub;")
    public static class227 field598 = class257.method1749("Ladevorgang )2 bitte warten Sie)3", 17263);

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lub;")
    public static class227 field602 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "[I")
    public static int[] field599 = new int[100];

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Luh;")
    public static class198 field593 = new class198();

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field604;
        if (arg0 != 230) {
            method192(98, (byte) -30);
        }
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771) {
            int[][] var4 = this.method1616(-1, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class212.field3586 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var9[var11];
                int var14 = var5[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var7[var11] = this.field591 * var12 >> 12;
                    var10[var11] = this.field594 * var13 >> 12;
                    var8[var11] = this.field605 * var14 >> 12;
                } else {
                    var7[var11] = this.field591;
                    var10[var11] = this.field594;
                    var8[var11] = this.field605;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static void method189(byte arg0) {
        field602 = null;
        field593 = null;
        field595 = null;
        field599 = null;
        field598 = null;
        if (arg0 != 67) {
            method193(-82);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field598 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field605 = arg0.method1447(0);
                }
            } else {
                this.field594 = arg0.method1447(0);
            }
        } else {
            this.field591 = arg0.method1447(0);
        }
        ++field607;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILub;Ljava/awt/Color;ZI)V")
    public static final void method190(int arg0, class227 arg1, Color arg2, boolean arg3, int arg4) {
        try {
            Graphics var5 = class172.field2875.getGraphics();
            if (class40.field666 == null) {
                class40.field666 = new Font("Helvetica", 1, 13);
                class78.field1364 = class172.field2875.getFontMetrics(class40.field666);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class49.field867, class208.field3538);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class105.field1984 == null) {
                    class105.field1984 = class172.field2875.createImage(304, 34);
                }
                Graphics var6 = class105.field1984.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(2 - -(arg0 * 3), 2, 300 - arg0 * 3, 30);
                var6.setFont(class40.field666);
                var6.setColor(Color.white);
                arg1.method1530(22, (304 - arg1.method1524(class78.field1364, -91)) / 2, var6, false);
                var5.drawImage(class105.field1984, class49.field867 / 2 + -152, class208.field3538 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class208.field3538 / 2 + -18;
                int var8 = class49.field867 / 2 + -152;
                var5.setColor(arg2);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + (var8 - -2), var7 + 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class40.field666);
                var5.setColor(Color.white);
                arg1.method1530(var7 + 22, var8 - -((-arg1.method1524(class78.field1364, arg4 ^ -795) + 304) / 2), var5, false);
            }
            if (class65.field1191 != null) {
                var5.setFont(class40.field666);
                var5.setColor(Color.white);
                class65.field1191.method1530(class208.field3538 / 2 + -26, class49.field867 / 2 + -(class65.field1191.method1524(class78.field1364, -91) / 2), var5, false);
            }
        } catch (Exception var10) {
            class172.field2875.repaint();
        }
        ++field600;
        if (arg4 != 832) {
            field595 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLld;)I")
    public static final int method191(byte arg0, class195 arg1) {
        if (arg0 <= 104) {
            return -13;
        } else {
            ++field603;
            class147 var2 = arg1.field3315;
            if (var2.field2563 != null) {
                var2 = var2.method933(29882);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field2541;
            if (~arg1.field82 == ~arg1.field61) {
                var3 = var2.field2570;
            } else if (~arg1.field96 == ~arg1.field82) {
                var3 = var2.field2548;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)V")
    public static final void method192(int arg0, byte arg1) {
        ++field597;
        if (~arg0 == -38) {
            class51.field904 = 3.0D;
        } else if (~arg0 == -51) {
            class51.field904 = 4.0D;
        } else if (~arg0 != -76) {
            class51.field904 = 8.0D;
        } else {
            class51.field904 = 6.0D;
        }
        class109.field2045 = -1;
        class109.field2045 = -1;
        if (arg1 != 85) {
            method191((byte) 35, (class195) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)[Lwh;")
    public static final class163[] method193(int arg0) {
        class163[] var1 = new class163[class168.field2810];
        for (int var2 = 0; var2 < class168.field2810; ++var2) {
            byte[] var3 = class26.field427[var2];
            int var4 = class214.field3613[var2] * class177.field2982[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var4 > var6; ++var6) {
                var5[var6] = class63.field1153[class76.method446(255, var3[var6])];
            }
            var1[var2] = new class163(class161.field2727, class241.field4197, class58.field1068[var2], class176.field2934[var2], class177.field2982[var2], class214.field3613[var2], var5);
        }
        if (arg0 > -41) {
            method190(37, (class227) null, (Color) null, false, 64);
        }
        ++field596;
        class57.method350((byte) -123);
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IBI)Lub;")
    public static final class227 method194(int arg0, byte arg1, int arg2) {
        ++field601;
        int var3 = arg0 - arg2;
        if (~var3 > 8) {
            return class7.field156;
        } else if (~var3 > 5) {
            return class242.field4199;
        } else if (var3 < -3) {
            return class142.field2450;
        } else if (~var3 > -1) {
            return class27.field450;
        } else if (var3 > 9) {
            return class215.field3634;
        } else if (~var3 < -7) {
            return class173.field2882;
        } else if (var3 > 3) {
            return class103.field1804;
        } else if (arg1 <= 25) {
            return null;
        } else {
            return ~var3 < -1 ? class46.field828 : class57.field1059;
        }
    }
}
