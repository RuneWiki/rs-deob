import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class123 extends class493 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "Lat;")
    private class398 field1789 = new class398();

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "Lat;")
    private class398 field1790 = new class398();

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "[Z")
    private boolean[] field1791 = new boolean[112];

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1793 = new String[] { method1199(method1198(":8x\u001blc")), method1199(method1198("%.uY")), method1199(method1198(":8x\u001bK$8lFa$(m\u001d")), method1199(method1198("0u7\u001bP")), method1199(method1198(":8x\u001bdc")), method1199(method1198(":8x\u001bgc")), method1199(method1198(":8x\u001bfc")), method1199(method1198(":8x\u001bkc")), method1199(method1198(":8x\u001bjc")), method1199(method1198(":8x\u001bnc")), method1199(method1198(":8x\u001b\u0011\"5pA\u0013c")), method1199(method1198(":8x\u001bhc")), method1199(method1198(":8x\u001bic")), method1199(method1198(":8x\u001bF.\"KPA.:jPIc")), method1199(method1198(":8x\u001bec")), method1199(method1198(":8x\u001bF.\"ML].?1")), method1199(method1198(":8x\u001bac")), method1199(method1198(":8x\u001boc")), method1199(method1198(":8x\u001bF.\"IGH8(|Q\u0005")), method1199(method1198(":8x\u001bK$8lFj*2wPIc")) };

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field1774 = 0;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field1792;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V", line = 5)
    private final void method1186(KeyEvent arg0, int arg1, byte arg2) {
        try {
            field1775++;
            int var4 = arg0.getKeyCode();
            int var6;
            if (var4 == 0) {
                var6 = 0;
            } else if (var4 >= 0 && class156.field2162.length > var4) {
                int var5 = class156.field2162[var4];
                if (arg1 == 0 && (var5 & 0x80) != 0) {
                    var6 = 0;
                } else {
                    var6 = var5 & 0xFFFFFF7F;
                }
            } else {
                var6 = 0;
            }
            if (arg2 > -126) {
                this.method1189(94, -106);
            }
            if (var6 != 0) {
                this.method1187(arg1, '\u0000', var6, (byte) -109);
                arg0.consume();
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1793[12] + (arg0 == null ? field1793[1] : field1793[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ICIB)V", line = 42)
    private final void method1187(int arg0, char arg1, int arg2, byte arg3) {
        try {
            field1780++;
            class295 var5 = new class295();
            var5.field4812 = arg0;
            var5.field4802 = arg1;
            var5.field4811 = arg2;
            if (arg3 != -109) {
                field1774 = 114;
            }
            var5.field4803 = class712.method5167(arg3 ^ 0x971);
            this.field1790.method3220(var5, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1793[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)I", line = 59)
    private final int method1188(byte arg0) {
        try {
            if (arg0 < 32) {
                this.field1791 = null;
            }
            field1773++;
            int var2 = 0;
            if (this.field1791[81]) {
                var2 |= 0x1;
            }
            if (this.field1791[82]) {
                var2 |= 0x4;
            }
            if (this.field1791[86]) {
                var2 |= 0x2;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1793[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)Z", line = 85)
    public final boolean method1189(int arg0, int arg1) {
        try {
            field1785++;
            if (arg1 == 15708) {
                return arg0 >= 0 && arg0 < 112 ? this.field1791[arg0] : false;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1793[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "(I)V", line = 100)
    public static final void method1190(int arg0) {
        try {
            field1776++;
            int var1 = class6.field47 * 512 + 256;
            int var2 = class30.field323 * 512 + 256;
            int var3 = class207.method1873(var1, -10, class673.field9554, var2) - class351.field5678;
            if (class140.field1956 < 100) {
                if (class791.field11550 < var1) {
                    class791.field11550 += (var1 - class791.field11550) * class140.field1956 / 1000 + class687.field9930;
                    if (class791.field11550 > var1) {
                        class791.field11550 = var1;
                    }
                }
                if (class396.field6285 < var3) {
                    class396.field6285 += class687.field9930 + ((var3 - class396.field6285) * class140.field1956 / 1000);
                    if (class396.field6285 > var3) {
                        class396.field6285 = var3;
                    }
                }
                if (class791.field11550 > var1) {
                    class791.field11550 -= (class791.field11550 - var1) * class140.field1956 / 1000 + class687.field9930;
                    if (var1 > class791.field11550) {
                        class791.field11550 = var1;
                    }
                }
                if (class396.field6285 > var3) {
                    class396.field6285 -= (class396.field6285 - var3) * class140.field1956 / 1000 + class687.field9930;
                    if (var3 > class396.field6285) {
                        class396.field6285 = var3;
                    }
                }
                if (var2 > class133.field1896) {
                    class133.field1896 += (var2 - class133.field1896) * class140.field1956 / 1000 + class687.field9930;
                    if (var2 < class133.field1896) {
                        class133.field1896 = var2;
                    }
                }
                if (class133.field1896 > var2) {
                    class133.field1896 -= (class133.field1896 - var2) * class140.field1956 / 1000 + class687.field9930;
                    if (var2 > class133.field1896) {
                        class133.field1896 = var2;
                    }
                }
            } else {
                class133.field1896 = class30.field323 * 512 + 256;
                class791.field11550 = class6.field47 * 512 + 256;
                class396.field6285 = class207.method1873(class791.field11550, arg0 - 9, class673.field9554, class133.field1896) - class351.field5678;
            }
            int var4 = class133.field1899 * 512 + 256;
            int var5 = class307.field4978 * 512 + 256;
            int var6 = class207.method1873(var4, -10, class673.field9554, var5) - class75.field1095;
            int var7 = var4 - class791.field11550;
            int var8 = var6 - class396.field6285;
            int var9 = var5 - class133.field1896;
            int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
            int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
            int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
            if (var11 < 1024) {
                var11 = 1024;
            }
            if (var11 > 3072) {
                var11 = 3072;
            }
            if (class134.field1902 < var11) {
                class134.field1902 += (var11 - class134.field1902 >> 3) * class740.field10885 / 1000 + class445.field6925 << 3;
                if (var11 < class134.field1902) {
                    class134.field1902 = var11;
                }
            }
            if (class134.field1902 > var11) {
                class134.field1902 -= (class134.field1902 - var11 >> 3) * class740.field10885 / 1000 + class445.field6925 << 3;
                if (class134.field1902 < var11) {
                    class134.field1902 = var11;
                }
            }
            int var13 = var12 - class728.field10661;
            if (var13 > 8192) {
                var13 -= 16384;
            }
            if (var13 < -8192) {
                var13 += 16384;
            }
            int var14 = var13 >> 3;
            if (var14 > 0) {
                class728.field10661 += class740.field10885 * var14 / 1000 + class445.field6925 << 3;
                class728.field10661 &= 0x3FFF;
            }
            if (~var14 > arg0) {
                class728.field10661 -= -var14 * class740.field10885 / 1000 + class445.field6925 << 3;
                class728.field10661 &= 0x3FFF;
            }
            int var15 = var12 - class728.field10661;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (var15 < -8192) {
                var15 += 16384;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                class728.field10661 = var12;
            }
            class554.field8109 = 0;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field1793[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 255)
    public final synchronized void keyPressed(KeyEvent arg0) {
        try {
            field1781++;
            this.method1186(arg0, 0, (byte) -127);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[18] + (arg0 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 265)
    public final void focusGained(FocusEvent arg0) {
        try {
            field1771++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[19] + (arg0 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIILha;Lrfa;Lsg;)Z", line = 272)
    public static final boolean method1191(int arg0, int arg1, int arg2, class63 arg3, class209 arg4, class420 arg5) {
        try {
            field1779++;
            int var6 = Integer.MAX_VALUE;
            int var7 = Integer.MIN_VALUE;
            int var8 = Integer.MAX_VALUE;
            int var9 = Integer.MIN_VALUE;
            if (arg4.field3276 != null) {
                var8 = class770.field11288 - ((arg4.field3303 + arg5.field6630 - class770.field11283) * (class770.field11288 - class770.field11287) / (class770.field11285 - class770.field11283));
                var9 = class770.field11288 - ((arg4.field3268 + arg5.field6630 - class770.field11283) * (class770.field11288 - class770.field11287) / (class770.field11285 - class770.field11283));
                var7 = (arg4.field3307 + arg5.field6631 - class770.field11271) * (class770.field11274 - class770.field11273) / (class770.field11286 - class770.field11271) + class770.field11273;
                var6 = class770.field11273 + ((class770.field11274 - class770.field11273) * (arg4.field3308 + arg5.field6631 - class770.field11271) / (class770.field11286 - class770.field11271));
            }
            class107 var10 = null;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (arg4.field3279 != -1) {
                if (arg5.field6632 && arg4.field3269 != -1) {
                    var10 = arg4.method1890(true, 0, arg3);
                } else {
                    var10 = arg4.method1890(false, arg0 + 3073, arg3);
                }
                if (var10 != null) {
                    var11 = arg5.field6633 - (var10.method26() + 1 >> 1);
                    if (var6 > var11) {
                        var6 = var11;
                    }
                    var12 = arg5.field6633 + (var10.method26() + 1 >> 1);
                    if (var12 > var7) {
                        var7 = var12;
                    }
                    var13 = arg5.field6634 - (var10.method12() + 1 >> 1);
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    var14 = arg5.field6634 + (var10.method12() + 1 >> 1);
                    if (var9 < var14) {
                        var9 = var14;
                    }
                }
            }
            class205 var15 = null;
            if (arg0 != -3073) {
                return true;
            }
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            if (arg4.field3282 != null) {
                var15 = class497.method3758(arg4.field3297, true);
                if (var15 != null) {
                    var16 = class693.field9978.method507(class504.field7552, arg4.field3282, null, arg0 ^ 0xC7A, null);
                    int var24 = arg5.field6634 - ((class770.field11288 - class770.field11287) * arg4.field3304 / (class770.field11285 - class770.field11283));
                    var17 = arg5.field6633 + ((class770.field11274 - class770.field11273) * arg4.field3286 / (class770.field11286 - class770.field11271));
                    if (var10 == null) {
                        var18 = var24 - var15.method1849() * var16 / 2;
                    } else {
                        var18 = var24 - ((var10.method12() >> 1) + var15.method1851() * var16);
                    }
                    for (int var25 = 0; var25 < var16; var25++) {
                        String var26 = class504.field7552[var25];
                        if ((var16 - 1) > var25) {
                            var26 = var26.substring(0, var26.length() - 4);
                        }
                        int var27 = var15.method1852(var26);
                        if (var19 < var27) {
                            var19 = var27;
                        }
                    }
                    var20 = var17 + arg2 - (var19 / 2);
                    if (var6 > var20) {
                        var6 = var20;
                    }
                    var21 = var19 / 2 + var17 + arg2;
                    var22 = arg1 + var18;
                    if (var21 > var7) {
                        var7 = var21;
                    }
                    if (var8 > var22) {
                        var8 = var22;
                    }
                    var23 = arg1 + var18 + var16 * var15.method1851();
                    if (var9 < var23) {
                        var9 = var23;
                    }
                }
            }
            if (var7 < class770.field11273 || var6 > class770.field11274 || class770.field11287 > var9 || var8 > class770.field11288) {
                return true;
            }
            class770.method5550(arg3, arg5, arg4);
            if (var10 != null) {
                if (class750.field11052 > 0 && (class188.field2980 != -1 && class188.field2980 == arg5.field6636 || class581.field8367 != -1 && class581.field8367 == arg4.field3274)) {
                    int var28;
                    if (class153.field2137 > 50) {
                        var28 = 200 - (class153.field2137 * 2);
                    } else {
                        var28 = class153.field2137 * 2;
                    }
                    int var29 = var28 << 24 | 0xFFFF00;
                    arg3.method659(1, arg5.field6633, var29, var10.method7() / 2 + 7, arg5.field6634);
                    arg3.method659(1, arg5.field6633, var29, var10.method7() / 2 + 5, arg5.field6634);
                    arg3.method659(1, arg5.field6633, var29, var10.method7() / 2 + 3, arg5.field6634);
                    arg3.method659(1, arg5.field6633, var29, var10.method7() / 2 + 1, arg5.field6634);
                    arg3.method659(1, arg5.field6633, var29, var10.method7() / 2, arg5.field6634);
                }
                var10.method1001(arg5.field6633 - (var10.method26() >> 1), arg5.field6634 + -(var10.method12() >> 1));
            }
            if (arg4.field3282 != null && var15 != null) {
                class29.method291(arg4, var16, arg5, arg3, var15, var18, var17, false, var19);
            }
            if (arg4.field3279 != -1 || arg4.field3282 != null) {
                class388 var30 = new class388(arg5);
                var30.field6205 = var21;
                var30.field6197 = var11;
                var30.field6198 = var12;
                var30.field6194 = var20;
                var30.field6201 = var13;
                var30.field6206 = var22;
                var30.field6195 = var14;
                var30.field6202 = var23;
                class728.field10663.method3220(var30, 0);
            }
            return false;
        } catch (RuntimeException var32) {
            throw class590.method4333(var32, field1793[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1793[1] : field1793[3]) + ',' + (arg4 == null ? field1793[1] : field1793[3]) + ',' + (arg5 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 461)
    public final synchronized void focusLost(FocusEvent arg0) {
        try {
            field1787++;
            this.method1187(-1, '\u0000', 0, (byte) -109);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[2] + (arg0 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IC)C", line = 472)
    public static final char method1192(int arg0, char arg1) {
        try {
            field1778++;
            if (arg1 == 'Æ') {
                return 'E';
            } else if (arg1 == 'æ') {
                return 'e';
            } else {
                if (arg0 != 256) {
                    field1774 = -76;
                }
                if (arg1 == 'ß') {
                    return 's';
                } else if (arg1 == 'Œ') {
                    return 'E';
                } else {
                    return (char) (arg1 == 'œ' ? 'e' : '\u0000');
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)Lom;", line = 503)
    public final class394 method1193(int arg0) {
        try {
            field1784++;
            return arg0 == 6 ? (class394) this.field1789.method3219(-57) : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 518)
    public final synchronized void keyTyped(KeyEvent arg0) {
        try {
            field1782++;
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && class148.method1346(-17968, var2)) {
                this.method1187(3, var2, -1, (byte) -109);
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1793[15] + (arg0 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 532)
    public final synchronized void keyReleased(KeyEvent arg0) {
        try {
            this.method1186(arg0, 1, (byte) -128);
            field1788++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[13] + (arg0 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 540)
    private final void method1194(byte arg0, Component arg1) {
        try {
            this.method1196(2);
            field1777++;
            this.field1792 = arg1;
            Method var3 = class61.field813;
            if (var3 != null) {
                try {
                    var3.invoke(this.field1792, Boolean.FALSE);
                } catch (Throwable var5) {
                }
            }
            this.field1792.addKeyListener(this);
            this.field1792.addFocusListener(this);
            if (arg0 != 40) {
                this.method1196(42);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1793[8] + arg0 + ',' + (arg1 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 570)
    public final synchronized void method1195(int arg0) {
        try {
            this.field1789.method3224(false);
            field1772++;
            class295 var2 = (class295) this.field1790.method3219(-90);
            if (arg0 >= -5) {
                this.field1789 = null;
            }
            while (var2 != null) {
                var2.field4805 = this.method1188((byte) 48);
                if (var2.field4812 == 0) {
                    if (!this.field1791[var2.field4811]) {
                        class295 var3 = new class295();
                        var3.field4812 = 0;
                        var3.field4803 = var2.field4803;
                        var3.field4811 = var2.field4811;
                        var3.field4805 = var2.field4805;
                        var3.field4802 = '\u0000';
                        this.field1789.method3220(var3, 0);
                        this.field1791[var2.field4811] = true;
                    }
                    var2.field4812 = 2;
                    this.field1789.method3220(var2, 0);
                } else if (var2.field4812 == 1) {
                    if (this.field1791[var2.field4811]) {
                        this.field1789.method3220(var2, 0);
                        this.field1791[var2.field4811] = false;
                    }
                } else if (var2.field4812 == -1) {
                    for (int var4 = 0; var4 < 112; var4++) {
                        if (this.field1791[var4]) {
                            class295 var5 = new class295();
                            var5.field4802 = '\u0000';
                            var5.field4811 = var4;
                            var5.field4805 = var2.field4805;
                            var5.field4812 = 1;
                            var5.field4803 = var2.field4803;
                            this.field1789.method3220(var5, 0);
                            this.field1791[var4] = false;
                        }
                    }
                } else if (var2.field4812 == 3) {
                    this.field1789.method3220(var2, 0);
                }
                var2 = (class295) this.field1790.method3219(-66);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1793[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(I)V", line = 660)
    private final void method1196(int arg0) {
        try {
            field1786++;
            if (this.field1792 != null) {
                this.field1792.removeKeyListener(this);
                this.field1792.removeFocusListener(this);
                this.field1792 = null;
                for (int var2 = 0; var2 < 112; var2++) {
                    this.field1791[var2] = false;
                }
                if (arg0 != 2) {
                    this.keyPressed(null);
                }
                this.field1789.method3224(false);
                this.field1790.method3224(false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1793[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)V", line = 692)
    public final void method1197(int arg0) {
        try {
            this.method1196(2);
            if (arg0 != 1000) {
                this.field1792 = null;
            }
            field1783++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 716)
    public class123(Component arg0) {
        try {
            class335.method2824((byte) 60);
            this.method1194((byte) 40, arg0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1793[10] + (arg0 == null ? field1793[1] : field1793[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1198(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1199(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
