import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class2 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
    public static int[] field53 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Z")
    public static boolean field54 = false;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lpd;")
    public static class94 field60 = class28.method249(79, "overlay_multiway");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[Lfd;")
    public static class35[] field63 = new class35[50];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lpd;")
    public static class94 field59 = class28.method249(117, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lpd;")
    private static class94 field61 = class28.method249(63, "Offline");

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lpd;")
    public static class94 field69 = field61;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "[Lad;")
    public static class5[] field68;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[B)Z", line = 21)
    public static final boolean method7(int arg0, int arg1, int arg2, byte[] arg3) {
        field65++;
        int var4 = -1;
        boolean var5 = true;
        if (arg0 != 22) {
            return false;
        }
        class122 var6 = new class122(arg3);
        label69: while (true) {
            int var7 = var6.method948(127);
            if (var7 == 0) {
                return var5;
            }
            var4 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class27 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method948(arg0 ^ 0xFFFFFF9F);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var6.method943(-1025);
                                    }
                                    int var10 = var6.method948(127);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var6.method943(-1025) >> 2;
                                    var14 = var11 + arg2;
                                    var15 = arg1 + var12;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class55.method440(var4, (byte) 76);
                } while (var13 == 22 && class115.field2912 && var16.field726 == 0 && !var16.field710);
                var9 = true;
                if (!var16.method241((byte) 18)) {
                    class66.field1628++;
                    var5 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lde;[BIII[Lod;)V", line = 112)
    public static final void method8(class24 arg0, byte[] arg1, int arg2, int arg3, int arg4, class88[] arg5) {
        field50++;
        class122 var6 = new class122(arg1);
        if (arg2 != 0) {
            return;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method948(arg2 ^ 0x7C);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method948(-41);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 & 0x3F;
                int var14 = var6.method943(arg2 ^ 0xFFFFFBFF);
                int var15 = var14 & 0x3;
                int var16 = var12 + arg3;
                int var17 = var14 >> 2;
                int var18 = arg4 + var13;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    int var19 = var11;
                    class88 var20 = null;
                    if ((class108.field2679[1][var16][var18] & 0x2) == 2) {
                        var19 = var11 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg5[var19];
                    }
                    class9.method51(arg0, var7, var16, var18, var11, (byte) 84, var17, var20, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLpd;)Z", line = 186)
    public static final boolean method9(boolean arg0, class94 arg1) {
        field66++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0) {
            field58 = 104;
        }
        while (class77.field1963 > var2) {
            if (arg1.method692(class120.field3008[var2], (byte) -38)) {
                return true;
            }
            var2++;
        }
        return arg1.method692(class80.field2044.field2295, (byte) -38);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;BII)Lla;", line = 222)
    public static final class66 method10(Component arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 86) {
            return null;
        }
        field55++;
        try {
            Class var4 = Class.forName("na");
            class66 var5 = (class66) var4.getDeclaredConstructor().newInstance();
            var5.method495(arg2, -128, arg3, arg0);
            return var5;
        } catch (Throwable var7) {
            class69 var6 = new class69();
            var6.method495(arg2, -127, arg3, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 251)
    public static final void method11(boolean arg0) {
        class128.method1010(class77.field1962, 62);
        if (class111.field2806 != -1) {
            class128.method1010(class111.field2806, 111);
        }
        field56++;
        class66.field1620 = 0;
        class123.field3117.method496(55);
        class66.field1621 = class124.method985(class66.field1621);
        if (arg0) {
            field53 = null;
        }
        class130.method1031();
        class113.method838(0, 765, 0, 56, 503, class77.field1962, 0);
        if (class111.field2806 != -1) {
            class113.method838(0, 765, 0, 110, 503, class111.field2806, 0);
        }
        if (class62.field1516) {
            class4.method27((byte) 123);
        } else {
            class77.method574(113);
            class133.method1050(2088);
        }
        try {
            Graphics var1 = class128.field3218.getGraphics();
            class123.field3117.method498(0, 0, (byte) -12, var1);
        } catch (Exception var2) {
            class128.field3218.repaint();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lme;B)Z", line = 296)
    public static final boolean method12(class77 arg0, byte arg1) {
        field64++;
        if (arg0.field1951 == null) {
            return false;
        }
        if (arg1 != -59) {
            method14(-19, -128, (byte) -6);
        }
        for (int var2 = 0; var2 < arg0.field1951.length; var2++) {
            int var3 = class111.method819(false, arg0, var2);
            int var4 = arg0.field1952[var2];
            if (arg0.field1951[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1951[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1951[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 360)
    public static void method13(byte arg0) {
        field60 = null;
        field53 = null;
        field68 = null;
        int var1 = 28 / (arg0 / 54);
        field69 = null;
        field59 = null;
        field61 = null;
        field63 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)Z", line = 386)
    public static final boolean method14(int arg0, int arg1, byte arg2) {
        field57++;
        if (arg0 == 0 && class94.field2386 == arg1) {
            return true;
        } else if (arg0 == 1 && class95.field2450 == arg1) {
            return true;
        } else if ((arg0 == 2 || arg0 == 3) && class80.field2056 == arg1) {
            return true;
        } else {
            int var3 = -72 % ((44 - arg2) / 36);
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)I", line = 409)
    public static final int method15(int arg0, boolean arg1) {
        field62++;
        if (arg1) {
            method9(true, null);
        }
        return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BILs;I)Lad;", line = 422)
    public static final class5 method16(byte arg0, int arg1, class111 arg2, int arg3) {
        field52++;
        if (arg0 != -47) {
            method8(null, null, 22, 121, -46, null);
        }
        return class43.method321(arg1, arg3, arg2, arg0 - 12357) ? class100.method752(260) : null;
    }
}
