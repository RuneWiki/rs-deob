import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class242 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIII)V", line = 5)
    public static final void method1839(int[] arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 + arg2 - 7;
        while (arg1 < var4) {
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
        }
        var4 += 7;
        while (arg1 < var4) {
            arg0[arg1++] = arg3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([JI[JII)V", line = 24)
    public static final void method1840(long[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 3;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 3;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 3;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 3;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI[BII)V", line = 69)
    public static final void method1841(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([II[III)V", line = 124)
    public static final void method1842(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([SIIS)V", line = 179)
    public static final void method1843(short[] arg0, int arg1, int arg2, short arg3) {
        int var4 = arg1 + arg2 - 7;
        while (arg1 < var4) {
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
            arg0[arg1++] = arg3;
        }
        var4 += 7;
        while (arg1 < var4) {
            arg0[arg1++] = arg3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V", line = 198)
    public static final void method1844(Object[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([SI[SII)V", line = 251)
    public static final void method1845(short[] arg0, int arg1, short[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([FI[FII)V", line = 304)
    public static final void method1846(float[] arg0, int arg1, float[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([III)V", line = 358)
    public static final void method1847(int[] arg0, int arg1, int arg2) {
        int var3 = arg1 + arg2 - 7;
        while (arg1 < var3) {
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
        }
        var3 += 7;
        while (arg1 < var3) {
            arg0[arg1++] = 0;
        }
    }
}
