import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class202 extends class59 {

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    private int field3994 = 32768;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Lsd;")
    public static class166 field3989 = class135.method935("<col=ffffff>", 0);

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Lsd;")
    private static class166 field3992 = class135.method935("Could not complete login)3", 0);

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lsd;")
    public static class166 field3996 = class135.method935(" <col=00ff80>", 0);

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lsd;")
    public static class166 field3995 = field3992;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Lsd;")
    public static class166 field4000 = class135.method935("sich mit einer anderen Welt zu verbinden)3", 0);

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field3998;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field1216 = ~arg0.method400(255) == -2;
            }
        } else {
            this.field3994 = arg0.method405(2) << 4;
        }
        if (arg1 < 18) {
            field3996 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        class92.method718(true);
        if (arg0 == 23459) {
            ++field3991;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(III)V")
    public static final void method1330(int arg0, int arg1, int arg2) {
        if (arg1 != 25100) {
            field3996 = null;
        }
        if (class98.field1879 != arg2) {
            class187.field3569 = new int[arg2];
            for (int var3 = 0; var3 < arg2; ++var3) {
                class187.field3569[var3] = (var3 << 12) / arg2;
            }
            class187.field3571 = arg2 - 1;
            class98.field1879 = arg2;
        }
        if (class171.field3285 != arg0) {
            class136.field2657 = new int[arg0];
            for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                class136.field2657[var4] = (var4 << 12) / arg0;
            }
            class171.field3285 = arg0;
            class137.field2679 = arg0 + -1;
        }
        ++field3990;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Color;Lsd;B)V")
    public static final void method1331(int arg0, Color arg1, class166 arg2, byte arg3) {
        ++field3993;
        try {
            Graphics var4 = class114.field2219.getGraphics();
            if (class5.field114 == null) {
                class5.field114 = new Font("Helvetica", 1, 13);
                class157.field3006 = class114.field2219.getFontMetrics(class5.field114);
            }
            if (class150.field2919) {
                class150.field2919 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class165.field3127, class48.field888);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class109.field2120 == null) {
                    class109.field2120 = class114.field2219.createImage(304, 34);
                }
                Graphics var5 = class109.field2120.getGraphics();
                var5.setColor(arg1);
                if (arg3 != -43) {
                    field3996 = null;
                }
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class5.field114);
                var5.setColor(Color.white);
                arg2.method1154(0, 22, (-arg2.method1147(arg3 ^ 20110, class157.field3006) + 304) / 2, var5);
                var4.drawImage(class109.field2120, class165.field3127 / 2 + -152, class48.field888 / 2 + -18, (ImageObserver) null);
            } catch (Exception var8) {
                int var6 = class48.field888 / 2 + -18;
                int var7 = class165.field3127 / 2 - 152;
                var4.setColor(arg1);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var6 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class5.field114);
                var4.setColor(Color.white);
                arg2.method1154(0, var6 + 22, (304 - arg2.method1147(-20133, class157.field3006)) / 2 + var7, var4);
            }
        } catch (Exception var9) {
            class114.field2219.repaint();
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public static void method1332(int arg0) {
        field3989 = null;
        field4000 = null;
        field3992 = null;
        if (arg0 != -28398) {
            field3992 = null;
        }
        field3995 = null;
        field3996 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field3999;
        int[] var3 = super.field1219.method721(arg0, -127);
        if (arg1 >= -124) {
            return null;
        } else {
            if (super.field1219.field1816) {
                int[] var4 = this.method499(0, arg0, 1);
                int[] var5 = this.method499(0, arg0, 2);
                for (int var6 = 0; class98.field1879 > var6; ++var6) {
                    int var7 = var5[var6] * this.field3994 >> 12;
                    int var8 = (4094 & var4[var6]) >> 4;
                    int var9 = class92.field1808[var8] * var7 >> 12;
                    int var10 = class187.field3571 & (var9 >> 12) + var6;
                    int var11 = class63.field1316[var8] * var7 >> 12;
                    int var12 = arg0 - -(var11 >> 12) & class137.field2679;
                    int[] var13 = this.method499(0, var12, 0);
                    var3[var6] = var13[var10];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            method1330(-107, -60, -126);
        }
        int[][] var3 = super.field1207.method528(62, arg1);
        if (super.field1207.field1320) {
            int[] var4 = this.method499(0, arg1, 1);
            int[] var5 = this.method499(0, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class98.field1879; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field3994 >> 12;
                int var12 = class63.field1316[var10] * var11 >> 12;
                int var13 = class92.field1808[var10] * var11 >> 12;
                int var14 = class187.field3571 & (var13 >> 12) + var9;
                int var15 = class137.field2679 & (var12 >> 12) + arg1;
                int[][] var16 = this.method498(var15, 0, 0);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        ++field3997;
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class202() {
        super(3, false);
    }
}
