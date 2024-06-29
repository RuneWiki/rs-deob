import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class141 extends class34 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Z")
    public static boolean field2241 = false;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Liv;")
    public static class64 field2239 = new class64(18, -1);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2243 = 0;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "[Lbr;")
    public static class268[] field2244 = new class268[4];

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lta;")
    public class141 field2236;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lta;")
    public class141 field2238;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 4)
    public final void method1047(int arg0) {
        field2237++;
        if (this.field2238 == null) {
            return;
        }
        if (arg0 != -2886) {
            this.method1047(113);
        }
        this.field2238.field2236 = this.field2236;
        this.field2236.field2238 = this.field2238;
        this.field2238 = null;
        this.field2236 = null;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 22)
    public static void method1048(int arg0) {
        field2244 = null;
        field2239 = null;
        if (arg0 >= -5) {
            method1051(null, (byte) -5, null, false, null, -59, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILmq;Lqa;I)V", line = 34)
    public static final void method1049(int arg0, int arg1, class350 arg2, class162 arg3, int arg4) {
        field2235++;
        class381 var5 = arg2.method2218((byte) 72, arg3);
        if (var5 == null) {
            return;
        }
        arg3.method298(arg4, arg1, arg2.field5329 + arg4, arg2.field5269 + arg1);
        if (class128.field2030 == 2 || class128.field2030 == 5 || class295.field4197 == null) {
            arg3.method270(-16777216, var5, arg4, arg1);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class85.field1473 == 4) {
                var6 = class206.field2980;
                var7 = 4096;
                var8 = field2245;
                var9 = (int) (-class526.field7779) & 0x3FFF;
            } else {
                var8 = class139.field2224.field6228;
                var7 = 4096 - class70.field1215 * 16;
                var6 = class139.field2224.field6233;
                var9 = (int) (-class526.field7779) + class255.field3674 & 0x3FFF;
            }
            int var10 = var8 / 32 + 48 - ((class33.field662 + -104) * 2);
            int var11 = class121.field1966 * 4 + 48 - (var6 / 32) - (class121.field1966 * 2 - 208);
            class295.field4197.method3140((float) arg2.field5329 / 2.0F + (float) arg4, (float) arg2.field5269 / 2.0F + (float) arg1, (float) var10, (float) var11, var7, var9 << 2, var5, arg4, arg1);
            for (class451 var12 = (class451) class453.field6769.method2427(124); var12 != null; var12 = (class451) class453.field6769.method2422(-94)) {
                int var54 = var12.field6742;
                int var55 = ((class306.field4687.field134[var54] & 0xFFFCC87) >> 14) - class200.field2931;
                int var56 = (class306.field4687.field134[var54] & 0x3FFF) - class403.field6059;
                int var57 = var55 * 4 + 2 - (var8 / 32);
                int var58 = var56 * 4 + 2 - (var6 / 32);
                class64.method542(var58, arg4, var5, arg1, class306.field4687.field136[var54], arg2, var57, 1, arg3);
            }
            for (int var13 = 0; var13 < class146.field2335; var13++) {
                int var51 = class14.field223[var13] * 4 + 2 - (var8 / 32);
                int var52 = class468.field6971[var13] * 4 + 2 - (var6 / 32);
                class79 var53 = class319.field4807.method2874(class445.field6650[var13], -17045);
                if (var53.field1370 != null) {
                    var53 = var53.method631(6574, class335.field5059);
                    if (var53 == null || var53.field1397 == -1) {
                        continue;
                    }
                }
                class64.method542(var52, arg4, var5, arg1, var53.field1397, arg2, var51, 1, arg3);
            }
            for (class294 var14 = (class294) class433.field6430.method160((byte) -20); var14 != null; var14 = (class294) class433.field6430.method163(126)) {
                int var48 = (int) (var14.field4904 >> 28 & 0x3L);
                if (class369.field5593 == var48) {
                    int var49 = (int) (var14.field4904 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                    int var50 = (int) (var14.field4904 >> 14 & 0x3FFFL) * 4 + 2 - var6 / 32;
                    class166.method1225(arg4, var5, arg2, var49, arg1, -127, class320.field4907[0], var50);
                }
            }
            for (int var15 = 0; var15 < class510.field7529; var15++) {
                class255 var44 = class34.field668[class148.field2363[var15]];
                if (var44 != null && var44.method1650(16928) && class139.field2224.field6232 == var44.field6232) {
                    class42 var45 = var44.field3677;
                    if (var45 != null && var45.field797 != null) {
                        var45 = var45.method427(class335.field5059, (byte) -114);
                    }
                    if (var45 != null && var45.field821 && var45.field811) {
                        int var46 = var44.field6228 / 32 - (var8 / 32);
                        int var47 = var44.field6233 / 32 - var6 / 32;
                        if (var45.field778 == -1) {
                            class166.method1225(arg4, var5, arg2, var46, arg1, -128, class320.field4907[1], var47);
                        } else {
                            class64.method542(var47, arg4, var5, arg1, var45.field778, arg2, var46, 1, arg3);
                        }
                    }
                }
            }
            int var16 = class409.field6135;
            int[] var17 = class358.field5445;
            for (int var18 = 0; var18 < var16; var18++) {
                class256 var36 = class183.field2747[var17[var18]];
                if (var36 != null && var36.method1662(16928) && class139.field2224 != var36 && class139.field2224.field6232 == var36.field6232) {
                    int var37 = var36.field6228 / 32 - var8 / 32;
                    int var38 = var36.field6233 / 32 - (var6 / 32);
                    boolean var39 = false;
                    for (int var40 = 0; var40 < class184.field2756; var40++) {
                        if (var36.field3684.equals(class436.field6504[var40]) && class338.field5098[var40] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class335.field5050; var42++) {
                        if (var36.field3684.equals(class149.field2374[var42].field2178)) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    if (class139.field2224.field3722 != 0 && var36.field3722 != 0 && class139.field2224.field3722 == var36.field3722) {
                        var43 = true;
                    }
                    if (var36.field3685) {
                        class166.method1225(arg4, var5, arg2, var37, arg1, -127, class320.field4907[6], var38);
                    } else if (var39) {
                        class166.method1225(arg4, var5, arg2, var37, arg1, -128, class320.field4907[3], var38);
                    } else if (var41) {
                        class166.method1225(arg4, var5, arg2, var37, arg1, -127, class320.field4907[5], var38);
                    } else if (var43) {
                        class166.method1225(arg4, var5, arg2, var37, arg1, -128, class320.field4907[4], var38);
                    } else {
                        class166.method1225(arg4, var5, arg2, var37, arg1, -127, class320.field4907[2], var38);
                    }
                }
            }
            class128[] var19 = class45.field835;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class128 var23 = var19[var20];
                if (var23 != null && var23.field2038 != 0 && (class531.field7821 % 20) < 10) {
                    if (var23.field2038 == 1 && var23.field2032 >= 0 && class34.field668.length > var23.field2032) {
                        class255 var24 = class34.field668[var23.field2032];
                        if (var24 != null) {
                            int var25 = var24.field6228 / 32 - (var8 / 32);
                            int var26 = var24.field6233 / 32 - (var6 / 32);
                            class432.method2584(arg1, arg4, 12267, arg2, var26, var5, var23.field2033, 360000L, var25);
                        }
                    }
                    if (var23.field2038 == 2) {
                        int var27 = var23.field2031 / 32 - var8 / 32;
                        int var28 = var23.field2040 / 32 - (var6 / 32);
                        long var29 = (long) (var23.field2034 << 5);
                        long var31 = var29 * var29;
                        class432.method2584(arg1, arg4, 12267, arg2, var28, var5, var23.field2033, var31, var27);
                    }
                    if (var23.field2038 == 10 && var23.field2032 >= 0 && var23.field2032 < class183.field2747.length) {
                        class256 var33 = class183.field2747[var23.field2032];
                        if (var33 != null) {
                            int var34 = var33.field6228 / 32 - (var8 / 32);
                            int var35 = var33.field6233 / 32 - (var6 / 32);
                            class432.method2584(arg1, arg4, 12267, arg2, var35, var5, var23.field2033, 360000L, var34);
                        }
                    }
                }
            }
            if (class85.field1473 != 4) {
                if (class467.field6967 != 0) {
                    int var21 = class467.field6967 * 4 + ((class139.field2224.method1654(122) + -1) * 2) + 2 - (var8 / 32);
                    int var22 = class308.field4710 * 4 + 2 - (var6 / 32 + -((class139.field2224.method1654(121) + -1) * 2));
                    class166.method1225(arg4, var5, arg2, var21, arg1, -128, class8.field144[class100.field1648 ? 1 : 0], var22);
                }
                arg3.method1200(-1, 3, arg2.field5329 / 2 + arg4 - 1, arg2.field5269 / 2 + -1 + arg1, 3, 10);
            }
        }
        int var59 = -17 / ((-arg0 - 26) / 37);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BC)Z", line = 331)
    public static final boolean method1050(byte arg0, char arg1) {
        field2240++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class245.method1593(arg1, (byte) 81)) {
            return true;
        } else {
            char[] var2 = class480.field7148;
            if (arg0 >= -64) {
                return true;
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class202.field2959;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;BLjava/awt/Color;ZLjava/lang/String;ILjava/awt/Color;)V", line = 385)
    public static final void method1051(Color arg0, byte arg1, Color arg2, boolean arg3, String arg4, int arg5, Color arg6) {
        try {
            Graphics var7 = class370.field5611.getGraphics();
            if (class170.field2640 == null) {
                class170.field2640 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class466.field6952, class77.field1297);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg1 != 19) {
                method1050((byte) -105, (char) 65511);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class169.field2622 == null) {
                    class169.field2622 = class370.field5611.createImage(304, 34);
                }
                Graphics var8 = class169.field2622.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg5 * 3) + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class170.field2640);
                var8.setColor(arg2);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class169.field2622, class466.field6952 / 2 - 152, class77.field1297 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class466.field6952 / 2 - 152;
                int var10 = class77.field1297 / 2 - 18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class170.field2640);
                var7.setColor(arg2);
                var7.drawString(arg4, var9 + ((304 - (arg4.length() * 6)) / 2), var10 + 22);
            }
            if (class427.field6347 != null) {
                var7.setFont(class170.field2640);
                var7.setColor(arg2);
                var7.drawString(class427.field6347, class466.field6952 / 2 - (class427.field6347.length() * 6 / 2), class77.field1297 / 2 - 26);
            }
        } catch (Exception var12) {
            class370.field5611.repaint();
        }
        field2242++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 464)
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class98.field1633 != null) {
            class98.field1633[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class360.field5465 != null) {
            class360.field5465[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class407.field6111 != null) {
            class407.field6111[arg0][arg1] = (byte) arg4;
        }
    }
}
