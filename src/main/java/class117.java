import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class117 extends class202 {

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "J")
    public long field1933;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field1934 = 0;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIZZI)V")
    public static final void method858(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field1932++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        class227.field3754 = (short) arg2;
        class168.field2663 = (short) arg0;
        if (!arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class117() {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(J)V")
    public class117(long arg0) {
        this.field1933 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
    public static final void method859(byte arg0, int arg1) {
        short var2 = 256;
        field1935++;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class52.field914 += arg1 * 128;
        if (class52.field914 > class228.field3771.length) {
            class52.field914 -= class228.field3771.length;
            int var3 = (int) (Math.random() * 12.0D);
            class71.method507(class238.field3863[var3], 110);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class64.field1079[var4 + var5] - class228.field3771[class52.field914 + var4 & class228.field3771.length + -1] * arg1 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class64.field1079[var4++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class64.field1079[var23 + var24] = 255;
                } else {
                    class64.field1079[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg1; var9++) {
            class227.field3751[var9] = class227.field3751[var9 + arg1];
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class227.field3751[var10] = (int) (Math.sin((double) class137.field2262 / 14.0D) * 16.0D + Math.sin((double) class137.field2262 / 15.0D) * 14.0D + Math.sin((double) class137.field2262 / 16.0D) * 12.0D);
            class137.field2262++;
        }
        if (arg0 != 48) {
            field1934 = 27;
        }
        int var11 = ((class222.field3682 & 0x1) + arg1) / 2;
        class99.field1627 += arg1;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class99.field1627; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class64.field1079[(var21 << 7) + var22] = 192;
        }
        class99.field1627 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var20 + var11 < 128) {
                    var18 += class64.field1079[var20 + var11 + var19];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class64.field1079[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class137.field2258[var20 + var19] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var11 + var16) {
                    var15 += class137.field2258[var11 * 128 + var14 + var17];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class137.field2258[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class64.field1079[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Color;ILjava/lang/String;Z)V")
    public static final void method860(int arg0, Color arg1, int arg2, String arg3, boolean arg4) {
        try {
            if (arg0 != -11506) {
                field1934 = 10;
            }
            Graphics var5 = class155.field2511.getGraphics();
            if (class103.field1673 == null) {
                class103.field1673 = new Font("Helvetica", 1, 13);
                class101.field1653 = class155.field2511.getFontMetrics(class103.field1673);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class84.field1326, class279.field4423);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class282.field4476 == null) {
                    class282.field4476 = class155.field2511.createImage(304, 34);
                }
                Graphics var6 = class282.field4476.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class103.field1673);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class101.field1653.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class282.field4476, class84.field1326 / 2 - 152, class279.field4423 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class84.field1326 / 2 - 152;
                int var8 = class279.field4423 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(var7 + (arg2 * 3) + 2, var8 + 2, 300 - (arg2 * 3), 30);
                var5.setFont(class103.field1673);
                var5.setColor(Color.white);
                var5.drawString(arg3, var7 + (304 - class101.field1653.stringWidth(arg3)) / 2, var8 + 22);
            }
            if (class101.field1665 != null) {
                var5.setFont(class103.field1673);
                var5.setColor(Color.white);
                var5.drawString(class101.field1665, class84.field1326 / 2 - class101.field1653.stringWidth(class101.field1665) / 2, class279.field4423 / 2 + -26);
            }
        } catch (Exception var10) {
            class155.field2511.repaint();
        }
        field1931++;
    }
}
