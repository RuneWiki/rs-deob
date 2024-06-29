import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class274 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([JI[JII)V")
    public static final void method1856(long[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BI[BII)V")
    public static final void method1857(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([SI[SII)V")
    public static final void method1858(short[] arg0, int arg1, short[] arg2, int arg3, int arg4) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
    public static final void method1859(Object[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([III)V")
    public static final void method1860(int[] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([II[III)V")
    public static final void method1861(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([IIII)V")
    public static final void method1862(int[] arg0, int arg1, int arg2, int arg3) {
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
}
