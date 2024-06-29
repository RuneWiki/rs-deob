import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class254 extends class276 {

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field4147 = 3072;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    private int field4157 = 1024;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    private int field4159 = 2048;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "[I")
    public static int[] field4150 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[Lgk;")
    public static class259[] field4153 = new class259[14];

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lci;")
    public static class60 field4154 = new class60();

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field4161 = 2;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(CII)C")
    public static final char method1680(char arg0, int arg1, int arg2) {
        ++field4156;
        if (arg0 >= 192 && ~arg0 >= -256) {
            if (arg0 >= 192 && ~arg0 >= -199) {
                return 'A';
            }
            if (~arg0 == -200) {
                return 'C';
            }
            if (~arg0 <= -201 && arg0 <= 203) {
                return 'E';
            }
            if (~arg0 <= -205 && arg0 <= 207) {
                return 'I';
            }
            if (arg0 == 209 && ~arg2 != -1) {
                return 'N';
            }
            if (~arg0 <= -211 && ~arg0 >= -215) {
                return 'O';
            }
            if (~arg0 <= -218 && arg0 <= 220) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (~arg0 == -224) {
                return 's';
            }
            if (arg0 >= 224 && arg0 <= 230) {
                return 'a';
            }
            if (~arg0 == -232) {
                return 'c';
            }
            if (arg0 >= 232 && arg0 <= 235) {
                return 'e';
            }
            if (~arg0 <= -237 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 == 241 && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && arg0 <= 252) {
                return 'u';
            }
            if (arg0 == 253 || ~arg0 == -256) {
                return 'y';
            }
        }
        if (arg0 == 338) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else {
            if (arg1 >= -68) {
                method1681(true);
            }
            if (arg0 == 376) {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method1681(boolean arg0) {
        field4150 = null;
        field4153 = null;
        if (!arg0) {
            field4153 = null;
        }
        field4154 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            return null;
        } else {
            int[] var3 = super.field4425.method992(17118, arg1);
            if (super.field4425.field2448) {
                int[] var4 = this.method1805(false, 0, arg1);
                for (int var5 = 0; class53.field929 > var5; ++var5) {
                    var3[var5] = (var4[var5] * this.field4159 >> 12) + this.field4157;
                }
            }
            ++field4151;
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4408 = arg1.method669((byte) 36) == 1;
                }
            } else {
                this.field4147 = arg1.method677(false);
            }
        } else {
            this.field4157 = arg1.method677(false);
        }
        ++field4160;
        if (arg2 != -1) {
            method1684(-95, (Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        this.field4159 = -this.field4157 + this.field4147;
        if (arg0 > 66) {
            ++field4152;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1682(int arg0, String arg1, String arg2, String arg3) {
        ++field4158;
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, var4 - -arg2.length())) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg3.length() + var4);
        }
        if (arg0 > -55) {
            method1680('>', 14, 32);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Leh;Z)V")
    public static final void method1683(class101 arg0, boolean arg1) {
        ++field4155;
        if (~(arg0.field1730.length + -arg0.field1762) <= -2) {
            int var2 = arg0.method669((byte) 36);
            if (~var2 <= -1 && ~var2 >= -12) {
                byte var3;
                if (~var2 != -12) {
                    if (var2 == 10) {
                        var3 = 32;
                    } else if (~var2 != -10) {
                        if (~var2 != -9) {
                            if (~var2 != -8) {
                                if (var2 != 6) {
                                    if (var2 != 5) {
                                        if (~var2 != -5) {
                                            if (~var2 != -4) {
                                                if (var2 != 2) {
                                                    if (var2 == 1) {
                                                        var3 = 23;
                                                    } else {
                                                        var3 = 19;
                                                    }
                                                } else {
                                                    var3 = 22;
                                                }
                                            } else {
                                                var3 = 23;
                                            }
                                        } else {
                                            var3 = 24;
                                        }
                                    } else {
                                        var3 = 28;
                                    }
                                } else {
                                    var3 = 28;
                                }
                            } else {
                                var3 = 29;
                            }
                        } else {
                            var3 = 30;
                        }
                    } else {
                        var3 = 31;
                    }
                } else {
                    var3 = 33;
                }
                if (arg0.field1730.length + -arg0.field1762 >= var3) {
                    class286.field4518 = arg0.method669((byte) 36);
                    if (class286.field4518 >= 1) {
                        if (class286.field4518 > 4) {
                            class286.field4518 = 4;
                        }
                    } else {
                        class286.field4518 = 1;
                    }
                    class151.method1038((byte) 5, ~arg0.method669((byte) 36) == -2);
                    class280.field4459 = arg0.method669((byte) 36) == 1;
                    if (!arg1) {
                        class172.field2828 = arg0.method669((byte) 36) == 1;
                        class239.field3932 = ~arg0.method669((byte) 36) == -2;
                        class11.field156 = ~arg0.method669((byte) 36) == -2;
                        class22.field338 = ~arg0.method669((byte) 36) == -2;
                        class255.field4168 = ~arg0.method669((byte) 36) == -2;
                        class188.field3051 = arg0.method669((byte) 36) == 1;
                        class24.field379 = arg0.method669((byte) 36);
                        if (class24.field379 > 2) {
                            class24.field379 = 2;
                        }
                        if (var2 < 2) {
                            class49.field848 = ~arg0.method669((byte) 36) == -2;
                            arg0.method669((byte) 36);
                        } else {
                            class49.field848 = arg0.method669((byte) 36) == 1;
                        }
                        class11.field164 = ~arg0.method669((byte) 36) == -2;
                        class103.field1816 = arg0.method669((byte) 36) == 1;
                        class139.field2403 = arg0.method669((byte) 36);
                        if (~class139.field2403 < -3) {
                            class139.field2403 = 2;
                        }
                        class172.field2820 = class139.field2403;
                        class61.field1069 = arg0.method669((byte) 36) == 1;
                        class10.field121 = arg0.method669((byte) 36);
                        if (class10.field121 > 127) {
                            class10.field121 = 127;
                        }
                        class50.field872 = arg0.method669((byte) 36);
                        class196.field3167 = arg0.method669((byte) 36);
                        if (class196.field3167 > 127) {
                            class196.field3167 = 127;
                        }
                        if (~var2 <= -2) {
                            class77.field1245 = arg0.method677(false);
                            class87.field1560 = arg0.method677(false);
                        }
                        if (~var2 <= -4 && ~var2 > -7) {
                            arg0.method669((byte) 36);
                        }
                        if (var2 >= 4) {
                            int var4 = arg0.method669((byte) 36);
                            if (~class56.field982 > -97) {
                                var4 = 0;
                            }
                            class32.method214(var4);
                        }
                        if (var2 >= 5) {
                            class157.field2627 = arg0.method655((byte) 94);
                        }
                        if (~var2 <= -7) {
                            class52.field912 = arg0.method669((byte) 36);
                        }
                        if (~var2 <= -8) {
                            class165.field2711 = arg0.method669((byte) 36) == 1;
                        }
                        if (var2 >= 8) {
                            class173.field2852 = ~arg0.method669((byte) 36) == -2;
                        }
                        if (~var2 <= -10) {
                            class103.field1818 = arg0.method669((byte) 36);
                        }
                        if (~var2 <= -11) {
                            class159.field2660 = arg0.method669((byte) 36) != 0;
                        }
                        if (var2 >= 11) {
                            class261.field4256 = ~arg0.method669((byte) 36) != -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field4148;
        int[][] var3 = super.field4418.method835((byte) 104, arg0);
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) 44, arg0, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class53.field929; ++var11) {
                var7[var11] = (var6[var11] * this.field4159 >> 12) + this.field4157;
                var10[var11] = (var8[var11] * this.field4159 >> 12) + this.field4157;
                var9[var11] = (var5[var11] * this.field4159 >> 12) + this.field4157;
            }
        }
        if (arg1 != -1) {
            this.method23(-10, 12);
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method1684(int arg0, Throwable arg1, String arg2) {
        ++field4149;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class213.method1423(arg1, -1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class35.method232(var3, false);
            String var4 = method1682(-66, var3, "%3a", ":");
            String var5 = method1682(-67, var4, "%40", "@");
            int var6 = -110 / ((60 - arg0) / 61);
            String var7 = method1682(-102, var5, "%26", "&");
            String var8 = method1682(-100, var7, "%23", "#");
            if (class5.field61.field2294 != null) {
                class174 var9 = class5.field61.method916(4, new URL(class5.field61.field2294.getCodeBase(), "clienterror.ws?c=" + class237.field3901 + "&u=" + class171.field2811 + "&v1=" + class131.field2292 + "&v2=" + class131.field2285 + "&e=" + var8));
                while (var9.field2857 == 0) {
                    class245.method1636(false, 1L);
                }
                if (var9.field2857 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field2859;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }
}
