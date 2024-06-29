import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class390 extends class344 {

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Z")
    public static boolean field5883 = false;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Lum;")
    public static class362 field5881;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "[B")
    private byte[] field5878;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2370(boolean arg0) {
        field5881 = null;
        if (arg0) {
            field5881 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/lang/String;II)V", line = 15)
    public static final void method2371(Color arg0, Color arg1, Color arg2, boolean arg3, String arg4, int arg5, int arg6) {
        field5885++;
        try {
            Graphics var7 = class364.field5570.getGraphics();
            if (class257.field3793 == null) {
                class257.field3793 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class4.field57, class116.field1743);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class267.field3899 == null) {
                    class267.field3899 = class364.field5570.createImage(304, 34);
                }
                if (arg5 <= 14) {
                    return;
                }
                Graphics var8 = class267.field3899.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg6 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg6 * 3 + 2, 2, 300 - arg6 * 3, 30);
                var8.setFont(class257.field3793);
                var8.setColor(arg1);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class267.field3899, class4.field57 / 2 - 152, class116.field1743 / 2 - 18, null);
            } catch (Exception var11) {
                int var9 = class4.field57 / 2 - 152;
                int var10 = class116.field1743 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 + 2, arg6 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg6 * 3 + var9 + 2, var10 + 2, 300 - arg6 * 3, 30);
                var7.setFont(class257.field3793);
                var7.setColor(arg1);
                var7.drawString(arg4, (304 - (arg4.length() * 6)) / 2 + var9, var10 - -22);
            }
            if (class197.field2873 != null) {
                var7.setFont(class257.field3793);
                var7.setColor(arg1);
                var7.drawString(class197.field2873, class4.field57 / 2 - (class197.field2873.length() * 6 / 2), class116.field1743 / 2 + -26);
            }
        } catch (Exception var12) {
            class364.field5570.repaint();
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 93)
    public class390() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I", line = 98)
    public static final int method2372(int arg0) {
        if (arg0 >= -108) {
            method2372(119);
        }
        field5880++;
        return 2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIBIIII)V", line = 109)
    public static final void method2373(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field5877++;
        if (class494.field7297 <= (arg1 - arg4) && (arg1 + arg4) <= class445.field6629 && arg0 - arg4 >= class37.field393 && class509.field7436 >= (arg0 + arg4)) {
            class277.method1808(arg0, arg3, (byte) -35, arg4, arg5, arg6, arg1);
        } else {
            class504.method3000(arg4, arg6, arg1, 109, arg5, arg3, arg0);
        }
        if (arg2 > -9) {
            field5882 = -36;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)[B", line = 126)
    public final byte[] method2374(int arg0, int arg1, int arg2, int arg3) {
        this.field5878 = new byte[arg0 * 2 * arg2 * arg1];
        int var5 = 6 / ((8 - arg3) / 56);
        field5886++;
        this.method339(arg2, (byte) 94, arg0, arg1);
        return this.field5878;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIB)V", line = 145)
    public final void method2106(int arg0, int arg1, byte arg2) {
        field5884++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5878[var10001] = (byte) (var5 * 3 >> 5);
        this.field5878[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 != 4096) {
            field5881 = null;
        }
    }
}
