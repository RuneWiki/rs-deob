import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class45 extends class288 {

    @OriginalMember(owner = "client!fk", name = "Ec", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!fk", name = "Cc", descriptor = "[I")
    public static int[] field706 = new int[2500];

    @OriginalMember(owner = "client!fk", name = "sc", descriptor = "[[I")
    public static int[][] field696 = new int[104][104];

    @OriginalMember(owner = "client!fk", name = "Bc", descriptor = "[Ll;")
    public static class297[] field705 = new class297[50];

    @OriginalMember(owner = "client!fk", name = "Hc", descriptor = "Lvj;")
    public static class106 field711 = new class106(64);

    @OriginalMember(owner = "client!fk", name = "Jc", descriptor = "I")
    public static int field713 = -1;

    @OriginalMember(owner = "client!fk", name = "pc", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!fk", name = "qc", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!fk", name = "rc", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fk", name = "tc", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!fk", name = "vc", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!fk", name = "xc", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!fk", name = "yc", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!fk", name = "zc", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!fk", name = "Ac", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!fk", name = "Dc", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!fk", name = "Fc", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!fk", name = "Gc", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!fk", name = "Ic", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!fk", name = "uc", descriptor = "Lpj;")
    public class183 field698;

    @OriginalMember(owner = "client!fk", name = "wc", descriptor = "Z")
    public static boolean field700;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Z", line = 5)
    public final boolean method409(int arg0) {
        if (arg0 != 1) {
            field712 = 37;
        }
        field702++;
        return this.field698 != null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)Llk;", line = 21)
    public static final class279 method410(int arg0, int arg1) {
        field709++;
        int var2 = -30 % ((arg0 + 13) / 36);
        class279 var3 = (class279) class102.field1579.method1432((byte) 100, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class206.field3256.method1507(arg1, (byte) -128, 3);
        class279 var5 = new class279();
        if (var4 != null) {
            var5.method1958(new class35(var4), 18808);
        }
        class102.field1579.method1436(false, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V", line = 43)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field710++;
        if (this.field698 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "(I)V", line = 57)
    public static void method411(int arg0) {
        field705 = null;
        field706 = null;
        field711 = null;
        if (arg0 < 21) {
            method414(91, -123);
        }
        field696 = (int[][]) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lpj;Z)V", line = 71)
    public final void method412(class183 arg0, boolean arg1) {
        this.field698 = arg0;
        field693++;
        if (this.field4502 != null) {
            this.field4502.method1776();
        }
        if (!arg1) {
            field700 = false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 91)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        field694++;
        if (this.field698 == null) {
            return;
        }
        class162 var13 = this.field4439 != -1 && this.field4437 == 0 ? class173.method1259((byte) 119, this.field4439) : null;
        class162 var14 = this.field4527 == -1 || this.field4527 == this.method2030(-13196).field2084 && var13 != null ? null : class173.method1259((byte) 119, this.field4527);
        class1 var15 = this.field698.method1320(this.field4436, this.field4449, this.field4536, (byte) 31, var13, this.field4504, var14, this.field4508, this.field4460, this.field4537);
        if (var15 == null) {
            return;
        }
        this.field4488 = var15.method19();
        class183 var16 = this.field698;
        if (var16.field2738 != null) {
            var16 = var16.method1329(121);
        }
        if (class228.field3534 && var16.field2736) {
            class1 var17 = class59.method530(var15, true, this.field698.field2791, this.field4496, this.field4510, this.field698.field2778, this.field4459, var14 == null ? var13 : var14, this.field698.field2750, this.field4507, this.field698.field2751, arg0, var14 == null ? this.field4536 : this.field4436, this.field698.field2730);
            if (class36.field534) {
                float var18 = class36.method329();
                float var19 = class36.method321();
                class36.method319();
                class36.method326(var18, var19 - 150.0F);
                var17.method1(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4502);
                class36.method305();
                class36.method326(var18, var19);
            } else {
                var17.method1(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4502);
            }
        }
        this.method2040(var15, -32768);
        this.method2039(true, arg0, var15);
        class1 var20 = null;
        if (this.field4526 != -1 && this.field4482 != -1) {
            class269 var21 = class99.method778(20951, this.field4526);
            var20 = var21.method1871((byte) -107, this.field4480, this.field4482, this.field4533);
            if (var20 != null) {
                var20.method32(0, -this.field4509, 0);
                if (var21.field4057) {
                    if (class265.field3960 != 0) {
                        var20.method4(class265.field3960);
                    }
                    if (class293.field4597 != 0) {
                        var20.method21(class293.field4597);
                    }
                    if (class324.field5048 != 0) {
                        var20.method32(0, class324.field5048, 0);
                    }
                }
            }
        }
        if (!class36.field534) {
            if (var20 != null) {
                var15 = ((class85) var15).method707(var20);
            }
            if (this.field698.field2750 == 1) {
                var15.field1 = true;
            }
            var15.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4502);
            return;
        }
        if (this.field698.field2750 == 1) {
            var15.field1 = true;
        }
        var15.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4502);
        if (var20 != null) {
            if (this.field698.field2750 == 1) {
                var20.field1 = true;
            }
            var20.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4502);
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)I", line = 202)
    public final int method413(int arg0) {
        field695++;
        if (~class3.field12 != arg0 && this.field698.field2738 != null) {
            class183 var2 = this.field698.method1329(126);
            if (var2 != null && var2.field2794 != -1) {
                return var2.field2794;
            }
        }
        return this.field4478;
    }

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V", line = 223)
    protected final void finalize() {
        field703++;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)Ljava/lang/String;", line = 243)
    public static final String method414(int arg0, int arg1) {
        field704++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        int var4 = 69 % ((arg1 + 12) / 63);
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class309.field4811 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class6.field58 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)Lql;", line = 272)
    public static final class17 method415(int arg0, int arg1) {
        class17 var2 = (class17) class276.field4239.method816((long) arg1, (byte) 73);
        field697++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class133.field2098.method1507(0, (byte) 67, arg1);
        if (var3 == null) {
            return null;
        }
        class17 var4 = new class17();
        class35 var5 = new class35(var3);
        var5.field455 = var5.field437.length - 2;
        int var6 = var5.method300(-1394191632);
        int var7 = var5.field437.length - (var6 + 12) - 2;
        if (arg0 > -79) {
            field711 = (class106) null;
        }
        var5.field455 = var7;
        int var8 = var5.method299(-98);
        var4.field196 = var5.method300(-1394191632);
        var4.field202 = var5.method300(-1394191632);
        var4.field199 = var5.method300(-1394191632);
        var4.field200 = var5.method300(-1394191632);
        int var9 = var5.method273(65280);
        if (var9 > 0) {
            var4.field195 = new class29[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method300(-1394191632);
                class29 var12 = new class29(class230.method1638((byte) 83, var11));
                var4.field195[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method299(-88);
                    int var14 = var5.method299(-117);
                    var12.method208(new class181(var14), (long) var13, 0);
                }
            }
        }
        int var15 = 0;
        var5.field455 = 0;
        var4.field193 = var5.method268((byte) -125);
        var4.field201 = new int[var8];
        var4.field197 = new String[var8];
        var4.field198 = new int[var8];
        while (var5.field455 < var7) {
            int var16 = var5.method300(-1394191632);
            if (var16 == 3) {
                var4.field197[var15] = var5.method279(33).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field198[var15] = var5.method273(65280);
            } else {
                var4.field198[var15] = var5.method299(-73);
            }
            var4.field201[var15++] = var16;
        }
        class276.field4239.method817(var4, (long) arg1, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()I", line = 365)
    public final int method19() {
        field701++;
        return this.field4488;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;ZI)V", line = 392)
    public static final void method416(int arg0, Color arg1, String arg2, boolean arg3, int arg4) {
        field707++;
        try {
            Graphics var5 = class171.field2548.getGraphics();
            if (class201.field3195 == null) {
                class201.field3195 = new Font("Helvetica", 1, 13);
                class33.field410 = class171.field2548.getFontMetrics(class201.field3195);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class125.field1972, class210.field3314);
            }
            if (arg4 != -31017) {
                return;
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class310.field4839 == null) {
                    class310.field4839 = class171.field2548.createImage(304, 34);
                }
                Graphics var6 = class310.field4839.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg0 * 3) + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class201.field3195);
                var6.setColor(Color.white);
                var6.drawString(arg2, (304 - class33.field410.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class310.field4839, class125.field1972 / 2 - 152, class210.field3314 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class125.field1972 / 2 - 152;
                int var9 = class210.field3314 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class201.field3195);
                var5.setColor(Color.white);
                var5.drawString(arg2, var8 + ((304 - class33.field410.stringWidth(arg2)) / 2), var9 + 22);
            }
            if (class33.field413 != null) {
                var5.setFont(class201.field3195);
                var5.setColor(Color.white);
                var5.drawString(class33.field413, class125.field1972 / 2 - (class33.field410.stringWidth(class33.field413) / 2), class210.field3314 / 2 + -26);
            }
        } catch (Exception var12) {
            class171.field2548.repaint();
        }
    }
}
