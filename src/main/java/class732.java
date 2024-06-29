import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class732 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field9905;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field9908;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field9907;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field9904;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljb;")
    public static class519 field9903 = new class519(99, 9);

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9911 = new Hashtable();

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)I")
    public static final int method4038(int arg0, boolean arg1) {
        field9902++;
        if (class436.field6312 == null) {
            return 0;
        } else if (arg1 || class743.field10052 == null) {
            int var2 = 0;
            for (int var3 = arg0; var3 < class436.field6312.length; var3++) {
                int var4 = class436.field6312[var3];
                if (class574.field7828.method1185(var4, 9330)) {
                    var2++;
                }
                if (class220.field2857.method1185(var4, arg0 + 9330)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class436.field6312.length * 2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method4039(int arg0) {
        field9911 = null;
        if (arg0 < -124) {
            field9903 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9906++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;II)V")
    public static final void method4040(Color arg0, Color arg1, String arg2, Color arg3, int arg4, int arg5) {
        field9910++;
        try {
            Graphics var6 = class669.field8962.getGraphics();
            if (class554.field7641 == null) {
                class554.field7641 = new Font("Helvetica", 1, 13);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class592.field8097 == null) {
                    class592.field8097 = class669.field8962.createImage(class460.field6558, class693.field9222);
                }
                Graphics var7 = class592.field8097.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class460.field6558, class693.field9222);
                int var8 = class460.field6558 / 2 - 152;
                int var9 = class693.field9222 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - (arg4 * 3), 30);
                var7.setFont(class554.field7641);
                var7.setColor(arg3);
                var7.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var8, var9 - -22);
                if (class531.field7338 != null) {
                    var7.setFont(class554.field7641);
                    var7.setColor(arg3);
                    var7.drawString(class531.field7338, class460.field6558 / 2 - (class531.field7338.length() * 6 / 2), class693.field9222 / 2 + -26);
                }
                var6.drawImage(class592.field8097, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class460.field6558, class693.field9222);
                int var10 = class460.field6558 / 2 - 152;
                int var11 = class693.field9222 / 2 - 18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg1);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(var10 + (arg4 * 3) + 2, var11 + 2, 300 - (arg4 * 3), 30);
                var6.setFont(class554.field7641);
                var6.setColor(arg3);
                if (class531.field7338 != null) {
                    var6.setFont(class554.field7641);
                    var6.setColor(arg3);
                    var6.drawString(class531.field7338, class460.field6558 / 2 - (class531.field7338.length() * 6 / 2), class693.field9222 / 2 + -26);
                }
                var6.drawString(arg2, var10 + (304 - (arg2.length() * 6)) / 2, var11 + 22);
            }
        } catch (Exception var13) {
            class669.field8962.repaint();
        }
        if (arg5 > -104) {
            field9911 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIII)V")
    public class732(int arg0, int arg1, int arg2, int arg3) {
        this.field9905 = arg0;
        this.field9908 = arg3;
        this.field9907 = arg1;
        this.field9904 = arg2;
    }
}
