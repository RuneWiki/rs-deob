import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class418 extends class378 {

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "[B")
    public byte[] field6115;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field6113 = 0;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "Luf;")
    public static class310 field6106 = new class310(42, -1);

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "[[[I")
    public static int[][][] field6119 = new int[2][][];

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public int field6105;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public int field6108;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public int field6111;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    public int field6116;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "Lqa;")
    public static class162 field6109;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "Lvh;")
    public static class240 field6120;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "[[B")
    public static byte[][] field6114;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIZIIII)V", line = 5)
    public final void method2503(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field6112++;
        int var8 = 0;
        if (arg1 != arg3) {
            var8 = (arg5 - arg4 << 16) / (arg3 - arg1);
        }
        if (arg2) {
            return;
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg0 - arg5 << 16) / (arg6 - arg3);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg4 - arg0 << 16) / (arg1 - arg6);
        }
        if (arg1 <= arg3 && arg1 <= arg6) {
            if (arg3 < arg6) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                int var13 = arg5 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg1 != arg3 && var8 > var10 || arg1 == arg3 && var9 < var10) {
                    int var14 = arg6 - arg3;
                    int var15 = arg3 - arg1;
                    int var16 = this.field6111 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class142.method918(var13 >> 16, var12 >> 16, var16, 18414, 0, this.field6115);
                                var12 += var10;
                                var13 += var9;
                                var16 += this.field6111;
                            }
                        }
                        class142.method918(var11 >> 16, var12 >> 16, var16, 18414, 0, this.field6115);
                        var16 += this.field6111;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg6 - arg3;
                    int var18 = arg3 - arg1;
                    int var19 = this.field6111 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class142.method918(var12 >> 16, var13 >> 16, var19, 18414, 0, this.field6115);
                                var19 += this.field6111;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class142.method918(var12 >> 16, var11 >> 16, var19, 18414, 0, this.field6115);
                        var19 += this.field6111;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg1 < 0) {
                    var20 -= arg1 * var8;
                    var21 -= arg1 * var10;
                    arg1 = 0;
                }
                int var22 = arg0 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var9 > var8) {
                    int var23 = arg3 - arg6;
                    int var24 = arg6 - arg1;
                    int var25 = this.field6111 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class142.method918(var20 >> 16, var22 >> 16, var25, 18414, 0, this.field6115);
                                var22 += var9;
                                var25 += this.field6111;
                                var20 += var8;
                            }
                        }
                        class142.method918(var20 >> 16, var21 >> 16, var25, 18414, 0, this.field6115);
                        var21 += var10;
                        var25 += this.field6111;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg3 - arg6;
                    int var27 = arg6 - arg1;
                    int var28 = this.field6111 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class142.method918(var22 >> 16, var20 >> 16, var28, 18414, 0, this.field6115);
                                var22 += var9;
                                var28 += this.field6111;
                                var20 += var8;
                            }
                        }
                        class142.method918(var21 >> 16, var20 >> 16, var28, 18414, 0, this.field6115);
                        var21 += var10;
                        var28 += this.field6111;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 >= arg3) {
            if (arg1 <= arg6) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg4 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var9;
                    var30 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg6 - arg1;
                    int var33 = arg1 - arg3;
                    int var34 = this.field6111 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class142.method918(var29 >> 16, var31 >> 16, var34, 18414, 0, this.field6115);
                                var29 += var9;
                                var34 += this.field6111;
                                var31 += var10;
                            }
                        }
                        class142.method918(var29 >> 16, var30 >> 16, var34, 18414, 0, this.field6115);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field6111;
                    }
                } else {
                    int var35 = arg6 - arg1;
                    int var36 = arg1 - arg3;
                    int var37 = this.field6111 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class142.method918(var31 >> 16, var29 >> 16, var37, 18414, 0, this.field6115);
                                var31 += var10;
                                var29 += var9;
                                var37 += this.field6111;
                            }
                        }
                        class142.method918(var30 >> 16, var29 >> 16, var37, 18414, 0, this.field6115);
                        var37 += this.field6111;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg3 < 0) {
                    var38 -= arg3 * var9;
                    var39 -= arg3 * var8;
                    arg3 = 0;
                }
                int var40 = arg0 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var9 > var8 || arg3 == arg6 && var10 < var8) {
                    int var41 = arg1 - arg6;
                    int var42 = arg6 - arg3;
                    int var43 = this.field6111 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class142.method918(var40 >> 16, var39 >> 16, var43, 18414, 0, this.field6115);
                                var40 += var10;
                                var43 += this.field6111;
                                var39 += var8;
                            }
                        }
                        class142.method918(var38 >> 16, var39 >> 16, var43, 18414, 0, this.field6115);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field6111;
                    }
                } else {
                    int var44 = arg1 - arg6;
                    int var45 = arg6 - arg3;
                    int var46 = this.field6111 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class142.method918(var39 >> 16, var40 >> 16, var46, 18414, 0, this.field6115);
                                var39 += var8;
                                var40 += var10;
                                var46 += this.field6111;
                            }
                        }
                        class142.method918(var39 >> 16, var38 >> 16, var46, 18414, 0, this.field6115);
                        var46 += this.field6111;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg3 <= arg1) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var10;
                var48 -= arg6 * var9;
                arg6 = 0;
            }
            int var49 = arg5 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 < var10) {
                int var50 = arg1 - arg3;
                int var51 = arg3 - arg6;
                int var52 = this.field6111 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class142.method918(var47 >> 16, var49 >> 16, var52, 18414, 0, this.field6115);
                            var52 += this.field6111;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class142.method918(var47 >> 16, var48 >> 16, var52, 18414, 0, this.field6115);
                    var52 += this.field6111;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg1 - arg3;
                int var54 = arg3 - arg6;
                int var55 = this.field6111 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class142.method918(var49 >> 16, var47 >> 16, var55, 18414, 0, this.field6115);
                            var47 += var10;
                            var49 += var8;
                            var55 += this.field6111;
                        }
                    }
                    class142.method918(var48 >> 16, var47 >> 16, var55, 18414, 0, this.field6115);
                    var55 += this.field6111;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg4 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg3 - arg1;
                int var60 = arg1 - arg6;
                int var61 = this.field6111 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class142.method918(var57 >> 16, var58 >> 16, var61, 18414, 0, this.field6115);
                            var57 += var9;
                            var61 += this.field6111;
                            var58 += var8;
                        }
                    }
                    class142.method918(var57 >> 16, var56 >> 16, var61, 18414, 0, this.field6115);
                    var57 += var9;
                    var61 += this.field6111;
                    var56 += var10;
                }
            } else {
                int var62 = arg3 - arg1;
                int var63 = arg1 - arg6;
                int var64 = this.field6111 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class142.method918(var58 >> 16, var57 >> 16, var64, 18414, 0, this.field6115);
                            var64 += this.field6111;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class142.method918(var56 >> 16, var57 >> 16, var64, 18414, 0, this.field6115);
                    var57 += var9;
                    var64 += this.field6111;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V", line = 440)
    public final void method2504(byte arg0) {
        field6110++;
        if (arg0 != -6) {
            this.method2506((byte) 16, 64, -99);
        }
        int var2 = -1;
        int var3 = this.field6115.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
            var2++;
            this.field6115[var2] = 0;
        }
        while ((this.field6115.length - 1) > var2) {
            var2++;
            this.field6115[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)V", line = 471)
    public static void method2505(byte arg0) {
        field6109 = null;
        if (arg0 != -6) {
            method2505((byte) 31);
        }
        field6106 = null;
        field6119 = null;
        field6114 = null;
        field6120 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BII)Z", line = 492)
    public final boolean method2506(byte arg0, int arg1, int arg2) {
        field6117++;
        if (arg0 != -65) {
            method2505((byte) 108);
        }
        return this.field6115.length >= (arg1 * arg2);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIB)V", line = 503)
    public final void method2507(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field6111 = arg3 - arg2;
        if (arg4 <= -41) {
            this.field6105 = arg0;
            field6118++;
            this.field6108 = arg2;
            this.field6116 = arg1 - arg0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 523)
    public static final String method2508(boolean arg0, String arg1, String arg2, String arg3) {
        field6107++;
        for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, var4 + arg3.length())) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(arg1.length() + var4);
        }
        if (arg0) {
            method2508(false, null, null, null);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lht;II)V", line = 553)
    public class418(class410 arg0, int arg1, int arg2) {
        this.field6115 = new byte[arg1 * arg2];
    }
}
