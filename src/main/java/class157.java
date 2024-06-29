import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class157 extends class103 {

    @OriginalMember(owner = "client!wd", name = "Gb", descriptor = "Lid;")
    public static class60 field3584 = class11.method72("<col=c0ff00>", (byte) 103);

    @OriginalMember(owner = "client!wd", name = "Kb", descriptor = "I")
    public static int field3588 = 0;

    @OriginalMember(owner = "client!wd", name = "Mb", descriptor = "I")
    public static int field3590 = 0;

    @OriginalMember(owner = "client!wd", name = "Sb", descriptor = "Lid;")
    private static class60 field3596 = class11.method72("scroll:", (byte) -101);

    @OriginalMember(owner = "client!wd", name = "Hb", descriptor = "Lid;")
    public static class60 field3585 = class11.method72(")3runescape)3com", (byte) 113);

    @OriginalMember(owner = "client!wd", name = "Wb", descriptor = "[I")
    public static int[] field3600 = new int[32];

    @OriginalMember(owner = "client!wd", name = "Qb", descriptor = "Lid;")
    public static class60 field3594 = class11.method72("null", (byte) 120);

    @OriginalMember(owner = "client!wd", name = "Tb", descriptor = "I")
    public static int field3597 = 0;

    @OriginalMember(owner = "client!wd", name = "Ub", descriptor = "Lid;")
    public static class60 field3598 = field3596;

    @OriginalMember(owner = "client!wd", name = "Zb", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!wd", name = "dc", descriptor = "Lid;")
    public static class60 field3607 = class11.method72("titlebutton", (byte) -29);

    @OriginalMember(owner = "client!wd", name = "Yb", descriptor = "Lid;")
    public static class60 field3602 = class11.method72("event_opbase", (byte) 99);

    @OriginalMember(owner = "client!wd", name = "ic", descriptor = "Lid;")
    public static class60 field3612 = field3596;

    @OriginalMember(owner = "client!wd", name = "Ib", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!wd", name = "Lb", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!wd", name = "Nb", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!wd", name = "Ob", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!wd", name = "Pb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!wd", name = "Rb", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!wd", name = "Vb", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!wd", name = "Xb", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!wd", name = "ac", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!wd", name = "bc", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!wd", name = "cc", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!wd", name = "ec", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!wd", name = "fc", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!wd", name = "Jb", descriptor = "Lw;")
    private class153 field3587;

    @OriginalMember(owner = "client!wd", name = "hc", descriptor = "Lfd;")
    public static class40 field3611;

    @OriginalMember(owner = "client!wd", name = "gc", descriptor = "[Lae;")
    public static class6[] field3610;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(Z)V")
    public final void method1204(boolean arg0) {
        if (!arg0) {
            ++field3604;
            super.field2501 = (this.field3591 - -7) / 8;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class157(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(ZI)I")
    public final int method1205(boolean arg0, int arg1) {
        ++field3601;
        int var3 = this.field3591 >> 3;
        if (arg0) {
            return -58;
        } else {
            int var4 = -(7 & this.field3591) + 8;
            this.field3591 += arg1;
            int var5 = 0;
            while (arg1 > var4) {
                var5 += (super.field2498[var3++] & class7.field98[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 != ~var4) {
                var6 = (super.field2498[var3] >> -arg1 + var4 & class7.field98[arg1]) + var5;
            } else {
                var6 = (class7.field98[var4] & super.field2498[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public static final int method1206(int arg0, int arg1, int arg2) {
        ++field3595;
        if (~arg1 <= -3) {
            int var3 = method1206(-122, arg1 >> 1, arg2 * arg2);
            if ((1 & arg1) != 0) {
                var3 = arg2 * var3;
            }
            return var3;
        } else if (arg1 == 1) {
            return arg2;
        } else {
            return arg0 >= -59 ? 77 : 1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "(I)V")
    public static final void method1207(int arg0) {
        class35.field884 = 0;
        ++field3593;
        class105.field2589 = 0;
        class35.method262(true);
        class153.method1164(false);
        class19.method157((byte) -6);
        for (int var1 = 0; var1 < class105.field2589; ++var1) {
            int var3 = class141.field3213[var1];
            if (~class82.field2065 != ~class5.field83[var3].field863) {
                class5.field83[var3].field1337 = null;
                class5.field83[var3] = null;
            }
        }
        if (class94.field2310 != class56.field1393.field2501) {
            throw new RuntimeException("gnp1 pos:" + class56.field1393.field2501 + " psize:" + class94.field2310);
        } else {
            if (arg0 != -13202) {
                method1208(49);
            }
            for (int var2 = 0; ~var2 > ~class72.field1748; ++var2) {
                if (class5.field83[class1.field1[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class72.field1748);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field3610 = null;
        field3596 = null;
        field3598 = null;
        field3584 = null;
        field3600 = null;
        field3594 = null;
        field3585 = null;
        field3607 = null;
        int var1 = -90 % ((arg0 - 25) / 52);
        field3602 = null;
        field3612 = null;
        field3611 = null;
    }

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "(I)I")
    public final int method1209(int arg0) {
        if (arg0 <= 120) {
            method1206(-1, 68, -76);
        }
        ++field3606;
        return super.field2498[super.field2501++] - this.field3587.method1161(43) & 255;
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(Z)V")
    public static final void method1210(boolean arg0) {
        ++field3605;
        if (arg0) {
            field3600 = null;
        }
        Object var1 = class1.field3;
        synchronized (class1.field3) {
            if (~class30.field708 == -1) {
                class116.field2731.method201(5, (byte) -57, new class125());
            }
            class30.field708 = 600;
        }
    }

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "(I)V")
    public final void method1211(int arg0) {
        ++field3608;
        this.field3591 = super.field2501 * 8;
        if (arg0 < 74) {
            field3597 = 79;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[I)V")
    public final void method1212(byte arg0, int[] arg1) {
        if (arg0 != 91) {
            method1208(-105);
        }
        ++field3586;
        this.field3587 = new class153(arg1);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(IB)I")
    public final int method1213(int arg0, byte arg1) {
        ++field3609;
        return arg1 != 18 ? 4 : arg0 * 8 - this.field3591;
    }

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "(II)V")
    public final void method1214(int arg0, int arg1) {
        if (arg1 != 0) {
            method1215((Color) null, -26, (class60) null, (byte) 44);
        }
        super.field2498[super.field2501++] = (byte) (this.field3587.method1161(-88) + arg0);
        ++field3599;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Color;ILid;B)V")
    public static final void method1215(Color arg0, int arg1, class60 arg2, byte arg3) {
        try {
            Graphics var4 = class9.field148.getGraphics();
            if (class59.field1425 == null) {
                class59.field1425 = new Font("Helvetica", 1, 13);
                class93.field2299 = class9.field148.getFontMetrics(class59.field1425);
            }
            if (class99.field2411) {
                class99.field2411 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class54.field1365, class21.field496);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (arg3 > -15) {
                    return;
                }
                if (class52.field1327 == null) {
                    class52.field1327 = class9.field148.createImage(304, 34);
                }
                Graphics var5 = class52.field1327.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class59.field1425);
                var5.setColor(Color.white);
                arg2.method436((-arg2.method457((byte) -96, class93.field2299) + 304) / 2, 22, var5, -14404);
                var4.drawImage(class52.field1327, class54.field1365 / 2 + -152, class21.field496 / 2 + -18, (ImageObserver) null);
            } catch (Exception var8) {
                int var6 = class21.field496 / 2 + -18;
                int var7 = class54.field1365 / 2 + -152;
                var4.setColor(arg0);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 - -2, var6 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 - -1, 301, 31);
                var4.fillRect(var7 + 2 - -(arg1 * 3), var6 - -2, -(arg1 * 3) + 300, 30);
                var4.setFont(class59.field1425);
                var4.setColor(Color.white);
                arg2.method436((-arg2.method457((byte) -96, class93.field2299) + 304) / 2 + var7, var6 + 22, var4, -14404);
            }
        } catch (Exception var9) {
            class9.field148.repaint();
        }
        ++field3592;
    }
}
