import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 extends class196 {

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "[B")
    public byte[] field826;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Ljava/util/Calendar;")
    public static Calendar field821 = Calendar.getInstance();

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "Ljava/util/Calendar;")
    public static Calendar field828 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Lfja;")
    public static class783 field831 = new class783(30, -1);

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "Lfja;")
    public static class783 field833 = new class783(28, 4);

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field824 = arg1 - arg3;
        this.field819 = arg0;
        field827++;
        this.field825 = arg2 - arg0;
        if (arg4 == -1819929872) {
            this.field822 = arg3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(III)Z", line = 29)
    public final boolean method418(int arg0, int arg1, int arg2) {
        field830++;
        if (arg2 == 20) {
            return this.field826.length >= arg0 * arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V", line = 40)
    public static void method419(int arg0) {
        field821 = null;
        field831 = null;
        field833 = null;
        field828 = null;
        if (arg0 != 0) {
            method419(99);
        }
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V", line = 62)
    public final void method420(int arg0) {
        field820++;
        int var2 = -1;
        if (arg0 < 75) {
            this.method418(-33, 56, -48);
        }
        int var3 = this.field826.length - 8;
        while (var2 < var3) {
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
            var2++;
            this.field826[var2] = 0;
        }
        while ((this.field826.length - 1) > var2) {
            var2++;
            this.field826[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBIIII)V", line = 92)
    public final void method421(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field823++;
        int var8 = 0;
        if (arg3 != arg5) {
            var8 = (arg0 - arg6 << 16) / (arg5 - arg3);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg1 - arg0 << 16) / (arg4 - arg5);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg6 - arg1 << 16) / (arg3 - arg4);
        }
        if (arg2 != -37) {
            this.method421(-28, 28, (byte) -29, -67, 65, 89, 101);
        }
        if (arg5 >= arg3 && arg3 <= arg4) {
            if (arg4 > arg5) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg3 < 0) {
                    var11 -= arg3 * var8;
                    var12 -= arg3 * var10;
                    arg3 = 0;
                }
                int var13 = arg0 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg3 == arg5 || var8 <= var10) && (arg3 != arg5 || var10 <= var9)) {
                    int var17 = arg4 - arg5;
                    int var18 = arg5 - arg3;
                    int var19 = this.field824 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class641.method3565(var19, 0, 8, var12 >> 16, this.field826, var13 >> 16);
                                var19 += this.field824;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class641.method3565(var19, 0, 8, var12 >> 16, this.field826, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field824;
                    }
                } else {
                    int var14 = arg4 - arg5;
                    int var15 = arg5 - arg3;
                    int var16 = this.field824 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class641.method3565(var16, 0, 8, var13 >> 16, this.field826, var12 >> 16);
                                var16 += this.field824;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class641.method3565(var16, 0, 8, var11 >> 16, this.field826, var12 >> 16);
                        var16 += this.field824;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg3 < 0) {
                    var20 -= arg3 * var8;
                    var21 -= arg3 * var10;
                    arg3 = 0;
                }
                int var22 = arg1 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg3 != arg4 && var10 < var8 || arg3 == arg4 && var9 > var8) {
                    int var23 = arg5 - arg4;
                    int var24 = arg4 - arg3;
                    int var25 = this.field824 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class641.method3565(var25, 0, arg2 ^ 0xFFFFFFD3, var20 >> 16, this.field826, var22 >> 16);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field824;
                            }
                        }
                        class641.method3565(var25, 0, 8, var20 >> 16, this.field826, var21 >> 16);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field824;
                    }
                } else {
                    int var26 = arg5 - arg4;
                    int var27 = arg4 - arg3;
                    int var28 = this.field824 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class641.method3565(var28, 0, 8, var22 >> 16, this.field826, var20 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field824;
                            }
                        }
                        class641.method3565(var28, 0, 8, var21 >> 16, this.field826, var20 >> 16);
                        var20 += var8;
                        var28 += this.field824;
                        var21 += var10;
                    }
                }
            }
        } else if (arg5 <= arg4) {
            if (arg4 < arg3) {
                int var29;
                int var30 = var29 = arg0 << 16;
                int var31 = arg1 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var8;
                    var29 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var9 > var8 || arg4 == arg5 && var8 > var10) {
                    int var32 = arg3 - arg4;
                    int var33 = arg4 - arg5;
                    int var34 = this.field824 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class641.method3565(var34, 0, arg2 ^ 0xFFFFFFD3, var31 >> 16, this.field826, var30 >> 16);
                                var34 += this.field824;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class641.method3565(var34, 0, 8, var29 >> 16, this.field826, var30 >> 16);
                        var30 += var8;
                        var34 += this.field824;
                        var29 += var9;
                    }
                } else {
                    int var35 = arg3 - arg4;
                    int var36 = arg4 - arg5;
                    int var37 = this.field824 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class641.method3565(var37, 0, 8, var30 >> 16, this.field826, var31 >> 16);
                                var37 += this.field824;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class641.method3565(var37, 0, 8, var30 >> 16, this.field826, var29 >> 16);
                        var37 += this.field824;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var9;
                    var39 -= arg5 * var8;
                    arg5 = 0;
                }
                int var40 = arg6 << 16;
                if (arg3 < 0) {
                    var40 -= arg3 * var10;
                    arg3 = 0;
                }
                if (var8 >= var9) {
                    int var41 = arg4 - arg3;
                    int var42 = arg3 - arg5;
                    int var43 = this.field824 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class641.method3565(var43, 0, arg2 ^ 0xFFFFFFD3, var40 >> 16, this.field826, var38 >> 16);
                                var38 += var9;
                                var43 += this.field824;
                                var40 += var10;
                            }
                        }
                        class641.method3565(var43, 0, arg2 ^ 0xFFFFFFD3, var39 >> 16, this.field826, var38 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var43 += this.field824;
                    }
                } else {
                    int var44 = arg4 - arg3;
                    int var45 = arg3 - arg5;
                    int var46 = this.field824 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class641.method3565(var46, 0, arg2 + 45, var38 >> 16, this.field826, var40 >> 16);
                                var40 += var10;
                                var38 += var9;
                                var46 += this.field824;
                            }
                        }
                        class641.method3565(var46, 0, 8, var38 >> 16, this.field826, var39 >> 16);
                        var38 += var9;
                        var39 += var8;
                        var46 += this.field824;
                    }
                }
            }
        } else if (arg3 >= arg5) {
            int var47;
            int var48 = var47 = arg1 << 16;
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg3 - arg5;
                int var51 = arg5 - arg4;
                int var52 = this.field824 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class641.method3565(var52, 0, 8, var49 >> 16, this.field826, var47 >> 16);
                            var47 += var10;
                            var52 += this.field824;
                            var49 += var8;
                        }
                    }
                    class641.method3565(var52, 0, 8, var48 >> 16, this.field826, var47 >> 16);
                    var52 += this.field824;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg3 - arg5;
                int var54 = arg5 - arg4;
                int var55 = this.field824 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class641.method3565(var55, 0, arg2 + 45, var47 >> 16, this.field826, var49 >> 16);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field824;
                        }
                    }
                    class641.method3565(var55, 0, 8, var47 >> 16, this.field826, var48 >> 16);
                    var55 += this.field824;
                    var47 += var10;
                    var48 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg6 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg3 < 0) {
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg5 - arg3;
                int var60 = arg3 - arg4;
                int var61 = this.field824 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class641.method3565(var61, 0, arg2 ^ 0xFFFFFFD3, var57 >> 16, this.field826, var58 >> 16);
                            var61 += this.field824;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class641.method3565(var61, 0, arg2 ^ 0xFFFFFFD3, var57 >> 16, this.field826, var56 >> 16);
                    var61 += this.field824;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg5 - arg3;
                int var63 = arg3 - arg4;
                int var64 = this.field824 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class641.method3565(var64, 0, 8, var58 >> 16, this.field826, var57 >> 16);
                            var57 += var9;
                            var58 += var8;
                            var64 += this.field824;
                        }
                    }
                    class641.method3565(var64, 0, 8, var56 >> 16, this.field826, var57 >> 16);
                    var57 += var9;
                    var64 += this.field824;
                    var56 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lhk;II)V", line = 539)
    public class60(class111 arg0, int arg1, int arg2) {
        this.field826 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[B)V", line = 552)
    public static final void method422(int arg0, byte[] arg1) {
        field829++;
        class93 var2 = new class93(arg1);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method793((byte) 71);
                if (var4 == 0) {
                    if (arg0 != 6699) {
                        method419(-127);
                    }
                    if (var3) {
                        return;
                    }
                    if (class114.field2116 == null) {
                        class566.field8001 = 4;
                        class114.field2116 = new int[4];
                        class55.field789 = new int[4];
                    }
                    for (int var5 = 0; var5 < class114.field2116.length; var5++) {
                        class114.field2116[var5] = 0;
                        class55.field789[var5] = var5 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class114.field2116 == null) {
                        class55.field789 = new int[4];
                        class566.field8001 = 4;
                        class114.field2116 = new int[4];
                    }
                    var3 = true;
                    for (int var6 = 0; var6 < class114.field2116.length; var6++) {
                        class114.field2116[var6] = var2.method774(-4);
                        class55.field789[var6] = var2.method774(-4);
                    }
                } else if (var4 == 2) {
                    class542.field7390 = var2.method763(80);
                } else if (var4 == 3) {
                    class566.field8001 = var2.method793((byte) 88);
                    class114.field2116 = new int[class566.field8001];
                    class55.field789 = new int[class566.field8001];
                }
            }
        }
    }
}
