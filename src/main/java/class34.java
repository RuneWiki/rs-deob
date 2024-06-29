import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class34 extends class177 {

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "[B")
    public byte[] field509;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Lbe;")
    public static class283 field507 = class153.method941(-39, "(U");

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "[[I")
    public static int[][] field510 = new int[104][104];

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "Ltf;")
    public static class242 field502 = new class242(64);

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "Z")
    public static boolean field511 = false;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "[I")
    public static int[] field513 = new int[25];

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field516 = -1;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "Z")
    public static boolean field514 = false;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "[I")
    public static int[] field517 = new int[2];

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "F")
    public static float field512;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "Lfd;")
    public static class230 field515;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)I", line = 13)
    public static final int method222(int arg0, byte arg1) {
        int var2 = 77 / ((arg1 + 58) / 52);
        field505++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBZLjava/awt/Color;Lbe;)V", line = 28)
    public static final void method223(int arg0, byte arg1, boolean arg2, Color arg3, class283 arg4) {
        try {
            if (arg1 >= -67) {
                return;
            }
            Graphics var5 = class264.field4487.getGraphics();
            if (class177.field3048 == null) {
                class177.field3048 = new Font("Helvetica", 1, 13);
                class159.field2603 = class264.field4487.getFontMetrics(class177.field3048);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class115.field1945, class48.field655);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class112.field1892 == null) {
                    class112.field1892 = class264.field4487.createImage(304, 34);
                }
                Graphics var6 = class112.field1892.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg0 * 3) + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class177.field3048);
                var6.setColor(Color.white);
                arg4.method1915(var6, false, 22, (304 - arg4.method1919(class159.field2603, -23337)) / 2);
                var5.drawImage(class112.field1892, class115.field1945 / 2 - 152, class48.field655 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class48.field655 / 2 - 18;
                int var9 = class115.field1945 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var8 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class177.field3048);
                var5.setColor(Color.white);
                arg4.method1915(var5, false, var8 + 22, (-arg4.method1919(class159.field2603, -23337) + 304) / 2 + var9);
            }
            if (class83.field1411 != null) {
                var5.setFont(class177.field3048);
                var5.setColor(Color.white);
                class83.field1411.method1915(var5, false, class48.field655 / 2 - 26, class115.field1945 / 2 + -(class83.field1411.method1919(class159.field2603, -23337) / 2));
            }
        } catch (Exception var12) {
            class264.field4487.repaint();
        }
        field508++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLuk;Luk;)V", line = 100)
    public static final void method224(byte arg0, class86 arg1, class86 arg2) {
        field504++;
        if (arg1.field1447 != null) {
            arg1.method557((byte) -89);
        }
        arg1.field1447 = arg2.field1447;
        arg1.field1453 = arg2;
        if (arg0 != 81) {
            method225(116, -62, 97, -44);
        }
        arg1.field1447.field1453 = arg1;
        arg1.field1453.field1447 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)I", line = 129)
    public static final int method225(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field503++;
        if (arg0 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 148)
    public static final void method226(int arg0, int arg1) {
        field506++;
        class138 var2 = class121.field2017;
        synchronized (class121.field2017) {
            class237.field3963 = arg0;
        }
        if (arg1 != 14195) {
            field512 = 0.08975207F;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V", line = 161)
    public class34(byte[] arg0) {
        this.field509 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V", line = 175)
    public static void method227(byte arg0) {
        field507 = null;
        field510 = (int[][]) null;
        field517 = null;
        field513 = null;
        if (arg0 > -103) {
            method227((byte) -41);
        }
        field515 = null;
        field502 = null;
    }
}
