import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class591 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8601 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZII)V")
    public static final void method3389(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field8602++;
        if (class35.field490 != null && (arg1 != 3 || class525.field7713.field5976 != arg5 || class525.field7713.field5965 != arg0)) {
            class247.method1590(class653.field9220, -2, class35.field490);
            class35.field490 = null;
        }
        if (arg1 == 3 && class35.field490 == null) {
            class35.field490 = class683.method3863(0, arg0, (byte) 95, class653.field9220, 0, arg5);
            if (class35.field490 != null) {
                class525.field7713.field5976 = arg5;
                class525.field7713.field5965 = arg0;
                class525.field7713.method3481(true, class653.field9220);
            }
        }
        if (arg1 == 3 && class35.field490 == null) {
            method3389(-1, class525.field7713.field5974, arg2, true, arg4, -1);
            return;
        }
        Container var6;
        if (class35.field490 != null) {
            class122.field1985 = arg0;
            class521.field7686 = arg5;
            var6 = class35.field490;
        } else if (class699.field9906 == null) {
            if (class492.field7063 == null) {
                var6 = class107.field1756;
            } else {
                var6 = class492.field7063;
            }
            class521.field7686 = var6.getSize().width;
            class122.field1985 = var6.getSize().height;
        } else {
            Insets var7 = class699.field9906.getInsets();
            int var10001 = -var7.right;
            class521.field7686 = class699.field9906.getSize().width + var10001 - var7.left;
            class122.field1985 = class699.field9906.getSize().height - var7.top - var7.bottom;
            var6 = class699.field9906;
        }
        if (arg1 == 1) {
            class465.field6689 = class570.field8333;
            class119.field1910 = 0;
            class597.field8633 = class140.field2349;
            class240.field3525 = (class521.field7686 - class570.field8333) / 2;
        } else {
            class357.method2153((byte) -121);
        }
        if (class554.field8103 != class205.field3174) {
            boolean var10000;
            if (class465.field6689 < 1024 && class597.field8633 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class692.method3897(true);
        } else {
            class126.field2061.setSize(class465.field6689, class597.field8633);
            class637.field9048.method808(class126.field2061);
            if (class699.field9906 == var6) {
                Insets var8 = class699.field9906.getInsets();
                class126.field2061.setLocation(class240.field3525 + var8.left, class119.field1910 + var8.top);
            } else {
                class126.field2061.setLocation(class240.field3525, class119.field1910);
            }
        }
        if (arg1 >= 2) {
            class23.field316 = true;
        } else {
            class23.field316 = false;
        }
        if (class557.field8146 != -1) {
            class7.method29(true, 22739);
        }
        if (class256.field3696 != null && class272.method1715(0, class515.field7636)) {
            class307.method1864(false);
        }
        for (int var9 = arg2; var9 < 100; var9++) {
            class636.field9030[var9] = true;
        }
        class73.field1166 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI[I[I)V")
    public static final void method3390(int arg0, byte arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 != -7) {
            return;
        }
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (arg4[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method3390(arg0, (byte) -7, var6 - 1, arg3, arg4);
            method3390(var6 + 1, (byte) -7, arg2, arg3, arg4);
        }
        field8600++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILel;)I")
    public static final int method3391(int arg0, class3 arg1) {
        if (arg0 != -6238) {
            return 15;
        }
        field8598++;
        if (class345.field4866 == arg1) {
            return 7681;
        } else if (class55.field715 == arg1) {
            return 8448;
        } else if (class166.field2734 == arg1) {
            return 34165;
        } else if (class673.field9556 == arg1) {
            return 260;
        } else if (class511.field7601 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V")
    public static final void method3392(Color arg0, int arg1, Color arg2, Color arg3, int arg4, String arg5) {
        try {
            Graphics var6 = class126.field2061.getGraphics();
            if (class495.field7246 == null) {
                class495.field7246 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class105.field1750 == null) {
                    class105.field1750 = class126.field2061.createImage(class465.field6689, class597.field8633);
                }
                Graphics var7 = class105.field1750.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class465.field6689, class597.field8633);
                int var8 = class465.field6689 / 2 - 152;
                int var9 = class597.field8633 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 + 2, var9 + 2, arg4 * 3, arg1);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - (arg4 * 3), 30);
                var7.setFont(class495.field7246);
                var7.setColor(arg0);
                var7.drawString(arg5, var8 + (304 - (arg5.length() * 6)) / 2, var9 + 22);
                if (class438.field6297 != null) {
                    var7.setFont(class495.field7246);
                    var7.setColor(arg0);
                    var7.drawString(class438.field6297, class465.field6689 / 2 - class438.field6297.length() * 6 / 2, class597.field8633 / 2 + -26);
                }
                var6.drawImage(class105.field1750, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class465.field6689, class597.field8633);
                int var10 = class465.field6689 / 2 - 152;
                int var11 = class597.field8633 / 2 - 18;
                var6.setColor(arg3);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg4 * 3 + (var10 + 2), var11 + 2, 300 - (arg4 * 3), 30);
                var6.setFont(class495.field7246);
                var6.setColor(arg0);
                if (class438.field6297 != null) {
                    var6.setFont(class495.field7246);
                    var6.setColor(arg0);
                    var6.drawString(class438.field6297, class465.field6689 / 2 - class438.field6297.length() * 6 / 2, class597.field8633 / 2 + -26);
                }
                var6.drawString(arg5, var10 + ((304 - arg5.length() * 6) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class126.field2061.repaint();
        }
        field8599++;
    }
}
