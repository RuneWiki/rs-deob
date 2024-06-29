import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class241 {

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "J")
    public long field3856 = 0L;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3849 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Z")
    public static boolean field3848 = false;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Z")
    public static boolean field3863 = true;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[I")
    public static int[] field3853 = new int[2048];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lth;")
    public class126 field3854;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lth;")
    public class126 field3864;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[Lqi;")
    public static class232[] field3857;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZII)I", line = 5)
    public static final int method1725(boolean arg0, int arg1, int arg2) {
        field3862++;
        int var3 = 0;
        if (!arg0) {
            method1727(119, -27, 9, -42, 99, -13);
        }
        while (arg2 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg2--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 28)
    public static final void method1726(boolean arg0) {
        field3858++;
        class307.method2131((byte) -91);
        class145.method1000(-1225681535);
        class226.method1619(false);
        class239.method1713((byte) -128);
        class316.method2182(-62);
        class180.method1292((byte) 65);
        class32.method224((byte) 125);
        class89.method638(104);
        if (!arg0) {
            field3853 = (int[]) null;
        }
        class283.method1992((byte) -92);
        class186.method1343(-28931);
        class131.method922((byte) -68);
        class125.method881(0);
        class113.method819(110);
        class292.method2024((byte) 66);
        class245.field3914.method135(18436);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method1727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3861++;
        long var6 = class95.method679(arg3, arg1, arg2);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3FC788) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg0;
            if (var6 > 0L) {
                var10 = arg4;
            }
            int[] var11 = class54.field801;
            int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int var13 = 24624 - (-(arg1 * 4) - (52736 - (arg2 * 512)) * 4);
            class171 var14 = class234.method1684(-2441, var12);
            if (var14.field2744 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 515] = var10;
                        var11[var13 + 3 + 1024] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1536 + 1] = var10;
                        var11[var13 + 1536 + 2] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 512 + 3] = var10;
                        var11[var13 + 1027] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1 + 1536] = var10;
                        var11[var13 + 2 + 1536] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class279 var15 = null;
                if (!var14.field2723) {
                    var15 = class75.field1121[var14.field2744];
                } else if (var8 == 0) {
                    var15 = class75.field1121[var14.field2744];
                } else if (var8 == 1) {
                    var15 = class104.field1470[var14.field2744];
                } else if (var8 == 2) {
                    var15 = class35.field530[var14.field2744];
                } else if (var8 == 3) {
                    var15 = class89.field1303[var14.field2744];
                }
                if (var15 != null) {
                    int var16 = (var14.field2784 * 4 - var15.field5300) / 2;
                    int var17 = (var14.field2752 * 4 - var15.field5306) / 2;
                    var15.method44(arg1 * 4 + var17 + 48, (104 - arg2 - var14.field2784) * 4 + var16 + 48);
                }
            }
        }
        long var18 = class281.method1982(arg3, arg1, arg2);
        if ((long) arg5 != var18) {
            int var20 = ((int) var18 & 0x3D8A33) >> 20;
            int var21 = ((int) var18 & 0x7EC41) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class171 var23 = class234.method1684(arg5 - 2441, var22);
            if (var23.field2744 != -1) {
                class279 var27 = null;
                if (!var23.field2723) {
                    var27 = class75.field1121[var23.field2744];
                } else if (var20 == 0) {
                    var27 = class75.field1121[var23.field2744];
                } else if (var20 == 1) {
                    var27 = class104.field1470[var23.field2744];
                } else if (var20 == 2) {
                    var27 = class35.field530[var23.field2744];
                } else if (var20 == 3) {
                    var27 = class89.field1303[var23.field2744];
                }
                if (var27 != null) {
                    int var28 = (var23.field2752 * 4 - var27.field5306) / 2;
                    int var29 = (var23.field2784 * 4 - var27.field5300) / 2;
                    var27.method44(arg1 * 4 + var28 + 48, 48 - -((-var23.field2784 + 104 - arg2) * 4) + var29);
                }
            } else if (var21 == 9) {
                int[] var24 = class54.field801;
                int var25 = arg1 * 4 + ((-(arg2 * 512) + 52736) * 4) + 24624;
                int var26 = 15658734;
                if (var18 > 0L) {
                    var26 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var24[var25 + 1536] = var26;
                    var24[var25 + 1 + 1024] = var26;
                    var24[var25 + 514] = var26;
                    var24[var25 + 3] = var26;
                } else {
                    var24[var25] = var26;
                    var24[var25 + 1 + 512] = var26;
                    var24[var25 + 1024 + 2] = var26;
                    var24[var25 + 1536 + 3] = var26;
                }
            }
        }
        long var30 = class14.method62(arg3, arg1, arg2);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class171 var34 = class234.method1684(arg5 ^ 0xFFFFF677, var33);
        if (var34.field2744 == -1) {
            return;
        }
        class279 var35 = null;
        if (!var34.field2723) {
            var35 = class75.field1121[var34.field2744];
        } else if (var32 == 0) {
            var35 = class75.field1121[var34.field2744];
        } else if (var32 == 1) {
            var35 = class104.field1470[var34.field2744];
        } else if (var32 == 2) {
            var35 = class35.field530[var34.field2744];
        } else if (var32 == 3) {
            var35 = class89.field1303[var34.field2744];
        }
        if (var35 != null) {
            int var36 = (var34.field2752 * 4 - var35.field5306) / 2;
            int var37 = (var34.field2784 * 4 - var35.field5300) / 2;
            var35.method44(arg1 * 4 + var36 + 48, (104 - arg2 + -var34.field2784) * 4 + 48 - -var37);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Lid;", line = 378)
    public static final class107 method1728(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        return var3 == null || var3.field5207 == null ? null : var3.field5207;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 396)
    public static void method1729(byte arg0) {
        field3857 = null;
        if (arg0 != 22) {
            method1731(-109);
        }
        field3853 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqd;", line = 407)
    public static final class173 method1730(Throwable arg0, String arg1) {
        field3850++;
        class173 var2;
        if (arg0 instanceof class173) {
            var2 = (class173) arg0;
            var2.field2811 = var2.field2811 + ' ' + arg1;
        } else {
            var2 = new class173(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 430)
    public static final void method1731(int arg0) {
        if (arg0 == 62838176) {
            class186.field3031 = new class86(32);
            field3852++;
        }
    }
}
