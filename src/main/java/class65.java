import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
    public boolean field1274 = true;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lje;")
    public static class67 field1266 = class85.method592(255, "Clientscript error in: ");

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lje;")
    public static class67 field1269 = class85.method592(255, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lje;")
    public static class67 field1275 = class85.method592(255, "sch-Utteln:");

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lje;")
    public static class67 field1270 = class85.method592(255, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method437(int arg0) {
        field1266 = null;
        field1269 = null;
        field1275 = null;
        field1270 = null;
        int var1 = 44 / ((arg0 - 56) / 43);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILje;Ljava/awt/Color;B)V")
    public static final void method438(int arg0, class67 arg1, Color arg2, byte arg3) {
        try {
            Graphics var4 = class98.field2193.getGraphics();
            if (class75.field1617 == null) {
                class75.field1617 = new Font("Helvetica", 1, 13);
                class45.field840 = class98.field2193.getFontMetrics(class75.field1617);
            }
            if (class9.field210) {
                class9.field210 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class107.field2456, class17.field305);
            }
            if (arg3 <= 48) {
                field1266 = null;
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class104.field2369 == null) {
                    class104.field2369 = class98.field2193.createImage(304, 34);
                }
                Graphics var5 = class104.field2369.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class75.field1617);
                var5.setColor(Color.white);
                arg1.method449(22, (304 - arg1.method461(class45.field840, true)) / 2, var5, true);
                var4.drawImage(class104.field2369, class107.field2456 / 2 - 152, class17.field305 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class107.field2456 / 2 - 152;
                int var7 = class17.field305 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class75.field1617);
                var4.setColor(Color.white);
                arg1.method449(var7 + 22, (-arg1.method461(class45.field840, true) + 304) / 2 + var6, var4, true);
            }
        } catch (Exception var9) {
            class98.field2193.repaint();
        }
        field1265++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BB)[B")
    public static final byte[] method439(byte[] arg0, byte arg1) {
        int var2 = -67 % ((-arg1 - 48) / 44);
        int var3 = arg0.length;
        field1278++;
        byte[] var4 = new byte[var3];
        class139.method1051(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1272 = arg3;
        this.field1274 = arg6;
        this.field1271 = arg0;
        this.field1277 = arg2;
        this.field1267 = arg5;
        this.field1276 = arg1;
        this.field1273 = arg4;
    }
}
