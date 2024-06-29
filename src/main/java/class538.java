import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class538 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    private int field7435;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Z")
    private boolean field7434;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    private int field7444;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Z")
    private boolean field7438;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
    public static int[] field7440 = new int[4096];

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
    public static int[] field7441;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
    public static int[] field7442;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[Lel;")
    public static class547[] field7445;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field7446;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7440[var0] = class350.method2195(-3358, var0);
        }
        field7441 = new int[32];
        field7442 = new int[32];
        field7445 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;BLjava/awt/Color;)V", line = 5)
    public static final void method3094(int arg0, Color arg1, String arg2, Color arg3, byte arg4, Color arg5) {
        field7436++;
        try {
            Graphics var6 = class458.field6458.getGraphics();
            if (class124.field2130 == null) {
                class124.field2130 = new Font("Helvetica", 1, 13);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(255, 255, 255);
            }
            try {
                if (class755.field10546 == null) {
                    class755.field10546 = class458.field6458.createImage(class467.field6559, class582.field7968);
                }
                Graphics var7 = class755.field10546.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class467.field6559, class582.field7968);
                int var8 = class467.field6559 / 2 - 152;
                int var9 = class582.field7968 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var8 + 2, var9 - -2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + (var8 + 2), var9 + 2, 300 - arg0 * 3, 30);
                var7.setFont(class124.field2130);
                var7.setColor(arg5);
                if (arg4 > -42) {
                    field7440 = null;
                }
                var7.drawString(arg2, var8 + (304 - arg2.length() * 6) / 2, var9 + 22);
                if (class187.field2809 != null) {
                    var7.setFont(class124.field2130);
                    var7.setColor(arg5);
                    var7.drawString(class187.field2809, class467.field6559 / 2 - class187.field2809.length() * 6 / 2, class582.field7968 / 2 + -26);
                }
                var6.drawImage(class755.field10546, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class467.field6559, class582.field7968);
                int var10 = class467.field6559 / 2 - 152;
                int var11 = class582.field7968 / 2 - 18;
                var6.setColor(arg3);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg1);
                var6.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - (arg0 * 3), 30);
                var6.setFont(class124.field2130);
                var6.setColor(arg5);
                if (class187.field2809 != null) {
                    var6.setFont(class124.field2130);
                    var6.setColor(arg5);
                    var6.drawString(class187.field2809, class467.field6559 / 2 - (class187.field2809.length() * 6 / 2), class582.field7968 / 2 - 26);
                }
                var6.drawString(arg2, var10 + ((304 - (arg2.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class458.field6458.repaint();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Z", line = 96)
    public final boolean method3095(byte arg0) {
        if (arg0 < 49) {
            return true;
        } else {
            field7443++;
            return this.field7434;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I", line = 107)
    public static final int method3096(int arg0, int arg1) {
        return class208.field2981 == null ? 0 : class208.field2981[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I", line = 113)
    public final int method3097(int arg0) {
        if (arg0 == -23688) {
            field7437++;
            return this.field7444;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V", line = 125)
    public static final void method3098(int arg0, int arg1) {
        field7446++;
        class594 var2 = class692.method3869(arg0, (byte) 105, 10);
        var2.method3383(-16058);
        if (arg1 != 2) {
            field7445 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z", line = 138)
    public final boolean method3099(int arg0) {
        field7439++;
        if (arg0 >= -27) {
            this.field7435 = 107;
        }
        return this.field7438;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 149)
    public static void method3100(byte arg0) {
        field7442 = null;
        if (arg0 <= 77) {
            field7442 = null;
        }
        field7440 = null;
        field7445 = null;
        field7441 = null;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I", line = 179)
    public final int method3101(int arg0) {
        int var2 = 23 % ((-arg0 - 4) / 55);
        field7433++;
        return this.field7435;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(ZIIZ)V", line = 198)
    public class538(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field7435 = arg2;
        this.field7434 = arg3;
        this.field7444 = arg1;
        this.field7438 = arg0;
    }
}
