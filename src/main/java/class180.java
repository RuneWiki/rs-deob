import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class180 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lmb;")
    public static class258 field2672 = null;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Lfg;")
    public static class18 field2678 = new class18(260);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method1404(int arg0) {
        if (arg0 != 0) {
            field2678 = null;
        }
        field2672 = null;
        field2678 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)I")
    public static final int method1405(String arg0, boolean arg1, int arg2, String arg3) {
        field2673++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class394.method2509(101, var22);
            var9 = class394.method2509(101, var24);
            char var26 = class151.method1164(221, arg2, var22);
            char var27 = class151.method1164(221, arg2, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class282.method2001(arg2, var28, 123) - class282.method2001(arg2, var29, 54);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class282.method2001(arg2, var20, 124) - class282.method2001(arg2, var21, -111);
                }
            }
        }
        if (!arg1) {
            field2672 = null;
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class282.method2001(arg2, var14, -113) - class282.method2001(arg2, var15, -113);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLvg;Ldp;Ldp;)V")
    public static final void method1406(boolean arg0, class108 arg1, class174 arg2, class174 arg3) {
        field2676++;
        class447.field6522 = arg1;
        class156.field2362 = arg2;
        if (arg0) {
            return;
        }
        class22.field329 = arg3;
        if (class156.field2362 != null) {
            class234.field3388 = class156.field2362.method1333(0, 1);
        }
        if (class22.field329 != null) {
            class338.field4821 = class22.field329.method1333(0, 1);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
    public static final int method1407(int arg0, int arg1, int arg2) {
        if (arg2 == 487781503) {
            field2674++;
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;BILjava/awt/Color;Z)V")
    public static final void method1408(Color arg0, Color arg1, String arg2, byte arg3, int arg4, Color arg5, boolean arg6) {
        field2677++;
        try {
            Graphics var7 = class33.field475.getGraphics();
            if (class126.field2041 == null) {
                class126.field2041 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class113.field1819, class277.field4170);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class338.field4819 == null) {
                    class338.field4819 = class33.field475.createImage(304, 34);
                }
                Graphics var8 = class338.field4819.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg5);
                var8.fillRect(2, 2, arg4 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var8.setFont(class126.field2041);
                int var9 = 53 / ((14 - arg3) / 33);
                var8.setColor(arg1);
                var8.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
                var7.drawImage(class338.field4819, class113.field1819 / 2 - 152, class277.field4170 / 2 - 18, (ImageObserver) null);
            } catch (Exception var12) {
                int var10 = class113.field1819 / 2 - 152;
                int var11 = class277.field4170 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + var10 + 2, var11 + 2, 300 - (arg4 * 3), 30);
                var7.setFont(class126.field2041);
                var7.setColor(arg1);
                var7.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var10, var11 - -22);
            }
            if (class302.field4415 != null) {
                var7.setFont(class126.field2041);
                var7.setColor(arg1);
                var7.drawString(class302.field4415, class113.field1819 / 2 - class302.field4415.length() * 6 / 2, class277.field4170 / 2 - 26);
            }
        } catch (Exception var13) {
            class33.field475.repaint();
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lnc;II[[BZ[[B[[B[[IILnc;Z[[BLja;)V")
    public static final void method1409(class126 arg0, int arg1, int arg2, byte[][] arg3, boolean arg4, byte[][] arg5, byte[][] arg6, int[][] arg7, int arg8, class126 arg9, boolean arg10, byte[][] arg11, class90 arg12) {
        field2675++;
        if (class288.field4303 == 0 && !class33.field476) {
            class158.method1254(arg11, arg1, arg5, arg0, arg6, arg10, arg3, arg8, arg2, arg9, 1, arg7, arg12);
        } else {
            class150.method1159((byte) -97, arg9, arg0, arg7, arg2, arg3, arg11, arg1, arg10, arg6, arg12, arg8, arg5);
        }
        if (arg4) {
            method1404(48);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)I")
    public static final int method1410(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field2679++;
        if (arg3 != 13371) {
            method1406(true, (class108) null, (class174) null, (class174) null);
        }
        return (arg2 >> 1) + (arg0 >> 2 << 10) + (arg1 >> 5 << 7);
    }
}
