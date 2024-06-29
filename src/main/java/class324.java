import jaggl.memory.NativeBuffer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class324 extends class130 implements class334 {

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    private int field4407;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lcs;")
    public static class226 field4405;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)I", line = 3)
    public final int method104(boolean arg0) {
        ++field4404;
        return arg0 ? -23 : 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I", line = 14)
    public final int method111(int arg0) {
        if (arg0 != -28487) {
            field4405 = null;
        }
        ++field4409;
        return this.field4407;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lef;ILjaggl/memory/NativeBuffer;)V", line = 25)
    public class324(class338 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field4407 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BII)V", line = 38)
    public final void method103(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method895(arg1, arg3);
        ++field4406;
        if (arg0 == -13851) {
            this.field4407 = arg2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ZZ)V", line = 50)
    public static final void method1872(Color arg0, Color arg1, int arg2, Color arg3, String arg4, boolean arg5, boolean arg6) {
        ++field4403;
        try {
            Graphics var7 = class426.field6248.getGraphics();
            if (class409.field5983 == null) {
                class409.field5983 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class117.field1754, class27.field359);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class461.field6783 == null) {
                    class461.field6783 = class426.field6248.createImage(304, 34);
                }
                Graphics var8 = class461.field6783.getGraphics();
                var8.setColor(arg3);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(2 - -(arg2 * 3), 2, 300 - arg2 * 3, 30);
                var8.setFont(class409.field5983);
                var8.setColor(arg1);
                if (!arg6) {
                    method1872((Color) null, (Color) null, 26, (Color) null, (String) null, true, false);
                }
                var8.drawString(arg4, (-(arg4.length() * 6) + 304) / 2, 22);
                var7.drawImage(class461.field6783, class117.field1754 / 2 + -152, class27.field359 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class117.field1754 / 2 + -152;
                int var10 = class27.field359 / 2 + -18;
                var7.setColor(arg3);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 + 2, var10 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg2 * 3 + var9 + 2, var10 - -2, 300 - arg2 * 3, 30);
                var7.setFont(class409.field5983);
                var7.setColor(arg1);
                var7.drawString(arg4, var9 - -((304 - 6 * arg4.length()) / 2), var10 + 22);
            }
            if (class349.field5099 != null) {
                var7.setFont(class409.field5983);
                var7.setColor(arg1);
                var7.drawString(class349.field5099, class117.field1754 / 2 - class349.field5099.length() * 6 / 2, class27.field359 / 2 + -26);
            }
        } catch (Exception var12) {
            class426.field6248.repaint();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ldn;B)Z", line = 128)
    public static final boolean method1873(class357 arg0, byte arg1) {
        ++field4408;
        if (arg1 < 100) {
            method1875(89, -57, -51, (class77) null, true, -91, -59);
        }
        return class383.field5593 == arg0 || class498.field7253 == arg0 || class76.field1014 == arg0 || class74.field1001 == arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)J", line = 140)
    public final long method110(byte arg0) {
        ++field4402;
        return arg0 >= -66 ? -6L : super.field1915.method2592();
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 151)
    public static void method1874(int arg0) {
        if (arg0 == 4075) {
            field4405 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lef;I[BI)V", line = 164)
    public class324(class338 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4407 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILco;ZII)V", line = 172)
    public static final void method1875(int arg0, int arg1, int arg2, class77 arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            method1872((Color) null, (Color) null, 120, (Color) null, (String) null, false, false);
        }
        ++field4401;
        class269.method1611((byte) -90, arg3.field1732, arg6, arg1, arg2, 0, arg5, arg3.field1735, arg0, arg3.field1738);
    }
}
