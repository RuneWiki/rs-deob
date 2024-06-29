import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class72 extends class326 {

    @OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
    private int field988 = 4096;

    @OriginalMember(owner = "client!ju", name = "fb", descriptor = "[I")
    private int[] field998 = new int[3];

    @OriginalMember(owner = "client!ju", name = "cb", descriptor = "I")
    private int field995 = 3216;

    @OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
    private int field997 = 3216;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "[C")
    public static char[] field985 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ju", name = "Q", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ju", name = "X", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ju", name = "ab", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ju", name = "bb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ju", name = "db", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BIIIII)V")
    public static final void method464(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field981;
        if (arg0 != -50) {
            method467(122);
        }
        int var6 = class309.method1706(class221.field2942, arg4, 6798, class205.field2784);
        int var7 = class309.method1706(class221.field2942, arg3, 6798, class205.field2784);
        int var8 = class309.method1706(class425.field5751, arg5, 6798, class136.field1985);
        int var9 = class309.method1706(class425.field5751, arg2, 6798, class136.field1985);
        for (int var10 = var6; var7 >= var10; ++var10) {
            class330.method1834(var9, class102.field1472[var10], arg1, var8, 25084);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BIJI)V")
    public static final void method465(byte arg0, int arg1, long arg2, int arg3) {
        ++field992;
        int var5 = ((int) arg2 & 517272) >> 14;
        if (arg0 != 117) {
            field985 = null;
        }
        int var6 = 3 & (int) arg2 >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (~var5 != -11 && var5 != 11 && ~var5 != -23) {
            class302.method1689(true, var5, arg1, 0, 0, arg3, 0, 120, var6);
        } else {
            class88 var8 = class1.field23.method935(var7, (byte) 127);
            int var9;
            int var10;
            if (~var6 != -1 && ~var6 != -3) {
                var9 = var8.field1305;
                var10 = var8.field1249;
            } else {
                var9 = var8.field1249;
                var10 = var8.field1305;
            }
            int var11 = var8.field1279;
            if (~var6 != -1) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 15);
            }
            class302.method1689(true, 0, arg1, var11, var9, arg3, var10, 126, 0);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
    private final void method466(byte arg0) {
        ++field989;
        int var2 = -82 % ((arg0 - -69) / 47);
        double var3 = Math.cos((double) ((float) this.field997 / 4096.0F));
        this.field998[0] = (int) (4096.0D * var3 * Math.sin((double) ((float) this.field995 / 4096.0F)));
        this.field998[1] = (int) (4096.0D * Math.cos((double) ((float) this.field995 / 4096.0F)) * var3);
        this.field998[2] = (int) (Math.sin((double) ((float) this.field997 / 4096.0F)) * 4096.0D);
        int var5 = this.field998[0] * this.field998[0] >> 12;
        int var6 = this.field998[1] * this.field998[1] >> 12;
        int var7 = this.field998[2] * this.field998[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field998[0] = (this.field998[0] << 12) / var8;
            this.field998[1] = (this.field998[1] << 12) / var8;
            this.field998[2] = (this.field998[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 > -100) {
            method469(40L, 98, false, false, 28);
        }
        this.method466((byte) 103);
        ++field994;
    }

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "(I)V")
    public static void method467(int arg0) {
        field985 = null;
        if (arg0 != 0) {
            method464((byte) -74, 30, 93, 82, -45, -81);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ICI)I")
    public static final int method468(int arg0, char arg1, int arg2) {
        ++field983;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 241 && arg2 == 0) {
            var3 = 1762;
        }
        return arg0 != -17731 ? -14 : var3;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(JIZZI)Ljava/lang/String;")
    public static final String method469(long arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field996;
        char var6 = ',';
        char var7 = '.';
        if (~arg1 == -1) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = 160;
        }
        boolean var8 = arg2;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg4 < -1) {
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (48 - (int) arg0 * 10 + var13));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field982;
        int[] var3 = super.field4344.method130(arg1, -112);
        if (super.field4344.field286) {
            int var4 = class52.field699 * this.field988 >> 12;
            int[] var5 = this.method1824(0, false, arg1 - 1 & class266.field3509);
            int[] var6 = this.method1824(0, false, arg1);
            int[] var7 = this.method1824(0, false, arg1 + 1 & class266.field3509);
            for (int var8 = 0; class181.field2495 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class459.field6226] + -var6[var8 + 1 & class459.field6226]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class91.field1346[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field998[2] * var15 >> 12;
                int var18 = this.field998[1] * var16 >> 12;
                int var19 = this.field998[0] * var14 >> 12;
                var3[var8] = var19 - -var18 + var17;
            }
        }
        if (arg0 >= -6) {
            method465((byte) -118, 1, 102L, -2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
    public static final void method470(Color arg0, int arg1, boolean arg2, int arg3, String arg4, Color arg5, Color arg6) {
        ++field990;
        try {
            Graphics var7 = class28.field378.getGraphics();
            if (class308.field4073 == null) {
                class308.field4073 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class424.field5738, field986);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (arg1 != -27474) {
                    field986 = 82;
                }
                if (class387.field5360 == null) {
                    class387.field5360 = class28.field378.createImage(304, 34);
                }
                Graphics var8 = class387.field5360.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg6);
                var8.fillRect(2, 2, arg3 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var8.setFont(class308.field4073);
                var8.setColor(arg5);
                var8.drawString(arg4, (304 - 6 * arg4.length()) / 2, 22);
                var7.drawImage(class387.field5360, class424.field5738 / 2 + -152, field986 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class424.field5738 / 2 + -152;
                int var10 = field986 / 2 + -18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg6);
                var7.fillRect(var9 + 2, var10 - -2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg3 * 3 + 2 + var9, var10 + 2, -(arg3 * 3) + 300, 30);
                var7.setFont(class308.field4073);
                var7.setColor(arg5);
                var7.drawString(arg4, var9 - -((304 + -(6 * arg4.length())) / 2), var10 + 22);
            }
            if (class433.field5898 != null) {
                var7.setFont(class308.field4073);
                var7.setColor(arg5);
                var7.drawString(class433.field5898, class424.field5738 / 2 + -(class433.field5898.length() * 6 / 2), field986 / 2 + -26);
            }
        } catch (Exception var12) {
            class28.field378.repaint();
        }
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)Lhi;")
    public static final class125 method471(byte arg0) {
        if (arg0 != 87) {
            return null;
        } else {
            ++field980;
            try {
                return (class125) Class.forName("ma").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 >= -3) {
            method465((byte) 78, 111, -90L, -121);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field997 = arg1.method215((byte) 121);
                }
            } else {
                this.field995 = arg1.method215((byte) 109);
            }
        } else {
            this.field988 = arg1.method215((byte) 127);
        }
        ++field991;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, true);
    }
}
