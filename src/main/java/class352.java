import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class352 extends class252 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[Z")
    private boolean[] field5096 = new boolean[112];

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field5093 = 0;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lcb;")
    public static class304 field5114;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "F")
    public static float field5115;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lua;")
    private class399 field5092;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lua;")
    private class399 field5103;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lua;")
    private class399 field5108;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field5091;

    static {
        new class349("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field5114 = new class304(5000);
        field5117 = -1;
    }

    @OriginalMember(owner = "client!ia", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 7)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5102++;
        char var2 = arg0.getKeyChar();
        if (var2 == '\u0000') {
            var2 = '\u0000';
        }
        if (var2 > '\u0000' && class398.method2498(0, var2)) {
            this.method2301((byte) 55, var2, 2, -1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 27)
    public static void method2298(int arg0) {
        if (arg0 == 0) {
            field5114 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V", line = 37)
    public static final void method2299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5106++;
        if (arg4 < arg1) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class440.field6288[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class440.field6288[var6][arg0] = arg2;
            }
        }
        if (arg3 != 2) {
            field5116 = 86;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 73)
    private final void method2300(Component arg0, int arg1) {
        this.method2307((byte) 127);
        field5098++;
        this.field5091 = arg0;
        Method var3 = class219.field3156;
        if (var3 != null) {
            try {
                var3.invoke(this.field5091, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field5091.addKeyListener(this);
        if (arg1 == 4) {
            this.field5091.addFocusListener(this);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 100)
    public final void method1756(int arg0) {
        field5094++;
        if (arg0 != 4096) {
            method2306(-21, 32);
        }
        this.method2307((byte) 122);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BCII)V", line = 112)
    private final void method2301(byte arg0, char arg1, int arg2, int arg3) {
        field5107++;
        class399 var5 = new class399();
        if (arg0 != 55) {
            method2299(120, 103, -4, 90, 65);
        }
        var5.field5608 = arg2;
        var5.field5606 = arg3;
        var5.field5614 = arg1;
        var5.field5603 = class18.method107(-16145);
        if (this.field5108 == null) {
            this.field5092 = var5;
        } else {
            this.field5108.field5605 = var5;
        }
        this.field5108 = var5;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 137)
    public final synchronized void method1753(int arg0) {
        field5110++;
        for (class399 var2 = this.field5092; var2 != null; var2 = var2.field5605) {
            if (var2.field5608 == 0) {
                if (var2.field5606 >= 0) {
                    var2.field5610 = !this.field5096[var2.field5606];
                }
                this.field5096[var2.field5606] = true;
            } else if (var2.field5608 == 1) {
                this.field5096[var2.field5606] = false;
            } else if (var2.field5608 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field5096[var3] = false;
                }
            }
        }
        this.field5103 = this.field5092;
        this.field5092 = null;
        if (arg0 != -501) {
            method2306(-54, -99);
        }
        this.field5108 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V", line = 191)
    public static final void method2302(boolean arg0, int arg1) {
        field5100++;
        if (class306.field4456 == arg0) {
            return;
        }
        class306.field4456 = arg0;
        if (arg1 >= -89) {
            field5115 = -0.8562404F;
        }
        class228.method1590(4096);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)Lpk;", line = 213)
    public final class109 method1757(int arg0) {
        field5101++;
        if (arg0 != -1) {
            return null;
        }
        class399 var2;
        for (var2 = this.field5103; var2 != null && var2.field5608 == -1; var2 = var2.field5605) {
        }
        if (var2 == null) {
            this.field5103 = null;
        } else {
            this.field5103 = var2.field5605;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 241)
    private final void method2303(KeyEvent arg0, int arg1, int arg2) {
        if (arg2 != -11080) {
            method2305((class390) null, (class74) null);
        }
        field5112++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class182.field2582.length) {
            int var6 = class182.field2582[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 > 0) {
            this.method2301((byte) 55, '\u0000', arg1, var5);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[[[Lls;IIZ)Z", line = 275)
    public static final boolean method2304(int arg0, int arg1, class74[][][] arg2, int arg3, int arg4, boolean arg5) {
        field5111++;
        byte var6 = arg5 ? 1 : (byte) (class265.field3897 & 0xFF);
        if (class32.field398[class158.field2302][arg1][arg3] == var6) {
            return false;
        } else if ((class320.field4692[class158.field2302][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class432.field6183[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class403.field5656[var7] = arg3;
            class32.field398[class158.field2302][arg1][arg3] = var6;
            while (var35 != var8) {
                int var9 = class432.field6183[var8] & 0xFFFF;
                int var10 = class432.field6183[var8] >> 16 & 0xFF;
                int var11 = class432.field6183[var8] >> 24 & 0xFF;
                int var12 = class403.field5656[var8] & 0xFFFF;
                int var13 = class403.field5656[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class320.field4692[class158.field2302][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class158.field2302 + 1; var16 <= 3; var16++) {
                    if ((class320.field4692[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field975 != null) {
                                int var20 = class309.method2073(var10, (byte) -113);
                                if (arg2[var16][var9][var12].field975.field1628 == var20 || arg2[var16][var9][var12].field977 != null && arg2[var16][var9][var12].field977.field1628 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class309.method2073(var11, (byte) -32);
                                    if (arg2[var16][var9][var12].field975.field1628 == var21 || arg2[var16][var9][var12].field977 != null && arg2[var16][var9][var12].field977.field1628 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class309.method2073(var13, (byte) -63);
                                    if (arg2[var16][var9][var12].field975.field1628 == var22 || arg2[var16][var9][var12].field977 != null && arg2[var16][var9][var12].field977.field1628 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class74 var23 = arg2[var16][var9][var12];
                            if (var23.field970 != null) {
                                for (class353 var24 = var23.field970; var24 != null; var24 = var24.field5127) {
                                    class306 var25 = var24.field5125;
                                    if (var25 instanceof class143) {
                                        class143 var26 = (class143) var25;
                                        int var27 = var26.method602((byte) -100);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method603((byte) -62);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class74 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field970 != null) {
                            for (class353 var31 = var30.field970; var31 != null; var31 = var31.field5127) {
                                class306 var32 = var31.field5125;
                                if (var32.field4465 != var32.field4460 || var32.field4471 != var32.field4462) {
                                    for (int var33 = var32.field4465; var33 <= var32.field4460; var33++) {
                                        for (int var34 = var32.field4462; var34 <= var32.field4471; var34++) {
                                            class32.field398[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class32.field398[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class439.field6280[class158.field2302 + 1].method359(var9, var12);
                    if (var17 > class370.field5263[arg4]) {
                        class370.field5263[arg4] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class147.field2189[arg4]) {
                        class147.field2189[arg4] = var18;
                    } else if (class327.field4744[arg4] < var18) {
                        class327.field4744[arg4] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class59.field794[arg4]) {
                        class59.field794[arg4] = var19;
                    } else if (class357.field5168[arg4] < var19) {
                        class357.field5168[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class32.field398[class158.field2302][var9 - 1][var12] != var6) {
                        class432.field6183[var35] = class332.method2176(class332.method2176(1179648, var9 - 1), -754974720);
                        class403.field5656[var35] = class332.method2176(var12, 1245184);
                        class32.field398[class158.field2302][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    int var10000 = ~class381.field5414;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class32.field398[class158.field2302][var9 - 1][var12] != var6 && (class320.field4692[class158.field2302][var9][var12] & 0x4) == 0 && (class320.field4692[class158.field2302][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class432.field6183[var35] = class332.method2176(class332.method2176(1179648, var9 - 1), 1375731712);
                            class403.field5656[var35] = class332.method2176(1245184, var12);
                            class32.field398[class158.field2302][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class32.field398[class158.field2302][var9][var12] != var6) {
                            class432.field6183[var35] = class332.method2176(318767104, class332.method2176(5373952, var9));
                            class403.field5656[var35] = class332.method2176(var12, 5439488);
                            class32.field398[class158.field2302][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class80.field1034 > (var9 + 1) && class32.field398[class158.field2302][var9 + 1][var12] != var6 && (class320.field4692[class158.field2302][var9][var12] & 0x4) == 0 && (class320.field4692[class158.field2302][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class432.field6183[var35] = class332.method2176(-1845493760, class332.method2176(var9 + 1, 5373952));
                            class403.field5656[var35] = class332.method2176(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class32.field398[class158.field2302][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class80.field1034 && class32.field398[class158.field2302][var9 + 1][var12] != var6) {
                        class432.field6183[var35] = class332.method2176(class332.method2176(9568256, var9 + 1), 1392508928);
                        class403.field5656[var35] = class332.method2176(var12, 9633792);
                        class32.field398[class158.field2302][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class32.field398[class158.field2302][var9 - 1][var12] != var6 && (class320.field4692[class158.field2302][var9][var12] & 0x4) == 0 && (class320.field4692[class158.field2302][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class432.field6183[var35] = class332.method2176(301989888, class332.method2176(var9 - 1, 13762560));
                            class403.field5656[var35] = class332.method2176(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class32.field398[class158.field2302][var9 - 1][var12] = var6;
                        }
                        if (class32.field398[class158.field2302][var9][var12] != var6) {
                            class432.field6183[var35] = class332.method2176(class332.method2176(var9, 13762560), -1828716544);
                            class403.field5656[var35] = class332.method2176(13828096, var12);
                            class32.field398[class158.field2302][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class80.field1034 > var9 + 1 && class32.field398[class158.field2302][var9 + 1][var12] != var6 && (class320.field4692[class158.field2302][var9][var12] & 0x4) == 0 && (class320.field4692[class158.field2302][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class432.field6183[var35] = class332.method2176(class332.method2176(var9 + 1, 9568256), -771751936);
                            class403.field5656[var35] = class332.method2176(var12, 9633792);
                            class32.field398[class158.field2302][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg0 != 4095) {
                field5116 = 2;
            }
            if (class370.field5263[arg4] != -1000000) {
                class370.field5263[arg4] += 10;
                class147.field2189[arg4] -= 50;
                class327.field4744[arg4] += 50;
                class357.field5168[arg4] += 50;
                class59.field794[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 594)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5113++;
        this.method2303(arg0, 0, -11080);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpl;Lls;)V", line = 602)
    public static final void method2305(class390 arg0, class74 arg1) {
        if (!arg1.field962) {
            return;
        }
        short var2 = arg1.field966;
        short var3 = arg1.field960;
        byte var4 = arg1.field958;
        byte var5 = arg1.field961;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class74[][] var8 = class385.field5449[var4];
        float var10;
        if (class439.field6280 == class241.field3567) {
            int var9 = class25.field314[var2][var3];
            class294.field4251.method893(class126.field1734[0].method360(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class294.field4251.method956(3000.0F, var10 * 1.5F);
        if (arg1.field972) {
            if (class429.field6099) {
                if (var4 > 0) {
                    class74 var11 = class385.field5449[var4 - 1][var2][var3];
                    if (var11 != null && var11.field962) {
                        return;
                    }
                }
                if (var2 <= class65.field891 && var2 > class25.field308) {
                    class74 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field962 && (var12.field972 || (arg1.field956 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class65.field891 && var2 < class183.field2589 - 1) {
                    class74 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field962 && (var13.field972 || (arg1.field956 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class333.field4842 && var3 > class28.field353) {
                    class74 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field962 && (var14.field972 || (arg1.field956 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class333.field4842 && var3 < class441.field6306 - 1) {
                    class74 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field962 && (var15.field972 || (arg1.field956 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class429.field6099 = true;
            }
            arg1.field972 = false;
            if (arg1.field963 != null) {
                class74 var16 = arg1.field963;
                class294.field4251.method956(3000.0F, (201.5F - (float) (var16.field961 + 1) * 50.0F) * 1.5F);
                if (!class254.method1764(var16.field961, var2, var3)) {
                    class439.field6280[var16.field961].method363(var2, var3);
                }
                class120 var17 = var16.field975;
                if (var17 != null) {
                    if (class369.field5257) {
                        if ((var17.field1628 & arg1.field971) == 0) {
                            class224.method1574(arg0, var4, var2, var3);
                        } else {
                            class191.method1381(arg0, var17.field1628, var5, var2, var3);
                        }
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    var17.method15((byte) -106, class294.field4251);
                }
                for (class353 var18 = var16.field970; var18 != null; var18 = var18.field5127) {
                    class306 var19 = var18.field5125;
                    if (var19 != null) {
                        if (class369.field5257) {
                            class224.method1574(arg0, var4, var2, var3);
                            class294.field4251.method945(arg0.field5481, arg0.field5487);
                        }
                        var19.method15((byte) 109, class294.field4251);
                    }
                }
                class294.field4251.method956(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class254.method1764(var5, var2, var3);
            if (var20) {
                class439.field6280[var5].method363(var2, var3);
                class16 var21 = arg1.field969;
                if (var21 != null && var21.field239) {
                    if (var21.field245) {
                        class294.field4251.method956(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var22 = var21.method15((byte) 115, class294.field4251);
                    if (var22 != null) {
                        var22.field4636 = var21;
                        var22.field4640 = var4;
                        var22.field4629 = var2;
                        var22.field4630 = var3;
                        class147.field2188.method1076(121, var22);
                    }
                    if (var21.field245) {
                        class294.field4251.method956(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class120 var25 = arg1.field975;
            class441 var26 = arg1.field967;
            if (var25 != null || var26 != null) {
                if (class65.field891 == var2) {
                    var23++;
                } else if (class65.field891 < var2) {
                    var23 += 2;
                }
                if (class333.field4842 == var3) {
                    var23 += 3;
                } else if (class333.field4842 > var3) {
                    var23 += 6;
                }
                var24 = class282.field4057[var23];
                arg1.field971 = class235.field3463[var23];
            }
            if (var25 != null) {
                if ((var25.field1628 & class31.field381[var23]) == 0) {
                    arg1.field959 = 0;
                } else if (var25.field1628 == 16) {
                    arg1.field959 = 3;
                    arg1.field974 = class238.field3522[var23];
                    arg1.field964 = (byte) (3 - arg1.field974);
                } else if (var25.field1628 == 32) {
                    arg1.field959 = 6;
                    arg1.field974 = class289.field4203[var23];
                    arg1.field964 = (byte) (6 - arg1.field974);
                } else if (var25.field1628 == 64) {
                    arg1.field959 = 12;
                    arg1.field974 = class327.field4739[var23];
                    arg1.field964 = (byte) (12 - arg1.field974);
                } else {
                    arg1.field959 = 9;
                    arg1.field974 = class113.field1449[var23];
                    arg1.field964 = (byte) (9 - arg1.field974);
                }
                if ((var25.field1628 & var24) != 0 && !class117.method717(var5, var2, var3, var25.field1628)) {
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var27 = var25.method15((byte) 62, class294.field4251);
                    if (var27 != null) {
                        var27.field4636 = var25;
                        var27.field4640 = var4;
                        var27.field4629 = var2;
                        var27.field4630 = var3;
                        class147.field2188.method1076(117, var27);
                    }
                }
                class120 var28 = arg1.field977;
                if (var28 != null && (var28.field1628 & var24) != 0 && !class117.method717(var5, var2, var3, var28.field1628)) {
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var29 = var28.method15((byte) 73, class294.field4251);
                    if (var29 != null) {
                        var29.field4636 = var28;
                        var29.field4640 = var4;
                        var29.field4629 = var2;
                        var29.field4630 = var3;
                        class147.field2188.method1076(120, var29);
                    }
                }
            }
            if (var26 != null && !class247.method1728(var5, var2, var3, var26.method1766((byte) 50))) {
                class441 var30 = arg1.field976;
                class294.field4251.method956(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field6307 & var24) != 0) {
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var31 = var26.method15((byte) -80, class294.field4251);
                    if (var31 != null) {
                        var31.field4636 = var26;
                        var31.field4640 = var4;
                        var31.field4629 = var2;
                        var31.field4630 = var3;
                        class147.field2188.method1076(119, var31);
                    }
                } else if (var26.field6307 == 256) {
                    int var32 = var26.field6309 - class72.field940;
                    int var33 = var26.field6303 - class265.field3899;
                    int var34 = var26.field6302;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    if (var36 < var35) {
                        class316 var37 = var26.method15((byte) 109, class294.field4251);
                        if (var37 != null) {
                            var37.field4636 = var26;
                            var37.field4640 = var4;
                            var37.field4629 = var2;
                            var37.field4630 = var3;
                            class147.field2188.method1076(126, var37);
                        }
                    } else if (var30 != null) {
                        class316 var38 = var30.method15((byte) -121, class294.field4251);
                        if (var38 != null) {
                            var38.field4636 = var30;
                            var38.field4640 = var4;
                            var38.field4629 = var2;
                            var38.field4630 = var3;
                            class147.field2188.method1076(121, var38);
                        }
                    }
                }
                class294.field4251.method956(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class16 var39 = arg1.field969;
                if (var39 != null && !var39.field239) {
                    if (var39.field245) {
                        class294.field4251.method956(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var40 = var39.method15((byte) 80, class294.field4251);
                    if (var40 != null) {
                        var40.field4636 = var39;
                        var40.field4640 = var4;
                        var40.field4629 = var2;
                        var40.field4630 = var3;
                        class147.field2188.method1076(124, var40);
                    }
                    if (var39.field245) {
                        class294.field4251.method956(3000.0F, var10 * 1.5F);
                    }
                }
                class147 var41 = arg1.field968;
                if (var41 != null && !var41.field2192) {
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var42 = var41.method15((byte) 43, class294.field4251);
                    if (var42 != null) {
                        var42.field4636 = var41;
                        var42.field4640 = var4;
                        var42.field4629 = var2;
                        var42.field4630 = var3;
                        class147.field2188.method1076(126, var42);
                    }
                }
            }
            byte var43 = arg1.field956;
            if (var43 != 0) {
                if (var2 < class65.field891 && (var43 & 0x4) != 0) {
                    class74 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field962) {
                        class312.field4615.method1912(var44, false);
                    }
                }
                if (var3 < class333.field4842 && (var43 & 0x2) != 0) {
                    class74 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field962) {
                        class312.field4615.method1912(var45, false);
                    }
                }
                if (var2 > class65.field891 && (var43 & 0x1) != 0) {
                    class74 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field962) {
                        class312.field4615.method1912(var46, false);
                    }
                }
                if (var3 > class333.field4842 && (var43 & 0x8) != 0) {
                    class74 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field962) {
                        class312.field4615.method1912(var47, false);
                    }
                }
            }
        }
        if (arg1.field959 != 0) {
            boolean var48 = true;
            for (class353 var49 = arg1.field970; var49 != null; var49 = var49.field5127) {
                if (class239.field3528 != var49.field5125.field4458 && (var49.field5119 & arg1.field959) == arg1.field974) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class120 var50 = arg1.field975;
                if (!class117.method717(var5, var2, var3, var50.field1628)) {
                    if (class369.field5257) {
                        label687: {
                            if (var50.field1628 >= 16) {
                                int var51 = var2 - class65.field891;
                                int var52 = var3 - class333.field4842;
                                if (var50.field1628 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class407.field5751) {
                                        class224.method1574(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field1628 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class394.field5548 && var3 < class407.field5751) {
                                        class224.method1574(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field1628 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class394.field5548 && var3 > 0) {
                                        class224.method1574(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field1628 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class224.method1574(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class224.method1574(arg0, var4, var2, var3);
                        }
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var53 = var50.method15((byte) 109, class294.field4251);
                    if (var53 != null) {
                        var53.field4636 = var50;
                        var53.field4640 = var4;
                        var53.field4629 = var2;
                        var53.field4630 = var3;
                        class147.field2188.method1076(114, var53);
                    }
                }
                arg1.field959 = 0;
            }
        }
        if (arg1.field973) {
            try {
                arg1.field973 = false;
                int var54 = 0;
                label630: for (class353 var55 = arg1.field970; var55 != null; var55 = var55.field5127) {
                    class306 var56 = var55.field5125;
                    if (class239.field3528 != var56.field4458) {
                        for (int var57 = var56.field4465; var57 <= var56.field4460; var57++) {
                            for (int var58 = var56.field4462; var58 <= var56.field4471; var58++) {
                                class74 var59 = var8[var57][var58];
                                if (var59.field972) {
                                    arg1.field973 = true;
                                    continue label630;
                                }
                                if (var59.field959 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field4465) {
                                        var60++;
                                    }
                                    if (var57 < var56.field4460) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field4462) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field4471) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field959) == arg1.field964) {
                                        arg1.field973 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class65.field891 - var56.field4465;
                        int var62 = var56.field4460 - class65.field891;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class333.field4842 - var56.field4462;
                        int var64 = var56.field4471 - class333.field4842;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field5480[var54] = var56;
                        arg0.field5485[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class306 var68 = arg0.field5480[var67];
                        if (class239.field3528 != var68.field4458) {
                            int var69 = arg0.field5485[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field4463 - class72.field940;
                                int var71 = var68.field4466 - class265.field3899;
                                int var72 = arg0.field5480[var66].field4463 - class72.field940;
                                int var73 = arg0.field5480[var66].field4466 - class265.field3899;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class306 var74 = arg0.field5480[var66];
                    var74.field4458 = class239.field3528;
                    if (!class91.method544(var5, var74.field4465, var74.field4460, var74.field4462, var74.field4471, var74.method775(3))) {
                        if (class369.field5257) {
                            if (var74.field4467 == 0) {
                                class295.method1996(arg0, var4, var74.field4465, var74.field4462, var74.field4460, var74.field4471);
                            } else {
                                class224.method1574(arg0, var4, var2, var3);
                                int var75 = var2 - class65.field891;
                                int var76 = var3 - class333.field4842;
                                if (var74.field4467 == 2) {
                                    if (var76 > -var75) {
                                        class19.method109(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class19.method109(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class19.method109(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class19.method109(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class294.field4251.method945(arg0.field5481, arg0.field5487);
                        }
                        class316 var77 = var74.method15((byte) -108, class294.field4251);
                        if (var77 != null) {
                            var77.field4636 = var74;
                            var77.field4640 = var4;
                            var77.field4629 = var74.field4465;
                            var77.field4630 = var74.field4462;
                            class147.field2188.method1076(126, var77);
                        }
                    }
                    for (int var78 = var74.field4465; var78 <= var74.field4460; var78++) {
                        for (int var79 = var74.field4462; var79 <= var74.field4471; var79++) {
                            class74 var80 = var8[var78][var79];
                            if (var80.field959 != 0) {
                                class312.field4615.method1912(var80, false);
                            } else if ((var2 != var78 || var3 != var79) && var80.field962) {
                                class312.field4615.method1912(var80, false);
                            }
                        }
                    }
                }
                if (arg1.field973) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field973 = false;
            }
        }
        if (arg1.field957 != null) {
            if ((byte) (class223.field3269 & 0xFF) == arg1.field978) {
                class235 var81 = arg1.field957;
                int var82 = class439.field6280[var4].method359(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class439.field6280[var4].method359(var2, var3) - class439.field6280[var4 + 1].method359(var2, var3);
                } else {
                    var83 = 1024;
                }
                class16.field238.method1147(var6, var82, var7, arg0.field5486);
                int var84 = arg0.field5486[2];
                class16.field238.method1147(var6, var82 - var83, var7, arg0.field5486);
                int var85 = arg0.field5486[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field3465 = var86;
                var81.field3460 = var87;
                var81.field3461 = true;
                class294.field4251.method928(var81);
            } else {
                arg1.field957 = null;
            }
        }
        if (!arg1.field962) {
            return;
        }
        if (arg1.field959 != 0) {
            return;
        }
        if (var2 <= class65.field891 && var2 > class25.field308) {
            class74 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field962) {
                return;
            }
        }
        if (var2 >= class65.field891 && var2 < class183.field2589 - 1) {
            class74 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field962) {
                return;
            }
        }
        if (var3 <= class333.field4842 && var3 > class28.field353) {
            class74 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field962) {
                return;
            }
        }
        if (var3 >= class333.field4842 && var3 < class441.field6306 - 1) {
            class74 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field962) {
                return;
            }
        }
        arg1.field962 = false;
        class450.field6440--;
        class147 var92 = arg1.field968;
        if (var92 != null && var92.field2192) {
            if (class369.field5257) {
                class224.method1574(arg0, var4, var2, var3);
                class294.field4251.method945(arg0.field5481, arg0.field5487);
            }
            class316 var93 = var92.method15((byte) -114, class294.field4251);
            if (var93 != null) {
                var93.field4636 = var92;
                var93.field4640 = var4;
                var93.field4629 = var2;
                var93.field4630 = var3;
                class147.field2188.method1076(116, var93);
            }
        }
        if (arg1.field971 != 0) {
            class441 var94 = arg1.field967;
            if (var94 != null && !class247.method1728(var5, var2, var3, var94.method1766((byte) 50))) {
                if ((var94.field6307 & arg1.field971) != 0) {
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class316 var95 = var94.method15((byte) 83, class294.field4251);
                    if (var95 != null) {
                        var95.field4636 = var94;
                        var95.field4640 = var4;
                        var95.field4629 = var2;
                        var95.field4630 = var3;
                        class147.field2188.method1076(119, var95);
                    }
                } else if (var94.field6307 == 256) {
                    int var96 = var94.field6309 - class72.field940;
                    int var97 = var94.field6303 - class265.field3899;
                    int var98 = var94.field6302;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class369.field5257) {
                        class224.method1574(arg0, var4, var2, var3);
                        class294.field4251.method945(arg0.field5481, arg0.field5487);
                    }
                    class441 var101 = arg1.field976;
                    if (var100 > var99) {
                        class316 var102 = var94.method15((byte) 96, class294.field4251);
                        if (var102 != null) {
                            var102.field4636 = var94;
                            var102.field4640 = var4;
                            var102.field4629 = var2;
                            var102.field4630 = var3;
                            class147.field2188.method1076(119, var102);
                        }
                    } else if (var101 != null) {
                        class316 var103 = var101.method15((byte) -70, class294.field4251);
                        if (var103 != null) {
                            var103.field4636 = var101;
                            var103.field4640 = var4;
                            var103.field4629 = var2;
                            var103.field4630 = var3;
                            class147.field2188.method1076(127, var103);
                        }
                    }
                }
            }
            class120 var104 = arg1.field975;
            class120 var105 = arg1.field977;
            if (var105 != null && (var105.field1628 & arg1.field971) != 0 && !class117.method717(var5, var2, var3, var105.field1628)) {
                if (class369.field5257) {
                    class191.method1381(arg0, var105.field1628, var4, var2, var3);
                    class294.field4251.method945(arg0.field5481, arg0.field5487);
                }
                class316 var106 = var105.method15((byte) -59, class294.field4251);
                if (var106 != null) {
                    var106.field4636 = var105;
                    var106.field4640 = var4;
                    var106.field4629 = var2;
                    var106.field4630 = var3;
                    class147.field2188.method1076(121, var106);
                }
            }
            if (var104 != null && (var104.field1628 & arg1.field971) != 0 && !class117.method717(var5, var2, var3, var104.field1628)) {
                if (class369.field5257) {
                    class191.method1381(arg0, var104.field1628, var4, var2, var3);
                    class294.field4251.method945(arg0.field5481, arg0.field5487);
                }
                class316 var107 = var104.method15((byte) -96, class294.field4251);
                if (var107 != null) {
                    var107.field4636 = var104;
                    var107.field4640 = var4;
                    var107.field4629 = var2;
                    var107.field4630 = var3;
                    class147.field2188.method1076(114, var107);
                }
            }
        }
        if (var4 < class243.field3603 - 1) {
            class74 var108 = class385.field5449[var4 + 1][var2][var3];
            if (var108 != null && var108.field962) {
                class312.field4615.method1914(var108, (byte) -88);
            }
        }
        if (var2 < class65.field891) {
            class74 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field962) {
                class312.field4615.method1912(var109, false);
            }
        }
        if (var3 < class333.field4842) {
            class74 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field962) {
                class312.field4615.method1912(var110, false);
            }
        }
        if (var2 > class65.field891) {
            class74 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field962) {
                class312.field4615.method1912(var111, false);
            }
        }
        if (var3 > class333.field4842) {
            class74 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field962) {
                class312.field4615.method1912(var112, false);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z", line = 1727)
    public final boolean method1758(int arg0, int arg1) {
        field5105++;
        if (arg0 != -501) {
            method2304(119, 94, (class74[][][]) null, 77, 53, false);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field5096[arg1] : false;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 1822)
    public class352(Component arg0) {
        class399.method2500((byte) 3);
        this.method2300(arg0, 4);
    }

    @OriginalMember(owner = "client!ia", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1746)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2301((byte) 55, '\u0000', -1, 0);
        field5097++;
    }

    @OriginalMember(owner = "client!ia", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1757)
    public final void focusGained(FocusEvent arg0) {
        field5099++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V", line = 1767)
    public static final void method2306(int arg0, int arg1) {
        field5095++;
        if (arg1 != -27638) {
            field5117 = 66;
        }
        class276 var2 = class264.method1816((byte) -127, arg0, 12);
        var2.method1870((byte) 126);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 1780)
    private final void method2307(byte arg0) {
        field5104++;
        int var2 = -56 / ((17 - arg0) / 39);
        if (this.field5091 == null) {
            return;
        }
        this.field5091.removeKeyListener(this);
        this.field5091.removeFocusListener(this);
        this.field5091 = null;
        for (int var3 = 0; var3 < 112; var3++) {
            this.field5096[var3] = false;
        }
        this.field5108 = null;
        this.field5092 = null;
        this.field5103 = null;
    }

    @OriginalMember(owner = "client!ia", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 1808)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field5109++;
        this.method2303(arg0, 1, -11080);
    }
}
