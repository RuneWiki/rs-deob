import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class151 {

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "[I")
    public static int[] field1670 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lnh;")
    public static class680 field1674;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1676;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method825(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field1671++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method819(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1667++;
        class653 var5 = class496.method2869(-123);
        var5.field9158.method658(class249.field3123.field1673, (byte) 123);
        var5.field9158.method658(arg1, (byte) 55);
        var5.field9158.method658(arg0, (byte) 76);
        var5.field9158.method645(-672168216, arg4);
        var5.field9158.method645(-672168216, arg2);
        class568.method3220(var5, (byte) 107);
        class51.field514 = 0;
        class227.field2811 = 0;
        class239.field2965 = -3;
        int var6 = -68 % ((arg3 + 52) / 34);
        class654.field9183 = 1;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 41)
    public static final void method820(byte arg0) {
        try {
            Method var1 = (field1676 == null ? (field1676 = method825("java.lang.Runtime")) : field1676).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class141.field1559 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != -40) {
                method824(null, true, 115, null, null, null);
            }
        } catch (Exception var5) {
        }
        field1672++;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([BI)V", line = 69)
    public static final void method821(byte[] arg0, int arg1) {
        field1675++;
        class115 var2 = new class115(arg0);
        if (arg1 != 30) {
            field1670 = null;
        }
        while (true) {
            int var3 = var2.method620((byte) -5);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class415.field5567 = var2.method643((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZ)Z", line = 98)
    public static final boolean method822(int arg0, boolean arg1) {
        field1669++;
        if (arg1) {
            return false;
        } else if (arg0 == 47 || arg0 == 45 || arg0 == 46 || arg0 == 60 || arg0 == 9) {
            return true;
        } else {
            return arg0 == 50 || arg0 == 1003;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 115)
    public static void method823(int arg0) {
        field1670 = null;
        field1674 = null;
        if (arg0 != 140) {
            method824(null, false, -82, null, null, null);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;ZILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 127)
    public static final void method824(String arg0, boolean arg1, int arg2, Color arg3, Color arg4, Color arg5) {
        field1668++;
        try {
            Graphics var6 = class41.field407.getGraphics();
            if (class7.field81 == null) {
                class7.field81 = new Font("Helvetica", 1, 13);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class461.field6560 == null) {
                    class461.field6560 = class41.field407.createImage(class146.field1618, class338.field4244);
                }
                if (arg1) {
                    method823(84);
                }
                Graphics var7 = class461.field6560.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class146.field1618, class338.field4244);
                int var8 = class146.field1618 / 2 - 152;
                int var9 = class338.field4244 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var8 + 2, var9 - -2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg2 * 3 + var8 + 2, var9 + 2, 300 - (arg2 * 3), 30);
                var7.setFont(class7.field81);
                var7.setColor(arg3);
                var7.drawString(arg0, var8 + ((304 - (arg0.length() * 6)) / 2), var9 + 22);
                if (class106.field1149 != null) {
                    var7.setFont(class7.field81);
                    var7.setColor(arg3);
                    var7.drawString(class106.field1149, class146.field1618 / 2 - (class106.field1149.length() * 6 / 2), class338.field4244 / 2 - 26);
                }
                var6.drawImage(class461.field6560, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class146.field1618, class338.field4244);
                int var10 = class146.field1618 / 2 - 152;
                int var11 = class338.field4244 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg4);
                var6.fillRect(var10 + 2, var11 + 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg2 * 3 + var10 + 2, var11 + 2, 300 - (arg2 * 3), 30);
                var6.setFont(class7.field81);
                var6.setColor(arg3);
                if (class106.field1149 != null) {
                    var6.setFont(class7.field81);
                    var6.setColor(arg3);
                    var6.drawString(class106.field1149, class146.field1618 / 2 - (class106.field1149.length() * 6 / 2), class338.field4244 / 2 + -26);
                }
                var6.drawString(arg0, var10 + ((304 - (arg0.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class41.field407.repaint();
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(II)V", line = 213)
    public class151(int arg0, int arg1) {
        this.field1673 = arg0;
    }
}
