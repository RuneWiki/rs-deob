import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class177 extends class190 {

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[Luc;")
    public class169[] field3090 = new class169[5];

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public int field3091 = 0;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[I")
    public int[] field3092 = new int[5];

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Lwc;")
    public static class232 field3113 = new class232(64);

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Z")
    public static boolean field3117 = true;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "[I")
    public static int[] field3119 = new int[25];

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lbk;")
    public class141 field3096;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Ldi;")
    public class146 field3097;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Ldj;")
    public class162 field3116;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Ldf;")
    public class177 field3107;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Lvd;")
    public class17 field3101;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Lva;")
    public class199 field3103;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Loe;")
    public static class256 field3120;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "Lsj;")
    public class36 field3114;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
    public boolean field3094;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Z")
    public boolean field3104;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Z")
    public boolean field3112;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "[Lqg;")
    public static class217[] field3118;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(III)V")
    public class177(int arg0, int arg1, int arg2) {
        this.field3109 = arg1;
        this.field3110 = arg2;
        this.field3105 = this.field3089 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static final void method1165(int arg0) {
        field3099++;
        if (arg0 != -8886) {
            method1166(4, 97, -105, 73, -29);
        }
        if (class45.field587 != null) {
            class45.field587.method1143(8);
        }
        if (class179.field3156 != null) {
            class179.field3156.method1143(8);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class204.field3550 * arg0 + class129.field2243 * arg3 >> 16;
        int var6 = class204.field3550 * arg3 - class129.field2243 * arg0 >> 16;
        int var7 = class173.field2997 * var6 + class139.field2449 * arg1 >> 16;
        int var8 = class173.field2997 * arg1 - class139.field2449 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class173.field2997 * var6 + class139.field2449 * arg2 >> 16;
        int var12 = class173.field2997 * arg2 - class139.field2449 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class254.field4401 && var13 < class254.field4401) {
            return false;
        } else if (var9 > class110.field1760 && var13 > class110.field1760) {
            return false;
        } else if (var10 < class3.field32 && var14 < class3.field32) {
            return false;
        } else {
            return var10 <= class18.field187 || var14 <= class18.field187;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static void method1167(byte arg0) {
        field3119 = null;
        int var1 = -79 % ((58 - arg0) / 32);
        field3113 = null;
        field3120 = null;
        field3118 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILqe;Ljava/awt/Color;Z)V")
    public static final void method1168(int arg0, int arg1, class168 arg2, Color arg3, boolean arg4) {
        try {
            Graphics var5 = class51.field686.getGraphics();
            if (class42.field557 == null) {
                class42.field557 = new Font("Helvetica", 1, 13);
                class199.field3432 = class51.field686.getFontMetrics(class42.field557);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class223.field3837, class42.field551);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class133.field2330 == null) {
                    class133.field2330 = class51.field686.createImage(304, 34);
                }
                Graphics var6 = class133.field2330.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class42.field557);
                var6.setColor(Color.white);
                arg2.method1082((304 - arg2.method1102(101, class199.field3432)) / 2, arg1, var6, -14734);
                var5.drawImage(class133.field2330, class223.field3837 / 2 - 152, class42.field551 / 2 - 18, null);
            } catch (Exception var9) {
                int var7 = class42.field551 / 2 - 18;
                int var8 = class223.field3837 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(var8 + arg0 * 3 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class42.field557);
                var5.setColor(Color.white);
                arg2.method1082((304 - arg2.method1102(76, class199.field3432)) / 2 + var8, var7 + 22, var5, -14734);
            }
            if (class129.field2158 != null) {
                var5.setFont(class42.field557);
                var5.setColor(Color.white);
                class129.field2158.method1082(class223.field3837 / 2 - class129.field2158.method1102(arg1 + 73, class199.field3432) / 2, class42.field551 / 2 + -26, var5, -14734);
            }
        } catch (Exception var10) {
            class51.field686.repaint();
        }
        field3106++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Z")
    public static final boolean method1169(int arg0, int arg1) {
        if (arg1 == -26) {
            field3093++;
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class254.field4395[arg0][arg1][arg2];
        if (var4 != null) {
            class254.field4395[arg0][arg1][arg2].field3095 = arg3;
        }
    }
}
