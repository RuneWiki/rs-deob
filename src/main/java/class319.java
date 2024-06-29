import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class319 extends class117 {

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public int field4563 = 0;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "Lgf;")
    public static class180 field4558 = new class180(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "Z")
    public static boolean field4567 = false;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "[I")
    public static int[] field4565 = new int[8];

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "Lje;")
    public static class275 field4566;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "[Lf;")
    public static class528[] field4561;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lti;II)V")
    private final void method1997(class303 arg0, int arg1, int arg2) {
        if (arg1 >= 116) {
            field4560++;
            if (arg2 == 2) {
                this.field4563 = arg0.method1868(0);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;ZLjava/lang/String;ILjava/awt/Color;)V")
    public static final void method1998(Color arg0, int arg1, Color arg2, boolean arg3, String arg4, int arg5, Color arg6) {
        field4564++;
        try {
            Graphics var7 = class31.field503.getGraphics();
            if (class307.field4379 == null) {
                class307.field4379 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class112.field1780, class477.field7003);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class322.field4942 == null) {
                    class322.field4942 = class31.field503.createImage(304, 34);
                }
                Graphics var8 = class322.field4942.getGraphics();
                var8.setColor(arg0);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg6);
                var8.fillRect(arg5, 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg1 * 3) + 2, 2, 300 - (arg1 * 3), 30);
                var8.setFont(class307.field4379);
                var8.setColor(arg2);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class322.field4942, class112.field1780 / 2 - 152, class477.field7003 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class112.field1780 / 2 - 152;
                int var10 = class477.field7003 / 2 - 18;
                var7.setColor(arg0);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg6);
                var7.fillRect(var9 + 2, var10 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(var9 + (arg1 * 3) + 2, var10 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class307.field4379);
                var7.setColor(arg2);
                var7.drawString(arg4, (304 - (arg4.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class382.field5688 != null) {
                var7.setFont(class307.field4379);
                var7.setColor(arg2);
                var7.drawString(class382.field5688, class112.field1780 / 2 - class382.field5688.length() * 6 / 2, class477.field7003 / 2 + -26);
            }
        } catch (Exception var12) {
            class31.field503.repaint();
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILti;)V")
    public final void method1999(int arg0, class303 arg1) {
        field4562++;
        if (arg0 != 0) {
            method2001(17);
        }
        while (true) {
            int var3 = arg1.method1918((byte) 124);
            if (var3 == 0) {
                return;
            }
            this.method1997(arg1, arg0 + 122, var3);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[IIIIZIIIII[IILoe;)I")
    public static final int method2000(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, class133 arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class54.field800[var15][var35] = 0;
                class466.field6859[var15][var35] = 99999999;
            }
        }
        field4557++;
        if (arg0 != -1) {
            field4565 = null;
        }
        boolean var16;
        if (arg10 == 1) {
            var16 = class385.method2425(arg5, arg4, arg1, false, arg14, arg9, arg8, arg13, arg11, arg7, arg3);
        } else if (arg10 == 2) {
            var16 = class267.method1711(arg4, arg5, arg1, arg7, arg11, arg3, false, arg8, arg14, arg9, arg13);
        } else {
            var16 = class26.method217(arg11, arg8, arg10, false, arg13, arg5, arg3, arg7, arg1, arg14, arg4, arg9);
        }
        int var17 = arg13 - 64;
        int var18 = arg4 - 64;
        int var19 = class366.field5490;
        int var20 = class407.field5985;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= (arg7 + var23); var24++) {
                for (int var25 = arg8 - var23; var25 <= (arg8 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class466.field6859[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg7 > var24) {
                            var28 = arg7 - var24;
                        } else if (arg7 + arg11 - 1 < var24) {
                            var28 = 1 - (arg7 + arg11 - var24);
                        }
                        int var29 = 0;
                        if (arg8 > var25) {
                            var29 = arg8 - var25;
                        } else if (var25 > arg1 + arg8 - 1) {
                            var29 = var25 + 1 - arg8 - arg1;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class466.field6859[var26][var27] < var22) {
                            var22 = class466.field6859[var26][var27];
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg13 == var19 && arg4 == var20) {
            return 0;
        }
        byte var31 = 0;
        class127.field1935[var31] = var19;
        int var37 = var31 + 1;
        class185.field2760[var31] = var20;
        int var32;
        int var33 = var32 = class54.field800[var19 - var17][var20 - var18];
        while (arg13 != var19 || arg4 != var20) {
            if (var32 != var33) {
                class127.field1935[var37] = var19;
                var32 = var33;
                class185.field2760[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class54.field800[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg12[var34] = class127.field1935[var37];
            arg2[var34++] = class185.field2760[var37];
            if (arg12.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public static void method2001(int arg0) {
        if (arg0 > -82) {
            method2001(79);
        }
        field4561 = null;
        field4558 = null;
        field4565 = null;
        field4566 = null;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I")
    public static final int method2002(int arg0, int arg1) {
        field4559++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xEA) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg1 != 2) {
            field4566 = null;
        }
        return 0;
    }
}
