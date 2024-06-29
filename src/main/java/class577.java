import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class577 extends class361 {

    @OriginalMember(owner = "client!v", name = "K", descriptor = "S")
    public short field8155;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "S")
    public short field8149;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field8147 = 1;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Ldh;")
    public static class320 field8151 = new class320(20, 6);

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        if (arg0 != 2) {
            field8151 = null;
        }
        ++field8146;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
    public final boolean method1152(int arg0) {
        ++field8150;
        return arg0 != -4 ? true : class234.method1387(super.field4633, (byte) -56, super.field4635 >> class748.field10430, super.field4629 >> class748.field10430, this.method985(arg0 + 8));
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
    public static final void method3331(Color arg0, int arg1, Color arg2, String arg3, int arg4, Color arg5) {
        ++field8156;
        try {
            Graphics var6 = class618.field8849.getGraphics();
            if (class180.field2131 == null) {
                class180.field2131 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class340.field4400 == null) {
                    class340.field4400 = class618.field8849.createImage(class705.field9926, class476.field6777);
                }
                Graphics var7 = class340.field4400.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class705.field9926, class476.field6777);
                int var8 = class705.field9926 / 2 + -152;
                int var9 = class476.field6777 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * arg4, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg4 * 3 + var8 + 2, var9 + 2, -(arg4 * 3) + 300, 30);
                var7.setFont(class180.field2131);
                var7.setColor(arg2);
                var7.drawString(arg3, var8 + (304 - 6 * arg3.length()) / 2, var9 + 22);
                if (class40.field459 != null) {
                    var7.setFont(class180.field2131);
                    var7.setColor(arg2);
                    var7.drawString(class40.field459, class705.field9926 / 2 - 6 * class40.field459.length() / 2, class476.field6777 / 2 + -26);
                }
                var6.drawImage(class340.field4400, 0, 0, (ImageObserver) null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class705.field9926, class476.field6777);
                int var10 = class705.field9926 / 2 - 152;
                int var11 = class476.field6777 / 2 + -18;
                var6.setColor(arg0);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + 2 - -(arg4 * 3), var11 - -2, -(arg4 * 3) + 300, 30);
                var6.setFont(class180.field2131);
                var6.setColor(arg2);
                if (class40.field459 != null) {
                    var6.setFont(class180.field2131);
                    var6.setColor(arg2);
                    var6.drawString(class40.field459, class705.field9926 / 2 + -(class40.field459.length() * 6 / 2), class476.field6777 / 2 + -26);
                }
                var6.drawString(arg3, var10 + (304 - arg3.length() * 6) / 2, var11 + 22);
            }
        } catch (Exception var13) {
            class618.field8849.repaint();
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z")
    public final boolean method1154(int arg0) {
        ++field8148;
        if (arg0 != -1) {
            field8151 = null;
        }
        return class233.field2770[(super.field4635 >> class748.field10430) - (class440.field6387 - class626.field8992)][(super.field4629 >> class748.field10430) - -class626.field8992 + -class444.field6433];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLha;Lrr;IIII)V")
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8154;
        if (arg3 != 0) {
            method3333((byte) -10);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
    public static void method3332(int arg0) {
        field8151 = null;
        if (arg0 != 0) {
            field8147 = 68;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B[Lada;)I")
    public final int method1150(byte arg0, class163[] arg1) {
        if (arg0 >= -44) {
            field8147 = 75;
        }
        ++field8145;
        return this.method2121(super.field4629 >> class748.field10430, arg1, -84, super.field4635 >> class748.field10430);
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Z")
    public final boolean method991(int arg0) {
        int var2 = -75 / ((65 - arg0) / 48);
        ++field8152;
        return false;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(B)V")
    public static final void method3333(byte arg0) {
        ++field8153;
        class180.method1117((byte) -40, class654.field9334.field9863.method565(-120));
        int var1 = (class167.field1855 >> 12) - -(class464.field6624 >> 3);
        class122.field1278 = class90.field937.field4628 = 0;
        int var2 = (class590.field8319 >> 12) + (class181.field2144 >> 3);
        class90.field937.method1132(8, 8, 0);
        byte var3 = 18;
        class24.field232 = new byte[var3][];
        class676.field9572 = new byte[var3][];
        class74.field773 = new int[var3];
        class331.field4299 = new int[var3];
        class232.field2708 = new byte[var3][];
        class553.field7925 = new int[var3];
        class630.field9059 = new byte[var3][];
        class64.field655 = new int[var3][4];
        class602.field8566 = new byte[var3][];
        class111.field1173 = new int[var3];
        class323.field4123 = new int[var3];
        class322.field4113 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class489.field6976 >> 4)) / 8; ~var5 >= ~(((class489.field6976 >> 4) + var1) / 8); ++var5) {
            for (int var8 = (-(class153.field1677 >> 4) + var2) / 8; ~var8 >= ~(((class153.field1677 >> 4) + var2) / 8); ++var8) {
                int var9 = (var5 << 8) - -var8;
                class74.field773[var4] = var9;
                class331.field4299[var4] = class154.field1692.method2474(arg0 + -182, "m" + var5 + "_" + var8);
                class322.field4113[var4] = class154.field1692.method2474(-114, "l" + var5 + "_" + var8);
                class553.field7925[var4] = class154.field1692.method2474(-111, "n" + var5 + "_" + var8);
                class323.field4123[var4] = class154.field1692.method2474(-105, "um" + var5 + "_" + var8);
                class111.field1173[var4] = class154.field1692.method2474(118, "ul" + var5 + "_" + var8);
                if (class553.field7925[var4] == -1) {
                    class331.field4299[var4] = -1;
                    class322.field4113[var4] = -1;
                    class323.field4123[var4] = -1;
                    class111.field1173[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; ~var6 > ~class553.field7925.length; ++var6) {
            class553.field7925[var6] = -1;
            class331.field4299[var6] = -1;
            class322.field4113[var6] = -1;
            class323.field4123[var6] = -1;
            class111.field1173[var6] = -1;
        }
        if (arg0 != 59) {
            method3332(-76);
        }
        byte var7;
        if (class392.field5397 != 3) {
            var7 = 8;
        } else {
            var7 = 4;
        }
        class313.method1863(var2, var1, false, false, var7);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIII)V")
    public class577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field4628 = (byte) arg3;
        super.field4627 = arg1;
        this.field8155 = (short) arg5;
        super.field4633 = (byte) arg4;
        this.field8149 = (short) arg6;
        super.field4629 = arg2;
        super.field4635 = arg0;
    }
}
