import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class64 extends class314 {

    @OriginalMember(owner = "client!di", name = "X", descriptor = "[I")
    public static int[] field836 = new int[8];

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
    public static int field841 = 1;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field839 = "Loaded update list";

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Lwn;")
    public static class429 field837;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZI)V", line = 19)
    public static final void method412(Color arg0, int arg1, Color arg2, Color arg3, String arg4, boolean arg5, int arg6) {
        try {
            if (arg1 != 30820) {
                field836 = null;
            }
            Graphics var7 = class86.field1073.getGraphics();
            if (class409.field6049 == null) {
                class409.field6049 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class369.field5615, class430.field6324);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class166.field2641 == null) {
                    class166.field2641 = class86.field1073.createImage(304, 34);
                }
                Graphics var8 = class166.field2641.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg6 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg6 * 3 + 2, 2, -(arg6 * 3) + 300, 30);
                var8.setFont(class409.field6049);
                var8.setColor(arg2);
                var8.drawString(arg4, (-(arg4.length() * 6) + 304) / 2, 22);
                var7.drawImage(class166.field2641, class369.field5615 / 2 + -152, class430.field6324 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class369.field5615 / 2 + -152;
                int var10 = class430.field6324 / 2 + -18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 + 2, arg6 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 - -1, var10 + 1, 301, 31);
                var7.fillRect(arg6 * 3 + var9 + 2, var10 - -2, 300 - arg6 * 3, 30);
                var7.setFont(class409.field6049);
                var7.setColor(arg2);
                var7.drawString(arg4, var9 - -((-(6 * arg4.length()) + 304) / 2), var10 - -22);
            }
            if (class222.field3687 != null) {
                var7.setFont(class409.field6049);
                var7.setColor(arg2);
                var7.drawString(class222.field3687, class369.field5615 / 2 - class222.field3687.length() * 6 / 2, class430.field6324 / 2 + -26);
            }
        } catch (Exception var12) {
            class86.field1073.repaint();
        }
        ++field840;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lne;B)Lne;", line = 102)
    public static final class172 method413(class172 arg0, byte arg1) {
        if (arg1 >= -33) {
            method414((byte) -89);
        }
        ++field838;
        class172 var2 = client.method1155(arg0);
        if (var2 == null) {
            var2 = arg0.field2795;
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(B)V", line = 125)
    public static void method414(byte arg0) {
        field839 = null;
        if (arg0 != -15) {
            method414((byte) 43);
        }
        field836 = null;
        field837 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I", line = 138)
    public final int[][] method203(byte arg0, int arg1) {
        ++field842;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566 && this.method2102(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field4934 * super.field4934;
            for (int var8 = 0; ~var8 > ~class369.field5610; ++var8) {
                int var9 = super.field4943[var8 % super.field4937 + var7];
                var6[var8] = class37.method242(var9 << 4, 4080);
                var5[var8] = class37.method242(var9 >> 4, 4080);
                var4[var8] = class37.method242(var9 >> 12, 4080);
            }
        }
        if (arg0 != -93) {
            field839 = null;
        }
        return var3;
    }
}
