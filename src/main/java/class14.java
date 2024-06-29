import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class14 extends class13 {

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    private int field275 = 4096;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    private int field283 = 0;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Lkn;")
    public static class442 field278 = new class442("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!l", name = "T", descriptor = "[I")
    public static int[] field285;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "[I")
    public static int[] field284;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Lnq;")
    public static class268 field282;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "[Lee;")
    public static class404[] field280;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "[[[I")
    public static int[][][] field279;

    static {
        new class442("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field285 = new int[] { 1, 2, 4, 8 };
        field284 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Color;ZILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V", line = 5)
    public static final void method228(Color arg0, boolean arg1, int arg2, Color arg3, String arg4, int arg5, Color arg6) {
        ++field270;
        try {
            Graphics var7 = class304.field4191.getGraphics();
            if (class247.field3476 == null) {
                class247.field3476 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class47.field661, class214.field2993);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class274.field3823 == null) {
                    class274.field3823 = class304.field4191.createImage(304, 34);
                }
                Graphics var8 = class274.field3823.getGraphics();
                var8.setColor(arg6);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(arg5, 1, 301, 31);
                var8.fillRect(arg2 * 3 + 2, 2, -(arg2 * 3) + 300, 30);
                var8.setFont(class247.field3476);
                var8.setColor(arg0);
                var8.drawString(arg4, (-(6 * arg4.length()) + 304) / 2, 22);
                var7.drawImage(class274.field3823, class47.field661 / 2 + -152, class214.field2993 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class47.field661 / 2 + -152;
                int var10 = class214.field2993 / 2 + -18;
                var7.setColor(arg6);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 - -2, var10 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg2 * 3 + var9 + 2, var10 + 2, -(arg2 * 3) + 300, 30);
                var7.setFont(class247.field3476);
                var7.setColor(arg0);
                var7.drawString(arg4, var9 - -((304 - 6 * arg4.length()) / 2), var10 + 22);
            }
            if (class242.field3438 != null) {
                var7.setFont(class247.field3476);
                var7.setColor(arg0);
                var7.drawString(class242.field3438, class47.field661 / 2 + -(6 * class242.field3438.length() / 2), class214.field2993 / 2 + -26);
            }
        } catch (Exception var12) {
            class304.field4191.repaint();
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 83)
    public class14() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lkh;BI)V", line = 87)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field281;
        if (arg1 < 50) {
            method228((Color) null, false, 41, (Color) null, (String) null, -2, (Color) null);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field259 = arg0.method172((byte) 52) == 1;
                }
            } else {
                this.field275 = arg0.method174(255);
            }
        } else {
            this.field283 = arg0.method174(255);
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V", line = 131)
    public static final void method229(byte arg0) {
        ++field272;
        for (int var1 = 0; var1 < class214.field2976; ++var1) {
            class29 var3 = class205.method1333(var1, -1);
            if (var3 != null && ~var3.field483 == -1) {
                class34.field532[var1] = 0;
                class297.field4156[var1] = 0;
            }
        }
        int var2 = -126 / ((arg0 - -42) / 52);
        class361.field4987 = new class129(128);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I", line = 157)
    public final int[][] method222(int arg0, int arg1) {
        ++field273;
        if (arg0 != -27832) {
            this.method31((class11) null, (byte) -91, -116);
        }
        int[][] var3 = super.field256.method1930(arg1, (byte) 104);
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class269.field3751; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field283 < ~var12) {
                    var8[var11] = this.field283;
                } else if (var12 > this.field275) {
                    var8[var11] = this.field275;
                } else {
                    var8[var11] = var12;
                }
                if (this.field283 <= var13) {
                    if (~this.field275 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field275;
                    }
                } else {
                    var9[var11] = this.field283;
                }
                if (var14 >= this.field283) {
                    if (var14 > this.field275) {
                        var10[var11] = this.field275;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field283;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 237)
    public static void method230(int arg0) {
        field284 = null;
        field278 = null;
        if (arg0 != 2) {
            field285 = null;
        }
        field285 = null;
        field279 = null;
        field282 = null;
        field280 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZZB)V", line = 254)
    public static final void method231(boolean arg0, boolean arg1, byte arg2) {
        if (arg1) {
            ++class120.field1689;
            class261.method1714(0);
        }
        ++field277;
        if (arg0) {
            ++class240.field3423;
            class307.method1975(6);
        }
        if (arg2 >= -2) {
            method232(60, 'G');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IC)B", line = 283)
    public static final byte method232(int arg0, char arg1) {
        if (arg0 != 21381) {
            return -104;
        } else {
            ++field276;
            byte var2;
            if ((arg1 <= 0 || ~arg1 <= -129) && (arg1 < 160 || ~arg1 < -256)) {
                if (~arg1 == -8365) {
                    var2 = -128;
                } else if (arg1 == 8218) {
                    var2 = -126;
                } else if (arg1 != 402) {
                    if (arg1 != 8222) {
                        if (arg1 == 8230) {
                            var2 = -123;
                        } else if (arg1 == 8224) {
                            var2 = -122;
                        } else if (arg1 != 8225) {
                            if (arg1 != 710) {
                                if (~arg1 != -8241) {
                                    if (~arg1 != -353) {
                                        if (~arg1 == -8250) {
                                            var2 = -117;
                                        } else if (~arg1 != -339) {
                                            if (arg1 != 381) {
                                                if (arg1 == 8216) {
                                                    var2 = -111;
                                                } else if (arg1 == 8217) {
                                                    var2 = -110;
                                                } else if (arg1 == 8220) {
                                                    var2 = -109;
                                                } else if (~arg1 == -8222) {
                                                    var2 = -108;
                                                } else if (arg1 != 8226) {
                                                    if (arg1 != 8211) {
                                                        if (~arg1 != -8213) {
                                                            if (~arg1 != -733) {
                                                                if (arg1 == 8482) {
                                                                    var2 = -103;
                                                                } else if (arg1 != 353) {
                                                                    if (arg1 == 8250) {
                                                                        var2 = -101;
                                                                    } else if (arg1 == 339) {
                                                                        var2 = -100;
                                                                    } else if (~arg1 != -383) {
                                                                        if (arg1 == 376) {
                                                                            var2 = -97;
                                                                        } else {
                                                                            var2 = 63;
                                                                        }
                                                                    } else {
                                                                        var2 = -98;
                                                                    }
                                                                } else {
                                                                    var2 = -102;
                                                                }
                                                            } else {
                                                                var2 = -104;
                                                            }
                                                        } else {
                                                            var2 = -105;
                                                        }
                                                    } else {
                                                        var2 = -106;
                                                    }
                                                } else {
                                                    var2 = -107;
                                                }
                                            } else {
                                                var2 = -114;
                                            }
                                        } else {
                                            var2 = -116;
                                        }
                                    } else {
                                        var2 = -118;
                                    }
                                } else {
                                    var2 = -119;
                                }
                            } else {
                                var2 = -120;
                            }
                        } else {
                            var2 = -121;
                        }
                    } else {
                        var2 = -124;
                    }
                } else {
                    var2 = -125;
                }
            } else {
                var2 = (byte) arg1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[I", line = 410)
    public final int[] method29(boolean arg0, int arg1) {
        ++field274;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int[] var4 = this.method223(0, -11541, arg1);
            for (int var5 = 0; var5 < class269.field3751; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field283) {
                    if (var6 > this.field275) {
                        var3[var5] = this.field275;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field283;
                }
            }
        }
        if (!arg0) {
            method229((byte) 2);
        }
        return var3;
    }
}
