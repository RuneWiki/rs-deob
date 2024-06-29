import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class60 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
    public static boolean field1611 = false;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lke;")
    public static class65 field1608 = class1.method17("@gr1@", -128);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lke;")
    public static class65 field1606 = class1.method17("scrollbar", -111);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lke;")
    public static class65 field1614 = class1.method17("sich mit einer anderen Welt zu verbinden)3", -111);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lke;")
    public static class65 field1607 = class1.method17("RuneScape wurde aktualisiert(Q", -118);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lke;")
    public static class65 field1617 = class1.method17("Schlie-8en", -116);

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lke;")
    public static class65 field1613 = class1.method17("Verbindung mit Freunde)2Server)3)3)3", -115);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lke;")
    private static class65 field1609 = class1.method17("Connecting to friendserver", -112);

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field1618 = 0;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lke;")
    public static class65 field1621 = class1.method17("Ihr Spielkonto wird bereits benutzt)3", -123);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lke;")
    public static class65 field1616 = field1609;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Ljd;")
    public static class58 field1620;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lpa;")
    public static class90 field1619;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILne;IIILle;IIBI)V", line = 27)
    public static final void method503(int arg0, class83 arg1, int arg2, int arg3, int arg4, class71 arg5, int arg6, int arg7, byte arg8, int arg9) {
        field1612++;
        int var10 = class24.field611[arg0][arg6 + 1][arg7];
        int var11 = class24.field611[arg0][arg6 + 1][arg7 + 1];
        int var12 = class24.field611[arg0][arg6][arg7];
        int var13 = class24.field611[arg0][arg6][arg7 + 1];
        class19 var14 = class54.method435(32247, arg4);
        int var15 = var11 + var12 + var10 + var13 >> 2;
        int var16 = (arg3 << 6) + arg9;
        if (var14.field416 == 1) {
            var16 += 256;
        }
        int var17 = (arg7 << 7) + arg6 + (arg4 << 14) + 1073741824;
        if (var14.field453 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class6 var18;
            if (var14.field446 == -1 && var14.field439 == null) {
                var18 = var14.method155(arg3, var13, (byte) 102, var10, 22, var12, var11);
            } else {
                var18 = new class99(arg4, 22, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method616(arg2, arg6, arg7, var15, var18, var17, var16);
            if (var14.field438 && var14.field453 == 1) {
                arg1.method745(arg6, 119, arg7);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class6 var39;
            if (var14.field446 == -1 && var14.field439 == null) {
                var39 = var14.method155(arg3, var13, (byte) 94, var10, 10, var12, var11);
            } else {
                var39 = new class99(arg4, 10, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            if (var39 != null) {
                int var40;
                int var41;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var14.field432;
                    var40 = var14.field415;
                } else {
                    var40 = var14.field432;
                    var41 = var14.field415;
                }
                int var42 = 0;
                if (arg9 == 11) {
                    var42 += 256;
                }
                arg5.method620(arg2, arg6, arg7, var15, var41, var40, var39, var42, var17, var16);
            }
            if (var14.field438) {
                arg1.method741(var14.field432, arg3, arg7, (byte) 78, var14.field415, var14.field465, arg6);
            }
        } else if (arg9 >= 12) {
            class6 var19;
            if (var14.field446 == -1 && var14.field439 == null) {
                var19 = var14.method155(arg3, var13, (byte) 99, var10, arg9, var12, var11);
            } else {
                var19 = new class99(arg4, arg9, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method620(arg2, arg6, arg7, var15, 1, 1, var19, 0, var17, var16);
            if (var14.field438) {
                arg1.method741(var14.field432, arg3, arg7, (byte) -94, var14.field415, var14.field465, arg6);
            }
        } else if (arg9 == 0) {
            class6 var20;
            if (var14.field446 == -1 && var14.field439 == null) {
                var20 = var14.method155(arg3, var13, (byte) 103, var10, 0, var12, var11);
            } else {
                var20 = new class99(arg4, 0, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method625(arg2, arg6, arg7, var15, var20, null, class21.field502[arg3], 0, var17, var16);
            if (var14.field438) {
                arg1.method734(var14.field465, arg3, arg7, arg9, 8565, arg6);
            }
        } else if (arg9 == 1) {
            class6 var21;
            if (var14.field446 == -1 && var14.field439 == null) {
                var21 = var14.method155(arg3, var13, (byte) 124, var10, 1, var12, var11);
            } else {
                var21 = new class99(arg4, 1, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method625(arg2, arg6, arg7, var15, var21, null, class89.field2373[arg3], 0, var17, var16);
            if (var14.field438) {
                arg1.method734(var14.field465, arg3, arg7, arg9, 8565, arg6);
            }
        } else if (arg9 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class6 var23;
            class6 var24;
            if (var14.field446 == -1 && var14.field439 == null) {
                var23 = var14.method155(arg3 + 4, var13, (byte) 106, var10, 2, var12, var11);
                var24 = var14.method155(var22, var13, (byte) 97, var10, 2, var12, var11);
            } else {
                var23 = new class99(arg4, 2, arg3 + 4, var12, var10, var11, var13, var14.field446, true);
                var24 = new class99(arg4, 2, var22, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method625(arg2, arg6, arg7, var15, var23, var24, class21.field502[arg3], class21.field502[var22], var17, var16);
            if (var14.field438) {
                arg1.method734(var14.field465, arg3, arg7, arg9, 8565, arg6);
            }
        } else if (arg9 == 3) {
            class6 var25;
            if (var14.field446 == -1 && var14.field439 == null) {
                var25 = var14.method155(arg3, var13, (byte) 96, var10, 3, var12, var11);
            } else {
                var25 = new class99(arg4, 3, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method625(arg2, arg6, arg7, var15, var25, null, class89.field2373[arg3], 0, var17, var16);
            if (var14.field438) {
                arg1.method734(var14.field465, arg3, arg7, arg9, 8565, arg6);
            }
        } else if (arg9 == 9) {
            class6 var26;
            if (var14.field446 == -1 && var14.field439 == null) {
                var26 = var14.method155(arg3, var13, (byte) 94, var10, arg9, var12, var11);
            } else {
                var26 = new class99(arg4, arg9, arg3, var12, var10, var11, var13, var14.field446, true);
            }
            arg5.method620(arg2, arg6, arg7, var15, 1, 1, var26, 0, var17, var16);
            if (var14.field438) {
                arg1.method741(var14.field432, arg3, arg7, (byte) 57, var14.field415, var14.field465, arg6);
            }
        } else {
            if (var14.field428) {
                if (arg3 == 1) {
                    int var30 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var12;
                    var12 = var30;
                } else if (arg3 == 2) {
                    int var27 = var13;
                    var13 = var10;
                    var10 = var27;
                    int var28 = var11;
                    var11 = var12;
                    var12 = var28;
                } else if (arg3 == 3) {
                    int var29 = var13;
                    var13 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var29;
                }
            }
            if (arg9 == 4) {
                class6 var31;
                if (var14.field446 == -1 && var14.field439 == null) {
                    var31 = var14.method155(0, var13, (byte) 117, var10, 4, var12, var11);
                } else {
                    var31 = new class99(arg4, 4, 0, var12, var10, var11, var13, var14.field446, true);
                }
                arg5.method595(arg2, arg6, arg7, var15, var31, class21.field502[arg3], arg3 * 512, 0, 0, var17, var16);
            } else if (arg9 == 5) {
                int var32 = 16;
                int var33 = arg5.method614(arg2, arg6, arg7);
                if (var33 > 0) {
                    var32 = class54.method435(32247, var33 >> 14 & 0x7FFF).field437;
                }
                class6 var34;
                if (var14.field446 == -1 && var14.field439 == null) {
                    var34 = var14.method155(0, var13, (byte) 109, var10, 4, var12, var11);
                } else {
                    var34 = new class99(arg4, 4, 0, var12, var10, var11, var13, var14.field446, true);
                }
                arg5.method595(arg2, arg6, arg7, var15, var34, class21.field502[arg3], arg3 * 512, class80.field2123[arg3] * var32, class46.field1204[arg3] * var32, var17, var16);
            } else if (arg9 == 6) {
                class6 var35;
                if (var14.field446 == -1 && var14.field439 == null) {
                    var35 = var14.method155(0, var13, (byte) 102, var10, 4, var12, var11);
                } else {
                    var35 = new class99(arg4, 4, 0, var12, var10, var11, var13, var14.field446, true);
                }
                arg5.method595(arg2, arg6, arg7, var15, var35, 256, arg3, 0, 0, var17, var16);
            } else if (arg9 == 7) {
                class6 var36;
                if (var14.field446 == -1 && var14.field439 == null) {
                    var36 = var14.method155(0, var13, (byte) 99, var10, 4, var12, var11);
                } else {
                    var36 = new class99(arg4, 4, 0, var12, var10, var11, var13, var14.field446, true);
                }
                arg5.method595(arg2, arg6, arg7, var15, var36, 512, arg3, 0, 0, var17, var16);
            } else {
                int var37 = -1 % ((-arg8 - 50) / 48);
                if (arg9 == 8) {
                    class6 var38;
                    if (var14.field446 == -1 && var14.field439 == null) {
                        var38 = var14.method155(0, var13, (byte) 87, var10, 4, var12, var11);
                    } else {
                        var38 = new class99(arg4, 4, 0, var12, var10, var11, var13, var14.field446, true);
                    }
                    arg5.method595(arg2, arg6, arg7, var15, var38, 768, arg3, 0, 0, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lec;B)Z", line = 339)
    public static final boolean method504(class27 arg0, byte arg1) {
        if (arg1 != 96) {
            return false;
        }
        field1615++;
        int var2 = arg0.field705;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class7.field140++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class97.method812(0, class27.field733, -119, class21.method172(arg1 - 191, new class65[] { class90.field2380, class86.field2286[var2] }), 32, 0, 0);
            class97.method812(0, class131.field3181, -128, class21.method172(-39, new class65[] { class90.field2380, class86.field2286[var2] }), 10, 0, 0);
            class91.field2395++;
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class57.field1518++;
            class97.method812(0, class27.field733, -124, class21.method172(-100, new class65[] { class90.field2380, arg0.field715 }), 9, 0, 0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 389)
    public static void method505(byte arg0) {
        field1607 = null;
        field1620 = null;
        field1609 = null;
        field1617 = null;
        field1606 = null;
        field1616 = null;
        if (arg0 < 83) {
            field1609 = null;
        }
        field1619 = null;
        field1613 = null;
        field1608 = null;
        field1614 = null;
        field1621 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 416)
    public static final void method506(int arg0) {
        field1610++;
        if (arg0 != 102) {
            method503(124, null, -21, -59, 69, null, 87, -1, (byte) -116, -23);
        }
        for (class22 var1 = (class22) class104.field2663.method421(arg0 - 101); var1 != null; var1 = (class22) class104.field2663.method428(22743)) {
            if (var1.field544 > 0) {
                var1.field544--;
            }
            if (var1.field544 != 0) {
                if (var1.field534 > 0) {
                    var1.field534--;
                }
                if (var1.field534 == 0 && var1.field546 >= 1 && var1.field541 >= 1 && var1.field546 <= 102 && var1.field541 <= 102 && (var1.field530 < 0 || class123.method977(var1.field530, var1.field523, 56))) {
                    class114.method933(var1.field546, var1.field536, var1.field522, var1.field541, true, var1.field523, var1.field530, var1.field548);
                    var1.field534 = -1;
                    if (var1.field540 == var1.field530 && var1.field540 == -1) {
                        var1.method133(2);
                    } else if (var1.field540 == var1.field530 && var1.field527 == var1.field522 && var1.field547 == var1.field523) {
                        var1.method133(arg0 ^ 0x64);
                    }
                }
            } else if (var1.field540 < 0 || class123.method977(var1.field540, var1.field547, -123)) {
                class114.method933(var1.field546, var1.field536, var1.field527, var1.field541, true, var1.field547, var1.field540, var1.field548);
                var1.method133(arg0 ^ 0x64);
            }
        }
    }
}
