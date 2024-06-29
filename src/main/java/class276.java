import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class276 implements class591 {

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Ltga;")
    private class64 field3836 = new class64(128);

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
    public int[] field3840 = new int[class266.field3756.field6759];

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
    private int[] field3837 = new int[class266.field3756.field6759];

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lbfa;")
    public static class386 field3838 = new class386();

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3843 = 0;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "F")
    public static float field3846;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Lfp;")
    public static class340 field3842;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field3848;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1794(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)I", line = 4)
    public final int method1781(byte arg0, int arg1) {
        field3833++;
        class155 var3 = class324.field4862.method3265(arg1, 19206);
        if (arg0 > -15) {
            return -2;
        }
        int var4 = var3.field2301;
        int var5 = var3.field2294;
        int var6 = var3.field2296;
        int var7 = class558.field7928[var6 - var5];
        return var7 & this.field3840[var4] >> var5;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V", line = 31)
    public final void method1782(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field3837 = null;
        }
        field3835++;
        this.field3837[arg2] = arg1;
        class30 var4 = (class30) this.field3836.method380((byte) -3, (long) arg2);
        if (var4 == null) {
            class30 var5 = new class30(4611686018427387905L);
            this.field3836.method384((long) arg2, var5, false);
        } else if (var4.field413 != 4611686018427387905L) {
            var4.field413 = class109.method731(arg0 + 113) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/awt/Component;ILkj;I)Lfa;", line = 60)
    public static final class243 method1783(int arg0, Component arg1, int arg2, class590 arg3, int arg4) {
        field3830++;
        if (class110.field1367 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class243 var5 = (class243) Class.forName("hs").getDeclaredConstructor().newInstance();
                var5.field3490 = arg2;
                var5.field3475 = new int[(class488.field6909 ? 2 : 1) * 256];
                var5.method1235(arg1);
                var5.field3500 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3500 > 16384) {
                    var5.field3500 = 16384;
                }
                var5.method1231(var5.field3500);
                if (arg4 > ~class403.field5706 && class462.field6595 == null) {
                    class462.field6595 = new class592();
                    class462.field6595.field8359 = arg3;
                    arg3.method3426(103, class462.field6595, class403.field5706);
                }
                if (class462.field6595 != null) {
                    if (class462.field6595.field8360[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class462.field6595.field8360[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class156 var6 = new class156(arg3, arg0);
                    var6.field3490 = arg2;
                    var6.field3475 = new int[(class488.field6909 ? 2 : 1) * 256];
                    var6.method1235(arg1);
                    var6.field3500 = 16384;
                    var6.method1231(var6.field3500);
                    if (class403.field5706 > 0 && class462.field6595 == null) {
                        class462.field6595 = new class592();
                        class462.field6595.field8359 = arg3;
                        arg3.method3426(arg4 + 101, class462.field6595, class403.field5706);
                    }
                    if (class462.field6595 != null) {
                        if (class462.field6595.field8360[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class462.field6595.field8360[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class243();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)I", line = 143)
    public final int method1784(boolean arg0, int arg1) {
        field3839++;
        long var3 = class109.method731(58);
        for (class30 var5 = arg0 ? (class30) this.field3836.method382(0) : (class30) this.field3836.method391(37); var5 != null; var5 = (class30) this.field3836.method391(37)) {
            if (var3 > (var5.field413 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field413 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7577;
                    this.field3840[var6] = this.field3837[var6];
                    var5.method3117((byte) -89);
                    return var6;
                }
                var5.method3117((byte) 66);
            }
        }
        if (arg1 == 2) {
            return -1;
        } else {
            return 113;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIBILha;)V", line = 184)
    public static final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class66 arg8) {
        field3847++;
        if (arg6 != -31) {
            return;
        }
        class362 var9 = (class362) class259.method1702(arg5, arg4, arg0);
        if (var9 != null) {
            class322 var10 = class496.field7061.method319(-15, var9.method650(-114));
            int var11 = var9.method643(false) & 0x3;
            int var12 = var9.method646((byte) 45);
            if (var10.field4769 == -1) {
                int var13 = arg3;
                if (var10.field4761 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method480(1, 4, var13, arg1, arg7);
                    } else if (var11 == 1) {
                        arg8.method478(arg7, true, var13, 4, arg1);
                    } else if (var11 == 2) {
                        arg8.method480(1, 4, var13, arg1, arg7 + 3);
                    } else if (var11 == 3) {
                        arg8.method478(arg7, true, var13, 4, arg1 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method488(arg1, arg7, var13, 1, 1, 1);
                    } else if (var11 == 1) {
                        arg8.method488(arg1, arg7 + 3, var13, 1, 1, 1);
                    } else if (var11 == 2) {
                        arg8.method488(arg1 + 3, arg7 + 3, var13, 1, arg6 ^ 0xFFFFFFE0, 1);
                    } else if (var11 == 3) {
                        arg8.method488(arg1 + 3, arg7, var13, 1, 1, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method478(arg7, true, var13, 4, arg1);
                    } else if (var11 == 1) {
                        arg8.method480(arg6 ^ 0xFFFFFFE0, 4, var13, arg1, arg7 + 3);
                    } else if (var11 == 2) {
                        arg8.method478(arg7, true, var13, 4, arg1 + 3);
                    } else if (var11 == 3) {
                        arg8.method480(1, 4, var13, arg1, arg7);
                    }
                }
            } else {
                class653.method3744(arg7, arg1, var11, 1, arg8, var10);
            }
        }
        class362 var14 = (class362) class195.method1415(arg5, arg4, arg0, field3848 == null ? (field3848 = method1794("ija")) : field3848);
        if (var14 != null) {
            class322 var15 = class496.field7061.method319(-122, var14.method650(110));
            int var16 = var14.method643(false) & 0x3;
            int var17 = var14.method646((byte) 45);
            if (var15.field4769 != -1) {
                class653.method3744(arg7, arg1, var16, 1, arg8, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4761 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method419(arg7 + 3, var18, arg7, arg1, (byte) 34, arg1 + 3);
                } else {
                    arg8.method419(arg7 + 3, var18, arg7, arg1 + 3, (byte) 34, arg1);
                }
            }
        }
        class362 var19 = (class362) class728.method4087(arg5, arg4, arg0);
        if (var19 == null) {
            return;
        }
        class322 var20 = class496.field7061.method319(-124, var19.method650(-124));
        int var21 = var19.method643(false) & 0x3;
        if (var20.field4769 != -1) {
            class653.method3744(arg7, arg1, var21, arg6 + 32, arg8, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V", line = 324)
    public final void method1786(int arg0, int arg1, int arg2) {
        if (arg0 != -28107) {
            field3841 = -15;
        }
        field3844++;
        this.field3840[arg1] = arg2;
        class30 var4 = (class30) this.field3836.method380((byte) -3, (long) arg1);
        if (var4 == null) {
            class30 var5 = new class30(class109.method731(52) + 500L);
            this.field3836.method384((long) arg1, var5, false);
        } else {
            var4.field413 = class109.method731(arg0 ^ 0xFFFF9263) + 500L;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 347)
    public final void method1787(int arg0) {
        if (arg0 > -51) {
            return;
        }
        field3845++;
        for (int var2 = 0; var2 < class266.field3756.field6759; var2++) {
            class494 var3 = class266.field3756.method2801(var2, 64);
            if (var3 != null && var3.field7011 == 0) {
                this.field3837[var2] = 0;
                this.field3840[var2] = 0;
            }
        }
        this.field3836 = new class64(128);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 375)
    public static void method1788(int arg0) {
        if (arg0 <= -37) {
            field3838 = null;
            field3842 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIZ)V", line = 390)
    public final void method1789(int arg0, int arg1, boolean arg2) {
        field3828++;
        class155 var4 = class324.field4862.method3265(arg0, 19206);
        int var5 = var4.field2301;
        if (!arg2) {
            method1788(-21);
        }
        int var6 = var4.field2294;
        int var7 = var4.field2296;
        int var8 = class558.field7928[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1786(-28107, var5, ~var9 & this.field3840[var5] | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBIIII)V", line = 424)
    public static final void method1790(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 <= -92) {
            if (class145.field1852.field9029.method978((byte) -86) != 0 && arg5 != 0 && class636.field8961 < 50 && arg1 != -1) {
                class458.field6558[class636.field8961++] = new class472((byte) 1, arg1, arg5, arg3, arg6, arg4, arg0, null);
            }
            field3834++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIZ)V", line = 454)
    public static final void method1791(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class677.field9637 != null && (arg3 != 3 || class717.field10090 != arg4 || class271.field3795 != arg0)) {
            class646.method3693(class27.field395, (byte) -61, class677.field9637);
            class677.field9637 = null;
        }
        field3829++;
        if (arg3 == 3 && class677.field9637 == null) {
            class677.field9637 = class220.method1522(arg0, arg4, class27.field395, (byte) 97, 0, 0);
            if (class677.field9637 != null) {
                class271.field3795 = arg0;
                class717.field10090 = arg4;
                class781.method4285(3);
            }
        }
        if (arg3 == 3 && class677.field9637 == null) {
            method1791(-1, arg1, -9211, class145.field1852.field8987.method2724((byte) -33), -1, true);
            return;
        }
        Container var6;
        if (class677.field9637 != null) {
            class133.field1735 = arg4;
            var6 = class677.field9637;
            class711.field10013 = arg0;
        } else if (class463.field6617 == null) {
            if (class535.field7544 == null) {
                var6 = class119.field1498;
            } else {
                var6 = class535.field7544;
            }
            class133.field1735 = var6.getSize().width;
            class711.field10013 = var6.getSize().height;
        } else {
            Insets var7 = class463.field6617.getInsets();
            class133.field1735 = class463.field6617.getSize().width - var7.right - var7.left;
            int var10001 = -var7.top;
            class711.field10013 = class463.field6617.getSize().height + (var10001 - var7.bottom);
            var6 = class463.field6617;
        }
        if (arg2 != -9211) {
            method1791(118, 34, 64, 127, -110, false);
        }
        if (arg3 == 1) {
            class512.field7325 = class264.field3734;
            class638.field8980 = class785.field10790;
            class457.field6547 = (class133.field1735 - class785.field10790) / 2;
            class273.field3812 = 0;
        } else {
            class345.method2194((byte) 64);
        }
        if (class256.field3599 != class177.field2704) {
            boolean var10000;
            if (class638.field8980 < 1024 && class512.field7325 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class723.method4074(-1);
        } else {
            class359.field5219.setSize(class638.field8980, class512.field7325);
            if (class607.field8578) {
                class723.method4071(class359.field5219, 6412);
            } else {
                class638.field8979.method505(class359.field5219, class638.field8980, class512.field7325);
            }
            if (class463.field6617 == var6) {
                Insets var8 = class463.field6617.getInsets();
                class359.field5219.setLocation(class457.field6547 + var8.left, class273.field3812 + var8.top);
            } else {
                class359.field5219.setLocation(class457.field6547, class273.field3812);
            }
        }
        if (arg3 < 2) {
            client.field4662 = false;
        } else {
            client.field4662 = true;
        }
        if (class251.field3546 != -1) {
            class126.method924(true, (byte) 102);
        }
        if (class76.field1025 != null && class264.method1739(class757.field10456, 3580)) {
            class135.method956(-90);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class397.field5653[var9] = true;
        }
        class241.field3464 = true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I", line = 588)
    public final int method1792(int arg0, int arg1) {
        if (arg1 != 4776) {
            method1785(51, -41, 90, 116, 13, -89, (byte) -56, -78, null);
        }
        field3832++;
        return this.field3840[arg0];
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V", line = 600)
    public final void method1793(int arg0, int arg1, byte arg2) {
        field3831++;
        class155 var4 = class324.field4862.method3265(arg0, 19206);
        int var5 = var4.field2301;
        int var6 = var4.field2294;
        int var7 = var4.field2296;
        if (arg2 > -91) {
            return;
        }
        int var8 = class558.field7928[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1782(-1, arg1 << var6 & var9 | ~var9 & this.field3837[var5], var5);
    }
}
