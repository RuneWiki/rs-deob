import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class8 extends class137 {

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Ltl;")
    public static class59 field94 = class85.method639("overlay", 9588);

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "J")
    public static long field99 = 0L;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Lme;")
    public static class295 field108;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Ltl;")
    public class59 field97;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 9)
    public static void method58(byte arg0) {
        field108 = null;
        field94 = null;
        if (arg0 >= -47) {
            field99 = 54L;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public static final void method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 1) {
            return;
        }
        field100++;
        if (class11.field138 == 0) {
            class13.field174++;
            int var7 = class268.field4662;
            int var8 = class233.field3837;
            int var9 = class72.field1130;
            int var10 = class286.field4916;
            int var11 = (var8 - var7) * (arg2 - arg1) / arg3 + var7;
            int var12 = (arg5 - arg4) * (var10 - var9) / arg6 + var9;
            if (class219.field3556 && (class59.field908 & 0x40) == 64) {
                class263 var13 = class297.method2067(class27.field362, arg0 + 64, class39.field588);
                if (var13 == null) {
                    class316.method2174(arg0 ^ 0xFFFFFF8D);
                } else {
                    class120.method896(0L, (short) 5, (byte) 111, class88.field1387, var11, class249.field4141, var12);
                }
            } else {
                class120.method896(0L, (short) 19, (byte) 121, class275.field4742, var11, class189.field3159, var12);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class26.field336; var16++) {
            long var17 = class215.field3521[var16];
            int var19 = ((int) var17 & 0x3FE5) >> 7;
            int var20 = (int) var17 & 0x7F;
            int var21 = ((int) var17 & 0x6FAB7C03) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class260.method1803(class247.field4119, var20, var19, var17)) {
                    class180 var23 = class188.method1390(var22, false);
                    if (var23.field3005 != null) {
                        var23 = var23.method1335(false);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class11.field138 == 1) {
                        class120.method896(var17, (short) 26, (byte) 125, class233.method1630(new class59[] { class211.field3464, class239.field3988, var23.field2992 }, -2883), var20, class146.field2385, var19);
                        class308.field5245++;
                    } else if (!class219.field3556) {
                        class69.field1058++;
                        class59[] var24 = var23.field3002;
                        if (class31.field434) {
                            var24 = class143.method1044(-992, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class268.field4663++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 7;
                                    }
                                    if (var25 == 1) {
                                        var26 = 41;
                                    }
                                    if (var25 == 2) {
                                        var26 = 48;
                                    }
                                    if (var25 == 3) {
                                        var26 = 39;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1002;
                                    }
                                    class120.method896(var17, var26, (byte) 110, class233.method1630(new class59[] { class282.field4860, var23.field2992 }, arg0 ^ 0xFFFFF4BC), var20, var24[var25], var19);
                                }
                            }
                        }
                        class120.method896((long) var23.field2981, (short) 1003, (byte) 111, class233.method1630(new class59[] { class282.field4860, var23.field2992 }, arg0 - 2884), var20, class187.field3138, var19);
                    } else if ((class59.field908 & 0x4) == 4) {
                        class120.method896(var17, (short) 36, (byte) 117, class233.method1630(new class59[] { class231.field3792, class239.field3988, var23.field2992 }, -2883), var20, class249.field4141, var19);
                        class293.field4996++;
                    }
                }
                if (var21 == 1) {
                    class23 var27 = class23.field311[var22];
                    if (var27.field314.field1948 == 1 && (var27.field1774 & 0x7F) == 64 && (var27.field1769 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class185.field3107; var28++) {
                            class23 var29 = class23.field311[class232.field3816[var28]];
                            if (var29 != null && var27 != var29 && var29.field314.field1948 == 1 && var27.field1774 == var29.field1774 && var27.field1769 == var29.field1769) {
                                class96.method723(var19, class232.field3816[var28], var20, var29.field314, 1);
                            }
                        }
                        for (int var30 = 0; var30 < class29.field385; var30++) {
                            class102 var31 = class211.field3438[class243.field4060[var30]];
                            if (var31 != null && var27.field1774 == var31.field1774 && var27.field1769 == var31.field1769) {
                                client.method274(class243.field4060[var30], (byte) 77, var20, var31, var19);
                            }
                        }
                    }
                    class96.method723(var19, var22, var20, var27.field314, arg0 ^ 0x0);
                }
                if (var21 == 0) {
                    class102 var32 = class211.field3438[var22];
                    if ((var32.field1774 & 0x7F) == 64 && (var32.field1769 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class185.field3107; var33++) {
                            class23 var34 = class23.field311[class232.field3816[var33]];
                            if (var34 != null && var34.field314.field1948 == 1 && var32.field1774 == var34.field1774 && var32.field1769 == var34.field1769) {
                                class96.method723(var19, class232.field3816[var33], var20, var34.field314, arg0);
                            }
                        }
                        for (int var35 = 0; var35 < class29.field385; var35++) {
                            class102 var36 = class211.field3438[class243.field4060[var35]];
                            if (var36 != null && var32 != var36 && var32.field1774 == var36.field1774 && var32.field1769 == var36.field1769) {
                                client.method274(class243.field4060[var35], (byte) -101, var20, var36, var19);
                            }
                        }
                    }
                    client.method274(var22, (byte) -98, var20, var32, var19);
                }
                if (var21 == 3) {
                    class64 var37 = class159.field2604[class247.field4119][var20][var19];
                    if (var37 != null) {
                        for (class294 var38 = (class294) var37.method529(false); var38 != null; var38 = (class294) var37.method535(arg0 ^ 0x736D)) {
                            int var39 = var38.field5013.field4845;
                            class44 var40 = class81.method616(var39, (byte) 25);
                            if (class11.field138 == 1) {
                                class120.method896((long) var39, (short) 44, (byte) 126, class233.method1630(new class59[] { class211.field3464, class153.field2507, var40.field699 }, arg0 ^ 0xFFFFF4BC), var20, class146.field2385, var19);
                                class145.field2375++;
                            } else if (!class219.field3556) {
                                class59[] var41 = var40.field661;
                                if (class31.field434) {
                                    var41 = class143.method1044(-992, var41);
                                }
                                class129.field2136++;
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 3;
                                        }
                                        if (var42 == 1) {
                                            var43 = 29;
                                        }
                                        if (var42 == 2) {
                                            var43 = 42;
                                        }
                                        if (var42 == 3) {
                                            var43 = 23;
                                        }
                                        if (var42 == 4) {
                                            var43 = 8;
                                        }
                                        class201.field3329++;
                                        class120.method896((long) var39, var43, (byte) 124, class233.method1630(new class59[] { class1.field6, var40.field699 }, -2883), var20, var41[var42], var19);
                                    } else if (var42 == 2) {
                                        class174.field2858++;
                                        class120.method896((long) var39, (short) 42, (byte) 112, class233.method1630(new class59[] { class1.field6, var40.field699 }, -2883), var20, class263.field4417, var19);
                                    }
                                }
                                class120.method896((long) var39, (short) 1001, (byte) 118, class233.method1630(new class59[] { class1.field6, var40.field699 }, -2883), var20, class187.field3138, var19);
                            } else if ((class59.field908 & 0x1) == 1) {
                                class312.field5295++;
                                class120.method896((long) var39, (short) 6, (byte) 127, class233.method1630(new class59[] { class231.field3792, class153.field2507, var40.field699 }, arg0 - 2884), var20, class249.field4141, var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 342)
    public static final void method60(int arg0) {
        field102++;
        if (arg0 > -72) {
            method59(74, 91, -120, 24, 60, -1, 94);
        }
        class138.field2280.method1484(false);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)Z", line = 353)
    public final boolean method61(int arg0) {
        if (arg0 != 1002) {
            field99 = 68L;
        }
        field101++;
        return this.field109 == 115;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILs;Z)V", line = 365)
    private final void method62(int arg0, class170 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field109 = arg1.method1221(125);
        } else if (arg0 == 2) {
            this.field107 = arg1.method1233((byte) -77);
        } else if (arg0 == 5) {
            this.field97 = arg1.method1250(false);
        }
        field106++;
        if (arg2) {
            this.method61(26);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lid;", line = 389)
    public static final class173 method63(int arg0, int arg1) {
        field105++;
        class173 var2 = (class173) class172.field2834.method1006((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 40) {
            field104 = 61;
        }
        byte[] var3 = class280.field4814.method2042(5, arg0, (byte) -124);
        class173 var4 = new class173();
        if (var3 != null) {
            var4.method1272(new class170(var3), 0);
        }
        class172.field2834.method1008(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLtl;)V", line = 430)
    public static final void method64(byte arg0, class59 arg1) {
        if (arg0 <= 24) {
            method60(23);
        }
        class245.method1733(0);
        field96++;
        class189.method1397(false, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ls;I)V", line = 450)
    public final void method65(class170 arg0, int arg1) {
        field103++;
        if (arg1 < 68) {
            method66(-55, -127, -12, 55, 114, -52, -43);
        }
        while (true) {
            int var3 = arg0.method1221(127);
            if (var3 == 0) {
                return;
            }
            this.method62(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIII)V", line = 475)
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field95++;
        class71[] var7 = class200.field3318;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class71 var9 = var7[var8];
            if (var9 != null && var9.field1107 == 2) {
                class169.method1193(var9.field1101 * 2, arg5 >> 1, arg2, (byte) -126, (var9.field1109 - class187.field3135 << 7) + var9.field1100, (-class197.field3249 + var9.field1111 << 7) + var9.field1103, arg3, arg1 >> 1);
                if (class13.field181 > -1 && (class30.field420 % 20) < 10) {
                    class291.field4976[var9.field1105].method337(arg6 - (12 - class13.field181), class292.field4992 + arg0 + -28);
                }
            }
        }
        if (arg4 != 2) {
            method63(46, -108);
        }
    }
}
