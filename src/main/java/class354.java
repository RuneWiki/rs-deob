import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class354 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public static int[] field5246 = new int[32];

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[S")
    public static short[] field5252;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
    public static boolean field5256;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lfi;")
    public static class8 field5254;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field5243;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field5251;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[B")
    public byte[] field5248;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[B")
    public byte[] field5250;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method2329(int arg0) {
        field5252 = null;
        field5246 = null;
        if (arg0 != 300) {
            method2331(13, -13, -16);
        }
        field5254 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method2330(byte arg0) {
        field5239++;
        class67.field982.method2825(125);
        int var1 = 118 / ((arg0 - 44) / 63);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
    public static final int method2331(int arg0, int arg1, int arg2) {
        field5242++;
        if (arg1 != 141) {
            method2330((byte) -35);
        }
        class387 var3 = (class387) class67.field982.method2826(false, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field5657.length; var5++) {
                if (var3.field5658[var5] == arg2) {
                    var4 += var3.field5657[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Color;IILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Z)V")
    public static final void method2332(Color arg0, int arg1, int arg2, Color arg3, Color arg4, String arg5, boolean arg6) {
        try {
            Graphics var7 = class422.field6138.getGraphics();
            if (class438.field6358 == null) {
                class438.field6358 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class357.field5298, class435.field6313);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class450.field6459 == null) {
                    class450.field6459 = class422.field6138.createImage(304, 34);
                }
                Graphics var8 = class450.field6459.getGraphics();
                var8.setColor(arg4);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var8.setFont(class438.field6358);
                var8.setColor(arg3);
                var8.drawString(arg5, (arg1 - (arg5.length() * 6)) / 2, 22);
                var7.drawImage(class450.field6459, class357.field5298 / 2 - 152, class435.field6313 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class357.field5298 / 2 - 152;
                int var10 = class435.field6313 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 + 2, var10 - -2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg2 * 3 + var9 + 2, var10 + 2, 300 - (arg2 * 3), 30);
                var7.setFont(class438.field6358);
                var7.setColor(arg3);
                var7.drawString(arg5, var9 + ((304 - (arg5.length() * 6)) / 2), var10 + 22);
            }
            if (class346.field5159 != null) {
                var7.setFont(class438.field6358);
                var7.setColor(arg3);
                var7.drawString(class346.field5159, class357.field5298 / 2 - (class346.field5159.length() * 6 / 2), class435.field6313 / 2 + -26);
            }
        } catch (Exception var12) {
            class422.field6138.repaint();
        }
        field5241++;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
    public static final void method2333(int arg0, int arg1, int arg2) {
        field5247++;
        if (arg2 != 15748) {
            field5252 = null;
        }
        class248.field3655 = arg1 - class200.field2782;
        class222.field3067 = arg0 - class200.field2789;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5246[var1] = var0 - 1;
            var0 += var0;
        }
        field5252 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        field5256 = true;
        field5254 = new class8();
    }
}
