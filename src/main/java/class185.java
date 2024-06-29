import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class185 implements Runnable {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "[Lwg;")
    public volatile class280[] field2628 = new class280[2];

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Z")
    public volatile boolean field2635 = false;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Z")
    public volatile boolean field2630 = false;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Z")
    public static boolean field2629 = true;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
    public static int[] field2634;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lqn;")
    public class44 field2631;

    static {
        new class194(" days.", " Tage.", " jours.", " dias.");
        field2634 = new int[1];
        field2636 = -1;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BIZLjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V", line = 11)
    public static final void method1163(byte arg0, int arg1, boolean arg2, Color arg3, String arg4, Color arg5, Color arg6) {
        field2627++;
        try {
            Graphics var7 = class498.field7590.getGraphics();
            if (class144.field1865 == null) {
                class144.field1865 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class223.field3156, class207.field2874);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            int var8 = 14 % ((9 - arg0) / 41);
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class225.field3181 == null) {
                    class225.field3181 = class498.field7590.createImage(304, 34);
                }
                Graphics var9 = class225.field3181.getGraphics();
                var9.setColor(arg6);
                var9.drawRect(0, 0, 303, 33);
                var9.setColor(arg5);
                var9.fillRect(2, 2, arg1 * 3, 30);
                var9.setColor(Color.black);
                var9.drawRect(1, 1, 301, 31);
                var9.fillRect((arg1 * 3) + 2, 2, 300 - (arg1 * 3), 30);
                var9.setFont(class144.field1865);
                var9.setColor(arg3);
                var9.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
                var7.drawImage(class225.field3181, class223.field3156 / 2 - 152, class207.field2874 / 2 + -18, null);
            } catch (Exception var12) {
                int var10 = class223.field3156 / 2 - 152;
                int var11 = class207.field2874 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + (var10 + 2), var11 + 2, 300 - arg1 * 3, 30);
                var7.setFont(class144.field1865);
                var7.setColor(arg3);
                var7.drawString(arg4, var10 + ((304 - arg4.length() * 6) / 2), var11 + 22);
            }
            if (class337.field4917 != null) {
                var7.setFont(class144.field1865);
                var7.setColor(arg3);
                var7.drawString(class337.field4917, class223.field3156 / 2 - (class337.field4917.length() * 6 / 2), class207.field2874 / 2 + -26);
            }
        } catch (Exception var13) {
            class498.field7590.repaint();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 93)
    public static final int method1164(boolean arg0, String arg1) {
        field2633++;
        if (arg0) {
            method1165(true);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class164.method1040((byte) -103, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "run", descriptor = "()V", line = 115)
    public final void run() {
        field2632++;
        this.field2630 = true;
        try {
            while (!this.field2635) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class280 var2 = this.field2628[var1];
                    if (var2 != null) {
                        var2.method1710(-108);
                    }
                }
                class322.method1935(true, 10L);
                class445.method2599(null, -7105, this.field2631);
            }
        } catch (Exception var9) {
            class356.method2169(var9, null, (byte) 34);
        } finally {
            Object var6 = null;
            this.field2630 = false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 148)
    public static void method1165(boolean arg0) {
        field2634 = null;
        if (arg0) {
            field2636 = -106;
        }
    }
}
