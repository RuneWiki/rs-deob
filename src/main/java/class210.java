import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class210 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[J")
    public static long[] field3991 = new long[256];

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lob;")
    public static class141 field3992 = class175.method1195(40, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lpi;")
    public static class158 field3994;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lob;")
    public static class141 field3995;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lob;Ljava/awt/Color;BI)V")
    public static final void method1370(class141 arg0, Color arg1, byte arg2, int arg3) {
        try {
            if (arg2 >= -122) {
                field3996 = 122;
            }
            Graphics var4 = class176.field3488.getGraphics();
            if (class76.field1562 == null) {
                class76.field1562 = new Font("Helvetica", 1, 13);
                class46.field880 = class176.field3488.getFontMetrics(class76.field1562);
            }
            if (class104.field2013) {
                class104.field2013 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class109.field2107, class18.field318);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class143.field2766 == null) {
                    class143.field2766 = class176.field3488.createImage(304, 34);
                }
                Graphics var5 = class143.field2766.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class76.field1562);
                var5.setColor(Color.white);
                arg0.method897(var5, 114, 22, (304 - arg0.method916(class46.field880, 0)) / 2);
                var4.drawImage(class143.field2766, class109.field2107 / 2 - 152, class18.field318 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class109.field2107 / 2 - 152;
                int var7 = class18.field318 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class76.field1562);
                var4.setColor(Color.white);
                arg0.method897(var4, 102, var7 + 22, (-arg0.method916(class46.field880, 0) + 304) / 2 + var6);
            }
        } catch (Exception var9) {
            class176.field3488.repaint();
        }
        field3997++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1371(int arg0) {
        if (arg0 != 2) {
            field3995 = null;
        }
        field3995 = null;
        field3991 = null;
        field3994 = null;
        field3992 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBII)V")
    public static final void method1372(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3989++;
        int var6 = arg4 - arg5;
        int var7 = arg2 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class161.method1126(arg1, arg0, arg5, 27908, arg2);
            }
        } else if (var7 == 0) {
            class79.method559(arg1, 114, arg5, arg4, arg0);
        } else {
            if (arg3 < 105) {
                field3996 = -71;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class68.field1323 > arg4) {
                var10 = class68.field1323;
                var11 = (class68.field1323 * var8 >> 12) + var9;
            } else if (class136.field2590 < arg4) {
                var10 = class136.field2590;
                var11 = (class136.field2590 * var8 >> 12) + var9;
            } else {
                var11 = arg2;
                var10 = arg4;
            }
            if (var11 < class35.field698) {
                var10 = (class35.field698 - var9 << 12) / var8;
                var11 = class35.field698;
            } else if (class130.field2470 < var11) {
                var10 = (class130.field2470 - var9 << 12) / var8;
                var11 = class130.field2470;
            }
            int var12;
            int var13;
            if (class68.field1323 > arg5) {
                var13 = class68.field1323;
                var12 = (class68.field1323 * var8 >> 12) + var9;
            } else if (arg5 <= class136.field2590) {
                var12 = arg1;
                var13 = arg5;
            } else {
                var13 = class136.field2590;
                var12 = (class136.field2590 * var8 >> 12) + var9;
            }
            if (class35.field698 > var12) {
                var13 = (class35.field698 - var9 << 12) / var8;
                var12 = class35.field698;
            } else if (class130.field2470 < var12) {
                var13 = (class130.field2470 - var9 << 12) / var8;
                var12 = class130.field2470;
            }
            class181.method1224(var11, var12, -638213620, arg0, var13, var10);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3991[var0] = var1;
        }
        field3994 = new class158();
        field3995 = class175.method1195(40, "Mem:");
    }
}
