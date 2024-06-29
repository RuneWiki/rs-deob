import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class371 extends class8 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Lmg;")
    private class530 field5306 = new class530();

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lmg;")
    private class530 field5321 = new class530();

    @OriginalMember(owner = "client!te", name = "L", descriptor = "Z")
    private boolean field5324;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    private int field5291;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    private int field5296;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    private int field5308;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    private int field5310;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    private int field5313;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    private int field5322;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field5323;

    @OriginalMember(owner = "client!te", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5320++;
        this.field5322 = -1;
        this.field5310 = -1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZIII)V")
    public static final void method2211(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5294++;
        class426.method2545((byte) 115, arg6);
        int var7 = 0;
        int var8 = arg6 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg3) {
            field5319 = 122;
        }
        int var14 = -1;
        int[] var15 = class42.field626[arg5];
        int var16 = arg2 - var8;
        class188.method1259(arg2 - arg6, (byte) 27, var16, arg1, var15);
        int var17 = arg2 + var8;
        class188.method1259(var16, (byte) 27, var17, arg4, var15);
        class188.method1259(var17, (byte) 27, arg2 + arg6, arg1, var15);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class80.field1133[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class42.field626[arg5 + var9];
                    int[] var19 = class42.field626[arg5 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class188.method1259(var21, (byte) 27, var20, arg1, var18);
                    class188.method1259(var21, (byte) 27, var20, arg1, var19);
                } else {
                    int[] var22 = class42.field626[arg5 + var9];
                    int[] var23 = class42.field626[arg5 - var9];
                    int var24 = class80.field1133[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class188.method1259(var26, (byte) 27, var28, arg1, var22);
                    class188.method1259(var28, (byte) 27, var27, arg4, var22);
                    class188.method1259(var27, (byte) 27, var25, arg1, var22);
                    class188.method1259(var26, (byte) 27, var28, arg1, var23);
                    class188.method1259(var28, (byte) 27, var27, arg4, var23);
                    class188.method1259(var27, (byte) 27, var25, arg1, var23);
                }
            }
            int[] var29 = class42.field626[arg5 + var7];
            int[] var30 = class42.field626[arg5 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 >= var8) {
                class188.method1259(var32, (byte) 27, var31, arg1, var29);
                class188.method1259(var32, (byte) 27, var31, arg1, var30);
            } else {
                int var33 = var11 < var7 ? class80.field1133[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class188.method1259(var32, (byte) 27, var35, arg1, var29);
                class188.method1259(var35, (byte) 27, var34, arg4, var29);
                class188.method1259(var34, (byte) 27, var31, arg1, var29);
                class188.method1259(var32, (byte) 27, var35, arg1, var30);
                class188.method1259(var35, (byte) 27, var34, arg4, var30);
                class188.method1259(var34, (byte) 27, var31, arg1, var30);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
    private final int method2212(MouseEvent arg0, byte arg1) {
        field5312++;
        int var3 = 48 / ((-arg1 - 51) / 45);
        int var4 = arg0.getModifiers();
        boolean var5 = (var4 & 0x10) != 0;
        boolean var6 = (var4 & 0x8) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        if (var6 && (var5 || var7)) {
            var6 = false;
        }
        if (var5 && var7) {
            return 4;
        } else if (var5) {
            return 1;
        } else if (var6) {
            return 2;
        } else if (var7) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5311++;
        this.method2214(true, arg0);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z")
    public final boolean method58(int arg0) {
        if (arg0 > -16) {
            method2215(27, null, false);
        }
        field5303++;
        return (this.field5291 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static final void method2213(int arg0) {
        if (class173.field2628 != 3) {
            class184.field2737 = class439.field6332;
        }
        field5293++;
        if (arg0 != 26306) {
            field5319 = -123;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I")
    public final int method55(byte arg0) {
        field5309++;
        return arg0 == -37 ? this.field5296 : -69;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Ldw;")
    public final class97 method59(boolean arg0) {
        if (!arg0) {
            this.field5324 = true;
        }
        field5295++;
        return (class97) this.field5306.method3134((byte) 114);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
    private final void method2214(boolean arg0, MouseEvent arg1) {
        field5301++;
        if (!arg0) {
            this.field5291 = -76;
        }
        this.field5310 = arg1.getX();
        this.field5322 = arg1.getY();
        if (this.field5324) {
            this.method2216(arg1.getX(), (byte) 27, -1, arg1.getY());
        }
    }

    @OriginalMember(owner = "client!te", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5318++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)I")
    public final int method62(byte arg0) {
        field5292++;
        if (arg0 < 39) {
            this.method2216(9, (byte) 8, 96, -82);
        }
        return this.field5308;
    }

    @OriginalMember(owner = "client!te", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5314++;
        int var2 = this.method2212(arg0, (byte) 80);
        if (var2 == 1) {
            this.method2216(arg0.getX(), (byte) 27, 0, arg0.getY());
        } else if (var2 == 4) {
            this.method2216(arg0.getX(), (byte) 27, 2, arg0.getY());
        } else if (var2 == 2) {
            this.method2216(arg0.getX(), (byte) 27, 1, arg0.getY());
        }
        this.field5313 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjm;Z)V")
    public static final void method2215(int arg0, class209 arg1, boolean arg2) {
        field5300++;
        if (arg0 != 0 || class527.field7690 >= 400) {
            return;
        }
        class83 var3 = arg1.field2976;
        if (var3.field1272 != null) {
            var3 = var3.method655(class309.field4200, (byte) 120);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1277) {
            return;
        }
        String var4 = var3.field1284;
        if (var3.field1247 != 0) {
            String var5 = class308.field4192 == class152.field2343 ? class492.field7105.method1126(class486.field6998, (byte) -19) : class102.field1608.method1126(class486.field6998, (byte) -19);
            var4 = var4 + class269.method1580(true, var3.field1247, class81.field1158.field7028) + " (" + var5 + var3.field1247 + ")";
        }
        if (!class375.field5390) {
            if (!arg2) {
                String[] var6 = var3.field1244;
                if (class274.field3721) {
                    var6 = class29.method208(0, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (var3.field1213 == 0 || !var6[var7].equalsIgnoreCase(class181.field2694.method1126(class486.field6998, (byte) -19)))) {
                            byte var8 = 0;
                            if (var7 == 0) {
                                var8 = 22;
                            }
                            int var9 = class153.field2359;
                            if (var7 == 1) {
                                var8 = 18;
                            }
                            if (var7 == 2) {
                                var8 = 19;
                            }
                            if (var7 == 3) {
                                var8 = 4;
                            }
                            if (var7 == 4) {
                                var8 = 21;
                            }
                            if (var3.field1216 == var7) {
                                var9 = var3.field1227;
                            }
                            if (var3.field1280 == var7) {
                                var9 = var3.field1283;
                            }
                            class358.field5148++;
                            class193.method1274(0, var6[var7], true, var6[var7].equalsIgnoreCase(class181.field2694.method1126(class486.field6998, (byte) -19)) ? var3.field1260 : var9, "<col=ffff00>" + var4, -1, 0, var8, false, true, (long) arg1.field179);
                        }
                    }
                }
                if (var3.field1213 == 1 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class181.field2694.method1126(class486.field6998, (byte) -19))) {
                            short var11 = 0;
                            if (var3.field1247 > class81.field1158.field7028) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 22;
                            }
                            if (var10 == 1) {
                                var12 = 18;
                            }
                            if (var10 == 2) {
                                var12 = 19;
                            }
                            if (var10 == 3) {
                                var12 = 4;
                            }
                            if (var10 == 4) {
                                var12 = 21;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class364.field5234++;
                            class193.method1274(0, var6[var10], true, var3.field1260, "<col=ffff00>" + var4, -1, 0, var12, false, true, (long) arg1.field179);
                        }
                    }
                }
            }
            class193.method1274(0, class309.field4196.method1126(class486.field6998, (byte) -19), true, class480.field6947, "<col=ffff00>" + var4, -1, 0, 1001, arg2, true, (long) arg1.field179);
            class256.field3482++;
        } else if (!arg2) {
            class145 var13 = class284.field3850 == -1 ? null : class365.field5241.method2181((byte) 127, class284.field3850);
            if ((class107.field1737 & 0x2) != 0) {
                if (var13 == null || var3.method650(var13.field2140, class284.field3850, -124) != var13.field2140) {
                    class427.field6208++;
                    class193.method1274(0, class87.field1409, true, class484.field6965, class476.field6886 + " -> <col=ffff00>" + var4, -1, 0, 9, false, true, (long) arg1.field179);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)V")
    private final void method2216(int arg0, byte arg1, int arg2, int arg3) {
        field5298++;
        class238 var5 = new class238();
        if (arg1 != 27) {
            return;
        }
        var5.field3292 = arg0;
        var5.field3299 = arg3;
        var5.field3291 = arg2;
        var5.field3289 = class254.method1522((byte) -51);
        this.field5321.method3139(0, var5);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2217(byte arg0, Component arg1) {
        field5315++;
        this.method2218((byte) -117);
        this.field5323 = arg1;
        this.field5323.addMouseListener(this);
        this.field5323.addMouseMotionListener(this);
        if (arg0 != 80) {
            this.method62((byte) -26);
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Z")
    public final boolean method57(int arg0) {
        field5299++;
        if (arg0 == 0) {
            return (this.field5291 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
    private final void method2218(byte arg0) {
        field5290++;
        if (this.field5323 == null) {
            return;
        }
        this.field5323.removeMouseListener(this);
        this.field5323.removeMouseMotionListener(this);
        this.field5321 = null;
        if (arg0 > -53) {
            this.method2216(7, (byte) -3, -66, 73);
        }
        this.field5323 = null;
        this.field5306 = null;
        this.field5296 = this.field5308 = this.field5291 = 0;
        this.field5310 = this.field5322 = this.field5313 = 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Z")
    public final boolean method52(byte arg0) {
        if (arg0 < 50) {
            this.mouseEntered(null);
        }
        field5317++;
        return (this.field5291 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lza;Lti;BLfk;)V")
    public static final void method2219(class295 arg0, class237 arg1, byte arg2, class92 arg3) {
        field5316++;
        class359 var4 = arg3.method753(88, arg0);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method205();
        if (var5 < var4.method200()) {
            var5 = var4.method200();
        }
        byte var6 = 10;
        int var7 = arg1.field3279;
        int var8 = arg1.field3286;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field1495 != null) {
            var9 = class249.field3394.method412(null, (byte) 2, null, arg3.field1495, class312.field4241);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class312.field4241[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class28.field405.method1118(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class28.field405.method1115() * var9 + (class28.field405.method1114() / 2);
        }
        int var15 = var5 / 2 + arg1.field3279;
        int var16 = arg1.field3286;
        int var17 = 100 % ((-arg2 - 12) / 56);
        if ((class472.field6834 + var5) > var7) {
            var7 = class472.field6834;
            var15 = var5 / 2 + class472.field6834 - (-var6 - (var10 / 2 - -5));
        } else if (var7 > class472.field6826 - var5) {
            var7 = class472.field6826 - var5;
            var15 = class472.field6826 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        if ((class472.field6832 + var5) > var8) {
            var16 = var5 / 2 + class472.field6832 + var6;
            var8 = class472.field6832;
        } else if (var8 > (class472.field6823 - var5)) {
            var16 = class472.field6823 - var11 - (var5 / 2) - var6;
            var8 = class472.field6823 - var5;
        }
        int var18 = (int) ((Math.atan2((double) (var7 - arg1.field3279), (double) (var8 - arg1.field3286)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method2146((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var18);
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        int var22 = -2;
        if (arg3.field1495 != null) {
            var19 = var15 - (var10 / 2) - 5;
            var20 = var16;
            var22 = var9 * class28.field405.method1115() + var16 + 3;
            var21 = var19 + var10 + 10;
            if (arg3.field1473 != 0) {
                arg0.method1712(var22 - var16, 0, arg3.field1473, var21 - var19, var16, var19);
            }
            if (arg3.field1488 != 0) {
                arg0.method1707((byte) 55, arg3.field1488, var21 - var19, var16, var22 - var16, var19);
            }
            for (int var23 = 0; var23 < var9; var23++) {
                String var24 = class312.field4241[var23];
                if (var23 < var9 - 1) {
                    var24 = var24.substring(0, var24.length() - 4);
                }
                class28.field405.method1119(arg0, var24, var15, var16, arg3.field1510, true);
                var16 += class28.field405.method1115();
            }
        }
        if (arg3.field1471 == -1 && arg3.field1495 == null) {
            return;
        }
        int var25 = var5 >> 1;
        class191 var26 = new class191(arg1);
        var26.field2784 = var21;
        var26.field2790 = var8 - var25;
        var26.field2792 = var22;
        var26.field2799 = var7 + var25;
        var26.field2800 = var8 + var25;
        var26.field2787 = var7 - var25;
        var26.field2796 = var19;
        var26.field2795 = var20;
        class377.field5430.method3139(0, var26);
    }

    @OriginalMember(owner = "client!te", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5305++;
        int var2 = this.method2212(arg0, (byte) -114);
        if ((this.field5313 & var2) == 0) {
            var2 = this.field5313;
        }
        if ((var2 & 0x1) != 0) {
            this.method2216(arg0.getX(), (byte) 27, 3, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2216(arg0.getX(), (byte) 27, 5, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2216(arg0.getX(), (byte) 27, 4, arg0.getY());
        }
        this.field5313 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public final void method61(int arg0) {
        this.method2218((byte) -71);
        if (arg0 != 0) {
            this.field5313 = 67;
        }
        field5302++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public final synchronized void method54(int arg0) {
        this.field5296 = this.field5310;
        this.field5291 = this.field5313;
        field5307++;
        this.field5308 = this.field5322;
        class530 var2 = this.field5306;
        if (arg0 > -53) {
            this.method52((byte) 32);
        }
        this.field5306 = this.field5321;
        this.field5321 = var2;
        this.field5321.method3143(true);
    }

    @OriginalMember(owner = "client!te", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2214(true, arg0);
        field5297++;
    }

    @OriginalMember(owner = "client!te", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5304++;
        this.method2214(true, arg0);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class371(Component arg0, boolean arg1) {
        this.method2217((byte) 80, arg0);
        this.field5324 = arg1;
    }
}
