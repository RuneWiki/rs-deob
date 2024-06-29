import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends RuntimeException {

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1029;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Ljava/lang/String;")
    public String field1030;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1031 = -1;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lpd;")
    public static class94 field1028 = class28.method249(-101, "Freunde");

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lpd;")
    public static class94 field1032 = class28.method249(-72, "und haben es deaktiviert)3 Benutzen Sie die");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lpd;")
    public static class94 field1019 = class28.method249(78, " )2> ");

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lpd;")
    private static class94 field1037 = class28.method249(-60, "slide:");

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lpd;")
    public static class94 field1034 = field1037;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lla;")
    public static class66 field1024;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lla;")
    public static class66 field1026;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "[[[B")
    public static byte[][][] field1038;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I", line = 13)
    public static final int method300(int arg0, int arg1, int arg2) {
        field1020++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & arg2) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lse;", line = 47)
    public static final class113 method301(int arg0, byte arg1) {
        if (arg1 != 16) {
            method301(59, (byte) -64);
        }
        field1033++;
        class113 var2 = (class113) class43.field1090.method1007((long) arg0, (byte) -103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field1018.method808((byte) -85, 9, arg0);
        class113 var4 = new class113();
        var4.field2840 = arg0;
        if (var3 != null) {
            var4.method842(arg1 ^ 0x10, new class122(var3));
        }
        var4.method847(arg1 - 16);
        class43.field1090.method1012(50, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Component;Lbd;)V", line = 82)
    public static final void method302(int arg0, Component arg1, class11 arg2) {
        field1022++;
        try {
            class65 var3 = (class65) Class.forName("ne").getDeclaredConstructor().newInstance();
            var3.method492(arg2, 2048);
            class62.field1518 = var3;
        } catch (Throwable var6) {
            try {
                class62.field1518 = new class96(arg2, arg1);
            } catch (Throwable var5) {
                if (~class11.field282.toLowerCase().indexOf("microsoft") <= arg0) {
                    try {
                        class62.field1518 = new class68();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class62.field1518 = new class85(8000);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 119)
    public static final void method303(byte arg0) {
        field1021++;
        if (class86.field2157 == 1) {
            if (class28.field788 >= 6 && class28.field788 <= 106 && class63.field1526 >= 467 && class63.field1526 <= 499) {
                class123.field3114++;
                class2.field54 = true;
                class97.field2473 = (class97.field2473 + 1) % 4;
                class73.field1781 = true;
                class107.field2670.method326(93, -128);
                class107.field2670.method916(arg0 - 115, class97.field2473);
                class107.field2670.method916(arg0 - 115, class102.field2569);
                class107.field2670.method916(arg0 ^ 0xFFFFFF8F, class2.field58);
            }
            if (class28.field788 >= 135 && class28.field788 <= 235 && class63.field1526 >= 467 && class63.field1526 <= 499) {
                class102.field2569 = (class102.field2569 + 1) % 3;
                class73.field1781 = true;
                class2.field54 = true;
                class107.field2670.method326(93, arg0 ^ 0xFFFFFFE5);
                class107.field2670.method916(-2, class97.field2473);
                class123.field3114++;
                class107.field2670.method916(-2, class102.field2569);
                class107.field2670.method916(-2, class2.field58);
            }
            if (class28.field788 >= 273 && class28.field788 <= 373 && class63.field1526 >= 467 && class63.field1526 <= 499) {
                class73.field1781 = true;
                class123.field3114++;
                class2.field54 = true;
                class2.field58 = (class2.field58 + 1) % 3;
                class107.field2670.method326(93, -118);
                class107.field2670.method916(arg0 - 115, class97.field2473);
                class107.field2670.method916(arg0 ^ 0xFFFFFF8F, class102.field2569);
                class107.field2670.method916(-2, class2.field58);
            }
            if (class28.field788 >= 412 && class28.field788 <= 512 && class63.field1526 >= 467 && class63.field1526 <= 499) {
                if (class103.field2603 == -1) {
                    class1.method1((byte) -121);
                    if (class73.field1796 != -1) {
                        class19.field506 = class103.field2603 = class73.field1796;
                        class8.field236 = class8.field230;
                        class122.field3100 = false;
                    }
                } else {
                    class41.method311(0, class8.field230, (byte) 69, class79.field2012);
                }
            }
        }
        if (arg0 != 113) {
            method305(124, 102, -127, 86);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V", line = 191)
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= -67) {
            method304(-128, 59, -40, 90, -111, -38);
        }
        field1036++;
        int var6 = class64.field1585.method182(arg0, arg5, arg1);
        if (var6 != 0) {
            int var7 = class64.field1585.method175(arg0, arg5, arg1, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = arg4;
            int var10 = var7 & 0x1F;
            int[] var11 = class89.field2292.field2933;
            if (var6 > 0) {
                var9 = arg2;
            }
            int var12 = (52736 - arg1 * 512) * 4 + arg5 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class27 var14 = class55.method440(var13, (byte) 76);
            if (var14.field766 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var8 == 1) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 1539] = var9;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1536 + 1] = var9;
                        var11[var12 + 1538] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var9;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 1536 + 3] = var9;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var9;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var8 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 1024 + 3] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1537] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    }
                }
            } else {
                class5 var15 = class80.field2042[var14.field766];
                if (var15 != null) {
                    int var16 = (var14.field715 * 4 - var15.field107) / 2;
                    int var17 = (var14.field771 * 4 - var15.field102) / 2;
                    var15.method33(arg5 * 4 + var17 + 48, (-arg1 + 104 + -var14.field715) * 4 + var16 + 48);
                }
            }
        }
        int var18 = class64.field1585.method217(arg0, arg5, arg1);
        if (var18 != 0) {
            int var19 = class64.field1585.method175(arg0, arg5, arg1, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class27 var23 = class55.method440(var22, (byte) 76);
            if (var23.field766 != -1) {
                class5 var24 = class80.field2042[var23.field766];
                if (var24 != null) {
                    int var25 = (var23.field771 * 4 - var24.field102) / 2;
                    int var26 = (var23.field715 * 4 - var24.field107) / 2;
                    var24.method33(arg5 * 4 + var25 + 48, var26 + 48 - -((-var23.field715 + 104 + -arg1) * 4));
                }
            } else if (var21 == 9) {
                int[] var27 = class89.field2292.field2933;
                int var28 = 15658734;
                if (var18 > 0) {
                    var28 = 15597568;
                }
                int var29 = (103 - arg1) * 2048 + arg5 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1 + 1024] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 512 + 1] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 3 + 1536] = var28;
                }
            }
        }
        int var30 = class64.field1585.method198(arg0, arg5, arg1);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class27 var32 = class55.method440(var31, (byte) 76);
        if (var32.field766 == -1) {
            return;
        }
        class5 var33 = class80.field2042[var32.field766];
        if (var33 != null) {
            int var34 = (var32.field771 * 4 - var33.field102) / 2;
            int var35 = (var32.field715 * 4 - var33.field107) / 2;
            var33.method33(arg5 * 4 + var34 + 48, (104 - arg1 - var32.field715) * 4 + var35 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V", line = 431)
    public static final void method305(int arg0, int arg1, int arg2, int arg3) {
        if (class20.field537 != arg1 && arg2 != 0 && class9.field245 < 50) {
            class52.field1311[class9.field245] = arg0;
            class23.field612[class9.field245] = arg2;
            class69.field1667[class9.field245] = arg3;
            class2.field63[class9.field245] = null;
            class12.field296[class9.field245] = 0;
            class9.field245++;
        }
        field1025++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 474)
    public static void method306(int arg0) {
        field1032 = null;
        field1024 = null;
        field1037 = null;
        field1028 = null;
        if (arg0 > 113) {
            field1038 = null;
            field1026 = null;
            field1019 = null;
            field1034 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 498)
    public class40(Throwable arg0, String arg1) {
        this.field1029 = arg0;
        this.field1030 = arg1;
    }
}
