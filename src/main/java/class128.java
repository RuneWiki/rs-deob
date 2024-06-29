import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class128 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    public static boolean field2040 = true;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lqd;")
    public static class44 field2045;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lja;")
    public static class64 field2041;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lja;")
    public static class64 field2047;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[[I")
    public static int[][] field2046;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 6)
    public static void method958(int arg0) {
        field2041 = null;
        field2047 = null;
        field2045 = null;
        field2046 = (int[][]) null;
        if (arg0 >= -47) {
            method961(-7, 114, -43, 109, 95);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I", line = 19)
    public static final int method959(byte arg0) {
        field2039++;
        try {
            if (class285.field4383 == 0) {
                if (class23.field398 > class154.method1172((byte) 123) - 5000L) {
                    return 0;
                }
                class178.field2785 = class83.field1235.method2224(class56.field891, class310.field4878, -61);
                class311.field4887 = class154.method1172((byte) 110);
                class285.field4383 = 1;
            }
            if (class311.field4887 + 30000L < class154.method1172((byte) 102)) {
                return class233.method1681(1000, (byte) -127);
            }
            if (class285.field4383 == 1) {
                if (class178.field2785.field387 == 2) {
                    return class233.method1681(1001, (byte) -114);
                }
                if (class178.field2785.field387 != 1) {
                    return -1;
                }
                int var1 = 0;
                class127.field2032 = new class16((Socket) class178.field2785.field391, class83.field1235);
                class269.field4191.field1667 = 0;
                if (class196.field3123) {
                    var1 = field2044;
                }
                class178.field2785 = null;
                class269.field4191.method772((byte) -98, 23);
                class269.field4191.method784(-57, var1);
                class127.field2032.method136(class269.field4191.field1667, class269.field4191.field1661, (byte) -4, 0);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                int var2 = class127.field2032.method138(-5380);
                if (class213.field3400 != null) {
                    class213.field3400.method105(1);
                }
                if (class243.field3763 != null) {
                    class243.field3763.method105(1);
                }
                if (var2 != 0) {
                    return class233.method1681(var2, (byte) -108);
                }
                class285.field4383 = 2;
            }
            if (class285.field4383 == 2) {
                if (class127.field2032.method137((byte) 80) < 2) {
                    return -1;
                }
                class229.field3647 = class127.field2032.method138(-5380);
                class229.field3647 <<= 0x8;
                class229.field3647 += class127.field2032.method138(-5380);
                class169.field2633 = 0;
                class285.field4383 = 3;
                class109.field1811 = new byte[class229.field3647];
            }
            if (class285.field4383 == 3) {
                int var3 = class127.field2032.method137((byte) 63);
                if (var3 >= 1) {
                    if ((class229.field3647 - class169.field2633) < var3) {
                        var3 = class229.field3647 - class169.field2633;
                    }
                    class127.field2032.method139(class109.field1811, -3, var3, class169.field2633);
                    class169.field2633 += var3;
                    if (class229.field3647 <= class169.field2633) {
                        if (!class17.method143((byte) 100, class109.field1811)) {
                            return class233.method1681(1002, (byte) -100);
                        }
                        class13.field248 = new class120[class239.field3724];
                        int var4 = 0;
                        for (int var5 = class298.field4709; var5 <= class34.field564; var5++) {
                            class120 var6 = class183.method1379(-106, var5);
                            if (var6 != null) {
                                class13.field248[var4++] = var6;
                            }
                        }
                        class127.field2032.method131(-11918);
                        class285.field4383 = 0;
                        class127.field2032 = null;
                        class206.field3256 = 0;
                        class109.field1811 = null;
                        class23.field398 = class154.method1172((byte) 81);
                        return 0;
                    }
                    return -1;
                }
                return -1;
            }
        } catch (IOException var8) {
            return class233.method1681(1003, (byte) -122);
        }
        if (arg0 >= -59) {
            field2044 = 85;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIILdg;IZJ)Z", line = 152)
    public static final boolean method960(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class320 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class29.field475 == class150.field2404;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class323.field5009 || var16 >= class196.field3122) {
                    return false;
                }
                class272 var17 = class60.field946[arg0][var15][var16];
                if (var17 != null && var17.field4220 >= 5) {
                    return false;
                }
            }
        }
        class45 var18 = new class45();
        var18.field776 = arg11;
        var18.field774 = arg0;
        var18.field775 = arg5;
        var18.field771 = arg6;
        var18.field773 = arg7;
        var18.field782 = arg8;
        var18.field783 = arg9;
        var18.field770 = arg1;
        var18.field772 = arg2;
        var18.field785 = arg1 + arg3 - 1;
        var18.field784 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class60.field946[var22][var19][var20] == null) {
                        class60.field946[var22][var19][var20] = new class272(var22, var19, var20);
                    }
                }
                class272 var23 = class60.field946[arg0][var19][var20];
                var23.field4217[var23.field4220] = var18;
                var23.field4228[var23.field4220] = var21;
                var23.field4229 |= var21;
                var23.field4220++;
                if (var13 && field2046[var19][var20] != 0) {
                    var14 = field2046[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (field2046[var24][var25] == 0) {
                        field2046[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class63.field979[class104.field1764++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 277)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2050++;
        if (class302.field4752 == null) {
            return;
        }
        class27.field446 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class260.field4041.length > var2) {
            var3 = class260.field4041[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class206.field3263 >= 0 && var3 >= 0) {
            class317.field4936[class206.field3263] = var3;
            class206.field3263 = class206.field3263 + 1 & 0x7F;
            if (class206.field3263 == class147.field2374) {
                class206.field3263 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class242.field3751 + 1 & 0x7F;
            if (class61.field954 != var4) {
                class77.field1182[class242.field3751] = var3;
                class118.field1902[class242.field3751] = '\u0000';
                class242.field3751 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V", line = 333)
    public static final void method961(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2036++;
        if (class78.field1183 < 100) {
            class211.method1533(arg3 ^ 0xFFFFA077);
        }
        if (class265.field4126) {
            class262.method1865(arg0, arg1, arg0 + arg4, arg1 + arg2);
        } else {
            class182.method1358(arg0, arg1, arg0 + arg4, arg1 + arg2);
        }
        if (class78.field1183 < 100) {
            int var14 = arg4 / 2 + arg0;
            byte var15 = 20;
            int var16 = arg2 / 2 + arg1 - var15 - 18;
            if (class265.field4126) {
                class262.method1855(arg0, arg1, arg4, arg2, 0);
                class262.method1854(var14 - 152, var16, 304, 34, 9179409);
                class262.method1854(var14 - 151, var16 - -1, 302, 32, 0);
                class262.method1855(var14 - 150, var16 - -2, class78.field1183 * 3, 30, 9179409);
                class262.method1855(var14 + (class78.field1183 * 3) - 150, var16 + 2, 300 - class78.field1183 * 3, 30, 0);
            } else {
                class182.method1360(arg0, arg1, arg4, arg2, 0);
                class182.method1364(var14 - 152, var16, 304, 34, 9179409);
                class182.method1364(var14 - 151, var16 + 1, 302, 32, 0);
                class182.method1360(var14 - 150, var16 - -2, class78.field1183 * 3, 30, 9179409);
                class182.method1360(var14 + (class78.field1183 * 3) - 150, var16 + 2, 300 - (class78.field1183 * 3), 30, 0);
            }
            class95.field1558.method1023(class151.field2422, var14, var16 + var15, 16777215, -1);
            return;
        }
        class277.field4286 = class95.field1565 - ((int) ((float) arg2 / class101.field1719));
        if (arg3 != 15008) {
            return;
        }
        class317.field4939 = (int) ((float) (arg2 * 2) / class101.field1719);
        class137.field2182 = class40.field725 - (int) ((float) arg4 / class101.field1719);
        class222.field3553 = (int) ((float) (arg4 * 2) / class101.field1719);
        int var5 = class40.field725 - (int) ((float) arg4 / class101.field1719);
        int var6 = class95.field1565 - ((int) ((float) arg2 / class101.field1719));
        int var7 = (int) ((float) arg4 / class101.field1719) + class40.field725;
        int var8 = (int) ((float) arg2 / class101.field1719) + class95.field1565;
        if (class265.field4126) {
            if (class89.field1418 == null || class89.field1418.field2007 != arg4 || class89.field1418.field2011 != arg2) {
                class89.field1418 = null;
                class89.field1418 = new class7(arg4, arg2);
            }
            class182.method1371(class89.field1418.field117, arg4, arg2);
            class196.method1432(arg2, var8, var5, var7, 0, arg4, 0, 14152, var6);
            class63.method450(0, var7, arg2, arg4, (byte) 127, 0, var8, var5, var6);
            class245.method1741(var7, (byte) -109, arg4, arg2, 0, 0, var5, var8, var6);
            class262.method1866(class89.field1418.field117, arg0, arg1, arg4, arg2);
            class182.field2913 = null;
        } else {
            class196.method1432(arg1 + arg2, var8, var5, var7, arg1, arg0 + arg4, arg0, arg3 - 856, var6);
            class63.method450(arg0, var7, arg1 + arg2, arg0 - -arg4, (byte) 94, arg1, var8, var5, var6);
            class245.method1741(var7, (byte) -113, arg0 + arg4, arg1 + arg2, arg1, arg0, var5, var8, var6);
        }
        if (class83.field1238 > 0) {
            class87.field1328--;
            if (class87.field1328 == 0) {
                class83.field1238--;
                class87.field1328 = 20;
            }
        }
        if (!class4.field28) {
            return;
        }
        int var9 = arg4 + arg0 - 5;
        int var10 = arg1 + arg2 - 8;
        class64.field1021.method1031("Fps:" + class50.field807, var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = 16776960;
        int var13 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var12 = 16711680;
        }
        class64.field1021.method1031("Mem:" + var13 + "k", var9, var17, var12, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!oe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 448)
    public final void focusGained(FocusEvent arg0) {
        field2042++;
    }

    @OriginalMember(owner = "client!oe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 468)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2038++;
        if (class302.field4752 != null) {
            class206.field3263 = -1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 490)
    public static final void method962(int arg0) {
        field2037++;
        int var1 = class168.field2614 * 128 + 64;
        int var2 = class122.field1947 * 128 + 64;
        int var3 = class48.method374(var2, var1, 125, class41.field734) - class24.field406;
        if (class190.field3033 >= 100) {
            class140.field2223 = class168.field2614 * 128 + 64;
            class312.field4904 = class122.field1947 * 128 + 64;
            class48.field801 = class48.method374(class312.field4904, class140.field2223, 115, class41.field734) - class24.field406;
        } else {
            if (var2 > class312.field4904) {
                class312.field4904 += (var2 - class312.field4904) * class190.field3033 / 1000 + class311.field4890;
                if (var2 < class312.field4904) {
                    class312.field4904 = var2;
                }
            }
            if (var3 > class48.field801) {
                class48.field801 += (var3 - class48.field801) * class190.field3033 / 1000 + class311.field4890;
                if (class48.field801 > var3) {
                    class48.field801 = var3;
                }
            }
            if (class140.field2223 < var1) {
                class140.field2223 += class311.field4890 + ((var1 - class140.field2223) * class190.field3033 / 1000);
                if (var1 < class140.field2223) {
                    class140.field2223 = var1;
                }
            }
            if (var1 < class140.field2223) {
                class140.field2223 -= (class140.field2223 - var1) * class190.field3033 / 1000 + class311.field4890;
                if (class140.field2223 < var1) {
                    class140.field2223 = var1;
                }
            }
            if (var2 < class312.field4904) {
                class312.field4904 -= (class312.field4904 - var2) * class190.field3033 / 1000 + class311.field4890;
                if (var2 > class312.field4904) {
                    class312.field4904 = var2;
                }
            }
            if (class48.field801 > var3) {
                class48.field801 -= (class48.field801 - var3) * class190.field3033 / 1000 + class311.field4890;
                if (class48.field801 < var3) {
                    class48.field801 = var3;
                }
            }
        }
        int var4 = class23.field404 * 128 + 64;
        int var5 = class292.field4450 * 128 + 64;
        if (arg0 != 2) {
            field2040 = true;
        }
        int var6 = class48.method374(var4, var5, 122, class41.field734) - class137.field2176;
        int var7 = var4 - class312.field4904;
        int var8 = var5 - class140.field2223;
        int var9 = var6 - class48.field801;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var7) * -325.949D) & 0x7FF;
        if (var11 > class181.field2891) {
            class181.field2891 += (var11 - class181.field2891) * class11.field187 / 1000 + class250.field3861;
            if (var11 < class181.field2891) {
                class181.field2891 = var11;
            }
        }
        if (class181.field2891 > var11) {
            class181.field2891 -= class250.field3861 + ((class181.field2891 - var11) * class11.field187 / 1000);
            if (class181.field2891 < var11) {
                class181.field2891 = var11;
            }
        }
        int var13 = var12 - class103.field1746;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class103.field1746 += class11.field187 * var13 / 1000 + class250.field3861;
            class103.field1746 &= 0x7FF;
        }
        if (var13 < 0) {
            class103.field1746 -= -var13 * class11.field187 / 1000 + class250.field3861;
            class103.field1746 &= 0x7FF;
        }
        int var14 = var12 - class103.field1746;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class103.field1746 = var12;
        }
    }

    @OriginalMember(owner = "client!oe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 643)
    public final void keyTyped(KeyEvent arg0) {
        if (class302.field4752 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class8.method66(var2, false)) {
                int var3 = class242.field3751 + 1 & 0x7F;
                if (class61.field954 != var3) {
                    class77.field1182[class242.field3751] = -1;
                    class118.field1902[class242.field3751] = var2;
                    class242.field3751 = var3;
                }
            }
        }
        field2049++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!oe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 673)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class302.field4752 != null) {
            class27.field446 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class260.field4041.length) {
                var3 = class260.field4041[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class206.field3263 >= 0 && var3 >= 0) {
                class317.field4936[class206.field3263] = ~var3;
                class206.field3263 = class206.field3263 + 1 & 0x7F;
                if (class206.field3263 == class147.field2374) {
                    class206.field3263 = -1;
                }
            }
        }
        field2048++;
        arg0.consume();
    }
}
