import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class94 extends OutputStream {

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "F")
    public static float field1314;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lce;")
    public static class325 field1311;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lau;")
    public static class391 field1312;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
    public static final void method640(int arg0, int arg1, int arg2, int arg3) {
        field1310++;
        if (class470.field6877 == null) {
            return;
        }
        long var4 = (long) (arg2 | arg0 << 14 | arg3 << 28);
        class237 var6 = (class237) class376.field4885.method2085(var4, -5423);
        if (var6 == null) {
            class458.method2708(arg3, arg2, arg0);
            return;
        }
        class9 var7 = (class9) var6.field3082.method49(-115);
        if (var7 == null) {
            class458.method2708(arg3, arg2, arg0);
            return;
        }
        class54 var8 = (class54) class458.method2708(arg3, arg2, arg0);
        if (var8 == null) {
            var8 = new class54();
        } else {
            var8.field734 = var8.field742 = -1;
        }
        if (arg1 >= -19) {
            method641(true, null, false, null, null, 32, null);
        }
        var8.field738 = var7.field92;
        var8.field735 = var7.field88;
        label48: while (true) {
            class9 var9 = (class9) var6.field3082.method46((byte) 31);
            if (var9 == null) {
                break;
            }
            if (var8.field738 != var9.field92) {
                var8.field734 = var9.field92;
                var8.field733 = var9.field88;
                while (true) {
                    class9 var10 = (class9) var6.field3082.method46((byte) 72);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field738 != var10.field92 && var8.field734 != var10.field92) {
                        var8.field742 = var10.field92;
                        var8.field741 = var10.field88;
                    }
                }
            }
        }
        int var11 = class366.method2145(arg3, (byte) -127, (arg2 << 7) + 64, (arg0 << 7) + 64);
        class124.method789(arg3, arg2, arg0, var11, var8);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLjava/awt/Color;ZLjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
    public static final void method641(boolean arg0, Color arg1, boolean arg2, Color arg3, String arg4, int arg5, Color arg6) {
        if (arg0) {
            field1311 = null;
        }
        field1308++;
        try {
            Graphics var7 = class272.field3454.getGraphics();
            if (class461.field6448 == null) {
                class461.field6448 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class23.field419, class92.field1281);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class248.field3171 == null) {
                    class248.field3171 = class272.field3454.createImage(304, 34);
                }
                Graphics var8 = class248.field3171.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class461.field6448);
                var8.setColor(arg1);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class248.field3171, class23.field419 / 2 - 152, class92.field1281 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class23.field419 / 2 - 152;
                int var10 = class92.field1281 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class461.field6448);
                var7.setColor(arg1);
                var7.drawString(arg4, (304 - arg4.length() * 6) / 2 + var9, var10 + 22);
            }
            if (class82.field1022 != null) {
                var7.setFont(class461.field6448);
                var7.setColor(arg1);
                var7.drawString(class82.field1022, class23.field419 / 2 - class82.field1022.length() * 6 / 2, class92.field1281 / 2 + -26);
            }
        } catch (Exception var12) {
            class272.field3454.repaint();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method642(byte arg0) {
        field1311 = null;
        field1312 = null;
        if (arg0 != 47) {
            field1311 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1309++;
        throw new IOException();
    }

    static {
        new class169("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field1313 = 0;
    }
}
