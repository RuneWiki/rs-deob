import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class132 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "J")
    private long field2293 = -1L;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    private int field2301 = 0;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "J")
    private long field2304 = -1L;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lpe;")
    private class262 field2294;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "J")
    private long field2290;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "J")
    private long field2298;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[B")
    private byte[] field2297;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[B")
    private byte[] field2282;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "J")
    private long field2292;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lvm;")
    public static class297 field2286 = new class297(50);

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field2303 = 0;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Z")
    public static boolean field2307 = false;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lke;")
    public static class256 field2311 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lke;")
    private static class256 field2312 = class316.method2202("glow1:", 27626);

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lke;")
    public static class256 field2306 = field2312;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lke;")
    public static class256 field2305 = field2312;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "J")
    private long field2299;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Llb;")
    public static class228 field2309;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "[I")
    public static int[] field2302;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 4)
    private final void method893(int arg0) throws IOException {
        if (arg0 != 12074) {
            this.method902(81);
        }
        if (this.field2293 != -1L) {
            if (this.field2299 != this.field2293) {
                this.field2294.method1840(this.field2293, (byte) -94);
                this.field2299 = this.field2293;
            }
            long var2 = -1L;
            this.field2294.method1841(this.field2301, false, 0, this.field2282);
            if (this.field2304 <= this.field2293 && (long) this.field2280 + this.field2304 > this.field2293) {
                var2 = this.field2293;
            } else if (this.field2293 <= this.field2304 && ((long) this.field2301 + this.field2293) > this.field2304) {
                var2 = this.field2304;
            }
            this.field2299 += (long) this.field2301;
            if (this.field2299 > this.field2290) {
                this.field2290 = this.field2299;
            }
            long var4 = -1L;
            if (this.field2304 < ((long) this.field2301 + this.field2293) && ((long) this.field2280 + this.field2304) >= ((long) this.field2301 + this.field2293)) {
                var4 = this.field2293 + ((long) this.field2301);
            } else if (this.field2293 < ((long) this.field2280 + this.field2304) && (long) this.field2301 + this.field2293 >= (long) this.field2280 + this.field2304) {
                var4 = this.field2304 + ((long) this.field2280);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class299.method2092(this.field2282, (int) (var2 - this.field2293), this.field2297, (int) (var2 - this.field2304), var6);
            }
            this.field2293 = -1L;
            this.field2301 = 0;
        }
        field2310++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)V", line = 81)
    public final void method894(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2284++;
        try {
            if ((arg1 + arg2) > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field2293 != -1L && this.field2292 >= this.field2293 && this.field2293 + ((long) this.field2301) >= (long) arg1 + this.field2292) {
                class299.method2092(this.field2282, (int) (this.field2292 - this.field2293), arg3, arg2, arg1);
                this.field2292 += (long) arg1;
                return;
            }
            int var5 = arg1;
            int var6 = arg2;
            long var7 = this.field2292;
            if (this.field2304 <= this.field2292 && (long) this.field2280 + this.field2304 > this.field2292) {
                int var9 = (int) (this.field2304 + (long) this.field2280 - this.field2292);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class299.method2092(this.field2297, (int) (this.field2292 - this.field2304), arg3, arg2, var9);
                this.field2292 += (long) var9;
                arg1 -= var9;
                arg2 += var9;
            }
            if (arg1 > this.field2297.length) {
                this.field2294.method1840(this.field2292, (byte) -94);
                this.field2299 = this.field2292;
                while (arg1 > 0) {
                    int var10 = this.field2294.method1836(arg2, arg1, arg3, (byte) 78);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 -= var10;
                    this.field2299 += (long) var10;
                    this.field2292 += (long) var10;
                    arg2 += var10;
                }
            } else if (arg1 > 0) {
                this.method906(false);
                int var11 = arg1;
                if (arg1 > this.field2280) {
                    var11 = this.field2280;
                }
                arg1 -= var11;
                class299.method2092(this.field2297, 0, arg3, arg2, var11);
                arg2 += var11;
                this.field2292 += (long) var11;
            }
            if (this.field2293 != -1L) {
                if (this.field2292 < this.field2293 && arg1 > 0) {
                    int var12 = (int) (this.field2293 - this.field2292) + arg2;
                    if ((arg2 + arg1) < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg3[arg2++] = 0;
                        this.field2292++;
                    }
                }
                long var13 = -1L;
                if (this.field2293 >= var7 && this.field2293 < ((long) var5 + var7)) {
                    var13 = this.field2293;
                } else if (var7 >= this.field2293 && (long) this.field2301 + this.field2293 > var7) {
                    var13 = var7;
                }
                long var15 = -1L;
                if (var7 < (long) this.field2301 + this.field2293 && (long) var5 + var7 >= (long) this.field2301 + this.field2293) {
                    var15 = (long) this.field2301 + this.field2293;
                } else if (this.field2293 < (long) var5 + var7 && ((long) this.field2301 + this.field2293) >= ((long) var5 + var7)) {
                    var15 = (long) var5 + var7;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class299.method2092(this.field2282, (int) (var13 - this.field2293), arg3, (int) (var13 - var7) + var6, var17);
                    if (this.field2292 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2292));
                        this.field2292 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2299 = -1L;
            throw var19;
        }
        if (arg0 < 79) {
            this.field2292 = 47L;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)J", line = 277)
    public final long method895(boolean arg0) {
        field2291++;
        if (arg0) {
            method898(false, -116);
        }
        return this.field2298;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 294)
    public static void method896(int arg0) {
        field2311 = null;
        field2305 = null;
        field2312 = null;
        field2306 = null;
        field2302 = null;
        if (arg0 == 50) {
            field2286 = null;
            field2309 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 317)
    public static final void method897(int arg0) {
        field2287++;
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class72.field1328 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var7) {
                }
            }
            int var5 = 55 / ((6 - arg0) / 45);
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V", line = 348)
    public static final void method898(boolean arg0, int arg1) {
        field2308++;
        class270.field4611.method2075(arg1, 1);
        class19.field261.method2075(arg1, 1);
        if (arg0) {
            field2307 = false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIZII)V", line = 363)
    public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field2285++;
        int var9 = arg7 - arg8;
        int var10 = arg4 - arg3;
        int var11 = (arg2 - arg0 << 16) / var9;
        int var12 = (arg1 - arg5 << 16) / var10;
        class162.method1193(arg5, arg0, arg3, var11, 0, arg7, arg8, arg4, var12, arg6, 0);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZI)V", line = 388)
    public static final void method900(boolean arg0, int arg1) {
        field2289++;
        if (arg0 != class64.field1144 && arg1 == 1) {
            class64.field1144 = arg0;
            class214.method1501(-103);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Ldg;", line = 405)
    public static final class172 method901(int arg0, int arg1) {
        field2296++;
        if (arg0 != -1) {
            return (class172) null;
        }
        class172 var2 = (class172) class19.field261.method2077(-13408, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class172 var3 = class129.method884(arg1, arg0 ^ 0xFFFFFF82, class317.field5463, false, class167.field2963);
        if (var3 != null) {
            class19.field261.method2074(var3, (long) arg1, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Ljava/io/File;", line = 428)
    private final File method902(int arg0) {
        if (arg0 > -63) {
            return (File) null;
        } else {
            field2295++;
            return this.field2294.method1837(-2417);
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 439)
    public final void method903(int arg0) throws IOException {
        if (arg0 > -1) {
            method898(true, -112);
        }
        this.method893(12074);
        this.field2294.method1838(1);
        field2288++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lpe;II)V", line = 689)
    public class132(class262 arg0, int arg1, int arg2) throws IOException {
        this.field2294 = arg0;
        this.field2298 = this.field2290 = arg0.method1839((byte) 126);
        this.field2297 = new byte[arg1];
        this.field2282 = new byte[arg2];
        this.field2292 = 0L;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BI)V", line = 468)
    public final void method904(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2281++;
        try {
            if ((this.field2292 + ((long) arg0)) > this.field2298) {
                this.field2298 = (long) arg0 + this.field2292;
            }
            if (arg3 != 1625757712) {
                method900(true, 28);
            }
            if (this.field2293 != -1L && (this.field2293 > this.field2292 || this.field2292 > ((long) this.field2301 + this.field2293))) {
                this.method893(arg3 - 1625745638);
            }
            if (this.field2293 != -1L && (long) this.field2282.length + this.field2293 < this.field2292 - -((long) arg0)) {
                int var5 = (int) ((long) this.field2282.length + this.field2293 - this.field2292);
                arg0 -= var5;
                class299.method2092(arg2, arg1, this.field2282, (int) (this.field2292 - this.field2293), var5);
                this.field2292 += (long) var5;
                arg1 += var5;
                this.field2301 = this.field2282.length;
                this.method893(12074);
            }
            if (this.field2282.length < arg0) {
                long var6 = -1L;
                if (this.field2299 != this.field2292) {
                    this.field2294.method1840(this.field2292, (byte) -94);
                    this.field2299 = this.field2292;
                }
                this.field2294.method1841(arg0, false, arg1, arg2);
                this.field2299 += (long) arg0;
                long var8 = -1L;
                if (this.field2304 <= this.field2292 && this.field2292 < (long) this.field2280 + this.field2304) {
                    var6 = this.field2292;
                } else if (this.field2304 >= this.field2292 && ((long) arg0 + this.field2292) > this.field2304) {
                    var6 = this.field2304;
                }
                if (this.field2292 + ((long) arg0) > this.field2304 && this.field2304 + ((long) this.field2280) >= (long) arg0 + this.field2292) {
                    var8 = (long) arg0 + this.field2292;
                } else if (this.field2292 < (long) this.field2280 + this.field2304 && (long) this.field2280 + this.field2304 <= this.field2292 - -((long) arg0)) {
                    var8 = (long) this.field2280 + this.field2304;
                }
                if (this.field2290 < this.field2299) {
                    this.field2290 = this.field2299;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class299.method2092(arg2, (int) ((long) arg1 + var6 - this.field2292), this.field2297, (int) (var6 - this.field2304), var10);
                }
                this.field2292 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field2293 == -1L) {
                    this.field2293 = this.field2292;
                }
                class299.method2092(arg2, arg1, this.field2282, (int) (this.field2292 - this.field2293), arg0);
                this.field2292 += (long) arg0;
                if ((long) this.field2301 < this.field2292 - this.field2293) {
                    this.field2301 = (int) (this.field2292 - this.field2293);
                }
            }
        } catch (IOException var12) {
            this.field2299 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(JB)V", line = 587)
    public final void method905(long arg0, byte arg1) throws IOException {
        if (arg1 < 36) {
            field2303 = 28;
        }
        field2300++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method902(-91));
        }
        this.field2292 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V", line = 604)
    private final void method906(boolean arg0) throws IOException {
        if (arg0) {
            this.field2294 = (class262) null;
        }
        this.field2280 = 0;
        if (this.field2299 != this.field2292) {
            this.field2294.method1840(this.field2292, (byte) -94);
            this.field2299 = this.field2292;
        }
        this.field2304 = this.field2292;
        while (this.field2297.length > this.field2280) {
            int var2 = this.field2297.length - this.field2280;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2294.method1836(this.field2280, var2, this.field2297, (byte) 72);
            if (var3 == -1) {
                break;
            }
            this.field2280 += var3;
            this.field2299 += (long) var3;
        }
        field2283++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([BI)V", line = 666)
    public final void method907(byte[] arg0, int arg1) throws IOException {
        int var3 = -89 / ((arg1 + 15) / 35);
        field2279++;
        this.method894(114, arg0.length, 0, arg0);
    }
}
