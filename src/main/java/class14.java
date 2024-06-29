import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class14 extends class59 {

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Lac;")
    private class153 field205;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Lhi;")
    public static class278 field201;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "[[S")
    public static short[][] field208;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lim;II)V")
    private final void method80(class170 arg0, int arg1, int arg2) {
        field206++;
        if (arg2 == 249) {
            int var4 = arg0.method1218(75);
            if (this.field205 == null) {
                int var5 = class297.method1997(66, var4);
                this.field205 = new class153(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1218(70) == 1;
                int var8 = arg0.method1212(460736848);
                class247 var9;
                if (var7) {
                    var9 = new class135(arg0.method1195(arg1 ^ 0xFFFFB325));
                } else {
                    var9 = new class178(arg0.method1190(6345));
                }
                this.field205.method1054(-3510, var9, (long) var8);
            }
        }
        if (arg1 != 19674) {
            field208 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public static final void method81(byte arg0) {
        field198++;
        if (!class8.field112) {
            return;
        }
        class8.field112 = false;
        class27.field317 = null;
        if (arg0 <= 109) {
            field207 = 31;
        }
        class305.field4868 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLjava/lang/String;I)Ljava/lang/String;")
    public final String method82(boolean arg0, String arg1, int arg2) {
        field200++;
        if (arg0) {
            method81((byte) 14);
        }
        if (this.field205 == null) {
            return arg1;
        } else {
            class135 var4 = (class135) this.field205.method1064(-1, (long) arg2);
            return var4 == null ? arg1 : var4.field1950;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILfe;II)V")
    public static final void method83(int arg0, class231 arg1, int arg2, int arg3) {
        field202++;
        if (arg1.field3683 == 1) {
            class28.method142("", -111, arg1.field3636, arg1.field3595, (short) 19, 0L, 0, -1);
            class120.field1731++;
        }
        if (arg1.field3683 == 2 && !class63.field911) {
            String var4 = class174.method1242(89, arg1);
            if (var4 != null) {
                class32.field385++;
                class28.method142("<col=00ff00>" + arg1.field3743, 62, var4, arg1.field3595, (short) 60, 0L, -1, -1);
            }
        }
        if (arg1.field3683 == 3) {
            class28.method142("", 115, class125.field1796, arg1.field3595, (short) 24, 0L, 0, -1);
            class273.field4449++;
        }
        if (arg1.field3683 == 4) {
            class253.field4136++;
            class28.method142("", 49, arg1.field3636, arg1.field3595, (short) 6, 0L, 0, -1);
        }
        if (arg1.field3683 == 5) {
            class28.method142("", arg0 + 41, arg1.field3636, arg1.field3595, (short) 50, 0L, 0, -1);
            class162.field2452++;
        }
        if (arg1.field3683 == 6 && class137.field1969 == null) {
            class28.method142("", 54, arg1.field3636, arg1.field3595, (short) 16, 0L, -1, -1);
            class200.field3165++;
        }
        if (arg0 != -1) {
            method81((byte) -57);
        }
        if (arg1.field3620 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field3592; var6++) {
                for (int var7 = 0; var7 < arg1.field3603; var7++) {
                    int var8 = (arg1.field3699 + 32) * var7;
                    int var9 = (arg1.field3714 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg1.field3604[var5];
                        var9 += arg1.field3671[var5];
                    }
                    if (arg2 >= var8 && arg3 >= var9 && (var8 + 32) > arg2 && var9 + 32 > arg3) {
                        class79.field1189 = var5;
                        class104.field1521 = arg1;
                        if (arg1.field3708[var5] > 0) {
                            class29 var10 = client.method1698(arg1);
                            class162 var11 = class104.method696((byte) -26, arg1.field3708[var5] - 1);
                            if (class197.field3123 == 1 && var10.method154(arg0 + 12030)) {
                                if (class175.field2760 != arg1.field3595 || class99.field1488 != var5) {
                                    class124.field1782++;
                                    class28.method142(class230.field3551 + " -> <col=ff9040>" + var11.field2425, -77, class179.field2800, arg1.field3595, (short) 36, (long) var11.field2475, var5, -1);
                                }
                            } else if (class63.field911 && var10.method154(12029)) {
                                class226 var12 = class78.field1181 == -1 ? null : class214.method1501(class78.field1181, (byte) -59);
                                if ((class111.field1613 & 0x10) != 0 && (var12 == null || var11.method1109(class78.field1181, var12.field3519, (byte) -65) != var12.field3519)) {
                                    class28.method142(class284.field4604 + " -> <col=ff9040>" + var11.field2425, -87, class59.field865, arg1.field3595, (short) 1, (long) var11.field2475, var5, class122.field1757);
                                    class50.field632++;
                                }
                            } else {
                                class72.field1060++;
                                String[] var13 = var11.field2464;
                                if (class287.field4637) {
                                    var13 = class20.method115(-6, var13);
                                }
                                if (var10.method154(12029)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class90.field1360++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 26;
                                            } else {
                                                var15 = 32;
                                            }
                                            class28.method142("<col=ff9040>" + var11.field2425, -102, var13[var14], arg1.field3595, var15, (long) var11.field2475, var5, -1);
                                        }
                                    }
                                }
                                if (var10.method152(125)) {
                                    class115.field1673++;
                                    class28.method142("<col=ff9040>" + var11.field2425, 88, class179.field2800, arg1.field3595, (short) 57, (long) var11.field2475, var5, class123.field1773);
                                }
                                if (var10.method154(12029) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class303.field4820++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 48;
                                            }
                                            if (var16 == 1) {
                                                var17 = 41;
                                            }
                                            if (var16 == 2) {
                                                var17 = 33;
                                            }
                                            class28.method142("<col=ff9040>" + var11.field2425, 40, var13[var16], arg1.field3595, var17, (long) var11.field2475, var5, -1);
                                        }
                                    }
                                }
                                String[] var18 = arg1.field3742;
                                if (class287.field4637) {
                                    var18 = class20.method115(-6, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class168.field2589++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 25;
                                            }
                                            if (var19 == 1) {
                                                var20 = 2;
                                            }
                                            if (var19 == 2) {
                                                var20 = 37;
                                            }
                                            if (var19 == 3) {
                                                var20 = 59;
                                            }
                                            if (var19 == 4) {
                                                var20 = 20;
                                            }
                                            class28.method142("<col=ff9040>" + var11.field2425, 107, var18[var19], arg1.field3595, var20, (long) var11.field2475, var5, -1);
                                        }
                                    }
                                }
                                class28.method142("<col=ff9040>" + var11.field2425, -77, class298.field4761, arg1.field3595, (short) 1011, (long) var11.field2475, var5, class104.field1522);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg1.field3585) {
            return;
        }
        if (class63.field911) {
            if (client.method1698(arg1).method145((byte) -63) && (class111.field1613 & 0x20) != 0) {
                class196.field3099++;
                class28.method142(class284.field4604 + " -> " + arg1.field3712, -92, class59.field865, arg1.field3595, (short) 10, 0L, arg1.field3739, class122.field1757);
                return;
            }
            return;
        }
        for (int var21 = 9; var21 >= 5; var21--) {
            String var25 = class218.method1531(arg1, var21, 0);
            if (var25 != null) {
                class28.method142(arg1.field3712, arg0 + 113, var25, arg1.field3595, (short) 1009, (long) (var21 + 1), arg1.field3739, class276.method1907(arg1, (byte) 122, var21));
                class245.field4004++;
            }
        }
        String var22 = class174.method1242(122, arg1);
        if (var22 != null) {
            class28.method142(arg1.field3712, -117, var22, arg1.field3595, (short) 60, 0L, arg1.field3739, -1);
            class32.field385++;
        }
        for (int var23 = 4; var23 >= 0; var23--) {
            String var24 = class218.method1531(arg1, var23, arg0 + 1);
            if (var24 != null) {
                class245.field4004++;
                class28.method142(arg1.field3712, arg0 - 107, var24, arg1.field3595, (short) 51, (long) (var23 + 1), arg1.field3739, class276.method1907(arg1, (byte) 122, var23));
            }
        }
        if (!client.method1698(arg1).method153((byte) -128)) {
            return;
        }
        if (arg1.field3713 == null) {
            class28.method142("", -82, class36.field437, arg1.field3595, (short) 16, 0L, arg1.field3739, -1);
        } else {
            class28.method142("", 42, arg1.field3713, arg1.field3595, (short) 16, 0L, arg1.field3739, -1);
        }
        class200.field3165++;
        return;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field204++;
        int var6 = arg4 - arg3;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class86.method587(arg5, arg1, arg3, arg4, (byte) -69);
            }
        } else if (var6 == 0) {
            class179.method1266(arg5, arg0, arg3, arg1, arg2 ^ 0x5A01780F);
        } else if (arg2 == 1510045708) {
            int var8 = (var6 << 12) / var7;
            int var9 = arg3 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class56.field816 > arg0) {
                var10 = var9 + (class56.field816 * var8 >> 12);
                var11 = class56.field816;
            } else if (arg0 <= class187.field2938) {
                var11 = arg0;
                var10 = arg4;
            } else {
                var10 = (class187.field2938 * var8 >> 12) + var9;
                var11 = class187.field2938;
            }
            if (class115.field1678 > var10) {
                var11 = (class115.field1678 - var9 << 12) / var8;
                var10 = class115.field1678;
            } else if (var10 > class60.field882) {
                var11 = (class60.field882 - var9 << 12) / var8;
                var10 = class60.field882;
            }
            int var12;
            int var13;
            if (class56.field816 > arg5) {
                var12 = class56.field816;
                var13 = var9 + (class56.field816 * var8 >> 12);
            } else if (arg5 > class187.field2938) {
                var12 = class187.field2938;
                var13 = var9 + (class187.field2938 * var8 >> 12);
            } else {
                var12 = arg5;
                var13 = arg3;
            }
            if (class115.field1678 > var13) {
                var13 = class115.field1678;
                var12 = (class115.field1678 - var9 << 12) / var8;
            } else if (var13 > class60.field882) {
                var12 = (class60.field882 - var9 << 12) / var8;
                var13 = class60.field882;
            }
            class209.method1451(var11, var10, 5238, var12, arg1, var13);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I")
    public final int method85(int arg0, int arg1, int arg2) {
        field203++;
        if (this.field205 == null) {
            return arg0;
        } else {
            int var4 = 16 % ((46 - arg2) / 50);
            class178 var5 = (class178) this.field205.method1064(-1, (long) arg1);
            return var5 == null ? arg0 : var5.field2789;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method86(int arg0) {
        field208 = null;
        if (arg0 <= 100) {
            field208 = null;
        }
        field201 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lim;B)V")
    public final void method87(class170 arg0, byte arg1) {
        field199++;
        if (arg1 != -23) {
            return;
        }
        while (true) {
            int var3 = arg0.method1218(-102);
            if (var3 == 0) {
                return;
            }
            this.method80(arg0, arg1 + 19697, var3);
        }
    }
}
