import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class483 extends class152 {

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public int field6738 = 0;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6743 = new Rectangle[100];

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "Lbt;")
    public static class48 field6745;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field6743[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILes;)V", line = 9)
    public final void method2864(int arg0, class403 arg1) {
        while (true) {
            int var3 = arg1.method2396((byte) 125);
            if (var3 == 0) {
                if (arg0 != -15938) {
                    method2868(null, null, -110, null, -44, null);
                }
                field6739++;
                return;
            }
            this.method2866(var3, arg1, arg0 ^ 0xFFFFC1BA);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lda;IIILaa;Lbq;IILkq;Ljava/lang/String;II)V", line = 30)
    public static final void method2865(class67 arg0, int arg1, int arg2, int arg3, class513 arg4, class307 arg5, int arg6, int arg7, class620 arg8, String arg9, int arg10, int arg11) {
        field6742++;
        int var12;
        if (class7.field100 == 4) {
            var12 = (int) class47.field626 & 0x3FFF;
        } else {
            var12 = (int) class47.field626 + class579.field7884 & 0x3FFF;
        }
        int var13 = Math.max(arg8.field8506 / 2, arg8.field8416 / 2) + 10;
        int var14 = arg3 * arg3 + arg10 * arg10;
        if (arg6 >= -17) {
            method2867(60, (byte) 99, -95, 19);
        }
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class789.field10868[var12];
        int var16 = class789.field10864[var12];
        if (class7.field100 != 4) {
            var16 = var16 * 256 / (class251.field2948 + 256);
            var15 = var15 * 256 / (class251.field2948 + 256);
        }
        int var17 = arg3 * var16 + arg10 * var15 >> 14;
        int var18 = arg10 * var16 - arg3 * var15 >> 14;
        int var19 = arg5.method1815(false, null, arg9, 100);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method1816(null, 0, 100, (byte) 122, arg9);
        if ((-arg8.field8506) <= var20 && var20 <= arg8.field8506 && var18 >= (-arg8.field8416) && arg8.field8416 >= var18) {
            arg0.method668(arg11, 0, false, 1, arg2, arg8.field8416 / 2 + arg11 - arg7 - var18 - var21, 0, arg9, 0, 50, null, arg4, var19, null, var20 + (arg8.field8506 / 2) + arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILes;I)V", line = 82)
    private final void method2866(int arg0, class403 arg1, int arg2) {
        if (arg0 == 2) {
            this.field6738 = arg1.method2390((byte) 20);
        }
        if (arg2 != 4) {
            field6745 = null;
        }
        field6740++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBII)I", line = 98)
    public static final int method2867(int arg0, byte arg1, int arg2, int arg3) {
        field6741++;
        if (class621.field8523 == null) {
            return 0;
        }
        int var4 = arg3 >> 9;
        int var5 = arg2 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class596.field8090 - 1) || var5 > (class107.field1350 - 1)) {
            return 0;
        }
        if (arg1 > -33) {
            field6745 = null;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class124.field1585[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class621.field8523[var6].method1730(arg3, arg2, -1);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;ILjava/awt/Color;ILjava/awt/Color;)V", line = 125)
    public static final void method2868(String arg0, Color arg1, int arg2, Color arg3, int arg4, Color arg5) {
        try {
            Graphics var6 = class109.field1370.getGraphics();
            if (class482.field6736 == null) {
                class482.field6736 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class733.field10259 == null) {
                    class733.field10259 = class109.field1370.createImage(class701.field9880, class705.field9921);
                }
                Graphics var7 = class733.field10259.getGraphics();
                var7.setColor(Color.black);
                int var8 = 127 % ((arg2 + 56) / 38);
                var7.fillRect(0, 0, class701.field9880, class705.field9921);
                int var9 = class701.field9880 / 2 - 152;
                int var10 = class705.field9921 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(var9, var10, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var9 + 2, var10 - -2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg4 * 3 + var9 + 2, var10 - -2, 300 - (arg4 * 3), 30);
                var7.setFont(class482.field6736);
                var7.setColor(arg1);
                var7.drawString(arg0, (304 - (arg0.length() * 6)) / 2 + var9, var10 - -22);
                if (class25.field376 != null) {
                    var7.setFont(class482.field6736);
                    var7.setColor(arg1);
                    var7.drawString(class25.field376, class701.field9880 / 2 - class25.field376.length() * 6 / 2, class705.field9921 / 2 + -26);
                }
                var6.drawImage(class733.field10259, 0, 0, null);
            } catch (Exception var13) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class701.field9880, class705.field9921);
                int var11 = class701.field9880 / 2 - 152;
                int var12 = class705.field9921 / 2 - 18;
                var6.setColor(arg3);
                var6.drawRect(var11, var12, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var11 + 2, var12 - -2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var11 + 1, var12 + 1, 301, 31);
                var6.fillRect(var11 + (arg4 * 3) + 2, var12 + 2, 300 - arg4 * 3, 30);
                var6.setFont(class482.field6736);
                var6.setColor(arg1);
                if (class25.field376 != null) {
                    var6.setFont(class482.field6736);
                    var6.setColor(arg1);
                    var6.drawString(class25.field376, class701.field9880 / 2 - (class25.field376.length() * 6 / 2), class705.field9921 / 2 - 26);
                }
                var6.drawString(arg0, var11 + (304 - arg0.length() * 6) / 2, var12 + 22);
            }
        } catch (Exception var14) {
            class109.field1370.repaint();
        }
        field6744++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 232)
    public static void method2869(int arg0) {
        field6743 = null;
        if (arg0 != 16383) {
            field6745 = null;
        }
        field6745 = null;
    }
}
