import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class172 extends class151 {

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lbd;")
    public static class162 field2978 = class17.method142(0, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLbd;ILjava/awt/Color;I)V", line = 4)
    public static final void method1317(boolean arg0, class162 arg1, int arg2, Color arg3, int arg4) {
        field2979++;
        try {
            Graphics var5 = class308.field5173.getGraphics();
            if (class279.field4701 == null) {
                class279.field4701 = new Font("Helvetica", 1, 13);
                class23.field370 = class308.field5173.getFontMetrics(class279.field4701);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class251.field4201, class252.field4205);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class223.field3728 == null) {
                    class223.field3728 = class308.field5173.createImage(304, 34);
                }
                Graphics var6 = class223.field3728.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, arg4, 300 - arg2 * 3, 30);
                var6.setFont(class279.field4701);
                var6.setColor(Color.white);
                arg1.method1289(var6, (304 - arg1.method1267(0, class23.field370)) / 2, 22, 0);
                var5.drawImage(class223.field3728, class251.field4201 / 2 - 152, class252.field4205 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class251.field4201 / 2 - 152;
                int var9 = class252.field4205 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg2 * 3) + 2, var9 + 2, 300 - (arg2 * 3), 30);
                var5.setFont(class279.field4701);
                var5.setColor(Color.white);
                arg1.method1289(var5, (304 - arg1.method1267(0, class23.field370)) / 2 + var8, var9 + 22, arg4 ^ 0x2);
            }
            if (class87.field1553 != null) {
                var5.setFont(class279.field4701);
                var5.setColor(Color.white);
                class87.field1553.method1289(var5, class251.field4201 / 2 - class87.field1553.method1267(arg4 ^ 0x2, class23.field370) / 2, class252.field4205 / 2 + -26, 0);
            }
        } catch (Exception var12) {
            class308.field5173.repaint();
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[B", line = 77)
    public static final byte[] method1318(int arg0, int arg1) {
        if (arg1 <= 30) {
            field2981 = -62;
        }
        class109 var2 = (class109) class82.field1418.method1382((byte) -83, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class95.method771(var4, var7, (byte) 124);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class109(var3);
            class82.field1418.method1386(var2, -66, (long) arg0);
        }
        field2986++;
        return var2.field1956;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLda;)V", line = 125)
    public static final void method1319(byte arg0, class143 arg1) {
        if (arg0 > -112) {
            field2978 = (class162) null;
        }
        class308.field5176 = arg1;
        field2980++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 149)
    public static void method1320(int arg0) {
        if (arg0 != 2) {
            field2984 = 11;
        }
        field2978 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIBIFIZ)[I", line = 159)
    public static final int[] method1321(int arg0, int arg1, int arg2, byte arg3, int arg4, float arg5, int arg6, boolean arg7) {
        field2983++;
        int[] var8 = new int[arg6];
        if (arg3 != -50) {
            field2981 = -19;
        }
        class7 var9 = new class7();
        var9.field62 = arg0;
        var9.field64 = arg4;
        var9.field70 = arg1;
        var9.field60 = (int) (arg5 * 4096.0F);
        var9.field82 = arg7;
        var9.field73 = arg2;
        var9.method39((byte) 22);
        class260.method1795(8827, arg6, 1);
        var9.method45(var8, 0, 140534700);
        return var8;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBIII)I", line = 190)
    public static final int method1322(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2982++;
        int var5 = arg3 & 0xF;
        int var6 = var5 < 8 ? arg2 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg0) : arg4;
        if (arg1 > -64) {
            method1321(-114, -40, 111, (byte) -48, 66, 0.45220503F, -10, true);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }
}
