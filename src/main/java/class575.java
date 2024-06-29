import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class575 {

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    public static int[] field8138 = new int[25];

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field8137 = 0;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lke;")
    public static class622 field8139 = new class622(109, 2);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIBI)I")
    public static final int method3341(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field8133++;
        int var6 = -91 % ((arg4 + 35) / 43);
        if (class622.field8777 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var7 = arg2 >> 9;
            int var8 = arg0 >> 9;
            if (arg5 < 0 || arg3 < 0 || (class109.field1314 - 1) < arg5 || arg3 > class760.field10479 - 1) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || var7 > class109.field1314 - 1 || var8 > class760.field10479 - 1) {
                return 0;
            }
            boolean var9 = (class617.field8700[1][arg2 >> 9][arg0 >> 9] & 0x2) != 0;
            if ((arg2 & 0x1FF) == 0) {
                boolean var10 = (class617.field8700[1][var7 - 1][arg0 >> 9] & 0x2) != 0;
                boolean var11 = (class617.field8700[1][var7][arg0 >> 9] & 0x2) != 0;
                if (var11 != var10) {
                    var9 = (class617.field8700[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x1FF) == 0) {
                boolean var12 = (class617.field8700[1][arg2 >> 9][var8 - 1] & 0x2) != 0;
                boolean var13 = (class617.field8700[1][arg2 >> 9][var8] & 0x2) != 0;
                if (var13 != var12) {
                    var9 = (class617.field8700[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if (var9) {
                arg1++;
            }
        }
        return class622.field8777[arg1].method1977((byte) -119, arg2, arg0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
    public static final int method3342(int arg0) {
        if (arg0 != 1) {
            method3342(32);
        }
        field8136++;
        class387 var1 = class211.field3052;
        synchronized (class211.field3052) {
            return class211.field3052.method2377((byte) -97);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;ILjava/awt/Color;I)V")
    public static final void method3343(Color arg0, String arg1, Color arg2, int arg3, Color arg4, int arg5) {
        field8135++;
        try {
            Graphics var6 = class359.field5219.getGraphics();
            if (class277.field3851 == null) {
                class277.field3851 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class760.field10483 == null) {
                    class760.field10483 = class359.field5219.createImage(class638.field8980, class512.field7325);
                }
                Graphics var7 = class760.field10483.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class638.field8980, class512.field7325);
                int var8 = class638.field8980 / 2 - 152;
                int var9 = class512.field7325 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 + 2, arg3 + var9, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var8 + 2, var9 - -2, 300 - (arg5 * 3), 30);
                var7.setFont(class277.field3851);
                var7.setColor(arg4);
                var7.drawString(arg1, (304 - (arg1.length() * 6)) / 2 + var8, var9 + 22);
                if (class601.field8479 != null) {
                    var7.setFont(class277.field3851);
                    var7.setColor(arg4);
                    var7.drawString(class601.field8479, class638.field8980 / 2 - (class601.field8479.length() * 6 / 2), class512.field7325 / 2 + -26);
                }
                var6.drawImage(class760.field10483, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class638.field8980, class512.field7325);
                int var10 = class638.field8980 / 2 - 152;
                int var11 = class512.field7325 / 2 - 18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 - -2, arg5 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg5 * 3 + var10 + 2, var11 + 2, 300 - arg5 * 3, 30);
                var6.setFont(class277.field3851);
                var6.setColor(arg4);
                if (class601.field8479 != null) {
                    var6.setFont(class277.field3851);
                    var6.setColor(arg4);
                    var6.drawString(class601.field8479, class638.field8980 / 2 - class601.field8479.length() * 6 / 2, class512.field7325 / 2 + -26);
                }
                var6.drawString(arg1, var10 + ((304 - (arg1.length() * 6)) / 2), var11 - -22);
            }
        } catch (Exception var13) {
            class359.field5219.repaint();
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static void method3344(int arg0) {
        if (arg0 != 2) {
            method3342(16);
        }
        field8138 = null;
        field8139 = null;
    }
}
