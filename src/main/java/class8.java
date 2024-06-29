import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 extends class5 {

    @OriginalMember(owner = "mapview!da", name = "o", descriptor = "Lu;")
    public static class38 field63 = class9.method45(-41, "uitext has incorrect number of strings");

    @OriginalMember(owner = "mapview!da", name = "r", descriptor = "Lu;")
    public static class38 field66 = class9.method45(-41, "-5bersicht");

    @OriginalMember(owner = "mapview!da", name = "p", descriptor = "Z")
    public static volatile boolean field64 = true;

    @OriginalMember(owner = "mapview!da", name = "q", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "mapview!da", name = "t", descriptor = "Lu;")
    public static class38 field68 = class9.method45(-41, "Archery Shop");

    @OriginalMember(owner = "mapview!da", name = "u", descriptor = "Lu;")
    public static class38 field69 = class9.method45(-41, "world");

    @OriginalMember(owner = "mapview!da", name = "v", descriptor = "Lu;")
    public static class38 field70 = class9.method45(-41, "Platelegs Shop");

    @OriginalMember(owner = "mapview!da", name = "w", descriptor = "Lu;")
    public class38 field71;

    @OriginalMember(owner = "mapview!da", name = "s", descriptor = "[B")
    public static byte[] field67;

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)V", line = 9)
    public static void method31(int arg0) {
        field68 = null;
        field69 = null;
        field70 = null;
        if (arg0 != 8541) {
            method31(-80);
        }
        field63 = null;
        field67 = null;
        field66 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(I)[Ld;", line = 30)
    public static final class7[] method32(int arg0) {
        class7[] var1 = new class7[class10.field90];
        for (int var2 = 0; var2 < class10.field90; var2++) {
            class7 var3 = var1[var2] = new class7();
            var3.field57 = class28.field350;
            var3.field59 = class28.field353;
            var3.field56 = class9.field78[var2];
            var3.field61 = class26.field326[var2];
            var3.field62 = class11.field112[var2];
            var3.field55 = class26.field333[var2];
            var3.field58 = class11.field109;
            var3.field60 = mapview.field249[var2];
        }
        class22.method102(false);
        int var4 = -4 % ((21 - arg0) / 49);
        return var1;
    }

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "(B)V", line = 67)
    public static final void method33(byte arg0) {
        if (class23.field215[0][class30.field365][class18.field159] == null) {
            class19.field186 = null;
        } else {
            class19.field186 = class23.field215[0][class30.field365][class18.field159];
        }
        if (class23.field215[1][class30.field365][class18.field159] == null) {
            class19.field181 = null;
        } else {
            class19.field181 = class23.field215[1][class30.field365][class18.field159];
        }
        if (class23.field215[2][class30.field365][class18.field159] == null) {
            field67 = null;
        } else {
            field67 = class23.field215[2][class30.field365][class18.field159];
        }
        if (class23.field215[3][class30.field365][class18.field159] == null) {
            class5.field33 = null;
        } else {
            class5.field33 = class23.field215[3][class30.field365][class18.field159];
        }
        if (class23.field215[4][class30.field365][class18.field159] == null) {
            class12.field116 = null;
        } else {
            class12.field116 = class23.field215[4][class30.field365][class18.field159];
        }
        if (class31.field379[class30.field365][class18.field159] == null) {
            class22.field209 = null;
        } else {
            class22.field209 = class31.field379[class30.field365][class18.field159];
        }
        if (class28.field347[class30.field365][class18.field159] == null) {
            class14.field140 = null;
        } else {
            class14.field140 = class28.field347[class30.field365][class18.field159];
        }
        int var1 = 22 % ((arg0 - 40) / 32);
        if (class14.field135[class30.field365][class18.field159] == null) {
            class5.field36 = null;
        } else {
            class5.field36 = class14.field135[class30.field365][class18.field159];
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/awt/Color;ZLu;I)V", line = 118)
    public static final void method34(Color arg0, boolean arg1, class38 arg2, int arg3) {
        try {
            Graphics var4 = class31.field381.getGraphics();
            if (class23.field214 == null) {
                class23.field214 = new Font("Helvetica", 1, 13);
                class1.field3 = class31.field381.getFontMetrics(class23.field214);
            }
            if (field64) {
                field64 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class13.field128, class25.field224);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class32.field394 == null) {
                    class32.field394 = class31.field381.createImage(304, 34);
                }
                Graphics var5 = class32.field394.getGraphics();
                if (!arg1) {
                    method31(-72);
                }
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class23.field214);
                var5.setColor(Color.white);
                arg2.method237((304 - arg2.method229(class1.field3, -24)) / 2, 227, var5, 22);
                var4.drawImage(class32.field394, class13.field128 / 2 - 152, class25.field224 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = class25.field224 / 2 - 18;
                int var8 = class13.field128 / 2 - 152;
                var4.setColor(arg0);
                var4.drawRect(var8, var7, 303, 33);
                var4.fillRect(var8 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg3 * 3 + var8 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class23.field214);
                var4.setColor(Color.white);
                arg2.method237((304 - arg2.method229(class1.field3, 127)) / 2 + var8, 227, var4, var7 + 22);
            }
        } catch (Exception var11) {
            class31.field381.repaint();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Lw;ILu;Lu;)[Loa;", line = 191)
    public static final class29[] method35(class41 arg0, int arg1, class38 arg2, class38 arg3) {
        if (arg1 != 1) {
            field66 = null;
        }
        int var4 = arg0.method263(arg3, -115);
        int var5 = arg0.method258(var4, arg2, (byte) 82);
        return class33.method185(arg0, var5, var4, arg1 ^ 0xF0000001);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([BIII)Lu;", line = 213)
    public static final class38 method36(byte[] arg0, int arg1, int arg2, int arg3) {
        class38 var4 = new class38();
        if (arg2 != 2) {
            method31(57);
        }
        var4.field487 = new byte[arg3];
        var4.field492 = 0;
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field487[var4.field492++] = arg0[var5];
            }
        }
        return var4;
    }
}
