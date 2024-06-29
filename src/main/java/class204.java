import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class204 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
    public static int[] field3683 = new int[256];

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lkh;")
    public static class117 field3685 = class224.method1450((byte) 110, "<col=00ffff>");

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3688 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
    public static int[] field3690;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1353(int arg0, int arg1) {
        field3686++;
        if (arg0 == -1 || !class96.field1760[arg0]) {
            return;
        }
        class11.field366.method87(arg0, (byte) 124);
        if (class90.field1675[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 24861) {
            field3683 = null;
        }
        for (int var3 = 0; var3 < class90.field1675[arg0].length; var3++) {
            if (class90.field1675[arg0][var3] != null) {
                if (class90.field1675[arg0][var3].field225 == 2) {
                    var2 = false;
                } else {
                    class90.field1675[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class90.field1675[arg0] = null;
        }
        class96.field1760[arg0] = false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static final void method1354(int arg0) {
        field3687++;
        int[] var1 = new int[class227.field4087];
        int var2 = 0;
        if (arg0 != 3018) {
            method1353(22, 66);
        }
        for (int var3 = 0; var3 < class227.field4087; var3++) {
            class154 var5 = class214.method1408((byte) 102, var3);
            if (var5.field2764 >= 0 || var5.field2814 >= 0) {
                var1[var2++] = var3;
            }
        }
        class209.field3746 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class209.field3746[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1355(int arg0, boolean arg1) {
        field3689++;
        if (arg1) {
            return true;
        } else {
            return (arg0 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field3690 = null;
        field3685 = null;
        field3683 = null;
        if (arg0 < 15) {
            field3688 = -105;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZILkh;ILjava/awt/Color;)V")
    public static final void method1357(boolean arg0, int arg1, class117 arg2, int arg3, Color arg4) {
        field3682++;
        try {
            Graphics var5 = class85.field1608.getGraphics();
            if (class200.field3638 == null) {
                class200.field3638 = new Font("Helvetica", 1, 13);
                class58.field1196 = class85.field1608.getFontMetrics(class200.field3638);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class97.field1793, class124.field2324);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (arg3 != -16788) {
                    method1356(21);
                }
                if (class167.field3010 == null) {
                    class167.field3010 = class85.field1608.createImage(304, 34);
                }
                Graphics var6 = class167.field3010.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class200.field3638);
                var6.setColor(Color.white);
                arg2.method808((304 - arg2.method814(-31705, class58.field1196)) / 2, -18800, 22, var6);
                var5.drawImage(class167.field3010, class97.field1793 / 2 - 152, class124.field2324 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class97.field1793 / 2 - 152;
                int var8 = class124.field2324 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var5.setFont(class200.field3638);
                var5.setColor(Color.white);
                arg2.method808((304 - arg2.method814(arg3 - 14917, class58.field1196)) / 2 + var7, arg3 + -2012, var8 + 22, var5);
            }
            if (class44.field963 != null) {
                var5.setFont(class200.field3638);
                var5.setColor(Color.white);
                class44.field963.method808(class97.field1793 / 2 - class44.field963.method814(-31705, class58.field1196) / 2, arg3 ^ 0x8FC, class124.field2324 / 2 - 26, var5);
            }
        } catch (Exception var10) {
            class85.field1608.repaint();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIBI)V")
    public static final void method1358(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class83.method575(arg1, arg0, arg1 + arg4, arg0 + arg2);
        class83.method579(arg1, arg0, arg4, arg2, 0);
        field3684++;
        if (class43.field952 < 100) {
            return;
        }
        if (class180.field3256 == null) {
            class144 var5 = new class144(arg4, arg2);
            class83.method571(var5.field2602, arg4, arg2);
            class150.method1074(class237.field4284, 0, class33.field773, 2, arg2, 0, 0, arg4, 0);
            class180.field3256 = var5;
            class23.field588.method884((byte) -92);
        }
        class180.field3256.method275(arg1, arg0);
        int var6 = class12.field400 * arg4 / class237.field4284 + arg1;
        int var7 = class40.field925 * arg2 / class33.field773 + arg0;
        int var8 = class100.field1835 * arg4 / class237.field4284;
        int var9 = class70.field1345 * arg2 / class33.field773;
        if (arg3 <= 90) {
            field3690 = null;
        }
        class83.method580(var6, var7, var8, var9, 16711680, 128);
        class83.method586(var6, var7, var8, var9, 16711680);
        if (class243.field4426 <= 0 || class243.field4426 % 10 >= 5) {
            return;
        }
        for (class157 var10 = (class157) class155.field2828.method314((byte) -26); var10 != null; var10 = (class157) class155.field2828.method320(0)) {
            if (class185.field3326 == var10.field2854) {
                int var11 = arg1 + var10.field2852 * arg4 / class237.field4284;
                int var12 = var10.field2856 * arg2 / class33.field773 + arg0;
                class83.method579(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3683[var0] = var1;
        }
    }
}
