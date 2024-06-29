import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class122 extends class195 {

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "[B")
    public byte[] field1686;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "[C")
    public static char[] field1693 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "Ljb;")
    public static class519 field1689 = new class519(100, -2);

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "Luq;")
    public static class172 field1688;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)I")
    public static final int method875(int arg0, int arg1, int arg2, int arg3) {
        field1677++;
        if (arg0 == arg1) {
            return arg1;
        }
        if (arg2 != -2) {
            method875(5, -35, -42, -72);
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * arg3 + (arg1 & 0x7F) * var4 >> 7;
        int var6 = (arg1 & 0x380) * var4 + ((arg0 & 0x380) * arg3) >> 7;
        int var7 = (arg0 & 0xFC00) * arg3 + (arg1 & 0xFC00) * var4 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)Z")
    public final boolean method876(int arg0, byte arg1, int arg2) {
        field1687++;
        if (arg1 >= -38) {
            return false;
        } else {
            return this.field1686.length >= (arg0 * arg2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V")
    public static final void method877(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class422.field6068[var1] = false;
        }
        field1692++;
        class697.field9252 = 5;
        class446.field6420 = class74.field1000;
        class550.field7591 = -1;
        class4.field29 = class223.field2892;
        class143.field1916 = 0;
        if (arg0 < 64) {
            field1681 = 121;
        }
        class692.field9220 = class41.field442;
        class126.field1724 = class572.field7788;
        class609.field8242 = -1;
        class702.field9303 = -1;
        class577.field7864 = -1;
        class500.field7000 = class435.field6273;
        class430.field6225 = 0;
        class194.field2520 = class269.field3926;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIIIIII)V")
    public final void method878(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1683++;
        int var8 = 0;
        if (arg5 != arg6) {
            var8 = (arg4 - arg3 << 16) / (arg5 - arg6);
        }
        if (arg0 != -114) {
            this.method876(17, (byte) 33, -100);
        }
        int var9 = 0;
        if (arg1 != arg5) {
            var9 = (arg2 - arg4 << 16) / (arg1 - arg5);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg3 - arg2 << 16) / (arg6 - arg1);
        }
        if (arg6 <= arg5 && arg1 >= arg6) {
            if (arg1 > arg5) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg6 < 0) {
                    var12 -= arg6 * var10;
                    var11 -= arg6 * var8;
                    arg6 = 0;
                }
                int var13 = arg4 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg5 != arg6 && var8 > var10 || arg5 == arg6 && var9 < var10) {
                    int var14 = arg1 - arg5;
                    int var15 = arg5 - arg6;
                    int var16 = this.field1682 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var12 >> 16, -113, 0, var13 >> 16, var16);
                                var16 += this.field1682;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class775.method4265(this.field1686, var12 >> 16, -112, 0, var11 >> 16, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field1682;
                    }
                } else {
                    int var17 = arg1 - arg5;
                    int var18 = arg5 - arg6;
                    int var19 = this.field1682 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var13 >> 16, arg0 ^ 0x1, 0, var12 >> 16, var19);
                                var13 += var9;
                                var12 += var10;
                                var19 += this.field1682;
                            }
                        }
                        class775.method4265(this.field1686, var11 >> 16, -117, 0, var12 >> 16, var19);
                        var19 += this.field1682;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg2 << 16;
                if (arg6 < 0) {
                    var20 -= arg6 * var8;
                    var21 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var9 > var8) {
                    int var23 = arg5 - arg1;
                    int var24 = arg1 - arg6;
                    int var25 = this.field1682 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var22 >> 16, arg0 ^ 0x4, 0, var20 >> 16, var25);
                                var25 += this.field1682;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class775.method4265(this.field1686, var21 >> 16, arg0 ^ 0x1E, 0, var20 >> 16, var25);
                        var25 += this.field1682;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg5 - arg1;
                    int var27 = arg1 - arg6;
                    int var28 = this.field1682 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var20 >> 16, -121, 0, var22 >> 16, var28);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field1682;
                            }
                        }
                        class775.method4265(this.field1686, var20 >> 16, -108, 0, var21 >> 16, var28);
                        var28 += this.field1682;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg5 <= arg1) {
            if (arg6 > arg1) {
                int var29;
                int var30 = var29 = arg4 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var9;
                    var30 -= arg5 * var8;
                    arg5 = 0;
                }
                int var31 = arg2 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if ((arg1 == arg5 || var8 >= var9) && (arg1 != arg5 || var10 >= var8)) {
                    int var35 = arg6 - arg1;
                    int var36 = arg1 - arg5;
                    int var37 = this.field1682 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var31 >> 16, -120, 0, var30 >> 16, var37);
                                var31 += var10;
                                var30 += var8;
                                var37 += this.field1682;
                            }
                        }
                        class775.method4265(this.field1686, var29 >> 16, -116, 0, var30 >> 16, var37);
                        var30 += var8;
                        var37 += this.field1682;
                        var29 += var9;
                    }
                } else {
                    int var32 = arg6 - arg1;
                    int var33 = arg1 - arg5;
                    int var34 = this.field1682 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var30 >> 16, -112, 0, var31 >> 16, var34);
                                var34 += this.field1682;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class775.method4265(this.field1686, var30 >> 16, -124, 0, var29 >> 16, var34);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field1682;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg5 < 0) {
                    var39 -= arg5 * var8;
                    var38 -= arg5 * var9;
                    arg5 = 0;
                }
                int var40 = arg3 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg1 - arg6;
                    int var42 = arg6 - arg5;
                    int var43 = this.field1682 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var38 >> 16, -109, 0, var40 >> 16, var43);
                                var43 += this.field1682;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class775.method4265(this.field1686, var38 >> 16, arg0 - 11, 0, var39 >> 16, var43);
                        var39 += var8;
                        var43 += this.field1682;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg1 - arg6;
                    int var45 = arg6 - arg5;
                    int var46 = this.field1682 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class775.method4265(this.field1686, var40 >> 16, -108, 0, var38 >> 16, var46);
                                var38 += var9;
                                var46 += this.field1682;
                                var40 += var10;
                            }
                        }
                        class775.method4265(this.field1686, var39 >> 16, arg0 ^ 0x9, 0, var38 >> 16, var46);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field1682;
                    }
                }
            }
        } else if (arg6 < arg5) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var9;
                var47 -= arg1 * var10;
                arg1 = 0;
            }
            int var49 = arg3 << 16;
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var9 < var10) {
                int var50 = arg5 - arg6;
                int var51 = arg6 - arg1;
                int var52 = this.field1682 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class775.method4265(this.field1686, var48 >> 16, -114, 0, var49 >> 16, var52);
                            var48 += var9;
                            var49 += var8;
                            var52 += this.field1682;
                        }
                    }
                    class775.method4265(this.field1686, var48 >> 16, -114, 0, var47 >> 16, var52);
                    var48 += var9;
                    var52 += this.field1682;
                    var47 += var10;
                }
            } else {
                int var53 = arg5 - arg6;
                int var54 = arg6 - arg1;
                int var55 = this.field1682 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class775.method4265(this.field1686, var49 >> 16, -120, 0, var48 >> 16, var55);
                            var49 += var8;
                            var48 += var9;
                            var55 += this.field1682;
                        }
                    }
                    class775.method4265(this.field1686, var47 >> 16, -124, 0, var48 >> 16, var55);
                    var48 += var9;
                    var55 += this.field1682;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg4 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var9;
                var56 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg5 < 0) {
                var58 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 < var10) {
                int var59 = arg6 - arg5;
                int var60 = arg5 - arg1;
                int var61 = this.field1682 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class775.method4265(this.field1686, var58 >> 16, arg0 + 3, 0, var56 >> 16, var61);
                            var61 += this.field1682;
                            var56 += var10;
                            var58 += var8;
                        }
                    }
                    class775.method4265(this.field1686, var57 >> 16, arg0 + 3, 0, var56 >> 16, var61);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field1682;
                }
            } else {
                int var62 = arg6 - arg5;
                int var63 = arg5 - arg1;
                int var64 = this.field1682 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class775.method4265(this.field1686, var56 >> 16, -108, 0, var58 >> 16, var64);
                            var56 += var10;
                            var58 += var8;
                            var64 += this.field1682;
                        }
                    }
                    class775.method4265(this.field1686, var56 >> 16, -125, 0, var57 >> 16, var64);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field1682;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
    public static final void method879(int arg0, int arg1, int arg2) {
        field1695++;
        class778 var3 = class389.method2406(51, (long) arg0, 15);
        var3.method4274(117);
        var3.field10692 = arg2;
        var3.field10690 = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public final void method880(int arg0) {
        field1679++;
        int var2 = -1;
        int var3 = this.field1686.length - 8;
        if (arg0 != -582811760) {
            method877((byte) 78);
        }
        while (var2 < var3) {
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
            var2++;
            this.field1686[var2] = 0;
        }
        while ((this.field1686.length - 1) > var2) {
            var2++;
            this.field1686[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public static void method881(int arg0) {
        field1688 = null;
        field1693 = null;
        if (arg0 == -21864) {
            field1689 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lka;IIII)Lln;")
    public static final class398 method882(class497 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1684++;
        if (arg0 == null) {
            return null;
        } else {
            int var5 = -78 % ((arg4 + 61) / 54);
            return new class398(arg2, arg3, arg1, arg0.method280(), arg0.method252(), arg0.method250(), arg0.method265(), arg0.method291(), arg0.method246(), arg0.method273());
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public final void method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1680 = arg3;
        field1678++;
        this.field1691 = arg1;
        this.field1690 = arg4 - arg3;
        if (arg0 != 7209) {
            method875(29, 103, 52, 57);
        }
        this.field1682 = arg2 - arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static final void method884(boolean arg0) {
        for (class480 var1 = (class480) class572.field7792.method2193((byte) 59); var1 != null; var1 = (class480) class572.field7792.method2193((byte) 59)) {
            class687.method3771(var1, (byte) 67);
        }
        field1685++;
        int var2;
        int var3;
        if (class125.field1721.field5155.method591(43) == 1) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class786.field10794;
            var2 = class786.field10794;
        }
        client.method2036();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method2048();
            client.method2042(var4);
            client.method2037(var4);
        }
        client.method2047();
        if (!arg0) {
            field1694 = 79;
        }
        client.method2046();
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lee;II)V")
    public class122(class703 arg0, int arg1, int arg2) {
        this.field1686 = new byte[arg1 * arg2];
    }
}
