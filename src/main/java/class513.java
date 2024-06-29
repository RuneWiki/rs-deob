import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class513 extends class238 implements class231 {

    @OriginalMember(owner = "client!th", name = "W", descriptor = "B")
    private byte field7333;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "Z")
    private boolean field7332;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "B")
    private byte field7313;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Z")
    private boolean field7326;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "Z")
    private boolean field7323;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "S")
    private short field7318;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Z")
    private boolean field7319;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Lk;")
    private class485 field7322;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Lr;")
    private class159 field7316;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "[I")
    public static int[] field7320 = new int[4096];

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Lbn;")
    public static class378 field7308 = new class378(10, 2);

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "[I")
    public static int[] field7337 = new int[2];

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "Lpl;")
    private class558 field7334;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        if (arg6 != 21130) {
            this.field7319 = false;
        }
        ++field7321;
        if (arg5 instanceof class513) {
            class513 var8 = (class513) arg5;
            if (this.field7316 != null && var8.field7316 != null) {
                this.field7316.method78(var8.field7316, arg3, arg1, arg4, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)Z")
    public static final boolean method3044(int arg0, int arg1) {
        ++field7312;
        if (~arg0 != -50 && ~arg0 != -13 && ~arg0 != -23 && arg0 != 9 && ~arg0 != -1012) {
            if (arg1 != 1012) {
                field7308 = null;
            }
            return ~arg0 == -16 || arg0 == 1012;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        ++field7314;
        return arg0 <= 40 ? null : this.method3048(arg2, (byte) -8, arg1);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (this.field7316 != null) {
            this.field7316.method55();
        }
        if (arg0 <= 95) {
            this.method170(39);
        }
        ++field7317;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        if (arg0 != 0) {
            this.field7332 = false;
        }
        ++field7305;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            this.field7334 = null;
        }
        ++field7336;
        return this.field7318 & 65535;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        ++field7330;
        if (this.field7316 == null) {
            return null;
        } else {
            if (arg0 <= 0) {
                this.field7333 = -20;
            }
            class165 var3 = arg1.method428();
            var3.method353(super.field3426, super.field3425, super.field3429);
            class77 var4 = null;
            if (this.field7323) {
                var4 = class450.method2725(1, 26728);
            }
            this.field7316.method93(var3, var4 == null ? null : var4.field1022[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLqa;B)Lis;")
    private final class429 method3045(int arg0, boolean arg1, class208 arg2, byte arg3) {
        ++field7335;
        class145 var5 = class216.field3172.method1505(-24044, 65535 & this.field7318);
        if (arg3 < 17) {
            return null;
        } else {
            class176 var6;
            class176 var7;
            if (this.field7332) {
                var6 = class114.field1609[this.field7313];
                var7 = class207.field3077[0];
            } else {
                var6 = class207.field3077[this.field7313];
                if (this.field7313 >= 3) {
                    var7 = null;
                } else {
                    var7 = class207.field3077[this.field7313 - -1];
                }
            }
            return var5.method997(super.field3426, 22, 19, arg1, arg0, super.field3429, var7, var6, this.field7333, arg2, super.field3425);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZI)I")
    public static final int method3046(int arg0, boolean arg1, int arg2) {
        ++field7327;
        int var3 = (127 & arg0) * arg2 >> 7;
        if (!arg1) {
            method3047(105, (String) null, true, (Color) null, (Color) null, -95, (Color) null);
        }
        if (var3 >= 2) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (arg0 & 65408) + var3;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        this.field7326 = false;
        ++field7304;
        if (this.field7316 != null) {
            this.field7316.method79(-65537 & this.field7316.method90());
        }
        if (arg0 != 1) {
            this.method183(16);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;)V")
    public static final void method3047(int arg0, String arg1, boolean arg2, Color arg3, Color arg4, int arg5, Color arg6) {
        ++field7331;
        try {
            Graphics var7 = class79.field1069.getGraphics();
            if (class151.field2294 == null) {
                class151.field2294 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class165.field2605, class47.field562);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class244.field3486 == null) {
                    class244.field3486 = class79.field1069.createImage(304, 34);
                }
                Graphics var8 = class244.field3486.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var8.setFont(class151.field2294);
                var8.setColor(arg4);
                var8.drawString(arg1, (-(6 * arg1.length()) + 304) / 2, 22);
                var7.drawImage(class244.field3486, class165.field2605 / 2 + -152, class47.field562 / 2 + -18, (ImageObserver) null);
                int var9 = 35 / ((arg5 - -48) / 58);
            } catch (Exception var12) {
                int var10 = class165.field2605 / 2 + -152;
                int var11 = class47.field562 / 2 + -18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var10 - -2, var11 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + (var10 - -2), var11 + 2, -(arg0 * 3) + 300, 30);
                var7.setFont(class151.field2294);
                var7.setColor(arg4);
                var7.drawString(arg1, (304 - arg1.length() * 6) / 2 + var10, var11 + 22);
            }
            if (class448.field6273 != null) {
                var7.setFont(class151.field2294);
                var7.setColor(arg4);
                var7.drawString(class448.field6273, class165.field2605 / 2 + -(class448.field6273.length() * 6 / 2), class47.field562 / 2 - 26);
            }
        } catch (Exception var13) {
            class79.field1069.repaint();
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lqa;BI)Lr;")
    private final class159 method3048(class208 arg0, byte arg1, int arg2) {
        ++field7329;
        if (this.field7316 != null && arg0.method528(this.field7316.method90(), arg2) == 0) {
            return this.field7316;
        } else {
            class429 var4 = this.method3045(arg2, false, arg0, (byte) 101);
            int var5 = 74 % ((-88 - arg1) / 34);
            return var4 == null ? null : var4.field5765;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        ++field7311;
        int var2 = -27 / ((arg0 - -43) / 49);
        return 22;
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
    public static void method3049(int arg0) {
        field7320 = null;
        field7308 = null;
        field7337 = null;
        int var1 = -60 % ((arg0 - -37) / 40);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        if (arg3 <= 44) {
            this.field7322 = null;
        }
        ++field7315;
        class159 var5 = this.method3048(arg1, (byte) 61, 131072);
        if (var5 != null) {
            class165 var6 = arg1.method428();
            var6.method353(super.field3426, super.field3425, super.field3429);
            return var5.method72(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        if (arg0 != -41) {
            this.field7319 = false;
        }
        ++field7306;
        return this.field7319;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lqa;Luh;IIIIZIZ)V")
    public class513(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field2032, arg1.field2105, arg1.field2035);
        this.field7333 = (byte) arg7;
        this.field7332 = arg6;
        this.field7313 = (byte) arg2;
        this.field7326 = arg8;
        super.field3426 = arg3;
        super.field3429 = arg5;
        this.field7323 = arg1.field2056 != 0 && !arg6;
        this.field7318 = (short) arg1.field2049;
        this.field7319 = arg0.method457() && arg1.field2084 && !this.field7332 && ~class56.field668.method2897(class526.field7533, 6373) != -1;
        int var10 = 2048;
        if (this.field7326) {
            var10 |= 65536;
        }
        class429 var11 = this.method3045(var10, this.field7319, arg0, (byte) 50);
        if (var11 != null) {
            this.field7322 = var11.field5763;
            this.field7316 = var11.field5765;
            if (this.field7326) {
                this.field7316 = this.field7316.method94((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        ++field7328;
        if (arg0 >= -120) {
            this.field7332 = true;
        }
        return this.field7333;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        if (arg0 != 115) {
            this.field7313 = -25;
        }
        ++field7324;
        Object var3 = null;
        class485 var5;
        if (this.field7322 == null && this.field7319) {
            class429 var4 = this.method3045(262144, true, arg1, (byte) 69);
            var5 = var4 == null ? null : var4.field5763;
        } else {
            var5 = this.field7322;
            this.field7322 = null;
        }
        if (var5 != null) {
            class46.method290(var5, this.field7313, super.field3426, super.field3429, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static final void method3050(boolean arg0) {
        ++field7310;
        if (class372.field5114) {
            if (arg0) {
                method3044(-75, -79);
            }
            while (true) {
                while (~class348.field4775.length < ~class336.field4650) {
                    class187 var1 = class348.field4775[class336.field4650];
                    if (var1 != null && ~var1.field2787 == 0) {
                        if (class418.field5656 == null) {
                            class418.field5656 = class97.field1413.method1705(127, var1.field2788);
                        }
                        int var2 = class418.field5656.field9292;
                        if (~var2 == 0) {
                            return;
                        }
                        var1.field2787 = var2;
                        ++class336.field4650;
                        class418.field5656 = null;
                    } else {
                        ++class336.field4650;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        if (this.field7334 == null) {
            this.field7334 = class115.method826(this.method3048(arg0, (byte) 19, 0), super.field3426, 21979, super.field3429, super.field3425);
        }
        ++field7307;
        if (arg1 != 31733) {
            this.method172(-56);
        }
        return this.field7334;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        ++field7325;
        Object var3 = null;
        class485 var5;
        if (this.field7322 == null && this.field7319) {
            class429 var4 = this.method3045(262144, true, arg1, (byte) 34);
            var5 = var4 == null ? null : var4.field5763;
        } else {
            var5 = this.field7322;
            this.field7322 = null;
        }
        if (arg0 > -36) {
            method3049(-43);
        }
        if (var5 != null) {
            class377.method2253(var5, this.field7313, super.field3426, super.field3429, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        ++field7309;
        if (arg0 != 58) {
            method3047(-106, (String) null, false, (Color) null, (Color) null, -16, (Color) null);
        }
        return this.field7326;
    }
}
