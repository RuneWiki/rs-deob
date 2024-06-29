import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class123 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lkk;")
    public static class112 field2175;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Ls;")
    public static class171 field2183;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lgb;")
    public static class213 field2182;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lqe;")
    public static class35 field2180;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 4)
    public static void method897(int arg0) {
        if (arg0 >= 24) {
            field2183 = null;
            field2182 = null;
            field2180 = null;
            field2175 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lhm;", line = 31)
    public static final class101 method898(int arg0, int arg1) {
        field2178++;
        class101 var2 = (class101) class153.field2627.method1159((byte) 124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2229.method1453(class219.method1487((byte) -126, arg1), (byte) -18, class114.method832(arg1, 15));
        class101 var4 = new class101();
        var4.field1801 = arg1;
        if (var3 != null) {
            var4.method771(-92, new class235(var3));
        }
        var4.method757(-6);
        if (!class87.field1474 && var4.field1808) {
            var4.field1838 = null;
        }
        if (arg0 != -935) {
            return (class101) null;
        }
        if (var4.field1855) {
            var4.field1847 = false;
            var4.field1792 = 0;
        }
        class153.field2627.method1163(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLgb;)Z", line = 67)
    public static final boolean method899(boolean arg0, class213 arg1) {
        field2172++;
        if (arg0) {
            field2183 = (class171) null;
        }
        return arg1.method1433((byte) -73, class248.field4286);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrk;IIIZ)V", line = 87)
    public void method711(class123 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2173++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([Led;[BZIII)V", line = 95)
    public static final void method900(class245[] arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class235 var6 = new class235(arg1);
        field2174++;
        if (arg5 != 2) {
            field2183 = (class171) null;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1600(arg5 ^ 0x7FFD);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1613((byte) 28);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFFA) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1589(arg5 + 112);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg4 + var12;
                int var18 = var11 + arg3;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class245 var19 = null;
                    if (!arg2) {
                        int var20 = var13;
                        if ((class94.field1653[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class284.method1995(var19, var15, var17, var16, var7, var13, arg2, var18, var13, !arg2, (byte) -126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Lrk;", line = 171)
    public class123 method735(int arg0, int arg1, int arg2) {
        field2177++;
        return this;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()Z", line = 192)
    public boolean method709() {
        field2185++;
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 200)
    public void method368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 63) {
            field2181++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 215)
    public static final void method901(boolean arg0) {
        field2176++;
        int var1 = class303.field5174 * 128 + 64;
        int var2 = class78.field1334 * 128 + 64;
        int var3 = class228.method1525(true, class272.field4704, var1, var2) - class165.field2800;
        if (class197.field3471 >= 100) {
            class61.field1086 = class303.field5174 * 128 + 64;
            class285.field4906 = class78.field1334 * 128 + 64;
            class245.field4258 = class228.method1525(arg0, class272.field4704, class61.field1086, class285.field4906) - class165.field2800;
        } else {
            if (class61.field1086 < var1) {
                class61.field1086 += class152.field2616 + ((var1 - class61.field1086) * class197.field3471 / 1000);
                if (var1 < class61.field1086) {
                    class61.field1086 = var1;
                }
            }
            if (class61.field1086 > var1) {
                class61.field1086 -= (class61.field1086 - var1) * class197.field3471 / 1000 + class152.field2616;
                if (var1 > class61.field1086) {
                    class61.field1086 = var1;
                }
            }
            if (var3 > class245.field4258) {
                class245.field4258 += (var3 - class245.field4258) * class197.field3471 / 1000 + class152.field2616;
                if (class245.field4258 > var3) {
                    class245.field4258 = var3;
                }
            }
            if (class245.field4258 > var3) {
                class245.field4258 -= (class245.field4258 - var3) * class197.field3471 / 1000 + class152.field2616;
                if (class245.field4258 < var3) {
                    class245.field4258 = var3;
                }
            }
            if (class285.field4906 < var2) {
                class285.field4906 += (var2 - class285.field4906) * class197.field3471 / 1000 + class152.field2616;
                if (var2 < class285.field4906) {
                    class285.field4906 = var2;
                }
            }
            if (var2 < class285.field4906) {
                class285.field4906 -= (class285.field4906 - var2) * class197.field3471 / 1000 + class152.field2616;
                if (class285.field4906 < var2) {
                    class285.field4906 = var2;
                }
            }
        }
        int var4 = class5.field69 * 128 + 64;
        int var5 = class236.field4126 * 128 + 64;
        int var6 = class228.method1525(arg0, class272.field4704, var5, var4) - class245.field4263;
        int var7 = var5 - class61.field1086;
        int var8 = var4 - class285.field4906;
        int var9 = var6 - class245.field4258;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
        if (class106.field1894 < var11) {
            class106.field1894 += (var11 - class106.field1894) * class101.field1825 / 1000 + class194.field3428;
            if (class106.field1894 > var11) {
                class106.field1894 = var11;
            }
        }
        int var13 = var12 - class90.field1576;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class106.field1894 > var11) {
            class106.field1894 -= class194.field3428 + ((class106.field1894 - var11) * class101.field1825 / 1000);
            if (var11 > class106.field1894) {
                class106.field1894 = var11;
            }
        }
        if (var13 > 0) {
            class90.field1576 += class101.field1825 * var13 / 1000 + class194.field3428;
            class90.field1576 &= 0x7FF;
        }
        if (var13 < 0) {
            class90.field1576 -= class194.field3428 + (-var13 * class101.field1825 / 1000);
            class90.field1576 &= 0x7FF;
        }
        int var14 = var12 - class90.field1576;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class90.field1576 = var12;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()I")
    public abstract int method361();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
