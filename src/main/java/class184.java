import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class184 extends class203 {

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
    public static int[] field2513 = new int[200];

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "[I")
    public static int[] field2509 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field2515;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field2516;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Z")
    public boolean field2504;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1205(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 3)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 != -126) {
            this.method674((byte) 10);
        }
        field2503++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 18)
    public static final void method1200(byte arg0) {
        class131 var1 = class39.field570;
        synchronized (class39.field570) {
            class39.field570.method905((byte) 15);
        }
        field2512++;
        class131 var2 = class450.field6291;
        synchronized (class450.field6291) {
            if (arg0 > -114) {
                field2513 = null;
            }
            class450.field6291.method905((byte) 66);
        }
        class131 var3 = class440.field6202;
        synchronized (class440.field6202) {
            class440.field6202.method905((byte) 52);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 37)
    public static final void method1201(int arg0) {
        class25.field457.method900(0);
        if (arg0 == 24122) {
            field2515++;
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)V", line = 50)
    public final void method674(byte arg0) {
        field2514++;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V", line = 69)
    public static final void method1202(int arg0, int arg1) {
        if (arg1 != 1361880513) {
            return;
        }
        field2505++;
        for (class390 var2 = class389.field5584.method885(arg1 - 1361880597); var2 != null; var2 = class389.field5584.method881((byte) -68)) {
            if ((var2.field5600 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method2467((byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)Z", line = 91)
    public final boolean method683(byte arg0) {
        field2507++;
        int var2 = -4 % ((47 - arg0) / 47);
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V", line = 109)
    public static void method1203(boolean arg0) {
        field2509 = null;
        if (!arg0) {
            field2513 = null;
        }
        field2513 = null;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 122)
    public static final void method1204(int arg0) {
        while (true) {
            class273 var1 = (class273) class438.field6168.method633(-102);
            if (var1 == null) {
                field2511++;
                if (arg0 <= 54) {
                    method1202(-52, -128);
                    return;
                }
                return;
            }
            if (class328.field4549 != null) {
                class374 var3;
                if (var1.field3796 >= 0) {
                    int var2 = var1.field3796 - 1;
                    var3 = class98.field1358[var2];
                } else {
                    int var4 = -var1.field3796 - 1;
                    if (class40.field588 == var4) {
                        var3 = class412.field5841;
                    } else {
                        var3 = class381.field5447[var4];
                    }
                }
                if (var3 != null) {
                    class64 var5 = class375.method2395((byte) 72, var1.field3795);
                    int var6;
                    int var7;
                    if (var1.field3778 == 1 || var1.field3778 == 3) {
                        var6 = var5.field950;
                        var7 = var5.field872;
                    } else {
                        var6 = var5.field872;
                        var7 = var5.field950;
                    }
                    int var8 = (var6 >> 1) + var1.field3797;
                    int var9 = (var6 + 1 >> 1) + var1.field3797;
                    int var10 = (var7 >> 1) + var1.field3791;
                    int var11 = (var7 + 1 >> 1) + var1.field3791;
                    class242 var12 = class375.field5354[var3.field6267];
                    int var13 = var12.method737(var8, var10) + var12.method737(var9, var10) + var12.method737(var8, var11) + var12.method737(var9, var11) >> 2;
                    class193 var14 = null;
                    int var15 = class387.field5566[var1.field3779];
                    if (var15 == 0) {
                        var14 = (class193) class244.method1655(var3.field6267, var1.field3797, var1.field3791);
                    } else if (var15 == 1) {
                        var14 = (class193) class326.method2094(var3.field6267, var1.field3797, var1.field3791);
                    } else if (var15 == 2) {
                        var14 = (class193) class139.method952(var3.field6267, var1.field3797, var1.field3791, field2516 == null ? (field2516 = method1205("sc")) : field2516);
                    } else if (var15 == 3) {
                        var14 = (class193) class19.method259(var3.field6267, var1.field3797, var1.field3791);
                    }
                    if (var14 != null) {
                        class450.method2801(-1, var1.field3794 + 1, var15, var1.field3784, false, 0, var1.field3797, var3.field6267, var1.field3791, 0);
                        var3.field5329 = var1.field3791 * 128 + (var7 * 64);
                        var3.field5342 = var13;
                        var3.field5333 = class276.field3837 + var1.field3784;
                        var3.field5334 = var1.field3797 * 128 + (var6 * 64);
                        var3.field5343 = var14;
                        var3.field5331 = class276.field3837 + var1.field3794;
                        int var16 = var1.field3787;
                        int var17 = var1.field3798;
                        int var18 = var1.field3785;
                        if (var17 < var16) {
                            int var19 = var16;
                            var16 = var17;
                            var17 = var19;
                        }
                        int var20 = var1.field3792;
                        if (var18 > var20) {
                            int var21 = var18;
                            var18 = var20;
                            var20 = var21;
                        }
                        var3.field5330 = var1.field3797 + var17;
                        var3.field5335 = var1.field3797 + var16;
                        var3.field5327 = var1.field3791 + var20;
                        var3.field5341 = var1.field3791 + var18;
                    }
                }
            }
        }
    }
}
