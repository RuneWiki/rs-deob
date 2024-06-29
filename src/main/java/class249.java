import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class249 extends class88 {

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "[B")
    public byte[] field3641;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3633 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "Ljda;")
    public static class278 field3643;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZLls;Lls;)I", line = 4)
    public static final int method1582(int arg0, int arg1, boolean arg2, class418 arg3, class418 arg4) {
        field3632++;
        if (arg0 == 1) {
            int var5 = arg4.field5312;
            int var6 = arg3.field5312;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        }
        if (arg1 != -1) {
            method1590(false, null);
        }
        if (arg0 == 2) {
            return class642.method3716(110, arg4.method2483(15731).field4982, arg3.method2483(15731).field4982, class77.field889);
        } else if (arg0 == 3) {
            if (arg4.field6009.equals("-")) {
                if (arg3.field6009.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field6009.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class642.method3716(112, arg4.field6009, arg3.field6009, class77.field889);
            }
        } else if (arg0 == 4) {
            if (arg4.method2242(-1)) {
                return arg3.method2242(-1) ? 0 : 1;
            } else if (arg3.method2242(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg4.method2241(2)) {
                return arg3.method2241(2) ? 0 : 1;
            } else if (arg3.method2241(arg1 + 3)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg4.method2240(-1)) {
                return arg3.method2240(-1) ? 0 : 1;
            } else if (arg3.method2240(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 7) {
            if (arg4.method2243((byte) 122)) {
                return arg3.method2243((byte) 114) ? 0 : 1;
            } else if (arg3.method2243((byte) -126)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 8) {
            int var7 = arg4.field6004;
            int var8 = arg3.field6004;
            if (arg2) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg4.field6010 - arg3.field6010;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V", line = 100)
    public final void method1583(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3631 = arg0 - arg2;
        this.field3637 = arg2;
        this.field3634 = arg4;
        if (arg3 != 1126236304) {
            method1588((byte) -103);
        }
        field3630++;
        this.field3642 = arg1 - arg4;
    }

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V", line = 118)
    public final void method1584(int arg0) {
        field3640++;
        int var2 = -1;
        if (arg0 >= -123) {
            this.method1584(-96);
        }
        int var3 = this.field3641.length - 8;
        while (var2 < var3) {
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
            var2++;
            this.field3641[var2] = 0;
        }
        while (var2 < this.field3641.length - 1) {
            var2++;
            this.field3641[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIIIIII)V", line = 149)
    public final void method1585(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -16) {
            this.field3641 = null;
        }
        field3638++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg4 - arg3 << 16) / (arg6 - arg2);
        }
        int var9 = 0;
        if (arg5 != arg6) {
            var9 = (arg1 - arg4 << 16) / (arg5 - arg6);
        }
        int var10 = 0;
        if (arg2 != arg5) {
            var10 = (arg3 - arg1 << 16) / (arg2 - arg5);
        }
        if (arg2 <= arg6 && arg2 <= arg5) {
            if (arg6 >= arg5) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                int var13 = arg1 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var8 < var9) {
                    int var14 = arg6 - arg5;
                    int var15 = arg5 - arg2;
                    int var16 = this.field3631 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class231.method1511(var16, 0, var13 >> 16, this.field3641, -96, var11 >> 16);
                                var16 += this.field3631;
                                var11 += var8;
                                var13 += var9;
                            }
                        }
                        class231.method1511(var16, 0, var12 >> 16, this.field3641, -78, var11 >> 16);
                        var16 += this.field3631;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg6 - arg5;
                    int var18 = arg5 - arg2;
                    int var19 = this.field3631 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class231.method1511(var19, 0, var11 >> 16, this.field3641, -64, var13 >> 16);
                                var19 += this.field3631;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class231.method1511(var19, 0, var11 >> 16, this.field3641, 113, var12 >> 16);
                        var19 += this.field3631;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg4 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg5 - arg6;
                    int var24 = arg6 - arg2;
                    int var25 = this.field3631 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class231.method1511(var25, 0, var21 >> 16, this.field3641, -69, var22 >> 16);
                                var25 += this.field3631;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class231.method1511(var25, 0, var21 >> 16, this.field3641, 94, var20 >> 16);
                        var25 += this.field3631;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg5 - arg6;
                    int var27 = arg6 - arg2;
                    int var28 = this.field3631 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class231.method1511(var28, 0, var22 >> 16, this.field3641, -70, var21 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field3631;
                            }
                        }
                        class231.method1511(var28, 0, var20 >> 16, this.field3641, -93, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field3631;
                    }
                }
            }
        } else if (arg6 > arg5) {
            if (arg2 >= arg6) {
                int var29;
                int var30 = var29 = arg1 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var9;
                    var29 -= arg5 * var10;
                    arg5 = 0;
                }
                int var31 = arg4 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg5;
                    int var34 = this.field3631 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class231.method1511(var34, 0, var31 >> 16, this.field3641, 123, var29 >> 16);
                                var29 += var10;
                                var34 += this.field3631;
                                var31 += var8;
                            }
                        }
                        class231.method1511(var34, 0, var30 >> 16, this.field3641, 36, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field3631;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg5;
                    int var37 = this.field3631 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class231.method1511(var37, 0, var29 >> 16, this.field3641, arg0 ^ 0xFFFFFFBE, var31 >> 16);
                                var37 += this.field3631;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class231.method1511(var37, 0, var29 >> 16, this.field3641, 93, var30 >> 16);
                        var37 += this.field3631;
                        var30 += var9;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                if (arg5 < 0) {
                    var39 -= arg5 * var9;
                    var38 -= arg5 * var10;
                    arg5 = 0;
                }
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg5;
                    int var43 = this.field3631 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class231.method1511(var43, 0, var39 >> 16, this.field3641, arg0 - 57, var40 >> 16);
                                var40 += var8;
                                var43 += this.field3631;
                                var39 += var9;
                            }
                        }
                        class231.method1511(var43, 0, var39 >> 16, this.field3641, -113, var38 >> 16);
                        var43 += this.field3631;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg5;
                    int var46 = this.field3631 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class231.method1511(var46, 0, var40 >> 16, this.field3641, -67, var39 >> 16);
                                var46 += this.field3631;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class231.method1511(var46, 0, var38 >> 16, this.field3641, -109, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field3631;
                    }
                }
            }
        } else if (arg5 < arg2) {
            int var47;
            int var48 = var47 = arg4 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var9;
                var48 -= arg6 * var8;
                arg6 = 0;
            }
            int var49 = arg1 << 16;
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg5 != arg6 && var8 < var9 || arg5 == arg6 && var10 < var8) {
                int var50 = arg2 - arg5;
                int var51 = arg5 - arg6;
                int var52 = this.field3631 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class231.method1511(var52, 0, var48 >> 16, this.field3641, 48, var49 >> 16);
                            var48 += var8;
                            var52 += this.field3631;
                            var49 += var10;
                        }
                    }
                    class231.method1511(var52, 0, var48 >> 16, this.field3641, -66, var47 >> 16);
                    var52 += this.field3631;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg2 - arg5;
                int var54 = arg5 - arg6;
                int var55 = this.field3631 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class231.method1511(var55, 0, var49 >> 16, this.field3641, arg0 - 79, var48 >> 16);
                            var55 += this.field3631;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class231.method1511(var55, 0, var47 >> 16, this.field3641, -106, var48 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field3631;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var8;
                var56 -= arg6 * var9;
                arg6 = 0;
            }
            int var58 = arg3 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg5 - arg2;
                int var60 = arg2 - arg6;
                int var61 = this.field3631 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class231.method1511(var61, 0, var56 >> 16, this.field3641, arg0 - 68, var58 >> 16);
                            var58 += var10;
                            var61 += this.field3631;
                            var56 += var9;
                        }
                    }
                    class231.method1511(var61, 0, var56 >> 16, this.field3641, 48, var57 >> 16);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field3631;
                }
            } else {
                int var62 = arg5 - arg2;
                int var63 = arg2 - arg6;
                int var64 = this.field3631 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class231.method1511(var64, 0, var58 >> 16, this.field3641, 126, var56 >> 16);
                            var56 += var9;
                            var58 += var10;
                            var64 += this.field3631;
                        }
                    }
                    class231.method1511(var64, 0, var57 >> 16, this.field3641, -82, var56 >> 16);
                    var64 += this.field3631;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 593)
    public static final void method1586(int arg0, int arg1) {
        if (arg1 != -1654698640) {
            method1582(-47, -76, false, null, null);
        }
        class639.field9296 = arg0;
        field3639++;
        class228.field3353.method2037(true);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZ)Z", line = 607)
    public final boolean method1587(int arg0, int arg1, boolean arg2) {
        field3629++;
        if (!arg2) {
            this.field3641 = null;
        }
        return this.field3641.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 625)
    public static void method1588(byte arg0) {
        field3633 = null;
        if (arg0 != -17) {
            field3633 = null;
        }
        field3643 = null;
    }

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V", line = 636)
    public static final void method1589(int arg0) {
        field3635++;
        int[] var1 = new int[class216.field3204.field8460];
        int var2 = 0;
        for (int var3 = 0; var3 < class216.field3204.field8460; var3++) {
            class414 var5 = class216.field3204.method3357(var3, (byte) -90);
            if (var5.field5966 >= 0 || var5.field5935 >= 0) {
                var1[var2++] = var3;
            }
        }
        class255.field3735 = new int[var2];
        if (arg0 < 99) {
            field3643 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class255.field3735[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZLdda;)V", line = 676)
    public static final void method1590(boolean arg0, class597 arg1) {
        class59.field704 = arg1.method3478(-1, "titlebg");
        field3636++;
        if (!arg0) {
            field3643 = null;
        }
        class374.field5506 = arg1.method3478(-1, "logo");
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lkw;II)V", line = 687)
    public class249(class174 arg0, int arg1, int arg2) {
        this.field3641 = new byte[arg1 * arg2];
    }
}
