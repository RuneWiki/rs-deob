import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class520 extends class355 {

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "Loe;")
    public static class137 field7585 = new class137(128);

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "Z")
    public static boolean field7590 = false;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "[B")
    private byte[] field7586;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)V")
    public final void method2214(int arg0, int arg1, byte arg2) {
        field7584++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7586[var10001] = var5;
        if (arg0 == -11947) {
            this.field7586[var6] = var5;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
    public static void method3083(byte arg0) {
        if (arg0 > -66) {
            method3084((byte) 56, null, null, null, false, null, -45);
        }
        field7585 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/lang/String;I)V")
    public static final void method3084(byte arg0, Color arg1, Color arg2, Color arg3, boolean arg4, String arg5, int arg6) {
        field7588++;
        try {
            Graphics var7 = class481.field6991.getGraphics();
            if (class132.field2065 == null) {
                class132.field2065 = new Font("Helvetica", 1, 13);
            }
            if (arg4) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class50.field927, class76.field1247);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                int var8 = -99 / ((37 - arg0) / 51);
                if (class289.field4279 == null) {
                    class289.field4279 = class481.field6991.createImage(304, 34);
                }
                Graphics var9 = class289.field4279.getGraphics();
                var9.setColor(arg1);
                var9.drawRect(0, 0, 303, 33);
                var9.setColor(arg3);
                var9.fillRect(2, 2, arg6 * 3, 30);
                var9.setColor(Color.black);
                var9.drawRect(1, 1, 301, 31);
                var9.fillRect(arg6 * 3 + 2, 2, 300 - (arg6 * 3), 30);
                var9.setFont(class132.field2065);
                var9.setColor(arg2);
                var9.drawString(arg5, (304 - (arg5.length() * 6)) / 2, 22);
                var7.drawImage(class289.field4279, class50.field927 / 2 - 152, class76.field1247 / 2 - 18, null);
            } catch (Exception var12) {
                int var10 = class50.field927 / 2 - 152;
                int var11 = class76.field1247 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var10 + 2, var11 - -2, arg6 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 - -1, 301, 31);
                var7.fillRect(arg6 * 3 + var10 + 2, var11 - -2, 300 - (arg6 * 3), 30);
                var7.setFont(class132.field2065);
                var7.setColor(arg2);
                var7.drawString(arg5, (304 - arg5.length() * 6) / 2 + var10, var11 - -22);
            }
            if (class57.field1023 != null) {
                var7.setFont(class132.field2065);
                var7.setColor(arg2);
                var7.drawString(class57.field1023, class50.field927 / 2 - (class57.field1023.length() * 6 / 2), class76.field1247 / 2 + -26);
            }
        } catch (Exception var13) {
            class481.field6991.repaint();
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIZ)[B")
    public final byte[] method3085(int arg0, int arg1, int arg2, boolean arg3) {
        this.field7586 = new byte[arg0 * 2 * arg1 * arg2];
        field7587++;
        this.method2846(arg3, arg0, arg1, arg2);
        return this.field7586;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILul;ILjava/awt/Component;I)Led;")
    public static final class507 method3086(int arg0, class411 arg1, int arg2, Component arg3, int arg4) {
        if (arg2 != -152) {
            method3084((byte) 114, null, null, null, true, null, 113);
        }
        field7583++;
        if (class120.field1877 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class507 var5 = (class507) Class.forName("tu").getDeclaredConstructor().newInstance();
                var5.field7340 = arg4;
                var5.field7328 = new int[(class385.field5498 ? 2 : 1) * 256];
                var5.method1572(arg3);
                var5.field7345 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field7345 > 16384) {
                    var5.field7345 = 16384;
                }
                var5.method1567(var5.field7345);
                if (class87.field1407 > 0 && class468.field6792 == null) {
                    class468.field6792 = new class327();
                    class468.field6792.field4808 = arg1;
                    arg1.method2436(class468.field6792, arg2 + 24457, class87.field1407);
                }
                if (class468.field6792 != null) {
                    if (class468.field6792.field4807[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class468.field6792.field4807[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class378 var6 = new class378(arg1, arg0);
                    var6.field7340 = arg4;
                    var6.field7328 = new int[(class385.field5498 ? 2 : 1) * 256];
                    var6.method1572(arg3);
                    var6.field7345 = 16384;
                    var6.method1567(var6.field7345);
                    if (class87.field1407 > 0 && class468.field6792 == null) {
                        class468.field6792 = new class327();
                        class468.field6792.field4808 = arg1;
                        arg1.method2436(class468.field6792, 24305, class87.field1407);
                    }
                    if (class468.field6792 != null) {
                        if (class468.field6792.field4807[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class468.field6792.field4807[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class507();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class520() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
