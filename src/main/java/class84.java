import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class84 {

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Z")
    public static boolean field1227 = false;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "S")
    public static short field1231 = 256;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "[[I")
    public static int[][] field1234 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lni;")
    public static class367 field1226 = new class367(41, 4);

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "[Lvs;")
    public static class425[] field1237 = new class425[14];

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method575(int arg0, byte arg1) {
        field1233++;
        if (arg1 != -57) {
            method580(-114, false);
        }
        for (class5 var2 = class385.field5845.method1743(false); var2 != null; var2 = class385.field5845.method1742(arg1 ^ 0x5D)) {
            if ((var2.field35 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method25(-13489);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;", line = 32)
    public final String toString() {
        field1232++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 49)
    public static final void method576(int arg0, int arg1, int arg2) {
        if (class531.field7814 != arg0) {
            class195.field2616 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class195.field2616[var3] = (var3 << 12) / arg0;
            }
            class492.field7258 = arg0 * 32;
            class179.field2409 = arg0 - 1;
            class531.field7814 = arg0;
        }
        if (arg2 != -16531) {
            return;
        }
        field1224++;
        if (class33.field511 == arg1) {
            return;
        }
        if (class531.field7814 == arg1) {
            class350.field5392 = class195.field2616;
        } else {
            class350.field5392 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class350.field5392[var4] = (var4 << 12) / arg1;
            }
        }
        class33.field511 = arg1;
        class423.field6453 = arg1 - 1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)I", line = 96)
    public static final int method577(int arg0, int arg1, byte arg2) {
        field1236++;
        if (arg2 != -74) {
            return -78;
        } else if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLwj;Z)V", line = 136)
    public static final void method578(boolean arg0, class275 arg1, boolean arg2) {
        field1222++;
        class485 var3 = arg1.method1759(-72);
        if (arg1.field3918 == 0) {
            arg1.field3914 = 0;
            class235.field3331 = 0;
            class103.field1484 = -1;
            return;
        }
        if (arg1.field3871 != -1 && arg1.field3886 == 0) {
            class91 var4 = class201.field2707.method489(98, arg1.field3871);
            if (arg1.field3910 > 0 && var4.field1334 == 0) {
                class235.field3331 = 0;
                arg1.field3914++;
                class103.field1484 = -1;
                return;
            }
            if (arg1.field3910 <= 0 && var4.field1314 == 0) {
                arg1.field3914++;
                class235.field3331 = 0;
                class103.field1484 = -1;
                return;
            }
        }
        if (arg1.field3850 != -1 && arg1.field3844 <= class393.field6017) {
            class11 var5 = class239.field3360.method2836((byte) -127, arg1.field3850);
            if (var5.field201 && var5.field192 != -1) {
                class91 var6 = class201.field2707.method489(124, var5.field192);
                if (arg1.field3910 > 0 && var6.field1334 == 0) {
                    arg1.field3914++;
                    class103.field1484 = -1;
                    class235.field3331 = 0;
                    return;
                }
                if (arg1.field3910 <= 0 && var6.field1314 == 0) {
                    class235.field3331 = 0;
                    class103.field1484 = -1;
                    arg1.field3914++;
                    return;
                }
            }
        }
        if (arg1.field3850 != -1 && class393.field6017 >= arg1.field3844) {
            class11 var7 = class239.field3360.method2836((byte) 34, arg1.field3850);
            if (var7.field201 && var7.field192 != -1) {
                class91 var8 = class201.field2707.method489(63, var7.field192);
                if (arg1.field3910 > 0 && var8.field1334 == 0) {
                    arg1.field3914++;
                    class103.field1484 = -1;
                    class235.field3331 = 0;
                    return;
                }
                if (arg1.field3910 <= 0 && var8.field1314 == 0) {
                    arg1.field3914++;
                    class103.field1484 = -1;
                    class235.field3331 = 0;
                    return;
                }
            }
        }
        int var9 = arg1.field1867;
        int var10 = arg1.field1862;
        int var11 = arg1.field3917[arg1.field3918 - 1] * 128 + (arg1.method637((byte) -122) * 64);
        int var12 = arg1.field3915[arg1.field3918 - 1] * 128 + arg1.method637((byte) 25) * 64;
        if (var11 > var9) {
            if (var12 > var10) {
                arg1.method1766((byte) -123, 10240);
            } else if (var12 >= var10) {
                arg1.method1766((byte) -123, 12288);
            } else {
                arg1.method1766((byte) -128, 14336);
            }
        } else if (var9 > var11) {
            if (var10 < var12) {
                arg1.method1766((byte) -121, 6144);
            } else if (var10 <= var12) {
                arg1.method1766((byte) -121, 4096);
            } else {
                arg1.method1766((byte) -125, 2048);
            }
        } else if (var10 < var12) {
            arg1.method1766((byte) -121, 8192);
        } else if (var12 < var10) {
            arg1.method1766((byte) -124, 0);
        }
        byte var13 = arg1.field3908[arg1.field3918 - 1];
        if (!arg0 && var11 - var9 > 256 || (var11 - var9) < -256 || (var12 - var10) > 256 || var12 - var10 < -256) {
            arg1.field1862 = var12;
            arg1.field1867 = var11;
            arg1.method1768(arg1.field3887, false, 6946);
            class103.field1484 = -1;
            if (arg1.field3910 > 0) {
                arg1.field3910--;
            }
            arg1.field3918--;
            class235.field3331 = 0;
            return;
        }
        int var14 = 4;
        boolean var15 = arg2;
        if (arg1 instanceof class17) {
            var15 = ((class17) arg1).field274.field3628;
        }
        if (var15) {
            int var16 = arg1.field3887 - arg1.field3840.field2028;
            if (var16 != 0 && arg1.field3833 == -1 && arg1.field3878 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg1.field3918 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg1.field3918 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg1.field3918 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg1.field3918 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field3914 > 0 && arg1.field3918 > 1) {
            arg1.field3914--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field7187 != -1) {
            int var17 = var14 << 7;
            if (arg1.field3918 == 1) {
                int var18 = arg1.field3916 * arg1.field3916;
                int var19 = (var11 >= arg1.field1867 ? var11 - arg1.field1867 : arg1.field1867 - var11) << 7;
                int var20 = (arg1.field1862 > var12 ? arg1.field1862 - var12 : -arg1.field1862 + var12) << 7;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var21 * 2 * var3.field7187;
                if (var22 < var18) {
                    arg1.field3916 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg1.field3916 -= var3.field7187;
                    if (arg1.field3916 < 0) {
                        arg1.field3916 = 0;
                    }
                } else if (var17 > arg1.field3916) {
                    arg1.field3916 += var3.field7187;
                    if (var17 < arg1.field3916) {
                        arg1.field3916 = var17;
                    }
                }
            } else if (arg1.field3916 < var17) {
                arg1.field3916 += var3.field7187;
                if (arg1.field3916 > var17) {
                    arg1.field3916 = var17;
                }
            } else if (arg1.field3916 > 0) {
                arg1.field3916 -= var3.field7187;
                if (arg1.field3916 < 0) {
                    arg1.field3916 = 0;
                }
            }
            var14 = arg1.field3916 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class235.field3331 = 0;
        if (var9 == var11 && var10 == var12) {
            class103.field1484 = -1;
        } else {
            if (var9 < var11) {
                class235.field3331 |= 0x4;
                arg1.field1867 += var14;
                if (arg1.field1867 > var11) {
                    arg1.field1867 = var11;
                }
            } else if (var11 < var9) {
                class235.field3331 |= 0x8;
                arg1.field1867 -= var14;
                if (arg1.field1867 < var11) {
                    arg1.field1867 = var11;
                }
            }
            if (var14 < 8) {
                class103.field1484 = var13;
            } else {
                class103.field1484 = 2;
            }
            if (var12 > var10) {
                class235.field3331 |= 0x1;
                arg1.field1862 += var14;
                if (arg1.field1862 > var12) {
                    arg1.field1862 = var12;
                }
            } else if (var10 > var12) {
                class235.field3331 |= 0x2;
                arg1.field1862 -= var14;
                if (var12 > arg1.field1862) {
                    arg1.field1862 = var12;
                }
            }
        }
        if (arg1.field1867 == var11 && arg1.field1862 == var12) {
            if (arg1.field3910 > 0) {
                arg1.field3910--;
            }
            arg1.field3918--;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 477)
    public static void method579(byte arg0) {
        if (arg0 <= -34) {
            field1234 = null;
            field1237 = null;
            field1226 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)Z", line = 496)
    public static final boolean method580(int arg0, boolean arg1) {
        class282.field4074 = arg1;
        class508.field7476 = arg0 + 1 & 0xFFFF;
        field1225++;
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIII)V", line = 511)
    public class84(int arg0, int arg1, int arg2, int arg3) {
        this.field1235 = arg0;
        this.field1228 = arg2;
        this.field1220 = arg3;
        this.field1229 = arg1;
    }
}
