import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class276 extends class502 {

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "[B")
    public byte[] field4118;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4112 = new Rectangle[100];

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "Z")
    public static boolean field4117;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4112[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V", line = 4)
    public final void method1719(int arg0) {
        int var2 = -9 / ((-arg0 - 52) / 56);
        field4120++;
        int var3 = -1;
        int var4 = this.field4118.length - 8;
        while (var3 < var4) {
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
            var3++;
            this.field4118[var3] = 0;
        }
        while (var3 < (this.field4118.length - 1)) {
            var3++;
            this.field4118[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z", line = 33)
    public final boolean method1720(int arg0, int arg1, int arg2) {
        field4114++;
        int var4 = -75 % ((arg2 - 6) / 44);
        return this.field4118.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)V", line = 52)
    public static void method1721(int arg0) {
        field4112 = null;
        if (arg0 != 1731503536) {
            method1724(-55, 54, (byte) -117, 114);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIZ)V", line = 62)
    public final void method1722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            return;
        }
        field4124++;
        int var8 = 0;
        if (arg1 != arg4) {
            var8 = (arg2 - arg3 << 16) / (arg1 - arg4);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg5 - arg2 << 16) / (arg0 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg3 - arg5 << 16) / (arg4 - arg0);
        }
        if (arg1 >= arg4 && arg0 >= arg4) {
            if (arg0 > arg1) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg2 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var8 > var10 || arg1 == arg4 && var10 > var9) {
                    int var14 = arg0 - arg1;
                    int var15 = arg1 - arg4;
                    int var16 = this.field4116 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class158.method1126(var13 >> 16, (byte) -60, var12 >> 16, this.field4118, var16, 0);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field4116;
                            }
                        }
                        class158.method1126(var11 >> 16, (byte) -60, var12 >> 16, this.field4118, var16, 0);
                        var12 += var10;
                        var16 += this.field4116;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg0 - arg1;
                    int var18 = arg1 - arg4;
                    int var19 = this.field4116 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class158.method1126(var12 >> 16, (byte) -60, var13 >> 16, this.field4118, var19, 0);
                                var19 += this.field4116;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class158.method1126(var12 >> 16, (byte) -60, var11 >> 16, this.field4118, var19, 0);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field4116;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg4 < 0) {
                    var21 -= arg4 * var10;
                    var20 -= arg4 * var8;
                    arg4 = 0;
                }
                int var22 = arg5 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var8 < var9) {
                    int var23 = arg1 - arg0;
                    int var24 = arg0 - arg4;
                    int var25 = this.field4116 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class158.method1126(var20 >> 16, (byte) -60, var22 >> 16, this.field4118, var25, 0);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field4116;
                            }
                        }
                        class158.method1126(var20 >> 16, (byte) -60, var21 >> 16, this.field4118, var25, 0);
                        var25 += this.field4116;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg1 - arg0;
                    int var27 = arg0 - arg4;
                    int var28 = this.field4116 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class158.method1126(var22 >> 16, (byte) -60, var20 >> 16, this.field4118, var28, 0);
                                var20 += var8;
                                var28 += this.field4116;
                                var22 += var9;
                            }
                        }
                        class158.method1126(var21 >> 16, (byte) -60, var20 >> 16, this.field4118, var28, 0);
                        var28 += this.field4116;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg1 <= arg0) {
            if (arg0 >= arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg3 << 16;
                if (arg1 < 0) {
                    var30 -= arg1 * var8;
                    var29 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var9 > var8) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg1;
                    int var34 = this.field4116 * arg1;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class158.method1126(var29 >> 16, (byte) -60, var31 >> 16, this.field4118, var34, 0);
                                var34 += this.field4116;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class158.method1126(var29 >> 16, (byte) -60, var30 >> 16, this.field4118, var34, 0);
                        var30 += var8;
                        var34 += this.field4116;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg1;
                    int var37 = this.field4116 * arg1;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class158.method1126(var31 >> 16, (byte) -60, var29 >> 16, this.field4118, var37, 0);
                                var29 += var9;
                                var37 += this.field4116;
                                var31 += var10;
                            }
                        }
                        class158.method1126(var30 >> 16, (byte) -60, var29 >> 16, this.field4118, var37, 0);
                        var37 += this.field4116;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg5 << 16;
                if (arg1 < 0) {
                    var39 -= arg1 * var8;
                    var38 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if ((arg0 == arg1 || var9 <= var8) && (arg0 != arg1 || var8 <= var10)) {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg1;
                    int var46 = this.field4116 * arg1;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class158.method1126(var39 >> 16, (byte) -60, var40 >> 16, this.field4118, var46, 0);
                                var39 += var8;
                                var40 += var10;
                                var46 += this.field4116;
                            }
                        }
                        class158.method1126(var39 >> 16, (byte) -60, var38 >> 16, this.field4118, var46, 0);
                        var38 += var9;
                        var46 += this.field4116;
                        var39 += var8;
                    }
                } else {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg1;
                    int var43 = this.field4116 * arg1;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class158.method1126(var40 >> 16, (byte) -60, var39 >> 16, this.field4118, var43, 0);
                                var40 += var10;
                                var39 += var8;
                                var43 += this.field4116;
                            }
                        }
                        class158.method1126(var38 >> 16, (byte) -60, var39 >> 16, this.field4118, var43, 0);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field4116;
                    }
                }
            }
        } else if (arg1 <= arg4) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg2 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var9;
                var47 -= arg0 * var10;
                arg0 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 < var10) {
                int var50 = arg4 - arg1;
                int var51 = arg1 - arg0;
                int var52 = this.field4116 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class158.method1126(var47 >> 16, (byte) -60, var49 >> 16, this.field4118, var52, 0);
                            var52 += this.field4116;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class158.method1126(var47 >> 16, (byte) -60, var48 >> 16, this.field4118, var52, 0);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field4116;
                }
            } else {
                int var53 = arg4 - arg1;
                int var54 = arg1 - arg0;
                int var55 = this.field4116 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class158.method1126(var49 >> 16, (byte) -60, var47 >> 16, this.field4118, var55, 0);
                            var55 += this.field4116;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class158.method1126(var48 >> 16, (byte) -60, var47 >> 16, this.field4118, var55, 0);
                    var55 += this.field4116;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg0 < 0) {
                var57 -= arg0 * var9;
                var56 -= arg0 * var10;
                arg0 = 0;
            }
            int var58 = arg3 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg1 - arg4;
                int var60 = arg4 - arg0;
                int var61 = this.field4116 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class158.method1126(var57 >> 16, (byte) -60, var58 >> 16, this.field4118, var61, 0);
                            var61 += this.field4116;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class158.method1126(var57 >> 16, (byte) -60, var56 >> 16, this.field4118, var61, 0);
                    var57 += var9;
                    var61 += this.field4116;
                    var56 += var10;
                }
            } else {
                int var62 = arg1 - arg4;
                int var63 = arg4 - arg0;
                int var64 = this.field4116 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class158.method1126(var58 >> 16, (byte) -60, var57 >> 16, this.field4118, var64, 0);
                            var64 += this.field4116;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class158.method1126(var56 >> 16, (byte) -60, var57 >> 16, this.field4118, var64, 0);
                    var64 += this.field4116;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BIIII)V", line = 507)
    public final void method1723(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 88) {
            this.field4118 = null;
        }
        field4123++;
        this.field4115 = arg2 - arg1;
        this.field4116 = arg4 - arg3;
        this.field4122 = arg1;
        this.field4119 = arg3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIBI)I", line = 529)
    public static final int method1724(int arg0, int arg1, byte arg2, int arg3) {
        field4111++;
        if (arg2 != -5) {
            method1721(84);
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lvd;II)V", line = 550)
    public class276(class258 arg0, int arg1, int arg2) {
        this.field4118 = new byte[arg1 * arg2];
    }
}
