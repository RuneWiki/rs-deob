import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class MonotonicTime {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lv;")
    public static JagString field197;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lv;")
    public static JagString field199;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lv;")
    public static JagString field200;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 4)
    public static void method74(int arg0) {
        field197 = null;
        field200 = null;
        if (arg0 == 25410) {
            ByteArrayPool.midPool = null;
            field199 = null;
        }
    }

    static {
        ByteArrayPool.midPool = new byte[250][];
        field197 = class1.method2(255, "world");
        field199 = class1.method2(255, "Skirt Shop");
        field200 = class1.method2(255, "(U");
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)J", line = 62)
    public static final synchronized long method75(int arg0) {
        if (arg0 != -4978) {
            return 57L;
        }
        long var1 = System.currentTimeMillis();
        if (StringNode.field83 > var1) {
            mapview.field292 += StringNode.field83 - var1;
        }
        StringNode.field83 = var1;
        return mapview.field292 + var1;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILjava/awt/Color;ILv;)V", line = 93)
    public static final void method76(int arg0, Color arg1, int arg2, JagString arg3) {
        try {
            Graphics var4 = class18.field167.getGraphics();
            if (JagException.field109 == null) {
                JagException.field109 = new Font("Helvetica", 1, 13);
                StringNode.field87 = class18.field167.getFontMetrics(JagException.field109);
            }
            if (class18.field162) {
                class18.field162 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, BZip2State.field487, GZip.field113);
            }
            if (arg2 > -17) {
                field199 = null;
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (Timer.field395 == null) {
                    Timer.field395 = class18.field167.createImage(304, 34);
                }
                Graphics var5 = Timer.field395.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(JagException.field109);
                var5.setColor(Color.white);
                arg3.method247((304 - arg3.method242((byte) -32, StringNode.field87)) / 2, 22, -58, var5);
                var4.drawImage(Timer.field395, BZip2State.field487 / 2 - 152, GZip.field113 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = BZip2State.field487 / 2 - 152;
                int var8 = GZip.field113 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 - -2, 300 - arg0 * 3, 30);
                var4.setFont(JagException.field109);
                var4.setColor(Color.white);
                arg3.method247((304 - arg3.method242((byte) -32, StringNode.field87)) / 2 + var7, var8 + 22, -100, var4);
            }
        } catch (Exception var11) {
            class18.field167.repaint();
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)V", line = 165)
    public static final void method77(byte arg0) {
        class1.field4 = null;
        if (arg0 < 38) {
            return;
        }
        JavaMouse.field385 = null;
        JavaKeyboard.field19 = null;
        Worldmap.field365 = null;
        JagException.field105 = null;
        BZip2State.field506 = null;
    }
}
