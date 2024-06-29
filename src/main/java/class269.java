import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class269 extends Canvas {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field4312;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "J")
    public static long field4318 = 0L;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4320 = 0;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "[Z")
    public static boolean[] field4319 = new boolean[5];

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lmj;")
    public static class144 field4315 = new class144(16);

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field4324 = 64;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4326 = -1;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lbf;")
    public static class102 field4322;

    @OriginalMember(owner = "client!pf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4310++;
        this.field4312.update(arg0);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class269(Component arg0) {
        this.field4312 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lgd;ILgd;)V")
    public static final void method1827(class112 arg0, int arg1, class112 arg2) {
        field4325++;
        if (arg1 != -19) {
            method1831((byte[]) null, (class13[]) null, -89, -32, 98, true, 3, -18);
        }
        if (arg2.field1726 != null) {
            arg2.method827((byte) -98);
        }
        arg2.field1733 = arg0.field1733;
        arg2.field1726 = arg0;
        arg2.field1726.field1733 = arg2;
        arg2.field1733.field1726 = arg2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BILkj;I)V")
    public static final void method1828(byte arg0, int arg1, class114 arg2, int arg3) {
        if (arg2.field1778 == 0) {
            arg2.field1875 = arg2.field1830;
        } else if (arg2.field1778 == 1) {
            arg2.field1875 = (arg3 - arg2.field1919) / 2 + arg2.field1830;
        } else if (arg2.field1778 == 2) {
            arg2.field1875 = arg3 - (arg2.field1919 + arg2.field1830);
        } else if (arg2.field1778 == 3) {
            arg2.field1875 = arg2.field1830 * arg3 >> 14;
        } else if (arg2.field1778 == 4) {
            arg2.field1875 = (arg2.field1830 * arg3 >> 14) + (arg3 - arg2.field1919) / 2;
        } else {
            arg2.field1875 = arg3 - arg2.field1919 - (arg2.field1830 * arg3 >> 14);
        }
        if (arg2.field1770 == 0) {
            arg2.field1779 = arg2.field1810;
        } else if (arg2.field1770 == 1) {
            arg2.field1779 = (arg1 - arg2.field1790) / 2 + arg2.field1810;
        } else if (arg2.field1770 == 2) {
            arg2.field1779 = arg1 - arg2.field1790 - arg2.field1810;
        } else if (arg2.field1770 == 3) {
            arg2.field1779 = arg2.field1810 * arg1 >> 14;
        } else if (arg2.field1770 == 4) {
            arg2.field1779 = (arg1 - arg2.field1790) / 2 + (arg2.field1810 * arg1 >> 14);
        } else {
            arg2.field1779 = arg1 - (arg2.field1810 * arg1 >> 14) - arg2.field1790;
        }
        if (class199.field3247 && (client.method1916(arg2).field4028 != 0 || arg2.field1898 == 0)) {
            if (arg2.field1875 < 0) {
                arg2.field1875 = 0;
            } else if (arg2.field1875 + arg2.field1919 > arg3) {
                arg2.field1875 = arg3 - arg2.field1919;
            }
            if (arg2.field1779 < 0) {
                arg2.field1779 = 0;
            } else if (arg1 < arg2.field1790 + arg2.field1779) {
                arg2.field1779 = arg1 - arg2.field1790;
            }
        }
        field4316++;
        int var4 = 57 / ((47 - arg0) / 35);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1829(int arg0) {
        if (arg0 > -4) {
            method1827((class112) null, -90, (class112) null);
        }
        field4315 = null;
        field4322 = null;
        field4319 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)Ltj;")
    public static final class10 method1830(int arg0, int arg1, byte arg2) {
        class10 var3 = new class10();
        field4308++;
        for (class119 var4 = (class119) class81.field1337.method1062(89); var4 != null; var4 = (class119) class81.field1337.method1059(-14608)) {
            if (var4.field2010 && var4.method876(arg0, (byte) 6, arg1)) {
                var3.method70(3, var4);
            }
        }
        if (arg2 >= -107) {
            field4326 = -16;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([B[Lml;IIIZII)[I")
    public static final int[] method1831(byte[] arg0, class13[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4313++;
        if (arg4 <= 67) {
            method1832((String) null, (String) null, (String) null, true);
        }
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg7 + var10 > 0 && (arg7 + var10) < 103 && (arg6 + var11) > 0 && arg6 + var11 < 103) {
                            arg1[var9].field171[arg7 + var10][arg6 + var11] = class64.method498(arg1[var9].field171[arg7 + var10][arg6 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class136 var12 = new class136(arg0);
        int var13 = arg3 + arg7;
        int var14 = arg2 + arg6;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class238.method1575(1, var12, 0, false, arg6 + var40, var15, arg5, var39 + arg7, var14 + var40, var13 + var39);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field2231 < var12.field2263.length) {
            int var18 = var12.method1012(4);
            if (var18 == 128) {
                var16 = true;
                class228.field3623[0] = var12.method996(65280);
                class228.field3623[1] = var12.method1027((byte) 64);
                class228.field3623[2] = var12.method1027((byte) 64);
                class228.field3623[3] = var12.method1027((byte) 64);
                class228.field3623[4] = var12.method996(65280);
            } else {
                if (var18 != 129) {
                    var12.field2231--;
                    break;
                }
                var17 = true;
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var12.method981(false);
                    if (var20 == 0) {
                        int var30 = arg7 + 64;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg7;
                        if (arg7 < 0) {
                            var31 = 0;
                        } else if (arg7 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg6;
                        int var33 = arg6 + 64;
                        if (arg6 < 0) {
                            var32 = 0;
                        } else if (arg6 >= 104) {
                            var32 = 104;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        while (var30 > var31) {
                            while (var32 < var33) {
                                class273.field4356[var19][var31][var32] = 0;
                                var32++;
                            }
                            var31++;
                        }
                    } else if (var20 == 1) {
                        for (int var21 = 0; var21 < 64; var21 += 4) {
                            for (int var22 = 0; var22 < 64; var22 += 4) {
                                byte var23 = var12.method981(false);
                                for (int var24 = var21 + arg7; var24 < arg7 + var21 + 4; var24++) {
                                    for (int var25 = arg6 + var22; var25 < (arg6 + var22 + 4); var25++) {
                                        if (var24 >= 0 && var24 < 104 && var25 >= 0 && var25 < 104) {
                                            class273.field4356[var19][var24][var25] = var23;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var26 = arg7 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg7;
                        int var28 = arg6;
                        if (arg7 < 0) {
                            var27 = 0;
                        } else if (arg7 >= 104) {
                            var27 = 104;
                        }
                        int var29 = arg6 + 64;
                        if (arg6 < 0) {
                            var28 = 0;
                        } else if (arg6 >= 104) {
                            var28 = 104;
                        }
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        while (var27 < var26) {
                            while (var28 < var29) {
                                class273.field4356[var19][var27][var28] = class273.field4356[var19 - 1][var27][var28];
                                var28++;
                            }
                            var27++;
                        }
                    }
                }
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg6 >> 2) + var36;
                        int var38 = (arg7 >> 2) + var35;
                        if (var38 >= 0 && var38 < 26 && var37 >= 0 && var37 < 26) {
                            class273.field4356[var34][var38][var37] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class228.field3623;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4312.paint(arg0);
        field4323++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1832(String arg0, String arg1, String arg2, boolean arg3) {
        field4321++;
        if (arg3) {
            for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg2.length() + var4)) {
                arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg0.length() + var4);
            }
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public static final void method1833(int arg0, int arg1, int arg2) {
        if (arg1 != 25049) {
            return;
        }
        class266 var3 = class2.field23[class92.field1448][arg0][arg2];
        field4309++;
        if (var3 == null) {
            class31.method274(class92.field1448, arg0, arg2);
            return;
        }
        class101 var4 = null;
        class101 var5 = (class101) var3.method1807(arg1 ^ 0xFFFF9E55);
        int var6 = -99999999;
        while (var5 != null) {
            class67 var13 = class190.method1314(var5.field1553.field3329, (byte) 68);
            int var14 = var13.field1098;
            if (var13.field1152 == 1) {
                var14 = (var5.field1553.field3333 + 1) * var14;
            }
            if (var14 > var6) {
                var6 = var14;
                var4 = var5;
            }
            var5 = (class101) var3.method1808((byte) 110);
        }
        if (var4 == null) {
            class31.method274(class92.field1448, arg0, arg2);
            return;
        }
        var3.method1810(var4, 7);
        class101 var7 = (class101) var3.method1807(arg1 - 25165);
        class207 var8 = null;
        class207 var9 = null;
        while (var7 != null) {
            class207 var12 = var7.field1553;
            if (var4.field1553.field3329 != var12.field3329) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3329 != var12.field3329 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class101) var3.method1808((byte) 98);
        }
        long var10 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class190.method1311(class92.field1448, arg0, arg2, class218.method1450(arg2 * 128 + 64, arg0 * 128 - -64, true, class92.field1448), var4.field1553, var10, var8, var9);
    }
}
