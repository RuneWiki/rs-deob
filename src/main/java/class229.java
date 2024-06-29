import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class229 extends class146 {

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[B")
    public byte[] field3650;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Z")
    public static boolean field3646 = false;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lrk;")
    public static class191 field3651 = new class191();

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lf;")
    public static class227 field3654 = new class227(16);

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Lre;")
    public static class266 field3655 = new class266();

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field3657 = 0;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "[Z")
    public static boolean[] field3659 = new boolean[100];

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "[[[B")
    public static byte[][][] field3656;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "[[[B")
    public static byte[][][] field3658;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        class242.method1604();
        field3648++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class141.field2352[var1].method84(-118);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
    public static final void method1525(boolean arg0, int arg1) {
        class246.field3876 = null;
        if (arg0 && class152.field2484 != null) {
            class80.field1325 = class152.field2484.field2000;
        } else {
            class80.field1325 = -1;
        }
        class213.field3419 = null;
        class106.field1623 = null;
        class35.field597 = null;
        class172.field2911 = null;
        field3649++;
        class292.field4635 = null;
        class152.field2484 = null;
        if (arg1 != 301) {
            field3646 = true;
        }
        class137.field2299 = null;
        class288.field4603 = null;
        class81.field1333 = null;
        class5.field63 = 0;
        class149.field2446 = null;
        class187.field3057.method1818(121);
        class296.field4685 = null;
        class297.field4700 = null;
        class22.field335 = null;
        class80.field1326 = -1;
        class269.field4322 = null;
        client.field4564 = -1;
        class258.field4113 = null;
        class108.field1649 = null;
        class8.field91 = null;
        class81.field1343 = null;
        class116.field1956 = null;
        class143.field2358 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field3655 = null;
        field3658 = null;
        field3656 = null;
        field3654 = null;
        field3651 = null;
        field3659 = null;
        if (arg0 != 2) {
            method1528(false, (Color) null, (byte) -47, (String) null, 90);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBCLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1527(int arg0, byte arg1, char arg2, StringBuffer arg3) {
        int var4 = arg3.length();
        if (arg1 <= 69) {
            method1527(70, (byte) -124, (char) 65472, (StringBuffer) null);
        }
        arg3.setLength(arg0);
        field3647++;
        for (int var5 = var4; var5 < arg0; var5++) {
            arg3.setCharAt(var5, arg2);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLjava/awt/Color;BLjava/lang/String;I)V")
    public static final void method1528(boolean arg0, Color arg1, byte arg2, String arg3, int arg4) {
        field3653++;
        try {
            Graphics var5 = class22.field340.getGraphics();
            if (class241.field3793 == null) {
                class241.field3793 = new Font("Helvetica", 1, 13);
                class288.field4604 = class22.field340.getFontMetrics(class241.field3793);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class137.field2301, class33.field557);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class283.field4499 == null) {
                    class283.field4499 = class22.field340.createImage(304, 34);
                }
                if (arg2 > -48) {
                    return;
                }
                Graphics var6 = class283.field4499.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class241.field3793);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class288.field4604.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class283.field4499, class137.field2301 / 2 - 152, class33.field557 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class137.field2301 / 2 - 152;
                int var8 = class33.field557 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var7 + 2, var8 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class241.field3793);
                var5.setColor(Color.white);
                var5.drawString(arg3, (304 - class288.field4604.stringWidth(arg3)) / 2 + var7, var8 - -22);
            }
            if (class281.field4449 != null) {
                var5.setFont(class241.field3793);
                var5.setColor(Color.white);
                var5.drawString(class281.field4449, class137.field2301 / 2 - class288.field4604.stringWidth(class281.field4449) / 2, class33.field557 / 2 - 26);
            }
        } catch (Exception var10) {
            class22.field340.repaint();
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
    public class229(byte[] arg0) {
        this.field3650 = arg0;
    }
}
