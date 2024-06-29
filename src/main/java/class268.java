import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class268 extends class35 {

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Z")
    public static boolean field4124 = false;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4122 = "wave2:";

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field4140 = -1;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method1775(int arg0, boolean arg1) {
        if (arg0 == 37) {
            class248.field3867 = 3.0F;
        } else if (arg0 == 50) {
            class248.field3867 = 4.0F;
        } else if (arg0 == 75) {
            class248.field3867 = 6.0F;
        } else if (arg0 == 100) {
            class248.field3867 = 8.0F;
        } else if (arg0 == 200) {
            class248.field3867 = 16.0F;
        }
        class336.field5148 = -1;
        field4137++;
        if (arg1) {
            field4127 = -112;
        }
        class336.field5148 = -1;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Z", line = 51)
    public final boolean method1776(int arg0) {
        field4138++;
        if (arg0 != 1507) {
            field4127 = -27;
        }
        return ((this.field4125 & 0x2C3616) >> 21) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Z", line = 64)
    public final boolean method1777(byte arg0) {
        int var2 = 87 % ((arg0 - 80) / 37);
        field4131++;
        return (this.field4125 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;ZLjava/awt/Color;II)V", line = 76)
    public static final void method1778(String arg0, boolean arg1, Color arg2, int arg3, int arg4) {
        try {
            Graphics var5 = class216.field3456.getGraphics();
            if (class72.field1505 == null) {
                class72.field1505 = new Font("Helvetica", 1, 13);
                class33.field679 = class216.field3456.getFontMetrics(class72.field1505);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class88.field1658, class134.field2257);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class44.field894 == null) {
                    class44.field894 = class216.field3456.createImage(304, 34);
                }
                Graphics var6 = class44.field894.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                if (arg4 != 279345134) {
                    return;
                }
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class72.field1505);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class33.field679.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class44.field894, class88.field1658 / 2 - 152, class134.field2257 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class88.field1658 / 2 - 152;
                int var9 = class134.field2257 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 - (-(arg3 * 3) - 2), var9 - -2, 300 - (arg3 * 3), 30);
                var5.setFont(class72.field1505);
                var5.setColor(Color.white);
                var5.drawString(arg0, var8 + ((304 - class33.field679.stringWidth(arg0)) / 2), var9 + 22);
            }
            if (class248.field3861 != null) {
                var5.setFont(class72.field1505);
                var5.setColor(Color.white);
                var5.drawString(class248.field3861, class88.field1658 / 2 - class33.field679.stringWidth(class248.field3861) / 2, class134.field2257 / 2 + -26);
            }
        } catch (Exception var12) {
            class216.field3456.repaint();
        }
        field4132++;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Z", line = 146)
    public final boolean method1779(int arg0) {
        field4135++;
        int var2 = 17 % ((-arg0 - 6) / 41);
        return (this.field4125 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)I", line = 156)
    public final int method1780(byte arg0) {
        field4126++;
        if (arg0 <= 69) {
            this.field4125 = 90;
        }
        return this.field4125 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)V", line = 170)
    public static void method1781(byte arg0) {
        if (arg0 > -123) {
            field4127 = 123;
        }
        field4122 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 181)
    public static final void method1782(boolean arg0) {
        field4123++;
        if (!arg0) {
            method1788(-47, true, 19, 42, -53, -4, 12, true, -54, -97);
        }
        if (class328.field5033 != null) {
            class328.field5033.method1499((byte) 95);
        }
        if (class41.field797 != null) {
            class41.field797.method1499((byte) 103);
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)I", line = 203)
    public final int method1783(int arg0) {
        if (arg0 != -1) {
            method1775(-17, true);
        }
        field4129++;
        return class339.method2340(this.field4125, 105);
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(B)Z", line = 214)
    public final boolean method1784(byte arg0) {
        field4133++;
        if (arg0 > -87) {
            field4140 = -118;
        }
        return (this.field4125 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z", line = 229)
    public final boolean method1785(int arg0) {
        int var2 = 86 % ((40 - arg0) / 53);
        field4134++;
        return ((this.field4125 & 0x729233) >> 22) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(B)Z", line = 240)
    public final boolean method1786(byte arg0) {
        int var2 = 61 / ((arg0 - 71) / 33);
        field4130++;
        return (this.field4125 & 0x10A677EE) >> 28 != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z", line = 249)
    public final boolean method1787(int arg0, int arg1) {
        if (arg1 < 115) {
            this.method1789(false);
        }
        field4136++;
        return (this.field4125 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZIIIIIZII)V", line = 260)
    public static final void method1788(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field4142++;
        int var10 = arg9 - arg3;
        int var11 = arg0 - arg2;
        if (arg7) {
            int var12 = (arg4 - arg6 << 16) / var11;
            int var13 = (arg5 - arg8 << 16) / var10;
            class298.method1990(arg1, var13, arg6, var12, 0, -125, 0, arg9, arg2, arg0, arg3, arg8);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Z)Z", line = 279)
    public final boolean method1789(boolean arg0) {
        field4128++;
        if (!arg0) {
            this.field4141 = -125;
        }
        return ((this.field4125 & 0x2B952948) >> 29) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)V", line = 291)
    public static final void method1790(byte arg0, int arg1, int arg2) {
        field4139++;
        class2 var3 = class212.method1433(arg1, 7, -13802);
        var3.method13((byte) -1);
        var3.field39 = arg2;
        if (arg0 != -17) {
            field4124 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lvj;ILvj;ZI)I", line = 310)
    public static final int method1791(class103 arg0, int arg1, class103 arg2, boolean arg3, int arg4) {
        field4143++;
        if (arg1 == 1) {
            int var5 = arg2.field3350;
            int var6 = arg0.field3350;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        }
        if (arg4 != -7722) {
            method1781((byte) 18);
        }
        if (arg1 == 2) {
            return class303.method2010(class321.field4894, arg0.method669(125).field3761, arg2.method669(124).field3761, arg4 + 7731);
        } else if (arg1 == 3) {
            if (arg2.field1792.equals("-")) {
                if (arg0.field1792.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field1792.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class303.method2010(class321.field4894, arg0.field1792, arg2.field1792, -113);
            }
        } else if (arg1 == 4) {
            return arg2.method1381((byte) 115) ? (arg0.method1381((byte) 126) ? 0 : 1) : (arg0.method1381((byte) 124) ? -1 : 0);
        } else if (arg1 == 5) {
            return arg2.method1378(16) ? (arg0.method1378(16) ? 0 : 1) : (arg0.method1378(16) ? -1 : 0);
        } else if (arg1 == 6) {
            return arg2.method1377((byte) -118) ? (arg0.method1377((byte) -104) ? 0 : 1) : (arg0.method1377((byte) -82) ? -1 : 0);
        } else if (arg1 == 7) {
            return arg2.method1379((byte) 64) ? (arg0.method1379((byte) 127) ? 0 : 1) : (arg0.method1379((byte) -107) ? -1 : 0);
        } else {
            return arg2.field1791 - arg0.field1791;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V", line = 377)
    public class268(int arg0, int arg1) {
        this.field4125 = arg0;
        this.field4141 = arg1;
    }
}
