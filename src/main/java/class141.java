import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class141 {

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "[I")
    public static int[] field1953 = new int[1000];

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "[S")
    public static short[] field1946 = new short[] { 58, 50, 22, 21, 23, 8, 18, 60 };

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "[[I")
    public int[][] field1944;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1942++;
        int var7 = arg1 + arg2;
        int var8 = arg3 + arg6;
        int var9 = arg0 + arg5;
        if (arg4 > -92) {
            field1953 = null;
        }
        if (!class640.method3720(arg2, arg2, var9, true, var8, var9, var8, var7, arg0, var8)) {
            return false;
        } else if (class640.method3720(var7, arg2, arg0, true, var8, var9, var8, var7, arg0, var8)) {
            if (arg2 < class310.field3978) {
                if (!class640.method3720(arg2, arg2, arg0, true, var8, var9, arg6, arg2, var9, var8)) {
                    return false;
                }
                if (!class640.method3720(arg2, arg2, arg0, true, arg6, arg0, arg6, arg2, var9, var8)) {
                    return false;
                }
            } else if (!class640.method3720(var7, var7, arg0, true, var8, var9, arg6, var7, var9, var8)) {
                return false;
            } else if (!class640.method3720(var7, var7, arg0, true, arg6, arg0, arg6, var7, var9, var8)) {
                return false;
            }
            if (class125.field1705 <= arg0) {
                if (!class640.method3720(arg2, arg2, var9, true, var8, var9, arg6, var7, var9, var8)) {
                    return false;
                }
                if (!class640.method3720(var7, arg2, var9, true, arg6, var9, arg6, var7, var9, var8)) {
                    return false;
                }
            } else if (!class640.method3720(arg2, arg2, arg0, true, var8, arg0, arg6, var7, arg0, var8)) {
                return false;
            } else if (!class640.method3720(var7, arg2, arg0, true, arg6, arg0, arg6, var7, arg0, var8)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1939++;
        if (arg1 == 1) {
            if (arg3 == arg7 && arg4 == arg5) {
                return true;
            }
        } else if (arg7 >= arg3 && arg7 <= arg3 + arg1 - 1 && arg5 >= arg5 && arg5 <= arg1 + arg5 - 1) {
            return true;
        }
        int var9 = arg4 - this.field1949;
        int var10 = arg7 - this.field1940;
        if (arg2 != -10800) {
            this.method912(82, 6, -69, 32, -97, -94, 126, 114, -82, 118);
        }
        int var11 = arg3 - this.field1940;
        int var12 = arg5 - this.field1949;
        if (arg1 == 1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1944[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field1944[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1944[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field1944[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field1944[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1944[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1944[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1944[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field1944[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field1944[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field1944[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var11 - 1;
            int var14 = var9 + arg1 - 1;
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if ((var10 - arg1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field1944[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg1 == var9 && (this.field1944[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - arg1 == var11 && var12 >= var9 && var12 <= var14 && (this.field1944[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field1944[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field1944[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg1) == var9 && (this.field1944[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg1) == var9) {
                        return true;
                    }
                    if (var10 - arg1 == var11 && var9 <= var12 && var12 <= var14 && (this.field1944[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field1944[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if ((var10 - arg1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field1944[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg1) == var9 && (this.field1944[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - arg1 == var11 && var9 <= var12 && var12 <= var14 && (this.field1944[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg1) == var9 && (this.field1944[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - arg1 == var11 && var12 >= var9 && var14 >= var12 && (this.field1944[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field1944[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg1) == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - arg1 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9 && (this.field1944[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field1944[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 - arg1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field1944[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var13 && var12 - arg1 == var9 && (this.field1944[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg1 == var11 && var12 >= var9 && var14 >= var12 && (this.field1944[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field1944[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZIZII)V")
    public final void method911(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1941++;
        if (arg0 != 1) {
            this.field1940 = 50;
        }
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        int var9 = arg6 - this.field1949;
        int var10 = arg3 - this.field1940;
        if (arg2) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < var10 + arg1; var11++) {
            if (var11 >= 0 && this.field1945 > var11) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1960) {
                        this.method919(var12, var11, var8, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1952++;
        int var11 = arg5 + arg6;
        int var12 = arg1 + arg9;
        if (arg0 != -24775) {
            this.method915(-118, 3, -46, (byte) 40, false, true, -99);
        }
        int var13 = arg4 + arg7;
        int var14 = arg2 + arg3;
        if (arg6 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg1 > arg3 ? arg1 : arg3;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field1944[var13 - this.field1940 - 1][var15 - this.field1949] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg1 > arg3 ? arg1 : arg3;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field1944[arg7 - this.field1940][var17 - this.field1949] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg1 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg6 > arg7 ? arg6 : arg7;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field1944[var19 - this.field1940][var14 - this.field1949 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg7 >= arg6 ? arg7 : arg6;
            int var22 = var11 < var13 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field1944[var21 - this.field1940][arg3 - this.field1949] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZIIIZZ)V")
    public final void method913(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (!arg1) {
            field1953 = null;
        }
        field1955++;
        int var8 = arg0 - this.field1940;
        int var9 = arg4 - this.field1949;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method923(var9, 128, -31, var8);
                this.method923(var9, 8, -51, var8 - 1);
            }
            if (arg2 == 1) {
                this.method923(var9, 2, -123, var8);
                this.method923(var9 + 1, 32, -98, var8);
            }
            if (arg2 == 2) {
                this.method923(var9, 8, -105, var8);
                this.method923(var9, 128, -100, var8 + 1);
            }
            if (arg2 == 3) {
                this.method923(var9, 32, -118, var8);
                this.method923(var9 - 1, 2, -40, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method923(var9, 1, -57, var8);
                this.method923(var9 + 1, 16, -81, var8 - 1);
            }
            if (arg2 == 1) {
                this.method923(var9, 4, -118, var8);
                this.method923(var9 + 1, 64, -73, var8 + 1);
            }
            if (arg2 == 2) {
                this.method923(var9, 16, -81, var8);
                this.method923(var9 - 1, 1, -57, var8 + 1);
            }
            if (arg2 == 3) {
                this.method923(var9, 64, -85, var8);
                this.method923(var9 - 1, 4, -66, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method923(var9, 130, -52, var8);
                this.method923(var9, 8, -42, var8 - 1);
                this.method923(var9 + 1, 32, -33, var8);
            }
            if (arg2 == 1) {
                this.method923(var9, 10, -97, var8);
                this.method923(var9 + 1, 32, -118, var8);
                this.method923(var9, 128, -116, var8 + 1);
            }
            if (arg2 == 2) {
                this.method923(var9, 40, -60, var8);
                this.method923(var9, 128, -41, var8 + 1);
                this.method923(var9 - 1, 2, -47, var8);
            }
            if (arg2 == 3) {
                this.method923(var9, 160, -29, var8);
                this.method923(var9 - 1, 2, -16, var8);
                this.method923(var9, 8, -13, var8 - 1);
            }
        }
        if (arg5) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    this.method923(var9, 65536, -98, var8);
                    this.method923(var9, 4096, -64, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method923(var9, 1024, -104, var8);
                    this.method923(var9 + 1, 16384, -14, var8);
                }
                if (arg2 == 2) {
                    this.method923(var9, 4096, -33, var8);
                    this.method923(var9, 65536, -73, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method923(var9, 16384, -39, var8);
                    this.method923(var9 - 1, 1024, -19, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg2 == 0) {
                    this.method923(var9, 512, -34, var8);
                    this.method923(var9 + 1, 8192, -48, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method923(var9, 2048, -32, var8);
                    this.method923(var9 + 1, 32768, -73, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method923(var9, 8192, -116, var8);
                    this.method923(var9 - 1, 512, -32, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method923(var9, 32768, -30, var8);
                    this.method923(var9 - 1, 2048, -22, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    this.method923(var9, 66560, -119, var8);
                    this.method923(var9, 4096, -86, var8 - 1);
                    this.method923(var9 + 1, 16384, -106, var8);
                }
                if (arg2 == 1) {
                    this.method923(var9, 5120, -17, var8);
                    this.method923(var9 + 1, 16384, -5, var8);
                    this.method923(var9, 65536, -57, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method923(var9, 20480, -114, var8);
                    this.method923(var9, 65536, -31, var8 + 1);
                    this.method923(var9 - 1, 1024, -34, var8);
                }
                if (arg2 == 3) {
                    this.method923(var9, 81920, -37, var8);
                    this.method923(var9 - 1, 1024, -40, var8);
                    this.method923(var9, 4096, -113, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method923(var9, 536870912, -126, var8);
                this.method923(var9, 33554432, -64, var8 - 1);
            }
            if (arg2 == 1) {
                this.method923(var9, 8388608, -39, var8);
                this.method923(var9 + 1, 134217728, -125, var8);
            }
            if (arg2 == 2) {
                this.method923(var9, 33554432, -53, var8);
                this.method923(var9, 536870912, -35, var8 + 1);
            }
            if (arg2 == 3) {
                this.method923(var9, 134217728, -12, var8);
                this.method923(var9 - 1, 8388608, -101, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method923(var9, 4194304, -114, var8);
                this.method923(var9 + 1, 67108864, -65, var8 - 1);
            }
            if (arg2 == 1) {
                this.method923(var9, 16777216, -104, var8);
                this.method923(var9 + 1, 268435456, -127, var8 + 1);
            }
            if (arg2 == 2) {
                this.method923(var9, 67108864, -120, var8);
                this.method923(var9 - 1, 4194304, -68, var8 + 1);
            }
            if (arg2 == 3) {
                this.method923(var9, 268435456, -65, var8);
                this.method923(var9 - 1, 16777216, -62, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method923(var9, 545259520, -53, var8);
            this.method923(var9, 33554432, -60, var8 - 1);
            this.method923(var9 + 1, 134217728, -111, var8);
        }
        if (arg2 == 1) {
            this.method923(var9, 41943040, -86, var8);
            this.method923(var9 + 1, 134217728, -40, var8);
            this.method923(var9, 536870912, -101, var8 + 1);
        }
        if (arg2 == 2) {
            this.method923(var9, 167772160, -12, var8);
            this.method923(var9, 536870912, -30, var8 + 1);
            this.method923(var9 - 1, 8388608, -22, var8);
        }
        if (arg2 == 3) {
            this.method923(var9, 671088640, -68, var8);
            this.method923(var9 - 1, 8388608, -82, var8);
            this.method923(var9, 33554432, -44, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)V")
    public final void method914(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1940;
        int var5 = arg0 - this.field1949;
        field1962++;
        this.field1944[var4][var5] = class747.method4153(this.field1944[var4][var5], 262144);
        int var6 = 124 % ((arg1 - 62) / 47);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIBZZI)V")
    public final void method915(int arg0, int arg1, int arg2, byte arg3, boolean arg4, boolean arg5, int arg6) {
        field1959++;
        int var8 = arg1 - this.field1949;
        int var9 = arg2 - this.field1940;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method919(var8, var9, 128, false);
                this.method919(var8, var9 - 1, 8, false);
            }
            if (arg6 == 1) {
                this.method919(var8, var9, 2, false);
                this.method919(var8 + 1, var9, 32, false);
            }
            if (arg6 == 2) {
                this.method919(var8, var9, 8, false);
                this.method919(var8, var9 + 1, 128, false);
            }
            if (arg6 == 3) {
                this.method919(var8, var9, 32, false);
                this.method919(var8 - 1, var9, 2, false);
            }
        }
        if (arg3 != -81) {
            method909(-123, 32, -27, -1, -52, -28, -110);
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method919(var8, var9, 1, false);
                this.method919(var8 + 1, var9 - 1, 16, false);
            }
            if (arg6 == 1) {
                this.method919(var8, var9, 4, false);
                this.method919(var8 + 1, var9 + 1, 64, false);
            }
            if (arg6 == 2) {
                this.method919(var8, var9, 16, false);
                this.method919(var8 - 1, var9 + 1, 1, false);
            }
            if (arg6 == 3) {
                this.method919(var8, var9, 64, false);
                this.method919(var8 - 1, var9 + -1, 4, false);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method919(var8, var9, 130, false);
                this.method919(var8, var9 - 1, 8, false);
                this.method919(var8 + 1, var9, 32, false);
            }
            if (arg6 == 1) {
                this.method919(var8, var9, 10, false);
                this.method919(var8 + 1, var9, 32, false);
                this.method919(var8, var9 + 1, 128, false);
            }
            if (arg6 == 2) {
                this.method919(var8, var9, 40, false);
                this.method919(var8, var9 + 1, 128, false);
                this.method919(var8 - 1, var9, 2, false);
            }
            if (arg6 == 3) {
                this.method919(var8, var9, 160, false);
                this.method919(var8 - 1, var9, 2, false);
                this.method919(var8, var9 - 1, 8, false);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method919(var8, var9, 65536, false);
                    this.method919(var8, var9 - 1, 4096, false);
                }
                if (arg6 == 1) {
                    this.method919(var8, var9, 1024, false);
                    this.method919(var8 + 1, var9, 16384, false);
                }
                if (arg6 == 2) {
                    this.method919(var8, var9, 4096, false);
                    this.method919(var8, var9 + 1, 65536, false);
                }
                if (arg6 == 3) {
                    this.method919(var8, var9, 16384, false);
                    this.method919(var8 - 1, var9, 1024, false);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method919(var8, var9, 512, false);
                    this.method919(var8 + 1, var9 + -1, 8192, false);
                }
                if (arg6 == 1) {
                    this.method919(var8, var9, 2048, false);
                    this.method919(var8 + 1, var9 + 1, 32768, false);
                }
                if (arg6 == 2) {
                    this.method919(var8, var9, 8192, false);
                    this.method919(var8 - 1, var9 + 1, 512, false);
                }
                if (arg6 == 3) {
                    this.method919(var8, var9, 32768, false);
                    this.method919(var8 - 1, var9 + -1, 2048, false);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method919(var8, var9, 66560, false);
                    this.method919(var8, var9 - 1, 4096, false);
                    this.method919(var8 + 1, var9, 16384, false);
                }
                if (arg6 == 1) {
                    this.method919(var8, var9, 5120, false);
                    this.method919(var8 + 1, var9, 16384, false);
                    this.method919(var8, var9 + 1, 65536, false);
                }
                if (arg6 == 2) {
                    this.method919(var8, var9, 20480, false);
                    this.method919(var8, var9 + 1, 65536, false);
                    this.method919(var8 - 1, var9, 1024, false);
                }
                if (arg6 == 3) {
                    this.method919(var8, var9, 81920, false);
                    this.method919(var8 - 1, var9, 1024, false);
                    this.method919(var8, var9 - 1, 4096, false);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method919(var8, var9, 536870912, false);
                this.method919(var8, var9 - 1, 33554432, false);
            }
            if (arg6 == 1) {
                this.method919(var8, var9, 8388608, false);
                this.method919(var8 + 1, var9, 134217728, false);
            }
            if (arg6 == 2) {
                this.method919(var8, var9, 33554432, false);
                this.method919(var8, var9 + 1, 536870912, false);
            }
            if (arg6 == 3) {
                this.method919(var8, var9, 134217728, false);
                this.method919(var8 - 1, var9, 8388608, false);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method919(var8, var9, 4194304, false);
                this.method919(var8 + 1, var9 + -1, 67108864, false);
            }
            if (arg6 == 1) {
                this.method919(var8, var9, 16777216, false);
                this.method919(var8 + 1, var9 + 1, 268435456, false);
            }
            if (arg6 == 2) {
                this.method919(var8, var9, 67108864, false);
                this.method919(var8 - 1, var9 + 1, 4194304, false);
            }
            if (arg6 == 3) {
                this.method919(var8, var9, 268435456, false);
                this.method919(var8 - 1, var9 - 1, 16777216, false);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method919(var8, var9, 545259520, false);
            this.method919(var8, var9 - 1, 33554432, false);
            this.method919(var8 + 1, var9, 134217728, false);
        }
        if (arg6 == 1) {
            this.method919(var8, var9, 41943040, false);
            this.method919(var8 + 1, var9, 134217728, false);
            this.method919(var8, var9 + 1, 536870912, false);
        }
        if (arg6 == 2) {
            this.method919(var8, var9, 167772160, false);
            this.method919(var8, var9 + 1, 536870912, false);
            this.method919(var8 - 1, var9, 8388608, false);
        }
        if (arg6 == 3) {
            this.method919(var8, var9, 671088640, false);
            this.method919(var8 - 1, var9, 8388608, false);
            this.method919(var8, var9 - 1, 33554432, false);
            return;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
    public final void method916(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1940;
        field1956++;
        int var5 = arg2 - this.field1949;
        if (arg1 != -2) {
            this.field1944 = null;
        }
        this.field1944[var4][var5] = class747.method4153(this.field1944[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method917(int arg0) {
        field1946 = null;
        if (arg0 != -1) {
            field1953 = null;
        }
        field1953 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II[BIII)V")
    public static final void method918(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1951++;
        if (arg4 <= arg0) {
            return;
        }
        int var6 = arg4 - arg0 >> 2;
        int var7 = arg0 + arg1;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg4 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg5 == -27209) {
                            return;
                        } else {
                            method928(52, -12, null);
                            return;
                        }
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIZ)V")
    private final void method919(int arg0, int arg1, int arg2, boolean arg3) {
        field1938++;
        if (arg3) {
            this.method927(false, 28, false, -85, 7, -95, 25, 98);
        }
        this.field1944[arg1][arg0] = class747.method4153(this.field1944[arg1][arg0], arg2);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1943++;
        if (arg0 > 1) {
            return class275.method1669(arg1, arg0, 4096, arg4, arg8, arg0, arg7, arg6, arg5) ? true : this.method912(arg3 - 24775, arg1, arg7, arg8, arg6, arg0, arg4, arg5, arg2, arg0);
        }
        if (arg3 != 0) {
            this.field1945 = -72;
        }
        int var10 = arg6 + arg5 - 1;
        int var11 = arg7 + arg8 - 1;
        if (arg5 <= arg4 && var10 >= arg4 && arg1 >= arg8 && var11 >= arg1) {
            return true;
        } else if ((arg5 - 1) == arg4 && arg1 >= arg8 && arg1 <= var11 && (this.field1944[arg4 - this.field1940][arg1 - this.field1949] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg8 <= arg1 && var11 >= arg1 && (this.field1944[arg4 - this.field1940][arg1 - this.field1949] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if ((arg8 - 1) == arg1 && arg5 <= arg4 && var10 >= arg4 && (this.field1944[arg4 - this.field1940][arg1 - this.field1949] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg1 && arg5 <= arg4 && var10 >= arg4 && (this.field1944[arg4 - this.field1940][arg1 - this.field1949] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)V")
    public final void method921(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field1945 = -41;
        }
        int var4 = arg2 - this.field1940;
        int var5 = arg0 - this.field1949;
        field1961++;
        this.field1944[var4][var5] = class136.method878(this.field1944[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
    public final void method922(int arg0) {
        field1958++;
        if (arg0 > -111) {
            field1953 = null;
        }
        for (int var2 = 0; var2 < this.field1945; var2++) {
            for (int var3 = 0; var3 < this.field1960; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1945 - 5 || this.field1960 - 5 <= var3) {
                    this.field1944[var2][var3] = -1;
                } else {
                    this.field1944[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
    private final void method923(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -4) {
            this.method920(86, -42, 81, -39, 79, 73, -45, -64, -32);
        }
        this.field1944[arg3][arg0] = class136.method878(this.field1944[arg3][arg0], ~arg1);
        field1957++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method924(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1954++;
        if (arg6 == 1) {
            if (arg0 == arg2 && arg1 == arg5) {
                return true;
            }
        } else if (arg0 >= arg2 && arg6 + arg2 - 1 >= arg0 && arg1 >= arg1 && arg1 <= arg1 + arg6 - 1) {
            return true;
        }
        int var9 = arg0 - this.field1940;
        int var10 = arg2 - this.field1940;
        if (arg3 >= -61) {
            this.field1949 = -102;
        }
        int var11 = arg5 - this.field1949;
        int var12 = arg1 - this.field1949;
        if (arg6 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field1944[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1944[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1944[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1944[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field1944[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1944[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 + 1 == var10 && var11 == var12 && (this.field1944[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1944[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field1944[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field1944[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field1944[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field1944[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var10 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field1944[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 - arg6 == var11 && (this.field1944[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var9 - arg6) == var10 && var12 >= var11 && var14 >= var12 && (this.field1944[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg6 == var11 && (this.field1944[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var9 - arg6) == var10 && var11 <= var12 && var14 >= var12 && (this.field1944[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 + 1 == var11 && (this.field1944[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field1944[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 + 1 == var11 && (this.field1944[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11 && (this.field1944[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var9 && var13 >= var9 && (var12 - arg6) == var11 && (this.field1944[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg6) == var10 && var11 <= var12 && var12 <= var14 && (this.field1944[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 <= var12 && var12 <= var14 && (this.field1944[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIB)V")
    public final void method925(int arg0, int arg1, byte arg2) {
        field1948++;
        int var4 = arg1 - this.field1940;
        if (arg2 <= -113) {
            int var5 = arg0 - this.field1949;
            this.field1944[var4][var5] = class136.method878(this.field1944[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(III)Lsu;")
    public static final class590 method926(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field538;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIZIIIII)V")
    public final void method927(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1950++;
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg4 - this.field1940;
        int var11 = arg7 - this.field1949;
        if (arg5 != 23270) {
            this.field1940 = -14;
        }
        if (arg0) {
            var9 |= 0x40000000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var12 = arg3;
            arg3 = arg6;
            arg6 = var12;
        }
        for (int var13 = var10; var13 < (arg3 + var10); var13++) {
            if (var13 >= 0 && this.field1945 > var13) {
                for (int var14 = var11; var14 < (arg6 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field1960) {
                        this.method923(var14, var9, -99, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILpaa;)I")
    public static final int method928(int arg0, int arg1, class712 arg2) {
        field1947++;
        if (!client.method2675(arg2).method649(arg0, (byte) -110) && arg2.field9946 == null) {
            return -1;
        } else {
            if (arg1 != -1) {
                field1953 = null;
            }
            return arg2.field10075 == null || arg2.field10075.length <= arg0 ? -1 : arg2.field10075[arg0];
        }
    }
}
