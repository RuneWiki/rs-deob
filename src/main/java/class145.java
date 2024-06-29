import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class145 implements class763 {

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "Ljava/lang/String;")
    private String field1879;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1882 = new String[] { method1258(method1257("N7A\u001f\u0002\u0007")), method1258(method1257("g5LG\"[9CP")), method1258(method1257("T~\u000e\u001f:")), method1258(method1257("N7A\u001f\u0005\u0007")), method1258(method1257("A%L]")), method1258(method1257("N7A\u001f\u0004\u0007")), method1258(method1257("N7A\u001f\u0001\u0007")), method1258(method1257("N7A\u001f\u0006\u0007")), method1258(method1257("N7A\u001f{F>IEy\u0007")), method1258(method1257("N7A\u001f\u0003\u0007")) };

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "Lmv;")
    public static class125 field1877 = new class125(42, 15);

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "B")
    public static byte field1876;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Z")
    private boolean field1874;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        try {
            if (arg0 == 303) {
                field1875++;
                return this.field1874;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1882[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I")
    public final int method1252(int arg0) {
        try {
            field1881++;
            int var2 = class437.method3409(8, this.field1879);
            int var3 = -97 % ((arg0 + 28) / 36);
            if (var2 >= 0 && var2 <= 100) {
                return var2;
            } else {
                this.field1874 = true;
                return 100;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1882[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;I)V")
    public static final void method1253(int arg0, Color arg1, String arg2, Color arg3, Color arg4, int arg5) {
        try {
            field1878++;
            try {
                Graphics var6 = class560.field8153.getGraphics();
                if (class502.field7332 == null) {
                    class502.field7332 = new Font(field1882[1], 1, 13);
                }
                if (arg1 == null) {
                    arg1 = new Color(140, 17, 17);
                }
                if (arg3 == null) {
                    arg3 = new Color(140, 17, 17);
                }
                if (arg4 == null) {
                    arg4 = new Color(255, 255, 255);
                }
                try {
                    if (arg5 == -17146) {
                        if (class123.field1554 == null) {
                            class123.field1554 = class560.field8153.createImage(class391.field5700, class711.field9998);
                        }
                        Graphics var7 = class123.field1554.getGraphics();
                        var7.setColor(Color.black);
                        var7.fillRect(0, 0, class391.field5700, class711.field9998);
                        int var8 = class391.field5700 / 2 - 152;
                        int var9 = class711.field9998 / 2 - 18;
                        var7.setColor(arg3);
                        var7.drawRect(var8, var9, 303, 33);
                        var7.setColor(arg1);
                        var7.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                        var7.setColor(Color.black);
                        var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                        var7.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                        var7.setFont(class502.field7332);
                        var7.setColor(arg4);
                        var7.drawString(arg2, (304 - arg2.length() * 6) / 2 + var8, var9 - -22);
                        if (class617.field8802 != null) {
                            var7.setFont(class502.field7332);
                            var7.setColor(arg4);
                            var7.drawString(class617.field8802, class391.field5700 / 2 - (class617.field8802.length() * 6 / 2), class711.field9998 / 2 + -26);
                        }
                        var6.drawImage(class123.field1554, 0, 0, null);
                    }
                } catch (Exception var13) {
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, class391.field5700, class711.field9998);
                    int var10 = class391.field5700 / 2 - 152;
                    int var11 = class711.field9998 / 2 - 18;
                    var6.setColor(arg3);
                    var6.drawRect(var10, var11, 303, 33);
                    var6.setColor(arg1);
                    var6.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var6.fillRect((arg0 * 3) + var10 + 2, var11 + 2, 300 - arg0 * 3, 30);
                    var6.setFont(class502.field7332);
                    var6.setColor(arg4);
                    if (class617.field8802 != null) {
                        var6.setFont(class502.field7332);
                        var6.setColor(arg4);
                        var6.drawString(class617.field8802, class391.field5700 / 2 - class617.field8802.length() * 6 / 2, class711.field9998 / 2 + -26);
                    }
                    var6.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var10, var11 - -22);
                }
            } catch (Exception var14) {
                class560.field8153.repaint();
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field1882[3] + arg0 + ',' + (arg1 == null ? field1882[4] : field1882[2]) + ',' + (arg2 == null ? field1882[4] : field1882[2]) + ',' + (arg3 == null ? field1882[4] : field1882[2]) + ',' + (arg4 == null ? field1882[4] : field1882[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Luw;")
    public final class706 method1254(int arg0) {
        try {
            field1880++;
            if (arg0 >= -92) {
                method1255(-25);
            }
            return class706.field9871;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1882[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)V")
    public static void method1255(int arg0) {
        try {
            field1877 = null;
            int var1 = -34 / ((73 - arg0) / 37);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1882[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)Z")
    public static final boolean method1256(int arg0, int arg1, int arg2) {
        try {
            if (arg0 == 0) {
                field1873++;
                return class398.method3116((byte) -33, arg1, arg2) & class222.method1861(arg2, -27943, arg1);
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1882[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class145(String arg0) {
        try {
            this.field1879 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1882[8] + (arg0 == null ? field1882[4] : field1882[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1257(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1258(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
