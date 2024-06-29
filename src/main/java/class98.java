import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class98 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1584 = -1;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[J")
    public static long[] field1586 = new long[500];

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field1587 = 0;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lvb;")
    public static class247 field1581 = new class247();

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lsc;")
    public static class181 field1589 = class149.method967(255, "Benutzen");

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lsc;")
    public static class181 field1590 = class149.method967(255, "Okay");

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Ljb;")
    public static class11 field1585;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Ldg;")
    public static class90 field1583;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1590 = null;
        field1586 = null;
        field1585 = null;
        field1583 = null;
        field1581 = null;
        field1589 = null;
        int var1 = -25 / ((arg0 + 54) / 55);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IZLjava/awt/Color;I)V")
    public static final void method647(class181 arg0, int arg1, boolean arg2, Color arg3, int arg4) {
        try {
            Graphics var5 = class107.field1740.getGraphics();
            if (class32.field517 == null) {
                class32.field517 = new Font("Helvetica", 1, 13);
                class255.field4457 = class107.field1740.getFontMetrics(class32.field517);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class143.field2321, class41.field620);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (arg4 <= 112) {
                    field1587 = 47;
                }
                if (class155.field2586 == null) {
                    class155.field2586 = class107.field1740.createImage(304, 34);
                }
                Graphics var6 = class155.field2586.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * 3) + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class32.field517);
                var6.setColor(Color.white);
                arg0.method1246((byte) 65, var6, 22, (304 - arg0.method1238(class255.field4457, -15855)) / 2);
                var5.drawImage(class155.field2586, class143.field2321 / 2 - 152, class41.field620 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class143.field2321 / 2 - 152;
                int var8 = class41.field620 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + (var7 + 2), var8 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class32.field517);
                var5.setColor(Color.white);
                arg0.method1246((byte) 65, var5, var8 + 22, (-arg0.method1238(class255.field4457, -15855) + 304) / 2 + var7);
            }
            if (class75.field1204 != null) {
                var5.setFont(class32.field517);
                var5.setColor(Color.white);
                class75.field1204.method1246((byte) 65, var5, class41.field620 / 2 - 26, class143.field2321 / 2 - class75.field1204.method1238(class255.field4457, -15855) / 2);
            }
        } catch (Exception var10) {
            class107.field1740.repaint();
        }
        field1580++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIBIIII)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field1582++;
        int var11 = arg0 - arg4;
        int var12 = arg3 - arg7;
        boolean var13;
        if (class80.field1294 > 0 && class80.field1294 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        if (arg6 != 86) {
            field1581 = null;
        }
        int var14 = 983040 / arg8;
        int var15 = 983040 / arg1;
        for (int var16 = -var15; var16 < var12 + var15; var16++) {
            int var18 = arg5 + (arg1 * var16) >> 16;
            int var19 = (var16 + 1) * arg1 + arg5 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg10 + var19;
                int var22 = arg10 + var18;
                int var23 = arg7 + var16 >> 6;
                if (var23 >= 0 && (class23.field407.length - 1) >= var23) {
                    int[][] var24 = class23.field407[var23];
                    for (int var25 = -var14; var25 < (var11 + var14); var25++) {
                        int var26 = arg9 + (arg8 * var25) >> 16;
                        int var27 = (var25 + 1) * arg8 + arg9 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg2 + var26;
                            int var30 = arg4 + var25 >> 6;
                            var10000 = arg2 + var27;
                            if (var30 >= 0 && var30 <= var24.length - 1 && var24[var30] != null) {
                                int var32 = ((arg4 + var25 & 0x3F) << 6) + (arg7 + var16 & 0x3F);
                                int var33 = var24[var30][var32];
                                if (var33 != 0) {
                                    class148 var34 = class62.method442((byte) 79, var33 - 1);
                                    if (var13 && client.field2704 == var34.field2457) {
                                        class111 var35 = new class111();
                                        var35.field1828 = var34.field2457;
                                        var35.field1818 = var29;
                                        var35.field1817 = var22;
                                        class61.field945.method1689(var35, 92);
                                    }
                                    class66.field1078[var34.field2457].method322(var22 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class111 var17 = (class111) class61.field945.method1686((byte) -83); var17 != null; var17 = (class111) class61.field945.method1683(140)) {
            class66.field1078[var17.field1828].method322(var17.field1817 - 7, var17.field1818 + -7);
            class17.method166(var17.field1817, var17.field1818, 15, 16776960, 128);
            class17.method166(var17.field1817, var17.field1818, 7, 16777215, 256);
        }
        class61.field945.method1682(-11);
    }
}
