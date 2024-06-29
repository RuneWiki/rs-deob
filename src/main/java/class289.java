import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class289 extends class515 {

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "[B")
    public byte[] field4697;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "Z")
    public static boolean field4705 = false;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "Lnk;")
    public static class326 field4706 = new class326(38, -1);

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public int field4711;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "[I")
    public static int[] field4712;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B[[I)V", line = 5)
    public static final void method1867(byte arg0, int[][] arg1) {
        class209.field3294 = arg1;
        if (arg0 != 106) {
            method1869(-32, -15, 83);
        }
        field4700++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZIIIZ)V", line = 17)
    public static final void method1868(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 > -77) {
            method1869(-33, 51, 13);
        }
        if (arg0 < arg1) {
            int var7 = (arg0 + arg1) / 2;
            int var8 = arg0;
            class239 var9 = class441.field6575[var7];
            class441.field6575[var7] = class441.field6575[arg1];
            class441.field6575[arg1] = var9;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if (class191.method1288(89, arg6, class441.field6575[var10], var9, arg2, arg4, arg5) <= 0) {
                    class239 var11 = class441.field6575[var10];
                    class441.field6575[var10] = class441.field6575[var8];
                    class441.field6575[var8++] = var11;
                }
            }
            class441.field6575[arg1] = class441.field6575[var8];
            class441.field6575[var8] = var9;
            method1868(arg0, var8 - 1, arg2, -92, arg4, arg5, arg6);
            method1868(var8 + 1, arg1, arg2, -98, arg4, arg5, arg6);
        }
        field4696++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)I", line = 66)
    public static final int method1869(int arg0, int arg1, int arg2) {
        field4703++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            if (arg1 != 23491) {
                method1869(-99, 20, -7);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)Z", line = 91)
    public final boolean method1870(int arg0, int arg1, int arg2) {
        field4701++;
        if (arg1 != 1921660432) {
            method1868(51, 91, true, -14, -74, 58, true);
        }
        return this.field4697.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V", line = 102)
    public static void method1871(int arg0) {
        field4706 = null;
        if (arg0 != 0) {
            field4712 = null;
        }
        field4712 = null;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)V", line = 114)
    public final void method1872(byte arg0) {
        field4707++;
        int var2 = -1;
        int var3 = this.field4697.length - 8;
        if (arg0 != 0) {
            field4712 = null;
        }
        while (var2 < var3) {
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
            var2++;
            this.field4697[var2] = 0;
        }
        while ((this.field4697.length - 1) > var2) {
            var2++;
            this.field4697[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBIII)V", line = 148)
    public final void method1873(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field4699 = arg3 - arg4;
        this.field4708 = arg2 - arg0;
        this.field4704 = arg4;
        if (arg1 < -1) {
            field4702++;
            this.field4711 = arg0;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)V", line = 167)
    public final void method1874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4695++;
        int var8 = 0;
        if (arg5 != arg6) {
            var8 = (arg0 - arg3 << 16) / (arg5 - arg6);
        }
        int var9 = 0;
        if (arg1 != -177891024) {
            return;
        }
        if (arg4 != arg5) {
            var9 = (arg2 - arg0 << 16) / (arg4 - arg5);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg3 - arg2 << 16) / (arg6 - arg4);
        }
        if (arg5 >= arg6 && arg6 <= arg4) {
            if (arg5 >= arg4) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg2 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var10;
                    var11 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var8 > var10 || arg4 == arg6 && var8 < var9) {
                    int var14 = arg5 - arg4;
                    int var15 = arg4 - arg6;
                    int var16 = this.field4699 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class429.method2613(var13 >> 16, var11 >> 16, 0, var16, arg1 + 177858676, this.field4697);
                                var11 += var8;
                                var16 += this.field4699;
                                var13 += var9;
                            }
                        }
                        class429.method2613(var12 >> 16, var11 >> 16, 0, var16, -32348, this.field4697);
                        var16 += this.field4699;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg5 - arg4;
                    int var18 = arg4 - arg6;
                    int var19 = this.field4699 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class429.method2613(var11 >> 16, var13 >> 16, 0, var19, arg1 ^ 0xA9A1894, this.field4697);
                                var11 += var8;
                                var19 += this.field4699;
                                var13 += var9;
                            }
                        }
                        class429.method2613(var11 >> 16, var12 >> 16, 0, var19, -32348, this.field4697);
                        var19 += this.field4699;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg0 << 16;
                if (arg6 < 0) {
                    var21 -= arg6 * var10;
                    var20 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg5 != arg6 && var10 < var8 || arg5 == arg6 && var10 > var9) {
                    int var23 = arg4 - arg5;
                    int var24 = arg5 - arg6;
                    int var25 = this.field4699 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class429.method2613(var21 >> 16, var22 >> 16, 0, var25, -32348, this.field4697);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field4699;
                            }
                        }
                        class429.method2613(var21 >> 16, var20 >> 16, 0, var25, arg1 + 177858676, this.field4697);
                        var20 += var8;
                        var25 += this.field4699;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg5;
                    int var27 = arg5 - arg6;
                    int var28 = this.field4699 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class429.method2613(var22 >> 16, var21 >> 16, 0, var28, arg1 ^ 0xA9A1894, this.field4697);
                                var22 += var9;
                                var21 += var10;
                                var28 += this.field4699;
                            }
                        }
                        class429.method2613(var20 >> 16, var21 >> 16, 0, var28, -32348, this.field4697);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field4699;
                    }
                }
            }
        } else if (arg4 < arg5) {
            if (arg5 > arg6) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg3 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg5 - arg6;
                    int var33 = arg6 - arg4;
                    int var34 = this.field4699 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class429.method2613(var31 >> 16, var30 >> 16, 0, var34, arg1 ^ 0xA9A1894, this.field4697);
                                var34 += this.field4699;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class429.method2613(var29 >> 16, var30 >> 16, 0, var34, -32348, this.field4697);
                        var34 += this.field4699;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg5 - arg6;
                    int var36 = arg6 - arg4;
                    int var37 = this.field4699 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class429.method2613(var30 >> 16, var31 >> 16, 0, var37, -32348, this.field4697);
                                var31 += var8;
                                var37 += this.field4699;
                                var30 += var9;
                            }
                        }
                        class429.method2613(var30 >> 16, var29 >> 16, 0, var37, -32348, this.field4697);
                        var37 += this.field4699;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var10;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                int var40 = arg0 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg6 - arg5;
                    int var42 = arg5 - arg4;
                    int var43 = this.field4699 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class429.method2613(var40 >> 16, var38 >> 16, 0, var43, -32348, this.field4697);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field4699;
                            }
                        }
                        class429.method2613(var39 >> 16, var38 >> 16, 0, var43, arg1 ^ 0xA9A1894, this.field4697);
                        var39 += var9;
                        var43 += this.field4699;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg6 - arg5;
                    int var45 = arg5 - arg4;
                    int var46 = this.field4699 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class429.method2613(var38 >> 16, var40 >> 16, 0, var46, -32348, this.field4697);
                                var40 += var8;
                                var38 += var10;
                                var46 += this.field4699;
                            }
                        }
                        class429.method2613(var38 >> 16, var39 >> 16, 0, var46, arg1 + 177858676, this.field4697);
                        var39 += var9;
                        var46 += this.field4699;
                        var38 += var10;
                    }
                }
            }
        } else if (arg6 > arg4) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg2 << 16;
            if (arg5 < 0) {
                var47 -= arg5 * var9;
                var48 -= arg5 * var8;
                arg5 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg4 != arg5 && var8 < var9 || arg4 == arg5 && var10 < var8) {
                int var50 = arg6 - arg4;
                int var51 = arg4 - arg5;
                int var52 = this.field4699 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class429.method2613(var48 >> 16, var49 >> 16, 0, var52, -32348, this.field4697);
                            var49 += var10;
                            var52 += this.field4699;
                            var48 += var8;
                        }
                    }
                    class429.method2613(var48 >> 16, var47 >> 16, 0, var52, -32348, this.field4697);
                    var52 += this.field4699;
                    var48 += var8;
                    var47 += var9;
                }
            } else {
                int var53 = arg6 - arg4;
                int var54 = arg4 - arg5;
                int var55 = this.field4699 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class429.method2613(var49 >> 16, var48 >> 16, 0, var55, -32348, this.field4697);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field4699;
                        }
                    }
                    class429.method2613(var47 >> 16, var48 >> 16, 0, var55, -32348, this.field4697);
                    var55 += this.field4699;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg3 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (var8 < var9) {
                int var59 = arg4 - arg6;
                int var60 = arg6 - arg5;
                int var61 = this.field4699 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class429.method2613(var58 >> 16, var56 >> 16, 0, var61, -32348, this.field4697);
                            var58 += var10;
                            var56 += var9;
                            var61 += this.field4699;
                        }
                    }
                    class429.method2613(var57 >> 16, var56 >> 16, 0, var61, -32348, this.field4697);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field4699;
                }
            } else {
                int var62 = arg4 - arg6;
                int var63 = arg6 - arg5;
                int var64 = this.field4699 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class429.method2613(var56 >> 16, var58 >> 16, 0, var64, -32348, this.field4697);
                            var64 += this.field4699;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    class429.method2613(var56 >> 16, var57 >> 16, 0, var64, -32348, this.field4697);
                    var64 += this.field4699;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V", line = 608)
    public static final void method1875(int arg0) {
        if (class412.field6262 >= 0) {
            long var1 = class19.method91((byte) 122);
            class412.field6262 = (int) ((long) class412.field6262 - (var1 - class467.field6941));
            if (class412.field6262 <= 0) {
                class507.field7383 = class467.field6940.field4638;
                class148.field2401 = class467.field6940.field4636;
                class295.field4752 = class467.field6940.field4634;
                class424.field6387 = class467.field6940.field4642;
                class91.field1517 = class467.field6940.field4635;
                class165.field2614 = class467.field6940.field4633;
                class375.field5849 = class467.field6940.field4645;
                class412.field6262 = -1;
                class59.field913 = class467.field6940.field4637;
                class135.field2292 = class467.field6940.field4650;
                class463.field6884 = class467.field6940.field4641;
            } else {
                int var3 = (class412.field6262 << 8) / class279.field4581;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class91.field1517 = ((class41.field683 & 0xFF00) * var3 + (class467.field6940.field4635 & 0xFF00) * var4 & 0xFF0000) + ((class41.field683 & 0xFF00FF) * var3 + (class467.field6940.field4635 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class295.field4752 = (class467.field6940.field4634 - class338.field5301) * var6 + class338.field5301;
                class59.field913 = class154.field2505 * var3 + class467.field6940.field4637 * var4 >> 8;
                class507.field7383 = (class467.field6940.field4638 - class104.field1768) * var6 + class104.field1768;
                class424.field6387 = ((class468.field6954 & 0xFF00FF) * var3 + (class467.field6940.field4642 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class468.field6954 & 0xFF00) * var3 + (class467.field6940.field4642 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class165.field2614 = (class467.field6940.field4633 - class495.field7232) * var6 + class495.field7232;
                class148.field2401 = (class467.field6940.field4636 - class323.field5062) * var6 + class323.field5062;
                class375.field5849 = (class467.field6940.field4645 - class72.field1244) * var6 + class72.field1244;
                class135.field2292 = (class467.field6940.field4650 - class362.field5633) * var6 + class362.field5633;
                if (class421.field6363 != class467.field6940.field4641) {
                    class463.field6884 = class533.field7842.method812(class421.field6363, class467.field6940.field4641, var6, class463.field6884);
                }
            }
            class467.field6941 = var1;
        }
        if (arg0 < -70) {
            field4709++;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lih;II)V", line = 671)
    public class289(class214 arg0, int arg1, int arg2) {
        this.field4697 = new byte[arg1 * arg2];
    }
}
