import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class35 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "[I")
    public static int[] field361 = new int[50];

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Loo;")
    public static class629 field364 = new class629(1, 2);

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field370 = 100;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Luj;")
    public static class385 field371;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 8 && arg4 != 16) {
            class186 var7 = class80.field1136[arg1][arg5][arg3];
            if (var7 == null) {
                var7 = new class186(arg1);
            }
            if (arg4 == 1) {
                var7.field2833 = (short) arg2;
                var7.field2839 = (short) arg6;
            } else if (arg4 == 2) {
                var7.field2837 = (short) arg2;
                var7.field2838 = (short) arg6;
            }
            if (class262.field3715) {
                class490.method2933(16776960);
            }
        } else if (arg4 == 8) {
            int var14 = arg5 << class459.field6769;
            int var15 = class504.field7164 + var14;
            int var16 = arg3 << class459.field6769;
            int var17 = class504.field7164 + var16;
            int var18 = class531.field7566[arg1].method1787(arg5, 19646, arg3);
            int var19 = class531.field7566[arg1].method1787(arg5 + 1, 19646, arg3 + 1);
            class315.field4461[class233.field3398++] = new class417(arg4, arg1, var14, var15, var15, var14, var18, var19, var19 - arg2, -arg2 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg5 << class459.field6769) + class504.field7164;
            int var9 = var8 - class504.field7164;
            int var10 = arg3 << class459.field6769;
            int var11 = class504.field7164 + var10;
            int var12 = class531.field7566[arg1].method1787(arg5 + 1, 19646, arg3);
            int var13 = class531.field7566[arg1].method1787(arg5, 19646, arg3 + 1);
            class315.field4461[class233.field3398++] = new class417(arg4, arg1, var8, var9, var9, var8, var12, var13, var13 - arg2, -arg2 + var12, var10, var11, var11, var10);
        }
        field369++;
        if (arg0 <= 26) {
            field364 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 79)
    public static void method179(byte arg0) {
        field361 = null;
        field364 = null;
        if (arg0 > -83) {
            field371 = null;
        }
        field371 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljo;IZ)V", line = 94)
    public static final void method180(class336 arg0, int arg1, boolean arg2) {
        field367++;
        if (arg1 > -27) {
            field371 = null;
        }
        class176.field2719.method1975((byte) 37, arg0);
        if (arg2) {
            class677.method3891(arg0, (byte) -110, class555.field7932, class69.field977, class756.field10584, class176.field2719);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BI)[B", line = 115)
    public static final synchronized byte[] method181(byte arg0, int arg1) {
        field366++;
        if (arg1 == 100 && class208.field3049 > 0) {
            byte[] var2 = class528.field7536[--class208.field3049];
            class528.field7536[class208.field3049] = null;
            return var2;
        } else if (arg1 == 5000 && class447.field6620 > 0) {
            byte[] var3 = class218.field3216[--class447.field6620];
            class218.field3216[class447.field6620] = null;
            return var3;
        } else if (arg1 == 30000 && class145.field1936 > 0) {
            byte[] var4 = class184.field2820[--class145.field1936];
            class184.field2820[class145.field1936] = null;
            return var4;
        } else {
            if (class2.field24 != null) {
                for (int var5 = 0; var5 < class22.field235.length; var5++) {
                    if (class22.field235[var5] == arg1 && class153.field2478[var5] > 0) {
                        byte[] var6 = class2.field24[var5][--class153.field2478[var5]];
                        class2.field24[var5][class153.field2478[var5]] = null;
                        return var6;
                    }
                }
            }
            if (arg0 != -69) {
                method181((byte) 118, 92);
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 173)
    public static final String method182(String arg0, String arg1, String arg2, int arg3) {
        int var4 = -5 % ((arg3 - 30) / 36);
        field368++;
        for (int var5 = arg2.indexOf(arg0); var5 != -1; var5 = arg2.indexOf(arg0, arg1.length() + var5)) {
            arg2 = arg2.substring(0, var5) + arg1 + arg2.substring(arg0.length() + var5);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[B)V", line = 191)
    public static final synchronized void method183(int arg0, byte[] arg1) {
        if (arg0 >= -46) {
            method182(null, null, null, -119);
        }
        field362++;
        if (arg1.length == 100 && class208.field3049 < 1000) {
            class528.field7536[class208.field3049++] = arg1;
        } else if (arg1.length == 5000 && class447.field6620 < 250) {
            class218.field3216[class447.field6620++] = arg1;
        } else if (arg1.length == 30000 && class145.field1936 < 50) {
            class184.field2820[class145.field1936++] = arg1;
        } else if (class2.field24 != null) {
            for (int var2 = 0; var2 < class22.field235.length; var2++) {
                if (class22.field235[var2] == arg1.length && class153.field2478[var2] < class2.field24[var2].length) {
                    class2.field24[var2][class153.field2478[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/awt/Color;BLjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V", line = 240)
    public static final void method184(int arg0, Color arg1, byte arg2, String arg3, Color arg4, Color arg5) {
        field363++;
        try {
            Graphics var6 = class106.field1476.getGraphics();
            if (class255.field3662 == null) {
                class255.field3662 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class457.field6742 == null) {
                    class457.field6742 = class106.field1476.createImage(class501.field7123, class510.field7263);
                }
                Graphics var7 = class457.field6742.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class501.field7123, class510.field7263);
                int var8 = class501.field7123 / 2 - 152;
                int var9 = class510.field7263 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                int var10 = 68 / ((16 - arg2) / 48);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg0 * 3 + var8 + 2, var9 - -2, 300 - (arg0 * 3), 30);
                var7.setFont(class255.field3662);
                var7.setColor(arg1);
                var7.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var8, var9 + 22);
                if (class284.field4034 != null) {
                    var7.setFont(class255.field3662);
                    var7.setColor(arg1);
                    var7.drawString(class284.field4034, class501.field7123 / 2 - (class284.field4034.length() * 6 / 2), class510.field7263 / 2 + -26);
                }
                var6.drawImage(class457.field6742, 0, 0, null);
            } catch (Exception var13) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class501.field7123, class510.field7263);
                int var11 = class501.field7123 / 2 - 152;
                int var12 = class510.field7263 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var11, var12, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var11 + 2, var12 - -2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var11 + 1, var12 - -1, 301, 31);
                var6.fillRect(arg0 * 3 + var11 + 2, var12 + 2, 300 - (arg0 * 3), 30);
                var6.setFont(class255.field3662);
                var6.setColor(arg1);
                if (class284.field4034 != null) {
                    var6.setFont(class255.field3662);
                    var6.setColor(arg1);
                    var6.drawString(class284.field4034, class501.field7123 / 2 - class284.field4034.length() * 6 / 2, class510.field7263 / 2 - 26);
                }
                var6.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var11, var12 + 22);
            }
        } catch (Exception var14) {
            class106.field1476.repaint();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIIIII)V", line = 330)
    public static final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != -251) {
            field364 = null;
        }
        if (arg5 >= class497.field7073 && arg5 <= class391.field5895 && class497.field7073 <= arg0 && arg0 <= class391.field5895 && class497.field7073 <= arg4 && arg4 <= class391.field5895 && arg8 >= class497.field7073 && arg8 <= class391.field5895 && class166.field2622 <= arg6 && arg6 <= class432.field6446 && class166.field2622 <= arg1 && class432.field6446 >= arg1 && class166.field2622 <= arg3 && arg3 <= class432.field6446 && class166.field2622 <= arg7 && class432.field6446 >= arg7) {
            class289.method1846(arg9, arg5, arg0, arg7, arg8, arg1, arg6, arg4, arg3, 109);
        } else {
            class637.method3660(arg4, arg8, arg3, 252, arg5, arg0, arg7, arg1, arg6, arg9);
        }
        field365++;
    }
}
