import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class95 extends class196 {

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    private final int field1605;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    private final int field1594;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    private final int field1593;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    private final int field1600;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private final int field1603;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    private final int field1609;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    private final int field1608;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    private final int field1599;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Loa;")
    public static class99 field1595 = class221.method1463(2844, "headicons_pk");

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Lbh;")
    public static class7 field1596;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[Lpi;")
    public static class139[] field1602;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[Laa;")
    public static class170[] field1607;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
    public final void method271(int arg0, int arg1, byte arg2) {
        ++field1597;
        if (arg2 != 108) {
            this.method271(82, 108, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method636(int arg0) {
        field1596 = null;
        field1602 = null;
        if (arg0 != -762835668) {
            method636(46);
        }
        field1595 = null;
        field1607 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg4 != 2) {
            method639((byte) 79);
        }
        ++field1612;
        if (~class168.field3006.method516((byte) -65) == -3) {
            return class257.method1660(arg2, arg7, arg0, arg11, arg8, arg5, arg3, arg6, arg9, (byte) -102, arg1, arg10);
        } else {
            return class168.field3006.method516((byte) -65) > 2 ? class258.method1671(class168.field3006.method516((byte) -65), arg8, arg0, arg5, (byte) -70, arg7, arg1, arg3, arg10, arg2, arg9, arg11, arg6) : class32.method262(arg5, arg3, arg2, arg9, arg0, arg8, true, arg10, arg6, arg7, arg1, arg11);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field1610;
        if (arg2 != 0) {
            field1595 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ltg;B)V")
    public static final void method638(class182 arg0, byte arg1) {
        class90.field1538 = class208.method1394(arg0, class164.field2882, (byte) 92);
        ++field1611;
        int var2 = 53 % ((-38 - arg1) / 52);
        class108.field1947 = new int[256];
        for (int var3 = 0; ~var3 > -4; ++var3) {
            float var5 = (float) (255 & class75.field1280[var3] >> 16);
            int var6 = (class75.field1280[var3 + 1] & 16711680) >> 16;
            float var7 = (float) (255 & class75.field1280[var3] >> 8);
            float var8 = ((float) var6 + -var5) / 64.0F;
            int var9 = (class75.field1280[var3 + 1] & 65280) >> 8;
            float var10 = ((float) var9 + -var7) / 64.0F;
            float var11 = (float) (255 & class75.field1280[var3]);
            int var12 = class75.field1280[var3 + 1] & 255;
            float var13 = ((float) var12 + -var11) / 64.0F;
            for (int var14 = 0; var14 < 64; ++var14) {
                class108.field1947[var3 * 64 - -var14] = class179.method1194((int) var11, class179.method1194((int) var5 << 16, (int) var7 << 8));
                var7 += var10;
                var11 += var13;
                var5 += var8;
            }
        }
        for (int var4 = 192; ~var4 > -256; ++var4) {
            class108.field1947[var4] = class75.field1280[3];
        }
        class171.field3041 = new int[32768];
        class219.field3818 = new int[32768];
        class19.method114((byte) 96, (class109) null);
        class85.field1478 = new int[32768];
        class219.field3817 = new int[32768];
        class127.field2207 = new class4(128, 254);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        ++field1604;
        int var4 = this.field1603 * arg0 >> 12;
        int var5 = this.field1593 * arg0 >> 12;
        int var6 = this.field1599 * arg0 >> 12;
        int var7 = this.field1600 * arg1 >> 12;
        int var8 = this.field1608 * arg1 >> 12;
        int var9 = this.field1605 * arg0 >> 12;
        int var10 = this.field1594 * arg1 >> 12;
        if (arg2 != 205) {
            field1596 = null;
        }
        int var11 = this.field1609 * arg1 >> 12;
        class31.method260(var4, var11, -115, var6, super.field3412, var9, var10, var7, var8, var5);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static final void method639(byte arg0) {
        ++field1606;
        if (class252.field4358 != null) {
            class290 var1 = class252.field4358;
            synchronized (class252.field4358) {
                class252.field4358 = null;
            }
        }
        if (arg0 != -92) {
            field1607 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILoa;BZLjava/awt/Color;)V")
    public static final void method640(int arg0, class99 arg1, byte arg2, boolean arg3, Color arg4) {
        ++field1598;
        try {
            Graphics var5 = class166.field2951.getGraphics();
            if (class13.field120 == null) {
                class13.field120 = new Font("Helvetica", 1, 13);
                class278.field4879 = class166.field2951.getFontMetrics(class13.field120);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class199.field3458, class24.field373);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class35.field621 == null) {
                    class35.field621 = class166.field2951.createImage(304, 34);
                }
                Graphics var6 = class35.field621.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class13.field120);
                var6.setColor(Color.white);
                arg1.method681((-arg1.method663(92, class278.field4879) + 304) / 2, -2040, 22, var6);
                var5.drawImage(class35.field621, class199.field3458 / 2 + -152, class24.field373 / 2 + -18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = class199.field3458 / 2 + -152;
                int var8 = class24.field373 / 2 + -18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 - -2, -(arg0 * 3) + 300, 30);
                var5.setFont(class13.field120);
                var5.setColor(Color.white);
                arg1.method681(var7 + (-arg1.method663(-64, class278.field4879) + 304) / 2, -2040, var8 + 22, var5);
            }
            int var9 = -125 % ((14 - arg2) / 36);
            if (class86.field1484 != null) {
                var5.setFont(class13.field120);
                var5.setColor(Color.white);
                class86.field1484.method681(class199.field3458 / 2 + -(class86.field1484.method663(86, class278.field4879) / 2), -2040, class24.field373 / 2 + -26, var5);
            }
        } catch (Exception var11) {
            class166.field2951.repaint();
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1605 = arg6;
        this.field1594 = arg3;
        this.field1593 = arg4;
        this.field1600 = arg1;
        this.field1603 = arg0;
        this.field1609 = arg7;
        this.field1608 = arg5;
        this.field1599 = arg2;
    }
}
