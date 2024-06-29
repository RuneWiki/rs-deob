import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class45 extends class194 {

    @OriginalMember(owner = "client!vba", name = "H", descriptor = "[B")
    public byte[] field563;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "[Ldba;")
    public static class100[] field558 = new class100[4];

    @OriginalMember(owner = "client!vba", name = "K", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!vba", name = "R", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field572 = new Hashtable();

    @OriginalMember(owner = "client!vba", name = "D", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!vba", name = "E", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!vba", name = "F", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!vba", name = "G", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!vba", name = "I", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!vba", name = "J", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!vba", name = "M", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!vba", name = "N", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!vba", name = "P", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!vba", name = "Q", descriptor = "I")
    public static int field571;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vba", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field573;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IZLjava/awt/Component;)Lul;")
    public static final class597 method325(int arg0, boolean arg1, Component arg2) {
        field561++;
        if (arg0 != 0) {
            method326((byte) 87);
        }
        try {
            Constructor var3 = Class.forName("dw").getDeclaredConstructor(field573 == null ? (field573 = method333("java.awt.Component")) : field573, Boolean.TYPE);
            return (class597) var3.newInstance(arg2, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class445(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "(B)Leo;")
    public static final class312 method326(byte arg0) {
        field559++;
        if (arg0 > -47) {
            field558 = null;
        }
        class312 var1 = class414.method2521(0);
        var1.field4441 = null;
        var1.field4442 = 0;
        var1.field4445 = new class349(5000);
        return var1;
    }

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "(B)V")
    public static void method327(byte arg0) {
        field558 = null;
        field572 = null;
        if (arg0 > -7) {
            method325(-85, true, null);
        }
    }

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "(B)V")
    public final void method328(byte arg0) {
        field571++;
        int var2 = -1;
        int var3 = this.field563.length - 8;
        while (var3 > var2) {
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
            var2++;
            this.field563[var2] = 0;
        }
        if (arg0 != -92) {
            method332(62);
        }
        while ((this.field563.length - 1) > var2) {
            var2++;
            this.field563[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field567++;
        int var8 = 0;
        if (arg2 != arg5) {
            var8 = (arg6 - arg0 << 16) / (arg5 - arg2);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg3 - arg6 << 16) / (arg4 - arg5);
        }
        int var10 = 0;
        if (arg1 != 1770388016) {
            this.field563 = null;
        }
        if (arg2 != arg4) {
            var10 = (arg0 - arg3 << 16) / (arg2 - arg4);
        }
        if (arg5 >= arg2 && arg2 <= arg4) {
            if (arg4 > arg5) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg6 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 != arg5 && var10 < var8 || arg2 == arg5 && var10 > var9) {
                    int var14 = arg4 - arg5;
                    int var15 = arg5 - arg2;
                    int var16 = this.field570 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -101, var12 >> 16, var16, this.field563, var13 >> 16);
                                var13 += var9;
                                var16 += this.field570;
                                var12 += var10;
                            }
                        }
                        class547.method3272(0, (byte) -109, var12 >> 16, var16, this.field563, var11 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field570;
                    }
                } else {
                    int var17 = arg4 - arg5;
                    int var18 = arg5 - arg2;
                    int var19 = this.field570 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -126, var13 >> 16, var19, this.field563, var12 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field570;
                            }
                        }
                        class547.method3272(0, (byte) -119, var11 >> 16, var19, this.field563, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field570;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                int var22 = arg3 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var9 > var8) {
                    int var23 = arg5 - arg4;
                    int var24 = arg4 - arg2;
                    int var25 = this.field570 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -122, var22 >> 16, var25, this.field563, var20 >> 16);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field570;
                            }
                        }
                        class547.method3272(0, (byte) -125, var21 >> 16, var25, this.field563, var20 >> 16);
                        var25 += this.field570;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg5 - arg4;
                    int var27 = arg4 - arg2;
                    int var28 = this.field570 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -125, var20 >> 16, var28, this.field563, var22 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field570;
                            }
                        }
                        class547.method3272(0, (byte) -107, var20 >> 16, var28, this.field563, var21 >> 16);
                        var21 += var10;
                        var28 += this.field570;
                        var20 += var8;
                    }
                }
            }
        } else if (arg5 > arg4) {
            if (arg2 >= arg5) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var9;
                    var29 -= arg4 * var10;
                    arg4 = 0;
                }
                int var31 = arg6 << 16;
                if (arg5 < 0) {
                    var31 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg2 - arg5;
                    int var33 = arg5 - arg4;
                    int var34 = this.field570 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -123, var29 >> 16, var34, this.field563, var31 >> 16);
                                var31 += var8;
                                var29 += var10;
                                var34 += this.field570;
                            }
                        }
                        class547.method3272(0, (byte) -113, var29 >> 16, var34, this.field563, var30 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var34 += this.field570;
                    }
                } else {
                    int var35 = arg2 - arg5;
                    int var36 = arg5 - arg4;
                    int var37 = this.field570 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -103, var31 >> 16, var37, this.field563, var29 >> 16);
                                var37 += this.field570;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class547.method3272(0, (byte) -119, var30 >> 16, var37, this.field563, var29 >> 16);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field570;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg0 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var10;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg5 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field570 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -122, var40 >> 16, var43, this.field563, var39 >> 16);
                                var43 += this.field570;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class547.method3272(0, (byte) -108, var38 >> 16, var43, this.field563, var39 >> 16);
                        var43 += this.field570;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg5 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field570 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class547.method3272(0, (byte) -113, var39 >> 16, var46, this.field563, var40 >> 16);
                                var46 += this.field570;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class547.method3272(0, (byte) -116, var39 >> 16, var46, this.field563, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field570;
                    }
                }
            }
        } else if (arg4 < arg2) {
            int var47;
            int var48 = var47 = arg6 << 16;
            int var49 = arg3 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg4 != arg5 && var8 < var9 || arg4 == arg5 && var8 > var10) {
                int var50 = arg2 - arg4;
                int var51 = arg4 - arg5;
                int var52 = this.field570 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class547.method3272(0, (byte) -101, var48 >> 16, var52, this.field563, var49 >> 16);
                            var52 += this.field570;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class547.method3272(0, (byte) -115, var48 >> 16, var52, this.field563, var47 >> 16);
                    var47 += var9;
                    var52 += this.field570;
                    var48 += var8;
                }
            } else {
                int var53 = arg2 - arg4;
                int var54 = arg4 - arg5;
                int var55 = this.field570 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class547.method3272(0, (byte) -109, var49 >> 16, var55, this.field563, var48 >> 16);
                            var55 += this.field570;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class547.method3272(0, (byte) -122, var47 >> 16, var55, this.field563, var48 >> 16);
                    var55 += this.field570;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg6 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg0 << 16;
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (var9 > var8) {
                int var59 = arg4 - arg2;
                int var60 = arg2 - arg5;
                int var61 = this.field570 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class547.method3272(0, (byte) -112, var58 >> 16, var61, this.field563, var56 >> 16);
                            var61 += this.field570;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class547.method3272(0, (byte) -106, var57 >> 16, var61, this.field563, var56 >> 16);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field570;
                }
            } else {
                int var62 = arg4 - arg2;
                int var63 = arg2 - arg5;
                int var64 = this.field570 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class547.method3272(0, (byte) -106, var56 >> 16, var64, this.field563, var58 >> 16);
                            var58 += var10;
                            var64 += this.field570;
                            var56 += var9;
                        }
                    }
                    class547.method3272(0, (byte) -110, var56 >> 16, var64, this.field563, var57 >> 16);
                    var57 += var8;
                    var64 += this.field570;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field569++;
        this.field568 = arg1 - arg3;
        int var6 = 82 / ((-arg0 - 23) / 36);
        this.field564 = arg2;
        this.field570 = arg4 - arg2;
        this.field562 = arg3;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z")
    public final boolean method331(int arg0, int arg1, int arg2) {
        if (arg2 >= -11) {
            field558 = null;
        }
        field560++;
        return this.field563.length >= (arg0 * arg1);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static final void method332(int arg0) {
        if (arg0 != 391328784) {
            method325(115, true, null);
        }
        class699.field9728.method3735(2);
        field565++;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lqfa;II)V")
    public class45(class106 arg0, int arg1, int arg2) {
        this.field563 = new byte[arg1 * arg2];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method333(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
