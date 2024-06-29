import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class545 extends class88 {

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "[B")
    public byte[] field7594;

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "Lgba;")
    public static class358 field7595 = new class358();

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "[C")
    public static char[] field7601 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "Lbn;")
    public static class371 field7602 = new class371(15, 0, 1, 0);

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
    public int field7592;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public int field7596;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    public int field7597;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "I")
    public int field7598;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z")
    public final boolean method3012(int arg0, int arg1, int arg2) {
        field7589++;
        if (arg2 < 87) {
            return false;
        } else {
            return this.field7594.length >= arg0 * arg1;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
    public static void method3013(byte arg0) {
        field7601 = null;
        if (arg0 == -124) {
            field7602 = null;
            field7595 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
    public final void method3014(byte arg0) {
        field7600++;
        int var2 = -1;
        int var3 = this.field7594.length - 8;
        while (var2 < var3) {
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
            var2++;
            this.field7594[var2] = 0;
        }
        if (arg0 < -79) {
            while (var2 < (this.field7594.length - 1)) {
                var2++;
                this.field7594[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBI[I[Ljava/lang/Object;)V")
    public static final void method3015(int arg0, byte arg1, int arg2, int[] arg3, Object[] arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if ((var7 + (var10 & var9)) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method3015(arg0, (byte) 81, var6 - 1, arg3, arg4);
            method3015(var6 + 1, (byte) 81, arg2, arg3, arg4);
        }
        field7590++;
        if (arg1 != 81) {
            method3016(null, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3016(String arg0, byte arg1) {
        field7593++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 > -111) {
            field7595 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BIIII)V")
    public final void method3017(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7596 = arg1;
        int var6 = -58 / ((arg0 + 3) / 44);
        this.field7598 = arg3 - arg1;
        field7591++;
        this.field7597 = arg2 - arg4;
        this.field7592 = arg4;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lre;II)V")
    public class545(class582 arg0, int arg1, int arg2) {
        this.field7594 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZIIIII)V")
    public final void method3018(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7599++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg4 - arg5 << 16) / (arg2 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg3 - arg4 << 16) / (arg6 - arg2);
        }
        if (arg1) {
            this.method3017((byte) -91, -75, -126, 50, 33);
        }
        int var10 = 0;
        if (arg0 != arg6) {
            var10 = (arg5 - arg3 << 16) / (arg0 - arg6);
        }
        if (arg0 <= arg2 && arg0 <= arg6) {
            if (arg6 <= arg2) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg3 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg0 == arg6 || var8 <= var10) && (arg0 != arg6 || var9 <= var8)) {
                    int var17 = arg2 - arg6;
                    int var18 = arg6 - arg0;
                    int var19 = this.field7598 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class415.method2474(0, var13 >> 16, var19, var11 >> 16, (byte) 5, this.field7594);
                                var19 += this.field7598;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class415.method2474(0, var12 >> 16, var19, var11 >> 16, (byte) 5, this.field7594);
                        var12 += var10;
                        var19 += this.field7598;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg2 - arg6;
                    int var15 = arg6 - arg0;
                    int var16 = this.field7598 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class415.method2474(0, var11 >> 16, var16, var13 >> 16, (byte) 5, this.field7594);
                                var13 += var9;
                                var16 += this.field7598;
                                var11 += var8;
                            }
                        }
                        class415.method2474(0, var11 >> 16, var16, var12 >> 16, (byte) 5, this.field7594);
                        var11 += var8;
                        var16 += this.field7598;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg4 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var10 < var8 || arg0 == arg2 && var10 > var9) {
                    int var23 = arg6 - arg2;
                    int var24 = arg2 - arg0;
                    int var25 = this.field7598 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class415.method2474(0, var22 >> 16, var25, var21 >> 16, (byte) 5, this.field7594);
                                var21 += var10;
                                var25 += this.field7598;
                                var22 += var9;
                            }
                        }
                        class415.method2474(0, var20 >> 16, var25, var21 >> 16, (byte) 5, this.field7594);
                        var25 += this.field7598;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg6 - arg2;
                    int var27 = arg2 - arg0;
                    int var28 = this.field7598 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class415.method2474(0, var21 >> 16, var28, var22 >> 16, (byte) 5, this.field7594);
                                var28 += this.field7598;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class415.method2474(0, var21 >> 16, var28, var20 >> 16, (byte) 5, this.field7594);
                        var28 += this.field7598;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 >= arg2) {
            if (arg0 > arg6) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg3 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var8;
                    var29 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var9 > var8 || arg2 == arg6 && var8 > var10) {
                    int var32 = arg0 - arg6;
                    int var33 = arg6 - arg2;
                    int var34 = this.field7598 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class415.method2474(0, var31 >> 16, var34, var30 >> 16, (byte) 5, this.field7594);
                                var34 += this.field7598;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class415.method2474(0, var29 >> 16, var34, var30 >> 16, (byte) 5, this.field7594);
                        var34 += this.field7598;
                        var30 += var8;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg0 - arg6;
                    int var36 = arg6 - arg2;
                    int var37 = this.field7598 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class415.method2474(0, var30 >> 16, var37, var31 >> 16, (byte) 5, this.field7594);
                                var37 += this.field7598;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class415.method2474(0, var30 >> 16, var37, var29 >> 16, (byte) 5, this.field7594);
                        var37 += this.field7598;
                        var29 += var9;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                int var40 = arg5 << 16;
                if (arg2 < 0) {
                    var38 -= arg2 * var9;
                    var39 -= arg2 * var8;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg6 - arg0;
                    int var42 = arg0 - arg2;
                    int var43 = this.field7598 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class415.method2474(0, var40 >> 16, var43, var38 >> 16, (byte) 5, this.field7594);
                                var43 += this.field7598;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class415.method2474(0, var39 >> 16, var43, var38 >> 16, (byte) 5, this.field7594);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field7598;
                    }
                } else {
                    int var44 = arg6 - arg0;
                    int var45 = arg0 - arg2;
                    int var46 = this.field7598 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class415.method2474(0, var38 >> 16, var46, var40 >> 16, (byte) 5, this.field7594);
                                var38 += var9;
                                var46 += this.field7598;
                                var40 += var10;
                            }
                        }
                        class415.method2474(0, var38 >> 16, var46, var39 >> 16, (byte) 5, this.field7594);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field7598;
                    }
                }
            }
        } else if (arg2 <= arg0) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg4 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var10;
                var48 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var50 = arg0 - arg2;
                int var51 = arg2 - arg6;
                int var52 = this.field7598 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class415.method2474(0, var47 >> 16, var52, var49 >> 16, (byte) 5, this.field7594);
                            var47 += var10;
                            var52 += this.field7598;
                            var49 += var8;
                        }
                    }
                    class415.method2474(0, var47 >> 16, var52, var48 >> 16, (byte) 5, this.field7594);
                    var52 += this.field7598;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg0 - arg2;
                int var54 = arg2 - arg6;
                int var55 = this.field7598 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class415.method2474(0, var49 >> 16, var55, var47 >> 16, (byte) 5, this.field7594);
                            var55 += this.field7598;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class415.method2474(0, var48 >> 16, var55, var47 >> 16, (byte) 5, this.field7594);
                    var48 += var9;
                    var55 += this.field7598;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var9;
                var56 -= arg6 * var10;
                arg6 = 0;
            }
            int var58 = arg5 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var59 = arg2 - arg0;
                int var60 = arg0 - arg6;
                int var61 = this.field7598 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class415.method2474(0, var58 >> 16, var61, var57 >> 16, (byte) 5, this.field7594);
                            var58 += var8;
                            var61 += this.field7598;
                            var57 += var9;
                        }
                    }
                    class415.method2474(0, var56 >> 16, var61, var57 >> 16, (byte) 5, this.field7594);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field7598;
                }
            } else {
                int var62 = arg2 - arg0;
                int var63 = arg0 - arg6;
                int var64 = this.field7598 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class415.method2474(0, var57 >> 16, var64, var58 >> 16, (byte) 5, this.field7594);
                            var58 += var8;
                            var57 += var9;
                            var64 += this.field7598;
                        }
                    }
                    class415.method2474(0, var57 >> 16, var64, var56 >> 16, (byte) 5, this.field7594);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field7598;
                }
            }
        }
    }
}
