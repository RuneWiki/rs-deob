import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class234 extends class200 {

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Loa;")
    private class99 field4030 = class105.field1759;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field4028 = 0;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field4031 = 0;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Z")
    public static boolean field4034 = false;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Loa;")
    public static class99 field4032 = class221.method1463(2844, "Continuer");

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field4024 = 0;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Loa;")
    public static class99 field4025 = class221.method1463(2844, ": ");

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field4042 = -1;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Z")
    public static boolean field4038 = false;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public int field4027;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Lbg;")
    private class237 field4035;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lbg;")
    public class237 field4043;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILik;)V")
    private final void method1522(int arg0, int arg1, class261 arg2) {
        if (arg1 > -79) {
            this.field4035 = null;
        }
        field4037++;
        if (arg0 == 1) {
            this.field4027 = arg2.method1693((byte) -117);
        } else if (arg0 == 2) {
            this.field4033 = arg2.method1693((byte) -122);
        } else if (arg0 == 3) {
            this.field4030 = arg2.method1705(120);
        } else if (arg0 == 4) {
            this.field4044 = arg2.method1712(-4);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1740((byte) 65);
            this.field4043 = new class237(class48.method342(1049852161, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1712(-4);
                class125 var7;
                if (arg0 == 5) {
                    var7 = new class169(arg2.method1705(-75));
                } else {
                    var7 = new class208(arg2.method1712(-4));
                }
                this.field4043.method1544((byte) 110, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Loa;")
    public final class99 method1523(int arg0, int arg1) {
        field4047++;
        if (this.field4043 == null) {
            return this.field4030;
        }
        if (arg1 != 104) {
            this.method1523(-27, -57);
        }
        class169 var3 = (class169) this.field4043.method1550(true, (long) arg0);
        return var3 == null ? this.field4030 : var3.field3016;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
    private final void method1524(byte arg0) {
        this.field4035 = new class237(this.field4043.method1553((byte) -127));
        if (arg0 > -57) {
            this.field4030 = null;
        }
        field4029++;
        for (class208 var2 = (class208) this.field4043.method1552(108); var2 != null; var2 = (class208) this.field4043.method1549(72)) {
            class208 var3 = new class208((int) var2.field2187);
            this.field4035.method1544((byte) -76, (long) var2.field3605, var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public static void method1525(int arg0) {
        if (arg0 < 126) {
            method1526(true);
        }
        field4025 = null;
        field4032 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public static final void method1526(boolean arg0) {
        if (!arg0) {
            return;
        }
        class129.field2252.method973(false);
        field4045++;
        int var1 = class129.field2252.method975(8, arg0);
        if (class102.field1735 > var1) {
            for (int var2 = var1; var2 < class102.field1735; var2++) {
                class100.field1715[client.field2779++] = class239.field4120[var2];
            }
        }
        if (var1 > class102.field1735) {
            throw new RuntimeException("gnpov1");
        }
        class102.field1735 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class239.field4120[var3];
            class156 var5 = class248.field4287[var4];
            int var6 = class129.field2252.method975(1, true);
            if (var6 == 0) {
                class239.field4120[class102.field1735++] = var4;
                var5.field1274 = class56.field926;
            } else {
                int var7 = class129.field2252.method975(2, true);
                if (var7 == 0) {
                    class239.field4120[class102.field1735++] = var4;
                    var5.field1274 = class56.field926;
                    class25.field438[class64.field1078++] = var4;
                } else if (var7 == 1) {
                    class239.field4120[class102.field1735++] = var4;
                    var5.field1274 = class56.field926;
                    int var8 = class129.field2252.method975(3, arg0);
                    var5.method523(var8, false, (byte) 93);
                    int var9 = class129.field2252.method975(1, true);
                    if (var9 == 1) {
                        class25.field438[class64.field1078++] = var4;
                    }
                } else if (var7 == 2) {
                    class239.field4120[class102.field1735++] = var4;
                    var5.field1274 = class56.field926;
                    int var10 = class129.field2252.method975(3, true);
                    var5.method523(var10, true, (byte) -106);
                    int var11 = class129.field2252.method975(3, true);
                    var5.method523(var11, true, (byte) 69);
                    int var12 = class129.field2252.method975(1, arg0);
                    if (var12 == 1) {
                        class25.field438[class64.field1078++] = var4;
                    }
                } else if (var7 == 3) {
                    class100.field1715[client.field2779++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lob;Z[BIIIII)V")
    public static final void method1527(class131[] arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4036++;
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg1) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg7 + var10) > 0 && arg7 + var10 < 103 && (arg4 + var11) > 0 && (arg4 + var11) < 103) {
                            arg0[var9].field2272[arg7 + var10][arg4 + var11] = class71.method502(arg0[var9].field2272[arg7 + var10][arg4 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class261 var12 = new class261(arg2);
        if (arg3 != 128) {
            method1527((class131[]) null, true, (byte[]) null, -54, -33, -44, -30, 37);
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var36 = 0; var36 < 64; var36++) {
                for (int var37 = 0; var37 < 64; var37++) {
                    class220.method1461(var13, arg1, var12, arg7 + var36, arg6, arg5, 0, (byte) 116, arg4 + var37);
                }
            }
        }
        boolean var14 = false;
        while (var12.field4587 < var12.field4619.length) {
            int var15 = var12.method1693((byte) 52);
            if (var15 != 129) {
                var12.field4587--;
                break;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = var12.method1706(10819);
                if (var17 == 0) {
                    int var18 = arg7;
                    int var19 = arg7 + 64;
                    int var20 = arg4;
                    if (arg4 < 0) {
                        var20 = 0;
                    } else if (arg4 >= 104) {
                        var20 = 104;
                    }
                    if (arg7 < 0) {
                        var18 = 0;
                    } else if (arg7 >= 104) {
                        var18 = 104;
                    }
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 >= 104) {
                        var19 = 104;
                    }
                    int var21 = arg4 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    while (var19 > var18) {
                        while (var20 < var21) {
                            class223.field3871[var16][var18][var20] = 0;
                            var20++;
                        }
                        var18++;
                    }
                } else if (var17 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var12.method1706(10819);
                            for (int var25 = arg7 + var22; var25 < var22 + arg7 + 4; var25++) {
                                for (int var26 = var23 + arg4; var26 < var23 + arg4 + 4; var26++) {
                                    if (var25 >= 0 && var25 < 104 && var26 >= 0 && var26 < 104) {
                                        class223.field3871[var16][var25][var26] = var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && var16 > 0) {
                    int var27 = arg7;
                    if (arg7 < 0) {
                        var27 = 0;
                    } else if (arg7 >= 104) {
                        var27 = 104;
                    }
                    int var28 = arg7 + 64;
                    int var29 = arg4;
                    if (arg4 < 0) {
                        var29 = 0;
                    } else if (arg4 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg4 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 >= 104) {
                        var28 = 104;
                    }
                    while (var28 > var27) {
                        while (var30 > var29) {
                            class223.field3871[var16][var27][var29] = class223.field3871[var16 - 1][var27][var29];
                            var29++;
                        }
                        var27++;
                    }
                }
            }
            var14 = true;
        }
        if (var14) {
            return;
        }
        for (int var31 = 0; var31 < 4; var31++) {
            for (int var32 = 0; var32 < 16; var32++) {
                for (int var33 = 0; var33 < 16; var33++) {
                    int var34 = (arg4 >> 2) + var33;
                    int var35 = (arg7 >> 2) + var32;
                    if (var35 >= 0 && var35 < 26 && var34 >= 0 && var34 < 26) {
                        class223.field3871[var31][var35][var34] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Z")
    public final boolean method1528(int arg0, int arg1) {
        field4048++;
        if (this.field4043 == null) {
            return false;
        }
        if (this.field4035 == null) {
            this.method1524((byte) -80);
        }
        if (arg1 == -1) {
            class208 var3 = (class208) this.field4035.method1550(true, (long) arg0);
            return var3 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lik;I)V")
    public final void method1529(class261 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1693((byte) -111);
            if (var3 == 0) {
                field4039++;
                if (arg1 != -1) {
                    this.method1532(false, 64);
                    return;
                }
                return;
            }
            this.method1522(var3, -96, arg0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Luk;IIIII)V")
    public static final void method1530(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class13.field128 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class253.field4372) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class172.field3051 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class216 var14 = class128.field2236[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class189.field3337[var11][var12 + 1][var13] + class189.field3337[var11][var12][var13] + class189.field3337[var11][var12][var13 + 1] + class189.field3337[var11][var12 + 1][var13 + 1]) / 4 - (class189.field3337[arg1][arg2 + 1][arg3] + class189.field3337[arg1][arg2][arg3] + class189.field3337[arg1][arg2][arg3 + 1] + class189.field3337[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class167 var16 = var14.field3762;
                                    if (var16 != null) {
                                        if (var16.field2988.method653()) {
                                            arg0.method651(var16.field2988, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2989 != null && var16.field2989.method653()) {
                                            arg0.method651(var16.field2989, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3748; var17++) {
                                        class77 var18 = var14.field3743[var17];
                                        if (var18 != null && var18.field1367.method653() && (var18.field1362 == var12 || var7 == var12) && (var18.field1357 == var13 || var9 == var13)) {
                                            int var19 = var18.field1361 + 1 - var18.field1362;
                                            int var20 = var18.field1371 + 1 - var18.field1357;
                                            arg0.method651(var18.field1367, (var18.field1362 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1357 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    private final void method1531(int arg0) {
        field4040++;
        if (arg0 != -9310) {
            field4031 = -89;
        }
        this.field4035 = new class237(this.field4043.method1553((byte) -127));
        for (class169 var2 = (class169) this.field4043.method1552(127); var2 != null; var2 = (class169) this.field4043.method1549(arg0 ^ 0xFFFFDBD1)) {
            class189 var3 = new class189(var2.field3016, (int) var2.field2187);
            this.field4035.method1544((byte) -40, var2.field3016.method665(true), var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ZI)I")
    public final int method1532(boolean arg0, int arg1) {
        if (arg0) {
            return 34;
        }
        field4026++;
        if (this.field4043 == null) {
            return this.field4044;
        } else {
            class208 var3 = (class208) this.field4043.method1550(true, (long) arg1);
            return var3 == null ? this.field4044 : var3.field3605;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILoa;)Z")
    public final boolean method1533(int arg0, class99 arg1) {
        field4041++;
        if (this.field4043 == null) {
            return false;
        }
        if (arg0 != -1) {
            field4028 = 16;
        }
        if (this.field4035 == null) {
            this.method1531(-9310);
        }
        for (class189 var3 = (class189) this.field4035.method1550(true, arg1.method665(true)); var3 != null; var3 = (class189) this.field4035.method1547(arg0 + 8022)) {
            if (var3.field3331.method679((byte) -122, arg1)) {
                return true;
            }
        }
        return false;
    }
}
